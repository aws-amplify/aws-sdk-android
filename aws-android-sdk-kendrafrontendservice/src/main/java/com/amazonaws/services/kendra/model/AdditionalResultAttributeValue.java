/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * An attribute returned with a document from a search.
 * </p>
 */
public class AdditionalResultAttributeValue implements Serializable {
    /**
     * <p>
     * The text associated with the attribute and information about the
     * highlight to apply to the text.
     * </p>
     */
    private TextWithHighlights textWithHighlightsValue;

    /**
     * <p>
     * The text associated with the attribute and information about the
     * highlight to apply to the text.
     * </p>
     *
     * @return <p>
     *         The text associated with the attribute and information about the
     *         highlight to apply to the text.
     *         </p>
     */
    public TextWithHighlights getTextWithHighlightsValue() {
        return textWithHighlightsValue;
    }

    /**
     * <p>
     * The text associated with the attribute and information about the
     * highlight to apply to the text.
     * </p>
     *
     * @param textWithHighlightsValue <p>
     *            The text associated with the attribute and information about
     *            the highlight to apply to the text.
     *            </p>
     */
    public void setTextWithHighlightsValue(TextWithHighlights textWithHighlightsValue) {
        this.textWithHighlightsValue = textWithHighlightsValue;
    }

    /**
     * <p>
     * The text associated with the attribute and information about the
     * highlight to apply to the text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textWithHighlightsValue <p>
     *            The text associated with the attribute and information about
     *            the highlight to apply to the text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdditionalResultAttributeValue withTextWithHighlightsValue(
            TextWithHighlights textWithHighlightsValue) {
        this.textWithHighlightsValue = textWithHighlightsValue;
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
        if (getTextWithHighlightsValue() != null)
            sb.append("TextWithHighlightsValue: " + getTextWithHighlightsValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTextWithHighlightsValue() == null) ? 0 : getTextWithHighlightsValue()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdditionalResultAttributeValue == false)
            return false;
        AdditionalResultAttributeValue other = (AdditionalResultAttributeValue) obj;

        if (other.getTextWithHighlightsValue() == null ^ this.getTextWithHighlightsValue() == null)
            return false;
        if (other.getTextWithHighlightsValue() != null
                && other.getTextWithHighlightsValue().equals(this.getTextWithHighlightsValue()) == false)
            return false;
        return true;
    }
}
