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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

public class AssociateSoftwareTokenResult implements Serializable {
    /**
     * <p>
     * A unique generated shared secret code that is used in the TOTP algorithm
     * to generate a one time code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - <br/>
     * <b>Pattern: </b>[A-Za-z0-9]+<br/>
     */
    private String secretCode;

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls
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
     * A unique generated shared secret code that is used in the TOTP algorithm
     * to generate a one time code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - <br/>
     * <b>Pattern: </b>[A-Za-z0-9]+<br/>
     *
     * @return <p>
     *         A unique generated shared secret code that is used in the TOTP
     *         algorithm to generate a one time code.
     *         </p>
     */
    public String getSecretCode() {
        return secretCode;
    }

    /**
     * <p>
     * A unique generated shared secret code that is used in the TOTP algorithm
     * to generate a one time code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - <br/>
     * <b>Pattern: </b>[A-Za-z0-9]+<br/>
     *
     * @param secretCode <p>
     *            A unique generated shared secret code that is used in the TOTP
     *            algorithm to generate a one time code.
     *            </p>
     */
    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    /**
     * <p>
     * A unique generated shared secret code that is used in the TOTP algorithm
     * to generate a one time code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - <br/>
     * <b>Pattern: </b>[A-Za-z0-9]+<br/>
     *
     * @param secretCode <p>
     *            A unique generated shared secret code that is used in the TOTP
     *            algorithm to generate a one time code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateSoftwareTokenResult withSecretCode(String secretCode) {
        this.secretCode = secretCode;
        return this;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls
     * to the service. This allows authentication of the user as part of the MFA
     * setup process.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The session which should be passed both ways in
     *         challenge-response calls to the service. This allows
     *         authentication of the user as part of the MFA setup process.
     *         </p>
     */
    public String getSession() {
        return session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls
     * to the service. This allows authentication of the user as part of the MFA
     * setup process.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param session <p>
     *            The session which should be passed both ways in
     *            challenge-response calls to the service. This allows
     *            authentication of the user as part of the MFA setup process.
     *            </p>
     */
    public void setSession(String session) {
        this.session = session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls
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
     *            The session which should be passed both ways in
     *            challenge-response calls to the service. This allows
     *            authentication of the user as part of the MFA setup process.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateSoftwareTokenResult withSession(String session) {
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
        if (getSecretCode() != null)
            sb.append("SecretCode: " + getSecretCode() + ",");
        if (getSession() != null)
            sb.append("Session: " + getSession());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretCode() == null) ? 0 : getSecretCode().hashCode());
        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateSoftwareTokenResult == false)
            return false;
        AssociateSoftwareTokenResult other = (AssociateSoftwareTokenResult) obj;

        if (other.getSecretCode() == null ^ this.getSecretCode() == null)
            return false;
        if (other.getSecretCode() != null
                && other.getSecretCode().equals(this.getSecretCode()) == false)
            return false;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        return true;
    }
}
