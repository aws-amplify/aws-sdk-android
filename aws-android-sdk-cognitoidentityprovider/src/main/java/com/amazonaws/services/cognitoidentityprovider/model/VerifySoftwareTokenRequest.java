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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Use this API to register a user's entered TOTP code and mark the user's
 * software token MFA status as "verified" if successful. The request takes an
 * access token or a session string, but not both.
 * </p>
 */
public class VerifySoftwareTokenRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The access token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     */
    private String accessToken;

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls
     * to the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String session;

    /**
     * <p>
     * The one time password computed using the secret code returned by
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     */
    private String userCode;

    /**
     * <p>
     * The friendly device name.
     * </p>
     */
    private String friendlyDeviceName;

    /**
     * <p>
     * The access token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @return <p>
     *         The access token.
     *         </p>
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * <p>
     * The access token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken <p>
     *            The access token.
     *            </p>
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The access token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken <p>
     *            The access token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifySoftwareTokenRequest withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls
     * to the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The session which should be passed both ways in
     *         challenge-response calls to the service.
     *         </p>
     */
    public String getSession() {
        return session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls
     * to the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param session <p>
     *            The session which should be passed both ways in
     *            challenge-response calls to the service.
     *            </p>
     */
    public void setSession(String session) {
        this.session = session;
    }

    /**
     * <p>
     * The session which should be passed both ways in challenge-response calls
     * to the service.
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
     *            challenge-response calls to the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifySoftwareTokenRequest withSession(String session) {
        this.session = session;
        return this;
    }

    /**
     * <p>
     * The one time password computed using the secret code returned by
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @return <p>
     *         The one time password computed using the secret code returned by
     *         </p>
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * <p>
     * The one time password computed using the secret code returned by
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param userCode <p>
     *            The one time password computed using the secret code returned
     *            by
     *            </p>
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * <p>
     * The one time password computed using the secret code returned by
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param userCode <p>
     *            The one time password computed using the secret code returned
     *            by
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifySoftwareTokenRequest withUserCode(String userCode) {
        this.userCode = userCode;
        return this;
    }

    /**
     * <p>
     * The friendly device name.
     * </p>
     *
     * @return <p>
     *         The friendly device name.
     *         </p>
     */
    public String getFriendlyDeviceName() {
        return friendlyDeviceName;
    }

    /**
     * <p>
     * The friendly device name.
     * </p>
     *
     * @param friendlyDeviceName <p>
     *            The friendly device name.
     *            </p>
     */
    public void setFriendlyDeviceName(String friendlyDeviceName) {
        this.friendlyDeviceName = friendlyDeviceName;
    }

    /**
     * <p>
     * The friendly device name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param friendlyDeviceName <p>
     *            The friendly device name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifySoftwareTokenRequest withFriendlyDeviceName(String friendlyDeviceName) {
        this.friendlyDeviceName = friendlyDeviceName;
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
            sb.append("Session: " + getSession() + ",");
        if (getUserCode() != null)
            sb.append("UserCode: " + getUserCode() + ",");
        if (getFriendlyDeviceName() != null)
            sb.append("FriendlyDeviceName: " + getFriendlyDeviceName());
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
        hashCode = prime * hashCode + ((getUserCode() == null) ? 0 : getUserCode().hashCode());
        hashCode = prime * hashCode
                + ((getFriendlyDeviceName() == null) ? 0 : getFriendlyDeviceName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifySoftwareTokenRequest == false)
            return false;
        VerifySoftwareTokenRequest other = (VerifySoftwareTokenRequest) obj;

        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null
                && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        if (other.getUserCode() == null ^ this.getUserCode() == null)
            return false;
        if (other.getUserCode() != null && other.getUserCode().equals(this.getUserCode()) == false)
            return false;
        if (other.getFriendlyDeviceName() == null ^ this.getFriendlyDeviceName() == null)
            return false;
        if (other.getFriendlyDeviceName() != null
                && other.getFriendlyDeviceName().equals(this.getFriendlyDeviceName()) == false)
            return false;
        return true;
    }
}
