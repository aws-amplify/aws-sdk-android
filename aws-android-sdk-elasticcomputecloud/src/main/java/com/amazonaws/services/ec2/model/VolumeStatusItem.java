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
 * Describes the volume status.
 * </p>
 */
public class VolumeStatusItem implements Serializable {
    /**
     * <p>
     * The details of the operation.
     * </p>
     */
    private java.util.List<VolumeStatusAction> actions;

    /**
     * <p>
     * The Availability Zone of the volume.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     */
    private String outpostArn;

    /**
     * <p>
     * A list of events associated with the volume.
     * </p>
     */
    private java.util.List<VolumeStatusEvent> events;

    /**
     * <p>
     * The volume ID.
     * </p>
     */
    private String volumeId;

    /**
     * <p>
     * The volume status.
     * </p>
     */
    private VolumeStatusInfo volumeStatus;

    /**
     * <p>
     * Information about the instances to which the volume is attached.
     * </p>
     */
    private java.util.List<VolumeStatusAttachmentStatus> attachmentStatuses;

    /**
     * <p>
     * The details of the operation.
     * </p>
     *
     * @return <p>
     *         The details of the operation.
     *         </p>
     */
    public java.util.List<VolumeStatusAction> getActions() {
        return actions;
    }

    /**
     * <p>
     * The details of the operation.
     * </p>
     *
     * @param actions <p>
     *            The details of the operation.
     *            </p>
     */
    public void setActions(java.util.Collection<VolumeStatusAction> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<VolumeStatusAction>(actions);
    }

    /**
     * <p>
     * The details of the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The details of the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusItem withActions(VolumeStatusAction... actions) {
        if (getActions() == null) {
            this.actions = new java.util.ArrayList<VolumeStatusAction>(actions.length);
        }
        for (VolumeStatusAction value : actions) {
            this.actions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The details of the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The details of the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusItem withActions(java.util.Collection<VolumeStatusAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The Availability Zone of the volume.
     * </p>
     *
     * @return <p>
     *         The Availability Zone of the volume.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the volume.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone of the volume.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone of the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusItem withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Outpost.
     *         </p>
     */
    public String getOutpostArn() {
        return outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     *
     * @param outpostArn <p>
     *            The Amazon Resource Name (ARN) of the Outpost.
     *            </p>
     */
    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outpostArn <p>
     *            The Amazon Resource Name (ARN) of the Outpost.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusItem withOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
        return this;
    }

    /**
     * <p>
     * A list of events associated with the volume.
     * </p>
     *
     * @return <p>
     *         A list of events associated with the volume.
     *         </p>
     */
    public java.util.List<VolumeStatusEvent> getEvents() {
        return events;
    }

    /**
     * <p>
     * A list of events associated with the volume.
     * </p>
     *
     * @param events <p>
     *            A list of events associated with the volume.
     *            </p>
     */
    public void setEvents(java.util.Collection<VolumeStatusEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<VolumeStatusEvent>(events);
    }

    /**
     * <p>
     * A list of events associated with the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            A list of events associated with the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusItem withEvents(VolumeStatusEvent... events) {
        if (getEvents() == null) {
            this.events = new java.util.ArrayList<VolumeStatusEvent>(events.length);
        }
        for (VolumeStatusEvent value : events) {
            this.events.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of events associated with the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            A list of events associated with the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusItem withEvents(java.util.Collection<VolumeStatusEvent> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * The volume ID.
     * </p>
     *
     * @return <p>
     *         The volume ID.
     *         </p>
     */
    public String getVolumeId() {
        return volumeId;
    }

    /**
     * <p>
     * The volume ID.
     * </p>
     *
     * @param volumeId <p>
     *            The volume ID.
     *            </p>
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The volume ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeId <p>
     *            The volume ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusItem withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * <p>
     * The volume status.
     * </p>
     *
     * @return <p>
     *         The volume status.
     *         </p>
     */
    public VolumeStatusInfo getVolumeStatus() {
        return volumeStatus;
    }

    /**
     * <p>
     * The volume status.
     * </p>
     *
     * @param volumeStatus <p>
     *            The volume status.
     *            </p>
     */
    public void setVolumeStatus(VolumeStatusInfo volumeStatus) {
        this.volumeStatus = volumeStatus;
    }

    /**
     * <p>
     * The volume status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeStatus <p>
     *            The volume status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusItem withVolumeStatus(VolumeStatusInfo volumeStatus) {
        this.volumeStatus = volumeStatus;
        return this;
    }

    /**
     * <p>
     * Information about the instances to which the volume is attached.
     * </p>
     *
     * @return <p>
     *         Information about the instances to which the volume is attached.
     *         </p>
     */
    public java.util.List<VolumeStatusAttachmentStatus> getAttachmentStatuses() {
        return attachmentStatuses;
    }

    /**
     * <p>
     * Information about the instances to which the volume is attached.
     * </p>
     *
     * @param attachmentStatuses <p>
     *            Information about the instances to which the volume is
     *            attached.
     *            </p>
     */
    public void setAttachmentStatuses(
            java.util.Collection<VolumeStatusAttachmentStatus> attachmentStatuses) {
        if (attachmentStatuses == null) {
            this.attachmentStatuses = null;
            return;
        }

        this.attachmentStatuses = new java.util.ArrayList<VolumeStatusAttachmentStatus>(
                attachmentStatuses);
    }

    /**
     * <p>
     * Information about the instances to which the volume is attached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentStatuses <p>
     *            Information about the instances to which the volume is
     *            attached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusItem withAttachmentStatuses(
            VolumeStatusAttachmentStatus... attachmentStatuses) {
        if (getAttachmentStatuses() == null) {
            this.attachmentStatuses = new java.util.ArrayList<VolumeStatusAttachmentStatus>(
                    attachmentStatuses.length);
        }
        for (VolumeStatusAttachmentStatus value : attachmentStatuses) {
            this.attachmentStatuses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the instances to which the volume is attached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentStatuses <p>
     *            Information about the instances to which the volume is
     *            attached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusItem withAttachmentStatuses(
            java.util.Collection<VolumeStatusAttachmentStatus> attachmentStatuses) {
        setAttachmentStatuses(attachmentStatuses);
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
        if (getActions() != null)
            sb.append("Actions: " + getActions() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: " + getOutpostArn() + ",");
        if (getEvents() != null)
            sb.append("Events: " + getEvents() + ",");
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId() + ",");
        if (getVolumeStatus() != null)
            sb.append("VolumeStatus: " + getVolumeStatus() + ",");
        if (getAttachmentStatuses() != null)
            sb.append("AttachmentStatuses: " + getAttachmentStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeStatus() == null) ? 0 : getVolumeStatus().hashCode());
        hashCode = prime * hashCode
                + ((getAttachmentStatuses() == null) ? 0 : getAttachmentStatuses().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeStatusItem == false)
            return false;
        VolumeStatusItem other = (VolumeStatusItem) obj;

        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null
                && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getVolumeStatus() == null ^ this.getVolumeStatus() == null)
            return false;
        if (other.getVolumeStatus() != null
                && other.getVolumeStatus().equals(this.getVolumeStatus()) == false)
            return false;
        if (other.getAttachmentStatuses() == null ^ this.getAttachmentStatuses() == null)
            return false;
        if (other.getAttachmentStatuses() != null
                && other.getAttachmentStatuses().equals(this.getAttachmentStatuses()) == false)
            return false;
        return true;
    }
}
