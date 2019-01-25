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
 * Details about a person detected in a video analysis request.
 * </p>
 */
public class PersonDetail implements Serializable {
    /**
     * <p>
     * Identifier for the person detected person within a video. Use to keep
     * track of the person throughout the video. The identifier is not stored by
     * Amazon Rekognition.
     * </p>
     */
    private Long index;

    /**
     * <p>
     * Bounding box around the detected person.
     * </p>
     */
    private BoundingBox boundingBox;

    /**
     * <p>
     * Face details for the detected person.
     * </p>
     */
    private FaceDetail face;

    /**
     * <p>
     * Identifier for the person detected person within a video. Use to keep
     * track of the person throughout the video. The identifier is not stored by
     * Amazon Rekognition.
     * </p>
     *
     * @return <p>
     *         Identifier for the person detected person within a video. Use to
     *         keep track of the person throughout the video. The identifier is
     *         not stored by Amazon Rekognition.
     *         </p>
     */
    public Long getIndex() {
        return index;
    }

    /**
     * <p>
     * Identifier for the person detected person within a video. Use to keep
     * track of the person throughout the video. The identifier is not stored by
     * Amazon Rekognition.
     * </p>
     *
     * @param index <p>
     *            Identifier for the person detected person within a video. Use
     *            to keep track of the person throughout the video. The
     *            identifier is not stored by Amazon Rekognition.
     *            </p>
     */
    public void setIndex(Long index) {
        this.index = index;
    }

    /**
     * <p>
     * Identifier for the person detected person within a video. Use to keep
     * track of the person throughout the video. The identifier is not stored by
     * Amazon Rekognition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param index <p>
     *            Identifier for the person detected person within a video. Use
     *            to keep track of the person throughout the video. The
     *            identifier is not stored by Amazon Rekognition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PersonDetail withIndex(Long index) {
        this.index = index;
        return this;
    }

    /**
     * <p>
     * Bounding box around the detected person.
     * </p>
     *
     * @return <p>
     *         Bounding box around the detected person.
     *         </p>
     */
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    /**
     * <p>
     * Bounding box around the detected person.
     * </p>
     *
     * @param boundingBox <p>
     *            Bounding box around the detected person.
     *            </p>
     */
    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * Bounding box around the detected person.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param boundingBox <p>
     *            Bounding box around the detected person.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PersonDetail withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * <p>
     * Face details for the detected person.
     * </p>
     *
     * @return <p>
     *         Face details for the detected person.
     *         </p>
     */
    public FaceDetail getFace() {
        return face;
    }

    /**
     * <p>
     * Face details for the detected person.
     * </p>
     *
     * @param face <p>
     *            Face details for the detected person.
     *            </p>
     */
    public void setFace(FaceDetail face) {
        this.face = face;
    }

    /**
     * <p>
     * Face details for the detected person.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param face <p>
     *            Face details for the detected person.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PersonDetail withFace(FaceDetail face) {
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
        if (getIndex() != null)
            sb.append("Index: " + getIndex() + ",");
        if (getBoundingBox() != null)
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        if (getFace() != null)
            sb.append("Face: " + getFace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode
                + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getFace() == null) ? 0 : getFace().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PersonDetail == false)
            return false;
        PersonDetail other = (PersonDetail) obj;

        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null
                && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        if (other.getFace() == null ^ this.getFace() == null)
            return false;
        if (other.getFace() != null && other.getFace().equals(this.getFace()) == false)
            return false;
        return true;
    }
}
