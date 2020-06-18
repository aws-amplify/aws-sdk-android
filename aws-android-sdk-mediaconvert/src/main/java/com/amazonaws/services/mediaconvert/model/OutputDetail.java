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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * Details regarding output
 */
public class OutputDetail implements Serializable {
    /**
     * Duration in milliseconds
     */
    private Integer durationInMs;

    /**
     * Contains details about the output's video stream
     */
    private VideoDetail videoDetails;

    /**
     * Duration in milliseconds
     *
     * @return Duration in milliseconds
     */
    public Integer getDurationInMs() {
        return durationInMs;
    }

    /**
     * Duration in milliseconds
     *
     * @param durationInMs Duration in milliseconds
     */
    public void setDurationInMs(Integer durationInMs) {
        this.durationInMs = durationInMs;
    }

    /**
     * Duration in milliseconds
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param durationInMs Duration in milliseconds
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputDetail withDurationInMs(Integer durationInMs) {
        this.durationInMs = durationInMs;
        return this;
    }

    /**
     * Contains details about the output's video stream
     *
     * @return Contains details about the output's video stream
     */
    public VideoDetail getVideoDetails() {
        return videoDetails;
    }

    /**
     * Contains details about the output's video stream
     *
     * @param videoDetails Contains details about the output's video stream
     */
    public void setVideoDetails(VideoDetail videoDetails) {
        this.videoDetails = videoDetails;
    }

    /**
     * Contains details about the output's video stream
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoDetails Contains details about the output's video stream
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputDetail withVideoDetails(VideoDetail videoDetails) {
        this.videoDetails = videoDetails;
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
        if (getDurationInMs() != null)
            sb.append("DurationInMs: " + getDurationInMs() + ",");
        if (getVideoDetails() != null)
            sb.append("VideoDetails: " + getVideoDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDurationInMs() == null) ? 0 : getDurationInMs().hashCode());
        hashCode = prime * hashCode
                + ((getVideoDetails() == null) ? 0 : getVideoDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputDetail == false)
            return false;
        OutputDetail other = (OutputDetail) obj;

        if (other.getDurationInMs() == null ^ this.getDurationInMs() == null)
            return false;
        if (other.getDurationInMs() != null
                && other.getDurationInMs().equals(this.getDurationInMs()) == false)
            return false;
        if (other.getVideoDetails() == null ^ this.getVideoDetails() == null)
            return false;
        if (other.getVideoDetails() != null
                && other.getVideoDetails().equals(this.getVideoDetails()) == false)
            return false;
        return true;
    }
}
