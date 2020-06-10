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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes open ports on an instance, the IP addresses allowed to connect to
 * the instance through the ports, and the protocol.
 * </p>
 */
public class InstancePortState implements Serializable {
    /**
     * <p>
     * The first port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - The ICMP type. For example, specify <code>8</code> as the
     * <code>fromPort</code> (ICMP type), and <code>-1</code> as the
     * <code>toPort</code> (ICMP code), to enable ICMP Ping. For more
     * information, see <a href=
     * "https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages"
     * >Control Messages</a> on <i>Wikipedia</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 65535<br/>
     */
    private Integer fromPort;

    /**
     * <p>
     * The last port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - The ICMP code. For example, specify <code>8</code> as the
     * <code>fromPort</code> (ICMP type), and <code>-1</code> as the
     * <code>toPort</code> (ICMP code), to enable ICMP Ping. For more
     * information, see <a href=
     * "https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages"
     * >Control Messages</a> on <i>Wikipedia</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 65535<br/>
     */
    private Integer toPort;

    /**
     * <p>
     * The IP protocol name.
     * </p>
     * <p>
     * The name can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable,
     * ordered, and error-checked delivery of streamed data between applications
     * running on hosts communicating by an IP network. If you have an
     * application that doesn't require reliable data stream service, use UDP
     * instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> - All transport layer protocol types. For more general
     * information, see <a
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a>
     * on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>udp</code> - With User Datagram Protocol (UDP), computer
     * applications can send messages (or datagrams) to other hosts on an
     * Internet Protocol (IP) network. Prior communications are not required to
     * set up transmission channels or data paths. Applications that don't
     * require reliable data stream service can use UDP, which provides a
     * connectionless datagram service that emphasizes reduced latency over
     * reliability. If you do require reliable data stream service, use TCP
     * instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to
     * send error messages and operational information indicating success or
     * failure when communicating with an instance. For example, an error is
     * indicated when an instance could not be reached. When you specify
     * <code>icmp</code> as the <code>protocol</code>, you must specify the ICMP
     * type using the <code>fromPort</code> parameter, and ICMP code using the
     * <code>toPort</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, all, udp, icmp
     */
    private String protocol;

    /**
     * <p>
     * Specifies whether the instance port is <code>open</code> or
     * <code>closed</code>.
     * </p>
     * <note>
     * <p>
     * The port state for Lightsail instances is always <code>open</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, closed
     */
    private String state;

    /**
     * <p>
     * The IP address, or range of IP addresses in CIDR notation, that are
     * allowed to connect to an instance through the ports, and the protocol.
     * Lightsail supports IPv4 addresses.
     * </p>
     * <p>
     * For more information about CIDR block notation, see <a href=
     * "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation"
     * >Classless Inter-Domain Routing</a> on <i>Wikipedia</i>.
     * </p>
     */
    private java.util.List<String> cidrs;

    /**
     * <p>
     * An alias that defines access for a preconfigured range of IP addresses.
     * </p>
     * <p>
     * The only alias currently supported is <code>lightsail-connect</code>,
     * which allows IP addresses of the browser-based RDP/SSH client in the
     * Lightsail console to connect to your instance.
     * </p>
     */
    private java.util.List<String> cidrListAliases;

    /**
     * <p>
     * The first port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - The ICMP type. For example, specify <code>8</code> as the
     * <code>fromPort</code> (ICMP type), and <code>-1</code> as the
     * <code>toPort</code> (ICMP code), to enable ICMP Ping. For more
     * information, see <a href=
     * "https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages"
     * >Control Messages</a> on <i>Wikipedia</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 65535<br/>
     *
     * @return <p>
     *         The first port in a range of open ports on an instance.
     *         </p>
     *         <p>
     *         Allowed ports:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         TCP and UDP - <code>0</code> to <code>65535</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ICMP - The ICMP type. For example, specify <code>8</code> as the
     *         <code>fromPort</code> (ICMP type), and <code>-1</code> as the
     *         <code>toPort</code> (ICMP code), to enable ICMP Ping. For more
     *         information, see <a href=
     *         "https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages"
     *         >Control Messages</a> on <i>Wikipedia</i>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Integer getFromPort() {
        return fromPort;
    }

    /**
     * <p>
     * The first port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - The ICMP type. For example, specify <code>8</code> as the
     * <code>fromPort</code> (ICMP type), and <code>-1</code> as the
     * <code>toPort</code> (ICMP code), to enable ICMP Ping. For more
     * information, see <a href=
     * "https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages"
     * >Control Messages</a> on <i>Wikipedia</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 65535<br/>
     *
     * @param fromPort <p>
     *            The first port in a range of open ports on an instance.
     *            </p>
     *            <p>
     *            Allowed ports:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            TCP and UDP - <code>0</code> to <code>65535</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ICMP - The ICMP type. For example, specify <code>8</code> as
     *            the <code>fromPort</code> (ICMP type), and <code>-1</code> as
     *            the <code>toPort</code> (ICMP code), to enable ICMP Ping. For
     *            more information, see <a href=
     *            "https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages"
     *            >Control Messages</a> on <i>Wikipedia</i>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The first port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - The ICMP type. For example, specify <code>8</code> as the
     * <code>fromPort</code> (ICMP type), and <code>-1</code> as the
     * <code>toPort</code> (ICMP code), to enable ICMP Ping. For more
     * information, see <a href=
     * "https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages"
     * >Control Messages</a> on <i>Wikipedia</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 65535<br/>
     *
     * @param fromPort <p>
     *            The first port in a range of open ports on an instance.
     *            </p>
     *            <p>
     *            Allowed ports:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            TCP and UDP - <code>0</code> to <code>65535</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ICMP - The ICMP type. For example, specify <code>8</code> as
     *            the <code>fromPort</code> (ICMP type), and <code>-1</code> as
     *            the <code>toPort</code> (ICMP code), to enable ICMP Ping. For
     *            more information, see <a href=
     *            "https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages"
     *            >Control Messages</a> on <i>Wikipedia</i>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstancePortState withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    /**
     * <p>
     * The last port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - The ICMP code. For example, specify <code>8</code> as the
     * <code>fromPort</code> (ICMP type), and <code>-1</code> as the
     * <code>toPort</code> (ICMP code), to enable ICMP Ping. For more
     * information, see <a href=
     * "https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages"
     * >Control Messages</a> on <i>Wikipedia</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 65535<br/>
     *
     * @return <p>
     *         The last port in a range of open ports on an instance.
     *         </p>
     *         <p>
     *         Allowed ports:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         TCP and UDP - <code>0</code> to <code>65535</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ICMP - The ICMP code. For example, specify <code>8</code> as the
     *         <code>fromPort</code> (ICMP type), and <code>-1</code> as the
     *         <code>toPort</code> (ICMP code), to enable ICMP Ping. For more
     *         information, see <a href=
     *         "https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages"
     *         >Control Messages</a> on <i>Wikipedia</i>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Integer getToPort() {
        return toPort;
    }

    /**
     * <p>
     * The last port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - The ICMP code. For example, specify <code>8</code> as the
     * <code>fromPort</code> (ICMP type), and <code>-1</code> as the
     * <code>toPort</code> (ICMP code), to enable ICMP Ping. For more
     * information, see <a href=
     * "https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages"
     * >Control Messages</a> on <i>Wikipedia</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 65535<br/>
     *
     * @param toPort <p>
     *            The last port in a range of open ports on an instance.
     *            </p>
     *            <p>
     *            Allowed ports:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            TCP and UDP - <code>0</code> to <code>65535</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ICMP - The ICMP code. For example, specify <code>8</code> as
     *            the <code>fromPort</code> (ICMP type), and <code>-1</code> as
     *            the <code>toPort</code> (ICMP code), to enable ICMP Ping. For
     *            more information, see <a href=
     *            "https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages"
     *            >Control Messages</a> on <i>Wikipedia</i>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The last port in a range of open ports on an instance.
     * </p>
     * <p>
     * Allowed ports:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TCP and UDP - <code>0</code> to <code>65535</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ICMP - The ICMP code. For example, specify <code>8</code> as the
     * <code>fromPort</code> (ICMP type), and <code>-1</code> as the
     * <code>toPort</code> (ICMP code), to enable ICMP Ping. For more
     * information, see <a href=
     * "https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages"
     * >Control Messages</a> on <i>Wikipedia</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1 - 65535<br/>
     *
     * @param toPort <p>
     *            The last port in a range of open ports on an instance.
     *            </p>
     *            <p>
     *            Allowed ports:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            TCP and UDP - <code>0</code> to <code>65535</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ICMP - The ICMP code. For example, specify <code>8</code> as
     *            the <code>fromPort</code> (ICMP type), and <code>-1</code> as
     *            the <code>toPort</code> (ICMP code), to enable ICMP Ping. For
     *            more information, see <a href=
     *            "https://en.wikipedia.org/wiki/Internet_Control_Message_Protocol#Control_messages"
     *            >Control Messages</a> on <i>Wikipedia</i>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstancePortState withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    /**
     * <p>
     * The IP protocol name.
     * </p>
     * <p>
     * The name can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable,
     * ordered, and error-checked delivery of streamed data between applications
     * running on hosts communicating by an IP network. If you have an
     * application that doesn't require reliable data stream service, use UDP
     * instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> - All transport layer protocol types. For more general
     * information, see <a
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a>
     * on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>udp</code> - With User Datagram Protocol (UDP), computer
     * applications can send messages (or datagrams) to other hosts on an
     * Internet Protocol (IP) network. Prior communications are not required to
     * set up transmission channels or data paths. Applications that don't
     * require reliable data stream service can use UDP, which provides a
     * connectionless datagram service that emphasizes reduced latency over
     * reliability. If you do require reliable data stream service, use TCP
     * instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to
     * send error messages and operational information indicating success or
     * failure when communicating with an instance. For example, an error is
     * indicated when an instance could not be reached. When you specify
     * <code>icmp</code> as the <code>protocol</code>, you must specify the ICMP
     * type using the <code>fromPort</code> parameter, and ICMP code using the
     * <code>toPort</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, all, udp, icmp
     *
     * @return <p>
     *         The IP protocol name.
     *         </p>
     *         <p>
     *         The name can be one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>tcp</code> - Transmission Control Protocol (TCP) provides
     *         reliable, ordered, and error-checked delivery of streamed data
     *         between applications running on hosts communicating by an IP
     *         network. If you have an application that doesn't require reliable
     *         data stream service, use UDP instead.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>all</code> - All transport layer protocol types. For more
     *         general information, see <a
     *         href="https://en.wikipedia.org/wiki/Transport_layer">Transport
     *         layer</a> on <i>Wikipedia</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>udp</code> - With User Datagram Protocol (UDP), computer
     *         applications can send messages (or datagrams) to other hosts on
     *         an Internet Protocol (IP) network. Prior communications are not
     *         required to set up transmission channels or data paths.
     *         Applications that don't require reliable data stream service can
     *         use UDP, which provides a connectionless datagram service that
     *         emphasizes reduced latency over reliability. If you do require
     *         reliable data stream service, use TCP instead.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>icmp</code> - Internet Control Message Protocol (ICMP) is
     *         used to send error messages and operational information
     *         indicating success or failure when communicating with an
     *         instance. For example, an error is indicated when an instance
     *         could not be reached. When you specify <code>icmp</code> as the
     *         <code>protocol</code>, you must specify the ICMP type using the
     *         <code>fromPort</code> parameter, and ICMP code using the
     *         <code>toPort</code> parameter.
     *         </p>
     *         </li>
     *         </ul>
     * @see NetworkProtocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The IP protocol name.
     * </p>
     * <p>
     * The name can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable,
     * ordered, and error-checked delivery of streamed data between applications
     * running on hosts communicating by an IP network. If you have an
     * application that doesn't require reliable data stream service, use UDP
     * instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> - All transport layer protocol types. For more general
     * information, see <a
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a>
     * on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>udp</code> - With User Datagram Protocol (UDP), computer
     * applications can send messages (or datagrams) to other hosts on an
     * Internet Protocol (IP) network. Prior communications are not required to
     * set up transmission channels or data paths. Applications that don't
     * require reliable data stream service can use UDP, which provides a
     * connectionless datagram service that emphasizes reduced latency over
     * reliability. If you do require reliable data stream service, use TCP
     * instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to
     * send error messages and operational information indicating success or
     * failure when communicating with an instance. For example, an error is
     * indicated when an instance could not be reached. When you specify
     * <code>icmp</code> as the <code>protocol</code>, you must specify the ICMP
     * type using the <code>fromPort</code> parameter, and ICMP code using the
     * <code>toPort</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, all, udp, icmp
     *
     * @param protocol <p>
     *            The IP protocol name.
     *            </p>
     *            <p>
     *            The name can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>tcp</code> - Transmission Control Protocol (TCP)
     *            provides reliable, ordered, and error-checked delivery of
     *            streamed data between applications running on hosts
     *            communicating by an IP network. If you have an application
     *            that doesn't require reliable data stream service, use UDP
     *            instead.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>all</code> - All transport layer protocol types. For
     *            more general information, see <a
     *            href="https://en.wikipedia.org/wiki/Transport_layer">Transport
     *            layer</a> on <i>Wikipedia</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>udp</code> - With User Datagram Protocol (UDP), computer
     *            applications can send messages (or datagrams) to other hosts
     *            on an Internet Protocol (IP) network. Prior communications are
     *            not required to set up transmission channels or data paths.
     *            Applications that don't require reliable data stream service
     *            can use UDP, which provides a connectionless datagram service
     *            that emphasizes reduced latency over reliability. If you do
     *            require reliable data stream service, use TCP instead.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>icmp</code> - Internet Control Message Protocol (ICMP)
     *            is used to send error messages and operational information
     *            indicating success or failure when communicating with an
     *            instance. For example, an error is indicated when an instance
     *            could not be reached. When you specify <code>icmp</code> as
     *            the <code>protocol</code>, you must specify the ICMP type
     *            using the <code>fromPort</code> parameter, and ICMP code using
     *            the <code>toPort</code> parameter.
     *            </p>
     *            </li>
     *            </ul>
     * @see NetworkProtocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The IP protocol name.
     * </p>
     * <p>
     * The name can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable,
     * ordered, and error-checked delivery of streamed data between applications
     * running on hosts communicating by an IP network. If you have an
     * application that doesn't require reliable data stream service, use UDP
     * instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> - All transport layer protocol types. For more general
     * information, see <a
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a>
     * on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>udp</code> - With User Datagram Protocol (UDP), computer
     * applications can send messages (or datagrams) to other hosts on an
     * Internet Protocol (IP) network. Prior communications are not required to
     * set up transmission channels or data paths. Applications that don't
     * require reliable data stream service can use UDP, which provides a
     * connectionless datagram service that emphasizes reduced latency over
     * reliability. If you do require reliable data stream service, use TCP
     * instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to
     * send error messages and operational information indicating success or
     * failure when communicating with an instance. For example, an error is
     * indicated when an instance could not be reached. When you specify
     * <code>icmp</code> as the <code>protocol</code>, you must specify the ICMP
     * type using the <code>fromPort</code> parameter, and ICMP code using the
     * <code>toPort</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, all, udp, icmp
     *
     * @param protocol <p>
     *            The IP protocol name.
     *            </p>
     *            <p>
     *            The name can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>tcp</code> - Transmission Control Protocol (TCP)
     *            provides reliable, ordered, and error-checked delivery of
     *            streamed data between applications running on hosts
     *            communicating by an IP network. If you have an application
     *            that doesn't require reliable data stream service, use UDP
     *            instead.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>all</code> - All transport layer protocol types. For
     *            more general information, see <a
     *            href="https://en.wikipedia.org/wiki/Transport_layer">Transport
     *            layer</a> on <i>Wikipedia</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>udp</code> - With User Datagram Protocol (UDP), computer
     *            applications can send messages (or datagrams) to other hosts
     *            on an Internet Protocol (IP) network. Prior communications are
     *            not required to set up transmission channels or data paths.
     *            Applications that don't require reliable data stream service
     *            can use UDP, which provides a connectionless datagram service
     *            that emphasizes reduced latency over reliability. If you do
     *            require reliable data stream service, use TCP instead.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>icmp</code> - Internet Control Message Protocol (ICMP)
     *            is used to send error messages and operational information
     *            indicating success or failure when communicating with an
     *            instance. For example, an error is indicated when an instance
     *            could not be reached. When you specify <code>icmp</code> as
     *            the <code>protocol</code>, you must specify the ICMP type
     *            using the <code>fromPort</code> parameter, and ICMP code using
     *            the <code>toPort</code> parameter.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NetworkProtocol
     */
    public InstancePortState withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The IP protocol name.
     * </p>
     * <p>
     * The name can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable,
     * ordered, and error-checked delivery of streamed data between applications
     * running on hosts communicating by an IP network. If you have an
     * application that doesn't require reliable data stream service, use UDP
     * instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> - All transport layer protocol types. For more general
     * information, see <a
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a>
     * on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>udp</code> - With User Datagram Protocol (UDP), computer
     * applications can send messages (or datagrams) to other hosts on an
     * Internet Protocol (IP) network. Prior communications are not required to
     * set up transmission channels or data paths. Applications that don't
     * require reliable data stream service can use UDP, which provides a
     * connectionless datagram service that emphasizes reduced latency over
     * reliability. If you do require reliable data stream service, use TCP
     * instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to
     * send error messages and operational information indicating success or
     * failure when communicating with an instance. For example, an error is
     * indicated when an instance could not be reached. When you specify
     * <code>icmp</code> as the <code>protocol</code>, you must specify the ICMP
     * type using the <code>fromPort</code> parameter, and ICMP code using the
     * <code>toPort</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, all, udp, icmp
     *
     * @param protocol <p>
     *            The IP protocol name.
     *            </p>
     *            <p>
     *            The name can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>tcp</code> - Transmission Control Protocol (TCP)
     *            provides reliable, ordered, and error-checked delivery of
     *            streamed data between applications running on hosts
     *            communicating by an IP network. If you have an application
     *            that doesn't require reliable data stream service, use UDP
     *            instead.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>all</code> - All transport layer protocol types. For
     *            more general information, see <a
     *            href="https://en.wikipedia.org/wiki/Transport_layer">Transport
     *            layer</a> on <i>Wikipedia</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>udp</code> - With User Datagram Protocol (UDP), computer
     *            applications can send messages (or datagrams) to other hosts
     *            on an Internet Protocol (IP) network. Prior communications are
     *            not required to set up transmission channels or data paths.
     *            Applications that don't require reliable data stream service
     *            can use UDP, which provides a connectionless datagram service
     *            that emphasizes reduced latency over reliability. If you do
     *            require reliable data stream service, use TCP instead.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>icmp</code> - Internet Control Message Protocol (ICMP)
     *            is used to send error messages and operational information
     *            indicating success or failure when communicating with an
     *            instance. For example, an error is indicated when an instance
     *            could not be reached. When you specify <code>icmp</code> as
     *            the <code>protocol</code>, you must specify the ICMP type
     *            using the <code>fromPort</code> parameter, and ICMP code using
     *            the <code>toPort</code> parameter.
     *            </p>
     *            </li>
     *            </ul>
     * @see NetworkProtocol
     */
    public void setProtocol(NetworkProtocol protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * The IP protocol name.
     * </p>
     * <p>
     * The name can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tcp</code> - Transmission Control Protocol (TCP) provides reliable,
     * ordered, and error-checked delivery of streamed data between applications
     * running on hosts communicating by an IP network. If you have an
     * application that doesn't require reliable data stream service, use UDP
     * instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> - All transport layer protocol types. For more general
     * information, see <a
     * href="https://en.wikipedia.org/wiki/Transport_layer">Transport layer</a>
     * on <i>Wikipedia</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>udp</code> - With User Datagram Protocol (UDP), computer
     * applications can send messages (or datagrams) to other hosts on an
     * Internet Protocol (IP) network. Prior communications are not required to
     * set up transmission channels or data paths. Applications that don't
     * require reliable data stream service can use UDP, which provides a
     * connectionless datagram service that emphasizes reduced latency over
     * reliability. If you do require reliable data stream service, use TCP
     * instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>icmp</code> - Internet Control Message Protocol (ICMP) is used to
     * send error messages and operational information indicating success or
     * failure when communicating with an instance. For example, an error is
     * indicated when an instance could not be reached. When you specify
     * <code>icmp</code> as the <code>protocol</code>, you must specify the ICMP
     * type using the <code>fromPort</code> parameter, and ICMP code using the
     * <code>toPort</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>tcp, all, udp, icmp
     *
     * @param protocol <p>
     *            The IP protocol name.
     *            </p>
     *            <p>
     *            The name can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>tcp</code> - Transmission Control Protocol (TCP)
     *            provides reliable, ordered, and error-checked delivery of
     *            streamed data between applications running on hosts
     *            communicating by an IP network. If you have an application
     *            that doesn't require reliable data stream service, use UDP
     *            instead.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>all</code> - All transport layer protocol types. For
     *            more general information, see <a
     *            href="https://en.wikipedia.org/wiki/Transport_layer">Transport
     *            layer</a> on <i>Wikipedia</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>udp</code> - With User Datagram Protocol (UDP), computer
     *            applications can send messages (or datagrams) to other hosts
     *            on an Internet Protocol (IP) network. Prior communications are
     *            not required to set up transmission channels or data paths.
     *            Applications that don't require reliable data stream service
     *            can use UDP, which provides a connectionless datagram service
     *            that emphasizes reduced latency over reliability. If you do
     *            require reliable data stream service, use TCP instead.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>icmp</code> - Internet Control Message Protocol (ICMP)
     *            is used to send error messages and operational information
     *            indicating success or failure when communicating with an
     *            instance. For example, an error is indicated when an instance
     *            could not be reached. When you specify <code>icmp</code> as
     *            the <code>protocol</code>, you must specify the ICMP type
     *            using the <code>fromPort</code> parameter, and ICMP code using
     *            the <code>toPort</code> parameter.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NetworkProtocol
     */
    public InstancePortState withProtocol(NetworkProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the instance port is <code>open</code> or
     * <code>closed</code>.
     * </p>
     * <note>
     * <p>
     * The port state for Lightsail instances is always <code>open</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, closed
     *
     * @return <p>
     *         Specifies whether the instance port is <code>open</code> or
     *         <code>closed</code>.
     *         </p>
     *         <note>
     *         <p>
     *         The port state for Lightsail instances is always
     *         <code>open</code>.
     *         </p>
     *         </note>
     * @see PortState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * Specifies whether the instance port is <code>open</code> or
     * <code>closed</code>.
     * </p>
     * <note>
     * <p>
     * The port state for Lightsail instances is always <code>open</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, closed
     *
     * @param state <p>
     *            Specifies whether the instance port is <code>open</code> or
     *            <code>closed</code>.
     *            </p>
     *            <note>
     *            <p>
     *            The port state for Lightsail instances is always
     *            <code>open</code>.
     *            </p>
     *            </note>
     * @see PortState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Specifies whether the instance port is <code>open</code> or
     * <code>closed</code>.
     * </p>
     * <note>
     * <p>
     * The port state for Lightsail instances is always <code>open</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, closed
     *
     * @param state <p>
     *            Specifies whether the instance port is <code>open</code> or
     *            <code>closed</code>.
     *            </p>
     *            <note>
     *            <p>
     *            The port state for Lightsail instances is always
     *            <code>open</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PortState
     */
    public InstancePortState withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * Specifies whether the instance port is <code>open</code> or
     * <code>closed</code>.
     * </p>
     * <note>
     * <p>
     * The port state for Lightsail instances is always <code>open</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, closed
     *
     * @param state <p>
     *            Specifies whether the instance port is <code>open</code> or
     *            <code>closed</code>.
     *            </p>
     *            <note>
     *            <p>
     *            The port state for Lightsail instances is always
     *            <code>open</code>.
     *            </p>
     *            </note>
     * @see PortState
     */
    public void setState(PortState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * Specifies whether the instance port is <code>open</code> or
     * <code>closed</code>.
     * </p>
     * <note>
     * <p>
     * The port state for Lightsail instances is always <code>open</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, closed
     *
     * @param state <p>
     *            Specifies whether the instance port is <code>open</code> or
     *            <code>closed</code>.
     *            </p>
     *            <note>
     *            <p>
     *            The port state for Lightsail instances is always
     *            <code>open</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PortState
     */
    public InstancePortState withState(PortState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The IP address, or range of IP addresses in CIDR notation, that are
     * allowed to connect to an instance through the ports, and the protocol.
     * Lightsail supports IPv4 addresses.
     * </p>
     * <p>
     * For more information about CIDR block notation, see <a href=
     * "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation"
     * >Classless Inter-Domain Routing</a> on <i>Wikipedia</i>.
     * </p>
     *
     * @return <p>
     *         The IP address, or range of IP addresses in CIDR notation, that
     *         are allowed to connect to an instance through the ports, and the
     *         protocol. Lightsail supports IPv4 addresses.
     *         </p>
     *         <p>
     *         For more information about CIDR block notation, see <a href=
     *         "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation"
     *         >Classless Inter-Domain Routing</a> on <i>Wikipedia</i>.
     *         </p>
     */
    public java.util.List<String> getCidrs() {
        return cidrs;
    }

    /**
     * <p>
     * The IP address, or range of IP addresses in CIDR notation, that are
     * allowed to connect to an instance through the ports, and the protocol.
     * Lightsail supports IPv4 addresses.
     * </p>
     * <p>
     * For more information about CIDR block notation, see <a href=
     * "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation"
     * >Classless Inter-Domain Routing</a> on <i>Wikipedia</i>.
     * </p>
     *
     * @param cidrs <p>
     *            The IP address, or range of IP addresses in CIDR notation,
     *            that are allowed to connect to an instance through the ports,
     *            and the protocol. Lightsail supports IPv4 addresses.
     *            </p>
     *            <p>
     *            For more information about CIDR block notation, see <a href=
     *            "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation"
     *            >Classless Inter-Domain Routing</a> on <i>Wikipedia</i>.
     *            </p>
     */
    public void setCidrs(java.util.Collection<String> cidrs) {
        if (cidrs == null) {
            this.cidrs = null;
            return;
        }

        this.cidrs = new java.util.ArrayList<String>(cidrs);
    }

    /**
     * <p>
     * The IP address, or range of IP addresses in CIDR notation, that are
     * allowed to connect to an instance through the ports, and the protocol.
     * Lightsail supports IPv4 addresses.
     * </p>
     * <p>
     * For more information about CIDR block notation, see <a href=
     * "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation"
     * >Classless Inter-Domain Routing</a> on <i>Wikipedia</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrs <p>
     *            The IP address, or range of IP addresses in CIDR notation,
     *            that are allowed to connect to an instance through the ports,
     *            and the protocol. Lightsail supports IPv4 addresses.
     *            </p>
     *            <p>
     *            For more information about CIDR block notation, see <a href=
     *            "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation"
     *            >Classless Inter-Domain Routing</a> on <i>Wikipedia</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstancePortState withCidrs(String... cidrs) {
        if (getCidrs() == null) {
            this.cidrs = new java.util.ArrayList<String>(cidrs.length);
        }
        for (String value : cidrs) {
            this.cidrs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IP address, or range of IP addresses in CIDR notation, that are
     * allowed to connect to an instance through the ports, and the protocol.
     * Lightsail supports IPv4 addresses.
     * </p>
     * <p>
     * For more information about CIDR block notation, see <a href=
     * "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation"
     * >Classless Inter-Domain Routing</a> on <i>Wikipedia</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrs <p>
     *            The IP address, or range of IP addresses in CIDR notation,
     *            that are allowed to connect to an instance through the ports,
     *            and the protocol. Lightsail supports IPv4 addresses.
     *            </p>
     *            <p>
     *            For more information about CIDR block notation, see <a href=
     *            "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation"
     *            >Classless Inter-Domain Routing</a> on <i>Wikipedia</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstancePortState withCidrs(java.util.Collection<String> cidrs) {
        setCidrs(cidrs);
        return this;
    }

    /**
     * <p>
     * An alias that defines access for a preconfigured range of IP addresses.
     * </p>
     * <p>
     * The only alias currently supported is <code>lightsail-connect</code>,
     * which allows IP addresses of the browser-based RDP/SSH client in the
     * Lightsail console to connect to your instance.
     * </p>
     *
     * @return <p>
     *         An alias that defines access for a preconfigured range of IP
     *         addresses.
     *         </p>
     *         <p>
     *         The only alias currently supported is
     *         <code>lightsail-connect</code>, which allows IP addresses of the
     *         browser-based RDP/SSH client in the Lightsail console to connect
     *         to your instance.
     *         </p>
     */
    public java.util.List<String> getCidrListAliases() {
        return cidrListAliases;
    }

    /**
     * <p>
     * An alias that defines access for a preconfigured range of IP addresses.
     * </p>
     * <p>
     * The only alias currently supported is <code>lightsail-connect</code>,
     * which allows IP addresses of the browser-based RDP/SSH client in the
     * Lightsail console to connect to your instance.
     * </p>
     *
     * @param cidrListAliases <p>
     *            An alias that defines access for a preconfigured range of IP
     *            addresses.
     *            </p>
     *            <p>
     *            The only alias currently supported is
     *            <code>lightsail-connect</code>, which allows IP addresses of
     *            the browser-based RDP/SSH client in the Lightsail console to
     *            connect to your instance.
     *            </p>
     */
    public void setCidrListAliases(java.util.Collection<String> cidrListAliases) {
        if (cidrListAliases == null) {
            this.cidrListAliases = null;
            return;
        }

        this.cidrListAliases = new java.util.ArrayList<String>(cidrListAliases);
    }

    /**
     * <p>
     * An alias that defines access for a preconfigured range of IP addresses.
     * </p>
     * <p>
     * The only alias currently supported is <code>lightsail-connect</code>,
     * which allows IP addresses of the browser-based RDP/SSH client in the
     * Lightsail console to connect to your instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrListAliases <p>
     *            An alias that defines access for a preconfigured range of IP
     *            addresses.
     *            </p>
     *            <p>
     *            The only alias currently supported is
     *            <code>lightsail-connect</code>, which allows IP addresses of
     *            the browser-based RDP/SSH client in the Lightsail console to
     *            connect to your instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstancePortState withCidrListAliases(String... cidrListAliases) {
        if (getCidrListAliases() == null) {
            this.cidrListAliases = new java.util.ArrayList<String>(cidrListAliases.length);
        }
        for (String value : cidrListAliases) {
            this.cidrListAliases.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An alias that defines access for a preconfigured range of IP addresses.
     * </p>
     * <p>
     * The only alias currently supported is <code>lightsail-connect</code>,
     * which allows IP addresses of the browser-based RDP/SSH client in the
     * Lightsail console to connect to your instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrListAliases <p>
     *            An alias that defines access for a preconfigured range of IP
     *            addresses.
     *            </p>
     *            <p>
     *            The only alias currently supported is
     *            <code>lightsail-connect</code>, which allows IP addresses of
     *            the browser-based RDP/SSH client in the Lightsail console to
     *            connect to your instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstancePortState withCidrListAliases(java.util.Collection<String> cidrListAliases) {
        setCidrListAliases(cidrListAliases);
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
        if (getFromPort() != null)
            sb.append("fromPort: " + getFromPort() + ",");
        if (getToPort() != null)
            sb.append("toPort: " + getToPort() + ",");
        if (getProtocol() != null)
            sb.append("protocol: " + getProtocol() + ",");
        if (getState() != null)
            sb.append("state: " + getState() + ",");
        if (getCidrs() != null)
            sb.append("cidrs: " + getCidrs() + ",");
        if (getCidrListAliases() != null)
            sb.append("cidrListAliases: " + getCidrListAliases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCidrs() == null) ? 0 : getCidrs().hashCode());
        hashCode = prime * hashCode
                + ((getCidrListAliases() == null) ? 0 : getCidrListAliases().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstancePortState == false)
            return false;
        InstancePortState other = (InstancePortState) obj;

        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCidrs() == null ^ this.getCidrs() == null)
            return false;
        if (other.getCidrs() != null && other.getCidrs().equals(this.getCidrs()) == false)
            return false;
        if (other.getCidrListAliases() == null ^ this.getCidrListAliases() == null)
            return false;
        if (other.getCidrListAliases() != null
                && other.getCidrListAliases().equals(this.getCidrListAliases()) == false)
            return false;
        return true;
    }
}
