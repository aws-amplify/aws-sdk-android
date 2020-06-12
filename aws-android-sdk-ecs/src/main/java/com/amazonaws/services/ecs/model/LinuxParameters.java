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
 * Linux-specific options that are applied to the container, such as Linux
 * <a>KernelCapabilities</a>.
 * </p>
 */
public class LinuxParameters implements Serializable {
    /**
     * <p>
     * The Linux capabilities for the container that are added to or dropped
     * from the default configuration provided by Docker.
     * </p>
     * <note>
     * <p>
     * For tasks that use the Fargate launch type, <code>capabilities</code> is
     * supported for all platform versions but the <code>add</code> parameter is
     * only supported if using platform version 1.4.0 or later.
     * </p>
     * </note>
     */
    private KernelCapabilities capabilities;

    /**
     * <p>
     * Any host devices to expose to the container. This parameter maps to
     * <code>Devices</code> in the <a href=
     * "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>--device</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>devices</code> parameter is not supported.
     * </p>
     * </note>
     */
    private java.util.List<Device> devices;

    /**
     * <p>
     * Run an <code>init</code> process inside the container that forwards
     * signals and reaps processes. This parameter maps to the
     * <code>--init</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>. This
     * parameter requires version 1.25 of the Docker Remote API or greater on
     * your container instance. To check the Docker Remote API version on your
     * container instance, log in to your container instance and run the
     * following command:
     * <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * </p>
     */
    private Boolean initProcessEnabled;

    /**
     * <p>
     * The value for the size (in MiB) of the <code>/dev/shm</code> volume. This
     * parameter maps to the <code>--shm-size</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>sharedMemorySize</code> parameter is not supported.
     * </p>
     * </note>
     */
    private Integer sharedMemorySize;

    /**
     * <p>
     * The container path, mount options, and size (in MiB) of the tmpfs mount.
     * This parameter maps to the <code>--tmpfs</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>tmpfs</code> parameter is not supported.
     * </p>
     * </note>
     */
    private java.util.List<Tmpfs> tmpfs;

    /**
     * <p>
     * The total amount of swap memory (in MiB) a container can use. This
     * parameter will be translated to the <code>--memory-swap</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>
     * where the value would be the sum of the container memory plus the
     * <code>maxSwap</code> value.
     * </p>
     * <p>
     * If a <code>maxSwap</code> value of <code>0</code> is specified, the
     * container will not use swap. Accepted values are <code>0</code> or any
     * positive integer. If the <code>maxSwap</code> parameter is omitted, the
     * container will use the swap configuration for the container instance it
     * is running on. A <code>maxSwap</code> value must be set for the
     * <code>swappiness</code> parameter to be used.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>maxSwap</code> parameter is not supported.
     * </p>
     * </note>
     */
    private Integer maxSwap;

    /**
     * <p>
     * This allows you to tune a container's memory swappiness behavior. A
     * <code>swappiness</code> value of <code>0</code> will cause swapping to
     * not happen unless absolutely necessary. A <code>swappiness</code> value
     * of <code>100</code> will cause pages to be swapped very aggressively.
     * Accepted values are whole numbers between <code>0</code> and
     * <code>100</code>. If the <code>swappiness</code> parameter is not
     * specified, a default value of <code>60</code> is used. If a value is not
     * specified for <code>maxSwap</code> then this parameter is ignored. This
     * parameter maps to the <code>--memory-swappiness</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>swappiness</code> parameter is not supported.
     * </p>
     * </note>
     */
    private Integer swappiness;

    /**
     * <p>
     * The Linux capabilities for the container that are added to or dropped
     * from the default configuration provided by Docker.
     * </p>
     * <note>
     * <p>
     * For tasks that use the Fargate launch type, <code>capabilities</code> is
     * supported for all platform versions but the <code>add</code> parameter is
     * only supported if using platform version 1.4.0 or later.
     * </p>
     * </note>
     *
     * @return <p>
     *         The Linux capabilities for the container that are added to or
     *         dropped from the default configuration provided by Docker.
     *         </p>
     *         <note>
     *         <p>
     *         For tasks that use the Fargate launch type,
     *         <code>capabilities</code> is supported for all platform versions
     *         but the <code>add</code> parameter is only supported if using
     *         platform version 1.4.0 or later.
     *         </p>
     *         </note>
     */
    public KernelCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * The Linux capabilities for the container that are added to or dropped
     * from the default configuration provided by Docker.
     * </p>
     * <note>
     * <p>
     * For tasks that use the Fargate launch type, <code>capabilities</code> is
     * supported for all platform versions but the <code>add</code> parameter is
     * only supported if using platform version 1.4.0 or later.
     * </p>
     * </note>
     *
     * @param capabilities <p>
     *            The Linux capabilities for the container that are added to or
     *            dropped from the default configuration provided by Docker.
     *            </p>
     *            <note>
     *            <p>
     *            For tasks that use the Fargate launch type,
     *            <code>capabilities</code> is supported for all platform
     *            versions but the <code>add</code> parameter is only supported
     *            if using platform version 1.4.0 or later.
     *            </p>
     *            </note>
     */
    public void setCapabilities(KernelCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * <p>
     * The Linux capabilities for the container that are added to or dropped
     * from the default configuration provided by Docker.
     * </p>
     * <note>
     * <p>
     * For tasks that use the Fargate launch type, <code>capabilities</code> is
     * supported for all platform versions but the <code>add</code> parameter is
     * only supported if using platform version 1.4.0 or later.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            The Linux capabilities for the container that are added to or
     *            dropped from the default configuration provided by Docker.
     *            </p>
     *            <note>
     *            <p>
     *            For tasks that use the Fargate launch type,
     *            <code>capabilities</code> is supported for all platform
     *            versions but the <code>add</code> parameter is only supported
     *            if using platform version 1.4.0 or later.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LinuxParameters withCapabilities(KernelCapabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * <p>
     * Any host devices to expose to the container. This parameter maps to
     * <code>Devices</code> in the <a href=
     * "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>--device</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>devices</code> parameter is not supported.
     * </p>
     * </note>
     *
     * @return <p>
     *         Any host devices to expose to the container. This parameter maps
     *         to <code>Devices</code> in the <a href=
     *         "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     *         >Create a container</a> section of the <a
     *         href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *         API</a> and the <code>--device</code> option to <a
     *         href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.
     *         </p>
     *         <note>
     *         <p>
     *         If you are using tasks that use the Fargate launch type, the
     *         <code>devices</code> parameter is not supported.
     *         </p>
     *         </note>
     */
    public java.util.List<Device> getDevices() {
        return devices;
    }

    /**
     * <p>
     * Any host devices to expose to the container. This parameter maps to
     * <code>Devices</code> in the <a href=
     * "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>--device</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>devices</code> parameter is not supported.
     * </p>
     * </note>
     *
     * @param devices <p>
     *            Any host devices to expose to the container. This parameter
     *            maps to <code>Devices</code> in the <a href=
     *            "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     *            >Create a container</a> section of the <a
     *            href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *            API</a> and the <code>--device</code> option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a>.
     *            </p>
     *            <note>
     *            <p>
     *            If you are using tasks that use the Fargate launch type, the
     *            <code>devices</code> parameter is not supported.
     *            </p>
     *            </note>
     */
    public void setDevices(java.util.Collection<Device> devices) {
        if (devices == null) {
            this.devices = null;
            return;
        }

        this.devices = new java.util.ArrayList<Device>(devices);
    }

    /**
     * <p>
     * Any host devices to expose to the container. This parameter maps to
     * <code>Devices</code> in the <a href=
     * "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>--device</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>devices</code> parameter is not supported.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devices <p>
     *            Any host devices to expose to the container. This parameter
     *            maps to <code>Devices</code> in the <a href=
     *            "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     *            >Create a container</a> section of the <a
     *            href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *            API</a> and the <code>--device</code> option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a>.
     *            </p>
     *            <note>
     *            <p>
     *            If you are using tasks that use the Fargate launch type, the
     *            <code>devices</code> parameter is not supported.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LinuxParameters withDevices(Device... devices) {
        if (getDevices() == null) {
            this.devices = new java.util.ArrayList<Device>(devices.length);
        }
        for (Device value : devices) {
            this.devices.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any host devices to expose to the container. This parameter maps to
     * <code>Devices</code> in the <a href=
     * "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>--device</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>devices</code> parameter is not supported.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devices <p>
     *            Any host devices to expose to the container. This parameter
     *            maps to <code>Devices</code> in the <a href=
     *            "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     *            >Create a container</a> section of the <a
     *            href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *            API</a> and the <code>--device</code> option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a>.
     *            </p>
     *            <note>
     *            <p>
     *            If you are using tasks that use the Fargate launch type, the
     *            <code>devices</code> parameter is not supported.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LinuxParameters withDevices(java.util.Collection<Device> devices) {
        setDevices(devices);
        return this;
    }

    /**
     * <p>
     * Run an <code>init</code> process inside the container that forwards
     * signals and reaps processes. This parameter maps to the
     * <code>--init</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>. This
     * parameter requires version 1.25 of the Docker Remote API or greater on
     * your container instance. To check the Docker Remote API version on your
     * container instance, log in to your container instance and run the
     * following command:
     * <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * </p>
     *
     * @return <p>
     *         Run an <code>init</code> process inside the container that
     *         forwards signals and reaps processes. This parameter maps to the
     *         <code>--init</code> option to <a
     *         href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>. This parameter requires version 1.25 of the Docker
     *         Remote API or greater on your container instance. To check the
     *         Docker Remote API version on your container instance, log in to
     *         your container instance and run the following command:
     *         <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     *         </p>
     */
    public Boolean isInitProcessEnabled() {
        return initProcessEnabled;
    }

    /**
     * <p>
     * Run an <code>init</code> process inside the container that forwards
     * signals and reaps processes. This parameter maps to the
     * <code>--init</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>. This
     * parameter requires version 1.25 of the Docker Remote API or greater on
     * your container instance. To check the Docker Remote API version on your
     * container instance, log in to your container instance and run the
     * following command:
     * <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * </p>
     *
     * @return <p>
     *         Run an <code>init</code> process inside the container that
     *         forwards signals and reaps processes. This parameter maps to the
     *         <code>--init</code> option to <a
     *         href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>. This parameter requires version 1.25 of the Docker
     *         Remote API or greater on your container instance. To check the
     *         Docker Remote API version on your container instance, log in to
     *         your container instance and run the following command:
     *         <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     *         </p>
     */
    public Boolean getInitProcessEnabled() {
        return initProcessEnabled;
    }

    /**
     * <p>
     * Run an <code>init</code> process inside the container that forwards
     * signals and reaps processes. This parameter maps to the
     * <code>--init</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>. This
     * parameter requires version 1.25 of the Docker Remote API or greater on
     * your container instance. To check the Docker Remote API version on your
     * container instance, log in to your container instance and run the
     * following command:
     * <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * </p>
     *
     * @param initProcessEnabled <p>
     *            Run an <code>init</code> process inside the container that
     *            forwards signals and reaps processes. This parameter maps to
     *            the <code>--init</code> option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a>. This parameter requires version 1.25 of the Docker
     *            Remote API or greater on your container instance. To check the
     *            Docker Remote API version on your container instance, log in
     *            to your container instance and run the following command:
     *            <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     *            </p>
     */
    public void setInitProcessEnabled(Boolean initProcessEnabled) {
        this.initProcessEnabled = initProcessEnabled;
    }

    /**
     * <p>
     * Run an <code>init</code> process inside the container that forwards
     * signals and reaps processes. This parameter maps to the
     * <code>--init</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>. This
     * parameter requires version 1.25 of the Docker Remote API or greater on
     * your container instance. To check the Docker Remote API version on your
     * container instance, log in to your container instance and run the
     * following command:
     * <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param initProcessEnabled <p>
     *            Run an <code>init</code> process inside the container that
     *            forwards signals and reaps processes. This parameter maps to
     *            the <code>--init</code> option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a>. This parameter requires version 1.25 of the Docker
     *            Remote API or greater on your container instance. To check the
     *            Docker Remote API version on your container instance, log in
     *            to your container instance and run the following command:
     *            <code>sudo docker version --format '{{.Server.APIVersion}}'</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LinuxParameters withInitProcessEnabled(Boolean initProcessEnabled) {
        this.initProcessEnabled = initProcessEnabled;
        return this;
    }

    /**
     * <p>
     * The value for the size (in MiB) of the <code>/dev/shm</code> volume. This
     * parameter maps to the <code>--shm-size</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>sharedMemorySize</code> parameter is not supported.
     * </p>
     * </note>
     *
     * @return <p>
     *         The value for the size (in MiB) of the <code>/dev/shm</code>
     *         volume. This parameter maps to the <code>--shm-size</code> option
     *         to <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.
     *         </p>
     *         <note>
     *         <p>
     *         If you are using tasks that use the Fargate launch type, the
     *         <code>sharedMemorySize</code> parameter is not supported.
     *         </p>
     *         </note>
     */
    public Integer getSharedMemorySize() {
        return sharedMemorySize;
    }

    /**
     * <p>
     * The value for the size (in MiB) of the <code>/dev/shm</code> volume. This
     * parameter maps to the <code>--shm-size</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>sharedMemorySize</code> parameter is not supported.
     * </p>
     * </note>
     *
     * @param sharedMemorySize <p>
     *            The value for the size (in MiB) of the <code>/dev/shm</code>
     *            volume. This parameter maps to the <code>--shm-size</code>
     *            option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a>.
     *            </p>
     *            <note>
     *            <p>
     *            If you are using tasks that use the Fargate launch type, the
     *            <code>sharedMemorySize</code> parameter is not supported.
     *            </p>
     *            </note>
     */
    public void setSharedMemorySize(Integer sharedMemorySize) {
        this.sharedMemorySize = sharedMemorySize;
    }

    /**
     * <p>
     * The value for the size (in MiB) of the <code>/dev/shm</code> volume. This
     * parameter maps to the <code>--shm-size</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>sharedMemorySize</code> parameter is not supported.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sharedMemorySize <p>
     *            The value for the size (in MiB) of the <code>/dev/shm</code>
     *            volume. This parameter maps to the <code>--shm-size</code>
     *            option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a>.
     *            </p>
     *            <note>
     *            <p>
     *            If you are using tasks that use the Fargate launch type, the
     *            <code>sharedMemorySize</code> parameter is not supported.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LinuxParameters withSharedMemorySize(Integer sharedMemorySize) {
        this.sharedMemorySize = sharedMemorySize;
        return this;
    }

    /**
     * <p>
     * The container path, mount options, and size (in MiB) of the tmpfs mount.
     * This parameter maps to the <code>--tmpfs</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>tmpfs</code> parameter is not supported.
     * </p>
     * </note>
     *
     * @return <p>
     *         The container path, mount options, and size (in MiB) of the tmpfs
     *         mount. This parameter maps to the <code>--tmpfs</code> option to
     *         <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.
     *         </p>
     *         <note>
     *         <p>
     *         If you are using tasks that use the Fargate launch type, the
     *         <code>tmpfs</code> parameter is not supported.
     *         </p>
     *         </note>
     */
    public java.util.List<Tmpfs> getTmpfs() {
        return tmpfs;
    }

    /**
     * <p>
     * The container path, mount options, and size (in MiB) of the tmpfs mount.
     * This parameter maps to the <code>--tmpfs</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>tmpfs</code> parameter is not supported.
     * </p>
     * </note>
     *
     * @param tmpfs <p>
     *            The container path, mount options, and size (in MiB) of the
     *            tmpfs mount. This parameter maps to the <code>--tmpfs</code>
     *            option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a>.
     *            </p>
     *            <note>
     *            <p>
     *            If you are using tasks that use the Fargate launch type, the
     *            <code>tmpfs</code> parameter is not supported.
     *            </p>
     *            </note>
     */
    public void setTmpfs(java.util.Collection<Tmpfs> tmpfs) {
        if (tmpfs == null) {
            this.tmpfs = null;
            return;
        }

        this.tmpfs = new java.util.ArrayList<Tmpfs>(tmpfs);
    }

    /**
     * <p>
     * The container path, mount options, and size (in MiB) of the tmpfs mount.
     * This parameter maps to the <code>--tmpfs</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>tmpfs</code> parameter is not supported.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tmpfs <p>
     *            The container path, mount options, and size (in MiB) of the
     *            tmpfs mount. This parameter maps to the <code>--tmpfs</code>
     *            option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a>.
     *            </p>
     *            <note>
     *            <p>
     *            If you are using tasks that use the Fargate launch type, the
     *            <code>tmpfs</code> parameter is not supported.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LinuxParameters withTmpfs(Tmpfs... tmpfs) {
        if (getTmpfs() == null) {
            this.tmpfs = new java.util.ArrayList<Tmpfs>(tmpfs.length);
        }
        for (Tmpfs value : tmpfs) {
            this.tmpfs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The container path, mount options, and size (in MiB) of the tmpfs mount.
     * This parameter maps to the <code>--tmpfs</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>tmpfs</code> parameter is not supported.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tmpfs <p>
     *            The container path, mount options, and size (in MiB) of the
     *            tmpfs mount. This parameter maps to the <code>--tmpfs</code>
     *            option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a>.
     *            </p>
     *            <note>
     *            <p>
     *            If you are using tasks that use the Fargate launch type, the
     *            <code>tmpfs</code> parameter is not supported.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LinuxParameters withTmpfs(java.util.Collection<Tmpfs> tmpfs) {
        setTmpfs(tmpfs);
        return this;
    }

    /**
     * <p>
     * The total amount of swap memory (in MiB) a container can use. This
     * parameter will be translated to the <code>--memory-swap</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>
     * where the value would be the sum of the container memory plus the
     * <code>maxSwap</code> value.
     * </p>
     * <p>
     * If a <code>maxSwap</code> value of <code>0</code> is specified, the
     * container will not use swap. Accepted values are <code>0</code> or any
     * positive integer. If the <code>maxSwap</code> parameter is omitted, the
     * container will use the swap configuration for the container instance it
     * is running on. A <code>maxSwap</code> value must be set for the
     * <code>swappiness</code> parameter to be used.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>maxSwap</code> parameter is not supported.
     * </p>
     * </note>
     *
     * @return <p>
     *         The total amount of swap memory (in MiB) a container can use.
     *         This parameter will be translated to the
     *         <code>--memory-swap</code> option to <a
     *         href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a> where the value would be the sum of the container memory
     *         plus the <code>maxSwap</code> value.
     *         </p>
     *         <p>
     *         If a <code>maxSwap</code> value of <code>0</code> is specified,
     *         the container will not use swap. Accepted values are
     *         <code>0</code> or any positive integer. If the
     *         <code>maxSwap</code> parameter is omitted, the container will use
     *         the swap configuration for the container instance it is running
     *         on. A <code>maxSwap</code> value must be set for the
     *         <code>swappiness</code> parameter to be used.
     *         </p>
     *         <note>
     *         <p>
     *         If you are using tasks that use the Fargate launch type, the
     *         <code>maxSwap</code> parameter is not supported.
     *         </p>
     *         </note>
     */
    public Integer getMaxSwap() {
        return maxSwap;
    }

    /**
     * <p>
     * The total amount of swap memory (in MiB) a container can use. This
     * parameter will be translated to the <code>--memory-swap</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>
     * where the value would be the sum of the container memory plus the
     * <code>maxSwap</code> value.
     * </p>
     * <p>
     * If a <code>maxSwap</code> value of <code>0</code> is specified, the
     * container will not use swap. Accepted values are <code>0</code> or any
     * positive integer. If the <code>maxSwap</code> parameter is omitted, the
     * container will use the swap configuration for the container instance it
     * is running on. A <code>maxSwap</code> value must be set for the
     * <code>swappiness</code> parameter to be used.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>maxSwap</code> parameter is not supported.
     * </p>
     * </note>
     *
     * @param maxSwap <p>
     *            The total amount of swap memory (in MiB) a container can use.
     *            This parameter will be translated to the
     *            <code>--memory-swap</code> option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a> where the value would be the sum of the container
     *            memory plus the <code>maxSwap</code> value.
     *            </p>
     *            <p>
     *            If a <code>maxSwap</code> value of <code>0</code> is
     *            specified, the container will not use swap. Accepted values
     *            are <code>0</code> or any positive integer. If the
     *            <code>maxSwap</code> parameter is omitted, the container will
     *            use the swap configuration for the container instance it is
     *            running on. A <code>maxSwap</code> value must be set for the
     *            <code>swappiness</code> parameter to be used.
     *            </p>
     *            <note>
     *            <p>
     *            If you are using tasks that use the Fargate launch type, the
     *            <code>maxSwap</code> parameter is not supported.
     *            </p>
     *            </note>
     */
    public void setMaxSwap(Integer maxSwap) {
        this.maxSwap = maxSwap;
    }

    /**
     * <p>
     * The total amount of swap memory (in MiB) a container can use. This
     * parameter will be translated to the <code>--memory-swap</code> option to
     * <a href="https://docs.docker.com/engine/reference/run/">docker run</a>
     * where the value would be the sum of the container memory plus the
     * <code>maxSwap</code> value.
     * </p>
     * <p>
     * If a <code>maxSwap</code> value of <code>0</code> is specified, the
     * container will not use swap. Accepted values are <code>0</code> or any
     * positive integer. If the <code>maxSwap</code> parameter is omitted, the
     * container will use the swap configuration for the container instance it
     * is running on. A <code>maxSwap</code> value must be set for the
     * <code>swappiness</code> parameter to be used.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>maxSwap</code> parameter is not supported.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxSwap <p>
     *            The total amount of swap memory (in MiB) a container can use.
     *            This parameter will be translated to the
     *            <code>--memory-swap</code> option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a> where the value would be the sum of the container
     *            memory plus the <code>maxSwap</code> value.
     *            </p>
     *            <p>
     *            If a <code>maxSwap</code> value of <code>0</code> is
     *            specified, the container will not use swap. Accepted values
     *            are <code>0</code> or any positive integer. If the
     *            <code>maxSwap</code> parameter is omitted, the container will
     *            use the swap configuration for the container instance it is
     *            running on. A <code>maxSwap</code> value must be set for the
     *            <code>swappiness</code> parameter to be used.
     *            </p>
     *            <note>
     *            <p>
     *            If you are using tasks that use the Fargate launch type, the
     *            <code>maxSwap</code> parameter is not supported.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LinuxParameters withMaxSwap(Integer maxSwap) {
        this.maxSwap = maxSwap;
        return this;
    }

    /**
     * <p>
     * This allows you to tune a container's memory swappiness behavior. A
     * <code>swappiness</code> value of <code>0</code> will cause swapping to
     * not happen unless absolutely necessary. A <code>swappiness</code> value
     * of <code>100</code> will cause pages to be swapped very aggressively.
     * Accepted values are whole numbers between <code>0</code> and
     * <code>100</code>. If the <code>swappiness</code> parameter is not
     * specified, a default value of <code>60</code> is used. If a value is not
     * specified for <code>maxSwap</code> then this parameter is ignored. This
     * parameter maps to the <code>--memory-swappiness</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>swappiness</code> parameter is not supported.
     * </p>
     * </note>
     *
     * @return <p>
     *         This allows you to tune a container's memory swappiness behavior.
     *         A <code>swappiness</code> value of <code>0</code> will cause
     *         swapping to not happen unless absolutely necessary. A
     *         <code>swappiness</code> value of <code>100</code> will cause
     *         pages to be swapped very aggressively. Accepted values are whole
     *         numbers between <code>0</code> and <code>100</code>. If the
     *         <code>swappiness</code> parameter is not specified, a default
     *         value of <code>60</code> is used. If a value is not specified for
     *         <code>maxSwap</code> then this parameter is ignored. This
     *         parameter maps to the <code>--memory-swappiness</code> option to
     *         <a href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.
     *         </p>
     *         <note>
     *         <p>
     *         If you are using tasks that use the Fargate launch type, the
     *         <code>swappiness</code> parameter is not supported.
     *         </p>
     *         </note>
     */
    public Integer getSwappiness() {
        return swappiness;
    }

    /**
     * <p>
     * This allows you to tune a container's memory swappiness behavior. A
     * <code>swappiness</code> value of <code>0</code> will cause swapping to
     * not happen unless absolutely necessary. A <code>swappiness</code> value
     * of <code>100</code> will cause pages to be swapped very aggressively.
     * Accepted values are whole numbers between <code>0</code> and
     * <code>100</code>. If the <code>swappiness</code> parameter is not
     * specified, a default value of <code>60</code> is used. If a value is not
     * specified for <code>maxSwap</code> then this parameter is ignored. This
     * parameter maps to the <code>--memory-swappiness</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>swappiness</code> parameter is not supported.
     * </p>
     * </note>
     *
     * @param swappiness <p>
     *            This allows you to tune a container's memory swappiness
     *            behavior. A <code>swappiness</code> value of <code>0</code>
     *            will cause swapping to not happen unless absolutely necessary.
     *            A <code>swappiness</code> value of <code>100</code> will cause
     *            pages to be swapped very aggressively. Accepted values are
     *            whole numbers between <code>0</code> and <code>100</code>. If
     *            the <code>swappiness</code> parameter is not specified, a
     *            default value of <code>60</code> is used. If a value is not
     *            specified for <code>maxSwap</code> then this parameter is
     *            ignored. This parameter maps to the
     *            <code>--memory-swappiness</code> option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a>.
     *            </p>
     *            <note>
     *            <p>
     *            If you are using tasks that use the Fargate launch type, the
     *            <code>swappiness</code> parameter is not supported.
     *            </p>
     *            </note>
     */
    public void setSwappiness(Integer swappiness) {
        this.swappiness = swappiness;
    }

    /**
     * <p>
     * This allows you to tune a container's memory swappiness behavior. A
     * <code>swappiness</code> value of <code>0</code> will cause swapping to
     * not happen unless absolutely necessary. A <code>swappiness</code> value
     * of <code>100</code> will cause pages to be swapped very aggressively.
     * Accepted values are whole numbers between <code>0</code> and
     * <code>100</code>. If the <code>swappiness</code> parameter is not
     * specified, a default value of <code>60</code> is used. If a value is not
     * specified for <code>maxSwap</code> then this parameter is ignored. This
     * parameter maps to the <code>--memory-swappiness</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * If you are using tasks that use the Fargate launch type, the
     * <code>swappiness</code> parameter is not supported.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param swappiness <p>
     *            This allows you to tune a container's memory swappiness
     *            behavior. A <code>swappiness</code> value of <code>0</code>
     *            will cause swapping to not happen unless absolutely necessary.
     *            A <code>swappiness</code> value of <code>100</code> will cause
     *            pages to be swapped very aggressively. Accepted values are
     *            whole numbers between <code>0</code> and <code>100</code>. If
     *            the <code>swappiness</code> parameter is not specified, a
     *            default value of <code>60</code> is used. If a value is not
     *            specified for <code>maxSwap</code> then this parameter is
     *            ignored. This parameter maps to the
     *            <code>--memory-swappiness</code> option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a>.
     *            </p>
     *            <note>
     *            <p>
     *            If you are using tasks that use the Fargate launch type, the
     *            <code>swappiness</code> parameter is not supported.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LinuxParameters withSwappiness(Integer swappiness) {
        this.swappiness = swappiness;
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
        if (getCapabilities() != null)
            sb.append("capabilities: " + getCapabilities() + ",");
        if (getDevices() != null)
            sb.append("devices: " + getDevices() + ",");
        if (getInitProcessEnabled() != null)
            sb.append("initProcessEnabled: " + getInitProcessEnabled() + ",");
        if (getSharedMemorySize() != null)
            sb.append("sharedMemorySize: " + getSharedMemorySize() + ",");
        if (getTmpfs() != null)
            sb.append("tmpfs: " + getTmpfs() + ",");
        if (getMaxSwap() != null)
            sb.append("maxSwap: " + getMaxSwap() + ",");
        if (getSwappiness() != null)
            sb.append("swappiness: " + getSwappiness());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getDevices() == null) ? 0 : getDevices().hashCode());
        hashCode = prime * hashCode
                + ((getInitProcessEnabled() == null) ? 0 : getInitProcessEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getSharedMemorySize() == null) ? 0 : getSharedMemorySize().hashCode());
        hashCode = prime * hashCode + ((getTmpfs() == null) ? 0 : getTmpfs().hashCode());
        hashCode = prime * hashCode + ((getMaxSwap() == null) ? 0 : getMaxSwap().hashCode());
        hashCode = prime * hashCode + ((getSwappiness() == null) ? 0 : getSwappiness().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LinuxParameters == false)
            return false;
        LinuxParameters other = (LinuxParameters) obj;

        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null
                && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getDevices() == null ^ this.getDevices() == null)
            return false;
        if (other.getDevices() != null && other.getDevices().equals(this.getDevices()) == false)
            return false;
        if (other.getInitProcessEnabled() == null ^ this.getInitProcessEnabled() == null)
            return false;
        if (other.getInitProcessEnabled() != null
                && other.getInitProcessEnabled().equals(this.getInitProcessEnabled()) == false)
            return false;
        if (other.getSharedMemorySize() == null ^ this.getSharedMemorySize() == null)
            return false;
        if (other.getSharedMemorySize() != null
                && other.getSharedMemorySize().equals(this.getSharedMemorySize()) == false)
            return false;
        if (other.getTmpfs() == null ^ this.getTmpfs() == null)
            return false;
        if (other.getTmpfs() != null && other.getTmpfs().equals(this.getTmpfs()) == false)
            return false;
        if (other.getMaxSwap() == null ^ this.getMaxSwap() == null)
            return false;
        if (other.getMaxSwap() != null && other.getMaxSwap().equals(this.getMaxSwap()) == false)
            return false;
        if (other.getSwappiness() == null ^ this.getSwappiness() == null)
            return false;
        if (other.getSwappiness() != null
                && other.getSwappiness().equals(this.getSwappiness()) == false)
            return false;
        return true;
    }
}
