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

package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;

public class GetAuthorizationTokenResult implements Serializable {
    /**
     * <p>
     * The returned authentication token.
     * </p>
     */
    private String authorizationToken;

    /**
     * <p>
     * A timestamp that specifies the date and time the authorization token
     * expires.
     * </p>
     */
    private java.util.Date expiration;

    /**
     * <p>
     * The returned authentication token.
     * </p>
     *
     * @return <p>
     *         The returned authentication token.
     *         </p>
     */
    public String getAuthorizationToken() {
        return authorizationToken;
    }

    /**
     * <p>
     * The returned authentication token.
     * </p>
     *
     * @param authorizationToken <p>
     *            The returned authentication token.
     *            </p>
     */
    public void setAuthorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
    }

    /**
     * <p>
     * The returned authentication token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizationToken <p>
     *            The returned authentication token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizationTokenResult withAuthorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
        return this;
    }

    /**
     * <p>
     * A timestamp that specifies the date and time the authorization token
     * expires.
     * </p>
     *
     * @return <p>
     *         A timestamp that specifies the date and time the authorization
     *         token expires.
     *         </p>
     */
    public java.util.Date getExpiration() {
        return expiration;
    }

    /**
     * <p>
     * A timestamp that specifies the date and time the authorization token
     * expires.
     * </p>
     *
     * @param expiration <p>
     *            A timestamp that specifies the date and time the authorization
     *            token expires.
     *            </p>
     */
    public void setExpiration(java.util.Date expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * A timestamp that specifies the date and time the authorization token
     * expires.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiration <p>
     *            A timestamp that specifies the date and time the authorization
     *            token expires.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizationTokenResult withExpiration(java.util.Date expiration) {
        this.expiration = expiration;
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
        if (getAuthorizationToken() != null)
            sb.append("authorizationToken: " + getAuthorizationToken() + ",");
        if (getExpiration() != null)
            sb.append("expiration: " + getExpiration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAuthorizationToken() == null) ? 0 : getAuthorizationToken().hashCode());
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAuthorizationTokenResult == false)
            return false;
        GetAuthorizationTokenResult other = (GetAuthorizationTokenResult) obj;

        if (other.getAuthorizationToken() == null ^ this.getAuthorizationToken() == null)
            return false;
        if (other.getAuthorizationToken() != null
                && other.getAuthorizationToken().equals(this.getAuthorizationToken()) == false)
            return false;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null
                && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        return true;
    }
}
