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
 * Describes a volume status operation code.
 * </p>
 */
public class VolumeStatusAction implements Serializable {
    /**
     * <p>
     * The code identifying the operation, for example,
     * <code>enable-volume-io</code>.
     * </p>
     */
    private String code;

    /**
     * <p>
     * A description of the operation.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the event associated with this operation.
     * </p>
     */
    private String eventId;

    /**
     * <p>
     * The event type associated with this operation.
     * </p>
     */
    private String eventType;

    /**
     * <p>
     * The code identifying the operation, for example,
     * <code>enable-volume-io</code>.
     * </p>
     *
     * @return <p>
     *         The code identifying the operation, for example,
     *         <code>enable-volume-io</code>.
     *         </p>
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * The code identifying the operation, for example,
     * <code>enable-volume-io</code>.
     * </p>
     *
     * @param code <p>
     *            The code identifying the operation, for example,
     *            <code>enable-volume-io</code>.
     *            </p>
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The code identifying the operation, for example,
     * <code>enable-volume-io</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param code <p>
     *            The code identifying the operation, for example,
     *            <code>enable-volume-io</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusAction withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * A description of the operation.
     * </p>
     *
     * @return <p>
     *         A description of the operation.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the operation.
     * </p>
     *
     * @param description <p>
     *            A description of the operation.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusAction withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The ID of the event associated with this operation.
     * </p>
     *
     * @return <p>
     *         The ID of the event associated with this operation.
     *         </p>
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * <p>
     * The ID of the event associated with this operation.
     * </p>
     *
     * @param eventId <p>
     *            The ID of the event associated with this operation.
     *            </p>
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The ID of the event associated with this operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventId <p>
     *            The ID of the event associated with this operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusAction withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * <p>
     * The event type associated with this operation.
     * </p>
     *
     * @return <p>
     *         The event type associated with this operation.
     *         </p>
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * <p>
     * The event type associated with this operation.
     * </p>
     *
     * @param eventType <p>
     *            The event type associated with this operation.
     *            </p>
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The event type associated with this operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventType <p>
     *            The event type associated with this operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusAction withEventType(String eventType) {
        this.eventType = eventType;
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
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getEventId() != null)
            sb.append("EventId: " + getEventId() + ",");
        if (getEventType() != null)
            sb.append("EventType: " + getEventType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeStatusAction == false)
            return false;
        VolumeStatusAction other = (VolumeStatusAction) obj;

        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
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
        return true;
    }
}
