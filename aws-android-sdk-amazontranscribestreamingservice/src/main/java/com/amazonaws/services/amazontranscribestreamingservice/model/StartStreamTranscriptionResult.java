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

package com.amazonaws.services.amazontranscribestreamingservice.model;

import java.io.Serializable;

public class StartStreamTranscriptionResult implements Serializable {
    /**
     * <p>
     * An identifier for the streaming transcription.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * The language code for the input audio stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, es-US, fr-CA, fr-FR, en-AU
     */
    private String languageCode;

    /**
     * <p>
     * The sample rate for the input audio stream. Use 8000 Hz for low quality
     * audio and 16000 Hz for high quality audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     */
    private Integer mediaSampleRateHertz;

    /**
     * <p>
     * The encoding used for the input audio stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pcm
     */
    private String mediaEncoding;

    /**
     * <p>
     * The name of the vocabulary used when processing the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyName;

    /**
     * <p>
     * An identifier for a specific transcription session.
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
     * Represents the stream of transcription events from Amazon Transcribe to
     * your application.
     * </p>
     */
    private TranscriptResultStream transcriptResultStream;

    /**
     * <p>
     * An identifier for the streaming transcription.
     * </p>
     *
     * @return <p>
     *         An identifier for the streaming transcription.
     *         </p>
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * <p>
     * An identifier for the streaming transcription.
     * </p>
     *
     * @param requestId <p>
     *            An identifier for the streaming transcription.
     *            </p>
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * An identifier for the streaming transcription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId <p>
     *            An identifier for the streaming transcription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartStreamTranscriptionResult withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * <p>
     * The language code for the input audio stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, es-US, fr-CA, fr-FR, en-AU
     *
     * @return <p>
     *         The language code for the input audio stream.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code for the input audio stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, es-US, fr-CA, fr-FR, en-AU
     *
     * @param languageCode <p>
     *            The language code for the input audio stream.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code for the input audio stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, es-US, fr-CA, fr-FR, en-AU
     *
     * @param languageCode <p>
     *            The language code for the input audio stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public StartStreamTranscriptionResult withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code for the input audio stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, es-US, fr-CA, fr-FR, en-AU
     *
     * @param languageCode <p>
     *            The language code for the input audio stream.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code for the input audio stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, en-GB, es-US, fr-CA, fr-FR, en-AU
     *
     * @param languageCode <p>
     *            The language code for the input audio stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public StartStreamTranscriptionResult withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The sample rate for the input audio stream. Use 8000 Hz for low quality
     * audio and 16000 Hz for high quality audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @return <p>
     *         The sample rate for the input audio stream. Use 8000 Hz for low
     *         quality audio and 16000 Hz for high quality audio.
     *         </p>
     */
    public Integer getMediaSampleRateHertz() {
        return mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate for the input audio stream. Use 8000 Hz for low quality
     * audio and 16000 Hz for high quality audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate for the input audio stream. Use 8000 Hz for
     *            low quality audio and 16000 Hz for high quality audio.
     *            </p>
     */
    public void setMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate for the input audio stream. Use 8000 Hz for low quality
     * audio and 16000 Hz for high quality audio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate for the input audio stream. Use 8000 Hz for
     *            low quality audio and 16000 Hz for high quality audio.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartStreamTranscriptionResult withMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
        return this;
    }

    /**
     * <p>
     * The encoding used for the input audio stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pcm
     *
     * @return <p>
     *         The encoding used for the input audio stream.
     *         </p>
     * @see MediaEncoding
     */
    public String getMediaEncoding() {
        return mediaEncoding;
    }

    /**
     * <p>
     * The encoding used for the input audio stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pcm
     *
     * @param mediaEncoding <p>
     *            The encoding used for the input audio stream.
     *            </p>
     * @see MediaEncoding
     */
    public void setMediaEncoding(String mediaEncoding) {
        this.mediaEncoding = mediaEncoding;
    }

    /**
     * <p>
     * The encoding used for the input audio stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pcm
     *
     * @param mediaEncoding <p>
     *            The encoding used for the input audio stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MediaEncoding
     */
    public StartStreamTranscriptionResult withMediaEncoding(String mediaEncoding) {
        this.mediaEncoding = mediaEncoding;
        return this;
    }

    /**
     * <p>
     * The encoding used for the input audio stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pcm
     *
     * @param mediaEncoding <p>
     *            The encoding used for the input audio stream.
     *            </p>
     * @see MediaEncoding
     */
    public void setMediaEncoding(MediaEncoding mediaEncoding) {
        this.mediaEncoding = mediaEncoding.toString();
    }

    /**
     * <p>
     * The encoding used for the input audio stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pcm
     *
     * @param mediaEncoding <p>
     *            The encoding used for the input audio stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MediaEncoding
     */
    public StartStreamTranscriptionResult withMediaEncoding(MediaEncoding mediaEncoding) {
        this.mediaEncoding = mediaEncoding.toString();
        return this;
    }

    /**
     * <p>
     * The name of the vocabulary used when processing the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the vocabulary used when processing the job.
     *         </p>
     */
    public String getVocabularyName() {
        return vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary used when processing the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyName <p>
     *            The name of the vocabulary used when processing the job.
     *            </p>
     */
    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary used when processing the job.
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
     *            The name of the vocabulary used when processing the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartStreamTranscriptionResult withVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
        return this;
    }

    /**
     * <p>
     * An identifier for a specific transcription session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4
     * }-[a-fA-F0-9]{12}<br/>
     *
     * @return <p>
     *         An identifier for a specific transcription session.
     *         </p>
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * <p>
     * An identifier for a specific transcription session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4
     * }-[a-fA-F0-9]{12}<br/>
     *
     * @param sessionId <p>
     *            An identifier for a specific transcription session.
     *            </p>
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * An identifier for a specific transcription session.
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
     *            An identifier for a specific transcription session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartStreamTranscriptionResult withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * <p>
     * Represents the stream of transcription events from Amazon Transcribe to
     * your application.
     * </p>
     *
     * @return <p>
     *         Represents the stream of transcription events from Amazon
     *         Transcribe to your application.
     *         </p>
     */
    public TranscriptResultStream getTranscriptResultStream() {
        return transcriptResultStream;
    }

    /**
     * <p>
     * Represents the stream of transcription events from Amazon Transcribe to
     * your application.
     * </p>
     *
     * @param transcriptResultStream <p>
     *            Represents the stream of transcription events from Amazon
     *            Transcribe to your application.
     *            </p>
     */
    public void setTranscriptResultStream(TranscriptResultStream transcriptResultStream) {
        this.transcriptResultStream = transcriptResultStream;
    }

    /**
     * <p>
     * Represents the stream of transcription events from Amazon Transcribe to
     * your application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcriptResultStream <p>
     *            Represents the stream of transcription events from Amazon
     *            Transcribe to your application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartStreamTranscriptionResult withTranscriptResultStream(
            TranscriptResultStream transcriptResultStream) {
        this.transcriptResultStream = transcriptResultStream;
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
        if (getRequestId() != null)
            sb.append("RequestId: " + getRequestId() + ",");
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
        if (getTranscriptResultStream() != null)
            sb.append("TranscriptResultStream: " + getTranscriptResultStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getMediaSampleRateHertz() == null) ? 0 : getMediaSampleRateHertz().hashCode());
        hashCode = prime * hashCode
                + ((getMediaEncoding() == null) ? 0 : getMediaEncoding().hashCode());
        hashCode = prime * hashCode
                + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime
                * hashCode
                + ((getTranscriptResultStream() == null) ? 0 : getTranscriptResultStream()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartStreamTranscriptionResult == false)
            return false;
        StartStreamTranscriptionResult other = (StartStreamTranscriptionResult) obj;

        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
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
        if (other.getTranscriptResultStream() == null ^ this.getTranscriptResultStream() == null)
            return false;
        if (other.getTranscriptResultStream() != null
                && other.getTranscriptResultStream().equals(this.getTranscriptResultStream()) == false)
            return false;
        return true;
    }
}
