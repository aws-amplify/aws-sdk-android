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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the configuration of a JWT authorizer. Required for the JWT
 * authorizer type. Supported only for HTTP APIs.
 * </p>
 */
public class JWTConfiguration implements Serializable {
    /**
     * <p>
     * A list of the intended recipients of the JWT. A valid JWT must provide an
     * aud that matches at least one entry in this list. See <a
     * href="https://tools.ietf.org/html/rfc7519#section-4.1.3">RFC 7519</a>.
     * Supported only for HTTP APIs.
     * </p>
     */
    private java.util.List<String> audience;

    /**
     * <p>
     * The base domain of the identity provider that issues JSON Web Tokens. For
     * example, an Amazon Cognito user pool has the following format:
     * https://cognito
     * -idp.<replaceable>{region}</replaceable>.amazonaws.com/<replaceable
     * >{userPoolId}</replaceable> . Required for the JWT authorizer type.
     * Supported only for HTTP APIs.
     * </p>
     */
    private String issuer;

    /**
     * <p>
     * A list of the intended recipients of the JWT. A valid JWT must provide an
     * aud that matches at least one entry in this list. See <a
     * href="https://tools.ietf.org/html/rfc7519#section-4.1.3">RFC 7519</a>.
     * Supported only for HTTP APIs.
     * </p>
     *
     * @return <p>
     *         A list of the intended recipients of the JWT. A valid JWT must
     *         provide an aud that matches at least one entry in this list. See
     *         <a href="https://tools.ietf.org/html/rfc7519#section-4.1.3">RFC
     *         7519</a>. Supported only for HTTP APIs.
     *         </p>
     */
    public java.util.List<String> getAudience() {
        return audience;
    }

    /**
     * <p>
     * A list of the intended recipients of the JWT. A valid JWT must provide an
     * aud that matches at least one entry in this list. See <a
     * href="https://tools.ietf.org/html/rfc7519#section-4.1.3">RFC 7519</a>.
     * Supported only for HTTP APIs.
     * </p>
     *
     * @param audience <p>
     *            A list of the intended recipients of the JWT. A valid JWT must
     *            provide an aud that matches at least one entry in this list.
     *            See <a
     *            href="https://tools.ietf.org/html/rfc7519#section-4.1.3">RFC
     *            7519</a>. Supported only for HTTP APIs.
     *            </p>
     */
    public void setAudience(java.util.Collection<String> audience) {
        if (audience == null) {
            this.audience = null;
            return;
        }

        this.audience = new java.util.ArrayList<String>(audience);
    }

    /**
     * <p>
     * A list of the intended recipients of the JWT. A valid JWT must provide an
     * aud that matches at least one entry in this list. See <a
     * href="https://tools.ietf.org/html/rfc7519#section-4.1.3">RFC 7519</a>.
     * Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audience <p>
     *            A list of the intended recipients of the JWT. A valid JWT must
     *            provide an aud that matches at least one entry in this list.
     *            See <a
     *            href="https://tools.ietf.org/html/rfc7519#section-4.1.3">RFC
     *            7519</a>. Supported only for HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JWTConfiguration withAudience(String... audience) {
        if (getAudience() == null) {
            this.audience = new java.util.ArrayList<String>(audience.length);
        }
        for (String value : audience) {
            this.audience.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the intended recipients of the JWT. A valid JWT must provide an
     * aud that matches at least one entry in this list. See <a
     * href="https://tools.ietf.org/html/rfc7519#section-4.1.3">RFC 7519</a>.
     * Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audience <p>
     *            A list of the intended recipients of the JWT. A valid JWT must
     *            provide an aud that matches at least one entry in this list.
     *            See <a
     *            href="https://tools.ietf.org/html/rfc7519#section-4.1.3">RFC
     *            7519</a>. Supported only for HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JWTConfiguration withAudience(java.util.Collection<String> audience) {
        setAudience(audience);
        return this;
    }

    /**
     * <p>
     * The base domain of the identity provider that issues JSON Web Tokens. For
     * example, an Amazon Cognito user pool has the following format:
     * https://cognito
     * -idp.<replaceable>{region}</replaceable>.amazonaws.com/<replaceable
     * >{userPoolId}</replaceable> . Required for the JWT authorizer type.
     * Supported only for HTTP APIs.
     * </p>
     *
     * @return <p>
     *         The base domain of the identity provider that issues JSON Web
     *         Tokens. For example, an Amazon Cognito user pool has the
     *         following format:
     *         https://cognito-idp.<replaceable>{region}</replaceable
     *         >.amazonaws.com/<replaceable>{userPoolId}</replaceable> .
     *         Required for the JWT authorizer type. Supported only for HTTP
     *         APIs.
     *         </p>
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * <p>
     * The base domain of the identity provider that issues JSON Web Tokens. For
     * example, an Amazon Cognito user pool has the following format:
     * https://cognito
     * -idp.<replaceable>{region}</replaceable>.amazonaws.com/<replaceable
     * >{userPoolId}</replaceable> . Required for the JWT authorizer type.
     * Supported only for HTTP APIs.
     * </p>
     *
     * @param issuer <p>
     *            The base domain of the identity provider that issues JSON Web
     *            Tokens. For example, an Amazon Cognito user pool has the
     *            following format:
     *            https://cognito-idp.<replaceable>{region}</replaceable
     *            >.amazonaws.com/<replaceable>{userPoolId}</replaceable> .
     *            Required for the JWT authorizer type. Supported only for HTTP
     *            APIs.
     *            </p>
     */
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The base domain of the identity provider that issues JSON Web Tokens. For
     * example, an Amazon Cognito user pool has the following format:
     * https://cognito
     * -idp.<replaceable>{region}</replaceable>.amazonaws.com/<replaceable
     * >{userPoolId}</replaceable> . Required for the JWT authorizer type.
     * Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param issuer <p>
     *            The base domain of the identity provider that issues JSON Web
     *            Tokens. For example, an Amazon Cognito user pool has the
     *            following format:
     *            https://cognito-idp.<replaceable>{region}</replaceable
     *            >.amazonaws.com/<replaceable>{userPoolId}</replaceable> .
     *            Required for the JWT authorizer type. Supported only for HTTP
     *            APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JWTConfiguration withIssuer(String issuer) {
        this.issuer = issuer;
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
        if (getAudience() != null)
            sb.append("Audience: " + getAudience() + ",");
        if (getIssuer() != null)
            sb.append("Issuer: " + getIssuer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudience() == null) ? 0 : getAudience().hashCode());
        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JWTConfiguration == false)
            return false;
        JWTConfiguration other = (JWTConfiguration) obj;

        if (other.getAudience() == null ^ this.getAudience() == null)
            return false;
        if (other.getAudience() != null && other.getAudience().equals(this.getAudience()) == false)
            return false;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        return true;
    }
}
