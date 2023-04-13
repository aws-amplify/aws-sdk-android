/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies when to stop processing the stream. You can specify a maximum
 * amount of time to process the video.
 * </p>
 */
public class StreamProcessingStopSelector implements Serializable {
    /**
     * <p>
     * Specifies the maximum amount of time in seconds that you want the stream
     * to be processed. The largest amount of time is 2 minutes. The default is
     * 10 seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 120<br/>
     */
    private Long maxDurationInSeconds;

    /**
     * <p>
     * Specifies the maximum amount of time in seconds that you want the stream
     * to be processed. The largest amount of time is 2 minutes. The default is
     * 10 seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 120<br/>
     *
     * @return <p>
     *         Specifies the maximum amount of time in seconds that you want the
     *         stream to be processed. The largest amount of time is 2 minutes.
     *         The default is 10 seconds.
     *         </p>
     */
    public Long getMaxDurationInSeconds() {
        return maxDurationInSeconds;
    }

    /**
     * <p>
     * Specifies the maximum amount of time in seconds that you want the stream
     * to be processed. The largest amount of time is 2 minutes. The default is
     * 10 seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 120<br/>
     *
     * @param maxDurationInSeconds <p>
     *            Specifies the maximum amount of time in seconds that you want
     *            the stream to be processed. The largest amount of time is 2
     *            minutes. The default is 10 seconds.
     *            </p>
     */
    public void setMaxDurationInSeconds(Long maxDurationInSeconds) {
        this.maxDurationInSeconds = maxDurationInSeconds;
    }

    /**
     * <p>
     * Specifies the maximum amount of time in seconds that you want the stream
     * to be processed. The largest amount of time is 2 minutes. The default is
     * 10 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 120<br/>
     *
     * @param maxDurationInSeconds <p>
     *            Specifies the maximum amount of time in seconds that you want
     *            the stream to be processed. The largest amount of time is 2
     *            minutes. The default is 10 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamProcessingStopSelector withMaxDurationInSeconds(Long maxDurationInSeconds) {
        this.maxDurationInSeconds = maxDurationInSeconds;
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
        if (getMaxDurationInSeconds() != null)
            sb.append("MaxDurationInSeconds: " + getMaxDurationInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMaxDurationInSeconds() == null) ? 0 : getMaxDurationInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamProcessingStopSelector == false)
            return false;
        StreamProcessingStopSelector other = (StreamProcessingStopSelector) obj;

        if (other.getMaxDurationInSeconds() == null ^ this.getMaxDurationInSeconds() == null)
            return false;
        if (other.getMaxDurationInSeconds() != null
                && other.getMaxDurationInSeconds().equals(this.getMaxDurationInSeconds()) == false)
            return false;
        return true;
    }
}
