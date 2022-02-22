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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

/**
 * <p>
 * Settings that configure the translation output.
 * </p>
 */
public class TranslationSettings implements Serializable {
    /**
     * The new value for the formality property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORMAL, INFORMAL
     */
    private String formality;

    /**
     * <p>
     * Enable the profanity setting if you want Amazon Translate to mask profane
     * words and phrases in your translation output.
     * </p>
     * <p>
     * To mask profane words and phrases, Amazon Translate replaces them with
     * the grawlix string “?$#@$“. This 5-character sequence is used for each
     * profane word or phrase, regardless of the length or number of words.
     * </p>
     * <p>
     * Amazon Translate does not detect profanity in all of its supported
     * languages. For languages that support profanity detection, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages"
     * >Supported Languages and Language Codes in the Amazon Translate Developer
     * Guide</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASK
     */
    private String profanity;

    /**
     * Returns the value of the formality property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORMAL, INFORMAL
     *
     * @return The value of the formality property for this object.
     * @see Formality
     */
    public String getFormality() {
        return formality;
    }

    /**
     * Sets the value of formality
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORMAL, INFORMAL
     *
     * @param formality The new value for the formality property for this
     *            object.
     * @see Formality
     */
    public void setFormality(String formality) {
        this.formality = formality;
    }

    /**
     * Sets the value of the formality property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORMAL, INFORMAL
     *
     * @param formality The new value for the formality property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Formality
     */
    public TranslationSettings withFormality(String formality) {
        this.formality = formality;
        return this;
    }

    /**
     * Sets the value of formality
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORMAL, INFORMAL
     *
     * @param formality The new value for the formality property for this
     *            object.
     * @see Formality
     */
    public void setFormality(Formality formality) {
        this.formality = formality.toString();
    }

    /**
     * Sets the value of the formality property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORMAL, INFORMAL
     *
     * @param formality The new value for the formality property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Formality
     */
    public TranslationSettings withFormality(Formality formality) {
        this.formality = formality.toString();
        return this;
    }

    /**
     * <p>
     * Enable the profanity setting if you want Amazon Translate to mask profane
     * words and phrases in your translation output.
     * </p>
     * <p>
     * To mask profane words and phrases, Amazon Translate replaces them with
     * the grawlix string “?$#@$“. This 5-character sequence is used for each
     * profane word or phrase, regardless of the length or number of words.
     * </p>
     * <p>
     * Amazon Translate does not detect profanity in all of its supported
     * languages. For languages that support profanity detection, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages"
     * >Supported Languages and Language Codes in the Amazon Translate Developer
     * Guide</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASK
     *
     * @return <p>
     *         Enable the profanity setting if you want Amazon Translate to mask
     *         profane words and phrases in your translation output.
     *         </p>
     *         <p>
     *         To mask profane words and phrases, Amazon Translate replaces them
     *         with the grawlix string “?$#@$“. This 5-character sequence is
     *         used for each profane word or phrase, regardless of the length or
     *         number of words.
     *         </p>
     *         <p>
     *         Amazon Translate does not detect profanity in all of its
     *         supported languages. For languages that support profanity
     *         detection, see <a href=
     *         "https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages"
     *         >Supported Languages and Language Codes in the Amazon Translate
     *         Developer Guide</a>.
     *         </p>
     * @see Profanity
     */
    public String getProfanity() {
        return profanity;
    }

    /**
     * <p>
     * Enable the profanity setting if you want Amazon Translate to mask profane
     * words and phrases in your translation output.
     * </p>
     * <p>
     * To mask profane words and phrases, Amazon Translate replaces them with
     * the grawlix string “?$#@$“. This 5-character sequence is used for each
     * profane word or phrase, regardless of the length or number of words.
     * </p>
     * <p>
     * Amazon Translate does not detect profanity in all of its supported
     * languages. For languages that support profanity detection, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages"
     * >Supported Languages and Language Codes in the Amazon Translate Developer
     * Guide</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASK
     *
     * @param profanity <p>
     *            Enable the profanity setting if you want Amazon Translate to
     *            mask profane words and phrases in your translation output.
     *            </p>
     *            <p>
     *            To mask profane words and phrases, Amazon Translate replaces
     *            them with the grawlix string “?$#@$“. This 5-character
     *            sequence is used for each profane word or phrase, regardless
     *            of the length or number of words.
     *            </p>
     *            <p>
     *            Amazon Translate does not detect profanity in all of its
     *            supported languages. For languages that support profanity
     *            detection, see <a href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages"
     *            >Supported Languages and Language Codes in the Amazon
     *            Translate Developer Guide</a>.
     *            </p>
     * @see Profanity
     */
    public void setProfanity(String profanity) {
        this.profanity = profanity;
    }

    /**
     * <p>
     * Enable the profanity setting if you want Amazon Translate to mask profane
     * words and phrases in your translation output.
     * </p>
     * <p>
     * To mask profane words and phrases, Amazon Translate replaces them with
     * the grawlix string “?$#@$“. This 5-character sequence is used for each
     * profane word or phrase, regardless of the length or number of words.
     * </p>
     * <p>
     * Amazon Translate does not detect profanity in all of its supported
     * languages. For languages that support profanity detection, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages"
     * >Supported Languages and Language Codes in the Amazon Translate Developer
     * Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASK
     *
     * @param profanity <p>
     *            Enable the profanity setting if you want Amazon Translate to
     *            mask profane words and phrases in your translation output.
     *            </p>
     *            <p>
     *            To mask profane words and phrases, Amazon Translate replaces
     *            them with the grawlix string “?$#@$“. This 5-character
     *            sequence is used for each profane word or phrase, regardless
     *            of the length or number of words.
     *            </p>
     *            <p>
     *            Amazon Translate does not detect profanity in all of its
     *            supported languages. For languages that support profanity
     *            detection, see <a href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages"
     *            >Supported Languages and Language Codes in the Amazon
     *            Translate Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Profanity
     */
    public TranslationSettings withProfanity(String profanity) {
        this.profanity = profanity;
        return this;
    }

    /**
     * <p>
     * Enable the profanity setting if you want Amazon Translate to mask profane
     * words and phrases in your translation output.
     * </p>
     * <p>
     * To mask profane words and phrases, Amazon Translate replaces them with
     * the grawlix string “?$#@$“. This 5-character sequence is used for each
     * profane word or phrase, regardless of the length or number of words.
     * </p>
     * <p>
     * Amazon Translate does not detect profanity in all of its supported
     * languages. For languages that support profanity detection, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages"
     * >Supported Languages and Language Codes in the Amazon Translate Developer
     * Guide</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASK
     *
     * @param profanity <p>
     *            Enable the profanity setting if you want Amazon Translate to
     *            mask profane words and phrases in your translation output.
     *            </p>
     *            <p>
     *            To mask profane words and phrases, Amazon Translate replaces
     *            them with the grawlix string “?$#@$“. This 5-character
     *            sequence is used for each profane word or phrase, regardless
     *            of the length or number of words.
     *            </p>
     *            <p>
     *            Amazon Translate does not detect profanity in all of its
     *            supported languages. For languages that support profanity
     *            detection, see <a href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages"
     *            >Supported Languages and Language Codes in the Amazon
     *            Translate Developer Guide</a>.
     *            </p>
     * @see Profanity
     */
    public void setProfanity(Profanity profanity) {
        this.profanity = profanity.toString();
    }

    /**
     * <p>
     * Enable the profanity setting if you want Amazon Translate to mask profane
     * words and phrases in your translation output.
     * </p>
     * <p>
     * To mask profane words and phrases, Amazon Translate replaces them with
     * the grawlix string “?$#@$“. This 5-character sequence is used for each
     * profane word or phrase, regardless of the length or number of words.
     * </p>
     * <p>
     * Amazon Translate does not detect profanity in all of its supported
     * languages. For languages that support profanity detection, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages"
     * >Supported Languages and Language Codes in the Amazon Translate Developer
     * Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASK
     *
     * @param profanity <p>
     *            Enable the profanity setting if you want Amazon Translate to
     *            mask profane words and phrases in your translation output.
     *            </p>
     *            <p>
     *            To mask profane words and phrases, Amazon Translate replaces
     *            them with the grawlix string “?$#@$“. This 5-character
     *            sequence is used for each profane word or phrase, regardless
     *            of the length or number of words.
     *            </p>
     *            <p>
     *            Amazon Translate does not detect profanity in all of its
     *            supported languages. For languages that support profanity
     *            detection, see <a href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/what-is.html#what-is-languages"
     *            >Supported Languages and Language Codes in the Amazon
     *            Translate Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Profanity
     */
    public TranslationSettings withProfanity(Profanity profanity) {
        this.profanity = profanity.toString();
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
        if (getFormality() != null)
            sb.append("Formality: " + getFormality() + ",");
        if (getProfanity() != null)
            sb.append("Profanity: " + getProfanity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormality() == null) ? 0 : getFormality().hashCode());
        hashCode = prime * hashCode + ((getProfanity() == null) ? 0 : getProfanity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranslationSettings == false)
            return false;
        TranslationSettings other = (TranslationSettings) obj;

        if (other.getFormality() == null ^ this.getFormality() == null)
            return false;
        if (other.getFormality() != null
                && other.getFormality().equals(this.getFormality()) == false)
            return false;
        if (other.getProfanity() == null ^ this.getProfanity() == null)
            return false;
        if (other.getProfanity() != null
                && other.getProfanity().equals(this.getProfanity()) == false)
            return false;
        return true;
    }
}
