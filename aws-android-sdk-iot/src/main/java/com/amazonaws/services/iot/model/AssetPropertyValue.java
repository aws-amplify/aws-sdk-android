/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * An asset property value entry containing the following information.
 * </p>
 */
public class AssetPropertyValue implements Serializable {
    /**
     * <p>
     * The value of the asset property.
     * </p>
     */
    private AssetPropertyVariant value;

    /**
     * <p>
     * The asset property value timestamp.
     * </p>
     */
    private AssetPropertyTimestamp timestamp;

    /**
     * <p>
     * Optional. A string that describes the quality of the value. Accepts
     * substitution templates. Must be <code>GOOD</code>, <code>BAD</code>, or
     * <code>UNCERTAIN</code>.
     * </p>
     */
    private String quality;

    /**
     * <p>
     * The value of the asset property.
     * </p>
     *
     * @return <p>
     *         The value of the asset property.
     *         </p>
     */
    public AssetPropertyVariant getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the asset property.
     * </p>
     *
     * @param value <p>
     *            The value of the asset property.
     *            </p>
     */
    public void setValue(AssetPropertyVariant value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the asset property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of the asset property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetPropertyValue withValue(AssetPropertyVariant value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The asset property value timestamp.
     * </p>
     *
     * @return <p>
     *         The asset property value timestamp.
     *         </p>
     */
    public AssetPropertyTimestamp getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The asset property value timestamp.
     * </p>
     *
     * @param timestamp <p>
     *            The asset property value timestamp.
     *            </p>
     */
    public void setTimestamp(AssetPropertyTimestamp timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The asset property value timestamp.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The asset property value timestamp.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetPropertyValue withTimestamp(AssetPropertyTimestamp timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * Optional. A string that describes the quality of the value. Accepts
     * substitution templates. Must be <code>GOOD</code>, <code>BAD</code>, or
     * <code>UNCERTAIN</code>.
     * </p>
     *
     * @return <p>
     *         Optional. A string that describes the quality of the value.
     *         Accepts substitution templates. Must be <code>GOOD</code>,
     *         <code>BAD</code>, or <code>UNCERTAIN</code>.
     *         </p>
     */
    public String getQuality() {
        return quality;
    }

    /**
     * <p>
     * Optional. A string that describes the quality of the value. Accepts
     * substitution templates. Must be <code>GOOD</code>, <code>BAD</code>, or
     * <code>UNCERTAIN</code>.
     * </p>
     *
     * @param quality <p>
     *            Optional. A string that describes the quality of the value.
     *            Accepts substitution templates. Must be <code>GOOD</code>,
     *            <code>BAD</code>, or <code>UNCERTAIN</code>.
     *            </p>
     */
    public void setQuality(String quality) {
        this.quality = quality;
    }

    /**
     * <p>
     * Optional. A string that describes the quality of the value. Accepts
     * substitution templates. Must be <code>GOOD</code>, <code>BAD</code>, or
     * <code>UNCERTAIN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quality <p>
     *            Optional. A string that describes the quality of the value.
     *            Accepts substitution templates. Must be <code>GOOD</code>,
     *            <code>BAD</code>, or <code>UNCERTAIN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetPropertyValue withQuality(String quality) {
        this.quality = quality;
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
        if (getValue() != null)
            sb.append("value: " + getValue() + ",");
        if (getTimestamp() != null)
            sb.append("timestamp: " + getTimestamp() + ",");
        if (getQuality() != null)
            sb.append("quality: " + getQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getQuality() == null) ? 0 : getQuality().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetPropertyValue == false)
            return false;
        AssetPropertyValue other = (AssetPropertyValue) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getQuality() == null ^ this.getQuality() == null)
            return false;
        if (other.getQuality() != null && other.getQuality().equals(this.getQuality()) == false)
            return false;
        return true;
    }
}
