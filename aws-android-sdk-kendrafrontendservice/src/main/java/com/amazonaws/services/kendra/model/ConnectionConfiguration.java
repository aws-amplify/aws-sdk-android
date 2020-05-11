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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * Provides the information necessary to connect to a database.
 * </p>
 */
public class ConnectionConfiguration implements Serializable {
    /**
     * <p>
     * The name of the host for the database. Can be either a string
     * (host.subdomain.domain.tld) or an IPv4 or IPv6 address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     */
    private String databaseHost;

    /**
     * <p>
     * The port that the database uses for connections.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     */
    private Integer databasePort;

    /**
     * <p>
     * The name of the database containing the document data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     */
    private String databaseName;

    /**
     * <p>
     * The name of the table that contains the document data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     */
    private String tableName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets
     * Manager. The credentials should be a user/password pair. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html"
     * >Using a Database Data Source</a>. For more information about AWS Secrets
     * Manager, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">
     * What Is AWS Secrets Manager </a> in the <i>AWS Secrets Manager</i> user
     * guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String secretArn;

    /**
     * <p>
     * The name of the host for the database. Can be either a string
     * (host.subdomain.domain.tld) or an IPv4 or IPv6 address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     *
     * @return <p>
     *         The name of the host for the database. Can be either a string
     *         (host.subdomain.domain.tld) or an IPv4 or IPv6 address.
     *         </p>
     */
    public String getDatabaseHost() {
        return databaseHost;
    }

    /**
     * <p>
     * The name of the host for the database. Can be either a string
     * (host.subdomain.domain.tld) or an IPv4 or IPv6 address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     *
     * @param databaseHost <p>
     *            The name of the host for the database. Can be either a string
     *            (host.subdomain.domain.tld) or an IPv4 or IPv6 address.
     *            </p>
     */
    public void setDatabaseHost(String databaseHost) {
        this.databaseHost = databaseHost;
    }

    /**
     * <p>
     * The name of the host for the database. Can be either a string
     * (host.subdomain.domain.tld) or an IPv4 or IPv6 address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     *
     * @param databaseHost <p>
     *            The name of the host for the database. Can be either a string
     *            (host.subdomain.domain.tld) or an IPv4 or IPv6 address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionConfiguration withDatabaseHost(String databaseHost) {
        this.databaseHost = databaseHost;
        return this;
    }

    /**
     * <p>
     * The port that the database uses for connections.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @return <p>
     *         The port that the database uses for connections.
     *         </p>
     */
    public Integer getDatabasePort() {
        return databasePort;
    }

    /**
     * <p>
     * The port that the database uses for connections.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param databasePort <p>
     *            The port that the database uses for connections.
     *            </p>
     */
    public void setDatabasePort(Integer databasePort) {
        this.databasePort = databasePort;
    }

    /**
     * <p>
     * The port that the database uses for connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param databasePort <p>
     *            The port that the database uses for connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionConfiguration withDatabasePort(Integer databasePort) {
        this.databasePort = databasePort;
        return this;
    }

    /**
     * <p>
     * The name of the database containing the document data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @return <p>
     *         The name of the database containing the document data.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The name of the database containing the document data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @param databaseName <p>
     *            The name of the database containing the document data.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database containing the document data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @param databaseName <p>
     *            The name of the database containing the document data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionConfiguration withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * The name of the table that contains the document data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @return <p>
     *         The name of the table that contains the document data.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the table that contains the document data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @param tableName <p>
     *            The name of the table that contains the document data.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table that contains the document data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @param tableName <p>
     *            The name of the table that contains the document data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionConfiguration withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets
     * Manager. The credentials should be a user/password pair. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html"
     * >Using a Database Data Source</a>. For more information about AWS Secrets
     * Manager, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">
     * What Is AWS Secrets Manager </a> in the <i>AWS Secrets Manager</i> user
     * guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of credentials stored in AWS
     *         Secrets Manager. The credentials should be a user/password pair.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html"
     *         >Using a Database Data Source</a>. For more information about AWS
     *         Secrets Manager, see <a href=
     *         "https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"
     *         > What Is AWS Secrets Manager </a> in the <i>AWS Secrets
     *         Manager</i> user guide.
     *         </p>
     */
    public String getSecretArn() {
        return secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets
     * Manager. The credentials should be a user/password pair. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html"
     * >Using a Database Data Source</a>. For more information about AWS Secrets
     * Manager, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">
     * What Is AWS Secrets Manager </a> in the <i>AWS Secrets Manager</i> user
     * guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param secretArn <p>
     *            The Amazon Resource Name (ARN) of credentials stored in AWS
     *            Secrets Manager. The credentials should be a user/password
     *            pair. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html"
     *            >Using a Database Data Source</a>. For more information about
     *            AWS Secrets Manager, see <a href=
     *            "https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"
     *            > What Is AWS Secrets Manager </a> in the <i>AWS Secrets
     *            Manager</i> user guide.
     *            </p>
     */
    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets
     * Manager. The credentials should be a user/password pair. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html"
     * >Using a Database Data Source</a>. For more information about AWS Secrets
     * Manager, see <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html">
     * What Is AWS Secrets Manager </a> in the <i>AWS Secrets Manager</i> user
     * guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param secretArn <p>
     *            The Amazon Resource Name (ARN) of credentials stored in AWS
     *            Secrets Manager. The credentials should be a user/password
     *            pair. For more information, see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html"
     *            >Using a Database Data Source</a>. For more information about
     *            AWS Secrets Manager, see <a href=
     *            "https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html"
     *            > What Is AWS Secrets Manager </a> in the <i>AWS Secrets
     *            Manager</i> user guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionConfiguration withSecretArn(String secretArn) {
        this.secretArn = secretArn;
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
        if (getDatabaseHost() != null)
            sb.append("DatabaseHost: " + getDatabaseHost() + ",");
        if (getDatabasePort() != null)
            sb.append("DatabasePort: " + getDatabasePort() + ",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getSecretArn() != null)
            sb.append("SecretArn: " + getSecretArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDatabaseHost() == null) ? 0 : getDatabaseHost().hashCode());
        hashCode = prime * hashCode
                + ((getDatabasePort() == null) ? 0 : getDatabasePort().hashCode());
        hashCode = prime * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionConfiguration == false)
            return false;
        ConnectionConfiguration other = (ConnectionConfiguration) obj;

        if (other.getDatabaseHost() == null ^ this.getDatabaseHost() == null)
            return false;
        if (other.getDatabaseHost() != null
                && other.getDatabaseHost().equals(this.getDatabaseHost()) == false)
            return false;
        if (other.getDatabasePort() == null ^ this.getDatabasePort() == null)
            return false;
        if (other.getDatabasePort() != null
                && other.getDatabasePort().equals(this.getDatabasePort()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null
                && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null
                && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        return true;
    }
}
