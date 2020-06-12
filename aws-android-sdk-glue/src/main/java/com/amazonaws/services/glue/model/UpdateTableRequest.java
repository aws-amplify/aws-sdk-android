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
 * Updates a metadata table in the Data Catalog.
 * </p>
 */
public class UpdateTableRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The name of the catalog database in which the table resides. For Hive
     * compatibility, this name is entirely lowercase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String databaseName;

    /**
     * <p>
     * An updated <code>TableInput</code> object to define the metadata table in
     * the catalog.
     * </p>
     */
    private TableInput tableInput;

    /**
     * <p>
     * By default, <code>UpdateTable</code> always creates an archived version
     * of the table before updating it. However, if <code>skipArchive</code> is
     * set to true, <code>UpdateTable</code> does not create the archived
     * version.
     * </p>
     */
    private Boolean skipArchive;

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
    public UpdateTableRequest withCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * <p>
     * The name of the catalog database in which the table resides. For Hive
     * compatibility, this name is entirely lowercase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the catalog database in which the table resides. For
     *         Hive compatibility, this name is entirely lowercase.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The name of the catalog database in which the table resides. For Hive
     * compatibility, this name is entirely lowercase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param databaseName <p>
     *            The name of the catalog database in which the table resides.
     *            For Hive compatibility, this name is entirely lowercase.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the catalog database in which the table resides. For Hive
     * compatibility, this name is entirely lowercase.
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
     *            The name of the catalog database in which the table resides.
     *            For Hive compatibility, this name is entirely lowercase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTableRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * An updated <code>TableInput</code> object to define the metadata table in
     * the catalog.
     * </p>
     *
     * @return <p>
     *         An updated <code>TableInput</code> object to define the metadata
     *         table in the catalog.
     *         </p>
     */
    public TableInput getTableInput() {
        return tableInput;
    }

    /**
     * <p>
     * An updated <code>TableInput</code> object to define the metadata table in
     * the catalog.
     * </p>
     *
     * @param tableInput <p>
     *            An updated <code>TableInput</code> object to define the
     *            metadata table in the catalog.
     *            </p>
     */
    public void setTableInput(TableInput tableInput) {
        this.tableInput = tableInput;
    }

    /**
     * <p>
     * An updated <code>TableInput</code> object to define the metadata table in
     * the catalog.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableInput <p>
     *            An updated <code>TableInput</code> object to define the
     *            metadata table in the catalog.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTableRequest withTableInput(TableInput tableInput) {
        this.tableInput = tableInput;
        return this;
    }

    /**
     * <p>
     * By default, <code>UpdateTable</code> always creates an archived version
     * of the table before updating it. However, if <code>skipArchive</code> is
     * set to true, <code>UpdateTable</code> does not create the archived
     * version.
     * </p>
     *
     * @return <p>
     *         By default, <code>UpdateTable</code> always creates an archived
     *         version of the table before updating it. However, if
     *         <code>skipArchive</code> is set to true, <code>UpdateTable</code>
     *         does not create the archived version.
     *         </p>
     */
    public Boolean isSkipArchive() {
        return skipArchive;
    }

    /**
     * <p>
     * By default, <code>UpdateTable</code> always creates an archived version
     * of the table before updating it. However, if <code>skipArchive</code> is
     * set to true, <code>UpdateTable</code> does not create the archived
     * version.
     * </p>
     *
     * @return <p>
     *         By default, <code>UpdateTable</code> always creates an archived
     *         version of the table before updating it. However, if
     *         <code>skipArchive</code> is set to true, <code>UpdateTable</code>
     *         does not create the archived version.
     *         </p>
     */
    public Boolean getSkipArchive() {
        return skipArchive;
    }

    /**
     * <p>
     * By default, <code>UpdateTable</code> always creates an archived version
     * of the table before updating it. However, if <code>skipArchive</code> is
     * set to true, <code>UpdateTable</code> does not create the archived
     * version.
     * </p>
     *
     * @param skipArchive <p>
     *            By default, <code>UpdateTable</code> always creates an
     *            archived version of the table before updating it. However, if
     *            <code>skipArchive</code> is set to true,
     *            <code>UpdateTable</code> does not create the archived version.
     *            </p>
     */
    public void setSkipArchive(Boolean skipArchive) {
        this.skipArchive = skipArchive;
    }

    /**
     * <p>
     * By default, <code>UpdateTable</code> always creates an archived version
     * of the table before updating it. However, if <code>skipArchive</code> is
     * set to true, <code>UpdateTable</code> does not create the archived
     * version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skipArchive <p>
     *            By default, <code>UpdateTable</code> always creates an
     *            archived version of the table before updating it. However, if
     *            <code>skipArchive</code> is set to true,
     *            <code>UpdateTable</code> does not create the archived version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTableRequest withSkipArchive(Boolean skipArchive) {
        this.skipArchive = skipArchive;
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
        if (getTableInput() != null)
            sb.append("TableInput: " + getTableInput() + ",");
        if (getSkipArchive() != null)
            sb.append("SkipArchive: " + getSkipArchive());
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
        hashCode = prime * hashCode + ((getTableInput() == null) ? 0 : getTableInput().hashCode());
        hashCode = prime * hashCode
                + ((getSkipArchive() == null) ? 0 : getSkipArchive().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTableRequest == false)
            return false;
        UpdateTableRequest other = (UpdateTableRequest) obj;

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
        if (other.getTableInput() == null ^ this.getTableInput() == null)
            return false;
        if (other.getTableInput() != null
                && other.getTableInput().equals(this.getTableInput()) == false)
            return false;
        if (other.getSkipArchive() == null ^ this.getSkipArchive() == null)
            return false;
        if (other.getSkipArchive() != null
                && other.getSkipArchive().equals(this.getSkipArchive()) == false)
            return false;
        return true;
    }
}
