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

package com.amazonaws.services.dataexchange;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.dataexchange.model.*;

/**
 * Interface for accessing AWS Data Exchange
 * <p>
 * AWS Data Exchange is a service that makes it easy for AWS customers to
 * exchange data in the cloud. You can use the AWS Data Exchange APIs to create,
 * update, manage, and access file-based data set in the AWS Cloud.
 * </p>
 * <p>
 * As a subscriber, you can view and access the data sets that you have an
 * entitlement to through a subscription. You can use the APIS to download or
 * copy your entitled data sets to Amazon S3 for use across a variety of AWS
 * analytics and machine learning services.
 * </p>
 * <p>
 * As a provider, you can create and manage your data sets that you would like
 * to publish to a product. Being able to package and provide your data sets
 * into products requires a few steps to determine eligibility. For more
 * information, visit the AWS Data Exchange User Guide.
 * </p>
 * <p>
 * A data set is a collection of data that can be changed or updated over time.
 * Data sets can be updated using revisions, which represent a new version or
 * incremental change to a data set. A revision contains one or more assets. An
 * asset in AWS Data Exchange is a piece of data that can be stored as an Amazon
 * S3 object. The asset can be a structured data file, an image file, or some
 * other data file. Jobs are asynchronous import or export operations used to
 * create or copy assets.
 * </p>
 **/
public interface AWSDataExchange {

    /**
     * Overrides the default endpoint for this client
     * ("https://dataexchange.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "dataexchange.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://dataexchange.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "dataexchange.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://dataexchange.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSDataExchange#setEndpoint(String)}, sets the
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
     * This operation cancels a job. Jobs can be cancelled only when they are in
     * the WAITING state.
     * </p>
     * 
     * @param cancelJobRequest
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws ConflictException <p>
     *             409 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void cancelJob(CancelJobRequest cancelJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This operation creates a data set.
     * </p>
     * 
     * @param createDataSetRequest <p>
     *            The request body for CreateDataSet.
     *            </p>
     * @return createDataSetResult The response from the CreateDataSet service
     *         method, as returned by AWS Data Exchange.
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws ServiceLimitExceededException <p>
     *             402 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateDataSetResult createDataSet(CreateDataSetRequest createDataSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation creates a job.
     * </p>
     * 
     * @param createJobRequest <p>
     *            The request body for CreateJob.
     *            </p>
     * @return createJobResult The response from the CreateJob service method,
     *         as returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateJobResult createJob(CreateJobRequest createJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This operation creates a revision for a data set.
     * </p>
     * 
     * @param createRevisionRequest <p>
     *            The request body for CreateRevision.
     *            </p>
     * @return createRevisionResult The response from the CreateRevision service
     *         method, as returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateRevisionResult createRevision(CreateRevisionRequest createRevisionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation deletes an asset.
     * </p>
     * 
     * @param deleteAssetRequest
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ConflictException <p>
     *             409 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void deleteAsset(DeleteAssetRequest deleteAssetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This operation deletes a data set.
     * </p>
     * 
     * @param deleteDataSetRequest
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ConflictException <p>
     *             409 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void deleteDataSet(DeleteDataSetRequest deleteDataSetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This operation deletes a revision.
     * </p>
     * 
     * @param deleteRevisionRequest
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ConflictException <p>
     *             409 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void deleteRevision(DeleteRevisionRequest deleteRevisionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This operation returns information about an asset.
     * </p>
     * 
     * @param getAssetRequest
     * @return getAssetResult The response from the GetAsset service method, as
     *         returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetAssetResult getAsset(GetAssetRequest getAssetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This operation returns information about a data set.
     * </p>
     * 
     * @param getDataSetRequest
     * @return getDataSetResult The response from the GetDataSet service method,
     *         as returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetDataSetResult getDataSet(GetDataSetRequest getDataSetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This operation returns information about a job.
     * </p>
     * 
     * @param getJobRequest
     * @return getJobResult The response from the GetJob service method, as
     *         returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetJobResult getJob(GetJobRequest getJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This operation returns information about a revision.
     * </p>
     * 
     * @param getRevisionRequest
     * @return getRevisionResult The response from the GetRevision service
     *         method, as returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetRevisionResult getRevision(GetRevisionRequest getRevisionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation lists a data set's revisions sorted by CreatedAt in
     * descending order.
     * </p>
     * 
     * @param listDataSetRevisionsRequest
     * @return listDataSetRevisionsResult The response from the
     *         ListDataSetRevisions service method, as returned by AWS Data
     *         Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListDataSetRevisionsResult listDataSetRevisions(
            ListDataSetRevisionsRequest listDataSetRevisionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This operation lists your data sets. When listing by origin OWNED,
     * results are sorted by CreatedAt in descending order. When listing by
     * origin ENTITLED, there is no order and the maxResults parameter is
     * ignored.
     * </p>
     * 
     * @param listDataSetsRequest
     * @return listDataSetsResult The response from the ListDataSets service
     *         method, as returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListDataSetsResult listDataSets(ListDataSetsRequest listDataSetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation lists your jobs sorted by CreatedAt in descending order.
     * </p>
     * 
     * @param listJobsRequest
     * @return listJobsResult The response from the ListJobs service method, as
     *         returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This operation lists a revision's assets sorted alphabetically in
     * descending order.
     * </p>
     * 
     * @param listRevisionAssetsRequest
     * @return listRevisionAssetsResult The response from the ListRevisionAssets
     *         service method, as returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListRevisionAssetsResult listRevisionAssets(ListRevisionAssetsRequest listRevisionAssetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation lists the tags on the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS Data
     *         Exchange.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This operation starts a job.
     * </p>
     * 
     * @param startJobRequest
     * @return startJobResult The response from the StartJob service method, as
     *         returned by AWS Data Exchange.
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ConflictException <p>
     *             409 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    StartJobResult startJob(StartJobRequest startJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This operation tags a resource.
     * </p>
     * 
     * @param tagResourceRequest <p>
     *            The request body for TagResource.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void tagResource(TagResourceRequest tagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This operation removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * This operation updates an asset.
     * </p>
     * 
     * @param updateAssetRequest <p>
     *            The request body for UpdateAsset.
     *            </p>
     * @return updateAssetResult The response from the UpdateAsset service
     *         method, as returned by AWS Data Exchange.
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ConflictException <p>
     *             409 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateAssetResult updateAsset(UpdateAssetRequest updateAssetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation updates a data set.
     * </p>
     * 
     * @param updateDataSetRequest <p>
     *            The request body for UpdateDataSet.
     *            </p>
     * @return updateDataSetResult The response from the UpdateDataSet service
     *         method, as returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateDataSetResult updateDataSet(UpdateDataSetRequest updateDataSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation updates a revision.
     * </p>
     * 
     * @param updateRevisionRequest <p>
     *            The request body for UpdateRevision.
     *            </p>
     * @return updateRevisionResult The response from the UpdateRevision service
     *         method, as returned by AWS Data Exchange.
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ConflictException <p>
     *             409 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateRevisionResult updateRevision(UpdateRevisionRequest updateRevisionRequest)
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
