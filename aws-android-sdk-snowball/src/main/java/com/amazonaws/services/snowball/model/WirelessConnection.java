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

package com.amazonaws.services.snowball.model;

import java.io.Serializable;

/**
 * <p>
 * Configures the wireless connection on an AWS Snowcone device.
 * </p>
 */
public class WirelessConnection implements Serializable {
    /**
     * <p>
     * Enables the Wi-Fi adapter on an AWS Snowcone device.
     * </p>
     */
    private Boolean isWifiEnabled;

    /**
     * <p>
     * Enables the Wi-Fi adapter on an AWS Snowcone device.
     * </p>
     *
     * @return <p>
     *         Enables the Wi-Fi adapter on an AWS Snowcone device.
     *         </p>
     */
    public Boolean isIsWifiEnabled() {
        return isWifiEnabled;
    }

    /**
     * <p>
     * Enables the Wi-Fi adapter on an AWS Snowcone device.
     * </p>
     *
     * @return <p>
     *         Enables the Wi-Fi adapter on an AWS Snowcone device.
     *         </p>
     */
    public Boolean getIsWifiEnabled() {
        return isWifiEnabled;
    }

    /**
     * <p>
     * Enables the Wi-Fi adapter on an AWS Snowcone device.
     * </p>
     *
     * @param isWifiEnabled <p>
     *            Enables the Wi-Fi adapter on an AWS Snowcone device.
     *            </p>
     */
    public void setIsWifiEnabled(Boolean isWifiEnabled) {
        this.isWifiEnabled = isWifiEnabled;
    }

    /**
     * <p>
     * Enables the Wi-Fi adapter on an AWS Snowcone device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isWifiEnabled <p>
     *            Enables the Wi-Fi adapter on an AWS Snowcone device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WirelessConnection withIsWifiEnabled(Boolean isWifiEnabled) {
        this.isWifiEnabled = isWifiEnabled;
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
        if (getIsWifiEnabled() != null)
            sb.append("IsWifiEnabled: " + getIsWifiEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIsWifiEnabled() == null) ? 0 : getIsWifiEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WirelessConnection == false)
            return false;
        WirelessConnection other = (WirelessConnection) obj;

        if (other.getIsWifiEnabled() == null ^ this.getIsWifiEnabled() == null)
            return false;
        if (other.getIsWifiEnabled() != null
                && other.getIsWifiEnabled().equals(this.getIsWifiEnabled()) == false)
            return false;
        return true;
    }
}
