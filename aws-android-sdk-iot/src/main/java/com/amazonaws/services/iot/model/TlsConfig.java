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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * An object that specifies the TLS configuration for a domain.
 * </p>
 */
public class TlsConfig implements Serializable {
    /**
     * <p>
     * The security policy for a domain configuration. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table"
     * >Security policies </a> in the <i>Amazon Web Services IoT Core developer
     * guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String securityPolicy;

    /**
     * <p>
     * The security policy for a domain configuration. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table"
     * >Security policies </a> in the <i>Amazon Web Services IoT Core developer
     * guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The security policy for a domain configuration. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table"
     *         >Security policies </a> in the <i>Amazon Web Services IoT Core
     *         developer guide</i>.
     *         </p>
     */
    public String getSecurityPolicy() {
        return securityPolicy;
    }

    /**
     * <p>
     * The security policy for a domain configuration. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table"
     * >Security policies </a> in the <i>Amazon Web Services IoT Core developer
     * guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param securityPolicy <p>
     *            The security policy for a domain configuration. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table"
     *            >Security policies </a> in the <i>Amazon Web Services IoT Core
     *            developer guide</i>.
     *            </p>
     */
    public void setSecurityPolicy(String securityPolicy) {
        this.securityPolicy = securityPolicy;
    }

    /**
     * <p>
     * The security policy for a domain configuration. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table"
     * >Security policies </a> in the <i>Amazon Web Services IoT Core developer
     * guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param securityPolicy <p>
     *            The security policy for a domain configuration. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table"
     *            >Security policies </a> in the <i>Amazon Web Services IoT Core
     *            developer guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TlsConfig withSecurityPolicy(String securityPolicy) {
        this.securityPolicy = securityPolicy;
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
        if (getSecurityPolicy() != null)
            sb.append("securityPolicy: " + getSecurityPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSecurityPolicy() == null) ? 0 : getSecurityPolicy().hashCode());
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

        if (other.getSecurityPolicy() == null ^ this.getSecurityPolicy() == null)
            return false;
        if (other.getSecurityPolicy() != null
                && other.getSecurityPolicy().equals(this.getSecurityPolicy()) == false)
            return false;
        return true;
    }
}
