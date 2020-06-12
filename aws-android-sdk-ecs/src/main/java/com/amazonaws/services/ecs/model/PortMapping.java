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
 * Port mappings allow containers to access ports on the host container instance
 * to send or receive traffic. Port mappings are specified as part of the
 * container definition.
 * </p>
 * <p>
 * If you are using containers in a task with the <code>awsvpc</code> or
 * <code>host</code> network mode, exposed ports should be specified using
 * <code>containerPort</code>. The <code>hostPort</code> can be left blank or it
 * must be the same value as the <code>containerPort</code>.
 * </p>
 * <p>
 * After a task reaches the <code>RUNNING</code> status, manual and automatic
 * host and container port assignments are visible in the
 * <code>networkBindings</code> section of <a>DescribeTasks</a> API responses.
 * </p>
 */
public class PortMapping implements Serializable {
    /**
     * <p>
     * The port number on the container that is bound to the user-specified or
     * automatically assigned host port.
     * </p>
     * <p>
     * If you are using containers in a task with the <code>awsvpc</code> or
     * <code>host</code> network mode, exposed ports should be specified using
     * <code>containerPort</code>.
     * </p>
     * <p>
     * If you are using containers in a task with the <code>bridge</code>
     * network mode and you specify a container port and not a host port, your
     * container automatically receives a host port in the ephemeral port range.
     * For more information, see <code>hostPort</code>. Port mappings that are
     * automatically assigned in this way do not count toward the 100 reserved
     * ports limit of a container instance.
     * </p>
     * <important>
     * <p>
     * You cannot expose the same container port for multiple protocols. An
     * error will be returned if this is attempted.
     * </p>
     * </important>
     */
    private Integer containerPort;

    /**
     * <p>
     * The port number on the container instance to reserve for your container.
     * </p>
     * <p>
     * If you are using containers in a task with the <code>awsvpc</code> or
     * <code>host</code> network mode, the <code>hostPort</code> can either be
     * left blank or set to the same value as the <code>containerPort</code>.
     * </p>
     * <p>
     * If you are using containers in a task with the <code>bridge</code>
     * network mode, you can specify a non-reserved host port for your container
     * port mapping, or you can omit the <code>hostPort</code> (or set it to
     * <code>0</code>) while specifying a <code>containerPort</code> and your
     * container automatically receives a port in the ephemeral port range for
     * your container instance operating system and Docker version.
     * </p>
     * <p>
     * The default ephemeral port range for Docker version 1.6.0 and later is
     * listed on the instance under
     * <code>/proc/sys/net/ipv4/ip_local_port_range</code>. If this kernel
     * parameter is unavailable, the default ephemeral port range from 49153
     * through 65535 is used. Do not attempt to specify a host port in the
     * ephemeral port range as these are reserved for automatic assignment. In
     * general, ports below 32768 are outside of the ephemeral port range.
     * </p>
     * <note>
     * <p>
     * The default ephemeral port range from 49153 through 65535 is always used
     * for Docker versions before 1.6.0.
     * </p>
     * </note>
     * <p>
     * The default reserved ports are 22 for SSH, the Docker ports 2375 and
     * 2376, and the Amazon ECS container agent ports 51678-51680. Any host port
     * that was previously specified in a running task is also reserved while
     * the task is running (after a task stops, the host port is released). The
     * current reserved ports are displayed in the
     * <code>remainingResources</code> of <a>DescribeContainerInstances</a>
     * output. A container instance can have up to 100 reserved ports at a time,
     * including the default reserved ports. Automatically assigned ports don't
     * count toward the 100 reserved ports limit.
     * </p>
     */
    private Integer hostPort;

    /**
     * <p>
     * The protocol used for the port mapping. Valid values are <code>tcp</code>
     * and <code>udp</code>. The default is <code>tcp</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     */
    private String protocol;

    /**
     * <p>
     * The port number on the container that is bound to the user-specified or
     * automatically assigned host port.
     * </p>
     * <p>
     * If you are using containers in a task with the <code>awsvpc</code> or
     * <code>host</code> network mode, exposed ports should be specified using
     * <code>containerPort</code>.
     * </p>
     * <p>
     * If you are using containers in a task with the <code>bridge</code>
     * network mode and you specify a container port and not a host port, your
     * container automatically receives a host port in the ephemeral port range.
     * For more information, see <code>hostPort</code>. Port mappings that are
     * automatically assigned in this way do not count toward the 100 reserved
     * ports limit of a container instance.
     * </p>
     * <important>
     * <p>
     * You cannot expose the same container port for multiple protocols. An
     * error will be returned if this is attempted.
     * </p>
     * </important>
     *
     * @return <p>
     *         The port number on the container that is bound to the
     *         user-specified or automatically assigned host port.
     *         </p>
     *         <p>
     *         If you are using containers in a task with the
     *         <code>awsvpc</code> or <code>host</code> network mode, exposed
     *         ports should be specified using <code>containerPort</code>.
     *         </p>
     *         <p>
     *         If you are using containers in a task with the
     *         <code>bridge</code> network mode and you specify a container port
     *         and not a host port, your container automatically receives a host
     *         port in the ephemeral port range. For more information, see
     *         <code>hostPort</code>. Port mappings that are automatically
     *         assigned in this way do not count toward the 100 reserved ports
     *         limit of a container instance.
     *         </p>
     *         <important>
     *         <p>
     *         You cannot expose the same container port for multiple protocols.
     *         An error will be returned if this is attempted.
     *         </p>
     *         </important>
     */
    public Integer getContainerPort() {
        return containerPort;
    }

    /**
     * <p>
     * The port number on the container that is bound to the user-specified or
     * automatically assigned host port.
     * </p>
     * <p>
     * If you are using containers in a task with the <code>awsvpc</code> or
     * <code>host</code> network mode, exposed ports should be specified using
     * <code>containerPort</code>.
     * </p>
     * <p>
     * If you are using containers in a task with the <code>bridge</code>
     * network mode and you specify a container port and not a host port, your
     * container automatically receives a host port in the ephemeral port range.
     * For more information, see <code>hostPort</code>. Port mappings that are
     * automatically assigned in this way do not count toward the 100 reserved
     * ports limit of a container instance.
     * </p>
     * <important>
     * <p>
     * You cannot expose the same container port for multiple protocols. An
     * error will be returned if this is attempted.
     * </p>
     * </important>
     *
     * @param containerPort <p>
     *            The port number on the container that is bound to the
     *            user-specified or automatically assigned host port.
     *            </p>
     *            <p>
     *            If you are using containers in a task with the
     *            <code>awsvpc</code> or <code>host</code> network mode, exposed
     *            ports should be specified using <code>containerPort</code>.
     *            </p>
     *            <p>
     *            If you are using containers in a task with the
     *            <code>bridge</code> network mode and you specify a container
     *            port and not a host port, your container automatically
     *            receives a host port in the ephemeral port range. For more
     *            information, see <code>hostPort</code>. Port mappings that are
     *            automatically assigned in this way do not count toward the 100
     *            reserved ports limit of a container instance.
     *            </p>
     *            <important>
     *            <p>
     *            You cannot expose the same container port for multiple
     *            protocols. An error will be returned if this is attempted.
     *            </p>
     *            </important>
     */
    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    /**
     * <p>
     * The port number on the container that is bound to the user-specified or
     * automatically assigned host port.
     * </p>
     * <p>
     * If you are using containers in a task with the <code>awsvpc</code> or
     * <code>host</code> network mode, exposed ports should be specified using
     * <code>containerPort</code>.
     * </p>
     * <p>
     * If you are using containers in a task with the <code>bridge</code>
     * network mode and you specify a container port and not a host port, your
     * container automatically receives a host port in the ephemeral port range.
     * For more information, see <code>hostPort</code>. Port mappings that are
     * automatically assigned in this way do not count toward the 100 reserved
     * ports limit of a container instance.
     * </p>
     * <important>
     * <p>
     * You cannot expose the same container port for multiple protocols. An
     * error will be returned if this is attempted.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerPort <p>
     *            The port number on the container that is bound to the
     *            user-specified or automatically assigned host port.
     *            </p>
     *            <p>
     *            If you are using containers in a task with the
     *            <code>awsvpc</code> or <code>host</code> network mode, exposed
     *            ports should be specified using <code>containerPort</code>.
     *            </p>
     *            <p>
     *            If you are using containers in a task with the
     *            <code>bridge</code> network mode and you specify a container
     *            port and not a host port, your container automatically
     *            receives a host port in the ephemeral port range. For more
     *            information, see <code>hostPort</code>. Port mappings that are
     *            automatically assigned in this way do not count toward the 100
     *            reserved ports limit of a container instance.
     *            </p>
     *            <important>
     *            <p>
     *            You cannot expose the same container port for multiple
     *            protocols. An error will be returned if this is attempted.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PortMapping withContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    /**
     * <p>
     * The port number on the container instance to reserve for your container.
     * </p>
     * <p>
     * If you are using containers in a task with the <code>awsvpc</code> or
     * <code>host</code> network mode, the <code>hostPort</code> can either be
     * left blank or set to the same value as the <code>containerPort</code>.
     * </p>
     * <p>
     * If you are using containers in a task with the <code>bridge</code>
     * network mode, you can specify a non-reserved host port for your container
     * port mapping, or you can omit the <code>hostPort</code> (or set it to
     * <code>0</code>) while specifying a <code>containerPort</code> and your
     * container automatically receives a port in the ephemeral port range for
     * your container instance operating system and Docker version.
     * </p>
     * <p>
     * The default ephemeral port range for Docker version 1.6.0 and later is
     * listed on the instance under
     * <code>/proc/sys/net/ipv4/ip_local_port_range</code>. If this kernel
     * parameter is unavailable, the default ephemeral port range from 49153
     * through 65535 is used. Do not attempt to specify a host port in the
     * ephemeral port range as these are reserved for automatic assignment. In
     * general, ports below 32768 are outside of the ephemeral port range.
     * </p>
     * <note>
     * <p>
     * The default ephemeral port range from 49153 through 65535 is always used
     * for Docker versions before 1.6.0.
     * </p>
     * </note>
     * <p>
     * The default reserved ports are 22 for SSH, the Docker ports 2375 and
     * 2376, and the Amazon ECS container agent ports 51678-51680. Any host port
     * that was previously specified in a running task is also reserved while
     * the task is running (after a task stops, the host port is released). The
     * current reserved ports are displayed in the
     * <code>remainingResources</code> of <a>DescribeContainerInstances</a>
     * output. A container instance can have up to 100 reserved ports at a time,
     * including the default reserved ports. Automatically assigned ports don't
     * count toward the 100 reserved ports limit.
     * </p>
     *
     * @return <p>
     *         The port number on the container instance to reserve for your
     *         container.
     *         </p>
     *         <p>
     *         If you are using containers in a task with the
     *         <code>awsvpc</code> or <code>host</code> network mode, the
     *         <code>hostPort</code> can either be left blank or set to the same
     *         value as the <code>containerPort</code>.
     *         </p>
     *         <p>
     *         If you are using containers in a task with the
     *         <code>bridge</code> network mode, you can specify a non-reserved
     *         host port for your container port mapping, or you can omit the
     *         <code>hostPort</code> (or set it to <code>0</code>) while
     *         specifying a <code>containerPort</code> and your container
     *         automatically receives a port in the ephemeral port range for
     *         your container instance operating system and Docker version.
     *         </p>
     *         <p>
     *         The default ephemeral port range for Docker version 1.6.0 and
     *         later is listed on the instance under
     *         <code>/proc/sys/net/ipv4/ip_local_port_range</code>. If this
     *         kernel parameter is unavailable, the default ephemeral port range
     *         from 49153 through 65535 is used. Do not attempt to specify a
     *         host port in the ephemeral port range as these are reserved for
     *         automatic assignment. In general, ports below 32768 are outside
     *         of the ephemeral port range.
     *         </p>
     *         <note>
     *         <p>
     *         The default ephemeral port range from 49153 through 65535 is
     *         always used for Docker versions before 1.6.0.
     *         </p>
     *         </note>
     *         <p>
     *         The default reserved ports are 22 for SSH, the Docker ports 2375
     *         and 2376, and the Amazon ECS container agent ports 51678-51680.
     *         Any host port that was previously specified in a running task is
     *         also reserved while the task is running (after a task stops, the
     *         host port is released). The current reserved ports are displayed
     *         in the <code>remainingResources</code> of
     *         <a>DescribeContainerInstances</a> output. A container instance
     *         can have up to 100 reserved ports at a time, including the
     *         default reserved ports. Automatically assigned ports don't count
     *         toward the 100 reserved ports limit.
     *         </p>
     */
    public Integer getHostPort() {
        return hostPort;
    }

    /**
     * <p>
     * The port number on the container instance to reserve for your container.
     * </p>
     * <p>
     * If you are using containers in a task with the <code>awsvpc</code> or
     * <code>host</code> network mode, the <code>hostPort</code> can either be
     * left blank or set to the same value as the <code>containerPort</code>.
     * </p>
     * <p>
     * If you are using containers in a task with the <code>bridge</code>
     * network mode, you can specify a non-reserved host port for your container
     * port mapping, or you can omit the <code>hostPort</code> (or set it to
     * <code>0</code>) while specifying a <code>containerPort</code> and your
     * container automatically receives a port in the ephemeral port range for
     * your container instance operating system and Docker version.
     * </p>
     * <p>
     * The default ephemeral port range for Docker version 1.6.0 and later is
     * listed on the instance under
     * <code>/proc/sys/net/ipv4/ip_local_port_range</code>. If this kernel
     * parameter is unavailable, the default ephemeral port range from 49153
     * through 65535 is used. Do not attempt to specify a host port in the
     * ephemeral port range as these are reserved for automatic assignment. In
     * general, ports below 32768 are outside of the ephemeral port range.
     * </p>
     * <note>
     * <p>
     * The default ephemeral port range from 49153 through 65535 is always used
     * for Docker versions before 1.6.0.
     * </p>
     * </note>
     * <p>
     * The default reserved ports are 22 for SSH, the Docker ports 2375 and
     * 2376, and the Amazon ECS container agent ports 51678-51680. Any host port
     * that was previously specified in a running task is also reserved while
     * the task is running (after a task stops, the host port is released). The
     * current reserved ports are displayed in the
     * <code>remainingResources</code> of <a>DescribeContainerInstances</a>
     * output. A container instance can have up to 100 reserved ports at a time,
     * including the default reserved ports. Automatically assigned ports don't
     * count toward the 100 reserved ports limit.
     * </p>
     *
     * @param hostPort <p>
     *            The port number on the container instance to reserve for your
     *            container.
     *            </p>
     *            <p>
     *            If you are using containers in a task with the
     *            <code>awsvpc</code> or <code>host</code> network mode, the
     *            <code>hostPort</code> can either be left blank or set to the
     *            same value as the <code>containerPort</code>.
     *            </p>
     *            <p>
     *            If you are using containers in a task with the
     *            <code>bridge</code> network mode, you can specify a
     *            non-reserved host port for your container port mapping, or you
     *            can omit the <code>hostPort</code> (or set it to
     *            <code>0</code>) while specifying a <code>containerPort</code>
     *            and your container automatically receives a port in the
     *            ephemeral port range for your container instance operating
     *            system and Docker version.
     *            </p>
     *            <p>
     *            The default ephemeral port range for Docker version 1.6.0 and
     *            later is listed on the instance under
     *            <code>/proc/sys/net/ipv4/ip_local_port_range</code>. If this
     *            kernel parameter is unavailable, the default ephemeral port
     *            range from 49153 through 65535 is used. Do not attempt to
     *            specify a host port in the ephemeral port range as these are
     *            reserved for automatic assignment. In general, ports below
     *            32768 are outside of the ephemeral port range.
     *            </p>
     *            <note>
     *            <p>
     *            The default ephemeral port range from 49153 through 65535 is
     *            always used for Docker versions before 1.6.0.
     *            </p>
     *            </note>
     *            <p>
     *            The default reserved ports are 22 for SSH, the Docker ports
     *            2375 and 2376, and the Amazon ECS container agent ports
     *            51678-51680. Any host port that was previously specified in a
     *            running task is also reserved while the task is running (after
     *            a task stops, the host port is released). The current reserved
     *            ports are displayed in the <code>remainingResources</code> of
     *            <a>DescribeContainerInstances</a> output. A container instance
     *            can have up to 100 reserved ports at a time, including the
     *            default reserved ports. Automatically assigned ports don't
     *            count toward the 100 reserved ports limit.
     *            </p>
     */
    public void setHostPort(Integer hostPort) {
        this.hostPort = hostPort;
    }

    /**
     * <p>
     * The port number on the container instance to reserve for your container.
     * </p>
     * <p>
     * If you are using containers in a task with the <code>awsvpc</code> or
     * <code>host</code> network mode, the <code>hostPort</code> can either be
     * left blank or set to the same value as the <code>containerPort</code>.
     * </p>
     * <p>
     * If you are using containers in a task with the <code>bridge</code>
     * network mode, you can specify a non-reserved host port for your container
     * port mapping, or you can omit the <code>hostPort</code> (or set it to
     * <code>0</code>) while specifying a <code>containerPort</code> and your
     * container automatically receives a port in the ephemeral port range for
     * your container instance operating system and Docker version.
     * </p>
     * <p>
     * The default ephemeral port range for Docker version 1.6.0 and later is
     * listed on the instance under
     * <code>/proc/sys/net/ipv4/ip_local_port_range</code>. If this kernel
     * parameter is unavailable, the default ephemeral port range from 49153
     * through 65535 is used. Do not attempt to specify a host port in the
     * ephemeral port range as these are reserved for automatic assignment. In
     * general, ports below 32768 are outside of the ephemeral port range.
     * </p>
     * <note>
     * <p>
     * The default ephemeral port range from 49153 through 65535 is always used
     * for Docker versions before 1.6.0.
     * </p>
     * </note>
     * <p>
     * The default reserved ports are 22 for SSH, the Docker ports 2375 and
     * 2376, and the Amazon ECS container agent ports 51678-51680. Any host port
     * that was previously specified in a running task is also reserved while
     * the task is running (after a task stops, the host port is released). The
     * current reserved ports are displayed in the
     * <code>remainingResources</code> of <a>DescribeContainerInstances</a>
     * output. A container instance can have up to 100 reserved ports at a time,
     * including the default reserved ports. Automatically assigned ports don't
     * count toward the 100 reserved ports limit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostPort <p>
     *            The port number on the container instance to reserve for your
     *            container.
     *            </p>
     *            <p>
     *            If you are using containers in a task with the
     *            <code>awsvpc</code> or <code>host</code> network mode, the
     *            <code>hostPort</code> can either be left blank or set to the
     *            same value as the <code>containerPort</code>.
     *            </p>
     *            <p>
     *            If you are using containers in a task with the
     *            <code>bridge</code> network mode, you can specify a
     *            non-reserved host port for your container port mapping, or you
     *            can omit the <code>hostPort</code> (or set it to
     *            <code>0</code>) while specifying a <code>containerPort</code>
     *            and your container automatically receives a port in the
     *            ephemeral port range for your container instance operating
     *            system and Docker version.
     *            </p>
     *            <p>
     *            The default ephemeral port range for Docker version 1.6.0 and
     *            later is listed on the instance under
     *            <code>/proc/sys/net/ipv4/ip_local_port_range</code>. If this
     *            kernel parameter is unavailable, the default ephemeral port
     *            range from 49153 through 65535 is used. Do not attempt to
     *            specify a host port in the ephemeral port range as these are
     *            reserved for automatic assignment. In general, ports below
     *            32768 are outside of the ephemeral port range.
     *            </p>
     *            <note>
     *            <p>
     *            The default ephemeral port range from 49153 through 65535 is
     *            always used for Docker versions before 1.6.0.
     *            </p>
     *            </note>
     *            <p>
     *            The default reserved ports are 22 for SSH, the Docker ports
     *            2375 and 2376, and the Amazon ECS container agent ports
     *            51678-51680. Any host port that was previously specified in a
     *            running task is also reserved while the task is running (after
     *            a task stops, the host port is released). The current reserved
     *            ports are displayed in the <code>remainingResources</code> of
     *            <a>DescribeContainerInstances</a> output. A container instance
     *            can have up to 100 reserved ports at a time, including the
     *            default reserved ports. Automatically assigned ports don't
     *            count toward the 100 reserved ports limit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PortMapping withHostPort(Integer hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * <p>
     * The protocol used for the port mapping. Valid values are <code>tcp</code>
     * and <code>udp</code>. The default is <code>tcp</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @return <p>
     *         The protocol used for the port mapping. Valid values are
     *         <code>tcp</code> and <code>udp</code>. The default is
     *         <code>tcp</code>.
     *         </p>
     * @see TransportProtocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol used for the port mapping. Valid values are <code>tcp</code>
     * and <code>udp</code>. The default is <code>tcp</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param protocol <p>
     *            The protocol used for the port mapping. Valid values are
     *            <code>tcp</code> and <code>udp</code>. The default is
     *            <code>tcp</code>.
     *            </p>
     * @see TransportProtocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol used for the port mapping. Valid values are <code>tcp</code>
     * and <code>udp</code>. The default is <code>tcp</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param protocol <p>
     *            The protocol used for the port mapping. Valid values are
     *            <code>tcp</code> and <code>udp</code>. The default is
     *            <code>tcp</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransportProtocol
     */
    public PortMapping withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The protocol used for the port mapping. Valid values are <code>tcp</code>
     * and <code>udp</code>. The default is <code>tcp</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param protocol <p>
     *            The protocol used for the port mapping. Valid values are
     *            <code>tcp</code> and <code>udp</code>. The default is
     *            <code>tcp</code>.
     *            </p>
     * @see TransportProtocol
     */
    public void setProtocol(TransportProtocol protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * The protocol used for the port mapping. Valid values are <code>tcp</code>
     * and <code>udp</code>. The default is <code>tcp</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, udp
     *
     * @param protocol <p>
     *            The protocol used for the port mapping. Valid values are
     *            <code>tcp</code> and <code>udp</code>. The default is
     *            <code>tcp</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransportProtocol
     */
    public PortMapping withProtocol(TransportProtocol protocol) {
        this.protocol = protocol.toString();
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
        if (getContainerPort() != null)
            sb.append("containerPort: " + getContainerPort() + ",");
        if (getHostPort() != null)
            sb.append("hostPort: " + getHostPort() + ",");
        if (getProtocol() != null)
            sb.append("protocol: " + getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContainerPort() == null) ? 0 : getContainerPort().hashCode());
        hashCode = prime * hashCode + ((getHostPort() == null) ? 0 : getHostPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortMapping == false)
            return false;
        PortMapping other = (PortMapping) obj;

        if (other.getContainerPort() == null ^ this.getContainerPort() == null)
            return false;
        if (other.getContainerPort() != null
                && other.getContainerPort().equals(this.getContainerPort()) == false)
            return false;
        if (other.getHostPort() == null ^ this.getHostPort() == null)
            return false;
        if (other.getHostPort() != null && other.getHostPort().equals(this.getHostPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }
}
