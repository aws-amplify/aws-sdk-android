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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of attributes attached to an account
 * </p>
 */
public class DescribeAccountAttributesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A list of attribute names.
     * </p>
     */
    private java.util.List<String> attributeNames;

    /**
     * <p>
     * A list of attribute names.
     * </p>
     *
     * @return <p>
     *         A list of attribute names.
     *         </p>
     */
    public java.util.List<String> getAttributeNames() {
        return attributeNames;
    }

    /**
     * <p>
     * A list of attribute names.
     * </p>
     *
     * @param attributeNames <p>
     *            A list of attribute names.
     *            </p>
     */
    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        if (attributeNames == null) {
            this.attributeNames = null;
            return;
        }

        this.attributeNames = new java.util.ArrayList<String>(attributeNames);
    }

    /**
     * <p>
     * A list of attribute names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeNames <p>
     *            A list of attribute names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccountAttributesRequest withAttributeNames(String... attributeNames) {
        if (getAttributeNames() == null) {
            this.attributeNames = new java.util.ArrayList<String>(attributeNames.length);
        }
        for (String value : attributeNames) {
            this.attributeNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of attribute names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeNames <p>
     *            A list of attribute names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccountAttributesRequest withAttributeNames(
            java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
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
        if (getAttributeNames() != null)
            sb.append("AttributeNames: " + getAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountAttributesRequest == false)
            return false;
        DescribeAccountAttributesRequest other = (DescribeAccountAttributesRequest) obj;

        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null)
            return false;
        if (other.getAttributeNames() != null
                && other.getAttributeNames().equals(this.getAttributeNames()) == false)
            return false;
        return true;
    }
}
