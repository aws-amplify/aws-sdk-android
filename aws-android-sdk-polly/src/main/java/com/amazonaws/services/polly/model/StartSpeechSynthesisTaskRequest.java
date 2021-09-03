/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Allows the creation of an asynchronous synthesis task, by starting a new
 * <code>SpeechSynthesisTask</code>. This operation requires all the standard
 * information needed for speech synthesis, plus the name of an Amazon S3 bucket
 * for the service to store the output of the synthesis task and two optional
 * parameters (<code>OutputS3KeyPrefix</code> and <code>SnsTopicArn</code>).
 * Once the synthesis task is created, this operation will return a
 * <code>SpeechSynthesisTask</code> object, which will include an identifier of
 * this task as well as the current status. The <code>SpeechSynthesisTask</code>
 * object is available for 72 hours after starting the asynchronous synthesis
 * task.
 * </p>
 */
public class StartSpeechSynthesisTaskRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Specifies the engine (<code>standard</code> or <code>neural</code>) for
     * Amazon Polly to use when processing input text for speech synthesis.
     * Using a voice that is not supported for the engine selected will result
     * in an error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, neural
     */
    private String engine;

    /**
     * <p>
     * Optional language code for the Speech Synthesis request. This is only
     * necessary if using a bilingual voice, such as Aditi, which can be used
     * for either Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon
     * Polly uses the default language of the bilingual voice. The default
     * language for any voice is the one returned by the <a href=
     * "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation for the <code>LanguageCode</code>
     * parameter. For example, if no language code is specified, Aditi will use
     * Indian English rather than Hindi.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>arb, cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR, en-NZ, en-ZA
     */
    private String languageCode;

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to
     * apply during synthesis. Lexicons are applied only if the language of the
     * lexicon is the same as the language of the voice.
     * </p>
     */
    private java.util.List<String> lexiconNames;

    /**
     * <p>
     * The format in which the returned output will be encoded. For audio
     * stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will
     * be json.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json, mp3, ogg_vorbis, pcm
     */
    private String outputFormat;

    /**
     * <p>
     * Amazon S3 bucket name to which the output file will be saved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]$<br/>
     */
    private String outputS3BucketName;

    /**
     * <p>
     * The Amazon S3 key prefix for the output speech file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-zA-Z\/\!\-_\.\*\'\(\):;\$@=+\,\?&]{0,800}$<br/>
     */
    private String outputS3KeyPrefix;

    /**
     * <p>
     * The audio frequency specified in Hz.
     * </p>
     * <p>
     * The valid values for mp3 and ogg_vorbis are "8000", "16000", "22050", and
     * "24000". The default value for standard voices is "22050". The default
     * value for neural voices is "24000".
     * </p>
     * <p>
     * Valid values for pcm are "8000" and "16000" The default value is "16000".
     * </p>
     */
    private String sampleRate;

    /**
     * <p>
     * ARN for the SNS topic optionally used for providing status notification
     * for a speech synthesis task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws(-(cn|iso(-b)?|us-gov))?:sns:[a-z0-
     * 9_-]{1,50}:\d{12}:[a-zA-Z0-9_-]{1,256}$<br/>
     */
    private String snsTopicArn;

    /**
     * <p>
     * The type of speech marks returned for the input text.
     * </p>
     */
    private java.util.List<String> speechMarkTypes;

    /**
     * <p>
     * The input text to synthesize. If you specify ssml as the TextType, follow
     * the SSML format for the input text.
     * </p>
     */
    private String text;

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value
     * is plain text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssml, text
     */
    private String textType;

    /**
     * <p>
     * Voice ID to use for the synthesis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Aditi, Amy, Astrid, Bianca, Brian, Camila, Carla,
     * Carmen, Celine, Chantal, Conchita, Cristiano, Dora, Emma, Enrique, Ewa,
     * Filiz, Gabrielle, Geraint, Giorgio, Gwyneth, Hans, Ines, Ivy, Jacek, Jan,
     * Joanna, Joey, Justin, Karl, Kendra, Kevin, Kimberly, Lea, Liv, Lotte,
     * Lucia, Lupe, Mads, Maja, Marlene, Mathieu, Matthew, Maxim, Mia, Miguel,
     * Mizuki, Naja, Nicole, Olivia, Penelope, Raveena, Ricardo, Ruben, Russell,
     * Salli, Seoyeon, Takumi, Tatyana, Vicki, Vitoria, Zeina, Zhiyu, Aria,
     * Ayanda
     */
    private String voiceId;

    /**
     * <p>
     * Specifies the engine (<code>standard</code> or <code>neural</code>) for
     * Amazon Polly to use when processing input text for speech synthesis.
     * Using a voice that is not supported for the engine selected will result
     * in an error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, neural
     *
     * @return <p>
     *         Specifies the engine (<code>standard</code> or
     *         <code>neural</code>) for Amazon Polly to use when processing
     *         input text for speech synthesis. Using a voice that is not
     *         supported for the engine selected will result in an error.
     *         </p>
     * @see Engine
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * Specifies the engine (<code>standard</code> or <code>neural</code>) for
     * Amazon Polly to use when processing input text for speech synthesis.
     * Using a voice that is not supported for the engine selected will result
     * in an error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, neural
     *
     * @param engine <p>
     *            Specifies the engine (<code>standard</code> or
     *            <code>neural</code>) for Amazon Polly to use when processing
     *            input text for speech synthesis. Using a voice that is not
     *            supported for the engine selected will result in an error.
     *            </p>
     * @see Engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * Specifies the engine (<code>standard</code> or <code>neural</code>) for
     * Amazon Polly to use when processing input text for speech synthesis.
     * Using a voice that is not supported for the engine selected will result
     * in an error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, neural
     *
     * @param engine <p>
     *            Specifies the engine (<code>standard</code> or
     *            <code>neural</code>) for Amazon Polly to use when processing
     *            input text for speech synthesis. Using a voice that is not
     *            supported for the engine selected will result in an error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Engine
     */
    public StartSpeechSynthesisTaskRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * Specifies the engine (<code>standard</code> or <code>neural</code>) for
     * Amazon Polly to use when processing input text for speech synthesis.
     * Using a voice that is not supported for the engine selected will result
     * in an error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, neural
     *
     * @param engine <p>
     *            Specifies the engine (<code>standard</code> or
     *            <code>neural</code>) for Amazon Polly to use when processing
     *            input text for speech synthesis. Using a voice that is not
     *            supported for the engine selected will result in an error.
     *            </p>
     * @see Engine
     */
    public void setEngine(Engine engine) {
        this.engine = engine.toString();
    }

    /**
     * <p>
     * Specifies the engine (<code>standard</code> or <code>neural</code>) for
     * Amazon Polly to use when processing input text for speech synthesis.
     * Using a voice that is not supported for the engine selected will result
     * in an error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, neural
     *
     * @param engine <p>
     *            Specifies the engine (<code>standard</code> or
     *            <code>neural</code>) for Amazon Polly to use when processing
     *            input text for speech synthesis. Using a voice that is not
     *            supported for the engine selected will result in an error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Engine
     */
    public StartSpeechSynthesisTaskRequest withEngine(Engine engine) {
        this.engine = engine.toString();
        return this;
    }

    /**
     * <p>
     * Optional language code for the Speech Synthesis request. This is only
     * necessary if using a bilingual voice, such as Aditi, which can be used
     * for either Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon
     * Polly uses the default language of the bilingual voice. The default
     * language for any voice is the one returned by the <a href=
     * "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation for the <code>LanguageCode</code>
     * parameter. For example, if no language code is specified, Aditi will use
     * Indian English rather than Hindi.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>arb, cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR, en-NZ, en-ZA
     *
     * @return <p>
     *         Optional language code for the Speech Synthesis request. This is
     *         only necessary if using a bilingual voice, such as Aditi, which
     *         can be used for either Indian English (en-IN) or Hindi (hi-IN).
     *         </p>
     *         <p>
     *         If a bilingual voice is used and no language code is specified,
     *         Amazon Polly uses the default language of the bilingual voice.
     *         The default language for any voice is the one returned by the <a
     *         href=
     *         "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     *         >DescribeVoices</a> operation for the <code>LanguageCode</code>
     *         parameter. For example, if no language code is specified, Aditi
     *         will use Indian English rather than Hindi.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * Optional language code for the Speech Synthesis request. This is only
     * necessary if using a bilingual voice, such as Aditi, which can be used
     * for either Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon
     * Polly uses the default language of the bilingual voice. The default
     * language for any voice is the one returned by the <a href=
     * "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation for the <code>LanguageCode</code>
     * parameter. For example, if no language code is specified, Aditi will use
     * Indian English rather than Hindi.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>arb, cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR, en-NZ, en-ZA
     *
     * @param languageCode <p>
     *            Optional language code for the Speech Synthesis request. This
     *            is only necessary if using a bilingual voice, such as Aditi,
     *            which can be used for either Indian English (en-IN) or Hindi
     *            (hi-IN).
     *            </p>
     *            <p>
     *            If a bilingual voice is used and no language code is
     *            specified, Amazon Polly uses the default language of the
     *            bilingual voice. The default language for any voice is the one
     *            returned by the <a href=
     *            "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     *            >DescribeVoices</a> operation for the
     *            <code>LanguageCode</code> parameter. For example, if no
     *            language code is specified, Aditi will use Indian English
     *            rather than Hindi.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * Optional language code for the Speech Synthesis request. This is only
     * necessary if using a bilingual voice, such as Aditi, which can be used
     * for either Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon
     * Polly uses the default language of the bilingual voice. The default
     * language for any voice is the one returned by the <a href=
     * "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation for the <code>LanguageCode</code>
     * parameter. For example, if no language code is specified, Aditi will use
     * Indian English rather than Hindi.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>arb, cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR, en-NZ, en-ZA
     *
     * @param languageCode <p>
     *            Optional language code for the Speech Synthesis request. This
     *            is only necessary if using a bilingual voice, such as Aditi,
     *            which can be used for either Indian English (en-IN) or Hindi
     *            (hi-IN).
     *            </p>
     *            <p>
     *            If a bilingual voice is used and no language code is
     *            specified, Amazon Polly uses the default language of the
     *            bilingual voice. The default language for any voice is the one
     *            returned by the <a href=
     *            "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     *            >DescribeVoices</a> operation for the
     *            <code>LanguageCode</code> parameter. For example, if no
     *            language code is specified, Aditi will use Indian English
     *            rather than Hindi.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public StartSpeechSynthesisTaskRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * Optional language code for the Speech Synthesis request. This is only
     * necessary if using a bilingual voice, such as Aditi, which can be used
     * for either Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon
     * Polly uses the default language of the bilingual voice. The default
     * language for any voice is the one returned by the <a href=
     * "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation for the <code>LanguageCode</code>
     * parameter. For example, if no language code is specified, Aditi will use
     * Indian English rather than Hindi.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>arb, cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR, en-NZ, en-ZA
     *
     * @param languageCode <p>
     *            Optional language code for the Speech Synthesis request. This
     *            is only necessary if using a bilingual voice, such as Aditi,
     *            which can be used for either Indian English (en-IN) or Hindi
     *            (hi-IN).
     *            </p>
     *            <p>
     *            If a bilingual voice is used and no language code is
     *            specified, Amazon Polly uses the default language of the
     *            bilingual voice. The default language for any voice is the one
     *            returned by the <a href=
     *            "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     *            >DescribeVoices</a> operation for the
     *            <code>LanguageCode</code> parameter. For example, if no
     *            language code is specified, Aditi will use Indian English
     *            rather than Hindi.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * Optional language code for the Speech Synthesis request. This is only
     * necessary if using a bilingual voice, such as Aditi, which can be used
     * for either Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon
     * Polly uses the default language of the bilingual voice. The default
     * language for any voice is the one returned by the <a href=
     * "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation for the <code>LanguageCode</code>
     * parameter. For example, if no language code is specified, Aditi will use
     * Indian English rather than Hindi.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>arb, cmn-CN, cy-GB, da-DK, de-DE, en-AU, en-GB,
     * en-GB-WLS, en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT,
     * ja-JP, hi-IN, ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU,
     * sv-SE, tr-TR, en-NZ, en-ZA
     *
     * @param languageCode <p>
     *            Optional language code for the Speech Synthesis request. This
     *            is only necessary if using a bilingual voice, such as Aditi,
     *            which can be used for either Indian English (en-IN) or Hindi
     *            (hi-IN).
     *            </p>
     *            <p>
     *            If a bilingual voice is used and no language code is
     *            specified, Amazon Polly uses the default language of the
     *            bilingual voice. The default language for any voice is the one
     *            returned by the <a href=
     *            "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     *            >DescribeVoices</a> operation for the
     *            <code>LanguageCode</code> parameter. For example, if no
     *            language code is specified, Aditi will use Indian English
     *            rather than Hindi.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public StartSpeechSynthesisTaskRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to
     * apply during synthesis. Lexicons are applied only if the language of the
     * lexicon is the same as the language of the voice.
     * </p>
     *
     * @return <p>
     *         List of one or more pronunciation lexicon names you want the
     *         service to apply during synthesis. Lexicons are applied only if
     *         the language of the lexicon is the same as the language of the
     *         voice.
     *         </p>
     */
    public java.util.List<String> getLexiconNames() {
        return lexiconNames;
    }

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to
     * apply during synthesis. Lexicons are applied only if the language of the
     * lexicon is the same as the language of the voice.
     * </p>
     *
     * @param lexiconNames <p>
     *            List of one or more pronunciation lexicon names you want the
     *            service to apply during synthesis. Lexicons are applied only
     *            if the language of the lexicon is the same as the language of
     *            the voice.
     *            </p>
     */
    public void setLexiconNames(java.util.Collection<String> lexiconNames) {
        if (lexiconNames == null) {
            this.lexiconNames = null;
            return;
        }

        this.lexiconNames = new java.util.ArrayList<String>(lexiconNames);
    }

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to
     * apply during synthesis. Lexicons are applied only if the language of the
     * lexicon is the same as the language of the voice.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lexiconNames <p>
     *            List of one or more pronunciation lexicon names you want the
     *            service to apply during synthesis. Lexicons are applied only
     *            if the language of the lexicon is the same as the language of
     *            the voice.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSpeechSynthesisTaskRequest withLexiconNames(String... lexiconNames) {
        if (getLexiconNames() == null) {
            this.lexiconNames = new java.util.ArrayList<String>(lexiconNames.length);
        }
        for (String value : lexiconNames) {
            this.lexiconNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to
     * apply during synthesis. Lexicons are applied only if the language of the
     * lexicon is the same as the language of the voice.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lexiconNames <p>
     *            List of one or more pronunciation lexicon names you want the
     *            service to apply during synthesis. Lexicons are applied only
     *            if the language of the lexicon is the same as the language of
     *            the voice.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSpeechSynthesisTaskRequest withLexiconNames(
            java.util.Collection<String> lexiconNames) {
        setLexiconNames(lexiconNames);
        return this;
    }

    /**
     * <p>
     * The format in which the returned output will be encoded. For audio
     * stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will
     * be json.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json, mp3, ogg_vorbis, pcm
     *
     * @return <p>
     *         The format in which the returned output will be encoded. For
     *         audio stream, this will be mp3, ogg_vorbis, or pcm. For speech
     *         marks, this will be json.
     *         </p>
     * @see OutputFormat
     */
    public String getOutputFormat() {
        return outputFormat;
    }

    /**
     * <p>
     * The format in which the returned output will be encoded. For audio
     * stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will
     * be json.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json, mp3, ogg_vorbis, pcm
     *
     * @param outputFormat <p>
     *            The format in which the returned output will be encoded. For
     *            audio stream, this will be mp3, ogg_vorbis, or pcm. For speech
     *            marks, this will be json.
     *            </p>
     * @see OutputFormat
     */
    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * <p>
     * The format in which the returned output will be encoded. For audio
     * stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will
     * be json.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json, mp3, ogg_vorbis, pcm
     *
     * @param outputFormat <p>
     *            The format in which the returned output will be encoded. For
     *            audio stream, this will be mp3, ogg_vorbis, or pcm. For speech
     *            marks, this will be json.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OutputFormat
     */
    public StartSpeechSynthesisTaskRequest withOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }

    /**
     * <p>
     * The format in which the returned output will be encoded. For audio
     * stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will
     * be json.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json, mp3, ogg_vorbis, pcm
     *
     * @param outputFormat <p>
     *            The format in which the returned output will be encoded. For
     *            audio stream, this will be mp3, ogg_vorbis, or pcm. For speech
     *            marks, this will be json.
     *            </p>
     * @see OutputFormat
     */
    public void setOutputFormat(OutputFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
    }

    /**
     * <p>
     * The format in which the returned output will be encoded. For audio
     * stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will
     * be json.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>json, mp3, ogg_vorbis, pcm
     *
     * @param outputFormat <p>
     *            The format in which the returned output will be encoded. For
     *            audio stream, this will be mp3, ogg_vorbis, or pcm. For speech
     *            marks, this will be json.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OutputFormat
     */
    public StartSpeechSynthesisTaskRequest withOutputFormat(OutputFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
        return this;
    }

    /**
     * <p>
     * Amazon S3 bucket name to which the output file will be saved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]$<br/>
     *
     * @return <p>
     *         Amazon S3 bucket name to which the output file will be saved.
     *         </p>
     */
    public String getOutputS3BucketName() {
        return outputS3BucketName;
    }

    /**
     * <p>
     * Amazon S3 bucket name to which the output file will be saved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]$<br/>
     *
     * @param outputS3BucketName <p>
     *            Amazon S3 bucket name to which the output file will be saved.
     *            </p>
     */
    public void setOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    /**
     * <p>
     * Amazon S3 bucket name to which the output file will be saved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]$<br/>
     *
     * @param outputS3BucketName <p>
     *            Amazon S3 bucket name to which the output file will be saved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSpeechSynthesisTaskRequest withOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 key prefix for the output speech file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-zA-Z\/\!\-_\.\*\'\(\):;\$@=+\,\?&]{0,800}$<br/>
     *
     * @return <p>
     *         The Amazon S3 key prefix for the output speech file.
     *         </p>
     */
    public String getOutputS3KeyPrefix() {
        return outputS3KeyPrefix;
    }

    /**
     * <p>
     * The Amazon S3 key prefix for the output speech file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-zA-Z\/\!\-_\.\*\'\(\):;\$@=+\,\?&]{0,800}$<br/>
     *
     * @param outputS3KeyPrefix <p>
     *            The Amazon S3 key prefix for the output speech file.
     *            </p>
     */
    public void setOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    /**
     * <p>
     * The Amazon S3 key prefix for the output speech file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-zA-Z\/\!\-_\.\*\'\(\):;\$@=+\,\?&]{0,800}$<br/>
     *
     * @param outputS3KeyPrefix <p>
     *            The Amazon S3 key prefix for the output speech file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSpeechSynthesisTaskRequest withOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
        return this;
    }

    /**
     * <p>
     * The audio frequency specified in Hz.
     * </p>
     * <p>
     * The valid values for mp3 and ogg_vorbis are "8000", "16000", "22050", and
     * "24000". The default value for standard voices is "22050". The default
     * value for neural voices is "24000".
     * </p>
     * <p>
     * Valid values for pcm are "8000" and "16000" The default value is "16000".
     * </p>
     *
     * @return <p>
     *         The audio frequency specified in Hz.
     *         </p>
     *         <p>
     *         The valid values for mp3 and ogg_vorbis are "8000", "16000",
     *         "22050", and "24000". The default value for standard voices is
     *         "22050". The default value for neural voices is "24000".
     *         </p>
     *         <p>
     *         Valid values for pcm are "8000" and "16000" The default value is
     *         "16000".
     *         </p>
     */
    public String getSampleRate() {
        return sampleRate;
    }

    /**
     * <p>
     * The audio frequency specified in Hz.
     * </p>
     * <p>
     * The valid values for mp3 and ogg_vorbis are "8000", "16000", "22050", and
     * "24000". The default value for standard voices is "22050". The default
     * value for neural voices is "24000".
     * </p>
     * <p>
     * Valid values for pcm are "8000" and "16000" The default value is "16000".
     * </p>
     *
     * @param sampleRate <p>
     *            The audio frequency specified in Hz.
     *            </p>
     *            <p>
     *            The valid values for mp3 and ogg_vorbis are "8000", "16000",
     *            "22050", and "24000". The default value for standard voices is
     *            "22050". The default value for neural voices is "24000".
     *            </p>
     *            <p>
     *            Valid values for pcm are "8000" and "16000" The default value
     *            is "16000".
     *            </p>
     */
    public void setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * <p>
     * The audio frequency specified in Hz.
     * </p>
     * <p>
     * The valid values for mp3 and ogg_vorbis are "8000", "16000", "22050", and
     * "24000". The default value for standard voices is "22050". The default
     * value for neural voices is "24000".
     * </p>
     * <p>
     * Valid values for pcm are "8000" and "16000" The default value is "16000".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleRate <p>
     *            The audio frequency specified in Hz.
     *            </p>
     *            <p>
     *            The valid values for mp3 and ogg_vorbis are "8000", "16000",
     *            "22050", and "24000". The default value for standard voices is
     *            "22050". The default value for neural voices is "24000".
     *            </p>
     *            <p>
     *            Valid values for pcm are "8000" and "16000" The default value
     *            is "16000".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSpeechSynthesisTaskRequest withSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    /**
     * <p>
     * ARN for the SNS topic optionally used for providing status notification
     * for a speech synthesis task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws(-(cn|iso(-b)?|us-gov))?:sns:[a-z0-
     * 9_-]{1,50}:\d{12}:[a-zA-Z0-9_-]{1,256}$<br/>
     *
     * @return <p>
     *         ARN for the SNS topic optionally used for providing status
     *         notification for a speech synthesis task.
     *         </p>
     */
    public String getSnsTopicArn() {
        return snsTopicArn;
    }

    /**
     * <p>
     * ARN for the SNS topic optionally used for providing status notification
     * for a speech synthesis task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws(-(cn|iso(-b)?|us-gov))?:sns:[a-z0-
     * 9_-]{1,50}:\d{12}:[a-zA-Z0-9_-]{1,256}$<br/>
     *
     * @param snsTopicArn <p>
     *            ARN for the SNS topic optionally used for providing status
     *            notification for a speech synthesis task.
     *            </p>
     */
    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * ARN for the SNS topic optionally used for providing status notification
     * for a speech synthesis task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws(-(cn|iso(-b)?|us-gov))?:sns:[a-z0-
     * 9_-]{1,50}:\d{12}:[a-zA-Z0-9_-]{1,256}$<br/>
     *
     * @param snsTopicArn <p>
     *            ARN for the SNS topic optionally used for providing status
     *            notification for a speech synthesis task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSpeechSynthesisTaskRequest withSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
        return this;
    }

    /**
     * <p>
     * The type of speech marks returned for the input text.
     * </p>
     *
     * @return <p>
     *         The type of speech marks returned for the input text.
     *         </p>
     */
    public java.util.List<String> getSpeechMarkTypes() {
        return speechMarkTypes;
    }

    /**
     * <p>
     * The type of speech marks returned for the input text.
     * </p>
     *
     * @param speechMarkTypes <p>
     *            The type of speech marks returned for the input text.
     *            </p>
     */
    public void setSpeechMarkTypes(java.util.Collection<String> speechMarkTypes) {
        if (speechMarkTypes == null) {
            this.speechMarkTypes = null;
            return;
        }

        this.speechMarkTypes = new java.util.ArrayList<String>(speechMarkTypes);
    }

    /**
     * <p>
     * The type of speech marks returned for the input text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param speechMarkTypes <p>
     *            The type of speech marks returned for the input text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSpeechSynthesisTaskRequest withSpeechMarkTypes(String... speechMarkTypes) {
        if (getSpeechMarkTypes() == null) {
            this.speechMarkTypes = new java.util.ArrayList<String>(speechMarkTypes.length);
        }
        for (String value : speechMarkTypes) {
            this.speechMarkTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The type of speech marks returned for the input text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param speechMarkTypes <p>
     *            The type of speech marks returned for the input text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSpeechSynthesisTaskRequest withSpeechMarkTypes(
            java.util.Collection<String> speechMarkTypes) {
        setSpeechMarkTypes(speechMarkTypes);
        return this;
    }

    /**
     * <p>
     * The input text to synthesize. If you specify ssml as the TextType, follow
     * the SSML format for the input text.
     * </p>
     *
     * @return <p>
     *         The input text to synthesize. If you specify ssml as the
     *         TextType, follow the SSML format for the input text.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The input text to synthesize. If you specify ssml as the TextType, follow
     * the SSML format for the input text.
     * </p>
     *
     * @param text <p>
     *            The input text to synthesize. If you specify ssml as the
     *            TextType, follow the SSML format for the input text.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The input text to synthesize. If you specify ssml as the TextType, follow
     * the SSML format for the input text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param text <p>
     *            The input text to synthesize. If you specify ssml as the
     *            TextType, follow the SSML format for the input text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartSpeechSynthesisTaskRequest withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value
     * is plain text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssml, text
     *
     * @return <p>
     *         Specifies whether the input text is plain text or SSML. The
     *         default value is plain text.
     *         </p>
     * @see TextType
     */
    public String getTextType() {
        return textType;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value
     * is plain text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssml, text
     *
     * @param textType <p>
     *            Specifies whether the input text is plain text or SSML. The
     *            default value is plain text.
     *            </p>
     * @see TextType
     */
    public void setTextType(String textType) {
        this.textType = textType;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value
     * is plain text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssml, text
     *
     * @param textType <p>
     *            Specifies whether the input text is plain text or SSML. The
     *            default value is plain text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TextType
     */
    public StartSpeechSynthesisTaskRequest withTextType(String textType) {
        this.textType = textType;
        return this;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value
     * is plain text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssml, text
     *
     * @param textType <p>
     *            Specifies whether the input text is plain text or SSML. The
     *            default value is plain text.
     *            </p>
     * @see TextType
     */
    public void setTextType(TextType textType) {
        this.textType = textType.toString();
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value
     * is plain text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssml, text
     *
     * @param textType <p>
     *            Specifies whether the input text is plain text or SSML. The
     *            default value is plain text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TextType
     */
    public StartSpeechSynthesisTaskRequest withTextType(TextType textType) {
        this.textType = textType.toString();
        return this;
    }

    /**
     * <p>
     * Voice ID to use for the synthesis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Aditi, Amy, Astrid, Bianca, Brian, Camila, Carla,
     * Carmen, Celine, Chantal, Conchita, Cristiano, Dora, Emma, Enrique, Ewa,
     * Filiz, Gabrielle, Geraint, Giorgio, Gwyneth, Hans, Ines, Ivy, Jacek, Jan,
     * Joanna, Joey, Justin, Karl, Kendra, Kevin, Kimberly, Lea, Liv, Lotte,
     * Lucia, Lupe, Mads, Maja, Marlene, Mathieu, Matthew, Maxim, Mia, Miguel,
     * Mizuki, Naja, Nicole, Olivia, Penelope, Raveena, Ricardo, Ruben, Russell,
     * Salli, Seoyeon, Takumi, Tatyana, Vicki, Vitoria, Zeina, Zhiyu, Aria,
     * Ayanda
     *
     * @return <p>
     *         Voice ID to use for the synthesis.
     *         </p>
     * @see VoiceId
     */
    public String getVoiceId() {
        return voiceId;
    }

    /**
     * <p>
     * Voice ID to use for the synthesis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Aditi, Amy, Astrid, Bianca, Brian, Camila, Carla,
     * Carmen, Celine, Chantal, Conchita, Cristiano, Dora, Emma, Enrique, Ewa,
     * Filiz, Gabrielle, Geraint, Giorgio, Gwyneth, Hans, Ines, Ivy, Jacek, Jan,
     * Joanna, Joey, Justin, Karl, Kendra, Kevin, Kimberly, Lea, Liv, Lotte,
     * Lucia, Lupe, Mads, Maja, Marlene, Mathieu, Matthew, Maxim, Mia, Miguel,
     * Mizuki, Naja, Nicole, Olivia, Penelope, Raveena, Ricardo, Ruben, Russell,
     * Salli, Seoyeon, Takumi, Tatyana, Vicki, Vitoria, Zeina, Zhiyu, Aria,
     * Ayanda
     *
     * @param voiceId <p>
     *            Voice ID to use for the synthesis.
     *            </p>
     * @see VoiceId
     */
    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * <p>
     * Voice ID to use for the synthesis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Aditi, Amy, Astrid, Bianca, Brian, Camila, Carla,
     * Carmen, Celine, Chantal, Conchita, Cristiano, Dora, Emma, Enrique, Ewa,
     * Filiz, Gabrielle, Geraint, Giorgio, Gwyneth, Hans, Ines, Ivy, Jacek, Jan,
     * Joanna, Joey, Justin, Karl, Kendra, Kevin, Kimberly, Lea, Liv, Lotte,
     * Lucia, Lupe, Mads, Maja, Marlene, Mathieu, Matthew, Maxim, Mia, Miguel,
     * Mizuki, Naja, Nicole, Olivia, Penelope, Raveena, Ricardo, Ruben, Russell,
     * Salli, Seoyeon, Takumi, Tatyana, Vicki, Vitoria, Zeina, Zhiyu, Aria,
     * Ayanda
     *
     * @param voiceId <p>
     *            Voice ID to use for the synthesis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VoiceId
     */
    public StartSpeechSynthesisTaskRequest withVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }

    /**
     * <p>
     * Voice ID to use for the synthesis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Aditi, Amy, Astrid, Bianca, Brian, Camila, Carla,
     * Carmen, Celine, Chantal, Conchita, Cristiano, Dora, Emma, Enrique, Ewa,
     * Filiz, Gabrielle, Geraint, Giorgio, Gwyneth, Hans, Ines, Ivy, Jacek, Jan,
     * Joanna, Joey, Justin, Karl, Kendra, Kevin, Kimberly, Lea, Liv, Lotte,
     * Lucia, Lupe, Mads, Maja, Marlene, Mathieu, Matthew, Maxim, Mia, Miguel,
     * Mizuki, Naja, Nicole, Olivia, Penelope, Raveena, Ricardo, Ruben, Russell,
     * Salli, Seoyeon, Takumi, Tatyana, Vicki, Vitoria, Zeina, Zhiyu, Aria,
     * Ayanda
     *
     * @param voiceId <p>
     *            Voice ID to use for the synthesis.
     *            </p>
     * @see VoiceId
     */
    public void setVoiceId(VoiceId voiceId) {
        this.voiceId = voiceId.toString();
    }

    /**
     * <p>
     * Voice ID to use for the synthesis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Aditi, Amy, Astrid, Bianca, Brian, Camila, Carla,
     * Carmen, Celine, Chantal, Conchita, Cristiano, Dora, Emma, Enrique, Ewa,
     * Filiz, Gabrielle, Geraint, Giorgio, Gwyneth, Hans, Ines, Ivy, Jacek, Jan,
     * Joanna, Joey, Justin, Karl, Kendra, Kevin, Kimberly, Lea, Liv, Lotte,
     * Lucia, Lupe, Mads, Maja, Marlene, Mathieu, Matthew, Maxim, Mia, Miguel,
     * Mizuki, Naja, Nicole, Olivia, Penelope, Raveena, Ricardo, Ruben, Russell,
     * Salli, Seoyeon, Takumi, Tatyana, Vicki, Vitoria, Zeina, Zhiyu, Aria,
     * Ayanda
     *
     * @param voiceId <p>
     *            Voice ID to use for the synthesis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VoiceId
     */
    public StartSpeechSynthesisTaskRequest withVoiceId(VoiceId voiceId) {
        this.voiceId = voiceId.toString();
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
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getLexiconNames() != null)
            sb.append("LexiconNames: " + getLexiconNames() + ",");
        if (getOutputFormat() != null)
            sb.append("OutputFormat: " + getOutputFormat() + ",");
        if (getOutputS3BucketName() != null)
            sb.append("OutputS3BucketName: " + getOutputS3BucketName() + ",");
        if (getOutputS3KeyPrefix() != null)
            sb.append("OutputS3KeyPrefix: " + getOutputS3KeyPrefix() + ",");
        if (getSampleRate() != null)
            sb.append("SampleRate: " + getSampleRate() + ",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: " + getSnsTopicArn() + ",");
        if (getSpeechMarkTypes() != null)
            sb.append("SpeechMarkTypes: " + getSpeechMarkTypes() + ",");
        if (getText() != null)
            sb.append("Text: " + getText() + ",");
        if (getTextType() != null)
            sb.append("TextType: " + getTextType() + ",");
        if (getVoiceId() != null)
            sb.append("VoiceId: " + getVoiceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getLexiconNames() == null) ? 0 : getLexiconNames().hashCode());
        hashCode = prime * hashCode
                + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        hashCode = prime * hashCode
                + ((getOutputS3BucketName() == null) ? 0 : getOutputS3BucketName().hashCode());
        hashCode = prime * hashCode
                + ((getOutputS3KeyPrefix() == null) ? 0 : getOutputS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode
                + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode
                + ((getSpeechMarkTypes() == null) ? 0 : getSpeechMarkTypes().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getTextType() == null) ? 0 : getTextType().hashCode());
        hashCode = prime * hashCode + ((getVoiceId() == null) ? 0 : getVoiceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSpeechSynthesisTaskRequest == false)
            return false;
        StartSpeechSynthesisTaskRequest other = (StartSpeechSynthesisTaskRequest) obj;

        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLexiconNames() == null ^ this.getLexiconNames() == null)
            return false;
        if (other.getLexiconNames() != null
                && other.getLexiconNames().equals(this.getLexiconNames()) == false)
            return false;
        if (other.getOutputFormat() == null ^ this.getOutputFormat() == null)
            return false;
        if (other.getOutputFormat() != null
                && other.getOutputFormat().equals(this.getOutputFormat()) == false)
            return false;
        if (other.getOutputS3BucketName() == null ^ this.getOutputS3BucketName() == null)
            return false;
        if (other.getOutputS3BucketName() != null
                && other.getOutputS3BucketName().equals(this.getOutputS3BucketName()) == false)
            return false;
        if (other.getOutputS3KeyPrefix() == null ^ this.getOutputS3KeyPrefix() == null)
            return false;
        if (other.getOutputS3KeyPrefix() != null
                && other.getOutputS3KeyPrefix().equals(this.getOutputS3KeyPrefix()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null
                && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null
                && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getSpeechMarkTypes() == null ^ this.getSpeechMarkTypes() == null)
            return false;
        if (other.getSpeechMarkTypes() != null
                && other.getSpeechMarkTypes().equals(this.getSpeechMarkTypes()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getTextType() == null ^ this.getTextType() == null)
            return false;
        if (other.getTextType() != null && other.getTextType().equals(this.getTextType()) == false)
            return false;
        if (other.getVoiceId() == null ^ this.getVoiceId() == null)
            return false;
        if (other.getVoiceId() != null && other.getVoiceId().equals(this.getVoiceId()) == false)
            return false;
        return true;
    }
}
