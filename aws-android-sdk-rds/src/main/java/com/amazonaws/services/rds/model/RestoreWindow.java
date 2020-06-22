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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Earliest and latest time an instance can be restored to:
 * </p>
 */
public class RestoreWindow implements Serializable {
    /**
     * <p>
     * The earliest time you can restore an instance to.
     * </p>
     */
    private java.util.Date earliestTime;

    /**
     * <p>
     * The latest time you can restore an instance to.
     * </p>
     */
    private java.util.Date latestTime;

    /**
     * <p>
     * The earliest time you can restore an instance to.
     * </p>
     *
     * @return <p>
     *         The earliest time you can restore an instance to.
     *         </p>
     */
    public java.util.Date getEarliestTime() {
        return earliestTime;
    }

    /**
     * <p>
     * The earliest time you can restore an instance to.
     * </p>
     *
     * @param earliestTime <p>
     *            The earliest time you can restore an instance to.
     *            </p>
     */
    public void setEarliestTime(java.util.Date earliestTime) {
        this.earliestTime = earliestTime;
    }

    /**
     * <p>
     * The earliest time you can restore an instance to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param earliestTime <p>
     *            The earliest time you can restore an instance to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreWindow withEarliestTime(java.util.Date earliestTime) {
        this.earliestTime = earliestTime;
        return this;
    }

    /**
     * <p>
     * The latest time you can restore an instance to.
     * </p>
     *
     * @return <p>
     *         The latest time you can restore an instance to.
     *         </p>
     */
    public java.util.Date getLatestTime() {
        return latestTime;
    }

    /**
     * <p>
     * The latest time you can restore an instance to.
     * </p>
     *
     * @param latestTime <p>
     *            The latest time you can restore an instance to.
     *            </p>
     */
    public void setLatestTime(java.util.Date latestTime) {
        this.latestTime = latestTime;
    }

    /**
     * <p>
     * The latest time you can restore an instance to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latestTime <p>
     *            The latest time you can restore an instance to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreWindow withLatestTime(java.util.Date latestTime) {
        this.latestTime = latestTime;
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
        if (getEarliestTime() != null)
            sb.append("EarliestTime: " + getEarliestTime() + ",");
        if (getLatestTime() != null)
            sb.append("LatestTime: " + getLatestTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEarliestTime() == null) ? 0 : getEarliestTime().hashCode());
        hashCode = prime * hashCode + ((getLatestTime() == null) ? 0 : getLatestTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreWindow == false)
            return false;
        RestoreWindow other = (RestoreWindow) obj;

        if (other.getEarliestTime() == null ^ this.getEarliestTime() == null)
            return false;
        if (other.getEarliestTime() != null
                && other.getEarliestTime().equals(this.getEarliestTime()) == false)
            return false;
        if (other.getLatestTime() == null ^ this.getLatestTime() == null)
            return false;
        if (other.getLatestTime() != null
                && other.getLatestTime().equals(this.getLatestTime()) == false)
            return false;
        return true;
    }
}
