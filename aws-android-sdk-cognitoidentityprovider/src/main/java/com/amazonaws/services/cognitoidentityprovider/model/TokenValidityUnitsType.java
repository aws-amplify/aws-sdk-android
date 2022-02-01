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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The data type for TokenValidityUnits that specifics the time measurements for
 * token validity.
 * </p>
 */
public class TokenValidityUnitsType implements Serializable {
    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours”, or “days” for the value in
     * AccessTokenValidity, defaulting to hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>seconds, minutes, hours, days
     */
    private String accessToken;

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours”, or “days” for the value in
     * IdTokenValidity, defaulting to hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>seconds, minutes, hours, days
     */
    private String idToken;

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours”, or “days” for the value in
     * RefreshTokenValidity, defaulting to days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>seconds, minutes, hours, days
     */
    private String refreshToken;

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours”, or “days” for the value in
     * AccessTokenValidity, defaulting to hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>seconds, minutes, hours, days
     *
     * @return <p>
     *         A time unit in “seconds”, “minutes”, “hours”, or “days” for the
     *         value in AccessTokenValidity, defaulting to hours.
     *         </p>
     * @see TimeUnitsType
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours”, or “days” for the value in
     * AccessTokenValidity, defaulting to hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>seconds, minutes, hours, days
     *
     * @param accessToken <p>
     *            A time unit in “seconds”, “minutes”, “hours”, or “days” for
     *            the value in AccessTokenValidity, defaulting to hours.
     *            </p>
     * @see TimeUnitsType
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours”, or “days” for the value in
     * AccessTokenValidity, defaulting to hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>seconds, minutes, hours, days
     *
     * @param accessToken <p>
     *            A time unit in “seconds”, “minutes”, “hours”, or “days” for
     *            the value in AccessTokenValidity, defaulting to hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimeUnitsType
     */
    public TokenValidityUnitsType withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours”, or “days” for the value in
     * AccessTokenValidity, defaulting to hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>seconds, minutes, hours, days
     *
     * @param accessToken <p>
     *            A time unit in “seconds”, “minutes”, “hours”, or “days” for
     *            the value in AccessTokenValidity, defaulting to hours.
     *            </p>
     * @see TimeUnitsType
     */
    public void setAccessToken(TimeUnitsType accessToken) {
        this.accessToken = accessToken.toString();
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours”, or “days” for the value in
     * AccessTokenValidity, defaulting to hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>seconds, minutes, hours, days
     *
     * @param accessToken <p>
     *            A time unit in “seconds”, “minutes”, “hours”, or “days” for
     *            the value in AccessTokenValidity, defaulting to hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimeUnitsType
     */
    public TokenValidityUnitsType withAccessToken(TimeUnitsType accessToken) {
        this.accessToken = accessToken.toString();
        return this;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours”, or “days” for the value in
     * IdTokenValidity, defaulting to hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>seconds, minutes, hours, days
     *
     * @return <p>
     *         A time unit in “seconds”, “minutes”, “hours”, or “days” for the
     *         value in IdTokenValidity, defaulting to hours.
     *         </p>
     * @see TimeUnitsType
     */
    public String getIdToken() {
        return idToken;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours”, or “days” for the value in
     * IdTokenValidity, defaulting to hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>seconds, minutes, hours, days
     *
     * @param idToken <p>
     *            A time unit in “seconds”, “minutes”, “hours”, or “days” for
     *            the value in IdTokenValidity, defaulting to hours.
     *            </p>
     * @see TimeUnitsType
     */
    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours”, or “days” for the value in
     * IdTokenValidity, defaulting to hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>seconds, minutes, hours, days
     *
     * @param idToken <p>
     *            A time unit in “seconds”, “minutes”, “hours”, or “days” for
     *            the value in IdTokenValidity, defaulting to hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimeUnitsType
     */
    public TokenValidityUnitsType withIdToken(String idToken) {
        this.idToken = idToken;
        return this;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours”, or “days” for the value in
     * IdTokenValidity, defaulting to hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>seconds, minutes, hours, days
     *
     * @param idToken <p>
     *            A time unit in “seconds”, “minutes”, “hours”, or “days” for
     *            the value in IdTokenValidity, defaulting to hours.
     *            </p>
     * @see TimeUnitsType
     */
    public void setIdToken(TimeUnitsType idToken) {
        this.idToken = idToken.toString();
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours”, or “days” for the value in
     * IdTokenValidity, defaulting to hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>seconds, minutes, hours, days
     *
     * @param idToken <p>
     *            A time unit in “seconds”, “minutes”, “hours”, or “days” for
     *            the value in IdTokenValidity, defaulting to hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimeUnitsType
     */
    public TokenValidityUnitsType withIdToken(TimeUnitsType idToken) {
        this.idToken = idToken.toString();
        return this;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours”, or “days” for the value in
     * RefreshTokenValidity, defaulting to days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>seconds, minutes, hours, days
     *
     * @return <p>
     *         A time unit in “seconds”, “minutes”, “hours”, or “days” for the
     *         value in RefreshTokenValidity, defaulting to days.
     *         </p>
     * @see TimeUnitsType
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours”, or “days” for the value in
     * RefreshTokenValidity, defaulting to days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>seconds, minutes, hours, days
     *
     * @param refreshToken <p>
     *            A time unit in “seconds”, “minutes”, “hours”, or “days” for
     *            the value in RefreshTokenValidity, defaulting to days.
     *            </p>
     * @see TimeUnitsType
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours”, or “days” for the value in
     * RefreshTokenValidity, defaulting to days.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>seconds, minutes, hours, days
     *
     * @param refreshToken <p>
     *            A time unit in “seconds”, “minutes”, “hours”, or “days” for
     *            the value in RefreshTokenValidity, defaulting to days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimeUnitsType
     */
    public TokenValidityUnitsType withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours”, or “days” for the value in
     * RefreshTokenValidity, defaulting to days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>seconds, minutes, hours, days
     *
     * @param refreshToken <p>
     *            A time unit in “seconds”, “minutes”, “hours”, or “days” for
     *            the value in RefreshTokenValidity, defaulting to days.
     *            </p>
     * @see TimeUnitsType
     */
    public void setRefreshToken(TimeUnitsType refreshToken) {
        this.refreshToken = refreshToken.toString();
    }

    /**
     * <p>
     * A time unit in “seconds”, “minutes”, “hours”, or “days” for the value in
     * RefreshTokenValidity, defaulting to days.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>seconds, minutes, hours, days
     *
     * @param refreshToken <p>
     *            A time unit in “seconds”, “minutes”, “hours”, or “days” for
     *            the value in RefreshTokenValidity, defaulting to days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimeUnitsType
     */
    public TokenValidityUnitsType withRefreshToken(TimeUnitsType refreshToken) {
        this.refreshToken = refreshToken.toString();
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
        if (getIdToken() != null)
            sb.append("IdToken: " + getIdToken() + ",");
        if (getRefreshToken() != null)
            sb.append("RefreshToken: " + getRefreshToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getIdToken() == null) ? 0 : getIdToken().hashCode());
        hashCode = prime * hashCode
                + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TokenValidityUnitsType == false)
            return false;
        TokenValidityUnitsType other = (TokenValidityUnitsType) obj;

        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null
                && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getIdToken() == null ^ this.getIdToken() == null)
            return false;
        if (other.getIdToken() != null && other.getIdToken().equals(this.getIdToken()) == false)
            return false;
        if (other.getRefreshToken() == null ^ this.getRefreshToken() == null)
            return false;
        if (other.getRefreshToken() != null
                && other.getRefreshToken().equals(this.getRefreshToken()) == false)
            return false;
        return true;
    }
}
