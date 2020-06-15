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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * The SIP credentials used to authenticate requests to your Amazon Chime Voice
 * Connector.
 * </p>
 */
public class Credential implements Serializable {
    /**
     * <p>
     * The RFC2617 compliant user name associated with the SIP credentials, in
     * US-ASCII format.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The RFC2617 compliant password associated with the SIP credentials, in
     * US-ASCII format.
     * </p>
     */
    private String password;

    /**
     * <p>
     * The RFC2617 compliant user name associated with the SIP credentials, in
     * US-ASCII format.
     * </p>
     *
     * @return <p>
     *         The RFC2617 compliant user name associated with the SIP
     *         credentials, in US-ASCII format.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The RFC2617 compliant user name associated with the SIP credentials, in
     * US-ASCII format.
     * </p>
     *
     * @param username <p>
     *            The RFC2617 compliant user name associated with the SIP
     *            credentials, in US-ASCII format.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The RFC2617 compliant user name associated with the SIP credentials, in
     * US-ASCII format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param username <p>
     *            The RFC2617 compliant user name associated with the SIP
     *            credentials, in US-ASCII format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Credential withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * The RFC2617 compliant password associated with the SIP credentials, in
     * US-ASCII format.
     * </p>
     *
     * @return <p>
     *         The RFC2617 compliant password associated with the SIP
     *         credentials, in US-ASCII format.
     *         </p>
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>
     * The RFC2617 compliant password associated with the SIP credentials, in
     * US-ASCII format.
     * </p>
     *
     * @param password <p>
     *            The RFC2617 compliant password associated with the SIP
     *            credentials, in US-ASCII format.
     *            </p>
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The RFC2617 compliant password associated with the SIP credentials, in
     * US-ASCII format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param password <p>
     *            The RFC2617 compliant password associated with the SIP
     *            credentials, in US-ASCII format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Credential withPassword(String password) {
        this.password = password;
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
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Credential == false)
            return false;
        Credential other = (Credential) obj;

        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        return true;
    }
}
