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

package com.amazonaws.services.accessanalyzer;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.accessanalyzer.model.*;

/**
 * Interface for accessing Access Analyzer
 * <p>
 * AWS IAM Access Analyzer helps identify potential resource-access risks by
 * enabling you to identify any policies that grant access to an external
 * principal. It does this by using logic-based reasoning to analyze
 * resource-based policies in your AWS environment. An external principal can be
 * another AWS account, a root user, an IAM user or role, a federated user, an
 * AWS service, or an anonymous user. This guide describes the AWS IAM Access
 * Analyzer operations that you can call programmatically. For general
 * information about Access Analyzer, see the <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/what-is-access-analyzer.html"
 * >AWS IAM Access Analyzer section of the IAM User Guide</a>.
 * </p>
 * <p>
 * To start using Access Analyzer, you first need to create an analyzer.
 * </p>
 **/
public interface AccessAnalyzer {

    /**
     * Overrides the default endpoint for this client
     * ("https://access-analyzer.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "access-analyzer.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://access-analyzer.us-east-1.amazonaws.com"). If the
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
     *            "access-analyzer.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://access-analyzer.us-east-1.amazonaws.com") of the
     *            region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AccessAnalyzer#setEndpoint(String)}, sets the
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
     * Creates an analyzer for your account.
     * </p>
     * 
     * @param createAnalyzerRequest <p>
     *            Creates an analyzer.
     *            </p>
     * @return createAnalyzerResult The response from the CreateAnalyzer service
     *         method, as returned by Access Analyzer.
     * @throws ConflictException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Access
     *             Analyzer indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateAnalyzerResult createAnalyzer(CreateAnalyzerRequest createAnalyzerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an archive rule for the specified analyzer. Archive rules
     * automatically archive findings that meet the criteria you define when you
     * create the rule.
     * </p>
     * 
     * @param createArchiveRuleRequest <p>
     *            Creates an archive rule.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Access
     *             Analyzer indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void createArchiveRule(CreateArchiveRuleRequest createArchiveRuleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified analyzer. When you delete an analyzer, Access
     * Analyzer is disabled for the account in the current or specific Region.
     * All findings that were generated by the analyzer are deleted. You cannot
     * undo this action.
     * </p>
     * 
     * @param deleteAnalyzerRequest <p>
     *            Deletes an analyzer.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Access
     *             Analyzer indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteAnalyzer(DeleteAnalyzerRequest deleteAnalyzerRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the specified archive rule.
     * </p>
     * 
     * @param deleteArchiveRuleRequest <p>
     *            Deletes an archive rule.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Access
     *             Analyzer indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteArchiveRule(DeleteArchiveRuleRequest deleteArchiveRuleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about a resource that was analyzed.
     * </p>
     * 
     * @param getAnalyzedResourceRequest <p>
     *            Retrieves an analyzed resource.
     *            </p>
     * @return getAnalyzedResourceResult The response from the
     *         GetAnalyzedResource service method, as returned by Access
     *         Analyzer.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Access
     *             Analyzer indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetAnalyzedResourceResult getAnalyzedResource(
            GetAnalyzedResourceRequest getAnalyzedResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the specified analyzer.
     * </p>
     * 
     * @param getAnalyzerRequest <p>
     *            Retrieves an analyzer.
     *            </p>
     * @return getAnalyzerResult The response from the GetAnalyzer service
     *         method, as returned by Access Analyzer.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Access
     *             Analyzer indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetAnalyzerResult getAnalyzer(GetAnalyzerRequest getAnalyzerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about an archive rule.
     * </p>
     * 
     * @param getArchiveRuleRequest <p>
     *            Retrieves an archive rule.
     *            </p>
     * @return getArchiveRuleResult The response from the GetArchiveRule service
     *         method, as returned by Access Analyzer.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Access
     *             Analyzer indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetArchiveRuleResult getArchiveRule(GetArchiveRuleRequest getArchiveRuleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the specified finding.
     * </p>
     * 
     * @param getFindingRequest <p>
     *            Retrieves a finding.
     *            </p>
     * @return getFindingResult The response from the GetFinding service method,
     *         as returned by Access Analyzer.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Access
     *             Analyzer indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetFindingResult getFinding(GetFindingRequest getFindingRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of resources of the specified type that have been
     * analyzed by the specified analyzer..
     * </p>
     * 
     * @param listAnalyzedResourcesRequest <p>
     *            Retrieves a list of resources that have been analyzed.
     *            </p>
     * @return listAnalyzedResourcesResult The response from the
     *         ListAnalyzedResources service method, as returned by Access
     *         Analyzer.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Access
     *             Analyzer indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListAnalyzedResourcesResult listAnalyzedResources(
            ListAnalyzedResourcesRequest listAnalyzedResourcesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of analyzers.
     * </p>
     * 
     * @param listAnalyzersRequest <p>
     *            Retrieves a list of analyzers.
     *            </p>
     * @return listAnalyzersResult The response from the ListAnalyzers service
     *         method, as returned by Access Analyzer.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Access
     *             Analyzer indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListAnalyzersResult listAnalyzers(ListAnalyzersRequest listAnalyzersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of archive rules created for the specified analyzer.
     * </p>
     * 
     * @param listArchiveRulesRequest <p>
     *            Retrieves a list of archive rules created for the specified
     *            analyzer.
     *            </p>
     * @return listArchiveRulesResult The response from the ListArchiveRules
     *         service method, as returned by Access Analyzer.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Access
     *             Analyzer indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListArchiveRulesResult listArchiveRules(ListArchiveRulesRequest listArchiveRulesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of findings generated by the specified analyzer.
     * </p>
     * 
     * @param listFindingsRequest <p>
     *            Retrieves a list of findings generated by the specified
     *            analyzer.
     *            </p>
     * @return listFindingsResult The response from the ListFindings service
     *         method, as returned by Access Analyzer.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Access
     *             Analyzer indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListFindingsResult listFindings(ListFindingsRequest listFindingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of tags applied to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest <p>
     *            Retrieves a list of tags applied to the specified resource.
     *            </p>
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Access
     *         Analyzer.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Access
     *             Analyzer indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Immediately starts a scan of the policies applied to the specified
     * resource.
     * </p>
     * 
     * @param startResourceScanRequest <p>
     *            Starts a scan of the policies applied to the specified
     *            resource.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Access
     *             Analyzer indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void startResourceScan(StartResourceScanRequest startResourceScanRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds a tag to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest <p>
     *            Adds a tag to the specified resource.
     *            </p>
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Access Analyzer.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Access
     *             Analyzer indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a tag from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest <p>
     *            Removes a tag from the specified resource.
     *            </p>
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Access Analyzer.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Access
     *             Analyzer indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the criteria and values for the specified archive rule.
     * </p>
     * 
     * @param updateArchiveRuleRequest <p>
     *            Updates the specified archive rule.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Access
     *             Analyzer indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void updateArchiveRule(UpdateArchiveRuleRequest updateArchiveRuleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the status for the specified findings.
     * </p>
     * 
     * @param updateFindingsRequest <p>
     *            Updates findings with the new values provided in the request.
     *            </p>
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Access
     *             Analyzer indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void updateFindings(UpdateFindingsRequest updateFindingsRequest) throws AmazonClientException,
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
