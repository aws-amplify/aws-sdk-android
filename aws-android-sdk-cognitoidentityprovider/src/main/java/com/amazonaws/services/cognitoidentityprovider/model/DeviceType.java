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

public class DeviceType implements Serializable {
    /**
     * The new value for the deviceKey property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String deviceKey;

    /**
     * The new value for the deviceAttributes property for this object.
     */
    private java.util.List<AttributeType> deviceAttributes;

    /**
     * The new value for the deviceCreateDate property for this object.
     */
    private java.util.Date deviceCreateDate;

    /**
     * The new value for the deviceLastModifiedDate property for this object.
     */
    private java.util.Date deviceLastModifiedDate;

    /**
     * The new value for the deviceLastAccessedDate property for this object.
     */
    private java.util.Date deviceLastAccessedDate;

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
    public DeviceType withDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
        return this;
    }

    /**
     * Returns the value of the deviceAttributes property for this object.
     *
     * @return The value of the deviceAttributes property for this object.
     */
    public java.util.List<AttributeType> getDeviceAttributes() {
        return deviceAttributes;
    }

    /**
     * Sets the value of deviceAttributes
     *
     * @param deviceAttributes The new value for the deviceAttributes property
     *            for this object.
     */
    public void setDeviceAttributes(java.util.Collection<AttributeType> deviceAttributes) {
        if (deviceAttributes == null) {
            this.deviceAttributes = null;
            return;
        }

        this.deviceAttributes = new java.util.ArrayList<AttributeType>(deviceAttributes);
    }

    /**
     * Sets the value of the deviceAttributes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceAttributes The new value for the deviceAttributes property
     *            for this object.
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
     * Sets the value of the deviceAttributes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceAttributes The new value for the deviceAttributes property
     *            for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceType withDeviceAttributes(java.util.Collection<AttributeType> deviceAttributes) {
        setDeviceAttributes(deviceAttributes);
        return this;
    }

    /**
     * Returns the value of the deviceCreateDate property for this object.
     *
     * @return The value of the deviceCreateDate property for this object.
     */
    public java.util.Date getDeviceCreateDate() {
        return deviceCreateDate;
    }

    /**
     * Sets the value of deviceCreateDate
     *
     * @param deviceCreateDate The new value for the deviceCreateDate property
     *            for this object.
     */
    public void setDeviceCreateDate(java.util.Date deviceCreateDate) {
        this.deviceCreateDate = deviceCreateDate;
    }

    /**
     * Sets the value of the deviceCreateDate property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceCreateDate The new value for the deviceCreateDate property
     *            for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceType withDeviceCreateDate(java.util.Date deviceCreateDate) {
        this.deviceCreateDate = deviceCreateDate;
        return this;
    }

    /**
     * Returns the value of the deviceLastModifiedDate property for this object.
     *
     * @return The value of the deviceLastModifiedDate property for this object.
     */
    public java.util.Date getDeviceLastModifiedDate() {
        return deviceLastModifiedDate;
    }

    /**
     * Sets the value of deviceLastModifiedDate
     *
     * @param deviceLastModifiedDate The new value for the
     *            deviceLastModifiedDate property for this object.
     */
    public void setDeviceLastModifiedDate(java.util.Date deviceLastModifiedDate) {
        this.deviceLastModifiedDate = deviceLastModifiedDate;
    }

    /**
     * Sets the value of the deviceLastModifiedDate property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceLastModifiedDate The new value for the
     *            deviceLastModifiedDate property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceType withDeviceLastModifiedDate(java.util.Date deviceLastModifiedDate) {
        this.deviceLastModifiedDate = deviceLastModifiedDate;
        return this;
    }

    /**
     * Returns the value of the deviceLastAccessedDate property for this object.
     *
     * @return The value of the deviceLastAccessedDate property for this object.
     */
    public java.util.Date getDeviceLastAccessedDate() {
        return deviceLastAccessedDate;
    }

    /**
     * Sets the value of deviceLastAccessedDate
     *
     * @param deviceLastAccessedDate The new value for the
     *            deviceLastAccessedDate property for this object.
     */
    public void setDeviceLastAccessedDate(java.util.Date deviceLastAccessedDate) {
        this.deviceLastAccessedDate = deviceLastAccessedDate;
    }

    /**
     * Sets the value of the deviceLastAccessedDate property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceLastAccessedDate The new value for the
     *            deviceLastAccessedDate property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceType withDeviceLastAccessedDate(java.util.Date deviceLastAccessedDate) {
        this.deviceLastAccessedDate = deviceLastAccessedDate;
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
        if (getDeviceLastAccessedDate() != null)
            sb.append("DeviceLastAccessedDate: " + getDeviceLastAccessedDate());
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
                + ((getDeviceLastAccessedDate() == null) ? 0 : getDeviceLastAccessedDate()
                        .hashCode());
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
        if (other.getDeviceLastAccessedDate() == null ^ this.getDeviceLastAccessedDate() == null)
            return false;
        if (other.getDeviceLastAccessedDate() != null
                && other.getDeviceLastAccessedDate().equals(this.getDeviceLastAccessedDate()) == false)
            return false;
        return true;
    }
}
