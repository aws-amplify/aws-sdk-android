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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents a Transport Layer Security (TLS) validation
 * context.
 * </p>
 */
public class TlsValidationContext implements Serializable {
    /**
     * <p>
     * A reference to an object that represents a TLS validation context trust.
     * </p>
     */
    private TlsValidationContextTrust trust;

    /**
     * <p>
     * A reference to an object that represents a TLS validation context trust.
     * </p>
     *
     * @return <p>
     *         A reference to an object that represents a TLS validation context
     *         trust.
     *         </p>
     */
    public TlsValidationContextTrust getTrust() {
        return trust;
    }

    /**
     * <p>
     * A reference to an object that represents a TLS validation context trust.
     * </p>
     *
     * @param trust <p>
     *            A reference to an object that represents a TLS validation
     *            context trust.
     *            </p>
     */
    public void setTrust(TlsValidationContextTrust trust) {
        this.trust = trust;
    }

    /**
     * <p>
     * A reference to an object that represents a TLS validation context trust.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trust <p>
     *            A reference to an object that represents a TLS validation
     *            context trust.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TlsValidationContext withTrust(TlsValidationContextTrust trust) {
        this.trust = trust;
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
        if (getTrust() != null)
            sb.append("trust: " + getTrust());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrust() == null) ? 0 : getTrust().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TlsValidationContext == false)
            return false;
        TlsValidationContext other = (TlsValidationContext) obj;

        if (other.getTrust() == null ^ this.getTrust() == null)
            return false;
        if (other.getTrust() != null && other.getTrust().equals(this.getTrust()) == false)
            return false;
        return true;
    }
}
