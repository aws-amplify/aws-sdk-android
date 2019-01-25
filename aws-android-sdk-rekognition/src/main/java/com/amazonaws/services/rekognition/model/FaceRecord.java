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
 * Object containing both the face metadata (stored in the back-end database)
 * and facial attributes that are detected but aren't stored in the database.
 * </p>
 */
public class FaceRecord implements Serializable {
    /**
     * <p>
     * Describes the face properties such as the bounding box, face ID, image ID
     * of the input image, and external image ID that you assigned.
     * </p>
     */
    private Face face;

    /**
     * <p>
     * Structure containing attributes of the face that the algorithm detected.
     * </p>
     */
    private FaceDetail faceDetail;

    /**
     * <p>
     * Describes the face properties such as the bounding box, face ID, image ID
     * of the input image, and external image ID that you assigned.
     * </p>
     *
     * @return <p>
     *         Describes the face properties such as the bounding box, face ID,
     *         image ID of the input image, and external image ID that you
     *         assigned.
     *         </p>
     */
    public Face getFace() {
        return face;
    }

    /**
     * <p>
     * Describes the face properties such as the bounding box, face ID, image ID
     * of the input image, and external image ID that you assigned.
     * </p>
     *
     * @param face <p>
     *            Describes the face properties such as the bounding box, face
     *            ID, image ID of the input image, and external image ID that
     *            you assigned.
     *            </p>
     */
    public void setFace(Face face) {
        this.face = face;
    }

    /**
     * <p>
     * Describes the face properties such as the bounding box, face ID, image ID
     * of the input image, and external image ID that you assigned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param face <p>
     *            Describes the face properties such as the bounding box, face
     *            ID, image ID of the input image, and external image ID that
     *            you assigned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceRecord withFace(Face face) {
        this.face = face;
        return this;
    }

    /**
     * <p>
     * Structure containing attributes of the face that the algorithm detected.
     * </p>
     *
     * @return <p>
     *         Structure containing attributes of the face that the algorithm
     *         detected.
     *         </p>
     */
    public FaceDetail getFaceDetail() {
        return faceDetail;
    }

    /**
     * <p>
     * Structure containing attributes of the face that the algorithm detected.
     * </p>
     *
     * @param faceDetail <p>
     *            Structure containing attributes of the face that the algorithm
     *            detected.
     *            </p>
     */
    public void setFaceDetail(FaceDetail faceDetail) {
        this.faceDetail = faceDetail;
    }

    /**
     * <p>
     * Structure containing attributes of the face that the algorithm detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceDetail <p>
     *            Structure containing attributes of the face that the algorithm
     *            detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceRecord withFaceDetail(FaceDetail faceDetail) {
        this.faceDetail = faceDetail;
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
        if (getFace() != null)
            sb.append("Face: " + getFace() + ",");
        if (getFaceDetail() != null)
            sb.append("FaceDetail: " + getFaceDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFace() == null) ? 0 : getFace().hashCode());
        hashCode = prime * hashCode + ((getFaceDetail() == null) ? 0 : getFaceDetail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FaceRecord == false)
            return false;
        FaceRecord other = (FaceRecord) obj;

        if (other.getFace() == null ^ this.getFace() == null)
            return false;
        if (other.getFace() != null && other.getFace().equals(this.getFace()) == false)
            return false;
        if (other.getFaceDetail() == null ^ this.getFaceDetail() == null)
            return false;
        if (other.getFaceDetail() != null
                && other.getFaceDetail().equals(this.getFaceDetail()) == false)
            return false;
        return true;
    }
}
