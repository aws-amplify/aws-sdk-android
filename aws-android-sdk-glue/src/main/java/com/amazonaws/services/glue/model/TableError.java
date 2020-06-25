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
 * An error record for table operations.
 * </p>
 */
public class TableError implements Serializable {
    /**
     * <p>
     * The name of the table. For Hive compatibility, this must be entirely
     * lowercase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String tableName;

    /**
     * <p>
     * The details about the error.
     * </p>
     */
    private ErrorDetail errorDetail;

    /**
     * <p>
     * The name of the table. For Hive compatibility, this must be entirely
     * lowercase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the table. For Hive compatibility, this must be
     *         entirely lowercase.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the table. For Hive compatibility, this must be entirely
     * lowercase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param tableName <p>
     *            The name of the table. For Hive compatibility, this must be
     *            entirely lowercase.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table. For Hive compatibility, this must be entirely
     * lowercase.
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
     *            The name of the table. For Hive compatibility, this must be
     *            entirely lowercase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableError withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * The details about the error.
     * </p>
     *
     * @return <p>
     *         The details about the error.
     *         </p>
     */
    public ErrorDetail getErrorDetail() {
        return errorDetail;
    }

    /**
     * <p>
     * The details about the error.
     * </p>
     *
     * @param errorDetail <p>
     *            The details about the error.
     *            </p>
     */
    public void setErrorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
    }

    /**
     * <p>
     * The details about the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorDetail <p>
     *            The details about the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableError withErrorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
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
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getErrorDetail() != null)
            sb.append("ErrorDetail: " + getErrorDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode
                + ((getErrorDetail() == null) ? 0 : getErrorDetail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableError == false)
            return false;
        TableError other = (TableError) obj;

        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getErrorDetail() == null ^ this.getErrorDetail() == null)
            return false;
        if (other.getErrorDetail() != null
                && other.getErrorDetail().equals(this.getErrorDetail()) == false)
            return false;
        return true;
    }
}
