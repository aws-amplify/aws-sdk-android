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
 * Specifies a version of a table.
 * </p>
 */
public class TableVersion implements Serializable {
    /**
     * <p>
     * The table in question.
     * </p>
     */
    private Table table;

    /**
     * <p>
     * The ID value that identifies this table version. A <code>VersionId</code>
     * is a string representation of an integer. Each version is incremented by
     * 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String versionId;

    /**
     * <p>
     * The table in question.
     * </p>
     *
     * @return <p>
     *         The table in question.
     *         </p>
     */
    public Table getTable() {
        return table;
    }

    /**
     * <p>
     * The table in question.
     * </p>
     *
     * @param table <p>
     *            The table in question.
     *            </p>
     */
    public void setTable(Table table) {
        this.table = table;
    }

    /**
     * <p>
     * The table in question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param table <p>
     *            The table in question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableVersion withTable(Table table) {
        this.table = table;
        return this;
    }

    /**
     * <p>
     * The ID value that identifies this table version. A <code>VersionId</code>
     * is a string representation of an integer. Each version is incremented by
     * 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The ID value that identifies this table version. A
     *         <code>VersionId</code> is a string representation of an integer.
     *         Each version is incremented by 1.
     *         </p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>
     * The ID value that identifies this table version. A <code>VersionId</code>
     * is a string representation of an integer. Each version is incremented by
     * 1.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param versionId <p>
     *            The ID value that identifies this table version. A
     *            <code>VersionId</code> is a string representation of an
     *            integer. Each version is incremented by 1.
     *            </p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The ID value that identifies this table version. A <code>VersionId</code>
     * is a string representation of an integer. Each version is incremented by
     * 1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param versionId <p>
     *            The ID value that identifies this table version. A
     *            <code>VersionId</code> is a string representation of an
     *            integer. Each version is incremented by 1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableVersion withVersionId(String versionId) {
        this.versionId = versionId;
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
        if (getTable() != null)
            sb.append("Table: " + getTable() + ",");
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableVersion == false)
            return false;
        TableVersion other = (TableVersion) obj;

        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }
}
