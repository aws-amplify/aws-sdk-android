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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the resources available for a container instance.
 * </p>
 */
public class Resource implements Serializable {
    /**
     * <p>
     * The name of the resource, such as <code>CPU</code>, <code>MEMORY</code>,
     * <code>PORTS</code>, <code>PORTS_UDP</code>, or a user-defined resource.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The type of the resource, such as <code>INTEGER</code>,
     * <code>DOUBLE</code>, <code>LONG</code>, or <code>STRINGSET</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * When the <code>doubleValue</code> type is set, the value of the resource
     * must be a double precision floating-point type.
     * </p>
     */
    private Double doubleValue;

    /**
     * <p>
     * When the <code>longValue</code> type is set, the value of the resource
     * must be an extended precision floating-point type.
     * </p>
     */
    private Long longValue;

    /**
     * <p>
     * When the <code>integerValue</code> type is set, the value of the resource
     * must be an integer.
     * </p>
     */
    private Integer integerValue;

    /**
     * <p>
     * When the <code>stringSetValue</code> type is set, the value of the
     * resource must be a string type.
     * </p>
     */
    private java.util.List<String> stringSetValue;

    /**
     * <p>
     * The name of the resource, such as <code>CPU</code>, <code>MEMORY</code>,
     * <code>PORTS</code>, <code>PORTS_UDP</code>, or a user-defined resource.
     * </p>
     *
     * @return <p>
     *         The name of the resource, such as <code>CPU</code>,
     *         <code>MEMORY</code>, <code>PORTS</code>, <code>PORTS_UDP</code>,
     *         or a user-defined resource.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the resource, such as <code>CPU</code>, <code>MEMORY</code>,
     * <code>PORTS</code>, <code>PORTS_UDP</code>, or a user-defined resource.
     * </p>
     *
     * @param name <p>
     *            The name of the resource, such as <code>CPU</code>,
     *            <code>MEMORY</code>, <code>PORTS</code>,
     *            <code>PORTS_UDP</code>, or a user-defined resource.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource, such as <code>CPU</code>, <code>MEMORY</code>,
     * <code>PORTS</code>, <code>PORTS_UDP</code>, or a user-defined resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the resource, such as <code>CPU</code>,
     *            <code>MEMORY</code>, <code>PORTS</code>,
     *            <code>PORTS_UDP</code>, or a user-defined resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of the resource, such as <code>INTEGER</code>,
     * <code>DOUBLE</code>, <code>LONG</code>, or <code>STRINGSET</code>.
     * </p>
     *
     * @return <p>
     *         The type of the resource, such as <code>INTEGER</code>,
     *         <code>DOUBLE</code>, <code>LONG</code>, or <code>STRINGSET</code>
     *         .
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the resource, such as <code>INTEGER</code>,
     * <code>DOUBLE</code>, <code>LONG</code>, or <code>STRINGSET</code>.
     * </p>
     *
     * @param type <p>
     *            The type of the resource, such as <code>INTEGER</code>,
     *            <code>DOUBLE</code>, <code>LONG</code>, or
     *            <code>STRINGSET</code>.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the resource, such as <code>INTEGER</code>,
     * <code>DOUBLE</code>, <code>LONG</code>, or <code>STRINGSET</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The type of the resource, such as <code>INTEGER</code>,
     *            <code>DOUBLE</code>, <code>LONG</code>, or
     *            <code>STRINGSET</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * When the <code>doubleValue</code> type is set, the value of the resource
     * must be a double precision floating-point type.
     * </p>
     *
     * @return <p>
     *         When the <code>doubleValue</code> type is set, the value of the
     *         resource must be a double precision floating-point type.
     *         </p>
     */
    public Double getDoubleValue() {
        return doubleValue;
    }

    /**
     * <p>
     * When the <code>doubleValue</code> type is set, the value of the resource
     * must be a double precision floating-point type.
     * </p>
     *
     * @param doubleValue <p>
     *            When the <code>doubleValue</code> type is set, the value of
     *            the resource must be a double precision floating-point type.
     *            </p>
     */
    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * <p>
     * When the <code>doubleValue</code> type is set, the value of the resource
     * must be a double precision floating-point type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param doubleValue <p>
     *            When the <code>doubleValue</code> type is set, the value of
     *            the resource must be a double precision floating-point type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
        return this;
    }

    /**
     * <p>
     * When the <code>longValue</code> type is set, the value of the resource
     * must be an extended precision floating-point type.
     * </p>
     *
     * @return <p>
     *         When the <code>longValue</code> type is set, the value of the
     *         resource must be an extended precision floating-point type.
     *         </p>
     */
    public Long getLongValue() {
        return longValue;
    }

    /**
     * <p>
     * When the <code>longValue</code> type is set, the value of the resource
     * must be an extended precision floating-point type.
     * </p>
     *
     * @param longValue <p>
     *            When the <code>longValue</code> type is set, the value of the
     *            resource must be an extended precision floating-point type.
     *            </p>
     */
    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    /**
     * <p>
     * When the <code>longValue</code> type is set, the value of the resource
     * must be an extended precision floating-point type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param longValue <p>
     *            When the <code>longValue</code> type is set, the value of the
     *            resource must be an extended precision floating-point type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withLongValue(Long longValue) {
        this.longValue = longValue;
        return this;
    }

    /**
     * <p>
     * When the <code>integerValue</code> type is set, the value of the resource
     * must be an integer.
     * </p>
     *
     * @return <p>
     *         When the <code>integerValue</code> type is set, the value of the
     *         resource must be an integer.
     *         </p>
     */
    public Integer getIntegerValue() {
        return integerValue;
    }

    /**
     * <p>
     * When the <code>integerValue</code> type is set, the value of the resource
     * must be an integer.
     * </p>
     *
     * @param integerValue <p>
     *            When the <code>integerValue</code> type is set, the value of
     *            the resource must be an integer.
     *            </p>
     */
    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    /**
     * <p>
     * When the <code>integerValue</code> type is set, the value of the resource
     * must be an integer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integerValue <p>
     *            When the <code>integerValue</code> type is set, the value of
     *            the resource must be an integer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
        return this;
    }

    /**
     * <p>
     * When the <code>stringSetValue</code> type is set, the value of the
     * resource must be a string type.
     * </p>
     *
     * @return <p>
     *         When the <code>stringSetValue</code> type is set, the value of
     *         the resource must be a string type.
     *         </p>
     */
    public java.util.List<String> getStringSetValue() {
        return stringSetValue;
    }

    /**
     * <p>
     * When the <code>stringSetValue</code> type is set, the value of the
     * resource must be a string type.
     * </p>
     *
     * @param stringSetValue <p>
     *            When the <code>stringSetValue</code> type is set, the value of
     *            the resource must be a string type.
     *            </p>
     */
    public void setStringSetValue(java.util.Collection<String> stringSetValue) {
        if (stringSetValue == null) {
            this.stringSetValue = null;
            return;
        }

        this.stringSetValue = new java.util.ArrayList<String>(stringSetValue);
    }

    /**
     * <p>
     * When the <code>stringSetValue</code> type is set, the value of the
     * resource must be a string type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringSetValue <p>
     *            When the <code>stringSetValue</code> type is set, the value of
     *            the resource must be a string type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withStringSetValue(String... stringSetValue) {
        if (getStringSetValue() == null) {
            this.stringSetValue = new java.util.ArrayList<String>(stringSetValue.length);
        }
        for (String value : stringSetValue) {
            this.stringSetValue.add(value);
        }
        return this;
    }

    /**
     * <p>
     * When the <code>stringSetValue</code> type is set, the value of the
     * resource must be a string type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringSetValue <p>
     *            When the <code>stringSetValue</code> type is set, the value of
     *            the resource must be a string type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withStringSetValue(java.util.Collection<String> stringSetValue) {
        setStringSetValue(stringSetValue);
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getDoubleValue() != null)
            sb.append("doubleValue: " + getDoubleValue() + ",");
        if (getLongValue() != null)
            sb.append("longValue: " + getLongValue() + ",");
        if (getIntegerValue() != null)
            sb.append("integerValue: " + getIntegerValue() + ",");
        if (getStringSetValue() != null)
            sb.append("stringSetValue: " + getStringSetValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getDoubleValue() == null) ? 0 : getDoubleValue().hashCode());
        hashCode = prime * hashCode + ((getLongValue() == null) ? 0 : getLongValue().hashCode());
        hashCode = prime * hashCode
                + ((getIntegerValue() == null) ? 0 : getIntegerValue().hashCode());
        hashCode = prime * hashCode
                + ((getStringSetValue() == null) ? 0 : getStringSetValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDoubleValue() == null ^ this.getDoubleValue() == null)
            return false;
        if (other.getDoubleValue() != null
                && other.getDoubleValue().equals(this.getDoubleValue()) == false)
            return false;
        if (other.getLongValue() == null ^ this.getLongValue() == null)
            return false;
        if (other.getLongValue() != null
                && other.getLongValue().equals(this.getLongValue()) == false)
            return false;
        if (other.getIntegerValue() == null ^ this.getIntegerValue() == null)
            return false;
        if (other.getIntegerValue() != null
                && other.getIntegerValue().equals(this.getIntegerValue()) == false)
            return false;
        if (other.getStringSetValue() == null ^ this.getStringSetValue() == null)
            return false;
        if (other.getStringSetValue() != null
                && other.getStringSetValue().equals(this.getStringSetValue()) == false)
            return false;
        return true;
    }
}
