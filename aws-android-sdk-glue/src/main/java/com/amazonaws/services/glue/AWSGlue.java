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

package com.amazonaws.services.glue;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.glue.model.*;

/**
 * Interface for accessing AWS Glue <fullname>AWS Glue</fullname>
 * <p>
 * Defines the public endpoint for the AWS Glue service.
 * </p>
 **/
public interface AWSGlue {

    /**
     * Overrides the default endpoint for this client
     * ("https://glue.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "glue.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://glue.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "glue.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://glue.us-east-1.amazonaws.com") of the region specific
     *            AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSGlue#setEndpoint(String)}, sets the regional
     * endpoint for this client's service calls. Callers can use this method to
     * control which AWS region they want to work with.
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
     * Creates one or more partitions in a batch operation.
     * </p>
     * 
     * @param batchCreatePartitionRequest
     * @return batchCreatePartitionResult The response from the
     *         BatchCreatePartition service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws AlreadyExistsException
     * @throws ResourceNumberLimitExceededException
     * @throws InternalServiceException
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchCreatePartitionResult batchCreatePartition(
            BatchCreatePartitionRequest batchCreatePartitionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a list of connection definitions from the Data Catalog.
     * </p>
     * 
     * @param batchDeleteConnectionRequest
     * @return batchDeleteConnectionResult The response from the
     *         BatchDeleteConnection service method, as returned by AWS Glue.
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchDeleteConnectionResult batchDeleteConnection(
            BatchDeleteConnectionRequest batchDeleteConnectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes one or more partitions in a batch operation.
     * </p>
     * 
     * @param batchDeletePartitionRequest
     * @return batchDeletePartitionResult The response from the
     *         BatchDeletePartition service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchDeletePartitionResult batchDeletePartition(
            BatchDeletePartitionRequest batchDeletePartitionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes multiple tables at once.
     * </p>
     * <note>
     * <p>
     * After completing this operation, you no longer have access to the table
     * versions and partitions that belong to the deleted table. AWS Glue
     * deletes these "orphaned" resources asynchronously in a timely manner, at
     * the discretion of the service.
     * </p>
     * <p>
     * To ensure the immediate deletion of all related resources, before calling
     * <code>BatchDeleteTable</code>, use <code>DeleteTableVersion</code> or
     * <code>BatchDeleteTableVersion</code>, and <code>DeletePartition</code> or
     * <code>BatchDeletePartition</code>, to delete any resources that belong to
     * the table.
     * </p>
     * </note>
     * 
     * @param batchDeleteTableRequest
     * @return batchDeleteTableResult The response from the BatchDeleteTable
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchDeleteTableResult batchDeleteTable(BatchDeleteTableRequest batchDeleteTableRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specified batch of versions of a table.
     * </p>
     * 
     * @param batchDeleteTableVersionRequest
     * @return batchDeleteTableVersionResult The response from the
     *         BatchDeleteTableVersion service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchDeleteTableVersionResult batchDeleteTableVersion(
            BatchDeleteTableVersionRequest batchDeleteTableVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of resource metadata for a given list of crawler names.
     * After calling the <code>ListCrawlers</code> operation, you can call this
     * operation to access the data to which you have been granted permissions.
     * This operation supports all IAM permissions, including permission
     * conditions that uses tags.
     * </p>
     * 
     * @param batchGetCrawlersRequest
     * @return batchGetCrawlersResult The response from the BatchGetCrawlers
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetCrawlersResult batchGetCrawlers(BatchGetCrawlersRequest batchGetCrawlersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of resource metadata for a given list of development
     * endpoint names. After calling the <code>ListDevEndpoints</code>
     * operation, you can call this operation to access the data to which you
     * have been granted permissions. This operation supports all IAM
     * permissions, including permission conditions that uses tags.
     * </p>
     * 
     * @param batchGetDevEndpointsRequest
     * @return batchGetDevEndpointsResult The response from the
     *         BatchGetDevEndpoints service method, as returned by AWS Glue.
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetDevEndpointsResult batchGetDevEndpoints(
            BatchGetDevEndpointsRequest batchGetDevEndpointsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of resource metadata for a given list of job names. After
     * calling the <code>ListJobs</code> operation, you can call this operation
     * to access the data to which you have been granted permissions. This
     * operation supports all IAM permissions, including permission conditions
     * that uses tags.
     * </p>
     * 
     * @param batchGetJobsRequest
     * @return batchGetJobsResult The response from the BatchGetJobs service
     *         method, as returned by AWS Glue.
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetJobsResult batchGetJobs(BatchGetJobsRequest batchGetJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves partitions in a batch request.
     * </p>
     * 
     * @param batchGetPartitionRequest
     * @return batchGetPartitionResult The response from the BatchGetPartition
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetPartitionResult batchGetPartition(BatchGetPartitionRequest batchGetPartitionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of resource metadata for a given list of trigger names.
     * After calling the <code>ListTriggers</code> operation, you can call this
     * operation to access the data to which you have been granted permissions.
     * This operation supports all IAM permissions, including permission
     * conditions that uses tags.
     * </p>
     * 
     * @param batchGetTriggersRequest
     * @return batchGetTriggersResult The response from the BatchGetTriggers
     *         service method, as returned by AWS Glue.
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetTriggersResult batchGetTriggers(BatchGetTriggersRequest batchGetTriggersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of resource metadata for a given list of workflow names.
     * After calling the <code>ListWorkflows</code> operation, you can call this
     * operation to access the data to which you have been granted permissions.
     * This operation supports all IAM permissions, including permission
     * conditions that uses tags.
     * </p>
     * 
     * @param batchGetWorkflowsRequest
     * @return batchGetWorkflowsResult The response from the BatchGetWorkflows
     *         service method, as returned by AWS Glue.
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetWorkflowsResult batchGetWorkflows(BatchGetWorkflowsRequest batchGetWorkflowsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops one or more job runs for a specified job definition.
     * </p>
     * 
     * @param batchStopJobRunRequest
     * @return batchStopJobRunResult The response from the BatchStopJobRun
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchStopJobRunResult batchStopJobRun(BatchStopJobRunRequest batchStopJobRunRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Cancels (stops) a task run. Machine learning task runs are asynchronous
     * tasks that AWS Glue runs on your behalf as part of various machine
     * learning workflows. You can cancel a machine learning task run at any
     * time by calling <code>CancelMLTaskRun</code> with a task run's parent
     * transform's <code>TransformID</code> and the task run's
     * <code>TaskRunId</code>.
     * </p>
     * 
     * @param cancelMLTaskRunRequest
     * @return cancelMLTaskRunResult The response from the CancelMLTaskRun
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CancelMLTaskRunResult cancelMLTaskRun(CancelMLTaskRunRequest cancelMLTaskRunRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a classifier in the user's account. This can be a
     * <code>GrokClassifier</code>, an <code>XMLClassifier</code>, a
     * <code>JsonClassifier</code>, or a <code>CsvClassifier</code>, depending
     * on which field of the request is present.
     * </p>
     * 
     * @param createClassifierRequest
     * @return createClassifierResult The response from the CreateClassifier
     *         service method, as returned by AWS Glue.
     * @throws AlreadyExistsException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateClassifierResult createClassifier(CreateClassifierRequest createClassifierRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a connection definition in the Data Catalog.
     * </p>
     * 
     * @param createConnectionRequest
     * @return createConnectionResult The response from the CreateConnection
     *         service method, as returned by AWS Glue.
     * @throws AlreadyExistsException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateConnectionResult createConnection(CreateConnectionRequest createConnectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new crawler with specified targets, role, configuration, and
     * optional schedule. At least one crawl target must be specified, in the
     * <code>s3Targets</code> field, the <code>jdbcTargets</code> field, or the
     * <code>DynamoDBTargets</code> field.
     * </p>
     * 
     * @param createCrawlerRequest
     * @return createCrawlerResult The response from the CreateCrawler service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws AlreadyExistsException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateCrawlerResult createCrawler(CreateCrawlerRequest createCrawlerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new database in a Data Catalog.
     * </p>
     * 
     * @param createDatabaseRequest
     * @return createDatabaseResult The response from the CreateDatabase service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws AlreadyExistsException
     * @throws ResourceNumberLimitExceededException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDatabaseResult createDatabase(CreateDatabaseRequest createDatabaseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new development endpoint.
     * </p>
     * 
     * @param createDevEndpointRequest
     * @return createDevEndpointResult The response from the CreateDevEndpoint
     *         service method, as returned by AWS Glue.
     * @throws AccessDeniedException
     * @throws AlreadyExistsException
     * @throws IdempotentParameterMismatchException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws ValidationException
     * @throws ResourceNumberLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDevEndpointResult createDevEndpoint(CreateDevEndpointRequest createDevEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new job definition.
     * </p>
     * 
     * @param createJobRequest
     * @return createJobResult The response from the CreateJob service method,
     *         as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws IdempotentParameterMismatchException
     * @throws AlreadyExistsException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateJobResult createJob(CreateJobRequest createJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates an AWS Glue machine learning transform. This operation creates
     * the transform and all the necessary parameters to train it.
     * </p>
     * <p>
     * Call this operation as the first step in the process of using a machine
     * learning transform (such as the <code>FindMatches</code> transform) for
     * deduplicating data. You can provide an optional <code>Description</code>,
     * in addition to the parameters that you want to use for your algorithm.
     * </p>
     * <p>
     * You must also specify certain parameters for the tasks that AWS Glue runs
     * on your behalf as part of learning from your data and creating a
     * high-quality machine learning transform. These parameters include
     * <code>Role</code>, and optionally, <code>AllocatedCapacity</code>,
     * <code>Timeout</code>, and <code>MaxRetries</code>. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-jobs-job.html"
     * >Jobs</a>.
     * </p>
     * 
     * @param createMLTransformRequest
     * @return createMLTransformResult The response from the CreateMLTransform
     *         service method, as returned by AWS Glue.
     * @throws AlreadyExistsException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws ResourceNumberLimitExceededException
     * @throws IdempotentParameterMismatchException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateMLTransformResult createMLTransform(CreateMLTransformRequest createMLTransformRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new partition.
     * </p>
     * 
     * @param createPartitionRequest
     * @return createPartitionResult The response from the CreatePartition
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws AlreadyExistsException
     * @throws ResourceNumberLimitExceededException
     * @throws InternalServiceException
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreatePartitionResult createPartition(CreatePartitionRequest createPartitionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Transforms a directed acyclic graph (DAG) into code.
     * </p>
     * 
     * @param createScriptRequest
     * @return createScriptResult The response from the CreateScript service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateScriptResult createScript(CreateScriptRequest createScriptRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new security configuration. A security configuration is a set
     * of security properties that can be used by AWS Glue. You can use a
     * security configuration to encrypt data at rest. For information about
     * using security configurations in AWS Glue, see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/encryption-security-configuration.html"
     * >Encrypting Data Written by Crawlers, Jobs, and Development
     * Endpoints</a>.
     * </p>
     * 
     * @param createSecurityConfigurationRequest
     * @return createSecurityConfigurationResult The response from the
     *         CreateSecurityConfiguration service method, as returned by AWS
     *         Glue.
     * @throws AlreadyExistsException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateSecurityConfigurationResult createSecurityConfiguration(
            CreateSecurityConfigurationRequest createSecurityConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new table definition in the Data Catalog.
     * </p>
     * 
     * @param createTableRequest
     * @return createTableResult The response from the CreateTable service
     *         method, as returned by AWS Glue.
     * @throws AlreadyExistsException
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws ResourceNumberLimitExceededException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateTableResult createTable(CreateTableRequest createTableRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new trigger.
     * </p>
     * 
     * @param createTriggerRequest
     * @return createTriggerResult The response from the CreateTrigger service
     *         method, as returned by AWS Glue.
     * @throws AlreadyExistsException
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws IdempotentParameterMismatchException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateTriggerResult createTrigger(CreateTriggerRequest createTriggerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new function definition in the Data Catalog.
     * </p>
     * 
     * @param createUserDefinedFunctionRequest
     * @return createUserDefinedFunctionResult The response from the
     *         CreateUserDefinedFunction service method, as returned by AWS
     *         Glue.
     * @throws AlreadyExistsException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateUserDefinedFunctionResult createUserDefinedFunction(
            CreateUserDefinedFunctionRequest createUserDefinedFunctionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new workflow.
     * </p>
     * 
     * @param createWorkflowRequest
     * @return createWorkflowResult The response from the CreateWorkflow service
     *         method, as returned by AWS Glue.
     * @throws AlreadyExistsException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateWorkflowResult createWorkflow(CreateWorkflowRequest createWorkflowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a classifier from the Data Catalog.
     * </p>
     * 
     * @param deleteClassifierRequest
     * @return deleteClassifierResult The response from the DeleteClassifier
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteClassifierResult deleteClassifier(DeleteClassifierRequest deleteClassifierRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a connection from the Data Catalog.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return deleteConnectionResult The response from the DeleteConnection
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteConnectionResult deleteConnection(DeleteConnectionRequest deleteConnectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a specified crawler from the AWS Glue Data Catalog, unless the
     * crawler state is <code>RUNNING</code>.
     * </p>
     * 
     * @param deleteCrawlerRequest
     * @return deleteCrawlerResult The response from the DeleteCrawler service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws CrawlerRunningException
     * @throws SchedulerTransitioningException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteCrawlerResult deleteCrawler(DeleteCrawlerRequest deleteCrawlerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a specified database from a Data Catalog.
     * </p>
     * <note>
     * <p>
     * After completing this operation, you no longer have access to the tables
     * (and all table versions and partitions that might belong to the tables)
     * and the user-defined functions in the deleted database. AWS Glue deletes
     * these "orphaned" resources asynchronously in a timely manner, at the
     * discretion of the service.
     * </p>
     * <p>
     * To ensure the immediate deletion of all related resources, before calling
     * <code>DeleteDatabase</code>, use <code>DeleteTableVersion</code> or
     * <code>BatchDeleteTableVersion</code>, <code>DeletePartition</code> or
     * <code>BatchDeletePartition</code>, <code>DeleteUserDefinedFunction</code>
     * , and <code>DeleteTable</code> or <code>BatchDeleteTable</code>, to
     * delete any resources that belong to the database.
     * </p>
     * </note>
     * 
     * @param deleteDatabaseRequest
     * @return deleteDatabaseResult The response from the DeleteDatabase service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDatabaseResult deleteDatabase(DeleteDatabaseRequest deleteDatabaseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specified development endpoint.
     * </p>
     * 
     * @param deleteDevEndpointRequest
     * @return deleteDevEndpointResult The response from the DeleteDevEndpoint
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDevEndpointResult deleteDevEndpoint(DeleteDevEndpointRequest deleteDevEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specified job definition. If the job definition is not found,
     * no exception is thrown.
     * </p>
     * 
     * @param deleteJobRequest
     * @return deleteJobResult The response from the DeleteJob service method,
     *         as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteJobResult deleteJob(DeleteJobRequest deleteJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes an AWS Glue machine learning transform. Machine learning
     * transforms are a special type of transform that use machine learning to
     * learn the details of the transformation to be performed by learning from
     * examples provided by humans. These transformations are then saved by AWS
     * Glue. If you no longer need a transform, you can delete it by calling
     * <code>DeleteMLTransforms</code>. However, any AWS Glue jobs that still
     * reference the deleted transform will no longer succeed.
     * </p>
     * 
     * @param deleteMLTransformRequest
     * @return deleteMLTransformResult The response from the DeleteMLTransform
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteMLTransformResult deleteMLTransform(DeleteMLTransformRequest deleteMLTransformRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specified partition.
     * </p>
     * 
     * @param deletePartitionRequest
     * @return deletePartitionResult The response from the DeletePartition
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeletePartitionResult deletePartition(DeletePartitionRequest deletePartitionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specified policy.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return deleteResourcePolicyResult The response from the
     *         DeleteResourcePolicy service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws ConditionCheckFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteResourcePolicyResult deleteResourcePolicy(
            DeleteResourcePolicyRequest deleteResourcePolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a specified security configuration.
     * </p>
     * 
     * @param deleteSecurityConfigurationRequest
     * @return deleteSecurityConfigurationResult The response from the
     *         DeleteSecurityConfiguration service method, as returned by AWS
     *         Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteSecurityConfigurationResult deleteSecurityConfiguration(
            DeleteSecurityConfigurationRequest deleteSecurityConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a table definition from the Data Catalog.
     * </p>
     * <note>
     * <p>
     * After completing this operation, you no longer have access to the table
     * versions and partitions that belong to the deleted table. AWS Glue
     * deletes these "orphaned" resources asynchronously in a timely manner, at
     * the discretion of the service.
     * </p>
     * <p>
     * To ensure the immediate deletion of all related resources, before calling
     * <code>DeleteTable</code>, use <code>DeleteTableVersion</code> or
     * <code>BatchDeleteTableVersion</code>, and <code>DeletePartition</code> or
     * <code>BatchDeletePartition</code>, to delete any resources that belong to
     * the table.
     * </p>
     * </note>
     * 
     * @param deleteTableRequest
     * @return deleteTableResult The response from the DeleteTable service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteTableResult deleteTable(DeleteTableRequest deleteTableRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specified version of a table.
     * </p>
     * 
     * @param deleteTableVersionRequest
     * @return deleteTableVersionResult The response from the DeleteTableVersion
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteTableVersionResult deleteTableVersion(DeleteTableVersionRequest deleteTableVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specified trigger. If the trigger is not found, no exception is
     * thrown.
     * </p>
     * 
     * @param deleteTriggerRequest
     * @return deleteTriggerResult The response from the DeleteTrigger service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteTriggerResult deleteTrigger(DeleteTriggerRequest deleteTriggerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an existing function definition from the Data Catalog.
     * </p>
     * 
     * @param deleteUserDefinedFunctionRequest
     * @return deleteUserDefinedFunctionResult The response from the
     *         DeleteUserDefinedFunction service method, as returned by AWS
     *         Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteUserDefinedFunctionResult deleteUserDefinedFunction(
            DeleteUserDefinedFunctionRequest deleteUserDefinedFunctionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a workflow.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @return deleteWorkflowResult The response from the DeleteWorkflow service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteWorkflowResult deleteWorkflow(DeleteWorkflowRequest deleteWorkflowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the status of a migration operation.
     * </p>
     * 
     * @param getCatalogImportStatusRequest
     * @return getCatalogImportStatusResult The response from the
     *         GetCatalogImportStatus service method, as returned by AWS Glue.
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetCatalogImportStatusResult getCatalogImportStatus(
            GetCatalogImportStatusRequest getCatalogImportStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieve a classifier by name.
     * </p>
     * 
     * @param getClassifierRequest
     * @return getClassifierResult The response from the GetClassifier service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetClassifierResult getClassifier(GetClassifierRequest getClassifierRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all classifier objects in the Data Catalog.
     * </p>
     * 
     * @param getClassifiersRequest
     * @return getClassifiersResult The response from the GetClassifiers service
     *         method, as returned by AWS Glue.
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetClassifiersResult getClassifiers(GetClassifiersRequest getClassifiersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a connection definition from the Data Catalog.
     * </p>
     * 
     * @param getConnectionRequest
     * @return getConnectionResult The response from the GetConnection service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetConnectionResult getConnection(GetConnectionRequest getConnectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of connection definitions from the Data Catalog.
     * </p>
     * 
     * @param getConnectionsRequest
     * @return getConnectionsResult The response from the GetConnections service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetConnectionsResult getConnections(GetConnectionsRequest getConnectionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves metadata for a specified crawler.
     * </p>
     * 
     * @param getCrawlerRequest
     * @return getCrawlerResult The response from the GetCrawler service method,
     *         as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetCrawlerResult getCrawler(GetCrawlerRequest getCrawlerRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves metrics about specified crawlers.
     * </p>
     * 
     * @param getCrawlerMetricsRequest
     * @return getCrawlerMetricsResult The response from the GetCrawlerMetrics
     *         service method, as returned by AWS Glue.
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetCrawlerMetricsResult getCrawlerMetrics(GetCrawlerMetricsRequest getCrawlerMetricsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves metadata for all crawlers defined in the customer account.
     * </p>
     * 
     * @param getCrawlersRequest
     * @return getCrawlersResult The response from the GetCrawlers service
     *         method, as returned by AWS Glue.
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetCrawlersResult getCrawlers(GetCrawlersRequest getCrawlersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the security configuration for a specified catalog.
     * </p>
     * 
     * @param getDataCatalogEncryptionSettingsRequest
     * @return getDataCatalogEncryptionSettingsResult The response from the
     *         GetDataCatalogEncryptionSettings service method, as returned by
     *         AWS Glue.
     * @throws InternalServiceException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDataCatalogEncryptionSettingsResult getDataCatalogEncryptionSettings(
            GetDataCatalogEncryptionSettingsRequest getDataCatalogEncryptionSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the definition of a specified database.
     * </p>
     * 
     * @param getDatabaseRequest
     * @return getDatabaseResult The response from the GetDatabase service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDatabaseResult getDatabase(GetDatabaseRequest getDatabaseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves all databases defined in a given Data Catalog.
     * </p>
     * 
     * @param getDatabasesRequest
     * @return getDatabasesResult The response from the GetDatabases service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDatabasesResult getDatabases(GetDatabasesRequest getDatabasesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Transforms a Python script into a directed acyclic graph (DAG).
     * </p>
     * 
     * @param getDataflowGraphRequest
     * @return getDataflowGraphResult The response from the GetDataflowGraph
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDataflowGraphResult getDataflowGraph(GetDataflowGraphRequest getDataflowGraphRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about a specified development endpoint.
     * </p>
     * <note>
     * <p>
     * When you create a development endpoint in a virtual private cloud (VPC),
     * AWS Glue returns only a private IP address, and the public IP address
     * field is not populated. When you create a non-VPC development endpoint,
     * AWS Glue returns only a public IP address.
     * </p>
     * </note>
     * 
     * @param getDevEndpointRequest
     * @return getDevEndpointResult The response from the GetDevEndpoint service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDevEndpointResult getDevEndpoint(GetDevEndpointRequest getDevEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves all the development endpoints in this AWS account.
     * </p>
     * <note>
     * <p>
     * When you create a development endpoint in a virtual private cloud (VPC),
     * AWS Glue returns only a private IP address and the public IP address
     * field is not populated. When you create a non-VPC development endpoint,
     * AWS Glue returns only a public IP address.
     * </p>
     * </note>
     * 
     * @param getDevEndpointsRequest
     * @return getDevEndpointsResult The response from the GetDevEndpoints
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDevEndpointsResult getDevEndpoints(GetDevEndpointsRequest getDevEndpointsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves an existing job definition.
     * </p>
     * 
     * @param getJobRequest
     * @return getJobResult The response from the GetJob service method, as
     *         returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetJobResult getJob(GetJobRequest getJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns information on a job bookmark entry.
     * </p>
     * 
     * @param getJobBookmarkRequest
     * @return getJobBookmarkResult The response from the GetJobBookmark service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetJobBookmarkResult getJobBookmark(GetJobBookmarkRequest getJobBookmarkRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the metadata for a given job run.
     * </p>
     * 
     * @param getJobRunRequest
     * @return getJobRunResult The response from the GetJobRun service method,
     *         as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetJobRunResult getJobRun(GetJobRunRequest getJobRunRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves metadata for all runs of a given job definition.
     * </p>
     * 
     * @param getJobRunsRequest
     * @return getJobRunsResult The response from the GetJobRuns service method,
     *         as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetJobRunsResult getJobRuns(GetJobRunsRequest getJobRunsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves all current job definitions.
     * </p>
     * 
     * @param getJobsRequest
     * @return getJobsResult The response from the GetJobs service method, as
     *         returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetJobsResult getJobs(GetJobsRequest getJobsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets details for a specific task run on a machine learning transform.
     * Machine learning task runs are asynchronous tasks that AWS Glue runs on
     * your behalf as part of various machine learning workflows. You can check
     * the stats of any task run by calling <code>GetMLTaskRun</code> with the
     * <code>TaskRunID</code> and its parent transform's
     * <code>TransformID</code>.
     * </p>
     * 
     * @param getMLTaskRunRequest
     * @return getMLTaskRunResult The response from the GetMLTaskRun service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetMLTaskRunResult getMLTaskRun(GetMLTaskRunRequest getMLTaskRunRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of runs for a machine learning transform. Machine learning
     * task runs are asynchronous tasks that AWS Glue runs on your behalf as
     * part of various machine learning workflows. You can get a sortable,
     * filterable list of machine learning task runs by calling
     * <code>GetMLTaskRuns</code> with their parent transform's
     * <code>TransformID</code> and other optional parameters as documented in
     * this section.
     * </p>
     * <p>
     * This operation returns a list of historic runs and must be paginated.
     * </p>
     * 
     * @param getMLTaskRunsRequest
     * @return getMLTaskRunsResult The response from the GetMLTaskRuns service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetMLTaskRunsResult getMLTaskRuns(GetMLTaskRunsRequest getMLTaskRunsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets an AWS Glue machine learning transform artifact and all its
     * corresponding metadata. Machine learning transforms are a special type of
     * transform that use machine learning to learn the details of the
     * transformation to be performed by learning from examples provided by
     * humans. These transformations are then saved by AWS Glue. You can
     * retrieve their metadata by calling <code>GetMLTransform</code>.
     * </p>
     * 
     * @param getMLTransformRequest
     * @return getMLTransformResult The response from the GetMLTransform service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetMLTransformResult getMLTransform(GetMLTransformRequest getMLTransformRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a sortable, filterable list of existing AWS Glue machine learning
     * transforms. Machine learning transforms are a special type of transform
     * that use machine learning to learn the details of the transformation to
     * be performed by learning from examples provided by humans. These
     * transformations are then saved by AWS Glue, and you can retrieve their
     * metadata by calling <code>GetMLTransforms</code>.
     * </p>
     * 
     * @param getMLTransformsRequest
     * @return getMLTransformsResult The response from the GetMLTransforms
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetMLTransformsResult getMLTransforms(GetMLTransformsRequest getMLTransformsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates mappings.
     * </p>
     * 
     * @param getMappingRequest
     * @return getMappingResult The response from the GetMapping service method,
     *         as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws EntityNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetMappingResult getMapping(GetMappingRequest getMappingRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves information about a specified partition.
     * </p>
     * 
     * @param getPartitionRequest
     * @return getPartitionResult The response from the GetPartition service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetPartitionResult getPartition(GetPartitionRequest getPartitionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about the partitions in a table.
     * </p>
     * 
     * @param getPartitionsRequest
     * @return getPartitionsResult The response from the GetPartitions service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetPartitionsResult getPartitions(GetPartitionsRequest getPartitionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets code to perform a specified mapping.
     * </p>
     * 
     * @param getPlanRequest
     * @return getPlanResult The response from the GetPlan service method, as
     *         returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetPlanResult getPlan(GetPlanRequest getPlanRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves a specified resource policy.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return getResourcePolicyResult The response from the GetResourcePolicy
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a specified security configuration.
     * </p>
     * 
     * @param getSecurityConfigurationRequest
     * @return getSecurityConfigurationResult The response from the
     *         GetSecurityConfiguration service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetSecurityConfigurationResult getSecurityConfiguration(
            GetSecurityConfigurationRequest getSecurityConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of all security configurations.
     * </p>
     * 
     * @param getSecurityConfigurationsRequest
     * @return getSecurityConfigurationsResult The response from the
     *         GetSecurityConfigurations service method, as returned by AWS
     *         Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetSecurityConfigurationsResult getSecurityConfigurations(
            GetSecurityConfigurationsRequest getSecurityConfigurationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the <code>Table</code> definition in a Data Catalog for a
     * specified table.
     * </p>
     * 
     * @param getTableRequest
     * @return getTableResult The response from the GetTable service method, as
     *         returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetTableResult getTable(GetTableRequest getTableRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves a specified version of a table.
     * </p>
     * 
     * @param getTableVersionRequest
     * @return getTableVersionResult The response from the GetTableVersion
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetTableVersionResult getTableVersion(GetTableVersionRequest getTableVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of strings that identify available versions of a
     * specified table.
     * </p>
     * 
     * @param getTableVersionsRequest
     * @return getTableVersionsResult The response from the GetTableVersions
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetTableVersionsResult getTableVersions(GetTableVersionsRequest getTableVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the definitions of some or all of the tables in a given
     * <code>Database</code>.
     * </p>
     * 
     * @param getTablesRequest
     * @return getTablesResult The response from the GetTables service method,
     *         as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetTablesResult getTables(GetTablesRequest getTablesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of tags associated with a resource.
     * </p>
     * 
     * @param getTagsRequest
     * @return getTagsResult The response from the GetTags service method, as
     *         returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws EntityNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetTagsResult getTags(GetTagsRequest getTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves the definition of a trigger.
     * </p>
     * 
     * @param getTriggerRequest
     * @return getTriggerResult The response from the GetTrigger service method,
     *         as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetTriggerResult getTrigger(GetTriggerRequest getTriggerRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets all the triggers associated with a job.
     * </p>
     * 
     * @param getTriggersRequest
     * @return getTriggersResult The response from the GetTriggers service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetTriggersResult getTriggers(GetTriggersRequest getTriggersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a specified function definition from the Data Catalog.
     * </p>
     * 
     * @param getUserDefinedFunctionRequest
     * @return getUserDefinedFunctionResult The response from the
     *         GetUserDefinedFunction service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetUserDefinedFunctionResult getUserDefinedFunction(
            GetUserDefinedFunctionRequest getUserDefinedFunctionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves multiple function definitions from the Data Catalog.
     * </p>
     * 
     * @param getUserDefinedFunctionsRequest
     * @return getUserDefinedFunctionsResult The response from the
     *         GetUserDefinedFunctions service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetUserDefinedFunctionsResult getUserDefinedFunctions(
            GetUserDefinedFunctionsRequest getUserDefinedFunctionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves resource metadata for a workflow.
     * </p>
     * 
     * @param getWorkflowRequest
     * @return getWorkflowResult The response from the GetWorkflow service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetWorkflowResult getWorkflow(GetWorkflowRequest getWorkflowRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the metadata for a given workflow run.
     * </p>
     * 
     * @param getWorkflowRunRequest
     * @return getWorkflowRunResult The response from the GetWorkflowRun service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetWorkflowRunResult getWorkflowRun(GetWorkflowRunRequest getWorkflowRunRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the workflow run properties which were set during the run.
     * </p>
     * 
     * @param getWorkflowRunPropertiesRequest
     * @return getWorkflowRunPropertiesResult The response from the
     *         GetWorkflowRunProperties service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetWorkflowRunPropertiesResult getWorkflowRunProperties(
            GetWorkflowRunPropertiesRequest getWorkflowRunPropertiesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves metadata for all runs of a given workflow.
     * </p>
     * 
     * @param getWorkflowRunsRequest
     * @return getWorkflowRunsResult The response from the GetWorkflowRuns
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetWorkflowRunsResult getWorkflowRuns(GetWorkflowRunsRequest getWorkflowRunsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Imports an existing Amazon Athena Data Catalog to AWS Glue
     * </p>
     * 
     * @param importCatalogToGlueRequest
     * @return importCatalogToGlueResult The response from the
     *         ImportCatalogToGlue service method, as returned by AWS Glue.
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ImportCatalogToGlueResult importCatalogToGlue(
            ImportCatalogToGlueRequest importCatalogToGlueRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves the names of all crawler resources in this AWS account, or the
     * resources with the specified tag. This operation allows you to see which
     * resources are available in your account, and their names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can
     * use as a filter on the response so that tagged resources can be retrieved
     * as a group. If you choose to use tags filtering, only resources with the
     * tag are retrieved.
     * </p>
     * 
     * @param listCrawlersRequest
     * @return listCrawlersResult The response from the ListCrawlers service
     *         method, as returned by AWS Glue.
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListCrawlersResult listCrawlers(ListCrawlersRequest listCrawlersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the names of all <code>DevEndpoint</code> resources in this AWS
     * account, or the resources with the specified tag. This operation allows
     * you to see which resources are available in your account, and their
     * names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can
     * use as a filter on the response so that tagged resources can be retrieved
     * as a group. If you choose to use tags filtering, only resources with the
     * tag are retrieved.
     * </p>
     * 
     * @param listDevEndpointsRequest
     * @return listDevEndpointsResult The response from the ListDevEndpoints
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDevEndpointsResult listDevEndpoints(ListDevEndpointsRequest listDevEndpointsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the names of all job resources in this AWS account, or the
     * resources with the specified tag. This operation allows you to see which
     * resources are available in your account, and their names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can
     * use as a filter on the response so that tagged resources can be retrieved
     * as a group. If you choose to use tags filtering, only resources with the
     * tag are retrieved.
     * </p>
     * 
     * @param listJobsRequest
     * @return listJobsResult The response from the ListJobs service method, as
     *         returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves a sortable, filterable list of existing AWS Glue machine
     * learning transforms in this AWS account, or the resources with the
     * specified tag. This operation takes the optional <code>Tags</code> field,
     * which you can use as a filter of the responses so that tagged resources
     * can be retrieved as a group. If you choose to use tag filtering, only
     * resources with the tags are retrieved.
     * </p>
     * 
     * @param listMLTransformsRequest
     * @return listMLTransformsResult The response from the ListMLTransforms
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListMLTransformsResult listMLTransforms(ListMLTransformsRequest listMLTransformsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the names of all trigger resources in this AWS account, or the
     * resources with the specified tag. This operation allows you to see which
     * resources are available in your account, and their names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can
     * use as a filter on the response so that tagged resources can be retrieved
     * as a group. If you choose to use tags filtering, only resources with the
     * tag are retrieved.
     * </p>
     * 
     * @param listTriggersRequest
     * @return listTriggersResult The response from the ListTriggers service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTriggersResult listTriggers(ListTriggersRequest listTriggersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists names of workflows created in the account.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @return listWorkflowsResult The response from the ListWorkflows service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListWorkflowsResult listWorkflows(ListWorkflowsRequest listWorkflowsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the security configuration for a specified catalog. After the
     * configuration has been set, the specified encryption is applied to every
     * catalog write thereafter.
     * </p>
     * 
     * @param putDataCatalogEncryptionSettingsRequest
     * @return putDataCatalogEncryptionSettingsResult The response from the
     *         PutDataCatalogEncryptionSettings service method, as returned by
     *         AWS Glue.
     * @throws InternalServiceException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutDataCatalogEncryptionSettingsResult putDataCatalogEncryptionSettings(
            PutDataCatalogEncryptionSettingsRequest putDataCatalogEncryptionSettingsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the Data Catalog resource policy for access control.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return putResourcePolicyResult The response from the PutResourcePolicy
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws ConditionCheckFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Puts the specified workflow run properties for the given workflow run. If
     * a property already exists for the specified run, then it overrides the
     * value otherwise adds the property to existing properties.
     * </p>
     * 
     * @param putWorkflowRunPropertiesRequest
     * @return putWorkflowRunPropertiesResult The response from the
     *         PutWorkflowRunProperties service method, as returned by AWS Glue.
     * @throws AlreadyExistsException
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutWorkflowRunPropertiesResult putWorkflowRunProperties(
            PutWorkflowRunPropertiesRequest putWorkflowRunPropertiesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Resets a bookmark entry.
     * </p>
     * 
     * @param resetJobBookmarkRequest
     * @return resetJobBookmarkResult The response from the ResetJobBookmark
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ResetJobBookmarkResult resetJobBookmark(ResetJobBookmarkRequest resetJobBookmarkRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Searches a set of tables based on properties in the table metadata as
     * well as on the parent database. You can search against text or filter
     * conditions.
     * </p>
     * <p>
     * You can only get tables that you have access to based on the security
     * policies defined in Lake Formation. You need at least a read-only access
     * to the table for it to be returned. If you do not have access to all the
     * columns in the table, these columns will not be searched against when
     * returning the list of tables back to you. If you have access to the
     * columns but not the data in the columns, those columns and the associated
     * metadata for those columns will be included in the search.
     * </p>
     * 
     * @param searchTablesRequest
     * @return searchTablesResult The response from the SearchTables service
     *         method, as returned by AWS Glue.
     * @throws InternalServiceException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    SearchTablesResult searchTables(SearchTablesRequest searchTablesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a crawl using the specified crawler, regardless of what is
     * scheduled. If the crawler is already running, returns a <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-exceptions.html#aws-glue-api-exceptions-CrawlerRunningException"
     * >CrawlerRunningException</a>.
     * </p>
     * 
     * @param startCrawlerRequest
     * @return startCrawlerResult The response from the StartCrawler service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws CrawlerRunningException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartCrawlerResult startCrawler(StartCrawlerRequest startCrawlerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Changes the schedule state of the specified crawler to
     * <code>SCHEDULED</code>, unless the crawler is already running or the
     * schedule state is already <code>SCHEDULED</code>.
     * </p>
     * 
     * @param startCrawlerScheduleRequest
     * @return startCrawlerScheduleResult The response from the
     *         StartCrawlerSchedule service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws SchedulerRunningException
     * @throws SchedulerTransitioningException
     * @throws NoScheduleException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartCrawlerScheduleResult startCrawlerSchedule(
            StartCrawlerScheduleRequest startCrawlerScheduleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Begins an asynchronous task to export all labeled data for a particular
     * transform. This task is the only label-related API call that is not part
     * of the typical active learning workflow. You typically use
     * <code>StartExportLabelsTaskRun</code> when you want to work with all of
     * your existing labels at the same time, such as when you want to remove or
     * change labels that were previously submitted as truth. This API operation
     * accepts the <code>TransformId</code> whose labels you want to export and
     * an Amazon Simple Storage Service (Amazon S3) path to export the labels
     * to. The operation returns a <code>TaskRunId</code>. You can check on the
     * status of your task run by calling the <code>GetMLTaskRun</code> API.
     * </p>
     * 
     * @param startExportLabelsTaskRunRequest
     * @return startExportLabelsTaskRunResult The response from the
     *         StartExportLabelsTaskRun service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartExportLabelsTaskRunResult startExportLabelsTaskRun(
            StartExportLabelsTaskRunRequest startExportLabelsTaskRunRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Enables you to provide additional labels (examples of truth) to be used
     * to teach the machine learning transform and improve its quality. This API
     * operation is generally used as part of the active learning workflow that
     * starts with the <code>StartMLLabelingSetGenerationTaskRun</code> call and
     * that ultimately results in improving the quality of your machine learning
     * transform.
     * </p>
     * <p>
     * After the <code>StartMLLabelingSetGenerationTaskRun</code> finishes, AWS
     * Glue machine learning will have generated a series of questions for
     * humans to answer. (Answering these questions is often called 'labeling'
     * in the machine learning workflows). In the case of the
     * <code>FindMatches</code> transform, these questions are of the form,
     * “What is the correct way to group these rows together into groups
     * composed entirely of matching records?” After the labeling process is
     * finished, users upload their answers/labels with a call to
     * <code>StartImportLabelsTaskRun</code>. After
     * <code>StartImportLabelsTaskRun</code> finishes, all future runs of the
     * machine learning transform use the new and improved labels and perform a
     * higher-quality transformation.
     * </p>
     * <p>
     * By default, <code>StartMLLabelingSetGenerationTaskRun</code> continually
     * learns from and combines all labels that you upload unless you set
     * <code>Replace</code> to true. If you set <code>Replace</code> to true,
     * <code>StartImportLabelsTaskRun</code> deletes and forgets all previously
     * uploaded labels and learns only from the exact set that you upload.
     * Replacing labels can be helpful if you realize that you previously
     * uploaded incorrect labels, and you believe that they are having a
     * negative effect on your transform quality.
     * </p>
     * <p>
     * You can check on the status of your task run by calling the
     * <code>GetMLTaskRun</code> operation.
     * </p>
     * 
     * @param startImportLabelsTaskRunRequest
     * @return startImportLabelsTaskRunResult The response from the
     *         StartImportLabelsTaskRun service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartImportLabelsTaskRunResult startImportLabelsTaskRun(
            StartImportLabelsTaskRunRequest startImportLabelsTaskRunRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a job run using a job definition.
     * </p>
     * 
     * @param startJobRunRequest
     * @return startJobRunResult The response from the StartJobRun service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws ConcurrentRunsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartJobRunResult startJobRun(StartJobRunRequest startJobRunRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a task to estimate the quality of the transform.
     * </p>
     * <p>
     * When you provide label sets as examples of truth, AWS Glue machine
     * learning uses some of those examples to learn from them. The rest of the
     * labels are used as a test to estimate quality.
     * </p>
     * <p>
     * Returns a unique identifier for the run. You can call
     * <code>GetMLTaskRun</code> to get more information about the stats of the
     * <code>EvaluationTaskRun</code>.
     * </p>
     * 
     * @param startMLEvaluationTaskRunRequest
     * @return startMLEvaluationTaskRunResult The response from the
     *         StartMLEvaluationTaskRun service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws ConcurrentRunsExceededException
     * @throws MLTransformNotReadyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartMLEvaluationTaskRunResult startMLEvaluationTaskRun(
            StartMLEvaluationTaskRunRequest startMLEvaluationTaskRunRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts the active learning workflow for your machine learning transform
     * to improve the transform's quality by generating label sets and adding
     * labels.
     * </p>
     * <p>
     * When the <code>StartMLLabelingSetGenerationTaskRun</code> finishes, AWS
     * Glue will have generated a "labeling set" or a set of questions for
     * humans to answer.
     * </p>
     * <p>
     * In the case of the <code>FindMatches</code> transform, these questions
     * are of the form, “What is the correct way to group these rows together
     * into groups composed entirely of matching records?”
     * </p>
     * <p>
     * After the labeling process is finished, you can upload your labels with a
     * call to <code>StartImportLabelsTaskRun</code>. After
     * <code>StartImportLabelsTaskRun</code> finishes, all future runs of the
     * machine learning transform will use the new and improved labels and
     * perform a higher-quality transformation.
     * </p>
     * 
     * @param startMLLabelingSetGenerationTaskRunRequest
     * @return startMLLabelingSetGenerationTaskRunResult The response from the
     *         StartMLLabelingSetGenerationTaskRun service method, as returned
     *         by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws ConcurrentRunsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartMLLabelingSetGenerationTaskRunResult startMLLabelingSetGenerationTaskRun(
            StartMLLabelingSetGenerationTaskRunRequest startMLLabelingSetGenerationTaskRunRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts an existing trigger. See <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/trigger-job.html"
     * >Triggering Jobs</a> for information about how different types of trigger
     * are started.
     * </p>
     * 
     * @param startTriggerRequest
     * @return startTriggerResult The response from the StartTrigger service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws ConcurrentRunsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartTriggerResult startTrigger(StartTriggerRequest startTriggerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a new run of the specified workflow.
     * </p>
     * 
     * @param startWorkflowRunRequest
     * @return startWorkflowRunResult The response from the StartWorkflowRun
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws ConcurrentRunsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartWorkflowRunResult startWorkflowRun(StartWorkflowRunRequest startWorkflowRunRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * If the specified crawler is running, stops the crawl.
     * </p>
     * 
     * @param stopCrawlerRequest
     * @return stopCrawlerResult The response from the StopCrawler service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws CrawlerNotRunningException
     * @throws CrawlerStoppingException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StopCrawlerResult stopCrawler(StopCrawlerRequest stopCrawlerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the schedule state of the specified crawler to
     * <code>NOT_SCHEDULED</code>, but does not stop the crawler if it is
     * already running.
     * </p>
     * 
     * @param stopCrawlerScheduleRequest
     * @return stopCrawlerScheduleResult The response from the
     *         StopCrawlerSchedule service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws SchedulerNotRunningException
     * @throws SchedulerTransitioningException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StopCrawlerScheduleResult stopCrawlerSchedule(
            StopCrawlerScheduleRequest stopCrawlerScheduleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Stops a specified trigger.
     * </p>
     * 
     * @param stopTriggerRequest
     * @return stopTriggerResult The response from the StopTrigger service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StopTriggerResult stopTrigger(StopTriggerRequest stopTriggerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops the execution of the specified workflow run.
     * </p>
     * 
     * @param stopWorkflowRunRequest
     * @return stopWorkflowRunResult The response from the StopWorkflowRun
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws IllegalWorkflowStateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StopWorkflowRunResult stopWorkflowRun(StopWorkflowRunRequest stopWorkflowRunRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds tags to a resource. A tag is a label you can assign to an AWS
     * resource. In AWS Glue, you can tag only certain resources. For
     * information about what resources you can tag, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS
     * Tags in AWS Glue</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws EntityNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws EntityNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies an existing classifier (a <code>GrokClassifier</code>, an
     * <code>XMLClassifier</code>, a <code>JsonClassifier</code>, or a
     * <code>CsvClassifier</code>, depending on which field is present).
     * </p>
     * 
     * @param updateClassifierRequest
     * @return updateClassifierResult The response from the UpdateClassifier
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws VersionMismatchException
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateClassifierResult updateClassifier(UpdateClassifierRequest updateClassifierRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a connection definition in the Data Catalog.
     * </p>
     * 
     * @param updateConnectionRequest
     * @return updateConnectionResult The response from the UpdateConnection
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateConnectionResult updateConnection(UpdateConnectionRequest updateConnectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a crawler. If a crawler is running, you must stop it using
     * <code>StopCrawler</code> before updating it.
     * </p>
     * 
     * @param updateCrawlerRequest
     * @return updateCrawlerResult The response from the UpdateCrawler service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws VersionMismatchException
     * @throws EntityNotFoundException
     * @throws CrawlerRunningException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateCrawlerResult updateCrawler(UpdateCrawlerRequest updateCrawlerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the schedule of a crawler using a <code>cron</code> expression.
     * </p>
     * 
     * @param updateCrawlerScheduleRequest
     * @return updateCrawlerScheduleResult The response from the
     *         UpdateCrawlerSchedule service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws VersionMismatchException
     * @throws SchedulerTransitioningException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateCrawlerScheduleResult updateCrawlerSchedule(
            UpdateCrawlerScheduleRequest updateCrawlerScheduleRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing database definition in a Data Catalog.
     * </p>
     * 
     * @param updateDatabaseRequest
     * @return updateDatabaseResult The response from the UpdateDatabase service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDatabaseResult updateDatabase(UpdateDatabaseRequest updateDatabaseRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a specified development endpoint.
     * </p>
     * 
     * @param updateDevEndpointRequest
     * @return updateDevEndpointResult The response from the UpdateDevEndpoint
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDevEndpointResult updateDevEndpoint(UpdateDevEndpointRequest updateDevEndpointRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing job definition.
     * </p>
     * 
     * @param updateJobRequest
     * @return updateJobResult The response from the UpdateJob service method,
     *         as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateJobResult updateJob(UpdateJobRequest updateJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates an existing machine learning transform. Call this operation to
     * tune the algorithm parameters to achieve better results.
     * </p>
     * <p>
     * After calling this operation, you can call the
     * <code>StartMLEvaluationTaskRun</code> operation to assess how well your
     * new parameters achieved your goals (such as improving the quality of your
     * machine learning transform, or making it more cost-effective).
     * </p>
     * 
     * @param updateMLTransformRequest
     * @return updateMLTransformResult The response from the UpdateMLTransform
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateMLTransformResult updateMLTransform(UpdateMLTransformRequest updateMLTransformRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a partition.
     * </p>
     * 
     * @param updatePartitionRequest
     * @return updatePartitionResult The response from the UpdatePartition
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdatePartitionResult updatePartition(UpdatePartitionRequest updatePartitionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a metadata table in the Data Catalog.
     * </p>
     * 
     * @param updateTableRequest
     * @return updateTableResult The response from the UpdateTable service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ConcurrentModificationException
     * @throws ResourceNumberLimitExceededException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateTableResult updateTable(UpdateTableRequest updateTableRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a trigger definition.
     * </p>
     * 
     * @param updateTriggerRequest
     * @return updateTriggerResult The response from the UpdateTrigger service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateTriggerResult updateTrigger(UpdateTriggerRequest updateTriggerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing function definition in the Data Catalog.
     * </p>
     * 
     * @param updateUserDefinedFunctionRequest
     * @return updateUserDefinedFunctionResult The response from the
     *         UpdateUserDefinedFunction service method, as returned by AWS
     *         Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateUserDefinedFunctionResult updateUserDefinedFunction(
            UpdateUserDefinedFunctionRequest updateUserDefinedFunctionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing workflow.
     * </p>
     * 
     * @param updateWorkflowRequest
     * @return updateWorkflowResult The response from the UpdateWorkflow service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateWorkflowResult updateWorkflow(UpdateWorkflowRequest updateWorkflowRequest)
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
