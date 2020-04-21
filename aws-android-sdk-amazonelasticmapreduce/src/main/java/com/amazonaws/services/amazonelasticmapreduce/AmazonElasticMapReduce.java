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

package com.amazonaws.services.amazonelasticmapreduce;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.amazonelasticmapreduce.model.*;

/**
 * Interface for accessing Amazon Elastic MapReduce
 * <p>
 * Amazon EMR is a web service that makes it easy to process large amounts of
 * data efficiently. Amazon EMR uses Hadoop processing combined with several AWS
 * products to do tasks such as web indexing, data mining, log file analysis,
 * machine learning, scientific simulation, and data warehousing.
 * </p>
 **/
public interface AmazonElasticMapReduce {

    /**
     * Overrides the default endpoint for this client
     * ("https://elasticmapreduce.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "elasticmapreduce.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://elasticmapreduce.us-east-1.amazonaws.com"). If the
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
     *            "elasticmapreduce.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://elasticmapreduce.us-east-1.amazonaws.com") of the
     *            region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonElasticMapReduce#setEndpoint(String)},
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
     * Adds an instance fleet to a running cluster.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x.
     * </p>
     * </note>
     * 
     * @param addInstanceFleetRequest
     * @return addInstanceFleetResult The response from the AddInstanceFleet
     *         service method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    AddInstanceFleetResult addInstanceFleet(AddInstanceFleetRequest addInstanceFleetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds one or more instance groups to a running cluster.
     * </p>
     * 
     * @param addInstanceGroupsRequest <p>
     *            Input to an AddInstanceGroups call.
     *            </p>
     * @return addInstanceGroupsResult The response from the AddInstanceGroups
     *         service method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    AddInstanceGroupsResult addInstanceGroups(AddInstanceGroupsRequest addInstanceGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * AddJobFlowSteps adds new steps to a running cluster. A maximum of 256
     * steps are allowed in each job flow.
     * </p>
     * <p>
     * If your cluster is long-running (such as a Hive data warehouse) or
     * complex, you may require more than 256 steps to process your data. You
     * can bypass the 256-step limitation in various ways, including using SSH
     * to connect to the master node and submitting queries directly to the
     * software running on the master node, such as Hive and Hadoop. For more
     * information on how to do this, see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/AddMoreThan256Steps.html"
     * >Add More than 256 Steps to a Cluster</a> in the <i>Amazon EMR Management
     * Guide</i>.
     * </p>
     * <p>
     * A step specifies the location of a JAR file stored either on the master
     * node of the cluster or in Amazon S3. Each step is performed by the main
     * function of the main class of the JAR file. The main class can be
     * specified either in the manifest of the JAR or by using the MainFunction
     * parameter of the step.
     * </p>
     * <p>
     * Amazon EMR executes each step in the order listed. For a step to be
     * considered complete, the main function must exit with a zero exit code
     * and all Hadoop jobs started while the step was running must have
     * completed and run successfully.
     * </p>
     * <p>
     * You can only add steps to a cluster that is in one of the following
     * states: STARTING, BOOTSTRAPPING, RUNNING, or WAITING.
     * </p>
     * 
     * @param addJobFlowStepsRequest <p>
     *            The input argument to the <a>AddJobFlowSteps</a> operation.
     *            </p>
     * @return addJobFlowStepsResult The response from the AddJobFlowSteps
     *         service method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    AddJobFlowStepsResult addJobFlowSteps(AddJobFlowStepsRequest addJobFlowStepsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds tags to an Amazon EMR resource. Tags make it easier to associate
     * clusters in various ways, such as grouping clusters to track your Amazon
     * EMR resource allocation costs. For more information, see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
     * >Tag Clusters</a>.
     * </p>
     * 
     * @param addTagsRequest <p>
     *            This input identifies a cluster and a list of tags to attach.
     *            </p>
     * @return addTagsResult The response from the AddTags service method, as
     *         returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    AddTagsResult addTags(AddTagsRequest addTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Cancels a pending step or steps in a running cluster. Available only in
     * Amazon EMR versions 4.8.0 and later, excluding version 5.0.0. A maximum
     * of 256 steps are allowed in each CancelSteps request. CancelSteps is
     * idempotent but asynchronous; it does not guarantee a step will be
     * canceled, even if the request is successfully submitted. You can only
     * cancel steps that are in a <code>PENDING</code> state.
     * </p>
     * 
     * @param cancelStepsRequest <p>
     *            The input argument to the <a>CancelSteps</a> operation.
     *            </p>
     * @return cancelStepsResult The response from the CancelSteps service
     *         method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CancelStepsResult cancelSteps(CancelStepsRequest cancelStepsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a security configuration, which is stored in the service and can
     * be specified when a cluster is created.
     * </p>
     * 
     * @param createSecurityConfigurationRequest
     * @return createSecurityConfigurationResult The response from the
     *         CreateSecurityConfiguration service method, as returned by Amazon
     *         Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    CreateSecurityConfigurationResult createSecurityConfiguration(
            CreateSecurityConfigurationRequest createSecurityConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a security configuration.
     * </p>
     * 
     * @param deleteSecurityConfigurationRequest
     * @return deleteSecurityConfigurationResult The response from the
     *         DeleteSecurityConfiguration service method, as returned by Amazon
     *         Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DeleteSecurityConfigurationResult deleteSecurityConfiguration(
            DeleteSecurityConfigurationRequest deleteSecurityConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides cluster-level details including status, hardware and software
     * configuration, VPC settings, and so on.
     * </p>
     * 
     * @param describeClusterRequest <p>
     *            This input determines which cluster to describe.
     *            </p>
     * @return describeClusterResult The response from the DescribeCluster
     *         service method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeClusterResult describeCluster(DescribeClusterRequest describeClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This API is deprecated and will eventually be removed. We recommend you
     * use <a>ListClusters</a>, <a>DescribeCluster</a>, <a>ListSteps</a>,
     * <a>ListInstanceGroups</a> and <a>ListBootstrapActions</a> instead.
     * </p>
     * <p>
     * DescribeJobFlows returns a list of job flows that match all of the
     * supplied parameters. The parameters can include a list of job flow IDs,
     * job flow states, and restrictions on job flow creation date and time.
     * </p>
     * <p>
     * Regardless of supplied parameters, only job flows created within the last
     * two months are returned.
     * </p>
     * <p>
     * If no parameters are supplied, then job flows matching either of the
     * following criteria are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Job flows created and completed in the last two weeks
     * </p>
     * </li>
     * <li>
     * <p>
     * Job flows created within the last two months that are in one of the
     * following states: <code>RUNNING</code>, <code>WAITING</code>,
     * <code>SHUTTING_DOWN</code>, <code>STARTING</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon EMR can return a maximum of 512 job flow descriptions.
     * </p>
     * 
     * @param describeJobFlowsRequest <p>
     *            The input for the <a>DescribeJobFlows</a> operation.
     *            </p>
     * @return describeJobFlowsResult The response from the DescribeJobFlows
     *         service method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    @Deprecated
    DescribeJobFlowsResult describeJobFlows(DescribeJobFlowsRequest describeJobFlowsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides the details of a security configuration by returning the
     * configuration JSON.
     * </p>
     * 
     * @param describeSecurityConfigurationRequest
     * @return describeSecurityConfigurationResult The response from the
     *         DescribeSecurityConfiguration service method, as returned by
     *         Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeSecurityConfigurationResult describeSecurityConfiguration(
            DescribeSecurityConfigurationRequest describeSecurityConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides more detail about the cluster step.
     * </p>
     * 
     * @param describeStepRequest <p>
     *            This input determines which step to describe.
     *            </p>
     * @return describeStepResult The response from the DescribeStep service
     *         method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    DescribeStepResult describeStep(DescribeStepRequest describeStepRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the Amazon EMR block public access configuration for your AWS
     * account in the current Region. For more information see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/configure-block-public-access.html"
     * >Configure Block Public Access for Amazon EMR</a> in the <i>Amazon EMR
     * Management Guide</i>.
     * </p>
     * 
     * @param getBlockPublicAccessConfigurationRequest
     * @return getBlockPublicAccessConfigurationResult The response from the
     *         GetBlockPublicAccessConfiguration service method, as returned by
     *         Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetBlockPublicAccessConfigurationResult getBlockPublicAccessConfiguration(
            GetBlockPublicAccessConfigurationRequest getBlockPublicAccessConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Fetches the attached managed scaling policy for an Amazon EMR cluster.
     * </p>
     * 
     * @param getManagedScalingPolicyRequest
     * @return getManagedScalingPolicyResult The response from the
     *         GetManagedScalingPolicy service method, as returned by Amazon
     *         Elastic MapReduce.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    GetManagedScalingPolicyResult getManagedScalingPolicy(
            GetManagedScalingPolicyRequest getManagedScalingPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides information about the bootstrap actions associated with a
     * cluster.
     * </p>
     * 
     * @param listBootstrapActionsRequest <p>
     *            This input determines which bootstrap actions to retrieve.
     *            </p>
     * @return listBootstrapActionsResult The response from the
     *         ListBootstrapActions service method, as returned by Amazon
     *         Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListBootstrapActionsResult listBootstrapActions(
            ListBootstrapActionsRequest listBootstrapActionsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Provides the status of all clusters visible to this AWS account. Allows
     * you to filter the list of clusters based on certain criteria; for
     * example, filtering by cluster creation date and time or by status. This
     * call returns a maximum of 50 clusters per call, but returns a marker to
     * track the paging of the cluster list across multiple ListClusters calls.
     * </p>
     * 
     * @param listClustersRequest <p>
     *            This input determines how the ListClusters action filters the
     *            list of clusters that it returns.
     *            </p>
     * @return listClustersResult The response from the ListClusters service
     *         method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListClustersResult listClusters(ListClustersRequest listClustersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all available details about the instance fleets in a cluster.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * 
     * @param listInstanceFleetsRequest
     * @return listInstanceFleetsResult The response from the ListInstanceFleets
     *         service method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListInstanceFleetsResult listInstanceFleets(ListInstanceFleetsRequest listInstanceFleetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides all available details about the instance groups in a cluster.
     * </p>
     * 
     * @param listInstanceGroupsRequest <p>
     *            This input determines which instance groups to retrieve.
     *            </p>
     * @return listInstanceGroupsResult The response from the ListInstanceGroups
     *         service method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListInstanceGroupsResult listInstanceGroups(ListInstanceGroupsRequest listInstanceGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides information for all active EC2 instances and EC2 instances
     * terminated in the last 30 days, up to a maximum of 2,000. EC2 instances
     * in any of the following states are considered active:
     * AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING.
     * </p>
     * 
     * @param listInstancesRequest <p>
     *            This input determines which instances to list.
     *            </p>
     * @return listInstancesResult The response from the ListInstances service
     *         method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListInstancesResult listInstances(ListInstancesRequest listInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all the security configurations visible to this account, providing
     * their creation dates and times, and their names. This call returns a
     * maximum of 50 clusters per call, but returns a marker to track the paging
     * of the cluster list across multiple ListSecurityConfigurations calls.
     * </p>
     * 
     * @param listSecurityConfigurationsRequest
     * @return listSecurityConfigurationsResult The response from the
     *         ListSecurityConfigurations service method, as returned by Amazon
     *         Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListSecurityConfigurationsResult listSecurityConfigurations(
            ListSecurityConfigurationsRequest listSecurityConfigurationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides a list of steps for the cluster in reverse order unless you
     * specify <code>stepIds</code> with the request of filter by
     * <code>StepStates</code>. You can specify a maximum of ten
     * <code>stepIDs</code>.
     * </p>
     * 
     * @param listStepsRequest <p>
     *            This input determines which steps to list.
     *            </p>
     * @return listStepsResult The response from the ListSteps service method,
     *         as returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ListStepsResult listSteps(ListStepsRequest listStepsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Modifies the number of steps that can be executed concurrently for the
     * cluster specified using ClusterID.
     * </p>
     * 
     * @param modifyClusterRequest
     * @return modifyClusterResult The response from the ModifyCluster service
     *         method, as returned by Amazon Elastic MapReduce.
     * @throws InternalServerErrorException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    ModifyClusterResult modifyCluster(ModifyClusterRequest modifyClusterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Modifies the target On-Demand and target Spot capacities for the instance
     * fleet with the specified InstanceFleetID within the cluster specified
     * using ClusterID. The call either succeeds or fails atomically.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions.
     * </p>
     * </note>
     * 
     * @param modifyInstanceFleetRequest
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void modifyInstanceFleet(ModifyInstanceFleetRequest modifyInstanceFleetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * ModifyInstanceGroups modifies the number of nodes and configuration
     * settings of an instance group. The input parameters include the new
     * target instance count for the group and the instance group ID. The call
     * will either succeed or fail atomically.
     * </p>
     * 
     * @param modifyInstanceGroupsRequest <p>
     *            Change the size of some instance groups.
     *            </p>
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void modifyInstanceGroups(ModifyInstanceGroupsRequest modifyInstanceGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates or updates an automatic scaling policy for a core instance group
     * or task instance group in an Amazon EMR cluster. The automatic scaling
     * policy defines how an instance group dynamically adds and terminates EC2
     * instances in response to the value of a CloudWatch metric.
     * </p>
     * 
     * @param putAutoScalingPolicyRequest
     * @return putAutoScalingPolicyResult The response from the
     *         PutAutoScalingPolicy service method, as returned by Amazon
     *         Elastic MapReduce.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    PutAutoScalingPolicyResult putAutoScalingPolicy(
            PutAutoScalingPolicyRequest putAutoScalingPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates or updates an Amazon EMR block public access configuration for
     * your AWS account in the current Region. For more information see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/configure-block-public-access.html"
     * >Configure Block Public Access for Amazon EMR</a> in the <i>Amazon EMR
     * Management Guide</i>.
     * </p>
     * 
     * @param putBlockPublicAccessConfigurationRequest
     * @return putBlockPublicAccessConfigurationResult The response from the
     *         PutBlockPublicAccessConfiguration service method, as returned by
     *         Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    PutBlockPublicAccessConfigurationResult putBlockPublicAccessConfiguration(
            PutBlockPublicAccessConfigurationRequest putBlockPublicAccessConfigurationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates or updates a managed scaling policy for an Amazon EMR cluster.
     * The managed scaling policy defines the limits for resources, such as EC2
     * instances that can be added or terminated from a cluster. The policy only
     * applies to the core and task nodes. The master node cannot be scaled
     * after initial configuration.
     * </p>
     * 
     * @param putManagedScalingPolicyRequest
     * @return putManagedScalingPolicyResult The response from the
     *         PutManagedScalingPolicy service method, as returned by Amazon
     *         Elastic MapReduce.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    PutManagedScalingPolicyResult putManagedScalingPolicy(
            PutManagedScalingPolicyRequest putManagedScalingPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes an automatic scaling policy from a specified instance group
     * within an EMR cluster.
     * </p>
     * 
     * @param removeAutoScalingPolicyRequest
     * @return removeAutoScalingPolicyResult The response from the
     *         RemoveAutoScalingPolicy service method, as returned by Amazon
     *         Elastic MapReduce.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    RemoveAutoScalingPolicyResult removeAutoScalingPolicy(
            RemoveAutoScalingPolicyRequest removeAutoScalingPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a managed scaling policy from a specified EMR cluster.
     * </p>
     * 
     * @param removeManagedScalingPolicyRequest
     * @return removeManagedScalingPolicyResult The response from the
     *         RemoveManagedScalingPolicy service method, as returned by Amazon
     *         Elastic MapReduce.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    RemoveManagedScalingPolicyResult removeManagedScalingPolicy(
            RemoveManagedScalingPolicyRequest removeManagedScalingPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes tags from an Amazon EMR resource. Tags make it easier to
     * associate clusters in various ways, such as grouping clusters to track
     * your Amazon EMR resource allocation costs. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
     * >Tag Clusters</a>.
     * </p>
     * <p>
     * The following example removes the stack tag with value Prod from a
     * cluster:
     * </p>
     * 
     * @param removeTagsRequest <p>
     *            This input identifies a cluster and a list of tags to remove.
     *            </p>
     * @return removeTagsResult The response from the RemoveTags service method,
     *         as returned by Amazon Elastic MapReduce.
     * @throws InternalServerException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    RemoveTagsResult removeTags(RemoveTagsRequest removeTagsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * RunJobFlow creates and starts running a new cluster (job flow). The
     * cluster runs the steps specified. After the steps complete, the cluster
     * stops and the HDFS partition is lost. To prevent loss of data, configure
     * the last step of the job flow to store results in Amazon S3. If the
     * <a>JobFlowInstancesConfig</a> <code>KeepJobFlowAliveWhenNoSteps</code>
     * parameter is set to <code>TRUE</code>, the cluster transitions to the
     * WAITING state rather than shutting down after the steps have completed.
     * </p>
     * <p>
     * For additional protection, you can set the <a>JobFlowInstancesConfig</a>
     * <code>TerminationProtected</code> parameter to <code>TRUE</code> to lock
     * the cluster and prevent it from being terminated by API call, user
     * intervention, or in the event of a job flow error.
     * </p>
     * <p>
     * A maximum of 256 steps are allowed in each job flow.
     * </p>
     * <p>
     * If your cluster is long-running (such as a Hive data warehouse) or
     * complex, you may require more than 256 steps to process your data. You
     * can bypass the 256-step limitation in various ways, including using the
     * SSH shell to connect to the master node and submitting queries directly
     * to the software running on the master node, such as Hive and Hadoop. For
     * more information on how to do this, see <a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/AddMoreThan256Steps.html"
     * >Add More than 256 Steps to a Cluster</a> in the <i>Amazon EMR Management
     * Guide</i>.
     * </p>
     * <p>
     * For long running clusters, we recommend that you periodically store your
     * results.
     * </p>
     * <note>
     * <p>
     * The instance fleets configuration is available only in Amazon EMR
     * versions 4.8.0 and later, excluding 5.0.x versions. The RunJobFlow
     * request can contain InstanceFleets parameters or InstanceGroups
     * parameters, but not both.
     * </p>
     * </note>
     * 
     * @param runJobFlowRequest <p>
     *            Input to the <a>RunJobFlow</a> operation.
     *            </p>
     * @return runJobFlowResult The response from the RunJobFlow service method,
     *         as returned by Amazon Elastic MapReduce.
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    RunJobFlowResult runJobFlow(RunJobFlowRequest runJobFlowRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * SetTerminationProtection locks a cluster (job flow) so the EC2 instances
     * in the cluster cannot be terminated by user intervention, an API call, or
     * in the event of a job-flow error. The cluster still terminates upon
     * successful completion of the job flow. Calling
     * <code>SetTerminationProtection</code> on a cluster is similar to calling
     * the Amazon EC2 <code>DisableAPITermination</code> API on all EC2
     * instances in a cluster.
     * </p>
     * <p>
     * <code>SetTerminationProtection</code> is used to prevent accidental
     * termination of a cluster and to ensure that in the event of an error, the
     * instances persist so that you can recover any data stored in their
     * ephemeral instance storage.
     * </p>
     * <p>
     * To terminate a cluster that has been locked by setting
     * <code>SetTerminationProtection</code> to <code>true</code>, you must
     * first unlock the job flow by a subsequent call to
     * <code>SetTerminationProtection</code> in which you set the value to
     * <code>false</code>.
     * </p>
     * <p>
     * For more information, see<a href=
     * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/UsingEMR_TerminationProtection.html"
     * >Managing Cluster Termination</a> in the <i>Amazon EMR Management
     * Guide</i>.
     * </p>
     * 
     * @param setTerminationProtectionRequest <p>
     *            The input argument to the <a>TerminationProtection</a>
     *            operation.
     *            </p>
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void setTerminationProtection(SetTerminationProtectionRequest setTerminationProtectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets the <a>Cluster$VisibleToAllUsers</a> value, which determines whether
     * the cluster is visible to all IAM users of the AWS account associated
     * with the cluster. Only the IAM user who created the cluster or the AWS
     * account root user can call this action. The default value,
     * <code>true</code>, indicates that all IAM users in the AWS account can
     * perform cluster actions if they have the proper IAM policy permissions.
     * If set to <code>false</code>, only the IAM user that created the cluster
     * can perform actions. This action works on running clusters. You can
     * override the default <code>true</code> setting when you create a cluster
     * by using the <code>VisibleToAllUsers</code> parameter with
     * <code>RunJobFlow</code>.
     * </p>
     * 
     * @param setVisibleToAllUsersRequest <p>
     *            The input to the SetVisibleToAllUsers action.
     *            </p>
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void setVisibleToAllUsers(SetVisibleToAllUsersRequest setVisibleToAllUsersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * TerminateJobFlows shuts a list of clusters (job flows) down. When a job
     * flow is shut down, any step not yet completed is canceled and the EC2
     * instances on which the cluster is running are stopped. Any log files not
     * already saved are uploaded to Amazon S3 if a LogUri was specified when
     * the cluster was created.
     * </p>
     * <p>
     * The maximum number of clusters allowed is 10. The call to
     * <code>TerminateJobFlows</code> is asynchronous. Depending on the
     * configuration of the cluster, it may take up to 1-5 minutes for the
     * cluster to completely terminate and release allocated resources, such as
     * Amazon EC2 instances.
     * </p>
     * 
     * @param terminateJobFlowsRequest <p>
     *            Input to the <a>TerminateJobFlows</a> operation.
     *            </p>
     * @throws InternalServerErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Elastic MapReduce indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    void terminateJobFlows(TerminateJobFlowsRequest terminateJobFlowsRequest)
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
