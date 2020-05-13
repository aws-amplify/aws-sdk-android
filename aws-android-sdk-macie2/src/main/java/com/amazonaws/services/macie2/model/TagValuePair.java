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
 * Specifies a tag key and value, as a pair, to use in a tag-based condition for
 * a classification job.
 * </p>
 */
public class TagValuePair implements Serializable {
    /**
     * <p>
     * The value for the tag key to use in the condition.
     * </p>
     */
    private String key;

    /**
     * <p>
     * The tag value, associated with the specified tag key, to use in the
     * condition.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The value for the tag key to use in the condition.
     * </p>
     *
     * @return <p>
     *         The value for the tag key to use in the condition.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The value for the tag key to use in the condition.
     * </p>
     *
     * @param key <p>
     *            The value for the tag key to use in the condition.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The value for the tag key to use in the condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key <p>
     *            The value for the tag key to use in the condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagValuePair withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The tag value, associated with the specified tag key, to use in the
     * condition.
     * </p>
     *
     * @return <p>
     *         The tag value, associated with the specified tag key, to use in
     *         the condition.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The tag value, associated with the specified tag key, to use in the
     * condition.
     * </p>
     *
     * @param value <p>
     *            The tag value, associated with the specified tag key, to use
     *            in the condition.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The tag value, associated with the specified tag key, to use in the
     * condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The tag value, associated with the specified tag key, to use
     *            in the condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagValuePair withValue(String value) {
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

        if (obj instanceof TagValuePair == false)
            return false;
        TagValuePair other = (TagValuePair) obj;

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
