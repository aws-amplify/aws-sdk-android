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

package com.amazonaws.services.api.ecr.model;

import java.io.Serializable;

/**
 * <p>
 * An object representing authorization data for an Amazon ECR registry.
 * </p>
 */
public class AuthorizationData implements Serializable {
    /**
     * <p>
     * A base64-encoded string that contains authorization data for the
     * specified Amazon ECR registry. When the string is decoded, it is
     * presented in the format <code>user:password</code> for private registry
     * authentication using <code>docker login</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\S+$<br/>
     */
    private String authorizationToken;

    /**
     * <p>
     * The Unix time in seconds and milliseconds when the authorization token
     * expires. Authorization tokens are valid for 12 hours.
     * </p>
     */
    private java.util.Date expiresAt;

    /**
     * <p>
     * The registry URL to use for this authorization token in a
     * <code>docker login</code> command. The Amazon ECR registry URL format is
     * <code>https://aws_account_id.dkr.ecr.region.amazonaws.com</code>. For
     * example,
     * <code>https://012345678910.dkr.ecr.us-east-1.amazonaws.com</code>..
     * </p>
     */
    private String proxyEndpoint;

    /**
     * <p>
     * A base64-encoded string that contains authorization data for the
     * specified Amazon ECR registry. When the string is decoded, it is
     * presented in the format <code>user:password</code> for private registry
     * authentication using <code>docker login</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @return <p>
     *         A base64-encoded string that contains authorization data for the
     *         specified Amazon ECR registry. When the string is decoded, it is
     *         presented in the format <code>user:password</code> for private
     *         registry authentication using <code>docker login</code>.
     *         </p>
     */
    public String getAuthorizationToken() {
        return authorizationToken;
    }

    /**
     * <p>
     * A base64-encoded string that contains authorization data for the
     * specified Amazon ECR registry. When the string is decoded, it is
     * presented in the format <code>user:password</code> for private registry
     * authentication using <code>docker login</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @param authorizationToken <p>
     *            A base64-encoded string that contains authorization data for
     *            the specified Amazon ECR registry. When the string is decoded,
     *            it is presented in the format <code>user:password</code> for
     *            private registry authentication using
     *            <code>docker login</code>.
     *            </p>
     */
    public void setAuthorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
    }

    /**
     * <p>
     * A base64-encoded string that contains authorization data for the
     * specified Amazon ECR registry. When the string is decoded, it is
     * presented in the format <code>user:password</code> for private registry
     * authentication using <code>docker login</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @param authorizationToken <p>
     *            A base64-encoded string that contains authorization data for
     *            the specified Amazon ECR registry. When the string is decoded,
     *            it is presented in the format <code>user:password</code> for
     *            private registry authentication using
     *            <code>docker login</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizationData withAuthorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
        return this;
    }

    /**
     * <p>
     * The Unix time in seconds and milliseconds when the authorization token
     * expires. Authorization tokens are valid for 12 hours.
     * </p>
     *
     * @return <p>
     *         The Unix time in seconds and milliseconds when the authorization
     *         token expires. Authorization tokens are valid for 12 hours.
     *         </p>
     */
    public java.util.Date getExpiresAt() {
        return expiresAt;
    }

    /**
     * <p>
     * The Unix time in seconds and milliseconds when the authorization token
     * expires. Authorization tokens are valid for 12 hours.
     * </p>
     *
     * @param expiresAt <p>
     *            The Unix time in seconds and milliseconds when the
     *            authorization token expires. Authorization tokens are valid
     *            for 12 hours.
     *            </p>
     */
    public void setExpiresAt(java.util.Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * <p>
     * The Unix time in seconds and milliseconds when the authorization token
     * expires. Authorization tokens are valid for 12 hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiresAt <p>
     *            The Unix time in seconds and milliseconds when the
     *            authorization token expires. Authorization tokens are valid
     *            for 12 hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizationData withExpiresAt(java.util.Date expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * <p>
     * The registry URL to use for this authorization token in a
     * <code>docker login</code> command. The Amazon ECR registry URL format is
     * <code>https://aws_account_id.dkr.ecr.region.amazonaws.com</code>. For
     * example,
     * <code>https://012345678910.dkr.ecr.us-east-1.amazonaws.com</code>..
     * </p>
     *
     * @return <p>
     *         The registry URL to use for this authorization token in a
     *         <code>docker login</code> command. The Amazon ECR registry URL
     *         format is
     *         <code>https://aws_account_id.dkr.ecr.region.amazonaws.com</code>.
     *         For example,
     *         <code>https://012345678910.dkr.ecr.us-east-1.amazonaws.com</code>
     *         ..
     *         </p>
     */
    public String getProxyEndpoint() {
        return proxyEndpoint;
    }

    /**
     * <p>
     * The registry URL to use for this authorization token in a
     * <code>docker login</code> command. The Amazon ECR registry URL format is
     * <code>https://aws_account_id.dkr.ecr.region.amazonaws.com</code>. For
     * example,
     * <code>https://012345678910.dkr.ecr.us-east-1.amazonaws.com</code>..
     * </p>
     *
     * @param proxyEndpoint <p>
     *            The registry URL to use for this authorization token in a
     *            <code>docker login</code> command. The Amazon ECR registry URL
     *            format is
     *            <code>https://aws_account_id.dkr.ecr.region.amazonaws.com</code>
     *            . For example,
     *            <code>https://012345678910.dkr.ecr.us-east-1.amazonaws.com</code>
     *            ..
     *            </p>
     */
    public void setProxyEndpoint(String proxyEndpoint) {
        this.proxyEndpoint = proxyEndpoint;
    }

    /**
     * <p>
     * The registry URL to use for this authorization token in a
     * <code>docker login</code> command. The Amazon ECR registry URL format is
     * <code>https://aws_account_id.dkr.ecr.region.amazonaws.com</code>. For
     * example,
     * <code>https://012345678910.dkr.ecr.us-east-1.amazonaws.com</code>..
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param proxyEndpoint <p>
     *            The registry URL to use for this authorization token in a
     *            <code>docker login</code> command. The Amazon ECR registry URL
     *            format is
     *            <code>https://aws_account_id.dkr.ecr.region.amazonaws.com</code>
     *            . For example,
     *            <code>https://012345678910.dkr.ecr.us-east-1.amazonaws.com</code>
     *            ..
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizationData withProxyEndpoint(String proxyEndpoint) {
        this.proxyEndpoint = proxyEndpoint;
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
        if (getExpiresAt() != null)
            sb.append("expiresAt: " + getExpiresAt() + ",");
        if (getProxyEndpoint() != null)
            sb.append("proxyEndpoint: " + getProxyEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAuthorizationToken() == null) ? 0 : getAuthorizationToken().hashCode());
        hashCode = prime * hashCode + ((getExpiresAt() == null) ? 0 : getExpiresAt().hashCode());
        hashCode = prime * hashCode
                + ((getProxyEndpoint() == null) ? 0 : getProxyEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizationData == false)
            return false;
        AuthorizationData other = (AuthorizationData) obj;

        if (other.getAuthorizationToken() == null ^ this.getAuthorizationToken() == null)
            return false;
        if (other.getAuthorizationToken() != null
                && other.getAuthorizationToken().equals(this.getAuthorizationToken()) == false)
            return false;
        if (other.getExpiresAt() == null ^ this.getExpiresAt() == null)
            return false;
        if (other.getExpiresAt() != null
                && other.getExpiresAt().equals(this.getExpiresAt()) == false)
            return false;
        if (other.getProxyEndpoint() == null ^ this.getProxyEndpoint() == null)
            return false;
        if (other.getProxyEndpoint() != null
                && other.getProxyEndpoint().equals(this.getProxyEndpoint()) == false)
            return false;
        return true;
    }
}
