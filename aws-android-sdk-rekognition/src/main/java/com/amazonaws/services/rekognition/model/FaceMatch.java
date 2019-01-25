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
 * Provides face metadata. In addition, it also provides the confidence in the
 * match of this face with the input face.
 * </p>
 */
public class FaceMatch implements Serializable {
    /**
     * <p>
     * Confidence in the match of this face with the input face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float similarity;

    /**
     * <p>
     * Describes the face properties such as the bounding box, face ID, image ID
     * of the source image, and external image ID that you assigned.
     * </p>
     */
    private Face face;

    /**
     * <p>
     * Confidence in the match of this face with the input face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         Confidence in the match of this face with the input face.
     *         </p>
     */
    public Float getSimilarity() {
        return similarity;
    }

    /**
     * <p>
     * Confidence in the match of this face with the input face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param similarity <p>
     *            Confidence in the match of this face with the input face.
     *            </p>
     */
    public void setSimilarity(Float similarity) {
        this.similarity = similarity;
    }

    /**
     * <p>
     * Confidence in the match of this face with the input face.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param similarity <p>
     *            Confidence in the match of this face with the input face.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceMatch withSimilarity(Float similarity) {
        this.similarity = similarity;
        return this;
    }

    /**
     * <p>
     * Describes the face properties such as the bounding box, face ID, image ID
     * of the source image, and external image ID that you assigned.
     * </p>
     *
     * @return <p>
     *         Describes the face properties such as the bounding box, face ID,
     *         image ID of the source image, and external image ID that you
     *         assigned.
     *         </p>
     */
    public Face getFace() {
        return face;
    }

    /**
     * <p>
     * Describes the face properties such as the bounding box, face ID, image ID
     * of the source image, and external image ID that you assigned.
     * </p>
     *
     * @param face <p>
     *            Describes the face properties such as the bounding box, face
     *            ID, image ID of the source image, and external image ID that
     *            you assigned.
     *            </p>
     */
    public void setFace(Face face) {
        this.face = face;
    }

    /**
     * <p>
     * Describes the face properties such as the bounding box, face ID, image ID
     * of the source image, and external image ID that you assigned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param face <p>
     *            Describes the face properties such as the bounding box, face
     *            ID, image ID of the source image, and external image ID that
     *            you assigned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceMatch withFace(Face face) {
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
        if (getSimilarity() != null)
            sb.append("Similarity: " + getSimilarity() + ",");
        if (getFace() != null)
            sb.append("Face: " + getFace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSimilarity() == null) ? 0 : getSimilarity().hashCode());
        hashCode = prime * hashCode + ((getFace() == null) ? 0 : getFace().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FaceMatch == false)
            return false;
        FaceMatch other = (FaceMatch) obj;

        if (other.getSimilarity() == null ^ this.getSimilarity() == null)
            return false;
        if (other.getSimilarity() != null
                && other.getSimilarity().equals(this.getSimilarity()) == false)
            return false;
        if (other.getFace() == null ^ this.getFace() == null)
            return false;
        if (other.getFace() != null && other.getFace().equals(this.getFace()) == false)
            return false;
        return true;
    }
}
