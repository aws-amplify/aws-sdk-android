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
 * A person detected by a call to <a>DetectProtectiveEquipment</a>. The API
 * returns all persons detected in the input image in an array of
 * <code>ProtectiveEquipmentPerson</code> objects.
 * </p>
 */
public class ProtectiveEquipmentPerson implements Serializable {
    /**
     * <p>
     * An array of body parts detected on a person's body (including body parts
     * without PPE).
     * </p>
     */
    private java.util.List<ProtectiveEquipmentBodyPart> bodyParts;

    /**
     * <p>
     * A bounding box around the detected person.
     * </p>
     */
    private BoundingBox boundingBox;

    /**
     * <p>
     * The confidence that Amazon Rekognition has that the bounding box contains
     * a person.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float confidence;

    /**
     * <p>
     * The identifier for the detected person. The identifier is only unique for
     * a single call to <code>DetectProtectiveEquipment</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer id;

    /**
     * <p>
     * An array of body parts detected on a person's body (including body parts
     * without PPE).
     * </p>
     *
     * @return <p>
     *         An array of body parts detected on a person's body (including
     *         body parts without PPE).
     *         </p>
     */
    public java.util.List<ProtectiveEquipmentBodyPart> getBodyParts() {
        return bodyParts;
    }

    /**
     * <p>
     * An array of body parts detected on a person's body (including body parts
     * without PPE).
     * </p>
     *
     * @param bodyParts <p>
     *            An array of body parts detected on a person's body (including
     *            body parts without PPE).
     *            </p>
     */
    public void setBodyParts(java.util.Collection<ProtectiveEquipmentBodyPart> bodyParts) {
        if (bodyParts == null) {
            this.bodyParts = null;
            return;
        }

        this.bodyParts = new java.util.ArrayList<ProtectiveEquipmentBodyPart>(bodyParts);
    }

    /**
     * <p>
     * An array of body parts detected on a person's body (including body parts
     * without PPE).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bodyParts <p>
     *            An array of body parts detected on a person's body (including
     *            body parts without PPE).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProtectiveEquipmentPerson withBodyParts(ProtectiveEquipmentBodyPart... bodyParts) {
        if (getBodyParts() == null) {
            this.bodyParts = new java.util.ArrayList<ProtectiveEquipmentBodyPart>(bodyParts.length);
        }
        for (ProtectiveEquipmentBodyPart value : bodyParts) {
            this.bodyParts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of body parts detected on a person's body (including body parts
     * without PPE).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bodyParts <p>
     *            An array of body parts detected on a person's body (including
     *            body parts without PPE).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProtectiveEquipmentPerson withBodyParts(
            java.util.Collection<ProtectiveEquipmentBodyPart> bodyParts) {
        setBodyParts(bodyParts);
        return this;
    }

    /**
     * <p>
     * A bounding box around the detected person.
     * </p>
     *
     * @return <p>
     *         A bounding box around the detected person.
     *         </p>
     */
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    /**
     * <p>
     * A bounding box around the detected person.
     * </p>
     *
     * @param boundingBox <p>
     *            A bounding box around the detected person.
     *            </p>
     */
    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * A bounding box around the detected person.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param boundingBox <p>
     *            A bounding box around the detected person.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProtectiveEquipmentPerson withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has that the bounding box contains
     * a person.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         The confidence that Amazon Rekognition has that the bounding box
     *         contains a person.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has that the bounding box contains
     * a person.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence that Amazon Rekognition has that the bounding
     *            box contains a person.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has that the bounding box contains
     * a person.
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
     *            box contains a person.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProtectiveEquipmentPerson withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * <p>
     * The identifier for the detected person. The identifier is only unique for
     * a single call to <code>DetectProtectiveEquipment</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The identifier for the detected person. The identifier is only
     *         unique for a single call to
     *         <code>DetectProtectiveEquipment</code>.
     *         </p>
     */
    public Integer getId() {
        return id;
    }

    /**
     * <p>
     * The identifier for the detected person. The identifier is only unique for
     * a single call to <code>DetectProtectiveEquipment</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param id <p>
     *            The identifier for the detected person. The identifier is only
     *            unique for a single call to
     *            <code>DetectProtectiveEquipment</code>.
     *            </p>
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the detected person. The identifier is only unique for
     * a single call to <code>DetectProtectiveEquipment</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param id <p>
     *            The identifier for the detected person. The identifier is only
     *            unique for a single call to
     *            <code>DetectProtectiveEquipment</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProtectiveEquipmentPerson withId(Integer id) {
        this.id = id;
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
        if (getBodyParts() != null)
            sb.append("BodyParts: " + getBodyParts() + ",");
        if (getBoundingBox() != null)
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence() + ",");
        if (getId() != null)
            sb.append("Id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBodyParts() == null) ? 0 : getBodyParts().hashCode());
        hashCode = prime * hashCode
                + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectiveEquipmentPerson == false)
            return false;
        ProtectiveEquipmentPerson other = (ProtectiveEquipmentPerson) obj;

        if (other.getBodyParts() == null ^ this.getBodyParts() == null)
            return false;
        if (other.getBodyParts() != null
                && other.getBodyParts().equals(this.getBodyParts()) == false)
            return false;
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
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }
}
