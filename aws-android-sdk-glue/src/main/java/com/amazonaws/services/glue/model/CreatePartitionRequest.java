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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new partition.
 * </p>
 */
public class CreatePartitionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The AWS account ID of the catalog in which the partition is to be
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String catalogId;

    /**
     * <p>
     * The name of the metadata database in which the partition is to be
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String databaseName;

    /**
     * <p>
     * The name of the metadata table in which the partition is to be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String tableName;

    /**
     * <p>
     * A <code>PartitionInput</code> structure defining the partition to be
     * created.
     * </p>
     */
    private PartitionInput partitionInput;

    /**
     * <p>
     * The AWS account ID of the catalog in which the partition is to be
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The AWS account ID of the catalog in which the partition is to be
     *         created.
     *         </p>
     */
    public String getCatalogId() {
        return catalogId;
    }

    /**
     * <p>
     * The AWS account ID of the catalog in which the partition is to be
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogId <p>
     *            The AWS account ID of the catalog in which the partition is to
     *            be created.
     *            </p>
     */
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The AWS account ID of the catalog in which the partition is to be
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogId <p>
     *            The AWS account ID of the catalog in which the partition is to
     *            be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePartitionRequest withCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * <p>
     * The name of the metadata database in which the partition is to be
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the metadata database in which the partition is to be
     *         created.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The name of the metadata database in which the partition is to be
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param databaseName <p>
     *            The name of the metadata database in which the partition is to
     *            be created.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the metadata database in which the partition is to be
     * created.
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
     *            The name of the metadata database in which the partition is to
     *            be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePartitionRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * The name of the metadata table in which the partition is to be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the metadata table in which the partition is to be
     *         created.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the metadata table in which the partition is to be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param tableName <p>
     *            The name of the metadata table in which the partition is to be
     *            created.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the metadata table in which the partition is to be created.
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
     *            The name of the metadata table in which the partition is to be
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePartitionRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * A <code>PartitionInput</code> structure defining the partition to be
     * created.
     * </p>
     *
     * @return <p>
     *         A <code>PartitionInput</code> structure defining the partition to
     *         be created.
     *         </p>
     */
    public PartitionInput getPartitionInput() {
        return partitionInput;
    }

    /**
     * <p>
     * A <code>PartitionInput</code> structure defining the partition to be
     * created.
     * </p>
     *
     * @param partitionInput <p>
     *            A <code>PartitionInput</code> structure defining the partition
     *            to be created.
     *            </p>
     */
    public void setPartitionInput(PartitionInput partitionInput) {
        this.partitionInput = partitionInput;
    }

    /**
     * <p>
     * A <code>PartitionInput</code> structure defining the partition to be
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitionInput <p>
     *            A <code>PartitionInput</code> structure defining the partition
     *            to be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePartitionRequest withPartitionInput(PartitionInput partitionInput) {
        this.partitionInput = partitionInput;
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
        if (getCatalogId() != null)
            sb.append("CatalogId: " + getCatalogId() + ",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getPartitionInput() != null)
            sb.append("PartitionInput: " + getPartitionInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode
                + ((getPartitionInput() == null) ? 0 : getPartitionInput().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePartitionRequest == false)
            return false;
        CreatePartitionRequest other = (CreatePartitionRequest) obj;

        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null
                && other.getCatalogId().equals(this.getCatalogId()) == false)
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
        if (other.getPartitionInput() == null ^ this.getPartitionInput() == null)
            return false;
        if (other.getPartitionInput() != null
                && other.getPartitionInput().equals(this.getPartitionInput()) == false)
            return false;
        return true;
    }
}
