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

package com.amazonaws.services.codedeploy;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.codedeploy.model.*;

/**
 * Interface for accessing AWS CodeDeploy <fullname>AWS CodeDeploy</fullname>
 * <p>
 * AWS CodeDeploy is a deployment service that automates application deployments
 * to Amazon EC2 instances, on-premises instances running in your own facility,
 * serverless AWS Lambda functions, or applications in an Amazon ECS service.
 * </p>
 * <p>
 * You can deploy a nearly unlimited variety of application content, such as an
 * updated Lambda function, updated applications in an Amazon ECS service, code,
 * web and configuration files, executables, packages, scripts, multimedia
 * files, and so on. AWS CodeDeploy can deploy application content stored in
 * Amazon S3 buckets, GitHub repositories, or Bitbucket repositories. You do not
 * need to make changes to your existing code before you can use AWS CodeDeploy.
 * </p>
 * <p>
 * AWS CodeDeploy makes it easier for you to rapidly release new features, helps
 * you avoid downtime during application deployment, and handles the complexity
 * of updating your applications, without many of the risks associated with
 * error-prone manual deployments.
 * </p>
 * <p>
 * <b>AWS CodeDeploy Components</b>
 * </p>
 * <p>
 * Use the information in this guide to help you work with the following AWS
 * CodeDeploy components:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Application</b>: A name that uniquely identifies the application you want
 * to deploy. AWS CodeDeploy uses this name, which functions as a container, to
 * ensure the correct combination of revision, deployment configuration, and
 * deployment group are referenced during a deployment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deployment group</b>: A set of individual instances, CodeDeploy Lambda
 * deployment configuration settings, or an Amazon ECS service and network
 * details. A Lambda deployment group specifies how to route traffic to a new
 * version of a Lambda function. An Amazon ECS deployment group specifies the
 * service created in Amazon ECS to deploy, a load balancer, and a listener to
 * reroute production traffic to an updated containerized application. An
 * EC2/On-premises deployment group contains individually tagged instances,
 * Amazon EC2 instances in Amazon EC2 Auto Scaling groups, or both. All
 * deployment groups can specify optional trigger, alarm, and rollback settings.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deployment configuration</b>: A set of deployment rules and deployment
 * success and failure conditions used by AWS CodeDeploy during a deployment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deployment</b>: The process and the components used when updating a Lambda
 * function, a containerized application in an Amazon ECS service, or of
 * installing content on one or more instances.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Application revisions</b>: For an AWS Lambda deployment, this is an
 * AppSpec file that specifies the Lambda function to be updated and one or more
 * functions to validate deployment lifecycle events. For an Amazon ECS
 * deployment, this is an AppSpec file that specifies the Amazon ECS task
 * definition, container, and port where production traffic is rerouted. For an
 * EC2/On-premises deployment, this is an archive file that contains source
 * content—source code, webpages, executable files, and deployment scripts—along
 * with an AppSpec file. Revisions are stored in Amazon S3 buckets or GitHub
 * repositories. For Amazon S3, a revision is uniquely identified by its Amazon
 * S3 object key and its ETag, version, or both. For GitHub, a revision is
 * uniquely identified by its commit ID.
 * </p>
 * </li>
 * </ul>
 * <p>
 * This guide also contains information to help you get details about the
 * instances in your deployments, to make on-premises instances available for
 * AWS CodeDeploy deployments, to get details about a Lambda function
 * deployment, and to get details about Amazon ECS service deployments.
 * </p>
 * <p>
 * <b>AWS CodeDeploy Information Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codedeploy/latest/userguide">AWS
 * CodeDeploy User Guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/codedeploy/latest/APIReference/">AWS
 * CodeDeploy API Reference Guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/cli/latest/reference/deploy/index.html">
 * AWS CLI Reference for AWS CodeDeploy</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://forums.aws.amazon.com/forum.jspa?forumID=179">AWS CodeDeploy
 * Developer Forum</a>
 * </p>
 * </li>
 * </ul>
 **/
public interface AWSCodeDeploy {

    /**
     * Overrides the default endpoint for this client
     * ("https://codedeploy.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "codedeploy.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://codedeploy.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "codedeploy.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://codedeploy.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSCodeDeploy#setEndpoint(String)}, sets the
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
     * Adds tags to on-premises instances.
     * </p>
     * 
     * @param addTagsToOnPremisesInstancesRequest <p>
     *            Represents the input of, and adds tags to, an on-premises
     *            instance operation.
     *            </p>
     * @throws InstanceNameRequiredException
     * @throws InvalidInstanceNameException
     * @throws TagRequiredException
     * @throws InvalidTagException
     * @throws TagLimitExceededException
     * @throws InstanceLimitExceededException
     * @throws InstanceNotRegisteredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void addTagsToOnPremisesInstances(
            AddTagsToOnPremisesInstancesRequest addTagsToOnPremisesInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about one or more application revisions. The maximum
     * number of application revisions that can be returned is 25.
     * </p>
     * 
     * @param batchGetApplicationRevisionsRequest <p>
     *            Represents the input of a
     *            <code>BatchGetApplicationRevisions</code> operation.
     *            </p>
     * @return batchGetApplicationRevisionsResult The response from the
     *         BatchGetApplicationRevisions service method, as returned by AWS
     *         CodeDeploy.
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws RevisionRequiredException
     * @throws InvalidRevisionException
     * @throws BatchLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetApplicationRevisionsResult batchGetApplicationRevisions(
            BatchGetApplicationRevisionsRequest batchGetApplicationRevisionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about one or more applications. The maximum number of
     * applications that can be returned is 100.
     * </p>
     * 
     * @param batchGetApplicationsRequest <p>
     *            Represents the input of a <code>BatchGetApplications</code>
     *            operation.
     *            </p>
     * @return batchGetApplicationsResult The response from the
     *         BatchGetApplications service method, as returned by AWS
     *         CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws BatchLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetApplicationsResult batchGetApplications(
            BatchGetApplicationsRequest batchGetApplicationsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about one or more deployment groups.
     * </p>
     * 
     * @param batchGetDeploymentGroupsRequest <p>
     *            Represents the input of a
     *            <code>BatchGetDeploymentGroups</code> operation.
     *            </p>
     * @return batchGetDeploymentGroupsResult The response from the
     *         BatchGetDeploymentGroups service method, as returned by AWS
     *         CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidDeploymentGroupNameException
     * @throws BatchLimitExceededException
     * @throws DeploymentConfigDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetDeploymentGroupsResult batchGetDeploymentGroups(
            BatchGetDeploymentGroupsRequest batchGetDeploymentGroupsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <note>
     * <p>
     * This method works, but is deprecated. Use
     * <code>BatchGetDeploymentTargets</code> instead.
     * </p>
     * </note>
     * <p>
     * Returns an array of one or more instances associated with a deployment.
     * This method works with EC2/On-premises and AWS Lambda compute platforms.
     * The newer <code>BatchGetDeploymentTargets</code> works with all compute
     * platforms. The maximum number of instances that can be returned is 25.
     * </p>
     * 
     * @param batchGetDeploymentInstancesRequest <p>
     *            Represents the input of a
     *            <code>BatchGetDeploymentInstances</code> operation.
     *            </p>
     * @return batchGetDeploymentInstancesResult The response from the
     *         BatchGetDeploymentInstances service method, as returned by AWS
     *         CodeDeploy.
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws InstanceIdRequiredException
     * @throws InvalidDeploymentIdException
     * @throws InvalidInstanceNameException
     * @throws BatchLimitExceededException
     * @throws InvalidComputePlatformException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    @Deprecated
    BatchGetDeploymentInstancesResult batchGetDeploymentInstances(
            BatchGetDeploymentInstancesRequest batchGetDeploymentInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an array of one or more targets associated with a deployment.
     * This method works with all compute types and should be used instead of
     * the deprecated <code>BatchGetDeploymentInstances</code>. The maximum
     * number of targets that can be returned is 25.
     * </p>
     * <p>
     * The type of targets returned depends on the deployment's compute platform
     * or deployment method:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2/On-premises</b>: Information about EC2 instance targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Lambda</b>: Information about Lambda functions targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon ECS</b>: Information about Amazon ECS service targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFormation</b>: Information about targets of blue/green
     * deployments initiated by a CloudFormation stack update.
     * </p>
     * </li>
     * </ul>
     * 
     * @param batchGetDeploymentTargetsRequest
     * @return batchGetDeploymentTargetsResult The response from the
     *         BatchGetDeploymentTargets service method, as returned by AWS
     *         CodeDeploy.
     * @throws InvalidDeploymentIdException
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws DeploymentNotStartedException
     * @throws DeploymentTargetIdRequiredException
     * @throws InvalidDeploymentTargetIdException
     * @throws DeploymentTargetDoesNotExistException
     * @throws DeploymentTargetListSizeExceededException
     * @throws InstanceDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetDeploymentTargetsResult batchGetDeploymentTargets(
            BatchGetDeploymentTargetsRequest batchGetDeploymentTargetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about one or more deployments. The maximum number of
     * deployments that can be returned is 25.
     * </p>
     * 
     * @param batchGetDeploymentsRequest <p>
     *            Represents the input of a <code>BatchGetDeployments</code>
     *            operation.
     *            </p>
     * @return batchGetDeploymentsResult The response from the
     *         BatchGetDeployments service method, as returned by AWS
     *         CodeDeploy.
     * @throws DeploymentIdRequiredException
     * @throws InvalidDeploymentIdException
     * @throws BatchLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetDeploymentsResult batchGetDeployments(
            BatchGetDeploymentsRequest batchGetDeploymentsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about one or more on-premises instances. The maximum
     * number of on-premises instances that can be returned is 25.
     * </p>
     * 
     * @param batchGetOnPremisesInstancesRequest <p>
     *            Represents the input of a
     *            <code>BatchGetOnPremisesInstances</code> operation.
     *            </p>
     * @return batchGetOnPremisesInstancesResult The response from the
     *         BatchGetOnPremisesInstances service method, as returned by AWS
     *         CodeDeploy.
     * @throws InstanceNameRequiredException
     * @throws InvalidInstanceNameException
     * @throws BatchLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    BatchGetOnPremisesInstancesResult batchGetOnPremisesInstances(
            BatchGetOnPremisesInstancesRequest batchGetOnPremisesInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * For a blue/green deployment, starts the process of rerouting traffic from
     * instances in the original environment to instances in the replacement
     * environment without waiting for a specified wait time to elapse. (Traffic
     * rerouting, which is achieved by registering instances in the replacement
     * environment with the load balancer, can start as soon as all instances
     * have a status of Ready.)
     * </p>
     * 
     * @param continueDeploymentRequest
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws DeploymentAlreadyCompletedException
     * @throws InvalidDeploymentIdException
     * @throws DeploymentIsNotInReadyStateException
     * @throws UnsupportedActionForDeploymentTypeException
     * @throws InvalidDeploymentWaitTypeException
     * @throws InvalidDeploymentStatusException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void continueDeployment(ContinueDeploymentRequest continueDeploymentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates an application.
     * </p>
     * 
     * @param createApplicationRequest <p>
     *            Represents the input of a <code>CreateApplication</code>
     *            operation.
     *            </p>
     * @return createApplicationResult The response from the CreateApplication
     *         service method, as returned by AWS CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationAlreadyExistsException
     * @throws ApplicationLimitExceededException
     * @throws InvalidComputePlatformException
     * @throws InvalidTagsToAddException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deploys an application revision through the specified deployment group.
     * </p>
     * 
     * @param createDeploymentRequest <p>
     *            Represents the input of a <code>CreateDeployment</code>
     *            operation.
     *            </p>
     * @return createDeploymentResult The response from the CreateDeployment
     *         service method, as returned by AWS CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidDeploymentGroupNameException
     * @throws DeploymentGroupDoesNotExistException
     * @throws RevisionRequiredException
     * @throws RevisionDoesNotExistException
     * @throws InvalidRevisionException
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentConfigDoesNotExistException
     * @throws DescriptionTooLongException
     * @throws DeploymentLimitExceededException
     * @throws InvalidTargetInstancesException
     * @throws InvalidAutoRollbackConfigException
     * @throws InvalidLoadBalancerInfoException
     * @throws InvalidFileExistsBehaviorException
     * @throws InvalidRoleException
     * @throws InvalidAutoScalingGroupException
     * @throws ThrottlingException
     * @throws InvalidUpdateOutdatedInstancesOnlyValueException
     * @throws InvalidIgnoreApplicationStopFailuresValueException
     * @throws InvalidGitHubAccountTokenException
     * @throws InvalidTrafficRoutingConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a deployment configuration.
     * </p>
     * 
     * @param createDeploymentConfigRequest <p>
     *            Represents the input of a <code>CreateDeploymentConfig</code>
     *            operation.
     *            </p>
     * @return createDeploymentConfigResult The response from the
     *         CreateDeploymentConfig service method, as returned by AWS
     *         CodeDeploy.
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentConfigNameRequiredException
     * @throws DeploymentConfigAlreadyExistsException
     * @throws InvalidMinimumHealthyHostValueException
     * @throws DeploymentConfigLimitExceededException
     * @throws InvalidComputePlatformException
     * @throws InvalidTrafficRoutingConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDeploymentConfigResult createDeploymentConfig(
            CreateDeploymentConfigRequest createDeploymentConfigRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a deployment group to which application revisions are deployed.
     * </p>
     * 
     * @param createDeploymentGroupRequest <p>
     *            Represents the input of a <code>CreateDeploymentGroup</code>
     *            operation.
     *            </p>
     * @return createDeploymentGroupResult The response from the
     *         CreateDeploymentGroup service method, as returned by AWS
     *         CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidDeploymentGroupNameException
     * @throws DeploymentGroupAlreadyExistsException
     * @throws InvalidEC2TagException
     * @throws InvalidTagException
     * @throws InvalidAutoScalingGroupException
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentConfigDoesNotExistException
     * @throws RoleRequiredException
     * @throws InvalidRoleException
     * @throws DeploymentGroupLimitExceededException
     * @throws LifecycleHookLimitExceededException
     * @throws InvalidTriggerConfigException
     * @throws TriggerTargetsLimitExceededException
     * @throws InvalidAlarmConfigException
     * @throws AlarmsLimitExceededException
     * @throws InvalidAutoRollbackConfigException
     * @throws InvalidLoadBalancerInfoException
     * @throws InvalidDeploymentStyleException
     * @throws InvalidBlueGreenDeploymentConfigurationException
     * @throws InvalidEC2TagCombinationException
     * @throws InvalidOnPremisesTagCombinationException
     * @throws TagSetListLimitExceededException
     * @throws InvalidInputException
     * @throws ThrottlingException
     * @throws InvalidECSServiceException
     * @throws InvalidTargetGroupPairException
     * @throws ECSServiceMappingLimitExceededException
     * @throws InvalidTagsToAddException
     * @throws InvalidTrafficRoutingConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateDeploymentGroupResult createDeploymentGroup(
            CreateDeploymentGroupRequest createDeploymentGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes an application.
     * </p>
     * 
     * @param deleteApplicationRequest <p>
     *            Represents the input of a <code>DeleteApplication</code>
     *            operation.
     *            </p>
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws InvalidRoleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteApplication(DeleteApplicationRequest deleteApplicationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a deployment configuration.
     * </p>
     * <note>
     * <p>
     * A deployment configuration cannot be deleted if it is currently in use.
     * Predefined configurations cannot be deleted.
     * </p>
     * </note>
     * 
     * @param deleteDeploymentConfigRequest <p>
     *            Represents the input of a <code>DeleteDeploymentConfig</code>
     *            operation.
     *            </p>
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentConfigNameRequiredException
     * @throws DeploymentConfigInUseException
     * @throws InvalidOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteDeploymentConfig(DeleteDeploymentConfigRequest deleteDeploymentConfigRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a deployment group.
     * </p>
     * 
     * @param deleteDeploymentGroupRequest <p>
     *            Represents the input of a <code>DeleteDeploymentGroup</code>
     *            operation.
     *            </p>
     * @return deleteDeploymentGroupResult The response from the
     *         DeleteDeploymentGroup service method, as returned by AWS
     *         CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidDeploymentGroupNameException
     * @throws InvalidRoleException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteDeploymentGroupResult deleteDeploymentGroup(
            DeleteDeploymentGroupRequest deleteDeploymentGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a GitHub account connection.
     * </p>
     * 
     * @param deleteGitHubAccountTokenRequest <p>
     *            Represents the input of a <code>DeleteGitHubAccount</code>
     *            operation.
     *            </p>
     * @return deleteGitHubAccountTokenResult The response from the
     *         DeleteGitHubAccountToken service method, as returned by AWS
     *         CodeDeploy.
     * @throws GitHubAccountTokenNameRequiredException
     * @throws GitHubAccountTokenDoesNotExistException
     * @throws InvalidGitHubAccountTokenNameException
     * @throws ResourceValidationException
     * @throws OperationNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteGitHubAccountTokenResult deleteGitHubAccountToken(
            DeleteGitHubAccountTokenRequest deleteGitHubAccountTokenRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes resources linked to an external ID.
     * </p>
     * 
     * @param deleteResourcesByExternalIdRequest
     * @return deleteResourcesByExternalIdResult The response from the
     *         DeleteResourcesByExternalId service method, as returned by AWS
     *         CodeDeploy.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteResourcesByExternalIdResult deleteResourcesByExternalId(
            DeleteResourcesByExternalIdRequest deleteResourcesByExternalIdRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deregisters an on-premises instance.
     * </p>
     * 
     * @param deregisterOnPremisesInstanceRequest <p>
     *            Represents the input of a
     *            <code>DeregisterOnPremisesInstance</code> operation.
     *            </p>
     * @throws InstanceNameRequiredException
     * @throws InvalidInstanceNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deregisterOnPremisesInstance(
            DeregisterOnPremisesInstanceRequest deregisterOnPremisesInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about an application.
     * </p>
     * 
     * @param getApplicationRequest <p>
     *            Represents the input of a <code>GetApplication</code>
     *            operation.
     *            </p>
     * @return getApplicationResult The response from the GetApplication service
     *         method, as returned by AWS CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetApplicationResult getApplication(GetApplicationRequest getApplicationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about an application revision.
     * </p>
     * 
     * @param getApplicationRevisionRequest <p>
     *            Represents the input of a <code>GetApplicationRevision</code>
     *            operation.
     *            </p>
     * @return getApplicationRevisionResult The response from the
     *         GetApplicationRevision service method, as returned by AWS
     *         CodeDeploy.
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws RevisionDoesNotExistException
     * @throws RevisionRequiredException
     * @throws InvalidRevisionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetApplicationRevisionResult getApplicationRevision(
            GetApplicationRevisionRequest getApplicationRevisionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a deployment.
     * </p>
     * <note>
     * <p>
     * The <code>content</code> property of the <code>appSpecContent</code>
     * object in the returned revision is always null. Use
     * <code>GetApplicationRevision</code> and the <code>sha256</code> property
     * of the returned <code>appSpecContent</code> object to get the content of
     * the deployment’s AppSpec file.
     * </p>
     * </note>
     * 
     * @param getDeploymentRequest <p>
     *            Represents the input of a <code>GetDeployment</code>
     *            operation.
     *            </p>
     * @return getDeploymentResult The response from the GetDeployment service
     *         method, as returned by AWS CodeDeploy.
     * @throws DeploymentIdRequiredException
     * @throws InvalidDeploymentIdException
     * @throws DeploymentDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a deployment configuration.
     * </p>
     * 
     * @param getDeploymentConfigRequest <p>
     *            Represents the input of a <code>GetDeploymentConfig</code>
     *            operation.
     *            </p>
     * @return getDeploymentConfigResult The response from the
     *         GetDeploymentConfig service method, as returned by AWS
     *         CodeDeploy.
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentConfigNameRequiredException
     * @throws DeploymentConfigDoesNotExistException
     * @throws InvalidComputePlatformException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDeploymentConfigResult getDeploymentConfig(
            GetDeploymentConfigRequest getDeploymentConfigRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about a deployment group.
     * </p>
     * 
     * @param getDeploymentGroupRequest <p>
     *            Represents the input of a <code>GetDeploymentGroup</code>
     *            operation.
     *            </p>
     * @return getDeploymentGroupResult The response from the GetDeploymentGroup
     *         service method, as returned by AWS CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidDeploymentGroupNameException
     * @throws DeploymentGroupDoesNotExistException
     * @throws DeploymentConfigDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDeploymentGroupResult getDeploymentGroup(GetDeploymentGroupRequest getDeploymentGroupRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about an instance as part of a deployment.
     * </p>
     * 
     * @param getDeploymentInstanceRequest <p>
     *            Represents the input of a <code>GetDeploymentInstance</code>
     *            operation.
     *            </p>
     * @return getDeploymentInstanceResult The response from the
     *         GetDeploymentInstance service method, as returned by AWS
     *         CodeDeploy.
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws InstanceIdRequiredException
     * @throws InvalidDeploymentIdException
     * @throws InstanceDoesNotExistException
     * @throws InvalidInstanceNameException
     * @throws InvalidComputePlatformException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    @Deprecated
    GetDeploymentInstanceResult getDeploymentInstance(
            GetDeploymentInstanceRequest getDeploymentInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a deployment target.
     * </p>
     * 
     * @param getDeploymentTargetRequest
     * @return getDeploymentTargetResult The response from the
     *         GetDeploymentTarget service method, as returned by AWS
     *         CodeDeploy.
     * @throws InvalidDeploymentIdException
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws DeploymentNotStartedException
     * @throws DeploymentTargetIdRequiredException
     * @throws InvalidDeploymentTargetIdException
     * @throws DeploymentTargetDoesNotExistException
     * @throws InvalidInstanceNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDeploymentTargetResult getDeploymentTarget(
            GetDeploymentTargetRequest getDeploymentTargetRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about an on-premises instance.
     * </p>
     * 
     * @param getOnPremisesInstanceRequest <p>
     *            Represents the input of a <code>GetOnPremisesInstance</code>
     *            operation.
     *            </p>
     * @return getOnPremisesInstanceResult The response from the
     *         GetOnPremisesInstance service method, as returned by AWS
     *         CodeDeploy.
     * @throws InstanceNameRequiredException
     * @throws InstanceNotRegisteredException
     * @throws InvalidInstanceNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetOnPremisesInstanceResult getOnPremisesInstance(
            GetOnPremisesInstanceRequest getOnPremisesInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists information about revisions for an application.
     * </p>
     * 
     * @param listApplicationRevisionsRequest <p>
     *            Represents the input of a
     *            <code>ListApplicationRevisions</code> operation.
     *            </p>
     * @return listApplicationRevisionsResult The response from the
     *         ListApplicationRevisions service method, as returned by AWS
     *         CodeDeploy.
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws InvalidSortByException
     * @throws InvalidSortOrderException
     * @throws InvalidBucketNameFilterException
     * @throws InvalidKeyPrefixFilterException
     * @throws BucketNameFilterRequiredException
     * @throws InvalidDeployedStateFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListApplicationRevisionsResult listApplicationRevisions(
            ListApplicationRevisionsRequest listApplicationRevisionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the applications registered with the IAM user or AWS account.
     * </p>
     * 
     * @param listApplicationsRequest <p>
     *            Represents the input of a <code>ListApplications</code>
     *            operation.
     *            </p>
     * @return listApplicationsResult The response from the ListApplications
     *         service method, as returned by AWS CodeDeploy.
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the deployment configurations with the IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentConfigsRequest <p>
     *            Represents the input of a <code>ListDeploymentConfigs</code>
     *            operation.
     *            </p>
     * @return listDeploymentConfigsResult The response from the
     *         ListDeploymentConfigs service method, as returned by AWS
     *         CodeDeploy.
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDeploymentConfigsResult listDeploymentConfigs(
            ListDeploymentConfigsRequest listDeploymentConfigsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the deployment groups for an application registered with the IAM
     * user or AWS account.
     * </p>
     * 
     * @param listDeploymentGroupsRequest <p>
     *            Represents the input of a <code>ListDeploymentGroups</code>
     *            operation.
     *            </p>
     * @return listDeploymentGroupsResult The response from the
     *         ListDeploymentGroups service method, as returned by AWS
     *         CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDeploymentGroupsResult listDeploymentGroups(
            ListDeploymentGroupsRequest listDeploymentGroupsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <note>
     * <p>
     * The newer <code>BatchGetDeploymentTargets</code> should be used instead
     * because it works with all compute types.
     * <code>ListDeploymentInstances</code> throws an exception if it is used
     * with a compute platform other than EC2/On-premises or AWS Lambda.
     * </p>
     * </note>
     * <p>
     * Lists the instance for a deployment associated with the IAM user or AWS
     * account.
     * </p>
     * 
     * @param listDeploymentInstancesRequest <p>
     *            Represents the input of a <code>ListDeploymentInstances</code>
     *            operation.
     *            </p>
     * @return listDeploymentInstancesResult The response from the
     *         ListDeploymentInstances service method, as returned by AWS
     *         CodeDeploy.
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws DeploymentNotStartedException
     * @throws InvalidNextTokenException
     * @throws InvalidDeploymentIdException
     * @throws InvalidInstanceStatusException
     * @throws InvalidInstanceTypeException
     * @throws InvalidDeploymentInstanceTypeException
     * @throws InvalidTargetFilterNameException
     * @throws InvalidComputePlatformException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    @Deprecated
    ListDeploymentInstancesResult listDeploymentInstances(
            ListDeploymentInstancesRequest listDeploymentInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an array of target IDs that are associated a deployment.
     * </p>
     * 
     * @param listDeploymentTargetsRequest
     * @return listDeploymentTargetsResult The response from the
     *         ListDeploymentTargets service method, as returned by AWS
     *         CodeDeploy.
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws DeploymentNotStartedException
     * @throws InvalidNextTokenException
     * @throws InvalidDeploymentIdException
     * @throws InvalidInstanceStatusException
     * @throws InvalidInstanceTypeException
     * @throws InvalidDeploymentInstanceTypeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDeploymentTargetsResult listDeploymentTargets(
            ListDeploymentTargetsRequest listDeploymentTargetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the deployments in a deployment group for an application registered
     * with the IAM user or AWS account.
     * </p>
     * 
     * @param listDeploymentsRequest <p>
     *            Represents the input of a <code>ListDeployments</code>
     *            operation.
     *            </p>
     * @return listDeploymentsResult The response from the ListDeployments
     *         service method, as returned by AWS CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws InvalidDeploymentGroupNameException
     * @throws DeploymentGroupDoesNotExistException
     * @throws DeploymentGroupNameRequiredException
     * @throws InvalidTimeRangeException
     * @throws InvalidDeploymentStatusException
     * @throws InvalidNextTokenException
     * @throws InvalidExternalIdException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListDeploymentsResult listDeployments(ListDeploymentsRequest listDeploymentsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the names of stored connections to GitHub accounts.
     * </p>
     * 
     * @param listGitHubAccountTokenNamesRequest <p>
     *            Represents the input of a
     *            <code>ListGitHubAccountTokenNames</code> operation.
     *            </p>
     * @return listGitHubAccountTokenNamesResult The response from the
     *         ListGitHubAccountTokenNames service method, as returned by AWS
     *         CodeDeploy.
     * @throws InvalidNextTokenException
     * @throws ResourceValidationException
     * @throws OperationNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListGitHubAccountTokenNamesResult listGitHubAccountTokenNames(
            ListGitHubAccountTokenNamesRequest listGitHubAccountTokenNamesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of names for one or more on-premises instances.
     * </p>
     * <p>
     * Unless otherwise specified, both registered and deregistered on-premises
     * instance names are listed. To list only registered or deregistered
     * on-premises instance names, use the registration status parameter.
     * </p>
     * 
     * @param listOnPremisesInstancesRequest <p>
     *            Represents the input of a <code>ListOnPremisesInstances</code>
     *            operation.
     *            </p>
     * @return listOnPremisesInstancesResult The response from the
     *         ListOnPremisesInstances service method, as returned by AWS
     *         CodeDeploy.
     * @throws InvalidRegistrationStatusException
     * @throws InvalidTagFilterException
     * @throws InvalidNextTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListOnPremisesInstancesResult listOnPremisesInstances(
            ListOnPremisesInstancesRequest listOnPremisesInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of tags for the resource identified by a specified Amazon
     * Resource Name (ARN). Tags are used to organize and categorize your
     * CodeDeploy resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS
     *         CodeDeploy.
     * @throws ArnNotSupportedException
     * @throws InvalidArnException
     * @throws ResourceArnRequiredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Sets the result of a Lambda validation function. The function validates
     * lifecycle hooks during a deployment that uses the AWS Lambda or Amazon
     * ECS compute platform. For AWS Lambda deployments, the available lifecycle
     * hooks are <code>BeforeAllowTraffic</code> and
     * <code>AfterAllowTraffic</code>. For Amazon ECS deployments, the available
     * lifecycle hooks are <code>BeforeInstall</code>, <code>AfterInstall</code>, <code>AfterAllowTestTraffic</code>, <code>BeforeAllowTraffic</code>,
     * and <code>AfterAllowTraffic</code>. Lambda validation functions return
     * <code>Succeeded</code> or <code>Failed</code>. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/reference-appspec-file-structure-hooks.html#appspec-hooks-lambda"
     * >AppSpec 'hooks' Section for an AWS Lambda Deployment </a> and <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/reference-appspec-file-structure-hooks.html#appspec-hooks-ecs"
     * >AppSpec 'hooks' Section for an Amazon ECS Deployment</a>.
     * </p>
     * 
     * @param putLifecycleEventHookExecutionStatusRequest
     * @return putLifecycleEventHookExecutionStatusResult The response from the
     *         PutLifecycleEventHookExecutionStatus service method, as returned
     *         by AWS CodeDeploy.
     * @throws InvalidLifecycleEventHookExecutionStatusException
     * @throws InvalidLifecycleEventHookExecutionIdException
     * @throws LifecycleEventAlreadyCompletedException
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws InvalidDeploymentIdException
     * @throws UnsupportedActionForDeploymentTypeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutLifecycleEventHookExecutionStatusResult putLifecycleEventHookExecutionStatus(
            PutLifecycleEventHookExecutionStatusRequest putLifecycleEventHookExecutionStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Registers with AWS CodeDeploy a revision for the specified application.
     * </p>
     * 
     * @param registerApplicationRevisionRequest <p>
     *            Represents the input of a RegisterApplicationRevision
     *            operation.
     *            </p>
     * @throws ApplicationDoesNotExistException
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws DescriptionTooLongException
     * @throws RevisionRequiredException
     * @throws InvalidRevisionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void registerApplicationRevision(
            RegisterApplicationRevisionRequest registerApplicationRevisionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Registers an on-premises instance.
     * </p>
     * <note>
     * <p>
     * Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the
     * request. You cannot use both.
     * </p>
     * </note>
     * 
     * @param registerOnPremisesInstanceRequest <p>
     *            Represents the input of the register on-premises instance
     *            operation.
     *            </p>
     * @throws InstanceNameAlreadyRegisteredException
     * @throws IamArnRequiredException
     * @throws IamSessionArnAlreadyRegisteredException
     * @throws IamUserArnAlreadyRegisteredException
     * @throws InstanceNameRequiredException
     * @throws IamUserArnRequiredException
     * @throws InvalidInstanceNameException
     * @throws InvalidIamSessionArnException
     * @throws InvalidIamUserArnException
     * @throws MultipleIamArnsProvidedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void registerOnPremisesInstance(
            RegisterOnPremisesInstanceRequest registerOnPremisesInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes one or more tags from one or more on-premises instances.
     * </p>
     * 
     * @param removeTagsFromOnPremisesInstancesRequest <p>
     *            Represents the input of a
     *            <code>RemoveTagsFromOnPremisesInstances</code> operation.
     *            </p>
     * @throws InstanceNameRequiredException
     * @throws InvalidInstanceNameException
     * @throws TagRequiredException
     * @throws InvalidTagException
     * @throws TagLimitExceededException
     * @throws InstanceLimitExceededException
     * @throws InstanceNotRegisteredException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void removeTagsFromOnPremisesInstances(
            RemoveTagsFromOnPremisesInstancesRequest removeTagsFromOnPremisesInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * In a blue/green deployment, overrides any specified wait time and starts
     * terminating instances immediately after the traffic routing is complete.
     * </p>
     * 
     * @param skipWaitTimeForInstanceTerminationRequest
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws DeploymentAlreadyCompletedException
     * @throws InvalidDeploymentIdException
     * @throws DeploymentNotStartedException
     * @throws UnsupportedActionForDeploymentTypeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    @Deprecated
    void skipWaitTimeForInstanceTermination(
            SkipWaitTimeForInstanceTerminationRequest skipWaitTimeForInstanceTerminationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Attempts to stop an ongoing deployment.
     * </p>
     * 
     * @param stopDeploymentRequest <p>
     *            Represents the input of a <code>StopDeployment</code>
     *            operation.
     *            </p>
     * @return stopDeploymentResult The response from the StopDeployment service
     *         method, as returned by AWS CodeDeploy.
     * @throws DeploymentIdRequiredException
     * @throws DeploymentDoesNotExistException
     * @throws DeploymentGroupDoesNotExistException
     * @throws DeploymentAlreadyCompletedException
     * @throws InvalidDeploymentIdException
     * @throws UnsupportedActionForDeploymentTypeException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StopDeploymentResult stopDeployment(StopDeploymentRequest stopDeploymentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Associates the list of tags in the input <code>Tags</code> parameter with
     * the resource identified by the <code>ResourceArn</code> input parameter.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS CodeDeploy.
     * @throws ResourceArnRequiredException
     * @throws ApplicationDoesNotExistException
     * @throws DeploymentGroupDoesNotExistException
     * @throws DeploymentConfigDoesNotExistException
     * @throws TagRequiredException
     * @throws InvalidTagsToAddException
     * @throws ArnNotSupportedException
     * @throws InvalidArnException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a resource from a list of tags. The resource is identified
     * by the <code>ResourceArn</code> input parameter. The tags are identified
     * by the list of keys in the <code>TagKeys</code> input parameter.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS CodeDeploy.
     * @throws ResourceArnRequiredException
     * @throws ApplicationDoesNotExistException
     * @throws DeploymentGroupDoesNotExistException
     * @throws DeploymentConfigDoesNotExistException
     * @throws TagRequiredException
     * @throws InvalidTagsToAddException
     * @throws ArnNotSupportedException
     * @throws InvalidArnException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Changes the name of an application.
     * </p>
     * 
     * @param updateApplicationRequest <p>
     *            Represents the input of an <code>UpdateApplication</code>
     *            operation.
     *            </p>
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationAlreadyExistsException
     * @throws ApplicationDoesNotExistException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void updateApplication(UpdateApplicationRequest updateApplicationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Changes information about a deployment group.
     * </p>
     * 
     * @param updateDeploymentGroupRequest <p>
     *            Represents the input of an <code>UpdateDeploymentGroup</code>
     *            operation.
     *            </p>
     * @return updateDeploymentGroupResult The response from the
     *         UpdateDeploymentGroup service method, as returned by AWS
     *         CodeDeploy.
     * @throws ApplicationNameRequiredException
     * @throws InvalidApplicationNameException
     * @throws ApplicationDoesNotExistException
     * @throws InvalidDeploymentGroupNameException
     * @throws DeploymentGroupAlreadyExistsException
     * @throws DeploymentGroupNameRequiredException
     * @throws DeploymentGroupDoesNotExistException
     * @throws InvalidEC2TagException
     * @throws InvalidTagException
     * @throws InvalidAutoScalingGroupException
     * @throws InvalidDeploymentConfigNameException
     * @throws DeploymentConfigDoesNotExistException
     * @throws InvalidRoleException
     * @throws LifecycleHookLimitExceededException
     * @throws InvalidTriggerConfigException
     * @throws TriggerTargetsLimitExceededException
     * @throws InvalidAlarmConfigException
     * @throws AlarmsLimitExceededException
     * @throws InvalidAutoRollbackConfigException
     * @throws InvalidLoadBalancerInfoException
     * @throws InvalidDeploymentStyleException
     * @throws InvalidBlueGreenDeploymentConfigurationException
     * @throws InvalidEC2TagCombinationException
     * @throws InvalidOnPremisesTagCombinationException
     * @throws TagSetListLimitExceededException
     * @throws InvalidInputException
     * @throws ThrottlingException
     * @throws InvalidECSServiceException
     * @throws InvalidTargetGroupPairException
     * @throws ECSServiceMappingLimitExceededException
     * @throws InvalidTrafficRoutingConfigurationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CodeDeploy indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateDeploymentGroupResult updateDeploymentGroup(
            UpdateDeploymentGroupRequest updateDeploymentGroupRequest)
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
