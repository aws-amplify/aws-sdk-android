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

package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/**
 * <p>
 * Credentials for the provided identity ID.
 * </p>
 */
public class Credentials implements Serializable {
    /**
     * <p>
     * The Access Key portion of the credentials.
     * </p>
     */
    private String accessKeyId;

    /**
     * <p>
     * The Secret Access Key portion of the credentials
     * </p>
     */
    private String secretKey;

    /**
     * <p>
     * The Session Token portion of the credentials
     * </p>
     */
    private String sessionToken;

    /**
     * <p>
     * The date at which these credentials will expire.
     * </p>
     */
    private java.util.Date expiration;

    /**
     * <p>
     * The Access Key portion of the credentials.
     * </p>
     *
     * @return <p>
     *         The Access Key portion of the credentials.
     *         </p>
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * <p>
     * The Access Key portion of the credentials.
     * </p>
     *
     * @param accessKeyId <p>
     *            The Access Key portion of the credentials.
     *            </p>
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The Access Key portion of the credentials.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessKeyId <p>
     *            The Access Key portion of the credentials.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Credentials withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * <p>
     * The Secret Access Key portion of the credentials
     * </p>
     *
     * @return <p>
     *         The Secret Access Key portion of the credentials
     *         </p>
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * <p>
     * The Secret Access Key portion of the credentials
     * </p>
     *
     * @param secretKey <p>
     *            The Secret Access Key portion of the credentials
     *            </p>
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * <p>
     * The Secret Access Key portion of the credentials
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secretKey <p>
     *            The Secret Access Key portion of the credentials
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Credentials withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * <p>
     * The Session Token portion of the credentials
     * </p>
     *
     * @return <p>
     *         The Session Token portion of the credentials
     *         </p>
     */
    public String getSessionToken() {
        return sessionToken;
    }

    /**
     * <p>
     * The Session Token portion of the credentials
     * </p>
     *
     * @param sessionToken <p>
     *            The Session Token portion of the credentials
     *            </p>
     */
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * <p>
     * The Session Token portion of the credentials
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionToken <p>
     *            The Session Token portion of the credentials
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Credentials withSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
        return this;
    }

    /**
     * <p>
     * The date at which these credentials will expire.
     * </p>
     *
     * @return <p>
     *         The date at which these credentials will expire.
     *         </p>
     */
    public java.util.Date getExpiration() {
        return expiration;
    }

    /**
     * <p>
     * The date at which these credentials will expire.
     * </p>
     *
     * @param expiration <p>
     *            The date at which these credentials will expire.
     *            </p>
     */
    public void setExpiration(java.util.Date expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * The date at which these credentials will expire.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiration <p>
     *            The date at which these credentials will expire.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Credentials withExpiration(java.util.Date expiration) {
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
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: " + getAccessKeyId() + ",");
        if (getSecretKey() != null)
            sb.append("SecretKey: " + getSecretKey() + ",");
        if (getSessionToken() != null)
            sb.append("SessionToken: " + getSessionToken() + ",");
        if (getExpiration() != null)
            sb.append("Expiration: " + getExpiration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getSecretKey() == null) ? 0 : getSecretKey().hashCode());
        hashCode = prime * hashCode
                + ((getSessionToken() == null) ? 0 : getSessionToken().hashCode());
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
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

        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null
                && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        if (other.getSecretKey() == null ^ this.getSecretKey() == null)
            return false;
        if (other.getSecretKey() != null
                && other.getSecretKey().equals(this.getSecretKey()) == false)
            return false;
        if (other.getSessionToken() == null ^ this.getSessionToken() == null)
            return false;
        if (other.getSessionToken() != null
                && other.getSessionToken().equals(this.getSessionToken()) == false)
            return false;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null
                && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        return true;
    }
}
