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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * Information about when jobs are submitted, started, and finished is specified
 * in Unix epoch format in seconds.
 */
public class Timing implements Serializable {
    /**
     * The time, in Unix epoch format, that the transcoding job finished
     */
    private java.util.Date finishTime;

    /**
     * The time, in Unix epoch format, that transcoding for the job began.
     */
    private java.util.Date startTime;

    /**
     * The time, in Unix epoch format, that you submitted the job.
     */
    private java.util.Date submitTime;

    /**
     * The time, in Unix epoch format, that the transcoding job finished
     *
     * @return The time, in Unix epoch format, that the transcoding job finished
     */
    public java.util.Date getFinishTime() {
        return finishTime;
    }

    /**
     * The time, in Unix epoch format, that the transcoding job finished
     *
     * @param finishTime The time, in Unix epoch format, that the transcoding
     *            job finished
     */
    public void setFinishTime(java.util.Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * The time, in Unix epoch format, that the transcoding job finished
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finishTime The time, in Unix epoch format, that the transcoding
     *            job finished
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Timing withFinishTime(java.util.Date finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * The time, in Unix epoch format, that transcoding for the job began.
     *
     * @return The time, in Unix epoch format, that transcoding for the job
     *         began.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * The time, in Unix epoch format, that transcoding for the job began.
     *
     * @param startTime The time, in Unix epoch format, that transcoding for the
     *            job began.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * The time, in Unix epoch format, that transcoding for the job began.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime The time, in Unix epoch format, that transcoding for the
     *            job began.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Timing withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The time, in Unix epoch format, that you submitted the job.
     *
     * @return The time, in Unix epoch format, that you submitted the job.
     */
    public java.util.Date getSubmitTime() {
        return submitTime;
    }

    /**
     * The time, in Unix epoch format, that you submitted the job.
     *
     * @param submitTime The time, in Unix epoch format, that you submitted the
     *            job.
     */
    public void setSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * The time, in Unix epoch format, that you submitted the job.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submitTime The time, in Unix epoch format, that you submitted the
     *            job.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Timing withSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
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
        if (getFinishTime() != null)
            sb.append("FinishTime: " + getFinishTime() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getSubmitTime() != null)
            sb.append("SubmitTime: " + getSubmitTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFinishTime() == null) ? 0 : getFinishTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Timing == false)
            return false;
        Timing other = (Timing) obj;

        if (other.getFinishTime() == null ^ this.getFinishTime() == null)
            return false;
        if (other.getFinishTime() != null
                && other.getFinishTime().equals(this.getFinishTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getSubmitTime() == null ^ this.getSubmitTime() == null)
            return false;
        if (other.getSubmitTime() != null
                && other.getSubmitTime().equals(this.getSubmitTime()) == false)
            return false;
        return true;
    }
}
