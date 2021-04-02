/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class IntrospectTokenResult implements Serializable {
    /**
     * <p>
     * Indicates if the present token is active or inactive.
     * </p>
     */
    private Boolean active;

    /**
     * <p>
     * (Optional) A list of scopes associated with the provided token.
     * </p>
     */
    private String scope;

    /**
     * <p>
     * The ID of the client that requested this token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     */
    private String clientId;

    /**
     * <p>
     * (Optional) The user-name associated with the provided token.
     * </p>
     */
    private String username;

    /**
     * <p>
     * (Optional) The provided token type. Bearer is the value.
     * </p>
     */
    private String tokenType;

    /**
     * <p>
     * Time stamp in seconds since January 1, 1970 UTC hat indicates when the
     * token will expire.
     * </p>
     */
    private Integer exp;

    /**
     * <p>
     * Time stamp in seconds, since January 1, 1970 UTC that indicates when the
     * provided token was originally issued.
     * </p>
     */
    private Integer iat;

    /**
     * <p>
     * (Optional) The date, in seconds, that the token is available for use.
     * </p>
     */
    private Integer nbf;

    /**
     * <p>
     * (Optional) The subject of the token.
     * </p>
     */
    private String sub;

    /**
     * <p>
     * (Optional) The token audience.
     * </p>
     */
    private String aud;

    /**
     * <p>
     * (Optional) The issuer of the token.
     * </p>
     */
    private String iss;

    /**
     * <p>
     * (Optional) A unique token identifier.
     * </p>
     */
    private String jti;

    /**
     * <p>
     * Indicates if the present token is active or inactive.
     * </p>
     *
     * @return <p>
     *         Indicates if the present token is active or inactive.
     *         </p>
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * <p>
     * Indicates if the present token is active or inactive.
     * </p>
     *
     * @return <p>
     *         Indicates if the present token is active or inactive.
     *         </p>
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * <p>
     * Indicates if the present token is active or inactive.
     * </p>
     *
     * @param active <p>
     *            Indicates if the present token is active or inactive.
     *            </p>
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * Indicates if the present token is active or inactive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param active <p>
     *            Indicates if the present token is active or inactive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntrospectTokenResult withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * <p>
     * (Optional) A list of scopes associated with the provided token.
     * </p>
     *
     * @return <p>
     *         (Optional) A list of scopes associated with the provided token.
     *         </p>
     */
    public String getScope() {
        return scope;
    }

    /**
     * <p>
     * (Optional) A list of scopes associated with the provided token.
     * </p>
     *
     * @param scope <p>
     *            (Optional) A list of scopes associated with the provided
     *            token.
     *            </p>
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * (Optional) A list of scopes associated with the provided token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scope <p>
     *            (Optional) A list of scopes associated with the provided
     *            token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntrospectTokenResult withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * <p>
     * The ID of the client that requested this token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @return <p>
     *         The ID of the client that requested this token.
     *         </p>
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * <p>
     * The ID of the client that requested this token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            The ID of the client that requested this token.
     *            </p>
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The ID of the client that requested this token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            The ID of the client that requested this token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntrospectTokenResult withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * <p>
     * (Optional) The user-name associated with the provided token.
     * </p>
     *
     * @return <p>
     *         (Optional) The user-name associated with the provided token.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * (Optional) The user-name associated with the provided token.
     * </p>
     *
     * @param username <p>
     *            (Optional) The user-name associated with the provided token.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * (Optional) The user-name associated with the provided token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param username <p>
     *            (Optional) The user-name associated with the provided token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntrospectTokenResult withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * (Optional) The provided token type. Bearer is the value.
     * </p>
     *
     * @return <p>
     *         (Optional) The provided token type. Bearer is the value.
     *         </p>
     */
    public String getTokenType() {
        return tokenType;
    }

    /**
     * <p>
     * (Optional) The provided token type. Bearer is the value.
     * </p>
     *
     * @param tokenType <p>
     *            (Optional) The provided token type. Bearer is the value.
     *            </p>
     */
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * <p>
     * (Optional) The provided token type. Bearer is the value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tokenType <p>
     *            (Optional) The provided token type. Bearer is the value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntrospectTokenResult withTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * <p>
     * Time stamp in seconds since January 1, 1970 UTC hat indicates when the
     * token will expire.
     * </p>
     *
     * @return <p>
     *         Time stamp in seconds since January 1, 1970 UTC hat indicates
     *         when the token will expire.
     *         </p>
     */
    public Integer getExp() {
        return exp;
    }

    /**
     * <p>
     * Time stamp in seconds since January 1, 1970 UTC hat indicates when the
     * token will expire.
     * </p>
     *
     * @param exp <p>
     *            Time stamp in seconds since January 1, 1970 UTC hat indicates
     *            when the token will expire.
     *            </p>
     */
    public void setExp(Integer exp) {
        this.exp = exp;
    }

    /**
     * <p>
     * Time stamp in seconds since January 1, 1970 UTC hat indicates when the
     * token will expire.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exp <p>
     *            Time stamp in seconds since January 1, 1970 UTC hat indicates
     *            when the token will expire.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntrospectTokenResult withExp(Integer exp) {
        this.exp = exp;
        return this;
    }

    /**
     * <p>
     * Time stamp in seconds, since January 1, 1970 UTC that indicates when the
     * provided token was originally issued.
     * </p>
     *
     * @return <p>
     *         Time stamp in seconds, since January 1, 1970 UTC that indicates
     *         when the provided token was originally issued.
     *         </p>
     */
    public Integer getIat() {
        return iat;
    }

    /**
     * <p>
     * Time stamp in seconds, since January 1, 1970 UTC that indicates when the
     * provided token was originally issued.
     * </p>
     *
     * @param iat <p>
     *            Time stamp in seconds, since January 1, 1970 UTC that
     *            indicates when the provided token was originally issued.
     *            </p>
     */
    public void setIat(Integer iat) {
        this.iat = iat;
    }

    /**
     * <p>
     * Time stamp in seconds, since January 1, 1970 UTC that indicates when the
     * provided token was originally issued.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iat <p>
     *            Time stamp in seconds, since January 1, 1970 UTC that
     *            indicates when the provided token was originally issued.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntrospectTokenResult withIat(Integer iat) {
        this.iat = iat;
        return this;
    }

    /**
     * <p>
     * (Optional) The date, in seconds, that the token is available for use.
     * </p>
     *
     * @return <p>
     *         (Optional) The date, in seconds, that the token is available for
     *         use.
     *         </p>
     */
    public Integer getNbf() {
        return nbf;
    }

    /**
     * <p>
     * (Optional) The date, in seconds, that the token is available for use.
     * </p>
     *
     * @param nbf <p>
     *            (Optional) The date, in seconds, that the token is available
     *            for use.
     *            </p>
     */
    public void setNbf(Integer nbf) {
        this.nbf = nbf;
    }

    /**
     * <p>
     * (Optional) The date, in seconds, that the token is available for use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nbf <p>
     *            (Optional) The date, in seconds, that the token is available
     *            for use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntrospectTokenResult withNbf(Integer nbf) {
        this.nbf = nbf;
        return this;
    }

    /**
     * <p>
     * (Optional) The subject of the token.
     * </p>
     *
     * @return <p>
     *         (Optional) The subject of the token.
     *         </p>
     */
    public String getSub() {
        return sub;
    }

    /**
     * <p>
     * (Optional) The subject of the token.
     * </p>
     *
     * @param sub <p>
     *            (Optional) The subject of the token.
     *            </p>
     */
    public void setSub(String sub) {
        this.sub = sub;
    }

    /**
     * <p>
     * (Optional) The subject of the token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sub <p>
     *            (Optional) The subject of the token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntrospectTokenResult withSub(String sub) {
        this.sub = sub;
        return this;
    }

    /**
     * <p>
     * (Optional) The token audience.
     * </p>
     *
     * @return <p>
     *         (Optional) The token audience.
     *         </p>
     */
    public String getAud() {
        return aud;
    }

    /**
     * <p>
     * (Optional) The token audience.
     * </p>
     *
     * @param aud <p>
     *            (Optional) The token audience.
     *            </p>
     */
    public void setAud(String aud) {
        this.aud = aud;
    }

    /**
     * <p>
     * (Optional) The token audience.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aud <p>
     *            (Optional) The token audience.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntrospectTokenResult withAud(String aud) {
        this.aud = aud;
        return this;
    }

    /**
     * <p>
     * (Optional) The issuer of the token.
     * </p>
     *
     * @return <p>
     *         (Optional) The issuer of the token.
     *         </p>
     */
    public String getIss() {
        return iss;
    }

    /**
     * <p>
     * (Optional) The issuer of the token.
     * </p>
     *
     * @param iss <p>
     *            (Optional) The issuer of the token.
     *            </p>
     */
    public void setIss(String iss) {
        this.iss = iss;
    }

    /**
     * <p>
     * (Optional) The issuer of the token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iss <p>
     *            (Optional) The issuer of the token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntrospectTokenResult withIss(String iss) {
        this.iss = iss;
        return this;
    }

    /**
     * <p>
     * (Optional) A unique token identifier.
     * </p>
     *
     * @return <p>
     *         (Optional) A unique token identifier.
     *         </p>
     */
    public String getJti() {
        return jti;
    }

    /**
     * <p>
     * (Optional) A unique token identifier.
     * </p>
     *
     * @param jti <p>
     *            (Optional) A unique token identifier.
     *            </p>
     */
    public void setJti(String jti) {
        this.jti = jti;
    }

    /**
     * <p>
     * (Optional) A unique token identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jti <p>
     *            (Optional) A unique token identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IntrospectTokenResult withJti(String jti) {
        this.jti = jti;
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
        if (getActive() != null)
            sb.append("Active: " + getActive() + ",");
        if (getScope() != null)
            sb.append("Scope: " + getScope() + ",");
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getTokenType() != null)
            sb.append("TokenType: " + getTokenType() + ",");
        if (getExp() != null)
            sb.append("Exp: " + getExp() + ",");
        if (getIat() != null)
            sb.append("Iat: " + getIat() + ",");
        if (getNbf() != null)
            sb.append("Nbf: " + getNbf() + ",");
        if (getSub() != null)
            sb.append("Sub: " + getSub() + ",");
        if (getAud() != null)
            sb.append("Aud: " + getAud() + ",");
        if (getIss() != null)
            sb.append("Iss: " + getIss() + ",");
        if (getJti() != null)
            sb.append("Jti: " + getJti());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getTokenType() == null) ? 0 : getTokenType().hashCode());
        hashCode = prime * hashCode + ((getExp() == null) ? 0 : getExp().hashCode());
        hashCode = prime * hashCode + ((getIat() == null) ? 0 : getIat().hashCode());
        hashCode = prime * hashCode + ((getNbf() == null) ? 0 : getNbf().hashCode());
        hashCode = prime * hashCode + ((getSub() == null) ? 0 : getSub().hashCode());
        hashCode = prime * hashCode + ((getAud() == null) ? 0 : getAud().hashCode());
        hashCode = prime * hashCode + ((getIss() == null) ? 0 : getIss().hashCode());
        hashCode = prime * hashCode + ((getJti() == null) ? 0 : getJti().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntrospectTokenResult == false)
            return false;
        IntrospectTokenResult other = (IntrospectTokenResult) obj;

        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getTokenType() == null ^ this.getTokenType() == null)
            return false;
        if (other.getTokenType() != null
                && other.getTokenType().equals(this.getTokenType()) == false)
            return false;
        if (other.getExp() == null ^ this.getExp() == null)
            return false;
        if (other.getExp() != null && other.getExp().equals(this.getExp()) == false)
            return false;
        if (other.getIat() == null ^ this.getIat() == null)
            return false;
        if (other.getIat() != null && other.getIat().equals(this.getIat()) == false)
            return false;
        if (other.getNbf() == null ^ this.getNbf() == null)
            return false;
        if (other.getNbf() != null && other.getNbf().equals(this.getNbf()) == false)
            return false;
        if (other.getSub() == null ^ this.getSub() == null)
            return false;
        if (other.getSub() != null && other.getSub().equals(this.getSub()) == false)
            return false;
        if (other.getAud() == null ^ this.getAud() == null)
            return false;
        if (other.getAud() != null && other.getAud().equals(this.getAud()) == false)
            return false;
        if (other.getIss() == null ^ this.getIss() == null)
            return false;
        if (other.getIss() != null && other.getIss().equals(this.getIss()) == false)
            return false;
        if (other.getJti() == null ^ this.getJti() == null)
            return false;
        if (other.getJti() != null && other.getJti().equals(this.getJti()) == false)
            return false;
        return true;
    }
}
