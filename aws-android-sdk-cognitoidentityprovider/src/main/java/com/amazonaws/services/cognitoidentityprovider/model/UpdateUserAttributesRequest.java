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
 * Allows a user to update a specific attribute (one at a time).
 * </p>
 */
public class UpdateUserAttributesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     */
    private java.util.List<AttributeType> userAttributes;

    /**
     * <p>
     * The access token for the request to update user attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     */
    private String accessToken;

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     *
     * @return <p>
     *         An array of name-value pairs representing user attributes.
     *         </p>
     *         <p>
     *         For custom attributes, you must prepend the <code>custom:</code>
     *         prefix to the attribute name.
     *         </p>
     */
    public java.util.List<AttributeType> getUserAttributes() {
        return userAttributes;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     *
     * @param userAttributes <p>
     *            An array of name-value pairs representing user attributes.
     *            </p>
     *            <p>
     *            For custom attributes, you must prepend the
     *            <code>custom:</code> prefix to the attribute name.
     *            </p>
     */
    public void setUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        if (userAttributes == null) {
            this.userAttributes = null;
            return;
        }

        this.userAttributes = new java.util.ArrayList<AttributeType>(userAttributes);
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userAttributes <p>
     *            An array of name-value pairs representing user attributes.
     *            </p>
     *            <p>
     *            For custom attributes, you must prepend the
     *            <code>custom:</code> prefix to the attribute name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserAttributesRequest withUserAttributes(AttributeType... userAttributes) {
        if (getUserAttributes() == null) {
            this.userAttributes = new java.util.ArrayList<AttributeType>(userAttributes.length);
        }
        for (AttributeType value : userAttributes) {
            this.userAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userAttributes <p>
     *            An array of name-value pairs representing user attributes.
     *            </p>
     *            <p>
     *            For custom attributes, you must prepend the
     *            <code>custom:</code> prefix to the attribute name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserAttributesRequest withUserAttributes(
            java.util.Collection<AttributeType> userAttributes) {
        setUserAttributes(userAttributes);
        return this;
    }

    /**
     * <p>
     * The access token for the request to update user attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @return <p>
     *         The access token for the request to update user attributes.
     *         </p>
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * <p>
     * The access token for the request to update user attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken <p>
     *            The access token for the request to update user attributes.
     *            </p>
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The access token for the request to update user attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken <p>
     *            The access token for the request to update user attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserAttributesRequest withAccessToken(String accessToken) {
        this.accessToken = accessToken;
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
        if (getUserAttributes() != null)
            sb.append("UserAttributes: " + getUserAttributes() + ",");
        if (getAccessToken() != null)
            sb.append("AccessToken: " + getAccessToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserAttributes() == null) ? 0 : getUserAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserAttributesRequest == false)
            return false;
        UpdateUserAttributesRequest other = (UpdateUserAttributesRequest) obj;

        if (other.getUserAttributes() == null ^ this.getUserAttributes() == null)
            return false;
        if (other.getUserAttributes() != null
                && other.getUserAttributes().equals(this.getUserAttributes()) == false)
            return false;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null
                && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        return true;
    }
}
