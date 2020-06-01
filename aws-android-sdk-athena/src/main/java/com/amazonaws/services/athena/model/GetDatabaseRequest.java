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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a database object for the specfied database and data catalog.
 * </p>
 */
public class GetDatabaseRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the data catalog that contains the database to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String catalogName;

    /**
     * <p>
     * The name of the database to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String databaseName;

    /**
     * <p>
     * The name of the data catalog that contains the database to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the data catalog that contains the database to
     *         return.
     *         </p>
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * <p>
     * The name of the data catalog that contains the database to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogName <p>
     *            The name of the data catalog that contains the database to
     *            return.
     *            </p>
     */
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    /**
     * <p>
     * The name of the data catalog that contains the database to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param catalogName <p>
     *            The name of the data catalog that contains the database to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDatabaseRequest withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * <p>
     * The name of the database to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The name of the database to return.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The name of the database to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param databaseName <p>
     *            The name of the database to return.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param databaseName <p>
     *            The name of the database to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDatabaseRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCatalogName() == null) ? 0 : getCatalogName().hashCode());
        hashCode = prime * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDatabaseRequest == false)
            return false;
        GetDatabaseRequest other = (GetDatabaseRequest) obj;

        if (other.getCatalogName() == null ^ this.getCatalogName() == null)
            return false;
        if (other.getCatalogName() != null
                && other.getCatalogName().equals(this.getCatalogName()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null
                && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        return true;
    }
}
