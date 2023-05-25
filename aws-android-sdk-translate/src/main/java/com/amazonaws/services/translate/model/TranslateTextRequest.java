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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Translates input text from the source language to the target language. For a
 * list of available languages and language codes, see <a href=
 * "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
 * >Supported languages</a>.
 * </p>
 */
public class TranslateTextRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The text to translate. The text string can be a maximum of 10,000 bytes
     * long. Depending on your character set, this may be fewer than 10,000
     * characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{1,10000}<br/>
     */
    private String text;

    /**
     * <p>
     * The name of a terminology list file to add to the translation job. This
     * file provides source terms and the desired translation for each term. A
     * terminology list can contain a maximum of 256 terms. You can use one
     * custom terminology resource in your translation request.
     * </p>
     * <p>
     * Use the <a>ListTerminologies</a> operation to get the available
     * terminology lists.
     * </p>
     * <p>
     * For more information about custom terminology lists, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/how-custom-terminology.html"
     * >Custom terminology</a>.
     * </p>
     */
    private java.util.List<String> terminologyNames;

    /**
     * <p>
     * The language code for the language of the source text. For a list of
     * language codes, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     * >Supported languages</a>.
     * </p>
     * <p>
     * To have Amazon Translate determine the source language of your text, you
     * can specify <code>auto</code> in the <code>SourceLanguageCode</code>
     * field. If you specify <code>auto</code>, Amazon Translate will call <a
     * href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/comprehend-general.html"
     * >Amazon Comprehend</a> to determine the source language.
     * </p>
     * <note>
     * <p>
     * If you specify <code>auto</code>, you must send the
     * <code>TranslateText</code> request in a region that supports Amazon
     * Comprehend. Otherwise, the request returns an error indicating that
     * autodetect is not supported.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     */
    private String sourceLanguageCode;

    /**
     * <p>
     * The language code requested for the language of the target text. For a
     * list of language codes, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     * >Supported languages</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     */
    private String targetLanguageCode;

    /**
     * <p>
     * Settings to configure your translation output, including the option to
     * set the formality level of the output text and the option to mask profane
     * words and phrases.
     * </p>
     */
    private TranslationSettings settings;

    /**
     * <p>
     * The text to translate. The text string can be a maximum of 10,000 bytes
     * long. Depending on your character set, this may be fewer than 10,000
     * characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{1,10000}<br/>
     *
     * @return <p>
     *         The text to translate. The text string can be a maximum of 10,000
     *         bytes long. Depending on your character set, this may be fewer
     *         than 10,000 characters.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The text to translate. The text string can be a maximum of 10,000 bytes
     * long. Depending on your character set, this may be fewer than 10,000
     * characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{1,10000}<br/>
     *
     * @param text <p>
     *            The text to translate. The text string can be a maximum of
     *            10,000 bytes long. Depending on your character set, this may
     *            be fewer than 10,000 characters.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text to translate. The text string can be a maximum of 10,000 bytes
     * long. Depending on your character set, this may be fewer than 10,000
     * characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{1,10000}<br/>
     *
     * @param text <p>
     *            The text to translate. The text string can be a maximum of
     *            10,000 bytes long. Depending on your character set, this may
     *            be fewer than 10,000 characters.
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
     * The name of a terminology list file to add to the translation job. This
     * file provides source terms and the desired translation for each term. A
     * terminology list can contain a maximum of 256 terms. You can use one
     * custom terminology resource in your translation request.
     * </p>
     * <p>
     * Use the <a>ListTerminologies</a> operation to get the available
     * terminology lists.
     * </p>
     * <p>
     * For more information about custom terminology lists, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/how-custom-terminology.html"
     * >Custom terminology</a>.
     * </p>
     *
     * @return <p>
     *         The name of a terminology list file to add to the translation
     *         job. This file provides source terms and the desired translation
     *         for each term. A terminology list can contain a maximum of 256
     *         terms. You can use one custom terminology resource in your
     *         translation request.
     *         </p>
     *         <p>
     *         Use the <a>ListTerminologies</a> operation to get the available
     *         terminology lists.
     *         </p>
     *         <p>
     *         For more information about custom terminology lists, see <a href=
     *         "https://docs.aws.amazon.com/translate/latest/dg/how-custom-terminology.html"
     *         >Custom terminology</a>.
     *         </p>
     */
    public java.util.List<String> getTerminologyNames() {
        return terminologyNames;
    }

    /**
     * <p>
     * The name of a terminology list file to add to the translation job. This
     * file provides source terms and the desired translation for each term. A
     * terminology list can contain a maximum of 256 terms. You can use one
     * custom terminology resource in your translation request.
     * </p>
     * <p>
     * Use the <a>ListTerminologies</a> operation to get the available
     * terminology lists.
     * </p>
     * <p>
     * For more information about custom terminology lists, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/how-custom-terminology.html"
     * >Custom terminology</a>.
     * </p>
     *
     * @param terminologyNames <p>
     *            The name of a terminology list file to add to the translation
     *            job. This file provides source terms and the desired
     *            translation for each term. A terminology list can contain a
     *            maximum of 256 terms. You can use one custom terminology
     *            resource in your translation request.
     *            </p>
     *            <p>
     *            Use the <a>ListTerminologies</a> operation to get the
     *            available terminology lists.
     *            </p>
     *            <p>
     *            For more information about custom terminology lists, see <a
     *            href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/how-custom-terminology.html"
     *            >Custom terminology</a>.
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
     * The name of a terminology list file to add to the translation job. This
     * file provides source terms and the desired translation for each term. A
     * terminology list can contain a maximum of 256 terms. You can use one
     * custom terminology resource in your translation request.
     * </p>
     * <p>
     * Use the <a>ListTerminologies</a> operation to get the available
     * terminology lists.
     * </p>
     * <p>
     * For more information about custom terminology lists, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/how-custom-terminology.html"
     * >Custom terminology</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminologyNames <p>
     *            The name of a terminology list file to add to the translation
     *            job. This file provides source terms and the desired
     *            translation for each term. A terminology list can contain a
     *            maximum of 256 terms. You can use one custom terminology
     *            resource in your translation request.
     *            </p>
     *            <p>
     *            Use the <a>ListTerminologies</a> operation to get the
     *            available terminology lists.
     *            </p>
     *            <p>
     *            For more information about custom terminology lists, see <a
     *            href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/how-custom-terminology.html"
     *            >Custom terminology</a>.
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
     * The name of a terminology list file to add to the translation job. This
     * file provides source terms and the desired translation for each term. A
     * terminology list can contain a maximum of 256 terms. You can use one
     * custom terminology resource in your translation request.
     * </p>
     * <p>
     * Use the <a>ListTerminologies</a> operation to get the available
     * terminology lists.
     * </p>
     * <p>
     * For more information about custom terminology lists, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/how-custom-terminology.html"
     * >Custom terminology</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminologyNames <p>
     *            The name of a terminology list file to add to the translation
     *            job. This file provides source terms and the desired
     *            translation for each term. A terminology list can contain a
     *            maximum of 256 terms. You can use one custom terminology
     *            resource in your translation request.
     *            </p>
     *            <p>
     *            Use the <a>ListTerminologies</a> operation to get the
     *            available terminology lists.
     *            </p>
     *            <p>
     *            For more information about custom terminology lists, see <a
     *            href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/how-custom-terminology.html"
     *            >Custom terminology</a>.
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
     * The language code for the language of the source text. For a list of
     * language codes, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     * >Supported languages</a>.
     * </p>
     * <p>
     * To have Amazon Translate determine the source language of your text, you
     * can specify <code>auto</code> in the <code>SourceLanguageCode</code>
     * field. If you specify <code>auto</code>, Amazon Translate will call <a
     * href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/comprehend-general.html"
     * >Amazon Comprehend</a> to determine the source language.
     * </p>
     * <note>
     * <p>
     * If you specify <code>auto</code>, you must send the
     * <code>TranslateText</code> request in a region that supports Amazon
     * Comprehend. Otherwise, the request returns an error indicating that
     * autodetect is not supported.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @return <p>
     *         The language code for the language of the source text. For a list
     *         of language codes, see <a href=
     *         "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     *         >Supported languages</a>.
     *         </p>
     *         <p>
     *         To have Amazon Translate determine the source language of your
     *         text, you can specify <code>auto</code> in the
     *         <code>SourceLanguageCode</code> field. If you specify
     *         <code>auto</code>, Amazon Translate will call <a href=
     *         "https://docs.aws.amazon.com/comprehend/latest/dg/comprehend-general.html"
     *         >Amazon Comprehend</a> to determine the source language.
     *         </p>
     *         <note>
     *         <p>
     *         If you specify <code>auto</code>, you must send the
     *         <code>TranslateText</code> request in a region that supports
     *         Amazon Comprehend. Otherwise, the request returns an error
     *         indicating that autodetect is not supported.
     *         </p>
     *         </note>
     */
    public String getSourceLanguageCode() {
        return sourceLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the source text. For a list of
     * language codes, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     * >Supported languages</a>.
     * </p>
     * <p>
     * To have Amazon Translate determine the source language of your text, you
     * can specify <code>auto</code> in the <code>SourceLanguageCode</code>
     * field. If you specify <code>auto</code>, Amazon Translate will call <a
     * href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/comprehend-general.html"
     * >Amazon Comprehend</a> to determine the source language.
     * </p>
     * <note>
     * <p>
     * If you specify <code>auto</code>, you must send the
     * <code>TranslateText</code> request in a region that supports Amazon
     * Comprehend. Otherwise, the request returns an error indicating that
     * autodetect is not supported.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param sourceLanguageCode <p>
     *            The language code for the language of the source text. For a
     *            list of language codes, see <a href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     *            >Supported languages</a>.
     *            </p>
     *            <p>
     *            To have Amazon Translate determine the source language of your
     *            text, you can specify <code>auto</code> in the
     *            <code>SourceLanguageCode</code> field. If you specify
     *            <code>auto</code>, Amazon Translate will call <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/comprehend-general.html"
     *            >Amazon Comprehend</a> to determine the source language.
     *            </p>
     *            <note>
     *            <p>
     *            If you specify <code>auto</code>, you must send the
     *            <code>TranslateText</code> request in a region that supports
     *            Amazon Comprehend. Otherwise, the request returns an error
     *            indicating that autodetect is not supported.
     *            </p>
     *            </note>
     */
    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the source text. For a list of
     * language codes, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     * >Supported languages</a>.
     * </p>
     * <p>
     * To have Amazon Translate determine the source language of your text, you
     * can specify <code>auto</code> in the <code>SourceLanguageCode</code>
     * field. If you specify <code>auto</code>, Amazon Translate will call <a
     * href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/comprehend-general.html"
     * >Amazon Comprehend</a> to determine the source language.
     * </p>
     * <note>
     * <p>
     * If you specify <code>auto</code>, you must send the
     * <code>TranslateText</code> request in a region that supports Amazon
     * Comprehend. Otherwise, the request returns an error indicating that
     * autodetect is not supported.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param sourceLanguageCode <p>
     *            The language code for the language of the source text. For a
     *            list of language codes, see <a href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     *            >Supported languages</a>.
     *            </p>
     *            <p>
     *            To have Amazon Translate determine the source language of your
     *            text, you can specify <code>auto</code> in the
     *            <code>SourceLanguageCode</code> field. If you specify
     *            <code>auto</code>, Amazon Translate will call <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/comprehend-general.html"
     *            >Amazon Comprehend</a> to determine the source language.
     *            </p>
     *            <note>
     *            <p>
     *            If you specify <code>auto</code>, you must send the
     *            <code>TranslateText</code> request in a region that supports
     *            Amazon Comprehend. Otherwise, the request returns an error
     *            indicating that autodetect is not supported.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateTextRequest withSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
        return this;
    }

    /**
     * <p>
     * The language code requested for the language of the target text. For a
     * list of language codes, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     * >Supported languages</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @return <p>
     *         The language code requested for the language of the target text.
     *         For a list of language codes, see <a href=
     *         "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     *         >Supported languages</a>.
     *         </p>
     */
    public String getTargetLanguageCode() {
        return targetLanguageCode;
    }

    /**
     * <p>
     * The language code requested for the language of the target text. For a
     * list of language codes, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     * >Supported languages</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param targetLanguageCode <p>
     *            The language code requested for the language of the target
     *            text. For a list of language codes, see <a href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     *            >Supported languages</a>.
     *            </p>
     */
    public void setTargetLanguageCode(String targetLanguageCode) {
        this.targetLanguageCode = targetLanguageCode;
    }

    /**
     * <p>
     * The language code requested for the language of the target text. For a
     * list of language codes, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     * >Supported languages</a>.
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
     *            text. For a list of language codes, see <a href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     *            >Supported languages</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateTextRequest withTargetLanguageCode(String targetLanguageCode) {
        this.targetLanguageCode = targetLanguageCode;
        return this;
    }

    /**
     * <p>
     * Settings to configure your translation output, including the option to
     * set the formality level of the output text and the option to mask profane
     * words and phrases.
     * </p>
     *
     * @return <p>
     *         Settings to configure your translation output, including the
     *         option to set the formality level of the output text and the
     *         option to mask profane words and phrases.
     *         </p>
     */
    public TranslationSettings getSettings() {
        return settings;
    }

    /**
     * <p>
     * Settings to configure your translation output, including the option to
     * set the formality level of the output text and the option to mask profane
     * words and phrases.
     * </p>
     *
     * @param settings <p>
     *            Settings to configure your translation output, including the
     *            option to set the formality level of the output text and the
     *            option to mask profane words and phrases.
     *            </p>
     */
    public void setSettings(TranslationSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Settings to configure your translation output, including the option to
     * set the formality level of the output text and the option to mask profane
     * words and phrases.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            Settings to configure your translation output, including the
     *            option to set the formality level of the output text and the
     *            option to mask profane words and phrases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateTextRequest withSettings(TranslationSettings settings) {
        this.settings = settings;
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
            sb.append("TargetLanguageCode: " + getTargetLanguageCode() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings());
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
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
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
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }
}
