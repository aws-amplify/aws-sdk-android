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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the remote port.
 * </p>
 */
public class RemotePortDetails implements Serializable {
    /**
     * <p>
     * The port number of the remote connection.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The port name of the remote connection.
     * </p>
     */
    private String portName;

    /**
     * <p>
     * The port number of the remote connection.
     * </p>
     *
     * @return <p>
     *         The port number of the remote connection.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The port number of the remote connection.
     * </p>
     *
     * @param port <p>
     *            The port number of the remote connection.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number of the remote connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The port number of the remote connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemotePortDetails withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The port name of the remote connection.
     * </p>
     *
     * @return <p>
     *         The port name of the remote connection.
     *         </p>
     */
    public String getPortName() {
        return portName;
    }

    /**
     * <p>
     * The port name of the remote connection.
     * </p>
     *
     * @param portName <p>
     *            The port name of the remote connection.
     *            </p>
     */
    public void setPortName(String portName) {
        this.portName = portName;
    }

    /**
     * <p>
     * The port name of the remote connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portName <p>
     *            The port name of the remote connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemotePortDetails withPortName(String portName) {
        this.portName = portName;
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
            sb.append("Port: " + getPort() + ",");
        if (getPortName() != null)
            sb.append("PortName: " + getPortName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getPortName() == null) ? 0 : getPortName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemotePortDetails == false)
            return false;
        RemotePortDetails other = (RemotePortDetails) obj;

        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getPortName() == null ^ this.getPortName() == null)
            return false;
        if (other.getPortName() != null && other.getPortName().equals(this.getPortName()) == false)
            return false;
        return true;
    }
}
