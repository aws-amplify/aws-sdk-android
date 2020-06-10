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
 * Modifies a Traffic Mirror session.
 * </p>
 */
public class ModifyTrafficMirrorSessionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the Traffic Mirror session.
     * </p>
     */
    private String trafficMirrorSessionId;

    /**
     * <p>
     * The Traffic Mirror target. The target must be in the same VPC as the
     * source, or have a VPC peering connection with the source.
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
     * VXLAN header. To mirror a subset, set this to the length (in bytes) to
     * mirror. For example, if you set this value to 100, then the first 100
     * bytes that meet the filter criteria are copied to the target. Do not
     * specify this parameter when you want to mirror the entire packet.
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
     * The virtual network ID of the Traffic Mirror session.
     * </p>
     */
    private Integer virtualNetworkId;

    /**
     * <p>
     * The description to assign to the Traffic Mirror session.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror session.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror session, the property is
     * set to the default.
     * </p>
     */
    private java.util.List<String> removeFields;

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
     * The ID of the Traffic Mirror session.
     * </p>
     *
     * @return <p>
     *         The ID of the Traffic Mirror session.
     *         </p>
     */
    public String getTrafficMirrorSessionId() {
        return trafficMirrorSessionId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror session.
     * </p>
     *
     * @param trafficMirrorSessionId <p>
     *            The ID of the Traffic Mirror session.
     *            </p>
     */
    public void setTrafficMirrorSessionId(String trafficMirrorSessionId) {
        this.trafficMirrorSessionId = trafficMirrorSessionId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficMirrorSessionId <p>
     *            The ID of the Traffic Mirror session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorSessionRequest withTrafficMirrorSessionId(
            String trafficMirrorSessionId) {
        this.trafficMirrorSessionId = trafficMirrorSessionId;
        return this;
    }

    /**
     * <p>
     * The Traffic Mirror target. The target must be in the same VPC as the
     * source, or have a VPC peering connection with the source.
     * </p>
     *
     * @return <p>
     *         The Traffic Mirror target. The target must be in the same VPC as
     *         the source, or have a VPC peering connection with the source.
     *         </p>
     */
    public String getTrafficMirrorTargetId() {
        return trafficMirrorTargetId;
    }

    /**
     * <p>
     * The Traffic Mirror target. The target must be in the same VPC as the
     * source, or have a VPC peering connection with the source.
     * </p>
     *
     * @param trafficMirrorTargetId <p>
     *            The Traffic Mirror target. The target must be in the same VPC
     *            as the source, or have a VPC peering connection with the
     *            source.
     *            </p>
     */
    public void setTrafficMirrorTargetId(String trafficMirrorTargetId) {
        this.trafficMirrorTargetId = trafficMirrorTargetId;
    }

    /**
     * <p>
     * The Traffic Mirror target. The target must be in the same VPC as the
     * source, or have a VPC peering connection with the source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficMirrorTargetId <p>
     *            The Traffic Mirror target. The target must be in the same VPC
     *            as the source, or have a VPC peering connection with the
     *            source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorSessionRequest withTrafficMirrorTargetId(String trafficMirrorTargetId) {
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
    public ModifyTrafficMirrorSessionRequest withTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are bytes after the
     * VXLAN header. To mirror a subset, set this to the length (in bytes) to
     * mirror. For example, if you set this value to 100, then the first 100
     * bytes that meet the filter criteria are copied to the target. Do not
     * specify this parameter when you want to mirror the entire packet.
     * </p>
     *
     * @return <p>
     *         The number of bytes in each packet to mirror. These are bytes
     *         after the VXLAN header. To mirror a subset, set this to the
     *         length (in bytes) to mirror. For example, if you set this value
     *         to 100, then the first 100 bytes that meet the filter criteria
     *         are copied to the target. Do not specify this parameter when you
     *         want to mirror the entire packet.
     *         </p>
     */
    public Integer getPacketLength() {
        return packetLength;
    }

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are bytes after the
     * VXLAN header. To mirror a subset, set this to the length (in bytes) to
     * mirror. For example, if you set this value to 100, then the first 100
     * bytes that meet the filter criteria are copied to the target. Do not
     * specify this parameter when you want to mirror the entire packet.
     * </p>
     *
     * @param packetLength <p>
     *            The number of bytes in each packet to mirror. These are bytes
     *            after the VXLAN header. To mirror a subset, set this to the
     *            length (in bytes) to mirror. For example, if you set this
     *            value to 100, then the first 100 bytes that meet the filter
     *            criteria are copied to the target. Do not specify this
     *            parameter when you want to mirror the entire packet.
     *            </p>
     */
    public void setPacketLength(Integer packetLength) {
        this.packetLength = packetLength;
    }

    /**
     * <p>
     * The number of bytes in each packet to mirror. These are bytes after the
     * VXLAN header. To mirror a subset, set this to the length (in bytes) to
     * mirror. For example, if you set this value to 100, then the first 100
     * bytes that meet the filter criteria are copied to the target. Do not
     * specify this parameter when you want to mirror the entire packet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param packetLength <p>
     *            The number of bytes in each packet to mirror. These are bytes
     *            after the VXLAN header. To mirror a subset, set this to the
     *            length (in bytes) to mirror. For example, if you set this
     *            value to 100, then the first 100 bytes that meet the filter
     *            criteria are copied to the target. Do not specify this
     *            parameter when you want to mirror the entire packet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorSessionRequest withPacketLength(Integer packetLength) {
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
    public ModifyTrafficMirrorSessionRequest withSessionNumber(Integer sessionNumber) {
        this.sessionNumber = sessionNumber;
        return this;
    }

    /**
     * <p>
     * The virtual network ID of the Traffic Mirror session.
     * </p>
     *
     * @return <p>
     *         The virtual network ID of the Traffic Mirror session.
     *         </p>
     */
    public Integer getVirtualNetworkId() {
        return virtualNetworkId;
    }

    /**
     * <p>
     * The virtual network ID of the Traffic Mirror session.
     * </p>
     *
     * @param virtualNetworkId <p>
     *            The virtual network ID of the Traffic Mirror session.
     *            </p>
     */
    public void setVirtualNetworkId(Integer virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
    }

    /**
     * <p>
     * The virtual network ID of the Traffic Mirror session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualNetworkId <p>
     *            The virtual network ID of the Traffic Mirror session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorSessionRequest withVirtualNetworkId(Integer virtualNetworkId) {
        this.virtualNetworkId = virtualNetworkId;
        return this;
    }

    /**
     * <p>
     * The description to assign to the Traffic Mirror session.
     * </p>
     *
     * @return <p>
     *         The description to assign to the Traffic Mirror session.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description to assign to the Traffic Mirror session.
     * </p>
     *
     * @param description <p>
     *            The description to assign to the Traffic Mirror session.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description to assign to the Traffic Mirror session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description to assign to the Traffic Mirror session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorSessionRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror session.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror session, the property is
     * set to the default.
     * </p>
     *
     * @return <p>
     *         The properties that you want to remove from the Traffic Mirror
     *         session.
     *         </p>
     *         <p>
     *         When you remove a property from a Traffic Mirror session, the
     *         property is set to the default.
     *         </p>
     */
    public java.util.List<String> getRemoveFields() {
        return removeFields;
    }

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror session.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror session, the property is
     * set to the default.
     * </p>
     *
     * @param removeFields <p>
     *            The properties that you want to remove from the Traffic Mirror
     *            session.
     *            </p>
     *            <p>
     *            When you remove a property from a Traffic Mirror session, the
     *            property is set to the default.
     *            </p>
     */
    public void setRemoveFields(java.util.Collection<String> removeFields) {
        if (removeFields == null) {
            this.removeFields = null;
            return;
        }

        this.removeFields = new java.util.ArrayList<String>(removeFields);
    }

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror session.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror session, the property is
     * set to the default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeFields <p>
     *            The properties that you want to remove from the Traffic Mirror
     *            session.
     *            </p>
     *            <p>
     *            When you remove a property from a Traffic Mirror session, the
     *            property is set to the default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorSessionRequest withRemoveFields(String... removeFields) {
        if (getRemoveFields() == null) {
            this.removeFields = new java.util.ArrayList<String>(removeFields.length);
        }
        for (String value : removeFields) {
            this.removeFields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The properties that you want to remove from the Traffic Mirror session.
     * </p>
     * <p>
     * When you remove a property from a Traffic Mirror session, the property is
     * set to the default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeFields <p>
     *            The properties that you want to remove from the Traffic Mirror
     *            session.
     *            </p>
     *            <p>
     *            When you remove a property from a Traffic Mirror session, the
     *            property is set to the default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTrafficMirrorSessionRequest withRemoveFields(
            java.util.Collection<String> removeFields) {
        setRemoveFields(removeFields);
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
    public ModifyTrafficMirrorSessionRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getPacketLength() != null)
            sb.append("PacketLength: " + getPacketLength() + ",");
        if (getSessionNumber() != null)
            sb.append("SessionNumber: " + getSessionNumber() + ",");
        if (getVirtualNetworkId() != null)
            sb.append("VirtualNetworkId: " + getVirtualNetworkId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getRemoveFields() != null)
            sb.append("RemoveFields: " + getRemoveFields() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
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
                + ((getPacketLength() == null) ? 0 : getPacketLength().hashCode());
        hashCode = prime * hashCode
                + ((getSessionNumber() == null) ? 0 : getSessionNumber().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualNetworkId() == null) ? 0 : getVirtualNetworkId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getRemoveFields() == null) ? 0 : getRemoveFields().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyTrafficMirrorSessionRequest == false)
            return false;
        ModifyTrafficMirrorSessionRequest other = (ModifyTrafficMirrorSessionRequest) obj;

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
        if (other.getRemoveFields() == null ^ this.getRemoveFields() == null)
            return false;
        if (other.getRemoveFields() != null
                && other.getRemoveFields().equals(this.getRemoveFields()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
