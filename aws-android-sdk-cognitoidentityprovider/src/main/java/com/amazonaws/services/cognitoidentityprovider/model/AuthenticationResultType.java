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

/**
 * <p>
 * The authentication result.
 * </p>
 */
public class AuthenticationResultType implements Serializable {
    /**
     * <p>
     * The access token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     */
    private String accessToken;

    /**
     * <p>
     * The expiration period of the authentication result in seconds.
     * </p>
     */
    private Integer expiresIn;

    /**
     * <p>
     * The token type.
     * </p>
     */
    private String tokenType;

    /**
     * <p>
     * The refresh token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     */
    private String refreshToken;

    /**
     * <p>
     * The ID token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     */
    private String idToken;

    /**
     * <p>
     * The new device metadata from an authentication result.
     * </p>
     */
    private NewDeviceMetadataType newDeviceMetadata;

    /**
     * <p>
     * The access token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @return <p>
     *         The access token.
     *         </p>
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * <p>
     * The access token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken <p>
     *            The access token.
     *            </p>
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The access token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken <p>
     *            The access token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthenticationResultType withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * <p>
     * The expiration period of the authentication result in seconds.
     * </p>
     *
     * @return <p>
     *         The expiration period of the authentication result in seconds.
     *         </p>
     */
    public Integer getExpiresIn() {
        return expiresIn;
    }

    /**
     * <p>
     * The expiration period of the authentication result in seconds.
     * </p>
     *
     * @param expiresIn <p>
     *            The expiration period of the authentication result in seconds.
     *            </p>
     */
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * <p>
     * The expiration period of the authentication result in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiresIn <p>
     *            The expiration period of the authentication result in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthenticationResultType withExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    /**
     * <p>
     * The token type.
     * </p>
     *
     * @return <p>
     *         The token type.
     *         </p>
     */
    public String getTokenType() {
        return tokenType;
    }

    /**
     * <p>
     * The token type.
     * </p>
     *
     * @param tokenType <p>
     *            The token type.
     *            </p>
     */
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * <p>
     * The token type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tokenType <p>
     *            The token type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthenticationResultType withTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * <p>
     * The refresh token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @return <p>
     *         The refresh token.
     *         </p>
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * <p>
     * The refresh token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param refreshToken <p>
     *            The refresh token.
     *            </p>
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * <p>
     * The refresh token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param refreshToken <p>
     *            The refresh token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthenticationResultType withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * <p>
     * The ID token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @return <p>
     *         The ID token.
     *         </p>
     */
    public String getIdToken() {
        return idToken;
    }

    /**
     * <p>
     * The ID token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param idToken <p>
     *            The ID token.
     *            </p>
     */
    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    /**
     * <p>
     * The ID token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param idToken <p>
     *            The ID token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthenticationResultType withIdToken(String idToken) {
        this.idToken = idToken;
        return this;
    }

    /**
     * <p>
     * The new device metadata from an authentication result.
     * </p>
     *
     * @return <p>
     *         The new device metadata from an authentication result.
     *         </p>
     */
    public NewDeviceMetadataType getNewDeviceMetadata() {
        return newDeviceMetadata;
    }

    /**
     * <p>
     * The new device metadata from an authentication result.
     * </p>
     *
     * @param newDeviceMetadata <p>
     *            The new device metadata from an authentication result.
     *            </p>
     */
    public void setNewDeviceMetadata(NewDeviceMetadataType newDeviceMetadata) {
        this.newDeviceMetadata = newDeviceMetadata;
    }

    /**
     * <p>
     * The new device metadata from an authentication result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newDeviceMetadata <p>
     *            The new device metadata from an authentication result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthenticationResultType withNewDeviceMetadata(NewDeviceMetadataType newDeviceMetadata) {
        this.newDeviceMetadata = newDeviceMetadata;
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
        if (getExpiresIn() != null)
            sb.append("ExpiresIn: " + getExpiresIn() + ",");
        if (getTokenType() != null)
            sb.append("TokenType: " + getTokenType() + ",");
        if (getRefreshToken() != null)
            sb.append("RefreshToken: " + getRefreshToken() + ",");
        if (getIdToken() != null)
            sb.append("IdToken: " + getIdToken() + ",");
        if (getNewDeviceMetadata() != null)
            sb.append("NewDeviceMetadata: " + getNewDeviceMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getExpiresIn() == null) ? 0 : getExpiresIn().hashCode());
        hashCode = prime * hashCode + ((getTokenType() == null) ? 0 : getTokenType().hashCode());
        hashCode = prime * hashCode
                + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
        hashCode = prime * hashCode + ((getIdToken() == null) ? 0 : getIdToken().hashCode());
        hashCode = prime * hashCode
                + ((getNewDeviceMetadata() == null) ? 0 : getNewDeviceMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthenticationResultType == false)
            return false;
        AuthenticationResultType other = (AuthenticationResultType) obj;

        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null
                && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getExpiresIn() == null ^ this.getExpiresIn() == null)
            return false;
        if (other.getExpiresIn() != null
                && other.getExpiresIn().equals(this.getExpiresIn()) == false)
            return false;
        if (other.getTokenType() == null ^ this.getTokenType() == null)
            return false;
        if (other.getTokenType() != null
                && other.getTokenType().equals(this.getTokenType()) == false)
            return false;
        if (other.getRefreshToken() == null ^ this.getRefreshToken() == null)
            return false;
        if (other.getRefreshToken() != null
                && other.getRefreshToken().equals(this.getRefreshToken()) == false)
            return false;
        if (other.getIdToken() == null ^ this.getIdToken() == null)
            return false;
        if (other.getIdToken() != null && other.getIdToken().equals(this.getIdToken()) == false)
            return false;
        if (other.getNewDeviceMetadata() == null ^ this.getNewDeviceMetadata() == null)
            return false;
        if (other.getNewDeviceMetadata() != null
                && other.getNewDeviceMetadata().equals(this.getNewDeviceMetadata()) == false)
            return false;
        return true;
    }
}
