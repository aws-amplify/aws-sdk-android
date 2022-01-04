/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about an item of Personal Protective Equipment (PPE) detected by
 * <a>DetectProtectiveEquipment</a>. For more information, see
 * <a>DetectProtectiveEquipment</a>.
 * </p>
 */
public class EquipmentDetection implements Serializable {
    /**
     * <p>
     * A bounding box surrounding the item of detected PPE.
     * </p>
     */
    private BoundingBox boundingBox;

    /**
     * <p>
     * The confidence that Amazon Rekognition has that the bounding box (
     * <code>BoundingBox</code>) contains an item of PPE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float confidence;

    /**
     * <p>
     * The type of detected PPE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FACE_COVER, HAND_COVER, HEAD_COVER
     */
    private String type;

    /**
     * <p>
     * Information about the body part covered by the detected PPE.
     * </p>
     */
    private CoversBodyPart coversBodyPart;

    /**
     * <p>
     * A bounding box surrounding the item of detected PPE.
     * </p>
     *
     * @return <p>
     *         A bounding box surrounding the item of detected PPE.
     *         </p>
     */
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    /**
     * <p>
     * A bounding box surrounding the item of detected PPE.
     * </p>
     *
     * @param boundingBox <p>
     *            A bounding box surrounding the item of detected PPE.
     *            </p>
     */
    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * A bounding box surrounding the item of detected PPE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param boundingBox <p>
     *            A bounding box surrounding the item of detected PPE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EquipmentDetection withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has that the bounding box (
     * <code>BoundingBox</code>) contains an item of PPE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         The confidence that Amazon Rekognition has that the bounding box
     *         (<code>BoundingBox</code>) contains an item of PPE.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has that the bounding box (
     * <code>BoundingBox</code>) contains an item of PPE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence that Amazon Rekognition has that the bounding
     *            box (<code>BoundingBox</code>) contains an item of PPE.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has that the bounding box (
     * <code>BoundingBox</code>) contains an item of PPE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence that Amazon Rekognition has that the bounding
     *            box (<code>BoundingBox</code>) contains an item of PPE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EquipmentDetection withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * <p>
     * The type of detected PPE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FACE_COVER, HAND_COVER, HEAD_COVER
     *
     * @return <p>
     *         The type of detected PPE.
     *         </p>
     * @see ProtectiveEquipmentType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of detected PPE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FACE_COVER, HAND_COVER, HEAD_COVER
     *
     * @param type <p>
     *            The type of detected PPE.
     *            </p>
     * @see ProtectiveEquipmentType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of detected PPE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FACE_COVER, HAND_COVER, HEAD_COVER
     *
     * @param type <p>
     *            The type of detected PPE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProtectiveEquipmentType
     */
    public EquipmentDetection withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of detected PPE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FACE_COVER, HAND_COVER, HEAD_COVER
     *
     * @param type <p>
     *            The type of detected PPE.
     *            </p>
     * @see ProtectiveEquipmentType
     */
    public void setType(ProtectiveEquipmentType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of detected PPE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FACE_COVER, HAND_COVER, HEAD_COVER
     *
     * @param type <p>
     *            The type of detected PPE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProtectiveEquipmentType
     */
    public EquipmentDetection withType(ProtectiveEquipmentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about the body part covered by the detected PPE.
     * </p>
     *
     * @return <p>
     *         Information about the body part covered by the detected PPE.
     *         </p>
     */
    public CoversBodyPart getCoversBodyPart() {
        return coversBodyPart;
    }

    /**
     * <p>
     * Information about the body part covered by the detected PPE.
     * </p>
     *
     * @param coversBodyPart <p>
     *            Information about the body part covered by the detected PPE.
     *            </p>
     */
    public void setCoversBodyPart(CoversBodyPart coversBodyPart) {
        this.coversBodyPart = coversBodyPart;
    }

    /**
     * <p>
     * Information about the body part covered by the detected PPE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coversBodyPart <p>
     *            Information about the body part covered by the detected PPE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EquipmentDetection withCoversBodyPart(CoversBodyPart coversBodyPart) {
        this.coversBodyPart = coversBodyPart;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getCoversBodyPart() != null)
            sb.append("CoversBodyPart: " + getCoversBodyPart());
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
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getCoversBodyPart() == null) ? 0 : getCoversBodyPart().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EquipmentDetection == false)
            return false;
        EquipmentDetection other = (EquipmentDetection) obj;

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
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCoversBodyPart() == null ^ this.getCoversBodyPart() == null)
            return false;
        if (other.getCoversBodyPart() != null
                && other.getCoversBodyPart().equals(this.getCoversBodyPart()) == false)
            return false;
        return true;
    }
}
