/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class GetLexiconResult implements Serializable {
    /**
     * <p>
     * Lexicon object that provides name and the string content of the lexicon.
     * </p>
     */
    private Lexicon lexicon;

    /**
     * <p>
     * Metadata of the lexicon, including phonetic alphabetic used, language
     * code, lexicon ARN, number of lexemes defined in the lexicon, and size of
     * lexicon in bytes.
     * </p>
     */
    private LexiconAttributes lexiconAttributes;

    /**
     * <p>
     * Lexicon object that provides name and the string content of the lexicon.
     * </p>
     *
     * @return <p>
     *         Lexicon object that provides name and the string content of the
     *         lexicon.
     *         </p>
     */
    public Lexicon getLexicon() {
        return lexicon;
    }

    /**
     * <p>
     * Lexicon object that provides name and the string content of the lexicon.
     * </p>
     *
     * @param lexicon <p>
     *            Lexicon object that provides name and the string content of
     *            the lexicon.
     *            </p>
     */
    public void setLexicon(Lexicon lexicon) {
        this.lexicon = lexicon;
    }

    /**
     * <p>
     * Lexicon object that provides name and the string content of the lexicon.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lexicon <p>
     *            Lexicon object that provides name and the string content of
     *            the lexicon.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLexiconResult withLexicon(Lexicon lexicon) {
        this.lexicon = lexicon;
        return this;
    }

    /**
     * <p>
     * Metadata of the lexicon, including phonetic alphabetic used, language
     * code, lexicon ARN, number of lexemes defined in the lexicon, and size of
     * lexicon in bytes.
     * </p>
     *
     * @return <p>
     *         Metadata of the lexicon, including phonetic alphabetic used,
     *         language code, lexicon ARN, number of lexemes defined in the
     *         lexicon, and size of lexicon in bytes.
     *         </p>
     */
    public LexiconAttributes getLexiconAttributes() {
        return lexiconAttributes;
    }

    /**
     * <p>
     * Metadata of the lexicon, including phonetic alphabetic used, language
     * code, lexicon ARN, number of lexemes defined in the lexicon, and size of
     * lexicon in bytes.
     * </p>
     *
     * @param lexiconAttributes <p>
     *            Metadata of the lexicon, including phonetic alphabetic used,
     *            language code, lexicon ARN, number of lexemes defined in the
     *            lexicon, and size of lexicon in bytes.
     *            </p>
     */
    public void setLexiconAttributes(LexiconAttributes lexiconAttributes) {
        this.lexiconAttributes = lexiconAttributes;
    }

    /**
     * <p>
     * Metadata of the lexicon, including phonetic alphabetic used, language
     * code, lexicon ARN, number of lexemes defined in the lexicon, and size of
     * lexicon in bytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lexiconAttributes <p>
     *            Metadata of the lexicon, including phonetic alphabetic used,
     *            language code, lexicon ARN, number of lexemes defined in the
     *            lexicon, and size of lexicon in bytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLexiconResult withLexiconAttributes(LexiconAttributes lexiconAttributes) {
        this.lexiconAttributes = lexiconAttributes;
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
        if (getLexicon() != null)
            sb.append("Lexicon: " + getLexicon() + ",");
        if (getLexiconAttributes() != null)
            sb.append("LexiconAttributes: " + getLexiconAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLexicon() == null) ? 0 : getLexicon().hashCode());
        hashCode = prime * hashCode
                + ((getLexiconAttributes() == null) ? 0 : getLexiconAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLexiconResult == false)
            return false;
        GetLexiconResult other = (GetLexiconResult) obj;

        if (other.getLexicon() == null ^ this.getLexicon() == null)
            return false;
        if (other.getLexicon() != null && other.getLexicon().equals(this.getLexicon()) == false)
            return false;
        if (other.getLexiconAttributes() == null ^ this.getLexiconAttributes() == null)
            return false;
        if (other.getLexiconAttributes() != null
                && other.getLexiconAttributes().equals(this.getLexiconAttributes()) == false)
            return false;
        return true;
    }
}
