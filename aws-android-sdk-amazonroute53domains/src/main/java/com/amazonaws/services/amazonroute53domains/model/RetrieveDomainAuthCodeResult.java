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

package com.amazonaws.services.amazonroute53domains.model;

import java.io.Serializable;

/**
 * <p>
 * The RetrieveDomainAuthCode response includes the following element.
 * </p>
 */
public class RetrieveDomainAuthCodeResult implements Serializable {
    /**
     * <p>
     * The authorization code for the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String authCode;

    /**
     * <p>
     * The authorization code for the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The authorization code for the domain.
     *         </p>
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * <p>
     * The authorization code for the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param authCode <p>
     *            The authorization code for the domain.
     *            </p>
     */
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * <p>
     * The authorization code for the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param authCode <p>
     *            The authorization code for the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RetrieveDomainAuthCodeResult withAuthCode(String authCode) {
        this.authCode = authCode;
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
        if (getAuthCode() != null)
            sb.append("AuthCode: " + getAuthCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthCode() == null) ? 0 : getAuthCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrieveDomainAuthCodeResult == false)
            return false;
        RetrieveDomainAuthCodeResult other = (RetrieveDomainAuthCodeResult) obj;

        if (other.getAuthCode() == null ^ this.getAuthCode() == null)
            return false;
        if (other.getAuthCode() != null && other.getAuthCode().equals(this.getAuthCode()) == false)
            return false;
        return true;
    }
}
