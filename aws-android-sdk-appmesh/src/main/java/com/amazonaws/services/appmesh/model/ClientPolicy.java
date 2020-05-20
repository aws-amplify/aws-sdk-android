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
 * An object that represents a client policy.
 * </p>
 */
public class ClientPolicy implements Serializable {
    /**
     * <p>
     * A reference to an object that represents a Transport Layer Security (TLS)
     * client policy.
     * </p>
     */
    private ClientPolicyTls tls;

    /**
     * <p>
     * A reference to an object that represents a Transport Layer Security (TLS)
     * client policy.
     * </p>
     *
     * @return <p>
     *         A reference to an object that represents a Transport Layer
     *         Security (TLS) client policy.
     *         </p>
     */
    public ClientPolicyTls getTls() {
        return tls;
    }

    /**
     * <p>
     * A reference to an object that represents a Transport Layer Security (TLS)
     * client policy.
     * </p>
     *
     * @param tls <p>
     *            A reference to an object that represents a Transport Layer
     *            Security (TLS) client policy.
     *            </p>
     */
    public void setTls(ClientPolicyTls tls) {
        this.tls = tls;
    }

    /**
     * <p>
     * A reference to an object that represents a Transport Layer Security (TLS)
     * client policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tls <p>
     *            A reference to an object that represents a Transport Layer
     *            Security (TLS) client policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientPolicy withTls(ClientPolicyTls tls) {
        this.tls = tls;
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
        if (getTls() != null)
            sb.append("tls: " + getTls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTls() == null) ? 0 : getTls().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientPolicy == false)
            return false;
        ClientPolicy other = (ClientPolicy) obj;

        if (other.getTls() == null ^ this.getTls() == null)
            return false;
        if (other.getTls() != null && other.getTls().equals(this.getTls()) == false)
            return false;
        return true;
    }
}
