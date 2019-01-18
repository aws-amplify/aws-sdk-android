/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideoarchivedmedia.model;

import java.io.Serializable;

/**
 * <p>
 * The range of time stamps for which to return fragments.
 * </p>
 */
public class TimestampRange implements Serializable {
    /**
     * <p>
     * The starting time stamp in the range of time stamps for which to return
     * fragments.
     * </p>
     */
    private java.util.Date startTimestamp;

    /**
     * <p>
     * The ending time stamp in the range of time stamps for which to return
     * fragments.
     * </p>
     */
    private java.util.Date endTimestamp;

    /**
     * <p>
     * The starting time stamp in the range of time stamps for which to return
     * fragments.
     * </p>
     *
     * @return <p>
     *         The starting time stamp in the range of time stamps for which to
     *         return fragments.
     *         </p>
     */
    public java.util.Date getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * <p>
     * The starting time stamp in the range of time stamps for which to return
     * fragments.
     * </p>
     *
     * @param startTimestamp <p>
     *            The starting time stamp in the range of time stamps for which
     *            to return fragments.
     *            </p>
     */
    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * <p>
     * The starting time stamp in the range of time stamps for which to return
     * fragments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTimestamp <p>
     *            The starting time stamp in the range of time stamps for which
     *            to return fragments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimestampRange withStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    /**
     * <p>
     * The ending time stamp in the range of time stamps for which to return
     * fragments.
     * </p>
     *
     * @return <p>
     *         The ending time stamp in the range of time stamps for which to
     *         return fragments.
     *         </p>
     */
    public java.util.Date getEndTimestamp() {
        return endTimestamp;
    }

    /**
     * <p>
     * The ending time stamp in the range of time stamps for which to return
     * fragments.
     * </p>
     *
     * @param endTimestamp <p>
     *            The ending time stamp in the range of time stamps for which to
     *            return fragments.
     *            </p>
     */
    public void setEndTimestamp(java.util.Date endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * <p>
     * The ending time stamp in the range of time stamps for which to return
     * fragments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTimestamp <p>
     *            The ending time stamp in the range of time stamps for which to
     *            return fragments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimestampRange withEndTimestamp(java.util.Date endTimestamp) {
        this.endTimestamp = endTimestamp;
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
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: " + getStartTimestamp() + ",");
        if (getEndTimestamp() != null)
            sb.append("EndTimestamp: " + getEndTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getEndTimestamp() == null) ? 0 : getEndTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimestampRange == false)
            return false;
        TimestampRange other = (TimestampRange) obj;

        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null
                && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        if (other.getEndTimestamp() == null ^ this.getEndTimestamp() == null)
            return false;
        if (other.getEndTimestamp() != null
                && other.getEndTimestamp().equals(this.getEndTimestamp()) == false)
            return false;
        return true;
    }
}
