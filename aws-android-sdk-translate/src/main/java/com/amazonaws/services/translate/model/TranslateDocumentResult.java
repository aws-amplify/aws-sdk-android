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

public class TranslateDocumentResult implements Serializable {
    /**
     * <p>
     * The document containing the translated content. The document format
     * matches the source document format.
     * </p>
     */
    private TranslatedDocument translatedDocument;

    /**
     * <p>
     * The language code of the source document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     */
    private String sourceLanguageCode;

    /**
     * <p>
     * The language code of the translated document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     */
    private String targetLanguageCode;

    /**
     * <p>
     * The names of the custom terminologies applied to the input text by Amazon
     * Translate to produce the translated text document.
     * </p>
     */
    private java.util.List<AppliedTerminology> appliedTerminologies;

    /**
     * <p>
     * Settings to configure your translation output, including the option to
     * set the formality level of the output text and the option to mask profane
     * words and phrases.
     * </p>
     */
    private TranslationSettings appliedSettings;

    /**
     * <p>
     * The document containing the translated content. The document format
     * matches the source document format.
     * </p>
     *
     * @return <p>
     *         The document containing the translated content. The document
     *         format matches the source document format.
     *         </p>
     */
    public TranslatedDocument getTranslatedDocument() {
        return translatedDocument;
    }

    /**
     * <p>
     * The document containing the translated content. The document format
     * matches the source document format.
     * </p>
     *
     * @param translatedDocument <p>
     *            The document containing the translated content. The document
     *            format matches the source document format.
     *            </p>
     */
    public void setTranslatedDocument(TranslatedDocument translatedDocument) {
        this.translatedDocument = translatedDocument;
    }

    /**
     * <p>
     * The document containing the translated content. The document format
     * matches the source document format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param translatedDocument <p>
     *            The document containing the translated content. The document
     *            format matches the source document format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateDocumentResult withTranslatedDocument(TranslatedDocument translatedDocument) {
        this.translatedDocument = translatedDocument;
        return this;
    }

    /**
     * <p>
     * The language code of the source document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @return <p>
     *         The language code of the source document.
     *         </p>
     */
    public String getSourceLanguageCode() {
        return sourceLanguageCode;
    }

    /**
     * <p>
     * The language code of the source document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param sourceLanguageCode <p>
     *            The language code of the source document.
     *            </p>
     */
    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * The language code of the source document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param sourceLanguageCode <p>
     *            The language code of the source document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateDocumentResult withSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
        return this;
    }

    /**
     * <p>
     * The language code of the translated document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @return <p>
     *         The language code of the translated document.
     *         </p>
     */
    public String getTargetLanguageCode() {
        return targetLanguageCode;
    }

    /**
     * <p>
     * The language code of the translated document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param targetLanguageCode <p>
     *            The language code of the translated document.
     *            </p>
     */
    public void setTargetLanguageCode(String targetLanguageCode) {
        this.targetLanguageCode = targetLanguageCode;
    }

    /**
     * <p>
     * The language code of the translated document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param targetLanguageCode <p>
     *            The language code of the translated document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateDocumentResult withTargetLanguageCode(String targetLanguageCode) {
        this.targetLanguageCode = targetLanguageCode;
        return this;
    }

    /**
     * <p>
     * The names of the custom terminologies applied to the input text by Amazon
     * Translate to produce the translated text document.
     * </p>
     *
     * @return <p>
     *         The names of the custom terminologies applied to the input text
     *         by Amazon Translate to produce the translated text document.
     *         </p>
     */
    public java.util.List<AppliedTerminology> getAppliedTerminologies() {
        return appliedTerminologies;
    }

    /**
     * <p>
     * The names of the custom terminologies applied to the input text by Amazon
     * Translate to produce the translated text document.
     * </p>
     *
     * @param appliedTerminologies <p>
     *            The names of the custom terminologies applied to the input
     *            text by Amazon Translate to produce the translated text
     *            document.
     *            </p>
     */
    public void setAppliedTerminologies(
            java.util.Collection<AppliedTerminology> appliedTerminologies) {
        if (appliedTerminologies == null) {
            this.appliedTerminologies = null;
            return;
        }

        this.appliedTerminologies = new java.util.ArrayList<AppliedTerminology>(
                appliedTerminologies);
    }

    /**
     * <p>
     * The names of the custom terminologies applied to the input text by Amazon
     * Translate to produce the translated text document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appliedTerminologies <p>
     *            The names of the custom terminologies applied to the input
     *            text by Amazon Translate to produce the translated text
     *            document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateDocumentResult withAppliedTerminologies(
            AppliedTerminology... appliedTerminologies) {
        if (getAppliedTerminologies() == null) {
            this.appliedTerminologies = new java.util.ArrayList<AppliedTerminology>(
                    appliedTerminologies.length);
        }
        for (AppliedTerminology value : appliedTerminologies) {
            this.appliedTerminologies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the custom terminologies applied to the input text by Amazon
     * Translate to produce the translated text document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appliedTerminologies <p>
     *            The names of the custom terminologies applied to the input
     *            text by Amazon Translate to produce the translated text
     *            document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateDocumentResult withAppliedTerminologies(
            java.util.Collection<AppliedTerminology> appliedTerminologies) {
        setAppliedTerminologies(appliedTerminologies);
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
    public TranslationSettings getAppliedSettings() {
        return appliedSettings;
    }

    /**
     * <p>
     * Settings to configure your translation output, including the option to
     * set the formality level of the output text and the option to mask profane
     * words and phrases.
     * </p>
     *
     * @param appliedSettings <p>
     *            Settings to configure your translation output, including the
     *            option to set the formality level of the output text and the
     *            option to mask profane words and phrases.
     *            </p>
     */
    public void setAppliedSettings(TranslationSettings appliedSettings) {
        this.appliedSettings = appliedSettings;
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
     * @param appliedSettings <p>
     *            Settings to configure your translation output, including the
     *            option to set the formality level of the output text and the
     *            option to mask profane words and phrases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateDocumentResult withAppliedSettings(TranslationSettings appliedSettings) {
        this.appliedSettings = appliedSettings;
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
        if (getTranslatedDocument() != null)
            sb.append("TranslatedDocument: " + getTranslatedDocument() + ",");
        if (getSourceLanguageCode() != null)
            sb.append("SourceLanguageCode: " + getSourceLanguageCode() + ",");
        if (getTargetLanguageCode() != null)
            sb.append("TargetLanguageCode: " + getTargetLanguageCode() + ",");
        if (getAppliedTerminologies() != null)
            sb.append("AppliedTerminologies: " + getAppliedTerminologies() + ",");
        if (getAppliedSettings() != null)
            sb.append("AppliedSettings: " + getAppliedSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTranslatedDocument() == null) ? 0 : getTranslatedDocument().hashCode());
        hashCode = prime * hashCode
                + ((getSourceLanguageCode() == null) ? 0 : getSourceLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getTargetLanguageCode() == null) ? 0 : getTargetLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getAppliedTerminologies() == null) ? 0 : getAppliedTerminologies().hashCode());
        hashCode = prime * hashCode
                + ((getAppliedSettings() == null) ? 0 : getAppliedSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranslateDocumentResult == false)
            return false;
        TranslateDocumentResult other = (TranslateDocumentResult) obj;

        if (other.getTranslatedDocument() == null ^ this.getTranslatedDocument() == null)
            return false;
        if (other.getTranslatedDocument() != null
                && other.getTranslatedDocument().equals(this.getTranslatedDocument()) == false)
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
        if (other.getAppliedTerminologies() == null ^ this.getAppliedTerminologies() == null)
            return false;
        if (other.getAppliedTerminologies() != null
                && other.getAppliedTerminologies().equals(this.getAppliedTerminologies()) == false)
            return false;
        if (other.getAppliedSettings() == null ^ this.getAppliedSettings() == null)
            return false;
        if (other.getAppliedSettings() != null
                && other.getAppliedSettings().equals(this.getAppliedSettings()) == false)
            return false;
        return true;
    }
}
