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
 * Registers a new task definition from the supplied <code>family</code> and
 * <code>containerDefinitions</code>. Optionally, you can add data volumes to
 * your containers with the <code>volumes</code> parameter. For more information
 * about task definition parameters and defaults, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html"
 * >Amazon ECS Task Definitions</a> in the <i>Amazon Elastic Container Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * You can specify an IAM role for your task with the <code>taskRoleArn</code>
 * parameter. When you specify an IAM role for a task, its containers can then
 * use the latest versions of the AWS CLI or SDKs to make API requests to the
 * AWS services that are specified in the IAM policy associated with the role.
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html"
 * >IAM Roles for Tasks</a> in the <i>Amazon Elastic Container Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * You can specify a Docker networking mode for the containers in your task
 * definition with the <code>networkMode</code> parameter. The available network
 * modes correspond to those described in <a
 * href="https://docs.docker.com/engine/reference/run/#/network-settings"
 * >Network settings</a> in the Docker run reference. If you specify the
 * <code>awsvpc</code> network mode, the task is allocated an elastic network
 * interface, and you must specify a <a>NetworkConfiguration</a> when you create
 * a service or run a task with the task definition. For more information, see
 * <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
 * >Task Networking</a> in the <i>Amazon Elastic Container Service Developer
 * Guide</i>.
 * </p>
 */
public class RegisterTaskDefinitionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which
     * allows you to track multiple versions of the same task definition. The
     * <code>family</code> is used as a name for your task definition. Up to 255
     * letters (uppercase and lowercase), numbers, and hyphens are allowed.
     * </p>
     */
    private String family;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the IAM role that
     * containers in this task can assume. All containers in this task are
     * granted the permissions that are specified in this role. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html"
     * >IAM Roles for Tasks</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
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
     * A list of container definitions in JSON format that describe the
     * different containers that make up your task.
     * </p>
     */
    private java.util.List<ContainerDefinition> containerDefinitions;

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task
     * may use.
     * </p>
     */
    private java.util.List<Volume> volumes;

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can
     * specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at runtime).
     * </p>
     */
    private java.util.List<TaskDefinitionPlacementConstraint> placementConstraints;

    /**
     * <p>
     * The launch type required by the task. If no value is specified, it
     * defaults to <code>EC2</code>.
     * </p>
     */
    private java.util.List<String> requiresCompatibilities;

    /**
     * <p>
     * The number of CPU units used by the task. It can be expressed as an
     * integer using CPU units, for example <code>1024</code>, or as a string
     * using vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>, in a
     * task definition. String values are converted to an integer indicating the
     * CPU units when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers.
     * We recommend specifying container-level resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If you are using the EC2 launch type, this field is optional. Supported
     * values are between <code>128</code> CPU units (<code>0.125</code> vCPUs)
     * and <code>10240</code> CPU units (<code>10</code> vCPUs).
     * </p>
     * <p>
     * If you are using the Fargate launch type, this field is required and you
     * must use one of the following values, which determines your range of
     * supported values for the <code>memory</code> parameter:
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
     * The amount of memory (in MiB) used by the task. It can be expressed as an
     * integer using MiB, for example <code>1024</code>, or as a string using
     * GB, for example <code>1GB</code> or <code>1 GB</code>, in a task
     * definition. String values are converted to an integer indicating the MiB
     * when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers.
     * We recommend specifying container-level resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use
     * one of the following values, which determines your range of supported
     * values for the <code>cpu</code> parameter:
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
     * The metadata that you apply to the task definition to help you categorize
     * and organize them. Each tag consists of a key and an optional value, both
     * of which you define.
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
     * For tasks using the EC2 launch type, the container instances require at
     * least version 1.26.0 of the container agent and at least version 1.26.0-1
     * of the <code>ecs-init</code> package to enable a proxy configuration. If
     * your container instances are launched from the Amazon ECS-optimized AMI
     * version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html"
     * >Amazon ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * For tasks using the Fargate launch type, the task or service requires
     * platform version 1.3.0 or later.
     * </p>
     */
    private ProxyConfiguration proxyConfiguration;

    /**
     * <p>
     * The Elastic Inference accelerators to use for the containers in the task.
     * </p>
     */
    private java.util.List<InferenceAccelerator> inferenceAccelerators;

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which
     * allows you to track multiple versions of the same task definition. The
     * <code>family</code> is used as a name for your task definition. Up to 255
     * letters (uppercase and lowercase), numbers, and hyphens are allowed.
     * </p>
     *
     * @return <p>
     *         You must specify a <code>family</code> for a task definition,
     *         which allows you to track multiple versions of the same task
     *         definition. The <code>family</code> is used as a name for your
     *         task definition. Up to 255 letters (uppercase and lowercase),
     *         numbers, and hyphens are allowed.
     *         </p>
     */
    public String getFamily() {
        return family;
    }

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which
     * allows you to track multiple versions of the same task definition. The
     * <code>family</code> is used as a name for your task definition. Up to 255
     * letters (uppercase and lowercase), numbers, and hyphens are allowed.
     * </p>
     *
     * @param family <p>
     *            You must specify a <code>family</code> for a task definition,
     *            which allows you to track multiple versions of the same task
     *            definition. The <code>family</code> is used as a name for your
     *            task definition. Up to 255 letters (uppercase and lowercase),
     *            numbers, and hyphens are allowed.
     *            </p>
     */
    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * You must specify a <code>family</code> for a task definition, which
     * allows you to track multiple versions of the same task definition. The
     * <code>family</code> is used as a name for your task definition. Up to 255
     * letters (uppercase and lowercase), numbers, and hyphens are allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param family <p>
     *            You must specify a <code>family</code> for a task definition,
     *            which allows you to track multiple versions of the same task
     *            definition. The <code>family</code> is used as a name for your
     *            task definition. Up to 255 letters (uppercase and lowercase),
     *            numbers, and hyphens are allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTaskDefinitionRequest withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the IAM role that
     * containers in this task can assume. All containers in this task are
     * granted the permissions that are specified in this role. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html"
     * >IAM Roles for Tasks</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the IAM role
     *         that containers in this task can assume. All containers in this
     *         task are granted the permissions that are specified in this role.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html"
     *         >IAM Roles for Tasks</a> in the <i>Amazon Elastic Container
     *         Service Developer Guide</i>.
     *         </p>
     */
    public String getTaskRoleArn() {
        return taskRoleArn;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the IAM role that
     * containers in this task can assume. All containers in this task are
     * granted the permissions that are specified in this role. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html"
     * >IAM Roles for Tasks</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     *
     * @param taskRoleArn <p>
     *            The short name or full Amazon Resource Name (ARN) of the IAM
     *            role that containers in this task can assume. All containers
     *            in this task are granted the permissions that are specified in
     *            this role. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html"
     *            >IAM Roles for Tasks</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setTaskRoleArn(String taskRoleArn) {
        this.taskRoleArn = taskRoleArn;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the IAM role that
     * containers in this task can assume. All containers in this task are
     * granted the permissions that are specified in this role. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html"
     * >IAM Roles for Tasks</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskRoleArn <p>
     *            The short name or full Amazon Resource Name (ARN) of the IAM
     *            role that containers in this task can assume. All containers
     *            in this task are granted the permissions that are specified in
     *            this role. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html"
     *            >IAM Roles for Tasks</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTaskDefinitionRequest withTaskRoleArn(String taskRoleArn) {
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
    public RegisterTaskDefinitionRequest withExecutionRoleArn(String executionRoleArn) {
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
    public RegisterTaskDefinitionRequest withNetworkMode(String networkMode) {
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
    public RegisterTaskDefinitionRequest withNetworkMode(NetworkMode networkMode) {
        this.networkMode = networkMode.toString();
        return this;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the
     * different containers that make up your task.
     * </p>
     *
     * @return <p>
     *         A list of container definitions in JSON format that describe the
     *         different containers that make up your task.
     *         </p>
     */
    public java.util.List<ContainerDefinition> getContainerDefinitions() {
        return containerDefinitions;
    }

    /**
     * <p>
     * A list of container definitions in JSON format that describe the
     * different containers that make up your task.
     * </p>
     *
     * @param containerDefinitions <p>
     *            A list of container definitions in JSON format that describe
     *            the different containers that make up your task.
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
     * different containers that make up your task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerDefinitions <p>
     *            A list of container definitions in JSON format that describe
     *            the different containers that make up your task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTaskDefinitionRequest withContainerDefinitions(
            ContainerDefinition... containerDefinitions) {
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
     * different containers that make up your task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerDefinitions <p>
     *            A list of container definitions in JSON format that describe
     *            the different containers that make up your task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTaskDefinitionRequest withContainerDefinitions(
            java.util.Collection<ContainerDefinition> containerDefinitions) {
        setContainerDefinitions(containerDefinitions);
        return this;
    }

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task
     * may use.
     * </p>
     *
     * @return <p>
     *         A list of volume definitions in JSON format that containers in
     *         your task may use.
     *         </p>
     */
    public java.util.List<Volume> getVolumes() {
        return volumes;
    }

    /**
     * <p>
     * A list of volume definitions in JSON format that containers in your task
     * may use.
     * </p>
     *
     * @param volumes <p>
     *            A list of volume definitions in JSON format that containers in
     *            your task may use.
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
     * A list of volume definitions in JSON format that containers in your task
     * may use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumes <p>
     *            A list of volume definitions in JSON format that containers in
     *            your task may use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTaskDefinitionRequest withVolumes(Volume... volumes) {
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
     * A list of volume definitions in JSON format that containers in your task
     * may use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumes <p>
     *            A list of volume definitions in JSON format that containers in
     *            your task may use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTaskDefinitionRequest withVolumes(java.util.Collection<Volume> volumes) {
        setVolumes(volumes);
        return this;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can
     * specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at runtime).
     * </p>
     *
     * @return <p>
     *         An array of placement constraint objects to use for the task. You
     *         can specify a maximum of 10 constraints per task (this limit
     *         includes constraints in the task definition and those specified
     *         at runtime).
     *         </p>
     */
    public java.util.List<TaskDefinitionPlacementConstraint> getPlacementConstraints() {
        return placementConstraints;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can
     * specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at runtime).
     * </p>
     *
     * @param placementConstraints <p>
     *            An array of placement constraint objects to use for the task.
     *            You can specify a maximum of 10 constraints per task (this
     *            limit includes constraints in the task definition and those
     *            specified at runtime).
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
     * An array of placement constraint objects to use for the task. You can
     * specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at runtime).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementConstraints <p>
     *            An array of placement constraint objects to use for the task.
     *            You can specify a maximum of 10 constraints per task (this
     *            limit includes constraints in the task definition and those
     *            specified at runtime).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTaskDefinitionRequest withPlacementConstraints(
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
     * An array of placement constraint objects to use for the task. You can
     * specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at runtime).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementConstraints <p>
     *            An array of placement constraint objects to use for the task.
     *            You can specify a maximum of 10 constraints per task (this
     *            limit includes constraints in the task definition and those
     *            specified at runtime).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTaskDefinitionRequest withPlacementConstraints(
            java.util.Collection<TaskDefinitionPlacementConstraint> placementConstraints) {
        setPlacementConstraints(placementConstraints);
        return this;
    }

    /**
     * <p>
     * The launch type required by the task. If no value is specified, it
     * defaults to <code>EC2</code>.
     * </p>
     *
     * @return <p>
     *         The launch type required by the task. If no value is specified,
     *         it defaults to <code>EC2</code>.
     *         </p>
     */
    public java.util.List<String> getRequiresCompatibilities() {
        return requiresCompatibilities;
    }

    /**
     * <p>
     * The launch type required by the task. If no value is specified, it
     * defaults to <code>EC2</code>.
     * </p>
     *
     * @param requiresCompatibilities <p>
     *            The launch type required by the task. If no value is
     *            specified, it defaults to <code>EC2</code>.
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
     * The launch type required by the task. If no value is specified, it
     * defaults to <code>EC2</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requiresCompatibilities <p>
     *            The launch type required by the task. If no value is
     *            specified, it defaults to <code>EC2</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTaskDefinitionRequest withRequiresCompatibilities(
            String... requiresCompatibilities) {
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
     * The launch type required by the task. If no value is specified, it
     * defaults to <code>EC2</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requiresCompatibilities <p>
     *            The launch type required by the task. If no value is
     *            specified, it defaults to <code>EC2</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTaskDefinitionRequest withRequiresCompatibilities(
            java.util.Collection<String> requiresCompatibilities) {
        setRequiresCompatibilities(requiresCompatibilities);
        return this;
    }

    /**
     * <p>
     * The number of CPU units used by the task. It can be expressed as an
     * integer using CPU units, for example <code>1024</code>, or as a string
     * using vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>, in a
     * task definition. String values are converted to an integer indicating the
     * CPU units when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers.
     * We recommend specifying container-level resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If you are using the EC2 launch type, this field is optional. Supported
     * values are between <code>128</code> CPU units (<code>0.125</code> vCPUs)
     * and <code>10240</code> CPU units (<code>10</code> vCPUs).
     * </p>
     * <p>
     * If you are using the Fargate launch type, this field is required and you
     * must use one of the following values, which determines your range of
     * supported values for the <code>memory</code> parameter:
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
     *         The number of CPU units used by the task. It can be expressed as
     *         an integer using CPU units, for example <code>1024</code>, or as
     *         a string using vCPUs, for example <code>1 vCPU</code> or
     *         <code>1 vcpu</code>, in a task definition. String values are
     *         converted to an integer indicating the CPU units when the task
     *         definition is registered.
     *         </p>
     *         <note>
     *         <p>
     *         Task-level CPU and memory parameters are ignored for Windows
     *         containers. We recommend specifying container-level resources for
     *         Windows containers.
     *         </p>
     *         </note>
     *         <p>
     *         If you are using the EC2 launch type, this field is optional.
     *         Supported values are between <code>128</code> CPU units (
     *         <code>0.125</code> vCPUs) and <code>10240</code> CPU units (
     *         <code>10</code> vCPUs).
     *         </p>
     *         <p>
     *         If you are using the Fargate launch type, this field is required
     *         and you must use one of the following values, which determines
     *         your range of supported values for the <code>memory</code>
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
     * The number of CPU units used by the task. It can be expressed as an
     * integer using CPU units, for example <code>1024</code>, or as a string
     * using vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>, in a
     * task definition. String values are converted to an integer indicating the
     * CPU units when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers.
     * We recommend specifying container-level resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If you are using the EC2 launch type, this field is optional. Supported
     * values are between <code>128</code> CPU units (<code>0.125</code> vCPUs)
     * and <code>10240</code> CPU units (<code>10</code> vCPUs).
     * </p>
     * <p>
     * If you are using the Fargate launch type, this field is required and you
     * must use one of the following values, which determines your range of
     * supported values for the <code>memory</code> parameter:
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
     *            The number of CPU units used by the task. It can be expressed
     *            as an integer using CPU units, for example <code>1024</code>,
     *            or as a string using vCPUs, for example <code>1 vCPU</code> or
     *            <code>1 vcpu</code>, in a task definition. String values are
     *            converted to an integer indicating the CPU units when the task
     *            definition is registered.
     *            </p>
     *            <note>
     *            <p>
     *            Task-level CPU and memory parameters are ignored for Windows
     *            containers. We recommend specifying container-level resources
     *            for Windows containers.
     *            </p>
     *            </note>
     *            <p>
     *            If you are using the EC2 launch type, this field is optional.
     *            Supported values are between <code>128</code> CPU units (
     *            <code>0.125</code> vCPUs) and <code>10240</code> CPU units (
     *            <code>10</code> vCPUs).
     *            </p>
     *            <p>
     *            If you are using the Fargate launch type, this field is
     *            required and you must use one of the following values, which
     *            determines your range of supported values for the
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
     * The number of CPU units used by the task. It can be expressed as an
     * integer using CPU units, for example <code>1024</code>, or as a string
     * using vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>, in a
     * task definition. String values are converted to an integer indicating the
     * CPU units when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers.
     * We recommend specifying container-level resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If you are using the EC2 launch type, this field is optional. Supported
     * values are between <code>128</code> CPU units (<code>0.125</code> vCPUs)
     * and <code>10240</code> CPU units (<code>10</code> vCPUs).
     * </p>
     * <p>
     * If you are using the Fargate launch type, this field is required and you
     * must use one of the following values, which determines your range of
     * supported values for the <code>memory</code> parameter:
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
     *            The number of CPU units used by the task. It can be expressed
     *            as an integer using CPU units, for example <code>1024</code>,
     *            or as a string using vCPUs, for example <code>1 vCPU</code> or
     *            <code>1 vcpu</code>, in a task definition. String values are
     *            converted to an integer indicating the CPU units when the task
     *            definition is registered.
     *            </p>
     *            <note>
     *            <p>
     *            Task-level CPU and memory parameters are ignored for Windows
     *            containers. We recommend specifying container-level resources
     *            for Windows containers.
     *            </p>
     *            </note>
     *            <p>
     *            If you are using the EC2 launch type, this field is optional.
     *            Supported values are between <code>128</code> CPU units (
     *            <code>0.125</code> vCPUs) and <code>10240</code> CPU units (
     *            <code>10</code> vCPUs).
     *            </p>
     *            <p>
     *            If you are using the Fargate launch type, this field is
     *            required and you must use one of the following values, which
     *            determines your range of supported values for the
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
    public RegisterTaskDefinitionRequest withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * <p>
     * The amount of memory (in MiB) used by the task. It can be expressed as an
     * integer using MiB, for example <code>1024</code>, or as a string using
     * GB, for example <code>1GB</code> or <code>1 GB</code>, in a task
     * definition. String values are converted to an integer indicating the MiB
     * when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers.
     * We recommend specifying container-level resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use
     * one of the following values, which determines your range of supported
     * values for the <code>cpu</code> parameter:
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
     *         The amount of memory (in MiB) used by the task. It can be
     *         expressed as an integer using MiB, for example <code>1024</code>,
     *         or as a string using GB, for example <code>1GB</code> or
     *         <code>1 GB</code>, in a task definition. String values are
     *         converted to an integer indicating the MiB when the task
     *         definition is registered.
     *         </p>
     *         <note>
     *         <p>
     *         Task-level CPU and memory parameters are ignored for Windows
     *         containers. We recommend specifying container-level resources for
     *         Windows containers.
     *         </p>
     *         </note>
     *         <p>
     *         If using the EC2 launch type, this field is optional.
     *         </p>
     *         <p>
     *         If using the Fargate launch type, this field is required and you
     *         must use one of the following values, which determines your range
     *         of supported values for the <code>cpu</code> parameter:
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
     * The amount of memory (in MiB) used by the task. It can be expressed as an
     * integer using MiB, for example <code>1024</code>, or as a string using
     * GB, for example <code>1GB</code> or <code>1 GB</code>, in a task
     * definition. String values are converted to an integer indicating the MiB
     * when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers.
     * We recommend specifying container-level resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use
     * one of the following values, which determines your range of supported
     * values for the <code>cpu</code> parameter:
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
     *            The amount of memory (in MiB) used by the task. It can be
     *            expressed as an integer using MiB, for example
     *            <code>1024</code>, or as a string using GB, for example
     *            <code>1GB</code> or <code>1 GB</code>, in a task definition.
     *            String values are converted to an integer indicating the MiB
     *            when the task definition is registered.
     *            </p>
     *            <note>
     *            <p>
     *            Task-level CPU and memory parameters are ignored for Windows
     *            containers. We recommend specifying container-level resources
     *            for Windows containers.
     *            </p>
     *            </note>
     *            <p>
     *            If using the EC2 launch type, this field is optional.
     *            </p>
     *            <p>
     *            If using the Fargate launch type, this field is required and
     *            you must use one of the following values, which determines
     *            your range of supported values for the <code>cpu</code>
     *            parameter:
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
     * The amount of memory (in MiB) used by the task. It can be expressed as an
     * integer using MiB, for example <code>1024</code>, or as a string using
     * GB, for example <code>1GB</code> or <code>1 GB</code>, in a task
     * definition. String values are converted to an integer indicating the MiB
     * when the task definition is registered.
     * </p>
     * <note>
     * <p>
     * Task-level CPU and memory parameters are ignored for Windows containers.
     * We recommend specifying container-level resources for Windows containers.
     * </p>
     * </note>
     * <p>
     * If using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If using the Fargate launch type, this field is required and you must use
     * one of the following values, which determines your range of supported
     * values for the <code>cpu</code> parameter:
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
     *            The amount of memory (in MiB) used by the task. It can be
     *            expressed as an integer using MiB, for example
     *            <code>1024</code>, or as a string using GB, for example
     *            <code>1GB</code> or <code>1 GB</code>, in a task definition.
     *            String values are converted to an integer indicating the MiB
     *            when the task definition is registered.
     *            </p>
     *            <note>
     *            <p>
     *            Task-level CPU and memory parameters are ignored for Windows
     *            containers. We recommend specifying container-level resources
     *            for Windows containers.
     *            </p>
     *            </note>
     *            <p>
     *            If using the EC2 launch type, this field is optional.
     *            </p>
     *            <p>
     *            If using the Fargate launch type, this field is required and
     *            you must use one of the following values, which determines
     *            your range of supported values for the <code>cpu</code>
     *            parameter:
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
    public RegisterTaskDefinitionRequest withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the task definition to help you categorize
     * and organize them. Each tag consists of a key and an optional value, both
     * of which you define.
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
     *         The metadata that you apply to the task definition to help you
     *         categorize and organize them. Each tag consists of a key and an
     *         optional value, both of which you define.
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
     * The metadata that you apply to the task definition to help you categorize
     * and organize them. Each tag consists of a key and an optional value, both
     * of which you define.
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
     *            The metadata that you apply to the task definition to help you
     *            categorize and organize them. Each tag consists of a key and
     *            an optional value, both of which you define.
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
     * The metadata that you apply to the task definition to help you categorize
     * and organize them. Each tag consists of a key and an optional value, both
     * of which you define.
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
     *            The metadata that you apply to the task definition to help you
     *            categorize and organize them. Each tag consists of a key and
     *            an optional value, both of which you define.
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
    public RegisterTaskDefinitionRequest withTags(Tag... tags) {
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
     * The metadata that you apply to the task definition to help you categorize
     * and organize them. Each tag consists of a key and an optional value, both
     * of which you define.
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
     *            The metadata that you apply to the task definition to help you
     *            categorize and organize them. Each tag consists of a key and
     *            an optional value, both of which you define.
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
    public RegisterTaskDefinitionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
    public RegisterTaskDefinitionRequest withPidMode(String pidMode) {
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
    public RegisterTaskDefinitionRequest withPidMode(PidMode pidMode) {
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
    public RegisterTaskDefinitionRequest withIpcMode(String ipcMode) {
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
    public RegisterTaskDefinitionRequest withIpcMode(IpcMode ipcMode) {
        this.ipcMode = ipcMode.toString();
        return this;
    }

    /**
     * <p>
     * The configuration details for the App Mesh proxy.
     * </p>
     * <p>
     * For tasks using the EC2 launch type, the container instances require at
     * least version 1.26.0 of the container agent and at least version 1.26.0-1
     * of the <code>ecs-init</code> package to enable a proxy configuration. If
     * your container instances are launched from the Amazon ECS-optimized AMI
     * version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html"
     * >Amazon ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * For tasks using the Fargate launch type, the task or service requires
     * platform version 1.3.0 or later.
     * </p>
     *
     * @return <p>
     *         The configuration details for the App Mesh proxy.
     *         </p>
     *         <p>
     *         For tasks using the EC2 launch type, the container instances
     *         require at least version 1.26.0 of the container agent and at
     *         least version 1.26.0-1 of the <code>ecs-init</code> package to
     *         enable a proxy configuration. If your container instances are
     *         launched from the Amazon ECS-optimized AMI version
     *         <code>20190301</code> or later, then they contain the required
     *         versions of the container agent and <code>ecs-init</code>. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html"
     *         >Amazon ECS-optimized Linux AMI</a> in the <i>Amazon Elastic
     *         Container Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         For tasks using the Fargate launch type, the task or service
     *         requires platform version 1.3.0 or later.
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
     * For tasks using the EC2 launch type, the container instances require at
     * least version 1.26.0 of the container agent and at least version 1.26.0-1
     * of the <code>ecs-init</code> package to enable a proxy configuration. If
     * your container instances are launched from the Amazon ECS-optimized AMI
     * version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html"
     * >Amazon ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * For tasks using the Fargate launch type, the task or service requires
     * platform version 1.3.0 or later.
     * </p>
     *
     * @param proxyConfiguration <p>
     *            The configuration details for the App Mesh proxy.
     *            </p>
     *            <p>
     *            For tasks using the EC2 launch type, the container instances
     *            require at least version 1.26.0 of the container agent and at
     *            least version 1.26.0-1 of the <code>ecs-init</code> package to
     *            enable a proxy configuration. If your container instances are
     *            launched from the Amazon ECS-optimized AMI version
     *            <code>20190301</code> or later, then they contain the required
     *            versions of the container agent and <code>ecs-init</code>. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html"
     *            >Amazon ECS-optimized Linux AMI</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            For tasks using the Fargate launch type, the task or service
     *            requires platform version 1.3.0 or later.
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
     * For tasks using the EC2 launch type, the container instances require at
     * least version 1.26.0 of the container agent and at least version 1.26.0-1
     * of the <code>ecs-init</code> package to enable a proxy configuration. If
     * your container instances are launched from the Amazon ECS-optimized AMI
     * version <code>20190301</code> or later, then they contain the required
     * versions of the container agent and <code>ecs-init</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html"
     * >Amazon ECS-optimized Linux AMI</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * For tasks using the Fargate launch type, the task or service requires
     * platform version 1.3.0 or later.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param proxyConfiguration <p>
     *            The configuration details for the App Mesh proxy.
     *            </p>
     *            <p>
     *            For tasks using the EC2 launch type, the container instances
     *            require at least version 1.26.0 of the container agent and at
     *            least version 1.26.0-1 of the <code>ecs-init</code> package to
     *            enable a proxy configuration. If your container instances are
     *            launched from the Amazon ECS-optimized AMI version
     *            <code>20190301</code> or later, then they contain the required
     *            versions of the container agent and <code>ecs-init</code>. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html"
     *            >Amazon ECS-optimized Linux AMI</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            For tasks using the Fargate launch type, the task or service
     *            requires platform version 1.3.0 or later.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTaskDefinitionRequest withProxyConfiguration(
            ProxyConfiguration proxyConfiguration) {
        this.proxyConfiguration = proxyConfiguration;
        return this;
    }

    /**
     * <p>
     * The Elastic Inference accelerators to use for the containers in the task.
     * </p>
     *
     * @return <p>
     *         The Elastic Inference accelerators to use for the containers in
     *         the task.
     *         </p>
     */
    public java.util.List<InferenceAccelerator> getInferenceAccelerators() {
        return inferenceAccelerators;
    }

    /**
     * <p>
     * The Elastic Inference accelerators to use for the containers in the task.
     * </p>
     *
     * @param inferenceAccelerators <p>
     *            The Elastic Inference accelerators to use for the containers
     *            in the task.
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
     * The Elastic Inference accelerators to use for the containers in the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inferenceAccelerators <p>
     *            The Elastic Inference accelerators to use for the containers
     *            in the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTaskDefinitionRequest withInferenceAccelerators(
            InferenceAccelerator... inferenceAccelerators) {
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
     * The Elastic Inference accelerators to use for the containers in the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inferenceAccelerators <p>
     *            The Elastic Inference accelerators to use for the containers
     *            in the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterTaskDefinitionRequest withInferenceAccelerators(
            java.util.Collection<InferenceAccelerator> inferenceAccelerators) {
        setInferenceAccelerators(inferenceAccelerators);
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
        if (getFamily() != null)
            sb.append("family: " + getFamily() + ",");
        if (getTaskRoleArn() != null)
            sb.append("taskRoleArn: " + getTaskRoleArn() + ",");
        if (getExecutionRoleArn() != null)
            sb.append("executionRoleArn: " + getExecutionRoleArn() + ",");
        if (getNetworkMode() != null)
            sb.append("networkMode: " + getNetworkMode() + ",");
        if (getContainerDefinitions() != null)
            sb.append("containerDefinitions: " + getContainerDefinitions() + ",");
        if (getVolumes() != null)
            sb.append("volumes: " + getVolumes() + ",");
        if (getPlacementConstraints() != null)
            sb.append("placementConstraints: " + getPlacementConstraints() + ",");
        if (getRequiresCompatibilities() != null)
            sb.append("requiresCompatibilities: " + getRequiresCompatibilities() + ",");
        if (getCpu() != null)
            sb.append("cpu: " + getCpu() + ",");
        if (getMemory() != null)
            sb.append("memory: " + getMemory() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getPidMode() != null)
            sb.append("pidMode: " + getPidMode() + ",");
        if (getIpcMode() != null)
            sb.append("ipcMode: " + getIpcMode() + ",");
        if (getProxyConfiguration() != null)
            sb.append("proxyConfiguration: " + getProxyConfiguration() + ",");
        if (getInferenceAccelerators() != null)
            sb.append("inferenceAccelerators: " + getInferenceAccelerators());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode
                + ((getTaskRoleArn() == null) ? 0 : getTaskRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkMode() == null) ? 0 : getNetworkMode().hashCode());
        hashCode = prime * hashCode
                + ((getContainerDefinitions() == null) ? 0 : getContainerDefinitions().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        hashCode = prime * hashCode
                + ((getPlacementConstraints() == null) ? 0 : getPlacementConstraints().hashCode());
        hashCode = prime
                * hashCode
                + ((getRequiresCompatibilities() == null) ? 0 : getRequiresCompatibilities()
                        .hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPidMode() == null) ? 0 : getPidMode().hashCode());
        hashCode = prime * hashCode + ((getIpcMode() == null) ? 0 : getIpcMode().hashCode());
        hashCode = prime * hashCode
                + ((getProxyConfiguration() == null) ? 0 : getProxyConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getInferenceAccelerators() == null) ? 0 : getInferenceAccelerators().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTaskDefinitionRequest == false)
            return false;
        RegisterTaskDefinitionRequest other = (RegisterTaskDefinitionRequest) obj;

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
        if (other.getContainerDefinitions() == null ^ this.getContainerDefinitions() == null)
            return false;
        if (other.getContainerDefinitions() != null
                && other.getContainerDefinitions().equals(this.getContainerDefinitions()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        if (other.getPlacementConstraints() == null ^ this.getPlacementConstraints() == null)
            return false;
        if (other.getPlacementConstraints() != null
                && other.getPlacementConstraints().equals(this.getPlacementConstraints()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        if (other.getInferenceAccelerators() == null ^ this.getInferenceAccelerators() == null)
            return false;
        if (other.getInferenceAccelerators() != null
                && other.getInferenceAccelerators().equals(this.getInferenceAccelerators()) == false)
            return false;
        return true;
    }
}
