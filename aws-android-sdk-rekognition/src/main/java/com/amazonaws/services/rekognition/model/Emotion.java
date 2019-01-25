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
 * The emotions detected on the face, and the confidence level in the
 * determination. For example, HAPPY, SAD, and ANGRY.
 * </p>
 */
public class Emotion implements Serializable {
    /**
     * <p>
     * Type of emotion detected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HAPPY, SAD, ANGRY, CONFUSED, DISGUSTED, SURPRISED,
     * CALM, UNKNOWN
     */
    private String type;

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
     * Type of emotion detected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HAPPY, SAD, ANGRY, CONFUSED, DISGUSTED, SURPRISED,
     * CALM, UNKNOWN
     *
     * @return <p>
     *         Type of emotion detected.
     *         </p>
     * @see EmotionName
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Type of emotion detected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HAPPY, SAD, ANGRY, CONFUSED, DISGUSTED, SURPRISED,
     * CALM, UNKNOWN
     *
     * @param type <p>
     *            Type of emotion detected.
     *            </p>
     * @see EmotionName
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of emotion detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HAPPY, SAD, ANGRY, CONFUSED, DISGUSTED, SURPRISED,
     * CALM, UNKNOWN
     *
     * @param type <p>
     *            Type of emotion detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EmotionName
     */
    public Emotion withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Type of emotion detected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HAPPY, SAD, ANGRY, CONFUSED, DISGUSTED, SURPRISED,
     * CALM, UNKNOWN
     *
     * @param type <p>
     *            Type of emotion detected.
     *            </p>
     * @see EmotionName
     */
    public void setType(EmotionName type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Type of emotion detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HAPPY, SAD, ANGRY, CONFUSED, DISGUSTED, SURPRISED,
     * CALM, UNKNOWN
     *
     * @param type <p>
     *            Type of emotion detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EmotionName
     */
    public Emotion withType(EmotionName type) {
        this.type = type.toString();
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
    public Emotion withConfidence(Float confidence) {
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Emotion == false)
            return false;
        Emotion other = (Emotion) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }
}
