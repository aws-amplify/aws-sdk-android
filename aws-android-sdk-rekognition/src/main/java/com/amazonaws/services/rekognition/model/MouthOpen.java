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
 * Indicates whether or not the mouth on the face is open, and the confidence
 * level in the determination.
 * </p>
 */
public class MouthOpen implements Serializable {
    /**
     * <p>
     * Boolean value that indicates whether the mouth on the face is open or
     * not.
     * </p>
     */
    private Boolean value;

    /**
     * <p>
     * Level of confidence in the determination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float confidence;

    /**
     * <p>
     * Boolean value that indicates whether the mouth on the face is open or
     * not.
     * </p>
     *
     * @return <p>
     *         Boolean value that indicates whether the mouth on the face is
     *         open or not.
     *         </p>
     */
    public Boolean isValue() {
        return value;
    }

    /**
     * <p>
     * Boolean value that indicates whether the mouth on the face is open or
     * not.
     * </p>
     *
     * @return <p>
     *         Boolean value that indicates whether the mouth on the face is
     *         open or not.
     *         </p>
     */
    public Boolean getValue() {
        return value;
    }

    /**
     * <p>
     * Boolean value that indicates whether the mouth on the face is open or
     * not.
     * </p>
     *
     * @param value <p>
     *            Boolean value that indicates whether the mouth on the face is
     *            open or not.
     *            </p>
     */
    public void setValue(Boolean value) {
        this.value = value;
    }

    /**
     * <p>
     * Boolean value that indicates whether the mouth on the face is open or
     * not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            Boolean value that indicates whether the mouth on the face is
     *            open or not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MouthOpen withValue(Boolean value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * Level of confidence in the determination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         Level of confidence in the determination.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * Level of confidence in the determination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            Level of confidence in the determination.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Level of confidence in the determination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            Level of confidence in the determination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MouthOpen withConfidence(Float confidence) {
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

        if (obj instanceof MouthOpen == false)
            return false;
        MouthOpen other = (MouthOpen) obj;

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
