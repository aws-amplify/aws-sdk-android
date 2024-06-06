/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Wi-Fi access point.
 * </p>
 */
public class WiFiAccessPoint implements Serializable {
    /**
     * <p>
     * Medium access control address (Mac).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 17<br/>
     * <b>Pattern: </b>([0-9A-Fa-f]{2}[:-]?){5}([0-9A-Fa-f]{2})<br/>
     */
    private String macAddress;

    /**
     * <p>
     * Received signal strength (dBm) of the WLAN measurement data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-128 - 0<br/>
     */
    private Integer rss;

    /**
     * <p>
     * Medium access control address (Mac).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 17<br/>
     * <b>Pattern: </b>([0-9A-Fa-f]{2}[:-]?){5}([0-9A-Fa-f]{2})<br/>
     *
     * @return <p>
     *         Medium access control address (Mac).
     *         </p>
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * <p>
     * Medium access control address (Mac).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 17<br/>
     * <b>Pattern: </b>([0-9A-Fa-f]{2}[:-]?){5}([0-9A-Fa-f]{2})<br/>
     *
     * @param macAddress <p>
     *            Medium access control address (Mac).
     *            </p>
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * <p>
     * Medium access control address (Mac).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 17<br/>
     * <b>Pattern: </b>([0-9A-Fa-f]{2}[:-]?){5}([0-9A-Fa-f]{2})<br/>
     *
     * @param macAddress <p>
     *            Medium access control address (Mac).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WiFiAccessPoint withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * <p>
     * Received signal strength (dBm) of the WLAN measurement data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-128 - 0<br/>
     *
     * @return <p>
     *         Received signal strength (dBm) of the WLAN measurement data.
     *         </p>
     */
    public Integer getRss() {
        return rss;
    }

    /**
     * <p>
     * Received signal strength (dBm) of the WLAN measurement data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-128 - 0<br/>
     *
     * @param rss <p>
     *            Received signal strength (dBm) of the WLAN measurement data.
     *            </p>
     */
    public void setRss(Integer rss) {
        this.rss = rss;
    }

    /**
     * <p>
     * Received signal strength (dBm) of the WLAN measurement data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-128 - 0<br/>
     *
     * @param rss <p>
     *            Received signal strength (dBm) of the WLAN measurement data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WiFiAccessPoint withRss(Integer rss) {
        this.rss = rss;
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
        if (getMacAddress() != null)
            sb.append("MacAddress: " + getMacAddress() + ",");
        if (getRss() != null)
            sb.append("Rss: " + getRss());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        hashCode = prime * hashCode + ((getRss() == null) ? 0 : getRss().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WiFiAccessPoint == false)
            return false;
        WiFiAccessPoint other = (WiFiAccessPoint) obj;

        if (other.getMacAddress() == null ^ this.getMacAddress() == null)
            return false;
        if (other.getMacAddress() != null
                && other.getMacAddress().equals(this.getMacAddress()) == false)
            return false;
        if (other.getRss() == null ^ this.getRss() == null)
            return false;
        if (other.getRss() != null && other.getRss().equals(this.getRss()) == false)
            return false;
        return true;
    }
}
