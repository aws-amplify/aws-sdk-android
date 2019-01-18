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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates an authorizer.
 * </p>
 */
public class UpdateAuthorizerRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The ARN of the authorizer's Lambda function.
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
     * The public keys used to verify the token signature.
     * </p>
     */
    private java.util.Map<String, String> tokenSigningPublicKeys;

    /**
     * <p>
     * The status of the update authorizer request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     */
    private String status;

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
    public UpdateAuthorizerRequest withAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
        return this;
    }

    /**
     * <p>
     * The ARN of the authorizer's Lambda function.
     * </p>
     *
     * @return <p>
     *         The ARN of the authorizer's Lambda function.
     *         </p>
     */
    public String getAuthorizerFunctionArn() {
        return authorizerFunctionArn;
    }

    /**
     * <p>
     * The ARN of the authorizer's Lambda function.
     * </p>
     *
     * @param authorizerFunctionArn <p>
     *            The ARN of the authorizer's Lambda function.
     *            </p>
     */
    public void setAuthorizerFunctionArn(String authorizerFunctionArn) {
        this.authorizerFunctionArn = authorizerFunctionArn;
    }

    /**
     * <p>
     * The ARN of the authorizer's Lambda function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizerFunctionArn <p>
     *            The ARN of the authorizer's Lambda function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuthorizerRequest withAuthorizerFunctionArn(String authorizerFunctionArn) {
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
    public UpdateAuthorizerRequest withTokenKeyName(String tokenKeyName) {
        this.tokenKeyName = tokenKeyName;
        return this;
    }

    /**
     * <p>
     * The public keys used to verify the token signature.
     * </p>
     *
     * @return <p>
     *         The public keys used to verify the token signature.
     *         </p>
     */
    public java.util.Map<String, String> getTokenSigningPublicKeys() {
        return tokenSigningPublicKeys;
    }

    /**
     * <p>
     * The public keys used to verify the token signature.
     * </p>
     *
     * @param tokenSigningPublicKeys <p>
     *            The public keys used to verify the token signature.
     *            </p>
     */
    public void setTokenSigningPublicKeys(java.util.Map<String, String> tokenSigningPublicKeys) {
        this.tokenSigningPublicKeys = tokenSigningPublicKeys;
    }

    /**
     * <p>
     * The public keys used to verify the token signature.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tokenSigningPublicKeys <p>
     *            The public keys used to verify the token signature.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuthorizerRequest withTokenSigningPublicKeys(
            java.util.Map<String, String> tokenSigningPublicKeys) {
        this.tokenSigningPublicKeys = tokenSigningPublicKeys;
        return this;
    }

    /**
     * <p>
     * The public keys used to verify the token signature.
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
    public UpdateAuthorizerRequest addtokenSigningPublicKeysEntry(String key, String value) {
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
    public UpdateAuthorizerRequest cleartokenSigningPublicKeysEntries() {
        this.tokenSigningPublicKeys = null;
        return this;
    }

    /**
     * <p>
     * The status of the update authorizer request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @return <p>
     *         The status of the update authorizer request.
     *         </p>
     * @see AuthorizerStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the update authorizer request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the update authorizer request.
     *            </p>
     * @see AuthorizerStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the update authorizer request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the update authorizer request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthorizerStatus
     */
    public UpdateAuthorizerRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the update authorizer request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the update authorizer request.
     *            </p>
     * @see AuthorizerStatus
     */
    public void setStatus(AuthorizerStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the update authorizer request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the update authorizer request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthorizerStatus
     */
    public UpdateAuthorizerRequest withStatus(AuthorizerStatus status) {
        this.status = status.toString();
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
        if (getAuthorizerFunctionArn() != null)
            sb.append("authorizerFunctionArn: " + getAuthorizerFunctionArn() + ",");
        if (getTokenKeyName() != null)
            sb.append("tokenKeyName: " + getTokenKeyName() + ",");
        if (getTokenSigningPublicKeys() != null)
            sb.append("tokenSigningPublicKeys: " + getTokenSigningPublicKeys() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAuthorizerName() == null) ? 0 : getAuthorizerName().hashCode());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAuthorizerRequest == false)
            return false;
        UpdateAuthorizerRequest other = (UpdateAuthorizerRequest) obj;

        if (other.getAuthorizerName() == null ^ this.getAuthorizerName() == null)
            return false;
        if (other.getAuthorizerName() != null
                && other.getAuthorizerName().equals(this.getAuthorizerName()) == false)
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
        return true;
    }
}
