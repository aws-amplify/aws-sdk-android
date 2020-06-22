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

public class NewDhcpConfiguration implements Serializable {
    /**
     * The new value for the key property for this object.
     */
    private String key;

    /**
     * The new value for the values property for this object.
     */
    private java.util.List<String> values;

    /**
     * Returns the value of the key property for this object.
     *
     * @return The value of the key property for this object.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of key
     *
     * @param key The new value for the key property for this object.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets the value of the key property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The new value for the key property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewDhcpConfiguration withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Returns the value of the values property for this object.
     *
     * @return The value of the values property for this object.
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * Sets the value of values
     *
     * @param values The new value for the values property for this object.
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * Sets the value of the values property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values The new value for the values property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewDhcpConfiguration withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * Sets the value of the values property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values The new value for the values property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NewDhcpConfiguration withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValues() != null)
            sb.append("Values: " + getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewDhcpConfiguration == false)
            return false;
        NewDhcpConfiguration other = (NewDhcpConfiguration) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }
}
