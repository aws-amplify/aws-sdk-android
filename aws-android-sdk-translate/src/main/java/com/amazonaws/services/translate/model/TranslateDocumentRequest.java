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
 * Translates the input document from the source language to the target
 * language. This synchronous operation supports plain text or HTML for the
 * input document. <code>TranslateDocument</code> supports translations from
 * English to any supported language, and from any supported language to
 * English. Therefore, specify either the source language code or the target
 * language code as “en” (English).
 * </p>
 * <p>
 * <code>TranslateDocument</code> does not support language auto-detection.
 * </p>
 * <p>
 * If you set the <code>Formality</code> parameter, the request will fail if the
 * target language does not support formality. For a list of target languages
 * that support formality, see <a href=
 * "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-formality.html"
 * >Setting formality</a>.
 * </p>
 */
public class TranslateDocumentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The content and content type for the document to be translated. The
     * document size must not exceed 100 KB.
     * </p>
     */
    private Document document;

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
     * The language code for the language of the source text. Do not use
     * <code>auto</code>, because <code>TranslateDocument</code> does not
     * support language auto-detection. For a list of supported language codes,
     * see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     * >Supported languages</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     */
    private String sourceLanguageCode;

    /**
     * <p>
     * The language code requested for the translated document. For a list of
     * supported language codes, see <a href=
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
     * The content and content type for the document to be translated. The
     * document size must not exceed 100 KB.
     * </p>
     *
     * @return <p>
     *         The content and content type for the document to be translated.
     *         The document size must not exceed 100 KB.
     *         </p>
     */
    public Document getDocument() {
        return document;
    }

    /**
     * <p>
     * The content and content type for the document to be translated. The
     * document size must not exceed 100 KB.
     * </p>
     *
     * @param document <p>
     *            The content and content type for the document to be
     *            translated. The document size must not exceed 100 KB.
     *            </p>
     */
    public void setDocument(Document document) {
        this.document = document;
    }

    /**
     * <p>
     * The content and content type for the document to be translated. The
     * document size must not exceed 100 KB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param document <p>
     *            The content and content type for the document to be
     *            translated. The document size must not exceed 100 KB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateDocumentRequest withDocument(Document document) {
        this.document = document;
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
    public TranslateDocumentRequest withTerminologyNames(String... terminologyNames) {
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
    public TranslateDocumentRequest withTerminologyNames(
            java.util.Collection<String> terminologyNames) {
        setTerminologyNames(terminologyNames);
        return this;
    }

    /**
     * <p>
     * The language code for the language of the source text. Do not use
     * <code>auto</code>, because <code>TranslateDocument</code> does not
     * support language auto-detection. For a list of supported language codes,
     * see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     * >Supported languages</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @return <p>
     *         The language code for the language of the source text. Do not use
     *         <code>auto</code>, because <code>TranslateDocument</code> does
     *         not support language auto-detection. For a list of supported
     *         language codes, see <a href=
     *         "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     *         >Supported languages</a>.
     *         </p>
     */
    public String getSourceLanguageCode() {
        return sourceLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the source text. Do not use
     * <code>auto</code>, because <code>TranslateDocument</code> does not
     * support language auto-detection. For a list of supported language codes,
     * see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     * >Supported languages</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param sourceLanguageCode <p>
     *            The language code for the language of the source text. Do not
     *            use <code>auto</code>, because <code>TranslateDocument</code>
     *            does not support language auto-detection. For a list of
     *            supported language codes, see <a href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     *            >Supported languages</a>.
     *            </p>
     */
    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the source text. Do not use
     * <code>auto</code>, because <code>TranslateDocument</code> does not
     * support language auto-detection. For a list of supported language codes,
     * see <a href=
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
     * @param sourceLanguageCode <p>
     *            The language code for the language of the source text. Do not
     *            use <code>auto</code>, because <code>TranslateDocument</code>
     *            does not support language auto-detection. For a list of
     *            supported language codes, see <a href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     *            >Supported languages</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateDocumentRequest withSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
        return this;
    }

    /**
     * <p>
     * The language code requested for the translated document. For a list of
     * supported language codes, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     * >Supported languages</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @return <p>
     *         The language code requested for the translated document. For a
     *         list of supported language codes, see <a href=
     *         "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     *         >Supported languages</a>.
     *         </p>
     */
    public String getTargetLanguageCode() {
        return targetLanguageCode;
    }

    /**
     * <p>
     * The language code requested for the translated document. For a list of
     * supported language codes, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     * >Supported languages</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param targetLanguageCode <p>
     *            The language code requested for the translated document. For a
     *            list of supported language codes, see <a href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     *            >Supported languages</a>.
     *            </p>
     */
    public void setTargetLanguageCode(String targetLanguageCode) {
        this.targetLanguageCode = targetLanguageCode;
    }

    /**
     * <p>
     * The language code requested for the translated document. For a list of
     * supported language codes, see <a href=
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
     *            The language code requested for the translated document. For a
     *            list of supported language codes, see <a href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     *            >Supported languages</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateDocumentRequest withTargetLanguageCode(String targetLanguageCode) {
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
    public TranslateDocumentRequest withSettings(TranslationSettings settings) {
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
        if (getDocument() != null)
            sb.append("Document: " + getDocument() + ",");
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

        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
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

        if (obj instanceof TranslateDocumentRequest == false)
            return false;
        TranslateDocumentRequest other = (TranslateDocumentRequest) obj;

        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
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
