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
 * Represents a slice of table data.
 * </p>
 */
public class Partition implements Serializable {
    /**
     * <p>
     * The values of the partition.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name of the catalog database in which to create the partition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String databaseName;

    /**
     * <p>
     * The name of the database table in which to create the partition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String tableName;

    /**
     * <p>
     * The time at which the partition was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The last time at which the partition was accessed.
     * </p>
     */
    private java.util.Date lastAccessTime;

    /**
     * <p>
     * Provides information about the physical location where the partition is
     * stored.
     * </p>
     */
    private StorageDescriptor storageDescriptor;

    /**
     * <p>
     * These key-value pairs define partition parameters.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The last time at which column statistics were computed for this
     * partition.
     * </p>
     */
    private java.util.Date lastAnalyzedTime;

    /**
     * <p>
     * The values of the partition.
     * </p>
     *
     * @return <p>
     *         The values of the partition.
     *         </p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The values of the partition.
     * </p>
     *
     * @param values <p>
     *            The values of the partition.
     *            </p>
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The values of the partition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The values of the partition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Partition withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The values of the partition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The values of the partition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Partition withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The name of the catalog database in which to create the partition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the catalog database in which to create the
     *         partition.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The name of the catalog database in which to create the partition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param databaseName <p>
     *            The name of the catalog database in which to create the
     *            partition.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the catalog database in which to create the partition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param databaseName <p>
     *            The name of the catalog database in which to create the
     *            partition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Partition withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * The name of the database table in which to create the partition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the database table in which to create the partition.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the database table in which to create the partition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param tableName <p>
     *            The name of the database table in which to create the
     *            partition.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the database table in which to create the partition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param tableName <p>
     *            The name of the database table in which to create the
     *            partition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Partition withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * The time at which the partition was created.
     * </p>
     *
     * @return <p>
     *         The time at which the partition was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time at which the partition was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time at which the partition was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the partition was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time at which the partition was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Partition withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The last time at which the partition was accessed.
     * </p>
     *
     * @return <p>
     *         The last time at which the partition was accessed.
     *         </p>
     */
    public java.util.Date getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * <p>
     * The last time at which the partition was accessed.
     * </p>
     *
     * @param lastAccessTime <p>
     *            The last time at which the partition was accessed.
     *            </p>
     */
    public void setLastAccessTime(java.util.Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
     * <p>
     * The last time at which the partition was accessed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastAccessTime <p>
     *            The last time at which the partition was accessed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Partition withLastAccessTime(java.util.Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }

    /**
     * <p>
     * Provides information about the physical location where the partition is
     * stored.
     * </p>
     *
     * @return <p>
     *         Provides information about the physical location where the
     *         partition is stored.
     *         </p>
     */
    public StorageDescriptor getStorageDescriptor() {
        return storageDescriptor;
    }

    /**
     * <p>
     * Provides information about the physical location where the partition is
     * stored.
     * </p>
     *
     * @param storageDescriptor <p>
     *            Provides information about the physical location where the
     *            partition is stored.
     *            </p>
     */
    public void setStorageDescriptor(StorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
    }

    /**
     * <p>
     * Provides information about the physical location where the partition is
     * stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageDescriptor <p>
     *            Provides information about the physical location where the
     *            partition is stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Partition withStorageDescriptor(StorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
        return this;
    }

    /**
     * <p>
     * These key-value pairs define partition parameters.
     * </p>
     *
     * @return <p>
     *         These key-value pairs define partition parameters.
     *         </p>
     */
    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * These key-value pairs define partition parameters.
     * </p>
     *
     * @param parameters <p>
     *            These key-value pairs define partition parameters.
     *            </p>
     */
    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * These key-value pairs define partition parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            These key-value pairs define partition parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Partition withParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * These key-value pairs define partition parameters.
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
    public Partition addParametersEntry(String key, String value) {
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
    public Partition clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The last time at which column statistics were computed for this
     * partition.
     * </p>
     *
     * @return <p>
     *         The last time at which column statistics were computed for this
     *         partition.
     *         </p>
     */
    public java.util.Date getLastAnalyzedTime() {
        return lastAnalyzedTime;
    }

    /**
     * <p>
     * The last time at which column statistics were computed for this
     * partition.
     * </p>
     *
     * @param lastAnalyzedTime <p>
     *            The last time at which column statistics were computed for
     *            this partition.
     *            </p>
     */
    public void setLastAnalyzedTime(java.util.Date lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
    }

    /**
     * <p>
     * The last time at which column statistics were computed for this
     * partition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastAnalyzedTime <p>
     *            The last time at which column statistics were computed for
     *            this partition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Partition withLastAnalyzedTime(java.util.Date lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
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
        if (getValues() != null)
            sb.append("Values: " + getValues() + ",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastAccessTime() != null)
            sb.append("LastAccessTime: " + getLastAccessTime() + ",");
        if (getStorageDescriptor() != null)
            sb.append("StorageDescriptor: " + getStorageDescriptor() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getLastAnalyzedTime() != null)
            sb.append("LastAnalyzedTime: " + getLastAnalyzedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastAccessTime() == null) ? 0 : getLastAccessTime().hashCode());
        hashCode = prime * hashCode
                + ((getStorageDescriptor() == null) ? 0 : getStorageDescriptor().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getLastAnalyzedTime() == null) ? 0 : getLastAnalyzedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Partition == false)
            return false;
        Partition other = (Partition) obj;

        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
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
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastAccessTime() == null ^ this.getLastAccessTime() == null)
            return false;
        if (other.getLastAccessTime() != null
                && other.getLastAccessTime().equals(this.getLastAccessTime()) == false)
            return false;
        if (other.getStorageDescriptor() == null ^ this.getStorageDescriptor() == null)
            return false;
        if (other.getStorageDescriptor() != null
                && other.getStorageDescriptor().equals(this.getStorageDescriptor()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getLastAnalyzedTime() == null ^ this.getLastAnalyzedTime() == null)
            return false;
        if (other.getLastAnalyzedTime() != null
                && other.getLastAnalyzedTime().equals(this.getLastAnalyzedTime()) == false)
            return false;
        return true;
    }
}
