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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * A view of a data source that contains information about the shape of the data
 * in the underlying source. This is a variant type structure. For this
 * structure to be valid, only one of the attributes can be non-null.
 * </p>
 */
public class PhysicalTable implements Serializable {
    /**
     * <p>
     * A physical table type for relational data sources.
     * </p>
     */
    private RelationalTable relationalTable;

    /**
     * <p>
     * A physical table type built from the results of the custom SQL query.
     * </p>
     */
    private CustomSql customSql;

    /**
     * <p>
     * A physical table type for as S3 data source.
     * </p>
     */
    private S3Source s3Source;

    /**
     * <p>
     * A physical table type for relational data sources.
     * </p>
     *
     * @return <p>
     *         A physical table type for relational data sources.
     *         </p>
     */
    public RelationalTable getRelationalTable() {
        return relationalTable;
    }

    /**
     * <p>
     * A physical table type for relational data sources.
     * </p>
     *
     * @param relationalTable <p>
     *            A physical table type for relational data sources.
     *            </p>
     */
    public void setRelationalTable(RelationalTable relationalTable) {
        this.relationalTable = relationalTable;
    }

    /**
     * <p>
     * A physical table type for relational data sources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relationalTable <p>
     *            A physical table type for relational data sources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhysicalTable withRelationalTable(RelationalTable relationalTable) {
        this.relationalTable = relationalTable;
        return this;
    }

    /**
     * <p>
     * A physical table type built from the results of the custom SQL query.
     * </p>
     *
     * @return <p>
     *         A physical table type built from the results of the custom SQL
     *         query.
     *         </p>
     */
    public CustomSql getCustomSql() {
        return customSql;
    }

    /**
     * <p>
     * A physical table type built from the results of the custom SQL query.
     * </p>
     *
     * @param customSql <p>
     *            A physical table type built from the results of the custom SQL
     *            query.
     *            </p>
     */
    public void setCustomSql(CustomSql customSql) {
        this.customSql = customSql;
    }

    /**
     * <p>
     * A physical table type built from the results of the custom SQL query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customSql <p>
     *            A physical table type built from the results of the custom SQL
     *            query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhysicalTable withCustomSql(CustomSql customSql) {
        this.customSql = customSql;
        return this;
    }

    /**
     * <p>
     * A physical table type for as S3 data source.
     * </p>
     *
     * @return <p>
     *         A physical table type for as S3 data source.
     *         </p>
     */
    public S3Source getS3Source() {
        return s3Source;
    }

    /**
     * <p>
     * A physical table type for as S3 data source.
     * </p>
     *
     * @param s3Source <p>
     *            A physical table type for as S3 data source.
     *            </p>
     */
    public void setS3Source(S3Source s3Source) {
        this.s3Source = s3Source;
    }

    /**
     * <p>
     * A physical table type for as S3 data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Source <p>
     *            A physical table type for as S3 data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhysicalTable withS3Source(S3Source s3Source) {
        this.s3Source = s3Source;
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
        if (getRelationalTable() != null)
            sb.append("RelationalTable: " + getRelationalTable() + ",");
        if (getCustomSql() != null)
            sb.append("CustomSql: " + getCustomSql() + ",");
        if (getS3Source() != null)
            sb.append("S3Source: " + getS3Source());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRelationalTable() == null) ? 0 : getRelationalTable().hashCode());
        hashCode = prime * hashCode + ((getCustomSql() == null) ? 0 : getCustomSql().hashCode());
        hashCode = prime * hashCode + ((getS3Source() == null) ? 0 : getS3Source().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhysicalTable == false)
            return false;
        PhysicalTable other = (PhysicalTable) obj;

        if (other.getRelationalTable() == null ^ this.getRelationalTable() == null)
            return false;
        if (other.getRelationalTable() != null
                && other.getRelationalTable().equals(this.getRelationalTable()) == false)
            return false;
        if (other.getCustomSql() == null ^ this.getCustomSql() == null)
            return false;
        if (other.getCustomSql() != null
                && other.getCustomSql().equals(this.getCustomSql()) == false)
            return false;
        if (other.getS3Source() == null ^ this.getS3Source() == null)
            return false;
        if (other.getS3Source() != null && other.getS3Source().equals(this.getS3Source()) == false)
            return false;
        return true;
    }
}
