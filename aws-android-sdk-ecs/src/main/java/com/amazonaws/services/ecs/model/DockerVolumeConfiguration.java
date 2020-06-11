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
 * This parameter is specified when you are using Docker volumes. Docker volumes
 * are only supported when you are using the EC2 launch type. Windows containers
 * only support the use of the <code>local</code> driver. To use bind mounts,
 * specify a <code>host</code> instead.
 * </p>
 */
public class DockerVolumeConfiguration implements Serializable {
    /**
     * <p>
     * The scope for the Docker volume that determines its lifecycle. Docker
     * volumes that are scoped to a <code>task</code> are automatically
     * provisioned when the task starts and destroyed when the task stops.
     * Docker volumes that are scoped as <code>shared</code> persist after the
     * task stops.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>task, shared
     */
    private String scope;

    /**
     * <p>
     * If this value is <code>true</code>, the Docker volume is created if it
     * does not already exist.
     * </p>
     * <note>
     * <p>
     * This field is only used if the <code>scope</code> is <code>shared</code>.
     * </p>
     * </note>
     */
    private Boolean autoprovision;

    /**
     * <p>
     * The Docker volume driver to use. The driver value must match the driver
     * name provided by Docker because it is used for task placement. If the
     * driver was installed using the Docker plugin CLI, use
     * <code>docker plugin ls</code> to retrieve the driver name from your
     * container instance. If the driver was installed using another method, use
     * Docker plugin discovery to retrieve the driver name. For more
     * information, see <a href=
     * "https://docs.docker.com/engine/extend/plugin_api/#plugin-discovery"
     * >Docker plugin discovery</a>. This parameter maps to <code>Driver</code>
     * in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     * >Create a volume</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>xxdriver</code> option to <a href=
     * "https://docs.docker.com/engine/reference/commandline/volume_create/"
     * >docker volume create</a>.
     * </p>
     */
    private String driver;

    /**
     * <p>
     * A map of Docker driver-specific options passed through. This parameter
     * maps to <code>DriverOpts</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     * >Create a volume</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>xxopt</code> option to <a href=
     * "https://docs.docker.com/engine/reference/commandline/volume_create/"
     * >docker volume create</a>.
     * </p>
     */
    private java.util.Map<String, String> driverOpts;

    /**
     * <p>
     * Custom metadata to add to your Docker volume. This parameter maps to
     * <code>Labels</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     * >Create a volume</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>xxlabel</code> option to <a href=
     * "https://docs.docker.com/engine/reference/commandline/volume_create/"
     * >docker volume create</a>.
     * </p>
     */
    private java.util.Map<String, String> labels;

    /**
     * <p>
     * The scope for the Docker volume that determines its lifecycle. Docker
     * volumes that are scoped to a <code>task</code> are automatically
     * provisioned when the task starts and destroyed when the task stops.
     * Docker volumes that are scoped as <code>shared</code> persist after the
     * task stops.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>task, shared
     *
     * @return <p>
     *         The scope for the Docker volume that determines its lifecycle.
     *         Docker volumes that are scoped to a <code>task</code> are
     *         automatically provisioned when the task starts and destroyed when
     *         the task stops. Docker volumes that are scoped as
     *         <code>shared</code> persist after the task stops.
     *         </p>
     * @see Scope
     */
    public String getScope() {
        return scope;
    }

    /**
     * <p>
     * The scope for the Docker volume that determines its lifecycle. Docker
     * volumes that are scoped to a <code>task</code> are automatically
     * provisioned when the task starts and destroyed when the task stops.
     * Docker volumes that are scoped as <code>shared</code> persist after the
     * task stops.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>task, shared
     *
     * @param scope <p>
     *            The scope for the Docker volume that determines its lifecycle.
     *            Docker volumes that are scoped to a <code>task</code> are
     *            automatically provisioned when the task starts and destroyed
     *            when the task stops. Docker volumes that are scoped as
     *            <code>shared</code> persist after the task stops.
     *            </p>
     * @see Scope
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The scope for the Docker volume that determines its lifecycle. Docker
     * volumes that are scoped to a <code>task</code> are automatically
     * provisioned when the task starts and destroyed when the task stops.
     * Docker volumes that are scoped as <code>shared</code> persist after the
     * task stops.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>task, shared
     *
     * @param scope <p>
     *            The scope for the Docker volume that determines its lifecycle.
     *            Docker volumes that are scoped to a <code>task</code> are
     *            automatically provisioned when the task starts and destroyed
     *            when the task stops. Docker volumes that are scoped as
     *            <code>shared</code> persist after the task stops.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scope
     */
    public DockerVolumeConfiguration withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * <p>
     * The scope for the Docker volume that determines its lifecycle. Docker
     * volumes that are scoped to a <code>task</code> are automatically
     * provisioned when the task starts and destroyed when the task stops.
     * Docker volumes that are scoped as <code>shared</code> persist after the
     * task stops.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>task, shared
     *
     * @param scope <p>
     *            The scope for the Docker volume that determines its lifecycle.
     *            Docker volumes that are scoped to a <code>task</code> are
     *            automatically provisioned when the task starts and destroyed
     *            when the task stops. Docker volumes that are scoped as
     *            <code>shared</code> persist after the task stops.
     *            </p>
     * @see Scope
     */
    public void setScope(Scope scope) {
        this.scope = scope.toString();
    }

    /**
     * <p>
     * The scope for the Docker volume that determines its lifecycle. Docker
     * volumes that are scoped to a <code>task</code> are automatically
     * provisioned when the task starts and destroyed when the task stops.
     * Docker volumes that are scoped as <code>shared</code> persist after the
     * task stops.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>task, shared
     *
     * @param scope <p>
     *            The scope for the Docker volume that determines its lifecycle.
     *            Docker volumes that are scoped to a <code>task</code> are
     *            automatically provisioned when the task starts and destroyed
     *            when the task stops. Docker volumes that are scoped as
     *            <code>shared</code> persist after the task stops.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scope
     */
    public DockerVolumeConfiguration withScope(Scope scope) {
        this.scope = scope.toString();
        return this;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the Docker volume is created if it
     * does not already exist.
     * </p>
     * <note>
     * <p>
     * This field is only used if the <code>scope</code> is <code>shared</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         If this value is <code>true</code>, the Docker volume is created
     *         if it does not already exist.
     *         </p>
     *         <note>
     *         <p>
     *         This field is only used if the <code>scope</code> is
     *         <code>shared</code>.
     *         </p>
     *         </note>
     */
    public Boolean isAutoprovision() {
        return autoprovision;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the Docker volume is created if it
     * does not already exist.
     * </p>
     * <note>
     * <p>
     * This field is only used if the <code>scope</code> is <code>shared</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         If this value is <code>true</code>, the Docker volume is created
     *         if it does not already exist.
     *         </p>
     *         <note>
     *         <p>
     *         This field is only used if the <code>scope</code> is
     *         <code>shared</code>.
     *         </p>
     *         </note>
     */
    public Boolean getAutoprovision() {
        return autoprovision;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the Docker volume is created if it
     * does not already exist.
     * </p>
     * <note>
     * <p>
     * This field is only used if the <code>scope</code> is <code>shared</code>.
     * </p>
     * </note>
     *
     * @param autoprovision <p>
     *            If this value is <code>true</code>, the Docker volume is
     *            created if it does not already exist.
     *            </p>
     *            <note>
     *            <p>
     *            This field is only used if the <code>scope</code> is
     *            <code>shared</code>.
     *            </p>
     *            </note>
     */
    public void setAutoprovision(Boolean autoprovision) {
        this.autoprovision = autoprovision;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the Docker volume is created if it
     * does not already exist.
     * </p>
     * <note>
     * <p>
     * This field is only used if the <code>scope</code> is <code>shared</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoprovision <p>
     *            If this value is <code>true</code>, the Docker volume is
     *            created if it does not already exist.
     *            </p>
     *            <note>
     *            <p>
     *            This field is only used if the <code>scope</code> is
     *            <code>shared</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DockerVolumeConfiguration withAutoprovision(Boolean autoprovision) {
        this.autoprovision = autoprovision;
        return this;
    }

    /**
     * <p>
     * The Docker volume driver to use. The driver value must match the driver
     * name provided by Docker because it is used for task placement. If the
     * driver was installed using the Docker plugin CLI, use
     * <code>docker plugin ls</code> to retrieve the driver name from your
     * container instance. If the driver was installed using another method, use
     * Docker plugin discovery to retrieve the driver name. For more
     * information, see <a href=
     * "https://docs.docker.com/engine/extend/plugin_api/#plugin-discovery"
     * >Docker plugin discovery</a>. This parameter maps to <code>Driver</code>
     * in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     * >Create a volume</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>xxdriver</code> option to <a href=
     * "https://docs.docker.com/engine/reference/commandline/volume_create/"
     * >docker volume create</a>.
     * </p>
     *
     * @return <p>
     *         The Docker volume driver to use. The driver value must match the
     *         driver name provided by Docker because it is used for task
     *         placement. If the driver was installed using the Docker plugin
     *         CLI, use <code>docker plugin ls</code> to retrieve the driver
     *         name from your container instance. If the driver was installed
     *         using another method, use Docker plugin discovery to retrieve the
     *         driver name. For more information, see <a href=
     *         "https://docs.docker.com/engine/extend/plugin_api/#plugin-discovery"
     *         >Docker plugin discovery</a>. This parameter maps to
     *         <code>Driver</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     *         >Create a volume</a> section of the <a
     *         href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *         API</a> and the <code>xxdriver</code> option to <a href=
     *         "https://docs.docker.com/engine/reference/commandline/volume_create/"
     *         >docker volume create</a>.
     *         </p>
     */
    public String getDriver() {
        return driver;
    }

    /**
     * <p>
     * The Docker volume driver to use. The driver value must match the driver
     * name provided by Docker because it is used for task placement. If the
     * driver was installed using the Docker plugin CLI, use
     * <code>docker plugin ls</code> to retrieve the driver name from your
     * container instance. If the driver was installed using another method, use
     * Docker plugin discovery to retrieve the driver name. For more
     * information, see <a href=
     * "https://docs.docker.com/engine/extend/plugin_api/#plugin-discovery"
     * >Docker plugin discovery</a>. This parameter maps to <code>Driver</code>
     * in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     * >Create a volume</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>xxdriver</code> option to <a href=
     * "https://docs.docker.com/engine/reference/commandline/volume_create/"
     * >docker volume create</a>.
     * </p>
     *
     * @param driver <p>
     *            The Docker volume driver to use. The driver value must match
     *            the driver name provided by Docker because it is used for task
     *            placement. If the driver was installed using the Docker plugin
     *            CLI, use <code>docker plugin ls</code> to retrieve the driver
     *            name from your container instance. If the driver was installed
     *            using another method, use Docker plugin discovery to retrieve
     *            the driver name. For more information, see <a href=
     *            "https://docs.docker.com/engine/extend/plugin_api/#plugin-discovery"
     *            >Docker plugin discovery</a>. This parameter maps to
     *            <code>Driver</code> in the <a
     *            href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     *            >Create a volume</a> section of the <a
     *            href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *            API</a> and the <code>xxdriver</code> option to <a href=
     *            "https://docs.docker.com/engine/reference/commandline/volume_create/"
     *            >docker volume create</a>.
     *            </p>
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * <p>
     * The Docker volume driver to use. The driver value must match the driver
     * name provided by Docker because it is used for task placement. If the
     * driver was installed using the Docker plugin CLI, use
     * <code>docker plugin ls</code> to retrieve the driver name from your
     * container instance. If the driver was installed using another method, use
     * Docker plugin discovery to retrieve the driver name. For more
     * information, see <a href=
     * "https://docs.docker.com/engine/extend/plugin_api/#plugin-discovery"
     * >Docker plugin discovery</a>. This parameter maps to <code>Driver</code>
     * in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     * >Create a volume</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>xxdriver</code> option to <a href=
     * "https://docs.docker.com/engine/reference/commandline/volume_create/"
     * >docker volume create</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param driver <p>
     *            The Docker volume driver to use. The driver value must match
     *            the driver name provided by Docker because it is used for task
     *            placement. If the driver was installed using the Docker plugin
     *            CLI, use <code>docker plugin ls</code> to retrieve the driver
     *            name from your container instance. If the driver was installed
     *            using another method, use Docker plugin discovery to retrieve
     *            the driver name. For more information, see <a href=
     *            "https://docs.docker.com/engine/extend/plugin_api/#plugin-discovery"
     *            >Docker plugin discovery</a>. This parameter maps to
     *            <code>Driver</code> in the <a
     *            href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     *            >Create a volume</a> section of the <a
     *            href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *            API</a> and the <code>xxdriver</code> option to <a href=
     *            "https://docs.docker.com/engine/reference/commandline/volume_create/"
     *            >docker volume create</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DockerVolumeConfiguration withDriver(String driver) {
        this.driver = driver;
        return this;
    }

    /**
     * <p>
     * A map of Docker driver-specific options passed through. This parameter
     * maps to <code>DriverOpts</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     * >Create a volume</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>xxopt</code> option to <a href=
     * "https://docs.docker.com/engine/reference/commandline/volume_create/"
     * >docker volume create</a>.
     * </p>
     *
     * @return <p>
     *         A map of Docker driver-specific options passed through. This
     *         parameter maps to <code>DriverOpts</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     *         >Create a volume</a> section of the <a
     *         href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *         API</a> and the <code>xxopt</code> option to <a href=
     *         "https://docs.docker.com/engine/reference/commandline/volume_create/"
     *         >docker volume create</a>.
     *         </p>
     */
    public java.util.Map<String, String> getDriverOpts() {
        return driverOpts;
    }

    /**
     * <p>
     * A map of Docker driver-specific options passed through. This parameter
     * maps to <code>DriverOpts</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     * >Create a volume</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>xxopt</code> option to <a href=
     * "https://docs.docker.com/engine/reference/commandline/volume_create/"
     * >docker volume create</a>.
     * </p>
     *
     * @param driverOpts <p>
     *            A map of Docker driver-specific options passed through. This
     *            parameter maps to <code>DriverOpts</code> in the <a
     *            href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     *            >Create a volume</a> section of the <a
     *            href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *            API</a> and the <code>xxopt</code> option to <a href=
     *            "https://docs.docker.com/engine/reference/commandline/volume_create/"
     *            >docker volume create</a>.
     *            </p>
     */
    public void setDriverOpts(java.util.Map<String, String> driverOpts) {
        this.driverOpts = driverOpts;
    }

    /**
     * <p>
     * A map of Docker driver-specific options passed through. This parameter
     * maps to <code>DriverOpts</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     * >Create a volume</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>xxopt</code> option to <a href=
     * "https://docs.docker.com/engine/reference/commandline/volume_create/"
     * >docker volume create</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param driverOpts <p>
     *            A map of Docker driver-specific options passed through. This
     *            parameter maps to <code>DriverOpts</code> in the <a
     *            href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     *            >Create a volume</a> section of the <a
     *            href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *            API</a> and the <code>xxopt</code> option to <a href=
     *            "https://docs.docker.com/engine/reference/commandline/volume_create/"
     *            >docker volume create</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DockerVolumeConfiguration withDriverOpts(java.util.Map<String, String> driverOpts) {
        this.driverOpts = driverOpts;
        return this;
    }

    /**
     * <p>
     * A map of Docker driver-specific options passed through. This parameter
     * maps to <code>DriverOpts</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     * >Create a volume</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>xxopt</code> option to <a href=
     * "https://docs.docker.com/engine/reference/commandline/volume_create/"
     * >docker volume create</a>.
     * </p>
     * <p>
     * The method adds a new key-value pair into driverOpts parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into driverOpts.
     * @param value The corresponding value of the entry to be added into
     *            driverOpts.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DockerVolumeConfiguration adddriverOptsEntry(String key, String value) {
        if (null == this.driverOpts) {
            this.driverOpts = new java.util.HashMap<String, String>();
        }
        if (this.driverOpts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.driverOpts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into driverOpts.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DockerVolumeConfiguration cleardriverOptsEntries() {
        this.driverOpts = null;
        return this;
    }

    /**
     * <p>
     * Custom metadata to add to your Docker volume. This parameter maps to
     * <code>Labels</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     * >Create a volume</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>xxlabel</code> option to <a href=
     * "https://docs.docker.com/engine/reference/commandline/volume_create/"
     * >docker volume create</a>.
     * </p>
     *
     * @return <p>
     *         Custom metadata to add to your Docker volume. This parameter maps
     *         to <code>Labels</code> in the <a
     *         href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     *         >Create a volume</a> section of the <a
     *         href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *         API</a> and the <code>xxlabel</code> option to <a href=
     *         "https://docs.docker.com/engine/reference/commandline/volume_create/"
     *         >docker volume create</a>.
     *         </p>
     */
    public java.util.Map<String, String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * Custom metadata to add to your Docker volume. This parameter maps to
     * <code>Labels</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     * >Create a volume</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>xxlabel</code> option to <a href=
     * "https://docs.docker.com/engine/reference/commandline/volume_create/"
     * >docker volume create</a>.
     * </p>
     *
     * @param labels <p>
     *            Custom metadata to add to your Docker volume. This parameter
     *            maps to <code>Labels</code> in the <a
     *            href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     *            >Create a volume</a> section of the <a
     *            href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *            API</a> and the <code>xxlabel</code> option to <a href=
     *            "https://docs.docker.com/engine/reference/commandline/volume_create/"
     *            >docker volume create</a>.
     *            </p>
     */
    public void setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
    }

    /**
     * <p>
     * Custom metadata to add to your Docker volume. This parameter maps to
     * <code>Labels</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     * >Create a volume</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>xxlabel</code> option to <a href=
     * "https://docs.docker.com/engine/reference/commandline/volume_create/"
     * >docker volume create</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            Custom metadata to add to your Docker volume. This parameter
     *            maps to <code>Labels</code> in the <a
     *            href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     *            >Create a volume</a> section of the <a
     *            href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *            API</a> and the <code>xxlabel</code> option to <a href=
     *            "https://docs.docker.com/engine/reference/commandline/volume_create/"
     *            >docker volume create</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DockerVolumeConfiguration withLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * <p>
     * Custom metadata to add to your Docker volume. This parameter maps to
     * <code>Labels</code> in the <a
     * href="https://docs.docker.com/engine/api/v1.35/#operation/VolumeCreate"
     * >Create a volume</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>xxlabel</code> option to <a href=
     * "https://docs.docker.com/engine/reference/commandline/volume_create/"
     * >docker volume create</a>.
     * </p>
     * <p>
     * The method adds a new key-value pair into labels parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into labels.
     * @param value The corresponding value of the entry to be added into
     *            labels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DockerVolumeConfiguration addlabelsEntry(String key, String value) {
        if (null == this.labels) {
            this.labels = new java.util.HashMap<String, String>();
        }
        if (this.labels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.labels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into labels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DockerVolumeConfiguration clearlabelsEntries() {
        this.labels = null;
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
        if (getScope() != null)
            sb.append("scope: " + getScope() + ",");
        if (getAutoprovision() != null)
            sb.append("autoprovision: " + getAutoprovision() + ",");
        if (getDriver() != null)
            sb.append("driver: " + getDriver() + ",");
        if (getDriverOpts() != null)
            sb.append("driverOpts: " + getDriverOpts() + ",");
        if (getLabels() != null)
            sb.append("labels: " + getLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode
                + ((getAutoprovision() == null) ? 0 : getAutoprovision().hashCode());
        hashCode = prime * hashCode + ((getDriver() == null) ? 0 : getDriver().hashCode());
        hashCode = prime * hashCode + ((getDriverOpts() == null) ? 0 : getDriverOpts().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DockerVolumeConfiguration == false)
            return false;
        DockerVolumeConfiguration other = (DockerVolumeConfiguration) obj;

        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getAutoprovision() == null ^ this.getAutoprovision() == null)
            return false;
        if (other.getAutoprovision() != null
                && other.getAutoprovision().equals(this.getAutoprovision()) == false)
            return false;
        if (other.getDriver() == null ^ this.getDriver() == null)
            return false;
        if (other.getDriver() != null && other.getDriver().equals(this.getDriver()) == false)
            return false;
        if (other.getDriverOpts() == null ^ this.getDriverOpts() == null)
            return false;
        if (other.getDriverOpts() != null
                && other.getDriverOpts().equals(this.getDriverOpts()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        return true;
    }
}
