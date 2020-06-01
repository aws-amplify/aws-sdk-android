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
 * Contains metadata for a table.
 * </p>
 */
public class TableMetadata implements Serializable {
    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String name;

    /**
     * <p>
     * The time that the table was created.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The last time the table was accessed.
     * </p>
     */
    private java.util.Date lastAccessTime;

    /**
     * <p>
     * The type of table. In Athena, only <code>EXTERNAL_TABLE</code> is
     * supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String tableType;

    /**
     * <p>
     * A list of the columns in the table.
     * </p>
     */
    private java.util.List<Column> columns;

    /**
     * <p>
     * A list of the partition keys in the table.
     * </p>
     */
    private java.util.List<Column> partitionKeys;

    /**
     * <p>
     * A set of custom key/value pairs for table properties.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The name of the table.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            The name of the table.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            The name of the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The time that the table was created.
     * </p>
     *
     * @return <p>
     *         The time that the table was created.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The time that the table was created.
     * </p>
     *
     * @param createTime <p>
     *            The time that the table was created.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time that the table was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The time that the table was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableMetadata withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The last time the table was accessed.
     * </p>
     *
     * @return <p>
     *         The last time the table was accessed.
     *         </p>
     */
    public java.util.Date getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * <p>
     * The last time the table was accessed.
     * </p>
     *
     * @param lastAccessTime <p>
     *            The last time the table was accessed.
     *            </p>
     */
    public void setLastAccessTime(java.util.Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
     * <p>
     * The last time the table was accessed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastAccessTime <p>
     *            The last time the table was accessed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableMetadata withLastAccessTime(java.util.Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }

    /**
     * <p>
     * The type of table. In Athena, only <code>EXTERNAL_TABLE</code> is
     * supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The type of table. In Athena, only <code>EXTERNAL_TABLE</code> is
     *         supported.
     *         </p>
     */
    public String getTableType() {
        return tableType;
    }

    /**
     * <p>
     * The type of table. In Athena, only <code>EXTERNAL_TABLE</code> is
     * supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param tableType <p>
     *            The type of table. In Athena, only <code>EXTERNAL_TABLE</code>
     *            is supported.
     *            </p>
     */
    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    /**
     * <p>
     * The type of table. In Athena, only <code>EXTERNAL_TABLE</code> is
     * supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param tableType <p>
     *            The type of table. In Athena, only <code>EXTERNAL_TABLE</code>
     *            is supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableMetadata withTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }

    /**
     * <p>
     * A list of the columns in the table.
     * </p>
     *
     * @return <p>
     *         A list of the columns in the table.
     *         </p>
     */
    public java.util.List<Column> getColumns() {
        return columns;
    }

    /**
     * <p>
     * A list of the columns in the table.
     * </p>
     *
     * @param columns <p>
     *            A list of the columns in the table.
     *            </p>
     */
    public void setColumns(java.util.Collection<Column> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<Column>(columns);
    }

    /**
     * <p>
     * A list of the columns in the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columns <p>
     *            A list of the columns in the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableMetadata withColumns(Column... columns) {
        if (getColumns() == null) {
            this.columns = new java.util.ArrayList<Column>(columns.length);
        }
        for (Column value : columns) {
            this.columns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the columns in the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param columns <p>
     *            A list of the columns in the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableMetadata withColumns(java.util.Collection<Column> columns) {
        setColumns(columns);
        return this;
    }

    /**
     * <p>
     * A list of the partition keys in the table.
     * </p>
     *
     * @return <p>
     *         A list of the partition keys in the table.
     *         </p>
     */
    public java.util.List<Column> getPartitionKeys() {
        return partitionKeys;
    }

    /**
     * <p>
     * A list of the partition keys in the table.
     * </p>
     *
     * @param partitionKeys <p>
     *            A list of the partition keys in the table.
     *            </p>
     */
    public void setPartitionKeys(java.util.Collection<Column> partitionKeys) {
        if (partitionKeys == null) {
            this.partitionKeys = null;
            return;
        }

        this.partitionKeys = new java.util.ArrayList<Column>(partitionKeys);
    }

    /**
     * <p>
     * A list of the partition keys in the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitionKeys <p>
     *            A list of the partition keys in the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableMetadata withPartitionKeys(Column... partitionKeys) {
        if (getPartitionKeys() == null) {
            this.partitionKeys = new java.util.ArrayList<Column>(partitionKeys.length);
        }
        for (Column value : partitionKeys) {
            this.partitionKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the partition keys in the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitionKeys <p>
     *            A list of the partition keys in the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableMetadata withPartitionKeys(java.util.Collection<Column> partitionKeys) {
        setPartitionKeys(partitionKeys);
        return this;
    }

    /**
     * <p>
     * A set of custom key/value pairs for table properties.
     * </p>
     *
     * @return <p>
     *         A set of custom key/value pairs for table properties.
     *         </p>
     */
    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A set of custom key/value pairs for table properties.
     * </p>
     *
     * @param parameters <p>
     *            A set of custom key/value pairs for table properties.
     *            </p>
     */
    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A set of custom key/value pairs for table properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A set of custom key/value pairs for table properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableMetadata withParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * A set of custom key/value pairs for table properties.
     * </p>
     * <p>
     * The method adds a new key-value pair into Parameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Parameters.
     * @param value The corresponding value of the entry to be added into
     *            Parameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableMetadata addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public TableMetadata clearParametersEntries() {
        this.parameters = null;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getLastAccessTime() != null)
            sb.append("LastAccessTime: " + getLastAccessTime() + ",");
        if (getTableType() != null)
            sb.append("TableType: " + getTableType() + ",");
        if (getColumns() != null)
            sb.append("Columns: " + getColumns() + ",");
        if (getPartitionKeys() != null)
            sb.append("PartitionKeys: " + getPartitionKeys() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastAccessTime() == null) ? 0 : getLastAccessTime().hashCode());
        hashCode = prime * hashCode + ((getTableType() == null) ? 0 : getTableType().hashCode());
        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        hashCode = prime * hashCode
                + ((getPartitionKeys() == null) ? 0 : getPartitionKeys().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableMetadata == false)
            return false;
        TableMetadata other = (TableMetadata) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getLastAccessTime() == null ^ this.getLastAccessTime() == null)
            return false;
        if (other.getLastAccessTime() != null
                && other.getLastAccessTime().equals(this.getLastAccessTime()) == false)
            return false;
        if (other.getTableType() == null ^ this.getTableType() == null)
            return false;
        if (other.getTableType() != null
                && other.getTableType().equals(this.getTableType()) == false)
            return false;
        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        if (other.getPartitionKeys() == null ^ this.getPartitionKeys() == null)
            return false;
        if (other.getPartitionKeys() != null
                && other.getPartitionKeys().equals(this.getPartitionKeys()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }
}
