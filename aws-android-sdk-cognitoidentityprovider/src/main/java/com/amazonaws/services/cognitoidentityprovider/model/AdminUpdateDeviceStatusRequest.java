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
 * Updates the device status as an administrator.
 * </p>
 * <p>
 * Requires developer credentials.
 * </p>
 */
public class AdminUpdateDeviceStatusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The user name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

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
     * The status indicating whether a device has been remembered or not.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remembered, not_remembered
     */
    private String deviceRememberedStatus;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminUpdateDeviceStatusRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The user name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The user name.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The user name.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The user name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminUpdateDeviceStatusRequest withUsername(String username) {
        this.username = username;
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
    public AdminUpdateDeviceStatusRequest withDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
        return this;
    }

    /**
     * <p>
     * The status indicating whether a device has been remembered or not.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remembered, not_remembered
     *
     * @return <p>
     *         The status indicating whether a device has been remembered or
     *         not.
     *         </p>
     * @see DeviceRememberedStatusType
     */
    public String getDeviceRememberedStatus() {
        return deviceRememberedStatus;
    }

    /**
     * <p>
     * The status indicating whether a device has been remembered or not.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remembered, not_remembered
     *
     * @param deviceRememberedStatus <p>
     *            The status indicating whether a device has been remembered or
     *            not.
     *            </p>
     * @see DeviceRememberedStatusType
     */
    public void setDeviceRememberedStatus(String deviceRememberedStatus) {
        this.deviceRememberedStatus = deviceRememberedStatus;
    }

    /**
     * <p>
     * The status indicating whether a device has been remembered or not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remembered, not_remembered
     *
     * @param deviceRememberedStatus <p>
     *            The status indicating whether a device has been remembered or
     *            not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceRememberedStatusType
     */
    public AdminUpdateDeviceStatusRequest withDeviceRememberedStatus(String deviceRememberedStatus) {
        this.deviceRememberedStatus = deviceRememberedStatus;
        return this;
    }

    /**
     * <p>
     * The status indicating whether a device has been remembered or not.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remembered, not_remembered
     *
     * @param deviceRememberedStatus <p>
     *            The status indicating whether a device has been remembered or
     *            not.
     *            </p>
     * @see DeviceRememberedStatusType
     */
    public void setDeviceRememberedStatus(DeviceRememberedStatusType deviceRememberedStatus) {
        this.deviceRememberedStatus = deviceRememberedStatus.toString();
    }

    /**
     * <p>
     * The status indicating whether a device has been remembered or not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remembered, not_remembered
     *
     * @param deviceRememberedStatus <p>
     *            The status indicating whether a device has been remembered or
     *            not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceRememberedStatusType
     */
    public AdminUpdateDeviceStatusRequest withDeviceRememberedStatus(
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
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

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
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

        if (obj instanceof AdminUpdateDeviceStatusRequest == false)
            return false;
        AdminUpdateDeviceStatusRequest other = (AdminUpdateDeviceStatusRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
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
