/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * A key-value pair that adds as a metadata to a resource used by Amazon
 * Comprehend. For example, a tag with the key-value pair ‘Department’:’Sales’
 * might be added to a resource to indicate its use by a particular department.
 * </p>
 */
public class Tag implements Serializable {
    /**
     * <p>
     * The initial part of a key-value pair that forms a tag associated with a
     * given resource. For instance, if you want to show which resources are
     * used by which departments, you might use “Department” as the key portion
     * of the pair, with multiple possible values such as “sales,” “legal,” and
     * “administration.”
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String key;

    /**
     * <p>
     * The second part of a key-value pair that forms a tag associated with a
     * given resource. For instance, if you want to show which resources are
     * used by which departments, you might use “Department” as the initial
     * (key) portion of the pair, with a value of “sales” to indicate the sales
     * department.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String value;

    /**
     * <p>
     * The initial part of a key-value pair that forms a tag associated with a
     * given resource. For instance, if you want to show which resources are
     * used by which departments, you might use “Department” as the key portion
     * of the pair, with multiple possible values such as “sales,” “legal,” and
     * “administration.”
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The initial part of a key-value pair that forms a tag associated
     *         with a given resource. For instance, if you want to show which
     *         resources are used by which departments, you might use
     *         “Department” as the key portion of the pair, with multiple
     *         possible values such as “sales,” “legal,” and “administration.”
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The initial part of a key-value pair that forms a tag associated with a
     * given resource. For instance, if you want to show which resources are
     * used by which departments, you might use “Department” as the key portion
     * of the pair, with multiple possible values such as “sales,” “legal,” and
     * “administration.”
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param key <p>
     *            The initial part of a key-value pair that forms a tag
     *            associated with a given resource. For instance, if you want to
     *            show which resources are used by which departments, you might
     *            use “Department” as the key portion of the pair, with multiple
     *            possible values such as “sales,” “legal,” and
     *            “administration.”
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The initial part of a key-value pair that forms a tag associated with a
     * given resource. For instance, if you want to show which resources are
     * used by which departments, you might use “Department” as the key portion
     * of the pair, with multiple possible values such as “sales,” “legal,” and
     * “administration.”
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param key <p>
     *            The initial part of a key-value pair that forms a tag
     *            associated with a given resource. For instance, if you want to
     *            show which resources are used by which departments, you might
     *            use “Department” as the key portion of the pair, with multiple
     *            possible values such as “sales,” “legal,” and
     *            “administration.”
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
     * The second part of a key-value pair that forms a tag associated with a
     * given resource. For instance, if you want to show which resources are
     * used by which departments, you might use “Department” as the initial
     * (key) portion of the pair, with a value of “sales” to indicate the sales
     * department.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return <p>
     *         The second part of a key-value pair that forms a tag associated
     *         with a given resource. For instance, if you want to show which
     *         resources are used by which departments, you might use
     *         “Department” as the initial (key) portion of the pair, with a
     *         value of “sales” to indicate the sales department.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The second part of a key-value pair that forms a tag associated with a
     * given resource. For instance, if you want to show which resources are
     * used by which departments, you might use “Department” as the initial
     * (key) portion of the pair, with a value of “sales” to indicate the sales
     * department.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param value <p>
     *            The second part of a key-value pair that forms a tag
     *            associated with a given resource. For instance, if you want to
     *            show which resources are used by which departments, you might
     *            use “Department” as the initial (key) portion of the pair,
     *            with a value of “sales” to indicate the sales department.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The second part of a key-value pair that forms a tag associated with a
     * given resource. For instance, if you want to show which resources are
     * used by which departments, you might use “Department” as the initial
     * (key) portion of the pair, with a value of “sales” to indicate the sales
     * department.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param value <p>
     *            The second part of a key-value pair that forms a tag
     *            associated with a given resource. For instance, if you want to
     *            show which resources are used by which departments, you might
     *            use “Department” as the initial (key) portion of the pair,
     *            with a value of “sales” to indicate the sales department.
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
