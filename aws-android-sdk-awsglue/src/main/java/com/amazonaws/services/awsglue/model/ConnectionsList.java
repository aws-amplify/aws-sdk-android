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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the connections used by a job.
 * </p>
 */
public class ConnectionsList implements Serializable {
    /**
     * <p>
     * A list of connections used by the job.
     * </p>
     */
    private java.util.List<String> connections;

    /**
     * <p>
     * A list of connections used by the job.
     * </p>
     *
     * @return <p>
     *         A list of connections used by the job.
     *         </p>
     */
    public java.util.List<String> getConnections() {
        return connections;
    }

    /**
     * <p>
     * A list of connections used by the job.
     * </p>
     *
     * @param connections <p>
     *            A list of connections used by the job.
     *            </p>
     */
    public void setConnections(java.util.Collection<String> connections) {
        if (connections == null) {
            this.connections = null;
            return;
        }

        this.connections = new java.util.ArrayList<String>(connections);
    }

    /**
     * <p>
     * A list of connections used by the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connections <p>
     *            A list of connections used by the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionsList withConnections(String... connections) {
        if (getConnections() == null) {
            this.connections = new java.util.ArrayList<String>(connections.length);
        }
        for (String value : connections) {
            this.connections.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of connections used by the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connections <p>
     *            A list of connections used by the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionsList withConnections(java.util.Collection<String> connections) {
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
            sb.append("Connections: " + getConnections());
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

        if (obj instanceof ConnectionsList == false)
            return false;
        ConnectionsList other = (ConnectionsList) obj;

        if (other.getConnections() == null ^ this.getConnections() == null)
            return false;
        if (other.getConnections() != null
                && other.getConnections().equals(this.getConnections()) == false)
            return false;
        return true;
    }
}
