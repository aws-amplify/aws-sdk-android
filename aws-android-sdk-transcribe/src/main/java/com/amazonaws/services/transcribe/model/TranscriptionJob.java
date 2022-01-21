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
 * Describes an asynchronous transcription job that was created with the
 * <code>StartTranscriptionJob</code> operation.
 * </p>
 */
public class TranscriptionJob implements Serializable {
    /**
     * <p>
     * The name of the transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String transcriptionJobName;

    /**
     * <p>
     * The status of the transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     */
    private String transcriptionJobStatus;

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW,
     * th-TH, en-ZA, en-NZ
     */
    private String languageCode;

    /**
     * <p>
     * The sample rate, in Hertz (Hz), of the audio track in the input media
     * file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     */
    private Integer mediaSampleRateHertz;

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     */
    private String mediaFormat;

    /**
     * <p>
     * An object that describes the input media for the transcription job.
     * </p>
     */
    private Media media;

    /**
     * <p>
     * An object that describes the output of the transcription job.
     * </p>
     */
    private Transcript transcript;

    /**
     * <p>
     * A timestamp that shows when the job started processing.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * A timestamp that shows when the job completed.
     * </p>
     */
    private java.util.Date completionTime;

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>,
     * this field contains information about why the job failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field can contain one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code> - The media format specified in the
     * <code>MediaFormat</code> field of the request isn't valid. See the
     * description of the <code>MediaFormat</code> field for a list of valid
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>
     * - The media format of the audio file doesn't match the format specified
     * in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code> - The sample rate
     * specified in the <code>MediaSampleRateHertz</code> of the request isn't
     * valid. The sample rate must be between 8,000 and 48,000 Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>
     * - The sample rate in the audio file doesn't match the sample rate
     * specified in the <code>MediaSampleRateHertz</code> field in the request.
     * Check the sample rate of your media file and make sure that the two
     * values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code> - The size of your
     * audio file is larger than Amazon Transcribe can process. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     * >Limits</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code> -
     * Your audio contains more channels than Amazon Transcribe is configured to
     * process. To request additional channels, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits-amazon-transcribe"
     * >Amazon Transcribe Limits</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * </li>
     * </ul>
     */
    private String failureReason;

    /**
     * <p>
     * Optional settings for the transcription job. Use these settings to turn
     * on speaker recognition, to set the maximum number of speakers that should
     * be identified and to specify a custom vocabulary to use when processing
     * the transcription job.
     * </p>
     */
    private Settings settings;

    /**
     * <p>
     * An object containing the details of your custom language model.
     * </p>
     */
    private ModelSettings modelSettings;

    /**
     * <p>
     * Provides information about how a transcription job is executed.
     * </p>
     */
    private JobExecutionSettings jobExecutionSettings;

    /**
     * <p>
     * An object that describes content redaction settings for the transcription
     * job.
     * </p>
     */
    private ContentRedaction contentRedaction;

    /**
     * <p>
     * A value that shows if automatic language identification was enabled for a
     * transcription job.
     * </p>
     */
    private Boolean identifyLanguage;

    /**
     * <p>
     * An object that shows the optional array of languages inputted for
     * transcription jobs with automatic language identification enabled.
     * </p>
     */
    private java.util.List<String> languageOptions;

    /**
     * <p>
     * A value between zero and one that Amazon Transcribe assigned to the
     * language that it identified in the source audio. Larger values indicate
     * that Amazon Transcribe has higher confidence in the language it
     * identified.
     * </p>
     */
    private Float identifiedLanguageScore;

    /**
     * <p>
     * A key:value pair assigned to a given transcription job.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Generate subtitles for your batch transcription job.
     * </p>
     */
    private SubtitlesOutput subtitles;

    /**
     * <p>
     * Language-specific settings that can be specified when language
     * identification is enabled for your transcription job. These settings
     * include <code>VocabularyName</code>, <code>VocabularyFilterName</code>,
     * and <code>LanguageModelName</code>.
     * </p>
     */
    private java.util.Map<String, LanguageIdSettings> languageIdSettings;

    /**
     * <p>
     * The name of the transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the transcription job.
     *         </p>
     */
    public String getTranscriptionJobName() {
        return transcriptionJobName;
    }

    /**
     * <p>
     * The name of the transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param transcriptionJobName <p>
     *            The name of the transcription job.
     *            </p>
     */
    public void setTranscriptionJobName(String transcriptionJobName) {
        this.transcriptionJobName = transcriptionJobName;
    }

    /**
     * <p>
     * The name of the transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param transcriptionJobName <p>
     *            The name of the transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withTranscriptionJobName(String transcriptionJobName) {
        this.transcriptionJobName = transcriptionJobName;
        return this;
    }

    /**
     * <p>
     * The status of the transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @return <p>
     *         The status of the transcription job.
     *         </p>
     * @see TranscriptionJobStatus
     */
    public String getTranscriptionJobStatus() {
        return transcriptionJobStatus;
    }

    /**
     * <p>
     * The status of the transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            The status of the transcription job.
     *            </p>
     * @see TranscriptionJobStatus
     */
    public void setTranscriptionJobStatus(String transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus;
    }

    /**
     * <p>
     * The status of the transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            The status of the transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TranscriptionJobStatus
     */
    public TranscriptionJob withTranscriptionJobStatus(String transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus;
        return this;
    }

    /**
     * <p>
     * The status of the transcription job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            The status of the transcription job.
     *            </p>
     * @see TranscriptionJobStatus
     */
    public void setTranscriptionJobStatus(TranscriptionJobStatus transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus.toString();
    }

    /**
     * <p>
     * The status of the transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            The status of the transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TranscriptionJobStatus
     */
    public TranscriptionJob withTranscriptionJobStatus(TranscriptionJobStatus transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW,
     * th-TH, en-ZA, en-NZ
     *
     * @return <p>
     *         The language code for the input speech.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW,
     * th-TH, en-ZA, en-NZ
     *
     * @param languageCode <p>
     *            The language code for the input speech.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW,
     * th-TH, en-ZA, en-NZ
     *
     * @param languageCode <p>
     *            The language code for the input speech.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public TranscriptionJob withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW,
     * th-TH, en-ZA, en-NZ
     *
     * @param languageCode <p>
     *            The language code for the input speech.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW,
     * th-TH, en-ZA, en-NZ
     *
     * @param languageCode <p>
     *            The language code for the input speech.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public TranscriptionJob withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The sample rate, in Hertz (Hz), of the audio track in the input media
     * file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @return <p>
     *         The sample rate, in Hertz (Hz), of the audio track in the input
     *         media file.
     *         </p>
     */
    public Integer getMediaSampleRateHertz() {
        return mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz (Hz), of the audio track in the input media
     * file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate, in Hertz (Hz), of the audio track in the
     *            input media file.
     *            </p>
     */
    public void setMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz (Hz), of the audio track in the input media
     * file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate, in Hertz (Hz), of the audio track in the
     *            input media file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
        return this;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @return <p>
     *         The format of the input media file.
     *         </p>
     * @see MediaFormat
     */
    public String getMediaFormat() {
        return mediaFormat;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @param mediaFormat <p>
     *            The format of the input media file.
     *            </p>
     * @see MediaFormat
     */
    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @param mediaFormat <p>
     *            The format of the input media file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MediaFormat
     */
    public TranscriptionJob withMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
        return this;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @param mediaFormat <p>
     *            The format of the input media file.
     *            </p>
     * @see MediaFormat
     */
    public void setMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat.toString();
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @param mediaFormat <p>
     *            The format of the input media file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MediaFormat
     */
    public TranscriptionJob withMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat.toString();
        return this;
    }

    /**
     * <p>
     * An object that describes the input media for the transcription job.
     * </p>
     *
     * @return <p>
     *         An object that describes the input media for the transcription
     *         job.
     *         </p>
     */
    public Media getMedia() {
        return media;
    }

    /**
     * <p>
     * An object that describes the input media for the transcription job.
     * </p>
     *
     * @param media <p>
     *            An object that describes the input media for the transcription
     *            job.
     *            </p>
     */
    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * <p>
     * An object that describes the input media for the transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param media <p>
     *            An object that describes the input media for the transcription
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withMedia(Media media) {
        this.media = media;
        return this;
    }

    /**
     * <p>
     * An object that describes the output of the transcription job.
     * </p>
     *
     * @return <p>
     *         An object that describes the output of the transcription job.
     *         </p>
     */
    public Transcript getTranscript() {
        return transcript;
    }

    /**
     * <p>
     * An object that describes the output of the transcription job.
     * </p>
     *
     * @param transcript <p>
     *            An object that describes the output of the transcription job.
     *            </p>
     */
    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    /**
     * <p>
     * An object that describes the output of the transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcript <p>
     *            An object that describes the output of the transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withTranscript(Transcript transcript) {
        this.transcript = transcript;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job started processing.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the job started processing.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job started processing.
     * </p>
     *
     * @param startTime <p>
     *            A timestamp that shows when the job started processing.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job started processing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            A timestamp that shows when the job started processing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the job was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp that shows when the job was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp that shows when the job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job completed.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the job completed.
     *         </p>
     */
    public java.util.Date getCompletionTime() {
        return completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job completed.
     * </p>
     *
     * @param completionTime <p>
     *            A timestamp that shows when the job completed.
     *            </p>
     */
    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completionTime <p>
     *            A timestamp that shows when the job completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
        return this;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>,
     * this field contains information about why the job failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field can contain one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code> - The media format specified in the
     * <code>MediaFormat</code> field of the request isn't valid. See the
     * description of the <code>MediaFormat</code> field for a list of valid
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>
     * - The media format of the audio file doesn't match the format specified
     * in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code> - The sample rate
     * specified in the <code>MediaSampleRateHertz</code> of the request isn't
     * valid. The sample rate must be between 8,000 and 48,000 Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>
     * - The sample rate in the audio file doesn't match the sample rate
     * specified in the <code>MediaSampleRateHertz</code> field in the request.
     * Check the sample rate of your media file and make sure that the two
     * values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code> - The size of your
     * audio file is larger than Amazon Transcribe can process. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     * >Limits</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code> -
     * Your audio contains more channels than Amazon Transcribe is configured to
     * process. To request additional channels, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits-amazon-transcribe"
     * >Amazon Transcribe Limits</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         If the <code>TranscriptionJobStatus</code> field is
     *         <code>FAILED</code>, this field contains information about why
     *         the job failed.
     *         </p>
     *         <p>
     *         The <code>FailureReason</code> field can contain one of the
     *         following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Unsupported media format</code> - The media format
     *         specified in the <code>MediaFormat</code> field of the request
     *         isn't valid. See the description of the <code>MediaFormat</code>
     *         field for a list of valid values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>The media format provided does not match the detected media format</code>
     *         - The media format of the audio file doesn't match the format
     *         specified in the <code>MediaFormat</code> field in the request.
     *         Check the media format of your media file and make sure that the
     *         two values match.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid sample rate for audio file</code> - The sample rate
     *         specified in the <code>MediaSampleRateHertz</code> of the request
     *         isn't valid. The sample rate must be between 8,000 and 48,000
     *         Hertz.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>The sample rate provided does not match the detected sample rate</code>
     *         - The sample rate in the audio file doesn't match the sample rate
     *         specified in the <code>MediaSampleRateHertz</code> field in the
     *         request. Check the sample rate of your media file and make sure
     *         that the two values match.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid file size: file size too large</code> - The size of
     *         your audio file is larger than Amazon Transcribe can process. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     *         >Limits</a> in the <i>Amazon Transcribe Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid number of channels: number of channels too large</code>
     *         - Your audio contains more channels than Amazon Transcribe is
     *         configured to process. To request additional channels, see <a
     *         href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits-amazon-transcribe"
     *         >Amazon Transcribe Limits</a> in the <i>Amazon Web Services
     *         General Reference</i>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>,
     * this field contains information about why the job failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field can contain one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code> - The media format specified in the
     * <code>MediaFormat</code> field of the request isn't valid. See the
     * description of the <code>MediaFormat</code> field for a list of valid
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>
     * - The media format of the audio file doesn't match the format specified
     * in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code> - The sample rate
     * specified in the <code>MediaSampleRateHertz</code> of the request isn't
     * valid. The sample rate must be between 8,000 and 48,000 Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>
     * - The sample rate in the audio file doesn't match the sample rate
     * specified in the <code>MediaSampleRateHertz</code> field in the request.
     * Check the sample rate of your media file and make sure that the two
     * values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code> - The size of your
     * audio file is larger than Amazon Transcribe can process. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     * >Limits</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code> -
     * Your audio contains more channels than Amazon Transcribe is configured to
     * process. To request additional channels, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits-amazon-transcribe"
     * >Amazon Transcribe Limits</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * </li>
     * </ul>
     *
     * @param failureReason <p>
     *            If the <code>TranscriptionJobStatus</code> field is
     *            <code>FAILED</code>, this field contains information about why
     *            the job failed.
     *            </p>
     *            <p>
     *            The <code>FailureReason</code> field can contain one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Unsupported media format</code> - The media format
     *            specified in the <code>MediaFormat</code> field of the request
     *            isn't valid. See the description of the
     *            <code>MediaFormat</code> field for a list of valid values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>The media format provided does not match the detected media format</code>
     *            - The media format of the audio file doesn't match the format
     *            specified in the <code>MediaFormat</code> field in the
     *            request. Check the media format of your media file and make
     *            sure that the two values match.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid sample rate for audio file</code> - The sample
     *            rate specified in the <code>MediaSampleRateHertz</code> of the
     *            request isn't valid. The sample rate must be between 8,000 and
     *            48,000 Hertz.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>The sample rate provided does not match the detected sample rate</code>
     *            - The sample rate in the audio file doesn't match the sample
     *            rate specified in the <code>MediaSampleRateHertz</code> field
     *            in the request. Check the sample rate of your media file and
     *            make sure that the two values match.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid file size: file size too large</code> - The size
     *            of your audio file is larger than Amazon Transcribe can
     *            process. For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     *            >Limits</a> in the <i>Amazon Transcribe Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid number of channels: number of channels too large</code>
     *            - Your audio contains more channels than Amazon Transcribe is
     *            configured to process. To request additional channels, see <a
     *            href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits-amazon-transcribe"
     *            >Amazon Transcribe Limits</a> in the <i>Amazon Web Services
     *            General Reference</i>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>,
     * this field contains information about why the job failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field can contain one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code> - The media format specified in the
     * <code>MediaFormat</code> field of the request isn't valid. See the
     * description of the <code>MediaFormat</code> field for a list of valid
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>
     * - The media format of the audio file doesn't match the format specified
     * in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code> - The sample rate
     * specified in the <code>MediaSampleRateHertz</code> of the request isn't
     * valid. The sample rate must be between 8,000 and 48,000 Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>
     * - The sample rate in the audio file doesn't match the sample rate
     * specified in the <code>MediaSampleRateHertz</code> field in the request.
     * Check the sample rate of your media file and make sure that the two
     * values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code> - The size of your
     * audio file is larger than Amazon Transcribe can process. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     * >Limits</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code> -
     * Your audio contains more channels than Amazon Transcribe is configured to
     * process. To request additional channels, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits-amazon-transcribe"
     * >Amazon Transcribe Limits</a> in the <i>Amazon Web Services General
     * Reference</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            If the <code>TranscriptionJobStatus</code> field is
     *            <code>FAILED</code>, this field contains information about why
     *            the job failed.
     *            </p>
     *            <p>
     *            The <code>FailureReason</code> field can contain one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Unsupported media format</code> - The media format
     *            specified in the <code>MediaFormat</code> field of the request
     *            isn't valid. See the description of the
     *            <code>MediaFormat</code> field for a list of valid values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>The media format provided does not match the detected media format</code>
     *            - The media format of the audio file doesn't match the format
     *            specified in the <code>MediaFormat</code> field in the
     *            request. Check the media format of your media file and make
     *            sure that the two values match.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid sample rate for audio file</code> - The sample
     *            rate specified in the <code>MediaSampleRateHertz</code> of the
     *            request isn't valid. The sample rate must be between 8,000 and
     *            48,000 Hertz.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>The sample rate provided does not match the detected sample rate</code>
     *            - The sample rate in the audio file doesn't match the sample
     *            rate specified in the <code>MediaSampleRateHertz</code> field
     *            in the request. Check the sample rate of your media file and
     *            make sure that the two values match.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid file size: file size too large</code> - The size
     *            of your audio file is larger than Amazon Transcribe can
     *            process. For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     *            >Limits</a> in the <i>Amazon Transcribe Developer Guide</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid number of channels: number of channels too large</code>
     *            - Your audio contains more channels than Amazon Transcribe is
     *            configured to process. To request additional channels, see <a
     *            href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits-amazon-transcribe"
     *            >Amazon Transcribe Limits</a> in the <i>Amazon Web Services
     *            General Reference</i>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * Optional settings for the transcription job. Use these settings to turn
     * on speaker recognition, to set the maximum number of speakers that should
     * be identified and to specify a custom vocabulary to use when processing
     * the transcription job.
     * </p>
     *
     * @return <p>
     *         Optional settings for the transcription job. Use these settings
     *         to turn on speaker recognition, to set the maximum number of
     *         speakers that should be identified and to specify a custom
     *         vocabulary to use when processing the transcription job.
     *         </p>
     */
    public Settings getSettings() {
        return settings;
    }

    /**
     * <p>
     * Optional settings for the transcription job. Use these settings to turn
     * on speaker recognition, to set the maximum number of speakers that should
     * be identified and to specify a custom vocabulary to use when processing
     * the transcription job.
     * </p>
     *
     * @param settings <p>
     *            Optional settings for the transcription job. Use these
     *            settings to turn on speaker recognition, to set the maximum
     *            number of speakers that should be identified and to specify a
     *            custom vocabulary to use when processing the transcription
     *            job.
     *            </p>
     */
    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Optional settings for the transcription job. Use these settings to turn
     * on speaker recognition, to set the maximum number of speakers that should
     * be identified and to specify a custom vocabulary to use when processing
     * the transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            Optional settings for the transcription job. Use these
     *            settings to turn on speaker recognition, to set the maximum
     *            number of speakers that should be identified and to specify a
     *            custom vocabulary to use when processing the transcription
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withSettings(Settings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * <p>
     * An object containing the details of your custom language model.
     * </p>
     *
     * @return <p>
     *         An object containing the details of your custom language model.
     *         </p>
     */
    public ModelSettings getModelSettings() {
        return modelSettings;
    }

    /**
     * <p>
     * An object containing the details of your custom language model.
     * </p>
     *
     * @param modelSettings <p>
     *            An object containing the details of your custom language
     *            model.
     *            </p>
     */
    public void setModelSettings(ModelSettings modelSettings) {
        this.modelSettings = modelSettings;
    }

    /**
     * <p>
     * An object containing the details of your custom language model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelSettings <p>
     *            An object containing the details of your custom language
     *            model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withModelSettings(ModelSettings modelSettings) {
        this.modelSettings = modelSettings;
        return this;
    }

    /**
     * <p>
     * Provides information about how a transcription job is executed.
     * </p>
     *
     * @return <p>
     *         Provides information about how a transcription job is executed.
     *         </p>
     */
    public JobExecutionSettings getJobExecutionSettings() {
        return jobExecutionSettings;
    }

    /**
     * <p>
     * Provides information about how a transcription job is executed.
     * </p>
     *
     * @param jobExecutionSettings <p>
     *            Provides information about how a transcription job is
     *            executed.
     *            </p>
     */
    public void setJobExecutionSettings(JobExecutionSettings jobExecutionSettings) {
        this.jobExecutionSettings = jobExecutionSettings;
    }

    /**
     * <p>
     * Provides information about how a transcription job is executed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobExecutionSettings <p>
     *            Provides information about how a transcription job is
     *            executed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withJobExecutionSettings(JobExecutionSettings jobExecutionSettings) {
        this.jobExecutionSettings = jobExecutionSettings;
        return this;
    }

    /**
     * <p>
     * An object that describes content redaction settings for the transcription
     * job.
     * </p>
     *
     * @return <p>
     *         An object that describes content redaction settings for the
     *         transcription job.
     *         </p>
     */
    public ContentRedaction getContentRedaction() {
        return contentRedaction;
    }

    /**
     * <p>
     * An object that describes content redaction settings for the transcription
     * job.
     * </p>
     *
     * @param contentRedaction <p>
     *            An object that describes content redaction settings for the
     *            transcription job.
     *            </p>
     */
    public void setContentRedaction(ContentRedaction contentRedaction) {
        this.contentRedaction = contentRedaction;
    }

    /**
     * <p>
     * An object that describes content redaction settings for the transcription
     * job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentRedaction <p>
     *            An object that describes content redaction settings for the
     *            transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withContentRedaction(ContentRedaction contentRedaction) {
        this.contentRedaction = contentRedaction;
        return this;
    }

    /**
     * <p>
     * A value that shows if automatic language identification was enabled for a
     * transcription job.
     * </p>
     *
     * @return <p>
     *         A value that shows if automatic language identification was
     *         enabled for a transcription job.
     *         </p>
     */
    public Boolean isIdentifyLanguage() {
        return identifyLanguage;
    }

    /**
     * <p>
     * A value that shows if automatic language identification was enabled for a
     * transcription job.
     * </p>
     *
     * @return <p>
     *         A value that shows if automatic language identification was
     *         enabled for a transcription job.
     *         </p>
     */
    public Boolean getIdentifyLanguage() {
        return identifyLanguage;
    }

    /**
     * <p>
     * A value that shows if automatic language identification was enabled for a
     * transcription job.
     * </p>
     *
     * @param identifyLanguage <p>
     *            A value that shows if automatic language identification was
     *            enabled for a transcription job.
     *            </p>
     */
    public void setIdentifyLanguage(Boolean identifyLanguage) {
        this.identifyLanguage = identifyLanguage;
    }

    /**
     * <p>
     * A value that shows if automatic language identification was enabled for a
     * transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identifyLanguage <p>
     *            A value that shows if automatic language identification was
     *            enabled for a transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withIdentifyLanguage(Boolean identifyLanguage) {
        this.identifyLanguage = identifyLanguage;
        return this;
    }

    /**
     * <p>
     * An object that shows the optional array of languages inputted for
     * transcription jobs with automatic language identification enabled.
     * </p>
     *
     * @return <p>
     *         An object that shows the optional array of languages inputted for
     *         transcription jobs with automatic language identification
     *         enabled.
     *         </p>
     */
    public java.util.List<String> getLanguageOptions() {
        return languageOptions;
    }

    /**
     * <p>
     * An object that shows the optional array of languages inputted for
     * transcription jobs with automatic language identification enabled.
     * </p>
     *
     * @param languageOptions <p>
     *            An object that shows the optional array of languages inputted
     *            for transcription jobs with automatic language identification
     *            enabled.
     *            </p>
     */
    public void setLanguageOptions(java.util.Collection<String> languageOptions) {
        if (languageOptions == null) {
            this.languageOptions = null;
            return;
        }

        this.languageOptions = new java.util.ArrayList<String>(languageOptions);
    }

    /**
     * <p>
     * An object that shows the optional array of languages inputted for
     * transcription jobs with automatic language identification enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageOptions <p>
     *            An object that shows the optional array of languages inputted
     *            for transcription jobs with automatic language identification
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withLanguageOptions(String... languageOptions) {
        if (getLanguageOptions() == null) {
            this.languageOptions = new java.util.ArrayList<String>(languageOptions.length);
        }
        for (String value : languageOptions) {
            this.languageOptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An object that shows the optional array of languages inputted for
     * transcription jobs with automatic language identification enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageOptions <p>
     *            An object that shows the optional array of languages inputted
     *            for transcription jobs with automatic language identification
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withLanguageOptions(java.util.Collection<String> languageOptions) {
        setLanguageOptions(languageOptions);
        return this;
    }

    /**
     * <p>
     * A value between zero and one that Amazon Transcribe assigned to the
     * language that it identified in the source audio. Larger values indicate
     * that Amazon Transcribe has higher confidence in the language it
     * identified.
     * </p>
     *
     * @return <p>
     *         A value between zero and one that Amazon Transcribe assigned to
     *         the language that it identified in the source audio. Larger
     *         values indicate that Amazon Transcribe has higher confidence in
     *         the language it identified.
     *         </p>
     */
    public Float getIdentifiedLanguageScore() {
        return identifiedLanguageScore;
    }

    /**
     * <p>
     * A value between zero and one that Amazon Transcribe assigned to the
     * language that it identified in the source audio. Larger values indicate
     * that Amazon Transcribe has higher confidence in the language it
     * identified.
     * </p>
     *
     * @param identifiedLanguageScore <p>
     *            A value between zero and one that Amazon Transcribe assigned
     *            to the language that it identified in the source audio. Larger
     *            values indicate that Amazon Transcribe has higher confidence
     *            in the language it identified.
     *            </p>
     */
    public void setIdentifiedLanguageScore(Float identifiedLanguageScore) {
        this.identifiedLanguageScore = identifiedLanguageScore;
    }

    /**
     * <p>
     * A value between zero and one that Amazon Transcribe assigned to the
     * language that it identified in the source audio. Larger values indicate
     * that Amazon Transcribe has higher confidence in the language it
     * identified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identifiedLanguageScore <p>
     *            A value between zero and one that Amazon Transcribe assigned
     *            to the language that it identified in the source audio. Larger
     *            values indicate that Amazon Transcribe has higher confidence
     *            in the language it identified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withIdentifiedLanguageScore(Float identifiedLanguageScore) {
        this.identifiedLanguageScore = identifiedLanguageScore;
        return this;
    }

    /**
     * <p>
     * A key:value pair assigned to a given transcription job.
     * </p>
     *
     * @return <p>
     *         A key:value pair assigned to a given transcription job.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A key:value pair assigned to a given transcription job.
     * </p>
     *
     * @param tags <p>
     *            A key:value pair assigned to a given transcription job.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A key:value pair assigned to a given transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A key:value pair assigned to a given transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A key:value pair assigned to a given transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A key:value pair assigned to a given transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Generate subtitles for your batch transcription job.
     * </p>
     *
     * @return <p>
     *         Generate subtitles for your batch transcription job.
     *         </p>
     */
    public SubtitlesOutput getSubtitles() {
        return subtitles;
    }

    /**
     * <p>
     * Generate subtitles for your batch transcription job.
     * </p>
     *
     * @param subtitles <p>
     *            Generate subtitles for your batch transcription job.
     *            </p>
     */
    public void setSubtitles(SubtitlesOutput subtitles) {
        this.subtitles = subtitles;
    }

    /**
     * <p>
     * Generate subtitles for your batch transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subtitles <p>
     *            Generate subtitles for your batch transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withSubtitles(SubtitlesOutput subtitles) {
        this.subtitles = subtitles;
        return this;
    }

    /**
     * <p>
     * Language-specific settings that can be specified when language
     * identification is enabled for your transcription job. These settings
     * include <code>VocabularyName</code>, <code>VocabularyFilterName</code>,
     * and <code>LanguageModelName</code>.
     * </p>
     *
     * @return <p>
     *         Language-specific settings that can be specified when language
     *         identification is enabled for your transcription job. These
     *         settings include <code>VocabularyName</code>,
     *         <code>VocabularyFilterName</code>, and
     *         <code>LanguageModelName</code>.
     *         </p>
     */
    public java.util.Map<String, LanguageIdSettings> getLanguageIdSettings() {
        return languageIdSettings;
    }

    /**
     * <p>
     * Language-specific settings that can be specified when language
     * identification is enabled for your transcription job. These settings
     * include <code>VocabularyName</code>, <code>VocabularyFilterName</code>,
     * and <code>LanguageModelName</code>.
     * </p>
     *
     * @param languageIdSettings <p>
     *            Language-specific settings that can be specified when language
     *            identification is enabled for your transcription job. These
     *            settings include <code>VocabularyName</code>,
     *            <code>VocabularyFilterName</code>, and
     *            <code>LanguageModelName</code>.
     *            </p>
     */
    public void setLanguageIdSettings(java.util.Map<String, LanguageIdSettings> languageIdSettings) {
        this.languageIdSettings = languageIdSettings;
    }

    /**
     * <p>
     * Language-specific settings that can be specified when language
     * identification is enabled for your transcription job. These settings
     * include <code>VocabularyName</code>, <code>VocabularyFilterName</code>,
     * and <code>LanguageModelName</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageIdSettings <p>
     *            Language-specific settings that can be specified when language
     *            identification is enabled for your transcription job. These
     *            settings include <code>VocabularyName</code>,
     *            <code>VocabularyFilterName</code>, and
     *            <code>LanguageModelName</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withLanguageIdSettings(
            java.util.Map<String, LanguageIdSettings> languageIdSettings) {
        this.languageIdSettings = languageIdSettings;
        return this;
    }

    /**
     * <p>
     * Language-specific settings that can be specified when language
     * identification is enabled for your transcription job. These settings
     * include <code>VocabularyName</code>, <code>VocabularyFilterName</code>,
     * and <code>LanguageModelName</code>.
     * </p>
     * <p>
     * The method adds a new key-value pair into LanguageIdSettings parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into LanguageIdSettings.
     * @param value The corresponding value of the entry to be added into
     *            LanguageIdSettings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob addLanguageIdSettingsEntry(String key, LanguageIdSettings value) {
        if (null == this.languageIdSettings) {
            this.languageIdSettings = new java.util.HashMap<String, LanguageIdSettings>();
        }
        if (this.languageIdSettings.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.languageIdSettings.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LanguageIdSettings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public TranscriptionJob clearLanguageIdSettingsEntries() {
        this.languageIdSettings = null;
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
        if (getTranscriptionJobName() != null)
            sb.append("TranscriptionJobName: " + getTranscriptionJobName() + ",");
        if (getTranscriptionJobStatus() != null)
            sb.append("TranscriptionJobStatus: " + getTranscriptionJobStatus() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getMediaSampleRateHertz() != null)
            sb.append("MediaSampleRateHertz: " + getMediaSampleRateHertz() + ",");
        if (getMediaFormat() != null)
            sb.append("MediaFormat: " + getMediaFormat() + ",");
        if (getMedia() != null)
            sb.append("Media: " + getMedia() + ",");
        if (getTranscript() != null)
            sb.append("Transcript: " + getTranscript() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: " + getCompletionTime() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings() + ",");
        if (getModelSettings() != null)
            sb.append("ModelSettings: " + getModelSettings() + ",");
        if (getJobExecutionSettings() != null)
            sb.append("JobExecutionSettings: " + getJobExecutionSettings() + ",");
        if (getContentRedaction() != null)
            sb.append("ContentRedaction: " + getContentRedaction() + ",");
        if (getIdentifyLanguage() != null)
            sb.append("IdentifyLanguage: " + getIdentifyLanguage() + ",");
        if (getLanguageOptions() != null)
            sb.append("LanguageOptions: " + getLanguageOptions() + ",");
        if (getIdentifiedLanguageScore() != null)
            sb.append("IdentifiedLanguageScore: " + getIdentifiedLanguageScore() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getSubtitles() != null)
            sb.append("Subtitles: " + getSubtitles() + ",");
        if (getLanguageIdSettings() != null)
            sb.append("LanguageIdSettings: " + getLanguageIdSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTranscriptionJobName() == null) ? 0 : getTranscriptionJobName().hashCode());
        hashCode = prime
                * hashCode
                + ((getTranscriptionJobStatus() == null) ? 0 : getTranscriptionJobStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getMediaSampleRateHertz() == null) ? 0 : getMediaSampleRateHertz().hashCode());
        hashCode = prime * hashCode
                + ((getMediaFormat() == null) ? 0 : getMediaFormat().hashCode());
        hashCode = prime * hashCode + ((getMedia() == null) ? 0 : getMedia().hashCode());
        hashCode = prime * hashCode + ((getTranscript() == null) ? 0 : getTranscript().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode
                + ((getModelSettings() == null) ? 0 : getModelSettings().hashCode());
        hashCode = prime * hashCode
                + ((getJobExecutionSettings() == null) ? 0 : getJobExecutionSettings().hashCode());
        hashCode = prime * hashCode
                + ((getContentRedaction() == null) ? 0 : getContentRedaction().hashCode());
        hashCode = prime * hashCode
                + ((getIdentifyLanguage() == null) ? 0 : getIdentifyLanguage().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageOptions() == null) ? 0 : getLanguageOptions().hashCode());
        hashCode = prime
                * hashCode
                + ((getIdentifiedLanguageScore() == null) ? 0 : getIdentifiedLanguageScore()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSubtitles() == null) ? 0 : getSubtitles().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageIdSettings() == null) ? 0 : getLanguageIdSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranscriptionJob == false)
            return false;
        TranscriptionJob other = (TranscriptionJob) obj;

        if (other.getTranscriptionJobName() == null ^ this.getTranscriptionJobName() == null)
            return false;
        if (other.getTranscriptionJobName() != null
                && other.getTranscriptionJobName().equals(this.getTranscriptionJobName()) == false)
            return false;
        if (other.getTranscriptionJobStatus() == null ^ this.getTranscriptionJobStatus() == null)
            return false;
        if (other.getTranscriptionJobStatus() != null
                && other.getTranscriptionJobStatus().equals(this.getTranscriptionJobStatus()) == false)
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
        if (other.getMediaFormat() == null ^ this.getMediaFormat() == null)
            return false;
        if (other.getMediaFormat() != null
                && other.getMediaFormat().equals(this.getMediaFormat()) == false)
            return false;
        if (other.getMedia() == null ^ this.getMedia() == null)
            return false;
        if (other.getMedia() != null && other.getMedia().equals(this.getMedia()) == false)
            return false;
        if (other.getTranscript() == null ^ this.getTranscript() == null)
            return false;
        if (other.getTranscript() != null
                && other.getTranscript().equals(this.getTranscript()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null
                && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getModelSettings() == null ^ this.getModelSettings() == null)
            return false;
        if (other.getModelSettings() != null
                && other.getModelSettings().equals(this.getModelSettings()) == false)
            return false;
        if (other.getJobExecutionSettings() == null ^ this.getJobExecutionSettings() == null)
            return false;
        if (other.getJobExecutionSettings() != null
                && other.getJobExecutionSettings().equals(this.getJobExecutionSettings()) == false)
            return false;
        if (other.getContentRedaction() == null ^ this.getContentRedaction() == null)
            return false;
        if (other.getContentRedaction() != null
                && other.getContentRedaction().equals(this.getContentRedaction()) == false)
            return false;
        if (other.getIdentifyLanguage() == null ^ this.getIdentifyLanguage() == null)
            return false;
        if (other.getIdentifyLanguage() != null
                && other.getIdentifyLanguage().equals(this.getIdentifyLanguage()) == false)
            return false;
        if (other.getLanguageOptions() == null ^ this.getLanguageOptions() == null)
            return false;
        if (other.getLanguageOptions() != null
                && other.getLanguageOptions().equals(this.getLanguageOptions()) == false)
            return false;
        if (other.getIdentifiedLanguageScore() == null ^ this.getIdentifiedLanguageScore() == null)
            return false;
        if (other.getIdentifiedLanguageScore() != null
                && other.getIdentifiedLanguageScore().equals(this.getIdentifiedLanguageScore()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSubtitles() == null ^ this.getSubtitles() == null)
            return false;
        if (other.getSubtitles() != null
                && other.getSubtitles().equals(this.getSubtitles()) == false)
            return false;
        if (other.getLanguageIdSettings() == null ^ this.getLanguageIdSettings() == null)
            return false;
        if (other.getLanguageIdSettings() != null
                && other.getLanguageIdSettings().equals(this.getLanguageIdSettings()) == false)
            return false;
        return true;
    }
}
