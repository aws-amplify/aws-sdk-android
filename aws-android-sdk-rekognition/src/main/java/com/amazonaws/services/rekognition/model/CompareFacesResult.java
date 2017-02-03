/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class CompareFacesResult implements Serializable {
    /**
     * <p>
     * The face from the source image that was used for comparison.
     * </p>
     */
    private ComparedSourceImageFace sourceImageFace;

    /**
     * <p>
     * Provides an array of <code>CompareFacesMatch </code> objects. Each object
     * provides the bounding box, confidence that the bounding box contains a
     * face, and the similarity between the face in the bounding box and the
     * face in the source image.
     * </p>
     */
    private java.util.List<CompareFacesMatch> faceMatches;

    /**
     * <p>
     * The face from the source image that was used for comparison.
     * </p>
     *
     * @return <p>
     *         The face from the source image that was used for comparison.
     *         </p>
     */
    public ComparedSourceImageFace getSourceImageFace() {
        return sourceImageFace;
    }

    /**
     * <p>
     * The face from the source image that was used for comparison.
     * </p>
     *
     * @param sourceImageFace <p>
     *            The face from the source image that was used for comparison.
     *            </p>
     */
    public void setSourceImageFace(ComparedSourceImageFace sourceImageFace) {
        this.sourceImageFace = sourceImageFace;
    }

    /**
     * <p>
     * The face from the source image that was used for comparison.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceImageFace <p>
     *            The face from the source image that was used for comparison.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompareFacesResult withSourceImageFace(ComparedSourceImageFace sourceImageFace) {
        this.sourceImageFace = sourceImageFace;
        return this;
    }

    /**
     * <p>
     * Provides an array of <code>CompareFacesMatch </code> objects. Each object
     * provides the bounding box, confidence that the bounding box contains a
     * face, and the similarity between the face in the bounding box and the
     * face in the source image.
     * </p>
     *
     * @return <p>
     *         Provides an array of <code>CompareFacesMatch </code> objects.
     *         Each object provides the bounding box, confidence that the
     *         bounding box contains a face, and the similarity between the face
     *         in the bounding box and the face in the source image.
     *         </p>
     */
    public java.util.List<CompareFacesMatch> getFaceMatches() {
        return faceMatches;
    }

    /**
     * <p>
     * Provides an array of <code>CompareFacesMatch </code> objects. Each object
     * provides the bounding box, confidence that the bounding box contains a
     * face, and the similarity between the face in the bounding box and the
     * face in the source image.
     * </p>
     *
     * @param faceMatches <p>
     *            Provides an array of <code>CompareFacesMatch </code> objects.
     *            Each object provides the bounding box, confidence that the
     *            bounding box contains a face, and the similarity between the
     *            face in the bounding box and the face in the source image.
     *            </p>
     */
    public void setFaceMatches(java.util.Collection<CompareFacesMatch> faceMatches) {
        if (faceMatches == null) {
            this.faceMatches = null;
            return;
        }

        this.faceMatches = new java.util.ArrayList<CompareFacesMatch>(faceMatches);
    }

    /**
     * <p>
     * Provides an array of <code>CompareFacesMatch </code> objects. Each object
     * provides the bounding box, confidence that the bounding box contains a
     * face, and the similarity between the face in the bounding box and the
     * face in the source image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceMatches <p>
     *            Provides an array of <code>CompareFacesMatch </code> objects.
     *            Each object provides the bounding box, confidence that the
     *            bounding box contains a face, and the similarity between the
     *            face in the bounding box and the face in the source image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompareFacesResult withFaceMatches(CompareFacesMatch... faceMatches) {
        if (getFaceMatches() == null) {
            this.faceMatches = new java.util.ArrayList<CompareFacesMatch>(faceMatches.length);
        }
        for (CompareFacesMatch value : faceMatches) {
            this.faceMatches.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Provides an array of <code>CompareFacesMatch </code> objects. Each object
     * provides the bounding box, confidence that the bounding box contains a
     * face, and the similarity between the face in the bounding box and the
     * face in the source image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceMatches <p>
     *            Provides an array of <code>CompareFacesMatch </code> objects.
     *            Each object provides the bounding box, confidence that the
     *            bounding box contains a face, and the similarity between the
     *            face in the bounding box and the face in the source image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompareFacesResult withFaceMatches(java.util.Collection<CompareFacesMatch> faceMatches) {
        setFaceMatches(faceMatches);
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
        if (getSourceImageFace() != null)
            sb.append("SourceImageFace: " + getSourceImageFace() + ",");
        if (getFaceMatches() != null)
            sb.append("FaceMatches: " + getFaceMatches());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceImageFace() == null) ? 0 : getSourceImageFace().hashCode());
        hashCode = prime * hashCode
                + ((getFaceMatches() == null) ? 0 : getFaceMatches().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompareFacesResult == false)
            return false;
        CompareFacesResult other = (CompareFacesResult) obj;

        if (other.getSourceImageFace() == null ^ this.getSourceImageFace() == null)
            return false;
        if (other.getSourceImageFace() != null
                && other.getSourceImageFace().equals(this.getSourceImageFace()) == false)
            return false;
        if (other.getFaceMatches() == null ^ this.getFaceMatches() == null)
            return false;
        if (other.getFaceMatches() != null
                && other.getFaceMatches().equals(this.getFaceMatches()) == false)
            return false;
        return true;
    }
}
