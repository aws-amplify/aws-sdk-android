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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

/**
 * <p>
 * Settings to configure your translation output, including the option to set
 * the formality level of the output text and the option to mask profane words
 * and phrases.
 * </p>
 */
public class TranslationSettings implements Serializable {
    /**
     * <p>
     * You can optionally specify the desired level of formality for
     * translations to supported target languages. The formality setting
     * controls the level of formal language usage (also known as <a
     * href="https://en.wikipedia.org/wiki/Register_(sociolinguistics)"
     * >register</a>) in the translation output. You can set the value to
     * informal or formal. If you don't specify a value for formality, or if the
     * target language doesn't support formality, the translation will ignore
     * the formality setting.
     * </p>
     * <p>
     * If you specify multiple target languages for the job, translate ignores
     * the formality setting for any unsupported target language.
     * </p>
     * <p>
     * For a list of target languages that support formality, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-formality.html#customizing-translations-formality-languages"
     * >Supported languages</a> in the Amazon Translate Developer Guide.
     * </p>
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
     * Amazon Translate doesn't detect profanity in all of its supported
     * languages. For languages that don't support profanity detection, see <a
     * href=
     * "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-profanity.html#customizing-translations-profanity-languages"
     * >Unsupported languages</a> in the Amazon Translate Developer Guide.
     * </p>
     * <p>
     * If you specify multiple target languages for the job, all the target
     * languages must support profanity masking. If any of the target languages
     * don't support profanity masking, the translation job won't mask profanity
     * for any target language.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASK
     */
    private String profanity;

    /**
     * <p>
     * You can optionally specify the desired level of formality for
     * translations to supported target languages. The formality setting
     * controls the level of formal language usage (also known as <a
     * href="https://en.wikipedia.org/wiki/Register_(sociolinguistics)"
     * >register</a>) in the translation output. You can set the value to
     * informal or formal. If you don't specify a value for formality, or if the
     * target language doesn't support formality, the translation will ignore
     * the formality setting.
     * </p>
     * <p>
     * If you specify multiple target languages for the job, translate ignores
     * the formality setting for any unsupported target language.
     * </p>
     * <p>
     * For a list of target languages that support formality, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-formality.html#customizing-translations-formality-languages"
     * >Supported languages</a> in the Amazon Translate Developer Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORMAL, INFORMAL
     *
     * @return <p>
     *         You can optionally specify the desired level of formality for
     *         translations to supported target languages. The formality setting
     *         controls the level of formal language usage (also known as <a
     *         href="https://en.wikipedia.org/wiki/Register_(sociolinguistics)">
     *         register</a>) in the translation output. You can set the value to
     *         informal or formal. If you don't specify a value for formality,
     *         or if the target language doesn't support formality, the
     *         translation will ignore the formality setting.
     *         </p>
     *         <p>
     *         If you specify multiple target languages for the job, translate
     *         ignores the formality setting for any unsupported target
     *         language.
     *         </p>
     *         <p>
     *         For a list of target languages that support formality, see <a
     *         href=
     *         "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-formality.html#customizing-translations-formality-languages"
     *         >Supported languages</a> in the Amazon Translate Developer Guide.
     *         </p>
     * @see Formality
     */
    public String getFormality() {
        return formality;
    }

    /**
     * <p>
     * You can optionally specify the desired level of formality for
     * translations to supported target languages. The formality setting
     * controls the level of formal language usage (also known as <a
     * href="https://en.wikipedia.org/wiki/Register_(sociolinguistics)"
     * >register</a>) in the translation output. You can set the value to
     * informal or formal. If you don't specify a value for formality, or if the
     * target language doesn't support formality, the translation will ignore
     * the formality setting.
     * </p>
     * <p>
     * If you specify multiple target languages for the job, translate ignores
     * the formality setting for any unsupported target language.
     * </p>
     * <p>
     * For a list of target languages that support formality, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-formality.html#customizing-translations-formality-languages"
     * >Supported languages</a> in the Amazon Translate Developer Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORMAL, INFORMAL
     *
     * @param formality <p>
     *            You can optionally specify the desired level of formality for
     *            translations to supported target languages. The formality
     *            setting controls the level of formal language usage (also
     *            known as <a href=
     *            "https://en.wikipedia.org/wiki/Register_(sociolinguistics)"
     *            >register</a>) in the translation output. You can set the
     *            value to informal or formal. If you don't specify a value for
     *            formality, or if the target language doesn't support
     *            formality, the translation will ignore the formality setting.
     *            </p>
     *            <p>
     *            If you specify multiple target languages for the job,
     *            translate ignores the formality setting for any unsupported
     *            target language.
     *            </p>
     *            <p>
     *            For a list of target languages that support formality, see <a
     *            href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-formality.html#customizing-translations-formality-languages"
     *            >Supported languages</a> in the Amazon Translate Developer
     *            Guide.
     *            </p>
     * @see Formality
     */
    public void setFormality(String formality) {
        this.formality = formality;
    }

    /**
     * <p>
     * You can optionally specify the desired level of formality for
     * translations to supported target languages. The formality setting
     * controls the level of formal language usage (also known as <a
     * href="https://en.wikipedia.org/wiki/Register_(sociolinguistics)"
     * >register</a>) in the translation output. You can set the value to
     * informal or formal. If you don't specify a value for formality, or if the
     * target language doesn't support formality, the translation will ignore
     * the formality setting.
     * </p>
     * <p>
     * If you specify multiple target languages for the job, translate ignores
     * the formality setting for any unsupported target language.
     * </p>
     * <p>
     * For a list of target languages that support formality, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-formality.html#customizing-translations-formality-languages"
     * >Supported languages</a> in the Amazon Translate Developer Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORMAL, INFORMAL
     *
     * @param formality <p>
     *            You can optionally specify the desired level of formality for
     *            translations to supported target languages. The formality
     *            setting controls the level of formal language usage (also
     *            known as <a href=
     *            "https://en.wikipedia.org/wiki/Register_(sociolinguistics)"
     *            >register</a>) in the translation output. You can set the
     *            value to informal or formal. If you don't specify a value for
     *            formality, or if the target language doesn't support
     *            formality, the translation will ignore the formality setting.
     *            </p>
     *            <p>
     *            If you specify multiple target languages for the job,
     *            translate ignores the formality setting for any unsupported
     *            target language.
     *            </p>
     *            <p>
     *            For a list of target languages that support formality, see <a
     *            href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-formality.html#customizing-translations-formality-languages"
     *            >Supported languages</a> in the Amazon Translate Developer
     *            Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Formality
     */
    public TranslationSettings withFormality(String formality) {
        this.formality = formality;
        return this;
    }

    /**
     * <p>
     * You can optionally specify the desired level of formality for
     * translations to supported target languages. The formality setting
     * controls the level of formal language usage (also known as <a
     * href="https://en.wikipedia.org/wiki/Register_(sociolinguistics)"
     * >register</a>) in the translation output. You can set the value to
     * informal or formal. If you don't specify a value for formality, or if the
     * target language doesn't support formality, the translation will ignore
     * the formality setting.
     * </p>
     * <p>
     * If you specify multiple target languages for the job, translate ignores
     * the formality setting for any unsupported target language.
     * </p>
     * <p>
     * For a list of target languages that support formality, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-formality.html#customizing-translations-formality-languages"
     * >Supported languages</a> in the Amazon Translate Developer Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORMAL, INFORMAL
     *
     * @param formality <p>
     *            You can optionally specify the desired level of formality for
     *            translations to supported target languages. The formality
     *            setting controls the level of formal language usage (also
     *            known as <a href=
     *            "https://en.wikipedia.org/wiki/Register_(sociolinguistics)"
     *            >register</a>) in the translation output. You can set the
     *            value to informal or formal. If you don't specify a value for
     *            formality, or if the target language doesn't support
     *            formality, the translation will ignore the formality setting.
     *            </p>
     *            <p>
     *            If you specify multiple target languages for the job,
     *            translate ignores the formality setting for any unsupported
     *            target language.
     *            </p>
     *            <p>
     *            For a list of target languages that support formality, see <a
     *            href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-formality.html#customizing-translations-formality-languages"
     *            >Supported languages</a> in the Amazon Translate Developer
     *            Guide.
     *            </p>
     * @see Formality
     */
    public void setFormality(Formality formality) {
        this.formality = formality.toString();
    }

    /**
     * <p>
     * You can optionally specify the desired level of formality for
     * translations to supported target languages. The formality setting
     * controls the level of formal language usage (also known as <a
     * href="https://en.wikipedia.org/wiki/Register_(sociolinguistics)"
     * >register</a>) in the translation output. You can set the value to
     * informal or formal. If you don't specify a value for formality, or if the
     * target language doesn't support formality, the translation will ignore
     * the formality setting.
     * </p>
     * <p>
     * If you specify multiple target languages for the job, translate ignores
     * the formality setting for any unsupported target language.
     * </p>
     * <p>
     * For a list of target languages that support formality, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-formality.html#customizing-translations-formality-languages"
     * >Supported languages</a> in the Amazon Translate Developer Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORMAL, INFORMAL
     *
     * @param formality <p>
     *            You can optionally specify the desired level of formality for
     *            translations to supported target languages. The formality
     *            setting controls the level of formal language usage (also
     *            known as <a href=
     *            "https://en.wikipedia.org/wiki/Register_(sociolinguistics)"
     *            >register</a>) in the translation output. You can set the
     *            value to informal or formal. If you don't specify a value for
     *            formality, or if the target language doesn't support
     *            formality, the translation will ignore the formality setting.
     *            </p>
     *            <p>
     *            If you specify multiple target languages for the job,
     *            translate ignores the formality setting for any unsupported
     *            target language.
     *            </p>
     *            <p>
     *            For a list of target languages that support formality, see <a
     *            href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-formality.html#customizing-translations-formality-languages"
     *            >Supported languages</a> in the Amazon Translate Developer
     *            Guide.
     *            </p>
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
     * Amazon Translate doesn't detect profanity in all of its supported
     * languages. For languages that don't support profanity detection, see <a
     * href=
     * "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-profanity.html#customizing-translations-profanity-languages"
     * >Unsupported languages</a> in the Amazon Translate Developer Guide.
     * </p>
     * <p>
     * If you specify multiple target languages for the job, all the target
     * languages must support profanity masking. If any of the target languages
     * don't support profanity masking, the translation job won't mask profanity
     * for any target language.
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
     *         Amazon Translate doesn't detect profanity in all of its supported
     *         languages. For languages that don't support profanity detection,
     *         see <a href=
     *         "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-profanity.html#customizing-translations-profanity-languages"
     *         >Unsupported languages</a> in the Amazon Translate Developer
     *         Guide.
     *         </p>
     *         <p>
     *         If you specify multiple target languages for the job, all the
     *         target languages must support profanity masking. If any of the
     *         target languages don't support profanity masking, the translation
     *         job won't mask profanity for any target language.
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
     * Amazon Translate doesn't detect profanity in all of its supported
     * languages. For languages that don't support profanity detection, see <a
     * href=
     * "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-profanity.html#customizing-translations-profanity-languages"
     * >Unsupported languages</a> in the Amazon Translate Developer Guide.
     * </p>
     * <p>
     * If you specify multiple target languages for the job, all the target
     * languages must support profanity masking. If any of the target languages
     * don't support profanity masking, the translation job won't mask profanity
     * for any target language.
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
     *            Amazon Translate doesn't detect profanity in all of its
     *            supported languages. For languages that don't support
     *            profanity detection, see <a href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-profanity.html#customizing-translations-profanity-languages"
     *            >Unsupported languages</a> in the Amazon Translate Developer
     *            Guide.
     *            </p>
     *            <p>
     *            If you specify multiple target languages for the job, all the
     *            target languages must support profanity masking. If any of the
     *            target languages don't support profanity masking, the
     *            translation job won't mask profanity for any target language.
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
     * Amazon Translate doesn't detect profanity in all of its supported
     * languages. For languages that don't support profanity detection, see <a
     * href=
     * "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-profanity.html#customizing-translations-profanity-languages"
     * >Unsupported languages</a> in the Amazon Translate Developer Guide.
     * </p>
     * <p>
     * If you specify multiple target languages for the job, all the target
     * languages must support profanity masking. If any of the target languages
     * don't support profanity masking, the translation job won't mask profanity
     * for any target language.
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
     *            Amazon Translate doesn't detect profanity in all of its
     *            supported languages. For languages that don't support
     *            profanity detection, see <a href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-profanity.html#customizing-translations-profanity-languages"
     *            >Unsupported languages</a> in the Amazon Translate Developer
     *            Guide.
     *            </p>
     *            <p>
     *            If you specify multiple target languages for the job, all the
     *            target languages must support profanity masking. If any of the
     *            target languages don't support profanity masking, the
     *            translation job won't mask profanity for any target language.
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
     * Amazon Translate doesn't detect profanity in all of its supported
     * languages. For languages that don't support profanity detection, see <a
     * href=
     * "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-profanity.html#customizing-translations-profanity-languages"
     * >Unsupported languages</a> in the Amazon Translate Developer Guide.
     * </p>
     * <p>
     * If you specify multiple target languages for the job, all the target
     * languages must support profanity masking. If any of the target languages
     * don't support profanity masking, the translation job won't mask profanity
     * for any target language.
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
     *            Amazon Translate doesn't detect profanity in all of its
     *            supported languages. For languages that don't support
     *            profanity detection, see <a href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-profanity.html#customizing-translations-profanity-languages"
     *            >Unsupported languages</a> in the Amazon Translate Developer
     *            Guide.
     *            </p>
     *            <p>
     *            If you specify multiple target languages for the job, all the
     *            target languages must support profanity masking. If any of the
     *            target languages don't support profanity masking, the
     *            translation job won't mask profanity for any target language.
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
     * Amazon Translate doesn't detect profanity in all of its supported
     * languages. For languages that don't support profanity detection, see <a
     * href=
     * "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-profanity.html#customizing-translations-profanity-languages"
     * >Unsupported languages</a> in the Amazon Translate Developer Guide.
     * </p>
     * <p>
     * If you specify multiple target languages for the job, all the target
     * languages must support profanity masking. If any of the target languages
     * don't support profanity masking, the translation job won't mask profanity
     * for any target language.
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
     *            Amazon Translate doesn't detect profanity in all of its
     *            supported languages. For languages that don't support
     *            profanity detection, see <a href=
     *            "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-profanity.html#customizing-translations-profanity-languages"
     *            >Unsupported languages</a> in the Amazon Translate Developer
     *            Guide.
     *            </p>
     *            <p>
     *            If you specify multiple target languages for the job, all the
     *            target languages must support profanity masking. If any of the
     *            target languages don't support profanity masking, the
     *            translation job won't mask profanity for any target language.
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
