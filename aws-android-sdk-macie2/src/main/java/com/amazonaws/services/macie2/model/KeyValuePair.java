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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about the tags that are associated with an S3 bucket or
 * object. Each tag consists of a required tag key and an associated tag value.
 * </p>
 */
public class KeyValuePair implements Serializable {
    /**
     * <p>
     * One part of a key-value pair that comprises a tag. A tag key is a general
     * label that acts as a category for more specific tag values.
     * </p>
     */
    private String key;

    /**
     * <p>
     * One part of a key-value pair that comprises a tag. A tag value acts as a
     * descriptor for a tag key. A tag value can be empty or null.
     * </p>
     */
    private String value;

    /**
     * <p>
     * One part of a key-value pair that comprises a tag. A tag key is a general
     * label that acts as a category for more specific tag values.
     * </p>
     *
     * @return <p>
     *         One part of a key-value pair that comprises a tag. A tag key is a
     *         general label that acts as a category for more specific tag
     *         values.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * One part of a key-value pair that comprises a tag. A tag key is a general
     * label that acts as a category for more specific tag values.
     * </p>
     *
     * @param key <p>
     *            One part of a key-value pair that comprises a tag. A tag key
     *            is a general label that acts as a category for more specific
     *            tag values.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * One part of a key-value pair that comprises a tag. A tag key is a general
     * label that acts as a category for more specific tag values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key <p>
     *            One part of a key-value pair that comprises a tag. A tag key
     *            is a general label that acts as a category for more specific
     *            tag values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyValuePair withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * One part of a key-value pair that comprises a tag. A tag value acts as a
     * descriptor for a tag key. A tag value can be empty or null.
     * </p>
     *
     * @return <p>
     *         One part of a key-value pair that comprises a tag. A tag value
     *         acts as a descriptor for a tag key. A tag value can be empty or
     *         null.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * One part of a key-value pair that comprises a tag. A tag value acts as a
     * descriptor for a tag key. A tag value can be empty or null.
     * </p>
     *
     * @param value <p>
     *            One part of a key-value pair that comprises a tag. A tag value
     *            acts as a descriptor for a tag key. A tag value can be empty
     *            or null.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * One part of a key-value pair that comprises a tag. A tag value acts as a
     * descriptor for a tag key. A tag value can be empty or null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            One part of a key-value pair that comprises a tag. A tag value
     *            acts as a descriptor for a tag key. A tag value can be empty
     *            or null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyValuePair withValue(String value) {
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
        if (getKey() != null)
            sb.append("key: " + getKey() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyValuePair == false)
            return false;
        KeyValuePair other = (KeyValuePair) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
