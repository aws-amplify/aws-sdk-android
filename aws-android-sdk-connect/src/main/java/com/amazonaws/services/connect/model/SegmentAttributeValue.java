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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * A value for a segment attribute. This is structured as a map where the key is
 * <code>valueString</code> and the value is a string.
 * </p>
 */
public class SegmentAttributeValue implements Serializable {
    /**
     * <p>
     * The value of a segment attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String valueString;

    /**
     * <p>
     * The value of a segment attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The value of a segment attribute.
     *         </p>
     */
    public String getValueString() {
        return valueString;
    }

    /**
     * <p>
     * The value of a segment attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param valueString <p>
     *            The value of a segment attribute.
     *            </p>
     */
    public void setValueString(String valueString) {
        this.valueString = valueString;
    }

    /**
     * <p>
     * The value of a segment attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param valueString <p>
     *            The value of a segment attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentAttributeValue withValueString(String valueString) {
        this.valueString = valueString;
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
        if (getValueString() != null)
            sb.append("ValueString: " + getValueString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getValueString() == null) ? 0 : getValueString().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentAttributeValue == false)
            return false;
        SegmentAttributeValue other = (SegmentAttributeValue) obj;

        if (other.getValueString() == null ^ this.getValueString() == null)
            return false;
        if (other.getValueString() != null
                && other.getValueString().equals(this.getValueString()) == false)
            return false;
        return true;
    }
}
