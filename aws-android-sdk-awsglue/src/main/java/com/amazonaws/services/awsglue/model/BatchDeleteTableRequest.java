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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes multiple tables at once.
 * </p>
 * <note>
 * <p>
 * After completing this operation, you no longer have access to the table
 * versions and partitions that belong to the deleted table. AWS Glue deletes
 * these "orphaned" resources asynchronously in a timely manner, at the
 * discretion of the service.
 * </p>
 * <p>
 * To ensure the immediate deletion of all related resources, before calling
 * <code>BatchDeleteTable</code>, use <code>DeleteTableVersion</code> or
 * <code>BatchDeleteTableVersion</code>, and <code>DeletePartition</code> or
 * <code>BatchDeletePartition</code>, to delete any resources that belong to the
 * table.
 * </p>
 * </note>
 */
public class BatchDeleteTableRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the Data Catalog where the table resides. If none is provided,
     * the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String catalogId;

    /**
     * <p>
     * The name of the catalog database in which the tables to delete reside.
     * For Hive compatibility, this name is entirely lowercase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String databaseName;

    /**
     * <p>
     * A list of the table to delete.
     * </p>
     */
    private java.util.List<String> tablesToDelete;

    /**
     * <p>
     * The ID of the Data Catalog where the table resides. If none is provided,
     * the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The ID of the Data Catalog where the table resides. If none is
     *         provided, the AWS account ID is used by default.
     *         </p>
     */
    public String getCatalogId() {
        return catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the table resides. If none is provided,
     * the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogId <p>
     *            The ID of the Data Catalog where the table resides. If none is
     *            provided, the AWS account ID is used by default.
     *            </p>
     */
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the table resides. If none is provided,
     * the AWS account ID is used by default.
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
     *            The ID of the Data Catalog where the table resides. If none is
     *            provided, the AWS account ID is used by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteTableRequest withCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * <p>
     * The name of the catalog database in which the tables to delete reside.
     * For Hive compatibility, this name is entirely lowercase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the catalog database in which the tables to delete
     *         reside. For Hive compatibility, this name is entirely lowercase.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The name of the catalog database in which the tables to delete reside.
     * For Hive compatibility, this name is entirely lowercase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param databaseName <p>
     *            The name of the catalog database in which the tables to delete
     *            reside. For Hive compatibility, this name is entirely
     *            lowercase.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the catalog database in which the tables to delete reside.
     * For Hive compatibility, this name is entirely lowercase.
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
     *            The name of the catalog database in which the tables to delete
     *            reside. For Hive compatibility, this name is entirely
     *            lowercase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteTableRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * A list of the table to delete.
     * </p>
     *
     * @return <p>
     *         A list of the table to delete.
     *         </p>
     */
    public java.util.List<String> getTablesToDelete() {
        return tablesToDelete;
    }

    /**
     * <p>
     * A list of the table to delete.
     * </p>
     *
     * @param tablesToDelete <p>
     *            A list of the table to delete.
     *            </p>
     */
    public void setTablesToDelete(java.util.Collection<String> tablesToDelete) {
        if (tablesToDelete == null) {
            this.tablesToDelete = null;
            return;
        }

        this.tablesToDelete = new java.util.ArrayList<String>(tablesToDelete);
    }

    /**
     * <p>
     * A list of the table to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tablesToDelete <p>
     *            A list of the table to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteTableRequest withTablesToDelete(String... tablesToDelete) {
        if (getTablesToDelete() == null) {
            this.tablesToDelete = new java.util.ArrayList<String>(tablesToDelete.length);
        }
        for (String value : tablesToDelete) {
            this.tablesToDelete.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the table to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tablesToDelete <p>
     *            A list of the table to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteTableRequest withTablesToDelete(java.util.Collection<String> tablesToDelete) {
        setTablesToDelete(tablesToDelete);
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
        if (getTablesToDelete() != null)
            sb.append("TablesToDelete: " + getTablesToDelete());
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
        hashCode = prime * hashCode
                + ((getTablesToDelete() == null) ? 0 : getTablesToDelete().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteTableRequest == false)
            return false;
        BatchDeleteTableRequest other = (BatchDeleteTableRequest) obj;

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
        if (other.getTablesToDelete() == null ^ this.getTablesToDelete() == null)
            return false;
        if (other.getTablesToDelete() != null
                && other.getTablesToDelete().equals(this.getTablesToDelete()) == false)
            return false;
        return true;
    }
}
