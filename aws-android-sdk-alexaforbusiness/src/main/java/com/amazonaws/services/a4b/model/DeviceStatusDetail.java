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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * Details of a device’s status.
 * </p>
 */
public class DeviceStatusDetail implements Serializable {
    /**
     * <p>
     * The list of available features on the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLUETOOTH, VOLUME, NOTIFICATIONS, LISTS, SKILLS,
     * NETWORK_PROFILE, SETTINGS, ALL
     */
    private String feature;

    /**
     * <p>
     * The device status detail code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVICE_SOFTWARE_UPDATE_NEEDED, DEVICE_WAS_OFFLINE,
     * CREDENTIALS_ACCESS_FAILURE, TLS_VERSION_MISMATCH, ASSOCIATION_REJECTION,
     * AUTHENTICATION_FAILURE, DHCP_FAILURE, INTERNET_UNAVAILABLE, DNS_FAILURE,
     * UNKNOWN_FAILURE, CERTIFICATE_ISSUING_LIMIT_EXCEEDED,
     * INVALID_CERTIFICATE_AUTHORITY, NETWORK_PROFILE_NOT_FOUND,
     * INVALID_PASSWORD_STATE, PASSWORD_NOT_FOUND,
     * PASSWORD_MANAGER_ACCESS_DENIED, CERTIFICATE_AUTHORITY_ACCESS_DENIED
     */
    private String code;

    /**
     * <p>
     * The list of available features on the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLUETOOTH, VOLUME, NOTIFICATIONS, LISTS, SKILLS,
     * NETWORK_PROFILE, SETTINGS, ALL
     *
     * @return <p>
     *         The list of available features on the device.
     *         </p>
     * @see Feature
     */
    public String getFeature() {
        return feature;
    }

    /**
     * <p>
     * The list of available features on the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLUETOOTH, VOLUME, NOTIFICATIONS, LISTS, SKILLS,
     * NETWORK_PROFILE, SETTINGS, ALL
     *
     * @param feature <p>
     *            The list of available features on the device.
     *            </p>
     * @see Feature
     */
    public void setFeature(String feature) {
        this.feature = feature;
    }

    /**
     * <p>
     * The list of available features on the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLUETOOTH, VOLUME, NOTIFICATIONS, LISTS, SKILLS,
     * NETWORK_PROFILE, SETTINGS, ALL
     *
     * @param feature <p>
     *            The list of available features on the device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Feature
     */
    public DeviceStatusDetail withFeature(String feature) {
        this.feature = feature;
        return this;
    }

    /**
     * <p>
     * The list of available features on the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLUETOOTH, VOLUME, NOTIFICATIONS, LISTS, SKILLS,
     * NETWORK_PROFILE, SETTINGS, ALL
     *
     * @param feature <p>
     *            The list of available features on the device.
     *            </p>
     * @see Feature
     */
    public void setFeature(Feature feature) {
        this.feature = feature.toString();
    }

    /**
     * <p>
     * The list of available features on the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLUETOOTH, VOLUME, NOTIFICATIONS, LISTS, SKILLS,
     * NETWORK_PROFILE, SETTINGS, ALL
     *
     * @param feature <p>
     *            The list of available features on the device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Feature
     */
    public DeviceStatusDetail withFeature(Feature feature) {
        this.feature = feature.toString();
        return this;
    }

    /**
     * <p>
     * The device status detail code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVICE_SOFTWARE_UPDATE_NEEDED, DEVICE_WAS_OFFLINE,
     * CREDENTIALS_ACCESS_FAILURE, TLS_VERSION_MISMATCH, ASSOCIATION_REJECTION,
     * AUTHENTICATION_FAILURE, DHCP_FAILURE, INTERNET_UNAVAILABLE, DNS_FAILURE,
     * UNKNOWN_FAILURE, CERTIFICATE_ISSUING_LIMIT_EXCEEDED,
     * INVALID_CERTIFICATE_AUTHORITY, NETWORK_PROFILE_NOT_FOUND,
     * INVALID_PASSWORD_STATE, PASSWORD_NOT_FOUND,
     * PASSWORD_MANAGER_ACCESS_DENIED, CERTIFICATE_AUTHORITY_ACCESS_DENIED
     *
     * @return <p>
     *         The device status detail code.
     *         </p>
     * @see DeviceStatusDetailCode
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * The device status detail code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVICE_SOFTWARE_UPDATE_NEEDED, DEVICE_WAS_OFFLINE,
     * CREDENTIALS_ACCESS_FAILURE, TLS_VERSION_MISMATCH, ASSOCIATION_REJECTION,
     * AUTHENTICATION_FAILURE, DHCP_FAILURE, INTERNET_UNAVAILABLE, DNS_FAILURE,
     * UNKNOWN_FAILURE, CERTIFICATE_ISSUING_LIMIT_EXCEEDED,
     * INVALID_CERTIFICATE_AUTHORITY, NETWORK_PROFILE_NOT_FOUND,
     * INVALID_PASSWORD_STATE, PASSWORD_NOT_FOUND,
     * PASSWORD_MANAGER_ACCESS_DENIED, CERTIFICATE_AUTHORITY_ACCESS_DENIED
     *
     * @param code <p>
     *            The device status detail code.
     *            </p>
     * @see DeviceStatusDetailCode
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The device status detail code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVICE_SOFTWARE_UPDATE_NEEDED, DEVICE_WAS_OFFLINE,
     * CREDENTIALS_ACCESS_FAILURE, TLS_VERSION_MISMATCH, ASSOCIATION_REJECTION,
     * AUTHENTICATION_FAILURE, DHCP_FAILURE, INTERNET_UNAVAILABLE, DNS_FAILURE,
     * UNKNOWN_FAILURE, CERTIFICATE_ISSUING_LIMIT_EXCEEDED,
     * INVALID_CERTIFICATE_AUTHORITY, NETWORK_PROFILE_NOT_FOUND,
     * INVALID_PASSWORD_STATE, PASSWORD_NOT_FOUND,
     * PASSWORD_MANAGER_ACCESS_DENIED, CERTIFICATE_AUTHORITY_ACCESS_DENIED
     *
     * @param code <p>
     *            The device status detail code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceStatusDetailCode
     */
    public DeviceStatusDetail withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * The device status detail code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVICE_SOFTWARE_UPDATE_NEEDED, DEVICE_WAS_OFFLINE,
     * CREDENTIALS_ACCESS_FAILURE, TLS_VERSION_MISMATCH, ASSOCIATION_REJECTION,
     * AUTHENTICATION_FAILURE, DHCP_FAILURE, INTERNET_UNAVAILABLE, DNS_FAILURE,
     * UNKNOWN_FAILURE, CERTIFICATE_ISSUING_LIMIT_EXCEEDED,
     * INVALID_CERTIFICATE_AUTHORITY, NETWORK_PROFILE_NOT_FOUND,
     * INVALID_PASSWORD_STATE, PASSWORD_NOT_FOUND,
     * PASSWORD_MANAGER_ACCESS_DENIED, CERTIFICATE_AUTHORITY_ACCESS_DENIED
     *
     * @param code <p>
     *            The device status detail code.
     *            </p>
     * @see DeviceStatusDetailCode
     */
    public void setCode(DeviceStatusDetailCode code) {
        this.code = code.toString();
    }

    /**
     * <p>
     * The device status detail code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVICE_SOFTWARE_UPDATE_NEEDED, DEVICE_WAS_OFFLINE,
     * CREDENTIALS_ACCESS_FAILURE, TLS_VERSION_MISMATCH, ASSOCIATION_REJECTION,
     * AUTHENTICATION_FAILURE, DHCP_FAILURE, INTERNET_UNAVAILABLE, DNS_FAILURE,
     * UNKNOWN_FAILURE, CERTIFICATE_ISSUING_LIMIT_EXCEEDED,
     * INVALID_CERTIFICATE_AUTHORITY, NETWORK_PROFILE_NOT_FOUND,
     * INVALID_PASSWORD_STATE, PASSWORD_NOT_FOUND,
     * PASSWORD_MANAGER_ACCESS_DENIED, CERTIFICATE_AUTHORITY_ACCESS_DENIED
     *
     * @param code <p>
     *            The device status detail code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceStatusDetailCode
     */
    public DeviceStatusDetail withCode(DeviceStatusDetailCode code) {
        this.code = code.toString();
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
        if (getFeature() != null)
            sb.append("Feature: " + getFeature() + ",");
        if (getCode() != null)
            sb.append("Code: " + getCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeature() == null) ? 0 : getFeature().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceStatusDetail == false)
            return false;
        DeviceStatusDetail other = (DeviceStatusDetail) obj;

        if (other.getFeature() == null ^ this.getFeature() == null)
            return false;
        if (other.getFeature() != null && other.getFeature().equals(this.getFeature()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        return true;
    }
}
