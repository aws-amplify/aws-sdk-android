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

public class GetConnectionsResult implements Serializable {
    /**
     * <p>
     * A list of requested connection definitions.
     * </p>
     */
    private java.util.List<Connection> connectionList;

    /**
     * <p>
     * A continuation token, if the list of connections returned does not
     * include the last of the filtered connections.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of requested connection definitions.
     * </p>
     *
     * @return <p>
     *         A list of requested connection definitions.
     *         </p>
     */
    public java.util.List<Connection> getConnectionList() {
        return connectionList;
    }

    /**
     * <p>
     * A list of requested connection definitions.
     * </p>
     *
     * @param connectionList <p>
     *            A list of requested connection definitions.
     *            </p>
     */
    public void setConnectionList(java.util.Collection<Connection> connectionList) {
        if (connectionList == null) {
            this.connectionList = null;
            return;
        }

        this.connectionList = new java.util.ArrayList<Connection>(connectionList);
    }

    /**
     * <p>
     * A list of requested connection definitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionList <p>
     *            A list of requested connection definitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConnectionsResult withConnectionList(Connection... connectionList) {
        if (getConnectionList() == null) {
            this.connectionList = new java.util.ArrayList<Connection>(connectionList.length);
        }
        for (Connection value : connectionList) {
            this.connectionList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of requested connection definitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionList <p>
     *            A list of requested connection definitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConnectionsResult withConnectionList(java.util.Collection<Connection> connectionList) {
        setConnectionList(connectionList);
        return this;
    }

    /**
     * <p>
     * A continuation token, if the list of connections returned does not
     * include the last of the filtered connections.
     * </p>
     *
     * @return <p>
     *         A continuation token, if the list of connections returned does
     *         not include the last of the filtered connections.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if the list of connections returned does not
     * include the last of the filtered connections.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if the list of connections returned does
     *            not include the last of the filtered connections.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if the list of connections returned does not
     * include the last of the filtered connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if the list of connections returned does
     *            not include the last of the filtered connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConnectionsResult withNextToken(String nextToken) {
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
        if (getConnectionList() != null)
            sb.append("ConnectionList: " + getConnectionList() + ",");
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
                + ((getConnectionList() == null) ? 0 : getConnectionList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConnectionsResult == false)
            return false;
        GetConnectionsResult other = (GetConnectionsResult) obj;

        if (other.getConnectionList() == null ^ this.getConnectionList() == null)
            return false;
        if (other.getConnectionList() != null
                && other.getConnectionList().equals(this.getConnectionList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
