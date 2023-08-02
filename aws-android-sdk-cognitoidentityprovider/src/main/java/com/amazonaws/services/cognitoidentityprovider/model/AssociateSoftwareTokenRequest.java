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
 * Begins setup of time-based one-time password (TOTP) multi-factor
 * authentication (MFA) for a user, with a unique private key that Amazon
 * Cognito generates and returns in the API response. You can authorize an
 * <code>AssociateSoftwareToken</code> request with either the user's access
 * token, or a session string from a challenge response that you received from
 * Amazon Cognito.
 * </p>
 * <note>
 * <p>
 * Amazon Cognito disassociates an existing software token when you verify the
 * new token in a <a href=
 * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifySoftwareToken.html"
 * > VerifySoftwareToken</a> API request. If you don't verify the software token
 * and your user pool doesn't require MFA, the user can then authenticate with
 * user name and password credentials alone. If your user pool requires TOTP
 * MFA, Amazon Cognito generates an <code>MFA_SETUP</code> or
 * <code>SOFTWARE_TOKEN_SETUP</code> challenge each time your user signs.
 * Complete setup with <code>AssociateSoftwareToken</code> and
 * <code>VerifySoftwareToken</code>.
 * </p>
 * <p>
 * After you set up software token MFA for your user, Amazon Cognito generates a
 * <code>SOFTWARE_TOKEN_MFA</code> challenge when they authenticate. Respond to
 * this challenge with your user's TOTP.
 * </p>
 * </note> <note>
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
public class AssociateSoftwareTokenRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A valid access token that Amazon Cognito issued to the user whose
     * software token you want to generate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     */
    private String accessToken;

    /**
     * <p>
     * The session that should be passed both ways in challenge-response calls
     * to the service. This allows authentication of the user as part of the MFA
     * setup process.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String session;

    /**
     * <p>
     * A valid access token that Amazon Cognito issued to the user whose
     * software token you want to generate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @return <p>
     *         A valid access token that Amazon Cognito issued to the user whose
     *         software token you want to generate.
     *         </p>
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * <p>
     * A valid access token that Amazon Cognito issued to the user whose
     * software token you want to generate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken <p>
     *            A valid access token that Amazon Cognito issued to the user
     *            whose software token you want to generate.
     *            </p>
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * A valid access token that Amazon Cognito issued to the user whose
     * software token you want to generate.
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
     *            whose software token you want to generate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateSoftwareTokenRequest withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * <p>
     * The session that should be passed both ways in challenge-response calls
     * to the service. This allows authentication of the user as part of the MFA
     * setup process.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The session that should be passed both ways in challenge-response
     *         calls to the service. This allows authentication of the user as
     *         part of the MFA setup process.
     *         </p>
     */
    public String getSession() {
        return session;
    }

    /**
     * <p>
     * The session that should be passed both ways in challenge-response calls
     * to the service. This allows authentication of the user as part of the MFA
     * setup process.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param session <p>
     *            The session that should be passed both ways in
     *            challenge-response calls to the service. This allows
     *            authentication of the user as part of the MFA setup process.
     *            </p>
     */
    public void setSession(String session) {
        this.session = session;
    }

    /**
     * <p>
     * The session that should be passed both ways in challenge-response calls
     * to the service. This allows authentication of the user as part of the MFA
     * setup process.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param session <p>
     *            The session that should be passed both ways in
     *            challenge-response calls to the service. This allows
     *            authentication of the user as part of the MFA setup process.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateSoftwareTokenRequest withSession(String session) {
        this.session = session;
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
            sb.append("AccessToken: " + getAccessToken() + ",");
        if (getSession() != null)
            sb.append("Session: " + getSession());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateSoftwareTokenRequest == false)
            return false;
        AssociateSoftwareTokenRequest other = (AssociateSoftwareTokenRequest) obj;

        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null
                && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        return true;
    }
}
