/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * A tag set contains tag key and tag value.
 * </p>
 */
public class TagSet implements Serializable {
    /**
     * <p>
     * The tag key in the tagSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^(?!aws:)[a-zA-Z+-=._:/]+$<br/>
     */
    private String key;

    /**
     * <p>
     * The tag value in the tagSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String value;

    /**
     * <p>
     * The tag key in the tagSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^(?!aws:)[a-zA-Z+-=._:/]+$<br/>
     *
     * @return <p>
     *         The tag key in the tagSet.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The tag key in the tagSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^(?!aws:)[a-zA-Z+-=._:/]+$<br/>
     *
     * @param key <p>
     *            The tag key in the tagSet.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The tag key in the tagSet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^(?!aws:)[a-zA-Z+-=._:/]+$<br/>
     *
     * @param key <p>
     *            The tag key in the tagSet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagSet withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The tag value in the tagSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The tag value in the tagSet.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The tag value in the tagSet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param value <p>
     *            The tag value in the tagSet.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The tag value in the tagSet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param value <p>
     *            The tag value in the tagSet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagSet withValue(String value) {
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

        if (obj instanceof TagSet == false)
            return false;
        TagSet other = (TagSet) obj;

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
