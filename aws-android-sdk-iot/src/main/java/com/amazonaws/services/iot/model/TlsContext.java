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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the TLS context to use for the test authorizer request.
 * </p>
 */
public class TlsContext implements Serializable {
    /**
     * <p>
     * The value of the <code>serverName</code> key in a TLS authorization
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     */
    private String serverName;

    /**
     * <p>
     * The value of the <code>serverName</code> key in a TLS authorization
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     *
     * @return <p>
     *         The value of the <code>serverName</code> key in a TLS
     *         authorization request.
     *         </p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p>
     * The value of the <code>serverName</code> key in a TLS authorization
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     *
     * @param serverName <p>
     *            The value of the <code>serverName</code> key in a TLS
     *            authorization request.
     *            </p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The value of the <code>serverName</code> key in a TLS authorization
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     *
     * @param serverName <p>
     *            The value of the <code>serverName</code> key in a TLS
     *            authorization request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TlsContext withServerName(String serverName) {
        this.serverName = serverName;
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
        if (getServerName() != null)
            sb.append("serverName: " + getServerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TlsContext == false)
            return false;
        TlsContext other = (TlsContext) obj;

        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null
                && other.getServerName().equals(this.getServerName()) == false)
            return false;
        return true;
    }
}
