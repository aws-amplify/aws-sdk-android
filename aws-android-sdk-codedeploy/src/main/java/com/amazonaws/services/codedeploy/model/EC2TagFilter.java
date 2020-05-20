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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an EC2 tag filter.
 * </p>
 */
public class EC2TagFilter implements Serializable {
    /**
     * <p>
     * The tag filter key.
     * </p>
     */
    private String key;

    /**
     * <p>
     * The tag filter value.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The tag filter type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEY_ONLY</code>: Key only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VALUE_ONLY</code>: Value only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KEY_AND_VALUE</code>: Key and value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE
     */
    private String type;

    /**
     * <p>
     * The tag filter key.
     * </p>
     *
     * @return <p>
     *         The tag filter key.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The tag filter key.
     * </p>
     *
     * @param key <p>
     *            The tag filter key.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The tag filter key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key <p>
     *            The tag filter key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2TagFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The tag filter value.
     * </p>
     *
     * @return <p>
     *         The tag filter value.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The tag filter value.
     * </p>
     *
     * @param value <p>
     *            The tag filter value.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The tag filter value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The tag filter value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2TagFilter withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The tag filter type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEY_ONLY</code>: Key only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VALUE_ONLY</code>: Value only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KEY_AND_VALUE</code>: Key and value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE
     *
     * @return <p>
     *         The tag filter type:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KEY_ONLY</code>: Key only.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VALUE_ONLY</code>: Value only.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KEY_AND_VALUE</code>: Key and value.
     *         </p>
     *         </li>
     *         </ul>
     * @see EC2TagFilterType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The tag filter type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEY_ONLY</code>: Key only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VALUE_ONLY</code>: Value only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KEY_AND_VALUE</code>: Key and value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE
     *
     * @param type <p>
     *            The tag filter type:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KEY_ONLY</code>: Key only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VALUE_ONLY</code>: Value only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KEY_AND_VALUE</code>: Key and value.
     *            </p>
     *            </li>
     *            </ul>
     * @see EC2TagFilterType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The tag filter type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEY_ONLY</code>: Key only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VALUE_ONLY</code>: Value only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KEY_AND_VALUE</code>: Key and value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE
     *
     * @param type <p>
     *            The tag filter type:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KEY_ONLY</code>: Key only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VALUE_ONLY</code>: Value only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KEY_AND_VALUE</code>: Key and value.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EC2TagFilterType
     */
    public EC2TagFilter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The tag filter type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEY_ONLY</code>: Key only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VALUE_ONLY</code>: Value only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KEY_AND_VALUE</code>: Key and value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE
     *
     * @param type <p>
     *            The tag filter type:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KEY_ONLY</code>: Key only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VALUE_ONLY</code>: Value only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KEY_AND_VALUE</code>: Key and value.
     *            </p>
     *            </li>
     *            </ul>
     * @see EC2TagFilterType
     */
    public void setType(EC2TagFilterType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The tag filter type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEY_ONLY</code>: Key only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VALUE_ONLY</code>: Value only.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KEY_AND_VALUE</code>: Key and value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KEY_ONLY, VALUE_ONLY, KEY_AND_VALUE
     *
     * @param type <p>
     *            The tag filter type:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KEY_ONLY</code>: Key only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>VALUE_ONLY</code>: Value only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KEY_AND_VALUE</code>: Key and value.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EC2TagFilterType
     */
    public EC2TagFilter withType(EC2TagFilterType type) {
        this.type = type.toString();
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
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2TagFilter == false)
            return false;
        EC2TagFilter other = (EC2TagFilter) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
