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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds additional user attributes to the user pool schema.
 * </p>
 */
public class AddCustomAttributesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user pool ID for the user pool where you want to add custom
     * attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * An array of custom attributes, such as Mutable and Name.
     * </p>
     */
    private java.util.List<SchemaAttributeType> customAttributes;

    /**
     * <p>
     * The user pool ID for the user pool where you want to add custom
     * attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID for the user pool where you want to add custom
     *         attributes.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to add custom
     * attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool where you want to add
     *            custom attributes.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to add custom
     * attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool where you want to add
     *            custom attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddCustomAttributesRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * An array of custom attributes, such as Mutable and Name.
     * </p>
     *
     * @return <p>
     *         An array of custom attributes, such as Mutable and Name.
     *         </p>
     */
    public java.util.List<SchemaAttributeType> getCustomAttributes() {
        return customAttributes;
    }

    /**
     * <p>
     * An array of custom attributes, such as Mutable and Name.
     * </p>
     *
     * @param customAttributes <p>
     *            An array of custom attributes, such as Mutable and Name.
     *            </p>
     */
    public void setCustomAttributes(java.util.Collection<SchemaAttributeType> customAttributes) {
        if (customAttributes == null) {
            this.customAttributes = null;
            return;
        }

        this.customAttributes = new java.util.ArrayList<SchemaAttributeType>(customAttributes);
    }

    /**
     * <p>
     * An array of custom attributes, such as Mutable and Name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customAttributes <p>
     *            An array of custom attributes, such as Mutable and Name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddCustomAttributesRequest withCustomAttributes(SchemaAttributeType... customAttributes) {
        if (getCustomAttributes() == null) {
            this.customAttributes = new java.util.ArrayList<SchemaAttributeType>(
                    customAttributes.length);
        }
        for (SchemaAttributeType value : customAttributes) {
            this.customAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of custom attributes, such as Mutable and Name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customAttributes <p>
     *            An array of custom attributes, such as Mutable and Name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddCustomAttributesRequest withCustomAttributes(
            java.util.Collection<SchemaAttributeType> customAttributes) {
        setCustomAttributes(customAttributes);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getCustomAttributes() != null)
            sb.append("CustomAttributes: " + getCustomAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getCustomAttributes() == null) ? 0 : getCustomAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddCustomAttributesRequest == false)
            return false;
        AddCustomAttributesRequest other = (AddCustomAttributesRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getCustomAttributes() == null ^ this.getCustomAttributes() == null)
            return false;
        if (other.getCustomAttributes() != null
                && other.getCustomAttributes().equals(this.getCustomAttributes()) == false)
            return false;
        return true;
    }
}
