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
 * Disables the user from signing in with the specified external (SAML or
 * social) identity provider. If the user to disable is a Cognito User Pools
 * native username + password user, they are not permitted to use their password
 * to sign-in. If the user to disable is a linked external IdP user, any link
 * between that user and an existing user is removed. The next time the external
 * user (no longer attached to the previously linked
 * <code>DestinationUser</code>) signs in, they must create a new user account.
 * See .
 * </p>
 * <p>
 * This action is enabled only for admin access and requires developer
 * credentials.
 * </p>
 * <p>
 * The <code>ProviderName</code> must match the value specified when creating an
 * IdP for the pool.
 * </p>
 * <p>
 * To disable a native username + password user, the <code>ProviderName</code>
 * value must be <code>Cognito</code> and the <code>ProviderAttributeName</code>
 * must be <code>Cognito_Subject</code>, with the
 * <code>ProviderAttributeValue</code> being the name that is used in the user
 * pool for the user.
 * </p>
 * <p>
 * The <code>ProviderAttributeName</code> must always be
 * <code>Cognito_Subject</code> for social identity providers. The
 * <code>ProviderAttributeValue</code> must always be the exact subject that was
 * used when the user was originally linked as a source user.
 * </p>
 * <p>
 * For de-linking a SAML identity, there are two scenarios. If the linked
 * identity has not yet been used to sign-in, the
 * <code>ProviderAttributeName</code> and <code>ProviderAttributeValue</code>
 * must be the same values that were used for the <code>SourceUser</code> when
 * the identities were originally linked in the call. (If the linking was done
 * with <code>ProviderAttributeName</code> set to <code>Cognito_Subject</code>,
 * the same applies here). However, if the user has already signed in, the
 * <code>ProviderAttributeName</code> must be <code>Cognito_Subject</code> and
 * <code>ProviderAttributeValue</code> must be the subject of the SAML
 * assertion.
 * </p>
 */
public class AdminDisableProviderForUserRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     */
    private String userPoolId;

    /**
     * <p>
     * The user to be disabled.
     * </p>
     */
    private ProviderUserIdentifierType user;

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     *
     * @return <p>
     *         The user pool ID for the user pool.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminDisableProviderForUserRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The user to be disabled.
     * </p>
     *
     * @return <p>
     *         The user to be disabled.
     *         </p>
     */
    public ProviderUserIdentifierType getUser() {
        return user;
    }

    /**
     * <p>
     * The user to be disabled.
     * </p>
     *
     * @param user <p>
     *            The user to be disabled.
     *            </p>
     */
    public void setUser(ProviderUserIdentifierType user) {
        this.user = user;
    }

    /**
     * <p>
     * The user to be disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param user <p>
     *            The user to be disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminDisableProviderForUserRequest withUser(ProviderUserIdentifierType user) {
        this.user = user;
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
        if (getUser() != null)
            sb.append("User: " + getUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminDisableProviderForUserRequest == false)
            return false;
        AdminDisableProviderForUserRequest other = (AdminDisableProviderForUserRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        return true;
    }
}
