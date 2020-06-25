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
 * Defines a long column statistics data.
 * </p>
 */
public class LongColumnStatisticsData implements Serializable {
    /**
     * <p>
     * Minimum value of the column.
     * </p>
     */
    private Long minimumValue;

    /**
     * <p>
     * Maximum value of the column.
     * </p>
     */
    private Long maximumValue;

    /**
     * <p>
     * Number of nulls.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long numberOfNulls;

    /**
     * <p>
     * Number of distinct values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long numberOfDistinctValues;

    /**
     * <p>
     * Minimum value of the column.
     * </p>
     *
     * @return <p>
     *         Minimum value of the column.
     *         </p>
     */
    public Long getMinimumValue() {
        return minimumValue;
    }

    /**
     * <p>
     * Minimum value of the column.
     * </p>
     *
     * @param minimumValue <p>
     *            Minimum value of the column.
     *            </p>
     */
    public void setMinimumValue(Long minimumValue) {
        this.minimumValue = minimumValue;
    }

    /**
     * <p>
     * Minimum value of the column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minimumValue <p>
     *            Minimum value of the column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LongColumnStatisticsData withMinimumValue(Long minimumValue) {
        this.minimumValue = minimumValue;
        return this;
    }

    /**
     * <p>
     * Maximum value of the column.
     * </p>
     *
     * @return <p>
     *         Maximum value of the column.
     *         </p>
     */
    public Long getMaximumValue() {
        return maximumValue;
    }

    /**
     * <p>
     * Maximum value of the column.
     * </p>
     *
     * @param maximumValue <p>
     *            Maximum value of the column.
     *            </p>
     */
    public void setMaximumValue(Long maximumValue) {
        this.maximumValue = maximumValue;
    }

    /**
     * <p>
     * Maximum value of the column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximumValue <p>
     *            Maximum value of the column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LongColumnStatisticsData withMaximumValue(Long maximumValue) {
        this.maximumValue = maximumValue;
        return this;
    }

    /**
     * <p>
     * Number of nulls.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Number of nulls.
     *         </p>
     */
    public Long getNumberOfNulls() {
        return numberOfNulls;
    }

    /**
     * <p>
     * Number of nulls.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfNulls <p>
     *            Number of nulls.
     *            </p>
     */
    public void setNumberOfNulls(Long numberOfNulls) {
        this.numberOfNulls = numberOfNulls;
    }

    /**
     * <p>
     * Number of nulls.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfNulls <p>
     *            Number of nulls.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LongColumnStatisticsData withNumberOfNulls(Long numberOfNulls) {
        this.numberOfNulls = numberOfNulls;
        return this;
    }

    /**
     * <p>
     * Number of distinct values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Number of distinct values.
     *         </p>
     */
    public Long getNumberOfDistinctValues() {
        return numberOfDistinctValues;
    }

    /**
     * <p>
     * Number of distinct values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfDistinctValues <p>
     *            Number of distinct values.
     *            </p>
     */
    public void setNumberOfDistinctValues(Long numberOfDistinctValues) {
        this.numberOfDistinctValues = numberOfDistinctValues;
    }

    /**
     * <p>
     * Number of distinct values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfDistinctValues <p>
     *            Number of distinct values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LongColumnStatisticsData withNumberOfDistinctValues(Long numberOfDistinctValues) {
        this.numberOfDistinctValues = numberOfDistinctValues;
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
        if (getMinimumValue() != null)
            sb.append("MinimumValue: " + getMinimumValue() + ",");
        if (getMaximumValue() != null)
            sb.append("MaximumValue: " + getMaximumValue() + ",");
        if (getNumberOfNulls() != null)
            sb.append("NumberOfNulls: " + getNumberOfNulls() + ",");
        if (getNumberOfDistinctValues() != null)
            sb.append("NumberOfDistinctValues: " + getNumberOfDistinctValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMinimumValue() == null) ? 0 : getMinimumValue().hashCode());
        hashCode = prime * hashCode
                + ((getMaximumValue() == null) ? 0 : getMaximumValue().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfNulls() == null) ? 0 : getNumberOfNulls().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfDistinctValues() == null) ? 0 : getNumberOfDistinctValues()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LongColumnStatisticsData == false)
            return false;
        LongColumnStatisticsData other = (LongColumnStatisticsData) obj;

        if (other.getMinimumValue() == null ^ this.getMinimumValue() == null)
            return false;
        if (other.getMinimumValue() != null
                && other.getMinimumValue().equals(this.getMinimumValue()) == false)
            return false;
        if (other.getMaximumValue() == null ^ this.getMaximumValue() == null)
            return false;
        if (other.getMaximumValue() != null
                && other.getMaximumValue().equals(this.getMaximumValue()) == false)
            return false;
        if (other.getNumberOfNulls() == null ^ this.getNumberOfNulls() == null)
            return false;
        if (other.getNumberOfNulls() != null
                && other.getNumberOfNulls().equals(this.getNumberOfNulls()) == false)
            return false;
        if (other.getNumberOfDistinctValues() == null ^ this.getNumberOfDistinctValues() == null)
            return false;
        if (other.getNumberOfDistinctValues() != null
                && other.getNumberOfDistinctValues().equals(this.getNumberOfDistinctValues()) == false)
            return false;
        return true;
    }
}
