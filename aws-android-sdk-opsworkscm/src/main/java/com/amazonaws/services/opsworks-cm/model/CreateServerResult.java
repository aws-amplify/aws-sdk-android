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
package com.amazonaws.services.opsworks-cm.model;

import java.io.Serializable;


public class CreateServerResult implements Serializable {
    /**
     * <p>The server that is created by the request. </p>
     */
    private Server server;

    /**
     * <p>The server that is created by the request. </p>
     *
     * @return <p>The server that is created by the request. </p>
     */
    public Server getServer() {
        return server;
    }

    /**
     * <p>The server that is created by the request. </p>
     *
     * @param server <p>The server that is created by the request. </p>
     */
    public void setServer(Server server) {
        this.server = server;
    }

    /**
     * <p>The server that is created by the request. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param server <p>The server that is created by the request. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateServerResult withServer(Server server) {
        this.server = server;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getServer() != null) sb.append("Server: " + getServer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServer() == null) ? 0 : getServer().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateServerResult == false) return false;
        CreateServerResult other = (CreateServerResult)obj;

        if (other.getServer() == null ^ this.getServer() == null) return false;
        if (other.getServer() != null && other.getServer().equals(this.getServer()) == false) return false;
        return true;
    }
}
