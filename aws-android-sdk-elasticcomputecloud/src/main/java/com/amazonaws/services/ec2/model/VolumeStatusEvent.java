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
 * Describes a volume status event.
 * </p>
 */
public class VolumeStatusEvent implements Serializable {
    /**
     * <p>
     * A description of the event.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of this event.
     * </p>
     */
    private String eventId;

    /**
     * <p>
     * The type of this event.
     * </p>
     */
    private String eventType;

    /**
     * <p>
     * The latest end time of the event.
     * </p>
     */
    private java.util.Date notAfter;

    /**
     * <p>
     * The earliest start time of the event.
     * </p>
     */
    private java.util.Date notBefore;

    /**
     * <p>
     * The ID of the instance associated with the event.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * A description of the event.
     * </p>
     *
     * @return <p>
     *         A description of the event.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the event.
     * </p>
     *
     * @param description <p>
     *            A description of the event.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusEvent withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The ID of this event.
     * </p>
     *
     * @return <p>
     *         The ID of this event.
     *         </p>
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * <p>
     * The ID of this event.
     * </p>
     *
     * @param eventId <p>
     *            The ID of this event.
     *            </p>
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The ID of this event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventId <p>
     *            The ID of this event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusEvent withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * <p>
     * The type of this event.
     * </p>
     *
     * @return <p>
     *         The type of this event.
     *         </p>
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * <p>
     * The type of this event.
     * </p>
     *
     * @param eventType <p>
     *            The type of this event.
     *            </p>
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The type of this event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventType <p>
     *            The type of this event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusEvent withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * <p>
     * The latest end time of the event.
     * </p>
     *
     * @return <p>
     *         The latest end time of the event.
     *         </p>
     */
    public java.util.Date getNotAfter() {
        return notAfter;
    }

    /**
     * <p>
     * The latest end time of the event.
     * </p>
     *
     * @param notAfter <p>
     *            The latest end time of the event.
     *            </p>
     */
    public void setNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * <p>
     * The latest end time of the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notAfter <p>
     *            The latest end time of the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusEvent withNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
        return this;
    }

    /**
     * <p>
     * The earliest start time of the event.
     * </p>
     *
     * @return <p>
     *         The earliest start time of the event.
     *         </p>
     */
    public java.util.Date getNotBefore() {
        return notBefore;
    }

    /**
     * <p>
     * The earliest start time of the event.
     * </p>
     *
     * @param notBefore <p>
     *            The earliest start time of the event.
     *            </p>
     */
    public void setNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * <p>
     * The earliest start time of the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notBefore <p>
     *            The earliest start time of the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusEvent withNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * <p>
     * The ID of the instance associated with the event.
     * </p>
     *
     * @return <p>
     *         The ID of the instance associated with the event.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance associated with the event.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the instance associated with the event.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance associated with the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the instance associated with the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusEvent withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getEventId() != null)
            sb.append("EventId: " + getEventId() + ",");
        if (getEventType() != null)
            sb.append("EventType: " + getEventType() + ",");
        if (getNotAfter() != null)
            sb.append("NotAfter: " + getNotAfter() + ",");
        if (getNotBefore() != null)
            sb.append("NotBefore: " + getNotBefore() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getNotAfter() == null) ? 0 : getNotAfter().hashCode());
        hashCode = prime * hashCode + ((getNotBefore() == null) ? 0 : getNotBefore().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeStatusEvent == false)
            return false;
        VolumeStatusEvent other = (VolumeStatusEvent) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null
                && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getNotAfter() == null ^ this.getNotAfter() == null)
            return false;
        if (other.getNotAfter() != null && other.getNotAfter().equals(this.getNotAfter()) == false)
            return false;
        if (other.getNotBefore() == null ^ this.getNotBefore() == null)
            return false;
        if (other.getNotBefore() != null
                && other.getNotBefore().equals(this.getNotBefore()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }
}
