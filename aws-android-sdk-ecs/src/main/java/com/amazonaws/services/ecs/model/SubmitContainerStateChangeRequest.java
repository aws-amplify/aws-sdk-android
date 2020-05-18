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
 * <note>
 * <p>
 * This action is only used by the Amazon ECS agent, and it is not intended for
 * use outside of the agent.
 * </p>
 * </note>
 * <p>
 * Sent to acknowledge that a container changed states.
 * </p>
 */
public class SubmitContainerStateChangeRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The short name or full ARN of the cluster that hosts the container.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task that hosts the
     * container.
     * </p>
     */
    private String task;

    /**
     * <p>
     * The name of the container.
     * </p>
     */
    private String containerName;

    /**
     * <p>
     * The ID of the Docker container.
     * </p>
     */
    private String runtimeId;

    /**
     * <p>
     * The status of the state change request.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The exit code returned for the state change request.
     * </p>
     */
    private Integer exitCode;

    /**
     * <p>
     * The reason for the state change request.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The network bindings of the container.
     * </p>
     */
    private java.util.List<NetworkBinding> networkBindings;

    /**
     * <p>
     * The short name or full ARN of the cluster that hosts the container.
     * </p>
     *
     * @return <p>
     *         The short name or full ARN of the cluster that hosts the
     *         container.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full ARN of the cluster that hosts the container.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full ARN of the cluster that hosts the
     *            container.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full ARN of the cluster that hosts the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full ARN of the cluster that hosts the
     *            container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitContainerStateChangeRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task that hosts the
     * container.
     * </p>
     *
     * @return <p>
     *         The task ID or full Amazon Resource Name (ARN) of the task that
     *         hosts the container.
     *         </p>
     */
    public String getTask() {
        return task;
    }

    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task that hosts the
     * container.
     * </p>
     *
     * @param task <p>
     *            The task ID or full Amazon Resource Name (ARN) of the task
     *            that hosts the container.
     *            </p>
     */
    public void setTask(String task) {
        this.task = task;
    }

    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task that hosts the
     * container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param task <p>
     *            The task ID or full Amazon Resource Name (ARN) of the task
     *            that hosts the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitContainerStateChangeRequest withTask(String task) {
        this.task = task;
        return this;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     *
     * @return <p>
     *         The name of the container.
     *         </p>
     */
    public String getContainerName() {
        return containerName;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     *
     * @param containerName <p>
     *            The name of the container.
     *            </p>
     */
    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerName <p>
     *            The name of the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitContainerStateChangeRequest withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * <p>
     * The ID of the Docker container.
     * </p>
     *
     * @return <p>
     *         The ID of the Docker container.
     *         </p>
     */
    public String getRuntimeId() {
        return runtimeId;
    }

    /**
     * <p>
     * The ID of the Docker container.
     * </p>
     *
     * @param runtimeId <p>
     *            The ID of the Docker container.
     *            </p>
     */
    public void setRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
    }

    /**
     * <p>
     * The ID of the Docker container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runtimeId <p>
     *            The ID of the Docker container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitContainerStateChangeRequest withRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }

    /**
     * <p>
     * The status of the state change request.
     * </p>
     *
     * @return <p>
     *         The status of the state change request.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the state change request.
     * </p>
     *
     * @param status <p>
     *            The status of the state change request.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the state change request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the state change request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitContainerStateChangeRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The exit code returned for the state change request.
     * </p>
     *
     * @return <p>
     *         The exit code returned for the state change request.
     *         </p>
     */
    public Integer getExitCode() {
        return exitCode;
    }

    /**
     * <p>
     * The exit code returned for the state change request.
     * </p>
     *
     * @param exitCode <p>
     *            The exit code returned for the state change request.
     *            </p>
     */
    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    /**
     * <p>
     * The exit code returned for the state change request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exitCode <p>
     *            The exit code returned for the state change request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitContainerStateChangeRequest withExitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * <p>
     * The reason for the state change request.
     * </p>
     *
     * @return <p>
     *         The reason for the state change request.
     *         </p>
     */
    public String getReason() {
        return reason;
    }

    /**
     * <p>
     * The reason for the state change request.
     * </p>
     *
     * @param reason <p>
     *            The reason for the state change request.
     *            </p>
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the state change request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reason <p>
     *            The reason for the state change request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitContainerStateChangeRequest withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * <p>
     * The network bindings of the container.
     * </p>
     *
     * @return <p>
     *         The network bindings of the container.
     *         </p>
     */
    public java.util.List<NetworkBinding> getNetworkBindings() {
        return networkBindings;
    }

    /**
     * <p>
     * The network bindings of the container.
     * </p>
     *
     * @param networkBindings <p>
     *            The network bindings of the container.
     *            </p>
     */
    public void setNetworkBindings(java.util.Collection<NetworkBinding> networkBindings) {
        if (networkBindings == null) {
            this.networkBindings = null;
            return;
        }

        this.networkBindings = new java.util.ArrayList<NetworkBinding>(networkBindings);
    }

    /**
     * <p>
     * The network bindings of the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkBindings <p>
     *            The network bindings of the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitContainerStateChangeRequest withNetworkBindings(NetworkBinding... networkBindings) {
        if (getNetworkBindings() == null) {
            this.networkBindings = new java.util.ArrayList<NetworkBinding>(networkBindings.length);
        }
        for (NetworkBinding value : networkBindings) {
            this.networkBindings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The network bindings of the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkBindings <p>
     *            The network bindings of the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitContainerStateChangeRequest withNetworkBindings(
            java.util.Collection<NetworkBinding> networkBindings) {
        setNetworkBindings(networkBindings);
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
        if (getTask() != null)
            sb.append("task: " + getTask() + ",");
        if (getContainerName() != null)
            sb.append("containerName: " + getContainerName() + ",");
        if (getRuntimeId() != null)
            sb.append("runtimeId: " + getRuntimeId() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getExitCode() != null)
            sb.append("exitCode: " + getExitCode() + ",");
        if (getReason() != null)
            sb.append("reason: " + getReason() + ",");
        if (getNetworkBindings() != null)
            sb.append("networkBindings: " + getNetworkBindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getTask() == null) ? 0 : getTask().hashCode());
        hashCode = prime * hashCode
                + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getRuntimeId() == null) ? 0 : getRuntimeId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getExitCode() == null) ? 0 : getExitCode().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkBindings() == null) ? 0 : getNetworkBindings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubmitContainerStateChangeRequest == false)
            return false;
        SubmitContainerStateChangeRequest other = (SubmitContainerStateChangeRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getTask() == null ^ this.getTask() == null)
            return false;
        if (other.getTask() != null && other.getTask().equals(this.getTask()) == false)
            return false;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null
                && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getRuntimeId() == null ^ this.getRuntimeId() == null)
            return false;
        if (other.getRuntimeId() != null
                && other.getRuntimeId().equals(this.getRuntimeId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getExitCode() == null ^ this.getExitCode() == null)
            return false;
        if (other.getExitCode() != null && other.getExitCode().equals(this.getExitCode()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getNetworkBindings() == null ^ this.getNetworkBindings() == null)
            return false;
        if (other.getNetworkBindings() != null
                && other.getNetworkBindings().equals(this.getNetworkBindings()) == false)
            return false;
        return true;
    }
}
