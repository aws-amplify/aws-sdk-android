/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The connectivity status of the thing.
 * </p>
 */
public class ThingConnectivity implements Serializable {
    /**
     * <p>
     * True if the thing is connected to the AWS IoT service, false if it is not
     * connected.
     * </p>
     */
    private Boolean connected;

    /**
     * <p>
     * The epoch time (in milliseconds) when the thing last connected or
     * disconnected. Note that if the thing has been disconnected for more than
     * a few weeks, the time value can be missing.
     * </p>
     */
    private Long timestamp;

    /**
     * <p>
     * True if the thing is connected to the AWS IoT service, false if it is not
     * connected.
     * </p>
     *
     * @return <p>
     *         True if the thing is connected to the AWS IoT service, false if
     *         it is not connected.
     *         </p>
     */
    public Boolean isConnected() {
        return connected;
    }

    /**
     * <p>
     * True if the thing is connected to the AWS IoT service, false if it is not
     * connected.
     * </p>
     *
     * @return <p>
     *         True if the thing is connected to the AWS IoT service, false if
     *         it is not connected.
     *         </p>
     */
    public Boolean getConnected() {
        return connected;
    }

    /**
     * <p>
     * True if the thing is connected to the AWS IoT service, false if it is not
     * connected.
     * </p>
     *
     * @param connected <p>
     *            True if the thing is connected to the AWS IoT service, false
     *            if it is not connected.
     *            </p>
     */
    public void setConnected(Boolean connected) {
        this.connected = connected;
    }

    /**
     * <p>
     * True if the thing is connected to the AWS IoT service, false if it is not
     * connected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connected <p>
     *            True if the thing is connected to the AWS IoT service, false
     *            if it is not connected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingConnectivity withConnected(Boolean connected) {
        this.connected = connected;
        return this;
    }

    /**
     * <p>
     * The epoch time (in milliseconds) when the thing last connected or
     * disconnected. Note that if the thing has been disconnected for more than
     * a few weeks, the time value can be missing.
     * </p>
     *
     * @return <p>
     *         The epoch time (in milliseconds) when the thing last connected or
     *         disconnected. Note that if the thing has been disconnected for
     *         more than a few weeks, the time value can be missing.
     *         </p>
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The epoch time (in milliseconds) when the thing last connected or
     * disconnected. Note that if the thing has been disconnected for more than
     * a few weeks, the time value can be missing.
     * </p>
     *
     * @param timestamp <p>
     *            The epoch time (in milliseconds) when the thing last connected
     *            or disconnected. Note that if the thing has been disconnected
     *            for more than a few weeks, the time value can be missing.
     *            </p>
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The epoch time (in milliseconds) when the thing last connected or
     * disconnected. Note that if the thing has been disconnected for more than
     * a few weeks, the time value can be missing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The epoch time (in milliseconds) when the thing last connected
     *            or disconnected. Note that if the thing has been disconnected
     *            for more than a few weeks, the time value can be missing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ThingConnectivity withTimestamp(Long timestamp) {
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
        if (getConnected() != null)
            sb.append("connected: " + getConnected() + ",");
        if (getTimestamp() != null)
            sb.append("timestamp: " + getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnected() == null) ? 0 : getConnected().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingConnectivity == false)
            return false;
        ThingConnectivity other = (ThingConnectivity) obj;

        if (other.getConnected() == null ^ this.getConnected() == null)
            return false;
        if (other.getConnected() != null
                && other.getConnected().equals(this.getConnected()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }
}
