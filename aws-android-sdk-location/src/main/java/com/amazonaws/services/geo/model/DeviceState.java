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
 * The device's position, IP address, and Wi-Fi access points.
 * </p>
 */
public class DeviceState implements Serializable {
    /**
     * <p>
     * The device identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\p{L}\p{N}]+<br/>
     */
    private String deviceId;

    /**
     * <p>
     * The timestamp at which the device's position was determined. Uses <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601
     * </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date sampleTime;

    /**
     * <p>
     * The last known device position.
     * </p>
     */
    private java.util.List<Double> position;

    /**
     * <p>
     * Defines the level of certainty of the position.
     * </p>
     */
    private PositionalAccuracy accuracy;

    /**
     * <p>
     * The device's Ipv4 address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(?:(?:25[0-5]|(?:2[0-4]|1\d|[0-9]|)\d)\.?\b){4}<br/>
     */
    private String ipv4Address;

    /**
     * <p>
     * The Wi-Fi access points the device is using.
     * </p>
     */
    private java.util.List<WiFiAccessPoint> wiFiAccessPoints;

    /**
     * <p>
     * The cellular network infrastructure that the device is connected to.
     * </p>
     */
    private CellSignals cellSignals;

    /**
     * <p>
     * The device identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\p{L}\p{N}]+<br/>
     *
     * @return <p>
     *         The device identifier.
     *         </p>
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * <p>
     * The device identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\p{L}\p{N}]+<br/>
     *
     * @param deviceId <p>
     *            The device identifier.
     *            </p>
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The device identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\p{L}\p{N}]+<br/>
     *
     * @param deviceId <p>
     *            The device identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceState withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * <p>
     * The timestamp at which the device's position was determined. Uses <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601
     * </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @return <p>
     *         The timestamp at which the device's position was determined. Uses
     *         <a href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *         ISO 8601 </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *         </p>
     */
    public java.util.Date getSampleTime() {
        return sampleTime;
    }

    /**
     * <p>
     * The timestamp at which the device's position was determined. Uses <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601
     * </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @param sampleTime <p>
     *            The timestamp at which the device's position was determined.
     *            Uses <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601 </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     */
    public void setSampleTime(java.util.Date sampleTime) {
        this.sampleTime = sampleTime;
    }

    /**
     * <p>
     * The timestamp at which the device's position was determined. Uses <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601
     * </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleTime <p>
     *            The timestamp at which the device's position was determined.
     *            Uses <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601 </a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceState withSampleTime(java.util.Date sampleTime) {
        this.sampleTime = sampleTime;
        return this;
    }

    /**
     * <p>
     * The last known device position.
     * </p>
     *
     * @return <p>
     *         The last known device position.
     *         </p>
     */
    public java.util.List<Double> getPosition() {
        return position;
    }

    /**
     * <p>
     * The last known device position.
     * </p>
     *
     * @param position <p>
     *            The last known device position.
     *            </p>
     */
    public void setPosition(java.util.Collection<Double> position) {
        if (position == null) {
            this.position = null;
            return;
        }

        this.position = new java.util.ArrayList<Double>(position);
    }

    /**
     * <p>
     * The last known device position.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            The last known device position.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceState withPosition(Double... position) {
        if (getPosition() == null) {
            this.position = new java.util.ArrayList<Double>(position.length);
        }
        for (Double value : position) {
            this.position.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The last known device position.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            The last known device position.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceState withPosition(java.util.Collection<Double> position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * Defines the level of certainty of the position.
     * </p>
     *
     * @return <p>
     *         Defines the level of certainty of the position.
     *         </p>
     */
    public PositionalAccuracy getAccuracy() {
        return accuracy;
    }

    /**
     * <p>
     * Defines the level of certainty of the position.
     * </p>
     *
     * @param accuracy <p>
     *            Defines the level of certainty of the position.
     *            </p>
     */
    public void setAccuracy(PositionalAccuracy accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * <p>
     * Defines the level of certainty of the position.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accuracy <p>
     *            Defines the level of certainty of the position.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceState withAccuracy(PositionalAccuracy accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    /**
     * <p>
     * The device's Ipv4 address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(?:(?:25[0-5]|(?:2[0-4]|1\d|[0-9]|)\d)\.?\b){4}<br/>
     *
     * @return <p>
     *         The device's Ipv4 address.
     *         </p>
     */
    public String getIpv4Address() {
        return ipv4Address;
    }

    /**
     * <p>
     * The device's Ipv4 address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(?:(?:25[0-5]|(?:2[0-4]|1\d|[0-9]|)\d)\.?\b){4}<br/>
     *
     * @param ipv4Address <p>
     *            The device's Ipv4 address.
     *            </p>
     */
    public void setIpv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
    }

    /**
     * <p>
     * The device's Ipv4 address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(?:(?:25[0-5]|(?:2[0-4]|1\d|[0-9]|)\d)\.?\b){4}<br/>
     *
     * @param ipv4Address <p>
     *            The device's Ipv4 address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceState withIpv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
        return this;
    }

    /**
     * <p>
     * The Wi-Fi access points the device is using.
     * </p>
     *
     * @return <p>
     *         The Wi-Fi access points the device is using.
     *         </p>
     */
    public java.util.List<WiFiAccessPoint> getWiFiAccessPoints() {
        return wiFiAccessPoints;
    }

    /**
     * <p>
     * The Wi-Fi access points the device is using.
     * </p>
     *
     * @param wiFiAccessPoints <p>
     *            The Wi-Fi access points the device is using.
     *            </p>
     */
    public void setWiFiAccessPoints(java.util.Collection<WiFiAccessPoint> wiFiAccessPoints) {
        if (wiFiAccessPoints == null) {
            this.wiFiAccessPoints = null;
            return;
        }

        this.wiFiAccessPoints = new java.util.ArrayList<WiFiAccessPoint>(wiFiAccessPoints);
    }

    /**
     * <p>
     * The Wi-Fi access points the device is using.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param wiFiAccessPoints <p>
     *            The Wi-Fi access points the device is using.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceState withWiFiAccessPoints(WiFiAccessPoint... wiFiAccessPoints) {
        if (getWiFiAccessPoints() == null) {
            this.wiFiAccessPoints = new java.util.ArrayList<WiFiAccessPoint>(
                    wiFiAccessPoints.length);
        }
        for (WiFiAccessPoint value : wiFiAccessPoints) {
            this.wiFiAccessPoints.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Wi-Fi access points the device is using.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param wiFiAccessPoints <p>
     *            The Wi-Fi access points the device is using.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceState withWiFiAccessPoints(java.util.Collection<WiFiAccessPoint> wiFiAccessPoints) {
        setWiFiAccessPoints(wiFiAccessPoints);
        return this;
    }

    /**
     * <p>
     * The cellular network infrastructure that the device is connected to.
     * </p>
     *
     * @return <p>
     *         The cellular network infrastructure that the device is connected
     *         to.
     *         </p>
     */
    public CellSignals getCellSignals() {
        return cellSignals;
    }

    /**
     * <p>
     * The cellular network infrastructure that the device is connected to.
     * </p>
     *
     * @param cellSignals <p>
     *            The cellular network infrastructure that the device is
     *            connected to.
     *            </p>
     */
    public void setCellSignals(CellSignals cellSignals) {
        this.cellSignals = cellSignals;
    }

    /**
     * <p>
     * The cellular network infrastructure that the device is connected to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cellSignals <p>
     *            The cellular network infrastructure that the device is
     *            connected to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceState withCellSignals(CellSignals cellSignals) {
        this.cellSignals = cellSignals;
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
        if (getDeviceId() != null)
            sb.append("DeviceId: " + getDeviceId() + ",");
        if (getSampleTime() != null)
            sb.append("SampleTime: " + getSampleTime() + ",");
        if (getPosition() != null)
            sb.append("Position: " + getPosition() + ",");
        if (getAccuracy() != null)
            sb.append("Accuracy: " + getAccuracy() + ",");
        if (getIpv4Address() != null)
            sb.append("Ipv4Address: " + getIpv4Address() + ",");
        if (getWiFiAccessPoints() != null)
            sb.append("WiFiAccessPoints: " + getWiFiAccessPoints() + ",");
        if (getCellSignals() != null)
            sb.append("CellSignals: " + getCellSignals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getSampleTime() == null) ? 0 : getSampleTime().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getAccuracy() == null) ? 0 : getAccuracy().hashCode());
        hashCode = prime * hashCode
                + ((getIpv4Address() == null) ? 0 : getIpv4Address().hashCode());
        hashCode = prime * hashCode
                + ((getWiFiAccessPoints() == null) ? 0 : getWiFiAccessPoints().hashCode());
        hashCode = prime * hashCode
                + ((getCellSignals() == null) ? 0 : getCellSignals().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceState == false)
            return false;
        DeviceState other = (DeviceState) obj;

        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getSampleTime() == null ^ this.getSampleTime() == null)
            return false;
        if (other.getSampleTime() != null
                && other.getSampleTime().equals(this.getSampleTime()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getAccuracy() == null ^ this.getAccuracy() == null)
            return false;
        if (other.getAccuracy() != null && other.getAccuracy().equals(this.getAccuracy()) == false)
            return false;
        if (other.getIpv4Address() == null ^ this.getIpv4Address() == null)
            return false;
        if (other.getIpv4Address() != null
                && other.getIpv4Address().equals(this.getIpv4Address()) == false)
            return false;
        if (other.getWiFiAccessPoints() == null ^ this.getWiFiAccessPoints() == null)
            return false;
        if (other.getWiFiAccessPoints() != null
                && other.getWiFiAccessPoints().equals(this.getWiFiAccessPoints()) == false)
            return false;
        if (other.getCellSignals() == null ^ this.getCellSignals() == null)
            return false;
        if (other.getCellSignals() != null
                && other.getCellSignals().equals(this.getCellSignals()) == false)
            return false;
        return true;
    }
}
