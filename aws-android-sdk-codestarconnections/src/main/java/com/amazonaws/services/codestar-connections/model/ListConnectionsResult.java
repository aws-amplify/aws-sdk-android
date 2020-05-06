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
package com.amazonaws.services.codestar-connections.model;

import java.io.Serializable;


public class ListConnectionsResult implements Serializable {
    /**
     * <p>A list of connections and the details for each connection, such as status, owner, and provider type.</p>
     */
    private java.util.List<Connection> connections;

    /**
     * <p>A token that can be used in the next <code>ListConnections</code> call. To view all items in the list, continue to call this operation with each subsequent token until no more <code>nextToken</code> values are returned.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>A list of connections and the details for each connection, such as status, owner, and provider type.</p>
     *
     * @return <p>A list of connections and the details for each connection, such as status, owner, and provider type.</p>
     */
    public java.util.List<Connection> getConnections() {
        return connections;
    }

    /**
     * <p>A list of connections and the details for each connection, such as status, owner, and provider type.</p>
     *
     * @param connections <p>A list of connections and the details for each connection, such as status, owner, and provider type.</p>
     */
    public void setConnections(java.util.Collection<Connection> connections) {
        if (connections == null) {
            this.connections = null;
            return;
        }

        this.connections = new java.util.ArrayList<Connection>(connections);
    }

    /**
     * <p>A list of connections and the details for each connection, such as status, owner, and provider type.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connections <p>A list of connections and the details for each connection, such as status, owner, and provider type.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListConnectionsResult withConnections(Connection... connections) {
        if (getConnections() == null) {
            this.connections = new java.util.ArrayList<Connection>(connections.length);
        }
        for (Connection value : connections) {
            this.connections.add(value);
        }
        return this;
    }

    /**
     * <p>A list of connections and the details for each connection, such as status, owner, and provider type.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connections <p>A list of connections and the details for each connection, such as status, owner, and provider type.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListConnectionsResult withConnections(java.util.Collection<Connection> connections) {
        setConnections(connections);
        return this;
    }

    /**
     * <p>A token that can be used in the next <code>ListConnections</code> call. To view all items in the list, continue to call this operation with each subsequent token until no more <code>nextToken</code> values are returned.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>A token that can be used in the next <code>ListConnections</code> call. To view all items in the list, continue to call this operation with each subsequent token until no more <code>nextToken</code> values are returned.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>A token that can be used in the next <code>ListConnections</code> call. To view all items in the list, continue to call this operation with each subsequent token until no more <code>nextToken</code> values are returned.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>A token that can be used in the next <code>ListConnections</code> call. To view all items in the list, continue to call this operation with each subsequent token until no more <code>nextToken</code> values are returned.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>A token that can be used in the next <code>ListConnections</code> call. To view all items in the list, continue to call this operation with each subsequent token until no more <code>nextToken</code> values are returned.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>A token that can be used in the next <code>ListConnections</code> call. To view all items in the list, continue to call this operation with each subsequent token until no more <code>nextToken</code> values are returned.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListConnectionsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getConnections() != null) sb.append("Connections: " + getConnections() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnections() == null) ? 0 : getConnections().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListConnectionsResult == false) return false;
        ListConnectionsResult other = (ListConnectionsResult)obj;

        if (other.getConnections() == null ^ this.getConnections() == null) return false;
        if (other.getConnections() != null && other.getConnections().equals(this.getConnections()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
