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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a tag key and optional value assigned to an Amazon Lightsail
 * resource.
 * </p>
 * <p>
 * For more information about tags in Lightsail, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class Tag implements Serializable {
    /**
     * <p>
     * The key of the tag.
     * </p>
     * <p>
     * Constraints: Tag keys accept a maximum of 128 letters, numbers, spaces in
     * UTF-8, or the following characters: + - = . _ : / @
     * </p>
     */
    private String key;

    /**
     * <p>
     * The value of the tag.
     * </p>
     * <p>
     * Constraints: Tag values accept a maximum of 256 letters, numbers, spaces
     * in UTF-8, or the following characters: + - = . _ : / @
     * </p>
     */
    private String value;

    /**
     * <p>
     * The key of the tag.
     * </p>
     * <p>
     * Constraints: Tag keys accept a maximum of 128 letters, numbers, spaces in
     * UTF-8, or the following characters: + - = . _ : / @
     * </p>
     *
     * @return <p>
     *         The key of the tag.
     *         </p>
     *         <p>
     *         Constraints: Tag keys accept a maximum of 128 letters, numbers,
     *         spaces in UTF-8, or the following characters: + - = . _ : / @
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The key of the tag.
     * </p>
     * <p>
     * Constraints: Tag keys accept a maximum of 128 letters, numbers, spaces in
     * UTF-8, or the following characters: + - = . _ : / @
     * </p>
     *
     * @param key <p>
     *            The key of the tag.
     *            </p>
     *            <p>
     *            Constraints: Tag keys accept a maximum of 128 letters,
     *            numbers, spaces in UTF-8, or the following characters: + - = .
     *            _ : / @
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the tag.
     * </p>
     * <p>
     * Constraints: Tag keys accept a maximum of 128 letters, numbers, spaces in
     * UTF-8, or the following characters: + - = . _ : / @
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key <p>
     *            The key of the tag.
     *            </p>
     *            <p>
     *            Constraints: Tag keys accept a maximum of 128 letters,
     *            numbers, spaces in UTF-8, or the following characters: + - = .
     *            _ : / @
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
     * The value of the tag.
     * </p>
     * <p>
     * Constraints: Tag values accept a maximum of 256 letters, numbers, spaces
     * in UTF-8, or the following characters: + - = . _ : / @
     * </p>
     *
     * @return <p>
     *         The value of the tag.
     *         </p>
     *         <p>
     *         Constraints: Tag values accept a maximum of 256 letters, numbers,
     *         spaces in UTF-8, or the following characters: + - = . _ : / @
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the tag.
     * </p>
     * <p>
     * Constraints: Tag values accept a maximum of 256 letters, numbers, spaces
     * in UTF-8, or the following characters: + - = . _ : / @
     * </p>
     *
     * @param value <p>
     *            The value of the tag.
     *            </p>
     *            <p>
     *            Constraints: Tag values accept a maximum of 256 letters,
     *            numbers, spaces in UTF-8, or the following characters: + - = .
     *            _ : / @
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the tag.
     * </p>
     * <p>
     * Constraints: Tag values accept a maximum of 256 letters, numbers, spaces
     * in UTF-8, or the following characters: + - = . _ : / @
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of the tag.
     *            </p>
     *            <p>
     *            Constraints: Tag values accept a maximum of 256 letters,
     *            numbers, spaces in UTF-8, or the following characters: + - = .
     *            _ : / @
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
