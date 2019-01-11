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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the source streaming video.
 * </p>
 */
public class StreamProcessorInput implements Serializable {
    /**
     * <p>
     * The Kinesis video stream input stream for the source streaming video.
     * </p>
     */
    private KinesisVideoStream kinesisVideoStream;

    /**
     * <p>
     * The Kinesis video stream input stream for the source streaming video.
     * </p>
     *
     * @return <p>
     *         The Kinesis video stream input stream for the source streaming
     *         video.
     *         </p>
     */
    public KinesisVideoStream getKinesisVideoStream() {
        return kinesisVideoStream;
    }

    /**
     * <p>
     * The Kinesis video stream input stream for the source streaming video.
     * </p>
     *
     * @param kinesisVideoStream <p>
     *            The Kinesis video stream input stream for the source streaming
     *            video.
     *            </p>
     */
    public void setKinesisVideoStream(KinesisVideoStream kinesisVideoStream) {
        this.kinesisVideoStream = kinesisVideoStream;
    }

    /**
     * <p>
     * The Kinesis video stream input stream for the source streaming video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kinesisVideoStream <p>
     *            The Kinesis video stream input stream for the source streaming
     *            video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamProcessorInput withKinesisVideoStream(KinesisVideoStream kinesisVideoStream) {
        this.kinesisVideoStream = kinesisVideoStream;
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
        if (getKinesisVideoStream() != null)
            sb.append("KinesisVideoStream: " + getKinesisVideoStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKinesisVideoStream() == null) ? 0 : getKinesisVideoStream().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamProcessorInput == false)
            return false;
        StreamProcessorInput other = (StreamProcessorInput) obj;

        if (other.getKinesisVideoStream() == null ^ this.getKinesisVideoStream() == null)
            return false;
        if (other.getKinesisVideoStream() != null
                && other.getKinesisVideoStream().equals(this.getKinesisVideoStream()) == false)
            return false;
        return true;
    }
}
