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
 * A physical table type for relational data sources.
 * </p>
 */
public class RelationalTable implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the data source.
     * </p>
     */
    private String dataSourceArn;

    /**
     * <p>
     * The schema name. This name applies to certain relational database
     * engines.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String schema;

    /**
     * <p>
     * The name of the relational table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String name;

    /**
     * <p>
     * The column schema of the table.
     * </p>
     */
    private java.util.List<InputColumn> inputColumns;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the data source.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the data source.
     *         </p>
     */
    public String getDataSourceArn() {
        return dataSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the data source.
     * </p>
     *
     * @param dataSourceArn <p>
     *            The Amazon Resource Name (ARN) for the data source.
     *            </p>
     */
    public void setDataSourceArn(String dataSourceArn) {
        this.dataSourceArn = dataSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSourceArn <p>
     *            The Amazon Resource Name (ARN) for the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalTable withDataSourceArn(String dataSourceArn) {
        this.dataSourceArn = dataSourceArn;
        return this;
    }

    /**
     * <p>
     * The schema name. This name applies to certain relational database
     * engines.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The schema name. This name applies to certain relational database
     *         engines.
     *         </p>
     */
    public String getSchema() {
        return schema;
    }

    /**
     * <p>
     * The schema name. This name applies to certain relational database
     * engines.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param schema <p>
     *            The schema name. This name applies to certain relational
     *            database engines.
     *            </p>
     */
    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The schema name. This name applies to certain relational database
     * engines.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param schema <p>
     *            The schema name. This name applies to certain relational
     *            database engines.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalTable withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * <p>
     * The name of the relational table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The name of the relational table.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the relational table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            The name of the relational table.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the relational table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            The name of the relational table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalTable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The column schema of the table.
     * </p>
     *
     * @return <p>
     *         The column schema of the table.
     *         </p>
     */
    public java.util.List<InputColumn> getInputColumns() {
        return inputColumns;
    }

    /**
     * <p>
     * The column schema of the table.
     * </p>
     *
     * @param inputColumns <p>
     *            The column schema of the table.
     *            </p>
     */
    public void setInputColumns(java.util.Collection<InputColumn> inputColumns) {
        if (inputColumns == null) {
            this.inputColumns = null;
            return;
        }

        this.inputColumns = new java.util.ArrayList<InputColumn>(inputColumns);
    }

    /**
     * <p>
     * The column schema of the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputColumns <p>
     *            The column schema of the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalTable withInputColumns(InputColumn... inputColumns) {
        if (getInputColumns() == null) {
            this.inputColumns = new java.util.ArrayList<InputColumn>(inputColumns.length);
        }
        for (InputColumn value : inputColumns) {
            this.inputColumns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The column schema of the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputColumns <p>
     *            The column schema of the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalTable withInputColumns(java.util.Collection<InputColumn> inputColumns) {
        setInputColumns(inputColumns);
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
        if (getSchema() != null)
            sb.append("Schema: " + getSchema() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getInputColumns() != null)
            sb.append("InputColumns: " + getInputColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDataSourceArn() == null) ? 0 : getDataSourceArn().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getInputColumns() == null) ? 0 : getInputColumns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelationalTable == false)
            return false;
        RelationalTable other = (RelationalTable) obj;

        if (other.getDataSourceArn() == null ^ this.getDataSourceArn() == null)
            return false;
        if (other.getDataSourceArn() != null
                && other.getDataSourceArn().equals(this.getDataSourceArn()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputColumns() == null ^ this.getInputColumns() == null)
            return false;
        if (other.getInputColumns() != null
                && other.getInputColumns().equals(this.getInputColumns()) == false)
            return false;
        return true;
    }
}
