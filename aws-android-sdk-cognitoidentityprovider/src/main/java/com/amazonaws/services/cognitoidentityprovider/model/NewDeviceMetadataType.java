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

public class NewDeviceMetadataType implements Serializable {
    /**
     * The new value for the deviceKey property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String deviceKey;

    /**
     * The new value for the deviceGroupKey property for this object.
     */
    private String deviceGroupKey;

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
    public NewDeviceMetadataType withDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
        return this;
    }

    /**
     * Returns the value of the deviceGroupKey property for this object.
     *
     * @return The value of the deviceGroupKey property for this object.
     */
    public String getDeviceGroupKey() {
        return deviceGroupKey;
    }

    /**
     * Sets the value of deviceGroupKey
     *
     * @param deviceGroupKey The new value for the deviceGroupKey property for
     *            this object.
     */
    public void setDeviceGroupKey(String deviceGroupKey) {
        this.deviceGroupKey = deviceGroupKey;
    }

    /**
     * Sets the value of the deviceGroupKey property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceGroupKey The new value for the deviceGroupKey property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewDeviceMetadataType withDeviceGroupKey(String deviceGroupKey) {
        this.deviceGroupKey = deviceGroupKey;
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
        if (getDeviceGroupKey() != null)
            sb.append("DeviceGroupKey: " + getDeviceGroupKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceKey() == null) ? 0 : getDeviceKey().hashCode());
        hashCode = prime * hashCode
                + ((getDeviceGroupKey() == null) ? 0 : getDeviceGroupKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewDeviceMetadataType == false)
            return false;
        NewDeviceMetadataType other = (NewDeviceMetadataType) obj;

        if (other.getDeviceKey() == null ^ this.getDeviceKey() == null)
            return false;
        if (other.getDeviceKey() != null
                && other.getDeviceKey().equals(this.getDeviceKey()) == false)
            return false;
        if (other.getDeviceGroupKey() == null ^ this.getDeviceGroupKey() == null)
            return false;
        if (other.getDeviceGroupKey() != null
                && other.getDeviceGroupKey().equals(this.getDeviceGroupKey()) == false)
            return false;
        return true;
    }
}
