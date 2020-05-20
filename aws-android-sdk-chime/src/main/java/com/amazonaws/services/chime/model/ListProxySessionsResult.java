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

public class ListProxySessionsResult implements Serializable {
    /**
     * <p>
     * The proxy session details.
     * </p>
     */
    private java.util.List<ProxySession> proxySessions;

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 65535<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The proxy session details.
     * </p>
     *
     * @return <p>
     *         The proxy session details.
     *         </p>
     */
    public java.util.List<ProxySession> getProxySessions() {
        return proxySessions;
    }

    /**
     * <p>
     * The proxy session details.
     * </p>
     *
     * @param proxySessions <p>
     *            The proxy session details.
     *            </p>
     */
    public void setProxySessions(java.util.Collection<ProxySession> proxySessions) {
        if (proxySessions == null) {
            this.proxySessions = null;
            return;
        }

        this.proxySessions = new java.util.ArrayList<ProxySession>(proxySessions);
    }

    /**
     * <p>
     * The proxy session details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param proxySessions <p>
     *            The proxy session details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProxySessionsResult withProxySessions(ProxySession... proxySessions) {
        if (getProxySessions() == null) {
            this.proxySessions = new java.util.ArrayList<ProxySession>(proxySessions.length);
        }
        for (ProxySession value : proxySessions) {
            this.proxySessions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The proxy session details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param proxySessions <p>
     *            The proxy session details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProxySessionsResult withProxySessions(
            java.util.Collection<ProxySession> proxySessions) {
        setProxySessions(proxySessions);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 65535<br/>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 65535<br/>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 65535<br/>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProxySessionsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getProxySessions() != null)
            sb.append("ProxySessions: " + getProxySessions() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProxySessions() == null) ? 0 : getProxySessions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProxySessionsResult == false)
            return false;
        ListProxySessionsResult other = (ListProxySessionsResult) obj;

        if (other.getProxySessions() == null ^ this.getProxySessions() == null)
            return false;
        if (other.getProxySessions() != null
                && other.getProxySessions().equals(this.getProxySessions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
