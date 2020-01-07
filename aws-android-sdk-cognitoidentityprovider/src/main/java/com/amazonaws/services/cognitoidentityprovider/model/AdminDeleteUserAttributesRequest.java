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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes the user attributes in a user pool as an administrator. Works on any
 * user.
 * </p>
 * <p>
 * Calling this action requires developer credentials.
 * </p>
 */
public class AdminDeleteUserAttributesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The user pool ID for the user pool where you want to delete user
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
     * The user name of the user from which you would like to delete attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * <p>
     * An array of strings representing the user attribute names you wish to
     * delete.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     */
    private java.util.List<String> userAttributeNames;

    /**
     * <p>
     * The user pool ID for the user pool where you want to delete user
     * attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID for the user pool where you want to delete user
     *         attributes.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to delete user
     * attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool where you want to delete
     *            user attributes.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to delete user
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
     *            The user pool ID for the user pool where you want to delete
     *            user attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminDeleteUserAttributesRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The user name of the user from which you would like to delete attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The user name of the user from which you would like to delete
     *         attributes.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user name of the user from which you would like to delete attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The user name of the user from which you would like to delete
     *            attributes.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name of the user from which you would like to delete attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The user name of the user from which you would like to delete
     *            attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminDeleteUserAttributesRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * An array of strings representing the user attribute names you wish to
     * delete.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     *
     * @return <p>
     *         An array of strings representing the user attribute names you
     *         wish to delete.
     *         </p>
     *         <p>
     *         For custom attributes, you must prepend the <code>custom:</code>
     *         prefix to the attribute name.
     *         </p>
     */
    public java.util.List<String> getUserAttributeNames() {
        return userAttributeNames;
    }

    /**
     * <p>
     * An array of strings representing the user attribute names you wish to
     * delete.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     *
     * @param userAttributeNames <p>
     *            An array of strings representing the user attribute names you
     *            wish to delete.
     *            </p>
     *            <p>
     *            For custom attributes, you must prepend the
     *            <code>custom:</code> prefix to the attribute name.
     *            </p>
     */
    public void setUserAttributeNames(java.util.Collection<String> userAttributeNames) {
        if (userAttributeNames == null) {
            this.userAttributeNames = null;
            return;
        }

        this.userAttributeNames = new java.util.ArrayList<String>(userAttributeNames);
    }

    /**
     * <p>
     * An array of strings representing the user attribute names you wish to
     * delete.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userAttributeNames <p>
     *            An array of strings representing the user attribute names you
     *            wish to delete.
     *            </p>
     *            <p>
     *            For custom attributes, you must prepend the
     *            <code>custom:</code> prefix to the attribute name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminDeleteUserAttributesRequest withUserAttributeNames(String... userAttributeNames) {
        if (getUserAttributeNames() == null) {
            this.userAttributeNames = new java.util.ArrayList<String>(userAttributeNames.length);
        }
        for (String value : userAttributeNames) {
            this.userAttributeNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings representing the user attribute names you wish to
     * delete.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userAttributeNames <p>
     *            An array of strings representing the user attribute names you
     *            wish to delete.
     *            </p>
     *            <p>
     *            For custom attributes, you must prepend the
     *            <code>custom:</code> prefix to the attribute name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminDeleteUserAttributesRequest withUserAttributeNames(
            java.util.Collection<String> userAttributeNames) {
        setUserAttributeNames(userAttributeNames);
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
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getUserAttributeNames() != null)
            sb.append("UserAttributeNames: " + getUserAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode
                + ((getUserAttributeNames() == null) ? 0 : getUserAttributeNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminDeleteUserAttributesRequest == false)
            return false;
        AdminDeleteUserAttributesRequest other = (AdminDeleteUserAttributesRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getUserAttributeNames() == null ^ this.getUserAttributeNames() == null)
            return false;
        if (other.getUserAttributeNames() != null
                && other.getUserAttributeNames().equals(this.getUserAttributeNames()) == false)
            return false;
        return true;
    }
}
