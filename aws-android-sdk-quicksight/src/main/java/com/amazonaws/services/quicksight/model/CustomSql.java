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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * A physical table type built from the results of the custom SQL query.
 * </p>
 */
public class CustomSql implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data source.
     * </p>
     */
    private String dataSourceArn;

    /**
     * <p>
     * A display name for the SQL query result.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String name;

    /**
     * <p>
     * The SQL query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     */
    private String sqlQuery;

    /**
     * <p>
     * The column schema from the SQL query result set.
     * </p>
     */
    private java.util.List<InputColumn> columns;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data source.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the data source.
     *         </p>
     */
    public String getDataSourceArn() {
        return dataSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data source.
     * </p>
     *
     * @param dataSourceArn <p>
     *            The Amazon Resource Name (ARN) of the data source.
     *            </p>
     */
    public void setDataSourceArn(String dataSourceArn) {
        this.dataSourceArn = dataSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSourceArn <p>
     *            The Amazon Resource Name (ARN) of the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomSql withDataSourceArn(String dataSourceArn) {
        this.dataSourceArn = dataSourceArn;
        return this;
    }

    /**
     * <p>
     * A display name for the SQL query result.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         A display name for the SQL query result.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A display name for the SQL query result.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            A display name for the SQL query result.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A display name for the SQL query result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            A display name for the SQL query result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomSql withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The SQL query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @return <p>
     *         The SQL query.
     *         </p>
     */
    public String getSqlQuery() {
        return sqlQuery;
    }

    /**
     * <p>
     * The SQL query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @param sqlQuery <p>
     *            The SQL query.
     *            </p>
     */
    public void setSqlQuery(String sqlQuery) {
        this.sqlQuery = sqlQuery;
    }

    /**
     * <p>
     * The SQL query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65536<br/>
     *
     * @param sqlQuery <p>
     *            The SQL query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomSql withSqlQuery(String sqlQuery) {
        this.sqlQuery = sqlQuery;
        return this;
    }

    /**
     * <p>
     * The column schema from the SQL query result set.
     * </p>
     *
     * @return <p>
     *         The column schema from the SQL query result set.
     *         </p>
     */
    public java.util.List<InputColumn> getColumns() {
        return columns;
    }

    /**
     * <p>
     * The column schema from the SQL query result set.
     * </p>
     *
     * @param columns <p>
     *            The column schema from the SQL query result set.
     *            </p>
     */
    public void setColumns(java.util.Collection<InputColumn> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<InputColumn>(columns);
    }

    /**
     * <p>
     * The column schema from the SQL query result set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columns <p>
     *            The column schema from the SQL query result set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomSql withColumns(InputColumn... columns) {
        if (getColumns() == null) {
            this.columns = new java.util.ArrayList<InputColumn>(columns.length);
        }
        for (InputColumn value : columns) {
            this.columns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The column schema from the SQL query result set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columns <p>
     *            The column schema from the SQL query result set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomSql withColumns(java.util.Collection<InputColumn> columns) {
        setColumns(columns);
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
        if (getDataSourceArn() != null)
            sb.append("DataSourceArn: " + getDataSourceArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getSqlQuery() != null)
            sb.append("SqlQuery: " + getSqlQuery() + ",");
        if (getColumns() != null)
            sb.append("Columns: " + getColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDataSourceArn() == null) ? 0 : getDataSourceArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSqlQuery() == null) ? 0 : getSqlQuery().hashCode());
        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomSql == false)
            return false;
        CustomSql other = (CustomSql) obj;

        if (other.getDataSourceArn() == null ^ this.getDataSourceArn() == null)
            return false;
        if (other.getDataSourceArn() != null
                && other.getDataSourceArn().equals(this.getDataSourceArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSqlQuery() == null ^ this.getSqlQuery() == null)
            return false;
        if (other.getSqlQuery() != null && other.getSqlQuery().equals(this.getSqlQuery()) == false)
            return false;
        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        return true;
    }
}
