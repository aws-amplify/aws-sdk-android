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
 * Modifies the status of an Amazon ECS container instance.
 * </p>
 * <p>
 * Once a container instance has reached an <code>ACTIVE</code> state, you can
 * change the status of a container instance to <code>DRAINING</code> to
 * manually remove an instance from a cluster, for example to perform system
 * updates, update the Docker daemon, or scale down the cluster size.
 * </p>
 * <important>
 * <p>
 * A container instance cannot be changed to <code>DRAINING</code> until it has
 * reached an <code>ACTIVE</code> status. If the instance is in any other
 * status, an error will be received.
 * </p>
 * </important>
 * <p>
 * When you set a container instance to <code>DRAINING</code>, Amazon ECS
 * prevents new tasks from being scheduled for placement on the container
 * instance and replacement service tasks are started on other container
 * instances in the cluster if the resources are available. Service tasks on the
 * container instance that are in the <code>PENDING</code> state are stopped
 * immediately.
 * </p>
 * <p>
 * Service tasks on the container instance that are in the <code>RUNNING</code>
 * state are stopped and replaced according to the service's deployment
 * configuration parameters, <code>minimumHealthyPercent</code> and
 * <code>maximumPercent</code>. You can change the deployment configuration of
 * your service using <a>UpdateService</a>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * If <code>minimumHealthyPercent</code> is below 100%, the scheduler can ignore
 * <code>desiredCount</code> temporarily during task replacement. For example,
 * <code>desiredCount</code> is four tasks, a minimum of 50% allows the
 * scheduler to stop two existing tasks before starting two new tasks. If the
 * minimum is 100%, the service scheduler can't remove existing tasks until the
 * replacement tasks are considered healthy. Tasks for services that do not use
 * a load balancer are considered healthy if they are in the
 * <code>RUNNING</code> state. Tasks for services that use a load balancer are
 * considered healthy if they are in the <code>RUNNING</code> state and the
 * container instance they are hosted on is reported as healthy by the load
 * balancer.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>maximumPercent</code> parameter represents an upper limit on the
 * number of running tasks during task replacement, which enables you to define
 * the replacement batch size. For example, if <code>desiredCount</code> is four
 * tasks, a maximum of 200% starts four new tasks before stopping the four tasks
 * to be drained, provided that the cluster resources required to do this are
 * available. If the maximum is 100%, then replacement tasks can't start until
 * the draining tasks have stopped.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Any <code>PENDING</code> or <code>RUNNING</code> tasks that do not belong to
 * a service are not affected. You must wait for them to finish or stop them
 * manually.
 * </p>
 * <p>
 * A container instance has completed draining when it has no more
 * <code>RUNNING</code> tasks. You can verify this using <a>ListTasks</a>.
 * </p>
 * <p>
 * When a container instance has been drained, you can set a container instance
 * to <code>ACTIVE</code> status and once it has reached that status the Amazon
 * ECS scheduler can begin scheduling tasks on the instance again.
 * </p>
 */
public class UpdateContainerInstancesStateRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instance to update. If you do not specify a cluster,
     * the default cluster is assumed.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * A list of container instance IDs or full ARN entries.
     * </p>
     */
    private java.util.List<String> containerInstances;

    /**
     * <p>
     * The container instance state with which to update the container instance.
     * The only valid values for this action are <code>ACTIVE</code> and
     * <code>DRAINING</code>. A container instance can only be updated to
     * <code>DRAINING</code> status once it has reached an <code>ACTIVE</code>
     * state. If a container instance is in <code>REGISTERING</code>,
     * <code>DEREGISTERING</code>, or <code>REGISTRATION_FAILED</code> state you
     * can describe the container instance but will be unable to update the
     * container instance state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DRAINING, REGISTERING, DEREGISTERING,
     * REGISTRATION_FAILED
     */
    private String status;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instance to update. If you do not specify a cluster,
     * the default cluster is assumed.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         that hosts the container instance to update. If you do not
     *         specify a cluster, the default cluster is assumed.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instance to update. If you do not specify a cluster,
     * the default cluster is assumed.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the container instance to update. If you do
     *            not specify a cluster, the default cluster is assumed.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the container instance to update. If you do not specify a cluster,
     * the default cluster is assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the container instance to update. If you do
     *            not specify a cluster, the default cluster is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContainerInstancesStateRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * A list of container instance IDs or full ARN entries.
     * </p>
     *
     * @return <p>
     *         A list of container instance IDs or full ARN entries.
     *         </p>
     */
    public java.util.List<String> getContainerInstances() {
        return containerInstances;
    }

    /**
     * <p>
     * A list of container instance IDs or full ARN entries.
     * </p>
     *
     * @param containerInstances <p>
     *            A list of container instance IDs or full ARN entries.
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
     * A list of container instance IDs or full ARN entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerInstances <p>
     *            A list of container instance IDs or full ARN entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContainerInstancesStateRequest withContainerInstances(String... containerInstances) {
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
     * A list of container instance IDs or full ARN entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerInstances <p>
     *            A list of container instance IDs or full ARN entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContainerInstancesStateRequest withContainerInstances(
            java.util.Collection<String> containerInstances) {
        setContainerInstances(containerInstances);
        return this;
    }

    /**
     * <p>
     * The container instance state with which to update the container instance.
     * The only valid values for this action are <code>ACTIVE</code> and
     * <code>DRAINING</code>. A container instance can only be updated to
     * <code>DRAINING</code> status once it has reached an <code>ACTIVE</code>
     * state. If a container instance is in <code>REGISTERING</code>,
     * <code>DEREGISTERING</code>, or <code>REGISTRATION_FAILED</code> state you
     * can describe the container instance but will be unable to update the
     * container instance state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DRAINING, REGISTERING, DEREGISTERING,
     * REGISTRATION_FAILED
     *
     * @return <p>
     *         The container instance state with which to update the container
     *         instance. The only valid values for this action are
     *         <code>ACTIVE</code> and <code>DRAINING</code>. A container
     *         instance can only be updated to <code>DRAINING</code> status once
     *         it has reached an <code>ACTIVE</code> state. If a container
     *         instance is in <code>REGISTERING</code>,
     *         <code>DEREGISTERING</code>, or <code>REGISTRATION_FAILED</code>
     *         state you can describe the container instance but will be unable
     *         to update the container instance state.
     *         </p>
     * @see ContainerInstanceStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The container instance state with which to update the container instance.
     * The only valid values for this action are <code>ACTIVE</code> and
     * <code>DRAINING</code>. A container instance can only be updated to
     * <code>DRAINING</code> status once it has reached an <code>ACTIVE</code>
     * state. If a container instance is in <code>REGISTERING</code>,
     * <code>DEREGISTERING</code>, or <code>REGISTRATION_FAILED</code> state you
     * can describe the container instance but will be unable to update the
     * container instance state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DRAINING, REGISTERING, DEREGISTERING,
     * REGISTRATION_FAILED
     *
     * @param status <p>
     *            The container instance state with which to update the
     *            container instance. The only valid values for this action are
     *            <code>ACTIVE</code> and <code>DRAINING</code>. A container
     *            instance can only be updated to <code>DRAINING</code> status
     *            once it has reached an <code>ACTIVE</code> state. If a
     *            container instance is in <code>REGISTERING</code>,
     *            <code>DEREGISTERING</code>, or
     *            <code>REGISTRATION_FAILED</code> state you can describe the
     *            container instance but will be unable to update the container
     *            instance state.
     *            </p>
     * @see ContainerInstanceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The container instance state with which to update the container instance.
     * The only valid values for this action are <code>ACTIVE</code> and
     * <code>DRAINING</code>. A container instance can only be updated to
     * <code>DRAINING</code> status once it has reached an <code>ACTIVE</code>
     * state. If a container instance is in <code>REGISTERING</code>,
     * <code>DEREGISTERING</code>, or <code>REGISTRATION_FAILED</code> state you
     * can describe the container instance but will be unable to update the
     * container instance state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DRAINING, REGISTERING, DEREGISTERING,
     * REGISTRATION_FAILED
     *
     * @param status <p>
     *            The container instance state with which to update the
     *            container instance. The only valid values for this action are
     *            <code>ACTIVE</code> and <code>DRAINING</code>. A container
     *            instance can only be updated to <code>DRAINING</code> status
     *            once it has reached an <code>ACTIVE</code> state. If a
     *            container instance is in <code>REGISTERING</code>,
     *            <code>DEREGISTERING</code>, or
     *            <code>REGISTRATION_FAILED</code> state you can describe the
     *            container instance but will be unable to update the container
     *            instance state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContainerInstanceStatus
     */
    public UpdateContainerInstancesStateRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The container instance state with which to update the container instance.
     * The only valid values for this action are <code>ACTIVE</code> and
     * <code>DRAINING</code>. A container instance can only be updated to
     * <code>DRAINING</code> status once it has reached an <code>ACTIVE</code>
     * state. If a container instance is in <code>REGISTERING</code>,
     * <code>DEREGISTERING</code>, or <code>REGISTRATION_FAILED</code> state you
     * can describe the container instance but will be unable to update the
     * container instance state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DRAINING, REGISTERING, DEREGISTERING,
     * REGISTRATION_FAILED
     *
     * @param status <p>
     *            The container instance state with which to update the
     *            container instance. The only valid values for this action are
     *            <code>ACTIVE</code> and <code>DRAINING</code>. A container
     *            instance can only be updated to <code>DRAINING</code> status
     *            once it has reached an <code>ACTIVE</code> state. If a
     *            container instance is in <code>REGISTERING</code>,
     *            <code>DEREGISTERING</code>, or
     *            <code>REGISTRATION_FAILED</code> state you can describe the
     *            container instance but will be unable to update the container
     *            instance state.
     *            </p>
     * @see ContainerInstanceStatus
     */
    public void setStatus(ContainerInstanceStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The container instance state with which to update the container instance.
     * The only valid values for this action are <code>ACTIVE</code> and
     * <code>DRAINING</code>. A container instance can only be updated to
     * <code>DRAINING</code> status once it has reached an <code>ACTIVE</code>
     * state. If a container instance is in <code>REGISTERING</code>,
     * <code>DEREGISTERING</code>, or <code>REGISTRATION_FAILED</code> state you
     * can describe the container instance but will be unable to update the
     * container instance state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DRAINING, REGISTERING, DEREGISTERING,
     * REGISTRATION_FAILED
     *
     * @param status <p>
     *            The container instance state with which to update the
     *            container instance. The only valid values for this action are
     *            <code>ACTIVE</code> and <code>DRAINING</code>. A container
     *            instance can only be updated to <code>DRAINING</code> status
     *            once it has reached an <code>ACTIVE</code> state. If a
     *            container instance is in <code>REGISTERING</code>,
     *            <code>DEREGISTERING</code>, or
     *            <code>REGISTRATION_FAILED</code> state you can describe the
     *            container instance but will be unable to update the container
     *            instance state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContainerInstanceStatus
     */
    public UpdateContainerInstancesStateRequest withStatus(ContainerInstanceStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("status: " + getStatus());
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
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContainerInstancesStateRequest == false)
            return false;
        UpdateContainerInstancesStateRequest other = (UpdateContainerInstancesStateRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getContainerInstances() == null ^ this.getContainerInstances() == null)
            return false;
        if (other.getContainerInstances() != null
                && other.getContainerInstances().equals(this.getContainerInstances()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
