/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about a face detected in a video analysis request and the time
 * the face was detected in the video.
 * </p>
 */
public class FaceDetection implements Serializable {
    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the face was
     * detected.
     * </p>
     */
    private Long timestamp;

    /**
     * <p>
     * The face properties for the detected face.
     * </p>
     */
    private FaceDetail face;

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the face was
     * detected.
     * </p>
     *
     * @return <p>
     *         Time, in milliseconds from the start of the video, that the face
     *         was detected.
     *         </p>
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the face was
     * detected.
     * </p>
     *
     * @param timestamp <p>
     *            Time, in milliseconds from the start of the video, that the
     *            face was detected.
     *            </p>
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the face was
     * detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            Time, in milliseconds from the start of the video, that the
     *            face was detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetection withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * The face properties for the detected face.
     * </p>
     *
     * @return <p>
     *         The face properties for the detected face.
     *         </p>
     */
    public FaceDetail getFace() {
        return face;
    }

    /**
     * <p>
     * The face properties for the detected face.
     * </p>
     *
     * @param face <p>
     *            The face properties for the detected face.
     *            </p>
     */
    public void setFace(FaceDetail face) {
        this.face = face;
    }

    /**
     * <p>
     * The face properties for the detected face.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param face <p>
     *            The face properties for the detected face.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceDetection withFace(FaceDetail face) {
        this.face = face;
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
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getFace() != null)
            sb.append("Face: " + getFace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getFace() == null) ? 0 : getFace().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FaceDetection == false)
            return false;
        FaceDetection other = (FaceDetection) obj;

        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getFace() == null ^ this.getFace() == null)
            return false;
        if (other.getFace() != null && other.getFace().equals(this.getFace()) == false)
            return false;
        return true;
    }
}
