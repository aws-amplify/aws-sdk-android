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

package com.amazonaws.services.health.model;

import java.io.Serializable;

/**
 * <p>
 * A range of dates and times that is used by the <a>EventFilter</a> and
 * <a>EntityFilter</a> objects. If <code>from</code> is set and <code>to</code>
 * is set: match items where the timestamp (<code>startTime</code>,
 * <code>endTime</code>, or <code>lastUpdatedTime</code>) is between
 * <code>from</code> and <code>to</code> inclusive. If <code>from</code> is set
 * and <code>to</code> is not set: match items where the timestamp value is
 * equal to or after <code>from</code>. If <code>from</code> is not set and
 * <code>to</code> is set: match items where the timestamp value is equal to or
 * before <code>to</code>.
 * </p>
 */
public class DateTimeRange implements Serializable {
    /**
     * <p>
     * The starting date and time of a time range.
     * </p>
     */
    private java.util.Date from;

    /**
     * <p>
     * The ending date and time of a time range.
     * </p>
     */
    private java.util.Date to;

    /**
     * <p>
     * The starting date and time of a time range.
     * </p>
     *
     * @return <p>
     *         The starting date and time of a time range.
     *         </p>
     */
    public java.util.Date getFrom() {
        return from;
    }

    /**
     * <p>
     * The starting date and time of a time range.
     * </p>
     *
     * @param from <p>
     *            The starting date and time of a time range.
     *            </p>
     */
    public void setFrom(java.util.Date from) {
        this.from = from;
    }

    /**
     * <p>
     * The starting date and time of a time range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param from <p>
     *            The starting date and time of a time range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DateTimeRange withFrom(java.util.Date from) {
        this.from = from;
        return this;
    }

    /**
     * <p>
     * The ending date and time of a time range.
     * </p>
     *
     * @return <p>
     *         The ending date and time of a time range.
     *         </p>
     */
    public java.util.Date getTo() {
        return to;
    }

    /**
     * <p>
     * The ending date and time of a time range.
     * </p>
     *
     * @param to <p>
     *            The ending date and time of a time range.
     *            </p>
     */
    public void setTo(java.util.Date to) {
        this.to = to;
    }

    /**
     * <p>
     * The ending date and time of a time range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param to <p>
     *            The ending date and time of a time range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DateTimeRange withTo(java.util.Date to) {
        this.to = to;
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
        if (getFrom() != null)
            sb.append("from: " + getFrom() + ",");
        if (getTo() != null)
            sb.append("to: " + getTo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getTo() == null) ? 0 : getTo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DateTimeRange == false)
            return false;
        DateTimeRange other = (DateTimeRange) obj;

        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getTo() == null ^ this.getTo() == null)
            return false;
        if (other.getTo() != null && other.getTo().equals(this.getTo()) == false)
            return false;
        return true;
    }
}
