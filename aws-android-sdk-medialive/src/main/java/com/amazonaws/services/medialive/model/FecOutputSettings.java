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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Fec Output Settings
 */
public class FecOutputSettings implements Serializable {
    /**
     * Parameter D from SMPTE 2022-1. The height of the FEC protection matrix.
     * The number of transport stream packets per column error correction
     * packet. Must be between 4 and 20, inclusive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>4 - 20<br/>
     */
    private Integer columnDepth;

    /**
     * Enables column only or column and row based FEC
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COLUMN, COLUMN_AND_ROW
     */
    private String includeFec;

    /**
     * Parameter L from SMPTE 2022-1. The width of the FEC protection matrix.
     * Must be between 1 and 20, inclusive. If only Column FEC is used, then
     * larger values increase robustness. If Row FEC is used, then this is the
     * number of transport stream packets per row error correction packet, and
     * the value must be between 4 and 20, inclusive, if includeFec is
     * columnAndRow. If includeFec is column, this value must be 1 to 20,
     * inclusive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     */
    private Integer rowLength;

    /**
     * Parameter D from SMPTE 2022-1. The height of the FEC protection matrix.
     * The number of transport stream packets per column error correction
     * packet. Must be between 4 and 20, inclusive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>4 - 20<br/>
     *
     * @return Parameter D from SMPTE 2022-1. The height of the FEC protection
     *         matrix. The number of transport stream packets per column error
     *         correction packet. Must be between 4 and 20, inclusive.
     */
    public Integer getColumnDepth() {
        return columnDepth;
    }

    /**
     * Parameter D from SMPTE 2022-1. The height of the FEC protection matrix.
     * The number of transport stream packets per column error correction
     * packet. Must be between 4 and 20, inclusive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>4 - 20<br/>
     *
     * @param columnDepth Parameter D from SMPTE 2022-1. The height of the FEC
     *            protection matrix. The number of transport stream packets per
     *            column error correction packet. Must be between 4 and 20,
     *            inclusive.
     */
    public void setColumnDepth(Integer columnDepth) {
        this.columnDepth = columnDepth;
    }

    /**
     * Parameter D from SMPTE 2022-1. The height of the FEC protection matrix.
     * The number of transport stream packets per column error correction
     * packet. Must be between 4 and 20, inclusive.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>4 - 20<br/>
     *
     * @param columnDepth Parameter D from SMPTE 2022-1. The height of the FEC
     *            protection matrix. The number of transport stream packets per
     *            column error correction packet. Must be between 4 and 20,
     *            inclusive.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FecOutputSettings withColumnDepth(Integer columnDepth) {
        this.columnDepth = columnDepth;
        return this;
    }

    /**
     * Enables column only or column and row based FEC
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COLUMN, COLUMN_AND_ROW
     *
     * @return Enables column only or column and row based FEC
     * @see FecOutputIncludeFec
     */
    public String getIncludeFec() {
        return includeFec;
    }

    /**
     * Enables column only or column and row based FEC
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COLUMN, COLUMN_AND_ROW
     *
     * @param includeFec Enables column only or column and row based FEC
     * @see FecOutputIncludeFec
     */
    public void setIncludeFec(String includeFec) {
        this.includeFec = includeFec;
    }

    /**
     * Enables column only or column and row based FEC
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COLUMN, COLUMN_AND_ROW
     *
     * @param includeFec Enables column only or column and row based FEC
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FecOutputIncludeFec
     */
    public FecOutputSettings withIncludeFec(String includeFec) {
        this.includeFec = includeFec;
        return this;
    }

    /**
     * Enables column only or column and row based FEC
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COLUMN, COLUMN_AND_ROW
     *
     * @param includeFec Enables column only or column and row based FEC
     * @see FecOutputIncludeFec
     */
    public void setIncludeFec(FecOutputIncludeFec includeFec) {
        this.includeFec = includeFec.toString();
    }

    /**
     * Enables column only or column and row based FEC
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COLUMN, COLUMN_AND_ROW
     *
     * @param includeFec Enables column only or column and row based FEC
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FecOutputIncludeFec
     */
    public FecOutputSettings withIncludeFec(FecOutputIncludeFec includeFec) {
        this.includeFec = includeFec.toString();
        return this;
    }

    /**
     * Parameter L from SMPTE 2022-1. The width of the FEC protection matrix.
     * Must be between 1 and 20, inclusive. If only Column FEC is used, then
     * larger values increase robustness. If Row FEC is used, then this is the
     * number of transport stream packets per row error correction packet, and
     * the value must be between 4 and 20, inclusive, if includeFec is
     * columnAndRow. If includeFec is column, this value must be 1 to 20,
     * inclusive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @return Parameter L from SMPTE 2022-1. The width of the FEC protection
     *         matrix. Must be between 1 and 20, inclusive. If only Column FEC
     *         is used, then larger values increase robustness. If Row FEC is
     *         used, then this is the number of transport stream packets per row
     *         error correction packet, and the value must be between 4 and 20,
     *         inclusive, if includeFec is columnAndRow. If includeFec is
     *         column, this value must be 1 to 20, inclusive.
     */
    public Integer getRowLength() {
        return rowLength;
    }

    /**
     * Parameter L from SMPTE 2022-1. The width of the FEC protection matrix.
     * Must be between 1 and 20, inclusive. If only Column FEC is used, then
     * larger values increase robustness. If Row FEC is used, then this is the
     * number of transport stream packets per row error correction packet, and
     * the value must be between 4 and 20, inclusive, if includeFec is
     * columnAndRow. If includeFec is column, this value must be 1 to 20,
     * inclusive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param rowLength Parameter L from SMPTE 2022-1. The width of the FEC
     *            protection matrix. Must be between 1 and 20, inclusive. If
     *            only Column FEC is used, then larger values increase
     *            robustness. If Row FEC is used, then this is the number of
     *            transport stream packets per row error correction packet, and
     *            the value must be between 4 and 20, inclusive, if includeFec
     *            is columnAndRow. If includeFec is column, this value must be 1
     *            to 20, inclusive.
     */
    public void setRowLength(Integer rowLength) {
        this.rowLength = rowLength;
    }

    /**
     * Parameter L from SMPTE 2022-1. The width of the FEC protection matrix.
     * Must be between 1 and 20, inclusive. If only Column FEC is used, then
     * larger values increase robustness. If Row FEC is used, then this is the
     * number of transport stream packets per row error correction packet, and
     * the value must be between 4 and 20, inclusive, if includeFec is
     * columnAndRow. If includeFec is column, this value must be 1 to 20,
     * inclusive.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param rowLength Parameter L from SMPTE 2022-1. The width of the FEC
     *            protection matrix. Must be between 1 and 20, inclusive. If
     *            only Column FEC is used, then larger values increase
     *            robustness. If Row FEC is used, then this is the number of
     *            transport stream packets per row error correction packet, and
     *            the value must be between 4 and 20, inclusive, if includeFec
     *            is columnAndRow. If includeFec is column, this value must be 1
     *            to 20, inclusive.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FecOutputSettings withRowLength(Integer rowLength) {
        this.rowLength = rowLength;
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
        if (getColumnDepth() != null)
            sb.append("ColumnDepth: " + getColumnDepth() + ",");
        if (getIncludeFec() != null)
            sb.append("IncludeFec: " + getIncludeFec() + ",");
        if (getRowLength() != null)
            sb.append("RowLength: " + getRowLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getColumnDepth() == null) ? 0 : getColumnDepth().hashCode());
        hashCode = prime * hashCode + ((getIncludeFec() == null) ? 0 : getIncludeFec().hashCode());
        hashCode = prime * hashCode + ((getRowLength() == null) ? 0 : getRowLength().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FecOutputSettings == false)
            return false;
        FecOutputSettings other = (FecOutputSettings) obj;

        if (other.getColumnDepth() == null ^ this.getColumnDepth() == null)
            return false;
        if (other.getColumnDepth() != null
                && other.getColumnDepth().equals(this.getColumnDepth()) == false)
            return false;
        if (other.getIncludeFec() == null ^ this.getIncludeFec() == null)
            return false;
        if (other.getIncludeFec() != null
                && other.getIncludeFec().equals(this.getIncludeFec()) == false)
            return false;
        if (other.getRowLength() == null ^ this.getRowLength() == null)
            return false;
        if (other.getRowLength() != null
                && other.getRowLength().equals(this.getRowLength()) == false)
            return false;
        return true;
    }
}
