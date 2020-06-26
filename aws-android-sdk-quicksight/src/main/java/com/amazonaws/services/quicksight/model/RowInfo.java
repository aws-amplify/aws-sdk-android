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
 * Information about rows for a data set SPICE ingestion.
 * </p>
 */
public class RowInfo implements Serializable {
    /**
     * <p>
     * The number of rows that were ingested.
     * </p>
     */
    private Long rowsIngested;

    /**
     * <p>
     * The number of rows that were not ingested.
     * </p>
     */
    private Long rowsDropped;

    /**
     * <p>
     * The number of rows that were ingested.
     * </p>
     *
     * @return <p>
     *         The number of rows that were ingested.
     *         </p>
     */
    public Long getRowsIngested() {
        return rowsIngested;
    }

    /**
     * <p>
     * The number of rows that were ingested.
     * </p>
     *
     * @param rowsIngested <p>
     *            The number of rows that were ingested.
     *            </p>
     */
    public void setRowsIngested(Long rowsIngested) {
        this.rowsIngested = rowsIngested;
    }

    /**
     * <p>
     * The number of rows that were ingested.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rowsIngested <p>
     *            The number of rows that were ingested.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RowInfo withRowsIngested(Long rowsIngested) {
        this.rowsIngested = rowsIngested;
        return this;
    }

    /**
     * <p>
     * The number of rows that were not ingested.
     * </p>
     *
     * @return <p>
     *         The number of rows that were not ingested.
     *         </p>
     */
    public Long getRowsDropped() {
        return rowsDropped;
    }

    /**
     * <p>
     * The number of rows that were not ingested.
     * </p>
     *
     * @param rowsDropped <p>
     *            The number of rows that were not ingested.
     *            </p>
     */
    public void setRowsDropped(Long rowsDropped) {
        this.rowsDropped = rowsDropped;
    }

    /**
     * <p>
     * The number of rows that were not ingested.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rowsDropped <p>
     *            The number of rows that were not ingested.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RowInfo withRowsDropped(Long rowsDropped) {
        this.rowsDropped = rowsDropped;
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
        if (getRowsIngested() != null)
            sb.append("RowsIngested: " + getRowsIngested() + ",");
        if (getRowsDropped() != null)
            sb.append("RowsDropped: " + getRowsDropped());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRowsIngested() == null) ? 0 : getRowsIngested().hashCode());
        hashCode = prime * hashCode
                + ((getRowsDropped() == null) ? 0 : getRowsDropped().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RowInfo == false)
            return false;
        RowInfo other = (RowInfo) obj;

        if (other.getRowsIngested() == null ^ this.getRowsIngested() == null)
            return false;
        if (other.getRowsIngested() != null
                && other.getRowsIngested().equals(this.getRowsIngested()) == false)
            return false;
        if (other.getRowsDropped() == null ^ this.getRowsDropped() == null)
            return false;
        if (other.getRowsDropped() != null
                && other.getRowsDropped().equals(this.getRowsDropped()) == false)
            return false;
        return true;
    }
}
