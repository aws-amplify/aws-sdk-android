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
 * Provides information about a face in a target image that matches the source
 * image face analysed by <code>CompareFaces</code>. The <code>Face</code>
 * property contains the bounding box of the face in the target image. The
 * <code>Similarity</code> property is the confidence that the source image face
 * matches the face in the bounding box.
 * </p>
 */
public class CompareFacesMatch implements Serializable {
    /**
     * <p>
     * Level of confidence that the faces match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float similarity;

    /**
     * <p>
     * Provides face metadata (bounding box and confidence that the bounding box
     * actually contains a face).
     * </p>
     */
    private ComparedFace face;

    /**
     * <p>
     * Level of confidence that the faces match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         Level of confidence that the faces match.
     *         </p>
     */
    public Float getSimilarity() {
        return similarity;
    }

    /**
     * <p>
     * Level of confidence that the faces match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param similarity <p>
     *            Level of confidence that the faces match.
     *            </p>
     */
    public void setSimilarity(Float similarity) {
        this.similarity = similarity;
    }

    /**
     * <p>
     * Level of confidence that the faces match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param similarity <p>
     *            Level of confidence that the faces match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompareFacesMatch withSimilarity(Float similarity) {
        this.similarity = similarity;
        return this;
    }

    /**
     * <p>
     * Provides face metadata (bounding box and confidence that the bounding box
     * actually contains a face).
     * </p>
     *
     * @return <p>
     *         Provides face metadata (bounding box and confidence that the
     *         bounding box actually contains a face).
     *         </p>
     */
    public ComparedFace getFace() {
        return face;
    }

    /**
     * <p>
     * Provides face metadata (bounding box and confidence that the bounding box
     * actually contains a face).
     * </p>
     *
     * @param face <p>
     *            Provides face metadata (bounding box and confidence that the
     *            bounding box actually contains a face).
     *            </p>
     */
    public void setFace(ComparedFace face) {
        this.face = face;
    }

    /**
     * <p>
     * Provides face metadata (bounding box and confidence that the bounding box
     * actually contains a face).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param face <p>
     *            Provides face metadata (bounding box and confidence that the
     *            bounding box actually contains a face).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompareFacesMatch withFace(ComparedFace face) {
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

        if (obj instanceof CompareFacesMatch == false)
            return false;
        CompareFacesMatch other = (CompareFacesMatch) obj;

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
