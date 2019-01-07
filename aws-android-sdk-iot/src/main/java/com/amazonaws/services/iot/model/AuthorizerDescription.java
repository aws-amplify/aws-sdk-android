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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The authorizer description.
 * </p>
 */
public class AuthorizerDescription implements Serializable {
    /**
     * <p>
     * The authorizer name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     */
    private String authorizerName;

    /**
     * <p>
     * The authorizer ARN.
     * </p>
     */
    private String authorizerArn;

    /**
     * <p>
     * The authorizer's Lambda function ARN.
     * </p>
     */
    private String authorizerFunctionArn;

    /**
     * <p>
     * The key used to extract the token from the HTTP headers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String tokenKeyName;

    /**
     * <p>
     * The public keys used to validate the token signature returned by your
     * custom authentication service.
     * </p>
     */
    private java.util.Map<String, String> tokenSigningPublicKeys;

    /**
     * <p>
     * The status of the authorizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     */
    private String status;

    /**
     * <p>
     * The UNIX timestamp of when the authorizer was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The UNIX timestamp of when the authorizer was last updated.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The authorizer name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @return <p>
     *         The authorizer name.
     *         </p>
     */
    public String getAuthorizerName() {
        return authorizerName;
    }

    /**
     * <p>
     * The authorizer name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @param authorizerName <p>
     *            The authorizer name.
     *            </p>
     */
    public void setAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
    }

    /**
     * <p>
     * The authorizer name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @param authorizerName <p>
     *            The authorizer name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizerDescription withAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
        return this;
    }

    /**
     * <p>
     * The authorizer ARN.
     * </p>
     *
     * @return <p>
     *         The authorizer ARN.
     *         </p>
     */
    public String getAuthorizerArn() {
        return authorizerArn;
    }

    /**
     * <p>
     * The authorizer ARN.
     * </p>
     *
     * @param authorizerArn <p>
     *            The authorizer ARN.
     *            </p>
     */
    public void setAuthorizerArn(String authorizerArn) {
        this.authorizerArn = authorizerArn;
    }

    /**
     * <p>
     * The authorizer ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizerArn <p>
     *            The authorizer ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizerDescription withAuthorizerArn(String authorizerArn) {
        this.authorizerArn = authorizerArn;
        return this;
    }

    /**
     * <p>
     * The authorizer's Lambda function ARN.
     * </p>
     *
     * @return <p>
     *         The authorizer's Lambda function ARN.
     *         </p>
     */
    public String getAuthorizerFunctionArn() {
        return authorizerFunctionArn;
    }

    /**
     * <p>
     * The authorizer's Lambda function ARN.
     * </p>
     *
     * @param authorizerFunctionArn <p>
     *            The authorizer's Lambda function ARN.
     *            </p>
     */
    public void setAuthorizerFunctionArn(String authorizerFunctionArn) {
        this.authorizerFunctionArn = authorizerFunctionArn;
    }

    /**
     * <p>
     * The authorizer's Lambda function ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizerFunctionArn <p>
     *            The authorizer's Lambda function ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizerDescription withAuthorizerFunctionArn(String authorizerFunctionArn) {
        this.authorizerFunctionArn = authorizerFunctionArn;
        return this;
    }

    /**
     * <p>
     * The key used to extract the token from the HTTP headers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The key used to extract the token from the HTTP headers.
     *         </p>
     */
    public String getTokenKeyName() {
        return tokenKeyName;
    }

    /**
     * <p>
     * The key used to extract the token from the HTTP headers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param tokenKeyName <p>
     *            The key used to extract the token from the HTTP headers.
     *            </p>
     */
    public void setTokenKeyName(String tokenKeyName) {
        this.tokenKeyName = tokenKeyName;
    }

    /**
     * <p>
     * The key used to extract the token from the HTTP headers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param tokenKeyName <p>
     *            The key used to extract the token from the HTTP headers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizerDescription withTokenKeyName(String tokenKeyName) {
        this.tokenKeyName = tokenKeyName;
        return this;
    }

    /**
     * <p>
     * The public keys used to validate the token signature returned by your
     * custom authentication service.
     * </p>
     *
     * @return <p>
     *         The public keys used to validate the token signature returned by
     *         your custom authentication service.
     *         </p>
     */
    public java.util.Map<String, String> getTokenSigningPublicKeys() {
        return tokenSigningPublicKeys;
    }

    /**
     * <p>
     * The public keys used to validate the token signature returned by your
     * custom authentication service.
     * </p>
     *
     * @param tokenSigningPublicKeys <p>
     *            The public keys used to validate the token signature returned
     *            by your custom authentication service.
     *            </p>
     */
    public void setTokenSigningPublicKeys(java.util.Map<String, String> tokenSigningPublicKeys) {
        this.tokenSigningPublicKeys = tokenSigningPublicKeys;
    }

    /**
     * <p>
     * The public keys used to validate the token signature returned by your
     * custom authentication service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tokenSigningPublicKeys <p>
     *            The public keys used to validate the token signature returned
     *            by your custom authentication service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizerDescription withTokenSigningPublicKeys(
            java.util.Map<String, String> tokenSigningPublicKeys) {
        this.tokenSigningPublicKeys = tokenSigningPublicKeys;
        return this;
    }

    /**
     * <p>
     * The public keys used to validate the token signature returned by your
     * custom authentication service.
     * </p>
     * <p>
     * The method adds a new key-value pair into tokenSigningPublicKeys
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into tokenSigningPublicKeys.
     * @param value The corresponding value of the entry to be added into
     *            tokenSigningPublicKeys.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizerDescription addtokenSigningPublicKeysEntry(String key, String value) {
        if (null == this.tokenSigningPublicKeys) {
            this.tokenSigningPublicKeys = new java.util.HashMap<String, String>();
        }
        if (this.tokenSigningPublicKeys.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tokenSigningPublicKeys.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tokenSigningPublicKeys.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public AuthorizerDescription cleartokenSigningPublicKeysEntries() {
        this.tokenSigningPublicKeys = null;
        return this;
    }

    /**
     * <p>
     * The status of the authorizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @return <p>
     *         The status of the authorizer.
     *         </p>
     * @see AuthorizerStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the authorizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the authorizer.
     *            </p>
     * @see AuthorizerStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the authorizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the authorizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthorizerStatus
     */
    public AuthorizerDescription withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the authorizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the authorizer.
     *            </p>
     * @see AuthorizerStatus
     */
    public void setStatus(AuthorizerStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the authorizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the authorizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthorizerStatus
     */
    public AuthorizerDescription withStatus(AuthorizerStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The UNIX timestamp of when the authorizer was created.
     * </p>
     *
     * @return <p>
     *         The UNIX timestamp of when the authorizer was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the authorizer was created.
     * </p>
     *
     * @param creationDate <p>
     *            The UNIX timestamp of when the authorizer was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the authorizer was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The UNIX timestamp of when the authorizer was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizerDescription withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The UNIX timestamp of when the authorizer was last updated.
     * </p>
     *
     * @return <p>
     *         The UNIX timestamp of when the authorizer was last updated.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the authorizer was last updated.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The UNIX timestamp of when the authorizer was last updated.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The UNIX timestamp of when the authorizer was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The UNIX timestamp of when the authorizer was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizerDescription withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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
        if (getAuthorizerName() != null)
            sb.append("authorizerName: " + getAuthorizerName() + ",");
        if (getAuthorizerArn() != null)
            sb.append("authorizerArn: " + getAuthorizerArn() + ",");
        if (getAuthorizerFunctionArn() != null)
            sb.append("authorizerFunctionArn: " + getAuthorizerFunctionArn() + ",");
        if (getTokenKeyName() != null)
            sb.append("tokenKeyName: " + getTokenKeyName() + ",");
        if (getTokenSigningPublicKeys() != null)
            sb.append("tokenSigningPublicKeys: " + getTokenSigningPublicKeys() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null)
            sb.append("lastModifiedDate: " + getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAuthorizerName() == null) ? 0 : getAuthorizerName().hashCode());
        hashCode = prime * hashCode
                + ((getAuthorizerArn() == null) ? 0 : getAuthorizerArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthorizerFunctionArn() == null) ? 0 : getAuthorizerFunctionArn().hashCode());
        hashCode = prime * hashCode
                + ((getTokenKeyName() == null) ? 0 : getTokenKeyName().hashCode());
        hashCode = prime
                * hashCode
                + ((getTokenSigningPublicKeys() == null) ? 0 : getTokenSigningPublicKeys()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizerDescription == false)
            return false;
        AuthorizerDescription other = (AuthorizerDescription) obj;

        if (other.getAuthorizerName() == null ^ this.getAuthorizerName() == null)
            return false;
        if (other.getAuthorizerName() != null
                && other.getAuthorizerName().equals(this.getAuthorizerName()) == false)
            return false;
        if (other.getAuthorizerArn() == null ^ this.getAuthorizerArn() == null)
            return false;
        if (other.getAuthorizerArn() != null
                && other.getAuthorizerArn().equals(this.getAuthorizerArn()) == false)
            return false;
        if (other.getAuthorizerFunctionArn() == null ^ this.getAuthorizerFunctionArn() == null)
            return false;
        if (other.getAuthorizerFunctionArn() != null
                && other.getAuthorizerFunctionArn().equals(this.getAuthorizerFunctionArn()) == false)
            return false;
        if (other.getTokenKeyName() == null ^ this.getTokenKeyName() == null)
            return false;
        if (other.getTokenKeyName() != null
                && other.getTokenKeyName().equals(this.getTokenKeyName()) == false)
            return false;
        if (other.getTokenSigningPublicKeys() == null ^ this.getTokenSigningPublicKeys() == null)
            return false;
        if (other.getTokenSigningPublicKeys() != null
                && other.getTokenSigningPublicKeys().equals(this.getTokenSigningPublicKeys()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }
}
