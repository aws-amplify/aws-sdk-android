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
 * An EC2 instance that is running the Amazon ECS agent and has been registered
 * with a cluster.
 * </p>
 */
public class ContainerInstance implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the Region
     * of the container instance, the AWS account ID of the container instance
     * owner, the <code>container-instance</code> namespace, and then the
     * container instance ID. For example,
     * <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     * .
     * </p>
     */
    private String containerInstanceArn;

    /**
     * <p>
     * The EC2 instance ID of the container instance.
     * </p>
     */
    private String ec2InstanceId;

    /**
     * <p>
     * The capacity provider associated with the container instance.
     * </p>
     */
    private String capacityProviderName;

    /**
     * <p>
     * The version counter for the container instance. Every time a container
     * instance experiences a change that triggers a CloudWatch event, the
     * version counter is incremented. If you are replicating your Amazon ECS
     * container instance state with CloudWatch Events, you can compare the
     * version of a container instance reported by the Amazon ECS APIs with the
     * version reported in CloudWatch Events for the container instance (inside
     * the <code>detail</code> object) to verify that the version in your event
     * stream is current.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * The version information for the Amazon ECS container agent and Docker
     * daemon running on the container instance.
     * </p>
     */
    private VersionInfo versionInfo;

    /**
     * <p>
     * For CPU and memory resource types, this parameter describes the remaining
     * CPU and memory that has not already been allocated to tasks and is
     * therefore available for new tasks. For port resource types, this
     * parameter describes the ports that were reserved by the Amazon ECS
     * container agent (at instance registration time) and any task containers
     * that have reserved port mappings on the host (with the <code>host</code>
     * or <code>bridge</code> network mode). Any port that is not specified here
     * is available for new tasks.
     * </p>
     */
    private java.util.List<Resource> remainingResources;

    /**
     * <p>
     * For CPU and memory resource types, this parameter describes the amount of
     * each resource that was available on the container instance when the
     * container agent registered it with Amazon ECS. This value represents the
     * total amount of CPU and memory that can be allocated on this container
     * instance to tasks. For port resource types, this parameter describes the
     * ports that were reserved by the Amazon ECS container agent when it
     * registered the container instance with Amazon ECS.
     * </p>
     */
    private java.util.List<Resource> registeredResources;

    /**
     * <p>
     * The status of the container instance. The valid values are
     * <code>REGISTERING</code>, <code>REGISTRATION_FAILED</code>,
     * <code>ACTIVE</code>, <code>INACTIVE</code>, <code>DEREGISTERING</code>,
     * or <code>DRAINING</code>.
     * </p>
     * <p>
     * If your account has opted in to the <code>awsvpcTrunking</code> account
     * setting, then any newly registered container instance will transition to
     * a <code>REGISTERING</code> status while the trunk elastic network
     * interface is provisioned for the instance. If the registration fails, the
     * instance will transition to a <code>REGISTRATION_FAILED</code> status.
     * You can describe the container instance and see the reason for failure in
     * the <code>statusReason</code> parameter. Once the container instance is
     * terminated, the instance transitions to a <code>DEREGISTERING</code>
     * status while the trunk elastic network interface is deprovisioned. The
     * instance then transitions to an <code>INACTIVE</code> status.
     * </p>
     * <p>
     * The <code>ACTIVE</code> status indicates that the container instance can
     * accept tasks. The <code>DRAINING</code> indicates that new tasks are not
     * placed on the container instance and any service tasks running on the
     * container instance are removed if possible. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-draining.html"
     * >Container Instance Draining</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The reason that the container instance reached its current status.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * This parameter returns <code>true</code> if the agent is connected to
     * Amazon ECS. Registered instances with an agent that may be unhealthy or
     * stopped return <code>false</code>. Only instances connected to an agent
     * can accept placement requests.
     * </p>
     */
    private Boolean agentConnected;

    /**
     * <p>
     * The number of tasks on the container instance that are in the
     * <code>RUNNING</code> status.
     * </p>
     */
    private Integer runningTasksCount;

    /**
     * <p>
     * The number of tasks on the container instance that are in the
     * <code>PENDING</code> status.
     * </p>
     */
    private Integer pendingTasksCount;

    /**
     * <p>
     * The status of the most recent agent update. If an update has never been
     * requested, this value is <code>NULL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, STAGING, STAGED, UPDATING, UPDATED,
     * FAILED
     */
    private String agentUpdateStatus;

    /**
     * <p>
     * The attributes set for the container instance, either by the Amazon ECS
     * container agent at instance registration or manually with the
     * <a>PutAttributes</a> operation.
     * </p>
     */
    private java.util.List<Attribute> attributes;

    /**
     * <p>
     * The Unix timestamp for when the container instance was registered.
     * </p>
     */
    private java.util.Date registeredAt;

    /**
     * <p>
     * The resources attached to a container instance, such as elastic network
     * interfaces.
     * </p>
     */
    private java.util.List<Attachment> attachments;

    /**
     * <p>
     * The metadata that you apply to the container instance to help you
     * categorize and organize them. Each tag consists of a key and an optional
     * value, both of which you define.
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
     * The Amazon Resource Name (ARN) of the container instance. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the Region
     * of the container instance, the AWS account ID of the container instance
     * owner, the <code>container-instance</code> namespace, and then the
     * container instance ID. For example,
     * <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     * .
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the container instance. The ARN
     *         contains the <code>arn:aws:ecs</code> namespace, followed by the
     *         Region of the container instance, the AWS account ID of the
     *         container instance owner, the <code>container-instance</code>
     *         namespace, and then the container instance ID. For example,
     *         <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     *         .
     *         </p>
     */
    public String getContainerInstanceArn() {
        return containerInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the Region
     * of the container instance, the AWS account ID of the container instance
     * owner, the <code>container-instance</code> namespace, and then the
     * container instance ID. For example,
     * <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     * .
     * </p>
     *
     * @param containerInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the container instance. The
     *            ARN contains the <code>arn:aws:ecs</code> namespace, followed
     *            by the Region of the container instance, the AWS account ID of
     *            the container instance owner, the
     *            <code>container-instance</code> namespace, and then the
     *            container instance ID. For example,
     *            <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     *            .
     *            </p>
     */
    public void setContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the Region
     * of the container instance, the AWS account ID of the container instance
     * owner, the <code>container-instance</code> namespace, and then the
     * container instance ID. For example,
     * <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the container instance. The
     *            ARN contains the <code>arn:aws:ecs</code> namespace, followed
     *            by the Region of the container instance, the AWS account ID of
     *            the container instance owner, the
     *            <code>container-instance</code> namespace, and then the
     *            container instance ID. For example,
     *            <code>arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
        return this;
    }

    /**
     * <p>
     * The EC2 instance ID of the container instance.
     * </p>
     *
     * @return <p>
     *         The EC2 instance ID of the container instance.
     *         </p>
     */
    public String getEc2InstanceId() {
        return ec2InstanceId;
    }

    /**
     * <p>
     * The EC2 instance ID of the container instance.
     * </p>
     *
     * @param ec2InstanceId <p>
     *            The EC2 instance ID of the container instance.
     *            </p>
     */
    public void setEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
    }

    /**
     * <p>
     * The EC2 instance ID of the container instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2InstanceId <p>
     *            The EC2 instance ID of the container instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
        return this;
    }

    /**
     * <p>
     * The capacity provider associated with the container instance.
     * </p>
     *
     * @return <p>
     *         The capacity provider associated with the container instance.
     *         </p>
     */
    public String getCapacityProviderName() {
        return capacityProviderName;
    }

    /**
     * <p>
     * The capacity provider associated with the container instance.
     * </p>
     *
     * @param capacityProviderName <p>
     *            The capacity provider associated with the container instance.
     *            </p>
     */
    public void setCapacityProviderName(String capacityProviderName) {
        this.capacityProviderName = capacityProviderName;
    }

    /**
     * <p>
     * The capacity provider associated with the container instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviderName <p>
     *            The capacity provider associated with the container instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withCapacityProviderName(String capacityProviderName) {
        this.capacityProviderName = capacityProviderName;
        return this;
    }

    /**
     * <p>
     * The version counter for the container instance. Every time a container
     * instance experiences a change that triggers a CloudWatch event, the
     * version counter is incremented. If you are replicating your Amazon ECS
     * container instance state with CloudWatch Events, you can compare the
     * version of a container instance reported by the Amazon ECS APIs with the
     * version reported in CloudWatch Events for the container instance (inside
     * the <code>detail</code> object) to verify that the version in your event
     * stream is current.
     * </p>
     *
     * @return <p>
     *         The version counter for the container instance. Every time a
     *         container instance experiences a change that triggers a
     *         CloudWatch event, the version counter is incremented. If you are
     *         replicating your Amazon ECS container instance state with
     *         CloudWatch Events, you can compare the version of a container
     *         instance reported by the Amazon ECS APIs with the version
     *         reported in CloudWatch Events for the container instance (inside
     *         the <code>detail</code> object) to verify that the version in
     *         your event stream is current.
     *         </p>
     */
    public Long getVersion() {
        return version;
    }

    /**
     * <p>
     * The version counter for the container instance. Every time a container
     * instance experiences a change that triggers a CloudWatch event, the
     * version counter is incremented. If you are replicating your Amazon ECS
     * container instance state with CloudWatch Events, you can compare the
     * version of a container instance reported by the Amazon ECS APIs with the
     * version reported in CloudWatch Events for the container instance (inside
     * the <code>detail</code> object) to verify that the version in your event
     * stream is current.
     * </p>
     *
     * @param version <p>
     *            The version counter for the container instance. Every time a
     *            container instance experiences a change that triggers a
     *            CloudWatch event, the version counter is incremented. If you
     *            are replicating your Amazon ECS container instance state with
     *            CloudWatch Events, you can compare the version of a container
     *            instance reported by the Amazon ECS APIs with the version
     *            reported in CloudWatch Events for the container instance
     *            (inside the <code>detail</code> object) to verify that the
     *            version in your event stream is current.
     *            </p>
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version counter for the container instance. Every time a container
     * instance experiences a change that triggers a CloudWatch event, the
     * version counter is incremented. If you are replicating your Amazon ECS
     * container instance state with CloudWatch Events, you can compare the
     * version of a container instance reported by the Amazon ECS APIs with the
     * version reported in CloudWatch Events for the container instance (inside
     * the <code>detail</code> object) to verify that the version in your event
     * stream is current.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version counter for the container instance. Every time a
     *            container instance experiences a change that triggers a
     *            CloudWatch event, the version counter is incremented. If you
     *            are replicating your Amazon ECS container instance state with
     *            CloudWatch Events, you can compare the version of a container
     *            instance reported by the Amazon ECS APIs with the version
     *            reported in CloudWatch Events for the container instance
     *            (inside the <code>detail</code> object) to verify that the
     *            version in your event stream is current.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The version information for the Amazon ECS container agent and Docker
     * daemon running on the container instance.
     * </p>
     *
     * @return <p>
     *         The version information for the Amazon ECS container agent and
     *         Docker daemon running on the container instance.
     *         </p>
     */
    public VersionInfo getVersionInfo() {
        return versionInfo;
    }

    /**
     * <p>
     * The version information for the Amazon ECS container agent and Docker
     * daemon running on the container instance.
     * </p>
     *
     * @param versionInfo <p>
     *            The version information for the Amazon ECS container agent and
     *            Docker daemon running on the container instance.
     *            </p>
     */
    public void setVersionInfo(VersionInfo versionInfo) {
        this.versionInfo = versionInfo;
    }

    /**
     * <p>
     * The version information for the Amazon ECS container agent and Docker
     * daemon running on the container instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionInfo <p>
     *            The version information for the Amazon ECS container agent and
     *            Docker daemon running on the container instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withVersionInfo(VersionInfo versionInfo) {
        this.versionInfo = versionInfo;
        return this;
    }

    /**
     * <p>
     * For CPU and memory resource types, this parameter describes the remaining
     * CPU and memory that has not already been allocated to tasks and is
     * therefore available for new tasks. For port resource types, this
     * parameter describes the ports that were reserved by the Amazon ECS
     * container agent (at instance registration time) and any task containers
     * that have reserved port mappings on the host (with the <code>host</code>
     * or <code>bridge</code> network mode). Any port that is not specified here
     * is available for new tasks.
     * </p>
     *
     * @return <p>
     *         For CPU and memory resource types, this parameter describes the
     *         remaining CPU and memory that has not already been allocated to
     *         tasks and is therefore available for new tasks. For port resource
     *         types, this parameter describes the ports that were reserved by
     *         the Amazon ECS container agent (at instance registration time)
     *         and any task containers that have reserved port mappings on the
     *         host (with the <code>host</code> or <code>bridge</code> network
     *         mode). Any port that is not specified here is available for new
     *         tasks.
     *         </p>
     */
    public java.util.List<Resource> getRemainingResources() {
        return remainingResources;
    }

    /**
     * <p>
     * For CPU and memory resource types, this parameter describes the remaining
     * CPU and memory that has not already been allocated to tasks and is
     * therefore available for new tasks. For port resource types, this
     * parameter describes the ports that were reserved by the Amazon ECS
     * container agent (at instance registration time) and any task containers
     * that have reserved port mappings on the host (with the <code>host</code>
     * or <code>bridge</code> network mode). Any port that is not specified here
     * is available for new tasks.
     * </p>
     *
     * @param remainingResources <p>
     *            For CPU and memory resource types, this parameter describes
     *            the remaining CPU and memory that has not already been
     *            allocated to tasks and is therefore available for new tasks.
     *            For port resource types, this parameter describes the ports
     *            that were reserved by the Amazon ECS container agent (at
     *            instance registration time) and any task containers that have
     *            reserved port mappings on the host (with the <code>host</code>
     *            or <code>bridge</code> network mode). Any port that is not
     *            specified here is available for new tasks.
     *            </p>
     */
    public void setRemainingResources(java.util.Collection<Resource> remainingResources) {
        if (remainingResources == null) {
            this.remainingResources = null;
            return;
        }

        this.remainingResources = new java.util.ArrayList<Resource>(remainingResources);
    }

    /**
     * <p>
     * For CPU and memory resource types, this parameter describes the remaining
     * CPU and memory that has not already been allocated to tasks and is
     * therefore available for new tasks. For port resource types, this
     * parameter describes the ports that were reserved by the Amazon ECS
     * container agent (at instance registration time) and any task containers
     * that have reserved port mappings on the host (with the <code>host</code>
     * or <code>bridge</code> network mode). Any port that is not specified here
     * is available for new tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param remainingResources <p>
     *            For CPU and memory resource types, this parameter describes
     *            the remaining CPU and memory that has not already been
     *            allocated to tasks and is therefore available for new tasks.
     *            For port resource types, this parameter describes the ports
     *            that were reserved by the Amazon ECS container agent (at
     *            instance registration time) and any task containers that have
     *            reserved port mappings on the host (with the <code>host</code>
     *            or <code>bridge</code> network mode). Any port that is not
     *            specified here is available for new tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withRemainingResources(Resource... remainingResources) {
        if (getRemainingResources() == null) {
            this.remainingResources = new java.util.ArrayList<Resource>(remainingResources.length);
        }
        for (Resource value : remainingResources) {
            this.remainingResources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * For CPU and memory resource types, this parameter describes the remaining
     * CPU and memory that has not already been allocated to tasks and is
     * therefore available for new tasks. For port resource types, this
     * parameter describes the ports that were reserved by the Amazon ECS
     * container agent (at instance registration time) and any task containers
     * that have reserved port mappings on the host (with the <code>host</code>
     * or <code>bridge</code> network mode). Any port that is not specified here
     * is available for new tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param remainingResources <p>
     *            For CPU and memory resource types, this parameter describes
     *            the remaining CPU and memory that has not already been
     *            allocated to tasks and is therefore available for new tasks.
     *            For port resource types, this parameter describes the ports
     *            that were reserved by the Amazon ECS container agent (at
     *            instance registration time) and any task containers that have
     *            reserved port mappings on the host (with the <code>host</code>
     *            or <code>bridge</code> network mode). Any port that is not
     *            specified here is available for new tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withRemainingResources(
            java.util.Collection<Resource> remainingResources) {
        setRemainingResources(remainingResources);
        return this;
    }

    /**
     * <p>
     * For CPU and memory resource types, this parameter describes the amount of
     * each resource that was available on the container instance when the
     * container agent registered it with Amazon ECS. This value represents the
     * total amount of CPU and memory that can be allocated on this container
     * instance to tasks. For port resource types, this parameter describes the
     * ports that were reserved by the Amazon ECS container agent when it
     * registered the container instance with Amazon ECS.
     * </p>
     *
     * @return <p>
     *         For CPU and memory resource types, this parameter describes the
     *         amount of each resource that was available on the container
     *         instance when the container agent registered it with Amazon ECS.
     *         This value represents the total amount of CPU and memory that can
     *         be allocated on this container instance to tasks. For port
     *         resource types, this parameter describes the ports that were
     *         reserved by the Amazon ECS container agent when it registered the
     *         container instance with Amazon ECS.
     *         </p>
     */
    public java.util.List<Resource> getRegisteredResources() {
        return registeredResources;
    }

    /**
     * <p>
     * For CPU and memory resource types, this parameter describes the amount of
     * each resource that was available on the container instance when the
     * container agent registered it with Amazon ECS. This value represents the
     * total amount of CPU and memory that can be allocated on this container
     * instance to tasks. For port resource types, this parameter describes the
     * ports that were reserved by the Amazon ECS container agent when it
     * registered the container instance with Amazon ECS.
     * </p>
     *
     * @param registeredResources <p>
     *            For CPU and memory resource types, this parameter describes
     *            the amount of each resource that was available on the
     *            container instance when the container agent registered it with
     *            Amazon ECS. This value represents the total amount of CPU and
     *            memory that can be allocated on this container instance to
     *            tasks. For port resource types, this parameter describes the
     *            ports that were reserved by the Amazon ECS container agent
     *            when it registered the container instance with Amazon ECS.
     *            </p>
     */
    public void setRegisteredResources(java.util.Collection<Resource> registeredResources) {
        if (registeredResources == null) {
            this.registeredResources = null;
            return;
        }

        this.registeredResources = new java.util.ArrayList<Resource>(registeredResources);
    }

    /**
     * <p>
     * For CPU and memory resource types, this parameter describes the amount of
     * each resource that was available on the container instance when the
     * container agent registered it with Amazon ECS. This value represents the
     * total amount of CPU and memory that can be allocated on this container
     * instance to tasks. For port resource types, this parameter describes the
     * ports that were reserved by the Amazon ECS container agent when it
     * registered the container instance with Amazon ECS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registeredResources <p>
     *            For CPU and memory resource types, this parameter describes
     *            the amount of each resource that was available on the
     *            container instance when the container agent registered it with
     *            Amazon ECS. This value represents the total amount of CPU and
     *            memory that can be allocated on this container instance to
     *            tasks. For port resource types, this parameter describes the
     *            ports that were reserved by the Amazon ECS container agent
     *            when it registered the container instance with Amazon ECS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withRegisteredResources(Resource... registeredResources) {
        if (getRegisteredResources() == null) {
            this.registeredResources = new java.util.ArrayList<Resource>(registeredResources.length);
        }
        for (Resource value : registeredResources) {
            this.registeredResources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * For CPU and memory resource types, this parameter describes the amount of
     * each resource that was available on the container instance when the
     * container agent registered it with Amazon ECS. This value represents the
     * total amount of CPU and memory that can be allocated on this container
     * instance to tasks. For port resource types, this parameter describes the
     * ports that were reserved by the Amazon ECS container agent when it
     * registered the container instance with Amazon ECS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registeredResources <p>
     *            For CPU and memory resource types, this parameter describes
     *            the amount of each resource that was available on the
     *            container instance when the container agent registered it with
     *            Amazon ECS. This value represents the total amount of CPU and
     *            memory that can be allocated on this container instance to
     *            tasks. For port resource types, this parameter describes the
     *            ports that were reserved by the Amazon ECS container agent
     *            when it registered the container instance with Amazon ECS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withRegisteredResources(
            java.util.Collection<Resource> registeredResources) {
        setRegisteredResources(registeredResources);
        return this;
    }

    /**
     * <p>
     * The status of the container instance. The valid values are
     * <code>REGISTERING</code>, <code>REGISTRATION_FAILED</code>,
     * <code>ACTIVE</code>, <code>INACTIVE</code>, <code>DEREGISTERING</code>,
     * or <code>DRAINING</code>.
     * </p>
     * <p>
     * If your account has opted in to the <code>awsvpcTrunking</code> account
     * setting, then any newly registered container instance will transition to
     * a <code>REGISTERING</code> status while the trunk elastic network
     * interface is provisioned for the instance. If the registration fails, the
     * instance will transition to a <code>REGISTRATION_FAILED</code> status.
     * You can describe the container instance and see the reason for failure in
     * the <code>statusReason</code> parameter. Once the container instance is
     * terminated, the instance transitions to a <code>DEREGISTERING</code>
     * status while the trunk elastic network interface is deprovisioned. The
     * instance then transitions to an <code>INACTIVE</code> status.
     * </p>
     * <p>
     * The <code>ACTIVE</code> status indicates that the container instance can
     * accept tasks. The <code>DRAINING</code> indicates that new tasks are not
     * placed on the container instance and any service tasks running on the
     * container instance are removed if possible. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-draining.html"
     * >Container Instance Draining</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The status of the container instance. The valid values are
     *         <code>REGISTERING</code>, <code>REGISTRATION_FAILED</code>,
     *         <code>ACTIVE</code>, <code>INACTIVE</code>,
     *         <code>DEREGISTERING</code>, or <code>DRAINING</code>.
     *         </p>
     *         <p>
     *         If your account has opted in to the <code>awsvpcTrunking</code>
     *         account setting, then any newly registered container instance
     *         will transition to a <code>REGISTERING</code> status while the
     *         trunk elastic network interface is provisioned for the instance.
     *         If the registration fails, the instance will transition to a
     *         <code>REGISTRATION_FAILED</code> status. You can describe the
     *         container instance and see the reason for failure in the
     *         <code>statusReason</code> parameter. Once the container instance
     *         is terminated, the instance transitions to a
     *         <code>DEREGISTERING</code> status while the trunk elastic network
     *         interface is deprovisioned. The instance then transitions to an
     *         <code>INACTIVE</code> status.
     *         </p>
     *         <p>
     *         The <code>ACTIVE</code> status indicates that the container
     *         instance can accept tasks. The <code>DRAINING</code> indicates
     *         that new tasks are not placed on the container instance and any
     *         service tasks running on the container instance are removed if
     *         possible. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-draining.html"
     *         >Container Instance Draining</a> in the <i>Amazon Elastic
     *         Container Service Developer Guide</i>.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the container instance. The valid values are
     * <code>REGISTERING</code>, <code>REGISTRATION_FAILED</code>,
     * <code>ACTIVE</code>, <code>INACTIVE</code>, <code>DEREGISTERING</code>,
     * or <code>DRAINING</code>.
     * </p>
     * <p>
     * If your account has opted in to the <code>awsvpcTrunking</code> account
     * setting, then any newly registered container instance will transition to
     * a <code>REGISTERING</code> status while the trunk elastic network
     * interface is provisioned for the instance. If the registration fails, the
     * instance will transition to a <code>REGISTRATION_FAILED</code> status.
     * You can describe the container instance and see the reason for failure in
     * the <code>statusReason</code> parameter. Once the container instance is
     * terminated, the instance transitions to a <code>DEREGISTERING</code>
     * status while the trunk elastic network interface is deprovisioned. The
     * instance then transitions to an <code>INACTIVE</code> status.
     * </p>
     * <p>
     * The <code>ACTIVE</code> status indicates that the container instance can
     * accept tasks. The <code>DRAINING</code> indicates that new tasks are not
     * placed on the container instance and any service tasks running on the
     * container instance are removed if possible. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-draining.html"
     * >Container Instance Draining</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @param status <p>
     *            The status of the container instance. The valid values are
     *            <code>REGISTERING</code>, <code>REGISTRATION_FAILED</code>,
     *            <code>ACTIVE</code>, <code>INACTIVE</code>,
     *            <code>DEREGISTERING</code>, or <code>DRAINING</code>.
     *            </p>
     *            <p>
     *            If your account has opted in to the
     *            <code>awsvpcTrunking</code> account setting, then any newly
     *            registered container instance will transition to a
     *            <code>REGISTERING</code> status while the trunk elastic
     *            network interface is provisioned for the instance. If the
     *            registration fails, the instance will transition to a
     *            <code>REGISTRATION_FAILED</code> status. You can describe the
     *            container instance and see the reason for failure in the
     *            <code>statusReason</code> parameter. Once the container
     *            instance is terminated, the instance transitions to a
     *            <code>DEREGISTERING</code> status while the trunk elastic
     *            network interface is deprovisioned. The instance then
     *            transitions to an <code>INACTIVE</code> status.
     *            </p>
     *            <p>
     *            The <code>ACTIVE</code> status indicates that the container
     *            instance can accept tasks. The <code>DRAINING</code> indicates
     *            that new tasks are not placed on the container instance and
     *            any service tasks running on the container instance are
     *            removed if possible. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-draining.html"
     *            >Container Instance Draining</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the container instance. The valid values are
     * <code>REGISTERING</code>, <code>REGISTRATION_FAILED</code>,
     * <code>ACTIVE</code>, <code>INACTIVE</code>, <code>DEREGISTERING</code>,
     * or <code>DRAINING</code>.
     * </p>
     * <p>
     * If your account has opted in to the <code>awsvpcTrunking</code> account
     * setting, then any newly registered container instance will transition to
     * a <code>REGISTERING</code> status while the trunk elastic network
     * interface is provisioned for the instance. If the registration fails, the
     * instance will transition to a <code>REGISTRATION_FAILED</code> status.
     * You can describe the container instance and see the reason for failure in
     * the <code>statusReason</code> parameter. Once the container instance is
     * terminated, the instance transitions to a <code>DEREGISTERING</code>
     * status while the trunk elastic network interface is deprovisioned. The
     * instance then transitions to an <code>INACTIVE</code> status.
     * </p>
     * <p>
     * The <code>ACTIVE</code> status indicates that the container instance can
     * accept tasks. The <code>DRAINING</code> indicates that new tasks are not
     * placed on the container instance and any service tasks running on the
     * container instance are removed if possible. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-draining.html"
     * >Container Instance Draining</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the container instance. The valid values are
     *            <code>REGISTERING</code>, <code>REGISTRATION_FAILED</code>,
     *            <code>ACTIVE</code>, <code>INACTIVE</code>,
     *            <code>DEREGISTERING</code>, or <code>DRAINING</code>.
     *            </p>
     *            <p>
     *            If your account has opted in to the
     *            <code>awsvpcTrunking</code> account setting, then any newly
     *            registered container instance will transition to a
     *            <code>REGISTERING</code> status while the trunk elastic
     *            network interface is provisioned for the instance. If the
     *            registration fails, the instance will transition to a
     *            <code>REGISTRATION_FAILED</code> status. You can describe the
     *            container instance and see the reason for failure in the
     *            <code>statusReason</code> parameter. Once the container
     *            instance is terminated, the instance transitions to a
     *            <code>DEREGISTERING</code> status while the trunk elastic
     *            network interface is deprovisioned. The instance then
     *            transitions to an <code>INACTIVE</code> status.
     *            </p>
     *            <p>
     *            The <code>ACTIVE</code> status indicates that the container
     *            instance can accept tasks. The <code>DRAINING</code> indicates
     *            that new tasks are not placed on the container instance and
     *            any service tasks running on the container instance are
     *            removed if possible. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/container-instance-draining.html"
     *            >Container Instance Draining</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The reason that the container instance reached its current status.
     * </p>
     *
     * @return <p>
     *         The reason that the container instance reached its current
     *         status.
     *         </p>
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * <p>
     * The reason that the container instance reached its current status.
     * </p>
     *
     * @param statusReason <p>
     *            The reason that the container instance reached its current
     *            status.
     *            </p>
     */
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason that the container instance reached its current status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusReason <p>
     *            The reason that the container instance reached its current
     *            status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * <p>
     * This parameter returns <code>true</code> if the agent is connected to
     * Amazon ECS. Registered instances with an agent that may be unhealthy or
     * stopped return <code>false</code>. Only instances connected to an agent
     * can accept placement requests.
     * </p>
     *
     * @return <p>
     *         This parameter returns <code>true</code> if the agent is
     *         connected to Amazon ECS. Registered instances with an agent that
     *         may be unhealthy or stopped return <code>false</code>. Only
     *         instances connected to an agent can accept placement requests.
     *         </p>
     */
    public Boolean isAgentConnected() {
        return agentConnected;
    }

    /**
     * <p>
     * This parameter returns <code>true</code> if the agent is connected to
     * Amazon ECS. Registered instances with an agent that may be unhealthy or
     * stopped return <code>false</code>. Only instances connected to an agent
     * can accept placement requests.
     * </p>
     *
     * @return <p>
     *         This parameter returns <code>true</code> if the agent is
     *         connected to Amazon ECS. Registered instances with an agent that
     *         may be unhealthy or stopped return <code>false</code>. Only
     *         instances connected to an agent can accept placement requests.
     *         </p>
     */
    public Boolean getAgentConnected() {
        return agentConnected;
    }

    /**
     * <p>
     * This parameter returns <code>true</code> if the agent is connected to
     * Amazon ECS. Registered instances with an agent that may be unhealthy or
     * stopped return <code>false</code>. Only instances connected to an agent
     * can accept placement requests.
     * </p>
     *
     * @param agentConnected <p>
     *            This parameter returns <code>true</code> if the agent is
     *            connected to Amazon ECS. Registered instances with an agent
     *            that may be unhealthy or stopped return <code>false</code>.
     *            Only instances connected to an agent can accept placement
     *            requests.
     *            </p>
     */
    public void setAgentConnected(Boolean agentConnected) {
        this.agentConnected = agentConnected;
    }

    /**
     * <p>
     * This parameter returns <code>true</code> if the agent is connected to
     * Amazon ECS. Registered instances with an agent that may be unhealthy or
     * stopped return <code>false</code>. Only instances connected to an agent
     * can accept placement requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param agentConnected <p>
     *            This parameter returns <code>true</code> if the agent is
     *            connected to Amazon ECS. Registered instances with an agent
     *            that may be unhealthy or stopped return <code>false</code>.
     *            Only instances connected to an agent can accept placement
     *            requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withAgentConnected(Boolean agentConnected) {
        this.agentConnected = agentConnected;
        return this;
    }

    /**
     * <p>
     * The number of tasks on the container instance that are in the
     * <code>RUNNING</code> status.
     * </p>
     *
     * @return <p>
     *         The number of tasks on the container instance that are in the
     *         <code>RUNNING</code> status.
     *         </p>
     */
    public Integer getRunningTasksCount() {
        return runningTasksCount;
    }

    /**
     * <p>
     * The number of tasks on the container instance that are in the
     * <code>RUNNING</code> status.
     * </p>
     *
     * @param runningTasksCount <p>
     *            The number of tasks on the container instance that are in the
     *            <code>RUNNING</code> status.
     *            </p>
     */
    public void setRunningTasksCount(Integer runningTasksCount) {
        this.runningTasksCount = runningTasksCount;
    }

    /**
     * <p>
     * The number of tasks on the container instance that are in the
     * <code>RUNNING</code> status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runningTasksCount <p>
     *            The number of tasks on the container instance that are in the
     *            <code>RUNNING</code> status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withRunningTasksCount(Integer runningTasksCount) {
        this.runningTasksCount = runningTasksCount;
        return this;
    }

    /**
     * <p>
     * The number of tasks on the container instance that are in the
     * <code>PENDING</code> status.
     * </p>
     *
     * @return <p>
     *         The number of tasks on the container instance that are in the
     *         <code>PENDING</code> status.
     *         </p>
     */
    public Integer getPendingTasksCount() {
        return pendingTasksCount;
    }

    /**
     * <p>
     * The number of tasks on the container instance that are in the
     * <code>PENDING</code> status.
     * </p>
     *
     * @param pendingTasksCount <p>
     *            The number of tasks on the container instance that are in the
     *            <code>PENDING</code> status.
     *            </p>
     */
    public void setPendingTasksCount(Integer pendingTasksCount) {
        this.pendingTasksCount = pendingTasksCount;
    }

    /**
     * <p>
     * The number of tasks on the container instance that are in the
     * <code>PENDING</code> status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingTasksCount <p>
     *            The number of tasks on the container instance that are in the
     *            <code>PENDING</code> status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withPendingTasksCount(Integer pendingTasksCount) {
        this.pendingTasksCount = pendingTasksCount;
        return this;
    }

    /**
     * <p>
     * The status of the most recent agent update. If an update has never been
     * requested, this value is <code>NULL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, STAGING, STAGED, UPDATING, UPDATED,
     * FAILED
     *
     * @return <p>
     *         The status of the most recent agent update. If an update has
     *         never been requested, this value is <code>NULL</code>.
     *         </p>
     * @see AgentUpdateStatus
     */
    public String getAgentUpdateStatus() {
        return agentUpdateStatus;
    }

    /**
     * <p>
     * The status of the most recent agent update. If an update has never been
     * requested, this value is <code>NULL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, STAGING, STAGED, UPDATING, UPDATED,
     * FAILED
     *
     * @param agentUpdateStatus <p>
     *            The status of the most recent agent update. If an update has
     *            never been requested, this value is <code>NULL</code>.
     *            </p>
     * @see AgentUpdateStatus
     */
    public void setAgentUpdateStatus(String agentUpdateStatus) {
        this.agentUpdateStatus = agentUpdateStatus;
    }

    /**
     * <p>
     * The status of the most recent agent update. If an update has never been
     * requested, this value is <code>NULL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, STAGING, STAGED, UPDATING, UPDATED,
     * FAILED
     *
     * @param agentUpdateStatus <p>
     *            The status of the most recent agent update. If an update has
     *            never been requested, this value is <code>NULL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AgentUpdateStatus
     */
    public ContainerInstance withAgentUpdateStatus(String agentUpdateStatus) {
        this.agentUpdateStatus = agentUpdateStatus;
        return this;
    }

    /**
     * <p>
     * The status of the most recent agent update. If an update has never been
     * requested, this value is <code>NULL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, STAGING, STAGED, UPDATING, UPDATED,
     * FAILED
     *
     * @param agentUpdateStatus <p>
     *            The status of the most recent agent update. If an update has
     *            never been requested, this value is <code>NULL</code>.
     *            </p>
     * @see AgentUpdateStatus
     */
    public void setAgentUpdateStatus(AgentUpdateStatus agentUpdateStatus) {
        this.agentUpdateStatus = agentUpdateStatus.toString();
    }

    /**
     * <p>
     * The status of the most recent agent update. If an update has never been
     * requested, this value is <code>NULL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, STAGING, STAGED, UPDATING, UPDATED,
     * FAILED
     *
     * @param agentUpdateStatus <p>
     *            The status of the most recent agent update. If an update has
     *            never been requested, this value is <code>NULL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AgentUpdateStatus
     */
    public ContainerInstance withAgentUpdateStatus(AgentUpdateStatus agentUpdateStatus) {
        this.agentUpdateStatus = agentUpdateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The attributes set for the container instance, either by the Amazon ECS
     * container agent at instance registration or manually with the
     * <a>PutAttributes</a> operation.
     * </p>
     *
     * @return <p>
     *         The attributes set for the container instance, either by the
     *         Amazon ECS container agent at instance registration or manually
     *         with the <a>PutAttributes</a> operation.
     *         </p>
     */
    public java.util.List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attributes set for the container instance, either by the Amazon ECS
     * container agent at instance registration or manually with the
     * <a>PutAttributes</a> operation.
     * </p>
     *
     * @param attributes <p>
     *            The attributes set for the container instance, either by the
     *            Amazon ECS container agent at instance registration or
     *            manually with the <a>PutAttributes</a> operation.
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
     * The attributes set for the container instance, either by the Amazon ECS
     * container agent at instance registration or manually with the
     * <a>PutAttributes</a> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The attributes set for the container instance, either by the
     *            Amazon ECS container agent at instance registration or
     *            manually with the <a>PutAttributes</a> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withAttributes(Attribute... attributes) {
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
     * The attributes set for the container instance, either by the Amazon ECS
     * container agent at instance registration or manually with the
     * <a>PutAttributes</a> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The attributes set for the container instance, either by the
     *            Amazon ECS container agent at instance registration or
     *            manually with the <a>PutAttributes</a> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withAttributes(java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the container instance was registered.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for when the container instance was
     *         registered.
     *         </p>
     */
    public java.util.Date getRegisteredAt() {
        return registeredAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the container instance was registered.
     * </p>
     *
     * @param registeredAt <p>
     *            The Unix timestamp for when the container instance was
     *            registered.
     *            </p>
     */
    public void setRegisteredAt(java.util.Date registeredAt) {
        this.registeredAt = registeredAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the container instance was registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registeredAt <p>
     *            The Unix timestamp for when the container instance was
     *            registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withRegisteredAt(java.util.Date registeredAt) {
        this.registeredAt = registeredAt;
        return this;
    }

    /**
     * <p>
     * The resources attached to a container instance, such as elastic network
     * interfaces.
     * </p>
     *
     * @return <p>
     *         The resources attached to a container instance, such as elastic
     *         network interfaces.
     *         </p>
     */
    public java.util.List<Attachment> getAttachments() {
        return attachments;
    }

    /**
     * <p>
     * The resources attached to a container instance, such as elastic network
     * interfaces.
     * </p>
     *
     * @param attachments <p>
     *            The resources attached to a container instance, such as
     *            elastic network interfaces.
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
     * The resources attached to a container instance, such as elastic network
     * interfaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            The resources attached to a container instance, such as
     *            elastic network interfaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withAttachments(Attachment... attachments) {
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
     * The resources attached to a container instance, such as elastic network
     * interfaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachments <p>
     *            The resources attached to a container instance, such as
     *            elastic network interfaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerInstance withAttachments(java.util.Collection<Attachment> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the container instance to help you
     * categorize and organize them. Each tag consists of a key and an optional
     * value, both of which you define.
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
     *         The metadata that you apply to the container instance to help you
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
     * The metadata that you apply to the container instance to help you
     * categorize and organize them. Each tag consists of a key and an optional
     * value, both of which you define.
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
     *            The metadata that you apply to the container instance to help
     *            you categorize and organize them. Each tag consists of a key
     *            and an optional value, both of which you define.
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
     * The metadata that you apply to the container instance to help you
     * categorize and organize them. Each tag consists of a key and an optional
     * value, both of which you define.
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
     *            The metadata that you apply to the container instance to help
     *            you categorize and organize them. Each tag consists of a key
     *            and an optional value, both of which you define.
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
    public ContainerInstance withTags(Tag... tags) {
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
     * The metadata that you apply to the container instance to help you
     * categorize and organize them. Each tag consists of a key and an optional
     * value, both of which you define.
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
     *            The metadata that you apply to the container instance to help
     *            you categorize and organize them. Each tag consists of a key
     *            and an optional value, both of which you define.
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
    public ContainerInstance withTags(java.util.Collection<Tag> tags) {
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
        if (getContainerInstanceArn() != null)
            sb.append("containerInstanceArn: " + getContainerInstanceArn() + ",");
        if (getEc2InstanceId() != null)
            sb.append("ec2InstanceId: " + getEc2InstanceId() + ",");
        if (getCapacityProviderName() != null)
            sb.append("capacityProviderName: " + getCapacityProviderName() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getVersionInfo() != null)
            sb.append("versionInfo: " + getVersionInfo() + ",");
        if (getRemainingResources() != null)
            sb.append("remainingResources: " + getRemainingResources() + ",");
        if (getRegisteredResources() != null)
            sb.append("registeredResources: " + getRegisteredResources() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getStatusReason() != null)
            sb.append("statusReason: " + getStatusReason() + ",");
        if (getAgentConnected() != null)
            sb.append("agentConnected: " + getAgentConnected() + ",");
        if (getRunningTasksCount() != null)
            sb.append("runningTasksCount: " + getRunningTasksCount() + ",");
        if (getPendingTasksCount() != null)
            sb.append("pendingTasksCount: " + getPendingTasksCount() + ",");
        if (getAgentUpdateStatus() != null)
            sb.append("agentUpdateStatus: " + getAgentUpdateStatus() + ",");
        if (getAttributes() != null)
            sb.append("attributes: " + getAttributes() + ",");
        if (getRegisteredAt() != null)
            sb.append("registeredAt: " + getRegisteredAt() + ",");
        if (getAttachments() != null)
            sb.append("attachments: " + getAttachments() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContainerInstanceArn() == null) ? 0 : getContainerInstanceArn().hashCode());
        hashCode = prime * hashCode
                + ((getEc2InstanceId() == null) ? 0 : getEc2InstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getCapacityProviderName() == null) ? 0 : getCapacityProviderName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getVersionInfo() == null) ? 0 : getVersionInfo().hashCode());
        hashCode = prime * hashCode
                + ((getRemainingResources() == null) ? 0 : getRemainingResources().hashCode());
        hashCode = prime * hashCode
                + ((getRegisteredResources() == null) ? 0 : getRegisteredResources().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode
                + ((getAgentConnected() == null) ? 0 : getAgentConnected().hashCode());
        hashCode = prime * hashCode
                + ((getRunningTasksCount() == null) ? 0 : getRunningTasksCount().hashCode());
        hashCode = prime * hashCode
                + ((getPendingTasksCount() == null) ? 0 : getPendingTasksCount().hashCode());
        hashCode = prime * hashCode
                + ((getAgentUpdateStatus() == null) ? 0 : getAgentUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getRegisteredAt() == null) ? 0 : getRegisteredAt().hashCode());
        hashCode = prime * hashCode
                + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerInstance == false)
            return false;
        ContainerInstance other = (ContainerInstance) obj;

        if (other.getContainerInstanceArn() == null ^ this.getContainerInstanceArn() == null)
            return false;
        if (other.getContainerInstanceArn() != null
                && other.getContainerInstanceArn().equals(this.getContainerInstanceArn()) == false)
            return false;
        if (other.getEc2InstanceId() == null ^ this.getEc2InstanceId() == null)
            return false;
        if (other.getEc2InstanceId() != null
                && other.getEc2InstanceId().equals(this.getEc2InstanceId()) == false)
            return false;
        if (other.getCapacityProviderName() == null ^ this.getCapacityProviderName() == null)
            return false;
        if (other.getCapacityProviderName() != null
                && other.getCapacityProviderName().equals(this.getCapacityProviderName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getVersionInfo() == null ^ this.getVersionInfo() == null)
            return false;
        if (other.getVersionInfo() != null
                && other.getVersionInfo().equals(this.getVersionInfo()) == false)
            return false;
        if (other.getRemainingResources() == null ^ this.getRemainingResources() == null)
            return false;
        if (other.getRemainingResources() != null
                && other.getRemainingResources().equals(this.getRemainingResources()) == false)
            return false;
        if (other.getRegisteredResources() == null ^ this.getRegisteredResources() == null)
            return false;
        if (other.getRegisteredResources() != null
                && other.getRegisteredResources().equals(this.getRegisteredResources()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null
                && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getAgentConnected() == null ^ this.getAgentConnected() == null)
            return false;
        if (other.getAgentConnected() != null
                && other.getAgentConnected().equals(this.getAgentConnected()) == false)
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
        if (other.getAgentUpdateStatus() == null ^ this.getAgentUpdateStatus() == null)
            return false;
        if (other.getAgentUpdateStatus() != null
                && other.getAgentUpdateStatus().equals(this.getAgentUpdateStatus()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getRegisteredAt() == null ^ this.getRegisteredAt() == null)
            return false;
        if (other.getRegisteredAt() != null
                && other.getRegisteredAt().equals(this.getRegisteredAt()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null
                && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
