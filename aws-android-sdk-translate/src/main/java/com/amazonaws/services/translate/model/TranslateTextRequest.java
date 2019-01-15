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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Translates input text from the source language to the target language. It is
 * not necessary to use English (en) as either the source or the target language
 * but not all language combinations are supported by Amazon Translate. For more
 * information, see <a
 * href="http://docs.aws.amazon.com/translate/latest/dg/pairs.html">Supported
 * Language Pairs</a>.
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
 * Chinese (Traditional) (zh-TW)
 * </p>
 * </li>
 * <li>
 * <p>
 * Czech (cs)
 * </p>
 * </li>
 * <li>
 * <p>
 * Danish (da)
 * </p>
 * </li>
 * <li>
 * <p>
 * Dutch (nl)
 * </p>
 * </li>
 * <li>
 * <p>
 * English (en)
 * </p>
 * </li>
 * <li>
 * <p>
 * Finnish (fi)
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
 * Hebrew (he)
 * </p>
 * </li>
 * <li>
 * <p>
 * Indonesian (id)
 * </p>
 * </li>
 * <li>
 * <p>
 * Italian (it)
 * </p>
 * </li>
 * <li>
 * <p>
 * Japanese (ja)
 * </p>
 * </li>
 * <li>
 * <p>
 * Korean (ko)
 * </p>
 * </li>
 * <li>
 * <p>
 * Polish (pl)
 * </p>
 * </li>
 * <li>
 * <p>
 * Portuguese (pt)
 * </p>
 * </li>
 * <li>
 * <p>
 * Russian (ru)
 * </p>
 * </li>
 * <li>
 * <p>
 * Spanish (es)
 * </p>
 * </li>
 * <li>
 * <p>
 * Swedish (sv)
 * </p>
 * </li>
 * <li>
 * <p>
 * Turkish (tr)
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
     * The text to translate. The text string can be a maximum of 5,000 bytes
     * long. Depending on your character set, this may be fewer than 5,000
     * characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{1,5000}<br/>
     */
    private String text;

    /**
     * <p>
     * The TerminologyNames list that is taken as input to the TranslateText
     * request. This has a minimum length of 0 and a maximum length of 1.
     * </p>
     */
    private java.util.List<String> terminologyNames;

    /**
     * <p>
     * The language code for the language of the source text. The language must
     * be a language supported by Amazon Translate.
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
     * The language code requested for the language of the target text. The
     * language must be a language supported by Amazon Translate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     */
    private String targetLanguageCode;

    /**
     * <p>
     * The text to translate. The text string can be a maximum of 5,000 bytes
     * long. Depending on your character set, this may be fewer than 5,000
     * characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{1,5000}<br/>
     *
     * @return <p>
     *         The text to translate. The text string can be a maximum of 5,000
     *         bytes long. Depending on your character set, this may be fewer
     *         than 5,000 characters.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The text to translate. The text string can be a maximum of 5,000 bytes
     * long. Depending on your character set, this may be fewer than 5,000
     * characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{1,5000}<br/>
     *
     * @param text <p>
     *            The text to translate. The text string can be a maximum of
     *            5,000 bytes long. Depending on your character set, this may be
     *            fewer than 5,000 characters.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text to translate. The text string can be a maximum of 5,000 bytes
     * long. Depending on your character set, this may be fewer than 5,000
     * characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{1,5000}<br/>
     *
     * @param text <p>
     *            The text to translate. The text string can be a maximum of
     *            5,000 bytes long. Depending on your character set, this may be
     *            fewer than 5,000 characters.
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
     * The TerminologyNames list that is taken as input to the TranslateText
     * request. This has a minimum length of 0 and a maximum length of 1.
     * </p>
     *
     * @return <p>
     *         The TerminologyNames list that is taken as input to the
     *         TranslateText request. This has a minimum length of 0 and a
     *         maximum length of 1.
     *         </p>
     */
    public java.util.List<String> getTerminologyNames() {
        return terminologyNames;
    }

    /**
     * <p>
     * The TerminologyNames list that is taken as input to the TranslateText
     * request. This has a minimum length of 0 and a maximum length of 1.
     * </p>
     *
     * @param terminologyNames <p>
     *            The TerminologyNames list that is taken as input to the
     *            TranslateText request. This has a minimum length of 0 and a
     *            maximum length of 1.
     *            </p>
     */
    public void setTerminologyNames(java.util.Collection<String> terminologyNames) {
        if (terminologyNames == null) {
            this.terminologyNames = null;
            return;
        }

        this.terminologyNames = new java.util.ArrayList<String>(terminologyNames);
    }

    /**
     * <p>
     * The TerminologyNames list that is taken as input to the TranslateText
     * request. This has a minimum length of 0 and a maximum length of 1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminologyNames <p>
     *            The TerminologyNames list that is taken as input to the
     *            TranslateText request. This has a minimum length of 0 and a
     *            maximum length of 1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateTextRequest withTerminologyNames(String... terminologyNames) {
        if (getTerminologyNames() == null) {
            this.terminologyNames = new java.util.ArrayList<String>(terminologyNames.length);
        }
        for (String value : terminologyNames) {
            this.terminologyNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The TerminologyNames list that is taken as input to the TranslateText
     * request. This has a minimum length of 0 and a maximum length of 1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminologyNames <p>
     *            The TerminologyNames list that is taken as input to the
     *            TranslateText request. This has a minimum length of 0 and a
     *            maximum length of 1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateTextRequest withTerminologyNames(java.util.Collection<String> terminologyNames) {
        setTerminologyNames(terminologyNames);
        return this;
    }

    /**
     * <p>
     * The language code for the language of the source text. The language must
     * be a language supported by Amazon Translate.
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
     *         The language code for the language of the source text. The
     *         language must be a language supported by Amazon Translate.
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
     * The language code for the language of the source text. The language must
     * be a language supported by Amazon Translate.
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
     *            The language code for the language of the source text. The
     *            language must be a language supported by Amazon Translate.
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
     * The language code for the language of the source text. The language must
     * be a language supported by Amazon Translate.
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
     *            The language code for the language of the source text. The
     *            language must be a language supported by Amazon Translate.
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
     * The language code requested for the language of the target text. The
     * language must be a language supported by Amazon Translate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @return <p>
     *         The language code requested for the language of the target text.
     *         The language must be a language supported by Amazon Translate.
     *         </p>
     */
    public String getTargetLanguageCode() {
        return targetLanguageCode;
    }

    /**
     * <p>
     * The language code requested for the language of the target text. The
     * language must be a language supported by Amazon Translate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param targetLanguageCode <p>
     *            The language code requested for the language of the target
     *            text. The language must be a language supported by Amazon
     *            Translate.
     *            </p>
     */
    public void setTargetLanguageCode(String targetLanguageCode) {
        this.targetLanguageCode = targetLanguageCode;
    }

    /**
     * <p>
     * The language code requested for the language of the target text. The
     * language must be a language supported by Amazon Translate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param targetLanguageCode <p>
     *            The language code requested for the language of the target
     *            text. The language must be a language supported by Amazon
     *            Translate.
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
        if (getTerminologyNames() != null)
            sb.append("TerminologyNames: " + getTerminologyNames() + ",");
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
                + ((getTerminologyNames() == null) ? 0 : getTerminologyNames().hashCode());
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
        if (other.getTerminologyNames() == null ^ this.getTerminologyNames() == null)
            return false;
        if (other.getTerminologyNames() != null
                && other.getTerminologyNames().equals(this.getTerminologyNames()) == false)
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
