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
 * Represents the response from the server to get the Open ID configuration
 * information.
 * </p>
 */
public class GetOpenIdConfigurationResult implements Serializable {
    /**
     * <p>
     * The issuer of the Open ID configuration response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     * <b>Pattern: </b>https://cognito-idp\.amazonaws\.com/[\w\._/-]<br/>
     */
    private String issuer;

    /**
     * <p>
     * The URI of the JSON Web keys in the server response to get Open ID
     * configuration information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     * <b>Pattern: </b>https://cognito-idp\.amazonaws\.com/[\w\._/-]<br/>
     */
    private String jwks_uri;

    /**
     * <p>
     * The authorization endpoint returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     * <b>Pattern: </b>https://cognito-idp\.amazonaws\.com/[\w\._/-]<br/>
     */
    private String authorization_endpoint;

    /**
     * <p>
     * The subject types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     */
    private java.util.List<String> subject_types_supported;

    /**
     * <p>
     * The response types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     */
    private java.util.List<String> response_types_supported;

    /**
     * <p>
     * The token-signing algorithm values supported returned by the server
     * response to get the Open ID configuration information.
     * </p>
     */
    private java.util.List<String> id_token_signing_alg_values_supported;

    /**
     * <p>
     * The issuer of the Open ID configuration response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     * <b>Pattern: </b>https://cognito-idp\.amazonaws\.com/[\w\._/-]<br/>
     *
     * @return <p>
     *         The issuer of the Open ID configuration response.
     *         </p>
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * <p>
     * The issuer of the Open ID configuration response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     * <b>Pattern: </b>https://cognito-idp\.amazonaws\.com/[\w\._/-]<br/>
     *
     * @param issuer <p>
     *            The issuer of the Open ID configuration response.
     *            </p>
     */
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The issuer of the Open ID configuration response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     * <b>Pattern: </b>https://cognito-idp\.amazonaws\.com/[\w\._/-]<br/>
     *
     * @param issuer <p>
     *            The issuer of the Open ID configuration response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpenIdConfigurationResult withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * <p>
     * The URI of the JSON Web keys in the server response to get Open ID
     * configuration information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     * <b>Pattern: </b>https://cognito-idp\.amazonaws\.com/[\w\._/-]<br/>
     *
     * @return <p>
     *         The URI of the JSON Web keys in the server response to get Open
     *         ID configuration information.
     *         </p>
     */
    public String getJwks_uri() {
        return jwks_uri;
    }

    /**
     * <p>
     * The URI of the JSON Web keys in the server response to get Open ID
     * configuration information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     * <b>Pattern: </b>https://cognito-idp\.amazonaws\.com/[\w\._/-]<br/>
     *
     * @param jwks_uri <p>
     *            The URI of the JSON Web keys in the server response to get
     *            Open ID configuration information.
     *            </p>
     */
    public void setJwks_uri(String jwks_uri) {
        this.jwks_uri = jwks_uri;
    }

    /**
     * <p>
     * The URI of the JSON Web keys in the server response to get Open ID
     * configuration information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     * <b>Pattern: </b>https://cognito-idp\.amazonaws\.com/[\w\._/-]<br/>
     *
     * @param jwks_uri <p>
     *            The URI of the JSON Web keys in the server response to get
     *            Open ID configuration information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpenIdConfigurationResult withJwks_uri(String jwks_uri) {
        this.jwks_uri = jwks_uri;
        return this;
    }

    /**
     * <p>
     * The authorization endpoint returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     * <b>Pattern: </b>https://cognito-idp\.amazonaws\.com/[\w\._/-]<br/>
     *
     * @return <p>
     *         The authorization endpoint returned by the server response to get
     *         the Open ID configuration information.
     *         </p>
     */
    public String getAuthorization_endpoint() {
        return authorization_endpoint;
    }

    /**
     * <p>
     * The authorization endpoint returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     * <b>Pattern: </b>https://cognito-idp\.amazonaws\.com/[\w\._/-]<br/>
     *
     * @param authorization_endpoint <p>
     *            The authorization endpoint returned by the server response to
     *            get the Open ID configuration information.
     *            </p>
     */
    public void setAuthorization_endpoint(String authorization_endpoint) {
        this.authorization_endpoint = authorization_endpoint;
    }

    /**
     * <p>
     * The authorization endpoint returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 150<br/>
     * <b>Pattern: </b>https://cognito-idp\.amazonaws\.com/[\w\._/-]<br/>
     *
     * @param authorization_endpoint <p>
     *            The authorization endpoint returned by the server response to
     *            get the Open ID configuration information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpenIdConfigurationResult withAuthorization_endpoint(String authorization_endpoint) {
        this.authorization_endpoint = authorization_endpoint;
        return this;
    }

    /**
     * <p>
     * The subject types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     *
     * @return <p>
     *         The subject types supported returned by the server response to
     *         get the Open ID configuration information.
     *         </p>
     */
    public java.util.List<String> getSubject_types_supported() {
        return subject_types_supported;
    }

    /**
     * <p>
     * The subject types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     *
     * @param subject_types_supported <p>
     *            The subject types supported returned by the server response to
     *            get the Open ID configuration information.
     *            </p>
     */
    public void setSubject_types_supported(java.util.Collection<String> subject_types_supported) {
        if (subject_types_supported == null) {
            this.subject_types_supported = null;
            return;
        }

        this.subject_types_supported = new java.util.ArrayList<String>(subject_types_supported);
    }

    /**
     * <p>
     * The subject types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subject_types_supported <p>
     *            The subject types supported returned by the server response to
     *            get the Open ID configuration information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpenIdConfigurationResult withSubject_types_supported(
            String... subject_types_supported) {
        if (getSubject_types_supported() == null) {
            this.subject_types_supported = new java.util.ArrayList<String>(
                    subject_types_supported.length);
        }
        for (String value : subject_types_supported) {
            this.subject_types_supported.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The subject types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subject_types_supported <p>
     *            The subject types supported returned by the server response to
     *            get the Open ID configuration information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpenIdConfigurationResult withSubject_types_supported(
            java.util.Collection<String> subject_types_supported) {
        setSubject_types_supported(subject_types_supported);
        return this;
    }

    /**
     * <p>
     * The response types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     *
     * @return <p>
     *         The response types supported returned by the server response to
     *         get the Open ID configuration information.
     *         </p>
     */
    public java.util.List<String> getResponse_types_supported() {
        return response_types_supported;
    }

    /**
     * <p>
     * The response types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     *
     * @param response_types_supported <p>
     *            The response types supported returned by the server response
     *            to get the Open ID configuration information.
     *            </p>
     */
    public void setResponse_types_supported(java.util.Collection<String> response_types_supported) {
        if (response_types_supported == null) {
            this.response_types_supported = null;
            return;
        }

        this.response_types_supported = new java.util.ArrayList<String>(response_types_supported);
    }

    /**
     * <p>
     * The response types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param response_types_supported <p>
     *            The response types supported returned by the server response
     *            to get the Open ID configuration information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpenIdConfigurationResult withResponse_types_supported(
            String... response_types_supported) {
        if (getResponse_types_supported() == null) {
            this.response_types_supported = new java.util.ArrayList<String>(
                    response_types_supported.length);
        }
        for (String value : response_types_supported) {
            this.response_types_supported.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The response types supported returned by the server response to get the
     * Open ID configuration information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param response_types_supported <p>
     *            The response types supported returned by the server response
     *            to get the Open ID configuration information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpenIdConfigurationResult withResponse_types_supported(
            java.util.Collection<String> response_types_supported) {
        setResponse_types_supported(response_types_supported);
        return this;
    }

    /**
     * <p>
     * The token-signing algorithm values supported returned by the server
     * response to get the Open ID configuration information.
     * </p>
     *
     * @return <p>
     *         The token-signing algorithm values supported returned by the
     *         server response to get the Open ID configuration information.
     *         </p>
     */
    public java.util.List<String> getId_token_signing_alg_values_supported() {
        return id_token_signing_alg_values_supported;
    }

    /**
     * <p>
     * The token-signing algorithm values supported returned by the server
     * response to get the Open ID configuration information.
     * </p>
     *
     * @param id_token_signing_alg_values_supported <p>
     *            The token-signing algorithm values supported returned by the
     *            server response to get the Open ID configuration information.
     *            </p>
     */
    public void setId_token_signing_alg_values_supported(
            java.util.Collection<String> id_token_signing_alg_values_supported) {
        if (id_token_signing_alg_values_supported == null) {
            this.id_token_signing_alg_values_supported = null;
            return;
        }

        this.id_token_signing_alg_values_supported = new java.util.ArrayList<String>(
                id_token_signing_alg_values_supported);
    }

    /**
     * <p>
     * The token-signing algorithm values supported returned by the server
     * response to get the Open ID configuration information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id_token_signing_alg_values_supported <p>
     *            The token-signing algorithm values supported returned by the
     *            server response to get the Open ID configuration information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpenIdConfigurationResult withId_token_signing_alg_values_supported(
            String... id_token_signing_alg_values_supported) {
        if (getId_token_signing_alg_values_supported() == null) {
            this.id_token_signing_alg_values_supported = new java.util.ArrayList<String>(
                    id_token_signing_alg_values_supported.length);
        }
        for (String value : id_token_signing_alg_values_supported) {
            this.id_token_signing_alg_values_supported.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The token-signing algorithm values supported returned by the server
     * response to get the Open ID configuration information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id_token_signing_alg_values_supported <p>
     *            The token-signing algorithm values supported returned by the
     *            server response to get the Open ID configuration information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpenIdConfigurationResult withId_token_signing_alg_values_supported(
            java.util.Collection<String> id_token_signing_alg_values_supported) {
        setId_token_signing_alg_values_supported(id_token_signing_alg_values_supported);
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
        if (getIssuer() != null)
            sb.append("issuer: " + getIssuer() + ",");
        if (getJwks_uri() != null)
            sb.append("jwks_uri: " + getJwks_uri() + ",");
        if (getAuthorization_endpoint() != null)
            sb.append("authorization_endpoint: " + getAuthorization_endpoint() + ",");
        if (getSubject_types_supported() != null)
            sb.append("subject_types_supported: " + getSubject_types_supported() + ",");
        if (getResponse_types_supported() != null)
            sb.append("response_types_supported: " + getResponse_types_supported() + ",");
        if (getId_token_signing_alg_values_supported() != null)
            sb.append("id_token_signing_alg_values_supported: "
                    + getId_token_signing_alg_values_supported());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode + ((getJwks_uri() == null) ? 0 : getJwks_uri().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthorization_endpoint() == null) ? 0 : getAuthorization_endpoint()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSubject_types_supported() == null) ? 0 : getSubject_types_supported()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getResponse_types_supported() == null) ? 0 : getResponse_types_supported()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getId_token_signing_alg_values_supported() == null) ? 0
                        : getId_token_signing_alg_values_supported().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOpenIdConfigurationResult == false)
            return false;
        GetOpenIdConfigurationResult other = (GetOpenIdConfigurationResult) obj;

        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        if (other.getJwks_uri() == null ^ this.getJwks_uri() == null)
            return false;
        if (other.getJwks_uri() != null && other.getJwks_uri().equals(this.getJwks_uri()) == false)
            return false;
        if (other.getAuthorization_endpoint() == null ^ this.getAuthorization_endpoint() == null)
            return false;
        if (other.getAuthorization_endpoint() != null
                && other.getAuthorization_endpoint().equals(this.getAuthorization_endpoint()) == false)
            return false;
        if (other.getSubject_types_supported() == null ^ this.getSubject_types_supported() == null)
            return false;
        if (other.getSubject_types_supported() != null
                && other.getSubject_types_supported().equals(this.getSubject_types_supported()) == false)
            return false;
        if (other.getResponse_types_supported() == null
                ^ this.getResponse_types_supported() == null)
            return false;
        if (other.getResponse_types_supported() != null
                && other.getResponse_types_supported().equals(this.getResponse_types_supported()) == false)
            return false;
        if (other.getId_token_signing_alg_values_supported() == null
                ^ this.getId_token_signing_alg_values_supported() == null)
            return false;
        if (other.getId_token_signing_alg_values_supported() != null
                && other.getId_token_signing_alg_values_supported().equals(
                        this.getId_token_signing_alg_values_supported()) == false)
            return false;
        return true;
    }
}
