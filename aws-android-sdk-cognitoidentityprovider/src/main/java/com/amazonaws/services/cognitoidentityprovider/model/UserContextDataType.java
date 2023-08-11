/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contextual data, such as the user's device fingerprint, IP address, or
 * location, used for evaluating the risk of an unexpected event by Amazon
 * Cognito advanced security.
 * </p>
 */
public class UserContextDataType implements Serializable {
    /**
     * <p>
     * The source IP address of your user's device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131072<br/>
     */
    private String ipAddress;

    /**
     * <p>
     * Encoded device-fingerprint details that your app collected with the
     * Amazon Cognito context data collection library. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     * >Adding user device and session data to API requests</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131072<br/>
     */
    private String encodedData;

    /**
     * <p>
     * The source IP address of your user's device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131072<br/>
     *
     * @return <p>
     *         The source IP address of your user's device.
     *         </p>
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * <p>
     * The source IP address of your user's device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131072<br/>
     *
     * @param ipAddress <p>
     *            The source IP address of your user's device.
     *            </p>
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The source IP address of your user's device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131072<br/>
     *
     * @param ipAddress <p>
     *            The source IP address of your user's device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserContextDataType withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * <p>
     * Encoded device-fingerprint details that your app collected with the
     * Amazon Cognito context data collection library. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     * >Adding user device and session data to API requests</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131072<br/>
     *
     * @return <p>
     *         Encoded device-fingerprint details that your app collected with
     *         the Amazon Cognito context data collection library. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     *         >Adding user device and session data to API requests</a>.
     *         </p>
     */
    public String getEncodedData() {
        return encodedData;
    }

    /**
     * <p>
     * Encoded device-fingerprint details that your app collected with the
     * Amazon Cognito context data collection library. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     * >Adding user device and session data to API requests</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131072<br/>
     *
     * @param encodedData <p>
     *            Encoded device-fingerprint details that your app collected
     *            with the Amazon Cognito context data collection library. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     *            >Adding user device and session data to API requests</a>.
     *            </p>
     */
    public void setEncodedData(String encodedData) {
        this.encodedData = encodedData;
    }

    /**
     * <p>
     * Encoded device-fingerprint details that your app collected with the
     * Amazon Cognito context data collection library. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     * >Adding user device and session data to API requests</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131072<br/>
     *
     * @param encodedData <p>
     *            Encoded device-fingerprint details that your app collected
     *            with the Amazon Cognito context data collection library. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     *            >Adding user device and session data to API requests</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserContextDataType withEncodedData(String encodedData) {
        this.encodedData = encodedData;
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
        if (getIpAddress() != null)
            sb.append("IpAddress: " + getIpAddress() + ",");
        if (getEncodedData() != null)
            sb.append("EncodedData: " + getEncodedData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode
                + ((getEncodedData() == null) ? 0 : getEncodedData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserContextDataType == false)
            return false;
        UserContextDataType other = (UserContextDataType) obj;

        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null
                && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getEncodedData() == null ^ this.getEncodedData() == null)
            return false;
        if (other.getEncodedData() != null
                && other.getEncodedData().equals(this.getEncodedData()) == false)
            return false;
        return true;
    }
}
