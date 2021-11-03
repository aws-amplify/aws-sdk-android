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

package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;

/**
 * <p>
 * Connection credentials.
 * </p>
 */
public class ConnectionCredentials implements Serializable {
    /**
     * <p>
     * The connection token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String connectionToken;

    /**
     * <p>
     * The expiration of the token.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     */
    private String expiry;

    /**
     * <p>
     * The connection token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The connection token.
     *         </p>
     */
    public String getConnectionToken() {
        return connectionToken;
    }

    /**
     * <p>
     * The connection token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param connectionToken <p>
     *            The connection token.
     *            </p>
     */
    public void setConnectionToken(String connectionToken) {
        this.connectionToken = connectionToken;
    }

    /**
     * <p>
     * The connection token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param connectionToken <p>
     *            The connection token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionCredentials withConnectionToken(String connectionToken) {
        this.connectionToken = connectionToken;
        return this;
    }

    /**
     * <p>
     * The expiration of the token.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     *
     * @return <p>
     *         The expiration of the token.
     *         </p>
     *         <p>
     *         It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For
     *         example, 2019-11-08T02:41:28.172Z.
     *         </p>
     */
    public String getExpiry() {
        return expiry;
    }

    /**
     * <p>
     * The expiration of the token.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     *
     * @param expiry <p>
     *            The expiration of the token.
     *            </p>
     *            <p>
     *            It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ.
     *            For example, 2019-11-08T02:41:28.172Z.
     *            </p>
     */
    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    /**
     * <p>
     * The expiration of the token.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiry <p>
     *            The expiration of the token.
     *            </p>
     *            <p>
     *            It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ.
     *            For example, 2019-11-08T02:41:28.172Z.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionCredentials withExpiry(String expiry) {
        this.expiry = expiry;
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
        if (getConnectionToken() != null)
            sb.append("ConnectionToken: " + getConnectionToken() + ",");
        if (getExpiry() != null)
            sb.append("Expiry: " + getExpiry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConnectionToken() == null) ? 0 : getConnectionToken().hashCode());
        hashCode = prime * hashCode + ((getExpiry() == null) ? 0 : getExpiry().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionCredentials == false)
            return false;
        ConnectionCredentials other = (ConnectionCredentials) obj;

        if (other.getConnectionToken() == null ^ this.getConnectionToken() == null)
            return false;
        if (other.getConnectionToken() != null
                && other.getConnectionToken().equals(this.getConnectionToken()) == false)
            return false;
        if (other.getExpiry() == null ^ this.getExpiry() == null)
            return false;
        if (other.getExpiry() != null && other.getExpiry().equals(this.getExpiry()) == false)
            return false;
        return true;
    }
}
