/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#addCustomAttributes(AddCustomAttributesRequest) AddCustomAttributes operation}.
 * <p>
 * Adds additional user attributes to the user pool schema.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#addCustomAttributes(AddCustomAttributesRequest)
 */
public class AddCustomAttributesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The user pool ID for the user pool where you want to add custom
     * attributes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     */
    private String userPoolId;

    /**
     * An array of custom attributes, such as Mutable and Name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SchemaAttributeType> customAttributes;

    /**
     * The user pool ID for the user pool where you want to add custom
     * attributes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @return The user pool ID for the user pool where you want to add custom
     *         attributes.
     */
    public String getUserPoolId() {
        return userPoolId;
    }
    
    /**
     * The user pool ID for the user pool where you want to add custom
     * attributes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @param userPoolId The user pool ID for the user pool where you want to add custom
     *         attributes.
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }
    
    /**
     * The user pool ID for the user pool where you want to add custom
     * attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @param userPoolId The user pool ID for the user pool where you want to add custom
     *         attributes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddCustomAttributesRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * An array of custom attributes, such as Mutable and Name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @return An array of custom attributes, such as Mutable and Name.
     */
    public java.util.List<SchemaAttributeType> getCustomAttributes() {
        if (customAttributes == null) {
              customAttributes = new com.amazonaws.internal.ListWithAutoConstructFlag<SchemaAttributeType>();
              customAttributes.setAutoConstruct(true);
        }
        return customAttributes;
    }
    
    /**
     * An array of custom attributes, such as Mutable and Name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param customAttributes An array of custom attributes, such as Mutable and Name.
     */
    public void setCustomAttributes(java.util.Collection<SchemaAttributeType> customAttributes) {
        if (customAttributes == null) {
            this.customAttributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SchemaAttributeType> customAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SchemaAttributeType>(customAttributes.size());
        customAttributesCopy.addAll(customAttributes);
        this.customAttributes = customAttributesCopy;
    }
    
    /**
     * An array of custom attributes, such as Mutable and Name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param customAttributes An array of custom attributes, such as Mutable and Name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddCustomAttributesRequest withCustomAttributes(SchemaAttributeType... customAttributes) {
        if (getCustomAttributes() == null) setCustomAttributes(new java.util.ArrayList<SchemaAttributeType>(customAttributes.length));
        for (SchemaAttributeType value : customAttributes) {
            getCustomAttributes().add(value);
        }
        return this;
    }
    
    /**
     * An array of custom attributes, such as Mutable and Name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param customAttributes An array of custom attributes, such as Mutable and Name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddCustomAttributesRequest withCustomAttributes(java.util.Collection<SchemaAttributeType> customAttributes) {
        if (customAttributes == null) {
            this.customAttributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SchemaAttributeType> customAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SchemaAttributeType>(customAttributes.size());
            customAttributesCopy.addAll(customAttributes);
            this.customAttributes = customAttributesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserPoolId() != null) sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getCustomAttributes() != null) sb.append("CustomAttributes: " + getCustomAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getCustomAttributes() == null) ? 0 : getCustomAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddCustomAttributesRequest == false) return false;
        AddCustomAttributesRequest other = (AddCustomAttributesRequest)obj;
        
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null) return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false) return false; 
        if (other.getCustomAttributes() == null ^ this.getCustomAttributes() == null) return false;
        if (other.getCustomAttributes() != null && other.getCustomAttributes().equals(this.getCustomAttributes()) == false) return false; 
        return true;
    }
    
}
    