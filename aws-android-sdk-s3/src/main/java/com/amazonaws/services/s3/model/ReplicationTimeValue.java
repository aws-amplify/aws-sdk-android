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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * A container specifying the time value for S3 Replication Time Control (S3
 * RTC) and replication metrics <code>EventThreshold</code>.
 * </p>
 */
public class ReplicationTimeValue implements Serializable {
    /**
     * <p>
     * Contains an integer specifying time in minutes.
     * </p>
     * <p>
     * Valid values: 15 minutes.
     * </p>
     */
    private Integer minutes;

    /**
     * <p>
     * Contains an integer specifying time in minutes.
     * </p>
     * <p>
     * Valid values: 15 minutes.
     * </p>
     *
     * @return <p>
     *         Contains an integer specifying time in minutes.
     *         </p>
     *         <p>
     *         Valid values: 15 minutes.
     *         </p>
     */
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * <p>
     * Contains an integer specifying time in minutes.
     * </p>
     * <p>
     * Valid values: 15 minutes.
     * </p>
     *
     * @param minutes <p>
     *            Contains an integer specifying time in minutes.
     *            </p>
     *            <p>
     *            Valid values: 15 minutes.
     *            </p>
     */
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    /**
     * <p>
     * Contains an integer specifying time in minutes.
     * </p>
     * <p>
     * Valid values: 15 minutes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minutes <p>
     *            Contains an integer specifying time in minutes.
     *            </p>
     *            <p>
     *            Valid values: 15 minutes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTimeValue withMinutes(Integer minutes) {
        this.minutes = minutes;
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
        if (getMinutes() != null)
            sb.append("Minutes: " + getMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinutes() == null) ? 0 : getMinutes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationTimeValue == false)
            return false;
        ReplicationTimeValue other = (ReplicationTimeValue) obj;

        if (other.getMinutes() == null ^ this.getMinutes() == null)
            return false;
        if (other.getMinutes() != null && other.getMinutes().equals(this.getMinutes()) == false)
            return false;
        return true;
    }
}
