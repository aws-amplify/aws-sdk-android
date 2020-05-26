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

package com.amazonaws.services.macie;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.macie.model.*;

/**
 * Interface for accessing Amazon Macie <fullname>Amazon Macie
 * Classic</fullname>
 * <p>
 * Amazon Macie Classic is a security service that uses machine learning to
 * automatically discover, classify, and protect sensitive data in AWS. Macie
 * Classic recognizes sensitive data such as personally identifiable information
 * (PII) or intellectual property, and provides you with dashboards and alerts
 * that give visibility into how this data is being accessed or moved. For more
 * information, see the <a href=
 * "https://docs.aws.amazon.com/macie/latest/userguide/what-is-macie.html"
 * >Amazon Macie Classic User Guide</a>.
 * </p>
 * <p>
 * A new Amazon Macie is now available with significant design improvements and
 * additional features, at a lower price and in most AWS Regions. We encourage
 * you to explore and use the new and improved features, and benefit from the
 * reduced cost. To learn about features and pricing for the new Amazon Macie,
 * see <a href="https://aws.amazon.com/macie/">Amazon Macie</a>.
 * </p>
 **/
public interface AmazonMacie {

    /**
     * Overrides the default endpoint for this client
     * ("https://macie.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "macie.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://macie.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "macie.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://macie.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonMacie#setEndpoint(String)}, sets the
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
     * Associates a specified AWS account with Amazon Macie Classic as a member
     * account.
     * </p>
     * 
     * @param associateMemberAccountRequest
     * @throws InvalidInputException
     * @throws LimitExceededException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void associateMemberAccount(AssociateMemberAccountRequest associateMemberAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates specified S3 resources with Amazon Macie Classic for
     * monitoring and data classification. If memberAccountId isn't specified,
     * the action associates specified S3 resources with Macie Classic for the
     * current master account. If memberAccountId is specified, the action
     * associates specified S3 resources with Macie Classic for the specified
     * member account.
     * </p>
     * 
     * @param associateS3ResourcesRequest
     * @return associateS3ResourcesResult The response from the
     *         AssociateS3Resources service method, as returned by Amazon Macie.
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws LimitExceededException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateS3ResourcesResult associateS3Resources(
            AssociateS3ResourcesRequest associateS3ResourcesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Removes the specified member account from Amazon Macie Classic.
     * </p>
     * 
     * @param disassociateMemberAccountRequest
     * @throws InvalidInputException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void disassociateMemberAccount(DisassociateMemberAccountRequest disassociateMemberAccountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes specified S3 resources from being monitored by Amazon Macie
     * Classic. If memberAccountId isn't specified, the action removes specified
     * S3 resources from Macie Classic for the current master account. If
     * memberAccountId is specified, the action removes specified S3 resources
     * from Macie Classic for the specified member account.
     * </p>
     * 
     * @param disassociateS3ResourcesRequest
     * @return disassociateS3ResourcesResult The response from the
     *         DisassociateS3Resources service method, as returned by Amazon
     *         Macie.
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateS3ResourcesResult disassociateS3Resources(
            DisassociateS3ResourcesRequest disassociateS3ResourcesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all Amazon Macie Classic member accounts for the current Amazon
     * Macie Classic master account.
     * </p>
     * 
     * @param listMemberAccountsRequest
     * @return listMemberAccountsResult The response from the ListMemberAccounts
     *         service method, as returned by Amazon Macie.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListMemberAccountsResult listMemberAccounts(ListMemberAccountsRequest listMemberAccountsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all the S3 resources associated with Amazon Macie Classic. If
     * memberAccountId isn't specified, the action lists the S3 resources
     * associated with Amazon Macie Classic for the current master account. If
     * memberAccountId is specified, the action lists the S3 resources
     * associated with Amazon Macie Classic for the specified member account.
     * </p>
     * 
     * @param listS3ResourcesRequest
     * @return listS3ResourcesResult The response from the ListS3Resources
     *         service method, as returned by Amazon Macie.
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListS3ResourcesResult listS3Resources(ListS3ResourcesRequest listS3ResourcesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the classification types for the specified S3 resources. If
     * memberAccountId isn't specified, the action updates the classification
     * types of the S3 resources associated with Amazon Macie Classic for the
     * current master account. If memberAccountId is specified, the action
     * updates the classification types of the S3 resources associated with
     * Amazon Macie Classic for the specified member account.
     * </p>
     * 
     * @param updateS3ResourcesRequest
     * @return updateS3ResourcesResult The response from the UpdateS3Resources
     *         service method, as returned by Amazon Macie.
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws InternalException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Macie indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateS3ResourcesResult updateS3Resources(UpdateS3ResourcesRequest updateS3ResourcesRequest)
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
