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

/**
 * <p>
 * Contains metadata describing the lexicon such as the number of lexemes,
 * language code, and so on. For more information, see <a
 * href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html"
 * >Managing Lexicons</a>.
 * </p>
 */
public class LexiconAttributes implements Serializable {
    /**
     * <p>
     * Phonetic alphabet used in the lexicon. Valid values are <code>ipa</code>
     * and <code>x-sampa</code>.
     * </p>
     */
    private String alphabet;

    /**
     * <p>
     * Language code that the lexicon applies to. A lexicon with a language code
     * such as "en" would be applied to all English languages (en-GB, en-US,
     * en-AUS, en-WLS, and so on.
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
     * Date lexicon was last modified (a timestamp value).
     * </p>
     */
    private java.util.Date lastModified;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the lexicon.
     * </p>
     */
    private String lexiconArn;

    /**
     * <p>
     * Number of lexemes in the lexicon.
     * </p>
     */
    private Integer lexemesCount;

    /**
     * <p>
     * Total size of the lexicon, in characters.
     * </p>
     */
    private Integer size;

    /**
     * <p>
     * Phonetic alphabet used in the lexicon. Valid values are <code>ipa</code>
     * and <code>x-sampa</code>.
     * </p>
     *
     * @return <p>
     *         Phonetic alphabet used in the lexicon. Valid values are
     *         <code>ipa</code> and <code>x-sampa</code>.
     *         </p>
     */
    public String getAlphabet() {
        return alphabet;
    }

    /**
     * <p>
     * Phonetic alphabet used in the lexicon. Valid values are <code>ipa</code>
     * and <code>x-sampa</code>.
     * </p>
     *
     * @param alphabet <p>
     *            Phonetic alphabet used in the lexicon. Valid values are
     *            <code>ipa</code> and <code>x-sampa</code>.
     *            </p>
     */
    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }

    /**
     * <p>
     * Phonetic alphabet used in the lexicon. Valid values are <code>ipa</code>
     * and <code>x-sampa</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alphabet <p>
     *            Phonetic alphabet used in the lexicon. Valid values are
     *            <code>ipa</code> and <code>x-sampa</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LexiconAttributes withAlphabet(String alphabet) {
        this.alphabet = alphabet;
        return this;
    }

    /**
     * <p>
     * Language code that the lexicon applies to. A lexicon with a language code
     * such as "en" would be applied to all English languages (en-GB, en-US,
     * en-AUS, en-WLS, and so on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR
     *
     * @return <p>
     *         Language code that the lexicon applies to. A lexicon with a
     *         language code such as "en" would be applied to all English
     *         languages (en-GB, en-US, en-AUS, en-WLS, and so on.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * Language code that the lexicon applies to. A lexicon with a language code
     * such as "en" would be applied to all English languages (en-GB, en-US,
     * en-AUS, en-WLS, and so on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR
     *
     * @param languageCode <p>
     *            Language code that the lexicon applies to. A lexicon with a
     *            language code such as "en" would be applied to all English
     *            languages (en-GB, en-US, en-AUS, en-WLS, and so on.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * Language code that the lexicon applies to. A lexicon with a language code
     * such as "en" would be applied to all English languages (en-GB, en-US,
     * en-AUS, en-WLS, and so on.
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
     *            Language code that the lexicon applies to. A lexicon with a
     *            language code such as "en" would be applied to all English
     *            languages (en-GB, en-US, en-AUS, en-WLS, and so on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public LexiconAttributes withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * Language code that the lexicon applies to. A lexicon with a language code
     * such as "en" would be applied to all English languages (en-GB, en-US,
     * en-AUS, en-WLS, and so on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR
     *
     * @param languageCode <p>
     *            Language code that the lexicon applies to. A lexicon with a
     *            language code such as "en" would be applied to all English
     *            languages (en-GB, en-US, en-AUS, en-WLS, and so on.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * Language code that the lexicon applies to. A lexicon with a language code
     * such as "en" would be applied to all English languages (en-GB, en-US,
     * en-AUS, en-WLS, and so on.
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
     *            Language code that the lexicon applies to. A lexicon with a
     *            language code such as "en" would be applied to all English
     *            languages (en-GB, en-US, en-AUS, en-WLS, and so on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public LexiconAttributes withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Date lexicon was last modified (a timestamp value).
     * </p>
     *
     * @return <p>
     *         Date lexicon was last modified (a timestamp value).
     *         </p>
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }

    /**
     * <p>
     * Date lexicon was last modified (a timestamp value).
     * </p>
     *
     * @param lastModified <p>
     *            Date lexicon was last modified (a timestamp value).
     *            </p>
     */
    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * Date lexicon was last modified (a timestamp value).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModified <p>
     *            Date lexicon was last modified (a timestamp value).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LexiconAttributes withLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the lexicon.
     * </p>
     *
     * @return <p>
     *         Amazon Resource Name (ARN) of the lexicon.
     *         </p>
     */
    public String getLexiconArn() {
        return lexiconArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the lexicon.
     * </p>
     *
     * @param lexiconArn <p>
     *            Amazon Resource Name (ARN) of the lexicon.
     *            </p>
     */
    public void setLexiconArn(String lexiconArn) {
        this.lexiconArn = lexiconArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the lexicon.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lexiconArn <p>
     *            Amazon Resource Name (ARN) of the lexicon.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LexiconAttributes withLexiconArn(String lexiconArn) {
        this.lexiconArn = lexiconArn;
        return this;
    }

    /**
     * <p>
     * Number of lexemes in the lexicon.
     * </p>
     *
     * @return <p>
     *         Number of lexemes in the lexicon.
     *         </p>
     */
    public Integer getLexemesCount() {
        return lexemesCount;
    }

    /**
     * <p>
     * Number of lexemes in the lexicon.
     * </p>
     *
     * @param lexemesCount <p>
     *            Number of lexemes in the lexicon.
     *            </p>
     */
    public void setLexemesCount(Integer lexemesCount) {
        this.lexemesCount = lexemesCount;
    }

    /**
     * <p>
     * Number of lexemes in the lexicon.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lexemesCount <p>
     *            Number of lexemes in the lexicon.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LexiconAttributes withLexemesCount(Integer lexemesCount) {
        this.lexemesCount = lexemesCount;
        return this;
    }

    /**
     * <p>
     * Total size of the lexicon, in characters.
     * </p>
     *
     * @return <p>
     *         Total size of the lexicon, in characters.
     *         </p>
     */
    public Integer getSize() {
        return size;
    }

    /**
     * <p>
     * Total size of the lexicon, in characters.
     * </p>
     *
     * @param size <p>
     *            Total size of the lexicon, in characters.
     *            </p>
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * Total size of the lexicon, in characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param size <p>
     *            Total size of the lexicon, in characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LexiconAttributes withSize(Integer size) {
        this.size = size;
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
        if (getAlphabet() != null)
            sb.append("Alphabet: " + getAlphabet() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getLastModified() != null)
            sb.append("LastModified: " + getLastModified() + ",");
        if (getLexiconArn() != null)
            sb.append("LexiconArn: " + getLexiconArn() + ",");
        if (getLexemesCount() != null)
            sb.append("LexemesCount: " + getLexemesCount() + ",");
        if (getSize() != null)
            sb.append("Size: " + getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlphabet() == null) ? 0 : getAlphabet().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getLexiconArn() == null) ? 0 : getLexiconArn().hashCode());
        hashCode = prime * hashCode
                + ((getLexemesCount() == null) ? 0 : getLexemesCount().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LexiconAttributes == false)
            return false;
        LexiconAttributes other = (LexiconAttributes) obj;

        if (other.getAlphabet() == null ^ this.getAlphabet() == null)
            return false;
        if (other.getAlphabet() != null && other.getAlphabet().equals(this.getAlphabet()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null
                && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getLexiconArn() == null ^ this.getLexiconArn() == null)
            return false;
        if (other.getLexiconArn() != null
                && other.getLexiconArn().equals(this.getLexiconArn()) == false)
            return false;
        if (other.getLexemesCount() == null ^ this.getLexemesCount() == null)
            return false;
        if (other.getLexemesCount() != null
                && other.getLexemesCount().equals(this.getLexemesCount()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }
}
