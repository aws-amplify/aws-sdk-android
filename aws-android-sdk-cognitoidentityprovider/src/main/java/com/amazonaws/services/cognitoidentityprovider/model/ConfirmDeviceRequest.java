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
 * Confirms tracking of the device. This API call is the call that begins device
 * tracking.
 * </p>
 */
public class ConfirmDeviceRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The configuration of the device secret verifier.
     * </p>
     */
    private DeviceSecretVerifierConfigType deviceSecretVerifierConfig;

    /**
     * <p>
     * The device name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String deviceName;

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
    public ConfirmDeviceRequest withAccessToken(String accessToken) {
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
    public ConfirmDeviceRequest withDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
        return this;
    }

    /**
     * <p>
     * The configuration of the device secret verifier.
     * </p>
     *
     * @return <p>
     *         The configuration of the device secret verifier.
     *         </p>
     */
    public DeviceSecretVerifierConfigType getDeviceSecretVerifierConfig() {
        return deviceSecretVerifierConfig;
    }

    /**
     * <p>
     * The configuration of the device secret verifier.
     * </p>
     *
     * @param deviceSecretVerifierConfig <p>
     *            The configuration of the device secret verifier.
     *            </p>
     */
    public void setDeviceSecretVerifierConfig(
            DeviceSecretVerifierConfigType deviceSecretVerifierConfig) {
        this.deviceSecretVerifierConfig = deviceSecretVerifierConfig;
    }

    /**
     * <p>
     * The configuration of the device secret verifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceSecretVerifierConfig <p>
     *            The configuration of the device secret verifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmDeviceRequest withDeviceSecretVerifierConfig(
            DeviceSecretVerifierConfigType deviceSecretVerifierConfig) {
        this.deviceSecretVerifierConfig = deviceSecretVerifierConfig;
        return this;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The device name.
     *         </p>
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param deviceName <p>
     *            The device name.
     *            </p>
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param deviceName <p>
     *            The device name.
     *            </p>
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
