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

package com.amazonaws.services.amazondatalifecyclemanager.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the retention rule for cross-Region snapshot copies.
 * </p>
 */
public class CrossRegionCopyRetainRule implements Serializable {
    /**
     * <p>
     * The amount of time to retain each snapshot. The maximum is 100 years.
     * This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer interval;

    /**
     * <p>
     * The unit of time for time-based retention.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAYS, WEEKS, MONTHS, YEARS
     */
    private String intervalUnit;

    /**
     * <p>
     * The amount of time to retain each snapshot. The maximum is 100 years.
     * This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The amount of time to retain each snapshot. The maximum is 100
     *         years. This is equivalent to 1200 months, 5200 weeks, or 36500
     *         days.
     *         </p>
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * <p>
     * The amount of time to retain each snapshot. The maximum is 100 years.
     * This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param interval <p>
     *            The amount of time to retain each snapshot. The maximum is 100
     *            years. This is equivalent to 1200 months, 5200 weeks, or 36500
     *            days.
     *            </p>
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The amount of time to retain each snapshot. The maximum is 100 years.
     * This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param interval <p>
     *            The amount of time to retain each snapshot. The maximum is 100
     *            years. This is equivalent to 1200 months, 5200 weeks, or 36500
     *            days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrossRegionCopyRetainRule withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * <p>
     * The unit of time for time-based retention.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAYS, WEEKS, MONTHS, YEARS
     *
     * @return <p>
     *         The unit of time for time-based retention.
     *         </p>
     * @see RetentionIntervalUnitValues
     */
    public String getIntervalUnit() {
        return intervalUnit;
    }

    /**
     * <p>
     * The unit of time for time-based retention.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAYS, WEEKS, MONTHS, YEARS
     *
     * @param intervalUnit <p>
     *            The unit of time for time-based retention.
     *            </p>
     * @see RetentionIntervalUnitValues
     */
    public void setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * <p>
     * The unit of time for time-based retention.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAYS, WEEKS, MONTHS, YEARS
     *
     * @param intervalUnit <p>
     *            The unit of time for time-based retention.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RetentionIntervalUnitValues
     */
    public CrossRegionCopyRetainRule withIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
        return this;
    }

    /**
     * <p>
     * The unit of time for time-based retention.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAYS, WEEKS, MONTHS, YEARS
     *
     * @param intervalUnit <p>
     *            The unit of time for time-based retention.
     *            </p>
     * @see RetentionIntervalUnitValues
     */
    public void setIntervalUnit(RetentionIntervalUnitValues intervalUnit) {
        this.intervalUnit = intervalUnit.toString();
    }

    /**
     * <p>
     * The unit of time for time-based retention.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAYS, WEEKS, MONTHS, YEARS
     *
     * @param intervalUnit <p>
     *            The unit of time for time-based retention.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RetentionIntervalUnitValues
     */
    public CrossRegionCopyRetainRule withIntervalUnit(RetentionIntervalUnitValues intervalUnit) {
        this.intervalUnit = intervalUnit.toString();
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
        if (getInterval() != null)
            sb.append("Interval: " + getInterval() + ",");
        if (getIntervalUnit() != null)
            sb.append("IntervalUnit: " + getIntervalUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode
                + ((getIntervalUnit() == null) ? 0 : getIntervalUnit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrossRegionCopyRetainRule == false)
            return false;
        CrossRegionCopyRetainRule other = (CrossRegionCopyRetainRule) obj;

        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getIntervalUnit() == null ^ this.getIntervalUnit() == null)
            return false;
        if (other.getIntervalUnit() != null
                && other.getIntervalUnit().equals(this.getIntervalUnit()) == false)
            return false;
        return true;
    }
}
