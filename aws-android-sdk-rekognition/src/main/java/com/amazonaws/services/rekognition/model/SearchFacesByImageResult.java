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

public class SearchFacesByImageResult implements Serializable {
    /**
     * <p>
     * The bounding box around the face in the input image that Amazon
     * Rekognition used for the search.
     * </p>
     */
    private BoundingBox searchedFaceBoundingBox;

    /**
     * <p>
     * The level of confidence that the <code>searchedFaceBoundingBox</code>,
     * contains a face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float searchedFaceConfidence;

    /**
     * <p>
     * An array of faces that match the input face, along with the confidence in
     * the match.
     * </p>
     */
    private java.util.List<FaceMatch> faceMatches;

    /**
     * <p>
     * Version number of the face detection model associated with the input
     * collection (<code>CollectionId</code>).
     * </p>
     */
    private String faceModelVersion;

    /**
     * <p>
     * The bounding box around the face in the input image that Amazon
     * Rekognition used for the search.
     * </p>
     *
     * @return <p>
     *         The bounding box around the face in the input image that Amazon
     *         Rekognition used for the search.
     *         </p>
     */
    public BoundingBox getSearchedFaceBoundingBox() {
        return searchedFaceBoundingBox;
    }

    /**
     * <p>
     * The bounding box around the face in the input image that Amazon
     * Rekognition used for the search.
     * </p>
     *
     * @param searchedFaceBoundingBox <p>
     *            The bounding box around the face in the input image that
     *            Amazon Rekognition used for the search.
     *            </p>
     */
    public void setSearchedFaceBoundingBox(BoundingBox searchedFaceBoundingBox) {
        this.searchedFaceBoundingBox = searchedFaceBoundingBox;
    }

    /**
     * <p>
     * The bounding box around the face in the input image that Amazon
     * Rekognition used for the search.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param searchedFaceBoundingBox <p>
     *            The bounding box around the face in the input image that
     *            Amazon Rekognition used for the search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchFacesByImageResult withSearchedFaceBoundingBox(BoundingBox searchedFaceBoundingBox) {
        this.searchedFaceBoundingBox = searchedFaceBoundingBox;
        return this;
    }

    /**
     * <p>
     * The level of confidence that the <code>searchedFaceBoundingBox</code>,
     * contains a face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         The level of confidence that the
     *         <code>searchedFaceBoundingBox</code>, contains a face.
     *         </p>
     */
    public Float getSearchedFaceConfidence() {
        return searchedFaceConfidence;
    }

    /**
     * <p>
     * The level of confidence that the <code>searchedFaceBoundingBox</code>,
     * contains a face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param searchedFaceConfidence <p>
     *            The level of confidence that the
     *            <code>searchedFaceBoundingBox</code>, contains a face.
     *            </p>
     */
    public void setSearchedFaceConfidence(Float searchedFaceConfidence) {
        this.searchedFaceConfidence = searchedFaceConfidence;
    }

    /**
     * <p>
     * The level of confidence that the <code>searchedFaceBoundingBox</code>,
     * contains a face.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param searchedFaceConfidence <p>
     *            The level of confidence that the
     *            <code>searchedFaceBoundingBox</code>, contains a face.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchFacesByImageResult withSearchedFaceConfidence(Float searchedFaceConfidence) {
        this.searchedFaceConfidence = searchedFaceConfidence;
        return this;
    }

    /**
     * <p>
     * An array of faces that match the input face, along with the confidence in
     * the match.
     * </p>
     *
     * @return <p>
     *         An array of faces that match the input face, along with the
     *         confidence in the match.
     *         </p>
     */
    public java.util.List<FaceMatch> getFaceMatches() {
        return faceMatches;
    }

    /**
     * <p>
     * An array of faces that match the input face, along with the confidence in
     * the match.
     * </p>
     *
     * @param faceMatches <p>
     *            An array of faces that match the input face, along with the
     *            confidence in the match.
     *            </p>
     */
    public void setFaceMatches(java.util.Collection<FaceMatch> faceMatches) {
        if (faceMatches == null) {
            this.faceMatches = null;
            return;
        }

        this.faceMatches = new java.util.ArrayList<FaceMatch>(faceMatches);
    }

    /**
     * <p>
     * An array of faces that match the input face, along with the confidence in
     * the match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceMatches <p>
     *            An array of faces that match the input face, along with the
     *            confidence in the match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchFacesByImageResult withFaceMatches(FaceMatch... faceMatches) {
        if (getFaceMatches() == null) {
            this.faceMatches = new java.util.ArrayList<FaceMatch>(faceMatches.length);
        }
        for (FaceMatch value : faceMatches) {
            this.faceMatches.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of faces that match the input face, along with the confidence in
     * the match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceMatches <p>
     *            An array of faces that match the input face, along with the
     *            confidence in the match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchFacesByImageResult withFaceMatches(java.util.Collection<FaceMatch> faceMatches) {
        setFaceMatches(faceMatches);
        return this;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the input
     * collection (<code>CollectionId</code>).
     * </p>
     *
     * @return <p>
     *         Version number of the face detection model associated with the
     *         input collection (<code>CollectionId</code>).
     *         </p>
     */
    public String getFaceModelVersion() {
        return faceModelVersion;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the input
     * collection (<code>CollectionId</code>).
     * </p>
     *
     * @param faceModelVersion <p>
     *            Version number of the face detection model associated with the
     *            input collection (<code>CollectionId</code>).
     *            </p>
     */
    public void setFaceModelVersion(String faceModelVersion) {
        this.faceModelVersion = faceModelVersion;
    }

    /**
     * <p>
     * Version number of the face detection model associated with the input
     * collection (<code>CollectionId</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceModelVersion <p>
     *            Version number of the face detection model associated with the
     *            input collection (<code>CollectionId</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchFacesByImageResult withFaceModelVersion(String faceModelVersion) {
        this.faceModelVersion = faceModelVersion;
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
        if (getSearchedFaceBoundingBox() != null)
            sb.append("SearchedFaceBoundingBox: " + getSearchedFaceBoundingBox() + ",");
        if (getSearchedFaceConfidence() != null)
            sb.append("SearchedFaceConfidence: " + getSearchedFaceConfidence() + ",");
        if (getFaceMatches() != null)
            sb.append("FaceMatches: " + getFaceMatches() + ",");
        if (getFaceModelVersion() != null)
            sb.append("FaceModelVersion: " + getFaceModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSearchedFaceBoundingBox() == null) ? 0 : getSearchedFaceBoundingBox()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSearchedFaceConfidence() == null) ? 0 : getSearchedFaceConfidence()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFaceMatches() == null) ? 0 : getFaceMatches().hashCode());
        hashCode = prime * hashCode
                + ((getFaceModelVersion() == null) ? 0 : getFaceModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchFacesByImageResult == false)
            return false;
        SearchFacesByImageResult other = (SearchFacesByImageResult) obj;

        if (other.getSearchedFaceBoundingBox() == null ^ this.getSearchedFaceBoundingBox() == null)
            return false;
        if (other.getSearchedFaceBoundingBox() != null
                && other.getSearchedFaceBoundingBox().equals(this.getSearchedFaceBoundingBox()) == false)
            return false;
        if (other.getSearchedFaceConfidence() == null ^ this.getSearchedFaceConfidence() == null)
            return false;
        if (other.getSearchedFaceConfidence() != null
                && other.getSearchedFaceConfidence().equals(this.getSearchedFaceConfidence()) == false)
            return false;
        if (other.getFaceMatches() == null ^ this.getFaceMatches() == null)
            return false;
        if (other.getFaceMatches() != null
                && other.getFaceMatches().equals(this.getFaceMatches()) == false)
            return false;
        if (other.getFaceModelVersion() == null ^ this.getFaceModelVersion() == null)
            return false;
        if (other.getFaceModelVersion() != null
                && other.getFaceModelVersion().equals(this.getFaceModelVersion()) == false)
            return false;
        return true;
    }
}
