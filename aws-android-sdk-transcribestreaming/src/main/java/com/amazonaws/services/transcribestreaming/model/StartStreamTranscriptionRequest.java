/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribestreaming.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts a bidirectional HTTP2 stream where audio is streamed to Amazon
 * Transcribe and the transcription results are streamed to your application.
 * </p>
 * <p>
 * The following are encoded as HTTP2 headers:
 * </p>
 * <ul>
 * <li>
 * <p>
 * x-amzn-transcribe-language-code
 * </p>
 * </li>
 * <li>
 * <p>
 * x-amzn-transcribe-media-encoding
 * </p>
 * </li>
 * <li>
 * <p>
 * x-amzn-transcribe-sample-rate
 * </p>
 * </li>
 * <li>
 * <p>
 * x-amzn-transcribe-session-id
 * </p>
 * </li>
 * </ul>
 */
public class StartStreamTranscriptionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Indicates the source language used in the input audio stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, es-US, fr-CA, fr-FR, en-AU
     */
    private String languageCode;

    /**
     * <p>
     * The sample rate, in Hertz, of the input audio. We suggest that you use
     * 8000 Hz for low quality audio and 16000 Hz for high quality audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     */
    private Integer mediaSampleRateHertz;

    /**
     * <p>
     * The encoding used for the input audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pcm
     */
    private String mediaEncoding;

    /**
     * <p>
     * The name of the vocabulary to use when processing the transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyName;

    /**
     * <p>
     * A identifier for the transcription session. Use this parameter when you
     * want to retry a session. If you don't provide a session ID, Amazon
     * Transcribe will generate one for you and return it in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4
     * }-[a-fA-F0-9]{12}<br/>
     */
    private String sessionId;

    /**
     * <p>
     * PCM-encoded stream of audio blobs. The audio stream is encoded as an
     * HTTP2 data frame.
     * </p>
     */
    private AudioStream audioStream;

    /**
     * <p>
     * The name of the vocabulary filter you've created that is unique to your
     * AWS accountf. Provide the name in this field to successfully use it in a
     * stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyFilterName;

    /**
     * <p>
     * The manner in which you use your vocabulary filter to filter words in
     * your transcript. <code>Remove</code> removes filtered words from your
     * transcription results. <code>Mask</code> masks those words with a
     * <code>***</code> in your transcription results. <code>Tag</code> keeps
     * the filtered words in your transcription results and tags them. The tag
     * appears as <code>VocabularyFilterMatch</code> equal to <code>True</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     */
    private String vocabularyFilterMethod;

    /**
     * <p>
     * Indicates the source language used in the input audio stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, es-US, fr-CA, fr-FR, en-AU
     *
     * @return <p>
     *         Indicates the source language used in the input audio stream.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * Indicates the source language used in the input audio stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, es-US, fr-CA, fr-FR, en-AU
     *
     * @param languageCode <p>
     *            Indicates the source language used in the input audio stream.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * Indicates the source language used in the input audio stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, es-US, fr-CA, fr-FR, en-AU
     *
     * @param languageCode <p>
     *            Indicates the source language used in the input audio stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public StartStreamTranscriptionRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * Indicates the source language used in the input audio stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, es-US, fr-CA, fr-FR, en-AU
     *
     * @param languageCode <p>
     *            Indicates the source language used in the input audio stream.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * Indicates the source language used in the input audio stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, es-US, fr-CA, fr-FR, en-AU
     *
     * @param languageCode <p>
     *            Indicates the source language used in the input audio stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public StartStreamTranscriptionRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the input audio. We suggest that you use
     * 8000 Hz for low quality audio and 16000 Hz for high quality audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @return <p>
     *         The sample rate, in Hertz, of the input audio. We suggest that
     *         you use 8000 Hz for low quality audio and 16000 Hz for high
     *         quality audio.
     *         </p>
     */
    public Integer getMediaSampleRateHertz() {
        return mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the input audio. We suggest that you use
     * 8000 Hz for low quality audio and 16000 Hz for high quality audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate, in Hertz, of the input audio. We suggest that
     *            you use 8000 Hz for low quality audio and 16000 Hz for high
     *            quality audio.
     *            </p>
     */
    public void setMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the input audio. We suggest that you use
     * 8000 Hz for low quality audio and 16000 Hz for high quality audio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate, in Hertz, of the input audio. We suggest that
     *            you use 8000 Hz for low quality audio and 16000 Hz for high
     *            quality audio.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartStreamTranscriptionRequest withMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
        return this;
    }

    /**
     * <p>
     * The encoding used for the input audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pcm
     *
     * @return <p>
     *         The encoding used for the input audio.
     *         </p>
     * @see MediaEncoding
     */
    public String getMediaEncoding() {
        return mediaEncoding;
    }

    /**
     * <p>
     * The encoding used for the input audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pcm
     *
     * @param mediaEncoding <p>
     *            The encoding used for the input audio.
     *            </p>
     * @see MediaEncoding
     */
    public void setMediaEncoding(String mediaEncoding) {
        this.mediaEncoding = mediaEncoding;
    }

    /**
     * <p>
     * The encoding used for the input audio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pcm
     *
     * @param mediaEncoding <p>
     *            The encoding used for the input audio.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MediaEncoding
     */
    public StartStreamTranscriptionRequest withMediaEncoding(String mediaEncoding) {
        this.mediaEncoding = mediaEncoding;
        return this;
    }

    /**
     * <p>
     * The encoding used for the input audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pcm
     *
     * @param mediaEncoding <p>
     *            The encoding used for the input audio.
     *            </p>
     * @see MediaEncoding
     */
    public void setMediaEncoding(MediaEncoding mediaEncoding) {
        this.mediaEncoding = mediaEncoding.toString();
    }

    /**
     * <p>
     * The encoding used for the input audio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pcm
     *
     * @param mediaEncoding <p>
     *            The encoding used for the input audio.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MediaEncoding
     */
    public StartStreamTranscriptionRequest withMediaEncoding(MediaEncoding mediaEncoding) {
        this.mediaEncoding = mediaEncoding.toString();
        return this;
    }

    /**
     * <p>
     * The name of the vocabulary to use when processing the transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the vocabulary to use when processing the
     *         transcription job.
     *         </p>
     */
    public String getVocabularyName() {
        return vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary to use when processing the transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyName <p>
     *            The name of the vocabulary to use when processing the
     *            transcription job.
     *            </p>
     */
    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary to use when processing the transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyName <p>
     *            The name of the vocabulary to use when processing the
     *            transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartStreamTranscriptionRequest withVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
        return this;
    }

    /**
     * <p>
     * A identifier for the transcription session. Use this parameter when you
     * want to retry a session. If you don't provide a session ID, Amazon
     * Transcribe will generate one for you and return it in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4
     * }-[a-fA-F0-9]{12}<br/>
     *
     * @return <p>
     *         A identifier for the transcription session. Use this parameter
     *         when you want to retry a session. If you don't provide a session
     *         ID, Amazon Transcribe will generate one for you and return it in
     *         the response.
     *         </p>
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * <p>
     * A identifier for the transcription session. Use this parameter when you
     * want to retry a session. If you don't provide a session ID, Amazon
     * Transcribe will generate one for you and return it in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4
     * }-[a-fA-F0-9]{12}<br/>
     *
     * @param sessionId <p>
     *            A identifier for the transcription session. Use this parameter
     *            when you want to retry a session. If you don't provide a
     *            session ID, Amazon Transcribe will generate one for you and
     *            return it in the response.
     *            </p>
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * A identifier for the transcription session. Use this parameter when you
     * want to retry a session. If you don't provide a session ID, Amazon
     * Transcribe will generate one for you and return it in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4
     * }-[a-fA-F0-9]{12}<br/>
     *
     * @param sessionId <p>
     *            A identifier for the transcription session. Use this parameter
     *            when you want to retry a session. If you don't provide a
     *            session ID, Amazon Transcribe will generate one for you and
     *            return it in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartStreamTranscriptionRequest withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * <p>
     * PCM-encoded stream of audio blobs. The audio stream is encoded as an
     * HTTP2 data frame.
     * </p>
     *
     * @return <p>
     *         PCM-encoded stream of audio blobs. The audio stream is encoded as
     *         an HTTP2 data frame.
     *         </p>
     */
    public AudioStream getAudioStream() {
        return audioStream;
    }

    /**
     * <p>
     * PCM-encoded stream of audio blobs. The audio stream is encoded as an
     * HTTP2 data frame.
     * </p>
     *
     * @param audioStream <p>
     *            PCM-encoded stream of audio blobs. The audio stream is encoded
     *            as an HTTP2 data frame.
     *            </p>
     */
    public void setAudioStream(AudioStream audioStream) {
        this.audioStream = audioStream;
    }

    /**
     * <p>
     * PCM-encoded stream of audio blobs. The audio stream is encoded as an
     * HTTP2 data frame.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioStream <p>
     *            PCM-encoded stream of audio blobs. The audio stream is encoded
     *            as an HTTP2 data frame.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartStreamTranscriptionRequest withAudioStream(AudioStream audioStream) {
        this.audioStream = audioStream;
        return this;
    }

    /**
     * <p>
     * The name of the vocabulary filter you've created that is unique to your
     * AWS accountf. Provide the name in this field to successfully use it in a
     * stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the vocabulary filter you've created that is unique
     *         to your AWS accountf. Provide the name in this field to
     *         successfully use it in a stream.
     *         </p>
     */
    public String getVocabularyFilterName() {
        return vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter you've created that is unique to your
     * AWS accountf. Provide the name in this field to successfully use it in a
     * stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyFilterName <p>
     *            The name of the vocabulary filter you've created that is
     *            unique to your AWS accountf. Provide the name in this field to
     *            successfully use it in a stream.
     *            </p>
     */
    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter you've created that is unique to your
     * AWS accountf. Provide the name in this field to successfully use it in a
     * stream.
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
     *            The name of the vocabulary filter you've created that is
     *            unique to your AWS accountf. Provide the name in this field to
     *            successfully use it in a stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartStreamTranscriptionRequest withVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
        return this;
    }

    /**
     * <p>
     * The manner in which you use your vocabulary filter to filter words in
     * your transcript. <code>Remove</code> removes filtered words from your
     * transcription results. <code>Mask</code> masks those words with a
     * <code>***</code> in your transcription results. <code>Tag</code> keeps
     * the filtered words in your transcription results and tags them. The tag
     * appears as <code>VocabularyFilterMatch</code> equal to <code>True</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @return <p>
     *         The manner in which you use your vocabulary filter to filter
     *         words in your transcript. <code>Remove</code> removes filtered
     *         words from your transcription results. <code>Mask</code> masks
     *         those words with a <code>***</code> in your transcription
     *         results. <code>Tag</code> keeps the filtered words in your
     *         transcription results and tags them. The tag appears as
     *         <code>VocabularyFilterMatch</code> equal to <code>True</code>
     *         </p>
     * @see VocabularyFilterMethod
     */
    public String getVocabularyFilterMethod() {
        return vocabularyFilterMethod;
    }

    /**
     * <p>
     * The manner in which you use your vocabulary filter to filter words in
     * your transcript. <code>Remove</code> removes filtered words from your
     * transcription results. <code>Mask</code> masks those words with a
     * <code>***</code> in your transcription results. <code>Tag</code> keeps
     * the filtered words in your transcription results and tags them. The tag
     * appears as <code>VocabularyFilterMatch</code> equal to <code>True</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @param vocabularyFilterMethod <p>
     *            The manner in which you use your vocabulary filter to filter
     *            words in your transcript. <code>Remove</code> removes filtered
     *            words from your transcription results. <code>Mask</code> masks
     *            those words with a <code>***</code> in your transcription
     *            results. <code>Tag</code> keeps the filtered words in your
     *            transcription results and tags them. The tag appears as
     *            <code>VocabularyFilterMatch</code> equal to <code>True</code>
     *            </p>
     * @see VocabularyFilterMethod
     */
    public void setVocabularyFilterMethod(String vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod;
    }

    /**
     * <p>
     * The manner in which you use your vocabulary filter to filter words in
     * your transcript. <code>Remove</code> removes filtered words from your
     * transcription results. <code>Mask</code> masks those words with a
     * <code>***</code> in your transcription results. <code>Tag</code> keeps
     * the filtered words in your transcription results and tags them. The tag
     * appears as <code>VocabularyFilterMatch</code> equal to <code>True</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @param vocabularyFilterMethod <p>
     *            The manner in which you use your vocabulary filter to filter
     *            words in your transcript. <code>Remove</code> removes filtered
     *            words from your transcription results. <code>Mask</code> masks
     *            those words with a <code>***</code> in your transcription
     *            results. <code>Tag</code> keeps the filtered words in your
     *            transcription results and tags them. The tag appears as
     *            <code>VocabularyFilterMatch</code> equal to <code>True</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyFilterMethod
     */
    public StartStreamTranscriptionRequest withVocabularyFilterMethod(String vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod;
        return this;
    }

    /**
     * <p>
     * The manner in which you use your vocabulary filter to filter words in
     * your transcript. <code>Remove</code> removes filtered words from your
     * transcription results. <code>Mask</code> masks those words with a
     * <code>***</code> in your transcription results. <code>Tag</code> keeps
     * the filtered words in your transcription results and tags them. The tag
     * appears as <code>VocabularyFilterMatch</code> equal to <code>True</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @param vocabularyFilterMethod <p>
     *            The manner in which you use your vocabulary filter to filter
     *            words in your transcript. <code>Remove</code> removes filtered
     *            words from your transcription results. <code>Mask</code> masks
     *            those words with a <code>***</code> in your transcription
     *            results. <code>Tag</code> keeps the filtered words in your
     *            transcription results and tags them. The tag appears as
     *            <code>VocabularyFilterMatch</code> equal to <code>True</code>
     *            </p>
     * @see VocabularyFilterMethod
     */
    public void setVocabularyFilterMethod(VocabularyFilterMethod vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod.toString();
    }

    /**
     * <p>
     * The manner in which you use your vocabulary filter to filter words in
     * your transcript. <code>Remove</code> removes filtered words from your
     * transcription results. <code>Mask</code> masks those words with a
     * <code>***</code> in your transcription results. <code>Tag</code> keeps
     * the filtered words in your transcription results and tags them. The tag
     * appears as <code>VocabularyFilterMatch</code> equal to <code>True</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @param vocabularyFilterMethod <p>
     *            The manner in which you use your vocabulary filter to filter
     *            words in your transcript. <code>Remove</code> removes filtered
     *            words from your transcription results. <code>Mask</code> masks
     *            those words with a <code>***</code> in your transcription
     *            results. <code>Tag</code> keeps the filtered words in your
     *            transcription results and tags them. The tag appears as
     *            <code>VocabularyFilterMatch</code> equal to <code>True</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyFilterMethod
     */
    public StartStreamTranscriptionRequest withVocabularyFilterMethod(
            VocabularyFilterMethod vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod.toString();
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
        if (getMediaSampleRateHertz() != null)
            sb.append("MediaSampleRateHertz: " + getMediaSampleRateHertz() + ",");
        if (getMediaEncoding() != null)
            sb.append("MediaEncoding: " + getMediaEncoding() + ",");
        if (getVocabularyName() != null)
            sb.append("VocabularyName: " + getVocabularyName() + ",");
        if (getSessionId() != null)
            sb.append("SessionId: " + getSessionId() + ",");
        if (getAudioStream() != null)
            sb.append("AudioStream: " + getAudioStream() + ",");
        if (getVocabularyFilterName() != null)
            sb.append("VocabularyFilterName: " + getVocabularyFilterName() + ",");
        if (getVocabularyFilterMethod() != null)
            sb.append("VocabularyFilterMethod: " + getVocabularyFilterMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getMediaSampleRateHertz() == null) ? 0 : getMediaSampleRateHertz().hashCode());
        hashCode = prime * hashCode
                + ((getMediaEncoding() == null) ? 0 : getMediaEncoding().hashCode());
        hashCode = prime * hashCode
                + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode
                + ((getAudioStream() == null) ? 0 : getAudioStream().hashCode());
        hashCode = prime * hashCode
                + ((getVocabularyFilterName() == null) ? 0 : getVocabularyFilterName().hashCode());
        hashCode = prime
                * hashCode
                + ((getVocabularyFilterMethod() == null) ? 0 : getVocabularyFilterMethod()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartStreamTranscriptionRequest == false)
            return false;
        StartStreamTranscriptionRequest other = (StartStreamTranscriptionRequest) obj;

        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getMediaSampleRateHertz() == null ^ this.getMediaSampleRateHertz() == null)
            return false;
        if (other.getMediaSampleRateHertz() != null
                && other.getMediaSampleRateHertz().equals(this.getMediaSampleRateHertz()) == false)
            return false;
        if (other.getMediaEncoding() == null ^ this.getMediaEncoding() == null)
            return false;
        if (other.getMediaEncoding() != null
                && other.getMediaEncoding().equals(this.getMediaEncoding()) == false)
            return false;
        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null
                && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null
                && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getAudioStream() == null ^ this.getAudioStream() == null)
            return false;
        if (other.getAudioStream() != null
                && other.getAudioStream().equals(this.getAudioStream()) == false)
            return false;
        if (other.getVocabularyFilterName() == null ^ this.getVocabularyFilterName() == null)
            return false;
        if (other.getVocabularyFilterName() != null
                && other.getVocabularyFilterName().equals(this.getVocabularyFilterName()) == false)
            return false;
        if (other.getVocabularyFilterMethod() == null ^ this.getVocabularyFilterMethod() == null)
            return false;
        if (other.getVocabularyFilterMethod() != null
                && other.getVocabularyFilterMethod().equals(this.getVocabularyFilterMethod()) == false)
            return false;
        return true;
    }
}
