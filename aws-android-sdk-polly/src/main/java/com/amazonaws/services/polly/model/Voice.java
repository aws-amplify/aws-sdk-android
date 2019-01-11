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
 * Description of the voice.
 * </p>
 */
public class Voice implements Serializable {
    /**
     * <p>
     * Gender of the voice.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Female, Male
     */
    private String gender;

    /**
     * <p>
     * Amazon Polly assigned voice ID. This is the ID that you specify when
     * calling the <code>SynthesizeSpeech</code> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Geraint, Gwyneth, Mads, Naja, Hans, Marlene,
     * Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin,
     * Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope,
     * Chantal, Celine, Lea, Mathieu, Dora, Karl, Carla, Giorgio, Mizuki, Liv,
     * Lotte, Ruben, Ewa, Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines,
     * Carmen, Maxim, Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi,
     * Zhiyu, Bianca, Lucia, Mia
     */
    private String id;

    /**
     * <p>
     * Language code of the voice.
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
     * Human readable name of the language in English.
     * </p>
     */
    private String languageName;

    /**
     * <p>
     * Name of the voice (for example, Salli, Kendra, etc.). This provides a
     * human readable voice name that you might display in your application.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Additional codes for languages available for the specified voice in
     * addition to its default language.
     * </p>
     * <p>
     * For example, the default language for Aditi is Indian English (en-IN)
     * because it was first used for that language. Since Aditi is bilingual and
     * fluent in both Indian English and Hindi, this parameter would show the
     * code <code>hi-IN</code>.
     * </p>
     */
    private java.util.List<String> additionalLanguageCodes;

    /**
     * <p>
     * Gender of the voice.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Female, Male
     *
     * @return <p>
     *         Gender of the voice.
     *         </p>
     * @see Gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * <p>
     * Gender of the voice.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Female, Male
     *
     * @param gender <p>
     *            Gender of the voice.
     *            </p>
     * @see Gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * <p>
     * Gender of the voice.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Female, Male
     *
     * @param gender <p>
     *            Gender of the voice.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Gender
     */
    public Voice withGender(String gender) {
        this.gender = gender;
        return this;
    }

    /**
     * <p>
     * Gender of the voice.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Female, Male
     *
     * @param gender <p>
     *            Gender of the voice.
     *            </p>
     * @see Gender
     */
    public void setGender(Gender gender) {
        this.gender = gender.toString();
    }

    /**
     * <p>
     * Gender of the voice.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Female, Male
     *
     * @param gender <p>
     *            Gender of the voice.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Gender
     */
    public Voice withGender(Gender gender) {
        this.gender = gender.toString();
        return this;
    }

    /**
     * <p>
     * Amazon Polly assigned voice ID. This is the ID that you specify when
     * calling the <code>SynthesizeSpeech</code> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Geraint, Gwyneth, Mads, Naja, Hans, Marlene,
     * Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin,
     * Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope,
     * Chantal, Celine, Lea, Mathieu, Dora, Karl, Carla, Giorgio, Mizuki, Liv,
     * Lotte, Ruben, Ewa, Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines,
     * Carmen, Maxim, Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi,
     * Zhiyu, Bianca, Lucia, Mia
     *
     * @return <p>
     *         Amazon Polly assigned voice ID. This is the ID that you specify
     *         when calling the <code>SynthesizeSpeech</code> operation.
     *         </p>
     * @see VoiceId
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * Amazon Polly assigned voice ID. This is the ID that you specify when
     * calling the <code>SynthesizeSpeech</code> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Geraint, Gwyneth, Mads, Naja, Hans, Marlene,
     * Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin,
     * Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope,
     * Chantal, Celine, Lea, Mathieu, Dora, Karl, Carla, Giorgio, Mizuki, Liv,
     * Lotte, Ruben, Ewa, Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines,
     * Carmen, Maxim, Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi,
     * Zhiyu, Bianca, Lucia, Mia
     *
     * @param id <p>
     *            Amazon Polly assigned voice ID. This is the ID that you
     *            specify when calling the <code>SynthesizeSpeech</code>
     *            operation.
     *            </p>
     * @see VoiceId
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Amazon Polly assigned voice ID. This is the ID that you specify when
     * calling the <code>SynthesizeSpeech</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Geraint, Gwyneth, Mads, Naja, Hans, Marlene,
     * Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin,
     * Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope,
     * Chantal, Celine, Lea, Mathieu, Dora, Karl, Carla, Giorgio, Mizuki, Liv,
     * Lotte, Ruben, Ewa, Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines,
     * Carmen, Maxim, Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi,
     * Zhiyu, Bianca, Lucia, Mia
     *
     * @param id <p>
     *            Amazon Polly assigned voice ID. This is the ID that you
     *            specify when calling the <code>SynthesizeSpeech</code>
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VoiceId
     */
    public Voice withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * Amazon Polly assigned voice ID. This is the ID that you specify when
     * calling the <code>SynthesizeSpeech</code> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Geraint, Gwyneth, Mads, Naja, Hans, Marlene,
     * Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin,
     * Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope,
     * Chantal, Celine, Lea, Mathieu, Dora, Karl, Carla, Giorgio, Mizuki, Liv,
     * Lotte, Ruben, Ewa, Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines,
     * Carmen, Maxim, Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi,
     * Zhiyu, Bianca, Lucia, Mia
     *
     * @param id <p>
     *            Amazon Polly assigned voice ID. This is the ID that you
     *            specify when calling the <code>SynthesizeSpeech</code>
     *            operation.
     *            </p>
     * @see VoiceId
     */
    public void setId(VoiceId id) {
        this.id = id.toString();
    }

    /**
     * <p>
     * Amazon Polly assigned voice ID. This is the ID that you specify when
     * calling the <code>SynthesizeSpeech</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Geraint, Gwyneth, Mads, Naja, Hans, Marlene,
     * Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin,
     * Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope,
     * Chantal, Celine, Lea, Mathieu, Dora, Karl, Carla, Giorgio, Mizuki, Liv,
     * Lotte, Ruben, Ewa, Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines,
     * Carmen, Maxim, Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi,
     * Zhiyu, Bianca, Lucia, Mia
     *
     * @param id <p>
     *            Amazon Polly assigned voice ID. This is the ID that you
     *            specify when calling the <code>SynthesizeSpeech</code>
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VoiceId
     */
    public Voice withId(VoiceId id) {
        this.id = id.toString();
        return this;
    }

    /**
     * <p>
     * Language code of the voice.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR
     *
     * @return <p>
     *         Language code of the voice.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * Language code of the voice.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR
     *
     * @param languageCode <p>
     *            Language code of the voice.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * Language code of the voice.
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
     *            Language code of the voice.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public Voice withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * Language code of the voice.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR
     *
     * @param languageCode <p>
     *            Language code of the voice.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * Language code of the voice.
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
     *            Language code of the voice.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public Voice withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Human readable name of the language in English.
     * </p>
     *
     * @return <p>
     *         Human readable name of the language in English.
     *         </p>
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * <p>
     * Human readable name of the language in English.
     * </p>
     *
     * @param languageName <p>
     *            Human readable name of the language in English.
     *            </p>
     */
    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    /**
     * <p>
     * Human readable name of the language in English.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageName <p>
     *            Human readable name of the language in English.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Voice withLanguageName(String languageName) {
        this.languageName = languageName;
        return this;
    }

    /**
     * <p>
     * Name of the voice (for example, Salli, Kendra, etc.). This provides a
     * human readable voice name that you might display in your application.
     * </p>
     *
     * @return <p>
     *         Name of the voice (for example, Salli, Kendra, etc.). This
     *         provides a human readable voice name that you might display in
     *         your application.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Name of the voice (for example, Salli, Kendra, etc.). This provides a
     * human readable voice name that you might display in your application.
     * </p>
     *
     * @param name <p>
     *            Name of the voice (for example, Salli, Kendra, etc.). This
     *            provides a human readable voice name that you might display in
     *            your application.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the voice (for example, Salli, Kendra, etc.). This provides a
     * human readable voice name that you might display in your application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            Name of the voice (for example, Salli, Kendra, etc.). This
     *            provides a human readable voice name that you might display in
     *            your application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Voice withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Additional codes for languages available for the specified voice in
     * addition to its default language.
     * </p>
     * <p>
     * For example, the default language for Aditi is Indian English (en-IN)
     * because it was first used for that language. Since Aditi is bilingual and
     * fluent in both Indian English and Hindi, this parameter would show the
     * code <code>hi-IN</code>.
     * </p>
     *
     * @return <p>
     *         Additional codes for languages available for the specified voice
     *         in addition to its default language.
     *         </p>
     *         <p>
     *         For example, the default language for Aditi is Indian English
     *         (en-IN) because it was first used for that language. Since Aditi
     *         is bilingual and fluent in both Indian English and Hindi, this
     *         parameter would show the code <code>hi-IN</code>.
     *         </p>
     */
    public java.util.List<String> getAdditionalLanguageCodes() {
        return additionalLanguageCodes;
    }

    /**
     * <p>
     * Additional codes for languages available for the specified voice in
     * addition to its default language.
     * </p>
     * <p>
     * For example, the default language for Aditi is Indian English (en-IN)
     * because it was first used for that language. Since Aditi is bilingual and
     * fluent in both Indian English and Hindi, this parameter would show the
     * code <code>hi-IN</code>.
     * </p>
     *
     * @param additionalLanguageCodes <p>
     *            Additional codes for languages available for the specified
     *            voice in addition to its default language.
     *            </p>
     *            <p>
     *            For example, the default language for Aditi is Indian English
     *            (en-IN) because it was first used for that language. Since
     *            Aditi is bilingual and fluent in both Indian English and
     *            Hindi, this parameter would show the code <code>hi-IN</code>.
     *            </p>
     */
    public void setAdditionalLanguageCodes(java.util.Collection<String> additionalLanguageCodes) {
        if (additionalLanguageCodes == null) {
            this.additionalLanguageCodes = null;
            return;
        }

        this.additionalLanguageCodes = new java.util.ArrayList<String>(additionalLanguageCodes);
    }

    /**
     * <p>
     * Additional codes for languages available for the specified voice in
     * addition to its default language.
     * </p>
     * <p>
     * For example, the default language for Aditi is Indian English (en-IN)
     * because it was first used for that language. Since Aditi is bilingual and
     * fluent in both Indian English and Hindi, this parameter would show the
     * code <code>hi-IN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalLanguageCodes <p>
     *            Additional codes for languages available for the specified
     *            voice in addition to its default language.
     *            </p>
     *            <p>
     *            For example, the default language for Aditi is Indian English
     *            (en-IN) because it was first used for that language. Since
     *            Aditi is bilingual and fluent in both Indian English and
     *            Hindi, this parameter would show the code <code>hi-IN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Voice withAdditionalLanguageCodes(String... additionalLanguageCodes) {
        if (getAdditionalLanguageCodes() == null) {
            this.additionalLanguageCodes = new java.util.ArrayList<String>(
                    additionalLanguageCodes.length);
        }
        for (String value : additionalLanguageCodes) {
            this.additionalLanguageCodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Additional codes for languages available for the specified voice in
     * addition to its default language.
     * </p>
     * <p>
     * For example, the default language for Aditi is Indian English (en-IN)
     * because it was first used for that language. Since Aditi is bilingual and
     * fluent in both Indian English and Hindi, this parameter would show the
     * code <code>hi-IN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalLanguageCodes <p>
     *            Additional codes for languages available for the specified
     *            voice in addition to its default language.
     *            </p>
     *            <p>
     *            For example, the default language for Aditi is Indian English
     *            (en-IN) because it was first used for that language. Since
     *            Aditi is bilingual and fluent in both Indian English and
     *            Hindi, this parameter would show the code <code>hi-IN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Voice withAdditionalLanguageCodes(java.util.Collection<String> additionalLanguageCodes) {
        setAdditionalLanguageCodes(additionalLanguageCodes);
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
        if (getGender() != null)
            sb.append("Gender: " + getGender() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getLanguageName() != null)
            sb.append("LanguageName: " + getLanguageName() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getAdditionalLanguageCodes() != null)
            sb.append("AdditionalLanguageCodes: " + getAdditionalLanguageCodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGender() == null) ? 0 : getGender().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageName() == null) ? 0 : getLanguageName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdditionalLanguageCodes() == null) ? 0 : getAdditionalLanguageCodes()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Voice == false)
            return false;
        Voice other = (Voice) obj;

        if (other.getGender() == null ^ this.getGender() == null)
            return false;
        if (other.getGender() != null && other.getGender().equals(this.getGender()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLanguageName() == null ^ this.getLanguageName() == null)
            return false;
        if (other.getLanguageName() != null
                && other.getLanguageName().equals(this.getLanguageName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAdditionalLanguageCodes() == null ^ this.getAdditionalLanguageCodes() == null)
            return false;
        if (other.getAdditionalLanguageCodes() != null
                && other.getAdditionalLanguageCodes().equals(this.getAdditionalLanguageCodes()) == false)
            return false;
        return true;
    }
}
