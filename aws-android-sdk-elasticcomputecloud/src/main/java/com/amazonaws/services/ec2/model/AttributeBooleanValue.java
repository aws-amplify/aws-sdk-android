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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a value for a resource attribute that is a Boolean value.
 * </p>
 */
public class AttributeBooleanValue implements Serializable {
    /**
     * <p>
     * The attribute value. The valid values are <code>true</code> or
     * <code>false</code>.
     * </p>
     */
    private Boolean value;

    /**
     * <p>
     * The attribute value. The valid values are <code>true</code> or
     * <code>false</code>.
     * </p>
     *
     * @return <p>
     *         The attribute value. The valid values are <code>true</code> or
     *         <code>false</code>.
     *         </p>
     */
    public Boolean isValue() {
        return value;
    }

    /**
     * <p>
     * The attribute value. The valid values are <code>true</code> or
     * <code>false</code>.
     * </p>
     *
     * @return <p>
     *         The attribute value. The valid values are <code>true</code> or
     *         <code>false</code>.
     *         </p>
     */
    public Boolean getValue() {
        return value;
    }

    /**
     * <p>
     * The attribute value. The valid values are <code>true</code> or
     * <code>false</code>.
     * </p>
     *
     * @param value <p>
     *            The attribute value. The valid values are <code>true</code> or
     *            <code>false</code>.
     *            </p>
     */
    public void setValue(Boolean value) {
        this.value = value;
    }

    /**
     * <p>
     * The attribute value. The valid values are <code>true</code> or
     * <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The attribute value. The valid values are <code>true</code> or
     *            <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeBooleanValue withValue(Boolean value) {
        this.value = value;
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
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeBooleanValue == false)
            return false;
        AttributeBooleanValue other = (AttributeBooleanValue) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
