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
 * An object that represents a port mapping.
 * </p>
 */
public class PortMapping implements Serializable {
    /**
     * <p>
     * The port used for the port mapping.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     */
    private Integer port;

    /**
     * <p>
     * The protocol used for the port mapping. Specify one protocol.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>grpc, http, http2, tcp
     */
    private String protocol;

    /**
     * <p>
     * The port used for the port mapping.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @return <p>
     *         The port used for the port mapping.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The port used for the port mapping.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param port <p>
     *            The port used for the port mapping.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port used for the port mapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param port <p>
     *            The port used for the port mapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PortMapping withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The protocol used for the port mapping. Specify one protocol.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>grpc, http, http2, tcp
     *
     * @return <p>
     *         The protocol used for the port mapping. Specify one protocol.
     *         </p>
     * @see PortProtocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol used for the port mapping. Specify one protocol.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>grpc, http, http2, tcp
     *
     * @param protocol <p>
     *            The protocol used for the port mapping. Specify one protocol.
     *            </p>
     * @see PortProtocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol used for the port mapping. Specify one protocol.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>grpc, http, http2, tcp
     *
     * @param protocol <p>
     *            The protocol used for the port mapping. Specify one protocol.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PortProtocol
     */
    public PortMapping withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The protocol used for the port mapping. Specify one protocol.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>grpc, http, http2, tcp
     *
     * @param protocol <p>
     *            The protocol used for the port mapping. Specify one protocol.
     *            </p>
     * @see PortProtocol
     */
    public void setProtocol(PortProtocol protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * The protocol used for the port mapping. Specify one protocol.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>grpc, http, http2, tcp
     *
     * @param protocol <p>
     *            The protocol used for the port mapping. Specify one protocol.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PortProtocol
     */
    public PortMapping withProtocol(PortProtocol protocol) {
        this.protocol = protocol.toString();
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
        if (getPort() != null)
            sb.append("port: " + getPort() + ",");
        if (getProtocol() != null)
            sb.append("protocol: " + getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortMapping == false)
            return false;
        PortMapping other = (PortMapping) obj;

        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }
}
