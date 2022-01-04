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
 * Information about a body part detected by <a>DetectProtectiveEquipment</a>
 * that contains PPE. An array of <code>ProtectiveEquipmentBodyPart</code>
 * objects is returned for each person detected by
 * <code>DetectProtectiveEquipment</code>.
 * </p>
 */
public class ProtectiveEquipmentBodyPart implements Serializable {
    /**
     * <p>
     * The detected body part.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FACE, HEAD, LEFT_HAND, RIGHT_HAND
     */
    private String name;

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the detection accuracy of
     * the detected body part.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float confidence;

    /**
     * <p>
     * An array of Personal Protective Equipment items detected around a body
     * part.
     * </p>
     */
    private java.util.List<EquipmentDetection> equipmentDetections;

    /**
     * <p>
     * The detected body part.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FACE, HEAD, LEFT_HAND, RIGHT_HAND
     *
     * @return <p>
     *         The detected body part.
     *         </p>
     * @see BodyPart
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The detected body part.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FACE, HEAD, LEFT_HAND, RIGHT_HAND
     *
     * @param name <p>
     *            The detected body part.
     *            </p>
     * @see BodyPart
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The detected body part.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FACE, HEAD, LEFT_HAND, RIGHT_HAND
     *
     * @param name <p>
     *            The detected body part.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BodyPart
     */
    public ProtectiveEquipmentBodyPart withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The detected body part.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FACE, HEAD, LEFT_HAND, RIGHT_HAND
     *
     * @param name <p>
     *            The detected body part.
     *            </p>
     * @see BodyPart
     */
    public void setName(BodyPart name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The detected body part.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FACE, HEAD, LEFT_HAND, RIGHT_HAND
     *
     * @param name <p>
     *            The detected body part.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BodyPart
     */
    public ProtectiveEquipmentBodyPart withName(BodyPart name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the detection accuracy of
     * the detected body part.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         The confidence that Amazon Rekognition has in the detection
     *         accuracy of the detected body part.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the detection accuracy of
     * the detected body part.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence that Amazon Rekognition has in the detection
     *            accuracy of the detected body part.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the detection accuracy of
     * the detected body part.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence that Amazon Rekognition has in the detection
     *            accuracy of the detected body part.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProtectiveEquipmentBodyPart withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * <p>
     * An array of Personal Protective Equipment items detected around a body
     * part.
     * </p>
     *
     * @return <p>
     *         An array of Personal Protective Equipment items detected around a
     *         body part.
     *         </p>
     */
    public java.util.List<EquipmentDetection> getEquipmentDetections() {
        return equipmentDetections;
    }

    /**
     * <p>
     * An array of Personal Protective Equipment items detected around a body
     * part.
     * </p>
     *
     * @param equipmentDetections <p>
     *            An array of Personal Protective Equipment items detected
     *            around a body part.
     *            </p>
     */
    public void setEquipmentDetections(java.util.Collection<EquipmentDetection> equipmentDetections) {
        if (equipmentDetections == null) {
            this.equipmentDetections = null;
            return;
        }

        this.equipmentDetections = new java.util.ArrayList<EquipmentDetection>(equipmentDetections);
    }

    /**
     * <p>
     * An array of Personal Protective Equipment items detected around a body
     * part.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param equipmentDetections <p>
     *            An array of Personal Protective Equipment items detected
     *            around a body part.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProtectiveEquipmentBodyPart withEquipmentDetections(
            EquipmentDetection... equipmentDetections) {
        if (getEquipmentDetections() == null) {
            this.equipmentDetections = new java.util.ArrayList<EquipmentDetection>(
                    equipmentDetections.length);
        }
        for (EquipmentDetection value : equipmentDetections) {
            this.equipmentDetections.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of Personal Protective Equipment items detected around a body
     * part.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param equipmentDetections <p>
     *            An array of Personal Protective Equipment items detected
     *            around a body part.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProtectiveEquipmentBodyPart withEquipmentDetections(
            java.util.Collection<EquipmentDetection> equipmentDetections) {
        setEquipmentDetections(equipmentDetections);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence() + ",");
        if (getEquipmentDetections() != null)
            sb.append("EquipmentDetections: " + getEquipmentDetections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode
                + ((getEquipmentDetections() == null) ? 0 : getEquipmentDetections().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectiveEquipmentBodyPart == false)
            return false;
        ProtectiveEquipmentBodyPart other = (ProtectiveEquipmentBodyPart) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getEquipmentDetections() == null ^ this.getEquipmentDetections() == null)
            return false;
        if (other.getEquipmentDetections() != null
                && other.getEquipmentDetections().equals(this.getEquipmentDetections()) == false)
            return false;
        return true;
    }
}
