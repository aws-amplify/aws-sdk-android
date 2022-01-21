/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Language-specific settings that can be specified when language identification
 * is enabled.
 * </p>
 */
public class LanguageIdSettings implements Serializable {
    /**
     * <p>
     * The name of the vocabulary you want to use when processing your
     * transcription job. The vocabulary you specify must have the same language
     * codes as the transcription job; if the languages don't match, the
     * vocabulary isn't applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyName;

    /**
     * <p>
     * The name of the vocabulary filter you want to use when transcribing your
     * audio. The filter you specify must have the same language codes as the
     * transcription job; if the languages don't match, the vocabulary filter
     * isn't be applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyFilterName;

    /**
     * <p>
     * The name of the language model you want to use when transcribing your
     * audio. The model you specify must have the same language codes as the
     * transcription job; if the languages don't match, the language model isn't
     * be applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String languageModelName;

    /**
     * <p>
     * The name of the vocabulary you want to use when processing your
     * transcription job. The vocabulary you specify must have the same language
     * codes as the transcription job; if the languages don't match, the
     * vocabulary isn't applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the vocabulary you want to use when processing your
     *         transcription job. The vocabulary you specify must have the same
     *         language codes as the transcription job; if the languages don't
     *         match, the vocabulary isn't applied.
     *         </p>
     */
    public String getVocabularyName() {
        return vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary you want to use when processing your
     * transcription job. The vocabulary you specify must have the same language
     * codes as the transcription job; if the languages don't match, the
     * vocabulary isn't applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyName <p>
     *            The name of the vocabulary you want to use when processing
     *            your transcription job. The vocabulary you specify must have
     *            the same language codes as the transcription job; if the
     *            languages don't match, the vocabulary isn't applied.
     *            </p>
     */
    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary you want to use when processing your
     * transcription job. The vocabulary you specify must have the same language
     * codes as the transcription job; if the languages don't match, the
     * vocabulary isn't applied.
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
     *            The name of the vocabulary you want to use when processing
     *            your transcription job. The vocabulary you specify must have
     *            the same language codes as the transcription job; if the
     *            languages don't match, the vocabulary isn't applied.
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
     * The name of the vocabulary filter you want to use when transcribing your
     * audio. The filter you specify must have the same language codes as the
     * transcription job; if the languages don't match, the vocabulary filter
     * isn't be applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the vocabulary filter you want to use when
     *         transcribing your audio. The filter you specify must have the
     *         same language codes as the transcription job; if the languages
     *         don't match, the vocabulary filter isn't be applied.
     *         </p>
     */
    public String getVocabularyFilterName() {
        return vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter you want to use when transcribing your
     * audio. The filter you specify must have the same language codes as the
     * transcription job; if the languages don't match, the vocabulary filter
     * isn't be applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyFilterName <p>
     *            The name of the vocabulary filter you want to use when
     *            transcribing your audio. The filter you specify must have the
     *            same language codes as the transcription job; if the languages
     *            don't match, the vocabulary filter isn't be applied.
     *            </p>
     */
    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter you want to use when transcribing your
     * audio. The filter you specify must have the same language codes as the
     * transcription job; if the languages don't match, the vocabulary filter
     * isn't be applied.
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
     *            The name of the vocabulary filter you want to use when
     *            transcribing your audio. The filter you specify must have the
     *            same language codes as the transcription job; if the languages
     *            don't match, the vocabulary filter isn't be applied.
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
     * The name of the language model you want to use when transcribing your
     * audio. The model you specify must have the same language codes as the
     * transcription job; if the languages don't match, the language model isn't
     * be applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the language model you want to use when transcribing
     *         your audio. The model you specify must have the same language
     *         codes as the transcription job; if the languages don't match, the
     *         language model isn't be applied.
     *         </p>
     */
    public String getLanguageModelName() {
        return languageModelName;
    }

    /**
     * <p>
     * The name of the language model you want to use when transcribing your
     * audio. The model you specify must have the same language codes as the
     * transcription job; if the languages don't match, the language model isn't
     * be applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param languageModelName <p>
     *            The name of the language model you want to use when
     *            transcribing your audio. The model you specify must have the
     *            same language codes as the transcription job; if the languages
     *            don't match, the language model isn't be applied.
     *            </p>
     */
    public void setLanguageModelName(String languageModelName) {
        this.languageModelName = languageModelName;
    }

    /**
     * <p>
     * The name of the language model you want to use when transcribing your
     * audio. The model you specify must have the same language codes as the
     * transcription job; if the languages don't match, the language model isn't
     * be applied.
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
     *            The name of the language model you want to use when
     *            transcribing your audio. The model you specify must have the
     *            same language codes as the transcription job; if the languages
     *            don't match, the language model isn't be applied.
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
