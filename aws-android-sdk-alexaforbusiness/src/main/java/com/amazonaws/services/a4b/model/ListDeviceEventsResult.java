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

public class ListDeviceEventsResult implements Serializable {
    /**
     * <p>
     * The device events requested for the device ARN.
     * </p>
     */
    private java.util.List<DeviceEvent> deviceEvents;

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The device events requested for the device ARN.
     * </p>
     *
     * @return <p>
     *         The device events requested for the device ARN.
     *         </p>
     */
    public java.util.List<DeviceEvent> getDeviceEvents() {
        return deviceEvents;
    }

    /**
     * <p>
     * The device events requested for the device ARN.
     * </p>
     *
     * @param deviceEvents <p>
     *            The device events requested for the device ARN.
     *            </p>
     */
    public void setDeviceEvents(java.util.Collection<DeviceEvent> deviceEvents) {
        if (deviceEvents == null) {
            this.deviceEvents = null;
            return;
        }

        this.deviceEvents = new java.util.ArrayList<DeviceEvent>(deviceEvents);
    }

    /**
     * <p>
     * The device events requested for the device ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceEvents <p>
     *            The device events requested for the device ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeviceEventsResult withDeviceEvents(DeviceEvent... deviceEvents) {
        if (getDeviceEvents() == null) {
            this.deviceEvents = new java.util.ArrayList<DeviceEvent>(deviceEvents.length);
        }
        for (DeviceEvent value : deviceEvents) {
            this.deviceEvents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The device events requested for the device ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceEvents <p>
     *            The device events requested for the device ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeviceEventsResult withDeviceEvents(java.util.Collection<DeviceEvent> deviceEvents) {
        setDeviceEvents(deviceEvents);
        return this;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @return <p>
     *         The token returned to indicate that there is more data available.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The token returned to indicate that there is more data
     *            available.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The token returned to indicate that there is more data
     *            available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeviceEventsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getDeviceEvents() != null)
            sb.append("DeviceEvents: " + getDeviceEvents() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeviceEvents() == null) ? 0 : getDeviceEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeviceEventsResult == false)
            return false;
        ListDeviceEventsResult other = (ListDeviceEventsResult) obj;

        if (other.getDeviceEvents() == null ^ this.getDeviceEvents() == null)
            return false;
        if (other.getDeviceEvents() != null
                && other.getDeviceEvents().equals(this.getDeviceEvents()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
