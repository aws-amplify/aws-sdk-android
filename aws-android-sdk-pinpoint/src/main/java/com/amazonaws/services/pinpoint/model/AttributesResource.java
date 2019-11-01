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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * Attributes.
 */
public class AttributesResource implements Serializable {
    /**
     * The unique ID for the application.
     */
    private String applicationId;

    /**
     * The attribute type for the application.
     */
    private String attributeType;

    /**
     * The attributes for the application.
     */
    private java.util.List<String> attributes;

    /**
     * The unique ID for the application.
     *
     * @return The unique ID for the application.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * The unique ID for the application.
     *
     * @param applicationId The unique ID for the application.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The unique ID for the application.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId The unique ID for the application.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributesResource withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * The attribute type for the application.
     *
     * @return The attribute type for the application.
     */
    public String getAttributeType() {
        return attributeType;
    }

    /**
     * The attribute type for the application.
     *
     * @param attributeType The attribute type for the application.
     */
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * The attribute type for the application.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeType The attribute type for the application.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributesResource withAttributeType(String attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * The attributes for the application.
     *
     * @return The attributes for the application.
     */
    public java.util.List<String> getAttributes() {
        return attributes;
    }

    /**
     * The attributes for the application.
     *
     * @param attributes The attributes for the application.
     */
    public void setAttributes(java.util.Collection<String> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<String>(attributes);
    }

    /**
     * The attributes for the application.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes The attributes for the application.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributesResource withAttributes(String... attributes) {
        if (getAttributes() == null) {
            this.attributes = new java.util.ArrayList<String>(attributes.length);
        }
        for (String value : attributes) {
            this.attributes.add(value);
        }
        return this;
    }

    /**
     * The attributes for the application.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes The attributes for the application.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributesResource withAttributes(java.util.Collection<String> attributes) {
        setAttributes(attributes);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getAttributeType() != null)
            sb.append("AttributeType: " + getAttributeType() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeType() == null) ? 0 : getAttributeType().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributesResource == false)
            return false;
        AttributesResource other = (AttributesResource) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getAttributeType() == null ^ this.getAttributeType() == null)
            return false;
        if (other.getAttributeType() != null
                && other.getAttributeType().equals(this.getAttributeType()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }
}
