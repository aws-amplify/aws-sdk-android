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
 * Provides information on the speech contained in a discreet utterance when
 * multi-language identification is enabled in your request. This utterance
 * represents a block of speech consisting of one language, preceded or followed
 * by a block of speech in a different language.
 * </p>
 */
public class LanguageCodeItem implements Serializable {
    /**
     * <p>
     * Provides the language code for each language identified in your media.
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
     * Provides the total time, in seconds, each identified language is spoken
     * in your media.
     * </p>
     */
    private Float durationInSeconds;

    /**
     * <p>
     * Provides the language code for each language identified in your media.
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
     *         Provides the language code for each language identified in your
     *         media.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * Provides the language code for each language identified in your media.
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
     *            Provides the language code for each language identified in
     *            your media.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * Provides the language code for each language identified in your media.
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
     *            Provides the language code for each language identified in
     *            your media.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public LanguageCodeItem withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * Provides the language code for each language identified in your media.
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
     *            Provides the language code for each language identified in
     *            your media.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * Provides the language code for each language identified in your media.
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
     *            Provides the language code for each language identified in
     *            your media.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public LanguageCodeItem withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Provides the total time, in seconds, each identified language is spoken
     * in your media.
     * </p>
     *
     * @return <p>
     *         Provides the total time, in seconds, each identified language is
     *         spoken in your media.
     *         </p>
     */
    public Float getDurationInSeconds() {
        return durationInSeconds;
    }

    /**
     * <p>
     * Provides the total time, in seconds, each identified language is spoken
     * in your media.
     * </p>
     *
     * @param durationInSeconds <p>
     *            Provides the total time, in seconds, each identified language
     *            is spoken in your media.
     *            </p>
     */
    public void setDurationInSeconds(Float durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * Provides the total time, in seconds, each identified language is spoken
     * in your media.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param durationInSeconds <p>
     *            Provides the total time, in seconds, each identified language
     *            is spoken in your media.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LanguageCodeItem withDurationInSeconds(Float durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: " + getDurationInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getDurationInSeconds() == null) ? 0 : getDurationInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LanguageCodeItem == false)
            return false;
        LanguageCodeItem other = (LanguageCodeItem) obj;

        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getDurationInSeconds() == null ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null
                && other.getDurationInSeconds().equals(this.getDurationInSeconds()) == false)
            return false;
        return true;
    }
}
