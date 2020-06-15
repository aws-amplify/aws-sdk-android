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

public class GetVoiceConnectorProxyResult implements Serializable {
    /**
     * <p>
     * The proxy configuration details.
     * </p>
     */
    private Proxy proxy;

    /**
     * <p>
     * The proxy configuration details.
     * </p>
     *
     * @return <p>
     *         The proxy configuration details.
     *         </p>
     */
    public Proxy getProxy() {
        return proxy;
    }

    /**
     * <p>
     * The proxy configuration details.
     * </p>
     *
     * @param proxy <p>
     *            The proxy configuration details.
     *            </p>
     */
    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    /**
     * <p>
     * The proxy configuration details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param proxy <p>
     *            The proxy configuration details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetVoiceConnectorProxyResult withProxy(Proxy proxy) {
        this.proxy = proxy;
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
        if (getProxy() != null)
            sb.append("Proxy: " + getProxy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProxy() == null) ? 0 : getProxy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVoiceConnectorProxyResult == false)
            return false;
        GetVoiceConnectorProxyResult other = (GetVoiceConnectorProxyResult) obj;

        if (other.getProxy() == null ^ this.getProxy() == null)
            return false;
        if (other.getProxy() != null && other.getProxy().equals(this.getProxy()) == false)
            return false;
        return true;
    }
}
