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

/**
 * <p>
 * Describes a Traffic Mirror session.
 * </p>
 */
public class TrafficMirrorSession implements Serializable {
    /**
     * <p>
     * The ID for the Traffic Mirror session.
     * </p>
     */
    private String trafficMirrorSessionId;

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
     * The ID of the Traffic Mirror session's network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The ID of the account that owns the Traffic Mirror session.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are the bytes after
     * the VXLAN header. To mirror a subset, set this to the length (in bytes)
     * to mirror. For example, if you set this value to 100, then the first 100
     * bytes that meet the filter criteria are copied to the target. Do not
     * specify this parameter when you want to mirror the entire packet
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
     * The virtual network ID associated with the Traffic Mirror session.
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
     * The tags assigned to the Traffic Mirror session.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID for the Traffic Mirror session.
     * </p>
     *
     * @return <p>
     *         The ID for the Traffic Mirror session.
     *         </p>
     */
    public String getTrafficMirrorSessionId() {
        return trafficMirrorSessionId;
    }

    /**
     * <p>
     * The ID for the Traffic Mirror session.
     * </p>
     *
     * @param trafficMirrorSessionId <p>
     *            The ID for the Traffic Mirror session.
     *            </p>
     */
    public void setTrafficMirrorSessionId(String trafficMirrorSessionId) {
        this.trafficMirrorSessionId = trafficMirrorSessionId;
    }

    /**
     * <p>
     * The ID for the Traffic Mirror session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficMirrorSessionId <p>
     *            The ID for the Traffic Mirror session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorSession withTrafficMirrorSessionId(String trafficMirrorSessionId) {
        this.trafficMirrorSessionId = trafficMirrorSessionId;
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
    public TrafficMirrorSession withTrafficMirrorTargetId(String trafficMirrorTargetId) {
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
    public TrafficMirrorSession withTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror session's network interface.
     * </p>
     *
     * @return <p>
     *         The ID of the Traffic Mirror session's network interface.
     *         </p>
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror session's network interface.
     * </p>
     *
     * @param networkInterfaceId <p>
     *            The ID of the Traffic Mirror session's network interface.
     *            </p>
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror session's network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceId <p>
     *            The ID of the Traffic Mirror session's network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorSession withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * The ID of the account that owns the Traffic Mirror session.
     * </p>
     *
     * @return <p>
     *         The ID of the account that owns the Traffic Mirror session.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The ID of the account that owns the Traffic Mirror session.
     * </p>
     *
     * @param ownerId <p>
     *            The ID of the account that owns the Traffic Mirror session.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the account that owns the Traffic Mirror session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The ID of the account that owns the Traffic Mirror session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorSession withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are the bytes after
     * the VXLAN header. To mirror a subset, set this to the length (in bytes)
     * to mirror. For example, if you set this value to 100, then the first 100
     * bytes that meet the filter criteria are copied to the target. Do not
     * specify this parameter when you want to mirror the entire packet
     * </p>
     *
     * @return <p>
     *         The number of bytes in each packet to mirror. These are the bytes
     *         after the VXLAN header. To mirror a subset, set this to the
     *         length (in bytes) to mirror. For example, if you set this value
     *         to 100, then the first 100 bytes that meet the filter criteria
     *         are copied to the target. Do not specify this parameter when you
     *         want to mirror the entire packet
     *         </p>
     */
    public Integer getPacketLength() {
        return packetLength;
    }

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are the bytes after
     * the VXLAN header. To mirror a subset, set this to the length (in bytes)
     * to mirror. For example, if you set this value to 100, then the first 100
     * bytes that meet the filter criteria are copied to the target. Do not
     * specify this parameter when you want to mirror the entire packet
     * </p>
     *
     * @param packetLength <p>
     *            The number of bytes in each packet to mirror. These are the
     *            bytes after the VXLAN header. To mirror a subset, set this to
     *            the length (in bytes) to mirror. For example, if you set this
     *            value to 100, then the first 100 bytes that meet the filter
     *            criteria are copied to the target. Do not specify this
     *            parameter when you want to mirror the entire packet
     *            </p>
     */
    public void setPacketLength(Integer packetLength) {
        this.packetLength = packetLength;
    }

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are the bytes after
     * the VXLAN header. To mirror a subset, set this to the length (in bytes)
     * to mirror. For example, if you set this value to 100, then the first 100
     * bytes that meet the filter criteria are copied to the target. Do not
     * specify this parameter when you want to mirror the entire packet
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param packetLength <p>
     *            The number of bytes in each packet to mirror. These are the
     *            bytes after the VXLAN header. To mirror a subset, set this to
     *            the length (in bytes) to mirror. For example, if you set this
     *            value to 100, then the first 100 bytes that meet the filter
     *            criteria are copied to the target. Do not specify this
     *            parameter when you want to mirror the entire packet
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorSession withPacketLength(Integer packetLength) {
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
    public TrafficMirrorSession withSessionNumber(Integer sessionNumber) {
        this.sessionNumber = sessionNumber;
        return this;
    }

    /**
     * <p>
     * The virtual network ID associated with the Traffic Mirror session.
     * </p>
     *
     * @return <p>
     *         The virtual network ID associated with the Traffic Mirror
     *         session.
     *         </p>
     */
    public Integer getVirtualNetworkId() {
        return virtualNetworkId;
    }

    /**
     * <p>
     * The virtual network ID associated with the Traffic Mirror session.
     * </p>
     *
     * @param virtualNetworkId <p>
     *            The virtual network ID associated with the Traffic Mirror
     *            session.
     *            </p>
     */
    public void setVirtualNetworkId(Integer virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
    }

    /**
     * <p>
     * The virtual network ID associated with the Traffic Mirror session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualNetworkId <p>
     *            The virtual network ID associated with the Traffic Mirror
     *            session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorSession withVirtualNetworkId(Integer virtualNetworkId) {
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
    public TrafficMirrorSession withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror session.
     * </p>
     *
     * @return <p>
     *         The tags assigned to the Traffic Mirror session.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror session.
     * </p>
     *
     * @param tags <p>
     *            The tags assigned to the Traffic Mirror session.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the Traffic Mirror session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorSession withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the Traffic Mirror session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrafficMirrorSession withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTrafficMirrorSessionId() != null)
            sb.append("TrafficMirrorSessionId: " + getTrafficMirrorSessionId() + ",");
        if (getTrafficMirrorTargetId() != null)
            sb.append("TrafficMirrorTargetId: " + getTrafficMirrorTargetId() + ",");
        if (getTrafficMirrorFilterId() != null)
            sb.append("TrafficMirrorFilterId: " + getTrafficMirrorFilterId() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getPacketLength() != null)
            sb.append("PacketLength: " + getPacketLength() + ",");
        if (getSessionNumber() != null)
            sb.append("SessionNumber: " + getSessionNumber() + ",");
        if (getVirtualNetworkId() != null)
            sb.append("VirtualNetworkId: " + getVirtualNetworkId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTrafficMirrorSessionId() == null) ? 0 : getTrafficMirrorSessionId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTrafficMirrorTargetId() == null) ? 0 : getTrafficMirrorTargetId().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrafficMirrorFilterId() == null) ? 0 : getTrafficMirrorFilterId().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode
                + ((getPacketLength() == null) ? 0 : getPacketLength().hashCode());
        hashCode = prime * hashCode
                + ((getSessionNumber() == null) ? 0 : getSessionNumber().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualNetworkId() == null) ? 0 : getVirtualNetworkId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficMirrorSession == false)
            return false;
        TrafficMirrorSession other = (TrafficMirrorSession) obj;

        if (other.getTrafficMirrorSessionId() == null ^ this.getTrafficMirrorSessionId() == null)
            return false;
        if (other.getTrafficMirrorSessionId() != null
                && other.getTrafficMirrorSessionId().equals(this.getTrafficMirrorSessionId()) == false)
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
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
