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
 * Details on a task in a cluster.
 * </p>
 */
public class Task implements Serializable {
    /**
     * <p>
     * The Elastic Network Adapter associated with the task if the task uses the
     * <code>awsvpc</code> network mode.
     * </p>
     */
    private java.util.List<Attachment> attachments;

    /**
     * <p>
     * The attributes of the task
     * </p>
     */
    private java.util.List<Attribute> attributes;

    /**
     * <p>
     * The availability zone of the task.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The capacity provider associated with the task.
     * </p>
     */
    private String capacityProviderName;

    /**
     * <p>
     * The ARN of the cluster that hosts the task.
     * </p>
     */
    private String clusterArn;

    /**
     * <p>
     * The connectivity status of a task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECTED, DISCONNECTED
     */
    private String connectivity;

    /**
     * <p>
     * The Unix timestamp for when the task last went into
     * <code>CONNECTED</code> status.
     * </p>
     */
    private java.util.Date connectivityAt;

    /**
     * <p>
     * The ARN of the container instances that host the task.
     * </p>
     */
    private String containerInstanceArn;

    /**
     * <p>
     * The containers associated with the task.
     * </p>
     */
    private java.util.List<Container> containers;

    /**
     * <p>
     * The number of CPU units used by the task as expressed in a task
     * definition. It can be expressed as an integer using CPU units, for
     * example <code>1024</code>. It can also be expressed as a string using
     * vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>. String
     * values are converted to an integer indicating the CPU units when the task
     * definition is registered.
     * </p>
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
     * The Unix timestamp for when the task was created (the task entered the
     * <code>PENDING</code> state).
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The desired status of the task. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-lifecycle.html"
     * >Task Lifecycle</a>.
     * </p>
     */
    private String desiredStatus;

    /**
     * <p>
     * The Unix timestamp for when the task execution stopped.
     * </p>
     */
    private java.util.Date executionStoppedAt;

    /**
     * <p>
     * The name of the task group associated with the task.
     * </p>
     */
    private String group;

    /**
     * <p>
     * The health status for the task, which is determined by the health of the
     * essential containers in the task. If all essential containers in the task
     * are reporting as <code>HEALTHY</code>, then the task status also reports
     * as <code>HEALTHY</code>. If any essential containers in the task are
     * reporting as <code>UNHEALTHY</code> or <code>UNKNOWN</code>, then the
     * task status also reports as <code>UNHEALTHY</code> or
     * <code>UNKNOWN</code>, accordingly.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent does not monitor or report on Docker
     * health checks that are embedded in a container image (such as those
     * specified in a parent image or from the image's Dockerfile) and not
     * specified in the container definition. Health check parameters that are
     * specified in a container definition override any Docker health checks
     * that exist in the container image.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, UNKNOWN
     */
    private String healthStatus;

    /**
     * <p>
     * The Elastic Inference accelerator associated with the task.
     * </p>
     */
    private java.util.List<InferenceAccelerator> inferenceAccelerators;

    /**
     * <p>
     * The last known status of the task. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-lifecycle.html"
     * >Task Lifecycle</a>.
     * </p>
     */
    private String lastStatus;

    /**
     * <p>
     * The launch type on which your task is running. For more information, see
     * <a href=
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
     * The amount of memory (in MiB) used by the task as expressed in a task
     * definition. It can be expressed as an integer using MiB, for example
     * <code>1024</code>. It can also be expressed as a string using GB, for
     * example <code>1GB</code> or <code>1 GB</code>. String values are
     * converted to an integer indicating the MiB when the task definition is
     * registered.
     * </p>
     * <p>
     * If you are using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If you are using the Fargate launch type, this field is required and you
     * must use one of the following values, which determines your range of
     * supported values for the <code>cpu</code> parameter:
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
     * One or more container overrides.
     * </p>
     */
    private TaskOverride overrides;

    /**
     * <p>
     * The platform version on which your task is running. A platform version is
     * only specified for tasks using the Fargate launch type. If one is not
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
     * The Unix timestamp for when the container image pull began.
     * </p>
     */
    private java.util.Date pullStartedAt;

    /**
     * <p>
     * The Unix timestamp for when the container image pull completed.
     * </p>
     */
    private java.util.Date pullStoppedAt;

    /**
     * <p>
     * The Unix timestamp for when the task started (the task transitioned from
     * the <code>PENDING</code> state to the <code>RUNNING</code> state).
     * </p>
     */
    private java.util.Date startedAt;

    /**
     * <p>
     * The tag specified when a task is started. If the task is started by an
     * Amazon ECS service, then the <code>startedBy</code> parameter contains
     * the deployment ID of the service that starts it.
     * </p>
     */
    private String startedBy;

    /**
     * <p>
     * The stop code indicating why a task was stopped. The
     * <code>stoppedReason</code> may contain additional details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TaskFailedToStart, EssentialContainerExited,
     * UserInitiated
     */
    private String stopCode;

    /**
     * <p>
     * The Unix timestamp for when the task was stopped (the task transitioned
     * from the <code>RUNNING</code> state to the <code>STOPPED</code> state).
     * </p>
     */
    private java.util.Date stoppedAt;

    /**
     * <p>
     * The reason that the task was stopped.
     * </p>
     */
    private String stoppedReason;

    /**
     * <p>
     * The Unix timestamp for when the task stops (transitions from the
     * <code>RUNNING</code> state to <code>STOPPED</code>).
     * </p>
     */
    private java.util.Date stoppingAt;

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
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     */
    private String taskArn;

    /**
     * <p>
     * The ARN of the task definition that creates the task.
     * </p>
     */
    private String taskDefinitionArn;

    /**
     * <p>
     * The version counter for the task. Every time a task experiences a change
     * that triggers a CloudWatch event, the version counter is incremented. If
     * you are replicating your Amazon ECS task state with CloudWatch Events,
     * you can compare the version of a task reported by the Amazon ECS API
     * actions with the version reported in CloudWatch Events for the task
     * (inside the <code>detail</code> object) to verify that the version in
     * your event stream is current.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * The Elastic Network Adapter associated with the task if the task uses the
     * <code>awsvpc</code> network mode.
     * </p>
     *
     * @return <p>
     *         The Elastic Network Adapter associated with the task if the task
     *         uses the <code>awsvpc</code> network mode.
     *         </p>
     */
    public java.util.List<Attachment> getAttachments() {
        return attachments;
    }

    /**
     * <p>
     * The Elastic Network Adapter associated with the task if the task uses the
     * <code>awsvpc</code> network mode.
     * </p>
     *
     * @param attachments <p>
     *            The Elastic Network Adapter associated with the task if the
     *            task uses the <code>awsvpc</code> network mode.
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
     * The Elastic Network Adapter associated with the task if the task uses the
     * <code>awsvpc</code> network mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            The Elastic Network Adapter associated with the task if the
     *            task uses the <code>awsvpc</code> network mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withAttachments(Attachment... attachments) {
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
     * The Elastic Network Adapter associated with the task if the task uses the
     * <code>awsvpc</code> network mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            The Elastic Network Adapter associated with the task if the
     *            task uses the <code>awsvpc</code> network mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withAttachments(java.util.Collection<Attachment> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * The attributes of the task
     * </p>
     *
     * @return <p>
     *         The attributes of the task
     *         </p>
     */
    public java.util.List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attributes of the task
     * </p>
     *
     * @param attributes <p>
     *            The attributes of the task
     *            </p>
     */
    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<Attribute>(attributes);
    }

    /**
     * <p>
     * The attributes of the task
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The attributes of the task
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withAttributes(Attribute... attributes) {
        if (getAttributes() == null) {
            this.attributes = new java.util.ArrayList<Attribute>(attributes.length);
        }
        for (Attribute value : attributes) {
            this.attributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The attributes of the task
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The attributes of the task
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withAttributes(java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * The availability zone of the task.
     * </p>
     *
     * @return <p>
     *         The availability zone of the task.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The availability zone of the task.
     * </p>
     *
     * @param availabilityZone <p>
     *            The availability zone of the task.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The availability zone of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The availability zone of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The capacity provider associated with the task.
     * </p>
     *
     * @return <p>
     *         The capacity provider associated with the task.
     *         </p>
     */
    public String getCapacityProviderName() {
        return capacityProviderName;
    }

    /**
     * <p>
     * The capacity provider associated with the task.
     * </p>
     *
     * @param capacityProviderName <p>
     *            The capacity provider associated with the task.
     *            </p>
     */
    public void setCapacityProviderName(String capacityProviderName) {
        this.capacityProviderName = capacityProviderName;
    }

    /**
     * <p>
     * The capacity provider associated with the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviderName <p>
     *            The capacity provider associated with the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withCapacityProviderName(String capacityProviderName) {
        this.capacityProviderName = capacityProviderName;
        return this;
    }

    /**
     * <p>
     * The ARN of the cluster that hosts the task.
     * </p>
     *
     * @return <p>
     *         The ARN of the cluster that hosts the task.
     *         </p>
     */
    public String getClusterArn() {
        return clusterArn;
    }

    /**
     * <p>
     * The ARN of the cluster that hosts the task.
     * </p>
     *
     * @param clusterArn <p>
     *            The ARN of the cluster that hosts the task.
     *            </p>
     */
    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The ARN of the cluster that hosts the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterArn <p>
     *            The ARN of the cluster that hosts the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
        return this;
    }

    /**
     * <p>
     * The connectivity status of a task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECTED, DISCONNECTED
     *
     * @return <p>
     *         The connectivity status of a task.
     *         </p>
     * @see Connectivity
     */
    public String getConnectivity() {
        return connectivity;
    }

    /**
     * <p>
     * The connectivity status of a task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECTED, DISCONNECTED
     *
     * @param connectivity <p>
     *            The connectivity status of a task.
     *            </p>
     * @see Connectivity
     */
    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    /**
     * <p>
     * The connectivity status of a task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECTED, DISCONNECTED
     *
     * @param connectivity <p>
     *            The connectivity status of a task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Connectivity
     */
    public Task withConnectivity(String connectivity) {
        this.connectivity = connectivity;
        return this;
    }

    /**
     * <p>
     * The connectivity status of a task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECTED, DISCONNECTED
     *
     * @param connectivity <p>
     *            The connectivity status of a task.
     *            </p>
     * @see Connectivity
     */
    public void setConnectivity(Connectivity connectivity) {
        this.connectivity = connectivity.toString();
    }

    /**
     * <p>
     * The connectivity status of a task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECTED, DISCONNECTED
     *
     * @param connectivity <p>
     *            The connectivity status of a task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Connectivity
     */
    public Task withConnectivity(Connectivity connectivity) {
        this.connectivity = connectivity.toString();
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task last went into
     * <code>CONNECTED</code> status.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for when the task last went into
     *         <code>CONNECTED</code> status.
     *         </p>
     */
    public java.util.Date getConnectivityAt() {
        return connectivityAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task last went into
     * <code>CONNECTED</code> status.
     * </p>
     *
     * @param connectivityAt <p>
     *            The Unix timestamp for when the task last went into
     *            <code>CONNECTED</code> status.
     *            </p>
     */
    public void setConnectivityAt(java.util.Date connectivityAt) {
        this.connectivityAt = connectivityAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task last went into
     * <code>CONNECTED</code> status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectivityAt <p>
     *            The Unix timestamp for when the task last went into
     *            <code>CONNECTED</code> status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withConnectivityAt(java.util.Date connectivityAt) {
        this.connectivityAt = connectivityAt;
        return this;
    }

    /**
     * <p>
     * The ARN of the container instances that host the task.
     * </p>
     *
     * @return <p>
     *         The ARN of the container instances that host the task.
     *         </p>
     */
    public String getContainerInstanceArn() {
        return containerInstanceArn;
    }

    /**
     * <p>
     * The ARN of the container instances that host the task.
     * </p>
     *
     * @param containerInstanceArn <p>
     *            The ARN of the container instances that host the task.
     *            </p>
     */
    public void setContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
    }

    /**
     * <p>
     * The ARN of the container instances that host the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerInstanceArn <p>
     *            The ARN of the container instances that host the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
        return this;
    }

    /**
     * <p>
     * The containers associated with the task.
     * </p>
     *
     * @return <p>
     *         The containers associated with the task.
     *         </p>
     */
    public java.util.List<Container> getContainers() {
        return containers;
    }

    /**
     * <p>
     * The containers associated with the task.
     * </p>
     *
     * @param containers <p>
     *            The containers associated with the task.
     *            </p>
     */
    public void setContainers(java.util.Collection<Container> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new java.util.ArrayList<Container>(containers);
    }

    /**
     * <p>
     * The containers associated with the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containers <p>
     *            The containers associated with the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withContainers(Container... containers) {
        if (getContainers() == null) {
            this.containers = new java.util.ArrayList<Container>(containers.length);
        }
        for (Container value : containers) {
            this.containers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The containers associated with the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containers <p>
     *            The containers associated with the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withContainers(java.util.Collection<Container> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * <p>
     * The number of CPU units used by the task as expressed in a task
     * definition. It can be expressed as an integer using CPU units, for
     * example <code>1024</code>. It can also be expressed as a string using
     * vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>. String
     * values are converted to an integer indicating the CPU units when the task
     * definition is registered.
     * </p>
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
     *         The number of CPU units used by the task as expressed in a task
     *         definition. It can be expressed as an integer using CPU units,
     *         for example <code>1024</code>. It can also be expressed as a
     *         string using vCPUs, for example <code>1 vCPU</code> or
     *         <code>1 vcpu</code>. String values are converted to an integer
     *         indicating the CPU units when the task definition is registered.
     *         </p>
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
     * The number of CPU units used by the task as expressed in a task
     * definition. It can be expressed as an integer using CPU units, for
     * example <code>1024</code>. It can also be expressed as a string using
     * vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>. String
     * values are converted to an integer indicating the CPU units when the task
     * definition is registered.
     * </p>
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
     *            The number of CPU units used by the task as expressed in a
     *            task definition. It can be expressed as an integer using CPU
     *            units, for example <code>1024</code>. It can also be expressed
     *            as a string using vCPUs, for example <code>1 vCPU</code> or
     *            <code>1 vcpu</code>. String values are converted to an integer
     *            indicating the CPU units when the task definition is
     *            registered.
     *            </p>
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
     * The number of CPU units used by the task as expressed in a task
     * definition. It can be expressed as an integer using CPU units, for
     * example <code>1024</code>. It can also be expressed as a string using
     * vCPUs, for example <code>1 vCPU</code> or <code>1 vcpu</code>. String
     * values are converted to an integer indicating the CPU units when the task
     * definition is registered.
     * </p>
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
     *            The number of CPU units used by the task as expressed in a
     *            task definition. It can be expressed as an integer using CPU
     *            units, for example <code>1024</code>. It can also be expressed
     *            as a string using vCPUs, for example <code>1 vCPU</code> or
     *            <code>1 vcpu</code>. String values are converted to an integer
     *            indicating the CPU units when the task definition is
     *            registered.
     *            </p>
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
    public Task withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was created (the task entered the
     * <code>PENDING</code> state).
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for when the task was created (the task
     *         entered the <code>PENDING</code> state).
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was created (the task entered the
     * <code>PENDING</code> state).
     * </p>
     *
     * @param createdAt <p>
     *            The Unix timestamp for when the task was created (the task
     *            entered the <code>PENDING</code> state).
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was created (the task entered the
     * <code>PENDING</code> state).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The Unix timestamp for when the task was created (the task
     *            entered the <code>PENDING</code> state).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The desired status of the task. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-lifecycle.html"
     * >Task Lifecycle</a>.
     * </p>
     *
     * @return <p>
     *         The desired status of the task. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-lifecycle.html"
     *         >Task Lifecycle</a>.
     *         </p>
     */
    public String getDesiredStatus() {
        return desiredStatus;
    }

    /**
     * <p>
     * The desired status of the task. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-lifecycle.html"
     * >Task Lifecycle</a>.
     * </p>
     *
     * @param desiredStatus <p>
     *            The desired status of the task. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-lifecycle.html"
     *            >Task Lifecycle</a>.
     *            </p>
     */
    public void setDesiredStatus(String desiredStatus) {
        this.desiredStatus = desiredStatus;
    }

    /**
     * <p>
     * The desired status of the task. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-lifecycle.html"
     * >Task Lifecycle</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param desiredStatus <p>
     *            The desired status of the task. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-lifecycle.html"
     *            >Task Lifecycle</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withDesiredStatus(String desiredStatus) {
        this.desiredStatus = desiredStatus;
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task execution stopped.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for when the task execution stopped.
     *         </p>
     */
    public java.util.Date getExecutionStoppedAt() {
        return executionStoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task execution stopped.
     * </p>
     *
     * @param executionStoppedAt <p>
     *            The Unix timestamp for when the task execution stopped.
     *            </p>
     */
    public void setExecutionStoppedAt(java.util.Date executionStoppedAt) {
        this.executionStoppedAt = executionStoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task execution stopped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionStoppedAt <p>
     *            The Unix timestamp for when the task execution stopped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withExecutionStoppedAt(java.util.Date executionStoppedAt) {
        this.executionStoppedAt = executionStoppedAt;
        return this;
    }

    /**
     * <p>
     * The name of the task group associated with the task.
     * </p>
     *
     * @return <p>
     *         The name of the task group associated with the task.
     *         </p>
     */
    public String getGroup() {
        return group;
    }

    /**
     * <p>
     * The name of the task group associated with the task.
     * </p>
     *
     * @param group <p>
     *            The name of the task group associated with the task.
     *            </p>
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The name of the task group associated with the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param group <p>
     *            The name of the task group associated with the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * <p>
     * The health status for the task, which is determined by the health of the
     * essential containers in the task. If all essential containers in the task
     * are reporting as <code>HEALTHY</code>, then the task status also reports
     * as <code>HEALTHY</code>. If any essential containers in the task are
     * reporting as <code>UNHEALTHY</code> or <code>UNKNOWN</code>, then the
     * task status also reports as <code>UNHEALTHY</code> or
     * <code>UNKNOWN</code>, accordingly.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent does not monitor or report on Docker
     * health checks that are embedded in a container image (such as those
     * specified in a parent image or from the image's Dockerfile) and not
     * specified in the container definition. Health check parameters that are
     * specified in a container definition override any Docker health checks
     * that exist in the container image.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, UNKNOWN
     *
     * @return <p>
     *         The health status for the task, which is determined by the health
     *         of the essential containers in the task. If all essential
     *         containers in the task are reporting as <code>HEALTHY</code>,
     *         then the task status also reports as <code>HEALTHY</code>. If any
     *         essential containers in the task are reporting as
     *         <code>UNHEALTHY</code> or <code>UNKNOWN</code>, then the task
     *         status also reports as <code>UNHEALTHY</code> or
     *         <code>UNKNOWN</code>, accordingly.
     *         </p>
     *         <note>
     *         <p>
     *         The Amazon ECS container agent does not monitor or report on
     *         Docker health checks that are embedded in a container image (such
     *         as those specified in a parent image or from the image's
     *         Dockerfile) and not specified in the container definition. Health
     *         check parameters that are specified in a container definition
     *         override any Docker health checks that exist in the container
     *         image.
     *         </p>
     *         </note>
     * @see HealthStatus
     */
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * <p>
     * The health status for the task, which is determined by the health of the
     * essential containers in the task. If all essential containers in the task
     * are reporting as <code>HEALTHY</code>, then the task status also reports
     * as <code>HEALTHY</code>. If any essential containers in the task are
     * reporting as <code>UNHEALTHY</code> or <code>UNKNOWN</code>, then the
     * task status also reports as <code>UNHEALTHY</code> or
     * <code>UNKNOWN</code>, accordingly.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent does not monitor or report on Docker
     * health checks that are embedded in a container image (such as those
     * specified in a parent image or from the image's Dockerfile) and not
     * specified in the container definition. Health check parameters that are
     * specified in a container definition override any Docker health checks
     * that exist in the container image.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, UNKNOWN
     *
     * @param healthStatus <p>
     *            The health status for the task, which is determined by the
     *            health of the essential containers in the task. If all
     *            essential containers in the task are reporting as
     *            <code>HEALTHY</code>, then the task status also reports as
     *            <code>HEALTHY</code>. If any essential containers in the task
     *            are reporting as <code>UNHEALTHY</code> or
     *            <code>UNKNOWN</code>, then the task status also reports as
     *            <code>UNHEALTHY</code> or <code>UNKNOWN</code>, accordingly.
     *            </p>
     *            <note>
     *            <p>
     *            The Amazon ECS container agent does not monitor or report on
     *            Docker health checks that are embedded in a container image
     *            (such as those specified in a parent image or from the image's
     *            Dockerfile) and not specified in the container definition.
     *            Health check parameters that are specified in a container
     *            definition override any Docker health checks that exist in the
     *            container image.
     *            </p>
     *            </note>
     * @see HealthStatus
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * The health status for the task, which is determined by the health of the
     * essential containers in the task. If all essential containers in the task
     * are reporting as <code>HEALTHY</code>, then the task status also reports
     * as <code>HEALTHY</code>. If any essential containers in the task are
     * reporting as <code>UNHEALTHY</code> or <code>UNKNOWN</code>, then the
     * task status also reports as <code>UNHEALTHY</code> or
     * <code>UNKNOWN</code>, accordingly.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent does not monitor or report on Docker
     * health checks that are embedded in a container image (such as those
     * specified in a parent image or from the image's Dockerfile) and not
     * specified in the container definition. Health check parameters that are
     * specified in a container definition override any Docker health checks
     * that exist in the container image.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, UNKNOWN
     *
     * @param healthStatus <p>
     *            The health status for the task, which is determined by the
     *            health of the essential containers in the task. If all
     *            essential containers in the task are reporting as
     *            <code>HEALTHY</code>, then the task status also reports as
     *            <code>HEALTHY</code>. If any essential containers in the task
     *            are reporting as <code>UNHEALTHY</code> or
     *            <code>UNKNOWN</code>, then the task status also reports as
     *            <code>UNHEALTHY</code> or <code>UNKNOWN</code>, accordingly.
     *            </p>
     *            <note>
     *            <p>
     *            The Amazon ECS container agent does not monitor or report on
     *            Docker health checks that are embedded in a container image
     *            (such as those specified in a parent image or from the image's
     *            Dockerfile) and not specified in the container definition.
     *            Health check parameters that are specified in a container
     *            definition override any Docker health checks that exist in the
     *            container image.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HealthStatus
     */
    public Task withHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * <p>
     * The health status for the task, which is determined by the health of the
     * essential containers in the task. If all essential containers in the task
     * are reporting as <code>HEALTHY</code>, then the task status also reports
     * as <code>HEALTHY</code>. If any essential containers in the task are
     * reporting as <code>UNHEALTHY</code> or <code>UNKNOWN</code>, then the
     * task status also reports as <code>UNHEALTHY</code> or
     * <code>UNKNOWN</code>, accordingly.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent does not monitor or report on Docker
     * health checks that are embedded in a container image (such as those
     * specified in a parent image or from the image's Dockerfile) and not
     * specified in the container definition. Health check parameters that are
     * specified in a container definition override any Docker health checks
     * that exist in the container image.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, UNKNOWN
     *
     * @param healthStatus <p>
     *            The health status for the task, which is determined by the
     *            health of the essential containers in the task. If all
     *            essential containers in the task are reporting as
     *            <code>HEALTHY</code>, then the task status also reports as
     *            <code>HEALTHY</code>. If any essential containers in the task
     *            are reporting as <code>UNHEALTHY</code> or
     *            <code>UNKNOWN</code>, then the task status also reports as
     *            <code>UNHEALTHY</code> or <code>UNKNOWN</code>, accordingly.
     *            </p>
     *            <note>
     *            <p>
     *            The Amazon ECS container agent does not monitor or report on
     *            Docker health checks that are embedded in a container image
     *            (such as those specified in a parent image or from the image's
     *            Dockerfile) and not specified in the container definition.
     *            Health check parameters that are specified in a container
     *            definition override any Docker health checks that exist in the
     *            container image.
     *            </p>
     *            </note>
     * @see HealthStatus
     */
    public void setHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus.toString();
    }

    /**
     * <p>
     * The health status for the task, which is determined by the health of the
     * essential containers in the task. If all essential containers in the task
     * are reporting as <code>HEALTHY</code>, then the task status also reports
     * as <code>HEALTHY</code>. If any essential containers in the task are
     * reporting as <code>UNHEALTHY</code> or <code>UNKNOWN</code>, then the
     * task status also reports as <code>UNHEALTHY</code> or
     * <code>UNKNOWN</code>, accordingly.
     * </p>
     * <note>
     * <p>
     * The Amazon ECS container agent does not monitor or report on Docker
     * health checks that are embedded in a container image (such as those
     * specified in a parent image or from the image's Dockerfile) and not
     * specified in the container definition. Health check parameters that are
     * specified in a container definition override any Docker health checks
     * that exist in the container image.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, UNKNOWN
     *
     * @param healthStatus <p>
     *            The health status for the task, which is determined by the
     *            health of the essential containers in the task. If all
     *            essential containers in the task are reporting as
     *            <code>HEALTHY</code>, then the task status also reports as
     *            <code>HEALTHY</code>. If any essential containers in the task
     *            are reporting as <code>UNHEALTHY</code> or
     *            <code>UNKNOWN</code>, then the task status also reports as
     *            <code>UNHEALTHY</code> or <code>UNKNOWN</code>, accordingly.
     *            </p>
     *            <note>
     *            <p>
     *            The Amazon ECS container agent does not monitor or report on
     *            Docker health checks that are embedded in a container image
     *            (such as those specified in a parent image or from the image's
     *            Dockerfile) and not specified in the container definition.
     *            Health check parameters that are specified in a container
     *            definition override any Docker health checks that exist in the
     *            container image.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HealthStatus
     */
    public Task withHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus.toString();
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
    public Task withInferenceAccelerators(InferenceAccelerator... inferenceAccelerators) {
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
    public Task withInferenceAccelerators(
            java.util.Collection<InferenceAccelerator> inferenceAccelerators) {
        setInferenceAccelerators(inferenceAccelerators);
        return this;
    }

    /**
     * <p>
     * The last known status of the task. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-lifecycle.html"
     * >Task Lifecycle</a>.
     * </p>
     *
     * @return <p>
     *         The last known status of the task. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-lifecycle.html"
     *         >Task Lifecycle</a>.
     *         </p>
     */
    public String getLastStatus() {
        return lastStatus;
    }

    /**
     * <p>
     * The last known status of the task. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-lifecycle.html"
     * >Task Lifecycle</a>.
     * </p>
     *
     * @param lastStatus <p>
     *            The last known status of the task. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-lifecycle.html"
     *            >Task Lifecycle</a>.
     *            </p>
     */
    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    /**
     * <p>
     * The last known status of the task. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-lifecycle.html"
     * >Task Lifecycle</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastStatus <p>
     *            The last known status of the task. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-lifecycle.html"
     *            >Task Lifecycle</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
        return this;
    }

    /**
     * <p>
     * The launch type on which your task is running. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @return <p>
     *         The launch type on which your task is running. For more
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
     * The launch type on which your task is running. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type on which your task is running. For more
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
     * The launch type on which your task is running. For more information, see
     * <a href=
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
     *            The launch type on which your task is running. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LaunchType
     */
    public Task withLaunchType(String launchType) {
        this.launchType = launchType;
        return this;
    }

    /**
     * <p>
     * The launch type on which your task is running. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type on which your task is running. For more
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
     * The launch type on which your task is running. For more information, see
     * <a href=
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
     *            The launch type on which your task is running. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LaunchType
     */
    public Task withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * The amount of memory (in MiB) used by the task as expressed in a task
     * definition. It can be expressed as an integer using MiB, for example
     * <code>1024</code>. It can also be expressed as a string using GB, for
     * example <code>1GB</code> or <code>1 GB</code>. String values are
     * converted to an integer indicating the MiB when the task definition is
     * registered.
     * </p>
     * <p>
     * If you are using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If you are using the Fargate launch type, this field is required and you
     * must use one of the following values, which determines your range of
     * supported values for the <code>cpu</code> parameter:
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
     *         The amount of memory (in MiB) used by the task as expressed in a
     *         task definition. It can be expressed as an integer using MiB, for
     *         example <code>1024</code>. It can also be expressed as a string
     *         using GB, for example <code>1GB</code> or <code>1 GB</code>.
     *         String values are converted to an integer indicating the MiB when
     *         the task definition is registered.
     *         </p>
     *         <p>
     *         If you are using the EC2 launch type, this field is optional.
     *         </p>
     *         <p>
     *         If you are using the Fargate launch type, this field is required
     *         and you must use one of the following values, which determines
     *         your range of supported values for the <code>cpu</code>
     *         parameter:
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
     * The amount of memory (in MiB) used by the task as expressed in a task
     * definition. It can be expressed as an integer using MiB, for example
     * <code>1024</code>. It can also be expressed as a string using GB, for
     * example <code>1GB</code> or <code>1 GB</code>. String values are
     * converted to an integer indicating the MiB when the task definition is
     * registered.
     * </p>
     * <p>
     * If you are using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If you are using the Fargate launch type, this field is required and you
     * must use one of the following values, which determines your range of
     * supported values for the <code>cpu</code> parameter:
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
     *            The amount of memory (in MiB) used by the task as expressed in
     *            a task definition. It can be expressed as an integer using
     *            MiB, for example <code>1024</code>. It can also be expressed
     *            as a string using GB, for example <code>1GB</code> or
     *            <code>1 GB</code>. String values are converted to an integer
     *            indicating the MiB when the task definition is registered.
     *            </p>
     *            <p>
     *            If you are using the EC2 launch type, this field is optional.
     *            </p>
     *            <p>
     *            If you are using the Fargate launch type, this field is
     *            required and you must use one of the following values, which
     *            determines your range of supported values for the
     *            <code>cpu</code> parameter:
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
     * The amount of memory (in MiB) used by the task as expressed in a task
     * definition. It can be expressed as an integer using MiB, for example
     * <code>1024</code>. It can also be expressed as a string using GB, for
     * example <code>1GB</code> or <code>1 GB</code>. String values are
     * converted to an integer indicating the MiB when the task definition is
     * registered.
     * </p>
     * <p>
     * If you are using the EC2 launch type, this field is optional.
     * </p>
     * <p>
     * If you are using the Fargate launch type, this field is required and you
     * must use one of the following values, which determines your range of
     * supported values for the <code>cpu</code> parameter:
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
     *            The amount of memory (in MiB) used by the task as expressed in
     *            a task definition. It can be expressed as an integer using
     *            MiB, for example <code>1024</code>. It can also be expressed
     *            as a string using GB, for example <code>1GB</code> or
     *            <code>1 GB</code>. String values are converted to an integer
     *            indicating the MiB when the task definition is registered.
     *            </p>
     *            <p>
     *            If you are using the EC2 launch type, this field is optional.
     *            </p>
     *            <p>
     *            If you are using the Fargate launch type, this field is
     *            required and you must use one of the following values, which
     *            determines your range of supported values for the
     *            <code>cpu</code> parameter:
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
    public Task withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * <p>
     * One or more container overrides.
     * </p>
     *
     * @return <p>
     *         One or more container overrides.
     *         </p>
     */
    public TaskOverride getOverrides() {
        return overrides;
    }

    /**
     * <p>
     * One or more container overrides.
     * </p>
     *
     * @param overrides <p>
     *            One or more container overrides.
     *            </p>
     */
    public void setOverrides(TaskOverride overrides) {
        this.overrides = overrides;
    }

    /**
     * <p>
     * One or more container overrides.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param overrides <p>
     *            One or more container overrides.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withOverrides(TaskOverride overrides) {
        this.overrides = overrides;
        return this;
    }

    /**
     * <p>
     * The platform version on which your task is running. A platform version is
     * only specified for tasks using the Fargate launch type. If one is not
     * specified, the <code>LATEST</code> platform version is used by default.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The platform version on which your task is running. A platform
     *         version is only specified for tasks using the Fargate launch
     *         type. If one is not specified, the <code>LATEST</code> platform
     *         version is used by default. For more information, see <a href=
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
     * The platform version on which your task is running. A platform version is
     * only specified for tasks using the Fargate launch type. If one is not
     * specified, the <code>LATEST</code> platform version is used by default.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @param platformVersion <p>
     *            The platform version on which your task is running. A platform
     *            version is only specified for tasks using the Fargate launch
     *            type. If one is not specified, the <code>LATEST</code>
     *            platform version is used by default. For more information, see
     *            <a href=
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
     * The platform version on which your task is running. A platform version is
     * only specified for tasks using the Fargate launch type. If one is not
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
     *            The platform version on which your task is running. A platform
     *            version is only specified for tasks using the Fargate launch
     *            type. If one is not specified, the <code>LATEST</code>
     *            platform version is used by default. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     *            >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the container image pull began.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for when the container image pull began.
     *         </p>
     */
    public java.util.Date getPullStartedAt() {
        return pullStartedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the container image pull began.
     * </p>
     *
     * @param pullStartedAt <p>
     *            The Unix timestamp for when the container image pull began.
     *            </p>
     */
    public void setPullStartedAt(java.util.Date pullStartedAt) {
        this.pullStartedAt = pullStartedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the container image pull began.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullStartedAt <p>
     *            The Unix timestamp for when the container image pull began.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withPullStartedAt(java.util.Date pullStartedAt) {
        this.pullStartedAt = pullStartedAt;
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the container image pull completed.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for when the container image pull completed.
     *         </p>
     */
    public java.util.Date getPullStoppedAt() {
        return pullStoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the container image pull completed.
     * </p>
     *
     * @param pullStoppedAt <p>
     *            The Unix timestamp for when the container image pull
     *            completed.
     *            </p>
     */
    public void setPullStoppedAt(java.util.Date pullStoppedAt) {
        this.pullStoppedAt = pullStoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the container image pull completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pullStoppedAt <p>
     *            The Unix timestamp for when the container image pull
     *            completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withPullStoppedAt(java.util.Date pullStoppedAt) {
        this.pullStoppedAt = pullStoppedAt;
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task started (the task transitioned from
     * the <code>PENDING</code> state to the <code>RUNNING</code> state).
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for when the task started (the task
     *         transitioned from the <code>PENDING</code> state to the
     *         <code>RUNNING</code> state).
     *         </p>
     */
    public java.util.Date getStartedAt() {
        return startedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task started (the task transitioned from
     * the <code>PENDING</code> state to the <code>RUNNING</code> state).
     * </p>
     *
     * @param startedAt <p>
     *            The Unix timestamp for when the task started (the task
     *            transitioned from the <code>PENDING</code> state to the
     *            <code>RUNNING</code> state).
     *            </p>
     */
    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task started (the task transitioned from
     * the <code>PENDING</code> state to the <code>RUNNING</code> state).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startedAt <p>
     *            The Unix timestamp for when the task started (the task
     *            transitioned from the <code>PENDING</code> state to the
     *            <code>RUNNING</code> state).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * <p>
     * The tag specified when a task is started. If the task is started by an
     * Amazon ECS service, then the <code>startedBy</code> parameter contains
     * the deployment ID of the service that starts it.
     * </p>
     *
     * @return <p>
     *         The tag specified when a task is started. If the task is started
     *         by an Amazon ECS service, then the <code>startedBy</code>
     *         parameter contains the deployment ID of the service that starts
     *         it.
     *         </p>
     */
    public String getStartedBy() {
        return startedBy;
    }

    /**
     * <p>
     * The tag specified when a task is started. If the task is started by an
     * Amazon ECS service, then the <code>startedBy</code> parameter contains
     * the deployment ID of the service that starts it.
     * </p>
     *
     * @param startedBy <p>
     *            The tag specified when a task is started. If the task is
     *            started by an Amazon ECS service, then the
     *            <code>startedBy</code> parameter contains the deployment ID of
     *            the service that starts it.
     *            </p>
     */
    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    /**
     * <p>
     * The tag specified when a task is started. If the task is started by an
     * Amazon ECS service, then the <code>startedBy</code> parameter contains
     * the deployment ID of the service that starts it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startedBy <p>
     *            The tag specified when a task is started. If the task is
     *            started by an Amazon ECS service, then the
     *            <code>startedBy</code> parameter contains the deployment ID of
     *            the service that starts it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withStartedBy(String startedBy) {
        this.startedBy = startedBy;
        return this;
    }

    /**
     * <p>
     * The stop code indicating why a task was stopped. The
     * <code>stoppedReason</code> may contain additional details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TaskFailedToStart, EssentialContainerExited,
     * UserInitiated
     *
     * @return <p>
     *         The stop code indicating why a task was stopped. The
     *         <code>stoppedReason</code> may contain additional details.
     *         </p>
     * @see TaskStopCode
     */
    public String getStopCode() {
        return stopCode;
    }

    /**
     * <p>
     * The stop code indicating why a task was stopped. The
     * <code>stoppedReason</code> may contain additional details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TaskFailedToStart, EssentialContainerExited,
     * UserInitiated
     *
     * @param stopCode <p>
     *            The stop code indicating why a task was stopped. The
     *            <code>stoppedReason</code> may contain additional details.
     *            </p>
     * @see TaskStopCode
     */
    public void setStopCode(String stopCode) {
        this.stopCode = stopCode;
    }

    /**
     * <p>
     * The stop code indicating why a task was stopped. The
     * <code>stoppedReason</code> may contain additional details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TaskFailedToStart, EssentialContainerExited,
     * UserInitiated
     *
     * @param stopCode <p>
     *            The stop code indicating why a task was stopped. The
     *            <code>stoppedReason</code> may contain additional details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskStopCode
     */
    public Task withStopCode(String stopCode) {
        this.stopCode = stopCode;
        return this;
    }

    /**
     * <p>
     * The stop code indicating why a task was stopped. The
     * <code>stoppedReason</code> may contain additional details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TaskFailedToStart, EssentialContainerExited,
     * UserInitiated
     *
     * @param stopCode <p>
     *            The stop code indicating why a task was stopped. The
     *            <code>stoppedReason</code> may contain additional details.
     *            </p>
     * @see TaskStopCode
     */
    public void setStopCode(TaskStopCode stopCode) {
        this.stopCode = stopCode.toString();
    }

    /**
     * <p>
     * The stop code indicating why a task was stopped. The
     * <code>stoppedReason</code> may contain additional details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TaskFailedToStart, EssentialContainerExited,
     * UserInitiated
     *
     * @param stopCode <p>
     *            The stop code indicating why a task was stopped. The
     *            <code>stoppedReason</code> may contain additional details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskStopCode
     */
    public Task withStopCode(TaskStopCode stopCode) {
        this.stopCode = stopCode.toString();
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was stopped (the task transitioned
     * from the <code>RUNNING</code> state to the <code>STOPPED</code> state).
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for when the task was stopped (the task
     *         transitioned from the <code>RUNNING</code> state to the
     *         <code>STOPPED</code> state).
     *         </p>
     */
    public java.util.Date getStoppedAt() {
        return stoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was stopped (the task transitioned
     * from the <code>RUNNING</code> state to the <code>STOPPED</code> state).
     * </p>
     *
     * @param stoppedAt <p>
     *            The Unix timestamp for when the task was stopped (the task
     *            transitioned from the <code>RUNNING</code> state to the
     *            <code>STOPPED</code> state).
     *            </p>
     */
    public void setStoppedAt(java.util.Date stoppedAt) {
        this.stoppedAt = stoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task was stopped (the task transitioned
     * from the <code>RUNNING</code> state to the <code>STOPPED</code> state).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stoppedAt <p>
     *            The Unix timestamp for when the task was stopped (the task
     *            transitioned from the <code>RUNNING</code> state to the
     *            <code>STOPPED</code> state).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withStoppedAt(java.util.Date stoppedAt) {
        this.stoppedAt = stoppedAt;
        return this;
    }

    /**
     * <p>
     * The reason that the task was stopped.
     * </p>
     *
     * @return <p>
     *         The reason that the task was stopped.
     *         </p>
     */
    public String getStoppedReason() {
        return stoppedReason;
    }

    /**
     * <p>
     * The reason that the task was stopped.
     * </p>
     *
     * @param stoppedReason <p>
     *            The reason that the task was stopped.
     *            </p>
     */
    public void setStoppedReason(String stoppedReason) {
        this.stoppedReason = stoppedReason;
    }

    /**
     * <p>
     * The reason that the task was stopped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stoppedReason <p>
     *            The reason that the task was stopped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withStoppedReason(String stoppedReason) {
        this.stoppedReason = stoppedReason;
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the task stops (transitions from the
     * <code>RUNNING</code> state to <code>STOPPED</code>).
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for when the task stops (transitions from the
     *         <code>RUNNING</code> state to <code>STOPPED</code>).
     *         </p>
     */
    public java.util.Date getStoppingAt() {
        return stoppingAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task stops (transitions from the
     * <code>RUNNING</code> state to <code>STOPPED</code>).
     * </p>
     *
     * @param stoppingAt <p>
     *            The Unix timestamp for when the task stops (transitions from
     *            the <code>RUNNING</code> state to <code>STOPPED</code>).
     *            </p>
     */
    public void setStoppingAt(java.util.Date stoppingAt) {
        this.stoppingAt = stoppingAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the task stops (transitions from the
     * <code>RUNNING</code> state to <code>STOPPED</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stoppingAt <p>
     *            The Unix timestamp for when the task stops (transitions from
     *            the <code>RUNNING</code> state to <code>STOPPED</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withStoppingAt(java.util.Date stoppingAt) {
        this.stoppingAt = stoppingAt;
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
    public Task withTags(Tag... tags) {
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
    public Task withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the task.
     *         </p>
     */
    public String getTaskArn() {
        return taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     *
     * @param taskArn <p>
     *            The Amazon Resource Name (ARN) of the task.
     *            </p>
     */
    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskArn <p>
     *            The Amazon Resource Name (ARN) of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withTaskArn(String taskArn) {
        this.taskArn = taskArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the task definition that creates the task.
     * </p>
     *
     * @return <p>
     *         The ARN of the task definition that creates the task.
     *         </p>
     */
    public String getTaskDefinitionArn() {
        return taskDefinitionArn;
    }

    /**
     * <p>
     * The ARN of the task definition that creates the task.
     * </p>
     *
     * @param taskDefinitionArn <p>
     *            The ARN of the task definition that creates the task.
     *            </p>
     */
    public void setTaskDefinitionArn(String taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
    }

    /**
     * <p>
     * The ARN of the task definition that creates the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskDefinitionArn <p>
     *            The ARN of the task definition that creates the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withTaskDefinitionArn(String taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
        return this;
    }

    /**
     * <p>
     * The version counter for the task. Every time a task experiences a change
     * that triggers a CloudWatch event, the version counter is incremented. If
     * you are replicating your Amazon ECS task state with CloudWatch Events,
     * you can compare the version of a task reported by the Amazon ECS API
     * actions with the version reported in CloudWatch Events for the task
     * (inside the <code>detail</code> object) to verify that the version in
     * your event stream is current.
     * </p>
     *
     * @return <p>
     *         The version counter for the task. Every time a task experiences a
     *         change that triggers a CloudWatch event, the version counter is
     *         incremented. If you are replicating your Amazon ECS task state
     *         with CloudWatch Events, you can compare the version of a task
     *         reported by the Amazon ECS API actions with the version reported
     *         in CloudWatch Events for the task (inside the <code>detail</code>
     *         object) to verify that the version in your event stream is
     *         current.
     *         </p>
     */
    public Long getVersion() {
        return version;
    }

    /**
     * <p>
     * The version counter for the task. Every time a task experiences a change
     * that triggers a CloudWatch event, the version counter is incremented. If
     * you are replicating your Amazon ECS task state with CloudWatch Events,
     * you can compare the version of a task reported by the Amazon ECS API
     * actions with the version reported in CloudWatch Events for the task
     * (inside the <code>detail</code> object) to verify that the version in
     * your event stream is current.
     * </p>
     *
     * @param version <p>
     *            The version counter for the task. Every time a task
     *            experiences a change that triggers a CloudWatch event, the
     *            version counter is incremented. If you are replicating your
     *            Amazon ECS task state with CloudWatch Events, you can compare
     *            the version of a task reported by the Amazon ECS API actions
     *            with the version reported in CloudWatch Events for the task
     *            (inside the <code>detail</code> object) to verify that the
     *            version in your event stream is current.
     *            </p>
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version counter for the task. Every time a task experiences a change
     * that triggers a CloudWatch event, the version counter is incremented. If
     * you are replicating your Amazon ECS task state with CloudWatch Events,
     * you can compare the version of a task reported by the Amazon ECS API
     * actions with the version reported in CloudWatch Events for the task
     * (inside the <code>detail</code> object) to verify that the version in
     * your event stream is current.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version counter for the task. Every time a task
     *            experiences a change that triggers a CloudWatch event, the
     *            version counter is incremented. If you are replicating your
     *            Amazon ECS task state with CloudWatch Events, you can compare
     *            the version of a task reported by the Amazon ECS API actions
     *            with the version reported in CloudWatch Events for the task
     *            (inside the <code>detail</code> object) to verify that the
     *            version in your event stream is current.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withVersion(Long version) {
        this.version = version;
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
        if (getAttachments() != null)
            sb.append("attachments: " + getAttachments() + ",");
        if (getAttributes() != null)
            sb.append("attributes: " + getAttributes() + ",");
        if (getAvailabilityZone() != null)
            sb.append("availabilityZone: " + getAvailabilityZone() + ",");
        if (getCapacityProviderName() != null)
            sb.append("capacityProviderName: " + getCapacityProviderName() + ",");
        if (getClusterArn() != null)
            sb.append("clusterArn: " + getClusterArn() + ",");
        if (getConnectivity() != null)
            sb.append("connectivity: " + getConnectivity() + ",");
        if (getConnectivityAt() != null)
            sb.append("connectivityAt: " + getConnectivityAt() + ",");
        if (getContainerInstanceArn() != null)
            sb.append("containerInstanceArn: " + getContainerInstanceArn() + ",");
        if (getContainers() != null)
            sb.append("containers: " + getContainers() + ",");
        if (getCpu() != null)
            sb.append("cpu: " + getCpu() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getDesiredStatus() != null)
            sb.append("desiredStatus: " + getDesiredStatus() + ",");
        if (getExecutionStoppedAt() != null)
            sb.append("executionStoppedAt: " + getExecutionStoppedAt() + ",");
        if (getGroup() != null)
            sb.append("group: " + getGroup() + ",");
        if (getHealthStatus() != null)
            sb.append("healthStatus: " + getHealthStatus() + ",");
        if (getInferenceAccelerators() != null)
            sb.append("inferenceAccelerators: " + getInferenceAccelerators() + ",");
        if (getLastStatus() != null)
            sb.append("lastStatus: " + getLastStatus() + ",");
        if (getLaunchType() != null)
            sb.append("launchType: " + getLaunchType() + ",");
        if (getMemory() != null)
            sb.append("memory: " + getMemory() + ",");
        if (getOverrides() != null)
            sb.append("overrides: " + getOverrides() + ",");
        if (getPlatformVersion() != null)
            sb.append("platformVersion: " + getPlatformVersion() + ",");
        if (getPullStartedAt() != null)
            sb.append("pullStartedAt: " + getPullStartedAt() + ",");
        if (getPullStoppedAt() != null)
            sb.append("pullStoppedAt: " + getPullStoppedAt() + ",");
        if (getStartedAt() != null)
            sb.append("startedAt: " + getStartedAt() + ",");
        if (getStartedBy() != null)
            sb.append("startedBy: " + getStartedBy() + ",");
        if (getStopCode() != null)
            sb.append("stopCode: " + getStopCode() + ",");
        if (getStoppedAt() != null)
            sb.append("stoppedAt: " + getStoppedAt() + ",");
        if (getStoppedReason() != null)
            sb.append("stoppedReason: " + getStoppedReason() + ",");
        if (getStoppingAt() != null)
            sb.append("stoppingAt: " + getStoppingAt() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getTaskArn() != null)
            sb.append("taskArn: " + getTaskArn() + ",");
        if (getTaskDefinitionArn() != null)
            sb.append("taskDefinitionArn: " + getTaskDefinitionArn() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getCapacityProviderName() == null) ? 0 : getCapacityProviderName().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode
                + ((getConnectivity() == null) ? 0 : getConnectivity().hashCode());
        hashCode = prime * hashCode
                + ((getConnectivityAt() == null) ? 0 : getConnectivityAt().hashCode());
        hashCode = prime * hashCode
                + ((getContainerInstanceArn() == null) ? 0 : getContainerInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getDesiredStatus() == null) ? 0 : getDesiredStatus().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionStoppedAt() == null) ? 0 : getExecutionStoppedAt().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode
                + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getInferenceAccelerators() == null) ? 0 : getInferenceAccelerators().hashCode());
        hashCode = prime * hashCode + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode
                + ((getPullStartedAt() == null) ? 0 : getPullStartedAt().hashCode());
        hashCode = prime * hashCode
                + ((getPullStoppedAt() == null) ? 0 : getPullStoppedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode());
        hashCode = prime * hashCode + ((getStopCode() == null) ? 0 : getStopCode().hashCode());
        hashCode = prime * hashCode + ((getStoppedAt() == null) ? 0 : getStoppedAt().hashCode());
        hashCode = prime * hashCode
                + ((getStoppedReason() == null) ? 0 : getStoppedReason().hashCode());
        hashCode = prime * hashCode + ((getStoppingAt() == null) ? 0 : getStoppingAt().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode
                + ((getTaskDefinitionArn() == null) ? 0 : getTaskDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Task == false)
            return false;
        Task other = (Task) obj;

        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null
                && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getCapacityProviderName() == null ^ this.getCapacityProviderName() == null)
            return false;
        if (other.getCapacityProviderName() != null
                && other.getCapacityProviderName().equals(this.getCapacityProviderName()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null
                && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getConnectivity() == null ^ this.getConnectivity() == null)
            return false;
        if (other.getConnectivity() != null
                && other.getConnectivity().equals(this.getConnectivity()) == false)
            return false;
        if (other.getConnectivityAt() == null ^ this.getConnectivityAt() == null)
            return false;
        if (other.getConnectivityAt() != null
                && other.getConnectivityAt().equals(this.getConnectivityAt()) == false)
            return false;
        if (other.getContainerInstanceArn() == null ^ this.getContainerInstanceArn() == null)
            return false;
        if (other.getContainerInstanceArn() != null
                && other.getContainerInstanceArn().equals(this.getContainerInstanceArn()) == false)
            return false;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null
                && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDesiredStatus() == null ^ this.getDesiredStatus() == null)
            return false;
        if (other.getDesiredStatus() != null
                && other.getDesiredStatus().equals(this.getDesiredStatus()) == false)
            return false;
        if (other.getExecutionStoppedAt() == null ^ this.getExecutionStoppedAt() == null)
            return false;
        if (other.getExecutionStoppedAt() != null
                && other.getExecutionStoppedAt().equals(this.getExecutionStoppedAt()) == false)
            return false;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null
                && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getInferenceAccelerators() == null ^ this.getInferenceAccelerators() == null)
            return false;
        if (other.getInferenceAccelerators() != null
                && other.getInferenceAccelerators().equals(this.getInferenceAccelerators()) == false)
            return false;
        if (other.getLastStatus() == null ^ this.getLastStatus() == null)
            return false;
        if (other.getLastStatus() != null
                && other.getLastStatus().equals(this.getLastStatus()) == false)
            return false;
        if (other.getLaunchType() == null ^ this.getLaunchType() == null)
            return false;
        if (other.getLaunchType() != null
                && other.getLaunchType().equals(this.getLaunchType()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null
                && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null
                && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getPullStartedAt() == null ^ this.getPullStartedAt() == null)
            return false;
        if (other.getPullStartedAt() != null
                && other.getPullStartedAt().equals(this.getPullStartedAt()) == false)
            return false;
        if (other.getPullStoppedAt() == null ^ this.getPullStoppedAt() == null)
            return false;
        if (other.getPullStoppedAt() != null
                && other.getPullStoppedAt().equals(this.getPullStoppedAt()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null
                && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStartedBy() == null ^ this.getStartedBy() == null)
            return false;
        if (other.getStartedBy() != null
                && other.getStartedBy().equals(this.getStartedBy()) == false)
            return false;
        if (other.getStopCode() == null ^ this.getStopCode() == null)
            return false;
        if (other.getStopCode() != null && other.getStopCode().equals(this.getStopCode()) == false)
            return false;
        if (other.getStoppedAt() == null ^ this.getStoppedAt() == null)
            return false;
        if (other.getStoppedAt() != null
                && other.getStoppedAt().equals(this.getStoppedAt()) == false)
            return false;
        if (other.getStoppedReason() == null ^ this.getStoppedReason() == null)
            return false;
        if (other.getStoppedReason() != null
                && other.getStoppedReason().equals(this.getStoppedReason()) == false)
            return false;
        if (other.getStoppingAt() == null ^ this.getStoppingAt() == null)
            return false;
        if (other.getStoppingAt() != null
                && other.getStoppingAt().equals(this.getStoppingAt()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getTaskDefinitionArn() == null ^ this.getTaskDefinitionArn() == null)
            return false;
        if (other.getTaskDefinitionArn() != null
                && other.getTaskDefinitionArn().equals(this.getTaskDefinitionArn()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}
