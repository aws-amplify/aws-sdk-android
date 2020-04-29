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

package com.amazonaws.services.awsiotsitewise.model;

import java.io.Serializable;

/**
 * <p>
 * Contains a timestamp with optional nanosecond granularity.
 * </p>
 */
public class TimeInNanos implements Serializable {
    /**
     * <p>
     * The timestamp date, in seconds, in the Unix epoch format. Fractional
     * nanosecond data is provided by <code>offsetInNanos</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31556889864403199<br/>
     */
    private Long timeInSeconds;

    /**
     * <p>
     * The nanosecond offset from <code>timeInSeconds</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 999999999<br/>
     */
    private Integer offsetInNanos;

    /**
     * <p>
     * The timestamp date, in seconds, in the Unix epoch format. Fractional
     * nanosecond data is provided by <code>offsetInNanos</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31556889864403199<br/>
     *
     * @return <p>
     *         The timestamp date, in seconds, in the Unix epoch format.
     *         Fractional nanosecond data is provided by
     *         <code>offsetInNanos</code>.
     *         </p>
     */
    public Long getTimeInSeconds() {
        return timeInSeconds;
    }

    /**
     * <p>
     * The timestamp date, in seconds, in the Unix epoch format. Fractional
     * nanosecond data is provided by <code>offsetInNanos</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31556889864403199<br/>
     *
     * @param timeInSeconds <p>
     *            The timestamp date, in seconds, in the Unix epoch format.
     *            Fractional nanosecond data is provided by
     *            <code>offsetInNanos</code>.
     *            </p>
     */
    public void setTimeInSeconds(Long timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    /**
     * <p>
     * The timestamp date, in seconds, in the Unix epoch format. Fractional
     * nanosecond data is provided by <code>offsetInNanos</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31556889864403199<br/>
     *
     * @param timeInSeconds <p>
     *            The timestamp date, in seconds, in the Unix epoch format.
     *            Fractional nanosecond data is provided by
     *            <code>offsetInNanos</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimeInNanos withTimeInSeconds(Long timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
        return this;
    }

    /**
     * <p>
     * The nanosecond offset from <code>timeInSeconds</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 999999999<br/>
     *
     * @return <p>
     *         The nanosecond offset from <code>timeInSeconds</code>.
     *         </p>
     */
    public Integer getOffsetInNanos() {
        return offsetInNanos;
    }

    /**
     * <p>
     * The nanosecond offset from <code>timeInSeconds</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 999999999<br/>
     *
     * @param offsetInNanos <p>
     *            The nanosecond offset from <code>timeInSeconds</code>.
     *            </p>
     */
    public void setOffsetInNanos(Integer offsetInNanos) {
        this.offsetInNanos = offsetInNanos;
    }

    /**
     * <p>
     * The nanosecond offset from <code>timeInSeconds</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 999999999<br/>
     *
     * @param offsetInNanos <p>
     *            The nanosecond offset from <code>timeInSeconds</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimeInNanos withOffsetInNanos(Integer offsetInNanos) {
        this.offsetInNanos = offsetInNanos;
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
        if (getTimeInSeconds() != null)
            sb.append("timeInSeconds: " + getTimeInSeconds() + ",");
        if (getOffsetInNanos() != null)
            sb.append("offsetInNanos: " + getOffsetInNanos());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTimeInSeconds() == null) ? 0 : getTimeInSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getOffsetInNanos() == null) ? 0 : getOffsetInNanos().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeInNanos == false)
            return false;
        TimeInNanos other = (TimeInNanos) obj;

        if (other.getTimeInSeconds() == null ^ this.getTimeInSeconds() == null)
            return false;
        if (other.getTimeInSeconds() != null
                && other.getTimeInSeconds().equals(this.getTimeInSeconds()) == false)
            return false;
        if (other.getOffsetInNanos() == null ^ this.getOffsetInNanos() == null)
            return false;
        if (other.getOffsetInNanos() != null
                && other.getOffsetInNanos().equals(this.getOffsetInNanos()) == false)
            return false;
        return true;
    }
}
