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
     * are more speakers in the audio than this number, multiple speakers are
     * identified as a single speaker. If you specify the
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
     * Determines whether the transcription contains alternative transcriptions.
     * If you set the <code>ShowAlternatives</code> field to true, you must also
     * set the maximum number of alternatives to return in the
     * <code>MaxAlternatives</code> field.
     * </p>
     */
    private Boolean showAlternatives;

    /**
     * <p>
     * The number of alternative transcriptions that the service should return.
     * If you specify the <code>MaxAlternatives</code> field, you must set the
     * <code>ShowAlternatives</code> field to true.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     */
    private Integer maxAlternatives;

    /**
     * <p>
     * The name of the vocabulary filter to use when transcribing the audio. The
     * filter that you specify must have the same language code as the
     * transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String vocabularyFilterName;

    /**
     * <p>
     * Set to <code>mask</code> to remove filtered text from the transcript and
     * replace it with three asterisks ("***") as placeholder text. Set to
     * <code>remove</code> to remove filtered text from the transcript without
     * using placeholder text. Set to <code>tag</code> to mark the word in the
     * transcription output that matches the vocabulary filter. When you set the
     * filter method to <code>tag</code>, the words matching your vocabulary
     * filter are not masked or removed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     */
    private String vocabularyFilterMethod;

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
     * are more speakers in the audio than this number, multiple speakers are
     * identified as a single speaker. If you specify the
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
     *         speakers are identified as a single speaker. If you specify the
     *         <code>MaxSpeakerLabels</code> field, you must set the
     *         <code>ShowSpeakerLabels</code> field to true.
     *         </p>
     */
    public Integer getMaxSpeakerLabels() {
        return maxSpeakerLabels;
    }

    /**
     * <p>
     * The maximum number of speakers to identify in the input audio. If there
     * are more speakers in the audio than this number, multiple speakers are
     * identified as a single speaker. If you specify the
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
     *            multiple speakers are identified as a single speaker. If you
     *            specify the <code>MaxSpeakerLabels</code> field, you must set
     *            the <code>ShowSpeakerLabels</code> field to true.
     *            </p>
     */
    public void setMaxSpeakerLabels(Integer maxSpeakerLabels) {
        this.maxSpeakerLabels = maxSpeakerLabels;
    }

    /**
     * <p>
     * The maximum number of speakers to identify in the input audio. If there
     * are more speakers in the audio than this number, multiple speakers are
     * identified as a single speaker. If you specify the
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
     *            multiple speakers are identified as a single speaker. If you
     *            specify the <code>MaxSpeakerLabels</code> field, you must set
     *            the <code>ShowSpeakerLabels</code> field to true.
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
     * <p>
     * Determines whether the transcription contains alternative transcriptions.
     * If you set the <code>ShowAlternatives</code> field to true, you must also
     * set the maximum number of alternatives to return in the
     * <code>MaxAlternatives</code> field.
     * </p>
     *
     * @return <p>
     *         Determines whether the transcription contains alternative
     *         transcriptions. If you set the <code>ShowAlternatives</code>
     *         field to true, you must also set the maximum number of
     *         alternatives to return in the <code>MaxAlternatives</code> field.
     *         </p>
     */
    public Boolean isShowAlternatives() {
        return showAlternatives;
    }

    /**
     * <p>
     * Determines whether the transcription contains alternative transcriptions.
     * If you set the <code>ShowAlternatives</code> field to true, you must also
     * set the maximum number of alternatives to return in the
     * <code>MaxAlternatives</code> field.
     * </p>
     *
     * @return <p>
     *         Determines whether the transcription contains alternative
     *         transcriptions. If you set the <code>ShowAlternatives</code>
     *         field to true, you must also set the maximum number of
     *         alternatives to return in the <code>MaxAlternatives</code> field.
     *         </p>
     */
    public Boolean getShowAlternatives() {
        return showAlternatives;
    }

    /**
     * <p>
     * Determines whether the transcription contains alternative transcriptions.
     * If you set the <code>ShowAlternatives</code> field to true, you must also
     * set the maximum number of alternatives to return in the
     * <code>MaxAlternatives</code> field.
     * </p>
     *
     * @param showAlternatives <p>
     *            Determines whether the transcription contains alternative
     *            transcriptions. If you set the <code>ShowAlternatives</code>
     *            field to true, you must also set the maximum number of
     *            alternatives to return in the <code>MaxAlternatives</code>
     *            field.
     *            </p>
     */
    public void setShowAlternatives(Boolean showAlternatives) {
        this.showAlternatives = showAlternatives;
    }

    /**
     * <p>
     * Determines whether the transcription contains alternative transcriptions.
     * If you set the <code>ShowAlternatives</code> field to true, you must also
     * set the maximum number of alternatives to return in the
     * <code>MaxAlternatives</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param showAlternatives <p>
     *            Determines whether the transcription contains alternative
     *            transcriptions. If you set the <code>ShowAlternatives</code>
     *            field to true, you must also set the maximum number of
     *            alternatives to return in the <code>MaxAlternatives</code>
     *            field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Settings withShowAlternatives(Boolean showAlternatives) {
        this.showAlternatives = showAlternatives;
        return this;
    }

    /**
     * <p>
     * The number of alternative transcriptions that the service should return.
     * If you specify the <code>MaxAlternatives</code> field, you must set the
     * <code>ShowAlternatives</code> field to true.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @return <p>
     *         The number of alternative transcriptions that the service should
     *         return. If you specify the <code>MaxAlternatives</code> field,
     *         you must set the <code>ShowAlternatives</code> field to true.
     *         </p>
     */
    public Integer getMaxAlternatives() {
        return maxAlternatives;
    }

    /**
     * <p>
     * The number of alternative transcriptions that the service should return.
     * If you specify the <code>MaxAlternatives</code> field, you must set the
     * <code>ShowAlternatives</code> field to true.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param maxAlternatives <p>
     *            The number of alternative transcriptions that the service
     *            should return. If you specify the <code>MaxAlternatives</code>
     *            field, you must set the <code>ShowAlternatives</code> field to
     *            true.
     *            </p>
     */
    public void setMaxAlternatives(Integer maxAlternatives) {
        this.maxAlternatives = maxAlternatives;
    }

    /**
     * <p>
     * The number of alternative transcriptions that the service should return.
     * If you specify the <code>MaxAlternatives</code> field, you must set the
     * <code>ShowAlternatives</code> field to true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param maxAlternatives <p>
     *            The number of alternative transcriptions that the service
     *            should return. If you specify the <code>MaxAlternatives</code>
     *            field, you must set the <code>ShowAlternatives</code> field to
     *            true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Settings withMaxAlternatives(Integer maxAlternatives) {
        this.maxAlternatives = maxAlternatives;
        return this;
    }

    /**
     * <p>
     * The name of the vocabulary filter to use when transcribing the audio. The
     * filter that you specify must have the same language code as the
     * transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the vocabulary filter to use when transcribing the
     *         audio. The filter that you specify must have the same language
     *         code as the transcription job.
     *         </p>
     */
    public String getVocabularyFilterName() {
        return vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter to use when transcribing the audio. The
     * filter that you specify must have the same language code as the
     * transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param vocabularyFilterName <p>
     *            The name of the vocabulary filter to use when transcribing the
     *            audio. The filter that you specify must have the same language
     *            code as the transcription job.
     *            </p>
     */
    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter to use when transcribing the audio. The
     * filter that you specify must have the same language code as the
     * transcription job.
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
     *            The name of the vocabulary filter to use when transcribing the
     *            audio. The filter that you specify must have the same language
     *            code as the transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Settings withVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
        return this;
    }

    /**
     * <p>
     * Set to <code>mask</code> to remove filtered text from the transcript and
     * replace it with three asterisks ("***") as placeholder text. Set to
     * <code>remove</code> to remove filtered text from the transcript without
     * using placeholder text. Set to <code>tag</code> to mark the word in the
     * transcription output that matches the vocabulary filter. When you set the
     * filter method to <code>tag</code>, the words matching your vocabulary
     * filter are not masked or removed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @return <p>
     *         Set to <code>mask</code> to remove filtered text from the
     *         transcript and replace it with three asterisks ("***") as
     *         placeholder text. Set to <code>remove</code> to remove filtered
     *         text from the transcript without using placeholder text. Set to
     *         <code>tag</code> to mark the word in the transcription output
     *         that matches the vocabulary filter. When you set the filter
     *         method to <code>tag</code>, the words matching your vocabulary
     *         filter are not masked or removed.
     *         </p>
     * @see VocabularyFilterMethod
     */
    public String getVocabularyFilterMethod() {
        return vocabularyFilterMethod;
    }

    /**
     * <p>
     * Set to <code>mask</code> to remove filtered text from the transcript and
     * replace it with three asterisks ("***") as placeholder text. Set to
     * <code>remove</code> to remove filtered text from the transcript without
     * using placeholder text. Set to <code>tag</code> to mark the word in the
     * transcription output that matches the vocabulary filter. When you set the
     * filter method to <code>tag</code>, the words matching your vocabulary
     * filter are not masked or removed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @param vocabularyFilterMethod <p>
     *            Set to <code>mask</code> to remove filtered text from the
     *            transcript and replace it with three asterisks ("***") as
     *            placeholder text. Set to <code>remove</code> to remove
     *            filtered text from the transcript without using placeholder
     *            text. Set to <code>tag</code> to mark the word in the
     *            transcription output that matches the vocabulary filter. When
     *            you set the filter method to <code>tag</code>, the words
     *            matching your vocabulary filter are not masked or removed.
     *            </p>
     * @see VocabularyFilterMethod
     */
    public void setVocabularyFilterMethod(String vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod;
    }

    /**
     * <p>
     * Set to <code>mask</code> to remove filtered text from the transcript and
     * replace it with three asterisks ("***") as placeholder text. Set to
     * <code>remove</code> to remove filtered text from the transcript without
     * using placeholder text. Set to <code>tag</code> to mark the word in the
     * transcription output that matches the vocabulary filter. When you set the
     * filter method to <code>tag</code>, the words matching your vocabulary
     * filter are not masked or removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @param vocabularyFilterMethod <p>
     *            Set to <code>mask</code> to remove filtered text from the
     *            transcript and replace it with three asterisks ("***") as
     *            placeholder text. Set to <code>remove</code> to remove
     *            filtered text from the transcript without using placeholder
     *            text. Set to <code>tag</code> to mark the word in the
     *            transcription output that matches the vocabulary filter. When
     *            you set the filter method to <code>tag</code>, the words
     *            matching your vocabulary filter are not masked or removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyFilterMethod
     */
    public Settings withVocabularyFilterMethod(String vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod;
        return this;
    }

    /**
     * <p>
     * Set to <code>mask</code> to remove filtered text from the transcript and
     * replace it with three asterisks ("***") as placeholder text. Set to
     * <code>remove</code> to remove filtered text from the transcript without
     * using placeholder text. Set to <code>tag</code> to mark the word in the
     * transcription output that matches the vocabulary filter. When you set the
     * filter method to <code>tag</code>, the words matching your vocabulary
     * filter are not masked or removed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @param vocabularyFilterMethod <p>
     *            Set to <code>mask</code> to remove filtered text from the
     *            transcript and replace it with three asterisks ("***") as
     *            placeholder text. Set to <code>remove</code> to remove
     *            filtered text from the transcript without using placeholder
     *            text. Set to <code>tag</code> to mark the word in the
     *            transcription output that matches the vocabulary filter. When
     *            you set the filter method to <code>tag</code>, the words
     *            matching your vocabulary filter are not masked or removed.
     *            </p>
     * @see VocabularyFilterMethod
     */
    public void setVocabularyFilterMethod(VocabularyFilterMethod vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod.toString();
    }

    /**
     * <p>
     * Set to <code>mask</code> to remove filtered text from the transcript and
     * replace it with three asterisks ("***") as placeholder text. Set to
     * <code>remove</code> to remove filtered text from the transcript without
     * using placeholder text. Set to <code>tag</code> to mark the word in the
     * transcription output that matches the vocabulary filter. When you set the
     * filter method to <code>tag</code>, the words matching your vocabulary
     * filter are not masked or removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>remove, mask, tag
     *
     * @param vocabularyFilterMethod <p>
     *            Set to <code>mask</code> to remove filtered text from the
     *            transcript and replace it with three asterisks ("***") as
     *            placeholder text. Set to <code>remove</code> to remove
     *            filtered text from the transcript without using placeholder
     *            text. Set to <code>tag</code> to mark the word in the
     *            transcription output that matches the vocabulary filter. When
     *            you set the filter method to <code>tag</code>, the words
     *            matching your vocabulary filter are not masked or removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyFilterMethod
     */
    public Settings withVocabularyFilterMethod(VocabularyFilterMethod vocabularyFilterMethod) {
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
        if (getVocabularyName() != null)
            sb.append("VocabularyName: " + getVocabularyName() + ",");
        if (getShowSpeakerLabels() != null)
            sb.append("ShowSpeakerLabels: " + getShowSpeakerLabels() + ",");
        if (getMaxSpeakerLabels() != null)
            sb.append("MaxSpeakerLabels: " + getMaxSpeakerLabels() + ",");
        if (getChannelIdentification() != null)
            sb.append("ChannelIdentification: " + getChannelIdentification() + ",");
        if (getShowAlternatives() != null)
            sb.append("ShowAlternatives: " + getShowAlternatives() + ",");
        if (getMaxAlternatives() != null)
            sb.append("MaxAlternatives: " + getMaxAlternatives() + ",");
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
                + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode
                + ((getShowSpeakerLabels() == null) ? 0 : getShowSpeakerLabels().hashCode());
        hashCode = prime * hashCode
                + ((getMaxSpeakerLabels() == null) ? 0 : getMaxSpeakerLabels().hashCode());
        hashCode = prime
                * hashCode
                + ((getChannelIdentification() == null) ? 0 : getChannelIdentification().hashCode());
        hashCode = prime * hashCode
                + ((getShowAlternatives() == null) ? 0 : getShowAlternatives().hashCode());
        hashCode = prime * hashCode
                + ((getMaxAlternatives() == null) ? 0 : getMaxAlternatives().hashCode());
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
        if (other.getShowAlternatives() == null ^ this.getShowAlternatives() == null)
            return false;
        if (other.getShowAlternatives() != null
                && other.getShowAlternatives().equals(this.getShowAlternatives()) == false)
            return false;
        if (other.getMaxAlternatives() == null ^ this.getMaxAlternatives() == null)
            return false;
        if (other.getMaxAlternatives() != null
                && other.getMaxAlternatives().equals(this.getMaxAlternatives()) == false)
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
