/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.session.qldb.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the details of the started session.
 * </p>
 */
public class StartSessionResult implements Serializable {
    /**
     * <p>
     * Session token of the started session. This <code>SessionToken</code> is
     * required for every subsequent command that is issued during the current
     * session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     */
    private String sessionToken;

    /**
     * <p>
     * Session token of the started session. This <code>SessionToken</code> is
     * required for every subsequent command that is issued during the current
     * session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @return <p>
     *         Session token of the started session. This
     *         <code>SessionToken</code> is required for every subsequent
     *         command that is issued during the current session.
     *         </p>
     */
    public String getSessionToken() {
        return sessionToken;
    }

    /**
     * <p>
     * Session token of the started session. This <code>SessionToken</code> is
     * required for every subsequent command that is issued during the current
     * session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @param sessionToken <p>
     *            Session token of the started session. This
     *            <code>SessionToken</code> is required for every subsequent
     *            command that is issued during the current session.
     *            </p>
     */
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * <p>
     * Session token of the started session. This <code>SessionToken</code> is
     * required for every subsequent command that is issued during the current
     * session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @param sessionToken <p>
     *            Session token of the started session. This
     *            <code>SessionToken</code> is required for every subsequent
     *            command that is issued during the current session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSessionResult withSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
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
        if (getSessionToken() != null)
            sb.append("SessionToken: " + getSessionToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSessionToken() == null) ? 0 : getSessionToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSessionResult == false)
            return false;
        StartSessionResult other = (StartSessionResult) obj;

        if (other.getSessionToken() == null ^ this.getSessionToken() == null)
            return false;
        if (other.getSessionToken() != null
                && other.getSessionToken().equals(this.getSessionToken()) == false)
            return false;
        return true;
    }
}
