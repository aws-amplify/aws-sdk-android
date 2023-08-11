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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies whether messages that use the configuration set are required to use
 * Transport Layer Security (TLS).
 * </p>
 */
public class DeliveryOptions implements Serializable {
    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to
     * use Transport Layer Security (TLS). If the value is <code>Require</code>,
     * messages are only delivered if a TLS connection can be established. If
     * the value is <code>Optional</code>, messages can be delivered in plain
     * text if a TLS connection can't be established.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Require, Optional
     */
    private String tlsPolicy;

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to
     * use Transport Layer Security (TLS). If the value is <code>Require</code>,
     * messages are only delivered if a TLS connection can be established. If
     * the value is <code>Optional</code>, messages can be delivered in plain
     * text if a TLS connection can't be established.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Require, Optional
     *
     * @return <p>
     *         Specifies whether messages that use the configuration set are
     *         required to use Transport Layer Security (TLS). If the value is
     *         <code>Require</code>, messages are only delivered if a TLS
     *         connection can be established. If the value is
     *         <code>Optional</code>, messages can be delivered in plain text if
     *         a TLS connection can't be established.
     *         </p>
     * @see TlsPolicy
     */
    public String getTlsPolicy() {
        return tlsPolicy;
    }

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to
     * use Transport Layer Security (TLS). If the value is <code>Require</code>,
     * messages are only delivered if a TLS connection can be established. If
     * the value is <code>Optional</code>, messages can be delivered in plain
     * text if a TLS connection can't be established.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Require, Optional
     *
     * @param tlsPolicy <p>
     *            Specifies whether messages that use the configuration set are
     *            required to use Transport Layer Security (TLS). If the value
     *            is <code>Require</code>, messages are only delivered if a TLS
     *            connection can be established. If the value is
     *            <code>Optional</code>, messages can be delivered in plain text
     *            if a TLS connection can't be established.
     *            </p>
     * @see TlsPolicy
     */
    public void setTlsPolicy(String tlsPolicy) {
        this.tlsPolicy = tlsPolicy;
    }

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to
     * use Transport Layer Security (TLS). If the value is <code>Require</code>,
     * messages are only delivered if a TLS connection can be established. If
     * the value is <code>Optional</code>, messages can be delivered in plain
     * text if a TLS connection can't be established.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Require, Optional
     *
     * @param tlsPolicy <p>
     *            Specifies whether messages that use the configuration set are
     *            required to use Transport Layer Security (TLS). If the value
     *            is <code>Require</code>, messages are only delivered if a TLS
     *            connection can be established. If the value is
     *            <code>Optional</code>, messages can be delivered in plain text
     *            if a TLS connection can't be established.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TlsPolicy
     */
    public DeliveryOptions withTlsPolicy(String tlsPolicy) {
        this.tlsPolicy = tlsPolicy;
        return this;
    }

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to
     * use Transport Layer Security (TLS). If the value is <code>Require</code>,
     * messages are only delivered if a TLS connection can be established. If
     * the value is <code>Optional</code>, messages can be delivered in plain
     * text if a TLS connection can't be established.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Require, Optional
     *
     * @param tlsPolicy <p>
     *            Specifies whether messages that use the configuration set are
     *            required to use Transport Layer Security (TLS). If the value
     *            is <code>Require</code>, messages are only delivered if a TLS
     *            connection can be established. If the value is
     *            <code>Optional</code>, messages can be delivered in plain text
     *            if a TLS connection can't be established.
     *            </p>
     * @see TlsPolicy
     */
    public void setTlsPolicy(TlsPolicy tlsPolicy) {
        this.tlsPolicy = tlsPolicy.toString();
    }

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to
     * use Transport Layer Security (TLS). If the value is <code>Require</code>,
     * messages are only delivered if a TLS connection can be established. If
     * the value is <code>Optional</code>, messages can be delivered in plain
     * text if a TLS connection can't be established.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Require, Optional
     *
     * @param tlsPolicy <p>
     *            Specifies whether messages that use the configuration set are
     *            required to use Transport Layer Security (TLS). If the value
     *            is <code>Require</code>, messages are only delivered if a TLS
     *            connection can be established. If the value is
     *            <code>Optional</code>, messages can be delivered in plain text
     *            if a TLS connection can't be established.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TlsPolicy
     */
    public DeliveryOptions withTlsPolicy(TlsPolicy tlsPolicy) {
        this.tlsPolicy = tlsPolicy.toString();
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
        if (getTlsPolicy() != null)
            sb.append("TlsPolicy: " + getTlsPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTlsPolicy() == null) ? 0 : getTlsPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeliveryOptions == false)
            return false;
        DeliveryOptions other = (DeliveryOptions) obj;

        if (other.getTlsPolicy() == null ^ this.getTlsPolicy() == null)
            return false;
        if (other.getTlsPolicy() != null
                && other.getTlsPolicy().equals(this.getTlsPolicy()) == false)
            return false;
        return true;
    }
}
