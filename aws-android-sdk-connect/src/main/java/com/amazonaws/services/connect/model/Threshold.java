/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the threshold for service level metrics.
 * </p>
 */
public class Threshold implements Serializable {
    /**
     * <p>
     * The type of comparison. Only "less than" (LT) comparisons are supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LT
     */
    private String comparison;

    /**
     * <p>
     * The threshold value to compare.
     * </p>
     */
    private Double thresholdValue;

    /**
     * <p>
     * The type of comparison. Only "less than" (LT) comparisons are supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LT
     *
     * @return <p>
     *         The type of comparison. Only "less than" (LT) comparisons are
     *         supported.
     *         </p>
     * @see Comparison
     */
    public String getComparison() {
        return comparison;
    }

    /**
     * <p>
     * The type of comparison. Only "less than" (LT) comparisons are supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LT
     *
     * @param comparison <p>
     *            The type of comparison. Only "less than" (LT) comparisons are
     *            supported.
     *            </p>
     * @see Comparison
     */
    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    /**
     * <p>
     * The type of comparison. Only "less than" (LT) comparisons are supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LT
     *
     * @param comparison <p>
     *            The type of comparison. Only "less than" (LT) comparisons are
     *            supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Comparison
     */
    public Threshold withComparison(String comparison) {
        this.comparison = comparison;
        return this;
    }

    /**
     * <p>
     * The type of comparison. Only "less than" (LT) comparisons are supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LT
     *
     * @param comparison <p>
     *            The type of comparison. Only "less than" (LT) comparisons are
     *            supported.
     *            </p>
     * @see Comparison
     */
    public void setComparison(Comparison comparison) {
        this.comparison = comparison.toString();
    }

    /**
     * <p>
     * The type of comparison. Only "less than" (LT) comparisons are supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LT
     *
     * @param comparison <p>
     *            The type of comparison. Only "less than" (LT) comparisons are
     *            supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Comparison
     */
    public Threshold withComparison(Comparison comparison) {
        this.comparison = comparison.toString();
        return this;
    }

    /**
     * <p>
     * The threshold value to compare.
     * </p>
     *
     * @return <p>
     *         The threshold value to compare.
     *         </p>
     */
    public Double getThresholdValue() {
        return thresholdValue;
    }

    /**
     * <p>
     * The threshold value to compare.
     * </p>
     *
     * @param thresholdValue <p>
     *            The threshold value to compare.
     *            </p>
     */
    public void setThresholdValue(Double thresholdValue) {
        this.thresholdValue = thresholdValue;
    }

    /**
     * <p>
     * The threshold value to compare.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thresholdValue <p>
     *            The threshold value to compare.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Threshold withThresholdValue(Double thresholdValue) {
        this.thresholdValue = thresholdValue;
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
        if (getComparison() != null)
            sb.append("Comparison: " + getComparison() + ",");
        if (getThresholdValue() != null)
            sb.append("ThresholdValue: " + getThresholdValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComparison() == null) ? 0 : getComparison().hashCode());
        hashCode = prime * hashCode
                + ((getThresholdValue() == null) ? 0 : getThresholdValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Threshold == false)
            return false;
        Threshold other = (Threshold) obj;

        if (other.getComparison() == null ^ this.getComparison() == null)
            return false;
        if (other.getComparison() != null
                && other.getComparison().equals(this.getComparison()) == false)
            return false;
        if (other.getThresholdValue() == null ^ this.getThresholdValue() == null)
            return false;
        if (other.getThresholdValue() != null
                && other.getThresholdValue().equals(this.getThresholdValue()) == false)
            return false;
        return true;
    }
}
