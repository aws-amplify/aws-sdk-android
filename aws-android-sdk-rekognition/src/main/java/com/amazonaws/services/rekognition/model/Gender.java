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
 * The predicted gender of a detected face.
 * </p>
 * <p>
 * Amazon Rekognition makes gender binary (male/female) predictions based on the
 * physical appearance of a face in a particular image. This kind of prediction
 * is not designed to categorize a person’s gender identity, and you shouldn't
 * use Amazon Rekognition to make such a determination. For example, a male
 * actor wearing a long-haired wig and earrings for a role might be predicted as
 * female.
 * </p>
 * <p>
 * Using Amazon Rekognition to make gender binary predictions is best suited for
 * use cases where aggregate gender distribution statistics need to be analyzed
 * without identifying specific users. For example, the percentage of female
 * users compared to male users on a social media platform.
 * </p>
 * <p>
 * We don't recommend using gender binary predictions to make decisions that
 * impact&#x2028; an individual's rights, privacy, or access to services.
 * </p>
 */
public class Gender implements Serializable {
    /**
     * <p>
     * The predicted gender of the face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Male, Female
     */
    private String value;

    /**
     * <p>
     * Level of confidence in the prediction.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float confidence;

    /**
     * <p>
     * The predicted gender of the face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Male, Female
     *
     * @return <p>
     *         The predicted gender of the face.
     *         </p>
     * @see GenderType
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The predicted gender of the face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Male, Female
     *
     * @param value <p>
     *            The predicted gender of the face.
     *            </p>
     * @see GenderType
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The predicted gender of the face.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Male, Female
     *
     * @param value <p>
     *            The predicted gender of the face.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GenderType
     */
    public Gender withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The predicted gender of the face.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Male, Female
     *
     * @param value <p>
     *            The predicted gender of the face.
     *            </p>
     * @see GenderType
     */
    public void setValue(GenderType value) {
        this.value = value.toString();
    }

    /**
     * <p>
     * The predicted gender of the face.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Male, Female
     *
     * @param value <p>
     *            The predicted gender of the face.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GenderType
     */
    public Gender withValue(GenderType value) {
        this.value = value.toString();
        return this;
    }

    /**
     * <p>
     * Level of confidence in the prediction.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         Level of confidence in the prediction.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * Level of confidence in the prediction.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            Level of confidence in the prediction.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Level of confidence in the prediction.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            Level of confidence in the prediction.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Gender withConfidence(Float confidence) {
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

        if (obj instanceof Gender == false)
            return false;
        Gender other = (Gender) obj;

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
