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

package com.amazonaws.services.synthetics.model;

import java.io.Serializable;

/**
 * <p>
 * This structure contains the start and end times of a single canary run.
 * </p>
 */
public class CanaryRunTimeline implements Serializable {
    /**
     * <p>
     * The start time of the run.
     * </p>
     */
    private java.util.Date started;

    /**
     * <p>
     * The end time of the run.
     * </p>
     */
    private java.util.Date completed;

    /**
     * <p>
     * The start time of the run.
     * </p>
     *
     * @return <p>
     *         The start time of the run.
     *         </p>
     */
    public java.util.Date getStarted() {
        return started;
    }

    /**
     * <p>
     * The start time of the run.
     * </p>
     *
     * @param started <p>
     *            The start time of the run.
     *            </p>
     */
    public void setStarted(java.util.Date started) {
        this.started = started;
    }

    /**
     * <p>
     * The start time of the run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param started <p>
     *            The start time of the run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryRunTimeline withStarted(java.util.Date started) {
        this.started = started;
        return this;
    }

    /**
     * <p>
     * The end time of the run.
     * </p>
     *
     * @return <p>
     *         The end time of the run.
     *         </p>
     */
    public java.util.Date getCompleted() {
        return completed;
    }

    /**
     * <p>
     * The end time of the run.
     * </p>
     *
     * @param completed <p>
     *            The end time of the run.
     *            </p>
     */
    public void setCompleted(java.util.Date completed) {
        this.completed = completed;
    }

    /**
     * <p>
     * The end time of the run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completed <p>
     *            The end time of the run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryRunTimeline withCompleted(java.util.Date completed) {
        this.completed = completed;
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
        if (getStarted() != null)
            sb.append("Started: " + getStarted() + ",");
        if (getCompleted() != null)
            sb.append("Completed: " + getCompleted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStarted() == null) ? 0 : getStarted().hashCode());
        hashCode = prime * hashCode + ((getCompleted() == null) ? 0 : getCompleted().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanaryRunTimeline == false)
            return false;
        CanaryRunTimeline other = (CanaryRunTimeline) obj;

        if (other.getStarted() == null ^ this.getStarted() == null)
            return false;
        if (other.getStarted() != null && other.getStarted().equals(this.getStarted()) == false)
            return false;
        if (other.getCompleted() == null ^ this.getCompleted() == null)
            return false;
        if (other.getCompleted() != null
                && other.getCompleted().equals(this.getCompleted()) == false)
            return false;
        return true;
    }
}
