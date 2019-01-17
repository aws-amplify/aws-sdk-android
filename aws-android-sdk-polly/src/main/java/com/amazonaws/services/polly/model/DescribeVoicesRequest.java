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

package com.amazonaws.services.polly.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the list of voices that are available for use when requesting speech
 * synthesis. Each voice speaks a specified language, is either male or female,
 * and is identified by an ID, which is the ASCII version of the voice name.
 * </p>
 * <p>
 * When synthesizing speech ( <code>SynthesizeSpeech</code> ), you provide the
 * voice ID for the voice you want from the list of voices returned by
 * <code>DescribeVoices</code>.
 * </p>
 * <p>
 * For example, you want your news reader application to read news in a specific
 * language, but giving a user the option to choose the voice. Using the
 * <code>DescribeVoices</code> operation you can provide the user with a list of
 * available voices to select from.
 * </p>
 * <p>
 * You can optionally specify a language code to filter the available voices.
 * For example, if you specify <code>en-US</code>, the operation returns a list
 * of all available US English voices.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>polly:DescribeVoices</code> action.
 * </p>
 */
public class DescribeVoicesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The language identification tag (ISO 639 code for the language name-ISO
     * 3166 country code) for filtering the list of voices returned. If you
     * don't specify this optional parameter, all available voices are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR
     */
    private String languageCode;

    /**
     * <p>
     * Boolean value indicating whether to return any bilingual voices that use
     * the specified language as an additional language. For instance, if you
     * request all languages that use US English (es-US), and there is an
     * Italian voice that speaks both Italian (it-IT) and US English, that voice
     * will be included if you specify <code>yes</code> but not if you specify
     * <code>no</code>.
     * </p>
     */
    private Boolean includeAdditionalLanguageCodes;

    /**
     * <p>
     * An opaque pagination token returned from the previous
     * <code>DescribeVoices</code> operation. If present, this indicates where
     * to continue the listing.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The language identification tag (ISO 639 code for the language name-ISO
     * 3166 country code) for filtering the list of voices returned. If you
     * don't specify this optional parameter, all available voices are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR
     *
     * @return <p>
     *         The language identification tag (ISO 639 code for the language
     *         name-ISO 3166 country code) for filtering the list of voices
     *         returned. If you don't specify this optional parameter, all
     *         available voices are returned.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language identification tag (ISO 639 code for the language name-ISO
     * 3166 country code) for filtering the list of voices returned. If you
     * don't specify this optional parameter, all available voices are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR
     *
     * @param languageCode <p>
     *            The language identification tag (ISO 639 code for the language
     *            name-ISO 3166 country code) for filtering the list of voices
     *            returned. If you don't specify this optional parameter, all
     *            available voices are returned.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language identification tag (ISO 639 code for the language name-ISO
     * 3166 country code) for filtering the list of voices returned. If you
     * don't specify this optional parameter, all available voices are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR
     *
     * @param languageCode <p>
     *            The language identification tag (ISO 639 code for the language
     *            name-ISO 3166 country code) for filtering the list of voices
     *            returned. If you don't specify this optional parameter, all
     *            available voices are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public DescribeVoicesRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language identification tag (ISO 639 code for the language name-ISO
     * 3166 country code) for filtering the list of voices returned. If you
     * don't specify this optional parameter, all available voices are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR
     *
     * @param languageCode <p>
     *            The language identification tag (ISO 639 code for the language
     *            name-ISO 3166 country code) for filtering the list of voices
     *            returned. If you don't specify this optional parameter, all
     *            available voices are returned.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language identification tag (ISO 639 code for the language name-ISO
     * 3166 country code) for filtering the list of voices returned. If you
     * don't specify this optional parameter, all available voices are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR
     *
     * @param languageCode <p>
     *            The language identification tag (ISO 639 code for the language
     *            name-ISO 3166 country code) for filtering the list of voices
     *            returned. If you don't specify this optional parameter, all
     *            available voices are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public DescribeVoicesRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Boolean value indicating whether to return any bilingual voices that use
     * the specified language as an additional language. For instance, if you
     * request all languages that use US English (es-US), and there is an
     * Italian voice that speaks both Italian (it-IT) and US English, that voice
     * will be included if you specify <code>yes</code> but not if you specify
     * <code>no</code>.
     * </p>
     *
     * @return <p>
     *         Boolean value indicating whether to return any bilingual voices
     *         that use the specified language as an additional language. For
     *         instance, if you request all languages that use US English
     *         (es-US), and there is an Italian voice that speaks both Italian
     *         (it-IT) and US English, that voice will be included if you
     *         specify <code>yes</code> but not if you specify <code>no</code>.
     *         </p>
     */
    public Boolean isIncludeAdditionalLanguageCodes() {
        return includeAdditionalLanguageCodes;
    }

    /**
     * <p>
     * Boolean value indicating whether to return any bilingual voices that use
     * the specified language as an additional language. For instance, if you
     * request all languages that use US English (es-US), and there is an
     * Italian voice that speaks both Italian (it-IT) and US English, that voice
     * will be included if you specify <code>yes</code> but not if you specify
     * <code>no</code>.
     * </p>
     *
     * @return <p>
     *         Boolean value indicating whether to return any bilingual voices
     *         that use the specified language as an additional language. For
     *         instance, if you request all languages that use US English
     *         (es-US), and there is an Italian voice that speaks both Italian
     *         (it-IT) and US English, that voice will be included if you
     *         specify <code>yes</code> but not if you specify <code>no</code>.
     *         </p>
     */
    public Boolean getIncludeAdditionalLanguageCodes() {
        return includeAdditionalLanguageCodes;
    }

    /**
     * <p>
     * Boolean value indicating whether to return any bilingual voices that use
     * the specified language as an additional language. For instance, if you
     * request all languages that use US English (es-US), and there is an
     * Italian voice that speaks both Italian (it-IT) and US English, that voice
     * will be included if you specify <code>yes</code> but not if you specify
     * <code>no</code>.
     * </p>
     *
     * @param includeAdditionalLanguageCodes <p>
     *            Boolean value indicating whether to return any bilingual
     *            voices that use the specified language as an additional
     *            language. For instance, if you request all languages that use
     *            US English (es-US), and there is an Italian voice that speaks
     *            both Italian (it-IT) and US English, that voice will be
     *            included if you specify <code>yes</code> but not if you
     *            specify <code>no</code>.
     *            </p>
     */
    public void setIncludeAdditionalLanguageCodes(Boolean includeAdditionalLanguageCodes) {
        this.includeAdditionalLanguageCodes = includeAdditionalLanguageCodes;
    }

    /**
     * <p>
     * Boolean value indicating whether to return any bilingual voices that use
     * the specified language as an additional language. For instance, if you
     * request all languages that use US English (es-US), and there is an
     * Italian voice that speaks both Italian (it-IT) and US English, that voice
     * will be included if you specify <code>yes</code> but not if you specify
     * <code>no</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeAdditionalLanguageCodes <p>
     *            Boolean value indicating whether to return any bilingual
     *            voices that use the specified language as an additional
     *            language. For instance, if you request all languages that use
     *            US English (es-US), and there is an Italian voice that speaks
     *            both Italian (it-IT) and US English, that voice will be
     *            included if you specify <code>yes</code> but not if you
     *            specify <code>no</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVoicesRequest withIncludeAdditionalLanguageCodes(
            Boolean includeAdditionalLanguageCodes) {
        this.includeAdditionalLanguageCodes = includeAdditionalLanguageCodes;
        return this;
    }

    /**
     * <p>
     * An opaque pagination token returned from the previous
     * <code>DescribeVoices</code> operation. If present, this indicates where
     * to continue the listing.
     * </p>
     *
     * @return <p>
     *         An opaque pagination token returned from the previous
     *         <code>DescribeVoices</code> operation. If present, this indicates
     *         where to continue the listing.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An opaque pagination token returned from the previous
     * <code>DescribeVoices</code> operation. If present, this indicates where
     * to continue the listing.
     * </p>
     *
     * @param nextToken <p>
     *            An opaque pagination token returned from the previous
     *            <code>DescribeVoices</code> operation. If present, this
     *            indicates where to continue the listing.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token returned from the previous
     * <code>DescribeVoices</code> operation. If present, this indicates where
     * to continue the listing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An opaque pagination token returned from the previous
     *            <code>DescribeVoices</code> operation. If present, this
     *            indicates where to continue the listing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVoicesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getIncludeAdditionalLanguageCodes() != null)
            sb.append("IncludeAdditionalLanguageCodes: " + getIncludeAdditionalLanguageCodes()
                    + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludeAdditionalLanguageCodes() == null) ? 0
                        : getIncludeAdditionalLanguageCodes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVoicesRequest == false)
            return false;
        DescribeVoicesRequest other = (DescribeVoicesRequest) obj;

        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getIncludeAdditionalLanguageCodes() == null
                ^ this.getIncludeAdditionalLanguageCodes() == null)
            return false;
        if (other.getIncludeAdditionalLanguageCodes() != null
                && other.getIncludeAdditionalLanguageCodes().equals(
                        this.getIncludeAdditionalLanguageCodes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
