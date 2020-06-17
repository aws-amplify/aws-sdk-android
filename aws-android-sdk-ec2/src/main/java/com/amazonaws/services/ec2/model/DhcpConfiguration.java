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
 * Describes a DHCP configuration option.
 * </p>
 */
public class DhcpConfiguration implements Serializable {
    /**
     * <p>
     * The name of a DHCP option.
     * </p>
     */
    private String key;

    /**
     * <p>
     * One or more values for the DHCP option.
     * </p>
     */
    private java.util.List<AttributeValue> values;

    /**
     * <p>
     * The name of a DHCP option.
     * </p>
     *
     * @return <p>
     *         The name of a DHCP option.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The name of a DHCP option.
     * </p>
     *
     * @param key <p>
     *            The name of a DHCP option.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of a DHCP option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key <p>
     *            The name of a DHCP option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DhcpConfiguration withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * One or more values for the DHCP option.
     * </p>
     *
     * @return <p>
     *         One or more values for the DHCP option.
     *         </p>
     */
    public java.util.List<AttributeValue> getValues() {
        return values;
    }

    /**
     * <p>
     * One or more values for the DHCP option.
     * </p>
     *
     * @param values <p>
     *            One or more values for the DHCP option.
     *            </p>
     */
    public void setValues(java.util.Collection<AttributeValue> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<AttributeValue>(values);
    }

    /**
     * <p>
     * One or more values for the DHCP option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            One or more values for the DHCP option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DhcpConfiguration withValues(AttributeValue... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<AttributeValue>(values.length);
        }
        for (AttributeValue value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more values for the DHCP option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            One or more values for the DHCP option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DhcpConfiguration withValues(java.util.Collection<AttributeValue> values) {
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

        if (obj instanceof DhcpConfiguration == false)
            return false;
        DhcpConfiguration other = (DhcpConfiguration) obj;

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
