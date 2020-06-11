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
 * Starts a new task from the specified task definition on the specified
 * container instance or instances.
 * </p>
 * <p>
 * Alternatively, you can use <a>RunTask</a> to place tasks for you. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/scheduling_tasks.html"
 * >Scheduling Tasks</a> in the <i>Amazon Elastic Container Service Developer
 * Guide</i>.
 * </p>
 */
public class StartTaskRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which
     * to start your task. If you do not specify a cluster, the default cluster
     * is assumed.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The container instance IDs or full ARN entries for the container
     * instances on which you would like to place your task. You can specify up
     * to 10 container instances.
     * </p>
     */
    private java.util.List<String> containerInstances;

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
     * The VPC subnet and security group configuration for tasks that receive
     * their own elastic network interface by using the <code>awsvpc</code>
     * networking mode.
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
     * Specifies whether to propagate the tags from the task definition or the
     * service to the task. If no value is specified, the tags are not
     * propagated.
     * </p>
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
     * <code>family:revision</code>) or full ARN of the task definition to
     * start. If a <code>revision</code> is not specified, the latest
     * <code>ACTIVE</code> revision is used.
     * </p>
     */
    private String taskDefinition;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which
     * to start your task. If you do not specify a cluster, the default cluster
     * is assumed.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         on which to start your task. If you do not specify a cluster, the
     *         default cluster is assumed.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which
     * to start your task. If you do not specify a cluster, the default cluster
     * is assumed.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster on which to start your task. If you do not specify a
     *            cluster, the default cluster is assumed.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which
     * to start your task. If you do not specify a cluster, the default cluster
     * is assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster on which to start your task. If you do not specify a
     *            cluster, the default cluster is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTaskRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The container instance IDs or full ARN entries for the container
     * instances on which you would like to place your task. You can specify up
     * to 10 container instances.
     * </p>
     *
     * @return <p>
     *         The container instance IDs or full ARN entries for the container
     *         instances on which you would like to place your task. You can
     *         specify up to 10 container instances.
     *         </p>
     */
    public java.util.List<String> getContainerInstances() {
        return containerInstances;
    }

    /**
     * <p>
     * The container instance IDs or full ARN entries for the container
     * instances on which you would like to place your task. You can specify up
     * to 10 container instances.
     * </p>
     *
     * @param containerInstances <p>
     *            The container instance IDs or full ARN entries for the
     *            container instances on which you would like to place your
     *            task. You can specify up to 10 container instances.
     *            </p>
     */
    public void setContainerInstances(java.util.Collection<String> containerInstances) {
        if (containerInstances == null) {
            this.containerInstances = null;
            return;
        }

        this.containerInstances = new java.util.ArrayList<String>(containerInstances);
    }

    /**
     * <p>
     * The container instance IDs or full ARN entries for the container
     * instances on which you would like to place your task. You can specify up
     * to 10 container instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerInstances <p>
     *            The container instance IDs or full ARN entries for the
     *            container instances on which you would like to place your
     *            task. You can specify up to 10 container instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTaskRequest withContainerInstances(String... containerInstances) {
        if (getContainerInstances() == null) {
            this.containerInstances = new java.util.ArrayList<String>(containerInstances.length);
        }
        for (String value : containerInstances) {
            this.containerInstances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The container instance IDs or full ARN entries for the container
     * instances on which you would like to place your task. You can specify up
     * to 10 container instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerInstances <p>
     *            The container instance IDs or full ARN entries for the
     *            container instances on which you would like to place your
     *            task. You can specify up to 10 container instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTaskRequest withContainerInstances(java.util.Collection<String> containerInstances) {
        setContainerInstances(containerInstances);
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
    public StartTaskRequest withEnableECSManagedTags(Boolean enableECSManagedTags) {
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
    public StartTaskRequest withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * <p>
     * The VPC subnet and security group configuration for tasks that receive
     * their own elastic network interface by using the <code>awsvpc</code>
     * networking mode.
     * </p>
     *
     * @return <p>
     *         The VPC subnet and security group configuration for tasks that
     *         receive their own elastic network interface by using the
     *         <code>awsvpc</code> networking mode.
     *         </p>
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
    }

    /**
     * <p>
     * The VPC subnet and security group configuration for tasks that receive
     * their own elastic network interface by using the <code>awsvpc</code>
     * networking mode.
     * </p>
     *
     * @param networkConfiguration <p>
     *            The VPC subnet and security group configuration for tasks that
     *            receive their own elastic network interface by using the
     *            <code>awsvpc</code> networking mode.
     *            </p>
     */
    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * The VPC subnet and security group configuration for tasks that receive
     * their own elastic network interface by using the <code>awsvpc</code>
     * networking mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkConfiguration <p>
     *            The VPC subnet and security group configuration for tasks that
     *            receive their own elastic network interface by using the
     *            <code>awsvpc</code> networking mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTaskRequest withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
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
    public StartTaskRequest withOverrides(TaskOverride overrides) {
        this.overrides = overrides;
        return this;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the
     * service to the task. If no value is specified, the tags are not
     * propagated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     *
     * @return <p>
     *         Specifies whether to propagate the tags from the task definition
     *         or the service to the task. If no value is specified, the tags
     *         are not propagated.
     *         </p>
     * @see PropagateTags
     */
    public String getPropagateTags() {
        return propagateTags;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the
     * service to the task. If no value is specified, the tags are not
     * propagated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     *
     * @param propagateTags <p>
     *            Specifies whether to propagate the tags from the task
     *            definition or the service to the task. If no value is
     *            specified, the tags are not propagated.
     *            </p>
     * @see PropagateTags
     */
    public void setPropagateTags(String propagateTags) {
        this.propagateTags = propagateTags;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the
     * service to the task. If no value is specified, the tags are not
     * propagated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     *
     * @param propagateTags <p>
     *            Specifies whether to propagate the tags from the task
     *            definition or the service to the task. If no value is
     *            specified, the tags are not propagated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PropagateTags
     */
    public StartTaskRequest withPropagateTags(String propagateTags) {
        this.propagateTags = propagateTags;
        return this;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the
     * service to the task. If no value is specified, the tags are not
     * propagated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     *
     * @param propagateTags <p>
     *            Specifies whether to propagate the tags from the task
     *            definition or the service to the task. If no value is
     *            specified, the tags are not propagated.
     *            </p>
     * @see PropagateTags
     */
    public void setPropagateTags(PropagateTags propagateTags) {
        this.propagateTags = propagateTags.toString();
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the
     * service to the task. If no value is specified, the tags are not
     * propagated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     *
     * @param propagateTags <p>
     *            Specifies whether to propagate the tags from the task
     *            definition or the service to the task. If no value is
     *            specified, the tags are not propagated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PropagateTags
     */
    public StartTaskRequest withPropagateTags(PropagateTags propagateTags) {
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
    public StartTaskRequest withReferenceId(String referenceId) {
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
    public StartTaskRequest withStartedBy(String startedBy) {
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
    public StartTaskRequest withTags(Tag... tags) {
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
    public StartTaskRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) or full ARN of the task definition to
     * start. If a <code>revision</code> is not specified, the latest
     * <code>ACTIVE</code> revision is used.
     * </p>
     *
     * @return <p>
     *         The <code>family</code> and <code>revision</code> (
     *         <code>family:revision</code>) or full ARN of the task definition
     *         to start. If a <code>revision</code> is not specified, the latest
     *         <code>ACTIVE</code> revision is used.
     *         </p>
     */
    public String getTaskDefinition() {
        return taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) or full ARN of the task definition to
     * start. If a <code>revision</code> is not specified, the latest
     * <code>ACTIVE</code> revision is used.
     * </p>
     *
     * @param taskDefinition <p>
     *            The <code>family</code> and <code>revision</code> (
     *            <code>family:revision</code>) or full ARN of the task
     *            definition to start. If a <code>revision</code> is not
     *            specified, the latest <code>ACTIVE</code> revision is used.
     *            </p>
     */
    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) or full ARN of the task definition to
     * start. If a <code>revision</code> is not specified, the latest
     * <code>ACTIVE</code> revision is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskDefinition <p>
     *            The <code>family</code> and <code>revision</code> (
     *            <code>family:revision</code>) or full ARN of the task
     *            definition to start. If a <code>revision</code> is not
     *            specified, the latest <code>ACTIVE</code> revision is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTaskRequest withTaskDefinition(String taskDefinition) {
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
        if (getCluster() != null)
            sb.append("cluster: " + getCluster() + ",");
        if (getContainerInstances() != null)
            sb.append("containerInstances: " + getContainerInstances() + ",");
        if (getEnableECSManagedTags() != null)
            sb.append("enableECSManagedTags: " + getEnableECSManagedTags() + ",");
        if (getGroup() != null)
            sb.append("group: " + getGroup() + ",");
        if (getNetworkConfiguration() != null)
            sb.append("networkConfiguration: " + getNetworkConfiguration() + ",");
        if (getOverrides() != null)
            sb.append("overrides: " + getOverrides() + ",");
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

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode
                + ((getContainerInstances() == null) ? 0 : getContainerInstances().hashCode());
        hashCode = prime * hashCode
                + ((getEnableECSManagedTags() == null) ? 0 : getEnableECSManagedTags().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
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

        if (obj instanceof StartTaskRequest == false)
            return false;
        StartTaskRequest other = (StartTaskRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getContainerInstances() == null ^ this.getContainerInstances() == null)
            return false;
        if (other.getContainerInstances() != null
                && other.getContainerInstances().equals(this.getContainerInstances()) == false)
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
