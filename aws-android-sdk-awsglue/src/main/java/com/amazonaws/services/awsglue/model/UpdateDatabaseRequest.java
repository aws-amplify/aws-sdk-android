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
 * Updates an existing database definition in a Data Catalog.
 * </p>
 */
public class UpdateDatabaseRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the Data Catalog in which the metadata database resides. If
     * none is provided, the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String catalogId;

    /**
     * <p>
     * The name of the database to update in the catalog. For Hive
     * compatibility, this is folded to lowercase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * A <code>DatabaseInput</code> object specifying the new definition of the
     * metadata database in the catalog.
     * </p>
     */
    private DatabaseInput databaseInput;

    /**
     * <p>
     * The ID of the Data Catalog in which the metadata database resides. If
     * none is provided, the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The ID of the Data Catalog in which the metadata database
     *         resides. If none is provided, the AWS account ID is used by
     *         default.
     *         </p>
     */
    public String getCatalogId() {
        return catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the metadata database resides. If
     * none is provided, the AWS account ID is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogId <p>
     *            The ID of the Data Catalog in which the metadata database
     *            resides. If none is provided, the AWS account ID is used by
     *            default.
     *            </p>
     */
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the metadata database resides. If
     * none is provided, the AWS account ID is used by default.
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
     *            The ID of the Data Catalog in which the metadata database
     *            resides. If none is provided, the AWS account ID is used by
     *            default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDatabaseRequest withCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * <p>
     * The name of the database to update in the catalog. For Hive
     * compatibility, this is folded to lowercase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the database to update in the catalog. For Hive
     *         compatibility, this is folded to lowercase.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the database to update in the catalog. For Hive
     * compatibility, this is folded to lowercase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the database to update in the catalog. For Hive
     *            compatibility, this is folded to lowercase.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the database to update in the catalog. For Hive
     * compatibility, this is folded to lowercase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the database to update in the catalog. For Hive
     *            compatibility, this is folded to lowercase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDatabaseRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A <code>DatabaseInput</code> object specifying the new definition of the
     * metadata database in the catalog.
     * </p>
     *
     * @return <p>
     *         A <code>DatabaseInput</code> object specifying the new definition
     *         of the metadata database in the catalog.
     *         </p>
     */
    public DatabaseInput getDatabaseInput() {
        return databaseInput;
    }

    /**
     * <p>
     * A <code>DatabaseInput</code> object specifying the new definition of the
     * metadata database in the catalog.
     * </p>
     *
     * @param databaseInput <p>
     *            A <code>DatabaseInput</code> object specifying the new
     *            definition of the metadata database in the catalog.
     *            </p>
     */
    public void setDatabaseInput(DatabaseInput databaseInput) {
        this.databaseInput = databaseInput;
    }

    /**
     * <p>
     * A <code>DatabaseInput</code> object specifying the new definition of the
     * metadata database in the catalog.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseInput <p>
     *            A <code>DatabaseInput</code> object specifying the new
     *            definition of the metadata database in the catalog.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDatabaseRequest withDatabaseInput(DatabaseInput databaseInput) {
        this.databaseInput = databaseInput;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDatabaseInput() != null)
            sb.append("DatabaseInput: " + getDatabaseInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDatabaseInput() == null) ? 0 : getDatabaseInput().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDatabaseRequest == false)
            return false;
        UpdateDatabaseRequest other = (UpdateDatabaseRequest) obj;

        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null
                && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDatabaseInput() == null ^ this.getDatabaseInput() == null)
            return false;
        if (other.getDatabaseInput() != null
                && other.getDatabaseInput().equals(this.getDatabaseInput()) == false)
            return false;
        return true;
    }
}
