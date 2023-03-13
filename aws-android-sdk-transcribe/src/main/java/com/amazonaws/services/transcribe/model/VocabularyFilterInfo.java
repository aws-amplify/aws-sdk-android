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
 * Provides information about a custom vocabulary filter, including the language
 * of the filter, when it was last modified, and its name.
 * </p>
 */
public class VocabularyFilterInfo implements Serializable {
    /**
     * <p>
     * A unique name, chosen by you, for your custom vocabulary filter. This
     * name is case sensitive, cannot contain spaces, and must be unique within
     * an Amazon Web Services account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyFilterName;

    /**
     * <p>
     * The language code that represents the language of the entries in your
     * vocabulary filter. Each custom vocabulary filter must contain terms in
     * only one language.
     * </p>
     * <p>
     * A custom vocabulary filter can only be used to transcribe files in the
     * same language as the filter. For example, if you create a custom
     * vocabulary filter using US English (<code>en-US</code>), you can only
     * apply this filter to files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes,
     * refer to the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE
     */
    private String languageCode;

    /**
     * <p>
     * The date and time the specified custom vocabulary filter was last
     * modified.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7
     * on May 4, 2022.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * A unique name, chosen by you, for your custom vocabulary filter. This
     * name is case sensitive, cannot contain spaces, and must be unique within
     * an Amazon Web Services account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         A unique name, chosen by you, for your custom vocabulary filter.
     *         This name is case sensitive, cannot contain spaces, and must be
     *         unique within an Amazon Web Services account.
     *         </p>
     */
    public String getVocabularyFilterName() {
        return vocabularyFilterName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your custom vocabulary filter. This
     * name is case sensitive, cannot contain spaces, and must be unique within
     * an Amazon Web Services account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyFilterName <p>
     *            A unique name, chosen by you, for your custom vocabulary
     *            filter. This name is case sensitive, cannot contain spaces,
     *            and must be unique within an Amazon Web Services account.
     *            </p>
     */
    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your custom vocabulary filter. This
     * name is case sensitive, cannot contain spaces, and must be unique within
     * an Amazon Web Services account.
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
     *            A unique name, chosen by you, for your custom vocabulary
     *            filter. This name is case sensitive, cannot contain spaces,
     *            and must be unique within an Amazon Web Services account.
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
     * The language code that represents the language of the entries in your
     * vocabulary filter. Each custom vocabulary filter must contain terms in
     * only one language.
     * </p>
     * <p>
     * A custom vocabulary filter can only be used to transcribe files in the
     * same language as the filter. For example, if you create a custom
     * vocabulary filter using US English (<code>en-US</code>), you can only
     * apply this filter to files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes,
     * refer to the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE
     *
     * @return <p>
     *         The language code that represents the language of the entries in
     *         your vocabulary filter. Each custom vocabulary filter must
     *         contain terms in only one language.
     *         </p>
     *         <p>
     *         A custom vocabulary filter can only be used to transcribe files
     *         in the same language as the filter. For example, if you create a
     *         custom vocabulary filter using US English (<code>en-US</code>),
     *         you can only apply this filter to files that contain English
     *         audio.
     *         </p>
     *         <p>
     *         For a list of supported languages and their associated language
     *         codes, refer to the <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *         >Supported languages</a> table.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your
     * vocabulary filter. Each custom vocabulary filter must contain terms in
     * only one language.
     * </p>
     * <p>
     * A custom vocabulary filter can only be used to transcribe files in the
     * same language as the filter. For example, if you create a custom
     * vocabulary filter using US English (<code>en-US</code>), you can only
     * apply this filter to files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes,
     * refer to the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE
     *
     * @param languageCode <p>
     *            The language code that represents the language of the entries
     *            in your vocabulary filter. Each custom vocabulary filter must
     *            contain terms in only one language.
     *            </p>
     *            <p>
     *            A custom vocabulary filter can only be used to transcribe
     *            files in the same language as the filter. For example, if you
     *            create a custom vocabulary filter using US English (
     *            <code>en-US</code>), you can only apply this filter to files
     *            that contain English audio.
     *            </p>
     *            <p>
     *            For a list of supported languages and their associated
     *            language codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your
     * vocabulary filter. Each custom vocabulary filter must contain terms in
     * only one language.
     * </p>
     * <p>
     * A custom vocabulary filter can only be used to transcribe files in the
     * same language as the filter. For example, if you create a custom
     * vocabulary filter using US English (<code>en-US</code>), you can only
     * apply this filter to files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes,
     * refer to the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE
     *
     * @param languageCode <p>
     *            The language code that represents the language of the entries
     *            in your vocabulary filter. Each custom vocabulary filter must
     *            contain terms in only one language.
     *            </p>
     *            <p>
     *            A custom vocabulary filter can only be used to transcribe
     *            files in the same language as the filter. For example, if you
     *            create a custom vocabulary filter using US English (
     *            <code>en-US</code>), you can only apply this filter to files
     *            that contain English audio.
     *            </p>
     *            <p>
     *            For a list of supported languages and their associated
     *            language codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
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
     * The language code that represents the language of the entries in your
     * vocabulary filter. Each custom vocabulary filter must contain terms in
     * only one language.
     * </p>
     * <p>
     * A custom vocabulary filter can only be used to transcribe files in the
     * same language as the filter. For example, if you create a custom
     * vocabulary filter using US English (<code>en-US</code>), you can only
     * apply this filter to files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes,
     * refer to the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE
     *
     * @param languageCode <p>
     *            The language code that represents the language of the entries
     *            in your vocabulary filter. Each custom vocabulary filter must
     *            contain terms in only one language.
     *            </p>
     *            <p>
     *            A custom vocabulary filter can only be used to transcribe
     *            files in the same language as the filter. For example, if you
     *            create a custom vocabulary filter using US English (
     *            <code>en-US</code>), you can only apply this filter to files
     *            that contain English audio.
     *            </p>
     *            <p>
     *            For a list of supported languages and their associated
     *            language codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your
     * vocabulary filter. Each custom vocabulary filter must contain terms in
     * only one language.
     * </p>
     * <p>
     * A custom vocabulary filter can only be used to transcribe files in the
     * same language as the filter. For example, if you create a custom
     * vocabulary filter using US English (<code>en-US</code>), you can only
     * apply this filter to files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes,
     * refer to the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE
     *
     * @param languageCode <p>
     *            The language code that represents the language of the entries
     *            in your vocabulary filter. Each custom vocabulary filter must
     *            contain terms in only one language.
     *            </p>
     *            <p>
     *            A custom vocabulary filter can only be used to transcribe
     *            files in the same language as the filter. For example, if you
     *            create a custom vocabulary filter using US English (
     *            <code>en-US</code>), you can only apply this filter to files
     *            that contain English audio.
     *            </p>
     *            <p>
     *            For a list of supported languages and their associated
     *            language codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
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
     * The date and time the specified custom vocabulary filter was last
     * modified.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7
     * on May 4, 2022.
     * </p>
     *
     * @return <p>
     *         The date and time the specified custom vocabulary filter was last
     *         modified.
     *         </p>
     *         <p>
     *         Timestamps are in the format
     *         <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM
     *         UTC-7 on May 4, 2022.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the specified custom vocabulary filter was last
     * modified.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7
     * on May 4, 2022.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The date and time the specified custom vocabulary filter was
     *            last modified.
     *            </p>
     *            <p>
     *            Timestamps are in the format
     *            <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *            <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32
     *            PM UTC-7 on May 4, 2022.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the specified custom vocabulary filter was last
     * modified.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7
     * on May 4, 2022.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The date and time the specified custom vocabulary filter was
     *            last modified.
     *            </p>
     *            <p>
     *            Timestamps are in the format
     *            <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *            <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32
     *            PM UTC-7 on May 4, 2022.
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
