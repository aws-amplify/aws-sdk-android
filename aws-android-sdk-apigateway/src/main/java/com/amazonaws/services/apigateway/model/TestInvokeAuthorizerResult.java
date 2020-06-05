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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the response of the test invoke request for a custom
 * <a>Authorizer</a>
 * </p>
 */
public class TestInvokeAuthorizerResult implements Serializable {
    /**
     * <p>
     * The HTTP status code that the client would have received. Value is 0 if
     * the authorizer succeeded.
     * </p>
     */
    private Integer clientStatus;

    /**
     * <p>
     * The API Gateway execution log for the test authorizer request.
     * </p>
     */
    private String log;

    /**
     * <p>
     * The execution latency of the test authorizer request.
     * </p>
     */
    private Long latency;

    /**
     * <p>
     * The principal identity returned by the <a>Authorizer</a>
     * </p>
     */
    private String principalId;

    /**
     * <p>
     * The JSON policy document returned by the <a>Authorizer</a>
     * </p>
     */
    private String policy;

    /**
     * The new value for the authorization property for this object.
     */
    private java.util.Map<String, java.util.List<String>> authorization;

    /**
     * <p>
     * The <a href=
     * "https://openid.net/specs/openid-connect-core-1_0.html#StandardClaims"
     * >open identity claims</a>, with any supported custom attributes, returned
     * from the Cognito Your User Pool configured for the API.
     * </p>
     */
    private java.util.Map<String, String> claims;

    /**
     * <p>
     * The HTTP status code that the client would have received. Value is 0 if
     * the authorizer succeeded.
     * </p>
     *
     * @return <p>
     *         The HTTP status code that the client would have received. Value
     *         is 0 if the authorizer succeeded.
     *         </p>
     */
    public Integer getClientStatus() {
        return clientStatus;
    }

    /**
     * <p>
     * The HTTP status code that the client would have received. Value is 0 if
     * the authorizer succeeded.
     * </p>
     *
     * @param clientStatus <p>
     *            The HTTP status code that the client would have received.
     *            Value is 0 if the authorizer succeeded.
     *            </p>
     */
    public void setClientStatus(Integer clientStatus) {
        this.clientStatus = clientStatus;
    }

    /**
     * <p>
     * The HTTP status code that the client would have received. Value is 0 if
     * the authorizer succeeded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientStatus <p>
     *            The HTTP status code that the client would have received.
     *            Value is 0 if the authorizer succeeded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerResult withClientStatus(Integer clientStatus) {
        this.clientStatus = clientStatus;
        return this;
    }

    /**
     * <p>
     * The API Gateway execution log for the test authorizer request.
     * </p>
     *
     * @return <p>
     *         The API Gateway execution log for the test authorizer request.
     *         </p>
     */
    public String getLog() {
        return log;
    }

    /**
     * <p>
     * The API Gateway execution log for the test authorizer request.
     * </p>
     *
     * @param log <p>
     *            The API Gateway execution log for the test authorizer request.
     *            </p>
     */
    public void setLog(String log) {
        this.log = log;
    }

    /**
     * <p>
     * The API Gateway execution log for the test authorizer request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param log <p>
     *            The API Gateway execution log for the test authorizer request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerResult withLog(String log) {
        this.log = log;
        return this;
    }

    /**
     * <p>
     * The execution latency of the test authorizer request.
     * </p>
     *
     * @return <p>
     *         The execution latency of the test authorizer request.
     *         </p>
     */
    public Long getLatency() {
        return latency;
    }

    /**
     * <p>
     * The execution latency of the test authorizer request.
     * </p>
     *
     * @param latency <p>
     *            The execution latency of the test authorizer request.
     *            </p>
     */
    public void setLatency(Long latency) {
        this.latency = latency;
    }

    /**
     * <p>
     * The execution latency of the test authorizer request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latency <p>
     *            The execution latency of the test authorizer request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerResult withLatency(Long latency) {
        this.latency = latency;
        return this;
    }

    /**
     * <p>
     * The principal identity returned by the <a>Authorizer</a>
     * </p>
     *
     * @return <p>
     *         The principal identity returned by the <a>Authorizer</a>
     *         </p>
     */
    public String getPrincipalId() {
        return principalId;
    }

    /**
     * <p>
     * The principal identity returned by the <a>Authorizer</a>
     * </p>
     *
     * @param principalId <p>
     *            The principal identity returned by the <a>Authorizer</a>
     *            </p>
     */
    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The principal identity returned by the <a>Authorizer</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principalId <p>
     *            The principal identity returned by the <a>Authorizer</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerResult withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * <p>
     * The JSON policy document returned by the <a>Authorizer</a>
     * </p>
     *
     * @return <p>
     *         The JSON policy document returned by the <a>Authorizer</a>
     *         </p>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * The JSON policy document returned by the <a>Authorizer</a>
     * </p>
     *
     * @param policy <p>
     *            The JSON policy document returned by the <a>Authorizer</a>
     *            </p>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The JSON policy document returned by the <a>Authorizer</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policy <p>
     *            The JSON policy document returned by the <a>Authorizer</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerResult withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Returns the value of the authorization property for this object.
     *
     * @return The value of the authorization property for this object.
     */
    public java.util.Map<String, java.util.List<String>> getAuthorization() {
        return authorization;
    }

    /**
     * Sets the value of authorization
     *
     * @param authorization The new value for the authorization property for
     *            this object.
     */
    public void setAuthorization(java.util.Map<String, java.util.List<String>> authorization) {
        this.authorization = authorization;
    }

    /**
     * Sets the value of the authorization property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorization The new value for the authorization property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerResult withAuthorization(
            java.util.Map<String, java.util.List<String>> authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * Sets the value of the authorization property for this object.
     * <p>
     * The method adds a new key-value pair into authorization parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into authorization.
     * @param value The corresponding value of the entry to be added into
     *            authorization.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerResult addauthorizationEntry(String key, java.util.List<String> value) {
        if (null == this.authorization) {
            this.authorization = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.authorization.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.authorization.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into authorization.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public TestInvokeAuthorizerResult clearauthorizationEntries() {
        this.authorization = null;
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "https://openid.net/specs/openid-connect-core-1_0.html#StandardClaims"
     * >open identity claims</a>, with any supported custom attributes, returned
     * from the Cognito Your User Pool configured for the API.
     * </p>
     *
     * @return <p>
     *         The <a href=
     *         "https://openid.net/specs/openid-connect-core-1_0.html#StandardClaims"
     *         >open identity claims</a>, with any supported custom attributes,
     *         returned from the Cognito Your User Pool configured for the API.
     *         </p>
     */
    public java.util.Map<String, String> getClaims() {
        return claims;
    }

    /**
     * <p>
     * The <a href=
     * "https://openid.net/specs/openid-connect-core-1_0.html#StandardClaims"
     * >open identity claims</a>, with any supported custom attributes, returned
     * from the Cognito Your User Pool configured for the API.
     * </p>
     *
     * @param claims <p>
     *            The <a href=
     *            "https://openid.net/specs/openid-connect-core-1_0.html#StandardClaims"
     *            >open identity claims</a>, with any supported custom
     *            attributes, returned from the Cognito Your User Pool
     *            configured for the API.
     *            </p>
     */
    public void setClaims(java.util.Map<String, String> claims) {
        this.claims = claims;
    }

    /**
     * <p>
     * The <a href=
     * "https://openid.net/specs/openid-connect-core-1_0.html#StandardClaims"
     * >open identity claims</a>, with any supported custom attributes, returned
     * from the Cognito Your User Pool configured for the API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param claims <p>
     *            The <a href=
     *            "https://openid.net/specs/openid-connect-core-1_0.html#StandardClaims"
     *            >open identity claims</a>, with any supported custom
     *            attributes, returned from the Cognito Your User Pool
     *            configured for the API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerResult withClaims(java.util.Map<String, String> claims) {
        this.claims = claims;
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "https://openid.net/specs/openid-connect-core-1_0.html#StandardClaims"
     * >open identity claims</a>, with any supported custom attributes, returned
     * from the Cognito Your User Pool configured for the API.
     * </p>
     * <p>
     * The method adds a new key-value pair into claims parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into claims.
     * @param value The corresponding value of the entry to be added into
     *            claims.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerResult addclaimsEntry(String key, String value) {
        if (null == this.claims) {
            this.claims = new java.util.HashMap<String, String>();
        }
        if (this.claims.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.claims.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into claims.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public TestInvokeAuthorizerResult clearclaimsEntries() {
        this.claims = null;
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
        if (getClientStatus() != null)
            sb.append("clientStatus: " + getClientStatus() + ",");
        if (getLog() != null)
            sb.append("log: " + getLog() + ",");
        if (getLatency() != null)
            sb.append("latency: " + getLatency() + ",");
        if (getPrincipalId() != null)
            sb.append("principalId: " + getPrincipalId() + ",");
        if (getPolicy() != null)
            sb.append("policy: " + getPolicy() + ",");
        if (getAuthorization() != null)
            sb.append("authorization: " + getAuthorization() + ",");
        if (getClaims() != null)
            sb.append("claims: " + getClaims());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientStatus() == null) ? 0 : getClientStatus().hashCode());
        hashCode = prime * hashCode + ((getLog() == null) ? 0 : getLog().hashCode());
        hashCode = prime * hashCode + ((getLatency() == null) ? 0 : getLatency().hashCode());
        hashCode = prime * hashCode
                + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode
                + ((getAuthorization() == null) ? 0 : getAuthorization().hashCode());
        hashCode = prime * hashCode + ((getClaims() == null) ? 0 : getClaims().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestInvokeAuthorizerResult == false)
            return false;
        TestInvokeAuthorizerResult other = (TestInvokeAuthorizerResult) obj;

        if (other.getClientStatus() == null ^ this.getClientStatus() == null)
            return false;
        if (other.getClientStatus() != null
                && other.getClientStatus().equals(this.getClientStatus()) == false)
            return false;
        if (other.getLog() == null ^ this.getLog() == null)
            return false;
        if (other.getLog() != null && other.getLog().equals(this.getLog()) == false)
            return false;
        if (other.getLatency() == null ^ this.getLatency() == null)
            return false;
        if (other.getLatency() != null && other.getLatency().equals(this.getLatency()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null
                && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getAuthorization() == null ^ this.getAuthorization() == null)
            return false;
        if (other.getAuthorization() != null
                && other.getAuthorization().equals(this.getAuthorization()) == false)
            return false;
        if (other.getClaims() == null ^ this.getClaims() == null)
            return false;
        if (other.getClaims() != null && other.getClaims().equals(this.getClaims()) == false)
            return false;
        return true;
    }
}
