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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * A date filter for querying findings.
 * </p>
 */
public class DateFilter implements Serializable {
    /**
     * <p>
     * A start date for the date filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String start;

    /**
     * <p>
     * An end date for the date filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String end;

    /**
     * <p>
     * A date range for the date filter.
     * </p>
     */
    private DateRange dateRange;

    /**
     * <p>
     * A start date for the date filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A start date for the date filter.
     *         </p>
     */
    public String getStart() {
        return start;
    }

    /**
     * <p>
     * A start date for the date filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param start <p>
     *            A start date for the date filter.
     *            </p>
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * <p>
     * A start date for the date filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param start <p>
     *            A start date for the date filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DateFilter withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * <p>
     * An end date for the date filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         An end date for the date filter.
     *         </p>
     */
    public String getEnd() {
        return end;
    }

    /**
     * <p>
     * An end date for the date filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param end <p>
     *            An end date for the date filter.
     *            </p>
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * <p>
     * An end date for the date filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param end <p>
     *            An end date for the date filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DateFilter withEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * <p>
     * A date range for the date filter.
     * </p>
     *
     * @return <p>
     *         A date range for the date filter.
     *         </p>
     */
    public DateRange getDateRange() {
        return dateRange;
    }

    /**
     * <p>
     * A date range for the date filter.
     * </p>
     *
     * @param dateRange <p>
     *            A date range for the date filter.
     *            </p>
     */
    public void setDateRange(DateRange dateRange) {
        this.dateRange = dateRange;
    }

    /**
     * <p>
     * A date range for the date filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateRange <p>
     *            A date range for the date filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DateFilter withDateRange(DateRange dateRange) {
        this.dateRange = dateRange;
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
        if (getStart() != null)
            sb.append("Start: " + getStart() + ",");
        if (getEnd() != null)
            sb.append("End: " + getEnd() + ",");
        if (getDateRange() != null)
            sb.append("DateRange: " + getDateRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode + ((getDateRange() == null) ? 0 : getDateRange().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DateFilter == false)
            return false;
        DateFilter other = (DateFilter) obj;

        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        if (other.getDateRange() == null ^ this.getDateRange() == null)
            return false;
        if (other.getDateRange() != null
                && other.getDateRange().equals(this.getDateRange()) == false)
            return false;
        return true;
    }
}
