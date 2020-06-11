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
 * An object representing a change in state for a container.
 * </p>
 */
public class ContainerStateChange implements Serializable {
    /**
     * <p>
     * The name of the container.
     * </p>
     */
    private String containerName;

    /**
     * <p>
     * The container image SHA 256 digest.
     * </p>
     */
    private String imageDigest;

    /**
     * <p>
     * The ID of the Docker container.
     * </p>
     */
    private String runtimeId;

    /**
     * <p>
     * The exit code for the container, if the state change is a result of the
     * container exiting.
     * </p>
     */
    private Integer exitCode;

    /**
     * <p>
     * Any network bindings associated with the container.
     * </p>
     */
    private java.util.List<NetworkBinding> networkBindings;

    /**
     * <p>
     * The reason for the state change.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The status of the container.
     * </p>
     */
    private String status;

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
    public ContainerStateChange withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * <p>
     * The container image SHA 256 digest.
     * </p>
     *
     * @return <p>
     *         The container image SHA 256 digest.
     *         </p>
     */
    public String getImageDigest() {
        return imageDigest;
    }

    /**
     * <p>
     * The container image SHA 256 digest.
     * </p>
     *
     * @param imageDigest <p>
     *            The container image SHA 256 digest.
     *            </p>
     */
    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    /**
     * <p>
     * The container image SHA 256 digest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageDigest <p>
     *            The container image SHA 256 digest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerStateChange withImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
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
    public ContainerStateChange withRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }

    /**
     * <p>
     * The exit code for the container, if the state change is a result of the
     * container exiting.
     * </p>
     *
     * @return <p>
     *         The exit code for the container, if the state change is a result
     *         of the container exiting.
     *         </p>
     */
    public Integer getExitCode() {
        return exitCode;
    }

    /**
     * <p>
     * The exit code for the container, if the state change is a result of the
     * container exiting.
     * </p>
     *
     * @param exitCode <p>
     *            The exit code for the container, if the state change is a
     *            result of the container exiting.
     *            </p>
     */
    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    /**
     * <p>
     * The exit code for the container, if the state change is a result of the
     * container exiting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exitCode <p>
     *            The exit code for the container, if the state change is a
     *            result of the container exiting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerStateChange withExitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * <p>
     * Any network bindings associated with the container.
     * </p>
     *
     * @return <p>
     *         Any network bindings associated with the container.
     *         </p>
     */
    public java.util.List<NetworkBinding> getNetworkBindings() {
        return networkBindings;
    }

    /**
     * <p>
     * Any network bindings associated with the container.
     * </p>
     *
     * @param networkBindings <p>
     *            Any network bindings associated with the container.
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
     * Any network bindings associated with the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkBindings <p>
     *            Any network bindings associated with the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerStateChange withNetworkBindings(NetworkBinding... networkBindings) {
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
     * Any network bindings associated with the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkBindings <p>
     *            Any network bindings associated with the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerStateChange withNetworkBindings(
            java.util.Collection<NetworkBinding> networkBindings) {
        setNetworkBindings(networkBindings);
        return this;
    }

    /**
     * <p>
     * The reason for the state change.
     * </p>
     *
     * @return <p>
     *         The reason for the state change.
     *         </p>
     */
    public String getReason() {
        return reason;
    }

    /**
     * <p>
     * The reason for the state change.
     * </p>
     *
     * @param reason <p>
     *            The reason for the state change.
     *            </p>
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the state change.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reason <p>
     *            The reason for the state change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerStateChange withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * <p>
     * The status of the container.
     * </p>
     *
     * @return <p>
     *         The status of the container.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the container.
     * </p>
     *
     * @param status <p>
     *            The status of the container.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContainerStateChange withStatus(String status) {
        this.status = status;
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
        if (getContainerName() != null)
            sb.append("containerName: " + getContainerName() + ",");
        if (getImageDigest() != null)
            sb.append("imageDigest: " + getImageDigest() + ",");
        if (getRuntimeId() != null)
            sb.append("runtimeId: " + getRuntimeId() + ",");
        if (getExitCode() != null)
            sb.append("exitCode: " + getExitCode() + ",");
        if (getNetworkBindings() != null)
            sb.append("networkBindings: " + getNetworkBindings() + ",");
        if (getReason() != null)
            sb.append("reason: " + getReason() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode
                + ((getImageDigest() == null) ? 0 : getImageDigest().hashCode());
        hashCode = prime * hashCode + ((getRuntimeId() == null) ? 0 : getRuntimeId().hashCode());
        hashCode = prime * hashCode + ((getExitCode() == null) ? 0 : getExitCode().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkBindings() == null) ? 0 : getNetworkBindings().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerStateChange == false)
            return false;
        ContainerStateChange other = (ContainerStateChange) obj;

        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null
                && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getImageDigest() == null ^ this.getImageDigest() == null)
            return false;
        if (other.getImageDigest() != null
                && other.getImageDigest().equals(this.getImageDigest()) == false)
            return false;
        if (other.getRuntimeId() == null ^ this.getRuntimeId() == null)
            return false;
        if (other.getRuntimeId() != null
                && other.getRuntimeId().equals(this.getRuntimeId()) == false)
            return false;
        if (other.getExitCode() == null ^ this.getExitCode() == null)
            return false;
        if (other.getExitCode() != null && other.getExitCode().equals(this.getExitCode()) == false)
            return false;
        if (other.getNetworkBindings() == null ^ this.getNetworkBindings() == null)
            return false;
        if (other.getNetworkBindings() != null
                && other.getNetworkBindings().equals(this.getNetworkBindings()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
