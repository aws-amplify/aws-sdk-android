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
 * Filters the connection definitions that are returned by the
 * <code>GetConnections</code> API operation.
 * </p>
 */
public class GetConnectionsFilter implements Serializable {
    /**
     * <p>
     * A criteria string that must match the criteria recorded in the connection
     * definition for that connection definition to be returned.
     * </p>
     */
    private java.util.List<String> matchCriteria;

    /**
     * <p>
     * The type of connections to return. Currently, only JDBC is supported;
     * SFTP is not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JDBC, SFTP, MONGODB
     */
    private String connectionType;

    /**
     * <p>
     * A criteria string that must match the criteria recorded in the connection
     * definition for that connection definition to be returned.
     * </p>
     *
     * @return <p>
     *         A criteria string that must match the criteria recorded in the
     *         connection definition for that connection definition to be
     *         returned.
     *         </p>
     */
    public java.util.List<String> getMatchCriteria() {
        return matchCriteria;
    }

    /**
     * <p>
     * A criteria string that must match the criteria recorded in the connection
     * definition for that connection definition to be returned.
     * </p>
     *
     * @param matchCriteria <p>
     *            A criteria string that must match the criteria recorded in the
     *            connection definition for that connection definition to be
     *            returned.
     *            </p>
     */
    public void setMatchCriteria(java.util.Collection<String> matchCriteria) {
        if (matchCriteria == null) {
            this.matchCriteria = null;
            return;
        }

        this.matchCriteria = new java.util.ArrayList<String>(matchCriteria);
    }

    /**
     * <p>
     * A criteria string that must match the criteria recorded in the connection
     * definition for that connection definition to be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchCriteria <p>
     *            A criteria string that must match the criteria recorded in the
     *            connection definition for that connection definition to be
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConnectionsFilter withMatchCriteria(String... matchCriteria) {
        if (getMatchCriteria() == null) {
            this.matchCriteria = new java.util.ArrayList<String>(matchCriteria.length);
        }
        for (String value : matchCriteria) {
            this.matchCriteria.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A criteria string that must match the criteria recorded in the connection
     * definition for that connection definition to be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchCriteria <p>
     *            A criteria string that must match the criteria recorded in the
     *            connection definition for that connection definition to be
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConnectionsFilter withMatchCriteria(java.util.Collection<String> matchCriteria) {
        setMatchCriteria(matchCriteria);
        return this;
    }

    /**
     * <p>
     * The type of connections to return. Currently, only JDBC is supported;
     * SFTP is not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JDBC, SFTP, MONGODB
     *
     * @return <p>
     *         The type of connections to return. Currently, only JDBC is
     *         supported; SFTP is not supported.
     *         </p>
     * @see ConnectionType
     */
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * <p>
     * The type of connections to return. Currently, only JDBC is supported;
     * SFTP is not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JDBC, SFTP, MONGODB
     *
     * @param connectionType <p>
     *            The type of connections to return. Currently, only JDBC is
     *            supported; SFTP is not supported.
     *            </p>
     * @see ConnectionType
     */
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * <p>
     * The type of connections to return. Currently, only JDBC is supported;
     * SFTP is not supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JDBC, SFTP, MONGODB
     *
     * @param connectionType <p>
     *            The type of connections to return. Currently, only JDBC is
     *            supported; SFTP is not supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionType
     */
    public GetConnectionsFilter withConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * <p>
     * The type of connections to return. Currently, only JDBC is supported;
     * SFTP is not supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JDBC, SFTP, MONGODB
     *
     * @param connectionType <p>
     *            The type of connections to return. Currently, only JDBC is
     *            supported; SFTP is not supported.
     *            </p>
     * @see ConnectionType
     */
    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType.toString();
    }

    /**
     * <p>
     * The type of connections to return. Currently, only JDBC is supported;
     * SFTP is not supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JDBC, SFTP, MONGODB
     *
     * @param connectionType <p>
     *            The type of connections to return. Currently, only JDBC is
     *            supported; SFTP is not supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionType
     */
    public GetConnectionsFilter withConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType.toString();
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
        if (getMatchCriteria() != null)
            sb.append("MatchCriteria: " + getMatchCriteria() + ",");
        if (getConnectionType() != null)
            sb.append("ConnectionType: " + getConnectionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMatchCriteria() == null) ? 0 : getMatchCriteria().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionType() == null) ? 0 : getConnectionType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConnectionsFilter == false)
            return false;
        GetConnectionsFilter other = (GetConnectionsFilter) obj;

        if (other.getMatchCriteria() == null ^ this.getMatchCriteria() == null)
            return false;
        if (other.getMatchCriteria() != null
                && other.getMatchCriteria().equals(this.getMatchCriteria()) == false)
            return false;
        if (other.getConnectionType() == null ^ this.getConnectionType() == null)
            return false;
        if (other.getConnectionType() != null
                && other.getConnectionType().equals(this.getConnectionType()) == false)
            return false;
        return true;
    }
}
