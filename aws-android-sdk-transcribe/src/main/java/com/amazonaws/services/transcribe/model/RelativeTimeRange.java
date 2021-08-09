/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

/**
 * <p>
 * An object that allows percentages to specify the proportion of the call where
 * you would like to apply a filter. For example, you can specify the first half
 * of the call. You can also specify the period of time between halfway through
 * to three-quarters of the way through the call. Because the length of
 * conversation can vary between calls, you can apply relative time ranges
 * across all calls.
 * </p>
 */
public class RelativeTimeRange implements Serializable {
    /**
     * <p>
     * A value that indicates the percentage of the beginning of the time range.
     * To set a relative time range, you must specify a start percentage and an
     * end percentage. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartPercentage - 10
     * </p>
     * </li>
     * <li>
     * <p>
     * EndPercentage - 50
     * </p>
     * </li>
     * </ul>
     * <p>
     * This looks at the time range starting from 10% of the way into the call
     * to 50% of the way through the call. For a call that lasts 100,000
     * milliseconds, this example range would apply from the 10,000 millisecond
     * mark to the 50,000 millisecond mark.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer startPercentage;

    /**
     * <p>
     * A value that indicates the percentage of the end of the time range. To
     * set a relative time range, you must specify a start percentage and an end
     * percentage. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartPercentage - 10
     * </p>
     * </li>
     * <li>
     * <p>
     * EndPercentage - 50
     * </p>
     * </li>
     * </ul>
     * <p>
     * This looks at the time range starting from 10% of the way into the call
     * to 50% of the way through the call. For a call that lasts 100,000
     * milliseconds, this example range would apply from the 10,000 millisecond
     * mark to the 50,000 millisecond mark.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer endPercentage;

    /**
     * <p>
     * A range that takes the portion of the call up to the time in milliseconds
     * set by the value that you've specified. For example, if you specify
     * <code>120000</code>, the time range is set for the first 120,000
     * milliseconds of the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer first;

    /**
     * <p>
     * A range that takes the portion of the call from the time in milliseconds
     * set by the value that you've specified to the end of the call. For
     * example, if you specify <code>120000</code>, the time range is set for
     * the last 120,000 milliseconds of the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer last;

    /**
     * <p>
     * A value that indicates the percentage of the beginning of the time range.
     * To set a relative time range, you must specify a start percentage and an
     * end percentage. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartPercentage - 10
     * </p>
     * </li>
     * <li>
     * <p>
     * EndPercentage - 50
     * </p>
     * </li>
     * </ul>
     * <p>
     * This looks at the time range starting from 10% of the way into the call
     * to 50% of the way through the call. For a call that lasts 100,000
     * milliseconds, this example range would apply from the 10,000 millisecond
     * mark to the 50,000 millisecond mark.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         A value that indicates the percentage of the beginning of the
     *         time range. To set a relative time range, you must specify a
     *         start percentage and an end percentage. For example, if you
     *         specify the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         StartPercentage - 10
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EndPercentage - 50
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This looks at the time range starting from 10% of the way into
     *         the call to 50% of the way through the call. For a call that
     *         lasts 100,000 milliseconds, this example range would apply from
     *         the 10,000 millisecond mark to the 50,000 millisecond mark.
     *         </p>
     */
    public Integer getStartPercentage() {
        return startPercentage;
    }

    /**
     * <p>
     * A value that indicates the percentage of the beginning of the time range.
     * To set a relative time range, you must specify a start percentage and an
     * end percentage. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartPercentage - 10
     * </p>
     * </li>
     * <li>
     * <p>
     * EndPercentage - 50
     * </p>
     * </li>
     * </ul>
     * <p>
     * This looks at the time range starting from 10% of the way into the call
     * to 50% of the way through the call. For a call that lasts 100,000
     * milliseconds, this example range would apply from the 10,000 millisecond
     * mark to the 50,000 millisecond mark.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param startPercentage <p>
     *            A value that indicates the percentage of the beginning of the
     *            time range. To set a relative time range, you must specify a
     *            start percentage and an end percentage. For example, if you
     *            specify the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            StartPercentage - 10
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EndPercentage - 50
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            This looks at the time range starting from 10% of the way into
     *            the call to 50% of the way through the call. For a call that
     *            lasts 100,000 milliseconds, this example range would apply
     *            from the 10,000 millisecond mark to the 50,000 millisecond
     *            mark.
     *            </p>
     */
    public void setStartPercentage(Integer startPercentage) {
        this.startPercentage = startPercentage;
    }

    /**
     * <p>
     * A value that indicates the percentage of the beginning of the time range.
     * To set a relative time range, you must specify a start percentage and an
     * end percentage. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartPercentage - 10
     * </p>
     * </li>
     * <li>
     * <p>
     * EndPercentage - 50
     * </p>
     * </li>
     * </ul>
     * <p>
     * This looks at the time range starting from 10% of the way into the call
     * to 50% of the way through the call. For a call that lasts 100,000
     * milliseconds, this example range would apply from the 10,000 millisecond
     * mark to the 50,000 millisecond mark.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param startPercentage <p>
     *            A value that indicates the percentage of the beginning of the
     *            time range. To set a relative time range, you must specify a
     *            start percentage and an end percentage. For example, if you
     *            specify the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            StartPercentage - 10
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EndPercentage - 50
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            This looks at the time range starting from 10% of the way into
     *            the call to 50% of the way through the call. For a call that
     *            lasts 100,000 milliseconds, this example range would apply
     *            from the 10,000 millisecond mark to the 50,000 millisecond
     *            mark.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelativeTimeRange withStartPercentage(Integer startPercentage) {
        this.startPercentage = startPercentage;
        return this;
    }

    /**
     * <p>
     * A value that indicates the percentage of the end of the time range. To
     * set a relative time range, you must specify a start percentage and an end
     * percentage. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartPercentage - 10
     * </p>
     * </li>
     * <li>
     * <p>
     * EndPercentage - 50
     * </p>
     * </li>
     * </ul>
     * <p>
     * This looks at the time range starting from 10% of the way into the call
     * to 50% of the way through the call. For a call that lasts 100,000
     * milliseconds, this example range would apply from the 10,000 millisecond
     * mark to the 50,000 millisecond mark.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         A value that indicates the percentage of the end of the time
     *         range. To set a relative time range, you must specify a start
     *         percentage and an end percentage. For example, if you specify the
     *         following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         StartPercentage - 10
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EndPercentage - 50
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This looks at the time range starting from 10% of the way into
     *         the call to 50% of the way through the call. For a call that
     *         lasts 100,000 milliseconds, this example range would apply from
     *         the 10,000 millisecond mark to the 50,000 millisecond mark.
     *         </p>
     */
    public Integer getEndPercentage() {
        return endPercentage;
    }

    /**
     * <p>
     * A value that indicates the percentage of the end of the time range. To
     * set a relative time range, you must specify a start percentage and an end
     * percentage. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartPercentage - 10
     * </p>
     * </li>
     * <li>
     * <p>
     * EndPercentage - 50
     * </p>
     * </li>
     * </ul>
     * <p>
     * This looks at the time range starting from 10% of the way into the call
     * to 50% of the way through the call. For a call that lasts 100,000
     * milliseconds, this example range would apply from the 10,000 millisecond
     * mark to the 50,000 millisecond mark.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param endPercentage <p>
     *            A value that indicates the percentage of the end of the time
     *            range. To set a relative time range, you must specify a start
     *            percentage and an end percentage. For example, if you specify
     *            the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            StartPercentage - 10
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EndPercentage - 50
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            This looks at the time range starting from 10% of the way into
     *            the call to 50% of the way through the call. For a call that
     *            lasts 100,000 milliseconds, this example range would apply
     *            from the 10,000 millisecond mark to the 50,000 millisecond
     *            mark.
     *            </p>
     */
    public void setEndPercentage(Integer endPercentage) {
        this.endPercentage = endPercentage;
    }

    /**
     * <p>
     * A value that indicates the percentage of the end of the time range. To
     * set a relative time range, you must specify a start percentage and an end
     * percentage. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartPercentage - 10
     * </p>
     * </li>
     * <li>
     * <p>
     * EndPercentage - 50
     * </p>
     * </li>
     * </ul>
     * <p>
     * This looks at the time range starting from 10% of the way into the call
     * to 50% of the way through the call. For a call that lasts 100,000
     * milliseconds, this example range would apply from the 10,000 millisecond
     * mark to the 50,000 millisecond mark.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param endPercentage <p>
     *            A value that indicates the percentage of the end of the time
     *            range. To set a relative time range, you must specify a start
     *            percentage and an end percentage. For example, if you specify
     *            the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            StartPercentage - 10
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EndPercentage - 50
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            This looks at the time range starting from 10% of the way into
     *            the call to 50% of the way through the call. For a call that
     *            lasts 100,000 milliseconds, this example range would apply
     *            from the 10,000 millisecond mark to the 50,000 millisecond
     *            mark.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelativeTimeRange withEndPercentage(Integer endPercentage) {
        this.endPercentage = endPercentage;
        return this;
    }

    /**
     * <p>
     * A range that takes the portion of the call up to the time in milliseconds
     * set by the value that you've specified. For example, if you specify
     * <code>120000</code>, the time range is set for the first 120,000
     * milliseconds of the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         A range that takes the portion of the call up to the time in
     *         milliseconds set by the value that you've specified. For example,
     *         if you specify <code>120000</code>, the time range is set for the
     *         first 120,000 milliseconds of the call.
     *         </p>
     */
    public Integer getFirst() {
        return first;
    }

    /**
     * <p>
     * A range that takes the portion of the call up to the time in milliseconds
     * set by the value that you've specified. For example, if you specify
     * <code>120000</code>, the time range is set for the first 120,000
     * milliseconds of the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param first <p>
     *            A range that takes the portion of the call up to the time in
     *            milliseconds set by the value that you've specified. For
     *            example, if you specify <code>120000</code>, the time range is
     *            set for the first 120,000 milliseconds of the call.
     *            </p>
     */
    public void setFirst(Integer first) {
        this.first = first;
    }

    /**
     * <p>
     * A range that takes the portion of the call up to the time in milliseconds
     * set by the value that you've specified. For example, if you specify
     * <code>120000</code>, the time range is set for the first 120,000
     * milliseconds of the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param first <p>
     *            A range that takes the portion of the call up to the time in
     *            milliseconds set by the value that you've specified. For
     *            example, if you specify <code>120000</code>, the time range is
     *            set for the first 120,000 milliseconds of the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelativeTimeRange withFirst(Integer first) {
        this.first = first;
        return this;
    }

    /**
     * <p>
     * A range that takes the portion of the call from the time in milliseconds
     * set by the value that you've specified to the end of the call. For
     * example, if you specify <code>120000</code>, the time range is set for
     * the last 120,000 milliseconds of the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         A range that takes the portion of the call from the time in
     *         milliseconds set by the value that you've specified to the end of
     *         the call. For example, if you specify <code>120000</code>, the
     *         time range is set for the last 120,000 milliseconds of the call.
     *         </p>
     */
    public Integer getLast() {
        return last;
    }

    /**
     * <p>
     * A range that takes the portion of the call from the time in milliseconds
     * set by the value that you've specified to the end of the call. For
     * example, if you specify <code>120000</code>, the time range is set for
     * the last 120,000 milliseconds of the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param last <p>
     *            A range that takes the portion of the call from the time in
     *            milliseconds set by the value that you've specified to the end
     *            of the call. For example, if you specify <code>120000</code>,
     *            the time range is set for the last 120,000 milliseconds of the
     *            call.
     *            </p>
     */
    public void setLast(Integer last) {
        this.last = last;
    }

    /**
     * <p>
     * A range that takes the portion of the call from the time in milliseconds
     * set by the value that you've specified to the end of the call. For
     * example, if you specify <code>120000</code>, the time range is set for
     * the last 120,000 milliseconds of the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param last <p>
     *            A range that takes the portion of the call from the time in
     *            milliseconds set by the value that you've specified to the end
     *            of the call. For example, if you specify <code>120000</code>,
     *            the time range is set for the last 120,000 milliseconds of the
     *            call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelativeTimeRange withLast(Integer last) {
        this.last = last;
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
        if (getStartPercentage() != null)
            sb.append("StartPercentage: " + getStartPercentage() + ",");
        if (getEndPercentage() != null)
            sb.append("EndPercentage: " + getEndPercentage() + ",");
        if (getFirst() != null)
            sb.append("First: " + getFirst() + ",");
        if (getLast() != null)
            sb.append("Last: " + getLast());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStartPercentage() == null) ? 0 : getStartPercentage().hashCode());
        hashCode = prime * hashCode
                + ((getEndPercentage() == null) ? 0 : getEndPercentage().hashCode());
        hashCode = prime * hashCode + ((getFirst() == null) ? 0 : getFirst().hashCode());
        hashCode = prime * hashCode + ((getLast() == null) ? 0 : getLast().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelativeTimeRange == false)
            return false;
        RelativeTimeRange other = (RelativeTimeRange) obj;

        if (other.getStartPercentage() == null ^ this.getStartPercentage() == null)
            return false;
        if (other.getStartPercentage() != null
                && other.getStartPercentage().equals(this.getStartPercentage()) == false)
            return false;
        if (other.getEndPercentage() == null ^ this.getEndPercentage() == null)
            return false;
        if (other.getEndPercentage() != null
                && other.getEndPercentage().equals(this.getEndPercentage()) == false)
            return false;
        if (other.getFirst() == null ^ this.getFirst() == null)
            return false;
        if (other.getFirst() != null && other.getFirst().equals(this.getFirst()) == false)
            return false;
        if (other.getLast() == null ^ this.getLast() == null)
            return false;
        if (other.getLast() != null && other.getLast().equals(this.getLast()) == false)
            return false;
        return true;
    }
}
