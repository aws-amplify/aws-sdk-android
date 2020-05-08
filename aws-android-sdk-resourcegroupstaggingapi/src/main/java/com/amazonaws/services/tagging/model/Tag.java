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

package com.amazonaws.services.tagging.model;

import java.io.Serializable;

/**
 * <p>
 * The metadata that you apply to AWS resources to help you categorize and
 * organize them. Each tag consists of a key and a value, both of which you
 * define. For more information, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging
 * AWS Resources</a> in the <i>AWS General Reference</i>.
 * </p>
 */
public class Tag implements Serializable {
    /**
     * <p>
     * One part of a key-value pair that makes up a tag. A key is a general
     * label that acts like a category for more specific tag values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String key;

    /**
     * <p>
     * One part of a key-value pair that make up a tag. A value acts as a
     * descriptor within a tag category (key). The value can be empty or null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String value;

    /**
     * <p>
     * One part of a key-value pair that makes up a tag. A key is a general
     * label that acts like a category for more specific tag values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         One part of a key-value pair that makes up a tag. A key is a
     *         general label that acts like a category for more specific tag
     *         values.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * One part of a key-value pair that makes up a tag. A key is a general
     * label that acts like a category for more specific tag values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param key <p>
     *            One part of a key-value pair that makes up a tag. A key is a
     *            general label that acts like a category for more specific tag
     *            values.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * One part of a key-value pair that makes up a tag. A key is a general
     * label that acts like a category for more specific tag values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param key <p>
     *            One part of a key-value pair that makes up a tag. A key is a
     *            general label that acts like a category for more specific tag
     *            values.
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
     * One part of a key-value pair that make up a tag. A value acts as a
     * descriptor within a tag category (key). The value can be empty or null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         One part of a key-value pair that make up a tag. A value acts as
     *         a descriptor within a tag category (key). The value can be empty
     *         or null.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * One part of a key-value pair that make up a tag. A value acts as a
     * descriptor within a tag category (key). The value can be empty or null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param value <p>
     *            One part of a key-value pair that make up a tag. A value acts
     *            as a descriptor within a tag category (key). The value can be
     *            empty or null.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * One part of a key-value pair that make up a tag. A value acts as a
     * descriptor within a tag category (key). The value can be empty or null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param value <p>
     *            One part of a key-value pair that make up a tag. A value acts
     *            as a descriptor within a tag category (key). The value can be
     *            empty or null.
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
            sb.append("Key: " + getKey() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
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
