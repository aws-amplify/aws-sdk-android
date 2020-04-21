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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

/**
 * <p>
 * The time period that you want the usage and costs for.
 * </p>
 */
public class DateInterval implements Serializable {
    /**
     * <p>
     * The beginning of the time period that you want the usage and costs for.
     * The start date is inclusive. For example, if <code>start</code> is
     * <code>2017-01-01</code>, AWS retrieves cost and usage data starting at
     * <code>2017-01-01</code> up to the end date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 40<br/>
     * <b>Pattern: </b>(\d{4}-\d{2}-\d{2})(T\d{2}:\d{2}:\d{2}Z)?<br/>
     */
    private String start;

    /**
     * <p>
     * The end of the time period that you want the usage and costs for. The end
     * date is exclusive. For example, if <code>end</code> is
     * <code>2017-05-01</code>, AWS retrieves cost and usage data from the start
     * date up to, but not including, <code>2017-05-01</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 40<br/>
     * <b>Pattern: </b>(\d{4}-\d{2}-\d{2})(T\d{2}:\d{2}:\d{2}Z)?<br/>
     */
    private String end;

    /**
     * <p>
     * The beginning of the time period that you want the usage and costs for.
     * The start date is inclusive. For example, if <code>start</code> is
     * <code>2017-01-01</code>, AWS retrieves cost and usage data starting at
     * <code>2017-01-01</code> up to the end date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 40<br/>
     * <b>Pattern: </b>(\d{4}-\d{2}-\d{2})(T\d{2}:\d{2}:\d{2}Z)?<br/>
     *
     * @return <p>
     *         The beginning of the time period that you want the usage and
     *         costs for. The start date is inclusive. For example, if
     *         <code>start</code> is <code>2017-01-01</code>, AWS retrieves cost
     *         and usage data starting at <code>2017-01-01</code> up to the end
     *         date.
     *         </p>
     */
    public String getStart() {
        return start;
    }

    /**
     * <p>
     * The beginning of the time period that you want the usage and costs for.
     * The start date is inclusive. For example, if <code>start</code> is
     * <code>2017-01-01</code>, AWS retrieves cost and usage data starting at
     * <code>2017-01-01</code> up to the end date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 40<br/>
     * <b>Pattern: </b>(\d{4}-\d{2}-\d{2})(T\d{2}:\d{2}:\d{2}Z)?<br/>
     *
     * @param start <p>
     *            The beginning of the time period that you want the usage and
     *            costs for. The start date is inclusive. For example, if
     *            <code>start</code> is <code>2017-01-01</code>, AWS retrieves
     *            cost and usage data starting at <code>2017-01-01</code> up to
     *            the end date.
     *            </p>
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * <p>
     * The beginning of the time period that you want the usage and costs for.
     * The start date is inclusive. For example, if <code>start</code> is
     * <code>2017-01-01</code>, AWS retrieves cost and usage data starting at
     * <code>2017-01-01</code> up to the end date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 40<br/>
     * <b>Pattern: </b>(\d{4}-\d{2}-\d{2})(T\d{2}:\d{2}:\d{2}Z)?<br/>
     *
     * @param start <p>
     *            The beginning of the time period that you want the usage and
     *            costs for. The start date is inclusive. For example, if
     *            <code>start</code> is <code>2017-01-01</code>, AWS retrieves
     *            cost and usage data starting at <code>2017-01-01</code> up to
     *            the end date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DateInterval withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * <p>
     * The end of the time period that you want the usage and costs for. The end
     * date is exclusive. For example, if <code>end</code> is
     * <code>2017-05-01</code>, AWS retrieves cost and usage data from the start
     * date up to, but not including, <code>2017-05-01</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 40<br/>
     * <b>Pattern: </b>(\d{4}-\d{2}-\d{2})(T\d{2}:\d{2}:\d{2}Z)?<br/>
     *
     * @return <p>
     *         The end of the time period that you want the usage and costs for.
     *         The end date is exclusive. For example, if <code>end</code> is
     *         <code>2017-05-01</code>, AWS retrieves cost and usage data from
     *         the start date up to, but not including, <code>2017-05-01</code>.
     *         </p>
     */
    public String getEnd() {
        return end;
    }

    /**
     * <p>
     * The end of the time period that you want the usage and costs for. The end
     * date is exclusive. For example, if <code>end</code> is
     * <code>2017-05-01</code>, AWS retrieves cost and usage data from the start
     * date up to, but not including, <code>2017-05-01</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 40<br/>
     * <b>Pattern: </b>(\d{4}-\d{2}-\d{2})(T\d{2}:\d{2}:\d{2}Z)?<br/>
     *
     * @param end <p>
     *            The end of the time period that you want the usage and costs
     *            for. The end date is exclusive. For example, if
     *            <code>end</code> is <code>2017-05-01</code>, AWS retrieves
     *            cost and usage data from the start date up to, but not
     *            including, <code>2017-05-01</code>.
     *            </p>
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * <p>
     * The end of the time period that you want the usage and costs for. The end
     * date is exclusive. For example, if <code>end</code> is
     * <code>2017-05-01</code>, AWS retrieves cost and usage data from the start
     * date up to, but not including, <code>2017-05-01</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 40<br/>
     * <b>Pattern: </b>(\d{4}-\d{2}-\d{2})(T\d{2}:\d{2}:\d{2}Z)?<br/>
     *
     * @param end <p>
     *            The end of the time period that you want the usage and costs
     *            for. The end date is exclusive. For example, if
     *            <code>end</code> is <code>2017-05-01</code>, AWS retrieves
     *            cost and usage data from the start date up to, but not
     *            including, <code>2017-05-01</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DateInterval withEnd(String end) {
        this.end = end;
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
            sb.append("End: " + getEnd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DateInterval == false)
            return false;
        DateInterval other = (DateInterval) obj;

        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        return true;
    }
}
