/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class TranslateTextResult implements Serializable {
    /**
     * <p>
     * The text translated into the target language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String translatedText;

    /**
     * <p>
     * The language code for the language of the input text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     */
    private String sourceLanguageCode;

    /**
     * <p>
     * The language code for the language of the translated text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     */
    private String targetLanguageCode;

    /**
     * <p>
     * The text translated into the target language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The text translated into the target language.
     *         </p>
     */
    public String getTranslatedText() {
        return translatedText;
    }

    /**
     * <p>
     * The text translated into the target language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param translatedText <p>
     *            The text translated into the target language.
     *            </p>
     */
    public void setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
    }

    /**
     * <p>
     * The text translated into the target language.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param translatedText <p>
     *            The text translated into the target language.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateTextResult withTranslatedText(String translatedText) {
        this.translatedText = translatedText;
        return this;
    }

    /**
     * <p>
     * The language code for the language of the input text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @return <p>
     *         The language code for the language of the input text.
     *         </p>
     */
    public String getSourceLanguageCode() {
        return sourceLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the input text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param sourceLanguageCode <p>
     *            The language code for the language of the input text.
     *            </p>
     */
    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the input text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param sourceLanguageCode <p>
     *            The language code for the language of the input text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateTextResult withSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
        return this;
    }

    /**
     * <p>
     * The language code for the language of the translated text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @return <p>
     *         The language code for the language of the translated text.
     *         </p>
     */
    public String getTargetLanguageCode() {
        return targetLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the translated text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param targetLanguageCode <p>
     *            The language code for the language of the translated text.
     *            </p>
     */
    public void setTargetLanguageCode(String targetLanguageCode) {
        this.targetLanguageCode = targetLanguageCode;
    }

    /**
     * <p>
     * The language code for the language of the translated text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param targetLanguageCode <p>
     *            The language code for the language of the translated text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranslateTextResult withTargetLanguageCode(String targetLanguageCode) {
        this.targetLanguageCode = targetLanguageCode;
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
        if (getTranslatedText() != null)
            sb.append("TranslatedText: " + getTranslatedText() + ",");
        if (getSourceLanguageCode() != null)
            sb.append("SourceLanguageCode: " + getSourceLanguageCode() + ",");
        if (getTargetLanguageCode() != null)
            sb.append("TargetLanguageCode: " + getTargetLanguageCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTranslatedText() == null) ? 0 : getTranslatedText().hashCode());
        hashCode = prime * hashCode
                + ((getSourceLanguageCode() == null) ? 0 : getSourceLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getTargetLanguageCode() == null) ? 0 : getTargetLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranslateTextResult == false)
            return false;
        TranslateTextResult other = (TranslateTextResult) obj;

        if (other.getTranslatedText() == null ^ this.getTranslatedText() == null)
            return false;
        if (other.getTranslatedText() != null
                && other.getTranslatedText().equals(this.getTranslatedText()) == false)
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
        return true;
    }
}
