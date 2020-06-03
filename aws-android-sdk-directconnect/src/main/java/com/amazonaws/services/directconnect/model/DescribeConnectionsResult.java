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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

public class DescribeConnectionsResult implements Serializable {
    /**
     * <p>
     * The connections.
     * </p>
     */
    private java.util.List<Connection> connections;

    /**
     * <p>
     * The connections.
     * </p>
     *
     * @return <p>
     *         The connections.
     *         </p>
     */
    public java.util.List<Connection> getConnections() {
        return connections;
    }

    /**
     * <p>
     * The connections.
     * </p>
     *
     * @param connections <p>
     *            The connections.
     *            </p>
     */
    public void setConnections(java.util.Collection<Connection> connections) {
        if (connections == null) {
            this.connections = null;
            return;
        }

        this.connections = new java.util.ArrayList<Connection>(connections);
    }

    /**
     * <p>
     * The connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connections <p>
     *            The connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConnectionsResult withConnections(Connection... connections) {
        if (getConnections() == null) {
            this.connections = new java.util.ArrayList<Connection>(connections.length);
        }
        for (Connection value : connections) {
            this.connections.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connections <p>
     *            The connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConnectionsResult withConnections(java.util.Collection<Connection> connections) {
        setConnections(connections);
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
        if (getConnections() != null)
            sb.append("connections: " + getConnections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConnections() == null) ? 0 : getConnections().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConnectionsResult == false)
            return false;
        DescribeConnectionsResult other = (DescribeConnectionsResult) obj;

        if (other.getConnections() == null ^ this.getConnections() == null)
            return false;
        if (other.getConnections() != null
                && other.getConnections().equals(this.getConnections()) == false)
            return false;
        return true;
    }
}
