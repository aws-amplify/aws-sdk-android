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

/**
 * <p>
 * Represents the response from the server when the user wants to refresh
 * tokens.
 * </p>
 */
public class RefreshTokensResult implements Serializable {
    /**
     * <p>
     * The authentication result from the server's response to refresh tokens.
     * </p>
     */
    private AuthenticationResultType authenticationResult;

    /**
     * <p>
     * The authentication result from the server's response to refresh tokens.
     * </p>
     *
     * @return <p>
     *         The authentication result from the server's response to refresh
     *         tokens.
     *         </p>
     */
    public AuthenticationResultType getAuthenticationResult() {
        return authenticationResult;
    }

    /**
     * <p>
     * The authentication result from the server's response to refresh tokens.
     * </p>
     *
     * @param authenticationResult <p>
     *            The authentication result from the server's response to
     *            refresh tokens.
     *            </p>
     */
    public void setAuthenticationResult(AuthenticationResultType authenticationResult) {
        this.authenticationResult = authenticationResult;
    }

    /**
     * <p>
     * The authentication result from the server's response to refresh tokens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authenticationResult <p>
     *            The authentication result from the server's response to
     *            refresh tokens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RefreshTokensResult withAuthenticationResult(
            AuthenticationResultType authenticationResult) {
        this.authenticationResult = authenticationResult;
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
        if (getAuthenticationResult() != null)
            sb.append("AuthenticationResult: " + getAuthenticationResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAuthenticationResult() == null) ? 0 : getAuthenticationResult().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RefreshTokensResult == false)
            return false;
        RefreshTokensResult other = (RefreshTokensResult) obj;

        if (other.getAuthenticationResult() == null ^ this.getAuthenticationResult() == null)
            return false;
        if (other.getAuthenticationResult() != null
                && other.getAuthenticationResult().equals(this.getAuthenticationResult()) == false)
            return false;
        return true;
    }
}
