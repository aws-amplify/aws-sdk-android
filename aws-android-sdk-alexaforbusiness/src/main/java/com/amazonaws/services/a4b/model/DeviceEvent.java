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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * The list of device events.
 * </p>
 */
public class DeviceEvent implements Serializable {
    /**
     * <p>
     * The type of device event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECTION_STATUS, DEVICE_STATUS
     */
    private String type;

    /**
     * <p>
     * The value of the event.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The time (in epoch) when the event occurred.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The type of device event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECTION_STATUS, DEVICE_STATUS
     *
     * @return <p>
     *         The type of device event.
     *         </p>
     * @see DeviceEventType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of device event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECTION_STATUS, DEVICE_STATUS
     *
     * @param type <p>
     *            The type of device event.
     *            </p>
     * @see DeviceEventType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of device event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECTION_STATUS, DEVICE_STATUS
     *
     * @param type <p>
     *            The type of device event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceEventType
     */
    public DeviceEvent withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of device event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECTION_STATUS, DEVICE_STATUS
     *
     * @param type <p>
     *            The type of device event.
     *            </p>
     * @see DeviceEventType
     */
    public void setType(DeviceEventType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of device event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECTION_STATUS, DEVICE_STATUS
     *
     * @param type <p>
     *            The type of device event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceEventType
     */
    public DeviceEvent withType(DeviceEventType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The value of the event.
     * </p>
     *
     * @return <p>
     *         The value of the event.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the event.
     * </p>
     *
     * @param value <p>
     *            The value of the event.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceEvent withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The time (in epoch) when the event occurred.
     * </p>
     *
     * @return <p>
     *         The time (in epoch) when the event occurred.
     *         </p>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The time (in epoch) when the event occurred.
     * </p>
     *
     * @param timestamp <p>
     *            The time (in epoch) when the event occurred.
     *            </p>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time (in epoch) when the event occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The time (in epoch) when the event occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceEvent withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceEvent == false)
            return false;
        DeviceEvent other = (DeviceEvent) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }
}
