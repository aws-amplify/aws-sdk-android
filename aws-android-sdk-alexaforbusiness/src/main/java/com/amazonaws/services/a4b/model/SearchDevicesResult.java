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

public class SearchDevicesResult implements Serializable {
    /**
     * <p>
     * The devices that meet the specified set of filter criteria, in sort
     * order.
     * </p>
     */
    private java.util.List<DeviceData> devices;

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
     * The total number of devices returned.
     * </p>
     */
    private Integer totalCount;

    /**
     * <p>
     * The devices that meet the specified set of filter criteria, in sort
     * order.
     * </p>
     *
     * @return <p>
     *         The devices that meet the specified set of filter criteria, in
     *         sort order.
     *         </p>
     */
    public java.util.List<DeviceData> getDevices() {
        return devices;
    }

    /**
     * <p>
     * The devices that meet the specified set of filter criteria, in sort
     * order.
     * </p>
     *
     * @param devices <p>
     *            The devices that meet the specified set of filter criteria, in
     *            sort order.
     *            </p>
     */
    public void setDevices(java.util.Collection<DeviceData> devices) {
        if (devices == null) {
            this.devices = null;
            return;
        }

        this.devices = new java.util.ArrayList<DeviceData>(devices);
    }

    /**
     * <p>
     * The devices that meet the specified set of filter criteria, in sort
     * order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devices <p>
     *            The devices that meet the specified set of filter criteria, in
     *            sort order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchDevicesResult withDevices(DeviceData... devices) {
        if (getDevices() == null) {
            this.devices = new java.util.ArrayList<DeviceData>(devices.length);
        }
        for (DeviceData value : devices) {
            this.devices.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The devices that meet the specified set of filter criteria, in sort
     * order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devices <p>
     *            The devices that meet the specified set of filter criteria, in
     *            sort order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchDevicesResult withDevices(java.util.Collection<DeviceData> devices) {
        setDevices(devices);
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
    public SearchDevicesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The total number of devices returned.
     * </p>
     *
     * @return <p>
     *         The total number of devices returned.
     *         </p>
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * <p>
     * The total number of devices returned.
     * </p>
     *
     * @param totalCount <p>
     *            The total number of devices returned.
     *            </p>
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of devices returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalCount <p>
     *            The total number of devices returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchDevicesResult withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
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
        if (getDevices() != null)
            sb.append("Devices: " + getDevices() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getTotalCount() != null)
            sb.append("TotalCount: " + getTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevices() == null) ? 0 : getDevices().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchDevicesResult == false)
            return false;
        SearchDevicesResult other = (SearchDevicesResult) obj;

        if (other.getDevices() == null ^ this.getDevices() == null)
            return false;
        if (other.getDevices() != null && other.getDevices().equals(this.getDevices()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null
                && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        return true;
    }
}
