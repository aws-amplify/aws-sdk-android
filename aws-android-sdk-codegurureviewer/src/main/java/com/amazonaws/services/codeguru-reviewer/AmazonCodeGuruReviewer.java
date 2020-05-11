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

package com.amazonaws.services.codeguru-reviewer;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.codeguru-reviewer.model.*;

/**
 * Interface for accessing Amazon CodeGuru Reviewer
 *
 * <p>This section provides documentation for the Amazon CodeGuru Reviewer API operations. Amazon CodeGuru Reviewer is a service that uses program analysis and machine learning to detect potential defects that are difficult for developers to find and recommends fixes in your Java code.</p> <p>By proactively detecting and providing recommendations for addressing code defects and implementing best practices, CodeGuru Reviewer improves the overall quality and maintainability of your code base during the code review stage. For more information about CodeGuru Reviewer, see the <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/welcome.html">Amazon CodeGuru Reviewer User Guide</a>.</p>
 *
 **/
public interface AmazonCodeGuruReviewer {

    /**
     * Overrides the default endpoint for this client ("https://codeguru-reviewer.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "codeguru-reviewer.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://codeguru-reviewer.us-east-1.amazonaws.com"). If the
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
     *            The endpoint (ex: "codeguru-reviewer.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://codeguru-reviewer.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonCodeGuruReviewer#setEndpoint(String)}, sets the
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
     * <p>Associates an AWS CodeCommit repository with Amazon CodeGuru Reviewer. When you associate an AWS CodeCommit repository with Amazon CodeGuru Reviewer, Amazon CodeGuru Reviewer will provide recommendations for each pull request raised within the repository. You can view recommendations in the AWS CodeCommit repository.</p> <p>You can associate a GitHub repository using the Amazon CodeGuru Reviewer console.</p>
     * @param associateRepositoryRequest 
     * @return associateRepositoryResult The response from the AssociateRepository service method, as returned by Amazon CodeGuru Reviewer.
     * @throws InternalServerException 
     * @throws ValidationException 
     * @throws AccessDeniedException 
     * @throws ConflictException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon CodeGuru Reviewer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    AssociateRepositoryResult associateRepository(AssociateRepositoryRequest associateRepositoryRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p> Returns the metadaata associated with the code review along with its status.</p>
     * @param describeCodeReviewRequest 
     * @return describeCodeReviewResult The response from the DescribeCodeReview service method, as returned by Amazon CodeGuru Reviewer.
     * @throws ResourceNotFoundException 
     * @throws InternalServerException 
     * @throws ValidationException 
     * @throws AccessDeniedException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon CodeGuru Reviewer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    DescribeCodeReviewResult describeCodeReview(DescribeCodeReviewRequest describeCodeReviewRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p> Describes the customer feedback for a CodeGuru Reviewer recommendation. </p>
     * @param describeRecommendationFeedbackRequest 
     * @return describeRecommendationFeedbackResult The response from the DescribeRecommendationFeedback service method, as returned by Amazon CodeGuru Reviewer.
     * @throws ResourceNotFoundException 
     * @throws InternalServerException 
     * @throws ValidationException 
     * @throws AccessDeniedException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon CodeGuru Reviewer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    DescribeRecommendationFeedbackResult describeRecommendationFeedback(DescribeRecommendationFeedbackRequest describeRecommendationFeedbackRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Describes a repository association.</p>
     * @param describeRepositoryAssociationRequest 
     * @return describeRepositoryAssociationResult The response from the DescribeRepositoryAssociation service method, as returned by Amazon CodeGuru Reviewer.
     * @throws NotFoundException 
     * @throws InternalServerException 
     * @throws ValidationException 
     * @throws AccessDeniedException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon CodeGuru Reviewer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    DescribeRepositoryAssociationResult describeRepositoryAssociation(DescribeRepositoryAssociationRequest describeRepositoryAssociationRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Removes the association between Amazon CodeGuru Reviewer and a repository.</p>
     * @param disassociateRepositoryRequest 
     * @return disassociateRepositoryResult The response from the DisassociateRepository service method, as returned by Amazon CodeGuru Reviewer.
     * @throws NotFoundException 
     * @throws InternalServerException 
     * @throws ValidationException 
     * @throws AccessDeniedException 
     * @throws ConflictException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon CodeGuru Reviewer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    DisassociateRepositoryResult disassociateRepository(DisassociateRepositoryRequest disassociateRepositoryRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p> Lists all the code reviews that the customer has created in the past 90 days. </p>
     * @param listCodeReviewsRequest 
     * @return listCodeReviewsResult The response from the ListCodeReviews service method, as returned by Amazon CodeGuru Reviewer.
     * @throws InternalServerException 
     * @throws ValidationException 
     * @throws ThrottlingException 
     * @throws AccessDeniedException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon CodeGuru Reviewer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    ListCodeReviewsResult listCodeReviews(ListCodeReviewsRequest listCodeReviewsRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p> Lists the customer feedback for a CodeGuru Reviewer recommendation for all users. This API will be used from the console to extract the previously given feedback by the user to pre-populate the feedback emojis for all recommendations. </p>
     * @param listRecommendationFeedbackRequest 
     * @return listRecommendationFeedbackResult The response from the ListRecommendationFeedback service method, as returned by Amazon CodeGuru Reviewer.
     * @throws ResourceNotFoundException 
     * @throws InternalServerException 
     * @throws ValidationException 
     * @throws AccessDeniedException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon CodeGuru Reviewer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    ListRecommendationFeedbackResult listRecommendationFeedback(ListRecommendationFeedbackRequest listRecommendationFeedbackRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p> Returns the list of all recommendations for a completed code review. </p>
     * @param listRecommendationsRequest 
     * @return listRecommendationsResult The response from the ListRecommendations service method, as returned by Amazon CodeGuru Reviewer.
     * @throws ResourceNotFoundException 
     * @throws InternalServerException 
     * @throws ValidationException 
     * @throws AccessDeniedException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon CodeGuru Reviewer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    ListRecommendationsResult listRecommendations(ListRecommendationsRequest listRecommendationsRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Lists repository associations. You can optionally filter on one or more of the following recommendation properties: provider types, states, names, and owners.</p>
     * @param listRepositoryAssociationsRequest 
     * @return listRepositoryAssociationsResult The response from the ListRepositoryAssociations service method, as returned by Amazon CodeGuru Reviewer.
     * @throws InternalServerException 
     * @throws ValidationException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon CodeGuru Reviewer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    ListRepositoryAssociationsResult listRepositoryAssociations(ListRepositoryAssociationsRequest listRepositoryAssociationsRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p> Stores customer feedback for a CodeGuru-Reviewer recommendation. When this API is called again with different reactions the previous feedback is overwritten. </p>
     * @param putRecommendationFeedbackRequest 
     * @return putRecommendationFeedbackResult The response from the PutRecommendationFeedback service method, as returned by Amazon CodeGuru Reviewer.
     * @throws ResourceNotFoundException 
     * @throws InternalServerException 
     * @throws ValidationException 
     * @throws AccessDeniedException 
     * @throws ThrottlingException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon CodeGuru Reviewer indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    PutRecommendationFeedbackResult putRecommendationFeedback(PutRecommendationFeedbackRequest putRecommendationFeedbackRequest) throws AmazonClientException, AmazonServiceException;

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
