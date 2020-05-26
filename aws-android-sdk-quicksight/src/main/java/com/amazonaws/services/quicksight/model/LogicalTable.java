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
 * A <i>logical table</i> is a unit that joins and that data transformations
 * operate on. A logical table has a source, which can be either a physical
 * table or result of a join. When a logical table points to a physical table,
 * the logical table acts as a mutable copy of that physical table through
 * transform operations.
 * </p>
 */
public class LogicalTable implements Serializable {
    /**
     * <p>
     * A display name for the logical table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String alias;

    /**
     * <p>
     * Transform operations that act on this logical table.
     * </p>
     */
    private java.util.List<TransformOperation> dataTransforms;

    /**
     * <p>
     * Source of this logical table.
     * </p>
     */
    private LogicalTableSource source;

    /**
     * <p>
     * A display name for the logical table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         A display name for the logical table.
     *         </p>
     */
    public String getAlias() {
        return alias;
    }

    /**
     * <p>
     * A display name for the logical table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param alias <p>
     *            A display name for the logical table.
     *            </p>
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * A display name for the logical table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param alias <p>
     *            A display name for the logical table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogicalTable withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * <p>
     * Transform operations that act on this logical table.
     * </p>
     *
     * @return <p>
     *         Transform operations that act on this logical table.
     *         </p>
     */
    public java.util.List<TransformOperation> getDataTransforms() {
        return dataTransforms;
    }

    /**
     * <p>
     * Transform operations that act on this logical table.
     * </p>
     *
     * @param dataTransforms <p>
     *            Transform operations that act on this logical table.
     *            </p>
     */
    public void setDataTransforms(java.util.Collection<TransformOperation> dataTransforms) {
        if (dataTransforms == null) {
            this.dataTransforms = null;
            return;
        }

        this.dataTransforms = new java.util.ArrayList<TransformOperation>(dataTransforms);
    }

    /**
     * <p>
     * Transform operations that act on this logical table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataTransforms <p>
     *            Transform operations that act on this logical table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogicalTable withDataTransforms(TransformOperation... dataTransforms) {
        if (getDataTransforms() == null) {
            this.dataTransforms = new java.util.ArrayList<TransformOperation>(dataTransforms.length);
        }
        for (TransformOperation value : dataTransforms) {
            this.dataTransforms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Transform operations that act on this logical table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataTransforms <p>
     *            Transform operations that act on this logical table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogicalTable withDataTransforms(java.util.Collection<TransformOperation> dataTransforms) {
        setDataTransforms(dataTransforms);
        return this;
    }

    /**
     * <p>
     * Source of this logical table.
     * </p>
     *
     * @return <p>
     *         Source of this logical table.
     *         </p>
     */
    public LogicalTableSource getSource() {
        return source;
    }

    /**
     * <p>
     * Source of this logical table.
     * </p>
     *
     * @param source <p>
     *            Source of this logical table.
     *            </p>
     */
    public void setSource(LogicalTableSource source) {
        this.source = source;
    }

    /**
     * <p>
     * Source of this logical table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param source <p>
     *            Source of this logical table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogicalTable withSource(LogicalTableSource source) {
        this.source = source;
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
        if (getAlias() != null)
            sb.append("Alias: " + getAlias() + ",");
        if (getDataTransforms() != null)
            sb.append("DataTransforms: " + getDataTransforms() + ",");
        if (getSource() != null)
            sb.append("Source: " + getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode
                + ((getDataTransforms() == null) ? 0 : getDataTransforms().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogicalTable == false)
            return false;
        LogicalTable other = (LogicalTable) obj;

        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getDataTransforms() == null ^ this.getDataTransforms() == null)
            return false;
        if (other.getDataTransforms() != null
                && other.getDataTransforms().equals(this.getDataTransforms()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }
}
