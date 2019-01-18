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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

/**
 * <p>
 * Provides optional settings for the <code>StartTranscriptionJob</code>
 * operation.
 * </p>
 */
public class Settings implements Serializable {
    /**
     * <p>
     * The name of a vocabulary to use when processing the transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyName;

    /**
     * <p>
     * Determines whether the transcription job uses speaker recognition to
     * identify different speakers in the input audio. Speaker recognition
     * labels individual speakers in the audio file. If you set the
     * <code>ShowSpeakerLabels</code> field to true, you must also set the
     * maximum number of speaker labels <code>MaxSpeakerLabels</code> field.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and
     * <code>ChannelIdentification</code> in the same request. If you set both,
     * your request returns a <code>BadRequestException</code>.
     * </p>
     */
    private Boolean showSpeakerLabels;

    /**
     * <p>
     * The maximum number of speakers to identify in the input audio. If there
     * are more speakers in the audio than this number, multiple speakers will
     * be identified as a single speaker. If you specify the
     * <code>MaxSpeakerLabels</code> field, you must set the
     * <code>ShowSpeakerLabels</code> field to true.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     */
    private Integer maxSpeakerLabels;

    /**
     * <p>
     * Instructs Amazon Transcribe to process each audio channel separately and
     * then merge the transcription output of each channel into a single
     * transcription.
     * </p>
     * <p>
     * Amazon Transcribe also produces a transcription of each item detected on
     * an audio channel, including the start time and end time of the item and
     * alternative transcriptions of the item including the confidence that
     * Amazon Transcribe has in the transcription.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and
     * <code>ChannelIdentification</code> in the same request. If you set both,
     * your request returns a <code>BadRequestException</code>.
     * </p>
     */
    private Boolean channelIdentification;

    /**
     * <p>
     * The name of a vocabulary to use when processing the transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of a vocabulary to use when processing the transcription
     *         job.
     *         </p>
     */
    public String getVocabularyName() {
        return vocabularyName;
    }

    /**
     * <p>
     * The name of a vocabulary to use when processing the transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyName <p>
     *            The name of a vocabulary to use when processing the
     *            transcription job.
     *            </p>
     */
    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of a vocabulary to use when processing the transcription job.
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
     *            The name of a vocabulary to use when processing the
     *            transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Settings withVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
        return this;
    }

    /**
     * <p>
     * Determines whether the transcription job uses speaker recognition to
     * identify different speakers in the input audio. Speaker recognition
     * labels individual speakers in the audio file. If you set the
     * <code>ShowSpeakerLabels</code> field to true, you must also set the
     * maximum number of speaker labels <code>MaxSpeakerLabels</code> field.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and
     * <code>ChannelIdentification</code> in the same request. If you set both,
     * your request returns a <code>BadRequestException</code>.
     * </p>
     *
     * @return <p>
     *         Determines whether the transcription job uses speaker recognition
     *         to identify different speakers in the input audio. Speaker
     *         recognition labels individual speakers in the audio file. If you
     *         set the <code>ShowSpeakerLabels</code> field to true, you must
     *         also set the maximum number of speaker labels
     *         <code>MaxSpeakerLabels</code> field.
     *         </p>
     *         <p>
     *         You can't set both <code>ShowSpeakerLabels</code> and
     *         <code>ChannelIdentification</code> in the same request. If you
     *         set both, your request returns a <code>BadRequestException</code>
     *         .
     *         </p>
     */
    public Boolean isShowSpeakerLabels() {
        return showSpeakerLabels;
    }

    /**
     * <p>
     * Determines whether the transcription job uses speaker recognition to
     * identify different speakers in the input audio. Speaker recognition
     * labels individual speakers in the audio file. If you set the
     * <code>ShowSpeakerLabels</code> field to true, you must also set the
     * maximum number of speaker labels <code>MaxSpeakerLabels</code> field.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and
     * <code>ChannelIdentification</code> in the same request. If you set both,
     * your request returns a <code>BadRequestException</code>.
     * </p>
     *
     * @return <p>
     *         Determines whether the transcription job uses speaker recognition
     *         to identify different speakers in the input audio. Speaker
     *         recognition labels individual speakers in the audio file. If you
     *         set the <code>ShowSpeakerLabels</code> field to true, you must
     *         also set the maximum number of speaker labels
     *         <code>MaxSpeakerLabels</code> field.
     *         </p>
     *         <p>
     *         You can't set both <code>ShowSpeakerLabels</code> and
     *         <code>ChannelIdentification</code> in the same request. If you
     *         set both, your request returns a <code>BadRequestException</code>
     *         .
     *         </p>
     */
    public Boolean getShowSpeakerLabels() {
        return showSpeakerLabels;
    }

    /**
     * <p>
     * Determines whether the transcription job uses speaker recognition to
     * identify different speakers in the input audio. Speaker recognition
     * labels individual speakers in the audio file. If you set the
     * <code>ShowSpeakerLabels</code> field to true, you must also set the
     * maximum number of speaker labels <code>MaxSpeakerLabels</code> field.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and
     * <code>ChannelIdentification</code> in the same request. If you set both,
     * your request returns a <code>BadRequestException</code>.
     * </p>
     *
     * @param showSpeakerLabels <p>
     *            Determines whether the transcription job uses speaker
     *            recognition to identify different speakers in the input audio.
     *            Speaker recognition labels individual speakers in the audio
     *            file. If you set the <code>ShowSpeakerLabels</code> field to
     *            true, you must also set the maximum number of speaker labels
     *            <code>MaxSpeakerLabels</code> field.
     *            </p>
     *            <p>
     *            You can't set both <code>ShowSpeakerLabels</code> and
     *            <code>ChannelIdentification</code> in the same request. If you
     *            set both, your request returns a
     *            <code>BadRequestException</code>.
     *            </p>
     */
    public void setShowSpeakerLabels(Boolean showSpeakerLabels) {
        this.showSpeakerLabels = showSpeakerLabels;
    }

    /**
     * <p>
     * Determines whether the transcription job uses speaker recognition to
     * identify different speakers in the input audio. Speaker recognition
     * labels individual speakers in the audio file. If you set the
     * <code>ShowSpeakerLabels</code> field to true, you must also set the
     * maximum number of speaker labels <code>MaxSpeakerLabels</code> field.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and
     * <code>ChannelIdentification</code> in the same request. If you set both,
     * your request returns a <code>BadRequestException</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param showSpeakerLabels <p>
     *            Determines whether the transcription job uses speaker
     *            recognition to identify different speakers in the input audio.
     *            Speaker recognition labels individual speakers in the audio
     *            file. If you set the <code>ShowSpeakerLabels</code> field to
     *            true, you must also set the maximum number of speaker labels
     *            <code>MaxSpeakerLabels</code> field.
     *            </p>
     *            <p>
     *            You can't set both <code>ShowSpeakerLabels</code> and
     *            <code>ChannelIdentification</code> in the same request. If you
     *            set both, your request returns a
     *            <code>BadRequestException</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Settings withShowSpeakerLabels(Boolean showSpeakerLabels) {
        this.showSpeakerLabels = showSpeakerLabels;
        return this;
    }

    /**
     * <p>
     * The maximum number of speakers to identify in the input audio. If there
     * are more speakers in the audio than this number, multiple speakers will
     * be identified as a single speaker. If you specify the
     * <code>MaxSpeakerLabels</code> field, you must set the
     * <code>ShowSpeakerLabels</code> field to true.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @return <p>
     *         The maximum number of speakers to identify in the input audio. If
     *         there are more speakers in the audio than this number, multiple
     *         speakers will be identified as a single speaker. If you specify
     *         the <code>MaxSpeakerLabels</code> field, you must set the
     *         <code>ShowSpeakerLabels</code> field to true.
     *         </p>
     */
    public Integer getMaxSpeakerLabels() {
        return maxSpeakerLabels;
    }

    /**
     * <p>
     * The maximum number of speakers to identify in the input audio. If there
     * are more speakers in the audio than this number, multiple speakers will
     * be identified as a single speaker. If you specify the
     * <code>MaxSpeakerLabels</code> field, you must set the
     * <code>ShowSpeakerLabels</code> field to true.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param maxSpeakerLabels <p>
     *            The maximum number of speakers to identify in the input audio.
     *            If there are more speakers in the audio than this number,
     *            multiple speakers will be identified as a single speaker. If
     *            you specify the <code>MaxSpeakerLabels</code> field, you must
     *            set the <code>ShowSpeakerLabels</code> field to true.
     *            </p>
     */
    public void setMaxSpeakerLabels(Integer maxSpeakerLabels) {
        this.maxSpeakerLabels = maxSpeakerLabels;
    }

    /**
     * <p>
     * The maximum number of speakers to identify in the input audio. If there
     * are more speakers in the audio than this number, multiple speakers will
     * be identified as a single speaker. If you specify the
     * <code>MaxSpeakerLabels</code> field, you must set the
     * <code>ShowSpeakerLabels</code> field to true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param maxSpeakerLabels <p>
     *            The maximum number of speakers to identify in the input audio.
     *            If there are more speakers in the audio than this number,
     *            multiple speakers will be identified as a single speaker. If
     *            you specify the <code>MaxSpeakerLabels</code> field, you must
     *            set the <code>ShowSpeakerLabels</code> field to true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Settings withMaxSpeakerLabels(Integer maxSpeakerLabels) {
        this.maxSpeakerLabels = maxSpeakerLabels;
        return this;
    }

    /**
     * <p>
     * Instructs Amazon Transcribe to process each audio channel separately and
     * then merge the transcription output of each channel into a single
     * transcription.
     * </p>
     * <p>
     * Amazon Transcribe also produces a transcription of each item detected on
     * an audio channel, including the start time and end time of the item and
     * alternative transcriptions of the item including the confidence that
     * Amazon Transcribe has in the transcription.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and
     * <code>ChannelIdentification</code> in the same request. If you set both,
     * your request returns a <code>BadRequestException</code>.
     * </p>
     *
     * @return <p>
     *         Instructs Amazon Transcribe to process each audio channel
     *         separately and then merge the transcription output of each
     *         channel into a single transcription.
     *         </p>
     *         <p>
     *         Amazon Transcribe also produces a transcription of each item
     *         detected on an audio channel, including the start time and end
     *         time of the item and alternative transcriptions of the item
     *         including the confidence that Amazon Transcribe has in the
     *         transcription.
     *         </p>
     *         <p>
     *         You can't set both <code>ShowSpeakerLabels</code> and
     *         <code>ChannelIdentification</code> in the same request. If you
     *         set both, your request returns a <code>BadRequestException</code>
     *         .
     *         </p>
     */
    public Boolean isChannelIdentification() {
        return channelIdentification;
    }

    /**
     * <p>
     * Instructs Amazon Transcribe to process each audio channel separately and
     * then merge the transcription output of each channel into a single
     * transcription.
     * </p>
     * <p>
     * Amazon Transcribe also produces a transcription of each item detected on
     * an audio channel, including the start time and end time of the item and
     * alternative transcriptions of the item including the confidence that
     * Amazon Transcribe has in the transcription.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and
     * <code>ChannelIdentification</code> in the same request. If you set both,
     * your request returns a <code>BadRequestException</code>.
     * </p>
     *
     * @return <p>
     *         Instructs Amazon Transcribe to process each audio channel
     *         separately and then merge the transcription output of each
     *         channel into a single transcription.
     *         </p>
     *         <p>
     *         Amazon Transcribe also produces a transcription of each item
     *         detected on an audio channel, including the start time and end
     *         time of the item and alternative transcriptions of the item
     *         including the confidence that Amazon Transcribe has in the
     *         transcription.
     *         </p>
     *         <p>
     *         You can't set both <code>ShowSpeakerLabels</code> and
     *         <code>ChannelIdentification</code> in the same request. If you
     *         set both, your request returns a <code>BadRequestException</code>
     *         .
     *         </p>
     */
    public Boolean getChannelIdentification() {
        return channelIdentification;
    }

    /**
     * <p>
     * Instructs Amazon Transcribe to process each audio channel separately and
     * then merge the transcription output of each channel into a single
     * transcription.
     * </p>
     * <p>
     * Amazon Transcribe also produces a transcription of each item detected on
     * an audio channel, including the start time and end time of the item and
     * alternative transcriptions of the item including the confidence that
     * Amazon Transcribe has in the transcription.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and
     * <code>ChannelIdentification</code> in the same request. If you set both,
     * your request returns a <code>BadRequestException</code>.
     * </p>
     *
     * @param channelIdentification <p>
     *            Instructs Amazon Transcribe to process each audio channel
     *            separately and then merge the transcription output of each
     *            channel into a single transcription.
     *            </p>
     *            <p>
     *            Amazon Transcribe also produces a transcription of each item
     *            detected on an audio channel, including the start time and end
     *            time of the item and alternative transcriptions of the item
     *            including the confidence that Amazon Transcribe has in the
     *            transcription.
     *            </p>
     *            <p>
     *            You can't set both <code>ShowSpeakerLabels</code> and
     *            <code>ChannelIdentification</code> in the same request. If you
     *            set both, your request returns a
     *            <code>BadRequestException</code>.
     *            </p>
     */
    public void setChannelIdentification(Boolean channelIdentification) {
        this.channelIdentification = channelIdentification;
    }

    /**
     * <p>
     * Instructs Amazon Transcribe to process each audio channel separately and
     * then merge the transcription output of each channel into a single
     * transcription.
     * </p>
     * <p>
     * Amazon Transcribe also produces a transcription of each item detected on
     * an audio channel, including the start time and end time of the item and
     * alternative transcriptions of the item including the confidence that
     * Amazon Transcribe has in the transcription.
     * </p>
     * <p>
     * You can't set both <code>ShowSpeakerLabels</code> and
     * <code>ChannelIdentification</code> in the same request. If you set both,
     * your request returns a <code>BadRequestException</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelIdentification <p>
     *            Instructs Amazon Transcribe to process each audio channel
     *            separately and then merge the transcription output of each
     *            channel into a single transcription.
     *            </p>
     *            <p>
     *            Amazon Transcribe also produces a transcription of each item
     *            detected on an audio channel, including the start time and end
     *            time of the item and alternative transcriptions of the item
     *            including the confidence that Amazon Transcribe has in the
     *            transcription.
     *            </p>
     *            <p>
     *            You can't set both <code>ShowSpeakerLabels</code> and
     *            <code>ChannelIdentification</code> in the same request. If you
     *            set both, your request returns a
     *            <code>BadRequestException</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Settings withChannelIdentification(Boolean channelIdentification) {
        this.channelIdentification = channelIdentification;
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
        if (getVocabularyName() != null)
            sb.append("VocabularyName: " + getVocabularyName() + ",");
        if (getShowSpeakerLabels() != null)
            sb.append("ShowSpeakerLabels: " + getShowSpeakerLabels() + ",");
        if (getMaxSpeakerLabels() != null)
            sb.append("MaxSpeakerLabels: " + getMaxSpeakerLabels() + ",");
        if (getChannelIdentification() != null)
            sb.append("ChannelIdentification: " + getChannelIdentification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode
                + ((getShowSpeakerLabels() == null) ? 0 : getShowSpeakerLabels().hashCode());
        hashCode = prime * hashCode
                + ((getMaxSpeakerLabels() == null) ? 0 : getMaxSpeakerLabels().hashCode());
        hashCode = prime
                * hashCode
                + ((getChannelIdentification() == null) ? 0 : getChannelIdentification().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Settings == false)
            return false;
        Settings other = (Settings) obj;

        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null
                && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getShowSpeakerLabels() == null ^ this.getShowSpeakerLabels() == null)
            return false;
        if (other.getShowSpeakerLabels() != null
                && other.getShowSpeakerLabels().equals(this.getShowSpeakerLabels()) == false)
            return false;
        if (other.getMaxSpeakerLabels() == null ^ this.getMaxSpeakerLabels() == null)
            return false;
        if (other.getMaxSpeakerLabels() != null
                && other.getMaxSpeakerLabels().equals(this.getMaxSpeakerLabels()) == false)
            return false;
        if (other.getChannelIdentification() == null ^ this.getChannelIdentification() == null)
            return false;
        if (other.getChannelIdentification() != null
                && other.getChannelIdentification().equals(this.getChannelIdentification()) == false)
            return false;
        return true;
    }
}
