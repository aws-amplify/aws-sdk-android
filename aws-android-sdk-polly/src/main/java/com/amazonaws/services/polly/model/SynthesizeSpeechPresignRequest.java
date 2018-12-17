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

import com.amazonaws.auth.AWSCredentials;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * Synthesizes UTF-8 input, plain text or SSML, to a pre-signed URL to a stream
 * of bytes. SSML input must be valid, well-formed SSML. Some alphabets might
 * not be available with all the voices (eg. Cyrillic might not be read at all
 * by English voices) unless phoneme mapping is used. For more information, see
 * <a href="http://docs.aws.amazon.com/polly/latest/dg/how-text-to-speech-works.html">
 * How it Works</a>.
 * </p>
 */
public class SynthesizeSpeechPresignRequest implements Serializable {
    /**
     * An optional expiration date at which point the generated pre-signed URL
     * will no longer be accepted by Amazon Polly. If not specified, a default
     * value will be supplied, calculated as 15 minutes from getting
     * the pre-signed URL.
     */
    private Date expiration;

    /**
     * The optional credentials to use for this request - overrides the default
     * credentials set at the client level.
     */
    private AWSCredentials credentials;

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to
     * apply during synthesis. Lexicons are applied only if the language of the
     * lexicon is the same as the language of the voice. For information about
     * storing lexicons, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/API_PutLexicon.html"
     * >PutLexicon</a>.
     * </p>
     */
    private java.util.List<String> lexiconNames;

    /**
     * <p>
     * The audio format in which the resulting stream will be encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, ogg_vorbis, pcm
     */
    private String outputFormat;

    /**
     * <p>
     * The audio frequency specified in Hz.
     * </p>
     * <p>
     * The valid values for <code>mp3</code> and <code>ogg_vorbis</code> are
     * "8000", "16000", and "22050". The default value is "22050".
     * </p>
     * <p>
     * Valid values for <code>pcm</code> are "8000" and "16000" The default
     * value is "16000".
     * </p>
     */
    private String sampleRate;

    /**
     * The new value for the speechMarkTypes property for this object.
     */
    private java.util.List<String> speechMarkTypes;

    /**
     * <p>
     * Input text to synthesize. If you specify <code>ssml</code> as the
     * <code>TextType</code>, follow the SSML format for the input text.
     * </p>
     */
    private String text;

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value
     * is plain text. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using
     * SSML</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssml, text
     */
    private String textType;

    /**
     * <p>
     * Voice ID to use for the synthesis. You can get a list of available voice
     * IDs by calling the <a href=
     * "http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Geraint, Gwyneth, Mads, Naja, Hans, Marlene,
     * Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin,
     * Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope, Chantal,
     * Celine, Mathieu, Dora, Karl, Carla, Giorgio, Mizuki, Liv, Lotte, Ruben,
     * Ewa, Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines, Carmen, Maxim,
     * Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi, Lea, Zhiyu, Bianca,
     * Lucia, Mia
     */
    private String voiceId;

    private String languageCode;

    /**
     * <p>
     * The expiration date at which point the new pre-signed URL will no longer
     * be accepted by Amazon Polly. If not specified, a default value will be
     * supplied.
     * </p>
     *
     * @return The expiration date at which point the new pre-signed URL will no
     *         longer be accepted by Amazon Polly.
     */
    public Date getExpiration() {
        return expiration;
    }

    /**
     * <p>
     * Sets the expiration date at which point the new pre-signed URL will no
     * longer be accepted by Amazon Polly. If not specified, a default value will
     * be supplied.
     * </p>
     *
     * @param expiration The expiration date at which point the new pre-signed
     *            URL will no longer be accepted by Amazon Polly.
     */
    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * Sets the expiration date at which point the new pre-signed URL will no
     * longer be accepted by Amazon Polly. If not specified, a default value
     * will be supplied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.

     *
     * @param expiration The expiration date at which point the new pre-signed
     *            URL will no longer be accepted by Amazon Polly.
     * @return The updated request object, so that additional method calls can be
     *         chained together.
     */
    public SynthesizeSpeechPresignRequest withExpiration(Date expiration) {
        setExpiration(expiration);
        return this;
    }

    /**
     * Sets the optional credentials to use for this request, overriding the
     * default credentials set at the client level.
     *
     * @param credentials The optional AWS security credentials to use for this
     *            request, overriding the default credentials set at the client
     *            level.
     */
    public void setRequestCredentials(AWSCredentials credentials) {
        this.credentials = credentials;
    }

    /**
     * Returns the optional credentials to use to sign this request, overriding
     * the default credentials set at the client level.
     *
     * @return The optional credentials to use to sign this request, overriding
     *         the default credentials set at the client level.
     */
    public AWSCredentials getRequestCredentials() {
        return credentials;
    }

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to
     * apply during synthesis. Lexicons are applied only if the language of the
     * lexicon is the same as the language of the voice. For information about
     * storing lexicons, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/API_PutLexicon.html"
     * >PutLexicon</a>.
     * </p>

     * @return <p>
     *         Lexicon name (returned as a single item of the List) you want
     *         the service to apply during synthesis. Lexicons are applied
     *         only if the language of the lexicon is the same as the language
     *         of the voice. For information about storing lexicons, see
     *         {@link com.amazonaws.services.polly.AmazonPolly#putLexicon(PutLexiconRequest)}.
     *         </p>
     */
    public java.util.List<String> getLexiconNames() {
        return lexiconNames;
    }

    /**
     * <p>
     * List of one or more pronunciation lexicon names you want the service to
     * apply during synthesis. Lexicons are applied only if the language of the
     * lexicon is the same as the language of the voice. For information about
     * storing lexicons, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/API_PutLexicon.html"
     * >PutLexicon</a>.
     * </p>
     * <p>
     * Currently only one lexicon per request is supported by AWS SDK for Android.
     * </p>
     *
     * @param lexiconNames <p>
     *            List of one or more pronunciation lexicon names you want the service to
     *            apply during synthesis. Lexicons are applied only if the language of the
     *            lexicon is the same as the language of the voice. For information about
     *            storing lexicons, see <a
     *            href="http://docs.aws.amazon.com/polly/latest/dg/API_PutLexicon.html"
     *            >PutLexicon</a>.
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
     * lexicon is the same as the language of the voice. For information about
     * storing lexicons, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/API_PutLexicon.html"
     * >PutLexicon</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * </p>
     * <p>
     * Currently only one lexicon per request is supported by AWS SDK for Android.
     * </p>
     *
     * @param lexiconNames <p>
     *            List of one or more pronunciation lexicon names you want the service to
     *            apply during synthesis. Lexicons are applied only if the language of the
     *            lexicon is the same as the language of the voice. For information about
     *            storing lexicons, see <a
     *            href="http://docs.aws.amazon.com/polly/latest/dg/API_PutLexicon.html"
     *            >PutLexicon</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesizeSpeechPresignRequest withLexiconNames(String... lexiconNames) {
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
     * lexicon is the same as the language of the voice. For information about
     * storing lexicons, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/API_PutLexicon.html"
     * >PutLexicon</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * </p>
     * <p>
     * Currently only one lexicon per request is supported by AWS SDK for Android.
     * </p>
     *
     * @param lexiconNames <p>
     *            List of one or more pronunciation lexicon names you want the service to
     *            apply during synthesis. Lexicons are applied only if the language of the
     *            lexicon is the same as the language of the voice. For information about
     *            storing lexicons, see <a
     *            href="http://docs.aws.amazon.com/polly/latest/dg/API_PutLexicon.html"
     *            >PutLexicon</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesizeSpeechPresignRequest withLexiconNames(java.util.Collection<String> lexiconNames) {
        setLexiconNames(lexiconNames);
        return this;
    }

    /**
     * <p>
     * The audio format in which the resulting stream will be encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, ogg_vorbis, pcm
     *
     * @return <p>
     *         The audio format in which the resulting stream will be encoded.
     *         </p>
     * @see OutputFormat
     */
    public String getOutputFormat() {
        return outputFormat;
    }

    /**
     * <p>
     * The audio format in which the resulting stream will be encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, ogg_vorbis, pcm
     *
     * @param outputFormat <p>
     *            The audio format in which the resulting stream will be
     *            encoded.
     *            </p>
     * @see OutputFormat
     */
    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * <p>
     * The audio format in which the resulting stream will be encoded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, ogg_vorbis, pcm
     *
     * @param outputFormat <p>
     *            The audio format in which the resulting stream will be
     *            encoded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OutputFormat
     */
    public SynthesizeSpeechPresignRequest withOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }

    /**
     * <p>
     * The audio format in which the resulting stream will be encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, ogg_vorbis, pcm
     *
     * @param outputFormat <p>
     *            The audio format in which the resulting stream will be
     *            encoded.
     *            </p>
     * @see OutputFormat
     */
    public void setOutputFormat(OutputFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
    }

    /**
     * <p>
     * The audio format in which the resulting stream will be encoded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, ogg_vorbis, pcm
     *
     * @param outputFormat <p>
     *            The audio format in which the resulting stream will be
     *            encoded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OutputFormat
     */
    public SynthesizeSpeechPresignRequest withOutputFormat(OutputFormat outputFormat) {
        this.outputFormat = outputFormat.toString();
        return this;
    }

    /**
     * <p>
     * The audio frequency specified in Hz.
     * </p>
     * <p>
     * The valid values for <code>mp3</code> and <code>ogg_vorbis</code> are
     * "8000", "16000", and "22050". The default value is "22050".
     * </p>
     * <p>
     * Valid values for <code>pcm</code> are "8000" and "16000" The default
     * value is "16000".
     * </p>
     *
     * @return <p>
     *         The audio frequency specified in Hz.
     *         </p>
     *         <p>
     *         The valid values for <code>mp3</code> and <code>ogg_vorbis</code>
     *         are "8000", "16000", and "22050". The default value is "22050".
     *         </p>
     *         <p>
     *         Valid values for <code>pcm</code> are "8000" and "16000". The
     *         default value is "16000".
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
     * The valid values for <code>mp3</code> and <code>ogg_vorbis</code> are
     * "8000", "16000", and "22050". The default value is "22050".
     * </p>
     * <p>
     * Valid values for <code>pcm</code> are "8000" and "16000". The default
     * value is "16000".
     * </p>
     *
     * @param sampleRate <p>
     *            The audio frequency specified in Hz.
     *            </p>
     *            <p>
     *            The valid values for <code>mp3</code> and
     *            <code>ogg_vorbis</code> are "8000", "16000", and "22050". The
     *            default value is "22050".
     *            </p>
     *            <p>
     *            Valid values for <code>pcm</code> are "8000" and "16000". The
     *            default value is "16000".
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
     * The valid values for <code>mp3</code> and <code>ogg_vorbis</code> are
     * "8000", "16000", and "22050". The default value is "22050".
     * </p>
     * <p>
     * Valid values for <code>pcm</code> are "8000" and "16000". The default
     * value is "16000".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampleRate <p>
     *            The audio frequency specified in Hz.
     *            </p>
     *            <p>
     *            The valid values for <code>mp3</code> and
     *            <code>ogg_vorbis</code> are "8000", "16000", and "22050". The
     *            default value is "22050".
     *            </p>
     *            <p>
     *            Valid values for <code>pcm</code> are "8000" and "16000". The
     *            default value is "16000".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesizeSpeechPresignRequest withSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    /**
     * Returns the value of the speechMarkTypes property for this object.
     *
     * @return The value of the speechMarkTypes property for this object.
     */
    public java.util.List<String> getSpeechMarkTypes() {
        return speechMarkTypes;
    }

    /**
     * Sets the value of speechMarkTypes
     *
     * @param speechMarkTypes The new value for the speechMarkTypes property for
     *            this object.
     */
    public void setSpeechMarkTypes(java.util.Collection<String> speechMarkTypes) {
        if (speechMarkTypes == null) {
            this.speechMarkTypes = null;
            return;
        }

        this.speechMarkTypes = new java.util.ArrayList<String>(speechMarkTypes);
    }

    /**
     * Sets the value of the speechMarkTypes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param speechMarkTypes The new value for the speechMarkTypes property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesizeSpeechPresignRequest withSpeechMarkTypes(String... speechMarkTypes) {
        if (getSpeechMarkTypes() == null) {
            this.speechMarkTypes = new java.util.ArrayList<String>(speechMarkTypes.length);
        }
        for (String value : speechMarkTypes) {
            this.speechMarkTypes.add(value);
        }
        return this;
    }

    /**
     * Sets the value of the speechMarkTypes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param speechMarkTypes The new value for the speechMarkTypes property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesizeSpeechPresignRequest withSpeechMarkTypes(java.util.Collection<String> speechMarkTypes) {
        setSpeechMarkTypes(speechMarkTypes);
        return this;
    }

    /**
     * <p>
     * Input text to synthesize. If you specify <code>ssml</code> as the
     * <code>TextType</code>, follow the SSML format for the input text.
     * </p>
     *
     * @return <p>
     *         Input text to synthesize. If you specify <code>ssml</code> as the
     *         <code>TextType</code>, follow the SSML format for the input text.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * Input text to synthesize. If you specify <code>ssml</code> as the
     * <code>TextType</code>, follow the SSML format for the input text.
     * </p>
     *
     * @param text <p>
     *            Input text to synthesize. If you specify <code>ssml</code> as
     *            the <code>TextType</code>, follow the SSML format for the
     *            input text.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * Input text to synthesize. If you specify <code>ssml</code> as the
     * <code>TextType</code>, follow the SSML format for the input text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param text <p>
     *            Input text to synthesize. If you specify <code>ssml</code> as
     *            the <code>TextType</code>, follow the SSML format for the
     *            input text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SynthesizeSpeechPresignRequest withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value
     * is plain text. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using
     * SSML</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssml, text
     *
     * @return <p>
     *         Specifies whether the input text is plain text or SSML. The default value
     *         is plain text. For more information, see <a
     *         href="http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using
     *         SSML</a>.
     *         </p>
     * @see TextType
     */
    public String getTextType() {
        return textType;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value
     * is plain text. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using
     * SSML</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssml, text
     *
     * @param textType <p>
     *            Specifies whether the input text is plain text or SSML. The
     *            default value is plain text. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using
     *            SSML</a>.
     *            </p>
     * @see TextType
     */
    public void setTextType(String textType) {
        this.textType = textType;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value
     * is plain text. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using
     * SSML</a>.
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
     *            default value is plain text. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using
     *            SSML</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TextType
     */
    public SynthesizeSpeechPresignRequest withTextType(String textType) {
        this.textType = textType;
        return this;
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value
     * is plain text. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using
     * SSML</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssml, text
     *
     * @param textType <p>
     *            Specifies whether the input text is plain text or SSML. The
     *            default value is plain text. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using
     *            SSML</a>.
     *            </p>
     * @see TextType
     */
    public void setTextType(TextType textType) {
        this.textType = textType.toString();
    }

    /**
     * <p>
     * Specifies whether the input text is plain text or SSML. The default value
     * is plain text. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using
     * SSML</a>.
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
     *            default value is plain text. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/polly/latest/dg/ssml.html">Using
     *            SSML</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TextType
     */
    public SynthesizeSpeechPresignRequest withTextType(TextType textType) {
        this.textType = textType.toString();
        return this;
    }

    /**
     * <p>
     * Voice ID to use for the synthesis. You can get a list of available voice
     * IDs by calling the <a href=
     * "http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Geraint, Gwyneth, Mads, Naja, Hans, Marlene,
     * Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin,
     * Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope, Chantal,
     * Celine, Mathieu, Dora, Karl, Carla, Giorgio, Mizuki, Liv, Lotte, Ruben,
     * Ewa, Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines, Carmen, Maxim,
     * Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi, Lea, Zhiyu, Bianca,
     * Lucia, Mia
     *
     * @return <p>
     *         Voice ID to use for the synthesis. You can get a list of
     *         available voice IDs by calling the <a href=
     *         "http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     *         >DescribeVoices</a> operation.
     *         </p>
     * @see VoiceId
     */
    public String getVoiceId() {
        return voiceId;
    }

    /**
     * <p>
     * Optional language code for the Synthesize Speech request. This is only
     * necessary if using a bilingual voice, such as Aditi, which can be used
     * for either Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon
     * Polly will use the default language of the bilingual voice. The default
     * language for any voice is the one returned by the <a href=
     * "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation for the <code>LanguageCode</code>
     * parameter. For example, if no language code is specified, Aditi will use
     * Indian English rather than Hindi.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cm-CMN, cy-GB, da-DK, de-DE, en-AU, en-GB, en-GB-WLS,
     * en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT, ja-JP, hi-IN,
     * ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU, sv-SE, tr-TR
     *
     * @return <p>
     *         Optional language code for the Synthesize Speech request. This is
     *         only necessary if using a bilingual voice, such as Aditi, which
     *         can be used for either Indian English (en-IN) or Hindi (hi-IN).
     *         </p>
     *         <p>
     *         If a bilingual voice is used and no language code is specified,
     *         Amazon Polly will use the default language of the bilingual
     *         voice. The default language for any voice is the one returned by
     *         the <a href=
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
     * Voice ID to use for the synthesis. You can get a list of available voice
     * IDs by calling the <a href=
     * "http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Geraint, Gwyneth, Mads, Naja, Hans, Marlene,
     * Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin,
     * Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope, Chantal,
     * Celine, Mathieu, Dora, Karl, Carla, Giorgio, Mizuki, Liv, Lotte, Ruben,
     * Ewa, Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines, Carmen, Maxim,
     * Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi, Lea
     *
     * @param voiceId <p>
     *            Voice ID to use for the synthesis. You can get a list of
     *            available voice IDs by calling the <a href=
     *            "http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     *            >DescribeVoices</a> operation.
     *            </p>
     * @see VoiceId
     */
    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * <p>
     * Optional language code for the Synthesize Speech request. This is only
     * necessary if using a bilingual voice, such as Aditi, which can be used
     * for either Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon
     * Polly will use the default language of the bilingual voice. The default
     * language for any voice is the one returned by the <a href=
     * "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation for the <code>LanguageCode</code>
     * parameter. For example, if no language code is specified, Aditi will use
     * Indian English rather than Hindi.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cm-CMN, cy-GB, da-DK, de-DE, en-AU, en-GB, en-GB-WLS,
     * en-IN, en-US, es-ES, es-MX, es-US, fr-CA, fr-FR, is-IS, it-IT, ja-JP, hi-IN,
     * ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU, sv-SE, tr-TR
     *
     * @param languageCode <p>
     *            Optional language code for the Synthesize Speech request. This
     *            is only necessary if using a bilingual voice, such as Aditi,
     *            which can be used for either Indian English (en-IN) or Hindi
     *            (hi-IN).
     *            </p>
     *            <p>
     *            If a bilingual voice is used and no language code is
     *            specified, Amazon Polly will use the default language of the
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
     * Optional language code for the Synthesize Speech request. This is only
     * necessary if using a bilingual voice, such as Aditi, which can be used
     * for either Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon
     * Polly will use the default language of the bilingual voice. The default
     * language for any voice is the one returned by the <a href=
     * "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation for the <code>LanguageCode</code>
     * parameter. For example, if no language code is specified, Aditi will use
     * Indian English rather than Hindi.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cy-GB, da-DK, de-DE, en-AU, en-GB, en-GB-WLS,
     * en-IN, en-US, es-ES, es-US, fr-CA, fr-FR, is-IS, it-IT, ja-JP, hi-IN,
     * ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU, sv-SE, tr-TR
     *
     * @param languageCode <p>
     *            Optional language code for the Synthesize Speech request. This
     *            is only necessary if using a bilingual voice, such as Aditi,
     *            which can be used for either Indian English (en-IN) or Hindi
     *            (hi-IN).
     *            </p>
     *            <p>
     *            If a bilingual voice is used and no language code is
     *            specified, Amazon Polly will use the default language of the
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
     * Voice ID to use for the synthesis. You can get a list of available voice
     * IDs by calling the <a href=
     * "http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Geraint, Gwyneth, Mads, Naja, Hans, Marlene,
     * Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin,
     * Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope, Chantal,
     * Celine, Mathieu, Dora, Karl, Carla, Giorgio, Liv, Lotte, Ruben, Ewa,
     * Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines, Carmen, Maxim,
     * Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi, Lea
     *
     * @param voiceId <p>
     *            Voice ID to use for the synthesis. You can get a list of
     *            available voice IDs by calling the <a href=
     *            "http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     *            >DescribeVoices</a> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VoiceId
     */
    public SynthesizeSpeechPresignRequest withVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }

    /**
     * <p>
     * Voice ID to use for the synthesis. You can get a list of available voice
     * IDs by calling the <a href=
     * "http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Geraint, Gwyneth, Mads, Naja, Hans, Marlene,
     * Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin,
     * Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope, Chantal,
     * Celine, Mathieu, Dora, Karl, Carla, Giorgio, Mizuki, Liv, Lotte, Ruben,
     * Ewa, Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines, Carmen, Maxim,
     * Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi, Lea
     *
     * @param voiceId <p>
     *            Voice ID to use for the synthesis. You can get a list of
     *            available voice IDs by calling the <a href=
     *            "http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     *            >DescribeVoices</a> operation.
     *            </p>
     * @see VoiceId
     */
    public void setVoiceId(VoiceId voiceId) {
        this.voiceId = voiceId.toString();
    }

    /**
     * <p>
     * Voice ID to use for the synthesis. You can get a list of available voice
     * IDs by calling the <a href=
     * "http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Geraint, Gwyneth, Mads, Naja, Hans, Marlene,
     * Nicole, Russell, Amy, Brian, Emma, Raveena, Ivy, Joanna, Joey, Justin,
     * Kendra, Kimberly, Matthew, Salli, Conchita, Enrique, Miguel, Penelope, Chantal,
     * Celine, Mathieu, Dora, Karl, Carla, Giorgio, Liv, Lotte, Ruben, Ewa,
     * Jacek, Jan, Maja, Ricardo, Vitoria, Cristiano, Ines, Carmen, Maxim,
     * Tatyana, Astrid, Filiz, Vicki, Takumi, Seoyeon, Aditi, Lea
     *
     * @param voiceId <p>
     *            Voice ID to use for the synthesis. You can get a list of
     *            available voice IDs by calling the <a href=
     *            "http://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     *            >DescribeVoices</a> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VoiceId
     */
    public SynthesizeSpeechPresignRequest withVoiceId(VoiceId voiceId) {
        this.voiceId = voiceId.toString();
        return this;
    }

    /**
     * <p>
     * Optional language code for the Synthesize Speech request. This is only
     * necessary if using a bilingual voice, such as Aditi, which can be used
     * for either Indian English (en-IN) or Hindi (hi-IN).
     * </p>
     * <p>
     * If a bilingual voice is used and no language code is specified, Amazon
     * Polly will use the default language of the bilingual voice. The default
     * language for any voice is the one returned by the <a href=
     * "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     * >DescribeVoices</a> operation for the <code>LanguageCode</code>
     * parameter. For example, if no language code is specified, Aditi will use
     * Indian English rather than Hindi.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cy-GB, da-DK, de-DE, en-AU, en-GB, en-GB-WLS,
     * en-IN, en-US, es-ES, es-US, fr-CA, fr-FR, is-IS, it-IT, ja-JP, hi-IN,
     * ko-KR, nb-NO, nl-NL, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU, sv-SE, tr-TR
     *
     * @param languageCode <p>
     *            Optional language code for the Synthesize Speech request. This
     *            is only necessary if using a bilingual voice, such as Aditi,
     *            which can be used for either Indian English (en-IN) or Hindi
     *            (hi-IN).
     *            </p>
     *            <p>
     *            If a bilingual voice is used and no language code is
     *            specified, Amazon Polly will use the default language of the
     *            bilingual voice. The default language for any voice is the one
     *            returned by the <a href=
     *            "https://docs.aws.amazon.com/polly/latest/dg/API_DescribeVoices.html"
     *            >DescribeVoices</a> operation for the
     *            <code>LanguageCode</code> parameter. For example, if no
     *            language code is specified, Aditi will use Indian English
     *            rather than Hindi.
     *            </p>
     * @see LanguageCode
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SynthesizeSpeechPresignRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
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
        if (getLexiconNames() != null)
            sb.append("LexiconNames: " + getLexiconNames() + ",");
        if (getOutputFormat() != null)
            sb.append("OutputFormat: " + getOutputFormat() + ",");
        if (getSampleRate() != null)
            sb.append("SampleRate: " + getSampleRate() + ",");
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

        hashCode = prime * hashCode
                + ((getLexiconNames() == null) ? 0 : getLexiconNames().hashCode());
        hashCode = prime * hashCode
                + ((getOutputFormat() == null) ? 0 : getOutputFormat().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
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

        if (obj instanceof SynthesizeSpeechPresignRequest == false)
            return false;
        SynthesizeSpeechPresignRequest other = (SynthesizeSpeechPresignRequest) obj;

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
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null
                && other.getSampleRate().equals(this.getSampleRate()) == false)
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
