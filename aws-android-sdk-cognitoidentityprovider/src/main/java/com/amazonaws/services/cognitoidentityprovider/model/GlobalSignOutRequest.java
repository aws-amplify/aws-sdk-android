/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Invalidates the identity, access, and refresh tokens that Amazon Cognito
 * issued to a user. Call this operation when your user signs out of your app.
 * This results in the following behavior.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Amazon Cognito no longer accepts <i>token-authorized</i> user operations that
 * you authorize with a signed-out user's access tokens. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
 * >Using the Amazon Cognito user pools API and user pool endpoints</a>.
 * </p>
 * <p>
 * Amazon Cognito returns an <code>Access Token has been revoked</code> error
 * when your app attempts to authorize a user pools API request with a revoked
 * access token that contains the scope
 * <code>aws.cognito.signin.user.admin</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Cognito no longer accepts a signed-out user's ID token in a <a href=
 * "https://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetId.html"
 * >GetId </a> request to an identity pool with
 * <code>ServerSideTokenCheck</code> enabled for its user pool IdP configuration
 * in <a href=
 * "https://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_CognitoIdentityProvider.html"
 * >CognitoIdentityProvider</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Cognito no longer accepts a signed-out user's refresh tokens in
 * refresh requests.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Other requests might be valid until your user's token expires.
 * </p>
 * <p>
 * Authorize this action with a signed-in user's access token. It must include
 * the scope <code>aws.cognito.signin.user.admin</code>.
 * </p>
 * <note>
 * <p>
 * Amazon Cognito doesn't evaluate Identity and Access Management (IAM) policies
 * in requests for this API operation. For this operation, you can't use IAM
 * credentials to authorize requests, and you can't grant IAM permissions in
 * policies. For more information about authorization models in Amazon Cognito,
 * see <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
 * >Using the Amazon Cognito user pools API and user pool endpoints</a>.
 * </p>
 * </note>
 */
public class GlobalSignOutRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A valid access token that Amazon Cognito issued to the user who you want
     * to sign out.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     */
    private String accessToken;

    /**
     * <p>
     * A valid access token that Amazon Cognito issued to the user who you want
     * to sign out.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @return <p>
     *         A valid access token that Amazon Cognito issued to the user who
     *         you want to sign out.
     *         </p>
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * <p>
     * A valid access token that Amazon Cognito issued to the user who you want
     * to sign out.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken <p>
     *            A valid access token that Amazon Cognito issued to the user
     *            who you want to sign out.
     *            </p>
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * A valid access token that Amazon Cognito issued to the user who you want
     * to sign out.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken <p>
     *            A valid access token that Amazon Cognito issued to the user
     *            who you want to sign out.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalSignOutRequest withAccessToken(String accessToken) {
        this.accessToken = accessToken;
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
            sb.append("AccessToken: " + getAccessToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalSignOutRequest == false)
            return false;
        GlobalSignOutRequest other = (GlobalSignOutRequest) obj;

        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null
                && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        return true;
    }
}
