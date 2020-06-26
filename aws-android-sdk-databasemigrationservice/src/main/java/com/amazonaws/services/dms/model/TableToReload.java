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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

/**
 * <p>
 * Provides the name of the schema and table to be reloaded.
 * </p>
 */
public class TableToReload implements Serializable {
    /**
     * <p>
     * The schema name of the table to be reloaded.
     * </p>
     */
    private String schemaName;

    /**
     * <p>
     * The table name of the table to be reloaded.
     * </p>
     */
    private String tableName;

    /**
     * <p>
     * The schema name of the table to be reloaded.
     * </p>
     *
     * @return <p>
     *         The schema name of the table to be reloaded.
     *         </p>
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * <p>
     * The schema name of the table to be reloaded.
     * </p>
     *
     * @param schemaName <p>
     *            The schema name of the table to be reloaded.
     *            </p>
     */
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The schema name of the table to be reloaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schemaName <p>
     *            The schema name of the table to be reloaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableToReload withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * <p>
     * The table name of the table to be reloaded.
     * </p>
     *
     * @return <p>
     *         The table name of the table to be reloaded.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The table name of the table to be reloaded.
     * </p>
     *
     * @param tableName <p>
     *            The table name of the table to be reloaded.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The table name of the table to be reloaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableName <p>
     *            The table name of the table to be reloaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableToReload withTableName(String tableName) {
        this.tableName = tableName;
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
        if (getSchemaName() != null)
            sb.append("SchemaName: " + getSchemaName() + ",");
        if (getTableName() != null)
            sb.append("TableName: " + getTableName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableToReload == false)
            return false;
        TableToReload other = (TableToReload) obj;

        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null
                && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        return true;
    }
}
