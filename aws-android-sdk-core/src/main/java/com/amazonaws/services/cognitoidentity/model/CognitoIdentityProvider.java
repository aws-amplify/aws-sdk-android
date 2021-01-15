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

package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/**
 * <p>
 * A provider representing an Amazon Cognito user pool and its client ID.
 * </p>
 */
public class CognitoIdentityProvider implements Serializable {
    /**
     * <p>
     * The provider name for an Amazon Cognito user pool. For example,
     * <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._:/-]+<br/>
     */
    private String providerName;

    /**
     * <p>
     * The client ID for the Amazon Cognito user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w_]+<br/>
     */
    private String clientId;

    /**
     * <p>
     * TRUE if server-side token validation is enabled for the identity
     * provider’s token.
     * </p>
     * <p>
     * Once you set <code>ServerSideTokenCheck</code> to TRUE for an identity
     * pool, that identity pool will check with the integrated user pools to
     * make sure that the user has not been globally signed out or deleted
     * before the identity pool provides an OIDC token or AWS credentials for
     * the user.
     * </p>
     * <p>
     * If the user is signed out or deleted, the identity pool will return a 400
     * Not Authorized error.
     * </p>
     */
    private Boolean serverSideTokenCheck;

    /**
     * <p>
     * The provider name for an Amazon Cognito user pool. For example,
     * <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._:/-]+<br/>
     *
     * @return <p>
     *         The provider name for an Amazon Cognito user pool. For example,
     *         <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>
     *         .
     *         </p>
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * <p>
     * The provider name for an Amazon Cognito user pool. For example,
     * <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._:/-]+<br/>
     *
     * @param providerName <p>
     *            The provider name for an Amazon Cognito user pool. For
     *            example,
     *            <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>
     *            .
     *            </p>
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The provider name for an Amazon Cognito user pool. For example,
     * <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._:/-]+<br/>
     *
     * @param providerName <p>
     *            The provider name for an Amazon Cognito user pool. For
     *            example,
     *            <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CognitoIdentityProvider withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * <p>
     * The client ID for the Amazon Cognito user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w_]+<br/>
     *
     * @return <p>
     *         The client ID for the Amazon Cognito user pool.
     *         </p>
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * <p>
     * The client ID for the Amazon Cognito user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w_]+<br/>
     *
     * @param clientId <p>
     *            The client ID for the Amazon Cognito user pool.
     *            </p>
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The client ID for the Amazon Cognito user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w_]+<br/>
     *
     * @param clientId <p>
     *            The client ID for the Amazon Cognito user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CognitoIdentityProvider withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * <p>
     * TRUE if server-side token validation is enabled for the identity
     * provider’s token.
     * </p>
     * <p>
     * Once you set <code>ServerSideTokenCheck</code> to TRUE for an identity
     * pool, that identity pool will check with the integrated user pools to
     * make sure that the user has not been globally signed out or deleted
     * before the identity pool provides an OIDC token or AWS credentials for
     * the user.
     * </p>
     * <p>
     * If the user is signed out or deleted, the identity pool will return a 400
     * Not Authorized error.
     * </p>
     *
     * @return <p>
     *         TRUE if server-side token validation is enabled for the identity
     *         provider’s token.
     *         </p>
     *         <p>
     *         Once you set <code>ServerSideTokenCheck</code> to TRUE for an
     *         identity pool, that identity pool will check with the integrated
     *         user pools to make sure that the user has not been globally
     *         signed out or deleted before the identity pool provides an OIDC
     *         token or AWS credentials for the user.
     *         </p>
     *         <p>
     *         If the user is signed out or deleted, the identity pool will
     *         return a 400 Not Authorized error.
     *         </p>
     */
    public Boolean isServerSideTokenCheck() {
        return serverSideTokenCheck;
    }

    /**
     * <p>
     * TRUE if server-side token validation is enabled for the identity
     * provider’s token.
     * </p>
     * <p>
     * Once you set <code>ServerSideTokenCheck</code> to TRUE for an identity
     * pool, that identity pool will check with the integrated user pools to
     * make sure that the user has not been globally signed out or deleted
     * before the identity pool provides an OIDC token or AWS credentials for
     * the user.
     * </p>
     * <p>
     * If the user is signed out or deleted, the identity pool will return a 400
     * Not Authorized error.
     * </p>
     *
     * @return <p>
     *         TRUE if server-side token validation is enabled for the identity
     *         provider’s token.
     *         </p>
     *         <p>
     *         Once you set <code>ServerSideTokenCheck</code> to TRUE for an
     *         identity pool, that identity pool will check with the integrated
     *         user pools to make sure that the user has not been globally
     *         signed out or deleted before the identity pool provides an OIDC
     *         token or AWS credentials for the user.
     *         </p>
     *         <p>
     *         If the user is signed out or deleted, the identity pool will
     *         return a 400 Not Authorized error.
     *         </p>
     */
    public Boolean getServerSideTokenCheck() {
        return serverSideTokenCheck;
    }

    /**
     * <p>
     * TRUE if server-side token validation is enabled for the identity
     * provider’s token.
     * </p>
     * <p>
     * Once you set <code>ServerSideTokenCheck</code> to TRUE for an identity
     * pool, that identity pool will check with the integrated user pools to
     * make sure that the user has not been globally signed out or deleted
     * before the identity pool provides an OIDC token or AWS credentials for
     * the user.
     * </p>
     * <p>
     * If the user is signed out or deleted, the identity pool will return a 400
     * Not Authorized error.
     * </p>
     *
     * @param serverSideTokenCheck <p>
     *            TRUE if server-side token validation is enabled for the
     *            identity provider’s token.
     *            </p>
     *            <p>
     *            Once you set <code>ServerSideTokenCheck</code> to TRUE for an
     *            identity pool, that identity pool will check with the
     *            integrated user pools to make sure that the user has not been
     *            globally signed out or deleted before the identity pool
     *            provides an OIDC token or AWS credentials for the user.
     *            </p>
     *            <p>
     *            If the user is signed out or deleted, the identity pool will
     *            return a 400 Not Authorized error.
     *            </p>
     */
    public void setServerSideTokenCheck(Boolean serverSideTokenCheck) {
        this.serverSideTokenCheck = serverSideTokenCheck;
    }

    /**
     * <p>
     * TRUE if server-side token validation is enabled for the identity
     * provider’s token.
     * </p>
     * <p>
     * Once you set <code>ServerSideTokenCheck</code> to TRUE for an identity
     * pool, that identity pool will check with the integrated user pools to
     * make sure that the user has not been globally signed out or deleted
     * before the identity pool provides an OIDC token or AWS credentials for
     * the user.
     * </p>
     * <p>
     * If the user is signed out or deleted, the identity pool will return a 400
     * Not Authorized error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverSideTokenCheck <p>
     *            TRUE if server-side token validation is enabled for the
     *            identity provider’s token.
     *            </p>
     *            <p>
     *            Once you set <code>ServerSideTokenCheck</code> to TRUE for an
     *            identity pool, that identity pool will check with the
     *            integrated user pools to make sure that the user has not been
     *            globally signed out or deleted before the identity pool
     *            provides an OIDC token or AWS credentials for the user.
     *            </p>
     *            <p>
     *            If the user is signed out or deleted, the identity pool will
     *            return a 400 Not Authorized error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CognitoIdentityProvider withServerSideTokenCheck(Boolean serverSideTokenCheck) {
        this.serverSideTokenCheck = serverSideTokenCheck;
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
        if (getProviderName() != null)
            sb.append("ProviderName: " + getProviderName() + ",");
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId() + ",");
        if (getServerSideTokenCheck() != null)
            sb.append("ServerSideTokenCheck: " + getServerSideTokenCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode
                + ((getServerSideTokenCheck() == null) ? 0 : getServerSideTokenCheck().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CognitoIdentityProvider == false)
            return false;
        CognitoIdentityProvider other = (CognitoIdentityProvider) obj;

        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null
                && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getServerSideTokenCheck() == null ^ this.getServerSideTokenCheck() == null)
            return false;
        if (other.getServerSideTokenCheck() != null
                && other.getServerSideTokenCheck().equals(this.getServerSideTokenCheck()) == false)
            return false;
        return true;
    }
}
