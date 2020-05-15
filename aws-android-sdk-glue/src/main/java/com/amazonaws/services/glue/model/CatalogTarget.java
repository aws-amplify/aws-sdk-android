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

/**
 * <p>
 * Specifies an AWS Glue Data Catalog target.
 * </p>
 */
public class CatalogTarget implements Serializable {
    /**
     * <p>
     * The name of the database to be synchronized.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String databaseName;

    /**
     * <p>
     * A list of the tables to be synchronized.
     * </p>
     */
    private java.util.List<String> tables;

    /**
     * <p>
     * The name of the database to be synchronized.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the database to be synchronized.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The name of the database to be synchronized.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param databaseName <p>
     *            The name of the database to be synchronized.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database to be synchronized.
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
     *            The name of the database to be synchronized.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CatalogTarget withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * A list of the tables to be synchronized.
     * </p>
     *
     * @return <p>
     *         A list of the tables to be synchronized.
     *         </p>
     */
    public java.util.List<String> getTables() {
        return tables;
    }

    /**
     * <p>
     * A list of the tables to be synchronized.
     * </p>
     *
     * @param tables <p>
     *            A list of the tables to be synchronized.
     *            </p>
     */
    public void setTables(java.util.Collection<String> tables) {
        if (tables == null) {
            this.tables = null;
            return;
        }

        this.tables = new java.util.ArrayList<String>(tables);
    }

    /**
     * <p>
     * A list of the tables to be synchronized.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tables <p>
     *            A list of the tables to be synchronized.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CatalogTarget withTables(String... tables) {
        if (getTables() == null) {
            this.tables = new java.util.ArrayList<String>(tables.length);
        }
        for (String value : tables) {
            this.tables.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the tables to be synchronized.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tables <p>
     *            A list of the tables to be synchronized.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CatalogTarget withTables(java.util.Collection<String> tables) {
        setTables(tables);
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getTables() != null)
            sb.append("Tables: " + getTables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTables() == null) ? 0 : getTables().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CatalogTarget == false)
            return false;
        CatalogTarget other = (CatalogTarget) obj;

        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null
                && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTables() == null ^ this.getTables() == null)
            return false;
        if (other.getTables() != null && other.getTables().equals(this.getTables()) == false)
            return false;
        return true;
    }
}
