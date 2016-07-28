/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class ConfirmDeviceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The new value for the accessToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     */
    private String accessToken;

    /**
     * The new value for the deviceKey property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String deviceKey;

    /**
     * The new value for the deviceSecretVerifierConfig property for this
     * object.
     */
    private DeviceSecretVerifierConfigType deviceSecretVerifierConfig;

    /**
     * The new value for the deviceName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     */
    private String deviceName;

    /**
     * Returns the value of the accessToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @return The value of the accessToken property for this object.
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the value of accessToken
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken The new value for the accessToken property for this
     *            object.
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * Sets the value of the accessToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken The new value for the accessToken property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmDeviceRequest withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Returns the value of the deviceKey property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return The value of the deviceKey property for this object.
     */
    public String getDeviceKey() {
        return deviceKey;
    }

    /**
     * Sets the value of deviceKey
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param deviceKey The new value for the deviceKey property for this
     *            object.
     */
    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    /**
     * Sets the value of the deviceKey property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param deviceKey The new value for the deviceKey property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmDeviceRequest withDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
        return this;
    }

    /**
     * Returns the value of the deviceSecretVerifierConfig property for this
     * object.
     *
     * @return The value of the deviceSecretVerifierConfig property for this
     *         object.
     */
    public DeviceSecretVerifierConfigType getDeviceSecretVerifierConfig() {
        return deviceSecretVerifierConfig;
    }

    /**
     * Sets the value of deviceSecretVerifierConfig
     *
     * @param deviceSecretVerifierConfig The new value for the
     *            deviceSecretVerifierConfig property for this object.
     */
    public void setDeviceSecretVerifierConfig(
            DeviceSecretVerifierConfigType deviceSecretVerifierConfig) {
        this.deviceSecretVerifierConfig = deviceSecretVerifierConfig;
    }

    /**
     * Sets the value of the deviceSecretVerifierConfig property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceSecretVerifierConfig The new value for the
     *            deviceSecretVerifierConfig property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmDeviceRequest withDeviceSecretVerifierConfig(
            DeviceSecretVerifierConfigType deviceSecretVerifierConfig) {
        this.deviceSecretVerifierConfig = deviceSecretVerifierConfig;
        return this;
    }

    /**
     * Returns the value of the deviceName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     *
     * @return The value of the deviceName property for this object.
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of deviceName
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     *
     * @param deviceName The new value for the deviceName property for this
     *            object.
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * Sets the value of the deviceName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     *
     * @param deviceName The new value for the deviceName property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmDeviceRequest withDeviceName(String deviceName) {
        this.deviceName = deviceName;
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
        if (getDeviceSecretVerifierConfig() != null)
            sb.append("DeviceSecretVerifierConfig: " + getDeviceSecretVerifierConfig() + ",");
        if (getDeviceName() != null)
            sb.append("DeviceName: " + getDeviceName());
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
                + ((getDeviceSecretVerifierConfig() == null) ? 0 : getDeviceSecretVerifierConfig()
                        .hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfirmDeviceRequest == false)
            return false;
        ConfirmDeviceRequest other = (ConfirmDeviceRequest) obj;

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
        if (other.getDeviceSecretVerifierConfig() == null
                ^ this.getDeviceSecretVerifierConfig() == null)
            return false;
        if (other.getDeviceSecretVerifierConfig() != null
                && other.getDeviceSecretVerifierConfig().equals(
                        this.getDeviceSecretVerifierConfig()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null
                && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        return true;
    }
}
