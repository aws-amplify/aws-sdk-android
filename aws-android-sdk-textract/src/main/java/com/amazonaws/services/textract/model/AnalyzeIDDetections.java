/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * Used to contain the information detected by an AnalyzeID operation.
 * </p>
 */
public class AnalyzeIDDetections implements Serializable {
    /**
     * <p>
     * Text of either the normalized field or value associated with it.
     * </p>
     */
    private String text;

    /**
     * <p>
     * Only returned for dates, returns the type of value detected and the date
     * written in a more machine readable way.
     * </p>
     */
    private NormalizedValue normalizedValue;

    /**
     * <p>
     * The confidence score of the detected text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float confidence;

    /**
     * <p>
     * Text of either the normalized field or value associated with it.
     * </p>
     *
     * @return <p>
     *         Text of either the normalized field or value associated with it.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * Text of either the normalized field or value associated with it.
     * </p>
     *
     * @param text <p>
     *            Text of either the normalized field or value associated with
     *            it.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * Text of either the normalized field or value associated with it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param text <p>
     *            Text of either the normalized field or value associated with
     *            it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeIDDetections withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * Only returned for dates, returns the type of value detected and the date
     * written in a more machine readable way.
     * </p>
     *
     * @return <p>
     *         Only returned for dates, returns the type of value detected and
     *         the date written in a more machine readable way.
     *         </p>
     */
    public NormalizedValue getNormalizedValue() {
        return normalizedValue;
    }

    /**
     * <p>
     * Only returned for dates, returns the type of value detected and the date
     * written in a more machine readable way.
     * </p>
     *
     * @param normalizedValue <p>
     *            Only returned for dates, returns the type of value detected
     *            and the date written in a more machine readable way.
     *            </p>
     */
    public void setNormalizedValue(NormalizedValue normalizedValue) {
        this.normalizedValue = normalizedValue;
    }

    /**
     * <p>
     * Only returned for dates, returns the type of value detected and the date
     * written in a more machine readable way.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param normalizedValue <p>
     *            Only returned for dates, returns the type of value detected
     *            and the date written in a more machine readable way.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeIDDetections withNormalizedValue(NormalizedValue normalizedValue) {
        this.normalizedValue = normalizedValue;
        return this;
    }

    /**
     * <p>
     * The confidence score of the detected text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         The confidence score of the detected text.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * The confidence score of the detected text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence score of the detected text.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence score of the detected text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence score of the detected text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeIDDetections withConfidence(Float confidence) {
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
        if (getText() != null)
            sb.append("Text: " + getText() + ",");
        if (getNormalizedValue() != null)
            sb.append("NormalizedValue: " + getNormalizedValue() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode
                + ((getNormalizedValue() == null) ? 0 : getNormalizedValue().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyzeIDDetections == false)
            return false;
        AnalyzeIDDetections other = (AnalyzeIDDetections) obj;

        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getNormalizedValue() == null ^ this.getNormalizedValue() == null)
            return false;
        if (other.getNormalizedValue() != null
                && other.getNormalizedValue().equals(this.getNormalizedValue()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }
}
