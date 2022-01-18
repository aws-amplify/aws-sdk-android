/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

public class GetDevicePositionHistoryResult implements Serializable {
    /**
     * <p>
     * Contains the position history details for the requested device.
     * </p>
     */
    private java.util.List<DevicePosition> devicePositions;

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You
     * can use the token in a following request to fetch the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Contains the position history details for the requested device.
     * </p>
     *
     * @return <p>
     *         Contains the position history details for the requested device.
     *         </p>
     */
    public java.util.List<DevicePosition> getDevicePositions() {
        return devicePositions;
    }

    /**
     * <p>
     * Contains the position history details for the requested device.
     * </p>
     *
     * @param devicePositions <p>
     *            Contains the position history details for the requested
     *            device.
     *            </p>
     */
    public void setDevicePositions(java.util.Collection<DevicePosition> devicePositions) {
        if (devicePositions == null) {
            this.devicePositions = null;
            return;
        }

        this.devicePositions = new java.util.ArrayList<DevicePosition>(devicePositions);
    }

    /**
     * <p>
     * Contains the position history details for the requested device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devicePositions <p>
     *            Contains the position history details for the requested
     *            device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDevicePositionHistoryResult withDevicePositions(DevicePosition... devicePositions) {
        if (getDevicePositions() == null) {
            this.devicePositions = new java.util.ArrayList<DevicePosition>(devicePositions.length);
        }
        for (DevicePosition value : devicePositions) {
            this.devicePositions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains the position history details for the requested device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devicePositions <p>
     *            Contains the position history details for the requested
     *            device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDevicePositionHistoryResult withDevicePositions(
            java.util.Collection<DevicePosition> devicePositions) {
        setDevicePositions(devicePositions);
        return this;
    }

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You
     * can use the token in a following request to fetch the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>
     *         A pagination token indicating there are additional pages
     *         available. You can use the token in a following request to fetch
     *         the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You
     * can use the token in a following request to fetch the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param nextToken <p>
     *            A pagination token indicating there are additional pages
     *            available. You can use the token in a following request to
     *            fetch the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You
     * can use the token in a following request to fetch the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param nextToken <p>
     *            A pagination token indicating there are additional pages
     *            available. You can use the token in a following request to
     *            fetch the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDevicePositionHistoryResult withNextToken(String nextToken) {
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
        if (getDevicePositions() != null)
            sb.append("DevicePositions: " + getDevicePositions() + ",");
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
                + ((getDevicePositions() == null) ? 0 : getDevicePositions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDevicePositionHistoryResult == false)
            return false;
        GetDevicePositionHistoryResult other = (GetDevicePositionHistoryResult) obj;

        if (other.getDevicePositions() == null ^ this.getDevicePositions() == null)
            return false;
        if (other.getDevicePositions() != null
                && other.getDevicePositions().equals(this.getDevicePositions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
