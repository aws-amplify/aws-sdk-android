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

package com.amazonaws.services.cloudformation;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.cloudformation.model.*;

/**
 * Interface for accessing AWS CloudFormation <fullname>AWS
 * CloudFormation</fullname>
 * <p>
 * AWS CloudFormation allows you to create and manage AWS infrastructure
 * deployments predictably and repeatedly. You can use AWS CloudFormation to
 * leverage AWS products, such as Amazon Elastic Compute Cloud, Amazon Elastic
 * Block Store, Amazon Simple Notification Service, Elastic Load Balancing, and
 * Auto Scaling to build highly-reliable, highly scalable, cost-effective
 * applications without creating or configuring the underlying AWS
 * infrastructure.
 * </p>
 * <p>
 * With AWS CloudFormation, you declare all of your resources and dependencies
 * in a template file. The template defines a collection of resources as a
 * single unit called a stack. AWS CloudFormation creates and deletes all member
 * resources of the stack together and manages all dependencies between the
 * resources for you.
 * </p>
 * <p>
 * For more information about AWS CloudFormation, see the <a
 * href="http://aws.amazon.com/cloudformation/">AWS CloudFormation Product
 * Page</a>.
 * </p>
 * <p>
 * Amazon CloudFormation makes use of other AWS products. If you need additional
 * technical information about a specific AWS product, you can find the
 * product's technical documentation at <a
 * href="https://docs.aws.amazon.com/">docs.aws.amazon.com</a>.
 * </p>
 **/
public interface AWSCloudFormation {

    /**
     * Overrides the default endpoint for this client
     * ("https://cloudformation.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "cloudformation.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://cloudformation.us-east-1.amazonaws.com"). If the
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
     *            "cloudformation.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://cloudformation.us-east-1.amazonaws.com") of the
     *            region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSCloudFormation#setEndpoint(String)}, sets the
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
     * Cancels an update on the specified stack. If the call completes
     * successfully, the stack rolls back the update and reverts to the previous
     * stack configuration.
     * </p>
     * <note>
     * <p>
     * You can cancel only stacks that are in the UPDATE_IN_PROGRESS state.
     * </p>
     * </note>
     * 
     * @param cancelUpdateStackRequest <p>
     *            The input for the <a>CancelUpdateStack</a> action.
     *            </p>
     * @throws TokenAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void cancelUpdateStack(CancelUpdateStackRequest cancelUpdateStackRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * For a specified stack that is in the <code>UPDATE_ROLLBACK_FAILED</code>
     * state, continues rolling it back to the
     * <code>UPDATE_ROLLBACK_COMPLETE</code> state. Depending on the cause of
     * the failure, you can manually <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     * > fix the error</a> and continue the rollback. By continuing the
     * rollback, you can return your stack to a working state (the
     * <code>UPDATE_ROLLBACK_COMPLETE</code> state), and then try to update the
     * stack again.
     * </p>
     * <p>
     * A stack goes into the <code>UPDATE_ROLLBACK_FAILED</code> state when AWS
     * CloudFormation cannot roll back all changes after a failed stack update.
     * For example, you might have a stack that is rolling back to an old
     * database instance that was deleted outside of AWS CloudFormation. Because
     * AWS CloudFormation doesn't know the database was deleted, it assumes that
     * the database instance still exists and attempts to roll back to it,
     * causing the update rollback to fail.
     * </p>
     * 
     * @param continueUpdateRollbackRequest <p>
     *            The input for the <a>ContinueUpdateRollback</a> action.
     *            </p>
     * @return continueUpdateRollbackResult The response from the
     *         ContinueUpdateRollback service method, as returned by AWS
     *         CloudFormation.
     * @throws TokenAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ContinueUpdateRollbackResult continueUpdateRollback(
            ContinueUpdateRollbackRequest continueUpdateRollbackRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a list of changes that will be applied to a stack so that you can
     * review the changes before executing them. You can create a change set for
     * a stack that doesn't exist or an existing stack. If you create a change
     * set for a stack that doesn't exist, the change set shows all of the
     * resources that AWS CloudFormation will create. If you create a change set
     * for an existing stack, AWS CloudFormation compares the stack's
     * information with the information that you submit in the change set and
     * lists the differences. Use change sets to understand which resources AWS
     * CloudFormation will create or change, and how it will change resources in
     * an existing stack, before you create or update a stack.
     * </p>
     * <p>
     * To create a change set for a stack that doesn't exist, for the
     * <code>ChangeSetType</code> parameter, specify <code>CREATE</code>. To
     * create a change set for an existing stack, specify <code>UPDATE</code>
     * for the <code>ChangeSetType</code> parameter. To create a change set for
     * an import operation, specify <code>IMPORT</code> for the
     * <code>ChangeSetType</code> parameter. After the
     * <code>CreateChangeSet</code> call successfully completes, AWS
     * CloudFormation starts creating the change set. To check the status of the
     * change set or to review it, use the <a>DescribeChangeSet</a> action.
     * </p>
     * <p>
     * When you are satisfied with the changes the change set will make, execute
     * the change set by using the <a>ExecuteChangeSet</a> action. AWS
     * CloudFormation doesn't make changes until you execute the change set.
     * </p>
     * 
     * @param createChangeSetRequest <p>
     *            The input for the <a>CreateChangeSet</a> action.
     *            </p>
     * @return createChangeSetResult The response from the CreateChangeSet
     *         service method, as returned by AWS CloudFormation.
     * @throws AlreadyExistsException
     * @throws InsufficientCapabilitiesException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateChangeSetResult createChangeSet(CreateChangeSetRequest createChangeSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a stack as specified in the template. After the call completes
     * successfully, the stack creation starts. You can check the status of the
     * stack via the <a>DescribeStacks</a> API.
     * </p>
     * 
     * @param createStackRequest <p>
     *            The input for <a>CreateStack</a> action.
     *            </p>
     * @return createStackResult The response from the CreateStack service
     *         method, as returned by AWS CloudFormation.
     * @throws LimitExceededException
     * @throws AlreadyExistsException
     * @throws TokenAlreadyExistsException
     * @throws InsufficientCapabilitiesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateStackResult createStack(CreateStackRequest createStackRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates stack instances for the specified accounts, within the specified
     * Regions. A stack instance refers to a stack in a specific account and
     * Region. You must specify at least one value for either
     * <code>Accounts</code> or <code>DeploymentTargets</code>, and you must
     * specify at least one value for <code>Regions</code>.
     * </p>
     * 
     * @param createStackInstancesRequest
     * @return createStackInstancesResult The response from the
     *         CreateStackInstances service method, as returned by AWS
     *         CloudFormation.
     * @throws StackSetNotFoundException
     * @throws OperationInProgressException
     * @throws OperationIdAlreadyExistsException
     * @throws StaleRequestException
     * @throws InvalidOperationException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateStackInstancesResult createStackInstances(
            CreateStackInstancesRequest createStackInstancesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a stack set.
     * </p>
     * 
     * @param createStackSetRequest
     * @return createStackSetResult The response from the CreateStackSet service
     *         method, as returned by AWS CloudFormation.
     * @throws NameAlreadyExistsException
     * @throws CreatedButModifiedException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateStackSetResult createStackSet(CreateStackSetRequest createStackSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the specified change set. Deleting change sets ensures that no
     * one executes the wrong change set.
     * </p>
     * <p>
     * If the call successfully completes, AWS CloudFormation successfully
     * deleted the change set.
     * </p>
     * 
     * @param deleteChangeSetRequest <p>
     *            The input for the <a>DeleteChangeSet</a> action.
     *            </p>
     * @return deleteChangeSetResult The response from the DeleteChangeSet
     *         service method, as returned by AWS CloudFormation.
     * @throws InvalidChangeSetStatusException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteChangeSetResult deleteChangeSet(DeleteChangeSetRequest deleteChangeSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a specified stack. Once the call completes successfully, stack
     * deletion starts. Deleted stacks do not show up in the
     * <a>DescribeStacks</a> API if the deletion has been completed
     * successfully.
     * </p>
     * 
     * @param deleteStackRequest <p>
     *            The input for <a>DeleteStack</a> action.
     *            </p>
     * @throws TokenAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void deleteStack(DeleteStackRequest deleteStackRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes stack instances for the specified accounts, in the specified
     * Regions.
     * </p>
     * 
     * @param deleteStackInstancesRequest
     * @return deleteStackInstancesResult The response from the
     *         DeleteStackInstances service method, as returned by AWS
     *         CloudFormation.
     * @throws StackSetNotFoundException
     * @throws OperationInProgressException
     * @throws OperationIdAlreadyExistsException
     * @throws StaleRequestException
     * @throws InvalidOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteStackInstancesResult deleteStackInstances(
            DeleteStackInstancesRequest deleteStackInstancesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a stack set. Before you can delete a stack set, all of its member
     * stack instances must be deleted. For more information about how to do
     * this, see <a>DeleteStackInstances</a>.
     * </p>
     * 
     * @param deleteStackSetRequest
     * @return deleteStackSetResult The response from the DeleteStackSet service
     *         method, as returned by AWS CloudFormation.
     * @throws StackSetNotEmptyException
     * @throws OperationInProgressException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeleteStackSetResult deleteStackSet(DeleteStackSetRequest deleteStackSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes a type or type version from active use in the CloudFormation
     * registry. If a type or type version is deregistered, it cannot be used in
     * CloudFormation operations.
     * </p>
     * <p>
     * To deregister a type, you must individually deregister all registered
     * versions of that type. If a type has only a single registered version,
     * deregistering that version results in the type itself being deregistered.
     * </p>
     * <p>
     * You cannot deregister the default version of a type, unless it is the
     * only registered version of that type, in which case the type itself is
     * deregistered as well.
     * </p>
     * 
     * @param deregisterTypeRequest
     * @return deregisterTypeResult The response from the DeregisterType service
     *         method, as returned by AWS CloudFormation.
     * @throws CFNRegistryException
     * @throws TypeNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DeregisterTypeResult deregisterType(DeregisterTypeRequest deregisterTypeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves your account's AWS CloudFormation limits, such as the maximum
     * number of stacks that you can create in your account. For more
     * information about account limits, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cloudformation-limits.html"
     * >AWS CloudFormation Limits</a> in the <i>AWS CloudFormation User
     * Guide</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest <p>
     *            The input for the <a>DescribeAccountLimits</a> action.
     *            </p>
     * @return describeAccountLimitsResult The response from the
     *         DescribeAccountLimits service method, as returned by AWS
     *         CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeAccountLimitsResult describeAccountLimits(
            DescribeAccountLimitsRequest describeAccountLimitsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the inputs for the change set and a list of changes that AWS
     * CloudFormation will make if you execute the change set. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-changesets.html"
     * >Updating Stacks Using Change Sets</a> in the AWS CloudFormation User
     * Guide.
     * </p>
     * 
     * @param describeChangeSetRequest <p>
     *            The input for the <a>DescribeChangeSet</a> action.
     *            </p>
     * @return describeChangeSetResult The response from the DescribeChangeSet
     *         service method, as returned by AWS CloudFormation.
     * @throws ChangeSetNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeChangeSetResult describeChangeSet(DescribeChangeSetRequest describeChangeSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a stack drift detection operation. A stack
     * drift detection operation detects whether a stack's actual configuration
     * differs, or has <i>drifted</i>, from it's expected configuration, as
     * defined in the stack template and any values specified as template
     * parameters. A stack is considered to have drifted if one or more of its
     * resources have drifted. For more information on stack and resource drift,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * <p>
     * Use <a>DetectStackDrift</a> to initiate a stack drift detection
     * operation. <code>DetectStackDrift</code> returns a
     * <code>StackDriftDetectionId</code> you can use to monitor the progress of
     * the operation using <code>DescribeStackDriftDetectionStatus</code>. Once
     * the drift detection operation has completed, use
     * <a>DescribeStackResourceDrifts</a> to return drift information about the
     * stack and its resources.
     * </p>
     * 
     * @param describeStackDriftDetectionStatusRequest
     * @return describeStackDriftDetectionStatusResult The response from the
     *         DescribeStackDriftDetectionStatus service method, as returned by
     *         AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeStackDriftDetectionStatusResult describeStackDriftDetectionStatus(
            DescribeStackDriftDetectionStatusRequest describeStackDriftDetectionStatusRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns all stack related events for a specified stack in reverse
     * chronological order. For more information about a stack's event history,
     * go to <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/concept-stack.html"
     * >Stacks</a> in the AWS CloudFormation User Guide.
     * </p>
     * <note>
     * <p>
     * You can list events for stacks that have failed to create or have been
     * deleted by specifying the unique stack identifier (stack ID).
     * </p>
     * </note>
     * 
     * @param describeStackEventsRequest <p>
     *            The input for <a>DescribeStackEvents</a> action.
     *            </p>
     * @return describeStackEventsResult The response from the
     *         DescribeStackEvents service method, as returned by AWS
     *         CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeStackEventsResult describeStackEvents(
            DescribeStackEventsRequest describeStackEventsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the stack instance that's associated with the specified stack
     * set, AWS account, and Region.
     * </p>
     * <p>
     * For a list of stack instances that are associated with a specific stack
     * set, use <a>ListStackInstances</a>.
     * </p>
     * 
     * @param describeStackInstanceRequest
     * @return describeStackInstanceResult The response from the
     *         DescribeStackInstance service method, as returned by AWS
     *         CloudFormation.
     * @throws StackSetNotFoundException
     * @throws StackInstanceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeStackInstanceResult describeStackInstance(
            DescribeStackInstanceRequest describeStackInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a description of the specified resource in the specified stack.
     * </p>
     * <p>
     * For deleted stacks, DescribeStackResource returns resource information
     * for up to 90 days after the stack has been deleted.
     * </p>
     * 
     * @param describeStackResourceRequest <p>
     *            The input for <a>DescribeStackResource</a> action.
     *            </p>
     * @return describeStackResourceResult The response from the
     *         DescribeStackResource service method, as returned by AWS
     *         CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeStackResourceResult describeStackResource(
            DescribeStackResourceRequest describeStackResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns drift information for the resources that have been checked for
     * drift in the specified stack. This includes actual and expected
     * configuration values for resources where AWS CloudFormation detects
     * configuration drift.
     * </p>
     * <p>
     * For a given stack, there will be one <code>StackResourceDrift</code> for
     * each stack resource that has been checked for drift. Resources that have
     * not yet been checked for drift are not included. Resources that do not
     * currently support drift detection are not checked, and so not included.
     * For a list of resources that support drift detection, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * <p>
     * Use <a>DetectStackResourceDrift</a> to detect drift on individual
     * resources, or <a>DetectStackDrift</a> to detect drift on all supported
     * resources for a given stack.
     * </p>
     * 
     * @param describeStackResourceDriftsRequest
     * @return describeStackResourceDriftsResult The response from the
     *         DescribeStackResourceDrifts service method, as returned by AWS
     *         CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeStackResourceDriftsResult describeStackResourceDrifts(
            DescribeStackResourceDriftsRequest describeStackResourceDriftsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns AWS resource descriptions for running and deleted stacks. If
     * <code>StackName</code> is specified, all the associated resources that
     * are part of the stack are returned. If <code>PhysicalResourceId</code> is
     * specified, the associated resources of the stack that the resource
     * belongs to are returned.
     * </p>
     * <note>
     * <p>
     * Only the first 100 resources will be returned. If your stack has more
     * resources than this, you should use <code>ListStackResources</code>
     * instead.
     * </p>
     * </note>
     * <p>
     * For deleted stacks, <code>DescribeStackResources</code> returns resource
     * information for up to 90 days after the stack has been deleted.
     * </p>
     * <p>
     * You must specify either <code>StackName</code> or
     * <code>PhysicalResourceId</code>, but not both. In addition, you can
     * specify <code>LogicalResourceId</code> to filter the returned result. For
     * more information about resources, the <code>LogicalResourceId</code> and
     * <code>PhysicalResourceId</code>, go to the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/"
     * >AWS CloudFormation User Guide</a>.
     * </p>
     * <note>
     * <p>
     * A <code>ValidationError</code> is returned if you specify both
     * <code>StackName</code> and <code>PhysicalResourceId</code> in the same
     * request.
     * </p>
     * </note>
     * 
     * @param describeStackResourcesRequest <p>
     *            The input for <a>DescribeStackResources</a> action.
     *            </p>
     * @return describeStackResourcesResult The response from the
     *         DescribeStackResources service method, as returned by AWS
     *         CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeStackResourcesResult describeStackResources(
            DescribeStackResourcesRequest describeStackResourcesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the description of the specified stack set.
     * </p>
     * 
     * @param describeStackSetRequest
     * @return describeStackSetResult The response from the DescribeStackSet
     *         service method, as returned by AWS CloudFormation.
     * @throws StackSetNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeStackSetResult describeStackSet(DescribeStackSetRequest describeStackSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the description of the specified stack set operation.
     * </p>
     * 
     * @param describeStackSetOperationRequest
     * @return describeStackSetOperationResult The response from the
     *         DescribeStackSetOperation service method, as returned by AWS
     *         CloudFormation.
     * @throws StackSetNotFoundException
     * @throws OperationNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeStackSetOperationResult describeStackSetOperation(
            DescribeStackSetOperationRequest describeStackSetOperationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the description for the specified stack; if no stack name was
     * specified, then it returns the description for all the stacks created.
     * </p>
     * <note>
     * <p>
     * If the stack does not exist, an
     * <code>AmazonCloudFormationException</code> is returned.
     * </p>
     * </note>
     * 
     * @param describeStacksRequest <p>
     *            The input for <a>DescribeStacks</a> action.
     *            </p>
     * @return describeStacksResult The response from the DescribeStacks service
     *         method, as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeStacksResult describeStacks(DescribeStacksRequest describeStacksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns detailed information about a type that has been registered.
     * </p>
     * <p>
     * If you specify a <code>VersionId</code>, <code>DescribeType</code>
     * returns information about that specific type version. Otherwise, it
     * returns information about the default type version.
     * </p>
     * 
     * @param describeTypeRequest
     * @return describeTypeResult The response from the DescribeType service
     *         method, as returned by AWS CloudFormation.
     * @throws CFNRegistryException
     * @throws TypeNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeTypeResult describeType(DescribeTypeRequest describeTypeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a type's registration, including its current
     * status and type and version identifiers.
     * </p>
     * <p>
     * When you initiate a registration request using
     * <code> <a>RegisterType</a> </code>, you can then use
     * <code> <a>DescribeTypeRegistration</a> </code> to monitor the progress of
     * that registration request.
     * </p>
     * <p>
     * Once the registration request has completed, use
     * <code> <a>DescribeType</a> </code> to return detailed informaiton about a
     * type.
     * </p>
     * 
     * @param describeTypeRegistrationRequest
     * @return describeTypeRegistrationResult The response from the
     *         DescribeTypeRegistration service method, as returned by AWS
     *         CloudFormation.
     * @throws CFNRegistryException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeTypeRegistrationResult describeTypeRegistration(
            DescribeTypeRegistrationRequest describeTypeRegistrationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Detects whether a stack's actual configuration differs, or has
     * <i>drifted</i>, from it's expected configuration, as defined in the stack
     * template and any values specified as template parameters. For each
     * resource in the stack that supports drift detection, AWS CloudFormation
     * compares the actual configuration of the resource with its expected
     * template configuration. Only resource properties explicitly defined in
     * the stack template are checked for drift. A stack is considered to have
     * drifted if one or more of its resources differ from their expected
     * template configurations. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * <p>
     * Use <code>DetectStackDrift</code> to detect drift on all supported
     * resources for a given stack, or <a>DetectStackResourceDrift</a> to detect
     * drift on individual resources.
     * </p>
     * <p>
     * For a list of stack resources that currently support drift detection, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * <p>
     * <code>DetectStackDrift</code> can take up to several minutes, depending
     * on the number of resources contained within the stack. Use
     * <a>DescribeStackDriftDetectionStatus</a> to monitor the progress of a
     * detect stack drift operation. Once the drift detection operation has
     * completed, use <a>DescribeStackResourceDrifts</a> to return drift
     * information about the stack and its resources.
     * </p>
     * <p>
     * When detecting drift on a stack, AWS CloudFormation does not detect drift
     * on any nested stacks belonging to that stack. Perform
     * <code>DetectStackDrift</code> directly on the nested stack itself.
     * </p>
     * 
     * @param detectStackDriftRequest
     * @return detectStackDriftResult The response from the DetectStackDrift
     *         service method, as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DetectStackDriftResult detectStackDrift(DetectStackDriftRequest detectStackDriftRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about whether a resource's actual configuration
     * differs, or has <i>drifted</i>, from it's expected configuration, as
     * defined in the stack template and any values specified as template
     * parameters. This information includes actual and expected property values
     * for resources in which AWS CloudFormation detects drift. Only resource
     * properties explicitly defined in the stack template are checked for
     * drift. For more information about stack and resource drift, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * <p>
     * Use <code>DetectStackResourceDrift</code> to detect drift on individual
     * resources, or <a>DetectStackDrift</a> to detect drift on all resources in
     * a given stack that support drift detection.
     * </p>
     * <p>
     * Resources that do not currently support drift detection cannot be
     * checked. For a list of resources that support drift detection, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * 
     * @param detectStackResourceDriftRequest
     * @return detectStackResourceDriftResult The response from the
     *         DetectStackResourceDrift service method, as returned by AWS
     *         CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DetectStackResourceDriftResult detectStackResourceDrift(
            DetectStackResourceDriftRequest detectStackResourceDriftRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Detect drift on a stack set. When CloudFormation performs drift detection
     * on a stack set, it performs drift detection on the stack associated with
     * each stack instance in the stack set. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html"
     * >How CloudFormation Performs Drift Detection on a Stack Set</a>.
     * </p>
     * <p>
     * <code>DetectStackSetDrift</code> returns the <code>OperationId</code> of
     * the stack set drift detection operation. Use this operation id with
     * <code> <a>DescribeStackSetOperation</a> </code> to monitor the progress
     * of the drift detection operation. The drift detection operation may take
     * some time, depending on the number of stack instances included in the
     * stack set, as well as the number of resources included in each stack.
     * </p>
     * <p>
     * Once the operation has completed, use the following actions to return
     * drift information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code> <a>DescribeStackSet</a> </code> to return detailed informaiton
     * about the stack set, including detailed information about the last
     * <i>completed</i> drift operation performed on the stack set. (Information
     * about drift operations that are in progress is not included.)
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code> <a>ListStackInstances</a> </code> to return a list of stack
     * instances belonging to the stack set, including the drift status and last
     * drift time checked of each instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code> <a>DescribeStackInstance</a> </code> to return detailed
     * information about a specific stack instance, including its drift status
     * and last drift time checked.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on performing a drift detection operation on a stack
     * set, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html"
     * >Detecting Unmanaged Changes in Stack Sets</a>.
     * </p>
     * <p>
     * You can only run a single drift detection operation on a given stack set
     * at one time.
     * </p>
     * <p>
     * To stop a drift detection stack set operation, use
     * <code> <a>StopStackSetOperation</a> </code>.
     * </p>
     * 
     * @param detectStackSetDriftRequest
     * @return detectStackSetDriftResult The response from the
     *         DetectStackSetDrift service method, as returned by AWS
     *         CloudFormation.
     * @throws InvalidOperationException
     * @throws OperationInProgressException
     * @throws StackSetNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DetectStackSetDriftResult detectStackSetDrift(
            DetectStackSetDriftRequest detectStackSetDriftRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the estimated monthly cost of a template. The return value is an
     * AWS Simple Monthly Calculator URL with a query string that describes the
     * resources required to run the template.
     * </p>
     * 
     * @param estimateTemplateCostRequest <p>
     *            The input for an <a>EstimateTemplateCost</a> action.
     *            </p>
     * @return estimateTemplateCostResult The response from the
     *         EstimateTemplateCost service method, as returned by AWS
     *         CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    EstimateTemplateCostResult estimateTemplateCost(
            EstimateTemplateCostRequest estimateTemplateCostRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates a stack using the input information that was provided when the
     * specified change set was created. After the call successfully completes,
     * AWS CloudFormation starts updating the stack. Use the
     * <a>DescribeStacks</a> action to view the status of the update.
     * </p>
     * <p>
     * When you execute a change set, AWS CloudFormation deletes all other
     * change sets associated with the stack because they aren't valid for the
     * updated stack.
     * </p>
     * <p>
     * If a stack policy is associated with the stack, AWS CloudFormation
     * enforces the policy during the update. You can't specify a temporary
     * stack policy that overrides the current policy.
     * </p>
     * 
     * @param executeChangeSetRequest <p>
     *            The input for the <a>ExecuteChangeSet</a> action.
     *            </p>
     * @return executeChangeSetResult The response from the ExecuteChangeSet
     *         service method, as returned by AWS CloudFormation.
     * @throws InvalidChangeSetStatusException
     * @throws ChangeSetNotFoundException
     * @throws InsufficientCapabilitiesException
     * @throws TokenAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ExecuteChangeSetResult executeChangeSet(ExecuteChangeSetRequest executeChangeSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the stack policy for a specified stack. If a stack doesn't have a
     * policy, a null value is returned.
     * </p>
     * 
     * @param getStackPolicyRequest <p>
     *            The input for the <a>GetStackPolicy</a> action.
     *            </p>
     * @return getStackPolicyResult The response from the GetStackPolicy service
     *         method, as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetStackPolicyResult getStackPolicy(GetStackPolicyRequest getStackPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the template body for a specified stack. You can get the template
     * for running or deleted stacks.
     * </p>
     * <p>
     * For deleted stacks, GetTemplate returns the template for up to 90 days
     * after the stack has been deleted.
     * </p>
     * <note>
     * <p>
     * If the template does not exist, a <code>ValidationError</code> is
     * returned.
     * </p>
     * </note>
     * 
     * @param getTemplateRequest <p>
     *            The input for a <a>GetTemplate</a> action.
     *            </p>
     * @return getTemplateResult The response from the GetTemplate service
     *         method, as returned by AWS CloudFormation.
     * @throws ChangeSetNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetTemplateResult getTemplate(GetTemplateRequest getTemplateRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a new or existing template. The
     * <code>GetTemplateSummary</code> action is useful for viewing parameter
     * information, such as default parameter values and parameter types, before
     * you create or update a stack or stack set.
     * </p>
     * <p>
     * You can use the <code>GetTemplateSummary</code> action when you submit a
     * template, or you can get template information for a stack set, or a
     * running or deleted stack.
     * </p>
     * <p>
     * For deleted stacks, <code>GetTemplateSummary</code> returns the template
     * information for up to 90 days after the stack has been deleted. If the
     * template does not exist, a <code>ValidationError</code> is returned.
     * </p>
     * 
     * @param getTemplateSummaryRequest <p>
     *            The input for the <a>GetTemplateSummary</a> action.
     *            </p>
     * @return getTemplateSummaryResult The response from the GetTemplateSummary
     *         service method, as returned by AWS CloudFormation.
     * @throws StackSetNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetTemplateSummaryResult getTemplateSummary(GetTemplateSummaryRequest getTemplateSummaryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the ID and status of each active change set for a stack. For
     * example, AWS CloudFormation lists change sets that are in the
     * <code>CREATE_IN_PROGRESS</code> or <code>CREATE_PENDING</code> state.
     * </p>
     * 
     * @param listChangeSetsRequest <p>
     *            The input for the <a>ListChangeSets</a> action.
     *            </p>
     * @return listChangeSetsResult The response from the ListChangeSets service
     *         method, as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListChangeSetsResult listChangeSets(ListChangeSetsRequest listChangeSetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all exported output values in the account and Region in which you
     * call this action. Use this action to see the exported output values that
     * you can import into other stacks. To import values, use the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-importvalue.html"
     * > <code>Fn::ImportValue</code> </a> function.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-exports.html"
     * > AWS CloudFormation Export Stack Output Values</a>.
     * </p>
     * 
     * @param listExportsRequest
     * @return listExportsResult The response from the ListExports service
     *         method, as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListExportsResult listExports(ListExportsRequest listExportsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all stacks that are importing an exported output value. To modify
     * or remove an exported output value, first use this action to see which
     * stacks are using it. To see the exported output values in your account,
     * see <a>ListExports</a>.
     * </p>
     * <p>
     * For more information about importing an exported output value, see the <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-importvalue.html"
     * > <code>Fn::ImportValue</code> </a> function.
     * </p>
     * 
     * @param listImportsRequest
     * @return listImportsResult The response from the ListImports service
     *         method, as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListImportsResult listImports(ListImportsRequest listImportsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns summary information about stack instances that are associated
     * with the specified stack set. You can filter for stack instances that are
     * associated with a specific AWS account name or Region, or that have a
     * specific status.
     * </p>
     * 
     * @param listStackInstancesRequest
     * @return listStackInstancesResult The response from the ListStackInstances
     *         service method, as returned by AWS CloudFormation.
     * @throws StackSetNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListStackInstancesResult listStackInstances(ListStackInstancesRequest listStackInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns descriptions of all resources of the specified stack.
     * </p>
     * <p>
     * For deleted stacks, ListStackResources returns resource information for
     * up to 90 days after the stack has been deleted.
     * </p>
     * 
     * @param listStackResourcesRequest <p>
     *            The input for the <a>ListStackResource</a> action.
     *            </p>
     * @return listStackResourcesResult The response from the ListStackResources
     *         service method, as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListStackResourcesResult listStackResources(ListStackResourcesRequest listStackResourcesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns summary information about the results of a stack set operation.
     * </p>
     * 
     * @param listStackSetOperationResultsRequest
     * @return listStackSetOperationResultsResult The response from the
     *         ListStackSetOperationResults service method, as returned by AWS
     *         CloudFormation.
     * @throws StackSetNotFoundException
     * @throws OperationNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListStackSetOperationResultsResult listStackSetOperationResults(
            ListStackSetOperationResultsRequest listStackSetOperationResultsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns summary information about operations performed on a stack set.
     * </p>
     * 
     * @param listStackSetOperationsRequest
     * @return listStackSetOperationsResult The response from the
     *         ListStackSetOperations service method, as returned by AWS
     *         CloudFormation.
     * @throws StackSetNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListStackSetOperationsResult listStackSetOperations(
            ListStackSetOperationsRequest listStackSetOperationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns summary information about stack sets that are associated with the
     * user.
     * </p>
     * 
     * @param listStackSetsRequest
     * @return listStackSetsResult The response from the ListStackSets service
     *         method, as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListStackSetsResult listStackSets(ListStackSetsRequest listStackSetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the summary information for stacks whose status matches the
     * specified StackStatusFilter. Summary information for stacks that have
     * been deleted is kept for 90 days after the stack is deleted. If no
     * StackStatusFilter is specified, summary information for all stacks is
     * returned (including existing stacks and stacks that have been deleted).
     * </p>
     * 
     * @param listStacksRequest <p>
     *            The input for <a>ListStacks</a> action.
     *            </p>
     * @return listStacksResult The response from the ListStacks service method,
     *         as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListStacksResult listStacks(ListStacksRequest listStacksRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a list of registration tokens for the specified type(s).
     * </p>
     * 
     * @param listTypeRegistrationsRequest
     * @return listTypeRegistrationsResult The response from the
     *         ListTypeRegistrations service method, as returned by AWS
     *         CloudFormation.
     * @throws CFNRegistryException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListTypeRegistrationsResult listTypeRegistrations(
            ListTypeRegistrationsRequest listTypeRegistrationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns summary information about the versions of a type.
     * </p>
     * 
     * @param listTypeVersionsRequest
     * @return listTypeVersionsResult The response from the ListTypeVersions
     *         service method, as returned by AWS CloudFormation.
     * @throws CFNRegistryException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListTypeVersionsResult listTypeVersions(ListTypeVersionsRequest listTypeVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns summary information about types that have been registered with
     * CloudFormation.
     * </p>
     * 
     * @param listTypesRequest
     * @return listTypesResult The response from the ListTypes service method,
     *         as returned by AWS CloudFormation.
     * @throws CFNRegistryException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListTypesResult listTypes(ListTypesRequest listTypesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Reports progress of a resource handler to CloudFormation.
     * </p>
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>. Do not use this API in your code.
     * </p>
     * 
     * @param recordHandlerProgressRequest
     * @return recordHandlerProgressResult The response from the
     *         RecordHandlerProgress service method, as returned by AWS
     *         CloudFormation.
     * @throws InvalidStateTransitionException
     * @throws OperationStatusCheckFailedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    RecordHandlerProgressResult recordHandlerProgress(
            RecordHandlerProgressRequest recordHandlerProgressRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Registers a type with the CloudFormation service. Registering a type
     * makes it available for use in CloudFormation templates in your AWS
     * account, and includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Validating the resource schema
     * </p>
     * </li>
     * <li>
     * <p>
     * Determining which handlers have been specified for the resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Making the resource type available for use in your account
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on how to develop types and ready them for
     * registeration, see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-types.html"
     * >Creating Resource Providers</a> in the <i>CloudFormation CLI User
     * Guide</i>.
     * </p>
     * <p>
     * You can have a maximum of 50 resource type versions registered at a time.
     * This maximum is per account and per region. Use <a
     * href="AWSCloudFormation/latest/APIReference/API_DeregisterType.html"
     * >DeregisterType</a> to deregister specific resource type versions if
     * necessary.
     * </p>
     * <p>
     * Once you have initiated a registration request using
     * <code> <a>RegisterType</a> </code>, you can use
     * <code> <a>DescribeTypeRegistration</a> </code> to monitor the progress of
     * the registration request.
     * </p>
     * 
     * @param registerTypeRequest
     * @return registerTypeResult The response from the RegisterType service
     *         method, as returned by AWS CloudFormation.
     * @throws CFNRegistryException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    RegisterTypeResult registerType(RegisterTypeRequest registerTypeRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sets a stack policy for a specified stack.
     * </p>
     * 
     * @param setStackPolicyRequest <p>
     *            The input for the <a>SetStackPolicy</a> action.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void setStackPolicy(SetStackPolicyRequest setStackPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Specify the default version of a type. The default version of a type will
     * be used in CloudFormation operations.
     * </p>
     * 
     * @param setTypeDefaultVersionRequest
     * @return setTypeDefaultVersionResult The response from the
     *         SetTypeDefaultVersion service method, as returned by AWS
     *         CloudFormation.
     * @throws CFNRegistryException
     * @throws TypeNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    SetTypeDefaultVersionResult setTypeDefaultVersion(
            SetTypeDefaultVersionRequest setTypeDefaultVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Sends a signal to the specified resource with a success or failure
     * status. You can use the SignalResource API in conjunction with a creation
     * policy or update policy. AWS CloudFormation doesn't proceed with a stack
     * creation or update until resources receive the required number of signals
     * or the timeout period is exceeded. The SignalResource API is useful in
     * cases where you want to send signals from anywhere other than an Amazon
     * EC2 instance.
     * </p>
     * 
     * @param signalResourceRequest <p>
     *            The input for the <a>SignalResource</a> action.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void signalResource(SignalResourceRequest signalResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Stops an in-progress operation on a stack set and its associated stack
     * instances.
     * </p>
     * 
     * @param stopStackSetOperationRequest
     * @return stopStackSetOperationResult The response from the
     *         StopStackSetOperation service method, as returned by AWS
     *         CloudFormation.
     * @throws StackSetNotFoundException
     * @throws OperationNotFoundException
     * @throws InvalidOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    StopStackSetOperationResult stopStackSetOperation(
            StopStackSetOperationRequest stopStackSetOperationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a stack as specified in the template. After the call completes
     * successfully, the stack update starts. You can check the status of the
     * stack via the <a>DescribeStacks</a> action.
     * </p>
     * <p>
     * To get a copy of the template for an existing stack, you can use the
     * <a>GetTemplate</a> action.
     * </p>
     * <p>
     * For more information about creating an update template, updating a stack,
     * and monitoring the progress of the update, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html"
     * >Updating a Stack</a>.
     * </p>
     * 
     * @param updateStackRequest <p>
     *            The input for an <a>UpdateStack</a> action.
     *            </p>
     * @return updateStackResult The response from the UpdateStack service
     *         method, as returned by AWS CloudFormation.
     * @throws InsufficientCapabilitiesException
     * @throws TokenAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateStackResult updateStack(UpdateStackRequest updateStackRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the parameter values for stack instances for the specified
     * accounts, within the specified Regions. A stack instance refers to a
     * stack in a specific account and Region.
     * </p>
     * <p>
     * You can only update stack instances in Regions and accounts where they
     * already exist; to create additional stack instances, use <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CreateStackInstances.html"
     * >CreateStackInstances</a>.
     * </p>
     * <p>
     * During stack set updates, any parameters overridden for a stack instance
     * are not updated, but retain their overridden value.
     * </p>
     * <p>
     * You can only update the parameter <i>values</i> that are specified in the
     * stack set; to add or delete a parameter itself, use <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     * >UpdateStackSet</a> to update the stack set template. If you add a
     * parameter to a template, before you can override the parameter value
     * specified in the stack set you must first use <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     * >UpdateStackSet</a> to update all stack instances with the updated
     * template and parameter value specified in the stack set. Once a stack
     * instance has been updated with the new parameter, you can then override
     * the parameter value using <code>UpdateStackInstances</code>.
     * </p>
     * 
     * @param updateStackInstancesRequest
     * @return updateStackInstancesResult The response from the
     *         UpdateStackInstances service method, as returned by AWS
     *         CloudFormation.
     * @throws StackSetNotFoundException
     * @throws StackInstanceNotFoundException
     * @throws OperationInProgressException
     * @throws OperationIdAlreadyExistsException
     * @throws StaleRequestException
     * @throws InvalidOperationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateStackInstancesResult updateStackInstances(
            UpdateStackInstancesRequest updateStackInstancesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates the stack set, and associated stack instances in the specified
     * accounts and Regions.
     * </p>
     * <p>
     * Even if the stack set operation created by updating the stack set fails
     * (completely or partially, below or above a specified failure tolerance),
     * the stack set is updated with your changes. Subsequent
     * <a>CreateStackInstances</a> calls on the specified stack set use the
     * updated stack set.
     * </p>
     * 
     * @param updateStackSetRequest
     * @return updateStackSetResult The response from the UpdateStackSet service
     *         method, as returned by AWS CloudFormation.
     * @throws StackSetNotFoundException
     * @throws OperationInProgressException
     * @throws OperationIdAlreadyExistsException
     * @throws StaleRequestException
     * @throws InvalidOperationException
     * @throws StackInstanceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateStackSetResult updateStackSet(UpdateStackSetRequest updateStackSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates termination protection for the specified stack. If a user
     * attempts to delete a stack with termination protection enabled, the
     * operation fails and the stack remains unchanged. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     * >Protecting a Stack From Being Deleted</a> in the <i>AWS CloudFormation
     * User Guide</i>.
     * </p>
     * <p>
     * For <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >nested stacks</a>, termination protection is set on the root stack and
     * cannot be changed directly on the nested stack.
     * </p>
     * 
     * @param updateTerminationProtectionRequest
     * @return updateTerminationProtectionResult The response from the
     *         UpdateTerminationProtection service method, as returned by AWS
     *         CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateTerminationProtectionResult updateTerminationProtection(
            UpdateTerminationProtectionRequest updateTerminationProtectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Validates a specified template. AWS CloudFormation first checks if the
     * template is valid JSON. If it isn't, AWS CloudFormation checks if the
     * template is valid YAML. If both these checks fail, AWS CloudFormation
     * returns a template validation error.
     * </p>
     * 
     * @param validateTemplateRequest <p>
     *            The input for <a>ValidateTemplate</a> action.
     *            </p>
     * @return validateTemplateResult The response from the ValidateTemplate
     *         service method, as returned by AWS CloudFormation.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             CloudFormation indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ValidateTemplateResult validateTemplate(ValidateTemplateRequest validateTemplateRequest)
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
