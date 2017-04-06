/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The device type.
 * </p>
 */
public class DeviceType implements Serializable {
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
     * The device attributes.
     * </p>
     */
    private java.util.List<AttributeType> deviceAttributes;

    /**
     * <p>
     * The creation date of the device.
     * </p>
     */
    private java.util.Date deviceCreateDate;

    /**
     * <p>
     * The last modified date of the device.
     * </p>
     */
    private java.util.Date deviceLastModifiedDate;

    /**
     * <p>
     * The date in which the device was last authenticated.
     * </p>
     */
    private java.util.Date deviceLastAuthenticatedDate;

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
    public DeviceType withDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
        return this;
    }

    /**
     * <p>
     * The device attributes.
     * </p>
     *
     * @return <p>
     *         The device attributes.
     *         </p>
     */
    public java.util.List<AttributeType> getDeviceAttributes() {
        return deviceAttributes;
    }

    /**
     * <p>
     * The device attributes.
     * </p>
     *
     * @param deviceAttributes <p>
     *            The device attributes.
     *            </p>
     */
    public void setDeviceAttributes(java.util.Collection<AttributeType> deviceAttributes) {
        if (deviceAttributes == null) {
            this.deviceAttributes = null;
            return;
        }

        this.deviceAttributes = new java.util.ArrayList<AttributeType>(deviceAttributes);
    }

    /**
     * <p>
     * The device attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceAttributes <p>
     *            The device attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceType withDeviceAttributes(AttributeType... deviceAttributes) {
        if (getDeviceAttributes() == null) {
            this.deviceAttributes = new java.util.ArrayList<AttributeType>(deviceAttributes.length);
        }
        for (AttributeType value : deviceAttributes) {
            this.deviceAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The device attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceAttributes <p>
     *            The device attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceType withDeviceAttributes(java.util.Collection<AttributeType> deviceAttributes) {
        setDeviceAttributes(deviceAttributes);
        return this;
    }

    /**
     * <p>
     * The creation date of the device.
     * </p>
     *
     * @return <p>
     *         The creation date of the device.
     *         </p>
     */
    public java.util.Date getDeviceCreateDate() {
        return deviceCreateDate;
    }

    /**
     * <p>
     * The creation date of the device.
     * </p>
     *
     * @param deviceCreateDate <p>
     *            The creation date of the device.
     *            </p>
     */
    public void setDeviceCreateDate(java.util.Date deviceCreateDate) {
        this.deviceCreateDate = deviceCreateDate;
    }

    /**
     * <p>
     * The creation date of the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceCreateDate <p>
     *            The creation date of the device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceType withDeviceCreateDate(java.util.Date deviceCreateDate) {
        this.deviceCreateDate = deviceCreateDate;
        return this;
    }

    /**
     * <p>
     * The last modified date of the device.
     * </p>
     *
     * @return <p>
     *         The last modified date of the device.
     *         </p>
     */
    public java.util.Date getDeviceLastModifiedDate() {
        return deviceLastModifiedDate;
    }

    /**
     * <p>
     * The last modified date of the device.
     * </p>
     *
     * @param deviceLastModifiedDate <p>
     *            The last modified date of the device.
     *            </p>
     */
    public void setDeviceLastModifiedDate(java.util.Date deviceLastModifiedDate) {
        this.deviceLastModifiedDate = deviceLastModifiedDate;
    }

    /**
     * <p>
     * The last modified date of the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceLastModifiedDate <p>
     *            The last modified date of the device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceType withDeviceLastModifiedDate(java.util.Date deviceLastModifiedDate) {
        this.deviceLastModifiedDate = deviceLastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The date in which the device was last authenticated.
     * </p>
     *
     * @return <p>
     *         The date in which the device was last authenticated.
     *         </p>
     */
    public java.util.Date getDeviceLastAuthenticatedDate() {
        return deviceLastAuthenticatedDate;
    }

    /**
     * <p>
     * The date in which the device was last authenticated.
     * </p>
     *
     * @param deviceLastAuthenticatedDate <p>
     *            The date in which the device was last authenticated.
     *            </p>
     */
    public void setDeviceLastAuthenticatedDate(java.util.Date deviceLastAuthenticatedDate) {
        this.deviceLastAuthenticatedDate = deviceLastAuthenticatedDate;
    }

    /**
     * <p>
     * The date in which the device was last authenticated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceLastAuthenticatedDate <p>
     *            The date in which the device was last authenticated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceType withDeviceLastAuthenticatedDate(java.util.Date deviceLastAuthenticatedDate) {
        this.deviceLastAuthenticatedDate = deviceLastAuthenticatedDate;
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
        if (getDeviceKey() != null)
            sb.append("DeviceKey: " + getDeviceKey() + ",");
        if (getDeviceAttributes() != null)
            sb.append("DeviceAttributes: " + getDeviceAttributes() + ",");
        if (getDeviceCreateDate() != null)
            sb.append("DeviceCreateDate: " + getDeviceCreateDate() + ",");
        if (getDeviceLastModifiedDate() != null)
            sb.append("DeviceLastModifiedDate: " + getDeviceLastModifiedDate() + ",");
        if (getDeviceLastAuthenticatedDate() != null)
            sb.append("DeviceLastAuthenticatedDate: " + getDeviceLastAuthenticatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceKey() == null) ? 0 : getDeviceKey().hashCode());
        hashCode = prime * hashCode
                + ((getDeviceAttributes() == null) ? 0 : getDeviceAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getDeviceCreateDate() == null) ? 0 : getDeviceCreateDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeviceLastModifiedDate() == null) ? 0 : getDeviceLastModifiedDate()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDeviceLastAuthenticatedDate() == null) ? 0
                        : getDeviceLastAuthenticatedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceType == false)
            return false;
        DeviceType other = (DeviceType) obj;

        if (other.getDeviceKey() == null ^ this.getDeviceKey() == null)
            return false;
        if (other.getDeviceKey() != null
                && other.getDeviceKey().equals(this.getDeviceKey()) == false)
            return false;
        if (other.getDeviceAttributes() == null ^ this.getDeviceAttributes() == null)
            return false;
        if (other.getDeviceAttributes() != null
                && other.getDeviceAttributes().equals(this.getDeviceAttributes()) == false)
            return false;
        if (other.getDeviceCreateDate() == null ^ this.getDeviceCreateDate() == null)
            return false;
        if (other.getDeviceCreateDate() != null
                && other.getDeviceCreateDate().equals(this.getDeviceCreateDate()) == false)
            return false;
        if (other.getDeviceLastModifiedDate() == null ^ this.getDeviceLastModifiedDate() == null)
            return false;
        if (other.getDeviceLastModifiedDate() != null
                && other.getDeviceLastModifiedDate().equals(this.getDeviceLastModifiedDate()) == false)
            return false;
        if (other.getDeviceLastAuthenticatedDate() == null
                ^ this.getDeviceLastAuthenticatedDate() == null)
            return false;
        if (other.getDeviceLastAuthenticatedDate() != null
                && other.getDeviceLastAuthenticatedDate().equals(
                        this.getDeviceLastAuthenticatedDate()) == false)
            return false;
        return true;
    }
}
