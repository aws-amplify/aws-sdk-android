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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

/**
 * <p>
 * The time range.
 * </p>
 */
public class TimeRange implements Serializable {
    /**
     * <p>
     * The start time, in Unix time in seconds. For more information see <a
     * href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     */
    private java.util.Date fromInclusive;

    /**
     * <p>
     * The end time, in Unix time in seconds. For more information see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     */
    private java.util.Date toExclusive;

    /**
     * <p>
     * The start time, in Unix time in seconds. For more information see <a
     * href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     *
     * @return <p>
     *         The start time, in Unix time in seconds. For more information see
     *         <a href=
     *         "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *         >timestamp</a>.
     *         </p>
     */
    public java.util.Date getFromInclusive() {
        return fromInclusive;
    }

    /**
     * <p>
     * The start time, in Unix time in seconds. For more information see <a
     * href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     *
     * @param fromInclusive <p>
     *            The start time, in Unix time in seconds. For more information
     *            see <a href=
     *            "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *            >timestamp</a>.
     *            </p>
     */
    public void setFromInclusive(java.util.Date fromInclusive) {
        this.fromInclusive = fromInclusive;
    }

    /**
     * <p>
     * The start time, in Unix time in seconds. For more information see <a
     * href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromInclusive <p>
     *            The start time, in Unix time in seconds. For more information
     *            see <a href=
     *            "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *            >timestamp</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimeRange withFromInclusive(java.util.Date fromInclusive) {
        this.fromInclusive = fromInclusive;
        return this;
    }

    /**
     * <p>
     * The end time, in Unix time in seconds. For more information see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     *
     * @return <p>
     *         The end time, in Unix time in seconds. For more information see
     *         <a href=
     *         "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *         >timestamp</a>.
     *         </p>
     */
    public java.util.Date getToExclusive() {
        return toExclusive;
    }

    /**
     * <p>
     * The end time, in Unix time in seconds. For more information see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     *
     * @param toExclusive <p>
     *            The end time, in Unix time in seconds. For more information
     *            see <a href=
     *            "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *            >timestamp</a>.
     *            </p>
     */
    public void setToExclusive(java.util.Date toExclusive) {
        this.toExclusive = toExclusive;
    }

    /**
     * <p>
     * The end time, in Unix time in seconds. For more information see <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param toExclusive <p>
     *            The end time, in Unix time in seconds. For more information
     *            see <a href=
     *            "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *            >timestamp</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimeRange withToExclusive(java.util.Date toExclusive) {
        this.toExclusive = toExclusive;
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
        if (getFromInclusive() != null)
            sb.append("FromInclusive: " + getFromInclusive() + ",");
        if (getToExclusive() != null)
            sb.append("ToExclusive: " + getToExclusive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFromInclusive() == null) ? 0 : getFromInclusive().hashCode());
        hashCode = prime * hashCode
                + ((getToExclusive() == null) ? 0 : getToExclusive().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeRange == false)
            return false;
        TimeRange other = (TimeRange) obj;

        if (other.getFromInclusive() == null ^ this.getFromInclusive() == null)
            return false;
        if (other.getFromInclusive() != null
                && other.getFromInclusive().equals(this.getFromInclusive()) == false)
            return false;
        if (other.getToExclusive() == null ^ this.getToExclusive() == null)
            return false;
        if (other.getToExclusive() != null
                && other.getToExclusive().equals(this.getToExclusive()) == false)
            return false;
        return true;
    }
}
