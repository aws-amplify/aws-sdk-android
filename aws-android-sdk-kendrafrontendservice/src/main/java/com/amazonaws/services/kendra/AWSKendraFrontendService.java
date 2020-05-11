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

package com.amazonaws.services.kendra;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.kendra.model.*;

/**
 * Interface for accessing AWSKendraFrontendService
 * <p>
 * Amazon Kendra is a service for indexing large document sets.
 * </p>
 **/
public interface AWSKendraFrontendService {

    /**
     * Overrides the default endpoint for this client
     * ("https://kendra.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "kendra.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://kendra.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "kendra.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://kendra.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSKendraFrontendService#setEndpoint(String)},
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
     * <p>
     * Removes one or more documents from an index. The documents must have been
     * added with the <a>BatchPutDocument</a> operation.
     * </p>
     * <p>
     * The documents are deleted asynchronously. You can see the progress of the
     * deletion by using AWS CloudWatch. Any error messages releated to the
     * processing of the batch are sent to you CloudWatch log.
     * </p>
     * 
     * @param batchDeleteDocumentRequest
     * @return batchDeleteDocumentResult The response from the
     *         BatchDeleteDocument service method, as returned by
     *         AWSKendraFrontendService.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    BatchDeleteDocumentResult batchDeleteDocument(
            BatchDeleteDocumentRequest batchDeleteDocumentRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Adds one or more documents to an index.
     * </p>
     * <p>
     * The <code>BatchPutDocument</code> operation enables you to ingest inline
     * documents or a set of documents stored in an Amazon S3 bucket. Use this
     * operation to ingest your text and unstructured text into an index, add
     * custom attributes to the documents, and to attach an access control list
     * to the documents added to the index.
     * </p>
     * <p>
     * The documents are indexed asynchronously. You can see the progress of the
     * batch using AWS CloudWatch. Any error messages related to processing the
     * batch are sent to your AWS CloudWatch log.
     * </p>
     * 
     * @param batchPutDocumentRequest
     * @return batchPutDocumentResult The response from the BatchPutDocument
     *         service method, as returned by AWSKendraFrontendService.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    BatchPutDocumentResult batchPutDocument(BatchPutDocumentRequest batchPutDocumentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a data source that you use to with an Amazon Kendra index.
     * </p>
     * <p>
     * You specify a name, connector type and description for your data source.
     * You can choose between an S3 connector, a SharePoint Online connector,
     * and a database connector.
     * </p>
     * <p>
     * You also specify configuration information such as document metadata
     * (author, source URI, and so on) and user context information.
     * </p>
     * <p>
     * <code>CreateDataSource</code> is a synchronous operation. The operation
     * returns 200 if the data source was successfully created. Otherwise, an
     * exception is raised.
     * </p>
     * 
     * @param createDataSourceRequest
     * @return createDataSourceResult The response from the CreateDataSource
     *         service method, as returned by AWSKendraFrontendService.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateDataSourceResult createDataSource(CreateDataSourceRequest createDataSourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an new set of frequently asked question (FAQ) questions and
     * answers.
     * </p>
     * 
     * @param createFaqRequest
     * @return createFaqResult The response from the CreateFaq service method,
     *         as returned by AWSKendraFrontendService.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateFaqResult createFaq(CreateFaqRequest createFaqRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a new Amazon Kendra index. Index creation is an asynchronous
     * operation. To determine if index creation has completed, check the
     * <code>Status</code> field returned from a call to . The
     * <code>Status</code> field is set to <code>ACTIVE</code> when the index is
     * ready to use.
     * </p>
     * <p>
     * Once the index is active you can index your documents using the operation
     * or using one of the supported data sources.
     * </p>
     * 
     * @param createIndexRequest
     * @return createIndexResult The response from the CreateIndex service
     *         method, as returned by AWSKendraFrontendService.
     * @throws ValidationException
     * @throws ResourceAlreadyExistException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    CreateIndexResult createIndex(CreateIndexRequest createIndexRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an Amazon Kendra data source. An exception is not thrown if the
     * data source is already being deleted. While the data source is being
     * deleted, the <code>Status</code> field returned by a call to the
     * operation is set to <code>DELETING</code>. For more information, see <a
     * href
     * ="https://docs.aws.amazon.com/kendra/latest/dg/delete-data-source.html"
     * >Deleting Data Sources</a>.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteDataSource(DeleteDataSourceRequest deleteDataSourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes an FAQ from an index.
     * </p>
     * 
     * @param deleteFaqRequest
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteFaq(DeleteFaqRequest deleteFaqRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an existing Amazon Kendra index. An exception is not thrown if
     * the index is already being deleted. While the index is being deleted, the
     * <code>Status</code> field returned by a call to the <a>DescribeIndex</a>
     * operation is set to <code>DELETING</code>.
     * </p>
     * 
     * @param deleteIndexRequest
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void deleteIndex(DeleteIndexRequest deleteIndexRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about a Amazon Kendra data source.
     * </p>
     * 
     * @param describeDataSourceRequest
     * @return describeDataSourceResult The response from the DescribeDataSource
     *         service method, as returned by AWSKendraFrontendService.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeDataSourceResult describeDataSource(DescribeDataSourceRequest describeDataSourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about an FAQ list.
     * </p>
     * 
     * @param describeFaqRequest
     * @return describeFaqResult The response from the DescribeFaq service
     *         method, as returned by AWSKendraFrontendService.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeFaqResult describeFaq(DescribeFaqRequest describeFaqRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes an existing Amazon Kendra index
     * </p>
     * 
     * @param describeIndexRequest
     * @return describeIndexResult The response from the DescribeIndex service
     *         method, as returned by AWSKendraFrontendService.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    DescribeIndexResult describeIndex(DescribeIndexRequest describeIndexRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets statistics about synchronizing Amazon Kendra with a data source.
     * </p>
     * 
     * @param listDataSourceSyncJobsRequest
     * @return listDataSourceSyncJobsResult The response from the
     *         ListDataSourceSyncJobs service method, as returned by
     *         AWSKendraFrontendService.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListDataSourceSyncJobsResult listDataSourceSyncJobs(
            ListDataSourceSyncJobsRequest listDataSourceSyncJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the data sources that you have created.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return listDataSourcesResult The response from the ListDataSources
     *         service method, as returned by AWSKendraFrontendService.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListDataSourcesResult listDataSources(ListDataSourcesRequest listDataSourcesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of FAQ lists associated with an index.
     * </p>
     * 
     * @param listFaqsRequest
     * @return listFaqsResult The response from the ListFaqs service method, as
     *         returned by AWSKendraFrontendService.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListFaqsResult listFaqs(ListFaqsRequest listFaqsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the Amazon Kendra indexes that you have created.
     * </p>
     * 
     * @param listIndicesRequest
     * @return listIndicesResult The response from the ListIndices service
     *         method, as returned by AWSKendraFrontendService.
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListIndicesResult listIndices(ListIndicesRequest listIndicesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of tags associated with a specified resource. Indexes, FAQs,
     * and data sources can have tags associated with them.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by
     *         AWSKendraFrontendService.
     * @throws ValidationException
     * @throws ResourceUnavailableException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Searches an active index. Use this API to search your documents using
     * query. The <code>Query</code> operation enables to do faceted search and
     * to filter results based on document attributes.
     * </p>
     * <p>
     * It also enables you to provide user context that Amazon Kendra uses to
     * enforce document access control in the search results.
     * </p>
     * <p>
     * Amazon Kendra searches your index for text content and question and
     * answer (FAQ) content. By default the response contains three types of
     * results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Relevant passages
     * </p>
     * </li>
     * <li>
     * <p>
     * Matching FAQs
     * </p>
     * </li>
     * <li>
     * <p>
     * Relevant documents
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify that the query return only one type of result using the
     * <code>QueryResultTypeConfig</code> parameter.
     * </p>
     * 
     * @param queryRequest
     * @return queryResult The response from the Query service method, as
     *         returned by AWSKendraFrontendService.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    QueryResult query(QueryRequest queryRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Starts a synchronization job for a data source. If a synchronization job
     * is already in progress, Amazon Kendra returns a
     * <code>ResourceInUseException</code> exception.
     * </p>
     * 
     * @param startDataSourceSyncJobRequest
     * @return startDataSourceSyncJobResult The response from the
     *         StartDataSourceSyncJob service method, as returned by
     *         AWSKendraFrontendService.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    StartDataSourceSyncJobResult startDataSourceSyncJob(
            StartDataSourceSyncJobRequest startDataSourceSyncJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops a running synchronization job. You can't stop a scheduled
     * synchronization job.
     * </p>
     * 
     * @param stopDataSourceSyncJobRequest
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void stopDataSourceSyncJob(StopDataSourceSyncJobRequest stopDataSourceSyncJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables you to provide feedback to Amazon Kendra to improve the
     * performance of the service.
     * </p>
     * 
     * @param submitFeedbackRequest
     * @throws ValidationException
     * @throws ResourceUnavailableException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void submitFeedback(SubmitFeedbackRequest submitFeedbackRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Adds the specified tag to the specified index, FAQ, or data source
     * resource. If the tag already exists, the existing value is replaced with
     * the new value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWSKendraFrontendService.
     * @throws ValidationException
     * @throws ResourceUnavailableException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a tag from an index, FAQ, or a data source.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWSKendraFrontendService.
     * @throws ValidationException
     * @throws ResourceUnavailableException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing Amazon Kendra data source.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void updateDataSource(UpdateDataSourceRequest updateDataSourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing Amazon Kendra index.
     * </p>
     * 
     * @param updateIndexRequest
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKendraFrontendService indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    void updateIndex(UpdateIndexRequest updateIndexRequest) throws AmazonClientException,
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
