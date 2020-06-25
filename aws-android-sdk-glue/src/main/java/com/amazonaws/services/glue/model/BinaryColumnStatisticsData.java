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
 * Defines a binary column statistics data.
 * </p>
 */
public class BinaryColumnStatisticsData implements Serializable {
    /**
     * <p>
     * Maximum length of the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long maximumLength;

    /**
     * <p>
     * Average length of the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double averageLength;

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
     * Maximum length of the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Maximum length of the column.
     *         </p>
     */
    public Long getMaximumLength() {
        return maximumLength;
    }

    /**
     * <p>
     * Maximum length of the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param maximumLength <p>
     *            Maximum length of the column.
     *            </p>
     */
    public void setMaximumLength(Long maximumLength) {
        this.maximumLength = maximumLength;
    }

    /**
     * <p>
     * Maximum length of the column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param maximumLength <p>
     *            Maximum length of the column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BinaryColumnStatisticsData withMaximumLength(Long maximumLength) {
        this.maximumLength = maximumLength;
        return this;
    }

    /**
     * <p>
     * Average length of the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Average length of the column.
     *         </p>
     */
    public Double getAverageLength() {
        return averageLength;
    }

    /**
     * <p>
     * Average length of the column.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param averageLength <p>
     *            Average length of the column.
     *            </p>
     */
    public void setAverageLength(Double averageLength) {
        this.averageLength = averageLength;
    }

    /**
     * <p>
     * Average length of the column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param averageLength <p>
     *            Average length of the column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BinaryColumnStatisticsData withAverageLength(Double averageLength) {
        this.averageLength = averageLength;
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
    public BinaryColumnStatisticsData withNumberOfNulls(Long numberOfNulls) {
        this.numberOfNulls = numberOfNulls;
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
        if (getMaximumLength() != null)
            sb.append("MaximumLength: " + getMaximumLength() + ",");
        if (getAverageLength() != null)
            sb.append("AverageLength: " + getAverageLength() + ",");
        if (getNumberOfNulls() != null)
            sb.append("NumberOfNulls: " + getNumberOfNulls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMaximumLength() == null) ? 0 : getMaximumLength().hashCode());
        hashCode = prime * hashCode
                + ((getAverageLength() == null) ? 0 : getAverageLength().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfNulls() == null) ? 0 : getNumberOfNulls().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BinaryColumnStatisticsData == false)
            return false;
        BinaryColumnStatisticsData other = (BinaryColumnStatisticsData) obj;

        if (other.getMaximumLength() == null ^ this.getMaximumLength() == null)
            return false;
        if (other.getMaximumLength() != null
                && other.getMaximumLength().equals(this.getMaximumLength()) == false)
            return false;
        if (other.getAverageLength() == null ^ this.getAverageLength() == null)
            return false;
        if (other.getAverageLength() != null
                && other.getAverageLength().equals(this.getAverageLength()) == false)
            return false;
        if (other.getNumberOfNulls() == null ^ this.getNumberOfNulls() == null)
            return false;
        if (other.getNumberOfNulls() != null
                && other.getNumberOfNulls().equals(this.getNumberOfNulls()) == false)
            return false;
        return true;
    }
}
