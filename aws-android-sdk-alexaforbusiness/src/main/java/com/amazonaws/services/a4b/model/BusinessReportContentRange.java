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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * The content range of the report.
 * </p>
 */
public class BusinessReportContentRange implements Serializable {
    /**
     * <p>
     * The interval of the content range.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_DAY, ONE_WEEK, THIRTY_DAYS
     */
    private String interval;

    /**
     * <p>
     * The interval of the content range.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_DAY, ONE_WEEK, THIRTY_DAYS
     *
     * @return <p>
     *         The interval of the content range.
     *         </p>
     * @see BusinessReportInterval
     */
    public String getInterval() {
        return interval;
    }

    /**
     * <p>
     * The interval of the content range.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_DAY, ONE_WEEK, THIRTY_DAYS
     *
     * @param interval <p>
     *            The interval of the content range.
     *            </p>
     * @see BusinessReportInterval
     */
    public void setInterval(String interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The interval of the content range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_DAY, ONE_WEEK, THIRTY_DAYS
     *
     * @param interval <p>
     *            The interval of the content range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BusinessReportInterval
     */
    public BusinessReportContentRange withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    /**
     * <p>
     * The interval of the content range.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_DAY, ONE_WEEK, THIRTY_DAYS
     *
     * @param interval <p>
     *            The interval of the content range.
     *            </p>
     * @see BusinessReportInterval
     */
    public void setInterval(BusinessReportInterval interval) {
        this.interval = interval.toString();
    }

    /**
     * <p>
     * The interval of the content range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_DAY, ONE_WEEK, THIRTY_DAYS
     *
     * @param interval <p>
     *            The interval of the content range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BusinessReportInterval
     */
    public BusinessReportContentRange withInterval(BusinessReportInterval interval) {
        this.interval = interval.toString();
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
            sb.append("Interval: " + getInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BusinessReportContentRange == false)
            return false;
        BusinessReportContentRange other = (BusinessReportContentRange) obj;

        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        return true;
    }
}
