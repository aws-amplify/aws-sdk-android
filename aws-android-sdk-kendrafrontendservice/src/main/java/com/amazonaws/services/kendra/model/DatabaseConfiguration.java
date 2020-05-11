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
 * Provides the information necessary to connect a database to an index.
 * </p>
 */
public class DatabaseConfiguration implements Serializable {
    /**
     * <p>
     * The type of database engine that runs the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RDS_AURORA_MYSQL, RDS_AURORA_POSTGRESQL,
     * RDS_MYSQL, RDS_POSTGRESQL
     */
    private String databaseEngineType;

    /**
     * <p>
     * The information necessary to connect to a database.
     * </p>
     */
    private ConnectionConfiguration connectionConfiguration;

    /**
     * <p>
     * Provides information for connecting to an Amazon VPC.
     * </p>
     */
    private DataSourceVpcConfiguration vpcConfiguration;

    /**
     * <p>
     * Information about where the index should get the document information
     * from the database.
     * </p>
     */
    private ColumnConfiguration columnConfiguration;

    /**
     * <p>
     * Information about the database column that provides information for user
     * context filtering.
     * </p>
     */
    private AclConfiguration aclConfiguration;

    /**
     * <p>
     * The type of database engine that runs the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RDS_AURORA_MYSQL, RDS_AURORA_POSTGRESQL,
     * RDS_MYSQL, RDS_POSTGRESQL
     *
     * @return <p>
     *         The type of database engine that runs the database.
     *         </p>
     * @see DatabaseEngineType
     */
    public String getDatabaseEngineType() {
        return databaseEngineType;
    }

    /**
     * <p>
     * The type of database engine that runs the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RDS_AURORA_MYSQL, RDS_AURORA_POSTGRESQL,
     * RDS_MYSQL, RDS_POSTGRESQL
     *
     * @param databaseEngineType <p>
     *            The type of database engine that runs the database.
     *            </p>
     * @see DatabaseEngineType
     */
    public void setDatabaseEngineType(String databaseEngineType) {
        this.databaseEngineType = databaseEngineType;
    }

    /**
     * <p>
     * The type of database engine that runs the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RDS_AURORA_MYSQL, RDS_AURORA_POSTGRESQL,
     * RDS_MYSQL, RDS_POSTGRESQL
     *
     * @param databaseEngineType <p>
     *            The type of database engine that runs the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatabaseEngineType
     */
    public DatabaseConfiguration withDatabaseEngineType(String databaseEngineType) {
        this.databaseEngineType = databaseEngineType;
        return this;
    }

    /**
     * <p>
     * The type of database engine that runs the database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RDS_AURORA_MYSQL, RDS_AURORA_POSTGRESQL,
     * RDS_MYSQL, RDS_POSTGRESQL
     *
     * @param databaseEngineType <p>
     *            The type of database engine that runs the database.
     *            </p>
     * @see DatabaseEngineType
     */
    public void setDatabaseEngineType(DatabaseEngineType databaseEngineType) {
        this.databaseEngineType = databaseEngineType.toString();
    }

    /**
     * <p>
     * The type of database engine that runs the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RDS_AURORA_MYSQL, RDS_AURORA_POSTGRESQL,
     * RDS_MYSQL, RDS_POSTGRESQL
     *
     * @param databaseEngineType <p>
     *            The type of database engine that runs the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatabaseEngineType
     */
    public DatabaseConfiguration withDatabaseEngineType(DatabaseEngineType databaseEngineType) {
        this.databaseEngineType = databaseEngineType.toString();
        return this;
    }

    /**
     * <p>
     * The information necessary to connect to a database.
     * </p>
     *
     * @return <p>
     *         The information necessary to connect to a database.
     *         </p>
     */
    public ConnectionConfiguration getConnectionConfiguration() {
        return connectionConfiguration;
    }

    /**
     * <p>
     * The information necessary to connect to a database.
     * </p>
     *
     * @param connectionConfiguration <p>
     *            The information necessary to connect to a database.
     *            </p>
     */
    public void setConnectionConfiguration(ConnectionConfiguration connectionConfiguration) {
        this.connectionConfiguration = connectionConfiguration;
    }

    /**
     * <p>
     * The information necessary to connect to a database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionConfiguration <p>
     *            The information necessary to connect to a database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatabaseConfiguration withConnectionConfiguration(
            ConnectionConfiguration connectionConfiguration) {
        this.connectionConfiguration = connectionConfiguration;
        return this;
    }

    /**
     * <p>
     * Provides information for connecting to an Amazon VPC.
     * </p>
     *
     * @return <p>
     *         Provides information for connecting to an Amazon VPC.
     *         </p>
     */
    public DataSourceVpcConfiguration getVpcConfiguration() {
        return vpcConfiguration;
    }

    /**
     * <p>
     * Provides information for connecting to an Amazon VPC.
     * </p>
     *
     * @param vpcConfiguration <p>
     *            Provides information for connecting to an Amazon VPC.
     *            </p>
     */
    public void setVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * Provides information for connecting to an Amazon VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfiguration <p>
     *            Provides information for connecting to an Amazon VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatabaseConfiguration withVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
        return this;
    }

    /**
     * <p>
     * Information about where the index should get the document information
     * from the database.
     * </p>
     *
     * @return <p>
     *         Information about where the index should get the document
     *         information from the database.
     *         </p>
     */
    public ColumnConfiguration getColumnConfiguration() {
        return columnConfiguration;
    }

    /**
     * <p>
     * Information about where the index should get the document information
     * from the database.
     * </p>
     *
     * @param columnConfiguration <p>
     *            Information about where the index should get the document
     *            information from the database.
     *            </p>
     */
    public void setColumnConfiguration(ColumnConfiguration columnConfiguration) {
        this.columnConfiguration = columnConfiguration;
    }

    /**
     * <p>
     * Information about where the index should get the document information
     * from the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columnConfiguration <p>
     *            Information about where the index should get the document
     *            information from the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatabaseConfiguration withColumnConfiguration(ColumnConfiguration columnConfiguration) {
        this.columnConfiguration = columnConfiguration;
        return this;
    }

    /**
     * <p>
     * Information about the database column that provides information for user
     * context filtering.
     * </p>
     *
     * @return <p>
     *         Information about the database column that provides information
     *         for user context filtering.
     *         </p>
     */
    public AclConfiguration getAclConfiguration() {
        return aclConfiguration;
    }

    /**
     * <p>
     * Information about the database column that provides information for user
     * context filtering.
     * </p>
     *
     * @param aclConfiguration <p>
     *            Information about the database column that provides
     *            information for user context filtering.
     *            </p>
     */
    public void setAclConfiguration(AclConfiguration aclConfiguration) {
        this.aclConfiguration = aclConfiguration;
    }

    /**
     * <p>
     * Information about the database column that provides information for user
     * context filtering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aclConfiguration <p>
     *            Information about the database column that provides
     *            information for user context filtering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatabaseConfiguration withAclConfiguration(AclConfiguration aclConfiguration) {
        this.aclConfiguration = aclConfiguration;
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
        if (getDatabaseEngineType() != null)
            sb.append("DatabaseEngineType: " + getDatabaseEngineType() + ",");
        if (getConnectionConfiguration() != null)
            sb.append("ConnectionConfiguration: " + getConnectionConfiguration() + ",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: " + getVpcConfiguration() + ",");
        if (getColumnConfiguration() != null)
            sb.append("ColumnConfiguration: " + getColumnConfiguration() + ",");
        if (getAclConfiguration() != null)
            sb.append("AclConfiguration: " + getAclConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDatabaseEngineType() == null) ? 0 : getDatabaseEngineType().hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectionConfiguration() == null) ? 0 : getConnectionConfiguration()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getColumnConfiguration() == null) ? 0 : getColumnConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getAclConfiguration() == null) ? 0 : getAclConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatabaseConfiguration == false)
            return false;
        DatabaseConfiguration other = (DatabaseConfiguration) obj;

        if (other.getDatabaseEngineType() == null ^ this.getDatabaseEngineType() == null)
            return false;
        if (other.getDatabaseEngineType() != null
                && other.getDatabaseEngineType().equals(this.getDatabaseEngineType()) == false)
            return false;
        if (other.getConnectionConfiguration() == null ^ this.getConnectionConfiguration() == null)
            return false;
        if (other.getConnectionConfiguration() != null
                && other.getConnectionConfiguration().equals(this.getConnectionConfiguration()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null
                && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        if (other.getColumnConfiguration() == null ^ this.getColumnConfiguration() == null)
            return false;
        if (other.getColumnConfiguration() != null
                && other.getColumnConfiguration().equals(this.getColumnConfiguration()) == false)
            return false;
        if (other.getAclConfiguration() == null ^ this.getAclConfiguration() == null)
            return false;
        if (other.getAclConfiguration() != null
                && other.getAclConfiguration().equals(this.getAclConfiguration()) == false)
            return false;
        return true;
    }
}
