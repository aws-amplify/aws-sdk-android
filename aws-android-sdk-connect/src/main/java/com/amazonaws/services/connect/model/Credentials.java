/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Contains credentials to use for federation.
 * </p>
 */
public class Credentials implements Serializable {
    /**
     * <p>
     * An access token generated for a federated user to access Amazon Connect.
     * </p>
     */
    private String accessToken;

    /**
     * <p>
     * A token generated with an expiration time for the session a user is
     * logged in to Amazon Connect.
     * </p>
     */
    private java.util.Date accessTokenExpiration;

    /**
     * <p>
     * Renews a token generated for a user to access the Amazon Connect
     * instance.
     * </p>
     */
    private String refreshToken;

    /**
     * <p>
     * Renews the expiration timer for a generated token.
     * </p>
     */
    private java.util.Date refreshTokenExpiration;

    /**
     * <p>
     * An access token generated for a federated user to access Amazon Connect.
     * </p>
     *
     * @return <p>
     *         An access token generated for a federated user to access Amazon
     *         Connect.
     *         </p>
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * <p>
     * An access token generated for a federated user to access Amazon Connect.
     * </p>
     *
     * @param accessToken <p>
     *            An access token generated for a federated user to access
     *            Amazon Connect.
     *            </p>
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * An access token generated for a federated user to access Amazon Connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessToken <p>
     *            An access token generated for a federated user to access
     *            Amazon Connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Credentials withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * <p>
     * A token generated with an expiration time for the session a user is
     * logged in to Amazon Connect.
     * </p>
     *
     * @return <p>
     *         A token generated with an expiration time for the session a user
     *         is logged in to Amazon Connect.
     *         </p>
     */
    public java.util.Date getAccessTokenExpiration() {
        return accessTokenExpiration;
    }

    /**
     * <p>
     * A token generated with an expiration time for the session a user is
     * logged in to Amazon Connect.
     * </p>
     *
     * @param accessTokenExpiration <p>
     *            A token generated with an expiration time for the session a
     *            user is logged in to Amazon Connect.
     *            </p>
     */
    public void setAccessTokenExpiration(java.util.Date accessTokenExpiration) {
        this.accessTokenExpiration = accessTokenExpiration;
    }

    /**
     * <p>
     * A token generated with an expiration time for the session a user is
     * logged in to Amazon Connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessTokenExpiration <p>
     *            A token generated with an expiration time for the session a
     *            user is logged in to Amazon Connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Credentials withAccessTokenExpiration(java.util.Date accessTokenExpiration) {
        this.accessTokenExpiration = accessTokenExpiration;
        return this;
    }

    /**
     * <p>
     * Renews a token generated for a user to access the Amazon Connect
     * instance.
     * </p>
     *
     * @return <p>
     *         Renews a token generated for a user to access the Amazon Connect
     *         instance.
     *         </p>
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * <p>
     * Renews a token generated for a user to access the Amazon Connect
     * instance.
     * </p>
     *
     * @param refreshToken <p>
     *            Renews a token generated for a user to access the Amazon
     *            Connect instance.
     *            </p>
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * <p>
     * Renews a token generated for a user to access the Amazon Connect
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param refreshToken <p>
     *            Renews a token generated for a user to access the Amazon
     *            Connect instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Credentials withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * <p>
     * Renews the expiration timer for a generated token.
     * </p>
     *
     * @return <p>
     *         Renews the expiration timer for a generated token.
     *         </p>
     */
    public java.util.Date getRefreshTokenExpiration() {
        return refreshTokenExpiration;
    }

    /**
     * <p>
     * Renews the expiration timer for a generated token.
     * </p>
     *
     * @param refreshTokenExpiration <p>
     *            Renews the expiration timer for a generated token.
     *            </p>
     */
    public void setRefreshTokenExpiration(java.util.Date refreshTokenExpiration) {
        this.refreshTokenExpiration = refreshTokenExpiration;
    }

    /**
     * <p>
     * Renews the expiration timer for a generated token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param refreshTokenExpiration <p>
     *            Renews the expiration timer for a generated token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Credentials withRefreshTokenExpiration(java.util.Date refreshTokenExpiration) {
        this.refreshTokenExpiration = refreshTokenExpiration;
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
        if (getAccessToken() != null)
            sb.append("AccessToken: " + getAccessToken() + ",");
        if (getAccessTokenExpiration() != null)
            sb.append("AccessTokenExpiration: " + getAccessTokenExpiration() + ",");
        if (getRefreshToken() != null)
            sb.append("RefreshToken: " + getRefreshToken() + ",");
        if (getRefreshTokenExpiration() != null)
            sb.append("RefreshTokenExpiration: " + getRefreshTokenExpiration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getAccessTokenExpiration() == null) ? 0 : getAccessTokenExpiration().hashCode());
        hashCode = prime * hashCode
                + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getRefreshTokenExpiration() == null) ? 0 : getRefreshTokenExpiration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Credentials == false)
            return false;
        Credentials other = (Credentials) obj;

        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null
                && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getAccessTokenExpiration() == null ^ this.getAccessTokenExpiration() == null)
            return false;
        if (other.getAccessTokenExpiration() != null
                && other.getAccessTokenExpiration().equals(this.getAccessTokenExpiration()) == false)
            return false;
        if (other.getRefreshToken() == null ^ this.getRefreshToken() == null)
            return false;
        if (other.getRefreshToken() != null
                && other.getRefreshToken().equals(this.getRefreshToken()) == false)
            return false;
        if (other.getRefreshTokenExpiration() == null ^ this.getRefreshTokenExpiration() == null)
            return false;
        if (other.getRefreshTokenExpiration() != null
                && other.getRefreshTokenExpiration().equals(this.getRefreshTokenExpiration()) == false)
            return false;
        return true;
    }
}
