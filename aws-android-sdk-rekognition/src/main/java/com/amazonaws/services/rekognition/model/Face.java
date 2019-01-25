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
 * Describes the face properties such as the bounding box, face ID, image ID of
 * the input image, and external image ID that you assigned.
 * </p>
 */
public class Face implements Serializable {
    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     */
    private String faceId;

    /**
     * <p>
     * Bounding box of the face.
     * </p>
     */
    private BoundingBox boundingBox;

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the input image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     */
    private String imageId;

    /**
     * <p>
     * Identifier that you assign to all the faces in the input image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     */
    private String externalImageId;

    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a
     * different object such as a tree).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float confidence;

    /**
     * The new value for the associationScore property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float associationScore;

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         Unique identifier that Amazon Rekognition assigns to the face.
     *         </p>
     */
    public String getFaceId() {
        return faceId;
    }

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param faceId <p>
     *            Unique identifier that Amazon Rekognition assigns to the face.
     *            </p>
     */
    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the face.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param faceId <p>
     *            Unique identifier that Amazon Rekognition assigns to the face.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Face withFaceId(String faceId) {
        this.faceId = faceId;
        return this;
    }

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
    public Face withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the input image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         Unique identifier that Amazon Rekognition assigns to the input
     *         image.
     *         </p>
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the input image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param imageId <p>
     *            Unique identifier that Amazon Rekognition assigns to the input
     *            image.
     *            </p>
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * Unique identifier that Amazon Rekognition assigns to the input image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param imageId <p>
     *            Unique identifier that Amazon Rekognition assigns to the input
     *            image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Face withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * <p>
     * Identifier that you assign to all the faces in the input image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @return <p>
     *         Identifier that you assign to all the faces in the input image.
     *         </p>
     */
    public String getExternalImageId() {
        return externalImageId;
    }

    /**
     * <p>
     * Identifier that you assign to all the faces in the input image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param externalImageId <p>
     *            Identifier that you assign to all the faces in the input
     *            image.
     *            </p>
     */
    public void setExternalImageId(String externalImageId) {
        this.externalImageId = externalImageId;
    }

    /**
     * <p>
     * Identifier that you assign to all the faces in the input image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param externalImageId <p>
     *            Identifier that you assign to all the faces in the input
     *            image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Face withExternalImageId(String externalImageId) {
        this.externalImageId = externalImageId;
        return this;
    }

    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a
     * different object such as a tree).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         Confidence level that the bounding box contains a face (and not a
     *         different object such as a tree).
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a
     * different object such as a tree).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            Confidence level that the bounding box contains a face (and
     *            not a different object such as a tree).
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Confidence level that the bounding box contains a face (and not a
     * different object such as a tree).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            Confidence level that the bounding box contains a face (and
     *            not a different object such as a tree).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Face withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Returns the value of the associationScore property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return The value of the associationScore property for this object.
     */
    public Float getAssociationScore() {
        return associationScore;
    }

    /**
     * Sets the value of associationScore
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param associationScore The new value for the associationScore property
     *            for this object.
     */
    public void setAssociationScore(Float associationScore) {
        this.associationScore = associationScore;
    }

    /**
     * Sets the value of the associationScore property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param associationScore The new value for the associationScore property
     *            for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Face withAssociationScore(Float associationScore) {
        this.associationScore = associationScore;
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
        if (getFaceId() != null)
            sb.append("FaceId: " + getFaceId() + ",");
        if (getBoundingBox() != null)
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getExternalImageId() != null)
            sb.append("ExternalImageId: " + getExternalImageId() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence() + ",");
        if (getAssociationScore() != null)
            sb.append("AssociationScore: " + getAssociationScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFaceId() == null) ? 0 : getFaceId().hashCode());
        hashCode = prime * hashCode
                + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode
                + ((getExternalImageId() == null) ? 0 : getExternalImageId().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode
                + ((getAssociationScore() == null) ? 0 : getAssociationScore().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Face == false)
            return false;
        Face other = (Face) obj;

        if (other.getFaceId() == null ^ this.getFaceId() == null)
            return false;
        if (other.getFaceId() != null && other.getFaceId().equals(this.getFaceId()) == false)
            return false;
        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null
                && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getExternalImageId() == null ^ this.getExternalImageId() == null)
            return false;
        if (other.getExternalImageId() != null
                && other.getExternalImageId().equals(this.getExternalImageId()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getAssociationScore() == null ^ this.getAssociationScore() == null)
            return false;
        if (other.getAssociationScore() != null
                && other.getAssociationScore().equals(this.getAssociationScore()) == false)
            return false;
        return true;
    }
}
