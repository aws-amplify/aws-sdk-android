/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <code>FaceOccluded</code> should return "true" with a high confidence score
 * if a detected face’s eyes, nose, and mouth are partially captured or if they
 * are covered by masks, dark sunglasses, cell phones, hands, or other objects.
 * <code>FaceOccluded</code> should return "false" with a high confidence score
 * if common occurrences that do not impact face verification are detected, such
 * as eye glasses, lightly tinted sunglasses, strands of hair, and others.
 * </p>
 * <p>
 * You can use <code>FaceOccluded</code> to determine if an obstruction on a
 * face negatively impacts using the image for face matching.
 * </p>
 */
public class FaceOccluded implements Serializable {
    /**
     * <p>
     * True if a detected face’s eyes, nose, and mouth are partially captured or
     * if they are covered by masks, dark sunglasses, cell phones, hands, or
     * other objects. False if common occurrences that do not impact face
     * verification are detected, such as eye glasses, lightly tinted
     * sunglasses, strands of hair, and others.
     * </p>
     */
    private Boolean value;

    /**
     * <p>
     * The confidence that the service has detected the presence of a face
     * occlusion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     */
    private Float confidence;

    /**
     * <p>
     * True if a detected face’s eyes, nose, and mouth are partially captured or
     * if they are covered by masks, dark sunglasses, cell phones, hands, or
     * other objects. False if common occurrences that do not impact face
     * verification are detected, such as eye glasses, lightly tinted
     * sunglasses, strands of hair, and others.
     * </p>
     *
     * @return <p>
     *         True if a detected face’s eyes, nose, and mouth are partially
     *         captured or if they are covered by masks, dark sunglasses, cell
     *         phones, hands, or other objects. False if common occurrences that
     *         do not impact face verification are detected, such as eye
     *         glasses, lightly tinted sunglasses, strands of hair, and others.
     *         </p>
     */
    public Boolean isValue() {
        return value;
    }

    /**
     * <p>
     * True if a detected face’s eyes, nose, and mouth are partially captured or
     * if they are covered by masks, dark sunglasses, cell phones, hands, or
     * other objects. False if common occurrences that do not impact face
     * verification are detected, such as eye glasses, lightly tinted
     * sunglasses, strands of hair, and others.
     * </p>
     *
     * @return <p>
     *         True if a detected face’s eyes, nose, and mouth are partially
     *         captured or if they are covered by masks, dark sunglasses, cell
     *         phones, hands, or other objects. False if common occurrences that
     *         do not impact face verification are detected, such as eye
     *         glasses, lightly tinted sunglasses, strands of hair, and others.
     *         </p>
     */
    public Boolean getValue() {
        return value;
    }

    /**
     * <p>
     * True if a detected face’s eyes, nose, and mouth are partially captured or
     * if they are covered by masks, dark sunglasses, cell phones, hands, or
     * other objects. False if common occurrences that do not impact face
     * verification are detected, such as eye glasses, lightly tinted
     * sunglasses, strands of hair, and others.
     * </p>
     *
     * @param value <p>
     *            True if a detected face’s eyes, nose, and mouth are partially
     *            captured or if they are covered by masks, dark sunglasses,
     *            cell phones, hands, or other objects. False if common
     *            occurrences that do not impact face verification are detected,
     *            such as eye glasses, lightly tinted sunglasses, strands of
     *            hair, and others.
     *            </p>
     */
    public void setValue(Boolean value) {
        this.value = value;
    }

    /**
     * <p>
     * True if a detected face’s eyes, nose, and mouth are partially captured or
     * if they are covered by masks, dark sunglasses, cell phones, hands, or
     * other objects. False if common occurrences that do not impact face
     * verification are detected, such as eye glasses, lightly tinted
     * sunglasses, strands of hair, and others.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            True if a detected face’s eyes, nose, and mouth are partially
     *            captured or if they are covered by masks, dark sunglasses,
     *            cell phones, hands, or other objects. False if common
     *            occurrences that do not impact face verification are detected,
     *            such as eye glasses, lightly tinted sunglasses, strands of
     *            hair, and others.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceOccluded withValue(Boolean value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The confidence that the service has detected the presence of a face
     * occlusion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @return <p>
     *         The confidence that the service has detected the presence of a
     *         face occlusion.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * The confidence that the service has detected the presence of a face
     * occlusion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param confidence <p>
     *            The confidence that the service has detected the presence of a
     *            face occlusion.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that the service has detected the presence of a face
     * occlusion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param confidence <p>
     *            The confidence that the service has detected the presence of a
     *            face occlusion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FaceOccluded withConfidence(Float confidence) {
        this.confidence = confidence;
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
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FaceOccluded == false)
            return false;
        FaceOccluded other = (FaceOccluded) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }
}
