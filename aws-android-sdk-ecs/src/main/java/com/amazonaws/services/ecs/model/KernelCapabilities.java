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
 * The Linux capabilities for the container that are added to or dropped from
 * the default configuration provided by Docker. For more information on the
 * default capabilities and the non-default available capabilities, see <a href=
 * "https://docs.docker.com/engine/reference/run/#runtime-privilege-and-linux-capabilities"
 * >Runtime privilege and Linux capabilities</a> in the <i>Docker run
 * reference</i>. For more detailed information on these Linux capabilities, see
 * the <a href="http://man7.org/linux/man-pages/man7/capabilities.7.html">
 * capabilities(7)</a> Linux manual page.
 * </p>
 */
public class KernelCapabilities implements Serializable {
    /**
     * <p>
     * The Linux capabilities for the container that have been added to the
     * default configuration provided by Docker. This parameter maps to
     * <code>CapAdd</code> in the <a href=
     * "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>--cap-add</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * The <code>SYS_PTRACE</code> capability is supported for tasks that use
     * the Fargate launch type if they are also using platform version 1.4.0.
     * The other capabilities are not supported for any platform versions.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     */
    private java.util.List<String> add;

    /**
     * <p>
     * The Linux capabilities for the container that have been removed from the
     * default configuration provided by Docker. This parameter maps to
     * <code>CapDrop</code> in the <a href=
     * "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>--cap-drop</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     */
    private java.util.List<String> drop;

    /**
     * <p>
     * The Linux capabilities for the container that have been added to the
     * default configuration provided by Docker. This parameter maps to
     * <code>CapAdd</code> in the <a href=
     * "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>--cap-add</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * The <code>SYS_PTRACE</code> capability is supported for tasks that use
     * the Fargate launch type if they are also using platform version 1.4.0.
     * The other capabilities are not supported for any platform versions.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     *
     * @return <p>
     *         The Linux capabilities for the container that have been added to
     *         the default configuration provided by Docker. This parameter maps
     *         to <code>CapAdd</code> in the <a href=
     *         "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     *         >Create a container</a> section of the <a
     *         href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *         API</a> and the <code>--cap-add</code> option to <a
     *         href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>SYS_PTRACE</code> capability is supported for tasks
     *         that use the Fargate launch type if they are also using platform
     *         version 1.4.0. The other capabilities are not supported for any
     *         platform versions.
     *         </p>
     *         </note>
     *         <p>
     *         Valid values:
     *         <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     *         </p>
     */
    public java.util.List<String> getAdd() {
        return add;
    }

    /**
     * <p>
     * The Linux capabilities for the container that have been added to the
     * default configuration provided by Docker. This parameter maps to
     * <code>CapAdd</code> in the <a href=
     * "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>--cap-add</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * The <code>SYS_PTRACE</code> capability is supported for tasks that use
     * the Fargate launch type if they are also using platform version 1.4.0.
     * The other capabilities are not supported for any platform versions.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     *
     * @param add <p>
     *            The Linux capabilities for the container that have been added
     *            to the default configuration provided by Docker. This
     *            parameter maps to <code>CapAdd</code> in the <a href=
     *            "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     *            >Create a container</a> section of the <a
     *            href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *            API</a> and the <code>--cap-add</code> option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a>.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>SYS_PTRACE</code> capability is supported for tasks
     *            that use the Fargate launch type if they are also using
     *            platform version 1.4.0. The other capabilities are not
     *            supported for any platform versions.
     *            </p>
     *            </note>
     *            <p>
     *            Valid values:
     *            <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     *            </p>
     */
    public void setAdd(java.util.Collection<String> add) {
        if (add == null) {
            this.add = null;
            return;
        }

        this.add = new java.util.ArrayList<String>(add);
    }

    /**
     * <p>
     * The Linux capabilities for the container that have been added to the
     * default configuration provided by Docker. This parameter maps to
     * <code>CapAdd</code> in the <a href=
     * "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>--cap-add</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * The <code>SYS_PTRACE</code> capability is supported for tasks that use
     * the Fargate launch type if they are also using platform version 1.4.0.
     * The other capabilities are not supported for any platform versions.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param add <p>
     *            The Linux capabilities for the container that have been added
     *            to the default configuration provided by Docker. This
     *            parameter maps to <code>CapAdd</code> in the <a href=
     *            "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     *            >Create a container</a> section of the <a
     *            href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *            API</a> and the <code>--cap-add</code> option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a>.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>SYS_PTRACE</code> capability is supported for tasks
     *            that use the Fargate launch type if they are also using
     *            platform version 1.4.0. The other capabilities are not
     *            supported for any platform versions.
     *            </p>
     *            </note>
     *            <p>
     *            Valid values:
     *            <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KernelCapabilities withAdd(String... add) {
        if (getAdd() == null) {
            this.add = new java.util.ArrayList<String>(add.length);
        }
        for (String value : add) {
            this.add.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Linux capabilities for the container that have been added to the
     * default configuration provided by Docker. This parameter maps to
     * <code>CapAdd</code> in the <a href=
     * "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>--cap-add</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <note>
     * <p>
     * The <code>SYS_PTRACE</code> capability is supported for tasks that use
     * the Fargate launch type if they are also using platform version 1.4.0.
     * The other capabilities are not supported for any platform versions.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param add <p>
     *            The Linux capabilities for the container that have been added
     *            to the default configuration provided by Docker. This
     *            parameter maps to <code>CapAdd</code> in the <a href=
     *            "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     *            >Create a container</a> section of the <a
     *            href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *            API</a> and the <code>--cap-add</code> option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a>.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>SYS_PTRACE</code> capability is supported for tasks
     *            that use the Fargate launch type if they are also using
     *            platform version 1.4.0. The other capabilities are not
     *            supported for any platform versions.
     *            </p>
     *            </note>
     *            <p>
     *            Valid values:
     *            <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KernelCapabilities withAdd(java.util.Collection<String> add) {
        setAdd(add);
        return this;
    }

    /**
     * <p>
     * The Linux capabilities for the container that have been removed from the
     * default configuration provided by Docker. This parameter maps to
     * <code>CapDrop</code> in the <a href=
     * "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>--cap-drop</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     *
     * @return <p>
     *         The Linux capabilities for the container that have been removed
     *         from the default configuration provided by Docker. This parameter
     *         maps to <code>CapDrop</code> in the <a href=
     *         "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     *         >Create a container</a> section of the <a
     *         href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *         API</a> and the <code>--cap-drop</code> option to <a
     *         href="https://docs.docker.com/engine/reference/run/">docker
     *         run</a>.
     *         </p>
     *         <p>
     *         Valid values:
     *         <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     *         </p>
     */
    public java.util.List<String> getDrop() {
        return drop;
    }

    /**
     * <p>
     * The Linux capabilities for the container that have been removed from the
     * default configuration provided by Docker. This parameter maps to
     * <code>CapDrop</code> in the <a href=
     * "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>--cap-drop</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     *
     * @param drop <p>
     *            The Linux capabilities for the container that have been
     *            removed from the default configuration provided by Docker.
     *            This parameter maps to <code>CapDrop</code> in the <a href=
     *            "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     *            >Create a container</a> section of the <a
     *            href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *            API</a> and the <code>--cap-drop</code> option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a>.
     *            </p>
     *            <p>
     *            Valid values:
     *            <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     *            </p>
     */
    public void setDrop(java.util.Collection<String> drop) {
        if (drop == null) {
            this.drop = null;
            return;
        }

        this.drop = new java.util.ArrayList<String>(drop);
    }

    /**
     * <p>
     * The Linux capabilities for the container that have been removed from the
     * default configuration provided by Docker. This parameter maps to
     * <code>CapDrop</code> in the <a href=
     * "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>--cap-drop</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param drop <p>
     *            The Linux capabilities for the container that have been
     *            removed from the default configuration provided by Docker.
     *            This parameter maps to <code>CapDrop</code> in the <a href=
     *            "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     *            >Create a container</a> section of the <a
     *            href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *            API</a> and the <code>--cap-drop</code> option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a>.
     *            </p>
     *            <p>
     *            Valid values:
     *            <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KernelCapabilities withDrop(String... drop) {
        if (getDrop() == null) {
            this.drop = new java.util.ArrayList<String>(drop.length);
        }
        for (String value : drop) {
            this.drop.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Linux capabilities for the container that have been removed from the
     * default configuration provided by Docker. This parameter maps to
     * <code>CapDrop</code> in the <a href=
     * "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     * >Create a container</a> section of the <a
     * href="https://docs.docker.com/engine/api/v1.35/">Docker Remote API</a>
     * and the <code>--cap-drop</code> option to <a
     * href="https://docs.docker.com/engine/reference/run/">docker run</a>.
     * </p>
     * <p>
     * Valid values:
     * <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param drop <p>
     *            The Linux capabilities for the container that have been
     *            removed from the default configuration provided by Docker.
     *            This parameter maps to <code>CapDrop</code> in the <a href=
     *            "https://docs.docker.com/engine/api/v1.35/#operation/ContainerCreate"
     *            >Create a container</a> section of the <a
     *            href="https://docs.docker.com/engine/api/v1.35/">Docker Remote
     *            API</a> and the <code>--cap-drop</code> option to <a
     *            href="https://docs.docker.com/engine/reference/run/">docker
     *            run</a>.
     *            </p>
     *            <p>
     *            Valid values:
     *            <code>"ALL" | "AUDIT_CONTROL" | "AUDIT_WRITE" | "BLOCK_SUSPEND" | "CHOWN" | "DAC_OVERRIDE" | "DAC_READ_SEARCH" | "FOWNER" | "FSETID" | "IPC_LOCK" | "IPC_OWNER" | "KILL" | "LEASE" | "LINUX_IMMUTABLE" | "MAC_ADMIN" | "MAC_OVERRIDE" | "MKNOD" | "NET_ADMIN" | "NET_BIND_SERVICE" | "NET_BROADCAST" | "NET_RAW" | "SETFCAP" | "SETGID" | "SETPCAP" | "SETUID" | "SYS_ADMIN" | "SYS_BOOT" | "SYS_CHROOT" | "SYS_MODULE" | "SYS_NICE" | "SYS_PACCT" | "SYS_PTRACE" | "SYS_RAWIO" | "SYS_RESOURCE" | "SYS_TIME" | "SYS_TTY_CONFIG" | "SYSLOG" | "WAKE_ALARM"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KernelCapabilities withDrop(java.util.Collection<String> drop) {
        setDrop(drop);
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
        if (getAdd() != null)
            sb.append("add: " + getAdd() + ",");
        if (getDrop() != null)
            sb.append("drop: " + getDrop());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdd() == null) ? 0 : getAdd().hashCode());
        hashCode = prime * hashCode + ((getDrop() == null) ? 0 : getDrop().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KernelCapabilities == false)
            return false;
        KernelCapabilities other = (KernelCapabilities) obj;

        if (other.getAdd() == null ^ this.getAdd() == null)
            return false;
        if (other.getAdd() != null && other.getAdd().equals(this.getAdd()) == false)
            return false;
        if (other.getDrop() == null ^ this.getDrop() == null)
            return false;
        if (other.getDrop() != null && other.getDrop().equals(this.getDrop()) == false)
            return false;
        return true;
    }
}
