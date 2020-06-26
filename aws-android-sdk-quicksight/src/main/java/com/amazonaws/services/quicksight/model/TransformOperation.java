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
 * A data transformation on a logical table. This is a variant type structure.
 * For this structure to be valid, only one of the attributes can be non-null.
 * </p>
 */
public class TransformOperation implements Serializable {
    /**
     * <p>
     * An operation that projects columns. Operations that come after a
     * projection can only refer to projected columns.
     * </p>
     */
    private ProjectOperation projectOperation;

    /**
     * <p>
     * An operation that filters rows based on some condition.
     * </p>
     */
    private FilterOperation filterOperation;

    /**
     * <p>
     * An operation that creates calculated columns. Columns created in one such
     * operation form a lexical closure.
     * </p>
     */
    private CreateColumnsOperation createColumnsOperation;

    /**
     * <p>
     * An operation that renames a column.
     * </p>
     */
    private RenameColumnOperation renameColumnOperation;

    /**
     * <p>
     * A transform operation that casts a column to a different type.
     * </p>
     */
    private CastColumnTypeOperation castColumnTypeOperation;

    /**
     * <p>
     * An operation that tags a column with additional information.
     * </p>
     */
    private TagColumnOperation tagColumnOperation;

    /**
     * <p>
     * An operation that projects columns. Operations that come after a
     * projection can only refer to projected columns.
     * </p>
     *
     * @return <p>
     *         An operation that projects columns. Operations that come after a
     *         projection can only refer to projected columns.
     *         </p>
     */
    public ProjectOperation getProjectOperation() {
        return projectOperation;
    }

    /**
     * <p>
     * An operation that projects columns. Operations that come after a
     * projection can only refer to projected columns.
     * </p>
     *
     * @param projectOperation <p>
     *            An operation that projects columns. Operations that come after
     *            a projection can only refer to projected columns.
     *            </p>
     */
    public void setProjectOperation(ProjectOperation projectOperation) {
        this.projectOperation = projectOperation;
    }

    /**
     * <p>
     * An operation that projects columns. Operations that come after a
     * projection can only refer to projected columns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param projectOperation <p>
     *            An operation that projects columns. Operations that come after
     *            a projection can only refer to projected columns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformOperation withProjectOperation(ProjectOperation projectOperation) {
        this.projectOperation = projectOperation;
        return this;
    }

    /**
     * <p>
     * An operation that filters rows based on some condition.
     * </p>
     *
     * @return <p>
     *         An operation that filters rows based on some condition.
     *         </p>
     */
    public FilterOperation getFilterOperation() {
        return filterOperation;
    }

    /**
     * <p>
     * An operation that filters rows based on some condition.
     * </p>
     *
     * @param filterOperation <p>
     *            An operation that filters rows based on some condition.
     *            </p>
     */
    public void setFilterOperation(FilterOperation filterOperation) {
        this.filterOperation = filterOperation;
    }

    /**
     * <p>
     * An operation that filters rows based on some condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterOperation <p>
     *            An operation that filters rows based on some condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformOperation withFilterOperation(FilterOperation filterOperation) {
        this.filterOperation = filterOperation;
        return this;
    }

    /**
     * <p>
     * An operation that creates calculated columns. Columns created in one such
     * operation form a lexical closure.
     * </p>
     *
     * @return <p>
     *         An operation that creates calculated columns. Columns created in
     *         one such operation form a lexical closure.
     *         </p>
     */
    public CreateColumnsOperation getCreateColumnsOperation() {
        return createColumnsOperation;
    }

    /**
     * <p>
     * An operation that creates calculated columns. Columns created in one such
     * operation form a lexical closure.
     * </p>
     *
     * @param createColumnsOperation <p>
     *            An operation that creates calculated columns. Columns created
     *            in one such operation form a lexical closure.
     *            </p>
     */
    public void setCreateColumnsOperation(CreateColumnsOperation createColumnsOperation) {
        this.createColumnsOperation = createColumnsOperation;
    }

    /**
     * <p>
     * An operation that creates calculated columns. Columns created in one such
     * operation form a lexical closure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createColumnsOperation <p>
     *            An operation that creates calculated columns. Columns created
     *            in one such operation form a lexical closure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformOperation withCreateColumnsOperation(
            CreateColumnsOperation createColumnsOperation) {
        this.createColumnsOperation = createColumnsOperation;
        return this;
    }

    /**
     * <p>
     * An operation that renames a column.
     * </p>
     *
     * @return <p>
     *         An operation that renames a column.
     *         </p>
     */
    public RenameColumnOperation getRenameColumnOperation() {
        return renameColumnOperation;
    }

    /**
     * <p>
     * An operation that renames a column.
     * </p>
     *
     * @param renameColumnOperation <p>
     *            An operation that renames a column.
     *            </p>
     */
    public void setRenameColumnOperation(RenameColumnOperation renameColumnOperation) {
        this.renameColumnOperation = renameColumnOperation;
    }

    /**
     * <p>
     * An operation that renames a column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param renameColumnOperation <p>
     *            An operation that renames a column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformOperation withRenameColumnOperation(RenameColumnOperation renameColumnOperation) {
        this.renameColumnOperation = renameColumnOperation;
        return this;
    }

    /**
     * <p>
     * A transform operation that casts a column to a different type.
     * </p>
     *
     * @return <p>
     *         A transform operation that casts a column to a different type.
     *         </p>
     */
    public CastColumnTypeOperation getCastColumnTypeOperation() {
        return castColumnTypeOperation;
    }

    /**
     * <p>
     * A transform operation that casts a column to a different type.
     * </p>
     *
     * @param castColumnTypeOperation <p>
     *            A transform operation that casts a column to a different type.
     *            </p>
     */
    public void setCastColumnTypeOperation(CastColumnTypeOperation castColumnTypeOperation) {
        this.castColumnTypeOperation = castColumnTypeOperation;
    }

    /**
     * <p>
     * A transform operation that casts a column to a different type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param castColumnTypeOperation <p>
     *            A transform operation that casts a column to a different type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformOperation withCastColumnTypeOperation(
            CastColumnTypeOperation castColumnTypeOperation) {
        this.castColumnTypeOperation = castColumnTypeOperation;
        return this;
    }

    /**
     * <p>
     * An operation that tags a column with additional information.
     * </p>
     *
     * @return <p>
     *         An operation that tags a column with additional information.
     *         </p>
     */
    public TagColumnOperation getTagColumnOperation() {
        return tagColumnOperation;
    }

    /**
     * <p>
     * An operation that tags a column with additional information.
     * </p>
     *
     * @param tagColumnOperation <p>
     *            An operation that tags a column with additional information.
     *            </p>
     */
    public void setTagColumnOperation(TagColumnOperation tagColumnOperation) {
        this.tagColumnOperation = tagColumnOperation;
    }

    /**
     * <p>
     * An operation that tags a column with additional information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagColumnOperation <p>
     *            An operation that tags a column with additional information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformOperation withTagColumnOperation(TagColumnOperation tagColumnOperation) {
        this.tagColumnOperation = tagColumnOperation;
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
        if (getProjectOperation() != null)
            sb.append("ProjectOperation: " + getProjectOperation() + ",");
        if (getFilterOperation() != null)
            sb.append("FilterOperation: " + getFilterOperation() + ",");
        if (getCreateColumnsOperation() != null)
            sb.append("CreateColumnsOperation: " + getCreateColumnsOperation() + ",");
        if (getRenameColumnOperation() != null)
            sb.append("RenameColumnOperation: " + getRenameColumnOperation() + ",");
        if (getCastColumnTypeOperation() != null)
            sb.append("CastColumnTypeOperation: " + getCastColumnTypeOperation() + ",");
        if (getTagColumnOperation() != null)
            sb.append("TagColumnOperation: " + getTagColumnOperation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProjectOperation() == null) ? 0 : getProjectOperation().hashCode());
        hashCode = prime * hashCode
                + ((getFilterOperation() == null) ? 0 : getFilterOperation().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreateColumnsOperation() == null) ? 0 : getCreateColumnsOperation()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRenameColumnOperation() == null) ? 0 : getRenameColumnOperation().hashCode());
        hashCode = prime
                * hashCode
                + ((getCastColumnTypeOperation() == null) ? 0 : getCastColumnTypeOperation()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTagColumnOperation() == null) ? 0 : getTagColumnOperation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransformOperation == false)
            return false;
        TransformOperation other = (TransformOperation) obj;

        if (other.getProjectOperation() == null ^ this.getProjectOperation() == null)
            return false;
        if (other.getProjectOperation() != null
                && other.getProjectOperation().equals(this.getProjectOperation()) == false)
            return false;
        if (other.getFilterOperation() == null ^ this.getFilterOperation() == null)
            return false;
        if (other.getFilterOperation() != null
                && other.getFilterOperation().equals(this.getFilterOperation()) == false)
            return false;
        if (other.getCreateColumnsOperation() == null ^ this.getCreateColumnsOperation() == null)
            return false;
        if (other.getCreateColumnsOperation() != null
                && other.getCreateColumnsOperation().equals(this.getCreateColumnsOperation()) == false)
            return false;
        if (other.getRenameColumnOperation() == null ^ this.getRenameColumnOperation() == null)
            return false;
        if (other.getRenameColumnOperation() != null
                && other.getRenameColumnOperation().equals(this.getRenameColumnOperation()) == false)
            return false;
        if (other.getCastColumnTypeOperation() == null ^ this.getCastColumnTypeOperation() == null)
            return false;
        if (other.getCastColumnTypeOperation() != null
                && other.getCastColumnTypeOperation().equals(this.getCastColumnTypeOperation()) == false)
            return false;
        if (other.getTagColumnOperation() == null ^ this.getTagColumnOperation() == null)
            return false;
        if (other.getTagColumnOperation() != null
                && other.getTagColumnOperation().equals(this.getTagColumnOperation()) == false)
            return false;
        return true;
    }
}
