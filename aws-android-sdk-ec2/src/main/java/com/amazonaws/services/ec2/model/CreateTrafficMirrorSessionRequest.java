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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a Traffic Mirror session.
 * </p>
 * <p>
 * A Traffic Mirror session actively copies packets from a Traffic Mirror source
 * to a Traffic Mirror target. Create a filter, and then assign it to the
 * session to define a subset of the traffic to mirror, for example all TCP
 * traffic.
 * </p>
 * <p>
 * The Traffic Mirror source and the Traffic Mirror target (monitoring
 * appliances) can be in the same VPC, or in a different VPC connected via VPC
 * peering or a transit gateway.
 * </p>
 * <p>
 * By default, no traffic is mirrored. Use <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTrafficMirrorFilter.htm"
 * >CreateTrafficMirrorFilter</a> to create filter rules that specify the
 * traffic to mirror.
 * </p>
 */
public class CreateTrafficMirrorSessionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the source network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     */
    private String trafficMirrorTargetId;

    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     */
    private String trafficMirrorFilterId;

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are bytes after the
     * VXLAN header. Do not specify this parameter when you want to mirror the
     * entire packet. To mirror a subset of the packet, set this to the length
     * (in bytes) that you want to mirror. For example, if you set this value to
     * 100, then the first 100 bytes that meet the filter criteria are copied to
     * the target.
     * </p>
     * <p>
     * If you do not want to mirror the entire packet, use the
     * <code>PacketLength</code> parameter to specify the number of bytes in
     * each packet to mirror.
     * </p>
     */
    private Integer packetLength;

    /**
     * <p>
     * The session number determines the order in which sessions are evaluated
     * when an interface is used by multiple sessions. The first session with a
     * matching filter is the one that mirrors the packets.
     * </p>
     * <p>
     * Valid values are 1-32766.
     * </p>
     */
    private Integer sessionNumber;

    /**
     * <p>
     * The VXLAN ID for the Traffic Mirror session. For more information about
     * the VXLAN protocol, see <a href="https://tools.ietf.org/html/rfc7348">RFC
     * 7348</a>. If you do not specify a <code>VirtualNetworkId</code>, an
     * account-wide unique id is chosen at random.
     * </p>
     */
    private Integer virtualNetworkId;

    /**
     * <p>
     * The description of the Traffic Mirror session.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The tags to assign to a Traffic Mirror session.
     * </p>
     */
    private java.util.List<TagSpecification> tagSpecifications;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the source network interface.
     * </p>
     *
     * @return <p>
     *         The ID of the source network interface.
     *         </p>
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the source network interface.
     * </p>
     *
     * @param networkInterfaceId <p>
     *            The ID of the source network interface.
     *            </p>
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the source network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceId <p>
     *            The ID of the source network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficMirrorSessionRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     *
     * @return <p>
     *         The ID of the Traffic Mirror target.
     *         </p>
     */
    public String getTrafficMirrorTargetId() {
        return trafficMirrorTargetId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     *
     * @param trafficMirrorTargetId <p>
     *            The ID of the Traffic Mirror target.
     *            </p>
     */
    public void setTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficMirrorTargetId <p>
     *            The ID of the Traffic Mirror target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficMirrorSessionRequest withTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
        return this;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     *
     * @return <p>
     *         The ID of the Traffic Mirror filter.
     *         </p>
     */
    public String getTrafficMirrorFilterId() {
        return trafficMirrorFilterId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     *
     * @param trafficMirrorFilterId <p>
     *            The ID of the Traffic Mirror filter.
     *            </p>
     */
    public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficMirrorFilterId <p>
     *            The ID of the Traffic Mirror filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficMirrorSessionRequest withTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are bytes after the
     * VXLAN header. Do not specify this parameter when you want to mirror the
     * entire packet. To mirror a subset of the packet, set this to the length
     * (in bytes) that you want to mirror. For example, if you set this value to
     * 100, then the first 100 bytes that meet the filter criteria are copied to
     * the target.
     * </p>
     * <p>
     * If you do not want to mirror the entire packet, use the
     * <code>PacketLength</code> parameter to specify the number of bytes in
     * each packet to mirror.
     * </p>
     *
     * @return <p>
     *         The number of bytes in each packet to mirror. These are bytes
     *         after the VXLAN header. Do not specify this parameter when you
     *         want to mirror the entire packet. To mirror a subset of the
     *         packet, set this to the length (in bytes) that you want to
     *         mirror. For example, if you set this value to 100, then the first
     *         100 bytes that meet the filter criteria are copied to the target.
     *         </p>
     *         <p>
     *         If you do not want to mirror the entire packet, use the
     *         <code>PacketLength</code> parameter to specify the number of
     *         bytes in each packet to mirror.
     *         </p>
     */
    public Integer getPacketLength() {
        return packetLength;
    }

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are bytes after the
     * VXLAN header. Do not specify this parameter when you want to mirror the
     * entire packet. To mirror a subset of the packet, set this to the length
     * (in bytes) that you want to mirror. For example, if you set this value to
     * 100, then the first 100 bytes that meet the filter criteria are copied to
     * the target.
     * </p>
     * <p>
     * If you do not want to mirror the entire packet, use the
     * <code>PacketLength</code> parameter to specify the number of bytes in
     * each packet to mirror.
     * </p>
     *
     * @param packetLength <p>
     *            The number of bytes in each packet to mirror. These are bytes
     *            after the VXLAN header. Do not specify this parameter when you
     *            want to mirror the entire packet. To mirror a subset of the
     *            packet, set this to the length (in bytes) that you want to
     *            mirror. For example, if you set this value to 100, then the
     *            first 100 bytes that meet the filter criteria are copied to
     *            the target.
     *            </p>
     *            <p>
     *            If you do not want to mirror the entire packet, use the
     *            <code>PacketLength</code> parameter to specify the number of
     *            bytes in each packet to mirror.
     *            </p>
     */
    public void setPacketLength(Integer packetLength) {
        this.packetLength = packetLength;
    }

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are bytes after the
     * VXLAN header. Do not specify this parameter when you want to mirror the
     * entire packet. To mirror a subset of the packet, set this to the length
     * (in bytes) that you want to mirror. For example, if you set this value to
     * 100, then the first 100 bytes that meet the filter criteria are copied to
     * the target.
     * </p>
     * <p>
     * If you do not want to mirror the entire packet, use the
     * <code>PacketLength</code> parameter to specify the number of bytes in
     * each packet to mirror.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param packetLength <p>
     *            The number of bytes in each packet to mirror. These are bytes
     *            after the VXLAN header. Do not specify this parameter when you
     *            want to mirror the entire packet. To mirror a subset of the
     *            packet, set this to the length (in bytes) that you want to
     *            mirror. For example, if you set this value to 100, then the
     *            first 100 bytes that meet the filter criteria are copied to
     *            the target.
     *            </p>
     *            <p>
     *            If you do not want to mirror the entire packet, use the
     *            <code>PacketLength</code> parameter to specify the number of
     *            bytes in each packet to mirror.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficMirrorSessionRequest withPacketLength(Integer packetLength) {
        this.packetLength = packetLength;
        return this;
    }

    /**
     * <p>
     * The session number determines the order in which sessions are evaluated
     * when an interface is used by multiple sessions. The first session with a
     * matching filter is the one that mirrors the packets.
     * </p>
     * <p>
     * Valid values are 1-32766.
     * </p>
     *
     * @return <p>
     *         The session number determines the order in which sessions are
     *         evaluated when an interface is used by multiple sessions. The
     *         first session with a matching filter is the one that mirrors the
     *         packets.
     *         </p>
     *         <p>
     *         Valid values are 1-32766.
     *         </p>
     */
    public Integer getSessionNumber() {
        return sessionNumber;
    }

    /**
     * <p>
     * The session number determines the order in which sessions are evaluated
     * when an interface is used by multiple sessions. The first session with a
     * matching filter is the one that mirrors the packets.
     * </p>
     * <p>
     * Valid values are 1-32766.
     * </p>
     *
     * @param sessionNumber <p>
     *            The session number determines the order in which sessions are
     *            evaluated when an interface is used by multiple sessions. The
     *            first session with a matching filter is the one that mirrors
     *            the packets.
     *            </p>
     *            <p>
     *            Valid values are 1-32766.
     *            </p>
     */
    public void setSessionNumber(Integer sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    /**
     * <p>
     * The session number determines the order in which sessions are evaluated
     * when an interface is used by multiple sessions. The first session with a
     * matching filter is the one that mirrors the packets.
     * </p>
     * <p>
     * Valid values are 1-32766.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionNumber <p>
     *            The session number determines the order in which sessions are
     *            evaluated when an interface is used by multiple sessions. The
     *            first session with a matching filter is the one that mirrors
     *            the packets.
     *            </p>
     *            <p>
     *            Valid values are 1-32766.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficMirrorSessionRequest withSessionNumber(Integer sessionNumber) {
        this.sessionNumber = sessionNumber;
        return this;
    }

    /**
     * <p>
     * The VXLAN ID for the Traffic Mirror session. For more information about
     * the VXLAN protocol, see <a href="https://tools.ietf.org/html/rfc7348">RFC
     * 7348</a>. If you do not specify a <code>VirtualNetworkId</code>, an
     * account-wide unique id is chosen at random.
     * </p>
     *
     * @return <p>
     *         The VXLAN ID for the Traffic Mirror session. For more information
     *         about the VXLAN protocol, see <a
     *         href="https://tools.ietf.org/html/rfc7348">RFC 7348</a>. If you
     *         do not specify a <code>VirtualNetworkId</code>, an account-wide
     *         unique id is chosen at random.
     *         </p>
     */
    public Integer getVirtualNetworkId() {
        return virtualNetworkId;
    }

    /**
     * <p>
     * The VXLAN ID for the Traffic Mirror session. For more information about
     * the VXLAN protocol, see <a href="https://tools.ietf.org/html/rfc7348">RFC
     * 7348</a>. If you do not specify a <code>VirtualNetworkId</code>, an
     * account-wide unique id is chosen at random.
     * </p>
     *
     * @param virtualNetworkId <p>
     *            The VXLAN ID for the Traffic Mirror session. For more
     *            information about the VXLAN protocol, see <a
     *            href="https://tools.ietf.org/html/rfc7348">RFC 7348</a>. If
     *            you do not specify a <code>VirtualNetworkId</code>, an
     *            account-wide unique id is chosen at random.
     *            </p>
     */
    public void setVirtualNetworkId(Integer virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
    }

    /**
     * <p>
     * The VXLAN ID for the Traffic Mirror session. For more information about
     * the VXLAN protocol, see <a href="https://tools.ietf.org/html/rfc7348">RFC
     * 7348</a>. If you do not specify a <code>VirtualNetworkId</code>, an
     * account-wide unique id is chosen at random.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualNetworkId <p>
     *            The VXLAN ID for the Traffic Mirror session. For more
     *            information about the VXLAN protocol, see <a
     *            href="https://tools.ietf.org/html/rfc7348">RFC 7348</a>. If
     *            you do not specify a <code>VirtualNetworkId</code>, an
     *            account-wide unique id is chosen at random.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficMirrorSessionRequest withVirtualNetworkId(Integer virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
        return this;
    }

    /**
     * <p>
     * The description of the Traffic Mirror session.
     * </p>
     *
     * @return <p>
     *         The description of the Traffic Mirror session.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the Traffic Mirror session.
     * </p>
     *
     * @param description <p>
     *            The description of the Traffic Mirror session.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the Traffic Mirror session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the Traffic Mirror session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficMirrorSessionRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The tags to assign to a Traffic Mirror session.
     * </p>
     *
     * @return <p>
     *         The tags to assign to a Traffic Mirror session.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to assign to a Traffic Mirror session.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The tags to assign to a Traffic Mirror session.
     *            </p>
     */
    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new java.util.ArrayList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to assign to a Traffic Mirror session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to assign to a Traffic Mirror session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficMirrorSessionRequest withTagSpecifications(
            TagSpecification... tagSpecifications) {
        if (getTagSpecifications() == null) {
            this.tagSpecifications = new java.util.ArrayList<TagSpecification>(
                    tagSpecifications.length);
        }
        for (TagSpecification value : tagSpecifications) {
            this.tagSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to assign to a Traffic Mirror session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to assign to a Traffic Mirror session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficMirrorSessionRequest withTagSpecifications(
            java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficMirrorSessionRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >How to Ensure Idempotency</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrafficMirrorSessionRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getTrafficMirrorTargetId() != null)
            sb.append("TrafficMirrorTargetId: " + getTrafficMirrorTargetId() + ",");
        if (getTrafficMirrorFilterId() != null)
            sb.append("TrafficMirrorFilterId: " + getTrafficMirrorFilterId() + ",");
        if (getPacketLength() != null)
            sb.append("PacketLength: " + getPacketLength() + ",");
        if (getSessionNumber() != null)
            sb.append("SessionNumber: " + getSessionNumber() + ",");
        if (getVirtualNetworkId() != null)
            sb.append("VirtualNetworkId: " + getVirtualNetworkId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrafficMirrorTargetId() == null) ? 0 : getTrafficMirrorTargetId().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrafficMirrorFilterId() == null) ? 0 : getTrafficMirrorFilterId().hashCode());
        hashCode = prime * hashCode
                + ((getPacketLength() == null) ? 0 : getPacketLength().hashCode());
        hashCode = prime * hashCode
                + ((getSessionNumber() == null) ? 0 : getSessionNumber().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualNetworkId() == null) ? 0 : getVirtualNetworkId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrafficMirrorSessionRequest == false)
            return false;
        CreateTrafficMirrorSessionRequest other = (CreateTrafficMirrorSessionRequest) obj;

        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getTrafficMirrorTargetId() == null ^ this.getTrafficMirrorTargetId() == null)
            return false;
        if (other.getTrafficMirrorTargetId() != null
                && other.getTrafficMirrorTargetId().equals(this.getTrafficMirrorTargetId()) == false)
            return false;
        if (other.getTrafficMirrorFilterId() == null ^ this.getTrafficMirrorFilterId() == null)
            return false;
        if (other.getTrafficMirrorFilterId() != null
                && other.getTrafficMirrorFilterId().equals(this.getTrafficMirrorFilterId()) == false)
            return false;
        if (other.getPacketLength() == null ^ this.getPacketLength() == null)
            return false;
        if (other.getPacketLength() != null
                && other.getPacketLength().equals(this.getPacketLength()) == false)
            return false;
        if (other.getSessionNumber() == null ^ this.getSessionNumber() == null)
            return false;
        if (other.getSessionNumber() != null
                && other.getSessionNumber().equals(this.getSessionNumber()) == false)
            return false;
        if (other.getVirtualNetworkId() == null ^ this.getVirtualNetworkId() == null)
            return false;
        if (other.getVirtualNetworkId() != null
                && other.getVirtualNetworkId().equals(this.getVirtualNetworkId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
