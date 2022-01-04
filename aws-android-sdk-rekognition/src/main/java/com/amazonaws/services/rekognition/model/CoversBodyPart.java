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
 * Information about an item of Personal Protective Equipment covering a
 * corresponding body part. For more information, see
 * <a>DetectProtectiveEquipment</a>.
 * </p>
 */
public class CoversBodyPart implements Serializable {
    /**
     * <p>
     * The confidence that Amazon Rekognition has in the value of
     * <code>Value</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float confidence;

    /**
     * <p>
     * True if the PPE covers the corresponding body part, otherwise false.
     * </p>
     */
    private Boolean value;

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the value of
     * <code>Value</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         The confidence that Amazon Rekognition has in the value of
     *         <code>Value</code>.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the value of
     * <code>Value</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence that Amazon Rekognition has in the value of
     *            <code>Value</code>.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the value of
     * <code>Value</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence that Amazon Rekognition has in the value of
     *            <code>Value</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoversBodyPart withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * <p>
     * True if the PPE covers the corresponding body part, otherwise false.
     * </p>
     *
     * @return <p>
     *         True if the PPE covers the corresponding body part, otherwise
     *         false.
     *         </p>
     */
    public Boolean isValue() {
        return value;
    }

    /**
     * <p>
     * True if the PPE covers the corresponding body part, otherwise false.
     * </p>
     *
     * @return <p>
     *         True if the PPE covers the corresponding body part, otherwise
     *         false.
     *         </p>
     */
    public Boolean getValue() {
        return value;
    }

    /**
     * <p>
     * True if the PPE covers the corresponding body part, otherwise false.
     * </p>
     *
     * @param value <p>
     *            True if the PPE covers the corresponding body part, otherwise
     *            false.
     *            </p>
     */
    public void setValue(Boolean value) {
        this.value = value;
    }

    /**
     * <p>
     * True if the PPE covers the corresponding body part, otherwise false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            True if the PPE covers the corresponding body part, otherwise
     *            false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoversBodyPart withValue(Boolean value) {
        this.value = value;
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
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoversBodyPart == false)
            return false;
        CoversBodyPart other = (CoversBodyPart) obj;

        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
