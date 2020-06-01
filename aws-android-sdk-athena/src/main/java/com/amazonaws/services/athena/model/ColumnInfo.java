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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the columns in a query execution result.
 * </p>
 */
public class ColumnInfo implements Serializable {
    /**
     * <p>
     * The catalog to which the query results belong.
     * </p>
     */
    private String catalogName;

    /**
     * <p>
     * The schema name (database name) to which the query results belong.
     * </p>
     */
    private String schemaName;

    /**
     * <p>
     * The table name for the query results.
     * </p>
     */
    private String tableName;

    /**
     * <p>
     * The name of the column.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A column label.
     * </p>
     */
    private String label;

    /**
     * <p>
     * The data type of the column.
     * </p>
     */
    private String type;

    /**
     * <p>
     * For <code>DECIMAL</code> data types, specifies the total number of
     * digits, up to 38. For performance reasons, we recommend up to 18 digits.
     * </p>
     */
    private Integer precision;

    /**
     * <p>
     * For <code>DECIMAL</code> data types, specifies the total number of digits
     * in the fractional part of the value. Defaults to 0.
     * </p>
     */
    private Integer scale;

    /**
     * <p>
     * Indicates the column's nullable status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_NULL, NULLABLE, UNKNOWN
     */
    private String nullable;

    /**
     * <p>
     * Indicates whether values in the column are case-sensitive.
     * </p>
     */
    private Boolean caseSensitive;

    /**
     * <p>
     * The catalog to which the query results belong.
     * </p>
     *
     * @return <p>
     *         The catalog to which the query results belong.
     *         </p>
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * <p>
     * The catalog to which the query results belong.
     * </p>
     *
     * @param catalogName <p>
     *            The catalog to which the query results belong.
     *            </p>
     */
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    /**
     * <p>
     * The catalog to which the query results belong.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param catalogName <p>
     *            The catalog to which the query results belong.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnInfo withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * <p>
     * The schema name (database name) to which the query results belong.
     * </p>
     *
     * @return <p>
     *         The schema name (database name) to which the query results
     *         belong.
     *         </p>
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * <p>
     * The schema name (database name) to which the query results belong.
     * </p>
     *
     * @param schemaName <p>
     *            The schema name (database name) to which the query results
     *            belong.
     *            </p>
     */
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The schema name (database name) to which the query results belong.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schemaName <p>
     *            The schema name (database name) to which the query results
     *            belong.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnInfo withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * <p>
     * The table name for the query results.
     * </p>
     *
     * @return <p>
     *         The table name for the query results.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The table name for the query results.
     * </p>
     *
     * @param tableName <p>
     *            The table name for the query results.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The table name for the query results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableName <p>
     *            The table name for the query results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnInfo withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     *
     * @return <p>
     *         The name of the column.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     *
     * @param name <p>
     *            The name of the column.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A column label.
     * </p>
     *
     * @return <p>
     *         A column label.
     *         </p>
     */
    public String getLabel() {
        return label;
    }

    /**
     * <p>
     * A column label.
     * </p>
     *
     * @param label <p>
     *            A column label.
     *            </p>
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * A column label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param label <p>
     *            A column label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnInfo withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * <p>
     * The data type of the column.
     * </p>
     *
     * @return <p>
     *         The data type of the column.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The data type of the column.
     * </p>
     *
     * @param type <p>
     *            The data type of the column.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The data type of the column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The data type of the column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * For <code>DECIMAL</code> data types, specifies the total number of
     * digits, up to 38. For performance reasons, we recommend up to 18 digits.
     * </p>
     *
     * @return <p>
     *         For <code>DECIMAL</code> data types, specifies the total number
     *         of digits, up to 38. For performance reasons, we recommend up to
     *         18 digits.
     *         </p>
     */
    public Integer getPrecision() {
        return precision;
    }

    /**
     * <p>
     * For <code>DECIMAL</code> data types, specifies the total number of
     * digits, up to 38. For performance reasons, we recommend up to 18 digits.
     * </p>
     *
     * @param precision <p>
     *            For <code>DECIMAL</code> data types, specifies the total
     *            number of digits, up to 38. For performance reasons, we
     *            recommend up to 18 digits.
     *            </p>
     */
    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    /**
     * <p>
     * For <code>DECIMAL</code> data types, specifies the total number of
     * digits, up to 38. For performance reasons, we recommend up to 18 digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param precision <p>
     *            For <code>DECIMAL</code> data types, specifies the total
     *            number of digits, up to 38. For performance reasons, we
     *            recommend up to 18 digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnInfo withPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }

    /**
     * <p>
     * For <code>DECIMAL</code> data types, specifies the total number of digits
     * in the fractional part of the value. Defaults to 0.
     * </p>
     *
     * @return <p>
     *         For <code>DECIMAL</code> data types, specifies the total number
     *         of digits in the fractional part of the value. Defaults to 0.
     *         </p>
     */
    public Integer getScale() {
        return scale;
    }

    /**
     * <p>
     * For <code>DECIMAL</code> data types, specifies the total number of digits
     * in the fractional part of the value. Defaults to 0.
     * </p>
     *
     * @param scale <p>
     *            For <code>DECIMAL</code> data types, specifies the total
     *            number of digits in the fractional part of the value. Defaults
     *            to 0.
     *            </p>
     */
    public void setScale(Integer scale) {
        this.scale = scale;
    }

    /**
     * <p>
     * For <code>DECIMAL</code> data types, specifies the total number of digits
     * in the fractional part of the value. Defaults to 0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scale <p>
     *            For <code>DECIMAL</code> data types, specifies the total
     *            number of digits in the fractional part of the value. Defaults
     *            to 0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnInfo withScale(Integer scale) {
        this.scale = scale;
        return this;
    }

    /**
     * <p>
     * Indicates the column's nullable status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_NULL, NULLABLE, UNKNOWN
     *
     * @return <p>
     *         Indicates the column's nullable status.
     *         </p>
     * @see ColumnNullable
     */
    public String getNullable() {
        return nullable;
    }

    /**
     * <p>
     * Indicates the column's nullable status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_NULL, NULLABLE, UNKNOWN
     *
     * @param nullable <p>
     *            Indicates the column's nullable status.
     *            </p>
     * @see ColumnNullable
     */
    public void setNullable(String nullable) {
        this.nullable = nullable;
    }

    /**
     * <p>
     * Indicates the column's nullable status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_NULL, NULLABLE, UNKNOWN
     *
     * @param nullable <p>
     *            Indicates the column's nullable status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ColumnNullable
     */
    public ColumnInfo withNullable(String nullable) {
        this.nullable = nullable;
        return this;
    }

    /**
     * <p>
     * Indicates the column's nullable status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_NULL, NULLABLE, UNKNOWN
     *
     * @param nullable <p>
     *            Indicates the column's nullable status.
     *            </p>
     * @see ColumnNullable
     */
    public void setNullable(ColumnNullable nullable) {
        this.nullable = nullable.toString();
    }

    /**
     * <p>
     * Indicates the column's nullable status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_NULL, NULLABLE, UNKNOWN
     *
     * @param nullable <p>
     *            Indicates the column's nullable status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ColumnNullable
     */
    public ColumnInfo withNullable(ColumnNullable nullable) {
        this.nullable = nullable.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether values in the column are case-sensitive.
     * </p>
     *
     * @return <p>
     *         Indicates whether values in the column are case-sensitive.
     *         </p>
     */
    public Boolean isCaseSensitive() {
        return caseSensitive;
    }

    /**
     * <p>
     * Indicates whether values in the column are case-sensitive.
     * </p>
     *
     * @return <p>
     *         Indicates whether values in the column are case-sensitive.
     *         </p>
     */
    public Boolean getCaseSensitive() {
        return caseSensitive;
    }

    /**
     * <p>
     * Indicates whether values in the column are case-sensitive.
     * </p>
     *
     * @param caseSensitive <p>
     *            Indicates whether values in the column are case-sensitive.
     *            </p>
     */
    public void setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    /**
     * <p>
     * Indicates whether values in the column are case-sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param caseSensitive <p>
     *            Indicates whether values in the column are case-sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnInfo withCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
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
        if (getCatalogName() != null)
            sb.append("CatalogName: " + getCatalogName() + ",");
        if (getSchemaName() != null)
            sb.append("SchemaName: " + getSchemaName() + ",");
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getLabel() != null)
            sb.append("Label: " + getLabel() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getPrecision() != null)
            sb.append("Precision: " + getPrecision() + ",");
        if (getScale() != null)
            sb.append("Scale: " + getScale() + ",");
        if (getNullable() != null)
            sb.append("Nullable: " + getNullable() + ",");
        if (getCaseSensitive() != null)
            sb.append("CaseSensitive: " + getCaseSensitive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCatalogName() == null) ? 0 : getCatalogName().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPrecision() == null) ? 0 : getPrecision().hashCode());
        hashCode = prime * hashCode + ((getScale() == null) ? 0 : getScale().hashCode());
        hashCode = prime * hashCode + ((getNullable() == null) ? 0 : getNullable().hashCode());
        hashCode = prime * hashCode
                + ((getCaseSensitive() == null) ? 0 : getCaseSensitive().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnInfo == false)
            return false;
        ColumnInfo other = (ColumnInfo) obj;

        if (other.getCatalogName() == null ^ this.getCatalogName() == null)
            return false;
        if (other.getCatalogName() != null
                && other.getCatalogName().equals(this.getCatalogName()) == false)
            return false;
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPrecision() == null ^ this.getPrecision() == null)
            return false;
        if (other.getPrecision() != null
                && other.getPrecision().equals(this.getPrecision()) == false)
            return false;
        if (other.getScale() == null ^ this.getScale() == null)
            return false;
        if (other.getScale() != null && other.getScale().equals(this.getScale()) == false)
            return false;
        if (other.getNullable() == null ^ this.getNullable() == null)
            return false;
        if (other.getNullable() != null && other.getNullable().equals(this.getNullable()) == false)
            return false;
        if (other.getCaseSensitive() == null ^ this.getCaseSensitive() == null)
            return false;
        if (other.getCaseSensitive() != null
                && other.getCaseSensitive().equals(this.getCaseSensitive()) == false)
            return false;
        return true;
    }
}
