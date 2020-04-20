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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

/**
 * <p>
 * The TLS configuration for a private integration. If you specify a TLS
 * configuration, private integration traffic uses the HTTPS protocol. Supported
 * only for HTTP APIs.
 * </p>
 */
public class TlsConfig implements Serializable {
    /**
     * <p>
     * If you specify a server name, API Gateway uses it to verify the hostname
     * on the integration's certificate. The server name is also included in the
     * TLS handshake to support Server Name Indication (SNI) or virtual hosting.
     * </p>
     */
    private String serverNameToVerify;

    /**
     * <p>
     * If you specify a server name, API Gateway uses it to verify the hostname
     * on the integration's certificate. The server name is also included in the
     * TLS handshake to support Server Name Indication (SNI) or virtual hosting.
     * </p>
     *
     * @return <p>
     *         If you specify a server name, API Gateway uses it to verify the
     *         hostname on the integration's certificate. The server name is
     *         also included in the TLS handshake to support Server Name
     *         Indication (SNI) or virtual hosting.
     *         </p>
     */
    public String getServerNameToVerify() {
        return serverNameToVerify;
    }

    /**
     * <p>
     * If you specify a server name, API Gateway uses it to verify the hostname
     * on the integration's certificate. The server name is also included in the
     * TLS handshake to support Server Name Indication (SNI) or virtual hosting.
     * </p>
     *
     * @param serverNameToVerify <p>
     *            If you specify a server name, API Gateway uses it to verify
     *            the hostname on the integration's certificate. The server name
     *            is also included in the TLS handshake to support Server Name
     *            Indication (SNI) or virtual hosting.
     *            </p>
     */
    public void setServerNameToVerify(String serverNameToVerify) {
        this.serverNameToVerify = serverNameToVerify;
    }

    /**
     * <p>
     * If you specify a server name, API Gateway uses it to verify the hostname
     * on the integration's certificate. The server name is also included in the
     * TLS handshake to support Server Name Indication (SNI) or virtual hosting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverNameToVerify <p>
     *            If you specify a server name, API Gateway uses it to verify
     *            the hostname on the integration's certificate. The server name
     *            is also included in the TLS handshake to support Server Name
     *            Indication (SNI) or virtual hosting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TlsConfig withServerNameToVerify(String serverNameToVerify) {
        this.serverNameToVerify = serverNameToVerify;
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
        if (getServerNameToVerify() != null)
            sb.append("ServerNameToVerify: " + getServerNameToVerify());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServerNameToVerify() == null) ? 0 : getServerNameToVerify().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TlsConfig == false)
            return false;
        TlsConfig other = (TlsConfig) obj;

        if (other.getServerNameToVerify() == null ^ this.getServerNameToVerify() == null)
            return false;
        if (other.getServerNameToVerify() != null
                && other.getServerNameToVerify().equals(this.getServerNameToVerify()) == false)
            return false;
        return true;
    }
}
