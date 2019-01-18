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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * Lists the device's response, as an administrator.
 * </p>
 */
public class AdminListDevicesResult implements Serializable {
    /**
     * <p>
     * The devices in the list of devices response.
     * </p>
     */
    private java.util.List<DeviceType> devices;

    /**
     * <p>
     * The pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String paginationToken;

    /**
     * <p>
     * The devices in the list of devices response.
     * </p>
     *
     * @return <p>
     *         The devices in the list of devices response.
     *         </p>
     */
    public java.util.List<DeviceType> getDevices() {
        return devices;
    }

    /**
     * <p>
     * The devices in the list of devices response.
     * </p>
     *
     * @param devices <p>
     *            The devices in the list of devices response.
     *            </p>
     */
    public void setDevices(java.util.Collection<DeviceType> devices) {
        if (devices == null) {
            this.devices = null;
            return;
        }

        this.devices = new java.util.ArrayList<DeviceType>(devices);
    }

    /**
     * <p>
     * The devices in the list of devices response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devices <p>
     *            The devices in the list of devices response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminListDevicesResult withDevices(DeviceType... devices) {
        if (getDevices() == null) {
            this.devices = new java.util.ArrayList<DeviceType>(devices.length);
        }
        for (DeviceType value : devices) {
            this.devices.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The devices in the list of devices response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devices <p>
     *            The devices in the list of devices response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminListDevicesResult withDevices(java.util.Collection<DeviceType> devices) {
        setDevices(devices);
        return this;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return <p>
     *         The pagination token.
     *         </p>
     */
    public String getPaginationToken() {
        return paginationToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param paginationToken <p>
     *            The pagination token.
     *            </p>
     */
    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param paginationToken <p>
     *            The pagination token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminListDevicesResult withPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
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
        if (getPaginationToken() != null)
            sb.append("PaginationToken: " + getPaginationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevices() == null) ? 0 : getDevices().hashCode());
        hashCode = prime * hashCode
                + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminListDevicesResult == false)
            return false;
        AdminListDevicesResult other = (AdminListDevicesResult) obj;

        if (other.getDevices() == null ^ this.getDevices() == null)
            return false;
        if (other.getDevices() != null && other.getDevices().equals(this.getDevices()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null
                && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        return true;
    }
}
