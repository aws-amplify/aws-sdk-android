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
 * The details of an Amazon ECS service deployment. This is used only when a
 * service uses the <code>ECS</code> deployment controller type.
 * </p>
 */
public class Deployment implements Serializable {
    /**
     * <p>
     * The ID of the deployment.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The status of the deployment. The following describes each state:
     * </p>
     * <dl>
     * <dt>PRIMARY</dt>
     * <dd>
     * <p>
     * The most recent deployment of a service.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * A service deployment that still has running tasks, but are in the process
     * of being replaced with a new <code>PRIMARY</code> deployment.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * A deployment that has been completely replaced.
     * </p>
     * </dd>
     * </dl>
     */
    private String status;

    /**
     * <p>
     * The most recent task definition that was specified for the tasks in the
     * service to use.
     * </p>
     */
    private String taskDefinition;

    /**
     * <p>
     * The most recent desired count of tasks that was specified for the service
     * to deploy or maintain.
     * </p>
     */
    private Integer desiredCount;

    /**
     * <p>
     * The number of tasks in the deployment that are in the
     * <code>PENDING</code> status.
     * </p>
     */
    private Integer pendingCount;

    /**
     * <p>
     * The number of tasks in the deployment that are in the
     * <code>RUNNING</code> status.
     * </p>
     */
    private Integer runningCount;

    /**
     * <p>
     * The Unix timestamp for when the service deployment was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The Unix timestamp for when the service deployment was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The capacity provider strategy that the deployment is using.
     * </p>
     */
    private java.util.List<CapacityProviderStrategyItem> capacityProviderStrategy;

    /**
     * <p>
     * The launch type the tasks in the service are using. For more information,
     * see <a href=
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
     * The platform version on which your tasks in the service are running. A
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
     * The VPC subnet and security group configuration for tasks that receive
     * their own elastic network interface by using the <code>awsvpc</code>
     * networking mode.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     *
     * @return <p>
     *         The ID of the deployment.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     *
     * @param id <p>
     *            The ID of the deployment.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The ID of the deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Deployment withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The status of the deployment. The following describes each state:
     * </p>
     * <dl>
     * <dt>PRIMARY</dt>
     * <dd>
     * <p>
     * The most recent deployment of a service.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * A service deployment that still has running tasks, but are in the process
     * of being replaced with a new <code>PRIMARY</code> deployment.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * A deployment that has been completely replaced.
     * </p>
     * </dd>
     * </dl>
     *
     * @return <p>
     *         The status of the deployment. The following describes each state:
     *         </p>
     *         <dl>
     *         <dt>PRIMARY</dt>
     *         <dd>
     *         <p>
     *         The most recent deployment of a service.
     *         </p>
     *         </dd>
     *         <dt>ACTIVE</dt>
     *         <dd>
     *         <p>
     *         A service deployment that still has running tasks, but are in the
     *         process of being replaced with a new <code>PRIMARY</code>
     *         deployment.
     *         </p>
     *         </dd>
     *         <dt>INACTIVE</dt>
     *         <dd>
     *         <p>
     *         A deployment that has been completely replaced.
     *         </p>
     *         </dd>
     *         </dl>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the deployment. The following describes each state:
     * </p>
     * <dl>
     * <dt>PRIMARY</dt>
     * <dd>
     * <p>
     * The most recent deployment of a service.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * A service deployment that still has running tasks, but are in the process
     * of being replaced with a new <code>PRIMARY</code> deployment.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * A deployment that has been completely replaced.
     * </p>
     * </dd>
     * </dl>
     *
     * @param status <p>
     *            The status of the deployment. The following describes each
     *            state:
     *            </p>
     *            <dl>
     *            <dt>PRIMARY</dt>
     *            <dd>
     *            <p>
     *            The most recent deployment of a service.
     *            </p>
     *            </dd>
     *            <dt>ACTIVE</dt>
     *            <dd>
     *            <p>
     *            A service deployment that still has running tasks, but are in
     *            the process of being replaced with a new <code>PRIMARY</code>
     *            deployment.
     *            </p>
     *            </dd>
     *            <dt>INACTIVE</dt>
     *            <dd>
     *            <p>
     *            A deployment that has been completely replaced.
     *            </p>
     *            </dd>
     *            </dl>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the deployment. The following describes each state:
     * </p>
     * <dl>
     * <dt>PRIMARY</dt>
     * <dd>
     * <p>
     * The most recent deployment of a service.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * A service deployment that still has running tasks, but are in the process
     * of being replaced with a new <code>PRIMARY</code> deployment.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * A deployment that has been completely replaced.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the deployment. The following describes each
     *            state:
     *            </p>
     *            <dl>
     *            <dt>PRIMARY</dt>
     *            <dd>
     *            <p>
     *            The most recent deployment of a service.
     *            </p>
     *            </dd>
     *            <dt>ACTIVE</dt>
     *            <dd>
     *            <p>
     *            A service deployment that still has running tasks, but are in
     *            the process of being replaced with a new <code>PRIMARY</code>
     *            deployment.
     *            </p>
     *            </dd>
     *            <dt>INACTIVE</dt>
     *            <dd>
     *            <p>
     *            A deployment that has been completely replaced.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Deployment withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The most recent task definition that was specified for the tasks in the
     * service to use.
     * </p>
     *
     * @return <p>
     *         The most recent task definition that was specified for the tasks
     *         in the service to use.
     *         </p>
     */
    public String getTaskDefinition() {
        return taskDefinition;
    }

    /**
     * <p>
     * The most recent task definition that was specified for the tasks in the
     * service to use.
     * </p>
     *
     * @param taskDefinition <p>
     *            The most recent task definition that was specified for the
     *            tasks in the service to use.
     *            </p>
     */
    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The most recent task definition that was specified for the tasks in the
     * service to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskDefinition <p>
     *            The most recent task definition that was specified for the
     *            tasks in the service to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Deployment withTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
        return this;
    }

    /**
     * <p>
     * The most recent desired count of tasks that was specified for the service
     * to deploy or maintain.
     * </p>
     *
     * @return <p>
     *         The most recent desired count of tasks that was specified for the
     *         service to deploy or maintain.
     *         </p>
     */
    public Integer getDesiredCount() {
        return desiredCount;
    }

    /**
     * <p>
     * The most recent desired count of tasks that was specified for the service
     * to deploy or maintain.
     * </p>
     *
     * @param desiredCount <p>
     *            The most recent desired count of tasks that was specified for
     *            the service to deploy or maintain.
     *            </p>
     */
    public void setDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
    }

    /**
     * <p>
     * The most recent desired count of tasks that was specified for the service
     * to deploy or maintain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param desiredCount <p>
     *            The most recent desired count of tasks that was specified for
     *            the service to deploy or maintain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Deployment withDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
        return this;
    }

    /**
     * <p>
     * The number of tasks in the deployment that are in the
     * <code>PENDING</code> status.
     * </p>
     *
     * @return <p>
     *         The number of tasks in the deployment that are in the
     *         <code>PENDING</code> status.
     *         </p>
     */
    public Integer getPendingCount() {
        return pendingCount;
    }

    /**
     * <p>
     * The number of tasks in the deployment that are in the
     * <code>PENDING</code> status.
     * </p>
     *
     * @param pendingCount <p>
     *            The number of tasks in the deployment that are in the
     *            <code>PENDING</code> status.
     *            </p>
     */
    public void setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
    }

    /**
     * <p>
     * The number of tasks in the deployment that are in the
     * <code>PENDING</code> status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingCount <p>
     *            The number of tasks in the deployment that are in the
     *            <code>PENDING</code> status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Deployment withPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
        return this;
    }

    /**
     * <p>
     * The number of tasks in the deployment that are in the
     * <code>RUNNING</code> status.
     * </p>
     *
     * @return <p>
     *         The number of tasks in the deployment that are in the
     *         <code>RUNNING</code> status.
     *         </p>
     */
    public Integer getRunningCount() {
        return runningCount;
    }

    /**
     * <p>
     * The number of tasks in the deployment that are in the
     * <code>RUNNING</code> status.
     * </p>
     *
     * @param runningCount <p>
     *            The number of tasks in the deployment that are in the
     *            <code>RUNNING</code> status.
     *            </p>
     */
    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    /**
     * <p>
     * The number of tasks in the deployment that are in the
     * <code>RUNNING</code> status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runningCount <p>
     *            The number of tasks in the deployment that are in the
     *            <code>RUNNING</code> status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Deployment withRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the service deployment was created.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for when the service deployment was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the service deployment was created.
     * </p>
     *
     * @param createdAt <p>
     *            The Unix timestamp for when the service deployment was
     *            created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the service deployment was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The Unix timestamp for when the service deployment was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Deployment withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the service deployment was last updated.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for when the service deployment was last
     *         updated.
     *         </p>
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the service deployment was last updated.
     * </p>
     *
     * @param updatedAt <p>
     *            The Unix timestamp for when the service deployment was last
     *            updated.
     *            </p>
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the service deployment was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The Unix timestamp for when the service deployment was last
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Deployment withUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy that the deployment is using.
     * </p>
     *
     * @return <p>
     *         The capacity provider strategy that the deployment is using.
     *         </p>
     */
    public java.util.List<CapacityProviderStrategyItem> getCapacityProviderStrategy() {
        return capacityProviderStrategy;
    }

    /**
     * <p>
     * The capacity provider strategy that the deployment is using.
     * </p>
     *
     * @param capacityProviderStrategy <p>
     *            The capacity provider strategy that the deployment is using.
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
     * The capacity provider strategy that the deployment is using.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviderStrategy <p>
     *            The capacity provider strategy that the deployment is using.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Deployment withCapacityProviderStrategy(
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
     * The capacity provider strategy that the deployment is using.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviderStrategy <p>
     *            The capacity provider strategy that the deployment is using.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Deployment withCapacityProviderStrategy(
            java.util.Collection<CapacityProviderStrategyItem> capacityProviderStrategy) {
        setCapacityProviderStrategy(capacityProviderStrategy);
        return this;
    }

    /**
     * <p>
     * The launch type the tasks in the service are using. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @return <p>
     *         The launch type the tasks in the service are using. For more
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
     * The launch type the tasks in the service are using. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type the tasks in the service are using. For more
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
     * The launch type the tasks in the service are using. For more information,
     * see <a href=
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
     *            The launch type the tasks in the service are using. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LaunchType
     */
    public Deployment withLaunchType(String launchType) {
        this.launchType = launchType;
        return this;
    }

    /**
     * <p>
     * The launch type the tasks in the service are using. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type the tasks in the service are using. For more
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
     * The launch type the tasks in the service are using. For more information,
     * see <a href=
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
     *            The launch type the tasks in the service are using. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LaunchType
     */
    public Deployment withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * The platform version on which your tasks in the service are running. A
     * platform version is only specified for tasks using the Fargate launch
     * type. If one is not specified, the <code>LATEST</code> platform version
     * is used by default. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The platform version on which your tasks in the service are
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
     * The platform version on which your tasks in the service are running. A
     * platform version is only specified for tasks using the Fargate launch
     * type. If one is not specified, the <code>LATEST</code> platform version
     * is used by default. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @param platformVersion <p>
     *            The platform version on which your tasks in the service are
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
     * The platform version on which your tasks in the service are running. A
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
     *            The platform version on which your tasks in the service are
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
    public Deployment withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
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
    public Deployment withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
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
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getTaskDefinition() != null)
            sb.append("taskDefinition: " + getTaskDefinition() + ",");
        if (getDesiredCount() != null)
            sb.append("desiredCount: " + getDesiredCount() + ",");
        if (getPendingCount() != null)
            sb.append("pendingCount: " + getPendingCount() + ",");
        if (getRunningCount() != null)
            sb.append("runningCount: " + getRunningCount() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getUpdatedAt() != null)
            sb.append("updatedAt: " + getUpdatedAt() + ",");
        if (getCapacityProviderStrategy() != null)
            sb.append("capacityProviderStrategy: " + getCapacityProviderStrategy() + ",");
        if (getLaunchType() != null)
            sb.append("launchType: " + getLaunchType() + ",");
        if (getPlatformVersion() != null)
            sb.append("platformVersion: " + getPlatformVersion() + ",");
        if (getNetworkConfiguration() != null)
            sb.append("networkConfiguration: " + getNetworkConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        hashCode = prime * hashCode
                + ((getDesiredCount() == null) ? 0 : getDesiredCount().hashCode());
        hashCode = prime * hashCode
                + ((getPendingCount() == null) ? 0 : getPendingCount().hashCode());
        hashCode = prime * hashCode
                + ((getRunningCount() == null) ? 0 : getRunningCount().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime
                * hashCode
                + ((getCapacityProviderStrategy() == null) ? 0 : getCapacityProviderStrategy()
                        .hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Deployment == false)
            return false;
        Deployment other = (Deployment) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        if (other.getDesiredCount() == null ^ this.getDesiredCount() == null)
            return false;
        if (other.getDesiredCount() != null
                && other.getDesiredCount().equals(this.getDesiredCount()) == false)
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
        if (other.getCapacityProviderStrategy() == null
                ^ this.getCapacityProviderStrategy() == null)
            return false;
        if (other.getCapacityProviderStrategy() != null
                && other.getCapacityProviderStrategy().equals(this.getCapacityProviderStrategy()) == false)
            return false;
        if (other.getLaunchType() == null ^ this.getLaunchType() == null)
            return false;
        if (other.getLaunchType() != null
                && other.getLaunchType().equals(this.getLaunchType()) == false)
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
        return true;
    }
}
