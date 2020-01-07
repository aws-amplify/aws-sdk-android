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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about a vocabulary filter.
 * </p>
 */
public class VocabularyFilterInfo implements Serializable {
    /**
     * <p>
     * The name of the vocabulary filter. The name must be unique in the account
     * that holds the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyFilterName;

    /**
     * <p>
     * The language code of the words in the vocabulary filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR, it-IT, ko-KR, es-ES, en-IN, hi-IN, ar-SA, ru-RU, zh-CN, nl-NL,
     * id-ID, ta-IN, fa-IR, en-IE, en-AB, en-WL, pt-PT, te-IN, tr-TR, de-CH,
     * he-IL, ms-MY, ja-JP, ar-AE
     */
    private String languageCode;

    /**
     * <p>
     * The date and time that the vocabulary was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The name of the vocabulary filter. The name must be unique in the account
     * that holds the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the vocabulary filter. The name must be unique in the
     *         account that holds the filter.
     *         </p>
     */
    public String getVocabularyFilterName() {
        return vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter. The name must be unique in the account
     * that holds the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyFilterName <p>
     *            The name of the vocabulary filter. The name must be unique in
     *            the account that holds the filter.
     *            </p>
     */
    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter. The name must be unique in the account
     * that holds the filter.
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
     *            The name of the vocabulary filter. The name must be unique in
     *            the account that holds the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VocabularyFilterInfo withVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
        return this;
    }

    /**
     * <p>
     * The language code of the words in the vocabulary filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR, it-IT, ko-KR, es-ES, en-IN, hi-IN, ar-SA, ru-RU, zh-CN, nl-NL,
     * id-ID, ta-IN, fa-IR, en-IE, en-AB, en-WL, pt-PT, te-IN, tr-TR, de-CH,
     * he-IL, ms-MY, ja-JP, ar-AE
     *
     * @return <p>
     *         The language code of the words in the vocabulary filter.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code of the words in the vocabulary filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR, it-IT, ko-KR, es-ES, en-IN, hi-IN, ar-SA, ru-RU, zh-CN, nl-NL,
     * id-ID, ta-IN, fa-IR, en-IE, en-AB, en-WL, pt-PT, te-IN, tr-TR, de-CH,
     * he-IL, ms-MY, ja-JP, ar-AE
     *
     * @param languageCode <p>
     *            The language code of the words in the vocabulary filter.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code of the words in the vocabulary filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR, it-IT, ko-KR, es-ES, en-IN, hi-IN, ar-SA, ru-RU, zh-CN, nl-NL,
     * id-ID, ta-IN, fa-IR, en-IE, en-AB, en-WL, pt-PT, te-IN, tr-TR, de-CH,
     * he-IL, ms-MY, ja-JP, ar-AE
     *
     * @param languageCode <p>
     *            The language code of the words in the vocabulary filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public VocabularyFilterInfo withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code of the words in the vocabulary filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR, it-IT, ko-KR, es-ES, en-IN, hi-IN, ar-SA, ru-RU, zh-CN, nl-NL,
     * id-ID, ta-IN, fa-IR, en-IE, en-AB, en-WL, pt-PT, te-IN, tr-TR, de-CH,
     * he-IL, ms-MY, ja-JP, ar-AE
     *
     * @param languageCode <p>
     *            The language code of the words in the vocabulary filter.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code of the words in the vocabulary filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR, it-IT, ko-KR, es-ES, en-IN, hi-IN, ar-SA, ru-RU, zh-CN, nl-NL,
     * id-ID, ta-IN, fa-IR, en-IE, en-AB, en-WL, pt-PT, te-IN, tr-TR, de-CH,
     * he-IL, ms-MY, ja-JP, ar-AE
     *
     * @param languageCode <p>
     *            The language code of the words in the vocabulary filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public VocabularyFilterInfo withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the vocabulary was last updated.
     * </p>
     *
     * @return <p>
     *         The date and time that the vocabulary was last updated.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the vocabulary was last updated.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The date and time that the vocabulary was last updated.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the vocabulary was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The date and time that the vocabulary was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VocabularyFilterInfo withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
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
        if (getVocabularyFilterName() != null)
            sb.append("VocabularyFilterName: " + getVocabularyFilterName() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVocabularyFilterName() == null) ? 0 : getVocabularyFilterName().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VocabularyFilterInfo == false)
            return false;
        VocabularyFilterInfo other = (VocabularyFilterInfo) obj;

        if (other.getVocabularyFilterName() == null ^ this.getVocabularyFilterName() == null)
            return false;
        if (other.getVocabularyFilterName() != null
                && other.getVocabularyFilterName().equals(this.getVocabularyFilterName()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }
}
