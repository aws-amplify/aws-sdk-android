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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <note>
 * <p>
 * This is prerelease documentation for the RDS Database Proxy feature in
 * preview release. It is subject to change.
 * </p>
 * </note>
 * <p>
 * Displays the settings that control the size and behavior of the connection
 * pool associated with a <code>DBProxyTarget</code>.
 * </p>
 */
public class ConnectionPoolConfigurationInfo implements Serializable {
    /**
     * <p>
     * The maximum size of the connection pool for each target in a target
     * group. For Aurora MySQL, it is expressed as a percentage of the
     * <code>max_connections</code> setting for the RDS DB instance or Aurora DB
     * cluster used by the target group.
     * </p>
     */
    private Integer maxConnectionsPercent;

    /**
     * <p>
     * Controls how actively the proxy closes idle database connections in the
     * connection pool. A high value enables the proxy to leave a high
     * percentage of idle connections open. A low value causes the proxy to
     * close idle client connections and return the underlying database
     * connections to the connection pool. For Aurora MySQL, it is expressed as
     * a percentage of the <code>max_connections</code> setting for the RDS DB
     * instance or Aurora DB cluster used by the target group.
     * </p>
     */
    private Integer maxIdleConnectionsPercent;

    /**
     * <p>
     * The number of seconds for a proxy to wait for a connection to become
     * available in the connection pool. Only applies when the proxy has opened
     * its maximum number of connections and all connections are busy with
     * client sessions.
     * </p>
     */
    private Integer connectionBorrowTimeout;

    /**
     * <p>
     * Each item in the list represents a class of SQL operations that normally
     * cause all later statements in a session using a proxy to be pinned to the
     * same underlying database connection. Including an item in the list
     * exempts that class of SQL operations from the pinning behavior.
     * Currently, the only allowed value is <code>EXCLUDE_VARIABLE_SETS</code>.
     * </p>
     */
    private java.util.List<String> sessionPinningFilters;

    /**
     * <p>
     * One or more SQL statements for the proxy to run when opening each new
     * database connection. Typically used with <code>SET</code> statements to
     * make sure that each connection has identical settings such as time zone
     * and character set. This setting is empty by default. For multiple
     * statements, use semicolons as the separator. You can also include
     * multiple variables in a single <code>SET</code> statement, such as
     * <code>SET x=1, y=2</code>.
     * </p>
     * <p>
     * <code>InitQuery</code> is not currently supported for PostgreSQL.
     * </p>
     */
    private String initQuery;

    /**
     * <p>
     * The maximum size of the connection pool for each target in a target
     * group. For Aurora MySQL, it is expressed as a percentage of the
     * <code>max_connections</code> setting for the RDS DB instance or Aurora DB
     * cluster used by the target group.
     * </p>
     *
     * @return <p>
     *         The maximum size of the connection pool for each target in a
     *         target group. For Aurora MySQL, it is expressed as a percentage
     *         of the <code>max_connections</code> setting for the RDS DB
     *         instance or Aurora DB cluster used by the target group.
     *         </p>
     */
    public Integer getMaxConnectionsPercent() {
        return maxConnectionsPercent;
    }

    /**
     * <p>
     * The maximum size of the connection pool for each target in a target
     * group. For Aurora MySQL, it is expressed as a percentage of the
     * <code>max_connections</code> setting for the RDS DB instance or Aurora DB
     * cluster used by the target group.
     * </p>
     *
     * @param maxConnectionsPercent <p>
     *            The maximum size of the connection pool for each target in a
     *            target group. For Aurora MySQL, it is expressed as a
     *            percentage of the <code>max_connections</code> setting for the
     *            RDS DB instance or Aurora DB cluster used by the target group.
     *            </p>
     */
    public void setMaxConnectionsPercent(Integer maxConnectionsPercent) {
        this.maxConnectionsPercent = maxConnectionsPercent;
    }

    /**
     * <p>
     * The maximum size of the connection pool for each target in a target
     * group. For Aurora MySQL, it is expressed as a percentage of the
     * <code>max_connections</code> setting for the RDS DB instance or Aurora DB
     * cluster used by the target group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxConnectionsPercent <p>
     *            The maximum size of the connection pool for each target in a
     *            target group. For Aurora MySQL, it is expressed as a
     *            percentage of the <code>max_connections</code> setting for the
     *            RDS DB instance or Aurora DB cluster used by the target group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionPoolConfigurationInfo withMaxConnectionsPercent(Integer maxConnectionsPercent) {
        this.maxConnectionsPercent = maxConnectionsPercent;
        return this;
    }

    /**
     * <p>
     * Controls how actively the proxy closes idle database connections in the
     * connection pool. A high value enables the proxy to leave a high
     * percentage of idle connections open. A low value causes the proxy to
     * close idle client connections and return the underlying database
     * connections to the connection pool. For Aurora MySQL, it is expressed as
     * a percentage of the <code>max_connections</code> setting for the RDS DB
     * instance or Aurora DB cluster used by the target group.
     * </p>
     *
     * @return <p>
     *         Controls how actively the proxy closes idle database connections
     *         in the connection pool. A high value enables the proxy to leave a
     *         high percentage of idle connections open. A low value causes the
     *         proxy to close idle client connections and return the underlying
     *         database connections to the connection pool. For Aurora MySQL, it
     *         is expressed as a percentage of the <code>max_connections</code>
     *         setting for the RDS DB instance or Aurora DB cluster used by the
     *         target group.
     *         </p>
     */
    public Integer getMaxIdleConnectionsPercent() {
        return maxIdleConnectionsPercent;
    }

    /**
     * <p>
     * Controls how actively the proxy closes idle database connections in the
     * connection pool. A high value enables the proxy to leave a high
     * percentage of idle connections open. A low value causes the proxy to
     * close idle client connections and return the underlying database
     * connections to the connection pool. For Aurora MySQL, it is expressed as
     * a percentage of the <code>max_connections</code> setting for the RDS DB
     * instance or Aurora DB cluster used by the target group.
     * </p>
     *
     * @param maxIdleConnectionsPercent <p>
     *            Controls how actively the proxy closes idle database
     *            connections in the connection pool. A high value enables the
     *            proxy to leave a high percentage of idle connections open. A
     *            low value causes the proxy to close idle client connections
     *            and return the underlying database connections to the
     *            connection pool. For Aurora MySQL, it is expressed as a
     *            percentage of the <code>max_connections</code> setting for the
     *            RDS DB instance or Aurora DB cluster used by the target group.
     *            </p>
     */
    public void setMaxIdleConnectionsPercent(Integer maxIdleConnectionsPercent) {
        this.maxIdleConnectionsPercent = maxIdleConnectionsPercent;
    }

    /**
     * <p>
     * Controls how actively the proxy closes idle database connections in the
     * connection pool. A high value enables the proxy to leave a high
     * percentage of idle connections open. A low value causes the proxy to
     * close idle client connections and return the underlying database
     * connections to the connection pool. For Aurora MySQL, it is expressed as
     * a percentage of the <code>max_connections</code> setting for the RDS DB
     * instance or Aurora DB cluster used by the target group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxIdleConnectionsPercent <p>
     *            Controls how actively the proxy closes idle database
     *            connections in the connection pool. A high value enables the
     *            proxy to leave a high percentage of idle connections open. A
     *            low value causes the proxy to close idle client connections
     *            and return the underlying database connections to the
     *            connection pool. For Aurora MySQL, it is expressed as a
     *            percentage of the <code>max_connections</code> setting for the
     *            RDS DB instance or Aurora DB cluster used by the target group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionPoolConfigurationInfo withMaxIdleConnectionsPercent(
            Integer maxIdleConnectionsPercent) {
        this.maxIdleConnectionsPercent = maxIdleConnectionsPercent;
        return this;
    }

    /**
     * <p>
     * The number of seconds for a proxy to wait for a connection to become
     * available in the connection pool. Only applies when the proxy has opened
     * its maximum number of connections and all connections are busy with
     * client sessions.
     * </p>
     *
     * @return <p>
     *         The number of seconds for a proxy to wait for a connection to
     *         become available in the connection pool. Only applies when the
     *         proxy has opened its maximum number of connections and all
     *         connections are busy with client sessions.
     *         </p>
     */
    public Integer getConnectionBorrowTimeout() {
        return connectionBorrowTimeout;
    }

    /**
     * <p>
     * The number of seconds for a proxy to wait for a connection to become
     * available in the connection pool. Only applies when the proxy has opened
     * its maximum number of connections and all connections are busy with
     * client sessions.
     * </p>
     *
     * @param connectionBorrowTimeout <p>
     *            The number of seconds for a proxy to wait for a connection to
     *            become available in the connection pool. Only applies when the
     *            proxy has opened its maximum number of connections and all
     *            connections are busy with client sessions.
     *            </p>
     */
    public void setConnectionBorrowTimeout(Integer connectionBorrowTimeout) {
        this.connectionBorrowTimeout = connectionBorrowTimeout;
    }

    /**
     * <p>
     * The number of seconds for a proxy to wait for a connection to become
     * available in the connection pool. Only applies when the proxy has opened
     * its maximum number of connections and all connections are busy with
     * client sessions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionBorrowTimeout <p>
     *            The number of seconds for a proxy to wait for a connection to
     *            become available in the connection pool. Only applies when the
     *            proxy has opened its maximum number of connections and all
     *            connections are busy with client sessions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionPoolConfigurationInfo withConnectionBorrowTimeout(
            Integer connectionBorrowTimeout) {
        this.connectionBorrowTimeout = connectionBorrowTimeout;
        return this;
    }

    /**
     * <p>
     * Each item in the list represents a class of SQL operations that normally
     * cause all later statements in a session using a proxy to be pinned to the
     * same underlying database connection. Including an item in the list
     * exempts that class of SQL operations from the pinning behavior.
     * Currently, the only allowed value is <code>EXCLUDE_VARIABLE_SETS</code>.
     * </p>
     *
     * @return <p>
     *         Each item in the list represents a class of SQL operations that
     *         normally cause all later statements in a session using a proxy to
     *         be pinned to the same underlying database connection. Including
     *         an item in the list exempts that class of SQL operations from the
     *         pinning behavior. Currently, the only allowed value is
     *         <code>EXCLUDE_VARIABLE_SETS</code>.
     *         </p>
     */
    public java.util.List<String> getSessionPinningFilters() {
        return sessionPinningFilters;
    }

    /**
     * <p>
     * Each item in the list represents a class of SQL operations that normally
     * cause all later statements in a session using a proxy to be pinned to the
     * same underlying database connection. Including an item in the list
     * exempts that class of SQL operations from the pinning behavior.
     * Currently, the only allowed value is <code>EXCLUDE_VARIABLE_SETS</code>.
     * </p>
     *
     * @param sessionPinningFilters <p>
     *            Each item in the list represents a class of SQL operations
     *            that normally cause all later statements in a session using a
     *            proxy to be pinned to the same underlying database connection.
     *            Including an item in the list exempts that class of SQL
     *            operations from the pinning behavior. Currently, the only
     *            allowed value is <code>EXCLUDE_VARIABLE_SETS</code>.
     *            </p>
     */
    public void setSessionPinningFilters(java.util.Collection<String> sessionPinningFilters) {
        if (sessionPinningFilters == null) {
            this.sessionPinningFilters = null;
            return;
        }

        this.sessionPinningFilters = new java.util.ArrayList<String>(sessionPinningFilters);
    }

    /**
     * <p>
     * Each item in the list represents a class of SQL operations that normally
     * cause all later statements in a session using a proxy to be pinned to the
     * same underlying database connection. Including an item in the list
     * exempts that class of SQL operations from the pinning behavior.
     * Currently, the only allowed value is <code>EXCLUDE_VARIABLE_SETS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionPinningFilters <p>
     *            Each item in the list represents a class of SQL operations
     *            that normally cause all later statements in a session using a
     *            proxy to be pinned to the same underlying database connection.
     *            Including an item in the list exempts that class of SQL
     *            operations from the pinning behavior. Currently, the only
     *            allowed value is <code>EXCLUDE_VARIABLE_SETS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionPoolConfigurationInfo withSessionPinningFilters(
            String... sessionPinningFilters) {
        if (getSessionPinningFilters() == null) {
            this.sessionPinningFilters = new java.util.ArrayList<String>(
                    sessionPinningFilters.length);
        }
        for (String value : sessionPinningFilters) {
            this.sessionPinningFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Each item in the list represents a class of SQL operations that normally
     * cause all later statements in a session using a proxy to be pinned to the
     * same underlying database connection. Including an item in the list
     * exempts that class of SQL operations from the pinning behavior.
     * Currently, the only allowed value is <code>EXCLUDE_VARIABLE_SETS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionPinningFilters <p>
     *            Each item in the list represents a class of SQL operations
     *            that normally cause all later statements in a session using a
     *            proxy to be pinned to the same underlying database connection.
     *            Including an item in the list exempts that class of SQL
     *            operations from the pinning behavior. Currently, the only
     *            allowed value is <code>EXCLUDE_VARIABLE_SETS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionPoolConfigurationInfo withSessionPinningFilters(
            java.util.Collection<String> sessionPinningFilters) {
        setSessionPinningFilters(sessionPinningFilters);
        return this;
    }

    /**
     * <p>
     * One or more SQL statements for the proxy to run when opening each new
     * database connection. Typically used with <code>SET</code> statements to
     * make sure that each connection has identical settings such as time zone
     * and character set. This setting is empty by default. For multiple
     * statements, use semicolons as the separator. You can also include
     * multiple variables in a single <code>SET</code> statement, such as
     * <code>SET x=1, y=2</code>.
     * </p>
     * <p>
     * <code>InitQuery</code> is not currently supported for PostgreSQL.
     * </p>
     *
     * @return <p>
     *         One or more SQL statements for the proxy to run when opening each
     *         new database connection. Typically used with <code>SET</code>
     *         statements to make sure that each connection has identical
     *         settings such as time zone and character set. This setting is
     *         empty by default. For multiple statements, use semicolons as the
     *         separator. You can also include multiple variables in a single
     *         <code>SET</code> statement, such as <code>SET x=1, y=2</code>.
     *         </p>
     *         <p>
     *         <code>InitQuery</code> is not currently supported for PostgreSQL.
     *         </p>
     */
    public String getInitQuery() {
        return initQuery;
    }

    /**
     * <p>
     * One or more SQL statements for the proxy to run when opening each new
     * database connection. Typically used with <code>SET</code> statements to
     * make sure that each connection has identical settings such as time zone
     * and character set. This setting is empty by default. For multiple
     * statements, use semicolons as the separator. You can also include
     * multiple variables in a single <code>SET</code> statement, such as
     * <code>SET x=1, y=2</code>.
     * </p>
     * <p>
     * <code>InitQuery</code> is not currently supported for PostgreSQL.
     * </p>
     *
     * @param initQuery <p>
     *            One or more SQL statements for the proxy to run when opening
     *            each new database connection. Typically used with
     *            <code>SET</code> statements to make sure that each connection
     *            has identical settings such as time zone and character set.
     *            This setting is empty by default. For multiple statements, use
     *            semicolons as the separator. You can also include multiple
     *            variables in a single <code>SET</code> statement, such as
     *            <code>SET x=1, y=2</code>.
     *            </p>
     *            <p>
     *            <code>InitQuery</code> is not currently supported for
     *            PostgreSQL.
     *            </p>
     */
    public void setInitQuery(String initQuery) {
        this.initQuery = initQuery;
    }

    /**
     * <p>
     * One or more SQL statements for the proxy to run when opening each new
     * database connection. Typically used with <code>SET</code> statements to
     * make sure that each connection has identical settings such as time zone
     * and character set. This setting is empty by default. For multiple
     * statements, use semicolons as the separator. You can also include
     * multiple variables in a single <code>SET</code> statement, such as
     * <code>SET x=1, y=2</code>.
     * </p>
     * <p>
     * <code>InitQuery</code> is not currently supported for PostgreSQL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param initQuery <p>
     *            One or more SQL statements for the proxy to run when opening
     *            each new database connection. Typically used with
     *            <code>SET</code> statements to make sure that each connection
     *            has identical settings such as time zone and character set.
     *            This setting is empty by default. For multiple statements, use
     *            semicolons as the separator. You can also include multiple
     *            variables in a single <code>SET</code> statement, such as
     *            <code>SET x=1, y=2</code>.
     *            </p>
     *            <p>
     *            <code>InitQuery</code> is not currently supported for
     *            PostgreSQL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionPoolConfigurationInfo withInitQuery(String initQuery) {
        this.initQuery = initQuery;
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
        if (getMaxConnectionsPercent() != null)
            sb.append("MaxConnectionsPercent: " + getMaxConnectionsPercent() + ",");
        if (getMaxIdleConnectionsPercent() != null)
            sb.append("MaxIdleConnectionsPercent: " + getMaxIdleConnectionsPercent() + ",");
        if (getConnectionBorrowTimeout() != null)
            sb.append("ConnectionBorrowTimeout: " + getConnectionBorrowTimeout() + ",");
        if (getSessionPinningFilters() != null)
            sb.append("SessionPinningFilters: " + getSessionPinningFilters() + ",");
        if (getInitQuery() != null)
            sb.append("InitQuery: " + getInitQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMaxConnectionsPercent() == null) ? 0 : getMaxConnectionsPercent().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaxIdleConnectionsPercent() == null) ? 0 : getMaxIdleConnectionsPercent()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectionBorrowTimeout() == null) ? 0 : getConnectionBorrowTimeout()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSessionPinningFilters() == null) ? 0 : getSessionPinningFilters().hashCode());
        hashCode = prime * hashCode + ((getInitQuery() == null) ? 0 : getInitQuery().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionPoolConfigurationInfo == false)
            return false;
        ConnectionPoolConfigurationInfo other = (ConnectionPoolConfigurationInfo) obj;

        if (other.getMaxConnectionsPercent() == null ^ this.getMaxConnectionsPercent() == null)
            return false;
        if (other.getMaxConnectionsPercent() != null
                && other.getMaxConnectionsPercent().equals(this.getMaxConnectionsPercent()) == false)
            return false;
        if (other.getMaxIdleConnectionsPercent() == null
                ^ this.getMaxIdleConnectionsPercent() == null)
            return false;
        if (other.getMaxIdleConnectionsPercent() != null
                && other.getMaxIdleConnectionsPercent().equals(this.getMaxIdleConnectionsPercent()) == false)
            return false;
        if (other.getConnectionBorrowTimeout() == null ^ this.getConnectionBorrowTimeout() == null)
            return false;
        if (other.getConnectionBorrowTimeout() != null
                && other.getConnectionBorrowTimeout().equals(this.getConnectionBorrowTimeout()) == false)
            return false;
        if (other.getSessionPinningFilters() == null ^ this.getSessionPinningFilters() == null)
            return false;
        if (other.getSessionPinningFilters() != null
                && other.getSessionPinningFilters().equals(this.getSessionPinningFilters()) == false)
            return false;
        if (other.getInitQuery() == null ^ this.getInitQuery() == null)
            return false;
        if (other.getInitQuery() != null
                && other.getInitQuery().equals(this.getInitQuery()) == false)
            return false;
        return true;
    }
}
