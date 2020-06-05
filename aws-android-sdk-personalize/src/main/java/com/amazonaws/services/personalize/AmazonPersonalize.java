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

package com.amazonaws.services.personalize;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.personalize.model.*;

/**
 * Interface for accessing Amazon Personalize
 * <p>
 * Amazon Personalize is a machine learning service that makes it easy to add
 * individualized recommendations to customers.
 * </p>
 **/
public interface AmazonPersonalize {

    /**
     * Overrides the default endpoint for this client
     * ("https://personalize.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "personalize.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://personalize.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "personalize.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://personalize.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonPersonalize#setEndpoint(String)}, sets the
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
     * Creates a batch inference job. The operation can handle up to 50 million
     * records and the input file must be in JSON format. For more information,
     * see <a>recommendations-batch</a>.
     * </p>
     * 
     * @param createBatchInferenceJobRequest
     * @return createBatchInferenceJobResult The response from the
     *         CreateBatchInferenceJob service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateBatchInferenceJobResult createBatchInferenceJob(
            CreateBatchInferenceJobRequest createBatchInferenceJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a campaign by deploying a solution version. When a client calls
     * the <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html"
     * >GetRecommendations</a> and <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetPersonalizedRanking.html"
     * >GetPersonalizedRanking</a> APIs, a campaign is specified in the request.
     * </p>
     * <p>
     * <b>Minimum Provisioned TPS and Auto-Scaling</b>
     * </p>
     * <p>
     * A transaction is a single <code>GetRecommendations</code> or
     * <code>GetPersonalizedRanking</code> call. Transactions per second (TPS)
     * is the throughput and unit of billing for Amazon Personalize. The minimum
     * provisioned TPS (<code>minProvisionedTPS</code>) specifies the baseline
     * throughput provisioned by Amazon Personalize, and thus, the minimum
     * billing charge. If your TPS increases beyond
     * <code>minProvisionedTPS</code>, Amazon Personalize auto-scales the
     * provisioned capacity up and down, but never below
     * <code>minProvisionedTPS</code>, to maintain a 70% utilization. There's a
     * short time delay while the capacity is increased that might cause loss of
     * transactions. It's recommended to start with a low
     * <code>minProvisionedTPS</code>, track your usage using Amazon CloudWatch
     * metrics, and then increase the <code>minProvisionedTPS</code> as
     * necessary.
     * </p>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A campaign can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the campaign status, call <a>DescribeCampaign</a>.
     * </p>
     * <note>
     * <p>
     * Wait until the <code>status</code> of the campaign is <code>ACTIVE</code>
     * before asking the campaign for recommendations.
     * </p>
     * </note>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListCampaigns</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeCampaign</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateCampaign</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteCampaign</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createCampaignRequest
     * @return createCampaignResult The response from the CreateCampaign service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateCampaignResult createCampaign(CreateCampaignRequest createCampaignRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an empty dataset and adds it to the specified dataset group. Use
     * <a>CreateDatasetImportJob</a> to import your training data to a dataset.
     * </p>
     * <p>
     * There are three types of datasets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Interactions
     * </p>
     * </li>
     * <li>
     * <p>
     * Items
     * </p>
     * </li>
     * <li>
     * <p>
     * Users
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each dataset type has an associated schema with required field types.
     * Only the <code>Interactions</code> dataset is required in order to train
     * a model (also referred to as creating a solution).
     * </p>
     * <p>
     * A dataset can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the dataset, call <a>DescribeDataset</a>.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateDatasetGroup</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListDatasets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeDataset</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteDataset</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createDatasetRequest
     * @return createDatasetResult The response from the CreateDataset service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDatasetResult createDataset(CreateDatasetRequest createDatasetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an empty dataset group. A dataset group contains related datasets
     * that supply data for training a model. A dataset group can contain at
     * most three datasets, one for each type of dataset:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Interactions
     * </p>
     * </li>
     * <li>
     * <p>
     * Items
     * </p>
     * </li>
     * <li>
     * <p>
     * Users
     * </p>
     * </li>
     * </ul>
     * <p>
     * To train a model (create a solution), a dataset group that contains an
     * <code>Interactions</code> dataset is required. Call <a>CreateDataset</a>
     * to add a dataset to the group.
     * </p>
     * <p>
     * A dataset group can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the dataset group, call <a>DescribeDatasetGroup</a>.
     * If the status shows as CREATE FAILED, the response includes a
     * <code>failureReason</code> key, which describes why the creation failed.
     * </p>
     * <note>
     * <p>
     * You must wait until the <code>status</code> of the dataset group is
     * <code>ACTIVE</code> before adding a dataset to the group.
     * </p>
     * </note>
     * <p>
     * You can specify an AWS Key Management Service (KMS) key to encrypt the
     * datasets in the group. If you specify a KMS key, you must also include an
     * AWS Identity and Access Management (IAM) role that has permission to
     * access the key.
     * </p>
     * <p class="title">
     * <b>APIs that require a dataset group ARN in the request</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateDataset</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateEventTracker</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateSolution</a>
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListDatasetGroups</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeDatasetGroup</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteDatasetGroup</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createDatasetGroupRequest
     * @return createDatasetGroupResult The response from the CreateDatasetGroup
     *         service method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDatasetGroupResult createDatasetGroup(CreateDatasetGroupRequest createDatasetGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a job that imports training data from your data source (an Amazon
     * S3 bucket) to an Amazon Personalize dataset. To allow Amazon Personalize
     * to import the training data, you must specify an AWS Identity and Access
     * Management (IAM) role that has permission to read from the data source.
     * </p>
     * <important>
     * <p>
     * The dataset import job replaces any previous data in the dataset.
     * </p>
     * </important>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A dataset import job can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the import job, call
     * <a>DescribeDatasetImportJob</a>, providing the Amazon Resource Name (ARN)
     * of the dataset import job. The dataset import is complete when the status
     * shows as ACTIVE. If the status shows as CREATE FAILED, the response
     * includes a <code>failureReason</code> key, which describes why the job
     * failed.
     * </p>
     * <note>
     * <p>
     * Importing takes time. You must wait until the status shows as ACTIVE
     * before training a model using the dataset.
     * </p>
     * </note>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListDatasetImportJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeDatasetImportJob</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createDatasetImportJobRequest
     * @return createDatasetImportJobResult The response from the
     *         CreateDatasetImportJob service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDatasetImportJobResult createDatasetImportJob(
            CreateDatasetImportJobRequest createDatasetImportJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an event tracker that you use when sending event data to the
     * specified dataset group using the <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html"
     * >PutEvents</a> API.
     * </p>
     * <p>
     * When Amazon Personalize creates an event tracker, it also creates an
     * <i>event-interactions</i> dataset in the dataset group associated with
     * the event tracker. The event-interactions dataset stores the event data
     * from the <code>PutEvents</code> call. The contents of this dataset are
     * not available to the user.
     * </p>
     * <note>
     * <p>
     * Only one event tracker can be associated with a dataset group. You will
     * get an error if you call <code>CreateEventTracker</code> using the same
     * dataset group as an existing event tracker.
     * </p>
     * </note>
     * <p>
     * When you send event data you include your tracking ID. The tracking ID
     * identifies the customer and authorizes the customer to send the data.
     * </p>
     * <p>
     * The event tracker can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the event tracker, call <a>DescribeEventTracker</a>.
     * </p>
     * <note>
     * <p>
     * The event tracker must be in the ACTIVE state before using the tracking
     * ID.
     * </p>
     * </note>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListEventTrackers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEventTracker</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteEventTracker</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createEventTrackerRequest
     * @return createEventTrackerResult The response from the CreateEventTracker
     *         service method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateEventTrackerResult createEventTracker(CreateEventTrackerRequest createEventTrackerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a recommendation filter. For more information, see Using Filters
     * with Amazon Personalize.
     * </p>
     * 
     * @param createFilterRequest
     * @return createFilterResult The response from the CreateFilter service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateFilterResult createFilter(CreateFilterRequest createFilterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an Amazon Personalize schema from the specified schema string.
     * The schema you create must be in Avro JSON format.
     * </p>
     * <p>
     * Amazon Personalize recognizes three schema variants. Each schema is
     * associated with a dataset type and has a set of required field and
     * keywords. You specify a schema when you call <a>CreateDataset</a>.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListSchemas</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSchema</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteSchema</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createSchemaRequest
     * @return createSchemaResult The response from the CreateSchema service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateSchemaResult createSchema(CreateSchemaRequest createSchemaRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates the configuration for training a model. A trained model is known
     * as a solution. After the configuration is created, you train the model
     * (create a solution) by calling the <a>CreateSolutionVersion</a>
     * operation. Every time you call <code>CreateSolutionVersion</code>, a new
     * version of the solution is created.
     * </p>
     * <p>
     * After creating a solution version, you check its accuracy by calling
     * <a>GetSolutionMetrics</a>. When you are satisfied with the version, you
     * deploy it using <a>CreateCampaign</a>. The campaign provides
     * recommendations to a client through the <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html"
     * >GetRecommendations</a> API.
     * </p>
     * <p>
     * To train a model, Amazon Personalize requires training data and a recipe.
     * The training data comes from the dataset group that you provide in the
     * request. A recipe specifies the training algorithm and a feature
     * transformation. You can specify one of the predefined recipes provided by
     * Amazon Personalize. Alternatively, you can specify
     * <code>performAutoML</code> and Amazon Personalize will analyze your data
     * and select the optimum USER_PERSONALIZATION recipe for you.
     * </p>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A solution can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the solution, call <a>DescribeSolution</a>. Wait
     * until the status shows as ACTIVE before calling
     * <code>CreateSolutionVersion</code>.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListSolutions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateSolutionVersion</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolution</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteSolution</a>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <a>ListSolutionVersions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolutionVersion</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createSolutionRequest
     * @return createSolutionResult The response from the CreateSolution service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceAlreadyExistsException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateSolutionResult createSolution(CreateSolutionRequest createSolutionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Trains or retrains an active solution. A solution is created using the
     * <a>CreateSolution</a> operation and must be in the ACTIVE state before
     * calling <code>CreateSolutionVersion</code>. A new version of the solution
     * is created every time you call this operation.
     * </p>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A solution version can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the version, call <a>DescribeSolutionVersion</a>.
     * Wait until the status shows as ACTIVE before calling
     * <code>CreateCampaign</code>.
     * </p>
     * <p>
     * If the status shows as CREATE FAILED, the response includes a
     * <code>failureReason</code> key, which describes why the job failed.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListSolutionVersions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolutionVersion</a>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <a>ListSolutions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateSolution</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolution</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteSolution</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createSolutionVersionRequest
     * @return createSolutionVersionResult The response from the
     *         CreateSolutionVersion service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateSolutionVersionResult createSolutionVersion(
            CreateSolutionVersionRequest createSolutionVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a campaign by deleting the solution deployment. The solution that
     * the campaign is based on is not deleted and can be redeployed when
     * needed. A deleted campaign can no longer be specified in a <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html"
     * >GetRecommendations</a> request. For more information on campaigns, see
     * <a>CreateCampaign</a>.
     * </p>
     * 
     * @param deleteCampaignRequest
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteCampaign(DeleteCampaignRequest deleteCampaignRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a dataset. You can't delete a dataset if an associated
     * <code>DatasetImportJob</code> or <code>SolutionVersion</code> is in the
     * CREATE PENDING or IN PROGRESS state. For more information on datasets,
     * see <a>CreateDataset</a>.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteDataset(DeleteDatasetRequest deleteDatasetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a dataset group. Before you delete a dataset group, you must
     * delete the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All associated event trackers.
     * </p>
     * </li>
     * <li>
     * <p>
     * All associated solutions.
     * </p>
     * </li>
     * <li>
     * <p>
     * All datasets in the dataset group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteDatasetGroupRequest
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteDatasetGroup(DeleteDatasetGroupRequest deleteDatasetGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the event tracker. Does not delete the event-interactions dataset
     * from the associated dataset group. For more information on event
     * trackers, see <a>CreateEventTracker</a>.
     * </p>
     * 
     * @param deleteEventTrackerRequest
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteEventTracker(DeleteEventTrackerRequest deleteEventTrackerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a filter.
     * </p>
     * 
     * @param deleteFilterRequest
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteFilter(DeleteFilterRequest deleteFilterRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a schema. Before deleting a schema, you must delete all datasets
     * referencing the schema. For more information on schemas, see
     * <a>CreateSchema</a>.
     * </p>
     * 
     * @param deleteSchemaRequest
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteSchema(DeleteSchemaRequest deleteSchemaRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes all versions of a solution and the <code>Solution</code> object
     * itself. Before deleting a solution, you must delete all campaigns based
     * on the solution. To determine what campaigns are using the solution, call
     * <a>ListCampaigns</a> and supply the Amazon Resource Name (ARN) of the
     * solution. You can't delete a solution if an associated
     * <code>SolutionVersion</code> is in the CREATE PENDING or IN PROGRESS
     * state. For more information on solutions, see <a>CreateSolution</a>.
     * </p>
     * 
     * @param deleteSolutionRequest
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteSolution(DeleteSolutionRequest deleteSolutionRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the given algorithm.
     * </p>
     * 
     * @param describeAlgorithmRequest
     * @return describeAlgorithmResult The response from the DescribeAlgorithm
     *         service method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeAlgorithmResult describeAlgorithm(DescribeAlgorithmRequest describeAlgorithmRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the properties of a batch inference job including name, Amazon
     * Resource Name (ARN), status, input and output configurations, and the ARN
     * of the solution version used to generate the recommendations.
     * </p>
     * 
     * @param describeBatchInferenceJobRequest
     * @return describeBatchInferenceJobResult The response from the
     *         DescribeBatchInferenceJob service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeBatchInferenceJobResult describeBatchInferenceJob(
            DescribeBatchInferenceJobRequest describeBatchInferenceJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the given campaign, including its status.
     * </p>
     * <p>
     * A campaign can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * When the <code>status</code> is <code>CREATE FAILED</code>, the response
     * includes the <code>failureReason</code> key, which describes why.
     * </p>
     * <p>
     * For more information on campaigns, see <a>CreateCampaign</a>.
     * </p>
     * 
     * @param describeCampaignRequest
     * @return describeCampaignResult The response from the DescribeCampaign
     *         service method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeCampaignResult describeCampaign(DescribeCampaignRequest describeCampaignRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the given dataset. For more information on datasets, see
     * <a>CreateDataset</a>.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return describeDatasetResult The response from the DescribeDataset
     *         service method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the given dataset group. For more information on dataset
     * groups, see <a>CreateDatasetGroup</a>.
     * </p>
     * 
     * @param describeDatasetGroupRequest
     * @return describeDatasetGroupResult The response from the
     *         DescribeDatasetGroup service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeDatasetGroupResult describeDatasetGroup(
            DescribeDatasetGroupRequest describeDatasetGroupRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the dataset import job created by
     * <a>CreateDatasetImportJob</a>, including the import job status.
     * </p>
     * 
     * @param describeDatasetImportJobRequest
     * @return describeDatasetImportJobResult The response from the
     *         DescribeDatasetImportJob service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeDatasetImportJobResult describeDatasetImportJob(
            DescribeDatasetImportJobRequest describeDatasetImportJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes an event tracker. The response includes the
     * <code>trackingId</code> and <code>status</code> of the event tracker. For
     * more information on event trackers, see <a>CreateEventTracker</a>.
     * </p>
     * 
     * @param describeEventTrackerRequest
     * @return describeEventTrackerResult The response from the
     *         DescribeEventTracker service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeEventTrackerResult describeEventTracker(
            DescribeEventTrackerRequest describeEventTrackerRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes the given feature transformation.
     * </p>
     * 
     * @param describeFeatureTransformationRequest
     * @return describeFeatureTransformationResult The response from the
     *         DescribeFeatureTransformation service method, as returned by
     *         Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeFeatureTransformationResult describeFeatureTransformation(
            DescribeFeatureTransformationRequest describeFeatureTransformationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a filter's properties.
     * </p>
     * 
     * @param describeFilterRequest
     * @return describeFilterResult The response from the DescribeFilter service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeFilterResult describeFilter(DescribeFilterRequest describeFilterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a recipe.
     * </p>
     * <p>
     * A recipe contains three items:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An algorithm that trains a model.
     * </p>
     * </li>
     * <li>
     * <p>
     * Hyperparameters that govern the training.
     * </p>
     * </li>
     * <li>
     * <p>
     * Feature transformation information for modifying the input data before
     * training.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Personalize provides a set of predefined recipes. You specify a
     * recipe when you create a solution with the <a>CreateSolution</a> API.
     * <code>CreateSolution</code> trains a model by using the algorithm in the
     * specified recipe and a training dataset. The solution, when deployed as a
     * campaign, can provide recommendations using the <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html"
     * >GetRecommendations</a> API.
     * </p>
     * 
     * @param describeRecipeRequest
     * @return describeRecipeResult The response from the DescribeRecipe service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeRecipeResult describeRecipe(DescribeRecipeRequest describeRecipeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a schema. For more information on schemas, see
     * <a>CreateSchema</a>.
     * </p>
     * 
     * @param describeSchemaRequest
     * @return describeSchemaResult The response from the DescribeSchema service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeSchemaResult describeSchema(DescribeSchemaRequest describeSchemaRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a solution. For more information on solutions, see
     * <a>CreateSolution</a>.
     * </p>
     * 
     * @param describeSolutionRequest
     * @return describeSolutionResult The response from the DescribeSolution
     *         service method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeSolutionResult describeSolution(DescribeSolutionRequest describeSolutionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes a specific version of a solution. For more information on
     * solutions, see <a>CreateSolution</a>.
     * </p>
     * 
     * @param describeSolutionVersionRequest
     * @return describeSolutionVersionResult The response from the
     *         DescribeSolutionVersion service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeSolutionVersionResult describeSolutionVersion(
            DescribeSolutionVersionRequest describeSolutionVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the metrics for the specified solution version.
     * </p>
     * 
     * @param getSolutionMetricsRequest
     * @return getSolutionMetricsResult The response from the GetSolutionMetrics
     *         service method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetSolutionMetricsResult getSolutionMetrics(GetSolutionMetricsRequest getSolutionMetricsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of the batch inference jobs that have been performed off of a
     * solution version.
     * </p>
     * 
     * @param listBatchInferenceJobsRequest
     * @return listBatchInferenceJobsResult The response from the
     *         ListBatchInferenceJobs service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListBatchInferenceJobsResult listBatchInferenceJobs(
            ListBatchInferenceJobsRequest listBatchInferenceJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of campaigns that use the given solution. When a solution
     * is not specified, all the campaigns associated with the account are
     * listed. The response provides the properties for each campaign, including
     * the Amazon Resource Name (ARN). For more information on campaigns, see
     * <a>CreateCampaign</a>.
     * </p>
     * 
     * @param listCampaignsRequest
     * @return listCampaignsResult The response from the ListCampaigns service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListCampaignsResult listCampaigns(ListCampaignsRequest listCampaignsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of dataset groups. The response provides the properties
     * for each dataset group, including the Amazon Resource Name (ARN). For
     * more information on dataset groups, see <a>CreateDatasetGroup</a>.
     * </p>
     * 
     * @param listDatasetGroupsRequest
     * @return listDatasetGroupsResult The response from the ListDatasetGroups
     *         service method, as returned by Amazon Personalize.
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDatasetGroupsResult listDatasetGroups(ListDatasetGroupsRequest listDatasetGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of dataset import jobs that use the given dataset. When a
     * dataset is not specified, all the dataset import jobs associated with the
     * account are listed. The response provides the properties for each dataset
     * import job, including the Amazon Resource Name (ARN). For more
     * information on dataset import jobs, see <a>CreateDatasetImportJob</a>.
     * For more information on datasets, see <a>CreateDataset</a>.
     * </p>
     * 
     * @param listDatasetImportJobsRequest
     * @return listDatasetImportJobsResult The response from the
     *         ListDatasetImportJobs service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDatasetImportJobsResult listDatasetImportJobs(
            ListDatasetImportJobsRequest listDatasetImportJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the list of datasets contained in the given dataset group. The
     * response provides the properties for each dataset, including the Amazon
     * Resource Name (ARN). For more information on datasets, see
     * <a>CreateDataset</a>.
     * </p>
     * 
     * @param listDatasetsRequest
     * @return listDatasetsResult The response from the ListDatasets service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDatasetsResult listDatasets(ListDatasetsRequest listDatasetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the list of event trackers associated with the account. The
     * response provides the properties for each event tracker, including the
     * Amazon Resource Name (ARN) and tracking ID. For more information on event
     * trackers, see <a>CreateEventTracker</a>.
     * </p>
     * 
     * @param listEventTrackersRequest
     * @return listEventTrackersResult The response from the ListEventTrackers
     *         service method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListEventTrackersResult listEventTrackers(ListEventTrackersRequest listEventTrackersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all filters that belong to a given dataset group.
     * </p>
     * 
     * @param listFiltersRequest
     * @return listFiltersResult The response from the ListFilters service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListFiltersResult listFilters(ListFiltersRequest listFiltersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of available recipes. The response provides the properties
     * for each recipe, including the recipe's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listRecipesRequest
     * @return listRecipesResult The response from the ListRecipes service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListRecipesResult listRecipes(ListRecipesRequest listRecipesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the list of schemas associated with the account. The response
     * provides the properties for each schema, including the Amazon Resource
     * Name (ARN). For more information on schemas, see <a>CreateSchema</a>.
     * </p>
     * 
     * @param listSchemasRequest
     * @return listSchemasResult The response from the ListSchemas service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListSchemasResult listSchemas(ListSchemasRequest listSchemasRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of solution versions for the given solution. When a
     * solution is not specified, all the solution versions associated with the
     * account are listed. The response provides the properties for each
     * solution version, including the Amazon Resource Name (ARN). For more
     * information on solutions, see <a>CreateSolution</a>.
     * </p>
     * 
     * @param listSolutionVersionsRequest
     * @return listSolutionVersionsResult The response from the
     *         ListSolutionVersions service method, as returned by Amazon
     *         Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListSolutionVersionsResult listSolutionVersions(
            ListSolutionVersionsRequest listSolutionVersionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of solutions that use the given dataset group. When a
     * dataset group is not specified, all the solutions associated with the
     * account are listed. The response provides the properties for each
     * solution, including the Amazon Resource Name (ARN). For more information
     * on solutions, see <a>CreateSolution</a>.
     * </p>
     * 
     * @param listSolutionsRequest
     * @return listSolutionsResult The response from the ListSolutions service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListSolutionsResult listSolutions(ListSolutionsRequest listSolutionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a campaign by either deploying a new solution or changing the
     * value of the campaign's <code>minProvisionedTPS</code> parameter.
     * </p>
     * <p>
     * To update a campaign, the campaign status must be ACTIVE or CREATE
     * FAILED. Check the campaign status using the <a>DescribeCampaign</a> API.
     * </p>
     * <note>
     * <p>
     * You must wait until the <code>status</code> of the updated campaign is
     * <code>ACTIVE</code> before asking the campaign for recommendations.
     * </p>
     * </note>
     * <p>
     * For more information on campaigns, see <a>CreateCampaign</a>.
     * </p>
     * 
     * @param updateCampaignRequest
     * @return updateCampaignResult The response from the UpdateCampaign service
     *         method, as returned by Amazon Personalize.
     * @throws InvalidInputException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Personalize indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateCampaignResult updateCampaign(UpdateCampaignRequest updateCampaignRequest)
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
