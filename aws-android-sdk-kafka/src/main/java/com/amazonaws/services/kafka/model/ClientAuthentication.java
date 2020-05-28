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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

/**
 * 
 <p>
 * Includes all client authentication information.
 * </p>
 */
public class ClientAuthentication implements Serializable {
    /**
     * 
     <p>
     * Details for ClientAuthentication using TLS.
     * </p>
     */
    private Tls tls;

    /**
     * 
     <p>
     * Details for ClientAuthentication using TLS.
     * </p>
     * 
     * @return <p>
     *         Details for ClientAuthentication using TLS.
     *         </p>
     */
    public Tls getTls() {
        return tls;
    }

    /**
     * 
     <p>
     * Details for ClientAuthentication using TLS.
     * </p>
     * 
     * @param tls <p>
     *            Details for ClientAuthentication using TLS.
     *            </p>
     */
    public void setTls(Tls tls) {
        this.tls = tls;
    }

    /**
     * 
     <p>
     * Details for ClientAuthentication using TLS.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tls <p>
     *            Details for ClientAuthentication using TLS.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClientAuthentication withTls(Tls tls) {
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
            sb.append("Tls: " + getTls());
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

        if (obj instanceof ClientAuthentication == false)
            return false;
        ClientAuthentication other = (ClientAuthentication) obj;

        if (other.getTls() == null ^ this.getTls() == null)
            return false;
        if (other.getTls() != null && other.getTls().equals(this.getTls()) == false)
            return false;
        return true;
    }
}
