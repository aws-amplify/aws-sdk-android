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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the device status.
 * </p>
 */
public class UpdateDeviceStatusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The access token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     */
    private String accessToken;

    /**
     * <p>
     * The device key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-f-]+<br/>
     */
    private String deviceKey;

    /**
     * <p>
     * The status of whether a device is remembered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remembered, not_remembered
     */
    private String deviceRememberedStatus;

    /**
     * <p>
     * The access token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @return <p>
     *         The access token.
     *         </p>
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * <p>
     * The access token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken <p>
     *            The access token.
     *            </p>
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The access token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken <p>
     *            The access token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeviceStatusRequest withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * <p>
     * The device key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-f-]+<br/>
     *
     * @return <p>
     *         The device key.
     *         </p>
     */
    public String getDeviceKey() {
        return deviceKey;
    }

    /**
     * <p>
     * The device key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-f-]+<br/>
     *
     * @param deviceKey <p>
     *            The device key.
     *            </p>
     */
    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    /**
     * <p>
     * The device key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-f-]+<br/>
     *
     * @param deviceKey <p>
     *            The device key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeviceStatusRequest withDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
        return this;
    }

    /**
     * <p>
     * The status of whether a device is remembered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remembered, not_remembered
     *
     * @return <p>
     *         The status of whether a device is remembered.
     *         </p>
     * @see DeviceRememberedStatusType
     */
    public String getDeviceRememberedStatus() {
        return deviceRememberedStatus;
    }

    /**
     * <p>
     * The status of whether a device is remembered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remembered, not_remembered
     *
     * @param deviceRememberedStatus <p>
     *            The status of whether a device is remembered.
     *            </p>
     * @see DeviceRememberedStatusType
     */
    public void setDeviceRememberedStatus(String deviceRememberedStatus) {
        this.deviceRememberedStatus = deviceRememberedStatus;
    }

    /**
     * <p>
     * The status of whether a device is remembered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remembered, not_remembered
     *
     * @param deviceRememberedStatus <p>
     *            The status of whether a device is remembered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceRememberedStatusType
     */
    public UpdateDeviceStatusRequest withDeviceRememberedStatus(String deviceRememberedStatus) {
        this.deviceRememberedStatus = deviceRememberedStatus;
        return this;
    }

    /**
     * <p>
     * The status of whether a device is remembered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remembered, not_remembered
     *
     * @param deviceRememberedStatus <p>
     *            The status of whether a device is remembered.
     *            </p>
     * @see DeviceRememberedStatusType
     */
    public void setDeviceRememberedStatus(DeviceRememberedStatusType deviceRememberedStatus) {
        this.deviceRememberedStatus = deviceRememberedStatus.toString();
    }

    /**
     * <p>
     * The status of whether a device is remembered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remembered, not_remembered
     *
     * @param deviceRememberedStatus <p>
     *            The status of whether a device is remembered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceRememberedStatusType
     */
    public UpdateDeviceStatusRequest withDeviceRememberedStatus(
            DeviceRememberedStatusType deviceRememberedStatus) {
        this.deviceRememberedStatus = deviceRememberedStatus.toString();
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
        if (getAccessToken() != null)
            sb.append("AccessToken: " + getAccessToken() + ",");
        if (getDeviceKey() != null)
            sb.append("DeviceKey: " + getDeviceKey() + ",");
        if (getDeviceRememberedStatus() != null)
            sb.append("DeviceRememberedStatus: " + getDeviceRememberedStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getDeviceKey() == null) ? 0 : getDeviceKey().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeviceRememberedStatus() == null) ? 0 : getDeviceRememberedStatus()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDeviceStatusRequest == false)
            return false;
        UpdateDeviceStatusRequest other = (UpdateDeviceStatusRequest) obj;

        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null
                && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getDeviceKey() == null ^ this.getDeviceKey() == null)
            return false;
        if (other.getDeviceKey() != null
                && other.getDeviceKey().equals(this.getDeviceKey()) == false)
            return false;
        if (other.getDeviceRememberedStatus() == null ^ this.getDeviceRememberedStatus() == null)
            return false;
        if (other.getDeviceRememberedStatus() != null
                && other.getDeviceRememberedStatus().equals(this.getDeviceRememberedStatus()) == false)
            return false;
        return true;
    }
}
