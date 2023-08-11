/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Signs out a user from all devices. <code>GlobalSignOut</code> invalidates all
 * identity, access and refresh tokens that Amazon Cognito has issued to a user.
 * A user can still use a hosted UI cookie to retrieve new tokens for the
 * duration of the 1-hour cookie validity period.
 * </p>
 * <p>
 * Your app isn't aware that a user's access token is revoked unless it attempts
 * to authorize a user pools API request with an access token that contains the
 * scope <code>aws.cognito.signin.user.admin</code>. Your app might otherwise
 * accept access tokens until they expire.
 * </p>
 * <note>
 * <p>
 * Amazon Cognito doesn't evaluate Identity and Access Management (IAM) policies
 * in requests for this API operation. For this operation, you can't use IAM
 * credentials to authorize requests, and you can't grant IAM permissions in
 * policies. For more information about authorization models in Amazon Cognito,
 * see <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
 * >Using the Amazon Cognito native and OIDC APIs</a>.
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
