/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Translates input text from the source language to the target language. You
 * can translate between English (en) and one of the following languages, or
 * between one of the following languages and English.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Arabic (ar)
 * </p>
 * </li>
 * <li>
 * <p>
 * Chinese (Simplified) (zh)
 * </p>
 * </li>
 * <li>
 * <p>
 * French (fr)
 * </p>
 * </li>
 * <li>
 * <p>
 * German (de)
 * </p>
 * </li>
 * <li>
 * <p>
 * Portuguese (pt)
 * </p>
 * </li>
 * <li>
 * <p>
 * Spanish (es)
 * </p>
 * </li>
 * </ul>
 * <p>
 * To have Amazon Translate determine the source language of your text, you can
 * specify <code>auto</code> in the <code>SourceLanguageCode</code> field. If
 * you specify <code>auto</code>, Amazon Translate will call Amazon Comprehend
 * to determine the source language.
 * </p>
 */
public class TranslateTextRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The text to translate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5000<br/>
     */
    private String text;

    /**
     * <p>
     * One of the supported language codes for the source text. If the
     * <code>TargetLanguageCode</code> is not "en", the
     * <code>SourceLanguageCode</code> must be "en".
     * </p>
     * <p>
     * To have Amazon Translate determine the source language of your text, you
     * can specify <code>auto</code> in the <code>SourceLanguageCode</code>
     * field. If you specify <code>auto</code>, Amazon Translate will call
     * Amazon Comprehend to determine the source language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     */
    private String sourceLanguageCode;

    /**
     * <p>
     * One of the supported language codes for the target text. If the
     * <code>SourceLanguageCode</code> is not "en", the
     * <code>TargetLanguageCode</code> must be "en".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     */
    private String targetLanguageCode;

    /**
     * <p>
     * The text to translate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5000<br/>
     *
     * @return <p>
     *         The text to translate.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The text to translate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5000<br/>
     *
     * @param text <p>
     *            The text to translate.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text to translate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5000<br/>
     *
     * @param text <p>
     *            The text to translate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateTextRequest withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * One of the supported language codes for the source text. If the
     * <code>TargetLanguageCode</code> is not "en", the
     * <code>SourceLanguageCode</code> must be "en".
     * </p>
     * <p>
     * To have Amazon Translate determine the source language of your text, you
     * can specify <code>auto</code> in the <code>SourceLanguageCode</code>
     * field. If you specify <code>auto</code>, Amazon Translate will call
     * Amazon Comprehend to determine the source language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @return <p>
     *         One of the supported language codes for the source text. If the
     *         <code>TargetLanguageCode</code> is not "en", the
     *         <code>SourceLanguageCode</code> must be "en".
     *         </p>
     *         <p>
     *         To have Amazon Translate determine the source language of your
     *         text, you can specify <code>auto</code> in the
     *         <code>SourceLanguageCode</code> field. If you specify
     *         <code>auto</code>, Amazon Translate will call Amazon Comprehend
     *         to determine the source language.
     *         </p>
     */
    public String getSourceLanguageCode() {
        return sourceLanguageCode;
    }

    /**
     * <p>
     * One of the supported language codes for the source text. If the
     * <code>TargetLanguageCode</code> is not "en", the
     * <code>SourceLanguageCode</code> must be "en".
     * </p>
     * <p>
     * To have Amazon Translate determine the source language of your text, you
     * can specify <code>auto</code> in the <code>SourceLanguageCode</code>
     * field. If you specify <code>auto</code>, Amazon Translate will call
     * Amazon Comprehend to determine the source language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param sourceLanguageCode <p>
     *            One of the supported language codes for the source text. If
     *            the <code>TargetLanguageCode</code> is not "en", the
     *            <code>SourceLanguageCode</code> must be "en".
     *            </p>
     *            <p>
     *            To have Amazon Translate determine the source language of your
     *            text, you can specify <code>auto</code> in the
     *            <code>SourceLanguageCode</code> field. If you specify
     *            <code>auto</code>, Amazon Translate will call Amazon
     *            Comprehend to determine the source language.
     *            </p>
     */
    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * One of the supported language codes for the source text. If the
     * <code>TargetLanguageCode</code> is not "en", the
     * <code>SourceLanguageCode</code> must be "en".
     * </p>
     * <p>
     * To have Amazon Translate determine the source language of your text, you
     * can specify <code>auto</code> in the <code>SourceLanguageCode</code>
     * field. If you specify <code>auto</code>, Amazon Translate will call
     * Amazon Comprehend to determine the source language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param sourceLanguageCode <p>
     *            One of the supported language codes for the source text. If
     *            the <code>TargetLanguageCode</code> is not "en", the
     *            <code>SourceLanguageCode</code> must be "en".
     *            </p>
     *            <p>
     *            To have Amazon Translate determine the source language of your
     *            text, you can specify <code>auto</code> in the
     *            <code>SourceLanguageCode</code> field. If you specify
     *            <code>auto</code>, Amazon Translate will call Amazon
     *            Comprehend to determine the source language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateTextRequest withSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
        return this;
    }

    /**
     * <p>
     * One of the supported language codes for the target text. If the
     * <code>SourceLanguageCode</code> is not "en", the
     * <code>TargetLanguageCode</code> must be "en".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @return <p>
     *         One of the supported language codes for the target text. If the
     *         <code>SourceLanguageCode</code> is not "en", the
     *         <code>TargetLanguageCode</code> must be "en".
     *         </p>
     */
    public String getTargetLanguageCode() {
        return targetLanguageCode;
    }

    /**
     * <p>
     * One of the supported language codes for the target text. If the
     * <code>SourceLanguageCode</code> is not "en", the
     * <code>TargetLanguageCode</code> must be "en".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param targetLanguageCode <p>
     *            One of the supported language codes for the target text. If
     *            the <code>SourceLanguageCode</code> is not "en", the
     *            <code>TargetLanguageCode</code> must be "en".
     *            </p>
     */
    public void setTargetLanguageCode(String targetLanguageCode) {
        this.targetLanguageCode = targetLanguageCode;
    }

    /**
     * <p>
     * One of the supported language codes for the target text. If the
     * <code>SourceLanguageCode</code> is not "en", the
     * <code>TargetLanguageCode</code> must be "en".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param targetLanguageCode <p>
     *            One of the supported language codes for the target text. If
     *            the <code>SourceLanguageCode</code> is not "en", the
     *            <code>TargetLanguageCode</code> must be "en".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateTextRequest withTargetLanguageCode(String targetLanguageCode) {
        this.targetLanguageCode = targetLanguageCode;
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
        if (getSourceLanguageCode() != null)
            sb.append("SourceLanguageCode: " + getSourceLanguageCode() + ",");
        if (getTargetLanguageCode() != null)
            sb.append("TargetLanguageCode: " + getTargetLanguageCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode
                + ((getSourceLanguageCode() == null) ? 0 : getSourceLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getTargetLanguageCode() == null) ? 0 : getTargetLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranslateTextRequest == false)
            return false;
        TranslateTextRequest other = (TranslateTextRequest) obj;

        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getSourceLanguageCode() == null ^ this.getSourceLanguageCode() == null)
            return false;
        if (other.getSourceLanguageCode() != null
                && other.getSourceLanguageCode().equals(this.getSourceLanguageCode()) == false)
            return false;
        if (other.getTargetLanguageCode() == null ^ this.getTargetLanguageCode() == null)
            return false;
        if (other.getTargetLanguageCode() != null
                && other.getTargetLanguageCode().equals(this.getTargetLanguageCode()) == false)
            return false;
        return true;
    }
}
