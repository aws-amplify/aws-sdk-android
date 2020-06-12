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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts a new task using the specified task definition.
 * </p>
 * <p>
 * You can allow Amazon ECS to place tasks for you, or you can customize how
 * Amazon ECS places tasks using placement constraints and placement strategies.
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/scheduling_tasks.html"
 * >Scheduling Tasks</a> in the <i>Amazon Elastic Container Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * Alternatively, you can use <a>StartTask</a> to use your own scheduler or
 * place tasks manually on specific container instances.
 * </p>
 * <p>
 * The Amazon ECS API follows an eventual consistency model, due to the
 * distributed nature of the system supporting the API. This means that the
 * result of an API command you run that affects your Amazon ECS resources might
 * not be immediately visible to all subsequent commands you run. Keep this in
 * mind when you carry out an API command that immediately follows a previous
 * API command.
 * </p>
 * <p>
 * To manage eventual consistency, you can do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Confirm the state of the resource before you run a command to modify it. Run
 * the DescribeTasks command using an exponential backoff algorithm to ensure
 * that you allow enough time for the previous command to propagate through the
 * system. To do this, run the DescribeTasks command repeatedly, starting with a
 * couple of seconds of wait time and increasing gradually up to five minutes of
 * wait time.
 * </p>
 * </li>
 * <li>
 * <p>
 * Add wait time between subsequent commands, even if the DescribeTasks command
 * returns an accurate response. Apply an exponential backoff algorithm starting
 * with a couple of seconds of wait time, and increase gradually up to about
 * five minutes of wait time.
 * </p>
 * </li>
 * </ul>
 */
public class RunTaskRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The capacity provider strategy to use for the task.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers
     * along with the <code>base</code> and <code>weight</code> to assign to
     * them. A capacity provider must be associated with the cluster to be used
     * in a capacity provider strategy. The <a>PutClusterCapacityProviders</a>
     * API is used to associate a capacity provider with a cluster. Only
     * capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code>
     * status can be used.
     * </p>
     * <p>
     * If a <code>capacityProviderStrategy</code> is specified, the
     * <code>launchType</code> parameter must be omitted. If no
     * <code>capacityProviderStrategy</code> or <code>launchType</code> is
     * specified, the <code>defaultCapacityProviderStrategy</code> for the
     * cluster is used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     */
    private java.util.List<CapacityProviderStrategyItem> capacityProviderStrategy;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which
     * to run your task. If you do not specify a cluster, the default cluster is
     * assumed.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The number of instantiations of the specified task to place on your
     * cluster. You can specify up to 10 tasks per call.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the task. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     * >Tagging Your Amazon ECS Resources</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     */
    private Boolean enableECSManagedTags;

    /**
     * <p>
     * The name of the task group to associate with the task. The default value
     * is the family name of the task definition (for example,
     * family:my-family-name).
     * </p>
     */
    private String group;

    /**
     * <p>
     * The launch type on which to run your task. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>launchType</code> is specified, the
     * <code>capacityProviderStrategy</code> parameter must be omitted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     */
    private String launchType;

    /**
     * <p>
     * The network configuration for the task. This parameter is required for
     * task definitions that use the <code>awsvpc</code> network mode to receive
     * their own elastic network interface, and it is not supported for other
     * network modes. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     * >Task Networking</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;

    /**
     * <p>
     * A list of container overrides in JSON format that specify the name of a
     * container in the specified task definition and the overrides it should
     * receive. You can override the default command for a container (that is
     * specified in the task definition or Docker image) with a
     * <code>command</code> override. You can also override existing environment
     * variables (that are specified in the task definition or Docker image) on
     * a container or add new environment variables to it with an
     * <code>environment</code> override.
     * </p>
     * <note>
     * <p>
     * A total of 8192 characters are allowed for overrides. This limit includes
     * the JSON formatting characters of the override structure.
     * </p>
     * </note>
     */
    private TaskOverride overrides;

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can
     * specify up to 10 constraints per task (including constraints in the task
     * definition and those specified at runtime).
     * </p>
     */
    private java.util.List<PlacementConstraint> placementConstraints;

    /**
     * <p>
     * The placement strategy objects to use for the task. You can specify a
     * maximum of five strategy rules per task.
     * </p>
     */
    private java.util.List<PlacementStrategy> placementStrategy;

    /**
     * <p>
     * The platform version the task should run. A platform version is only
     * specified for tasks using the Fargate launch type. If one is not
     * specified, the <code>LATEST</code> platform version is used by default.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     */
    private String platformVersion;

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition to the
     * task. If no value is specified, the tags are not propagated. Tags can
     * only be propagated to the task during task creation. To add tags to a
     * task after task creation, use the <a>TagResource</a> API action.
     * </p>
     * <note>
     * <p>
     * An error will be received if you specify the <code>SERVICE</code> option
     * when running a task.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     */
    private String propagateTags;

    /**
     * <p>
     * The reference ID to use for the task.
     * </p>
     */
    private String referenceId;

    /**
     * <p>
     * An optional tag specified when a task is started. For example, if you
     * automatically trigger a task to run a batch process job, you could apply
     * a unique identifier for that job to your task with the
     * <code>startedBy</code> parameter. You can then identify which tasks
     * belong to that job by filtering the results of a <a>ListTasks</a> call
     * with the <code>startedBy</code> value. Up to 36 letters (uppercase and
     * lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     * <p>
     * If a task is started by an Amazon ECS service, then the
     * <code>startedBy</code> parameter contains the deployment ID of the
     * service that starts it.
     * </p>
     */
    private String startedBy;

    /**
     * <p>
     * The metadata that you apply to the task to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) or full ARN of the task definition to run.
     * If a <code>revision</code> is not specified, the latest
     * <code>ACTIVE</code> revision is used.
     * </p>
     */
    private String taskDefinition;

    /**
     * <p>
     * The capacity provider strategy to use for the task.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers
     * along with the <code>base</code> and <code>weight</code> to assign to
     * them. A capacity provider must be associated with the cluster to be used
     * in a capacity provider strategy. The <a>PutClusterCapacityProviders</a>
     * API is used to associate a capacity provider with a cluster. Only
     * capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code>
     * status can be used.
     * </p>
     * <p>
     * If a <code>capacityProviderStrategy</code> is specified, the
     * <code>launchType</code> parameter must be omitted. If no
     * <code>capacityProviderStrategy</code> or <code>launchType</code> is
     * specified, the <code>defaultCapacityProviderStrategy</code> for the
     * cluster is used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     *
     * @return <p>
     *         The capacity provider strategy to use for the task.
     *         </p>
     *         <p>
     *         A capacity provider strategy consists of one or more capacity
     *         providers along with the <code>base</code> and
     *         <code>weight</code> to assign to them. A capacity provider must
     *         be associated with the cluster to be used in a capacity provider
     *         strategy. The <a>PutClusterCapacityProviders</a> API is used to
     *         associate a capacity provider with a cluster. Only capacity
     *         providers with an <code>ACTIVE</code> or <code>UPDATING</code>
     *         status can be used.
     *         </p>
     *         <p>
     *         If a <code>capacityProviderStrategy</code> is specified, the
     *         <code>launchType</code> parameter must be omitted. If no
     *         <code>capacityProviderStrategy</code> or <code>launchType</code>
     *         is specified, the <code>defaultCapacityProviderStrategy</code>
     *         for the cluster is used.
     *         </p>
     *         <p>
     *         If specifying a capacity provider that uses an Auto Scaling
     *         group, the capacity provider must already be created. New
     *         capacity providers can be created with the
     *         <a>CreateCapacityProvider</a> API operation.
     *         </p>
     *         <p>
     *         To use a AWS Fargate capacity provider, specify either the
     *         <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *         providers. The AWS Fargate capacity providers are available to
     *         all accounts and only need to be associated with a cluster to be
     *         used.
     *         </p>
     *         <p>
     *         The <a>PutClusterCapacityProviders</a> API operation is used to
     *         update the list of available capacity providers for a cluster
     *         after the cluster is created.
     *         </p>
     */
    public java.util.List<CapacityProviderStrategyItem> getCapacityProviderStrategy() {
        return capacityProviderStrategy;
    }

    /**
     * <p>
     * The capacity provider strategy to use for the task.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers
     * along with the <code>base</code> and <code>weight</code> to assign to
     * them. A capacity provider must be associated with the cluster to be used
     * in a capacity provider strategy. The <a>PutClusterCapacityProviders</a>
     * API is used to associate a capacity provider with a cluster. Only
     * capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code>
     * status can be used.
     * </p>
     * <p>
     * If a <code>capacityProviderStrategy</code> is specified, the
     * <code>launchType</code> parameter must be omitted. If no
     * <code>capacityProviderStrategy</code> or <code>launchType</code> is
     * specified, the <code>defaultCapacityProviderStrategy</code> for the
     * cluster is used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     *
     * @param capacityProviderStrategy <p>
     *            The capacity provider strategy to use for the task.
     *            </p>
     *            <p>
     *            A capacity provider strategy consists of one or more capacity
     *            providers along with the <code>base</code> and
     *            <code>weight</code> to assign to them. A capacity provider
     *            must be associated with the cluster to be used in a capacity
     *            provider strategy. The <a>PutClusterCapacityProviders</a> API
     *            is used to associate a capacity provider with a cluster. Only
     *            capacity providers with an <code>ACTIVE</code> or
     *            <code>UPDATING</code> status can be used.
     *            </p>
     *            <p>
     *            If a <code>capacityProviderStrategy</code> is specified, the
     *            <code>launchType</code> parameter must be omitted. If no
     *            <code>capacityProviderStrategy</code> or
     *            <code>launchType</code> is specified, the
     *            <code>defaultCapacityProviderStrategy</code> for the cluster
     *            is used.
     *            </p>
     *            <p>
     *            If specifying a capacity provider that uses an Auto Scaling
     *            group, the capacity provider must already be created. New
     *            capacity providers can be created with the
     *            <a>CreateCapacityProvider</a> API operation.
     *            </p>
     *            <p>
     *            To use a AWS Fargate capacity provider, specify either the
     *            <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *            providers. The AWS Fargate capacity providers are available to
     *            all accounts and only need to be associated with a cluster to
     *            be used.
     *            </p>
     *            <p>
     *            The <a>PutClusterCapacityProviders</a> API operation is used
     *            to update the list of available capacity providers for a
     *            cluster after the cluster is created.
     *            </p>
     */
    public void setCapacityProviderStrategy(
            java.util.Collection<CapacityProviderStrategyItem> capacityProviderStrategy) {
        if (capacityProviderStrategy == null) {
            this.capacityProviderStrategy = null;
            return;
        }

        this.capacityProviderStrategy = new java.util.ArrayList<CapacityProviderStrategyItem>(
                capacityProviderStrategy);
    }

    /**
     * <p>
     * The capacity provider strategy to use for the task.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers
     * along with the <code>base</code> and <code>weight</code> to assign to
     * them. A capacity provider must be associated with the cluster to be used
     * in a capacity provider strategy. The <a>PutClusterCapacityProviders</a>
     * API is used to associate a capacity provider with a cluster. Only
     * capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code>
     * status can be used.
     * </p>
     * <p>
     * If a <code>capacityProviderStrategy</code> is specified, the
     * <code>launchType</code> parameter must be omitted. If no
     * <code>capacityProviderStrategy</code> or <code>launchType</code> is
     * specified, the <code>defaultCapacityProviderStrategy</code> for the
     * cluster is used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviderStrategy <p>
     *            The capacity provider strategy to use for the task.
     *            </p>
     *            <p>
     *            A capacity provider strategy consists of one or more capacity
     *            providers along with the <code>base</code> and
     *            <code>weight</code> to assign to them. A capacity provider
     *            must be associated with the cluster to be used in a capacity
     *            provider strategy. The <a>PutClusterCapacityProviders</a> API
     *            is used to associate a capacity provider with a cluster. Only
     *            capacity providers with an <code>ACTIVE</code> or
     *            <code>UPDATING</code> status can be used.
     *            </p>
     *            <p>
     *            If a <code>capacityProviderStrategy</code> is specified, the
     *            <code>launchType</code> parameter must be omitted. If no
     *            <code>capacityProviderStrategy</code> or
     *            <code>launchType</code> is specified, the
     *            <code>defaultCapacityProviderStrategy</code> for the cluster
     *            is used.
     *            </p>
     *            <p>
     *            If specifying a capacity provider that uses an Auto Scaling
     *            group, the capacity provider must already be created. New
     *            capacity providers can be created with the
     *            <a>CreateCapacityProvider</a> API operation.
     *            </p>
     *            <p>
     *            To use a AWS Fargate capacity provider, specify either the
     *            <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *            providers. The AWS Fargate capacity providers are available to
     *            all accounts and only need to be associated with a cluster to
     *            be used.
     *            </p>
     *            <p>
     *            The <a>PutClusterCapacityProviders</a> API operation is used
     *            to update the list of available capacity providers for a
     *            cluster after the cluster is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskRequest withCapacityProviderStrategy(
            CapacityProviderStrategyItem... capacityProviderStrategy) {
        if (getCapacityProviderStrategy() == null) {
            this.capacityProviderStrategy = new java.util.ArrayList<CapacityProviderStrategyItem>(
                    capacityProviderStrategy.length);
        }
        for (CapacityProviderStrategyItem value : capacityProviderStrategy) {
            this.capacityProviderStrategy.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy to use for the task.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers
     * along with the <code>base</code> and <code>weight</code> to assign to
     * them. A capacity provider must be associated with the cluster to be used
     * in a capacity provider strategy. The <a>PutClusterCapacityProviders</a>
     * API is used to associate a capacity provider with a cluster. Only
     * capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code>
     * status can be used.
     * </p>
     * <p>
     * If a <code>capacityProviderStrategy</code> is specified, the
     * <code>launchType</code> parameter must be omitted. If no
     * <code>capacityProviderStrategy</code> or <code>launchType</code> is
     * specified, the <code>defaultCapacityProviderStrategy</code> for the
     * cluster is used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviderStrategy <p>
     *            The capacity provider strategy to use for the task.
     *            </p>
     *            <p>
     *            A capacity provider strategy consists of one or more capacity
     *            providers along with the <code>base</code> and
     *            <code>weight</code> to assign to them. A capacity provider
     *            must be associated with the cluster to be used in a capacity
     *            provider strategy. The <a>PutClusterCapacityProviders</a> API
     *            is used to associate a capacity provider with a cluster. Only
     *            capacity providers with an <code>ACTIVE</code> or
     *            <code>UPDATING</code> status can be used.
     *            </p>
     *            <p>
     *            If a <code>capacityProviderStrategy</code> is specified, the
     *            <code>launchType</code> parameter must be omitted. If no
     *            <code>capacityProviderStrategy</code> or
     *            <code>launchType</code> is specified, the
     *            <code>defaultCapacityProviderStrategy</code> for the cluster
     *            is used.
     *            </p>
     *            <p>
     *            If specifying a capacity provider that uses an Auto Scaling
     *            group, the capacity provider must already be created. New
     *            capacity providers can be created with the
     *            <a>CreateCapacityProvider</a> API operation.
     *            </p>
     *            <p>
     *            To use a AWS Fargate capacity provider, specify either the
     *            <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *            providers. The AWS Fargate capacity providers are available to
     *            all accounts and only need to be associated with a cluster to
     *            be used.
     *            </p>
     *            <p>
     *            The <a>PutClusterCapacityProviders</a> API operation is used
     *            to update the list of available capacity providers for a
     *            cluster after the cluster is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskRequest withCapacityProviderStrategy(
            java.util.Collection<CapacityProviderStrategyItem> capacityProviderStrategy) {
        setCapacityProviderStrategy(capacityProviderStrategy);
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which
     * to run your task. If you do not specify a cluster, the default cluster is
     * assumed.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         on which to run your task. If you do not specify a cluster, the
     *         default cluster is assumed.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which
     * to run your task. If you do not specify a cluster, the default cluster is
     * assumed.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster on which to run your task. If you do not specify a
     *            cluster, the default cluster is assumed.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which
     * to run your task. If you do not specify a cluster, the default cluster is
     * assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster on which to run your task. If you do not specify a
     *            cluster, the default cluster is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The number of instantiations of the specified task to place on your
     * cluster. You can specify up to 10 tasks per call.
     * </p>
     *
     * @return <p>
     *         The number of instantiations of the specified task to place on
     *         your cluster. You can specify up to 10 tasks per call.
     *         </p>
     */
    public Integer getCount() {
        return count;
    }

    /**
     * <p>
     * The number of instantiations of the specified task to place on your
     * cluster. You can specify up to 10 tasks per call.
     * </p>
     *
     * @param count <p>
     *            The number of instantiations of the specified task to place on
     *            your cluster. You can specify up to 10 tasks per call.
     *            </p>
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of instantiations of the specified task to place on your
     * cluster. You can specify up to 10 tasks per call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The number of instantiations of the specified task to place on
     *            your cluster. You can specify up to 10 tasks per call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskRequest withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the task. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     * >Tagging Your Amazon ECS Resources</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable Amazon ECS managed tags for the task.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     *         >Tagging Your Amazon ECS Resources</a> in the <i>Amazon Elastic
     *         Container Service Developer Guide</i>.
     *         </p>
     */
    public Boolean isEnableECSManagedTags() {
        return enableECSManagedTags;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the task. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     * >Tagging Your Amazon ECS Resources</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable Amazon ECS managed tags for the task.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     *         >Tagging Your Amazon ECS Resources</a> in the <i>Amazon Elastic
     *         Container Service Developer Guide</i>.
     *         </p>
     */
    public Boolean getEnableECSManagedTags() {
        return enableECSManagedTags;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the task. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     * >Tagging Your Amazon ECS Resources</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @param enableECSManagedTags <p>
     *            Specifies whether to enable Amazon ECS managed tags for the
     *            task. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     *            >Tagging Your Amazon ECS Resources</a> in the <i>Amazon
     *            Elastic Container Service Developer Guide</i>.
     *            </p>
     */
    public void setEnableECSManagedTags(Boolean enableECSManagedTags) {
        this.enableECSManagedTags = enableECSManagedTags;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the task. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     * >Tagging Your Amazon ECS Resources</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableECSManagedTags <p>
     *            Specifies whether to enable Amazon ECS managed tags for the
     *            task. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     *            >Tagging Your Amazon ECS Resources</a> in the <i>Amazon
     *            Elastic Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskRequest withEnableECSManagedTags(Boolean enableECSManagedTags) {
        this.enableECSManagedTags = enableECSManagedTags;
        return this;
    }

    /**
     * <p>
     * The name of the task group to associate with the task. The default value
     * is the family name of the task definition (for example,
     * family:my-family-name).
     * </p>
     *
     * @return <p>
     *         The name of the task group to associate with the task. The
     *         default value is the family name of the task definition (for
     *         example, family:my-family-name).
     *         </p>
     */
    public String getGroup() {
        return group;
    }

    /**
     * <p>
     * The name of the task group to associate with the task. The default value
     * is the family name of the task definition (for example,
     * family:my-family-name).
     * </p>
     *
     * @param group <p>
     *            The name of the task group to associate with the task. The
     *            default value is the family name of the task definition (for
     *            example, family:my-family-name).
     *            </p>
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The name of the task group to associate with the task. The default value
     * is the family name of the task definition (for example,
     * family:my-family-name).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param group <p>
     *            The name of the task group to associate with the task. The
     *            default value is the family name of the task definition (for
     *            example, family:my-family-name).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskRequest withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * <p>
     * The launch type on which to run your task. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>launchType</code> is specified, the
     * <code>capacityProviderStrategy</code> parameter must be omitted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @return <p>
     *         The launch type on which to run your task. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *         >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container
     *         Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         If a <code>launchType</code> is specified, the
     *         <code>capacityProviderStrategy</code> parameter must be omitted.
     *         </p>
     * @see LaunchType
     */
    public String getLaunchType() {
        return launchType;
    }

    /**
     * <p>
     * The launch type on which to run your task. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>launchType</code> is specified, the
     * <code>capacityProviderStrategy</code> parameter must be omitted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type on which to run your task. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            If a <code>launchType</code> is specified, the
     *            <code>capacityProviderStrategy</code> parameter must be
     *            omitted.
     *            </p>
     * @see LaunchType
     */
    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * The launch type on which to run your task. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>launchType</code> is specified, the
     * <code>capacityProviderStrategy</code> parameter must be omitted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type on which to run your task. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            If a <code>launchType</code> is specified, the
     *            <code>capacityProviderStrategy</code> parameter must be
     *            omitted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LaunchType
     */
    public RunTaskRequest withLaunchType(String launchType) {
        this.launchType = launchType;
        return this;
    }

    /**
     * <p>
     * The launch type on which to run your task. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>launchType</code> is specified, the
     * <code>capacityProviderStrategy</code> parameter must be omitted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type on which to run your task. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            If a <code>launchType</code> is specified, the
     *            <code>capacityProviderStrategy</code> parameter must be
     *            omitted.
     *            </p>
     * @see LaunchType
     */
    public void setLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
    }

    /**
     * <p>
     * The launch type on which to run your task. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>launchType</code> is specified, the
     * <code>capacityProviderStrategy</code> parameter must be omitted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type on which to run your task. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            If a <code>launchType</code> is specified, the
     *            <code>capacityProviderStrategy</code> parameter must be
     *            omitted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LaunchType
     */
    public RunTaskRequest withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * The network configuration for the task. This parameter is required for
     * task definitions that use the <code>awsvpc</code> network mode to receive
     * their own elastic network interface, and it is not supported for other
     * network modes. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     * >Task Networking</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The network configuration for the task. This parameter is
     *         required for task definitions that use the <code>awsvpc</code>
     *         network mode to receive their own elastic network interface, and
     *         it is not supported for other network modes. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     *         >Task Networking</a> in the <i>Amazon Elastic Container Service
     *         Developer Guide</i>.
     *         </p>
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for the task. This parameter is required for
     * task definitions that use the <code>awsvpc</code> network mode to receive
     * their own elastic network interface, and it is not supported for other
     * network modes. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     * >Task Networking</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     *
     * @param networkConfiguration <p>
     *            The network configuration for the task. This parameter is
     *            required for task definitions that use the <code>awsvpc</code>
     *            network mode to receive their own elastic network interface,
     *            and it is not supported for other network modes. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     *            >Task Networking</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for the task. This parameter is required for
     * task definitions that use the <code>awsvpc</code> network mode to receive
     * their own elastic network interface, and it is not supported for other
     * network modes. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     * >Task Networking</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkConfiguration <p>
     *            The network configuration for the task. This parameter is
     *            required for task definitions that use the <code>awsvpc</code>
     *            network mode to receive their own elastic network interface,
     *            and it is not supported for other network modes. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     *            >Task Networking</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskRequest withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * <p>
     * A list of container overrides in JSON format that specify the name of a
     * container in the specified task definition and the overrides it should
     * receive. You can override the default command for a container (that is
     * specified in the task definition or Docker image) with a
     * <code>command</code> override. You can also override existing environment
     * variables (that are specified in the task definition or Docker image) on
     * a container or add new environment variables to it with an
     * <code>environment</code> override.
     * </p>
     * <note>
     * <p>
     * A total of 8192 characters are allowed for overrides. This limit includes
     * the JSON formatting characters of the override structure.
     * </p>
     * </note>
     *
     * @return <p>
     *         A list of container overrides in JSON format that specify the
     *         name of a container in the specified task definition and the
     *         overrides it should receive. You can override the default command
     *         for a container (that is specified in the task definition or
     *         Docker image) with a <code>command</code> override. You can also
     *         override existing environment variables (that are specified in
     *         the task definition or Docker image) on a container or add new
     *         environment variables to it with an <code>environment</code>
     *         override.
     *         </p>
     *         <note>
     *         <p>
     *         A total of 8192 characters are allowed for overrides. This limit
     *         includes the JSON formatting characters of the override
     *         structure.
     *         </p>
     *         </note>
     */
    public TaskOverride getOverrides() {
        return overrides;
    }

    /**
     * <p>
     * A list of container overrides in JSON format that specify the name of a
     * container in the specified task definition and the overrides it should
     * receive. You can override the default command for a container (that is
     * specified in the task definition or Docker image) with a
     * <code>command</code> override. You can also override existing environment
     * variables (that are specified in the task definition or Docker image) on
     * a container or add new environment variables to it with an
     * <code>environment</code> override.
     * </p>
     * <note>
     * <p>
     * A total of 8192 characters are allowed for overrides. This limit includes
     * the JSON formatting characters of the override structure.
     * </p>
     * </note>
     *
     * @param overrides <p>
     *            A list of container overrides in JSON format that specify the
     *            name of a container in the specified task definition and the
     *            overrides it should receive. You can override the default
     *            command for a container (that is specified in the task
     *            definition or Docker image) with a <code>command</code>
     *            override. You can also override existing environment variables
     *            (that are specified in the task definition or Docker image) on
     *            a container or add new environment variables to it with an
     *            <code>environment</code> override.
     *            </p>
     *            <note>
     *            <p>
     *            A total of 8192 characters are allowed for overrides. This
     *            limit includes the JSON formatting characters of the override
     *            structure.
     *            </p>
     *            </note>
     */
    public void setOverrides(TaskOverride overrides) {
        this.overrides = overrides;
    }

    /**
     * <p>
     * A list of container overrides in JSON format that specify the name of a
     * container in the specified task definition and the overrides it should
     * receive. You can override the default command for a container (that is
     * specified in the task definition or Docker image) with a
     * <code>command</code> override. You can also override existing environment
     * variables (that are specified in the task definition or Docker image) on
     * a container or add new environment variables to it with an
     * <code>environment</code> override.
     * </p>
     * <note>
     * <p>
     * A total of 8192 characters are allowed for overrides. This limit includes
     * the JSON formatting characters of the override structure.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param overrides <p>
     *            A list of container overrides in JSON format that specify the
     *            name of a container in the specified task definition and the
     *            overrides it should receive. You can override the default
     *            command for a container (that is specified in the task
     *            definition or Docker image) with a <code>command</code>
     *            override. You can also override existing environment variables
     *            (that are specified in the task definition or Docker image) on
     *            a container or add new environment variables to it with an
     *            <code>environment</code> override.
     *            </p>
     *            <note>
     *            <p>
     *            A total of 8192 characters are allowed for overrides. This
     *            limit includes the JSON formatting characters of the override
     *            structure.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskRequest withOverrides(TaskOverride overrides) {
        this.overrides = overrides;
        return this;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can
     * specify up to 10 constraints per task (including constraints in the task
     * definition and those specified at runtime).
     * </p>
     *
     * @return <p>
     *         An array of placement constraint objects to use for the task. You
     *         can specify up to 10 constraints per task (including constraints
     *         in the task definition and those specified at runtime).
     *         </p>
     */
    public java.util.List<PlacementConstraint> getPlacementConstraints() {
        return placementConstraints;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can
     * specify up to 10 constraints per task (including constraints in the task
     * definition and those specified at runtime).
     * </p>
     *
     * @param placementConstraints <p>
     *            An array of placement constraint objects to use for the task.
     *            You can specify up to 10 constraints per task (including
     *            constraints in the task definition and those specified at
     *            runtime).
     *            </p>
     */
    public void setPlacementConstraints(
            java.util.Collection<PlacementConstraint> placementConstraints) {
        if (placementConstraints == null) {
            this.placementConstraints = null;
            return;
        }

        this.placementConstraints = new java.util.ArrayList<PlacementConstraint>(
                placementConstraints);
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can
     * specify up to 10 constraints per task (including constraints in the task
     * definition and those specified at runtime).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementConstraints <p>
     *            An array of placement constraint objects to use for the task.
     *            You can specify up to 10 constraints per task (including
     *            constraints in the task definition and those specified at
     *            runtime).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskRequest withPlacementConstraints(PlacementConstraint... placementConstraints) {
        if (getPlacementConstraints() == null) {
            this.placementConstraints = new java.util.ArrayList<PlacementConstraint>(
                    placementConstraints.length);
        }
        for (PlacementConstraint value : placementConstraints) {
            this.placementConstraints.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can
     * specify up to 10 constraints per task (including constraints in the task
     * definition and those specified at runtime).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementConstraints <p>
     *            An array of placement constraint objects to use for the task.
     *            You can specify up to 10 constraints per task (including
     *            constraints in the task definition and those specified at
     *            runtime).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskRequest withPlacementConstraints(
            java.util.Collection<PlacementConstraint> placementConstraints) {
        setPlacementConstraints(placementConstraints);
        return this;
    }

    /**
     * <p>
     * The placement strategy objects to use for the task. You can specify a
     * maximum of five strategy rules per task.
     * </p>
     *
     * @return <p>
     *         The placement strategy objects to use for the task. You can
     *         specify a maximum of five strategy rules per task.
     *         </p>
     */
    public java.util.List<PlacementStrategy> getPlacementStrategy() {
        return placementStrategy;
    }

    /**
     * <p>
     * The placement strategy objects to use for the task. You can specify a
     * maximum of five strategy rules per task.
     * </p>
     *
     * @param placementStrategy <p>
     *            The placement strategy objects to use for the task. You can
     *            specify a maximum of five strategy rules per task.
     *            </p>
     */
    public void setPlacementStrategy(java.util.Collection<PlacementStrategy> placementStrategy) {
        if (placementStrategy == null) {
            this.placementStrategy = null;
            return;
        }

        this.placementStrategy = new java.util.ArrayList<PlacementStrategy>(placementStrategy);
    }

    /**
     * <p>
     * The placement strategy objects to use for the task. You can specify a
     * maximum of five strategy rules per task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementStrategy <p>
     *            The placement strategy objects to use for the task. You can
     *            specify a maximum of five strategy rules per task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskRequest withPlacementStrategy(PlacementStrategy... placementStrategy) {
        if (getPlacementStrategy() == null) {
            this.placementStrategy = new java.util.ArrayList<PlacementStrategy>(
                    placementStrategy.length);
        }
        for (PlacementStrategy value : placementStrategy) {
            this.placementStrategy.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The placement strategy objects to use for the task. You can specify a
     * maximum of five strategy rules per task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementStrategy <p>
     *            The placement strategy objects to use for the task. You can
     *            specify a maximum of five strategy rules per task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskRequest withPlacementStrategy(
            java.util.Collection<PlacementStrategy> placementStrategy) {
        setPlacementStrategy(placementStrategy);
        return this;
    }

    /**
     * <p>
     * The platform version the task should run. A platform version is only
     * specified for tasks using the Fargate launch type. If one is not
     * specified, the <code>LATEST</code> platform version is used by default.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The platform version the task should run. A platform version is
     *         only specified for tasks using the Fargate launch type. If one is
     *         not specified, the <code>LATEST</code> platform version is used
     *         by default. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     *         >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic
     *         Container Service Developer Guide</i>.
     *         </p>
     */
    public String getPlatformVersion() {
        return platformVersion;
    }

    /**
     * <p>
     * The platform version the task should run. A platform version is only
     * specified for tasks using the Fargate launch type. If one is not
     * specified, the <code>LATEST</code> platform version is used by default.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @param platformVersion <p>
     *            The platform version the task should run. A platform version
     *            is only specified for tasks using the Fargate launch type. If
     *            one is not specified, the <code>LATEST</code> platform version
     *            is used by default. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     *            >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     */
    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The platform version the task should run. A platform version is only
     * specified for tasks using the Fargate launch type. If one is not
     * specified, the <code>LATEST</code> platform version is used by default.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformVersion <p>
     *            The platform version the task should run. A platform version
     *            is only specified for tasks using the Fargate launch type. If
     *            one is not specified, the <code>LATEST</code> platform version
     *            is used by default. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     *            >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskRequest withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition to the
     * task. If no value is specified, the tags are not propagated. Tags can
     * only be propagated to the task during task creation. To add tags to a
     * task after task creation, use the <a>TagResource</a> API action.
     * </p>
     * <note>
     * <p>
     * An error will be received if you specify the <code>SERVICE</code> option
     * when running a task.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     *
     * @return <p>
     *         Specifies whether to propagate the tags from the task definition
     *         to the task. If no value is specified, the tags are not
     *         propagated. Tags can only be propagated to the task during task
     *         creation. To add tags to a task after task creation, use the
     *         <a>TagResource</a> API action.
     *         </p>
     *         <note>
     *         <p>
     *         An error will be received if you specify the <code>SERVICE</code>
     *         option when running a task.
     *         </p>
     *         </note>
     * @see PropagateTags
     */
    public String getPropagateTags() {
        return propagateTags;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition to the
     * task. If no value is specified, the tags are not propagated. Tags can
     * only be propagated to the task during task creation. To add tags to a
     * task after task creation, use the <a>TagResource</a> API action.
     * </p>
     * <note>
     * <p>
     * An error will be received if you specify the <code>SERVICE</code> option
     * when running a task.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     *
     * @param propagateTags <p>
     *            Specifies whether to propagate the tags from the task
     *            definition to the task. If no value is specified, the tags are
     *            not propagated. Tags can only be propagated to the task during
     *            task creation. To add tags to a task after task creation, use
     *            the <a>TagResource</a> API action.
     *            </p>
     *            <note>
     *            <p>
     *            An error will be received if you specify the
     *            <code>SERVICE</code> option when running a task.
     *            </p>
     *            </note>
     * @see PropagateTags
     */
    public void setPropagateTags(String propagateTags) {
        this.propagateTags = propagateTags;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition to the
     * task. If no value is specified, the tags are not propagated. Tags can
     * only be propagated to the task during task creation. To add tags to a
     * task after task creation, use the <a>TagResource</a> API action.
     * </p>
     * <note>
     * <p>
     * An error will be received if you specify the <code>SERVICE</code> option
     * when running a task.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     *
     * @param propagateTags <p>
     *            Specifies whether to propagate the tags from the task
     *            definition to the task. If no value is specified, the tags are
     *            not propagated. Tags can only be propagated to the task during
     *            task creation. To add tags to a task after task creation, use
     *            the <a>TagResource</a> API action.
     *            </p>
     *            <note>
     *            <p>
     *            An error will be received if you specify the
     *            <code>SERVICE</code> option when running a task.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PropagateTags
     */
    public RunTaskRequest withPropagateTags(String propagateTags) {
        this.propagateTags = propagateTags;
        return this;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition to the
     * task. If no value is specified, the tags are not propagated. Tags can
     * only be propagated to the task during task creation. To add tags to a
     * task after task creation, use the <a>TagResource</a> API action.
     * </p>
     * <note>
     * <p>
     * An error will be received if you specify the <code>SERVICE</code> option
     * when running a task.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     *
     * @param propagateTags <p>
     *            Specifies whether to propagate the tags from the task
     *            definition to the task. If no value is specified, the tags are
     *            not propagated. Tags can only be propagated to the task during
     *            task creation. To add tags to a task after task creation, use
     *            the <a>TagResource</a> API action.
     *            </p>
     *            <note>
     *            <p>
     *            An error will be received if you specify the
     *            <code>SERVICE</code> option when running a task.
     *            </p>
     *            </note>
     * @see PropagateTags
     */
    public void setPropagateTags(PropagateTags propagateTags) {
        this.propagateTags = propagateTags.toString();
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition to the
     * task. If no value is specified, the tags are not propagated. Tags can
     * only be propagated to the task during task creation. To add tags to a
     * task after task creation, use the <a>TagResource</a> API action.
     * </p>
     * <note>
     * <p>
     * An error will be received if you specify the <code>SERVICE</code> option
     * when running a task.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     *
     * @param propagateTags <p>
     *            Specifies whether to propagate the tags from the task
     *            definition to the task. If no value is specified, the tags are
     *            not propagated. Tags can only be propagated to the task during
     *            task creation. To add tags to a task after task creation, use
     *            the <a>TagResource</a> API action.
     *            </p>
     *            <note>
     *            <p>
     *            An error will be received if you specify the
     *            <code>SERVICE</code> option when running a task.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PropagateTags
     */
    public RunTaskRequest withPropagateTags(PropagateTags propagateTags) {
        this.propagateTags = propagateTags.toString();
        return this;
    }

    /**
     * <p>
     * The reference ID to use for the task.
     * </p>
     *
     * @return <p>
     *         The reference ID to use for the task.
     *         </p>
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * <p>
     * The reference ID to use for the task.
     * </p>
     *
     * @param referenceId <p>
     *            The reference ID to use for the task.
     *            </p>
     */
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * <p>
     * The reference ID to use for the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param referenceId <p>
     *            The reference ID to use for the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskRequest withReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    /**
     * <p>
     * An optional tag specified when a task is started. For example, if you
     * automatically trigger a task to run a batch process job, you could apply
     * a unique identifier for that job to your task with the
     * <code>startedBy</code> parameter. You can then identify which tasks
     * belong to that job by filtering the results of a <a>ListTasks</a> call
     * with the <code>startedBy</code> value. Up to 36 letters (uppercase and
     * lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     * <p>
     * If a task is started by an Amazon ECS service, then the
     * <code>startedBy</code> parameter contains the deployment ID of the
     * service that starts it.
     * </p>
     *
     * @return <p>
     *         An optional tag specified when a task is started. For example, if
     *         you automatically trigger a task to run a batch process job, you
     *         could apply a unique identifier for that job to your task with
     *         the <code>startedBy</code> parameter. You can then identify which
     *         tasks belong to that job by filtering the results of a
     *         <a>ListTasks</a> call with the <code>startedBy</code> value. Up
     *         to 36 letters (uppercase and lowercase), numbers, hyphens, and
     *         underscores are allowed.
     *         </p>
     *         <p>
     *         If a task is started by an Amazon ECS service, then the
     *         <code>startedBy</code> parameter contains the deployment ID of
     *         the service that starts it.
     *         </p>
     */
    public String getStartedBy() {
        return startedBy;
    }

    /**
     * <p>
     * An optional tag specified when a task is started. For example, if you
     * automatically trigger a task to run a batch process job, you could apply
     * a unique identifier for that job to your task with the
     * <code>startedBy</code> parameter. You can then identify which tasks
     * belong to that job by filtering the results of a <a>ListTasks</a> call
     * with the <code>startedBy</code> value. Up to 36 letters (uppercase and
     * lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     * <p>
     * If a task is started by an Amazon ECS service, then the
     * <code>startedBy</code> parameter contains the deployment ID of the
     * service that starts it.
     * </p>
     *
     * @param startedBy <p>
     *            An optional tag specified when a task is started. For example,
     *            if you automatically trigger a task to run a batch process
     *            job, you could apply a unique identifier for that job to your
     *            task with the <code>startedBy</code> parameter. You can then
     *            identify which tasks belong to that job by filtering the
     *            results of a <a>ListTasks</a> call with the
     *            <code>startedBy</code> value. Up to 36 letters (uppercase and
     *            lowercase), numbers, hyphens, and underscores are allowed.
     *            </p>
     *            <p>
     *            If a task is started by an Amazon ECS service, then the
     *            <code>startedBy</code> parameter contains the deployment ID of
     *            the service that starts it.
     *            </p>
     */
    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    /**
     * <p>
     * An optional tag specified when a task is started. For example, if you
     * automatically trigger a task to run a batch process job, you could apply
     * a unique identifier for that job to your task with the
     * <code>startedBy</code> parameter. You can then identify which tasks
     * belong to that job by filtering the results of a <a>ListTasks</a> call
     * with the <code>startedBy</code> value. Up to 36 letters (uppercase and
     * lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     * <p>
     * If a task is started by an Amazon ECS service, then the
     * <code>startedBy</code> parameter contains the deployment ID of the
     * service that starts it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startedBy <p>
     *            An optional tag specified when a task is started. For example,
     *            if you automatically trigger a task to run a batch process
     *            job, you could apply a unique identifier for that job to your
     *            task with the <code>startedBy</code> parameter. You can then
     *            identify which tasks belong to that job by filtering the
     *            results of a <a>ListTasks</a> call with the
     *            <code>startedBy</code> value. Up to 36 letters (uppercase and
     *            lowercase), numbers, hyphens, and underscores are allowed.
     *            </p>
     *            <p>
     *            If a task is started by an Amazon ECS service, then the
     *            <code>startedBy</code> parameter contains the deployment ID of
     *            the service that starts it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskRequest withStartedBy(String startedBy) {
        this.startedBy = startedBy;
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the task to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The metadata that you apply to the task to help you categorize
     *         and organize them. Each tag consists of a key and an optional
     *         value, both of which you define.
     *         </p>
     *         <p>
     *         The following basic restrictions apply to tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum number of tags per resource - 50
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For each resource, each tag key must be unique, and each tag key
     *         can have only one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length - 128 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length - 256 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If your tagging schema is used across multiple services and
     *         resources, remember that other services may have restrictions on
     *         allowed characters. Generally allowed characters are: letters,
     *         numbers, and spaces representable in UTF-8, and the following
     *         characters: + - = . _ : / @.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tag keys and values are case-sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     *         lowercase combination of such as a prefix for either keys or
     *         values as it is reserved for AWS use. You cannot edit or delete
     *         tag keys or values with this prefix. Tags with this prefix do not
     *         count against your tags per resource limit.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata that you apply to the task to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     *
     * @param tags <p>
     *            The metadata that you apply to the task to help you categorize
     *            and organize them. Each tag consists of a key and an optional
     *            value, both of which you define.
     *            </p>
     *            <p>
     *            The following basic restrictions apply to tags:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum number of tags per resource - 50
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For each resource, each tag key must be unique, and each tag
     *            key can have only one value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length - 128 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length - 256 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If your tagging schema is used across multiple services and
     *            resources, remember that other services may have restrictions
     *            on allowed characters. Generally allowed characters are:
     *            letters, numbers, and spaces representable in UTF-8, and the
     *            following characters: + - = . _ : / @.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Tag keys and values are case-sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Do not use <code>aws:</code>, <code>AWS:</code>, or any upper
     *            or lowercase combination of such as a prefix for either keys
     *            or values as it is reserved for AWS use. You cannot edit or
     *            delete tag keys or values with this prefix. Tags with this
     *            prefix do not count against your tags per resource limit.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The metadata that you apply to the task to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The metadata that you apply to the task to help you categorize
     *            and organize them. Each tag consists of a key and an optional
     *            value, both of which you define.
     *            </p>
     *            <p>
     *            The following basic restrictions apply to tags:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum number of tags per resource - 50
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For each resource, each tag key must be unique, and each tag
     *            key can have only one value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length - 128 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length - 256 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If your tagging schema is used across multiple services and
     *            resources, remember that other services may have restrictions
     *            on allowed characters. Generally allowed characters are:
     *            letters, numbers, and spaces representable in UTF-8, and the
     *            following characters: + - = . _ : / @.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Tag keys and values are case-sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Do not use <code>aws:</code>, <code>AWS:</code>, or any upper
     *            or lowercase combination of such as a prefix for either keys
     *            or values as it is reserved for AWS use. You cannot edit or
     *            delete tag keys or values with this prefix. Tags with this
     *            prefix do not count against your tags per resource limit.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the task to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The metadata that you apply to the task to help you categorize
     *            and organize them. Each tag consists of a key and an optional
     *            value, both of which you define.
     *            </p>
     *            <p>
     *            The following basic restrictions apply to tags:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum number of tags per resource - 50
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For each resource, each tag key must be unique, and each tag
     *            key can have only one value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length - 128 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length - 256 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If your tagging schema is used across multiple services and
     *            resources, remember that other services may have restrictions
     *            on allowed characters. Generally allowed characters are:
     *            letters, numbers, and spaces representable in UTF-8, and the
     *            following characters: + - = . _ : / @.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Tag keys and values are case-sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Do not use <code>aws:</code>, <code>AWS:</code>, or any upper
     *            or lowercase combination of such as a prefix for either keys
     *            or values as it is reserved for AWS use. You cannot edit or
     *            delete tag keys or values with this prefix. Tags with this
     *            prefix do not count against your tags per resource limit.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) or full ARN of the task definition to run.
     * If a <code>revision</code> is not specified, the latest
     * <code>ACTIVE</code> revision is used.
     * </p>
     *
     * @return <p>
     *         The <code>family</code> and <code>revision</code> (
     *         <code>family:revision</code>) or full ARN of the task definition
     *         to run. If a <code>revision</code> is not specified, the latest
     *         <code>ACTIVE</code> revision is used.
     *         </p>
     */
    public String getTaskDefinition() {
        return taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) or full ARN of the task definition to run.
     * If a <code>revision</code> is not specified, the latest
     * <code>ACTIVE</code> revision is used.
     * </p>
     *
     * @param taskDefinition <p>
     *            The <code>family</code> and <code>revision</code> (
     *            <code>family:revision</code>) or full ARN of the task
     *            definition to run. If a <code>revision</code> is not
     *            specified, the latest <code>ACTIVE</code> revision is used.
     *            </p>
     */
    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) or full ARN of the task definition to run.
     * If a <code>revision</code> is not specified, the latest
     * <code>ACTIVE</code> revision is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskDefinition <p>
     *            The <code>family</code> and <code>revision</code> (
     *            <code>family:revision</code>) or full ARN of the task
     *            definition to run. If a <code>revision</code> is not
     *            specified, the latest <code>ACTIVE</code> revision is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunTaskRequest withTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCapacityProviderStrategy() != null)
            sb.append("capacityProviderStrategy: " + getCapacityProviderStrategy() + ",");
        if (getCluster() != null)
            sb.append("cluster: " + getCluster() + ",");
        if (getCount() != null)
            sb.append("count: " + getCount() + ",");
        if (getEnableECSManagedTags() != null)
            sb.append("enableECSManagedTags: " + getEnableECSManagedTags() + ",");
        if (getGroup() != null)
            sb.append("group: " + getGroup() + ",");
        if (getLaunchType() != null)
            sb.append("launchType: " + getLaunchType() + ",");
        if (getNetworkConfiguration() != null)
            sb.append("networkConfiguration: " + getNetworkConfiguration() + ",");
        if (getOverrides() != null)
            sb.append("overrides: " + getOverrides() + ",");
        if (getPlacementConstraints() != null)
            sb.append("placementConstraints: " + getPlacementConstraints() + ",");
        if (getPlacementStrategy() != null)
            sb.append("placementStrategy: " + getPlacementStrategy() + ",");
        if (getPlatformVersion() != null)
            sb.append("platformVersion: " + getPlatformVersion() + ",");
        if (getPropagateTags() != null)
            sb.append("propagateTags: " + getPropagateTags() + ",");
        if (getReferenceId() != null)
            sb.append("referenceId: " + getReferenceId() + ",");
        if (getStartedBy() != null)
            sb.append("startedBy: " + getStartedBy() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getTaskDefinition() != null)
            sb.append("taskDefinition: " + getTaskDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCapacityProviderStrategy() == null) ? 0 : getCapacityProviderStrategy()
                        .hashCode());
        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode
                + ((getEnableECSManagedTags() == null) ? 0 : getEnableECSManagedTags().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        hashCode = prime * hashCode
                + ((getPlacementConstraints() == null) ? 0 : getPlacementConstraints().hashCode());
        hashCode = prime * hashCode
                + ((getPlacementStrategy() == null) ? 0 : getPlacementStrategy().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode
                + ((getPropagateTags() == null) ? 0 : getPropagateTags().hashCode());
        hashCode = prime * hashCode
                + ((getReferenceId() == null) ? 0 : getReferenceId().hashCode());
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunTaskRequest == false)
            return false;
        RunTaskRequest other = (RunTaskRequest) obj;

        if (other.getCapacityProviderStrategy() == null
                ^ this.getCapacityProviderStrategy() == null)
            return false;
        if (other.getCapacityProviderStrategy() != null
                && other.getCapacityProviderStrategy().equals(this.getCapacityProviderStrategy()) == false)
            return false;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getEnableECSManagedTags() == null ^ this.getEnableECSManagedTags() == null)
            return false;
        if (other.getEnableECSManagedTags() != null
                && other.getEnableECSManagedTags().equals(this.getEnableECSManagedTags()) == false)
            return false;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        if (other.getLaunchType() == null ^ this.getLaunchType() == null)
            return false;
        if (other.getLaunchType() != null
                && other.getLaunchType().equals(this.getLaunchType()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null
                && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null
                && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        if (other.getPlacementConstraints() == null ^ this.getPlacementConstraints() == null)
            return false;
        if (other.getPlacementConstraints() != null
                && other.getPlacementConstraints().equals(this.getPlacementConstraints()) == false)
            return false;
        if (other.getPlacementStrategy() == null ^ this.getPlacementStrategy() == null)
            return false;
        if (other.getPlacementStrategy() != null
                && other.getPlacementStrategy().equals(this.getPlacementStrategy()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null
                && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getPropagateTags() == null ^ this.getPropagateTags() == null)
            return false;
        if (other.getPropagateTags() != null
                && other.getPropagateTags().equals(this.getPropagateTags()) == false)
            return false;
        if (other.getReferenceId() == null ^ this.getReferenceId() == null)
            return false;
        if (other.getReferenceId() != null
                && other.getReferenceId().equals(this.getReferenceId()) == false)
            return false;
        if (other.getStartedBy() == null ^ this.getStartedBy() == null)
            return false;
        if (other.getStartedBy() != null
                && other.getStartedBy().equals(this.getStartedBy()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null
                && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        return true;
    }
}
