/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class VerifySoftwareTokenRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The new value for the accessToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     */
    private String accessToken;

    /**
     * The new value for the session property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String session;

    /**
     * The new value for the userCode property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     */
    private String userCode;

    /**
     * The new value for the friendlyDeviceName property for this object.
     */
    private String friendlyDeviceName;

    /**
     * Returns the value of the accessToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @return The value of the accessToken property for this object.
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the value of accessToken
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken The new value for the accessToken property for this
     *            object.
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * Sets the value of the accessToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9-_=.]+<br/>
     *
     * @param accessToken The new value for the accessToken property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifySoftwareTokenRequest withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Returns the value of the session property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The value of the session property for this object.
     */
    public String getSession() {
        return session;
    }

    /**
     * Sets the value of session
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param session The new value for the session property for this object.
     */
    public void setSession(String session) {
        this.session = session;
    }

    /**
     * Sets the value of the session property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param session The new value for the session property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifySoftwareTokenRequest withSession(String session) {
        this.session = session;
        return this;
    }

    /**
     * Returns the value of the userCode property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @return The value of the userCode property for this object.
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * Sets the value of userCode
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param userCode The new value for the userCode property for this object.
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * Sets the value of the userCode property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param userCode The new value for the userCode property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifySoftwareTokenRequest withUserCode(String userCode) {
        this.userCode = userCode;
        return this;
    }

    /**
     * Returns the value of the friendlyDeviceName property for this object.
     *
     * @return The value of the friendlyDeviceName property for this object.
     */
    public String getFriendlyDeviceName() {
        return friendlyDeviceName;
    }

    /**
     * Sets the value of friendlyDeviceName
     *
     * @param friendlyDeviceName The new value for the friendlyDeviceName
     *            property for this object.
     */
    public void setFriendlyDeviceName(String friendlyDeviceName) {
        this.friendlyDeviceName = friendlyDeviceName;
    }

    /**
     * Sets the value of the friendlyDeviceName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param friendlyDeviceName The new value for the friendlyDeviceName
     *            property for this object.
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
