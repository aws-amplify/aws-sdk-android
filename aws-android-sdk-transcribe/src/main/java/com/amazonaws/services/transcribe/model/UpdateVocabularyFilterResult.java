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

public class UpdateVocabularyFilterResult implements Serializable {
    /**
     * <p>
     * The name of the updated custom vocabulary filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyFilterName;

    /**
     * <p>
     * The language code you selected for your custom vocabulary filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE, ab-GE, ast-ES, az-AZ, ba-RU, be-BY, bg-BG, bn-IN, bs-BA,
     * ca-ES, ckb-IQ, ckb-IR, cs-CZ, cy-WL, el-GR, et-ET, eu-ES, fi-FI, gl-ES,
     * gu-IN, ha-NG, hr-HR, hu-HU, hy-AM, is-IS, ka-GE, kab-DZ, kk-KZ, kn-IN,
     * ky-KG, lg-IN, lt-LT, lv-LV, mhr-RU, mi-NZ, mk-MK, ml-IN, mn-MN, mr-IN,
     * mt-MT, no-NO, or-IN, pa-IN, pl-PL, ps-AF, ro-RO, rw-RW, si-LK, sk-SK,
     * sl-SI, so-SO, sr-RS, su-ID, sw-BI, sw-KE, sw-RW, sw-TZ, sw-UG, tl-PH,
     * tt-RU, ug-CN, uk-UA, uz-UZ, wo-SN, zu-ZA
     */
    private String languageCode;

    /**
     * <p>
     * The date and time the specified custom vocabulary filter was last
     * updated.
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
     * The name of the updated custom vocabulary filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the updated custom vocabulary filter.
     *         </p>
     */
    public String getVocabularyFilterName() {
        return vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the updated custom vocabulary filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyFilterName <p>
     *            The name of the updated custom vocabulary filter.
     *            </p>
     */
    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the updated custom vocabulary filter.
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
     *            The name of the updated custom vocabulary filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVocabularyFilterResult withVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
        return this;
    }

    /**
     * <p>
     * The language code you selected for your custom vocabulary filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE, ab-GE, ast-ES, az-AZ, ba-RU, be-BY, bg-BG, bn-IN, bs-BA,
     * ca-ES, ckb-IQ, ckb-IR, cs-CZ, cy-WL, el-GR, et-ET, eu-ES, fi-FI, gl-ES,
     * gu-IN, ha-NG, hr-HR, hu-HU, hy-AM, is-IS, ka-GE, kab-DZ, kk-KZ, kn-IN,
     * ky-KG, lg-IN, lt-LT, lv-LV, mhr-RU, mi-NZ, mk-MK, ml-IN, mn-MN, mr-IN,
     * mt-MT, no-NO, or-IN, pa-IN, pl-PL, ps-AF, ro-RO, rw-RW, si-LK, sk-SK,
     * sl-SI, so-SO, sr-RS, su-ID, sw-BI, sw-KE, sw-RW, sw-TZ, sw-UG, tl-PH,
     * tt-RU, ug-CN, uk-UA, uz-UZ, wo-SN, zu-ZA
     *
     * @return <p>
     *         The language code you selected for your custom vocabulary filter.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code you selected for your custom vocabulary filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE, ab-GE, ast-ES, az-AZ, ba-RU, be-BY, bg-BG, bn-IN, bs-BA,
     * ca-ES, ckb-IQ, ckb-IR, cs-CZ, cy-WL, el-GR, et-ET, eu-ES, fi-FI, gl-ES,
     * gu-IN, ha-NG, hr-HR, hu-HU, hy-AM, is-IS, ka-GE, kab-DZ, kk-KZ, kn-IN,
     * ky-KG, lg-IN, lt-LT, lv-LV, mhr-RU, mi-NZ, mk-MK, ml-IN, mn-MN, mr-IN,
     * mt-MT, no-NO, or-IN, pa-IN, pl-PL, ps-AF, ro-RO, rw-RW, si-LK, sk-SK,
     * sl-SI, so-SO, sr-RS, su-ID, sw-BI, sw-KE, sw-RW, sw-TZ, sw-UG, tl-PH,
     * tt-RU, ug-CN, uk-UA, uz-UZ, wo-SN, zu-ZA
     *
     * @param languageCode <p>
     *            The language code you selected for your custom vocabulary
     *            filter.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code you selected for your custom vocabulary filter.
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
     * vi-VN, sv-SE, ab-GE, ast-ES, az-AZ, ba-RU, be-BY, bg-BG, bn-IN, bs-BA,
     * ca-ES, ckb-IQ, ckb-IR, cs-CZ, cy-WL, el-GR, et-ET, eu-ES, fi-FI, gl-ES,
     * gu-IN, ha-NG, hr-HR, hu-HU, hy-AM, is-IS, ka-GE, kab-DZ, kk-KZ, kn-IN,
     * ky-KG, lg-IN, lt-LT, lv-LV, mhr-RU, mi-NZ, mk-MK, ml-IN, mn-MN, mr-IN,
     * mt-MT, no-NO, or-IN, pa-IN, pl-PL, ps-AF, ro-RO, rw-RW, si-LK, sk-SK,
     * sl-SI, so-SO, sr-RS, su-ID, sw-BI, sw-KE, sw-RW, sw-TZ, sw-UG, tl-PH,
     * tt-RU, ug-CN, uk-UA, uz-UZ, wo-SN, zu-ZA
     *
     * @param languageCode <p>
     *            The language code you selected for your custom vocabulary
     *            filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public UpdateVocabularyFilterResult withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code you selected for your custom vocabulary filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE, ab-GE, ast-ES, az-AZ, ba-RU, be-BY, bg-BG, bn-IN, bs-BA,
     * ca-ES, ckb-IQ, ckb-IR, cs-CZ, cy-WL, el-GR, et-ET, eu-ES, fi-FI, gl-ES,
     * gu-IN, ha-NG, hr-HR, hu-HU, hy-AM, is-IS, ka-GE, kab-DZ, kk-KZ, kn-IN,
     * ky-KG, lg-IN, lt-LT, lv-LV, mhr-RU, mi-NZ, mk-MK, ml-IN, mn-MN, mr-IN,
     * mt-MT, no-NO, or-IN, pa-IN, pl-PL, ps-AF, ro-RO, rw-RW, si-LK, sk-SK,
     * sl-SI, so-SO, sr-RS, su-ID, sw-BI, sw-KE, sw-RW, sw-TZ, sw-UG, tl-PH,
     * tt-RU, ug-CN, uk-UA, uz-UZ, wo-SN, zu-ZA
     *
     * @param languageCode <p>
     *            The language code you selected for your custom vocabulary
     *            filter.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code you selected for your custom vocabulary filter.
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
     * vi-VN, sv-SE, ab-GE, ast-ES, az-AZ, ba-RU, be-BY, bg-BG, bn-IN, bs-BA,
     * ca-ES, ckb-IQ, ckb-IR, cs-CZ, cy-WL, el-GR, et-ET, eu-ES, fi-FI, gl-ES,
     * gu-IN, ha-NG, hr-HR, hu-HU, hy-AM, is-IS, ka-GE, kab-DZ, kk-KZ, kn-IN,
     * ky-KG, lg-IN, lt-LT, lv-LV, mhr-RU, mi-NZ, mk-MK, ml-IN, mn-MN, mr-IN,
     * mt-MT, no-NO, or-IN, pa-IN, pl-PL, ps-AF, ro-RO, rw-RW, si-LK, sk-SK,
     * sl-SI, so-SO, sr-RS, su-ID, sw-BI, sw-KE, sw-RW, sw-TZ, sw-UG, tl-PH,
     * tt-RU, ug-CN, uk-UA, uz-UZ, wo-SN, zu-ZA
     *
     * @param languageCode <p>
     *            The language code you selected for your custom vocabulary
     *            filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public UpdateVocabularyFilterResult withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the specified custom vocabulary filter was last
     * updated.
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
     *         updated.
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
     * updated.
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
     *            last updated.
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
     * updated.
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
     *            last updated.
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
    public UpdateVocabularyFilterResult withLastModifiedTime(java.util.Date lastModifiedTime) {
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

        if (obj instanceof UpdateVocabularyFilterResult == false)
            return false;
        UpdateVocabularyFilterResult other = (UpdateVocabularyFilterResult) obj;

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
