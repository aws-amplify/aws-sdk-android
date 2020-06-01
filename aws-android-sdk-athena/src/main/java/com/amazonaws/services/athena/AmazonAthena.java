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

package com.amazonaws.services.athena;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.athena.model.*;

/**
 * Interface for accessing Amazon Athena
 * <p>
 * Amazon Athena is an interactive query service that lets you use standard SQL
 * to analyze data directly in Amazon S3. You can point Athena at your data in
 * Amazon S3 and run ad-hoc queries and get results in seconds. Athena is
 * serverless, so there is no infrastructure to set up or manage. You pay only
 * for the queries you run. Athena scales automatically—executing queries in
 * parallel—so results are fast, even with large datasets and complex queries.
 * For more information, see <a
 * href="http://docs.aws.amazon.com/athena/latest/ug/what-is.html">What is
 * Amazon Athena</a> in the <i>Amazon Athena User Guide</i>.
 * </p>
 * <p>
 * If you connect to Athena using the JDBC driver, use version 1.1.0 of the
 * driver or later with the Amazon Athena API. Earlier version drivers do not
 * support the API. For more information and to download the driver, see <a
 * href="https://docs.aws.amazon.com/athena/latest/ug/connect-with-jdbc.html">
 * Accessing Amazon Athena with JDBC</a>.
 * </p>
 * <p>
 * For code samples using the AWS SDK for Java, see <a
 * href="https://docs.aws.amazon.com/athena/latest/ug/code-samples.html"
 * >Examples and Code Samples</a> in the <i>Amazon Athena User Guide</i>.
 * </p>
 **/
public interface AmazonAthena {

    /**
     * Overrides the default endpoint for this client
     * ("https://athena.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "athena.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://athena.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "athena.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://athena.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonAthena#setEndpoint(String)}, sets the
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
     * Returns the details of a single named query or a list of up to 50
     * queries, which you provide as an array of query ID strings. Requires you
     * to have access to the workgroup in which the queries were saved. Use
     * <a>ListNamedQueriesInput</a> to get the list of named query IDs in the
     * specified workgroup. If information could not be retrieved for a
     * submitted query ID, information about the query ID submitted is listed
     * under <a>UnprocessedNamedQueryId</a>. Named queries differ from executed
     * queries. Use <a>BatchGetQueryExecutionInput</a> to get details about each
     * unique query execution, and <a>ListQueryExecutionsInput</a> to get a list
     * of query execution IDs.
     * </p>
     * 
     * @param batchGetNamedQueryRequest
     * @return batchGetNamedQueryResult The response from the BatchGetNamedQuery
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetNamedQueryResult batchGetNamedQuery(BatchGetNamedQueryRequest batchGetNamedQueryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the details of a single query execution or a list of up to 50
     * query executions, which you provide as an array of query execution ID
     * strings. Requires you to have access to the workgroup in which the
     * queries ran. To get a list of query execution IDs, use
     * <a>ListQueryExecutionsInput$WorkGroup</a>. Query executions differ from
     * named (saved) queries. Use <a>BatchGetNamedQueryInput</a> to get details
     * about named queries.
     * </p>
     * 
     * @param batchGetQueryExecutionRequest
     * @return batchGetQueryExecutionResult The response from the
     *         BatchGetQueryExecution service method, as returned by Amazon
     *         Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetQueryExecutionResult batchGetQueryExecution(
            BatchGetQueryExecutionRequest batchGetQueryExecutionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates (registers) a data catalog with the specified name and
     * properties. Catalogs created are visible to all users of the same AWS
     * account.
     * </p>
     * 
     * @param createDataCatalogRequest
     * @return createDataCatalogResult The response from the CreateDataCatalog
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDataCatalogResult createDataCatalog(CreateDataCatalogRequest createDataCatalogRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a named query in the specified workgroup. Requires that you have
     * access to the workgroup.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html"
     * >Examples and Code Samples</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param createNamedQueryRequest
     * @return createNamedQueryResult The response from the CreateNamedQuery
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateNamedQueryResult createNamedQuery(CreateNamedQueryRequest createNamedQueryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a workgroup with the specified name.
     * </p>
     * 
     * @param createWorkGroupRequest
     * @return createWorkGroupResult The response from the CreateWorkGroup
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateWorkGroupResult createWorkGroup(CreateWorkGroupRequest createWorkGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a data catalog.
     * </p>
     * 
     * @param deleteDataCatalogRequest
     * @return deleteDataCatalogResult The response from the DeleteDataCatalog
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDataCatalogResult deleteDataCatalog(DeleteDataCatalogRequest deleteDataCatalogRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the named query if you have access to the workgroup in which the
     * query was saved.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html"
     * >Examples and Code Samples</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param deleteNamedQueryRequest
     * @return deleteNamedQueryResult The response from the DeleteNamedQuery
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteNamedQueryResult deleteNamedQuery(DeleteNamedQueryRequest deleteNamedQueryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the workgroup with the specified name. The primary workgroup
     * cannot be deleted.
     * </p>
     * 
     * @param deleteWorkGroupRequest
     * @return deleteWorkGroupResult The response from the DeleteWorkGroup
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteWorkGroupResult deleteWorkGroup(DeleteWorkGroupRequest deleteWorkGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the specified data catalog.
     * </p>
     * 
     * @param getDataCatalogRequest
     * @return getDataCatalogResult The response from the GetDataCatalog service
     *         method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDataCatalogResult getDataCatalog(GetDataCatalogRequest getDataCatalogRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a database object for the specfied database and data catalog.
     * </p>
     * 
     * @param getDatabaseRequest
     * @return getDatabaseResult The response from the GetDatabase service
     *         method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws MetadataException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDatabaseResult getDatabase(GetDatabaseRequest getDatabaseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a single query. Requires that you have access
     * to the workgroup in which the query was saved.
     * </p>
     * 
     * @param getNamedQueryRequest
     * @return getNamedQueryResult The response from the GetNamedQuery service
     *         method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetNamedQueryResult getNamedQuery(GetNamedQueryRequest getNamedQueryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a single execution of a query if you have
     * access to the workgroup in which the query ran. Each time a query
     * executes, information about the query execution is saved with a unique
     * ID.
     * </p>
     * 
     * @param getQueryExecutionRequest
     * @return getQueryExecutionResult The response from the GetQueryExecution
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetQueryExecutionResult getQueryExecution(GetQueryExecutionRequest getQueryExecutionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Streams the results of a single query execution specified by
     * <code>QueryExecutionId</code> from the Athena query results location in
     * Amazon S3. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query
     * Results</a> in the <i>Amazon Athena User Guide</i>. This request does not
     * execute the query but returns results. Use <a>StartQueryExecution</a> to
     * run a query.
     * </p>
     * <p>
     * To stream query results successfully, the IAM principal with permission
     * to call <code>GetQueryResults</code> also must have permissions to the
     * Amazon S3 <code>GetObject</code> action for the Athena query results
     * location.
     * </p>
     * <important>
     * <p>
     * IAM principals with permission to the Amazon S3 <code>GetObject</code>
     * action for the query results location are able to retrieve query results
     * from Amazon S3 even if permission to the <code>GetQueryResults</code>
     * action is denied. To restrict user or role access, ensure that Amazon S3
     * permissions to the Athena query location are denied.
     * </p>
     * </important>
     * 
     * @param getQueryResultsRequest
     * @return getQueryResultsResult The response from the GetQueryResults
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetQueryResultsResult getQueryResults(GetQueryResultsRequest getQueryResultsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns table metadata for the specified catalog, database, and table.
     * </p>
     * 
     * @param getTableMetadataRequest
     * @return getTableMetadataResult The response from the GetTableMetadata
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws MetadataException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetTableMetadataResult getTableMetadata(GetTableMetadataRequest getTableMetadataRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about the workgroup with the specified name.
     * </p>
     * 
     * @param getWorkGroupRequest
     * @return getWorkGroupResult The response from the GetWorkGroup service
     *         method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetWorkGroupResult getWorkGroup(GetWorkGroupRequest getWorkGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the data catalogs in the current AWS account.
     * </p>
     * 
     * @param listDataCatalogsRequest
     * @return listDataCatalogsResult The response from the ListDataCatalogs
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDataCatalogsResult listDataCatalogs(ListDataCatalogsRequest listDataCatalogsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the databases in the specified data catalog.
     * </p>
     * 
     * @param listDatabasesRequest
     * @return listDatabasesResult The response from the ListDatabases service
     *         method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws MetadataException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDatabasesResult listDatabases(ListDatabasesRequest listDatabasesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides a list of available query IDs only for queries saved in the
     * specified workgroup. Requires that you have access to the specified
     * workgroup. If a workgroup is not specified, lists the saved queries for
     * the primary workgroup.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html"
     * >Examples and Code Samples</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param listNamedQueriesRequest
     * @return listNamedQueriesResult The response from the ListNamedQueries
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListNamedQueriesResult listNamedQueries(ListNamedQueriesRequest listNamedQueriesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides a list of available query execution IDs for the queries in the
     * specified workgroup. If a workgroup is not specified, returns a list of
     * query execution IDs for the primary workgroup. Requires you to have
     * access to the workgroup in which the queries ran.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html"
     * >Examples and Code Samples</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param listQueryExecutionsRequest
     * @return listQueryExecutionsResult The response from the
     *         ListQueryExecutions service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListQueryExecutionsResult listQueryExecutions(
            ListQueryExecutionsRequest listQueryExecutionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the metadata for the tables in the specified data catalog database.
     * </p>
     * 
     * @param listTableMetadataRequest
     * @return listTableMetadataResult The response from the ListTableMetadata
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws MetadataException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTableMetadataResult listTableMetadata(ListTableMetadataRequest listTableMetadataRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the tags associated with an Athena workgroup or data catalog
     * resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists available workgroups for the account.
     * </p>
     * 
     * @param listWorkGroupsRequest
     * @return listWorkGroupsResult The response from the ListWorkGroups service
     *         method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListWorkGroupsResult listWorkGroups(ListWorkGroupsRequest listWorkGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Runs the SQL query statements contained in the <code>Query</code>.
     * Requires you to have access to the workgroup in which the query ran.
     * Running queries against an external catalog requires
     * <a>GetDataCatalog</a> permission to the catalog. For code samples using
     * the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html"
     * >Examples and Code Samples</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param startQueryExecutionRequest
     * @return startQueryExecutionResult The response from the
     *         StartQueryExecution service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartQueryExecutionResult startQueryExecution(
            StartQueryExecutionRequest startQueryExecutionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Stops a query execution. Requires you to have access to the workgroup in
     * which the query ran.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html"
     * >Examples and Code Samples</a> in the <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param stopQueryExecutionRequest
     * @return stopQueryExecutionResult The response from the StopQueryExecution
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StopQueryExecutionResult stopQueryExecution(StopQueryExecutionRequest stopQueryExecutionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds one or more tags to an Athena resource. A tag is a label that you
     * assign to a resource. In Athena, a resource can be a workgroup or data
     * catalog. Each tag consists of a key and an optional value, both of which
     * you define. For example, you can use tags to categorize Athena workgroups
     * or data catalogs by purpose, owner, or environment. Use a consistent set
     * of tag keys to make it easier to search and filter workgroups or data
     * catalogs in your account. For best practices, see <a href=
     * "https://aws.amazon.com/answers/account-management/aws-tagging-strategies/"
     * >Tagging Best Practices</a>. Tag keys can be from 1 to 128 UTF-8 Unicode
     * characters, and tag values can be from 0 to 256 UTF-8 Unicode characters.
     * Tags can use letters and numbers representable in UTF-8, and the
     * following characters: + - = . _ : / @. Tag keys and values are
     * case-sensitive. Tag keys must be unique per resource. If you specify more
     * than one tag, separate them by commas.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes one or more tags from a data catalog or workgroup resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the data catalog that has the specified name.
     * </p>
     * 
     * @param updateDataCatalogRequest
     * @return updateDataCatalogResult The response from the UpdateDataCatalog
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDataCatalogResult updateDataCatalog(UpdateDataCatalogRequest updateDataCatalogRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the workgroup with the specified name. The workgroup's name
     * cannot be changed.
     * </p>
     * 
     * @param updateWorkGroupRequest
     * @return updateWorkGroupResult The response from the UpdateWorkGroup
     *         service method, as returned by Amazon Athena.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Athena indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateWorkGroupResult updateWorkGroup(UpdateWorkGroupRequest updateWorkGroupRequest)
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
