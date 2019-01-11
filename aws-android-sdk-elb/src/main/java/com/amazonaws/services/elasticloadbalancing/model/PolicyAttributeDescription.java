/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a policy attribute.
 * </p>
 */
public class PolicyAttributeDescription implements Serializable {
    /**
     * <p>
     * The name of the attribute.
     * </p>
     */
    private String attributeName;

    /**
     * <p>
     * The value of the attribute.
     * </p>
     */
    private String attributeValue;

    /**
     * <p>
     * The name of the attribute.
     * </p>
     *
     * @return <p>
     *         The name of the attribute.
     *         </p>
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     *
     * @param attributeName <p>
     *            The name of the attribute.
     *            </p>
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeName <p>
     *            The name of the attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyAttributeDescription withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     *
     * @return <p>
     *         The value of the attribute.
     *         </p>
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     *
     * @param attributeValue <p>
     *            The value of the attribute.
     *            </p>
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeValue <p>
     *            The value of the attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyAttributeDescription withAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
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
        if (getAttributeName() != null)
            sb.append("AttributeName: " + getAttributeName() + ",");
        if (getAttributeValue() != null)
            sb.append("AttributeValue: " + getAttributeValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyAttributeDescription == false)
            return false;
        PolicyAttributeDescription other = (PolicyAttributeDescription) obj;

        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null
                && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null)
            return false;
        if (other.getAttributeValue() != null
                && other.getAttributeValue().equals(this.getAttributeValue()) == false)
            return false;
        return true;
    }
}
