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

public class GetDatabaseResult implements Serializable {
    /**
     * <p>
     * The definition of the specified database in the Data Catalog.
     * </p>
     */
    private Database database;

    /**
     * <p>
     * The definition of the specified database in the Data Catalog.
     * </p>
     *
     * @return <p>
     *         The definition of the specified database in the Data Catalog.
     *         </p>
     */
    public Database getDatabase() {
        return database;
    }

    /**
     * <p>
     * The definition of the specified database in the Data Catalog.
     * </p>
     *
     * @param database <p>
     *            The definition of the specified database in the Data Catalog.
     *            </p>
     */
    public void setDatabase(Database database) {
        this.database = database;
    }

    /**
     * <p>
     * The definition of the specified database in the Data Catalog.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param database <p>
     *            The definition of the specified database in the Data Catalog.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDatabaseResult withDatabase(Database database) {
        this.database = database;
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
        if (getDatabase() != null)
            sb.append("Database: " + getDatabase());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDatabaseResult == false)
            return false;
        GetDatabaseResult other = (GetDatabaseResult) obj;

        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        return true;
    }
}
