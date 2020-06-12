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
 * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy or an
 * <code>EXTERNAL</code> deployment. An Amazon ECS task set includes details
 * such as the desired number of tasks, how many tasks are running, and whether
 * the task set serves production traffic.
 * </p>
 */
public class TaskSet implements Serializable {
    /**
     * <p>
     * The ID of the task set.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task set.
     * </p>
     */
    private String taskSetArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service the task set exists in.
     * </p>
     */
    private String serviceArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that the service that hosts
     * the task set exists in.
     * </p>
     */
    private String clusterArn;

    /**
     * <p>
     * The tag specified when a task set is started. If the task set is created
     * by an AWS CodeDeploy deployment, the <code>startedBy</code> parameter is
     * <code>CODE_DEPLOY</code>. For a task set created for an external
     * deployment, the startedBy field isn't used.
     * </p>
     */
    private String startedBy;

    /**
     * <p>
     * The external ID associated with the task set.
     * </p>
     * <p>
     * If a task set is created by an AWS CodeDeploy deployment, the
     * <code>externalId</code> parameter contains the AWS CodeDeploy deployment
     * ID.
     * </p>
     * <p>
     * If a task set is created for an external deployment and is associated
     * with a service discovery registry, the <code>externalId</code> parameter
     * contains the <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS Cloud Map
     * attribute.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * The status of the task set. The following describes each state:
     * </p>
     * <dl>
     * <dt>PRIMARY</dt>
     * <dd>
     * <p>
     * The task set is serving production traffic.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The task set is not serving production traffic.
     * </p>
     * </dd>
     * <dt>DRAINING</dt>
     * <dd>
     * <p>
     * The tasks in the task set are being stopped and their corresponding
     * targets are being deregistered from their target group.
     * </p>
     * </dd>
     * </dl>
     */
    private String status;

    /**
     * <p>
     * The task definition the task set is using.
     * </p>
     */
    private String taskDefinition;

    /**
     * <p>
     * The computed desired count for the task set. This is calculated by
     * multiplying the service's <code>desiredCount</code> by the task set's
     * <code>scale</code> percentage. The result is always rounded up. For
     * example, if the computed desired count is 1.2, it rounds up to 2 tasks.
     * </p>
     */
    private Integer computedDesiredCount;

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>PENDING</code>
     * status during a deployment. A task in the <code>PENDING</code> state is
     * preparing to enter the <code>RUNNING</code> state. A task set enters the
     * <code>PENDING</code> status when it launches for the first time or when
     * it is restarted after being in the <code>STOPPED</code> state.
     * </p>
     */
    private Integer pendingCount;

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>RUNNING</code>
     * status during a deployment. A task in the <code>RUNNING</code> state is
     * running and ready for use.
     * </p>
     */
    private Integer runningCount;

    /**
     * <p>
     * The Unix timestamp for when the task set was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The Unix timestamp for when the task set was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The launch type the tasks in the task set are using. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     */
    private String launchType;

    /**
     * <p>
     * The capacity provider strategy associated with the task set.
     * </p>
     */
    private java.util.List<CapacityProviderStrategyItem> capacityProviderStrategy;

    /**
     * <p>
     * The platform version on which the tasks in the task set are running. A
     * platform version is only specified for tasks using the Fargate launch
     * type. If one is not specified, the <code>LATEST</code> platform version
     * is used by default. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     */
    private String platformVersion;

    /**
     * <p>
     * The network configuration for the task set.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;

    /**
     * <p>
     * Details on a load balancer that is used with a task set.
     * </p>
     */
    private java.util.List<LoadBalancer> loadBalancers;

    /**
     * <p>
     * The details of the service discovery registries to assign to this task
     * set. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     * >Service Discovery</a>.
     * </p>
     */
    private java.util.List<ServiceRegistry> serviceRegistries;

    /**
     * <p>
     * A floating-point percentage of the desired number of tasks to place and
     * keep running in the task set.
     * </p>
     */
    private Scale scale;

    /**
     * <p>
     * The stability status, which indicates whether the task set has reached a
     * steady state. If the following conditions are met, the task set will be
     * in <code>STEADY_STATE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The task <code>runningCount</code> is equal to the
     * <code>computedDesiredCount</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>pendingCount</code> is <code>0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * There are no tasks running on container instances in the
     * <code>DRAINING</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * All tasks are reporting a healthy status from the load balancers, service
     * discovery, and container health checks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of those conditions are not met, the stability status returns
     * <code>STABILIZING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STEADY_STATE, STABILIZING
     */
    private String stabilityStatus;

    /**
     * <p>
     * The Unix timestamp for when the task set stability status was retrieved.
     * </p>
     */
    private java.util.Date stabilityStatusAt;

    /**
     * <p>
     * The metadata that you apply to the task set to help you categorize and
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
     * The ID of the task set.
     * </p>
     *
     * @return <p>
     *         The ID of the task set.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the task set.
     * </p>
     *
     * @param id <p>
     *            The ID of the task set.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the task set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The ID of the task set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task set.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the task set.
     *         </p>
     */
    public String getTaskSetArn() {
        return taskSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task set.
     * </p>
     *
     * @param taskSetArn <p>
     *            The Amazon Resource Name (ARN) of the task set.
     *            </p>
     */
    public void setTaskSetArn(String taskSetArn) {
        this.taskSetArn = taskSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskSetArn <p>
     *            The Amazon Resource Name (ARN) of the task set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withTaskSetArn(String taskSetArn) {
        this.taskSetArn = taskSetArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service the task set exists in.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the service the task set exists
     *         in.
     *         </p>
     */
    public String getServiceArn() {
        return serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service the task set exists in.
     * </p>
     *
     * @param serviceArn <p>
     *            The Amazon Resource Name (ARN) of the service the task set
     *            exists in.
     *            </p>
     */
    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service the task set exists in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceArn <p>
     *            The Amazon Resource Name (ARN) of the service the task set
     *            exists in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that the service that hosts
     * the task set exists in.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the cluster that the service
     *         that hosts the task set exists in.
     *         </p>
     */
    public String getClusterArn() {
        return clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that the service that hosts
     * the task set exists in.
     * </p>
     *
     * @param clusterArn <p>
     *            The Amazon Resource Name (ARN) of the cluster that the service
     *            that hosts the task set exists in.
     *            </p>
     */
    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that the service that hosts
     * the task set exists in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterArn <p>
     *            The Amazon Resource Name (ARN) of the cluster that the service
     *            that hosts the task set exists in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
        return this;
    }

    /**
     * <p>
     * The tag specified when a task set is started. If the task set is created
     * by an AWS CodeDeploy deployment, the <code>startedBy</code> parameter is
     * <code>CODE_DEPLOY</code>. For a task set created for an external
     * deployment, the startedBy field isn't used.
     * </p>
     *
     * @return <p>
     *         The tag specified when a task set is started. If the task set is
     *         created by an AWS CodeDeploy deployment, the
     *         <code>startedBy</code> parameter is <code>CODE_DEPLOY</code>. For
     *         a task set created for an external deployment, the startedBy
     *         field isn't used.
     *         </p>
     */
    public String getStartedBy() {
        return startedBy;
    }

    /**
     * <p>
     * The tag specified when a task set is started. If the task set is created
     * by an AWS CodeDeploy deployment, the <code>startedBy</code> parameter is
     * <code>CODE_DEPLOY</code>. For a task set created for an external
     * deployment, the startedBy field isn't used.
     * </p>
     *
     * @param startedBy <p>
     *            The tag specified when a task set is started. If the task set
     *            is created by an AWS CodeDeploy deployment, the
     *            <code>startedBy</code> parameter is <code>CODE_DEPLOY</code>.
     *            For a task set created for an external deployment, the
     *            startedBy field isn't used.
     *            </p>
     */
    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    /**
     * <p>
     * The tag specified when a task set is started. If the task set is created
     * by an AWS CodeDeploy deployment, the <code>startedBy</code> parameter is
     * <code>CODE_DEPLOY</code>. For a task set created for an external
     * deployment, the startedBy field isn't used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startedBy <p>
     *            The tag specified when a task set is started. If the task set
     *            is created by an AWS CodeDeploy deployment, the
     *            <code>startedBy</code> parameter is <code>CODE_DEPLOY</code>.
     *            For a task set created for an external deployment, the
     *            startedBy field isn't used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withStartedBy(String startedBy) {
        this.startedBy = startedBy;
        return this;
    }

    /**
     * <p>
     * The external ID associated with the task set.
     * </p>
     * <p>
     * If a task set is created by an AWS CodeDeploy deployment, the
     * <code>externalId</code> parameter contains the AWS CodeDeploy deployment
     * ID.
     * </p>
     * <p>
     * If a task set is created for an external deployment and is associated
     * with a service discovery registry, the <code>externalId</code> parameter
     * contains the <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS Cloud Map
     * attribute.
     * </p>
     *
     * @return <p>
     *         The external ID associated with the task set.
     *         </p>
     *         <p>
     *         If a task set is created by an AWS CodeDeploy deployment, the
     *         <code>externalId</code> parameter contains the AWS CodeDeploy
     *         deployment ID.
     *         </p>
     *         <p>
     *         If a task set is created for an external deployment and is
     *         associated with a service discovery registry, the
     *         <code>externalId</code> parameter contains the
     *         <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS Cloud Map attribute.
     *         </p>
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * <p>
     * The external ID associated with the task set.
     * </p>
     * <p>
     * If a task set is created by an AWS CodeDeploy deployment, the
     * <code>externalId</code> parameter contains the AWS CodeDeploy deployment
     * ID.
     * </p>
     * <p>
     * If a task set is created for an external deployment and is associated
     * with a service discovery registry, the <code>externalId</code> parameter
     * contains the <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS Cloud Map
     * attribute.
     * </p>
     *
     * @param externalId <p>
     *            The external ID associated with the task set.
     *            </p>
     *            <p>
     *            If a task set is created by an AWS CodeDeploy deployment, the
     *            <code>externalId</code> parameter contains the AWS CodeDeploy
     *            deployment ID.
     *            </p>
     *            <p>
     *            If a task set is created for an external deployment and is
     *            associated with a service discovery registry, the
     *            <code>externalId</code> parameter contains the
     *            <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS Cloud Map attribute.
     *            </p>
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external ID associated with the task set.
     * </p>
     * <p>
     * If a task set is created by an AWS CodeDeploy deployment, the
     * <code>externalId</code> parameter contains the AWS CodeDeploy deployment
     * ID.
     * </p>
     * <p>
     * If a task set is created for an external deployment and is associated
     * with a service discovery registry, the <code>externalId</code> parameter
     * contains the <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS Cloud Map
     * attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalId <p>
     *            The external ID associated with the task set.
     *            </p>
     *            <p>
     *            If a task set is created by an AWS CodeDeploy deployment, the
     *            <code>externalId</code> parameter contains the AWS CodeDeploy
     *            deployment ID.
     *            </p>
     *            <p>
     *            If a task set is created for an external deployment and is
     *            associated with a service discovery registry, the
     *            <code>externalId</code> parameter contains the
     *            <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS Cloud Map attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * <p>
     * The status of the task set. The following describes each state:
     * </p>
     * <dl>
     * <dt>PRIMARY</dt>
     * <dd>
     * <p>
     * The task set is serving production traffic.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The task set is not serving production traffic.
     * </p>
     * </dd>
     * <dt>DRAINING</dt>
     * <dd>
     * <p>
     * The tasks in the task set are being stopped and their corresponding
     * targets are being deregistered from their target group.
     * </p>
     * </dd>
     * </dl>
     *
     * @return <p>
     *         The status of the task set. The following describes each state:
     *         </p>
     *         <dl>
     *         <dt>PRIMARY</dt>
     *         <dd>
     *         <p>
     *         The task set is serving production traffic.
     *         </p>
     *         </dd>
     *         <dt>ACTIVE</dt>
     *         <dd>
     *         <p>
     *         The task set is not serving production traffic.
     *         </p>
     *         </dd>
     *         <dt>DRAINING</dt>
     *         <dd>
     *         <p>
     *         The tasks in the task set are being stopped and their
     *         corresponding targets are being deregistered from their target
     *         group.
     *         </p>
     *         </dd>
     *         </dl>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the task set. The following describes each state:
     * </p>
     * <dl>
     * <dt>PRIMARY</dt>
     * <dd>
     * <p>
     * The task set is serving production traffic.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The task set is not serving production traffic.
     * </p>
     * </dd>
     * <dt>DRAINING</dt>
     * <dd>
     * <p>
     * The tasks in the task set are being stopped and their corresponding
     * targets are being deregistered from their target group.
     * </p>
     * </dd>
     * </dl>
     *
     * @param status <p>
     *            The status of the task set. The following describes each
     *            state:
     *            </p>
     *            <dl>
     *            <dt>PRIMARY</dt>
     *            <dd>
     *            <p>
     *            The task set is serving production traffic.
     *            </p>
     *            </dd>
     *            <dt>ACTIVE</dt>
     *            <dd>
     *            <p>
     *            The task set is not serving production traffic.
     *            </p>
     *            </dd>
     *            <dt>DRAINING</dt>
     *            <dd>
     *            <p>
     *            The tasks in the task set are being stopped and their
     *            corresponding targets are being deregistered from their target
     *            group.
     *            </p>
     *            </dd>
     *            </dl>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the task set. The following describes each state:
     * </p>
     * <dl>
     * <dt>PRIMARY</dt>
     * <dd>
     * <p>
     * The task set is serving production traffic.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The task set is not serving production traffic.
     * </p>
     * </dd>
     * <dt>DRAINING</dt>
     * <dd>
     * <p>
     * The tasks in the task set are being stopped and their corresponding
     * targets are being deregistered from their target group.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the task set. The following describes each
     *            state:
     *            </p>
     *            <dl>
     *            <dt>PRIMARY</dt>
     *            <dd>
     *            <p>
     *            The task set is serving production traffic.
     *            </p>
     *            </dd>
     *            <dt>ACTIVE</dt>
     *            <dd>
     *            <p>
     *            The task set is not serving production traffic.
     *            </p>
     *            </dd>
     *            <dt>DRAINING</dt>
     *            <dd>
     *            <p>
     *            The tasks in the task set are being stopped and their
     *            corresponding targets are being deregistered from their target
     *            group.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The task definition the task set is using.
     * </p>
     *
     * @return <p>
     *         The task definition the task set is using.
     *         </p>
     */
    public String getTaskDefinition() {
        return taskDefinition;
    }

    /**
     * <p>
     * The task definition the task set is using.
     * </p>
     *
     * @param taskDefinition <p>
     *            The task definition the task set is using.
     *            </p>
     */
    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The task definition the task set is using.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskDefinition <p>
     *            The task definition the task set is using.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
        return this;
    }

    /**
     * <p>
     * The computed desired count for the task set. This is calculated by
     * multiplying the service's <code>desiredCount</code> by the task set's
     * <code>scale</code> percentage. The result is always rounded up. For
     * example, if the computed desired count is 1.2, it rounds up to 2 tasks.
     * </p>
     *
     * @return <p>
     *         The computed desired count for the task set. This is calculated
     *         by multiplying the service's <code>desiredCount</code> by the
     *         task set's <code>scale</code> percentage. The result is always
     *         rounded up. For example, if the computed desired count is 1.2, it
     *         rounds up to 2 tasks.
     *         </p>
     */
    public Integer getComputedDesiredCount() {
        return computedDesiredCount;
    }

    /**
     * <p>
     * The computed desired count for the task set. This is calculated by
     * multiplying the service's <code>desiredCount</code> by the task set's
     * <code>scale</code> percentage. The result is always rounded up. For
     * example, if the computed desired count is 1.2, it rounds up to 2 tasks.
     * </p>
     *
     * @param computedDesiredCount <p>
     *            The computed desired count for the task set. This is
     *            calculated by multiplying the service's
     *            <code>desiredCount</code> by the task set's <code>scale</code>
     *            percentage. The result is always rounded up. For example, if
     *            the computed desired count is 1.2, it rounds up to 2 tasks.
     *            </p>
     */
    public void setComputedDesiredCount(Integer computedDesiredCount) {
        this.computedDesiredCount = computedDesiredCount;
    }

    /**
     * <p>
     * The computed desired count for the task set. This is calculated by
     * multiplying the service's <code>desiredCount</code> by the task set's
     * <code>scale</code> percentage. The result is always rounded up. For
     * example, if the computed desired count is 1.2, it rounds up to 2 tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param computedDesiredCount <p>
     *            The computed desired count for the task set. This is
     *            calculated by multiplying the service's
     *            <code>desiredCount</code> by the task set's <code>scale</code>
     *            percentage. The result is always rounded up. For example, if
     *            the computed desired count is 1.2, it rounds up to 2 tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withComputedDesiredCount(Integer computedDesiredCount) {
        this.computedDesiredCount = computedDesiredCount;
        return this;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>PENDING</code>
     * status during a deployment. A task in the <code>PENDING</code> state is
     * preparing to enter the <code>RUNNING</code> state. A task set enters the
     * <code>PENDING</code> status when it launches for the first time or when
     * it is restarted after being in the <code>STOPPED</code> state.
     * </p>
     *
     * @return <p>
     *         The number of tasks in the task set that are in the
     *         <code>PENDING</code> status during a deployment. A task in the
     *         <code>PENDING</code> state is preparing to enter the
     *         <code>RUNNING</code> state. A task set enters the
     *         <code>PENDING</code> status when it launches for the first time
     *         or when it is restarted after being in the <code>STOPPED</code>
     *         state.
     *         </p>
     */
    public Integer getPendingCount() {
        return pendingCount;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>PENDING</code>
     * status during a deployment. A task in the <code>PENDING</code> state is
     * preparing to enter the <code>RUNNING</code> state. A task set enters the
     * <code>PENDING</code> status when it launches for the first time or when
     * it is restarted after being in the <code>STOPPED</code> state.
     * </p>
     *
     * @param pendingCount <p>
     *            The number of tasks in the task set that are in the
     *            <code>PENDING</code> status during a deployment. A task in the
     *            <code>PENDING</code> state is preparing to enter the
     *            <code>RUNNING</code> state. A task set enters the
     *            <code>PENDING</code> status when it launches for the first
     *            time or when it is restarted after being in the
     *            <code>STOPPED</code> state.
     *            </p>
     */
    public void setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>PENDING</code>
     * status during a deployment. A task in the <code>PENDING</code> state is
     * preparing to enter the <code>RUNNING</code> state. A task set enters the
     * <code>PENDING</code> status when it launches for the first time or when
     * it is restarted after being in the <code>STOPPED</code> state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingCount <p>
     *            The number of tasks in the task set that are in the
     *            <code>PENDING</code> status during a deployment. A task in the
     *            <code>PENDING</code> state is preparing to enter the
     *            <code>RUNNING</code> state. A task set enters the
     *            <code>PENDING</code> status when it launches for the first
     *            time or when it is restarted after being in the
     *            <code>STOPPED</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
        return this;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>RUNNING</code>
     * status during a deployment. A task in the <code>RUNNING</code> state is
     * running and ready for use.
     * </p>
     *
     * @return <p>
     *         The number of tasks in the task set that are in the
     *         <code>RUNNING</code> status during a deployment. A task in the
     *         <code>RUNNING</code> state is running and ready for use.
     *         </p>
     */
    public Integer getRunningCount() {
        return runningCount;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>RUNNING</code>
     * status during a deployment. A task in the <code>RUNNING</code> state is
     * running and ready for use.
     * </p>
     *
     * @param runningCount <p>
     *            The number of tasks in the task set that are in the
     *            <code>RUNNING</code> status during a deployment. A task in the
     *            <code>RUNNING</code> state is running and ready for use.
     *            </p>
     */
    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    /**
     * <p>
     * The number of tasks in the task set that are in the <code>RUNNING</code>
     * status during a deployment. A task in the <code>RUNNING</code> state is
     * running and ready for use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runningCount <p>
     *            The number of tasks in the task set that are in the
     *            <code>RUNNING</code> status during a deployment. A task in the
     *            <code>RUNNING</code> state is running and ready for use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task set was created.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for when the task set was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task set was created.
     * </p>
     *
     * @param createdAt <p>
     *            The Unix timestamp for when the task set was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task set was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The Unix timestamp for when the task set was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task set was last updated.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for when the task set was last updated.
     *         </p>
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task set was last updated.
     * </p>
     *
     * @param updatedAt <p>
     *            The Unix timestamp for when the task set was last updated.
     *            </p>
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task set was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The Unix timestamp for when the task set was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * <p>
     * The launch type the tasks in the task set are using. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @return <p>
     *         The launch type the tasks in the task set are using. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *         >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container
     *         Service Developer Guide</i>.
     *         </p>
     * @see LaunchType
     */
    public String getLaunchType() {
        return launchType;
    }

    /**
     * <p>
     * The launch type the tasks in the task set are using. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type the tasks in the task set are using. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @see LaunchType
     */
    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * The launch type the tasks in the task set are using. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type the tasks in the task set are using. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LaunchType
     */
    public TaskSet withLaunchType(String launchType) {
        this.launchType = launchType;
        return this;
    }

    /**
     * <p>
     * The launch type the tasks in the task set are using. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type the tasks in the task set are using. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @see LaunchType
     */
    public void setLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
    }

    /**
     * <p>
     * The launch type the tasks in the task set are using. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type the tasks in the task set are using. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LaunchType
     */
    public TaskSet withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy associated with the task set.
     * </p>
     *
     * @return <p>
     *         The capacity provider strategy associated with the task set.
     *         </p>
     */
    public java.util.List<CapacityProviderStrategyItem> getCapacityProviderStrategy() {
        return capacityProviderStrategy;
    }

    /**
     * <p>
     * The capacity provider strategy associated with the task set.
     * </p>
     *
     * @param capacityProviderStrategy <p>
     *            The capacity provider strategy associated with the task set.
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
     * The capacity provider strategy associated with the task set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviderStrategy <p>
     *            The capacity provider strategy associated with the task set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withCapacityProviderStrategy(
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
     * The capacity provider strategy associated with the task set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviderStrategy <p>
     *            The capacity provider strategy associated with the task set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withCapacityProviderStrategy(
            java.util.Collection<CapacityProviderStrategyItem> capacityProviderStrategy) {
        setCapacityProviderStrategy(capacityProviderStrategy);
        return this;
    }

    /**
     * <p>
     * The platform version on which the tasks in the task set are running. A
     * platform version is only specified for tasks using the Fargate launch
     * type. If one is not specified, the <code>LATEST</code> platform version
     * is used by default. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The platform version on which the tasks in the task set are
     *         running. A platform version is only specified for tasks using the
     *         Fargate launch type. If one is not specified, the
     *         <code>LATEST</code> platform version is used by default. For more
     *         information, see <a href=
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
     * The platform version on which the tasks in the task set are running. A
     * platform version is only specified for tasks using the Fargate launch
     * type. If one is not specified, the <code>LATEST</code> platform version
     * is used by default. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @param platformVersion <p>
     *            The platform version on which the tasks in the task set are
     *            running. A platform version is only specified for tasks using
     *            the Fargate launch type. If one is not specified, the
     *            <code>LATEST</code> platform version is used by default. For
     *            more information, see <a href=
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
     * The platform version on which the tasks in the task set are running. A
     * platform version is only specified for tasks using the Fargate launch
     * type. If one is not specified, the <code>LATEST</code> platform version
     * is used by default. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformVersion <p>
     *            The platform version on which the tasks in the task set are
     *            running. A platform version is only specified for tasks using
     *            the Fargate launch type. If one is not specified, the
     *            <code>LATEST</code> platform version is used by default. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     *            >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * <p>
     * The network configuration for the task set.
     * </p>
     *
     * @return <p>
     *         The network configuration for the task set.
     *         </p>
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for the task set.
     * </p>
     *
     * @param networkConfiguration <p>
     *            The network configuration for the task set.
     *            </p>
     */
    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for the task set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkConfiguration <p>
     *            The network configuration for the task set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * <p>
     * Details on a load balancer that is used with a task set.
     * </p>
     *
     * @return <p>
     *         Details on a load balancer that is used with a task set.
     *         </p>
     */
    public java.util.List<LoadBalancer> getLoadBalancers() {
        return loadBalancers;
    }

    /**
     * <p>
     * Details on a load balancer that is used with a task set.
     * </p>
     *
     * @param loadBalancers <p>
     *            Details on a load balancer that is used with a task set.
     *            </p>
     */
    public void setLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        if (loadBalancers == null) {
            this.loadBalancers = null;
            return;
        }

        this.loadBalancers = new java.util.ArrayList<LoadBalancer>(loadBalancers);
    }

    /**
     * <p>
     * Details on a load balancer that is used with a task set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancers <p>
     *            Details on a load balancer that is used with a task set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withLoadBalancers(LoadBalancer... loadBalancers) {
        if (getLoadBalancers() == null) {
            this.loadBalancers = new java.util.ArrayList<LoadBalancer>(loadBalancers.length);
        }
        for (LoadBalancer value : loadBalancers) {
            this.loadBalancers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Details on a load balancer that is used with a task set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancers <p>
     *            Details on a load balancer that is used with a task set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        setLoadBalancers(loadBalancers);
        return this;
    }

    /**
     * <p>
     * The details of the service discovery registries to assign to this task
     * set. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     * >Service Discovery</a>.
     * </p>
     *
     * @return <p>
     *         The details of the service discovery registries to assign to this
     *         task set. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     *         >Service Discovery</a>.
     *         </p>
     */
    public java.util.List<ServiceRegistry> getServiceRegistries() {
        return serviceRegistries;
    }

    /**
     * <p>
     * The details of the service discovery registries to assign to this task
     * set. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     * >Service Discovery</a>.
     * </p>
     *
     * @param serviceRegistries <p>
     *            The details of the service discovery registries to assign to
     *            this task set. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     *            >Service Discovery</a>.
     *            </p>
     */
    public void setServiceRegistries(java.util.Collection<ServiceRegistry> serviceRegistries) {
        if (serviceRegistries == null) {
            this.serviceRegistries = null;
            return;
        }

        this.serviceRegistries = new java.util.ArrayList<ServiceRegistry>(serviceRegistries);
    }

    /**
     * <p>
     * The details of the service discovery registries to assign to this task
     * set. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     * >Service Discovery</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceRegistries <p>
     *            The details of the service discovery registries to assign to
     *            this task set. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     *            >Service Discovery</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withServiceRegistries(ServiceRegistry... serviceRegistries) {
        if (getServiceRegistries() == null) {
            this.serviceRegistries = new java.util.ArrayList<ServiceRegistry>(
                    serviceRegistries.length);
        }
        for (ServiceRegistry value : serviceRegistries) {
            this.serviceRegistries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The details of the service discovery registries to assign to this task
     * set. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     * >Service Discovery</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceRegistries <p>
     *            The details of the service discovery registries to assign to
     *            this task set. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     *            >Service Discovery</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withServiceRegistries(java.util.Collection<ServiceRegistry> serviceRegistries) {
        setServiceRegistries(serviceRegistries);
        return this;
    }

    /**
     * <p>
     * A floating-point percentage of the desired number of tasks to place and
     * keep running in the task set.
     * </p>
     *
     * @return <p>
     *         A floating-point percentage of the desired number of tasks to
     *         place and keep running in the task set.
     *         </p>
     */
    public Scale getScale() {
        return scale;
    }

    /**
     * <p>
     * A floating-point percentage of the desired number of tasks to place and
     * keep running in the task set.
     * </p>
     *
     * @param scale <p>
     *            A floating-point percentage of the desired number of tasks to
     *            place and keep running in the task set.
     *            </p>
     */
    public void setScale(Scale scale) {
        this.scale = scale;
    }

    /**
     * <p>
     * A floating-point percentage of the desired number of tasks to place and
     * keep running in the task set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scale <p>
     *            A floating-point percentage of the desired number of tasks to
     *            place and keep running in the task set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withScale(Scale scale) {
        this.scale = scale;
        return this;
    }

    /**
     * <p>
     * The stability status, which indicates whether the task set has reached a
     * steady state. If the following conditions are met, the task set will be
     * in <code>STEADY_STATE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The task <code>runningCount</code> is equal to the
     * <code>computedDesiredCount</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>pendingCount</code> is <code>0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * There are no tasks running on container instances in the
     * <code>DRAINING</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * All tasks are reporting a healthy status from the load balancers, service
     * discovery, and container health checks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of those conditions are not met, the stability status returns
     * <code>STABILIZING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STEADY_STATE, STABILIZING
     *
     * @return <p>
     *         The stability status, which indicates whether the task set has
     *         reached a steady state. If the following conditions are met, the
     *         task set will be in <code>STEADY_STATE</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The task <code>runningCount</code> is equal to the
     *         <code>computedDesiredCount</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>pendingCount</code> is <code>0</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         There are no tasks running on container instances in the
     *         <code>DRAINING</code> status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         All tasks are reporting a healthy status from the load balancers,
     *         service discovery, and container health checks.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If any of those conditions are not met, the stability status
     *         returns <code>STABILIZING</code>.
     *         </p>
     * @see StabilityStatus
     */
    public String getStabilityStatus() {
        return stabilityStatus;
    }

    /**
     * <p>
     * The stability status, which indicates whether the task set has reached a
     * steady state. If the following conditions are met, the task set will be
     * in <code>STEADY_STATE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The task <code>runningCount</code> is equal to the
     * <code>computedDesiredCount</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>pendingCount</code> is <code>0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * There are no tasks running on container instances in the
     * <code>DRAINING</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * All tasks are reporting a healthy status from the load balancers, service
     * discovery, and container health checks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of those conditions are not met, the stability status returns
     * <code>STABILIZING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STEADY_STATE, STABILIZING
     *
     * @param stabilityStatus <p>
     *            The stability status, which indicates whether the task set has
     *            reached a steady state. If the following conditions are met,
     *            the task set will be in <code>STEADY_STATE</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The task <code>runningCount</code> is equal to the
     *            <code>computedDesiredCount</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The <code>pendingCount</code> is <code>0</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            There are no tasks running on container instances in the
     *            <code>DRAINING</code> status.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            All tasks are reporting a healthy status from the load
     *            balancers, service discovery, and container health checks.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If any of those conditions are not met, the stability status
     *            returns <code>STABILIZING</code>.
     *            </p>
     * @see StabilityStatus
     */
    public void setStabilityStatus(String stabilityStatus) {
        this.stabilityStatus = stabilityStatus;
    }

    /**
     * <p>
     * The stability status, which indicates whether the task set has reached a
     * steady state. If the following conditions are met, the task set will be
     * in <code>STEADY_STATE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The task <code>runningCount</code> is equal to the
     * <code>computedDesiredCount</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>pendingCount</code> is <code>0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * There are no tasks running on container instances in the
     * <code>DRAINING</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * All tasks are reporting a healthy status from the load balancers, service
     * discovery, and container health checks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of those conditions are not met, the stability status returns
     * <code>STABILIZING</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STEADY_STATE, STABILIZING
     *
     * @param stabilityStatus <p>
     *            The stability status, which indicates whether the task set has
     *            reached a steady state. If the following conditions are met,
     *            the task set will be in <code>STEADY_STATE</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The task <code>runningCount</code> is equal to the
     *            <code>computedDesiredCount</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The <code>pendingCount</code> is <code>0</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            There are no tasks running on container instances in the
     *            <code>DRAINING</code> status.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            All tasks are reporting a healthy status from the load
     *            balancers, service discovery, and container health checks.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If any of those conditions are not met, the stability status
     *            returns <code>STABILIZING</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StabilityStatus
     */
    public TaskSet withStabilityStatus(String stabilityStatus) {
        this.stabilityStatus = stabilityStatus;
        return this;
    }

    /**
     * <p>
     * The stability status, which indicates whether the task set has reached a
     * steady state. If the following conditions are met, the task set will be
     * in <code>STEADY_STATE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The task <code>runningCount</code> is equal to the
     * <code>computedDesiredCount</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>pendingCount</code> is <code>0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * There are no tasks running on container instances in the
     * <code>DRAINING</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * All tasks are reporting a healthy status from the load balancers, service
     * discovery, and container health checks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of those conditions are not met, the stability status returns
     * <code>STABILIZING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STEADY_STATE, STABILIZING
     *
     * @param stabilityStatus <p>
     *            The stability status, which indicates whether the task set has
     *            reached a steady state. If the following conditions are met,
     *            the task set will be in <code>STEADY_STATE</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The task <code>runningCount</code> is equal to the
     *            <code>computedDesiredCount</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The <code>pendingCount</code> is <code>0</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            There are no tasks running on container instances in the
     *            <code>DRAINING</code> status.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            All tasks are reporting a healthy status from the load
     *            balancers, service discovery, and container health checks.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If any of those conditions are not met, the stability status
     *            returns <code>STABILIZING</code>.
     *            </p>
     * @see StabilityStatus
     */
    public void setStabilityStatus(StabilityStatus stabilityStatus) {
        this.stabilityStatus = stabilityStatus.toString();
    }

    /**
     * <p>
     * The stability status, which indicates whether the task set has reached a
     * steady state. If the following conditions are met, the task set will be
     * in <code>STEADY_STATE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The task <code>runningCount</code> is equal to the
     * <code>computedDesiredCount</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>pendingCount</code> is <code>0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * There are no tasks running on container instances in the
     * <code>DRAINING</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * All tasks are reporting a healthy status from the load balancers, service
     * discovery, and container health checks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of those conditions are not met, the stability status returns
     * <code>STABILIZING</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STEADY_STATE, STABILIZING
     *
     * @param stabilityStatus <p>
     *            The stability status, which indicates whether the task set has
     *            reached a steady state. If the following conditions are met,
     *            the task set will be in <code>STEADY_STATE</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The task <code>runningCount</code> is equal to the
     *            <code>computedDesiredCount</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The <code>pendingCount</code> is <code>0</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            There are no tasks running on container instances in the
     *            <code>DRAINING</code> status.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            All tasks are reporting a healthy status from the load
     *            balancers, service discovery, and container health checks.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If any of those conditions are not met, the stability status
     *            returns <code>STABILIZING</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StabilityStatus
     */
    public TaskSet withStabilityStatus(StabilityStatus stabilityStatus) {
        this.stabilityStatus = stabilityStatus.toString();
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task set stability status was retrieved.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for when the task set stability status was
     *         retrieved.
     *         </p>
     */
    public java.util.Date getStabilityStatusAt() {
        return stabilityStatusAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task set stability status was retrieved.
     * </p>
     *
     * @param stabilityStatusAt <p>
     *            The Unix timestamp for when the task set stability status was
     *            retrieved.
     *            </p>
     */
    public void setStabilityStatusAt(java.util.Date stabilityStatusAt) {
        this.stabilityStatusAt = stabilityStatusAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task set stability status was retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stabilityStatusAt <p>
     *            The Unix timestamp for when the task set stability status was
     *            retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskSet withStabilityStatusAt(java.util.Date stabilityStatusAt) {
        this.stabilityStatusAt = stabilityStatusAt;
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the task set to help you categorize and
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
     *         The metadata that you apply to the task set to help you
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
     * The metadata that you apply to the task set to help you categorize and
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
     *            The metadata that you apply to the task set to help you
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
     * The metadata that you apply to the task set to help you categorize and
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
     *            The metadata that you apply to the task set to help you
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
    public TaskSet withTags(Tag... tags) {
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
     * The metadata that you apply to the task set to help you categorize and
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
     *            The metadata that you apply to the task set to help you
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
    public TaskSet withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getTaskSetArn() != null)
            sb.append("taskSetArn: " + getTaskSetArn() + ",");
        if (getServiceArn() != null)
            sb.append("serviceArn: " + getServiceArn() + ",");
        if (getClusterArn() != null)
            sb.append("clusterArn: " + getClusterArn() + ",");
        if (getStartedBy() != null)
            sb.append("startedBy: " + getStartedBy() + ",");
        if (getExternalId() != null)
            sb.append("externalId: " + getExternalId() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getTaskDefinition() != null)
            sb.append("taskDefinition: " + getTaskDefinition() + ",");
        if (getComputedDesiredCount() != null)
            sb.append("computedDesiredCount: " + getComputedDesiredCount() + ",");
        if (getPendingCount() != null)
            sb.append("pendingCount: " + getPendingCount() + ",");
        if (getRunningCount() != null)
            sb.append("runningCount: " + getRunningCount() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getUpdatedAt() != null)
            sb.append("updatedAt: " + getUpdatedAt() + ",");
        if (getLaunchType() != null)
            sb.append("launchType: " + getLaunchType() + ",");
        if (getCapacityProviderStrategy() != null)
            sb.append("capacityProviderStrategy: " + getCapacityProviderStrategy() + ",");
        if (getPlatformVersion() != null)
            sb.append("platformVersion: " + getPlatformVersion() + ",");
        if (getNetworkConfiguration() != null)
            sb.append("networkConfiguration: " + getNetworkConfiguration() + ",");
        if (getLoadBalancers() != null)
            sb.append("loadBalancers: " + getLoadBalancers() + ",");
        if (getServiceRegistries() != null)
            sb.append("serviceRegistries: " + getServiceRegistries() + ",");
        if (getScale() != null)
            sb.append("scale: " + getScale() + ",");
        if (getStabilityStatus() != null)
            sb.append("stabilityStatus: " + getStabilityStatus() + ",");
        if (getStabilityStatusAt() != null)
            sb.append("stabilityStatusAt: " + getStabilityStatusAt() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTaskSetArn() == null) ? 0 : getTaskSetArn().hashCode());
        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        hashCode = prime * hashCode
                + ((getComputedDesiredCount() == null) ? 0 : getComputedDesiredCount().hashCode());
        hashCode = prime * hashCode
                + ((getPendingCount() == null) ? 0 : getPendingCount().hashCode());
        hashCode = prime * hashCode
                + ((getRunningCount() == null) ? 0 : getRunningCount().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime
                * hashCode
                + ((getCapacityProviderStrategy() == null) ? 0 : getCapacityProviderStrategy()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getLoadBalancers() == null) ? 0 : getLoadBalancers().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRegistries() == null) ? 0 : getServiceRegistries().hashCode());
        hashCode = prime * hashCode + ((getScale() == null) ? 0 : getScale().hashCode());
        hashCode = prime * hashCode
                + ((getStabilityStatus() == null) ? 0 : getStabilityStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStabilityStatusAt() == null) ? 0 : getStabilityStatusAt().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskSet == false)
            return false;
        TaskSet other = (TaskSet) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTaskSetArn() == null ^ this.getTaskSetArn() == null)
            return false;
        if (other.getTaskSetArn() != null
                && other.getTaskSetArn().equals(this.getTaskSetArn()) == false)
            return false;
        if (other.getServiceArn() == null ^ this.getServiceArn() == null)
            return false;
        if (other.getServiceArn() != null
                && other.getServiceArn().equals(this.getServiceArn()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null
                && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getStartedBy() == null ^ this.getStartedBy() == null)
            return false;
        if (other.getStartedBy() != null
                && other.getStartedBy().equals(this.getStartedBy()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null
                && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null
                && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        if (other.getComputedDesiredCount() == null ^ this.getComputedDesiredCount() == null)
            return false;
        if (other.getComputedDesiredCount() != null
                && other.getComputedDesiredCount().equals(this.getComputedDesiredCount()) == false)
            return false;
        if (other.getPendingCount() == null ^ this.getPendingCount() == null)
            return false;
        if (other.getPendingCount() != null
                && other.getPendingCount().equals(this.getPendingCount()) == false)
            return false;
        if (other.getRunningCount() == null ^ this.getRunningCount() == null)
            return false;
        if (other.getRunningCount() != null
                && other.getRunningCount().equals(this.getRunningCount()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null
                && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getLaunchType() == null ^ this.getLaunchType() == null)
            return false;
        if (other.getLaunchType() != null
                && other.getLaunchType().equals(this.getLaunchType()) == false)
            return false;
        if (other.getCapacityProviderStrategy() == null
                ^ this.getCapacityProviderStrategy() == null)
            return false;
        if (other.getCapacityProviderStrategy() != null
                && other.getCapacityProviderStrategy().equals(this.getCapacityProviderStrategy()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null
                && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null
                && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getLoadBalancers() == null ^ this.getLoadBalancers() == null)
            return false;
        if (other.getLoadBalancers() != null
                && other.getLoadBalancers().equals(this.getLoadBalancers()) == false)
            return false;
        if (other.getServiceRegistries() == null ^ this.getServiceRegistries() == null)
            return false;
        if (other.getServiceRegistries() != null
                && other.getServiceRegistries().equals(this.getServiceRegistries()) == false)
            return false;
        if (other.getScale() == null ^ this.getScale() == null)
            return false;
        if (other.getScale() != null && other.getScale().equals(this.getScale()) == false)
            return false;
        if (other.getStabilityStatus() == null ^ this.getStabilityStatus() == null)
            return false;
        if (other.getStabilityStatus() != null
                && other.getStabilityStatus().equals(this.getStabilityStatus()) == false)
            return false;
        if (other.getStabilityStatusAt() == null ^ this.getStabilityStatusAt() == null)
            return false;
        if (other.getStabilityStatusAt() != null
                && other.getStabilityStatusAt().equals(this.getStabilityStatusAt()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
