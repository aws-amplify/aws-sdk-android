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
 * A Docker container that is part of a task.
 * </p>
 */
public class Container implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container.
     * </p>
     */
    private String containerArn;

    /**
     * <p>
     * The ARN of the task.
     * </p>
     */
    private String taskArn;

    /**
     * <p>
     * The name of the container.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The image used for the container.
     * </p>
     */
    private String image;

    /**
     * <p>
     * The container image manifest digest.
     * </p>
     * <note>
     * <p>
     * The <code>imageDigest</code> is only returned if the container is using
     * an image hosted in Amazon ECR, otherwise it is omitted.
     * </p>
     * </note>
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
     * The last known status of the container.
     * </p>
     */
    private String lastStatus;

    /**
     * <p>
     * The exit code returned from the container.
     * </p>
     */
    private Integer exitCode;

    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional
     * details about a running or stopped container.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The network bindings associated with the container.
     * </p>
     */
    private java.util.List<NetworkBinding> networkBindings;

    /**
     * <p>
     * The network interfaces associated with the container.
     * </p>
     */
    private java.util.List<NetworkInterface> networkInterfaces;

    /**
     * <p>
     * The health status of the container. If health checks are not configured
     * for this container in its task definition, then it reports the health
     * status as <code>UNKNOWN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, UNKNOWN
     */
    private String healthStatus;

    /**
     * <p>
     * The number of CPU units set for the container. The value will be
     * <code>0</code> if no value was specified in the container definition when
     * the task definition was registered.
     * </p>
     */
    private String cpu;

    /**
     * <p>
     * The hard limit (in MiB) of memory set for the container.
     * </p>
     */
    private String memory;

    /**
     * <p>
     * The soft limit (in MiB) of memory set for the container.
     * </p>
     */
    private String memoryReservation;

    /**
     * <p>
     * The IDs of each GPU assigned to the container.
     * </p>
     */
    private java.util.List<String> gpuIds;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the container.
     *         </p>
     */
    public String getContainerArn() {
        return containerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container.
     * </p>
     *
     * @param containerArn <p>
     *            The Amazon Resource Name (ARN) of the container.
     *            </p>
     */
    public void setContainerArn(String containerArn) {
        this.containerArn = containerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerArn <p>
     *            The Amazon Resource Name (ARN) of the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Container withContainerArn(String containerArn) {
        this.containerArn = containerArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the task.
     * </p>
     *
     * @return <p>
     *         The ARN of the task.
     *         </p>
     */
    public String getTaskArn() {
        return taskArn;
    }

    /**
     * <p>
     * The ARN of the task.
     * </p>
     *
     * @param taskArn <p>
     *            The ARN of the task.
     *            </p>
     */
    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The ARN of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskArn <p>
     *            The ARN of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Container withTaskArn(String taskArn) {
        this.taskArn = taskArn;
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
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     *
     * @param name <p>
     *            The name of the container.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Container withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The image used for the container.
     * </p>
     *
     * @return <p>
     *         The image used for the container.
     *         </p>
     */
    public String getImage() {
        return image;
    }

    /**
     * <p>
     * The image used for the container.
     * </p>
     *
     * @param image <p>
     *            The image used for the container.
     *            </p>
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The image used for the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param image <p>
     *            The image used for the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Container withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * <p>
     * The container image manifest digest.
     * </p>
     * <note>
     * <p>
     * The <code>imageDigest</code> is only returned if the container is using
     * an image hosted in Amazon ECR, otherwise it is omitted.
     * </p>
     * </note>
     *
     * @return <p>
     *         The container image manifest digest.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>imageDigest</code> is only returned if the container is
     *         using an image hosted in Amazon ECR, otherwise it is omitted.
     *         </p>
     *         </note>
     */
    public String getImageDigest() {
        return imageDigest;
    }

    /**
     * <p>
     * The container image manifest digest.
     * </p>
     * <note>
     * <p>
     * The <code>imageDigest</code> is only returned if the container is using
     * an image hosted in Amazon ECR, otherwise it is omitted.
     * </p>
     * </note>
     *
     * @param imageDigest <p>
     *            The container image manifest digest.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>imageDigest</code> is only returned if the container
     *            is using an image hosted in Amazon ECR, otherwise it is
     *            omitted.
     *            </p>
     *            </note>
     */
    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    /**
     * <p>
     * The container image manifest digest.
     * </p>
     * <note>
     * <p>
     * The <code>imageDigest</code> is only returned if the container is using
     * an image hosted in Amazon ECR, otherwise it is omitted.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageDigest <p>
     *            The container image manifest digest.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>imageDigest</code> is only returned if the container
     *            is using an image hosted in Amazon ECR, otherwise it is
     *            omitted.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Container withImageDigest(String imageDigest) {
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
    public Container withRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }

    /**
     * <p>
     * The last known status of the container.
     * </p>
     *
     * @return <p>
     *         The last known status of the container.
     *         </p>
     */
    public String getLastStatus() {
        return lastStatus;
    }

    /**
     * <p>
     * The last known status of the container.
     * </p>
     *
     * @param lastStatus <p>
     *            The last known status of the container.
     *            </p>
     */
    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    /**
     * <p>
     * The last known status of the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastStatus <p>
     *            The last known status of the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Container withLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
        return this;
    }

    /**
     * <p>
     * The exit code returned from the container.
     * </p>
     *
     * @return <p>
     *         The exit code returned from the container.
     *         </p>
     */
    public Integer getExitCode() {
        return exitCode;
    }

    /**
     * <p>
     * The exit code returned from the container.
     * </p>
     *
     * @param exitCode <p>
     *            The exit code returned from the container.
     *            </p>
     */
    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    /**
     * <p>
     * The exit code returned from the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exitCode <p>
     *            The exit code returned from the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Container withExitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional
     * details about a running or stopped container.
     * </p>
     *
     * @return <p>
     *         A short (255 max characters) human-readable string to provide
     *         additional details about a running or stopped container.
     *         </p>
     */
    public String getReason() {
        return reason;
    }

    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional
     * details about a running or stopped container.
     * </p>
     *
     * @param reason <p>
     *            A short (255 max characters) human-readable string to provide
     *            additional details about a running or stopped container.
     *            </p>
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional
     * details about a running or stopped container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reason <p>
     *            A short (255 max characters) human-readable string to provide
     *            additional details about a running or stopped container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Container withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * <p>
     * The network bindings associated with the container.
     * </p>
     *
     * @return <p>
     *         The network bindings associated with the container.
     *         </p>
     */
    public java.util.List<NetworkBinding> getNetworkBindings() {
        return networkBindings;
    }

    /**
     * <p>
     * The network bindings associated with the container.
     * </p>
     *
     * @param networkBindings <p>
     *            The network bindings associated with the container.
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
     * The network bindings associated with the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkBindings <p>
     *            The network bindings associated with the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Container withNetworkBindings(NetworkBinding... networkBindings) {
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
     * The network bindings associated with the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkBindings <p>
     *            The network bindings associated with the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Container withNetworkBindings(java.util.Collection<NetworkBinding> networkBindings) {
        setNetworkBindings(networkBindings);
        return this;
    }

    /**
     * <p>
     * The network interfaces associated with the container.
     * </p>
     *
     * @return <p>
     *         The network interfaces associated with the container.
     *         </p>
     */
    public java.util.List<NetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * <p>
     * The network interfaces associated with the container.
     * </p>
     *
     * @param networkInterfaces <p>
     *            The network interfaces associated with the container.
     *            </p>
     */
    public void setNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new java.util.ArrayList<NetworkInterface>(networkInterfaces);
    }

    /**
     * <p>
     * The network interfaces associated with the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaces <p>
     *            The network interfaces associated with the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Container withNetworkInterfaces(NetworkInterface... networkInterfaces) {
        if (getNetworkInterfaces() == null) {
            this.networkInterfaces = new java.util.ArrayList<NetworkInterface>(
                    networkInterfaces.length);
        }
        for (NetworkInterface value : networkInterfaces) {
            this.networkInterfaces.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The network interfaces associated with the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaces <p>
     *            The network interfaces associated with the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Container withNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * The health status of the container. If health checks are not configured
     * for this container in its task definition, then it reports the health
     * status as <code>UNKNOWN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, UNKNOWN
     *
     * @return <p>
     *         The health status of the container. If health checks are not
     *         configured for this container in its task definition, then it
     *         reports the health status as <code>UNKNOWN</code>.
     *         </p>
     * @see HealthStatus
     */
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * <p>
     * The health status of the container. If health checks are not configured
     * for this container in its task definition, then it reports the health
     * status as <code>UNKNOWN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, UNKNOWN
     *
     * @param healthStatus <p>
     *            The health status of the container. If health checks are not
     *            configured for this container in its task definition, then it
     *            reports the health status as <code>UNKNOWN</code>.
     *            </p>
     * @see HealthStatus
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * The health status of the container. If health checks are not configured
     * for this container in its task definition, then it reports the health
     * status as <code>UNKNOWN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, UNKNOWN
     *
     * @param healthStatus <p>
     *            The health status of the container. If health checks are not
     *            configured for this container in its task definition, then it
     *            reports the health status as <code>UNKNOWN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HealthStatus
     */
    public Container withHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * <p>
     * The health status of the container. If health checks are not configured
     * for this container in its task definition, then it reports the health
     * status as <code>UNKNOWN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, UNKNOWN
     *
     * @param healthStatus <p>
     *            The health status of the container. If health checks are not
     *            configured for this container in its task definition, then it
     *            reports the health status as <code>UNKNOWN</code>.
     *            </p>
     * @see HealthStatus
     */
    public void setHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus.toString();
    }

    /**
     * <p>
     * The health status of the container. If health checks are not configured
     * for this container in its task definition, then it reports the health
     * status as <code>UNKNOWN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, UNKNOWN
     *
     * @param healthStatus <p>
     *            The health status of the container. If health checks are not
     *            configured for this container in its task definition, then it
     *            reports the health status as <code>UNKNOWN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HealthStatus
     */
    public Container withHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus.toString();
        return this;
    }

    /**
     * <p>
     * The number of CPU units set for the container. The value will be
     * <code>0</code> if no value was specified in the container definition when
     * the task definition was registered.
     * </p>
     *
     * @return <p>
     *         The number of CPU units set for the container. The value will be
     *         <code>0</code> if no value was specified in the container
     *         definition when the task definition was registered.
     *         </p>
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * <p>
     * The number of CPU units set for the container. The value will be
     * <code>0</code> if no value was specified in the container definition when
     * the task definition was registered.
     * </p>
     *
     * @param cpu <p>
     *            The number of CPU units set for the container. The value will
     *            be <code>0</code> if no value was specified in the container
     *            definition when the task definition was registered.
     *            </p>
     */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The number of CPU units set for the container. The value will be
     * <code>0</code> if no value was specified in the container definition when
     * the task definition was registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cpu <p>
     *            The number of CPU units set for the container. The value will
     *            be <code>0</code> if no value was specified in the container
     *            definition when the task definition was registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Container withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * <p>
     * The hard limit (in MiB) of memory set for the container.
     * </p>
     *
     * @return <p>
     *         The hard limit (in MiB) of memory set for the container.
     *         </p>
     */
    public String getMemory() {
        return memory;
    }

    /**
     * <p>
     * The hard limit (in MiB) of memory set for the container.
     * </p>
     *
     * @param memory <p>
     *            The hard limit (in MiB) of memory set for the container.
     *            </p>
     */
    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The hard limit (in MiB) of memory set for the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memory <p>
     *            The hard limit (in MiB) of memory set for the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Container withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * <p>
     * The soft limit (in MiB) of memory set for the container.
     * </p>
     *
     * @return <p>
     *         The soft limit (in MiB) of memory set for the container.
     *         </p>
     */
    public String getMemoryReservation() {
        return memoryReservation;
    }

    /**
     * <p>
     * The soft limit (in MiB) of memory set for the container.
     * </p>
     *
     * @param memoryReservation <p>
     *            The soft limit (in MiB) of memory set for the container.
     *            </p>
     */
    public void setMemoryReservation(String memoryReservation) {
        this.memoryReservation = memoryReservation;
    }

    /**
     * <p>
     * The soft limit (in MiB) of memory set for the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memoryReservation <p>
     *            The soft limit (in MiB) of memory set for the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Container withMemoryReservation(String memoryReservation) {
        this.memoryReservation = memoryReservation;
        return this;
    }

    /**
     * <p>
     * The IDs of each GPU assigned to the container.
     * </p>
     *
     * @return <p>
     *         The IDs of each GPU assigned to the container.
     *         </p>
     */
    public java.util.List<String> getGpuIds() {
        return gpuIds;
    }

    /**
     * <p>
     * The IDs of each GPU assigned to the container.
     * </p>
     *
     * @param gpuIds <p>
     *            The IDs of each GPU assigned to the container.
     *            </p>
     */
    public void setGpuIds(java.util.Collection<String> gpuIds) {
        if (gpuIds == null) {
            this.gpuIds = null;
            return;
        }

        this.gpuIds = new java.util.ArrayList<String>(gpuIds);
    }

    /**
     * <p>
     * The IDs of each GPU assigned to the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gpuIds <p>
     *            The IDs of each GPU assigned to the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Container withGpuIds(String... gpuIds) {
        if (getGpuIds() == null) {
            this.gpuIds = new java.util.ArrayList<String>(gpuIds.length);
        }
        for (String value : gpuIds) {
            this.gpuIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of each GPU assigned to the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gpuIds <p>
     *            The IDs of each GPU assigned to the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Container withGpuIds(java.util.Collection<String> gpuIds) {
        setGpuIds(gpuIds);
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
        if (getContainerArn() != null)
            sb.append("containerArn: " + getContainerArn() + ",");
        if (getTaskArn() != null)
            sb.append("taskArn: " + getTaskArn() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getImage() != null)
            sb.append("image: " + getImage() + ",");
        if (getImageDigest() != null)
            sb.append("imageDigest: " + getImageDigest() + ",");
        if (getRuntimeId() != null)
            sb.append("runtimeId: " + getRuntimeId() + ",");
        if (getLastStatus() != null)
            sb.append("lastStatus: " + getLastStatus() + ",");
        if (getExitCode() != null)
            sb.append("exitCode: " + getExitCode() + ",");
        if (getReason() != null)
            sb.append("reason: " + getReason() + ",");
        if (getNetworkBindings() != null)
            sb.append("networkBindings: " + getNetworkBindings() + ",");
        if (getNetworkInterfaces() != null)
            sb.append("networkInterfaces: " + getNetworkInterfaces() + ",");
        if (getHealthStatus() != null)
            sb.append("healthStatus: " + getHealthStatus() + ",");
        if (getCpu() != null)
            sb.append("cpu: " + getCpu() + ",");
        if (getMemory() != null)
            sb.append("memory: " + getMemory() + ",");
        if (getMemoryReservation() != null)
            sb.append("memoryReservation: " + getMemoryReservation() + ",");
        if (getGpuIds() != null)
            sb.append("gpuIds: " + getGpuIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContainerArn() == null) ? 0 : getContainerArn().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode
                + ((getImageDigest() == null) ? 0 : getImageDigest().hashCode());
        hashCode = prime * hashCode + ((getRuntimeId() == null) ? 0 : getRuntimeId().hashCode());
        hashCode = prime * hashCode + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode());
        hashCode = prime * hashCode + ((getExitCode() == null) ? 0 : getExitCode().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkBindings() == null) ? 0 : getNetworkBindings().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode
                + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode
                + ((getMemoryReservation() == null) ? 0 : getMemoryReservation().hashCode());
        hashCode = prime * hashCode + ((getGpuIds() == null) ? 0 : getGpuIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Container == false)
            return false;
        Container other = (Container) obj;

        if (other.getContainerArn() == null ^ this.getContainerArn() == null)
            return false;
        if (other.getContainerArn() != null
                && other.getContainerArn().equals(this.getContainerArn()) == false)
            return false;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
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
        if (other.getLastStatus() == null ^ this.getLastStatus() == null)
            return false;
        if (other.getLastStatus() != null
                && other.getLastStatus().equals(this.getLastStatus()) == false)
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
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null
                && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null
                && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getMemoryReservation() == null ^ this.getMemoryReservation() == null)
            return false;
        if (other.getMemoryReservation() != null
                && other.getMemoryReservation().equals(this.getMemoryReservation()) == false)
            return false;
        if (other.getGpuIds() == null ^ this.getGpuIds() == null)
            return false;
        if (other.getGpuIds() != null && other.getGpuIds().equals(this.getGpuIds()) == false)
            return false;
        return true;
    }
}
