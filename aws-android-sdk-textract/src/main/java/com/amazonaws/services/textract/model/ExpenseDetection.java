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
 * An object used to store information about the Value or Label detected by
 * Amazon Textract.
 * </p>
 */
public class ExpenseDetection implements Serializable {
    /**
     * <p>
     * The word or line of text recognized by Amazon Textract
     * </p>
     */
    private String text;

    /**
     * <p>
     * Information about where the following items are located on a document
     * page: detected page, text, key-value pairs, tables, table cells, and
     * selection elements.
     * </p>
     */
    private Geometry geometry;

    /**
     * <p>
     * The confidence in detection, as a percentage
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float confidence;

    /**
     * <p>
     * The word or line of text recognized by Amazon Textract
     * </p>
     *
     * @return <p>
     *         The word or line of text recognized by Amazon Textract
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The word or line of text recognized by Amazon Textract
     * </p>
     *
     * @param text <p>
     *            The word or line of text recognized by Amazon Textract
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The word or line of text recognized by Amazon Textract
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param text <p>
     *            The word or line of text recognized by Amazon Textract
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExpenseDetection withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * Information about where the following items are located on a document
     * page: detected page, text, key-value pairs, tables, table cells, and
     * selection elements.
     * </p>
     *
     * @return <p>
     *         Information about where the following items are located on a
     *         document page: detected page, text, key-value pairs, tables,
     *         table cells, and selection elements.
     *         </p>
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * <p>
     * Information about where the following items are located on a document
     * page: detected page, text, key-value pairs, tables, table cells, and
     * selection elements.
     * </p>
     *
     * @param geometry <p>
     *            Information about where the following items are located on a
     *            document page: detected page, text, key-value pairs, tables,
     *            table cells, and selection elements.
     *            </p>
     */
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    /**
     * <p>
     * Information about where the following items are located on a document
     * page: detected page, text, key-value pairs, tables, table cells, and
     * selection elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geometry <p>
     *            Information about where the following items are located on a
     *            document page: detected page, text, key-value pairs, tables,
     *            table cells, and selection elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExpenseDetection withGeometry(Geometry geometry) {
        this.geometry = geometry;
        return this;
    }

    /**
     * <p>
     * The confidence in detection, as a percentage
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         The confidence in detection, as a percentage
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * The confidence in detection, as a percentage
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence in detection, as a percentage
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence in detection, as a percentage
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence in detection, as a percentage
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExpenseDetection withConfidence(Float confidence) {
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
        if (getGeometry() != null)
            sb.append("Geometry: " + getGeometry() + ",");
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
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExpenseDetection == false)
            return false;
        ExpenseDetection other = (ExpenseDetection) obj;

        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getGeometry() == null ^ this.getGeometry() == null)
            return false;
        if (other.getGeometry() != null && other.getGeometry().equals(this.getGeometry()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }
}
