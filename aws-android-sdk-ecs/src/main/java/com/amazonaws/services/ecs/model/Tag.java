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
 * The metadata that you apply to a resource to help you categorize and organize
 * them. Each tag consists of a key and an optional value, both of which you
 * define.
 * </p>
 * <p>
 * The following basic restrictions apply to tags:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Maximum number of tags per resource - 50
 * </p>
 * </li>
 * <li>
 * <p>
 * For each resource, each tag key must be unique, and each tag key can have
 * only one value.
 * </p>
 * </li>
 * <li>
 * <p>
 * Maximum key length - 128 Unicode characters in UTF-8
 * </p>
 * </li>
 * <li>
 * <p>
 * Maximum value length - 256 Unicode characters in UTF-8
 * </p>
 * </li>
 * <li>
 * <p>
 * If your tagging schema is used across multiple services and resources,
 * remember that other services may have restrictions on allowed characters.
 * Generally allowed characters are: letters, numbers, and spaces representable
 * in UTF-8, and the following characters: + - = . _ : / @.
 * </p>
 * </li>
 * <li>
 * <p>
 * Tag keys and values are case-sensitive.
 * </p>
 * </li>
 * <li>
 * <p>
 * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase
 * combination of such as a prefix for either keys or values as it is reserved
 * for AWS use. You cannot edit or delete tag keys or values with this prefix.
 * Tags with this prefix do not count against your tags per resource limit.
 * </p>
 * </li>
 * </ul>
 */
public class Tag implements Serializable {
    /**
     * <p>
     * One part of a key-value pair that make up a tag. A <code>key</code> is a
     * general label that acts like a category for more specific tag values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String key;

    /**
     * <p>
     * The optional part of a key-value pair that make up a tag. A
     * <code>value</code> acts as a descriptor within a tag category (key).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String value;

    /**
     * <p>
     * One part of a key-value pair that make up a tag. A <code>key</code> is a
     * general label that acts like a category for more specific tag values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>
     *         One part of a key-value pair that make up a tag. A
     *         <code>key</code> is a general label that acts like a category for
     *         more specific tag values.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * One part of a key-value pair that make up a tag. A <code>key</code> is a
     * general label that acts like a category for more specific tag values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param key <p>
     *            One part of a key-value pair that make up a tag. A
     *            <code>key</code> is a general label that acts like a category
     *            for more specific tag values.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * One part of a key-value pair that make up a tag. A <code>key</code> is a
     * general label that acts like a category for more specific tag values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param key <p>
     *            One part of a key-value pair that make up a tag. A
     *            <code>key</code> is a general label that acts like a category
     *            for more specific tag values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tag withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The optional part of a key-value pair that make up a tag. A
     * <code>value</code> acts as a descriptor within a tag category (key).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>
     *         The optional part of a key-value pair that make up a tag. A
     *         <code>value</code> acts as a descriptor within a tag category
     *         (key).
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The optional part of a key-value pair that make up a tag. A
     * <code>value</code> acts as a descriptor within a tag category (key).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param value <p>
     *            The optional part of a key-value pair that make up a tag. A
     *            <code>value</code> acts as a descriptor within a tag category
     *            (key).
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The optional part of a key-value pair that make up a tag. A
     * <code>value</code> acts as a descriptor within a tag category (key).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param value <p>
     *            The optional part of a key-value pair that make up a tag. A
     *            <code>value</code> acts as a descriptor within a tag category
     *            (key).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tag withValue(String value) {
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

        if (obj instanceof Tag == false)
            return false;
        Tag other = (Tag) obj;

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
