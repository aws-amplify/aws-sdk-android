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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * Maps a column or attribute in the data source to an index field. You must
 * first create the fields in the index using the <a>UpdateIndex</a> operation.
 * </p>
 */
public class DataSourceToIndexFieldMapping implements Serializable {
    /**
     * <p>
     * The name of the column or attribute in the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     */
    private String dataSourceFieldName;

    /**
     * <p>
     * The type of data stored in the column or attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     * <b>Pattern: </b>^(?!\s).*(?<!\s)$<br/>
     */
    private String dateFieldFormat;

    /**
     * <p>
     * The name of the field in the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 30<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     */
    private String indexFieldName;

    /**
     * <p>
     * The name of the column or attribute in the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @return <p>
     *         The name of the column or attribute in the data source.
     *         </p>
     */
    public String getDataSourceFieldName() {
        return dataSourceFieldName;
    }

    /**
     * <p>
     * The name of the column or attribute in the data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @param dataSourceFieldName <p>
     *            The name of the column or attribute in the data source.
     *            </p>
     */
    public void setDataSourceFieldName(String dataSourceFieldName) {
        this.dataSourceFieldName = dataSourceFieldName;
    }

    /**
     * <p>
     * The name of the column or attribute in the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_.]*$<br/>
     *
     * @param dataSourceFieldName <p>
     *            The name of the column or attribute in the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceToIndexFieldMapping withDataSourceFieldName(String dataSourceFieldName) {
        this.dataSourceFieldName = dataSourceFieldName;
        return this;
    }

    /**
     * <p>
     * The type of data stored in the column or attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     * <b>Pattern: </b>^(?!\s).*(?<!\s)$<br/>
     *
     * @return <p>
     *         The type of data stored in the column or attribute.
     *         </p>
     */
    public String getDateFieldFormat() {
        return dateFieldFormat;
    }

    /**
     * <p>
     * The type of data stored in the column or attribute.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     * <b>Pattern: </b>^(?!\s).*(?<!\s)$<br/>
     *
     * @param dateFieldFormat <p>
     *            The type of data stored in the column or attribute.
     *            </p>
     */
    public void setDateFieldFormat(String dateFieldFormat) {
        this.dateFieldFormat = dateFieldFormat;
    }

    /**
     * <p>
     * The type of data stored in the column or attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     * <b>Pattern: </b>^(?!\s).*(?<!\s)$<br/>
     *
     * @param dateFieldFormat <p>
     *            The type of data stored in the column or attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceToIndexFieldMapping withDateFieldFormat(String dateFieldFormat) {
        this.dateFieldFormat = dateFieldFormat;
        return this;
    }

    /**
     * <p>
     * The name of the field in the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 30<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @return <p>
     *         The name of the field in the index.
     *         </p>
     */
    public String getIndexFieldName() {
        return indexFieldName;
    }

    /**
     * <p>
     * The name of the field in the index.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 30<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param indexFieldName <p>
     *            The name of the field in the index.
     *            </p>
     */
    public void setIndexFieldName(String indexFieldName) {
        this.indexFieldName = indexFieldName;
    }

    /**
     * <p>
     * The name of the field in the index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 30<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param indexFieldName <p>
     *            The name of the field in the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceToIndexFieldMapping withIndexFieldName(String indexFieldName) {
        this.indexFieldName = indexFieldName;
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
        if (getDataSourceFieldName() != null)
            sb.append("DataSourceFieldName: " + getDataSourceFieldName() + ",");
        if (getDateFieldFormat() != null)
            sb.append("DateFieldFormat: " + getDateFieldFormat() + ",");
        if (getIndexFieldName() != null)
            sb.append("IndexFieldName: " + getIndexFieldName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDataSourceFieldName() == null) ? 0 : getDataSourceFieldName().hashCode());
        hashCode = prime * hashCode
                + ((getDateFieldFormat() == null) ? 0 : getDateFieldFormat().hashCode());
        hashCode = prime * hashCode
                + ((getIndexFieldName() == null) ? 0 : getIndexFieldName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceToIndexFieldMapping == false)
            return false;
        DataSourceToIndexFieldMapping other = (DataSourceToIndexFieldMapping) obj;

        if (other.getDataSourceFieldName() == null ^ this.getDataSourceFieldName() == null)
            return false;
        if (other.getDataSourceFieldName() != null
                && other.getDataSourceFieldName().equals(this.getDataSourceFieldName()) == false)
            return false;
        if (other.getDateFieldFormat() == null ^ this.getDateFieldFormat() == null)
            return false;
        if (other.getDateFieldFormat() != null
                && other.getDateFieldFormat().equals(this.getDateFieldFormat()) == false)
            return false;
        if (other.getIndexFieldName() == null ^ this.getIndexFieldName() == null)
            return false;
        if (other.getIndexFieldName() != null
                && other.getIndexFieldName().equals(this.getIndexFieldName()) == false)
            return false;
        return true;
    }
}
