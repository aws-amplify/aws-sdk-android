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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

/**
 * <p>
 * A list of message attribute values.
 * </p>
 */
public class MessageAttributeValue implements Serializable {
    /**
     * <p>
     * The strings in a message attribute value.
     * </p>
     */
    private java.util.List<String> stringValues;

    /**
     * <p>
     * The strings in a message attribute value.
     * </p>
     *
     * @return <p>
     *         The strings in a message attribute value.
     *         </p>
     */
    public java.util.List<String> getStringValues() {
        return stringValues;
    }

    /**
     * <p>
     * The strings in a message attribute value.
     * </p>
     *
     * @param stringValues <p>
     *            The strings in a message attribute value.
     *            </p>
     */
    public void setStringValues(java.util.Collection<String> stringValues) {
        if (stringValues == null) {
            this.stringValues = null;
            return;
        }

        this.stringValues = new java.util.ArrayList<String>(stringValues);
    }

    /**
     * <p>
     * The strings in a message attribute value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringValues <p>
     *            The strings in a message attribute value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageAttributeValue withStringValues(String... stringValues) {
        if (getStringValues() == null) {
            this.stringValues = new java.util.ArrayList<String>(stringValues.length);
        }
        for (String value : stringValues) {
            this.stringValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The strings in a message attribute value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringValues <p>
     *            The strings in a message attribute value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageAttributeValue withStringValues(java.util.Collection<String> stringValues) {
        setStringValues(stringValues);
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
        if (getStringValues() != null)
            sb.append("StringValues: " + getStringValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStringValues() == null) ? 0 : getStringValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageAttributeValue == false)
            return false;
        MessageAttributeValue other = (MessageAttributeValue) obj;

        if (other.getStringValues() == null ^ this.getStringValues() == null)
            return false;
        if (other.getStringValues() != null
                && other.getStringValues().equals(this.getStringValues()) == false)
            return false;
        return true;
    }
}
