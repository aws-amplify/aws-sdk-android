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
 * Provides face metadata for target image faces that are analysed by
 * <code>CompareFaces</code> and <code>RecognizeCelebrities</code>.
 * </p>
 */
public class ComparedFace implements Serializable {
    /**
     * <p>
     * Bounding box of the face.
     * </p>
     */
    private BoundingBox boundingBox;

    /**
     * <p>
     * Level of confidence that what the bounding box contains is a face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float confidence;

    /**
     * <p>
     * An array of facial landmarks.
     * </p>
     */
    private java.util.List<Landmark> landmarks;

    /**
     * <p>
     * Indicates the pose of the face as determined by its pitch, roll, and yaw.
     * </p>
     */
    private Pose pose;

    /**
     * <p>
     * Identifies face image brightness and sharpness.
     * </p>
     */
    private ImageQuality quality;

    /**
     * <p>
     * Bounding box of the face.
     * </p>
     *
     * @return <p>
     *         Bounding box of the face.
     *         </p>
     */
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    /**
     * <p>
     * Bounding box of the face.
     * </p>
     *
     * @param boundingBox <p>
     *            Bounding box of the face.
     *            </p>
     */
    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * Bounding box of the face.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param boundingBox <p>
     *            Bounding box of the face.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComparedFace withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * <p>
     * Level of confidence that what the bounding box contains is a face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         Level of confidence that what the bounding box contains is a
     *         face.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * Level of confidence that what the bounding box contains is a face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            Level of confidence that what the bounding box contains is a
     *            face.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Level of confidence that what the bounding box contains is a face.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            Level of confidence that what the bounding box contains is a
     *            face.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComparedFace withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * <p>
     * An array of facial landmarks.
     * </p>
     *
     * @return <p>
     *         An array of facial landmarks.
     *         </p>
     */
    public java.util.List<Landmark> getLandmarks() {
        return landmarks;
    }

    /**
     * <p>
     * An array of facial landmarks.
     * </p>
     *
     * @param landmarks <p>
     *            An array of facial landmarks.
     *            </p>
     */
    public void setLandmarks(java.util.Collection<Landmark> landmarks) {
        if (landmarks == null) {
            this.landmarks = null;
            return;
        }

        this.landmarks = new java.util.ArrayList<Landmark>(landmarks);
    }

    /**
     * <p>
     * An array of facial landmarks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param landmarks <p>
     *            An array of facial landmarks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComparedFace withLandmarks(Landmark... landmarks) {
        if (getLandmarks() == null) {
            this.landmarks = new java.util.ArrayList<Landmark>(landmarks.length);
        }
        for (Landmark value : landmarks) {
            this.landmarks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of facial landmarks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param landmarks <p>
     *            An array of facial landmarks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComparedFace withLandmarks(java.util.Collection<Landmark> landmarks) {
        setLandmarks(landmarks);
        return this;
    }

    /**
     * <p>
     * Indicates the pose of the face as determined by its pitch, roll, and yaw.
     * </p>
     *
     * @return <p>
     *         Indicates the pose of the face as determined by its pitch, roll,
     *         and yaw.
     *         </p>
     */
    public Pose getPose() {
        return pose;
    }

    /**
     * <p>
     * Indicates the pose of the face as determined by its pitch, roll, and yaw.
     * </p>
     *
     * @param pose <p>
     *            Indicates the pose of the face as determined by its pitch,
     *            roll, and yaw.
     *            </p>
     */
    public void setPose(Pose pose) {
        this.pose = pose;
    }

    /**
     * <p>
     * Indicates the pose of the face as determined by its pitch, roll, and yaw.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pose <p>
     *            Indicates the pose of the face as determined by its pitch,
     *            roll, and yaw.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComparedFace withPose(Pose pose) {
        this.pose = pose;
        return this;
    }

    /**
     * <p>
     * Identifies face image brightness and sharpness.
     * </p>
     *
     * @return <p>
     *         Identifies face image brightness and sharpness.
     *         </p>
     */
    public ImageQuality getQuality() {
        return quality;
    }

    /**
     * <p>
     * Identifies face image brightness and sharpness.
     * </p>
     *
     * @param quality <p>
     *            Identifies face image brightness and sharpness.
     *            </p>
     */
    public void setQuality(ImageQuality quality) {
        this.quality = quality;
    }

    /**
     * <p>
     * Identifies face image brightness and sharpness.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quality <p>
     *            Identifies face image brightness and sharpness.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComparedFace withQuality(ImageQuality quality) {
        this.quality = quality;
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
        if (getBoundingBox() != null)
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence() + ",");
        if (getLandmarks() != null)
            sb.append("Landmarks: " + getLandmarks() + ",");
        if (getPose() != null)
            sb.append("Pose: " + getPose() + ",");
        if (getQuality() != null)
            sb.append("Quality: " + getQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getLandmarks() == null) ? 0 : getLandmarks().hashCode());
        hashCode = prime * hashCode + ((getPose() == null) ? 0 : getPose().hashCode());
        hashCode = prime * hashCode + ((getQuality() == null) ? 0 : getQuality().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComparedFace == false)
            return false;
        ComparedFace other = (ComparedFace) obj;

        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null
                && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getLandmarks() == null ^ this.getLandmarks() == null)
            return false;
        if (other.getLandmarks() != null
                && other.getLandmarks().equals(this.getLandmarks()) == false)
            return false;
        if (other.getPose() == null ^ this.getPose() == null)
            return false;
        if (other.getPose() != null && other.getPose().equals(this.getPose()) == false)
            return false;
        if (other.getQuality() == null ^ this.getQuality() == null)
            return false;
        if (other.getQuality() != null && other.getQuality().equals(this.getQuality()) == false)
            return false;
        return true;
    }
}
