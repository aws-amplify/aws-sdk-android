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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

/**
 * <p>
 * If using automatic language identification in your request and you want to
 * apply a custom language model, a custom vocabulary, or a custom vocabulary
 * filter, include <code>LanguageIdSettings</code> with the relevant
 * sub-parameters (<code>VocabularyName</code>, <code>LanguageModelName</code>,
 * and <code>VocabularyFilterName</code>). Note that multi-language
 * identification (<code>IdentifyMultipleLanguages</code>) doesn't support
 * custom language models.
 * </p>
 * <p>
 * <code>LanguageIdSettings</code> supports two to five language codes. Each
 * language code you include can have an associated custom language model,
 * custom vocabulary, and custom vocabulary filter. The language codes that you
 * specify must match the languages of the associated custom language models,
 * custom vocabularies, and custom vocabulary filters.
 * </p>
 * <p>
 * It's recommended that you include <code>LanguageOptions</code> when using
 * <code>LanguageIdSettings</code> to ensure that the correct language dialect
 * is identified. For example, if you specify a custom vocabulary that is in
 * <code>en-US</code> but Amazon Transcribe determines that the language spoken
 * in your media is <code>en-AU</code>, your custom vocabulary <i>is not</i>
 * applied to your transcription. If you include <code>LanguageOptions</code>
 * and include <code>en-US</code> as the only English language dialect, your
 * custom vocabulary <i>is</i> applied to your transcription.
 * </p>
 * <p>
 * If you want to include a custom language model with your request but <b>do
 * not</b> want to use automatic language identification, use instead the
 * <code/> parameter with the <code>LanguageModelName</code> sub-parameter. If
 * you want to include a custom vocabulary or a custom vocabulary filter (or
 * both) with your request but <b>do not</b> want to use automatic language
 * identification, use instead the
 * <code/> parameter with the <code>VocabularyName</code> or
 * <code>VocabularyFilterName</code> (or both) sub-parameter.
 * </p>
 */
public class LanguageIdSettings implements Serializable {
    /**
     * <p>
     * The name of the custom vocabulary you want to use when processing your
     * transcription job. Custom vocabulary names are case sensitive.
     * </p>
     * <p>
     * The language of the specified custom vocabulary must match the language
     * code that you specify in your transcription request. If the languages
     * don't match, the custom vocabulary isn't applied. There are no errors or
     * warnings associated with a language mismatch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyName;

    /**
     * <p>
     * The name of the custom vocabulary filter you want to use when processing
     * your transcription job. Custom vocabulary filter names are case
     * sensitive.
     * </p>
     * <p>
     * The language of the specified custom vocabulary filter must match the
     * language code that you specify in your transcription request. If the
     * languages don't match, the custom vocabulary filter isn't applied. There
     * are no errors or warnings associated with a language mismatch.
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterName</code> in your
     * request, you must also include <code>VocabularyFilterMethod</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyFilterName;

    /**
     * <p>
     * The name of the custom language model you want to use when processing
     * your transcription job. Note that custom language model names are case
     * sensitive.
     * </p>
     * <p>
     * The language of the specified custom language model must match the
     * language code that you specify in your transcription request. If the
     * languages don't match, the custom language model isn't applied. There are
     * no errors or warnings associated with a language mismatch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String languageModelName;

    /**
     * <p>
     * The name of the custom vocabulary you want to use when processing your
     * transcription job. Custom vocabulary names are case sensitive.
     * </p>
     * <p>
     * The language of the specified custom vocabulary must match the language
     * code that you specify in your transcription request. If the languages
     * don't match, the custom vocabulary isn't applied. There are no errors or
     * warnings associated with a language mismatch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the custom vocabulary you want to use when processing
     *         your transcription job. Custom vocabulary names are case
     *         sensitive.
     *         </p>
     *         <p>
     *         The language of the specified custom vocabulary must match the
     *         language code that you specify in your transcription request. If
     *         the languages don't match, the custom vocabulary isn't applied.
     *         There are no errors or warnings associated with a language
     *         mismatch.
     *         </p>
     */
    public String getVocabularyName() {
        return vocabularyName;
    }

    /**
     * <p>
     * The name of the custom vocabulary you want to use when processing your
     * transcription job. Custom vocabulary names are case sensitive.
     * </p>
     * <p>
     * The language of the specified custom vocabulary must match the language
     * code that you specify in your transcription request. If the languages
     * don't match, the custom vocabulary isn't applied. There are no errors or
     * warnings associated with a language mismatch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyName <p>
     *            The name of the custom vocabulary you want to use when
     *            processing your transcription job. Custom vocabulary names are
     *            case sensitive.
     *            </p>
     *            <p>
     *            The language of the specified custom vocabulary must match the
     *            language code that you specify in your transcription request.
     *            If the languages don't match, the custom vocabulary isn't
     *            applied. There are no errors or warnings associated with a
     *            language mismatch.
     *            </p>
     */
    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the custom vocabulary you want to use when processing your
     * transcription job. Custom vocabulary names are case sensitive.
     * </p>
     * <p>
     * The language of the specified custom vocabulary must match the language
     * code that you specify in your transcription request. If the languages
     * don't match, the custom vocabulary isn't applied. There are no errors or
     * warnings associated with a language mismatch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyName <p>
     *            The name of the custom vocabulary you want to use when
     *            processing your transcription job. Custom vocabulary names are
     *            case sensitive.
     *            </p>
     *            <p>
     *            The language of the specified custom vocabulary must match the
     *            language code that you specify in your transcription request.
     *            If the languages don't match, the custom vocabulary isn't
     *            applied. There are no errors or warnings associated with a
     *            language mismatch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LanguageIdSettings withVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
        return this;
    }

    /**
     * <p>
     * The name of the custom vocabulary filter you want to use when processing
     * your transcription job. Custom vocabulary filter names are case
     * sensitive.
     * </p>
     * <p>
     * The language of the specified custom vocabulary filter must match the
     * language code that you specify in your transcription request. If the
     * languages don't match, the custom vocabulary filter isn't applied. There
     * are no errors or warnings associated with a language mismatch.
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterName</code> in your
     * request, you must also include <code>VocabularyFilterMethod</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the custom vocabulary filter you want to use when
     *         processing your transcription job. Custom vocabulary filter names
     *         are case sensitive.
     *         </p>
     *         <p>
     *         The language of the specified custom vocabulary filter must match
     *         the language code that you specify in your transcription request.
     *         If the languages don't match, the custom vocabulary filter isn't
     *         applied. There are no errors or warnings associated with a
     *         language mismatch.
     *         </p>
     *         <p>
     *         Note that if you include <code>VocabularyFilterName</code> in
     *         your request, you must also include
     *         <code>VocabularyFilterMethod</code>.
     *         </p>
     */
    public String getVocabularyFilterName() {
        return vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the custom vocabulary filter you want to use when processing
     * your transcription job. Custom vocabulary filter names are case
     * sensitive.
     * </p>
     * <p>
     * The language of the specified custom vocabulary filter must match the
     * language code that you specify in your transcription request. If the
     * languages don't match, the custom vocabulary filter isn't applied. There
     * are no errors or warnings associated with a language mismatch.
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterName</code> in your
     * request, you must also include <code>VocabularyFilterMethod</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyFilterName <p>
     *            The name of the custom vocabulary filter you want to use when
     *            processing your transcription job. Custom vocabulary filter
     *            names are case sensitive.
     *            </p>
     *            <p>
     *            The language of the specified custom vocabulary filter must
     *            match the language code that you specify in your transcription
     *            request. If the languages don't match, the custom vocabulary
     *            filter isn't applied. There are no errors or warnings
     *            associated with a language mismatch.
     *            </p>
     *            <p>
     *            Note that if you include <code>VocabularyFilterName</code> in
     *            your request, you must also include
     *            <code>VocabularyFilterMethod</code>.
     *            </p>
     */
    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the custom vocabulary filter you want to use when processing
     * your transcription job. Custom vocabulary filter names are case
     * sensitive.
     * </p>
     * <p>
     * The language of the specified custom vocabulary filter must match the
     * language code that you specify in your transcription request. If the
     * languages don't match, the custom vocabulary filter isn't applied. There
     * are no errors or warnings associated with a language mismatch.
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterName</code> in your
     * request, you must also include <code>VocabularyFilterMethod</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyFilterName <p>
     *            The name of the custom vocabulary filter you want to use when
     *            processing your transcription job. Custom vocabulary filter
     *            names are case sensitive.
     *            </p>
     *            <p>
     *            The language of the specified custom vocabulary filter must
     *            match the language code that you specify in your transcription
     *            request. If the languages don't match, the custom vocabulary
     *            filter isn't applied. There are no errors or warnings
     *            associated with a language mismatch.
     *            </p>
     *            <p>
     *            Note that if you include <code>VocabularyFilterName</code> in
     *            your request, you must also include
     *            <code>VocabularyFilterMethod</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LanguageIdSettings withVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
        return this;
    }

    /**
     * <p>
     * The name of the custom language model you want to use when processing
     * your transcription job. Note that custom language model names are case
     * sensitive.
     * </p>
     * <p>
     * The language of the specified custom language model must match the
     * language code that you specify in your transcription request. If the
     * languages don't match, the custom language model isn't applied. There are
     * no errors or warnings associated with a language mismatch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the custom language model you want to use when
     *         processing your transcription job. Note that custom language
     *         model names are case sensitive.
     *         </p>
     *         <p>
     *         The language of the specified custom language model must match
     *         the language code that you specify in your transcription request.
     *         If the languages don't match, the custom language model isn't
     *         applied. There are no errors or warnings associated with a
     *         language mismatch.
     *         </p>
     */
    public String getLanguageModelName() {
        return languageModelName;
    }

    /**
     * <p>
     * The name of the custom language model you want to use when processing
     * your transcription job. Note that custom language model names are case
     * sensitive.
     * </p>
     * <p>
     * The language of the specified custom language model must match the
     * language code that you specify in your transcription request. If the
     * languages don't match, the custom language model isn't applied. There are
     * no errors or warnings associated with a language mismatch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param languageModelName <p>
     *            The name of the custom language model you want to use when
     *            processing your transcription job. Note that custom language
     *            model names are case sensitive.
     *            </p>
     *            <p>
     *            The language of the specified custom language model must match
     *            the language code that you specify in your transcription
     *            request. If the languages don't match, the custom language
     *            model isn't applied. There are no errors or warnings
     *            associated with a language mismatch.
     *            </p>
     */
    public void setLanguageModelName(String languageModelName) {
        this.languageModelName = languageModelName;
    }

    /**
     * <p>
     * The name of the custom language model you want to use when processing
     * your transcription job. Note that custom language model names are case
     * sensitive.
     * </p>
     * <p>
     * The language of the specified custom language model must match the
     * language code that you specify in your transcription request. If the
     * languages don't match, the custom language model isn't applied. There are
     * no errors or warnings associated with a language mismatch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param languageModelName <p>
     *            The name of the custom language model you want to use when
     *            processing your transcription job. Note that custom language
     *            model names are case sensitive.
     *            </p>
     *            <p>
     *            The language of the specified custom language model must match
     *            the language code that you specify in your transcription
     *            request. If the languages don't match, the custom language
     *            model isn't applied. There are no errors or warnings
     *            associated with a language mismatch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LanguageIdSettings withLanguageModelName(String languageModelName) {
        this.languageModelName = languageModelName;
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
        if (getVocabularyName() != null)
            sb.append("VocabularyName: " + getVocabularyName() + ",");
        if (getVocabularyFilterName() != null)
            sb.append("VocabularyFilterName: " + getVocabularyFilterName() + ",");
        if (getLanguageModelName() != null)
            sb.append("LanguageModelName: " + getLanguageModelName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode
                + ((getVocabularyFilterName() == null) ? 0 : getVocabularyFilterName().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageModelName() == null) ? 0 : getLanguageModelName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LanguageIdSettings == false)
            return false;
        LanguageIdSettings other = (LanguageIdSettings) obj;

        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null
                && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getVocabularyFilterName() == null ^ this.getVocabularyFilterName() == null)
            return false;
        if (other.getVocabularyFilterName() != null
                && other.getVocabularyFilterName().equals(this.getVocabularyFilterName()) == false)
            return false;
        if (other.getLanguageModelName() == null ^ this.getLanguageModelName() == null)
            return false;
        if (other.getLanguageModelName() != null
                && other.getLanguageModelName().equals(this.getLanguageModelName()) == false)
            return false;
        return true;
    }
}
