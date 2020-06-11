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

/**
 * <p>
 * The details of a task definition which describes the container and volume
 * definitions of an Amazon Elastic Container Service task. You can specify
 * which Docker images to use, the required resources, and other configurations
 * related to launching the task definition through an Amazon ECS service or
 * task.
 * </p>
 */
public class TaskDefinition implements Serializable {
    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the task definition.
     * </p>
     */
    private String taskDefinitionArn;

    /**
     * <p>
     * A list of container definitions in JSON format that describe the
     * different containers that make up your task. For more information about
     * container definition parameters and defaults, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html"
     * >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     */
    private java.util.List<ContainerDefinition> containerDefinitions;

    /**
     * <p>
     * The name of a family that this task definition is registered to. Up to
     * 255 letters (uppercase and lowercase), numbers, hyphens, and underscores
     * are allowed.
     * </p>
     * <p>
     * A family groups multiple versions of a task definition. Amazon ECS gives
     * the first task definition that you registered to a family a revision
     * number of 1. Amazon ECS gives sequential revision numbers to each task
     * definition that you add.
     * </p>
     */
    private String family;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the AWS Identity and
     * Access Management (IAM) role that grants containers in the task
     * permission to call AWS APIs on your behalf. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html"
     * >Amazon ECS Task Role</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * IAM roles for tasks on Windows require that the
     * <code>-EnableTaskIAMRole</code> option is set when you launch the Amazon
     * ECS-optimized Windows AMI. Your containers must also run some
     * configuration code in order to take advantage of the feature. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows_task_IAM_roles.html"
     * >Windows IAM Roles for Tasks</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     */
    private String taskRoleArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that grants the
     * Amazon ECS container agent permission to make AWS API calls on your
     * behalf. The task execution IAM role is required depending on the
     * requirements of your task. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html"
     * >Amazon ECS task execution IAM role</a> in the <i>Amazon Elastic
     * Container Service Developer Guide</i>.
     * </p>
     */
    private String executionRoleArn;

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The
     * valid values are <code>none</code>, <code>bridge</code>,
     * <code>awsvpc</code>, and <code>host</code>. The default Docker network
     * mode is <code>bridge</code>. If you are using the Fargate launch type,
     * the <code>awsvpc</code> network mode is required. If you are using the
     * EC2 launch type, any network mode can be used. If the network mode is set
     * to <code>none</code>, you cannot specify port mappings in your container
     * definitions, and the tasks containers do not have external connectivity.
     * The <code>host</code> and <code>awsvpc</code> network modes offer the
     * highest networking performance for containers because they use the EC2
     * network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed
     * container ports are mapped directly to the corresponding host port (for
     * the <code>host</code> network mode) or the attached elastic network
     * interface port (for the <code>awsvpc</code> network mode), so you cannot
     * take advantage of dynamic host port mappings.
     * </p>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an
     * elastic network interface, and you must specify a
     * <a>NetworkConfiguration</a> value when you create a service or run a task
     * with the task definition. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     * >Task Networking</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants
     * with the <code>ecs-init</code> package, or AWS Fargate infrastructure
     * support the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * If the network mode is <code>host</code>, you cannot run multiple
     * instantiations of the same task on a single container instance when port
     * mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux.
     * When you register a task definition with Windows containers, you must not
     * specify a network mode. If you use the console to register a task
     * definition with Windows containers, you must choose the
     * <code>&lt;default&gt;</code> network mode object.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#network-settings"
     * >Network settings</a> in the <i>Docker run reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bridge, host, awsvpc, none
     */
    private String networkMode;

    /**
     * <p>
     * The revision of the task in a particular family. The revision is a
     * version number of a task definition in a family. When you register a task
     * definition for the first time, the revision is <code>1</code>. Each time
     * that you register a new revision of a task definition in the same family,
     * the revision value always increases by one, even if you have deregistered
     * previous revisions in this family.
     * </p>
     */
    private Integer revision;

    /**
     * <p>
     * The list of volume definitions for the task.
     * </p>
     * <p>
     * If your tasks are using the Fargate launch type, the <code>host</code>
     * and <code>sourcePath</code> parameters are not supported.
     * </p>
     * <p>
     * For more information about volume definition parameters and defaults, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definitions.html"
     * >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     */
    private java.util.List<Volume> volumes;

    /**
     * <p>
     * The status of the task definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     */
    private String status;

    /**
     * <p>
     * The container instance attributes required by your task. This field is
     * not valid if you are using the Fargate launch type for your task.
     * </p>
     */
    private java.util.List<Attribute> requiresAttributes;

    /**
     * <p>
     * An array of placement constraint objects to use for tasks. This field is
     * not valid if you are using the Fargate launch type for your task.
     * </p>
     */
    private java.util.List<TaskDefinitionPlacementConstraint> placementConstraints;

    /**
     * <p>
     * The launch type to use with your task. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     */
    private java.util.List<String> compatibilities;

    /**
     * <p>
     * The launch type the task requires. If no value is specified, it will
     * default to <code>EC2</code>. Valid values include <code>EC2</code> and
     * <code>FARGATE</code>.
     * </p>
     */
    private java.util.List<String> requiresCompatibilities;

    /**
     * <p>
     * The number of <code>cpu</code> units used by the task. If you are using
     * the EC2 launch type, this field is optional and any value can be used. If
     * you are using the Fargate launch type, this field is required and you
     * must use one of the following values, which determines your range of
     * valid values for the <code>memory</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024
     * (1 GB), 2048 (2 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048
     * (2 GB), 3072 (3 GB), 4096 (4 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072
     * (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB)
     * and 16384 (16 GB) in increments of 1024 (1 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB)
     * and 30720 (30 GB) in increments of 1024 (1 GB)
     * </p>
     * </li>
     * </ul>
     */
    private String cpu;

    /**
     * <p>
     * The amount (in MiB) of memory used by the task.
     * </p>
     * <p>
     * If using the EC2 launch type, this field is optional and any value can be
     * used. If a task-level memory value is specified then the container-level
     * memory value is optional.
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use
     * one of the following values, which determines your range of valid values
     * for the <code>cpu</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code>
     * values: 256 (.25 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available
     * <code>cpu</code> values: 512 (.5 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7
     * GB), 8192 (8 GB) - Available <code>cpu</code> values: 1024 (1 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) -
     * Available <code>cpu</code> values: 2048 (2 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) -
     * Available <code>cpu</code> values: 4096 (4 vCPU)
     * </p>
     * </li>
     * </ul>
     */
    private String memory;

    /**
     * <p>
     * The Elastic Inference accelerator associated with the task.
     * </p>
     */
    private java.util.List<InferenceAccelerator> inferenceAccelerators;

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid
     * values are <code>host</code> or <code>task</code>. If <code>host</code>
     * is specified, then all containers within the tasks that specified the
     * <code>host</code> PID mode on the same container instance share the same
     * process namespace with the host Amazon EC2 instance. If <code>task</code>
     * is specified, all containers within the specified task share the same
     * process namespace. If no value is specified, the default is a private
     * namespace. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid"
     * >PID settings</a> in the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> PID mode is used, be aware that there is a
     * heightened risk of undesired process namespace expose. For more
     * information, see <a
     * href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the
     * Fargate launch type.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>host, task
     */
    private String pidMode;

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The
     * valid values are <code>host</code>, <code>task</code>, or
     * <code>none</code>. If <code>host</code> is specified, then all containers
     * within the tasks that specified the <code>host</code> IPC mode on the
     * same container instance share the same IPC resources with the host Amazon
     * EC2 instance. If <code>task</code> is specified, all containers within
     * the specified task share the same IPC resources. If <code>none</code> is
     * specified, then IPC resources within the containers of a task are private
     * and not shared with other containers in a task or on the container
     * instance. If no value is specified, then the IPC resource namespace
     * sharing depends on the Docker daemon setting on the container instance.
     * For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc"
     * >IPC settings</a> in the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> IPC mode is used, be aware that there is a
     * heightened risk of undesired IPC namespace expose. For more information,
     * see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <p>
     * If you are setting namespaced kernel parameters using
     * <code>systemControls</code> for the containers in the task, the following
     * will apply to your IPC resource namespace. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html"
     * >System Controls</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tasks that use the <code>host</code> IPC mode, IPC namespace related
     * <code>systemControls</code> are not supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tasks that use the <code>task</code> IPC mode, IPC namespace related
     * <code>systemControls</code> will apply to all containers within a task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the
     * Fargate launch type.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>host, task, none
     */
    private String ipcMode;

    /**
     * <p>
     * The configuration details for the App Mesh proxy.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of
     * the container agent and at least version 1.26.0-1 of the
     * <code>ecs-init</code> package to enable a proxy configuration. If your
     * container instances are launched from the Amazon ECS-optimized AMI
     * version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html"
     * >Amazon ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     */
    private ProxyConfiguration proxyConfiguration;

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the task definition.
     * </p>
     *
     * @return <p>
     *         The full Amazon Resource Name (ARN) of the task definition.
     *         </p>
     */
    public String getTaskDefinitionArn() {
        return taskDefinitionArn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the task definition.
     * </p>
     *
     * @param taskDefinitionArn <p>
     *            The full Amazon Resource Name (ARN) of the task definition.
     *            </p>
     */
    public void setTaskDefinitionArn(String taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the task definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskDefinitionArn <p>
     *            The full Amazon Resource Name (ARN) of the task definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withTaskDefinitionArn(String taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
        return this;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the
     * different containers that make up your task. For more information about
     * container definition parameters and defaults, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html"
     * >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of container definitions in JSON format that describe the
     *         different containers that make up your task. For more information
     *         about container definition parameters and defaults, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html"
     *         >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic
     *         Container Service Developer Guide</i>.
     *         </p>
     */
    public java.util.List<ContainerDefinition> getContainerDefinitions() {
        return containerDefinitions;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the
     * different containers that make up your task. For more information about
     * container definition parameters and defaults, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html"
     * >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @param containerDefinitions <p>
     *            A list of container definitions in JSON format that describe
     *            the different containers that make up your task. For more
     *            information about container definition parameters and
     *            defaults, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html"
     *            >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     */
    public void setContainerDefinitions(
            java.util.Collection<ContainerDefinition> containerDefinitions) {
        if (containerDefinitions == null) {
            this.containerDefinitions = null;
            return;
        }

        this.containerDefinitions = new java.util.ArrayList<ContainerDefinition>(
                containerDefinitions);
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the
     * different containers that make up your task. For more information about
     * container definition parameters and defaults, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html"
     * >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerDefinitions <p>
     *            A list of container definitions in JSON format that describe
     *            the different containers that make up your task. For more
     *            information about container definition parameters and
     *            defaults, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html"
     *            >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withContainerDefinitions(ContainerDefinition... containerDefinitions) {
        if (getContainerDefinitions() == null) {
            this.containerDefinitions = new java.util.ArrayList<ContainerDefinition>(
                    containerDefinitions.length);
        }
        for (ContainerDefinition value : containerDefinitions) {
            this.containerDefinitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the
     * different containers that make up your task. For more information about
     * container definition parameters and defaults, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html"
     * >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerDefinitions <p>
     *            A list of container definitions in JSON format that describe
     *            the different containers that make up your task. For more
     *            information about container definition parameters and
     *            defaults, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html"
     *            >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withContainerDefinitions(
            java.util.Collection<ContainerDefinition> containerDefinitions) {
        setContainerDefinitions(containerDefinitions);
        return this;
    }

    /**
     * <p>
     * The name of a family that this task definition is registered to. Up to
     * 255 letters (uppercase and lowercase), numbers, hyphens, and underscores
     * are allowed.
     * </p>
     * <p>
     * A family groups multiple versions of a task definition. Amazon ECS gives
     * the first task definition that you registered to a family a revision
     * number of 1. Amazon ECS gives sequential revision numbers to each task
     * definition that you add.
     * </p>
     *
     * @return <p>
     *         The name of a family that this task definition is registered to.
     *         Up to 255 letters (uppercase and lowercase), numbers, hyphens,
     *         and underscores are allowed.
     *         </p>
     *         <p>
     *         A family groups multiple versions of a task definition. Amazon
     *         ECS gives the first task definition that you registered to a
     *         family a revision number of 1. Amazon ECS gives sequential
     *         revision numbers to each task definition that you add.
     *         </p>
     */
    public String getFamily() {
        return family;
    }

    /**
     * <p>
     * The name of a family that this task definition is registered to. Up to
     * 255 letters (uppercase and lowercase), numbers, hyphens, and underscores
     * are allowed.
     * </p>
     * <p>
     * A family groups multiple versions of a task definition. Amazon ECS gives
     * the first task definition that you registered to a family a revision
     * number of 1. Amazon ECS gives sequential revision numbers to each task
     * definition that you add.
     * </p>
     *
     * @param family <p>
     *            The name of a family that this task definition is registered
     *            to. Up to 255 letters (uppercase and lowercase), numbers,
     *            hyphens, and underscores are allowed.
     *            </p>
     *            <p>
     *            A family groups multiple versions of a task definition. Amazon
     *            ECS gives the first task definition that you registered to a
     *            family a revision number of 1. Amazon ECS gives sequential
     *            revision numbers to each task definition that you add.
     *            </p>
     */
    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * The name of a family that this task definition is registered to. Up to
     * 255 letters (uppercase and lowercase), numbers, hyphens, and underscores
     * are allowed.
     * </p>
     * <p>
     * A family groups multiple versions of a task definition. Amazon ECS gives
     * the first task definition that you registered to a family a revision
     * number of 1. Amazon ECS gives sequential revision numbers to each task
     * definition that you add.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param family <p>
     *            The name of a family that this task definition is registered
     *            to. Up to 255 letters (uppercase and lowercase), numbers,
     *            hyphens, and underscores are allowed.
     *            </p>
     *            <p>
     *            A family groups multiple versions of a task definition. Amazon
     *            ECS gives the first task definition that you registered to a
     *            family a revision number of 1. Amazon ECS gives sequential
     *            revision numbers to each task definition that you add.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the AWS Identity and
     * Access Management (IAM) role that grants containers in the task
     * permission to call AWS APIs on your behalf. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html"
     * >Amazon ECS Task Role</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * IAM roles for tasks on Windows require that the
     * <code>-EnableTaskIAMRole</code> option is set when you launch the Amazon
     * ECS-optimized Windows AMI. Your containers must also run some
     * configuration code in order to take advantage of the feature. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows_task_IAM_roles.html"
     * >Windows IAM Roles for Tasks</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the AWS
     *         Identity and Access Management (IAM) role that grants containers
     *         in the task permission to call AWS APIs on your behalf. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html"
     *         >Amazon ECS Task Role</a> in the <i>Amazon Elastic Container
     *         Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         IAM roles for tasks on Windows require that the
     *         <code>-EnableTaskIAMRole</code> option is set when you launch the
     *         Amazon ECS-optimized Windows AMI. Your containers must also run
     *         some configuration code in order to take advantage of the
     *         feature. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows_task_IAM_roles.html"
     *         >Windows IAM Roles for Tasks</a> in the <i>Amazon Elastic
     *         Container Service Developer Guide</i>.
     *         </p>
     */
    public String getTaskRoleArn() {
        return taskRoleArn;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the AWS Identity and
     * Access Management (IAM) role that grants containers in the task
     * permission to call AWS APIs on your behalf. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html"
     * >Amazon ECS Task Role</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * IAM roles for tasks on Windows require that the
     * <code>-EnableTaskIAMRole</code> option is set when you launch the Amazon
     * ECS-optimized Windows AMI. Your containers must also run some
     * configuration code in order to take advantage of the feature. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows_task_IAM_roles.html"
     * >Windows IAM Roles for Tasks</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @param taskRoleArn <p>
     *            The short name or full Amazon Resource Name (ARN) of the AWS
     *            Identity and Access Management (IAM) role that grants
     *            containers in the task permission to call AWS APIs on your
     *            behalf. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html"
     *            >Amazon ECS Task Role</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            IAM roles for tasks on Windows require that the
     *            <code>-EnableTaskIAMRole</code> option is set when you launch
     *            the Amazon ECS-optimized Windows AMI. Your containers must
     *            also run some configuration code in order to take advantage of
     *            the feature. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows_task_IAM_roles.html"
     *            >Windows IAM Roles for Tasks</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     */
    public void setTaskRoleArn(String taskRoleArn) {
        this.taskRoleArn = taskRoleArn;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the AWS Identity and
     * Access Management (IAM) role that grants containers in the task
     * permission to call AWS APIs on your behalf. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html"
     * >Amazon ECS Task Role</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * IAM roles for tasks on Windows require that the
     * <code>-EnableTaskIAMRole</code> option is set when you launch the Amazon
     * ECS-optimized Windows AMI. Your containers must also run some
     * configuration code in order to take advantage of the feature. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows_task_IAM_roles.html"
     * >Windows IAM Roles for Tasks</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskRoleArn <p>
     *            The short name or full Amazon Resource Name (ARN) of the AWS
     *            Identity and Access Management (IAM) role that grants
     *            containers in the task permission to call AWS APIs on your
     *            behalf. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html"
     *            >Amazon ECS Task Role</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            IAM roles for tasks on Windows require that the
     *            <code>-EnableTaskIAMRole</code> option is set when you launch
     *            the Amazon ECS-optimized Windows AMI. Your containers must
     *            also run some configuration code in order to take advantage of
     *            the feature. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/windows_task_IAM_roles.html"
     *            >Windows IAM Roles for Tasks</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withTaskRoleArn(String taskRoleArn) {
        this.taskRoleArn = taskRoleArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that grants the
     * Amazon ECS container agent permission to make AWS API calls on your
     * behalf. The task execution IAM role is required depending on the
     * requirements of your task. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html"
     * >Amazon ECS task execution IAM role</a> in the <i>Amazon Elastic
     * Container Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the task execution role that
     *         grants the Amazon ECS container agent permission to make AWS API
     *         calls on your behalf. The task execution IAM role is required
     *         depending on the requirements of your task. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html"
     *         >Amazon ECS task execution IAM role</a> in the <i>Amazon Elastic
     *         Container Service Developer Guide</i>.
     *         </p>
     */
    public String getExecutionRoleArn() {
        return executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that grants the
     * Amazon ECS container agent permission to make AWS API calls on your
     * behalf. The task execution IAM role is required depending on the
     * requirements of your task. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html"
     * >Amazon ECS task execution IAM role</a> in the <i>Amazon Elastic
     * Container Service Developer Guide</i>.
     * </p>
     *
     * @param executionRoleArn <p>
     *            The Amazon Resource Name (ARN) of the task execution role that
     *            grants the Amazon ECS container agent permission to make AWS
     *            API calls on your behalf. The task execution IAM role is
     *            required depending on the requirements of your task. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html"
     *            >Amazon ECS task execution IAM role</a> in the <i>Amazon
     *            Elastic Container Service Developer Guide</i>.
     *            </p>
     */
    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that grants the
     * Amazon ECS container agent permission to make AWS API calls on your
     * behalf. The task execution IAM role is required depending on the
     * requirements of your task. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html"
     * >Amazon ECS task execution IAM role</a> in the <i>Amazon Elastic
     * Container Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionRoleArn <p>
     *            The Amazon Resource Name (ARN) of the task execution role that
     *            grants the Amazon ECS container agent permission to make AWS
     *            API calls on your behalf. The task execution IAM role is
     *            required depending on the requirements of your task. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html"
     *            >Amazon ECS task execution IAM role</a> in the <i>Amazon
     *            Elastic Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The
     * valid values are <code>none</code>, <code>bridge</code>,
     * <code>awsvpc</code>, and <code>host</code>. The default Docker network
     * mode is <code>bridge</code>. If you are using the Fargate launch type,
     * the <code>awsvpc</code> network mode is required. If you are using the
     * EC2 launch type, any network mode can be used. If the network mode is set
     * to <code>none</code>, you cannot specify port mappings in your container
     * definitions, and the tasks containers do not have external connectivity.
     * The <code>host</code> and <code>awsvpc</code> network modes offer the
     * highest networking performance for containers because they use the EC2
     * network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed
     * container ports are mapped directly to the corresponding host port (for
     * the <code>host</code> network mode) or the attached elastic network
     * interface port (for the <code>awsvpc</code> network mode), so you cannot
     * take advantage of dynamic host port mappings.
     * </p>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an
     * elastic network interface, and you must specify a
     * <a>NetworkConfiguration</a> value when you create a service or run a task
     * with the task definition. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     * >Task Networking</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants
     * with the <code>ecs-init</code> package, or AWS Fargate infrastructure
     * support the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * If the network mode is <code>host</code>, you cannot run multiple
     * instantiations of the same task on a single container instance when port
     * mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux.
     * When you register a task definition with Windows containers, you must not
     * specify a network mode. If you use the console to register a task
     * definition with Windows containers, you must choose the
     * <code>&lt;default&gt;</code> network mode object.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#network-settings"
     * >Network settings</a> in the <i>Docker run reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bridge, host, awsvpc, none
     *
     * @return <p>
     *         The Docker networking mode to use for the containers in the task.
     *         The valid values are <code>none</code>, <code>bridge</code>,
     *         <code>awsvpc</code>, and <code>host</code>. The default Docker
     *         network mode is <code>bridge</code>. If you are using the Fargate
     *         launch type, the <code>awsvpc</code> network mode is required. If
     *         you are using the EC2 launch type, any network mode can be used.
     *         If the network mode is set to <code>none</code>, you cannot
     *         specify port mappings in your container definitions, and the
     *         tasks containers do not have external connectivity. The
     *         <code>host</code> and <code>awsvpc</code> network modes offer the
     *         highest networking performance for containers because they use
     *         the EC2 network stack instead of the virtualized network stack
     *         provided by the <code>bridge</code> mode.
     *         </p>
     *         <p>
     *         With the <code>host</code> and <code>awsvpc</code> network modes,
     *         exposed container ports are mapped directly to the corresponding
     *         host port (for the <code>host</code> network mode) or the
     *         attached elastic network interface port (for the
     *         <code>awsvpc</code> network mode), so you cannot take advantage
     *         of dynamic host port mappings.
     *         </p>
     *         <p>
     *         If the network mode is <code>awsvpc</code>, the task is allocated
     *         an elastic network interface, and you must specify a
     *         <a>NetworkConfiguration</a> value when you create a service or
     *         run a task with the task definition. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     *         >Task Networking</a> in the <i>Amazon Elastic Container Service
     *         Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         Currently, only Amazon ECS-optimized AMIs, other Amazon Linux
     *         variants with the <code>ecs-init</code> package, or AWS Fargate
     *         infrastructure support the <code>awsvpc</code> network mode.
     *         </p>
     *         </note>
     *         <p>
     *         If the network mode is <code>host</code>, you cannot run multiple
     *         instantiations of the same task on a single container instance
     *         when port mappings are used.
     *         </p>
     *         <p>
     *         Docker for Windows uses different network modes than Docker for
     *         Linux. When you register a task definition with Windows
     *         containers, you must not specify a network mode. If you use the
     *         console to register a task definition with Windows containers,
     *         you must choose the <code>&lt;default&gt;</code> network mode
     *         object.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.docker.com/engine/reference/run/#network-settings"
     *         >Network settings</a> in the <i>Docker run reference</i>.
     *         </p>
     * @see NetworkMode
     */
    public String getNetworkMode() {
        return networkMode;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The
     * valid values are <code>none</code>, <code>bridge</code>,
     * <code>awsvpc</code>, and <code>host</code>. The default Docker network
     * mode is <code>bridge</code>. If you are using the Fargate launch type,
     * the <code>awsvpc</code> network mode is required. If you are using the
     * EC2 launch type, any network mode can be used. If the network mode is set
     * to <code>none</code>, you cannot specify port mappings in your container
     * definitions, and the tasks containers do not have external connectivity.
     * The <code>host</code> and <code>awsvpc</code> network modes offer the
     * highest networking performance for containers because they use the EC2
     * network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed
     * container ports are mapped directly to the corresponding host port (for
     * the <code>host</code> network mode) or the attached elastic network
     * interface port (for the <code>awsvpc</code> network mode), so you cannot
     * take advantage of dynamic host port mappings.
     * </p>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an
     * elastic network interface, and you must specify a
     * <a>NetworkConfiguration</a> value when you create a service or run a task
     * with the task definition. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     * >Task Networking</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants
     * with the <code>ecs-init</code> package, or AWS Fargate infrastructure
     * support the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * If the network mode is <code>host</code>, you cannot run multiple
     * instantiations of the same task on a single container instance when port
     * mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux.
     * When you register a task definition with Windows containers, you must not
     * specify a network mode. If you use the console to register a task
     * definition with Windows containers, you must choose the
     * <code>&lt;default&gt;</code> network mode object.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#network-settings"
     * >Network settings</a> in the <i>Docker run reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bridge, host, awsvpc, none
     *
     * @param networkMode <p>
     *            The Docker networking mode to use for the containers in the
     *            task. The valid values are <code>none</code>,
     *            <code>bridge</code>, <code>awsvpc</code>, and
     *            <code>host</code>. The default Docker network mode is
     *            <code>bridge</code>. If you are using the Fargate launch type,
     *            the <code>awsvpc</code> network mode is required. If you are
     *            using the EC2 launch type, any network mode can be used. If
     *            the network mode is set to <code>none</code>, you cannot
     *            specify port mappings in your container definitions, and the
     *            tasks containers do not have external connectivity. The
     *            <code>host</code> and <code>awsvpc</code> network modes offer
     *            the highest networking performance for containers because they
     *            use the EC2 network stack instead of the virtualized network
     *            stack provided by the <code>bridge</code> mode.
     *            </p>
     *            <p>
     *            With the <code>host</code> and <code>awsvpc</code> network
     *            modes, exposed container ports are mapped directly to the
     *            corresponding host port (for the <code>host</code> network
     *            mode) or the attached elastic network interface port (for the
     *            <code>awsvpc</code> network mode), so you cannot take
     *            advantage of dynamic host port mappings.
     *            </p>
     *            <p>
     *            If the network mode is <code>awsvpc</code>, the task is
     *            allocated an elastic network interface, and you must specify a
     *            <a>NetworkConfiguration</a> value when you create a service or
     *            run a task with the task definition. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     *            >Task Networking</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            Currently, only Amazon ECS-optimized AMIs, other Amazon Linux
     *            variants with the <code>ecs-init</code> package, or AWS
     *            Fargate infrastructure support the <code>awsvpc</code> network
     *            mode.
     *            </p>
     *            </note>
     *            <p>
     *            If the network mode is <code>host</code>, you cannot run
     *            multiple instantiations of the same task on a single container
     *            instance when port mappings are used.
     *            </p>
     *            <p>
     *            Docker for Windows uses different network modes than Docker
     *            for Linux. When you register a task definition with Windows
     *            containers, you must not specify a network mode. If you use
     *            the console to register a task definition with Windows
     *            containers, you must choose the <code>&lt;default&gt;</code>
     *            network mode object.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.docker.com/engine/reference/run/#network-settings"
     *            >Network settings</a> in the <i>Docker run reference</i>.
     *            </p>
     * @see NetworkMode
     */
    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The
     * valid values are <code>none</code>, <code>bridge</code>,
     * <code>awsvpc</code>, and <code>host</code>. The default Docker network
     * mode is <code>bridge</code>. If you are using the Fargate launch type,
     * the <code>awsvpc</code> network mode is required. If you are using the
     * EC2 launch type, any network mode can be used. If the network mode is set
     * to <code>none</code>, you cannot specify port mappings in your container
     * definitions, and the tasks containers do not have external connectivity.
     * The <code>host</code> and <code>awsvpc</code> network modes offer the
     * highest networking performance for containers because they use the EC2
     * network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed
     * container ports are mapped directly to the corresponding host port (for
     * the <code>host</code> network mode) or the attached elastic network
     * interface port (for the <code>awsvpc</code> network mode), so you cannot
     * take advantage of dynamic host port mappings.
     * </p>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an
     * elastic network interface, and you must specify a
     * <a>NetworkConfiguration</a> value when you create a service or run a task
     * with the task definition. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     * >Task Networking</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants
     * with the <code>ecs-init</code> package, or AWS Fargate infrastructure
     * support the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * If the network mode is <code>host</code>, you cannot run multiple
     * instantiations of the same task on a single container instance when port
     * mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux.
     * When you register a task definition with Windows containers, you must not
     * specify a network mode. If you use the console to register a task
     * definition with Windows containers, you must choose the
     * <code>&lt;default&gt;</code> network mode object.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#network-settings"
     * >Network settings</a> in the <i>Docker run reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bridge, host, awsvpc, none
     *
     * @param networkMode <p>
     *            The Docker networking mode to use for the containers in the
     *            task. The valid values are <code>none</code>,
     *            <code>bridge</code>, <code>awsvpc</code>, and
     *            <code>host</code>. The default Docker network mode is
     *            <code>bridge</code>. If you are using the Fargate launch type,
     *            the <code>awsvpc</code> network mode is required. If you are
     *            using the EC2 launch type, any network mode can be used. If
     *            the network mode is set to <code>none</code>, you cannot
     *            specify port mappings in your container definitions, and the
     *            tasks containers do not have external connectivity. The
     *            <code>host</code> and <code>awsvpc</code> network modes offer
     *            the highest networking performance for containers because they
     *            use the EC2 network stack instead of the virtualized network
     *            stack provided by the <code>bridge</code> mode.
     *            </p>
     *            <p>
     *            With the <code>host</code> and <code>awsvpc</code> network
     *            modes, exposed container ports are mapped directly to the
     *            corresponding host port (for the <code>host</code> network
     *            mode) or the attached elastic network interface port (for the
     *            <code>awsvpc</code> network mode), so you cannot take
     *            advantage of dynamic host port mappings.
     *            </p>
     *            <p>
     *            If the network mode is <code>awsvpc</code>, the task is
     *            allocated an elastic network interface, and you must specify a
     *            <a>NetworkConfiguration</a> value when you create a service or
     *            run a task with the task definition. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     *            >Task Networking</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            Currently, only Amazon ECS-optimized AMIs, other Amazon Linux
     *            variants with the <code>ecs-init</code> package, or AWS
     *            Fargate infrastructure support the <code>awsvpc</code> network
     *            mode.
     *            </p>
     *            </note>
     *            <p>
     *            If the network mode is <code>host</code>, you cannot run
     *            multiple instantiations of the same task on a single container
     *            instance when port mappings are used.
     *            </p>
     *            <p>
     *            Docker for Windows uses different network modes than Docker
     *            for Linux. When you register a task definition with Windows
     *            containers, you must not specify a network mode. If you use
     *            the console to register a task definition with Windows
     *            containers, you must choose the <code>&lt;default&gt;</code>
     *            network mode object.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.docker.com/engine/reference/run/#network-settings"
     *            >Network settings</a> in the <i>Docker run reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NetworkMode
     */
    public TaskDefinition withNetworkMode(String networkMode) {
        this.networkMode = networkMode;
        return this;
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The
     * valid values are <code>none</code>, <code>bridge</code>,
     * <code>awsvpc</code>, and <code>host</code>. The default Docker network
     * mode is <code>bridge</code>. If you are using the Fargate launch type,
     * the <code>awsvpc</code> network mode is required. If you are using the
     * EC2 launch type, any network mode can be used. If the network mode is set
     * to <code>none</code>, you cannot specify port mappings in your container
     * definitions, and the tasks containers do not have external connectivity.
     * The <code>host</code> and <code>awsvpc</code> network modes offer the
     * highest networking performance for containers because they use the EC2
     * network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed
     * container ports are mapped directly to the corresponding host port (for
     * the <code>host</code> network mode) or the attached elastic network
     * interface port (for the <code>awsvpc</code> network mode), so you cannot
     * take advantage of dynamic host port mappings.
     * </p>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an
     * elastic network interface, and you must specify a
     * <a>NetworkConfiguration</a> value when you create a service or run a task
     * with the task definition. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     * >Task Networking</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants
     * with the <code>ecs-init</code> package, or AWS Fargate infrastructure
     * support the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * If the network mode is <code>host</code>, you cannot run multiple
     * instantiations of the same task on a single container instance when port
     * mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux.
     * When you register a task definition with Windows containers, you must not
     * specify a network mode. If you use the console to register a task
     * definition with Windows containers, you must choose the
     * <code>&lt;default&gt;</code> network mode object.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#network-settings"
     * >Network settings</a> in the <i>Docker run reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bridge, host, awsvpc, none
     *
     * @param networkMode <p>
     *            The Docker networking mode to use for the containers in the
     *            task. The valid values are <code>none</code>,
     *            <code>bridge</code>, <code>awsvpc</code>, and
     *            <code>host</code>. The default Docker network mode is
     *            <code>bridge</code>. If you are using the Fargate launch type,
     *            the <code>awsvpc</code> network mode is required. If you are
     *            using the EC2 launch type, any network mode can be used. If
     *            the network mode is set to <code>none</code>, you cannot
     *            specify port mappings in your container definitions, and the
     *            tasks containers do not have external connectivity. The
     *            <code>host</code> and <code>awsvpc</code> network modes offer
     *            the highest networking performance for containers because they
     *            use the EC2 network stack instead of the virtualized network
     *            stack provided by the <code>bridge</code> mode.
     *            </p>
     *            <p>
     *            With the <code>host</code> and <code>awsvpc</code> network
     *            modes, exposed container ports are mapped directly to the
     *            corresponding host port (for the <code>host</code> network
     *            mode) or the attached elastic network interface port (for the
     *            <code>awsvpc</code> network mode), so you cannot take
     *            advantage of dynamic host port mappings.
     *            </p>
     *            <p>
     *            If the network mode is <code>awsvpc</code>, the task is
     *            allocated an elastic network interface, and you must specify a
     *            <a>NetworkConfiguration</a> value when you create a service or
     *            run a task with the task definition. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     *            >Task Networking</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            Currently, only Amazon ECS-optimized AMIs, other Amazon Linux
     *            variants with the <code>ecs-init</code> package, or AWS
     *            Fargate infrastructure support the <code>awsvpc</code> network
     *            mode.
     *            </p>
     *            </note>
     *            <p>
     *            If the network mode is <code>host</code>, you cannot run
     *            multiple instantiations of the same task on a single container
     *            instance when port mappings are used.
     *            </p>
     *            <p>
     *            Docker for Windows uses different network modes than Docker
     *            for Linux. When you register a task definition with Windows
     *            containers, you must not specify a network mode. If you use
     *            the console to register a task definition with Windows
     *            containers, you must choose the <code>&lt;default&gt;</code>
     *            network mode object.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.docker.com/engine/reference/run/#network-settings"
     *            >Network settings</a> in the <i>Docker run reference</i>.
     *            </p>
     * @see NetworkMode
     */
    public void setNetworkMode(NetworkMode networkMode) {
        this.networkMode = networkMode.toString();
    }

    /**
     * <p>
     * The Docker networking mode to use for the containers in the task. The
     * valid values are <code>none</code>, <code>bridge</code>,
     * <code>awsvpc</code>, and <code>host</code>. The default Docker network
     * mode is <code>bridge</code>. If you are using the Fargate launch type,
     * the <code>awsvpc</code> network mode is required. If you are using the
     * EC2 launch type, any network mode can be used. If the network mode is set
     * to <code>none</code>, you cannot specify port mappings in your container
     * definitions, and the tasks containers do not have external connectivity.
     * The <code>host</code> and <code>awsvpc</code> network modes offer the
     * highest networking performance for containers because they use the EC2
     * network stack instead of the virtualized network stack provided by the
     * <code>bridge</code> mode.
     * </p>
     * <p>
     * With the <code>host</code> and <code>awsvpc</code> network modes, exposed
     * container ports are mapped directly to the corresponding host port (for
     * the <code>host</code> network mode) or the attached elastic network
     * interface port (for the <code>awsvpc</code> network mode), so you cannot
     * take advantage of dynamic host port mappings.
     * </p>
     * <p>
     * If the network mode is <code>awsvpc</code>, the task is allocated an
     * elastic network interface, and you must specify a
     * <a>NetworkConfiguration</a> value when you create a service or run a task
     * with the task definition. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     * >Task Networking</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants
     * with the <code>ecs-init</code> package, or AWS Fargate infrastructure
     * support the <code>awsvpc</code> network mode.
     * </p>
     * </note>
     * <p>
     * If the network mode is <code>host</code>, you cannot run multiple
     * instantiations of the same task on a single container instance when port
     * mappings are used.
     * </p>
     * <p>
     * Docker for Windows uses different network modes than Docker for Linux.
     * When you register a task definition with Windows containers, you must not
     * specify a network mode. If you use the console to register a task
     * definition with Windows containers, you must choose the
     * <code>&lt;default&gt;</code> network mode object.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#network-settings"
     * >Network settings</a> in the <i>Docker run reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bridge, host, awsvpc, none
     *
     * @param networkMode <p>
     *            The Docker networking mode to use for the containers in the
     *            task. The valid values are <code>none</code>,
     *            <code>bridge</code>, <code>awsvpc</code>, and
     *            <code>host</code>. The default Docker network mode is
     *            <code>bridge</code>. If you are using the Fargate launch type,
     *            the <code>awsvpc</code> network mode is required. If you are
     *            using the EC2 launch type, any network mode can be used. If
     *            the network mode is set to <code>none</code>, you cannot
     *            specify port mappings in your container definitions, and the
     *            tasks containers do not have external connectivity. The
     *            <code>host</code> and <code>awsvpc</code> network modes offer
     *            the highest networking performance for containers because they
     *            use the EC2 network stack instead of the virtualized network
     *            stack provided by the <code>bridge</code> mode.
     *            </p>
     *            <p>
     *            With the <code>host</code> and <code>awsvpc</code> network
     *            modes, exposed container ports are mapped directly to the
     *            corresponding host port (for the <code>host</code> network
     *            mode) or the attached elastic network interface port (for the
     *            <code>awsvpc</code> network mode), so you cannot take
     *            advantage of dynamic host port mappings.
     *            </p>
     *            <p>
     *            If the network mode is <code>awsvpc</code>, the task is
     *            allocated an elastic network interface, and you must specify a
     *            <a>NetworkConfiguration</a> value when you create a service or
     *            run a task with the task definition. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     *            >Task Networking</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            Currently, only Amazon ECS-optimized AMIs, other Amazon Linux
     *            variants with the <code>ecs-init</code> package, or AWS
     *            Fargate infrastructure support the <code>awsvpc</code> network
     *            mode.
     *            </p>
     *            </note>
     *            <p>
     *            If the network mode is <code>host</code>, you cannot run
     *            multiple instantiations of the same task on a single container
     *            instance when port mappings are used.
     *            </p>
     *            <p>
     *            Docker for Windows uses different network modes than Docker
     *            for Linux. When you register a task definition with Windows
     *            containers, you must not specify a network mode. If you use
     *            the console to register a task definition with Windows
     *            containers, you must choose the <code>&lt;default&gt;</code>
     *            network mode object.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.docker.com/engine/reference/run/#network-settings"
     *            >Network settings</a> in the <i>Docker run reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NetworkMode
     */
    public TaskDefinition withNetworkMode(NetworkMode networkMode) {
        this.networkMode = networkMode.toString();
        return this;
    }

    /**
     * <p>
     * The revision of the task in a particular family. The revision is a
     * version number of a task definition in a family. When you register a task
     * definition for the first time, the revision is <code>1</code>. Each time
     * that you register a new revision of a task definition in the same family,
     * the revision value always increases by one, even if you have deregistered
     * previous revisions in this family.
     * </p>
     *
     * @return <p>
     *         The revision of the task in a particular family. The revision is
     *         a version number of a task definition in a family. When you
     *         register a task definition for the first time, the revision is
     *         <code>1</code>. Each time that you register a new revision of a
     *         task definition in the same family, the revision value always
     *         increases by one, even if you have deregistered previous
     *         revisions in this family.
     *         </p>
     */
    public Integer getRevision() {
        return revision;
    }

    /**
     * <p>
     * The revision of the task in a particular family. The revision is a
     * version number of a task definition in a family. When you register a task
     * definition for the first time, the revision is <code>1</code>. Each time
     * that you register a new revision of a task definition in the same family,
     * the revision value always increases by one, even if you have deregistered
     * previous revisions in this family.
     * </p>
     *
     * @param revision <p>
     *            The revision of the task in a particular family. The revision
     *            is a version number of a task definition in a family. When you
     *            register a task definition for the first time, the revision is
     *            <code>1</code>. Each time that you register a new revision of
     *            a task definition in the same family, the revision value
     *            always increases by one, even if you have deregistered
     *            previous revisions in this family.
     *            </p>
     */
    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of the task in a particular family. The revision is a
     * version number of a task definition in a family. When you register a task
     * definition for the first time, the revision is <code>1</code>. Each time
     * that you register a new revision of a task definition in the same family,
     * the revision value always increases by one, even if you have deregistered
     * previous revisions in this family.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revision <p>
     *            The revision of the task in a particular family. The revision
     *            is a version number of a task definition in a family. When you
     *            register a task definition for the first time, the revision is
     *            <code>1</code>. Each time that you register a new revision of
     *            a task definition in the same family, the revision value
     *            always increases by one, even if you have deregistered
     *            previous revisions in this family.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withRevision(Integer revision) {
        this.revision = revision;
        return this;
    }

    /**
     * <p>
     * The list of volume definitions for the task.
     * </p>
     * <p>
     * If your tasks are using the Fargate launch type, the <code>host</code>
     * and <code>sourcePath</code> parameters are not supported.
     * </p>
     * <p>
     * For more information about volume definition parameters and defaults, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definitions.html"
     * >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The list of volume definitions for the task.
     *         </p>
     *         <p>
     *         If your tasks are using the Fargate launch type, the
     *         <code>host</code> and <code>sourcePath</code> parameters are not
     *         supported.
     *         </p>
     *         <p>
     *         For more information about volume definition parameters and
     *         defaults, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definitions.html"
     *         >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic
     *         Container Service Developer Guide</i>.
     *         </p>
     */
    public java.util.List<Volume> getVolumes() {
        return volumes;
    }

    /**
     * <p>
     * The list of volume definitions for the task.
     * </p>
     * <p>
     * If your tasks are using the Fargate launch type, the <code>host</code>
     * and <code>sourcePath</code> parameters are not supported.
     * </p>
     * <p>
     * For more information about volume definition parameters and defaults, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definitions.html"
     * >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @param volumes <p>
     *            The list of volume definitions for the task.
     *            </p>
     *            <p>
     *            If your tasks are using the Fargate launch type, the
     *            <code>host</code> and <code>sourcePath</code> parameters are
     *            not supported.
     *            </p>
     *            <p>
     *            For more information about volume definition parameters and
     *            defaults, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definitions.html"
     *            >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     */
    public void setVolumes(java.util.Collection<Volume> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new java.util.ArrayList<Volume>(volumes);
    }

    /**
     * <p>
     * The list of volume definitions for the task.
     * </p>
     * <p>
     * If your tasks are using the Fargate launch type, the <code>host</code>
     * and <code>sourcePath</code> parameters are not supported.
     * </p>
     * <p>
     * For more information about volume definition parameters and defaults, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definitions.html"
     * >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumes <p>
     *            The list of volume definitions for the task.
     *            </p>
     *            <p>
     *            If your tasks are using the Fargate launch type, the
     *            <code>host</code> and <code>sourcePath</code> parameters are
     *            not supported.
     *            </p>
     *            <p>
     *            For more information about volume definition parameters and
     *            defaults, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definitions.html"
     *            >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withVolumes(Volume... volumes) {
        if (getVolumes() == null) {
            this.volumes = new java.util.ArrayList<Volume>(volumes.length);
        }
        for (Volume value : volumes) {
            this.volumes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of volume definitions for the task.
     * </p>
     * <p>
     * If your tasks are using the Fargate launch type, the <code>host</code>
     * and <code>sourcePath</code> parameters are not supported.
     * </p>
     * <p>
     * For more information about volume definition parameters and defaults, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definitions.html"
     * >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumes <p>
     *            The list of volume definitions for the task.
     *            </p>
     *            <p>
     *            If your tasks are using the Fargate launch type, the
     *            <code>host</code> and <code>sourcePath</code> parameters are
     *            not supported.
     *            </p>
     *            <p>
     *            For more information about volume definition parameters and
     *            defaults, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definitions.html"
     *            >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withVolumes(java.util.Collection<Volume> volumes) {
        setVolumes(volumes);
        return this;
    }

    /**
     * <p>
     * The status of the task definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @return <p>
     *         The status of the task definition.
     *         </p>
     * @see TaskDefinitionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the task definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the task definition.
     *            </p>
     * @see TaskDefinitionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the task definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the task definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskDefinitionStatus
     */
    public TaskDefinition withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the task definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the task definition.
     *            </p>
     * @see TaskDefinitionStatus
     */
    public void setStatus(TaskDefinitionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the task definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the task definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskDefinitionStatus
     */
    public TaskDefinition withStatus(TaskDefinitionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The container instance attributes required by your task. This field is
     * not valid if you are using the Fargate launch type for your task.
     * </p>
     *
     * @return <p>
     *         The container instance attributes required by your task. This
     *         field is not valid if you are using the Fargate launch type for
     *         your task.
     *         </p>
     */
    public java.util.List<Attribute> getRequiresAttributes() {
        return requiresAttributes;
    }

    /**
     * <p>
     * The container instance attributes required by your task. This field is
     * not valid if you are using the Fargate launch type for your task.
     * </p>
     *
     * @param requiresAttributes <p>
     *            The container instance attributes required by your task. This
     *            field is not valid if you are using the Fargate launch type
     *            for your task.
     *            </p>
     */
    public void setRequiresAttributes(java.util.Collection<Attribute> requiresAttributes) {
        if (requiresAttributes == null) {
            this.requiresAttributes = null;
            return;
        }

        this.requiresAttributes = new java.util.ArrayList<Attribute>(requiresAttributes);
    }

    /**
     * <p>
     * The container instance attributes required by your task. This field is
     * not valid if you are using the Fargate launch type for your task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requiresAttributes <p>
     *            The container instance attributes required by your task. This
     *            field is not valid if you are using the Fargate launch type
     *            for your task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withRequiresAttributes(Attribute... requiresAttributes) {
        if (getRequiresAttributes() == null) {
            this.requiresAttributes = new java.util.ArrayList<Attribute>(requiresAttributes.length);
        }
        for (Attribute value : requiresAttributes) {
            this.requiresAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The container instance attributes required by your task. This field is
     * not valid if you are using the Fargate launch type for your task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requiresAttributes <p>
     *            The container instance attributes required by your task. This
     *            field is not valid if you are using the Fargate launch type
     *            for your task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withRequiresAttributes(java.util.Collection<Attribute> requiresAttributes) {
        setRequiresAttributes(requiresAttributes);
        return this;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for tasks. This field is
     * not valid if you are using the Fargate launch type for your task.
     * </p>
     *
     * @return <p>
     *         An array of placement constraint objects to use for tasks. This
     *         field is not valid if you are using the Fargate launch type for
     *         your task.
     *         </p>
     */
    public java.util.List<TaskDefinitionPlacementConstraint> getPlacementConstraints() {
        return placementConstraints;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for tasks. This field is
     * not valid if you are using the Fargate launch type for your task.
     * </p>
     *
     * @param placementConstraints <p>
     *            An array of placement constraint objects to use for tasks.
     *            This field is not valid if you are using the Fargate launch
     *            type for your task.
     *            </p>
     */
    public void setPlacementConstraints(
            java.util.Collection<TaskDefinitionPlacementConstraint> placementConstraints) {
        if (placementConstraints == null) {
            this.placementConstraints = null;
            return;
        }

        this.placementConstraints = new java.util.ArrayList<TaskDefinitionPlacementConstraint>(
                placementConstraints);
    }

    /**
     * <p>
     * An array of placement constraint objects to use for tasks. This field is
     * not valid if you are using the Fargate launch type for your task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementConstraints <p>
     *            An array of placement constraint objects to use for tasks.
     *            This field is not valid if you are using the Fargate launch
     *            type for your task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withPlacementConstraints(
            TaskDefinitionPlacementConstraint... placementConstraints) {
        if (getPlacementConstraints() == null) {
            this.placementConstraints = new java.util.ArrayList<TaskDefinitionPlacementConstraint>(
                    placementConstraints.length);
        }
        for (TaskDefinitionPlacementConstraint value : placementConstraints) {
            this.placementConstraints.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for tasks. This field is
     * not valid if you are using the Fargate launch type for your task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementConstraints <p>
     *            An array of placement constraint objects to use for tasks.
     *            This field is not valid if you are using the Fargate launch
     *            type for your task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withPlacementConstraints(
            java.util.Collection<TaskDefinitionPlacementConstraint> placementConstraints) {
        setPlacementConstraints(placementConstraints);
        return this;
    }

    /**
     * <p>
     * The launch type to use with your task. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The launch type to use with your task. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *         >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container
     *         Service Developer Guide</i>.
     *         </p>
     */
    public java.util.List<String> getCompatibilities() {
        return compatibilities;
    }

    /**
     * <p>
     * The launch type to use with your task. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     *
     * @param compatibilities <p>
     *            The launch type to use with your task. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     */
    public void setCompatibilities(java.util.Collection<String> compatibilities) {
        if (compatibilities == null) {
            this.compatibilities = null;
            return;
        }

        this.compatibilities = new java.util.ArrayList<String>(compatibilities);
    }

    /**
     * <p>
     * The launch type to use with your task. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compatibilities <p>
     *            The launch type to use with your task. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withCompatibilities(String... compatibilities) {
        if (getCompatibilities() == null) {
            this.compatibilities = new java.util.ArrayList<String>(compatibilities.length);
        }
        for (String value : compatibilities) {
            this.compatibilities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The launch type to use with your task. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compatibilities <p>
     *            The launch type to use with your task. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withCompatibilities(java.util.Collection<String> compatibilities) {
        setCompatibilities(compatibilities);
        return this;
    }

    /**
     * <p>
     * The launch type the task requires. If no value is specified, it will
     * default to <code>EC2</code>. Valid values include <code>EC2</code> and
     * <code>FARGATE</code>.
     * </p>
     *
     * @return <p>
     *         The launch type the task requires. If no value is specified, it
     *         will default to <code>EC2</code>. Valid values include
     *         <code>EC2</code> and <code>FARGATE</code>.
     *         </p>
     */
    public java.util.List<String> getRequiresCompatibilities() {
        return requiresCompatibilities;
    }

    /**
     * <p>
     * The launch type the task requires. If no value is specified, it will
     * default to <code>EC2</code>. Valid values include <code>EC2</code> and
     * <code>FARGATE</code>.
     * </p>
     *
     * @param requiresCompatibilities <p>
     *            The launch type the task requires. If no value is specified,
     *            it will default to <code>EC2</code>. Valid values include
     *            <code>EC2</code> and <code>FARGATE</code>.
     *            </p>
     */
    public void setRequiresCompatibilities(java.util.Collection<String> requiresCompatibilities) {
        if (requiresCompatibilities == null) {
            this.requiresCompatibilities = null;
            return;
        }

        this.requiresCompatibilities = new java.util.ArrayList<String>(requiresCompatibilities);
    }

    /**
     * <p>
     * The launch type the task requires. If no value is specified, it will
     * default to <code>EC2</code>. Valid values include <code>EC2</code> and
     * <code>FARGATE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requiresCompatibilities <p>
     *            The launch type the task requires. If no value is specified,
     *            it will default to <code>EC2</code>. Valid values include
     *            <code>EC2</code> and <code>FARGATE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withRequiresCompatibilities(String... requiresCompatibilities) {
        if (getRequiresCompatibilities() == null) {
            this.requiresCompatibilities = new java.util.ArrayList<String>(
                    requiresCompatibilities.length);
        }
        for (String value : requiresCompatibilities) {
            this.requiresCompatibilities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The launch type the task requires. If no value is specified, it will
     * default to <code>EC2</code>. Valid values include <code>EC2</code> and
     * <code>FARGATE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requiresCompatibilities <p>
     *            The launch type the task requires. If no value is specified,
     *            it will default to <code>EC2</code>. Valid values include
     *            <code>EC2</code> and <code>FARGATE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withRequiresCompatibilities(
            java.util.Collection<String> requiresCompatibilities) {
        setRequiresCompatibilities(requiresCompatibilities);
        return this;
    }

    /**
     * <p>
     * The number of <code>cpu</code> units used by the task. If you are using
     * the EC2 launch type, this field is optional and any value can be used. If
     * you are using the Fargate launch type, this field is required and you
     * must use one of the following values, which determines your range of
     * valid values for the <code>memory</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024
     * (1 GB), 2048 (2 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048
     * (2 GB), 3072 (3 GB), 4096 (4 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072
     * (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB)
     * and 16384 (16 GB) in increments of 1024 (1 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB)
     * and 30720 (30 GB) in increments of 1024 (1 GB)
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The number of <code>cpu</code> units used by the task. If you are
     *         using the EC2 launch type, this field is optional and any value
     *         can be used. If you are using the Fargate launch type, this field
     *         is required and you must use one of the following values, which
     *         determines your range of valid values for the <code>memory</code>
     *         parameter:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5
     *         GB), 1024 (1 GB), 2048 (2 GB)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1
     *         GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2
     *         GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7
     *         GB), 8192 (8 GB)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2048 (2 vCPU) - Available <code>memory</code> values: Between
     *         4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4096 (4 vCPU) - Available <code>memory</code> values: Between
     *         8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB)
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * <p>
     * The number of <code>cpu</code> units used by the task. If you are using
     * the EC2 launch type, this field is optional and any value can be used. If
     * you are using the Fargate launch type, this field is required and you
     * must use one of the following values, which determines your range of
     * valid values for the <code>memory</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024
     * (1 GB), 2048 (2 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048
     * (2 GB), 3072 (3 GB), 4096 (4 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072
     * (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB)
     * and 16384 (16 GB) in increments of 1024 (1 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB)
     * and 30720 (30 GB) in increments of 1024 (1 GB)
     * </p>
     * </li>
     * </ul>
     *
     * @param cpu <p>
     *            The number of <code>cpu</code> units used by the task. If you
     *            are using the EC2 launch type, this field is optional and any
     *            value can be used. If you are using the Fargate launch type,
     *            this field is required and you must use one of the following
     *            values, which determines your range of valid values for the
     *            <code>memory</code> parameter:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            256 (.25 vCPU) - Available <code>memory</code> values: 512
     *            (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1
     *            GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2
     *            GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168
     *            (7 GB), 8192 (8 GB)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            2048 (2 vCPU) - Available <code>memory</code> values: Between
     *            4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            4096 (4 vCPU) - Available <code>memory</code> values: Between
     *            8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB)
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The number of <code>cpu</code> units used by the task. If you are using
     * the EC2 launch type, this field is optional and any value can be used. If
     * you are using the Fargate launch type, this field is required and you
     * must use one of the following values, which determines your range of
     * valid values for the <code>memory</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 256 (.25 vCPU) - Available <code>memory</code> values: 512 (0.5 GB), 1024
     * (1 GB), 2048 (2 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1 GB), 2048
     * (2 GB), 3072 (3 GB), 4096 (4 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2 GB), 3072
     * (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 vCPU) - Available <code>memory</code> values: Between 4096 (4 GB)
     * and 16384 (16 GB) in increments of 1024 (1 GB)
     * </p>
     * </li>
     * <li>
     * <p>
     * 4096 (4 vCPU) - Available <code>memory</code> values: Between 8192 (8 GB)
     * and 30720 (30 GB) in increments of 1024 (1 GB)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cpu <p>
     *            The number of <code>cpu</code> units used by the task. If you
     *            are using the EC2 launch type, this field is optional and any
     *            value can be used. If you are using the Fargate launch type,
     *            this field is required and you must use one of the following
     *            values, which determines your range of valid values for the
     *            <code>memory</code> parameter:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            256 (.25 vCPU) - Available <code>memory</code> values: 512
     *            (0.5 GB), 1024 (1 GB), 2048 (2 GB)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            512 (.5 vCPU) - Available <code>memory</code> values: 1024 (1
     *            GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1024 (1 vCPU) - Available <code>memory</code> values: 2048 (2
     *            GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168
     *            (7 GB), 8192 (8 GB)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            2048 (2 vCPU) - Available <code>memory</code> values: Between
     *            4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            4096 (4 vCPU) - Available <code>memory</code> values: Between
     *            8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB)
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * <p>
     * The amount (in MiB) of memory used by the task.
     * </p>
     * <p>
     * If using the EC2 launch type, this field is optional and any value can be
     * used. If a task-level memory value is specified then the container-level
     * memory value is optional.
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use
     * one of the following values, which determines your range of valid values
     * for the <code>cpu</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code>
     * values: 256 (.25 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available
     * <code>cpu</code> values: 512 (.5 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7
     * GB), 8192 (8 GB) - Available <code>cpu</code> values: 1024 (1 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) -
     * Available <code>cpu</code> values: 2048 (2 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) -
     * Available <code>cpu</code> values: 4096 (4 vCPU)
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The amount (in MiB) of memory used by the task.
     *         </p>
     *         <p>
     *         If using the EC2 launch type, this field is optional and any
     *         value can be used. If a task-level memory value is specified then
     *         the container-level memory value is optional.
     *         </p>
     *         <p>
     *         If using the Fargate launch type, this field is required and you
     *         must use one of the following values, which determines your range
     *         of valid values for the <code>cpu</code> parameter:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available
     *         <code>cpu</code> values: 256 (.25 vCPU)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available
     *         <code>cpu</code> values: 512 (.5 vCPU)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB),
     *         7168 (7 GB), 8192 (8 GB) - Available <code>cpu</code> values:
     *         1024 (1 vCPU)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1
     *         GB) - Available <code>cpu</code> values: 2048 (2 vCPU)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1
     *         GB) - Available <code>cpu</code> values: 4096 (4 vCPU)
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getMemory() {
        return memory;
    }

    /**
     * <p>
     * The amount (in MiB) of memory used by the task.
     * </p>
     * <p>
     * If using the EC2 launch type, this field is optional and any value can be
     * used. If a task-level memory value is specified then the container-level
     * memory value is optional.
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use
     * one of the following values, which determines your range of valid values
     * for the <code>cpu</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code>
     * values: 256 (.25 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available
     * <code>cpu</code> values: 512 (.5 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7
     * GB), 8192 (8 GB) - Available <code>cpu</code> values: 1024 (1 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) -
     * Available <code>cpu</code> values: 2048 (2 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) -
     * Available <code>cpu</code> values: 4096 (4 vCPU)
     * </p>
     * </li>
     * </ul>
     *
     * @param memory <p>
     *            The amount (in MiB) of memory used by the task.
     *            </p>
     *            <p>
     *            If using the EC2 launch type, this field is optional and any
     *            value can be used. If a task-level memory value is specified
     *            then the container-level memory value is optional.
     *            </p>
     *            <p>
     *            If using the Fargate launch type, this field is required and
     *            you must use one of the following values, which determines
     *            your range of valid values for the <code>cpu</code> parameter:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available
     *            <code>cpu</code> values: 256 (.25 vCPU)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available
     *            <code>cpu</code> values: 512 (.5 vCPU)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6
     *            GB), 7168 (7 GB), 8192 (8 GB) - Available <code>cpu</code>
     *            values: 1024 (1 vCPU)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1
     *            GB) - Available <code>cpu</code> values: 2048 (2 vCPU)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1
     *            GB) - Available <code>cpu</code> values: 4096 (4 vCPU)
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The amount (in MiB) of memory used by the task.
     * </p>
     * <p>
     * If using the EC2 launch type, this field is optional and any value can be
     * used. If a task-level memory value is specified then the container-level
     * memory value is optional.
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use
     * one of the following values, which determines your range of valid values
     * for the <code>cpu</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available <code>cpu</code>
     * values: 256 (.25 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available
     * <code>cpu</code> values: 512 (.5 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7
     * GB), 8192 (8 GB) - Available <code>cpu</code> values: 1024 (1 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) -
     * Available <code>cpu</code> values: 2048 (2 vCPU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) -
     * Available <code>cpu</code> values: 4096 (4 vCPU)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memory <p>
     *            The amount (in MiB) of memory used by the task.
     *            </p>
     *            <p>
     *            If using the EC2 launch type, this field is optional and any
     *            value can be used. If a task-level memory value is specified
     *            then the container-level memory value is optional.
     *            </p>
     *            <p>
     *            If using the Fargate launch type, this field is required and
     *            you must use one of the following values, which determines
     *            your range of valid values for the <code>cpu</code> parameter:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available
     *            <code>cpu</code> values: 256 (.25 vCPU)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available
     *            <code>cpu</code> values: 512 (.5 vCPU)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6
     *            GB), 7168 (7 GB), 8192 (8 GB) - Available <code>cpu</code>
     *            values: 1024 (1 vCPU)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1
     *            GB) - Available <code>cpu</code> values: 2048 (2 vCPU)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1
     *            GB) - Available <code>cpu</code> values: 4096 (4 vCPU)
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * <p>
     * The Elastic Inference accelerator associated with the task.
     * </p>
     *
     * @return <p>
     *         The Elastic Inference accelerator associated with the task.
     *         </p>
     */
    public java.util.List<InferenceAccelerator> getInferenceAccelerators() {
        return inferenceAccelerators;
    }

    /**
     * <p>
     * The Elastic Inference accelerator associated with the task.
     * </p>
     *
     * @param inferenceAccelerators <p>
     *            The Elastic Inference accelerator associated with the task.
     *            </p>
     */
    public void setInferenceAccelerators(
            java.util.Collection<InferenceAccelerator> inferenceAccelerators) {
        if (inferenceAccelerators == null) {
            this.inferenceAccelerators = null;
            return;
        }

        this.inferenceAccelerators = new java.util.ArrayList<InferenceAccelerator>(
                inferenceAccelerators);
    }

    /**
     * <p>
     * The Elastic Inference accelerator associated with the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inferenceAccelerators <p>
     *            The Elastic Inference accelerator associated with the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withInferenceAccelerators(InferenceAccelerator... inferenceAccelerators) {
        if (getInferenceAccelerators() == null) {
            this.inferenceAccelerators = new java.util.ArrayList<InferenceAccelerator>(
                    inferenceAccelerators.length);
        }
        for (InferenceAccelerator value : inferenceAccelerators) {
            this.inferenceAccelerators.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Elastic Inference accelerator associated with the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inferenceAccelerators <p>
     *            The Elastic Inference accelerator associated with the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withInferenceAccelerators(
            java.util.Collection<InferenceAccelerator> inferenceAccelerators) {
        setInferenceAccelerators(inferenceAccelerators);
        return this;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid
     * values are <code>host</code> or <code>task</code>. If <code>host</code>
     * is specified, then all containers within the tasks that specified the
     * <code>host</code> PID mode on the same container instance share the same
     * process namespace with the host Amazon EC2 instance. If <code>task</code>
     * is specified, all containers within the specified task share the same
     * process namespace. If no value is specified, the default is a private
     * namespace. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid"
     * >PID settings</a> in the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> PID mode is used, be aware that there is a
     * heightened risk of undesired process namespace expose. For more
     * information, see <a
     * href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the
     * Fargate launch type.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>host, task
     *
     * @return <p>
     *         The process namespace to use for the containers in the task. The
     *         valid values are <code>host</code> or <code>task</code>. If
     *         <code>host</code> is specified, then all containers within the
     *         tasks that specified the <code>host</code> PID mode on the same
     *         container instance share the same process namespace with the host
     *         Amazon EC2 instance. If <code>task</code> is specified, all
     *         containers within the specified task share the same process
     *         namespace. If no value is specified, the default is a private
     *         namespace. For more information, see <a href=
     *         "https://docs.docker.com/engine/reference/run/#pid-settings---pid"
     *         >PID settings</a> in the <i>Docker run reference</i>.
     *         </p>
     *         <p>
     *         If the <code>host</code> PID mode is used, be aware that there is
     *         a heightened risk of undesired process namespace expose. For more
     *         information, see <a
     *         href="https://docs.docker.com/engine/security/security/">Docker
     *         security</a>.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter is not supported for Windows containers or tasks
     *         using the Fargate launch type.
     *         </p>
     *         </note>
     * @see PidMode
     */
    public String getPidMode() {
        return pidMode;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid
     * values are <code>host</code> or <code>task</code>. If <code>host</code>
     * is specified, then all containers within the tasks that specified the
     * <code>host</code> PID mode on the same container instance share the same
     * process namespace with the host Amazon EC2 instance. If <code>task</code>
     * is specified, all containers within the specified task share the same
     * process namespace. If no value is specified, the default is a private
     * namespace. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid"
     * >PID settings</a> in the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> PID mode is used, be aware that there is a
     * heightened risk of undesired process namespace expose. For more
     * information, see <a
     * href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the
     * Fargate launch type.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>host, task
     *
     * @param pidMode <p>
     *            The process namespace to use for the containers in the task.
     *            The valid values are <code>host</code> or <code>task</code>.
     *            If <code>host</code> is specified, then all containers within
     *            the tasks that specified the <code>host</code> PID mode on the
     *            same container instance share the same process namespace with
     *            the host Amazon EC2 instance. If <code>task</code> is
     *            specified, all containers within the specified task share the
     *            same process namespace. If no value is specified, the default
     *            is a private namespace. For more information, see <a href=
     *            "https://docs.docker.com/engine/reference/run/#pid-settings---pid"
     *            >PID settings</a> in the <i>Docker run reference</i>.
     *            </p>
     *            <p>
     *            If the <code>host</code> PID mode is used, be aware that there
     *            is a heightened risk of undesired process namespace expose.
     *            For more information, see <a
     *            href="https://docs.docker.com/engine/security/security/"
     *            >Docker security</a>.
     *            </p>
     *            <note>
     *            <p>
     *            This parameter is not supported for Windows containers or
     *            tasks using the Fargate launch type.
     *            </p>
     *            </note>
     * @see PidMode
     */
    public void setPidMode(String pidMode) {
        this.pidMode = pidMode;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid
     * values are <code>host</code> or <code>task</code>. If <code>host</code>
     * is specified, then all containers within the tasks that specified the
     * <code>host</code> PID mode on the same container instance share the same
     * process namespace with the host Amazon EC2 instance. If <code>task</code>
     * is specified, all containers within the specified task share the same
     * process namespace. If no value is specified, the default is a private
     * namespace. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid"
     * >PID settings</a> in the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> PID mode is used, be aware that there is a
     * heightened risk of undesired process namespace expose. For more
     * information, see <a
     * href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the
     * Fargate launch type.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>host, task
     *
     * @param pidMode <p>
     *            The process namespace to use for the containers in the task.
     *            The valid values are <code>host</code> or <code>task</code>.
     *            If <code>host</code> is specified, then all containers within
     *            the tasks that specified the <code>host</code> PID mode on the
     *            same container instance share the same process namespace with
     *            the host Amazon EC2 instance. If <code>task</code> is
     *            specified, all containers within the specified task share the
     *            same process namespace. If no value is specified, the default
     *            is a private namespace. For more information, see <a href=
     *            "https://docs.docker.com/engine/reference/run/#pid-settings---pid"
     *            >PID settings</a> in the <i>Docker run reference</i>.
     *            </p>
     *            <p>
     *            If the <code>host</code> PID mode is used, be aware that there
     *            is a heightened risk of undesired process namespace expose.
     *            For more information, see <a
     *            href="https://docs.docker.com/engine/security/security/"
     *            >Docker security</a>.
     *            </p>
     *            <note>
     *            <p>
     *            This parameter is not supported for Windows containers or
     *            tasks using the Fargate launch type.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PidMode
     */
    public TaskDefinition withPidMode(String pidMode) {
        this.pidMode = pidMode;
        return this;
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid
     * values are <code>host</code> or <code>task</code>. If <code>host</code>
     * is specified, then all containers within the tasks that specified the
     * <code>host</code> PID mode on the same container instance share the same
     * process namespace with the host Amazon EC2 instance. If <code>task</code>
     * is specified, all containers within the specified task share the same
     * process namespace. If no value is specified, the default is a private
     * namespace. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid"
     * >PID settings</a> in the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> PID mode is used, be aware that there is a
     * heightened risk of undesired process namespace expose. For more
     * information, see <a
     * href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the
     * Fargate launch type.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>host, task
     *
     * @param pidMode <p>
     *            The process namespace to use for the containers in the task.
     *            The valid values are <code>host</code> or <code>task</code>.
     *            If <code>host</code> is specified, then all containers within
     *            the tasks that specified the <code>host</code> PID mode on the
     *            same container instance share the same process namespace with
     *            the host Amazon EC2 instance. If <code>task</code> is
     *            specified, all containers within the specified task share the
     *            same process namespace. If no value is specified, the default
     *            is a private namespace. For more information, see <a href=
     *            "https://docs.docker.com/engine/reference/run/#pid-settings---pid"
     *            >PID settings</a> in the <i>Docker run reference</i>.
     *            </p>
     *            <p>
     *            If the <code>host</code> PID mode is used, be aware that there
     *            is a heightened risk of undesired process namespace expose.
     *            For more information, see <a
     *            href="https://docs.docker.com/engine/security/security/"
     *            >Docker security</a>.
     *            </p>
     *            <note>
     *            <p>
     *            This parameter is not supported for Windows containers or
     *            tasks using the Fargate launch type.
     *            </p>
     *            </note>
     * @see PidMode
     */
    public void setPidMode(PidMode pidMode) {
        this.pidMode = pidMode.toString();
    }

    /**
     * <p>
     * The process namespace to use for the containers in the task. The valid
     * values are <code>host</code> or <code>task</code>. If <code>host</code>
     * is specified, then all containers within the tasks that specified the
     * <code>host</code> PID mode on the same container instance share the same
     * process namespace with the host Amazon EC2 instance. If <code>task</code>
     * is specified, all containers within the specified task share the same
     * process namespace. If no value is specified, the default is a private
     * namespace. For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#pid-settings---pid"
     * >PID settings</a> in the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> PID mode is used, be aware that there is a
     * heightened risk of undesired process namespace expose. For more
     * information, see <a
     * href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the
     * Fargate launch type.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>host, task
     *
     * @param pidMode <p>
     *            The process namespace to use for the containers in the task.
     *            The valid values are <code>host</code> or <code>task</code>.
     *            If <code>host</code> is specified, then all containers within
     *            the tasks that specified the <code>host</code> PID mode on the
     *            same container instance share the same process namespace with
     *            the host Amazon EC2 instance. If <code>task</code> is
     *            specified, all containers within the specified task share the
     *            same process namespace. If no value is specified, the default
     *            is a private namespace. For more information, see <a href=
     *            "https://docs.docker.com/engine/reference/run/#pid-settings---pid"
     *            >PID settings</a> in the <i>Docker run reference</i>.
     *            </p>
     *            <p>
     *            If the <code>host</code> PID mode is used, be aware that there
     *            is a heightened risk of undesired process namespace expose.
     *            For more information, see <a
     *            href="https://docs.docker.com/engine/security/security/"
     *            >Docker security</a>.
     *            </p>
     *            <note>
     *            <p>
     *            This parameter is not supported for Windows containers or
     *            tasks using the Fargate launch type.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PidMode
     */
    public TaskDefinition withPidMode(PidMode pidMode) {
        this.pidMode = pidMode.toString();
        return this;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The
     * valid values are <code>host</code>, <code>task</code>, or
     * <code>none</code>. If <code>host</code> is specified, then all containers
     * within the tasks that specified the <code>host</code> IPC mode on the
     * same container instance share the same IPC resources with the host Amazon
     * EC2 instance. If <code>task</code> is specified, all containers within
     * the specified task share the same IPC resources. If <code>none</code> is
     * specified, then IPC resources within the containers of a task are private
     * and not shared with other containers in a task or on the container
     * instance. If no value is specified, then the IPC resource namespace
     * sharing depends on the Docker daemon setting on the container instance.
     * For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc"
     * >IPC settings</a> in the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> IPC mode is used, be aware that there is a
     * heightened risk of undesired IPC namespace expose. For more information,
     * see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <p>
     * If you are setting namespaced kernel parameters using
     * <code>systemControls</code> for the containers in the task, the following
     * will apply to your IPC resource namespace. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html"
     * >System Controls</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tasks that use the <code>host</code> IPC mode, IPC namespace related
     * <code>systemControls</code> are not supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tasks that use the <code>task</code> IPC mode, IPC namespace related
     * <code>systemControls</code> will apply to all containers within a task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the
     * Fargate launch type.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>host, task, none
     *
     * @return <p>
     *         The IPC resource namespace to use for the containers in the task.
     *         The valid values are <code>host</code>, <code>task</code>, or
     *         <code>none</code>. If <code>host</code> is specified, then all
     *         containers within the tasks that specified the <code>host</code>
     *         IPC mode on the same container instance share the same IPC
     *         resources with the host Amazon EC2 instance. If <code>task</code>
     *         is specified, all containers within the specified task share the
     *         same IPC resources. If <code>none</code> is specified, then IPC
     *         resources within the containers of a task are private and not
     *         shared with other containers in a task or on the container
     *         instance. If no value is specified, then the IPC resource
     *         namespace sharing depends on the Docker daemon setting on the
     *         container instance. For more information, see <a href=
     *         "https://docs.docker.com/engine/reference/run/#ipc-settings---ipc"
     *         >IPC settings</a> in the <i>Docker run reference</i>.
     *         </p>
     *         <p>
     *         If the <code>host</code> IPC mode is used, be aware that there is
     *         a heightened risk of undesired IPC namespace expose. For more
     *         information, see <a
     *         href="https://docs.docker.com/engine/security/security/">Docker
     *         security</a>.
     *         </p>
     *         <p>
     *         If you are setting namespaced kernel parameters using
     *         <code>systemControls</code> for the containers in the task, the
     *         following will apply to your IPC resource namespace. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html"
     *         >System Controls</a> in the <i>Amazon Elastic Container Service
     *         Developer Guide</i>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For tasks that use the <code>host</code> IPC mode, IPC namespace
     *         related <code>systemControls</code> are not supported.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For tasks that use the <code>task</code> IPC mode, IPC namespace
     *         related <code>systemControls</code> will apply to all containers
     *         within a task.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         This parameter is not supported for Windows containers or tasks
     *         using the Fargate launch type.
     *         </p>
     *         </note>
     * @see IpcMode
     */
    public String getIpcMode() {
        return ipcMode;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The
     * valid values are <code>host</code>, <code>task</code>, or
     * <code>none</code>. If <code>host</code> is specified, then all containers
     * within the tasks that specified the <code>host</code> IPC mode on the
     * same container instance share the same IPC resources with the host Amazon
     * EC2 instance. If <code>task</code> is specified, all containers within
     * the specified task share the same IPC resources. If <code>none</code> is
     * specified, then IPC resources within the containers of a task are private
     * and not shared with other containers in a task or on the container
     * instance. If no value is specified, then the IPC resource namespace
     * sharing depends on the Docker daemon setting on the container instance.
     * For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc"
     * >IPC settings</a> in the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> IPC mode is used, be aware that there is a
     * heightened risk of undesired IPC namespace expose. For more information,
     * see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <p>
     * If you are setting namespaced kernel parameters using
     * <code>systemControls</code> for the containers in the task, the following
     * will apply to your IPC resource namespace. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html"
     * >System Controls</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tasks that use the <code>host</code> IPC mode, IPC namespace related
     * <code>systemControls</code> are not supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tasks that use the <code>task</code> IPC mode, IPC namespace related
     * <code>systemControls</code> will apply to all containers within a task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the
     * Fargate launch type.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>host, task, none
     *
     * @param ipcMode <p>
     *            The IPC resource namespace to use for the containers in the
     *            task. The valid values are <code>host</code>,
     *            <code>task</code>, or <code>none</code>. If <code>host</code>
     *            is specified, then all containers within the tasks that
     *            specified the <code>host</code> IPC mode on the same container
     *            instance share the same IPC resources with the host Amazon EC2
     *            instance. If <code>task</code> is specified, all containers
     *            within the specified task share the same IPC resources. If
     *            <code>none</code> is specified, then IPC resources within the
     *            containers of a task are private and not shared with other
     *            containers in a task or on the container instance. If no value
     *            is specified, then the IPC resource namespace sharing depends
     *            on the Docker daemon setting on the container instance. For
     *            more information, see <a href=
     *            "https://docs.docker.com/engine/reference/run/#ipc-settings---ipc"
     *            >IPC settings</a> in the <i>Docker run reference</i>.
     *            </p>
     *            <p>
     *            If the <code>host</code> IPC mode is used, be aware that there
     *            is a heightened risk of undesired IPC namespace expose. For
     *            more information, see <a
     *            href="https://docs.docker.com/engine/security/security/"
     *            >Docker security</a>.
     *            </p>
     *            <p>
     *            If you are setting namespaced kernel parameters using
     *            <code>systemControls</code> for the containers in the task,
     *            the following will apply to your IPC resource namespace. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html"
     *            >System Controls</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For tasks that use the <code>host</code> IPC mode, IPC
     *            namespace related <code>systemControls</code> are not
     *            supported.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For tasks that use the <code>task</code> IPC mode, IPC
     *            namespace related <code>systemControls</code> will apply to
     *            all containers within a task.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            This parameter is not supported for Windows containers or
     *            tasks using the Fargate launch type.
     *            </p>
     *            </note>
     * @see IpcMode
     */
    public void setIpcMode(String ipcMode) {
        this.ipcMode = ipcMode;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The
     * valid values are <code>host</code>, <code>task</code>, or
     * <code>none</code>. If <code>host</code> is specified, then all containers
     * within the tasks that specified the <code>host</code> IPC mode on the
     * same container instance share the same IPC resources with the host Amazon
     * EC2 instance. If <code>task</code> is specified, all containers within
     * the specified task share the same IPC resources. If <code>none</code> is
     * specified, then IPC resources within the containers of a task are private
     * and not shared with other containers in a task or on the container
     * instance. If no value is specified, then the IPC resource namespace
     * sharing depends on the Docker daemon setting on the container instance.
     * For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc"
     * >IPC settings</a> in the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> IPC mode is used, be aware that there is a
     * heightened risk of undesired IPC namespace expose. For more information,
     * see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <p>
     * If you are setting namespaced kernel parameters using
     * <code>systemControls</code> for the containers in the task, the following
     * will apply to your IPC resource namespace. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html"
     * >System Controls</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tasks that use the <code>host</code> IPC mode, IPC namespace related
     * <code>systemControls</code> are not supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tasks that use the <code>task</code> IPC mode, IPC namespace related
     * <code>systemControls</code> will apply to all containers within a task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the
     * Fargate launch type.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>host, task, none
     *
     * @param ipcMode <p>
     *            The IPC resource namespace to use for the containers in the
     *            task. The valid values are <code>host</code>,
     *            <code>task</code>, or <code>none</code>. If <code>host</code>
     *            is specified, then all containers within the tasks that
     *            specified the <code>host</code> IPC mode on the same container
     *            instance share the same IPC resources with the host Amazon EC2
     *            instance. If <code>task</code> is specified, all containers
     *            within the specified task share the same IPC resources. If
     *            <code>none</code> is specified, then IPC resources within the
     *            containers of a task are private and not shared with other
     *            containers in a task or on the container instance. If no value
     *            is specified, then the IPC resource namespace sharing depends
     *            on the Docker daemon setting on the container instance. For
     *            more information, see <a href=
     *            "https://docs.docker.com/engine/reference/run/#ipc-settings---ipc"
     *            >IPC settings</a> in the <i>Docker run reference</i>.
     *            </p>
     *            <p>
     *            If the <code>host</code> IPC mode is used, be aware that there
     *            is a heightened risk of undesired IPC namespace expose. For
     *            more information, see <a
     *            href="https://docs.docker.com/engine/security/security/"
     *            >Docker security</a>.
     *            </p>
     *            <p>
     *            If you are setting namespaced kernel parameters using
     *            <code>systemControls</code> for the containers in the task,
     *            the following will apply to your IPC resource namespace. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html"
     *            >System Controls</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For tasks that use the <code>host</code> IPC mode, IPC
     *            namespace related <code>systemControls</code> are not
     *            supported.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For tasks that use the <code>task</code> IPC mode, IPC
     *            namespace related <code>systemControls</code> will apply to
     *            all containers within a task.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            This parameter is not supported for Windows containers or
     *            tasks using the Fargate launch type.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IpcMode
     */
    public TaskDefinition withIpcMode(String ipcMode) {
        this.ipcMode = ipcMode;
        return this;
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The
     * valid values are <code>host</code>, <code>task</code>, or
     * <code>none</code>. If <code>host</code> is specified, then all containers
     * within the tasks that specified the <code>host</code> IPC mode on the
     * same container instance share the same IPC resources with the host Amazon
     * EC2 instance. If <code>task</code> is specified, all containers within
     * the specified task share the same IPC resources. If <code>none</code> is
     * specified, then IPC resources within the containers of a task are private
     * and not shared with other containers in a task or on the container
     * instance. If no value is specified, then the IPC resource namespace
     * sharing depends on the Docker daemon setting on the container instance.
     * For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc"
     * >IPC settings</a> in the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> IPC mode is used, be aware that there is a
     * heightened risk of undesired IPC namespace expose. For more information,
     * see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <p>
     * If you are setting namespaced kernel parameters using
     * <code>systemControls</code> for the containers in the task, the following
     * will apply to your IPC resource namespace. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html"
     * >System Controls</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tasks that use the <code>host</code> IPC mode, IPC namespace related
     * <code>systemControls</code> are not supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tasks that use the <code>task</code> IPC mode, IPC namespace related
     * <code>systemControls</code> will apply to all containers within a task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the
     * Fargate launch type.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>host, task, none
     *
     * @param ipcMode <p>
     *            The IPC resource namespace to use for the containers in the
     *            task. The valid values are <code>host</code>,
     *            <code>task</code>, or <code>none</code>. If <code>host</code>
     *            is specified, then all containers within the tasks that
     *            specified the <code>host</code> IPC mode on the same container
     *            instance share the same IPC resources with the host Amazon EC2
     *            instance. If <code>task</code> is specified, all containers
     *            within the specified task share the same IPC resources. If
     *            <code>none</code> is specified, then IPC resources within the
     *            containers of a task are private and not shared with other
     *            containers in a task or on the container instance. If no value
     *            is specified, then the IPC resource namespace sharing depends
     *            on the Docker daemon setting on the container instance. For
     *            more information, see <a href=
     *            "https://docs.docker.com/engine/reference/run/#ipc-settings---ipc"
     *            >IPC settings</a> in the <i>Docker run reference</i>.
     *            </p>
     *            <p>
     *            If the <code>host</code> IPC mode is used, be aware that there
     *            is a heightened risk of undesired IPC namespace expose. For
     *            more information, see <a
     *            href="https://docs.docker.com/engine/security/security/"
     *            >Docker security</a>.
     *            </p>
     *            <p>
     *            If you are setting namespaced kernel parameters using
     *            <code>systemControls</code> for the containers in the task,
     *            the following will apply to your IPC resource namespace. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html"
     *            >System Controls</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For tasks that use the <code>host</code> IPC mode, IPC
     *            namespace related <code>systemControls</code> are not
     *            supported.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For tasks that use the <code>task</code> IPC mode, IPC
     *            namespace related <code>systemControls</code> will apply to
     *            all containers within a task.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            This parameter is not supported for Windows containers or
     *            tasks using the Fargate launch type.
     *            </p>
     *            </note>
     * @see IpcMode
     */
    public void setIpcMode(IpcMode ipcMode) {
        this.ipcMode = ipcMode.toString();
    }

    /**
     * <p>
     * The IPC resource namespace to use for the containers in the task. The
     * valid values are <code>host</code>, <code>task</code>, or
     * <code>none</code>. If <code>host</code> is specified, then all containers
     * within the tasks that specified the <code>host</code> IPC mode on the
     * same container instance share the same IPC resources with the host Amazon
     * EC2 instance. If <code>task</code> is specified, all containers within
     * the specified task share the same IPC resources. If <code>none</code> is
     * specified, then IPC resources within the containers of a task are private
     * and not shared with other containers in a task or on the container
     * instance. If no value is specified, then the IPC resource namespace
     * sharing depends on the Docker daemon setting on the container instance.
     * For more information, see <a
     * href="https://docs.docker.com/engine/reference/run/#ipc-settings---ipc"
     * >IPC settings</a> in the <i>Docker run reference</i>.
     * </p>
     * <p>
     * If the <code>host</code> IPC mode is used, be aware that there is a
     * heightened risk of undesired IPC namespace expose. For more information,
     * see <a href="https://docs.docker.com/engine/security/security/">Docker
     * security</a>.
     * </p>
     * <p>
     * If you are setting namespaced kernel parameters using
     * <code>systemControls</code> for the containers in the task, the following
     * will apply to your IPC resource namespace. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html"
     * >System Controls</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For tasks that use the <code>host</code> IPC mode, IPC namespace related
     * <code>systemControls</code> are not supported.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tasks that use the <code>task</code> IPC mode, IPC namespace related
     * <code>systemControls</code> will apply to all containers within a task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This parameter is not supported for Windows containers or tasks using the
     * Fargate launch type.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>host, task, none
     *
     * @param ipcMode <p>
     *            The IPC resource namespace to use for the containers in the
     *            task. The valid values are <code>host</code>,
     *            <code>task</code>, or <code>none</code>. If <code>host</code>
     *            is specified, then all containers within the tasks that
     *            specified the <code>host</code> IPC mode on the same container
     *            instance share the same IPC resources with the host Amazon EC2
     *            instance. If <code>task</code> is specified, all containers
     *            within the specified task share the same IPC resources. If
     *            <code>none</code> is specified, then IPC resources within the
     *            containers of a task are private and not shared with other
     *            containers in a task or on the container instance. If no value
     *            is specified, then the IPC resource namespace sharing depends
     *            on the Docker daemon setting on the container instance. For
     *            more information, see <a href=
     *            "https://docs.docker.com/engine/reference/run/#ipc-settings---ipc"
     *            >IPC settings</a> in the <i>Docker run reference</i>.
     *            </p>
     *            <p>
     *            If the <code>host</code> IPC mode is used, be aware that there
     *            is a heightened risk of undesired IPC namespace expose. For
     *            more information, see <a
     *            href="https://docs.docker.com/engine/security/security/"
     *            >Docker security</a>.
     *            </p>
     *            <p>
     *            If you are setting namespaced kernel parameters using
     *            <code>systemControls</code> for the containers in the task,
     *            the following will apply to your IPC resource namespace. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html"
     *            >System Controls</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For tasks that use the <code>host</code> IPC mode, IPC
     *            namespace related <code>systemControls</code> are not
     *            supported.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For tasks that use the <code>task</code> IPC mode, IPC
     *            namespace related <code>systemControls</code> will apply to
     *            all containers within a task.
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            This parameter is not supported for Windows containers or
     *            tasks using the Fargate launch type.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IpcMode
     */
    public TaskDefinition withIpcMode(IpcMode ipcMode) {
        this.ipcMode = ipcMode.toString();
        return this;
    }

    /**
     * <p>
     * The configuration details for the App Mesh proxy.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of
     * the container agent and at least version 1.26.0-1 of the
     * <code>ecs-init</code> package to enable a proxy configuration. If your
     * container instances are launched from the Amazon ECS-optimized AMI
     * version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html"
     * >Amazon ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The configuration details for the App Mesh proxy.
     *         </p>
     *         <p>
     *         Your Amazon ECS container instances require at least version
     *         1.26.0 of the container agent and at least version 1.26.0-1 of
     *         the <code>ecs-init</code> package to enable a proxy
     *         configuration. If your container instances are launched from the
     *         Amazon ECS-optimized AMI version <code>20190301</code> or later,
     *         then they contain the required versions of the container agent
     *         and <code>ecs-init</code>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html"
     *         >Amazon ECS-optimized Linux AMI</a> in the <i>Amazon Elastic
     *         Container Service Developer Guide</i>.
     *         </p>
     */
    public ProxyConfiguration getProxyConfiguration() {
        return proxyConfiguration;
    }

    /**
     * <p>
     * The configuration details for the App Mesh proxy.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of
     * the container agent and at least version 1.26.0-1 of the
     * <code>ecs-init</code> package to enable a proxy configuration. If your
     * container instances are launched from the Amazon ECS-optimized AMI
     * version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html"
     * >Amazon ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @param proxyConfiguration <p>
     *            The configuration details for the App Mesh proxy.
     *            </p>
     *            <p>
     *            Your Amazon ECS container instances require at least version
     *            1.26.0 of the container agent and at least version 1.26.0-1 of
     *            the <code>ecs-init</code> package to enable a proxy
     *            configuration. If your container instances are launched from
     *            the Amazon ECS-optimized AMI version <code>20190301</code> or
     *            later, then they contain the required versions of the
     *            container agent and <code>ecs-init</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html"
     *            >Amazon ECS-optimized Linux AMI</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     */
    public void setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        this.proxyConfiguration = proxyConfiguration;
    }

    /**
     * <p>
     * The configuration details for the App Mesh proxy.
     * </p>
     * <p>
     * Your Amazon ECS container instances require at least version 1.26.0 of
     * the container agent and at least version 1.26.0-1 of the
     * <code>ecs-init</code> package to enable a proxy configuration. If your
     * container instances are launched from the Amazon ECS-optimized AMI
     * version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html"
     * >Amazon ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param proxyConfiguration <p>
     *            The configuration details for the App Mesh proxy.
     *            </p>
     *            <p>
     *            Your Amazon ECS container instances require at least version
     *            1.26.0 of the container agent and at least version 1.26.0-1 of
     *            the <code>ecs-init</code> package to enable a proxy
     *            configuration. If your container instances are launched from
     *            the Amazon ECS-optimized AMI version <code>20190301</code> or
     *            later, then they contain the required versions of the
     *            container agent and <code>ecs-init</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html"
     *            >Amazon ECS-optimized Linux AMI</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskDefinition withProxyConfiguration(ProxyConfiguration proxyConfiguration) {
        this.proxyConfiguration = proxyConfiguration;
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
        if (getTaskDefinitionArn() != null)
            sb.append("taskDefinitionArn: " + getTaskDefinitionArn() + ",");
        if (getContainerDefinitions() != null)
            sb.append("containerDefinitions: " + getContainerDefinitions() + ",");
        if (getFamily() != null)
            sb.append("family: " + getFamily() + ",");
        if (getTaskRoleArn() != null)
            sb.append("taskRoleArn: " + getTaskRoleArn() + ",");
        if (getExecutionRoleArn() != null)
            sb.append("executionRoleArn: " + getExecutionRoleArn() + ",");
        if (getNetworkMode() != null)
            sb.append("networkMode: " + getNetworkMode() + ",");
        if (getRevision() != null)
            sb.append("revision: " + getRevision() + ",");
        if (getVolumes() != null)
            sb.append("volumes: " + getVolumes() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getRequiresAttributes() != null)
            sb.append("requiresAttributes: " + getRequiresAttributes() + ",");
        if (getPlacementConstraints() != null)
            sb.append("placementConstraints: " + getPlacementConstraints() + ",");
        if (getCompatibilities() != null)
            sb.append("compatibilities: " + getCompatibilities() + ",");
        if (getRequiresCompatibilities() != null)
            sb.append("requiresCompatibilities: " + getRequiresCompatibilities() + ",");
        if (getCpu() != null)
            sb.append("cpu: " + getCpu() + ",");
        if (getMemory() != null)
            sb.append("memory: " + getMemory() + ",");
        if (getInferenceAccelerators() != null)
            sb.append("inferenceAccelerators: " + getInferenceAccelerators() + ",");
        if (getPidMode() != null)
            sb.append("pidMode: " + getPidMode() + ",");
        if (getIpcMode() != null)
            sb.append("ipcMode: " + getIpcMode() + ",");
        if (getProxyConfiguration() != null)
            sb.append("proxyConfiguration: " + getProxyConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTaskDefinitionArn() == null) ? 0 : getTaskDefinitionArn().hashCode());
        hashCode = prime * hashCode
                + ((getContainerDefinitions() == null) ? 0 : getContainerDefinitions().hashCode());
        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode
                + ((getTaskRoleArn() == null) ? 0 : getTaskRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkMode() == null) ? 0 : getNetworkMode().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getRequiresAttributes() == null) ? 0 : getRequiresAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getPlacementConstraints() == null) ? 0 : getPlacementConstraints().hashCode());
        hashCode = prime * hashCode
                + ((getCompatibilities() == null) ? 0 : getCompatibilities().hashCode());
        hashCode = prime
                * hashCode
                + ((getRequiresCompatibilities() == null) ? 0 : getRequiresCompatibilities()
                        .hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime
                * hashCode
                + ((getInferenceAccelerators() == null) ? 0 : getInferenceAccelerators().hashCode());
        hashCode = prime * hashCode + ((getPidMode() == null) ? 0 : getPidMode().hashCode());
        hashCode = prime * hashCode + ((getIpcMode() == null) ? 0 : getIpcMode().hashCode());
        hashCode = prime * hashCode
                + ((getProxyConfiguration() == null) ? 0 : getProxyConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskDefinition == false)
            return false;
        TaskDefinition other = (TaskDefinition) obj;

        if (other.getTaskDefinitionArn() == null ^ this.getTaskDefinitionArn() == null)
            return false;
        if (other.getTaskDefinitionArn() != null
                && other.getTaskDefinitionArn().equals(this.getTaskDefinitionArn()) == false)
            return false;
        if (other.getContainerDefinitions() == null ^ this.getContainerDefinitions() == null)
            return false;
        if (other.getContainerDefinitions() != null
                && other.getContainerDefinitions().equals(this.getContainerDefinitions()) == false)
            return false;
        if (other.getFamily() == null ^ this.getFamily() == null)
            return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false)
            return false;
        if (other.getTaskRoleArn() == null ^ this.getTaskRoleArn() == null)
            return false;
        if (other.getTaskRoleArn() != null
                && other.getTaskRoleArn().equals(this.getTaskRoleArn()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null
                && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getNetworkMode() == null ^ this.getNetworkMode() == null)
            return false;
        if (other.getNetworkMode() != null
                && other.getNetworkMode().equals(this.getNetworkMode()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRequiresAttributes() == null ^ this.getRequiresAttributes() == null)
            return false;
        if (other.getRequiresAttributes() != null
                && other.getRequiresAttributes().equals(this.getRequiresAttributes()) == false)
            return false;
        if (other.getPlacementConstraints() == null ^ this.getPlacementConstraints() == null)
            return false;
        if (other.getPlacementConstraints() != null
                && other.getPlacementConstraints().equals(this.getPlacementConstraints()) == false)
            return false;
        if (other.getCompatibilities() == null ^ this.getCompatibilities() == null)
            return false;
        if (other.getCompatibilities() != null
                && other.getCompatibilities().equals(this.getCompatibilities()) == false)
            return false;
        if (other.getRequiresCompatibilities() == null ^ this.getRequiresCompatibilities() == null)
            return false;
        if (other.getRequiresCompatibilities() != null
                && other.getRequiresCompatibilities().equals(this.getRequiresCompatibilities()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getInferenceAccelerators() == null ^ this.getInferenceAccelerators() == null)
            return false;
        if (other.getInferenceAccelerators() != null
                && other.getInferenceAccelerators().equals(this.getInferenceAccelerators()) == false)
            return false;
        if (other.getPidMode() == null ^ this.getPidMode() == null)
            return false;
        if (other.getPidMode() != null && other.getPidMode().equals(this.getPidMode()) == false)
            return false;
        if (other.getIpcMode() == null ^ this.getIpcMode() == null)
            return false;
        if (other.getIpcMode() != null && other.getIpcMode().equals(this.getIpcMode()) == false)
            return false;
        if (other.getProxyConfiguration() == null ^ this.getProxyConfiguration() == null)
            return false;
        if (other.getProxyConfiguration() != null
                && other.getProxyConfiguration().equals(this.getProxyConfiguration()) == false)
            return false;
        return true;
    }
}
