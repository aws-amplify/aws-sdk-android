/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Performs toxicity analysis on the list of text strings that you provide as
 * input. The API response contains a results list that matches the size of the
 * input list. For more information about toxicity detection, see <a href=
 * "https://docs.aws.amazon.com/comprehend/latest/dg/toxicity-detection.html"
 * >Toxicity detection</a> in the <i>Amazon Comprehend Developer Guide</i>.
 * </p>
 */
public class DetectToxicContentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of up to 10 text strings. Each string has a maximum size of 1 KB,
     * and the maximum size of the list is 10 KB.
     * </p>
     */
    private java.util.List<TextSegment> textSegments;

    /**
     * <p>
     * The language of the input text. Currently, English is the only supported
     * language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     */
    private String languageCode;

    /**
     * <p>
     * A list of up to 10 text strings. Each string has a maximum size of 1 KB,
     * and the maximum size of the list is 10 KB.
     * </p>
     *
     * @return <p>
     *         A list of up to 10 text strings. Each string has a maximum size
     *         of 1 KB, and the maximum size of the list is 10 KB.
     *         </p>
     */
    public java.util.List<TextSegment> getTextSegments() {
        return textSegments;
    }

    /**
     * <p>
     * A list of up to 10 text strings. Each string has a maximum size of 1 KB,
     * and the maximum size of the list is 10 KB.
     * </p>
     *
     * @param textSegments <p>
     *            A list of up to 10 text strings. Each string has a maximum
     *            size of 1 KB, and the maximum size of the list is 10 KB.
     *            </p>
     */
    public void setTextSegments(java.util.Collection<TextSegment> textSegments) {
        if (textSegments == null) {
            this.textSegments = null;
            return;
        }

        this.textSegments = new java.util.ArrayList<TextSegment>(textSegments);
    }

    /**
     * <p>
     * A list of up to 10 text strings. Each string has a maximum size of 1 KB,
     * and the maximum size of the list is 10 KB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textSegments <p>
     *            A list of up to 10 text strings. Each string has a maximum
     *            size of 1 KB, and the maximum size of the list is 10 KB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectToxicContentRequest withTextSegments(TextSegment... textSegments) {
        if (getTextSegments() == null) {
            this.textSegments = new java.util.ArrayList<TextSegment>(textSegments.length);
        }
        for (TextSegment value : textSegments) {
            this.textSegments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 10 text strings. Each string has a maximum size of 1 KB,
     * and the maximum size of the list is 10 KB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textSegments <p>
     *            A list of up to 10 text strings. Each string has a maximum
     *            size of 1 KB, and the maximum size of the list is 10 KB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectToxicContentRequest withTextSegments(java.util.Collection<TextSegment> textSegments) {
        setTextSegments(textSegments);
        return this;
    }

    /**
     * <p>
     * The language of the input text. Currently, English is the only supported
     * language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @return <p>
     *         The language of the input text. Currently, English is the only
     *         supported language.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language of the input text. Currently, English is the only supported
     * language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input text. Currently, English is the only
     *            supported language.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of the input text. Currently, English is the only supported
     * language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input text. Currently, English is the only
     *            supported language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public DetectToxicContentRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language of the input text. Currently, English is the only supported
     * language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input text. Currently, English is the only
     *            supported language.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language of the input text. Currently, English is the only supported
     * language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input text. Currently, English is the only
     *            supported language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public DetectToxicContentRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
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
        if (getTextSegments() != null)
            sb.append("TextSegments: " + getTextSegments() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTextSegments() == null) ? 0 : getTextSegments().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectToxicContentRequest == false)
            return false;
        DetectToxicContentRequest other = (DetectToxicContentRequest) obj;

        if (other.getTextSegments() == null ^ this.getTextSegments() == null)
            return false;
        if (other.getTextSegments() != null
                && other.getTextSegments().equals(this.getTextSegments()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        return true;
    }
}
