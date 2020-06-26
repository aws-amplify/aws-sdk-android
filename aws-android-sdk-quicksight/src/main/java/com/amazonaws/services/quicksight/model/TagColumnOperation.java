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
 * A transform operation that tags a column with additional information.
 * </p>
 */
public class TagColumnOperation implements Serializable {
    /**
     * <p>
     * The column that this operation acts on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String columnName;

    /**
     * <p>
     * The dataset column tag, currently only used for geospatial type tagging.
     * .
     * </p>
     * <note>
     * <p>
     * This is not tags for the AWS tagging feature. .
     * </p>
     * </note>
     */
    private java.util.List<ColumnTag> tags;

    /**
     * <p>
     * The column that this operation acts on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The column that this operation acts on.
     *         </p>
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * <p>
     * The column that this operation acts on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param columnName <p>
     *            The column that this operation acts on.
     *            </p>
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * <p>
     * The column that this operation acts on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param columnName <p>
     *            The column that this operation acts on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagColumnOperation withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * <p>
     * The dataset column tag, currently only used for geospatial type tagging.
     * .
     * </p>
     * <note>
     * <p>
     * This is not tags for the AWS tagging feature. .
     * </p>
     * </note>
     *
     * @return <p>
     *         The dataset column tag, currently only used for geospatial type
     *         tagging. .
     *         </p>
     *         <note>
     *         <p>
     *         This is not tags for the AWS tagging feature. .
     *         </p>
     *         </note>
     */
    public java.util.List<ColumnTag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The dataset column tag, currently only used for geospatial type tagging.
     * .
     * </p>
     * <note>
     * <p>
     * This is not tags for the AWS tagging feature. .
     * </p>
     * </note>
     *
     * @param tags <p>
     *            The dataset column tag, currently only used for geospatial
     *            type tagging. .
     *            </p>
     *            <note>
     *            <p>
     *            This is not tags for the AWS tagging feature. .
     *            </p>
     *            </note>
     */
    public void setTags(java.util.Collection<ColumnTag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<ColumnTag>(tags);
    }

    /**
     * <p>
     * The dataset column tag, currently only used for geospatial type tagging.
     * .
     * </p>
     * <note>
     * <p>
     * This is not tags for the AWS tagging feature. .
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The dataset column tag, currently only used for geospatial
     *            type tagging. .
     *            </p>
     *            <note>
     *            <p>
     *            This is not tags for the AWS tagging feature. .
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagColumnOperation withTags(ColumnTag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<ColumnTag>(tags.length);
        }
        for (ColumnTag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The dataset column tag, currently only used for geospatial type tagging.
     * .
     * </p>
     * <note>
     * <p>
     * This is not tags for the AWS tagging feature. .
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The dataset column tag, currently only used for geospatial
     *            type tagging. .
     *            </p>
     *            <note>
     *            <p>
     *            This is not tags for the AWS tagging feature. .
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagColumnOperation withTags(java.util.Collection<ColumnTag> tags) {
        setTags(tags);
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
        if (getColumnName() != null)
            sb.append("ColumnName: " + getColumnName() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagColumnOperation == false)
            return false;
        TagColumnOperation other = (TagColumnOperation) obj;

        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null
                && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
