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
 * Defines a column statistics data.
 * </p>
 */
public class ColumnStatisticsData implements Serializable {
    /**
     * <p>
     * The name of the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOOLEAN, DATE, DECIMAL, DOUBLE, LONG, STRING,
     * BINARY
     */
    private String type;

    /**
     * <p>
     * Boolean Column Statistics Data.
     * </p>
     */
    private BooleanColumnStatisticsData booleanColumnStatisticsData;

    /**
     * <p>
     * Date Column Statistics Data.
     * </p>
     */
    private DateColumnStatisticsData dateColumnStatisticsData;

    /**
     * <p>
     * Decimal Column Statistics Data.
     * </p>
     */
    private DecimalColumnStatisticsData decimalColumnStatisticsData;

    /**
     * <p>
     * Double Column Statistics Data.
     * </p>
     */
    private DoubleColumnStatisticsData doubleColumnStatisticsData;

    /**
     * <p>
     * Long Column Statistics Data.
     * </p>
     */
    private LongColumnStatisticsData longColumnStatisticsData;

    /**
     * <p>
     * String Column Statistics Data.
     * </p>
     */
    private StringColumnStatisticsData stringColumnStatisticsData;

    /**
     * <p>
     * Binary Column Statistics Data.
     * </p>
     */
    private BinaryColumnStatisticsData binaryColumnStatisticsData;

    /**
     * <p>
     * The name of the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOOLEAN, DATE, DECIMAL, DOUBLE, LONG, STRING,
     * BINARY
     *
     * @return <p>
     *         The name of the column.
     *         </p>
     * @see ColumnStatisticsType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOOLEAN, DATE, DECIMAL, DOUBLE, LONG, STRING,
     * BINARY
     *
     * @param type <p>
     *            The name of the column.
     *            </p>
     * @see ColumnStatisticsType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOOLEAN, DATE, DECIMAL, DOUBLE, LONG, STRING,
     * BINARY
     *
     * @param type <p>
     *            The name of the column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ColumnStatisticsType
     */
    public ColumnStatisticsData withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOOLEAN, DATE, DECIMAL, DOUBLE, LONG, STRING,
     * BINARY
     *
     * @param type <p>
     *            The name of the column.
     *            </p>
     * @see ColumnStatisticsType
     */
    public void setType(ColumnStatisticsType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BOOLEAN, DATE, DECIMAL, DOUBLE, LONG, STRING,
     * BINARY
     *
     * @param type <p>
     *            The name of the column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ColumnStatisticsType
     */
    public ColumnStatisticsData withType(ColumnStatisticsType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Boolean Column Statistics Data.
     * </p>
     *
     * @return <p>
     *         Boolean Column Statistics Data.
     *         </p>
     */
    public BooleanColumnStatisticsData getBooleanColumnStatisticsData() {
        return booleanColumnStatisticsData;
    }

    /**
     * <p>
     * Boolean Column Statistics Data.
     * </p>
     *
     * @param booleanColumnStatisticsData <p>
     *            Boolean Column Statistics Data.
     *            </p>
     */
    public void setBooleanColumnStatisticsData(
            BooleanColumnStatisticsData booleanColumnStatisticsData) {
        this.booleanColumnStatisticsData = booleanColumnStatisticsData;
    }

    /**
     * <p>
     * Boolean Column Statistics Data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param booleanColumnStatisticsData <p>
     *            Boolean Column Statistics Data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnStatisticsData withBooleanColumnStatisticsData(
            BooleanColumnStatisticsData booleanColumnStatisticsData) {
        this.booleanColumnStatisticsData = booleanColumnStatisticsData;
        return this;
    }

    /**
     * <p>
     * Date Column Statistics Data.
     * </p>
     *
     * @return <p>
     *         Date Column Statistics Data.
     *         </p>
     */
    public DateColumnStatisticsData getDateColumnStatisticsData() {
        return dateColumnStatisticsData;
    }

    /**
     * <p>
     * Date Column Statistics Data.
     * </p>
     *
     * @param dateColumnStatisticsData <p>
     *            Date Column Statistics Data.
     *            </p>
     */
    public void setDateColumnStatisticsData(DateColumnStatisticsData dateColumnStatisticsData) {
        this.dateColumnStatisticsData = dateColumnStatisticsData;
    }

    /**
     * <p>
     * Date Column Statistics Data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateColumnStatisticsData <p>
     *            Date Column Statistics Data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnStatisticsData withDateColumnStatisticsData(
            DateColumnStatisticsData dateColumnStatisticsData) {
        this.dateColumnStatisticsData = dateColumnStatisticsData;
        return this;
    }

    /**
     * <p>
     * Decimal Column Statistics Data.
     * </p>
     *
     * @return <p>
     *         Decimal Column Statistics Data.
     *         </p>
     */
    public DecimalColumnStatisticsData getDecimalColumnStatisticsData() {
        return decimalColumnStatisticsData;
    }

    /**
     * <p>
     * Decimal Column Statistics Data.
     * </p>
     *
     * @param decimalColumnStatisticsData <p>
     *            Decimal Column Statistics Data.
     *            </p>
     */
    public void setDecimalColumnStatisticsData(
            DecimalColumnStatisticsData decimalColumnStatisticsData) {
        this.decimalColumnStatisticsData = decimalColumnStatisticsData;
    }

    /**
     * <p>
     * Decimal Column Statistics Data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param decimalColumnStatisticsData <p>
     *            Decimal Column Statistics Data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnStatisticsData withDecimalColumnStatisticsData(
            DecimalColumnStatisticsData decimalColumnStatisticsData) {
        this.decimalColumnStatisticsData = decimalColumnStatisticsData;
        return this;
    }

    /**
     * <p>
     * Double Column Statistics Data.
     * </p>
     *
     * @return <p>
     *         Double Column Statistics Data.
     *         </p>
     */
    public DoubleColumnStatisticsData getDoubleColumnStatisticsData() {
        return doubleColumnStatisticsData;
    }

    /**
     * <p>
     * Double Column Statistics Data.
     * </p>
     *
     * @param doubleColumnStatisticsData <p>
     *            Double Column Statistics Data.
     *            </p>
     */
    public void setDoubleColumnStatisticsData(DoubleColumnStatisticsData doubleColumnStatisticsData) {
        this.doubleColumnStatisticsData = doubleColumnStatisticsData;
    }

    /**
     * <p>
     * Double Column Statistics Data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param doubleColumnStatisticsData <p>
     *            Double Column Statistics Data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnStatisticsData withDoubleColumnStatisticsData(
            DoubleColumnStatisticsData doubleColumnStatisticsData) {
        this.doubleColumnStatisticsData = doubleColumnStatisticsData;
        return this;
    }

    /**
     * <p>
     * Long Column Statistics Data.
     * </p>
     *
     * @return <p>
     *         Long Column Statistics Data.
     *         </p>
     */
    public LongColumnStatisticsData getLongColumnStatisticsData() {
        return longColumnStatisticsData;
    }

    /**
     * <p>
     * Long Column Statistics Data.
     * </p>
     *
     * @param longColumnStatisticsData <p>
     *            Long Column Statistics Data.
     *            </p>
     */
    public void setLongColumnStatisticsData(LongColumnStatisticsData longColumnStatisticsData) {
        this.longColumnStatisticsData = longColumnStatisticsData;
    }

    /**
     * <p>
     * Long Column Statistics Data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param longColumnStatisticsData <p>
     *            Long Column Statistics Data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnStatisticsData withLongColumnStatisticsData(
            LongColumnStatisticsData longColumnStatisticsData) {
        this.longColumnStatisticsData = longColumnStatisticsData;
        return this;
    }

    /**
     * <p>
     * String Column Statistics Data.
     * </p>
     *
     * @return <p>
     *         String Column Statistics Data.
     *         </p>
     */
    public StringColumnStatisticsData getStringColumnStatisticsData() {
        return stringColumnStatisticsData;
    }

    /**
     * <p>
     * String Column Statistics Data.
     * </p>
     *
     * @param stringColumnStatisticsData <p>
     *            String Column Statistics Data.
     *            </p>
     */
    public void setStringColumnStatisticsData(StringColumnStatisticsData stringColumnStatisticsData) {
        this.stringColumnStatisticsData = stringColumnStatisticsData;
    }

    /**
     * <p>
     * String Column Statistics Data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringColumnStatisticsData <p>
     *            String Column Statistics Data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnStatisticsData withStringColumnStatisticsData(
            StringColumnStatisticsData stringColumnStatisticsData) {
        this.stringColumnStatisticsData = stringColumnStatisticsData;
        return this;
    }

    /**
     * <p>
     * Binary Column Statistics Data.
     * </p>
     *
     * @return <p>
     *         Binary Column Statistics Data.
     *         </p>
     */
    public BinaryColumnStatisticsData getBinaryColumnStatisticsData() {
        return binaryColumnStatisticsData;
    }

    /**
     * <p>
     * Binary Column Statistics Data.
     * </p>
     *
     * @param binaryColumnStatisticsData <p>
     *            Binary Column Statistics Data.
     *            </p>
     */
    public void setBinaryColumnStatisticsData(BinaryColumnStatisticsData binaryColumnStatisticsData) {
        this.binaryColumnStatisticsData = binaryColumnStatisticsData;
    }

    /**
     * <p>
     * Binary Column Statistics Data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param binaryColumnStatisticsData <p>
     *            Binary Column Statistics Data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ColumnStatisticsData withBinaryColumnStatisticsData(
            BinaryColumnStatisticsData binaryColumnStatisticsData) {
        this.binaryColumnStatisticsData = binaryColumnStatisticsData;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getBooleanColumnStatisticsData() != null)
            sb.append("BooleanColumnStatisticsData: " + getBooleanColumnStatisticsData() + ",");
        if (getDateColumnStatisticsData() != null)
            sb.append("DateColumnStatisticsData: " + getDateColumnStatisticsData() + ",");
        if (getDecimalColumnStatisticsData() != null)
            sb.append("DecimalColumnStatisticsData: " + getDecimalColumnStatisticsData() + ",");
        if (getDoubleColumnStatisticsData() != null)
            sb.append("DoubleColumnStatisticsData: " + getDoubleColumnStatisticsData() + ",");
        if (getLongColumnStatisticsData() != null)
            sb.append("LongColumnStatisticsData: " + getLongColumnStatisticsData() + ",");
        if (getStringColumnStatisticsData() != null)
            sb.append("StringColumnStatisticsData: " + getStringColumnStatisticsData() + ",");
        if (getBinaryColumnStatisticsData() != null)
            sb.append("BinaryColumnStatisticsData: " + getBinaryColumnStatisticsData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime
                * hashCode
                + ((getBooleanColumnStatisticsData() == null) ? 0
                        : getBooleanColumnStatisticsData().hashCode());
        hashCode = prime
                * hashCode
                + ((getDateColumnStatisticsData() == null) ? 0 : getDateColumnStatisticsData()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDecimalColumnStatisticsData() == null) ? 0
                        : getDecimalColumnStatisticsData().hashCode());
        hashCode = prime
                * hashCode
                + ((getDoubleColumnStatisticsData() == null) ? 0 : getDoubleColumnStatisticsData()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLongColumnStatisticsData() == null) ? 0 : getLongColumnStatisticsData()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getStringColumnStatisticsData() == null) ? 0 : getStringColumnStatisticsData()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getBinaryColumnStatisticsData() == null) ? 0 : getBinaryColumnStatisticsData()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnStatisticsData == false)
            return false;
        ColumnStatisticsData other = (ColumnStatisticsData) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getBooleanColumnStatisticsData() == null
                ^ this.getBooleanColumnStatisticsData() == null)
            return false;
        if (other.getBooleanColumnStatisticsData() != null
                && other.getBooleanColumnStatisticsData().equals(
                        this.getBooleanColumnStatisticsData()) == false)
            return false;
        if (other.getDateColumnStatisticsData() == null
                ^ this.getDateColumnStatisticsData() == null)
            return false;
        if (other.getDateColumnStatisticsData() != null
                && other.getDateColumnStatisticsData().equals(this.getDateColumnStatisticsData()) == false)
            return false;
        if (other.getDecimalColumnStatisticsData() == null
                ^ this.getDecimalColumnStatisticsData() == null)
            return false;
        if (other.getDecimalColumnStatisticsData() != null
                && other.getDecimalColumnStatisticsData().equals(
                        this.getDecimalColumnStatisticsData()) == false)
            return false;
        if (other.getDoubleColumnStatisticsData() == null
                ^ this.getDoubleColumnStatisticsData() == null)
            return false;
        if (other.getDoubleColumnStatisticsData() != null
                && other.getDoubleColumnStatisticsData().equals(
                        this.getDoubleColumnStatisticsData()) == false)
            return false;
        if (other.getLongColumnStatisticsData() == null
                ^ this.getLongColumnStatisticsData() == null)
            return false;
        if (other.getLongColumnStatisticsData() != null
                && other.getLongColumnStatisticsData().equals(this.getLongColumnStatisticsData()) == false)
            return false;
        if (other.getStringColumnStatisticsData() == null
                ^ this.getStringColumnStatisticsData() == null)
            return false;
        if (other.getStringColumnStatisticsData() != null
                && other.getStringColumnStatisticsData().equals(
                        this.getStringColumnStatisticsData()) == false)
            return false;
        if (other.getBinaryColumnStatisticsData() == null
                ^ this.getBinaryColumnStatisticsData() == null)
            return false;
        if (other.getBinaryColumnStatisticsData() != null
                && other.getBinaryColumnStatisticsData().equals(
                        this.getBinaryColumnStatisticsData()) == false)
            return false;
        return true;
    }
}
