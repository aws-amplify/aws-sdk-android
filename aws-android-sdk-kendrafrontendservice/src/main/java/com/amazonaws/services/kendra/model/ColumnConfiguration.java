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
 * Provides information about how Amazon Kendra should use the columns of a
 * database in an index.
 * </p>
 */
public class ColumnConfiguration implements Serializable {
    /**
     * <p>
     * The column that provides the document's unique identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     */
    private String documentIdColumnName;

    /**
     * <p>
     * The column that contains the contents of the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     */
    private String documentDataColumnName;

    /**
     * <p>
     * The column that contains the title of the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     */
    private String documentTitleColumnName;

    /**
     * <p>
     * An array of objects that map database column names to the corresponding
     * fields in an index. You must first create the fields in the index using
     * the <a>UpdateIndex</a> operation.
     * </p>
     */
    private java.util.List<DataSourceToIndexFieldMapping> fieldMappings;

    /**
     * <p>
     * One to five columns that indicate when a document in the database has
     * changed.
     * </p>
     */
    private java.util.List<String> changeDetectingColumns;

    /**
     * <p>
     * The column that provides the document's unique identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @return <p>
     *         The column that provides the document's unique identifier.
     *         </p>
     */
    public String getDocumentIdColumnName() {
        return documentIdColumnName;
    }

    /**
     * <p>
     * The column that provides the document's unique identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @param documentIdColumnName <p>
     *            The column that provides the document's unique identifier.
     *            </p>
     */
    public void setDocumentIdColumnName(String documentIdColumnName) {
        this.documentIdColumnName = documentIdColumnName;
    }

    /**
     * <p>
     * The column that provides the document's unique identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @param documentIdColumnName <p>
     *            The column that provides the document's unique identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnConfiguration withDocumentIdColumnName(String documentIdColumnName) {
        this.documentIdColumnName = documentIdColumnName;
        return this;
    }

    /**
     * <p>
     * The column that contains the contents of the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @return <p>
     *         The column that contains the contents of the document.
     *         </p>
     */
    public String getDocumentDataColumnName() {
        return documentDataColumnName;
    }

    /**
     * <p>
     * The column that contains the contents of the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @param documentDataColumnName <p>
     *            The column that contains the contents of the document.
     *            </p>
     */
    public void setDocumentDataColumnName(String documentDataColumnName) {
        this.documentDataColumnName = documentDataColumnName;
    }

    /**
     * <p>
     * The column that contains the contents of the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @param documentDataColumnName <p>
     *            The column that contains the contents of the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnConfiguration withDocumentDataColumnName(String documentDataColumnName) {
        this.documentDataColumnName = documentDataColumnName;
        return this;
    }

    /**
     * <p>
     * The column that contains the title of the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @return <p>
     *         The column that contains the title of the document.
     *         </p>
     */
    public String getDocumentTitleColumnName() {
        return documentTitleColumnName;
    }

    /**
     * <p>
     * The column that contains the title of the document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @param documentTitleColumnName <p>
     *            The column that contains the title of the document.
     *            </p>
     */
    public void setDocumentTitleColumnName(String documentTitleColumnName) {
        this.documentTitleColumnName = documentTitleColumnName;
    }

    /**
     * <p>
     * The column that contains the title of the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z][a-zA-Z0-9_]*$<br/>
     *
     * @param documentTitleColumnName <p>
     *            The column that contains the title of the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnConfiguration withDocumentTitleColumnName(String documentTitleColumnName) {
        this.documentTitleColumnName = documentTitleColumnName;
        return this;
    }

    /**
     * <p>
     * An array of objects that map database column names to the corresponding
     * fields in an index. You must first create the fields in the index using
     * the <a>UpdateIndex</a> operation.
     * </p>
     *
     * @return <p>
     *         An array of objects that map database column names to the
     *         corresponding fields in an index. You must first create the
     *         fields in the index using the <a>UpdateIndex</a> operation.
     *         </p>
     */
    public java.util.List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return fieldMappings;
    }

    /**
     * <p>
     * An array of objects that map database column names to the corresponding
     * fields in an index. You must first create the fields in the index using
     * the <a>UpdateIndex</a> operation.
     * </p>
     *
     * @param fieldMappings <p>
     *            An array of objects that map database column names to the
     *            corresponding fields in an index. You must first create the
     *            fields in the index using the <a>UpdateIndex</a> operation.
     *            </p>
     */
    public void setFieldMappings(java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        if (fieldMappings == null) {
            this.fieldMappings = null;
            return;
        }

        this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(fieldMappings);
    }

    /**
     * <p>
     * An array of objects that map database column names to the corresponding
     * fields in an index. You must first create the fields in the index using
     * the <a>UpdateIndex</a> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldMappings <p>
     *            An array of objects that map database column names to the
     *            corresponding fields in an index. You must first create the
     *            fields in the index using the <a>UpdateIndex</a> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnConfiguration withFieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
        if (getFieldMappings() == null) {
            this.fieldMappings = new java.util.ArrayList<DataSourceToIndexFieldMapping>(
                    fieldMappings.length);
        }
        for (DataSourceToIndexFieldMapping value : fieldMappings) {
            this.fieldMappings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that map database column names to the corresponding
     * fields in an index. You must first create the fields in the index using
     * the <a>UpdateIndex</a> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fieldMappings <p>
     *            An array of objects that map database column names to the
     *            corresponding fields in an index. You must first create the
     *            fields in the index using the <a>UpdateIndex</a> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnConfiguration withFieldMappings(
            java.util.Collection<DataSourceToIndexFieldMapping> fieldMappings) {
        setFieldMappings(fieldMappings);
        return this;
    }

    /**
     * <p>
     * One to five columns that indicate when a document in the database has
     * changed.
     * </p>
     *
     * @return <p>
     *         One to five columns that indicate when a document in the database
     *         has changed.
     *         </p>
     */
    public java.util.List<String> getChangeDetectingColumns() {
        return changeDetectingColumns;
    }

    /**
     * <p>
     * One to five columns that indicate when a document in the database has
     * changed.
     * </p>
     *
     * @param changeDetectingColumns <p>
     *            One to five columns that indicate when a document in the
     *            database has changed.
     *            </p>
     */
    public void setChangeDetectingColumns(java.util.Collection<String> changeDetectingColumns) {
        if (changeDetectingColumns == null) {
            this.changeDetectingColumns = null;
            return;
        }

        this.changeDetectingColumns = new java.util.ArrayList<String>(changeDetectingColumns);
    }

    /**
     * <p>
     * One to five columns that indicate when a document in the database has
     * changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param changeDetectingColumns <p>
     *            One to five columns that indicate when a document in the
     *            database has changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnConfiguration withChangeDetectingColumns(String... changeDetectingColumns) {
        if (getChangeDetectingColumns() == null) {
            this.changeDetectingColumns = new java.util.ArrayList<String>(
                    changeDetectingColumns.length);
        }
        for (String value : changeDetectingColumns) {
            this.changeDetectingColumns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One to five columns that indicate when a document in the database has
     * changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param changeDetectingColumns <p>
     *            One to five columns that indicate when a document in the
     *            database has changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnConfiguration withChangeDetectingColumns(
            java.util.Collection<String> changeDetectingColumns) {
        setChangeDetectingColumns(changeDetectingColumns);
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
        if (getDocumentIdColumnName() != null)
            sb.append("DocumentIdColumnName: " + getDocumentIdColumnName() + ",");
        if (getDocumentDataColumnName() != null)
            sb.append("DocumentDataColumnName: " + getDocumentDataColumnName() + ",");
        if (getDocumentTitleColumnName() != null)
            sb.append("DocumentTitleColumnName: " + getDocumentTitleColumnName() + ",");
        if (getFieldMappings() != null)
            sb.append("FieldMappings: " + getFieldMappings() + ",");
        if (getChangeDetectingColumns() != null)
            sb.append("ChangeDetectingColumns: " + getChangeDetectingColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDocumentIdColumnName() == null) ? 0 : getDocumentIdColumnName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDocumentDataColumnName() == null) ? 0 : getDocumentDataColumnName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDocumentTitleColumnName() == null) ? 0 : getDocumentTitleColumnName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFieldMappings() == null) ? 0 : getFieldMappings().hashCode());
        hashCode = prime
                * hashCode
                + ((getChangeDetectingColumns() == null) ? 0 : getChangeDetectingColumns()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnConfiguration == false)
            return false;
        ColumnConfiguration other = (ColumnConfiguration) obj;

        if (other.getDocumentIdColumnName() == null ^ this.getDocumentIdColumnName() == null)
            return false;
        if (other.getDocumentIdColumnName() != null
                && other.getDocumentIdColumnName().equals(this.getDocumentIdColumnName()) == false)
            return false;
        if (other.getDocumentDataColumnName() == null ^ this.getDocumentDataColumnName() == null)
            return false;
        if (other.getDocumentDataColumnName() != null
                && other.getDocumentDataColumnName().equals(this.getDocumentDataColumnName()) == false)
            return false;
        if (other.getDocumentTitleColumnName() == null ^ this.getDocumentTitleColumnName() == null)
            return false;
        if (other.getDocumentTitleColumnName() != null
                && other.getDocumentTitleColumnName().equals(this.getDocumentTitleColumnName()) == false)
            return false;
        if (other.getFieldMappings() == null ^ this.getFieldMappings() == null)
            return false;
        if (other.getFieldMappings() != null
                && other.getFieldMappings().equals(this.getFieldMappings()) == false)
            return false;
        if (other.getChangeDetectingColumns() == null ^ this.getChangeDetectingColumns() == null)
            return false;
        if (other.getChangeDetectingColumns() != null
                && other.getChangeDetectingColumns().equals(this.getChangeDetectingColumns()) == false)
            return false;
        return true;
    }
}
