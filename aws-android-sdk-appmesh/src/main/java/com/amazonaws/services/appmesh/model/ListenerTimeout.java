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

public class ListenerTimeout implements Serializable {
    /**
     * The new value for the grpc property for this object.
     */
    private GrpcTimeout grpc;

    /**
     * The new value for the http property for this object.
     */
    private HttpTimeout http;

    /**
     * The new value for the http2 property for this object.
     */
    private HttpTimeout http2;

    /**
     * The new value for the tcp property for this object.
     */
    private TcpTimeout tcp;

    /**
     * Returns the value of the grpc property for this object.
     *
     * @return The value of the grpc property for this object.
     */
    public GrpcTimeout getGrpc() {
        return grpc;
    }

    /**
     * Sets the value of grpc
     *
     * @param grpc The new value for the grpc property for this object.
     */
    public void setGrpc(GrpcTimeout grpc) {
        this.grpc = grpc;
    }

    /**
     * Sets the value of the grpc property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grpc The new value for the grpc property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListenerTimeout withGrpc(GrpcTimeout grpc) {
        this.grpc = grpc;
        return this;
    }

    /**
     * Returns the value of the http property for this object.
     *
     * @return The value of the http property for this object.
     */
    public HttpTimeout getHttp() {
        return http;
    }

    /**
     * Sets the value of http
     *
     * @param http The new value for the http property for this object.
     */
    public void setHttp(HttpTimeout http) {
        this.http = http;
    }

    /**
     * Sets the value of the http property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param http The new value for the http property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListenerTimeout withHttp(HttpTimeout http) {
        this.http = http;
        return this;
    }

    /**
     * Returns the value of the http2 property for this object.
     *
     * @return The value of the http2 property for this object.
     */
    public HttpTimeout getHttp2() {
        return http2;
    }

    /**
     * Sets the value of http2
     *
     * @param http2 The new value for the http2 property for this object.
     */
    public void setHttp2(HttpTimeout http2) {
        this.http2 = http2;
    }

    /**
     * Sets the value of the http2 property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param http2 The new value for the http2 property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListenerTimeout withHttp2(HttpTimeout http2) {
        this.http2 = http2;
        return this;
    }

    /**
     * Returns the value of the tcp property for this object.
     *
     * @return The value of the tcp property for this object.
     */
    public TcpTimeout getTcp() {
        return tcp;
    }

    /**
     * Sets the value of tcp
     *
     * @param tcp The new value for the tcp property for this object.
     */
    public void setTcp(TcpTimeout tcp) {
        this.tcp = tcp;
    }

    /**
     * Sets the value of the tcp property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tcp The new value for the tcp property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListenerTimeout withTcp(TcpTimeout tcp) {
        this.tcp = tcp;
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
        if (getGrpc() != null)
            sb.append("grpc: " + getGrpc() + ",");
        if (getHttp() != null)
            sb.append("http: " + getHttp() + ",");
        if (getHttp2() != null)
            sb.append("http2: " + getHttp2() + ",");
        if (getTcp() != null)
            sb.append("tcp: " + getTcp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrpc() == null) ? 0 : getGrpc().hashCode());
        hashCode = prime * hashCode + ((getHttp() == null) ? 0 : getHttp().hashCode());
        hashCode = prime * hashCode + ((getHttp2() == null) ? 0 : getHttp2().hashCode());
        hashCode = prime * hashCode + ((getTcp() == null) ? 0 : getTcp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListenerTimeout == false)
            return false;
        ListenerTimeout other = (ListenerTimeout) obj;

        if (other.getGrpc() == null ^ this.getGrpc() == null)
            return false;
        if (other.getGrpc() != null && other.getGrpc().equals(this.getGrpc()) == false)
            return false;
        if (other.getHttp() == null ^ this.getHttp() == null)
            return false;
        if (other.getHttp() != null && other.getHttp().equals(this.getHttp()) == false)
            return false;
        if (other.getHttp2() == null ^ this.getHttp2() == null)
            return false;
        if (other.getHttp2() != null && other.getHttp2().equals(this.getHttp2()) == false)
            return false;
        if (other.getTcp() == null ^ this.getTcp() == null)
            return false;
        if (other.getTcp() != null && other.getTcp().equals(this.getTcp()) == false)
            return false;
        return true;
    }
}
