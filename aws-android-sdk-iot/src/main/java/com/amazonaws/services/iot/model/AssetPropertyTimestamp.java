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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * An asset property timestamp entry containing the following information.
 * </p>
 */
public class AssetPropertyTimestamp implements Serializable {
    /**
     * <p>
     * A string that contains the time in seconds since epoch. Accepts
     * substitution templates.
     * </p>
     */
    private String timeInSeconds;

    /**
     * <p>
     * Optional. A string that contains the nanosecond time offset. Accepts
     * substitution templates.
     * </p>
     */
    private String offsetInNanos;

    /**
     * <p>
     * A string that contains the time in seconds since epoch. Accepts
     * substitution templates.
     * </p>
     *
     * @return <p>
     *         A string that contains the time in seconds since epoch. Accepts
     *         substitution templates.
     *         </p>
     */
    public String getTimeInSeconds() {
        return timeInSeconds;
    }

    /**
     * <p>
     * A string that contains the time in seconds since epoch. Accepts
     * substitution templates.
     * </p>
     *
     * @param timeInSeconds <p>
     *            A string that contains the time in seconds since epoch.
     *            Accepts substitution templates.
     *            </p>
     */
    public void setTimeInSeconds(String timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    /**
     * <p>
     * A string that contains the time in seconds since epoch. Accepts
     * substitution templates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeInSeconds <p>
     *            A string that contains the time in seconds since epoch.
     *            Accepts substitution templates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetPropertyTimestamp withTimeInSeconds(String timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
        return this;
    }

    /**
     * <p>
     * Optional. A string that contains the nanosecond time offset. Accepts
     * substitution templates.
     * </p>
     *
     * @return <p>
     *         Optional. A string that contains the nanosecond time offset.
     *         Accepts substitution templates.
     *         </p>
     */
    public String getOffsetInNanos() {
        return offsetInNanos;
    }

    /**
     * <p>
     * Optional. A string that contains the nanosecond time offset. Accepts
     * substitution templates.
     * </p>
     *
     * @param offsetInNanos <p>
     *            Optional. A string that contains the nanosecond time offset.
     *            Accepts substitution templates.
     *            </p>
     */
    public void setOffsetInNanos(String offsetInNanos) {
        this.offsetInNanos = offsetInNanos;
    }

    /**
     * <p>
     * Optional. A string that contains the nanosecond time offset. Accepts
     * substitution templates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offsetInNanos <p>
     *            Optional. A string that contains the nanosecond time offset.
     *            Accepts substitution templates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetPropertyTimestamp withOffsetInNanos(String offsetInNanos) {
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

        if (obj instanceof AssetPropertyTimestamp == false)
            return false;
        AssetPropertyTimestamp other = (AssetPropertyTimestamp) obj;

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
