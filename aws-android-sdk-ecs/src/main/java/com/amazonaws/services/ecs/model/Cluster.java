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
 * A regional grouping of one or more container instances on which you can run
 * task requests. Each account receives a default cluster the first time you use
 * the Amazon ECS service, but you may also create other clusters. Clusters may
 * contain more than one instance type simultaneously.
 * </p>
 */
public class Cluster implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the cluster. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the Region
     * of the cluster, the AWS account ID of the cluster owner, the
     * <code>cluster</code> namespace, and then the cluster name. For example,
     * <code>arn:aws:ecs:region:012345678910:cluster/test</code>.
     * </p>
     */
    private String clusterArn;

    /**
     * <p>
     * A user-generated string that you use to identify your cluster.
     * </p>
     */
    private String clusterName;

    /**
     * <p>
     * The status of the cluster. The following are the possible states that
     * will be returned.
     * </p>
     * <dl>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The cluster is ready to accept tasks and if applicable you can register
     * container instances with the cluster.
     * </p>
     * </dd>
     * <dt>PROVISIONING</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources
     * needed for the capacity provider are being created.
     * </p>
     * </dd>
     * <dt>DEPROVISIONING</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources
     * needed for the capacity provider are being deleted.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources
     * needed for the capacity provider have failed to create.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * The cluster has been deleted. Clusters with an <code>INACTIVE</code>
     * status may remain discoverable in your account for a period of time.
     * However, this behavior is subject to change in the future, so you should
     * not rely on <code>INACTIVE</code> clusters persisting.
     * </p>
     * </dd>
     * </dl>
     */
    private String status;

    /**
     * <p>
     * The number of container instances registered into the cluster. This
     * includes container instances in both <code>ACTIVE</code> and
     * <code>DRAINING</code> status.
     * </p>
     */
    private Integer registeredContainerInstancesCount;

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>RUNNING</code>
     * state.
     * </p>
     */
    private Integer runningTasksCount;

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>PENDING</code>
     * state.
     * </p>
     */
    private Integer pendingTasksCount;

    /**
     * <p>
     * The number of services that are running on the cluster in an
     * <code>ACTIVE</code> state. You can view these services with
     * <a>ListServices</a>.
     * </p>
     */
    private Integer activeServicesCount;

    /**
     * <p>
     * Additional information about your clusters that are separated by launch
     * type, including:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * RunningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<KeyValuePair> statistics;

    /**
     * <p>
     * The metadata that you apply to the cluster to help you categorize and
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
     * The settings for the cluster. This parameter indicates whether CloudWatch
     * Container Insights is enabled or disabled for a cluster.
     * </p>
     */
    private java.util.List<ClusterSetting> settings;

    /**
     * <p>
     * The capacity providers associated with the cluster.
     * </p>
     */
    private java.util.List<String> capacityProviders;

    /**
     * <p>
     * The default capacity provider strategy for the cluster. When services or
     * tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     * </p>
     */
    private java.util.List<CapacityProviderStrategyItem> defaultCapacityProviderStrategy;

    /**
     * <p>
     * The resources attached to a cluster. When using a capacity provider with
     * a cluster, the Auto Scaling plan that is created will be returned as a
     * cluster attachment.
     * </p>
     */
    private java.util.List<Attachment> attachments;

    /**
     * <p>
     * The status of the capacity providers associated with the cluster. The
     * following are the states that will be returned:
     * </p>
     * <dl>
     * <dt>UPDATE_IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The available capacity providers for the cluster are updating. This
     * occurs when the Auto Scaling plan is provisioning or deprovisioning.
     * </p>
     * </dd>
     * <dt>UPDATE_COMPLETE</dt>
     * <dd>
     * <p>
     * The capacity providers have successfully updated.
     * </p>
     * </dd>
     * <dt>UPDATE_FAILED</dt>
     * <dd>
     * <p>
     * The capacity provider updates failed.
     * </p>
     * </dd>
     * </dl>
     */
    private String attachmentsStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the cluster. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the Region
     * of the cluster, the AWS account ID of the cluster owner, the
     * <code>cluster</code> namespace, and then the cluster name. For example,
     * <code>arn:aws:ecs:region:012345678910:cluster/test</code>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that identifies the cluster. The
     *         ARN contains the <code>arn:aws:ecs</code> namespace, followed by
     *         the Region of the cluster, the AWS account ID of the cluster
     *         owner, the <code>cluster</code> namespace, and then the cluster
     *         name. For example,
     *         <code>arn:aws:ecs:region:012345678910:cluster/test</code>.
     *         </p>
     */
    public String getClusterArn() {
        return clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the cluster. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the Region
     * of the cluster, the AWS account ID of the cluster owner, the
     * <code>cluster</code> namespace, and then the cluster name. For example,
     * <code>arn:aws:ecs:region:012345678910:cluster/test</code>.
     * </p>
     *
     * @param clusterArn <p>
     *            The Amazon Resource Name (ARN) that identifies the cluster.
     *            The ARN contains the <code>arn:aws:ecs</code> namespace,
     *            followed by the Region of the cluster, the AWS account ID of
     *            the cluster owner, the <code>cluster</code> namespace, and
     *            then the cluster name. For example,
     *            <code>arn:aws:ecs:region:012345678910:cluster/test</code>.
     *            </p>
     */
    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the cluster. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the Region
     * of the cluster, the AWS account ID of the cluster owner, the
     * <code>cluster</code> namespace, and then the cluster name. For example,
     * <code>arn:aws:ecs:region:012345678910:cluster/test</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterArn <p>
     *            The Amazon Resource Name (ARN) that identifies the cluster.
     *            The ARN contains the <code>arn:aws:ecs</code> namespace,
     *            followed by the Region of the cluster, the AWS account ID of
     *            the cluster owner, the <code>cluster</code> namespace, and
     *            then the cluster name. For example,
     *            <code>arn:aws:ecs:region:012345678910:cluster/test</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
        return this;
    }

    /**
     * <p>
     * A user-generated string that you use to identify your cluster.
     * </p>
     *
     * @return <p>
     *         A user-generated string that you use to identify your cluster.
     *         </p>
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * <p>
     * A user-generated string that you use to identify your cluster.
     * </p>
     *
     * @param clusterName <p>
     *            A user-generated string that you use to identify your cluster.
     *            </p>
     */
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * A user-generated string that you use to identify your cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterName <p>
     *            A user-generated string that you use to identify your cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * <p>
     * The status of the cluster. The following are the possible states that
     * will be returned.
     * </p>
     * <dl>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The cluster is ready to accept tasks and if applicable you can register
     * container instances with the cluster.
     * </p>
     * </dd>
     * <dt>PROVISIONING</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources
     * needed for the capacity provider are being created.
     * </p>
     * </dd>
     * <dt>DEPROVISIONING</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources
     * needed for the capacity provider are being deleted.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources
     * needed for the capacity provider have failed to create.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * The cluster has been deleted. Clusters with an <code>INACTIVE</code>
     * status may remain discoverable in your account for a period of time.
     * However, this behavior is subject to change in the future, so you should
     * not rely on <code>INACTIVE</code> clusters persisting.
     * </p>
     * </dd>
     * </dl>
     *
     * @return <p>
     *         The status of the cluster. The following are the possible states
     *         that will be returned.
     *         </p>
     *         <dl>
     *         <dt>ACTIVE</dt>
     *         <dd>
     *         <p>
     *         The cluster is ready to accept tasks and if applicable you can
     *         register container instances with the cluster.
     *         </p>
     *         </dd>
     *         <dt>PROVISIONING</dt>
     *         <dd>
     *         <p>
     *         The cluster has capacity providers associated with it and the
     *         resources needed for the capacity provider are being created.
     *         </p>
     *         </dd>
     *         <dt>DEPROVISIONING</dt>
     *         <dd>
     *         <p>
     *         The cluster has capacity providers associated with it and the
     *         resources needed for the capacity provider are being deleted.
     *         </p>
     *         </dd>
     *         <dt>FAILED</dt>
     *         <dd>
     *         <p>
     *         The cluster has capacity providers associated with it and the
     *         resources needed for the capacity provider have failed to create.
     *         </p>
     *         </dd>
     *         <dt>INACTIVE</dt>
     *         <dd>
     *         <p>
     *         The cluster has been deleted. Clusters with an
     *         <code>INACTIVE</code> status may remain discoverable in your
     *         account for a period of time. However, this behavior is subject
     *         to change in the future, so you should not rely on
     *         <code>INACTIVE</code> clusters persisting.
     *         </p>
     *         </dd>
     *         </dl>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the cluster. The following are the possible states that
     * will be returned.
     * </p>
     * <dl>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The cluster is ready to accept tasks and if applicable you can register
     * container instances with the cluster.
     * </p>
     * </dd>
     * <dt>PROVISIONING</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources
     * needed for the capacity provider are being created.
     * </p>
     * </dd>
     * <dt>DEPROVISIONING</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources
     * needed for the capacity provider are being deleted.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources
     * needed for the capacity provider have failed to create.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * The cluster has been deleted. Clusters with an <code>INACTIVE</code>
     * status may remain discoverable in your account for a period of time.
     * However, this behavior is subject to change in the future, so you should
     * not rely on <code>INACTIVE</code> clusters persisting.
     * </p>
     * </dd>
     * </dl>
     *
     * @param status <p>
     *            The status of the cluster. The following are the possible
     *            states that will be returned.
     *            </p>
     *            <dl>
     *            <dt>ACTIVE</dt>
     *            <dd>
     *            <p>
     *            The cluster is ready to accept tasks and if applicable you can
     *            register container instances with the cluster.
     *            </p>
     *            </dd>
     *            <dt>PROVISIONING</dt>
     *            <dd>
     *            <p>
     *            The cluster has capacity providers associated with it and the
     *            resources needed for the capacity provider are being created.
     *            </p>
     *            </dd>
     *            <dt>DEPROVISIONING</dt>
     *            <dd>
     *            <p>
     *            The cluster has capacity providers associated with it and the
     *            resources needed for the capacity provider are being deleted.
     *            </p>
     *            </dd>
     *            <dt>FAILED</dt>
     *            <dd>
     *            <p>
     *            The cluster has capacity providers associated with it and the
     *            resources needed for the capacity provider have failed to
     *            create.
     *            </p>
     *            </dd>
     *            <dt>INACTIVE</dt>
     *            <dd>
     *            <p>
     *            The cluster has been deleted. Clusters with an
     *            <code>INACTIVE</code> status may remain discoverable in your
     *            account for a period of time. However, this behavior is
     *            subject to change in the future, so you should not rely on
     *            <code>INACTIVE</code> clusters persisting.
     *            </p>
     *            </dd>
     *            </dl>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the cluster. The following are the possible states that
     * will be returned.
     * </p>
     * <dl>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The cluster is ready to accept tasks and if applicable you can register
     * container instances with the cluster.
     * </p>
     * </dd>
     * <dt>PROVISIONING</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources
     * needed for the capacity provider are being created.
     * </p>
     * </dd>
     * <dt>DEPROVISIONING</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources
     * needed for the capacity provider are being deleted.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources
     * needed for the capacity provider have failed to create.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * The cluster has been deleted. Clusters with an <code>INACTIVE</code>
     * status may remain discoverable in your account for a period of time.
     * However, this behavior is subject to change in the future, so you should
     * not rely on <code>INACTIVE</code> clusters persisting.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the cluster. The following are the possible
     *            states that will be returned.
     *            </p>
     *            <dl>
     *            <dt>ACTIVE</dt>
     *            <dd>
     *            <p>
     *            The cluster is ready to accept tasks and if applicable you can
     *            register container instances with the cluster.
     *            </p>
     *            </dd>
     *            <dt>PROVISIONING</dt>
     *            <dd>
     *            <p>
     *            The cluster has capacity providers associated with it and the
     *            resources needed for the capacity provider are being created.
     *            </p>
     *            </dd>
     *            <dt>DEPROVISIONING</dt>
     *            <dd>
     *            <p>
     *            The cluster has capacity providers associated with it and the
     *            resources needed for the capacity provider are being deleted.
     *            </p>
     *            </dd>
     *            <dt>FAILED</dt>
     *            <dd>
     *            <p>
     *            The cluster has capacity providers associated with it and the
     *            resources needed for the capacity provider have failed to
     *            create.
     *            </p>
     *            </dd>
     *            <dt>INACTIVE</dt>
     *            <dd>
     *            <p>
     *            The cluster has been deleted. Clusters with an
     *            <code>INACTIVE</code> status may remain discoverable in your
     *            account for a period of time. However, this behavior is
     *            subject to change in the future, so you should not rely on
     *            <code>INACTIVE</code> clusters persisting.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The number of container instances registered into the cluster. This
     * includes container instances in both <code>ACTIVE</code> and
     * <code>DRAINING</code> status.
     * </p>
     *
     * @return <p>
     *         The number of container instances registered into the cluster.
     *         This includes container instances in both <code>ACTIVE</code> and
     *         <code>DRAINING</code> status.
     *         </p>
     */
    public Integer getRegisteredContainerInstancesCount() {
        return registeredContainerInstancesCount;
    }

    /**
     * <p>
     * The number of container instances registered into the cluster. This
     * includes container instances in both <code>ACTIVE</code> and
     * <code>DRAINING</code> status.
     * </p>
     *
     * @param registeredContainerInstancesCount <p>
     *            The number of container instances registered into the cluster.
     *            This includes container instances in both <code>ACTIVE</code>
     *            and <code>DRAINING</code> status.
     *            </p>
     */
    public void setRegisteredContainerInstancesCount(Integer registeredContainerInstancesCount) {
        this.registeredContainerInstancesCount = registeredContainerInstancesCount;
    }

    /**
     * <p>
     * The number of container instances registered into the cluster. This
     * includes container instances in both <code>ACTIVE</code> and
     * <code>DRAINING</code> status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registeredContainerInstancesCount <p>
     *            The number of container instances registered into the cluster.
     *            This includes container instances in both <code>ACTIVE</code>
     *            and <code>DRAINING</code> status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withRegisteredContainerInstancesCount(Integer registeredContainerInstancesCount) {
        this.registeredContainerInstancesCount = registeredContainerInstancesCount;
        return this;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>RUNNING</code>
     * state.
     * </p>
     *
     * @return <p>
     *         The number of tasks in the cluster that are in the
     *         <code>RUNNING</code> state.
     *         </p>
     */
    public Integer getRunningTasksCount() {
        return runningTasksCount;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>RUNNING</code>
     * state.
     * </p>
     *
     * @param runningTasksCount <p>
     *            The number of tasks in the cluster that are in the
     *            <code>RUNNING</code> state.
     *            </p>
     */
    public void setRunningTasksCount(Integer runningTasksCount) {
        this.runningTasksCount = runningTasksCount;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>RUNNING</code>
     * state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runningTasksCount <p>
     *            The number of tasks in the cluster that are in the
     *            <code>RUNNING</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withRunningTasksCount(Integer runningTasksCount) {
        this.runningTasksCount = runningTasksCount;
        return this;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>PENDING</code>
     * state.
     * </p>
     *
     * @return <p>
     *         The number of tasks in the cluster that are in the
     *         <code>PENDING</code> state.
     *         </p>
     */
    public Integer getPendingTasksCount() {
        return pendingTasksCount;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>PENDING</code>
     * state.
     * </p>
     *
     * @param pendingTasksCount <p>
     *            The number of tasks in the cluster that are in the
     *            <code>PENDING</code> state.
     *            </p>
     */
    public void setPendingTasksCount(Integer pendingTasksCount) {
        this.pendingTasksCount = pendingTasksCount;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>PENDING</code>
     * state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingTasksCount <p>
     *            The number of tasks in the cluster that are in the
     *            <code>PENDING</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withPendingTasksCount(Integer pendingTasksCount) {
        this.pendingTasksCount = pendingTasksCount;
        return this;
    }

    /**
     * <p>
     * The number of services that are running on the cluster in an
     * <code>ACTIVE</code> state. You can view these services with
     * <a>ListServices</a>.
     * </p>
     *
     * @return <p>
     *         The number of services that are running on the cluster in an
     *         <code>ACTIVE</code> state. You can view these services with
     *         <a>ListServices</a>.
     *         </p>
     */
    public Integer getActiveServicesCount() {
        return activeServicesCount;
    }

    /**
     * <p>
     * The number of services that are running on the cluster in an
     * <code>ACTIVE</code> state. You can view these services with
     * <a>ListServices</a>.
     * </p>
     *
     * @param activeServicesCount <p>
     *            The number of services that are running on the cluster in an
     *            <code>ACTIVE</code> state. You can view these services with
     *            <a>ListServices</a>.
     *            </p>
     */
    public void setActiveServicesCount(Integer activeServicesCount) {
        this.activeServicesCount = activeServicesCount;
    }

    /**
     * <p>
     * The number of services that are running on the cluster in an
     * <code>ACTIVE</code> state. You can view these services with
     * <a>ListServices</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activeServicesCount <p>
     *            The number of services that are running on the cluster in an
     *            <code>ACTIVE</code> state. You can view these services with
     *            <a>ListServices</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withActiveServicesCount(Integer activeServicesCount) {
        this.activeServicesCount = activeServicesCount;
        return this;
    }

    /**
     * <p>
     * Additional information about your clusters that are separated by launch
     * type, including:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * RunningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Additional information about your clusters that are separated by
     *         launch type, including:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         runningEC2TasksCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RunningFargateTasksCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         pendingEC2TasksCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         pendingFargateTasksCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         activeEC2ServiceCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         activeFargateServiceCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         drainingEC2ServiceCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         drainingFargateServiceCount
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<KeyValuePair> getStatistics() {
        return statistics;
    }

    /**
     * <p>
     * Additional information about your clusters that are separated by launch
     * type, including:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * RunningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     *
     * @param statistics <p>
     *            Additional information about your clusters that are separated
     *            by launch type, including:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            runningEC2TasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RunningFargateTasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            pendingEC2TasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            pendingFargateTasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            activeEC2ServiceCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            activeFargateServiceCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            drainingEC2ServiceCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            drainingFargateServiceCount
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatistics(java.util.Collection<KeyValuePair> statistics) {
        if (statistics == null) {
            this.statistics = null;
            return;
        }

        this.statistics = new java.util.ArrayList<KeyValuePair>(statistics);
    }

    /**
     * <p>
     * Additional information about your clusters that are separated by launch
     * type, including:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * RunningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statistics <p>
     *            Additional information about your clusters that are separated
     *            by launch type, including:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            runningEC2TasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RunningFargateTasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            pendingEC2TasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            pendingFargateTasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            activeEC2ServiceCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            activeFargateServiceCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            drainingEC2ServiceCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            drainingFargateServiceCount
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withStatistics(KeyValuePair... statistics) {
        if (getStatistics() == null) {
            this.statistics = new java.util.ArrayList<KeyValuePair>(statistics.length);
        }
        for (KeyValuePair value : statistics) {
            this.statistics.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Additional information about your clusters that are separated by launch
     * type, including:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * RunningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statistics <p>
     *            Additional information about your clusters that are separated
     *            by launch type, including:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            runningEC2TasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RunningFargateTasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            pendingEC2TasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            pendingFargateTasksCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            activeEC2ServiceCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            activeFargateServiceCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            drainingEC2ServiceCount
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            drainingFargateServiceCount
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withStatistics(java.util.Collection<KeyValuePair> statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the cluster to help you categorize and
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
     *         The metadata that you apply to the cluster to help you categorize
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
     * The metadata that you apply to the cluster to help you categorize and
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
     *            The metadata that you apply to the cluster to help you
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
     * The metadata that you apply to the cluster to help you categorize and
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
     *            The metadata that you apply to the cluster to help you
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
    public Cluster withTags(Tag... tags) {
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
     * The metadata that you apply to the cluster to help you categorize and
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
     *            The metadata that you apply to the cluster to help you
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
    public Cluster withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The settings for the cluster. This parameter indicates whether CloudWatch
     * Container Insights is enabled or disabled for a cluster.
     * </p>
     *
     * @return <p>
     *         The settings for the cluster. This parameter indicates whether
     *         CloudWatch Container Insights is enabled or disabled for a
     *         cluster.
     *         </p>
     */
    public java.util.List<ClusterSetting> getSettings() {
        return settings;
    }

    /**
     * <p>
     * The settings for the cluster. This parameter indicates whether CloudWatch
     * Container Insights is enabled or disabled for a cluster.
     * </p>
     *
     * @param settings <p>
     *            The settings for the cluster. This parameter indicates whether
     *            CloudWatch Container Insights is enabled or disabled for a
     *            cluster.
     *            </p>
     */
    public void setSettings(java.util.Collection<ClusterSetting> settings) {
        if (settings == null) {
            this.settings = null;
            return;
        }

        this.settings = new java.util.ArrayList<ClusterSetting>(settings);
    }

    /**
     * <p>
     * The settings for the cluster. This parameter indicates whether CloudWatch
     * Container Insights is enabled or disabled for a cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            The settings for the cluster. This parameter indicates whether
     *            CloudWatch Container Insights is enabled or disabled for a
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withSettings(ClusterSetting... settings) {
        if (getSettings() == null) {
            this.settings = new java.util.ArrayList<ClusterSetting>(settings.length);
        }
        for (ClusterSetting value : settings) {
            this.settings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The settings for the cluster. This parameter indicates whether CloudWatch
     * Container Insights is enabled or disabled for a cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            The settings for the cluster. This parameter indicates whether
     *            CloudWatch Container Insights is enabled or disabled for a
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withSettings(java.util.Collection<ClusterSetting> settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * The capacity providers associated with the cluster.
     * </p>
     *
     * @return <p>
     *         The capacity providers associated with the cluster.
     *         </p>
     */
    public java.util.List<String> getCapacityProviders() {
        return capacityProviders;
    }

    /**
     * <p>
     * The capacity providers associated with the cluster.
     * </p>
     *
     * @param capacityProviders <p>
     *            The capacity providers associated with the cluster.
     *            </p>
     */
    public void setCapacityProviders(java.util.Collection<String> capacityProviders) {
        if (capacityProviders == null) {
            this.capacityProviders = null;
            return;
        }

        this.capacityProviders = new java.util.ArrayList<String>(capacityProviders);
    }

    /**
     * <p>
     * The capacity providers associated with the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviders <p>
     *            The capacity providers associated with the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withCapacityProviders(String... capacityProviders) {
        if (getCapacityProviders() == null) {
            this.capacityProviders = new java.util.ArrayList<String>(capacityProviders.length);
        }
        for (String value : capacityProviders) {
            this.capacityProviders.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The capacity providers associated with the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviders <p>
     *            The capacity providers associated with the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withCapacityProviders(java.util.Collection<String> capacityProviders) {
        setCapacityProviders(capacityProviders);
        return this;
    }

    /**
     * <p>
     * The default capacity provider strategy for the cluster. When services or
     * tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     * </p>
     *
     * @return <p>
     *         The default capacity provider strategy for the cluster. When
     *         services or tasks are run in the cluster with no launch type or
     *         capacity provider strategy specified, the default capacity
     *         provider strategy is used.
     *         </p>
     */
    public java.util.List<CapacityProviderStrategyItem> getDefaultCapacityProviderStrategy() {
        return defaultCapacityProviderStrategy;
    }

    /**
     * <p>
     * The default capacity provider strategy for the cluster. When services or
     * tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     * </p>
     *
     * @param defaultCapacityProviderStrategy <p>
     *            The default capacity provider strategy for the cluster. When
     *            services or tasks are run in the cluster with no launch type
     *            or capacity provider strategy specified, the default capacity
     *            provider strategy is used.
     *            </p>
     */
    public void setDefaultCapacityProviderStrategy(
            java.util.Collection<CapacityProviderStrategyItem> defaultCapacityProviderStrategy) {
        if (defaultCapacityProviderStrategy == null) {
            this.defaultCapacityProviderStrategy = null;
            return;
        }

        this.defaultCapacityProviderStrategy = new java.util.ArrayList<CapacityProviderStrategyItem>(
                defaultCapacityProviderStrategy);
    }

    /**
     * <p>
     * The default capacity provider strategy for the cluster. When services or
     * tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultCapacityProviderStrategy <p>
     *            The default capacity provider strategy for the cluster. When
     *            services or tasks are run in the cluster with no launch type
     *            or capacity provider strategy specified, the default capacity
     *            provider strategy is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withDefaultCapacityProviderStrategy(
            CapacityProviderStrategyItem... defaultCapacityProviderStrategy) {
        if (getDefaultCapacityProviderStrategy() == null) {
            this.defaultCapacityProviderStrategy = new java.util.ArrayList<CapacityProviderStrategyItem>(
                    defaultCapacityProviderStrategy.length);
        }
        for (CapacityProviderStrategyItem value : defaultCapacityProviderStrategy) {
            this.defaultCapacityProviderStrategy.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The default capacity provider strategy for the cluster. When services or
     * tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultCapacityProviderStrategy <p>
     *            The default capacity provider strategy for the cluster. When
     *            services or tasks are run in the cluster with no launch type
     *            or capacity provider strategy specified, the default capacity
     *            provider strategy is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withDefaultCapacityProviderStrategy(
            java.util.Collection<CapacityProviderStrategyItem> defaultCapacityProviderStrategy) {
        setDefaultCapacityProviderStrategy(defaultCapacityProviderStrategy);
        return this;
    }

    /**
     * <p>
     * The resources attached to a cluster. When using a capacity provider with
     * a cluster, the Auto Scaling plan that is created will be returned as a
     * cluster attachment.
     * </p>
     *
     * @return <p>
     *         The resources attached to a cluster. When using a capacity
     *         provider with a cluster, the Auto Scaling plan that is created
     *         will be returned as a cluster attachment.
     *         </p>
     */
    public java.util.List<Attachment> getAttachments() {
        return attachments;
    }

    /**
     * <p>
     * The resources attached to a cluster. When using a capacity provider with
     * a cluster, the Auto Scaling plan that is created will be returned as a
     * cluster attachment.
     * </p>
     *
     * @param attachments <p>
     *            The resources attached to a cluster. When using a capacity
     *            provider with a cluster, the Auto Scaling plan that is created
     *            will be returned as a cluster attachment.
     *            </p>
     */
    public void setAttachments(java.util.Collection<Attachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new java.util.ArrayList<Attachment>(attachments);
    }

    /**
     * <p>
     * The resources attached to a cluster. When using a capacity provider with
     * a cluster, the Auto Scaling plan that is created will be returned as a
     * cluster attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            The resources attached to a cluster. When using a capacity
     *            provider with a cluster, the Auto Scaling plan that is created
     *            will be returned as a cluster attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withAttachments(Attachment... attachments) {
        if (getAttachments() == null) {
            this.attachments = new java.util.ArrayList<Attachment>(attachments.length);
        }
        for (Attachment value : attachments) {
            this.attachments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The resources attached to a cluster. When using a capacity provider with
     * a cluster, the Auto Scaling plan that is created will be returned as a
     * cluster attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            The resources attached to a cluster. When using a capacity
     *            provider with a cluster, the Auto Scaling plan that is created
     *            will be returned as a cluster attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withAttachments(java.util.Collection<Attachment> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * The status of the capacity providers associated with the cluster. The
     * following are the states that will be returned:
     * </p>
     * <dl>
     * <dt>UPDATE_IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The available capacity providers for the cluster are updating. This
     * occurs when the Auto Scaling plan is provisioning or deprovisioning.
     * </p>
     * </dd>
     * <dt>UPDATE_COMPLETE</dt>
     * <dd>
     * <p>
     * The capacity providers have successfully updated.
     * </p>
     * </dd>
     * <dt>UPDATE_FAILED</dt>
     * <dd>
     * <p>
     * The capacity provider updates failed.
     * </p>
     * </dd>
     * </dl>
     *
     * @return <p>
     *         The status of the capacity providers associated with the cluster.
     *         The following are the states that will be returned:
     *         </p>
     *         <dl>
     *         <dt>UPDATE_IN_PROGRESS</dt>
     *         <dd>
     *         <p>
     *         The available capacity providers for the cluster are updating.
     *         This occurs when the Auto Scaling plan is provisioning or
     *         deprovisioning.
     *         </p>
     *         </dd>
     *         <dt>UPDATE_COMPLETE</dt>
     *         <dd>
     *         <p>
     *         The capacity providers have successfully updated.
     *         </p>
     *         </dd>
     *         <dt>UPDATE_FAILED</dt>
     *         <dd>
     *         <p>
     *         The capacity provider updates failed.
     *         </p>
     *         </dd>
     *         </dl>
     */
    public String getAttachmentsStatus() {
        return attachmentsStatus;
    }

    /**
     * <p>
     * The status of the capacity providers associated with the cluster. The
     * following are the states that will be returned:
     * </p>
     * <dl>
     * <dt>UPDATE_IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The available capacity providers for the cluster are updating. This
     * occurs when the Auto Scaling plan is provisioning or deprovisioning.
     * </p>
     * </dd>
     * <dt>UPDATE_COMPLETE</dt>
     * <dd>
     * <p>
     * The capacity providers have successfully updated.
     * </p>
     * </dd>
     * <dt>UPDATE_FAILED</dt>
     * <dd>
     * <p>
     * The capacity provider updates failed.
     * </p>
     * </dd>
     * </dl>
     *
     * @param attachmentsStatus <p>
     *            The status of the capacity providers associated with the
     *            cluster. The following are the states that will be returned:
     *            </p>
     *            <dl>
     *            <dt>UPDATE_IN_PROGRESS</dt>
     *            <dd>
     *            <p>
     *            The available capacity providers for the cluster are updating.
     *            This occurs when the Auto Scaling plan is provisioning or
     *            deprovisioning.
     *            </p>
     *            </dd>
     *            <dt>UPDATE_COMPLETE</dt>
     *            <dd>
     *            <p>
     *            The capacity providers have successfully updated.
     *            </p>
     *            </dd>
     *            <dt>UPDATE_FAILED</dt>
     *            <dd>
     *            <p>
     *            The capacity provider updates failed.
     *            </p>
     *            </dd>
     *            </dl>
     */
    public void setAttachmentsStatus(String attachmentsStatus) {
        this.attachmentsStatus = attachmentsStatus;
    }

    /**
     * <p>
     * The status of the capacity providers associated with the cluster. The
     * following are the states that will be returned:
     * </p>
     * <dl>
     * <dt>UPDATE_IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The available capacity providers for the cluster are updating. This
     * occurs when the Auto Scaling plan is provisioning or deprovisioning.
     * </p>
     * </dd>
     * <dt>UPDATE_COMPLETE</dt>
     * <dd>
     * <p>
     * The capacity providers have successfully updated.
     * </p>
     * </dd>
     * <dt>UPDATE_FAILED</dt>
     * <dd>
     * <p>
     * The capacity provider updates failed.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentsStatus <p>
     *            The status of the capacity providers associated with the
     *            cluster. The following are the states that will be returned:
     *            </p>
     *            <dl>
     *            <dt>UPDATE_IN_PROGRESS</dt>
     *            <dd>
     *            <p>
     *            The available capacity providers for the cluster are updating.
     *            This occurs when the Auto Scaling plan is provisioning or
     *            deprovisioning.
     *            </p>
     *            </dd>
     *            <dt>UPDATE_COMPLETE</dt>
     *            <dd>
     *            <p>
     *            The capacity providers have successfully updated.
     *            </p>
     *            </dd>
     *            <dt>UPDATE_FAILED</dt>
     *            <dd>
     *            <p>
     *            The capacity provider updates failed.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Cluster withAttachmentsStatus(String attachmentsStatus) {
        this.attachmentsStatus = attachmentsStatus;
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
        if (getClusterArn() != null)
            sb.append("clusterArn: " + getClusterArn() + ",");
        if (getClusterName() != null)
            sb.append("clusterName: " + getClusterName() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getRegisteredContainerInstancesCount() != null)
            sb.append("registeredContainerInstancesCount: "
                    + getRegisteredContainerInstancesCount() + ",");
        if (getRunningTasksCount() != null)
            sb.append("runningTasksCount: " + getRunningTasksCount() + ",");
        if (getPendingTasksCount() != null)
            sb.append("pendingTasksCount: " + getPendingTasksCount() + ",");
        if (getActiveServicesCount() != null)
            sb.append("activeServicesCount: " + getActiveServicesCount() + ",");
        if (getStatistics() != null)
            sb.append("statistics: " + getStatistics() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getSettings() != null)
            sb.append("settings: " + getSettings() + ",");
        if (getCapacityProviders() != null)
            sb.append("capacityProviders: " + getCapacityProviders() + ",");
        if (getDefaultCapacityProviderStrategy() != null)
            sb.append("defaultCapacityProviderStrategy: " + getDefaultCapacityProviderStrategy()
                    + ",");
        if (getAttachments() != null)
            sb.append("attachments: " + getAttachments() + ",");
        if (getAttachmentsStatus() != null)
            sb.append("attachmentsStatus: " + getAttachmentsStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode
                + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getRegisteredContainerInstancesCount() == null) ? 0
                        : getRegisteredContainerInstancesCount().hashCode());
        hashCode = prime * hashCode
                + ((getRunningTasksCount() == null) ? 0 : getRunningTasksCount().hashCode());
        hashCode = prime * hashCode
                + ((getPendingTasksCount() == null) ? 0 : getPendingTasksCount().hashCode());
        hashCode = prime * hashCode
                + ((getActiveServicesCount() == null) ? 0 : getActiveServicesCount().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode
                + ((getCapacityProviders() == null) ? 0 : getCapacityProviders().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultCapacityProviderStrategy() == null) ? 0
                        : getDefaultCapacityProviderStrategy().hashCode());
        hashCode = prime * hashCode
                + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode
                + ((getAttachmentsStatus() == null) ? 0 : getAttachmentsStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Cluster == false)
            return false;
        Cluster other = (Cluster) obj;

        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null
                && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null
                && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRegisteredContainerInstancesCount() == null
                ^ this.getRegisteredContainerInstancesCount() == null)
            return false;
        if (other.getRegisteredContainerInstancesCount() != null
                && other.getRegisteredContainerInstancesCount().equals(
                        this.getRegisteredContainerInstancesCount()) == false)
            return false;
        if (other.getRunningTasksCount() == null ^ this.getRunningTasksCount() == null)
            return false;
        if (other.getRunningTasksCount() != null
                && other.getRunningTasksCount().equals(this.getRunningTasksCount()) == false)
            return false;
        if (other.getPendingTasksCount() == null ^ this.getPendingTasksCount() == null)
            return false;
        if (other.getPendingTasksCount() != null
                && other.getPendingTasksCount().equals(this.getPendingTasksCount()) == false)
            return false;
        if (other.getActiveServicesCount() == null ^ this.getActiveServicesCount() == null)
            return false;
        if (other.getActiveServicesCount() != null
                && other.getActiveServicesCount().equals(this.getActiveServicesCount()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null
                && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getCapacityProviders() == null ^ this.getCapacityProviders() == null)
            return false;
        if (other.getCapacityProviders() != null
                && other.getCapacityProviders().equals(this.getCapacityProviders()) == false)
            return false;
        if (other.getDefaultCapacityProviderStrategy() == null
                ^ this.getDefaultCapacityProviderStrategy() == null)
            return false;
        if (other.getDefaultCapacityProviderStrategy() != null
                && other.getDefaultCapacityProviderStrategy().equals(
                        this.getDefaultCapacityProviderStrategy()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null
                && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getAttachmentsStatus() == null ^ this.getAttachmentsStatus() == null)
            return false;
        if (other.getAttachmentsStatus() != null
                && other.getAttachmentsStatus().equals(this.getAttachmentsStatus()) == false)
            return false;
        return true;
    }
}
