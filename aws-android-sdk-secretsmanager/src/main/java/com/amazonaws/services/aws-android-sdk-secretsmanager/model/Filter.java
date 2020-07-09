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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model;

import java.io.Serializable;


/**
 * <p>Allows you to filter your list of secrets.</p>
 */
public class Filter implements Serializable {
    /**
     * <p>Filters your list of secrets by a specific key.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, name, tag-key, tag-value, all
     */
    private String key;

    /**
     * <p>Filters your list of secrets by a specific value.</p>
     */
    private java.util.List<String> values;

    /**
     * <p>Filters your list of secrets by a specific key.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, name, tag-key, tag-value, all
     *
     * @return <p>Filters your list of secrets by a specific key.</p>
     *
     * @see FilterNameStringType
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>Filters your list of secrets by a specific key.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, name, tag-key, tag-value, all
     *
     * @param key <p>Filters your list of secrets by a specific key.</p>
     *
     * @see FilterNameStringType
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>Filters your list of secrets by a specific key.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, name, tag-key, tag-value, all
     *
     * @param key <p>Filters your list of secrets by a specific key.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see FilterNameStringType
     */
    public Filter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>Filters your list of secrets by a specific key.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, name, tag-key, tag-value, all
     *
     * @param key <p>Filters your list of secrets by a specific key.</p>
     *
     * @see FilterNameStringType
     */
    public void setKey(FilterNameStringType key) {
        this.key = key.toString();
    }

    /**
     * <p>Filters your list of secrets by a specific key.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, name, tag-key, tag-value, all
     *
     * @param key <p>Filters your list of secrets by a specific key.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see FilterNameStringType
     */
    public Filter withKey(FilterNameStringType key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>Filters your list of secrets by a specific value.</p>
     *
     * @return <p>Filters your list of secrets by a specific value.</p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>Filters your list of secrets by a specific value.</p>
     *
     * @param values <p>Filters your list of secrets by a specific value.</p>
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>Filters your list of secrets by a specific value.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values <p>Filters your list of secrets by a specific value.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Filter withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>Filters your list of secrets by a specific value.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values <p>Filters your list of secrets by a specific value.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Filter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getValues() != null) sb.append("Values: " + getValues());
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
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Filter == false) return false;
        Filter other = (Filter)obj;

        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false;
        if (other.getValues() == null ^ this.getValues() == null) return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false) return false;
        return true;
    }
}
