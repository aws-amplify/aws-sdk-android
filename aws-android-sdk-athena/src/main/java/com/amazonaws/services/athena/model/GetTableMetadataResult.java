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

public class GetTableMetadataResult implements Serializable {
    /**
     * <p>
     * An object that contains table metadata.
     * </p>
     */
    private TableMetadata tableMetadata;

    /**
     * <p>
     * An object that contains table metadata.
     * </p>
     *
     * @return <p>
     *         An object that contains table metadata.
     *         </p>
     */
    public TableMetadata getTableMetadata() {
        return tableMetadata;
    }

    /**
     * <p>
     * An object that contains table metadata.
     * </p>
     *
     * @param tableMetadata <p>
     *            An object that contains table metadata.
     *            </p>
     */
    public void setTableMetadata(TableMetadata tableMetadata) {
        this.tableMetadata = tableMetadata;
    }

    /**
     * <p>
     * An object that contains table metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableMetadata <p>
     *            An object that contains table metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTableMetadataResult withTableMetadata(TableMetadata tableMetadata) {
        this.tableMetadata = tableMetadata;
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
        if (getTableMetadata() != null)
            sb.append("TableMetadata: " + getTableMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTableMetadata() == null) ? 0 : getTableMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTableMetadataResult == false)
            return false;
        GetTableMetadataResult other = (GetTableMetadataResult) obj;

        if (other.getTableMetadata() == null ^ this.getTableMetadata() == null)
            return false;
        if (other.getTableMetadata() != null
                && other.getTableMetadata().equals(this.getTableMetadata()) == false)
            return false;
        return true;
    }
}
