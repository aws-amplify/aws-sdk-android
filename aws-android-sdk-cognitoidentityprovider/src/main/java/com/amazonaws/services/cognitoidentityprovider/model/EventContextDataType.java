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
 * Specifies the user context data captured at the time of an event request.
 * </p>
 */
public class EventContextDataType implements Serializable {
    /**
     * <p>
     * The user's IP address.
     * </p>
     */
    private String ipAddress;

    /**
     * <p>
     * The user's device name.
     * </p>
     */
    private String deviceName;

    /**
     * <p>
     * The user's time zone.
     * </p>
     */
    private String timezone;

    /**
     * <p>
     * The user's city.
     * </p>
     */
    private String city;

    /**
     * <p>
     * The user's country.
     * </p>
     */
    private String country;

    /**
     * <p>
     * The user's IP address.
     * </p>
     *
     * @return <p>
     *         The user's IP address.
     *         </p>
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * <p>
     * The user's IP address.
     * </p>
     *
     * @param ipAddress <p>
     *            The user's IP address.
     *            </p>
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The user's IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipAddress <p>
     *            The user's IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventContextDataType withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * <p>
     * The user's device name.
     * </p>
     *
     * @return <p>
     *         The user's device name.
     *         </p>
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * <p>
     * The user's device name.
     * </p>
     *
     * @param deviceName <p>
     *            The user's device name.
     *            </p>
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The user's device name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceName <p>
     *            The user's device name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventContextDataType withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * <p>
     * The user's time zone.
     * </p>
     *
     * @return <p>
     *         The user's time zone.
     *         </p>
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * <p>
     * The user's time zone.
     * </p>
     *
     * @param timezone <p>
     *            The user's time zone.
     *            </p>
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The user's time zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timezone <p>
     *            The user's time zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventContextDataType withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * <p>
     * The user's city.
     * </p>
     *
     * @return <p>
     *         The user's city.
     *         </p>
     */
    public String getCity() {
        return city;
    }

    /**
     * <p>
     * The user's city.
     * </p>
     *
     * @param city <p>
     *            The user's city.
     *            </p>
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The user's city.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param city <p>
     *            The user's city.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventContextDataType withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * <p>
     * The user's country.
     * </p>
     *
     * @return <p>
     *         The user's country.
     *         </p>
     */
    public String getCountry() {
        return country;
    }

    /**
     * <p>
     * The user's country.
     * </p>
     *
     * @param country <p>
     *            The user's country.
     *            </p>
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The user's country.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param country <p>
     *            The user's country.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EventContextDataType withCountry(String country) {
        this.country = country;
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
        if (getDeviceName() != null)
            sb.append("DeviceName: " + getDeviceName() + ",");
        if (getTimezone() != null)
            sb.append("Timezone: " + getTimezone() + ",");
        if (getCity() != null)
            sb.append("City: " + getCity() + ",");
        if (getCountry() != null)
            sb.append("Country: " + getCountry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventContextDataType == false)
            return false;
        EventContextDataType other = (EventContextDataType) obj;

        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null
                && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null
                && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        return true;
    }
}
