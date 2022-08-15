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
 * Provides detailed information about a transcription job.
 * </p>
 * <p>
 * To view the status of the specified transcription job, check the
 * <code>TranscriptionJobStatus</code> field. If the status is
 * <code>COMPLETED</code>, the job is finished and you can find the results at
 * the location specified in <code>TranscriptFileUri</code>. If the status is
 * <code>FAILED</code>, <code>FailureReason</code> provides details on why your
 * transcription job failed.
 * </p>
 * <p>
 * If you enabled content redaction, the redacted transcript can be found at the
 * location specified in <code>RedactedTranscriptFileUri</code>.
 * </p>
 */
public class TranscriptionJob implements Serializable {
    /**
     * <p>
     * The name of the transcription job. Job names are case sensitive and must
     * be unique within an Amazon Web Services account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String transcriptionJobName;

    /**
     * <p>
     * Provides the status of the specified transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can
     * find the results at the location specified in
     * <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>
     * , if you requested transcript redaction). If the status is
     * <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     */
    private String transcriptionJobStatus;

    /**
     * <p>
     * The language code used to create your transcription job. For a list of
     * supported languages and their associated language codes, refer to the <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>,
     * <code>IdentifyLanguage</code>, or <code>IdentifyMultipleLanguages</code>
     * in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ
     */
    private String languageCode;

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in your input media file.
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
     * Describes the Amazon S3 location of the media file you want to use in
     * your request.
     * </p>
     */
    private Media media;

    /**
     * <p>
     * Provides you with the Amazon S3 URI you can use to access your
     * transcript.
     * </p>
     */
    private Transcript transcript;

    /**
     * <p>
     * The date and time the specified transcription job began processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The date and time the specified transcription job request was made.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The date and time the specified transcription job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription
     * job that started processing at 12:33 PM UTC-7 on May 4, 2022.
     * </p>
     */
    private java.util.Date completionTime;

    /**
     * <p>
     * If <code>TranscriptionJobStatus</code> is <code>FAILED</code>,
     * <code>FailureReason</code> contains information about why the
     * transcription job request failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field contains one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>.
     * </p>
     * <p>
     * The media format specified in <code>MediaFormat</code> isn't valid. Refer
     * to <b>MediaFormat</b> for a list of supported formats.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>
     * .
     * </p>
     * <p>
     * The media format specified in <code>MediaFormat</code> doesn't match the
     * format of the input file. Check the media format of your media file and
     * correct the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>.
     * </p>
     * <p>
     * The sample rate specified in <code>MediaSampleRateHertz</code> isn't
     * valid. The sample rate must be between 8,000 and 48,000 Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>
     * .
     * </p>
     * <p>
     * The sample rate specified in <code>MediaSampleRateHertz</code> doesn't
     * match the sample rate detected in your input media file. Check the sample
     * rate of your media file and correct the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>.
     * </p>
     * <p>
     * The size of your media file is larger than what Amazon Transcribe can
     * process. For more information, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     * >Guidelines and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>.
     * </p>
     * <p>
     * Your audio contains more channels than Amazon Transcribe is able to
     * process. For more information, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     * >Guidelines and quotas</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String failureReason;

    /**
     * <p>
     * Specify additional optional settings in your request, including channel
     * identification, alternative transcriptions, speaker labeling; allows you
     * to apply custom vocabularies and vocabulary filters.
     * </p>
     * <p>
     * If you want to include a custom vocabulary or a custom vocabulary filter
     * (or both) with your request but <b>do not</b> want to use automatic
     * language identification, use <code>Settings</code> with the
     * <code>VocabularyName</code> or <code>VocabularyFilterName</code> (or
     * both) sub-parameter.
     * </p>
     * <p>
     * If you're using automatic language identification with your request and
     * want to include a custom language model, a custom vocabulary, or a custom
     * vocabulary filter, do not use the <code>Settings</code> parameter; use
     * instead the <code/> parameter with the <code>LanguageModelName</code>,
     * <code>VocabularyName</code> or <code>VocabularyFilterName</code>
     * sub-parameters.
     * </p>
     */
    private Settings settings;

    /**
     * <p>
     * The custom language model you want to include with your transcription
     * job. If you include <code>ModelSettings</code> in your request, you must
     * include the <code>LanguageModelName</code> sub-parameter.
     * </p>
     */
    private ModelSettings modelSettings;

    /**
     * <p>
     * Provides information about how your transcription job is being processed.
     * This parameter shows if your request is queued and what data access role
     * is being used.
     * </p>
     */
    private JobExecutionSettings jobExecutionSettings;

    /**
     * <p>
     * Redacts or flags specified personally identifiable information (PII) in
     * your transcript.
     * </p>
     */
    private ContentRedaction contentRedaction;

    /**
     * <p>
     * Indicates whether automatic language identification was enabled (
     * <code>TRUE</code>) for the specified transcription job.
     * </p>
     */
    private Boolean identifyLanguage;

    /**
     * <p>
     * Indicates whether automatic multi-language identification was enabled (
     * <code>TRUE</code>) for the specified transcription job.
     * </p>
     */
    private Boolean identifyMultipleLanguages;

    /**
     * <p>
     * You can specify two or more language codes that represent the languages
     * you think may be present in your media; including more than five is not
     * recommended. If you're unsure what languages are present, do not include
     * this parameter.
     * </p>
     * <p>
     * If you include <code>LanguageOptions</code> in your request, you must
     * also include <code>IdentifyLanguage</code>.
     * </p>
     * <p>
     * For more information, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a>.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your
     * media file must be encoded at a sample rate of 16,000 Hz or higher.
     * </p>
     */
    private java.util.List<String> languageOptions;

    /**
     * <p>
     * The confidence score associated with the language identified in your
     * media file.
     * </p>
     * <p>
     * Confidence scores are values between 0 and 1; a larger value indicates a
     * higher probability that the identified language correctly matches the
     * language spoken in your media.
     * </p>
     */
    private Float identifiedLanguageScore;

    /**
     * <p>
     * The language codes used to create your transcription job. This parameter
     * is used with multi-language identification. For single-language
     * identification requests, refer to the singular version of this parameter,
     * <code>LanguageCode</code>.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes,
     * refer to the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     */
    private java.util.List<LanguageCodeItem> languageCodes;

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a
     * new transcription job at the time you start this new job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Generate subtitles for your media file with your transcription request.
     * </p>
     */
    private SubtitlesOutput subtitles;

    /**
     * <p>
     * If using automatic language identification (<code>IdentifyLanguage</code>
     * ) in your request and you want to apply a custom language model, a custom
     * vocabulary, or a custom vocabulary filter, include
     * <code>LanguageIdSettings</code> with the relevant sub-parameters (
     * <code>VocabularyName</code>, <code>LanguageModelName</code>, and
     * <code>VocabularyFilterName</code>).
     * </p>
     * <p>
     * You can specify two or more language codes that represent the languages
     * you think may be present in your media; including more than five is not
     * recommended. Each language code you include can have an associated custom
     * language model, custom vocabulary, and custom vocabulary filter. The
     * languages you specify must match the languages of the specified custom
     * language models, custom vocabularies, and custom vocabulary filters.
     * </p>
     * <p>
     * To include language options using <code>IdentifyLanguage</code>
     * <b>without</b> including a custom language model, a custom vocabulary, or
     * a custom vocabulary filter, use <code>LanguageOptions</code> instead of
     * <code>LanguageIdSettings</code>. Including language options can improve
     * the accuracy of automatic language identification.
     * </p>
     * <p>
     * If you want to include a custom language model with your request but
     * <b>do not</b> want to use automatic language identification, use instead
     * the <code/> parameter with the <code>LanguageModelName</code>
     * sub-parameter.
     * </p>
     * <p>
     * If you want to include a custom vocabulary or a custom vocabulary filter
     * (or both) with your request but <b>do not</b> want to use automatic
     * language identification, use instead the
     * <code/> parameter with the <code>VocabularyName</code> or
     * <code>VocabularyFilterName</code> (or both) sub-parameter.
     * </p>
     */
    private java.util.Map<String, LanguageIdSettings> languageIdSettings;

    /**
     * <p>
     * The name of the transcription job. Job names are case sensitive and must
     * be unique within an Amazon Web Services account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the transcription job. Job names are case sensitive
     *         and must be unique within an Amazon Web Services account.
     *         </p>
     */
    public String getTranscriptionJobName() {
        return transcriptionJobName;
    }

    /**
     * <p>
     * The name of the transcription job. Job names are case sensitive and must
     * be unique within an Amazon Web Services account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param transcriptionJobName <p>
     *            The name of the transcription job. Job names are case
     *            sensitive and must be unique within an Amazon Web Services
     *            account.
     *            </p>
     */
    public void setTranscriptionJobName(String transcriptionJobName) {
        this.transcriptionJobName = transcriptionJobName;
    }

    /**
     * <p>
     * The name of the transcription job. Job names are case sensitive and must
     * be unique within an Amazon Web Services account.
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
     *            The name of the transcription job. Job names are case
     *            sensitive and must be unique within an Amazon Web Services
     *            account.
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
     * Provides the status of the specified transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can
     * find the results at the location specified in
     * <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>
     * , if you requested transcript redaction). If the status is
     * <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @return <p>
     *         Provides the status of the specified transcription job.
     *         </p>
     *         <p>
     *         If the status is <code>COMPLETED</code>, the job is finished and
     *         you can find the results at the location specified in
     *         <code>TranscriptFileUri</code> (or
     *         <code>RedactedTranscriptFileUri</code>, if you requested
     *         transcript redaction). If the status is <code>FAILED</code>,
     *         <code>FailureReason</code> provides details on why your
     *         transcription job failed.
     *         </p>
     * @see TranscriptionJobStatus
     */
    public String getTranscriptionJobStatus() {
        return transcriptionJobStatus;
    }

    /**
     * <p>
     * Provides the status of the specified transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can
     * find the results at the location specified in
     * <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>
     * , if you requested transcript redaction). If the status is
     * <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            Provides the status of the specified transcription job.
     *            </p>
     *            <p>
     *            If the status is <code>COMPLETED</code>, the job is finished
     *            and you can find the results at the location specified in
     *            <code>TranscriptFileUri</code> (or
     *            <code>RedactedTranscriptFileUri</code>, if you requested
     *            transcript redaction). If the status is <code>FAILED</code>,
     *            <code>FailureReason</code> provides details on why your
     *            transcription job failed.
     *            </p>
     * @see TranscriptionJobStatus
     */
    public void setTranscriptionJobStatus(String transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus;
    }

    /**
     * <p>
     * Provides the status of the specified transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can
     * find the results at the location specified in
     * <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>
     * , if you requested transcript redaction). If the status is
     * <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            Provides the status of the specified transcription job.
     *            </p>
     *            <p>
     *            If the status is <code>COMPLETED</code>, the job is finished
     *            and you can find the results at the location specified in
     *            <code>TranscriptFileUri</code> (or
     *            <code>RedactedTranscriptFileUri</code>, if you requested
     *            transcript redaction). If the status is <code>FAILED</code>,
     *            <code>FailureReason</code> provides details on why your
     *            transcription job failed.
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
     * Provides the status of the specified transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can
     * find the results at the location specified in
     * <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>
     * , if you requested transcript redaction). If the status is
     * <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            Provides the status of the specified transcription job.
     *            </p>
     *            <p>
     *            If the status is <code>COMPLETED</code>, the job is finished
     *            and you can find the results at the location specified in
     *            <code>TranscriptFileUri</code> (or
     *            <code>RedactedTranscriptFileUri</code>, if you requested
     *            transcript redaction). If the status is <code>FAILED</code>,
     *            <code>FailureReason</code> provides details on why your
     *            transcription job failed.
     *            </p>
     * @see TranscriptionJobStatus
     */
    public void setTranscriptionJobStatus(TranscriptionJobStatus transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus.toString();
    }

    /**
     * <p>
     * Provides the status of the specified transcription job.
     * </p>
     * <p>
     * If the status is <code>COMPLETED</code>, the job is finished and you can
     * find the results at the location specified in
     * <code>TranscriptFileUri</code> (or <code>RedactedTranscriptFileUri</code>
     * , if you requested transcript redaction). If the status is
     * <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your transcription job failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param transcriptionJobStatus <p>
     *            Provides the status of the specified transcription job.
     *            </p>
     *            <p>
     *            If the status is <code>COMPLETED</code>, the job is finished
     *            and you can find the results at the location specified in
     *            <code>TranscriptFileUri</code> (or
     *            <code>RedactedTranscriptFileUri</code>, if you requested
     *            transcript redaction). If the status is <code>FAILED</code>,
     *            <code>FailureReason</code> provides details on why your
     *            transcription job failed.
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
     * The language code used to create your transcription job. For a list of
     * supported languages and their associated language codes, refer to the <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>,
     * <code>IdentifyLanguage</code>, or <code>IdentifyMultipleLanguages</code>
     * in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ
     *
     * @return <p>
     *         The language code used to create your transcription job. For a
     *         list of supported languages and their associated language codes,
     *         refer to the <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *         >Supported languages</a> table.
     *         </p>
     *         <p>
     *         Note that you must include one of <code>LanguageCode</code>,
     *         <code>IdentifyLanguage</code>, or
     *         <code>IdentifyMultipleLanguages</code> in your request. If you
     *         include more than one of these parameters, your transcription job
     *         fails.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code used to create your transcription job. For a list of
     * supported languages and their associated language codes, refer to the <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>,
     * <code>IdentifyLanguage</code>, or <code>IdentifyMultipleLanguages</code>
     * in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ
     *
     * @param languageCode <p>
     *            The language code used to create your transcription job. For a
     *            list of supported languages and their associated language
     *            codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     *            <p>
     *            Note that you must include one of <code>LanguageCode</code>,
     *            <code>IdentifyLanguage</code>, or
     *            <code>IdentifyMultipleLanguages</code> in your request. If you
     *            include more than one of these parameters, your transcription
     *            job fails.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code used to create your transcription job. For a list of
     * supported languages and their associated language codes, refer to the <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>,
     * <code>IdentifyLanguage</code>, or <code>IdentifyMultipleLanguages</code>
     * in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ
     *
     * @param languageCode <p>
     *            The language code used to create your transcription job. For a
     *            list of supported languages and their associated language
     *            codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     *            <p>
     *            Note that you must include one of <code>LanguageCode</code>,
     *            <code>IdentifyLanguage</code>, or
     *            <code>IdentifyMultipleLanguages</code> in your request. If you
     *            include more than one of these parameters, your transcription
     *            job fails.
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
     * The language code used to create your transcription job. For a list of
     * supported languages and their associated language codes, refer to the <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>,
     * <code>IdentifyLanguage</code>, or <code>IdentifyMultipleLanguages</code>
     * in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ
     *
     * @param languageCode <p>
     *            The language code used to create your transcription job. For a
     *            list of supported languages and their associated language
     *            codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     *            <p>
     *            Note that you must include one of <code>LanguageCode</code>,
     *            <code>IdentifyLanguage</code>, or
     *            <code>IdentifyMultipleLanguages</code> in your request. If you
     *            include more than one of these parameters, your transcription
     *            job fails.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code used to create your transcription job. For a list of
     * supported languages and their associated language codes, refer to the <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * Note that you must include one of <code>LanguageCode</code>,
     * <code>IdentifyLanguage</code>, or <code>IdentifyMultipleLanguages</code>
     * in your request. If you include more than one of these parameters, your
     * transcription job fails.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ
     *
     * @param languageCode <p>
     *            The language code used to create your transcription job. For a
     *            list of supported languages and their associated language
     *            codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     *            <p>
     *            Note that you must include one of <code>LanguageCode</code>,
     *            <code>IdentifyLanguage</code>, or
     *            <code>IdentifyMultipleLanguages</code> in your request. If you
     *            include more than one of these parameters, your transcription
     *            job fails.
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
     * The sample rate, in Hertz, of the audio track in your input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @return <p>
     *         The sample rate, in Hertz, of the audio track in your input media
     *         file.
     *         </p>
     */
    public Integer getMediaSampleRateHertz() {
        return mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in your input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate, in Hertz, of the audio track in your input
     *            media file.
     *            </p>
     */
    public void setMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in your input media file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate, in Hertz, of the audio track in your input
     *            media file.
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
     * Describes the Amazon S3 location of the media file you want to use in
     * your request.
     * </p>
     *
     * @return <p>
     *         Describes the Amazon S3 location of the media file you want to
     *         use in your request.
     *         </p>
     */
    public Media getMedia() {
        return media;
    }

    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in
     * your request.
     * </p>
     *
     * @param media <p>
     *            Describes the Amazon S3 location of the media file you want to
     *            use in your request.
     *            </p>
     */
    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in
     * your request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param media <p>
     *            Describes the Amazon S3 location of the media file you want to
     *            use in your request.
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
     * Provides you with the Amazon S3 URI you can use to access your
     * transcript.
     * </p>
     *
     * @return <p>
     *         Provides you with the Amazon S3 URI you can use to access your
     *         transcript.
     *         </p>
     */
    public Transcript getTranscript() {
        return transcript;
    }

    /**
     * <p>
     * Provides you with the Amazon S3 URI you can use to access your
     * transcript.
     * </p>
     *
     * @param transcript <p>
     *            Provides you with the Amazon S3 URI you can use to access your
     *            transcript.
     *            </p>
     */
    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    /**
     * <p>
     * Provides you with the Amazon S3 URI you can use to access your
     * transcript.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcript <p>
     *            Provides you with the Amazon S3 URI you can use to access your
     *            transcript.
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
     * The date and time the specified transcription job began processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @return <p>
     *         The date and time the specified transcription job began
     *         processing.
     *         </p>
     *         <p>
     *         Timestamps are in the format
     *         <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:32:58.789000-07:00</code> represents a
     *         transcription job that started processing at 12:32 PM UTC-7 on
     *         May 4, 2022.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The date and time the specified transcription job began processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @param startTime <p>
     *            The date and time the specified transcription job began
     *            processing.
     *            </p>
     *            <p>
     *            Timestamps are in the format
     *            <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *            <code>2022-05-04T12:32:58.789000-07:00</code> represents a
     *            transcription job that started processing at 12:32 PM UTC-7 on
     *            May 4, 2022.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time the specified transcription job began processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The date and time the specified transcription job began
     *            processing.
     *            </p>
     *            <p>
     *            Timestamps are in the format
     *            <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *            <code>2022-05-04T12:32:58.789000-07:00</code> represents a
     *            transcription job that started processing at 12:32 PM UTC-7 on
     *            May 4, 2022.
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
     * The date and time the specified transcription job request was made.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @return <p>
     *         The date and time the specified transcription job request was
     *         made.
     *         </p>
     *         <p>
     *         Timestamps are in the format
     *         <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:32:58.761000-07:00</code> represents a
     *         transcription job that started processing at 12:32 PM UTC-7 on
     *         May 4, 2022.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The date and time the specified transcription job request was made.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @param creationTime <p>
     *            The date and time the specified transcription job request was
     *            made.
     *            </p>
     *            <p>
     *            Timestamps are in the format
     *            <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *            <code>2022-05-04T12:32:58.761000-07:00</code> represents a
     *            transcription job that started processing at 12:32 PM UTC-7 on
     *            May 4, 2022.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time the specified transcription job request was made.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The date and time the specified transcription job request was
     *            made.
     *            </p>
     *            <p>
     *            Timestamps are in the format
     *            <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *            <code>2022-05-04T12:32:58.761000-07:00</code> represents a
     *            transcription job that started processing at 12:32 PM UTC-7 on
     *            May 4, 2022.
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
     * The date and time the specified transcription job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription
     * job that started processing at 12:33 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @return <p>
     *         The date and time the specified transcription job finished
     *         processing.
     *         </p>
     *         <p>
     *         Timestamps are in the format
     *         <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:33:13.922000-07:00</code> represents a
     *         transcription job that started processing at 12:33 PM UTC-7 on
     *         May 4, 2022.
     *         </p>
     */
    public java.util.Date getCompletionTime() {
        return completionTime;
    }

    /**
     * <p>
     * The date and time the specified transcription job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription
     * job that started processing at 12:33 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @param completionTime <p>
     *            The date and time the specified transcription job finished
     *            processing.
     *            </p>
     *            <p>
     *            Timestamps are in the format
     *            <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *            <code>2022-05-04T12:33:13.922000-07:00</code> represents a
     *            transcription job that started processing at 12:33 PM UTC-7 on
     *            May 4, 2022.
     *            </p>
     */
    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * The date and time the specified transcription job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription
     * job that started processing at 12:33 PM UTC-7 on May 4, 2022.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completionTime <p>
     *            The date and time the specified transcription job finished
     *            processing.
     *            </p>
     *            <p>
     *            Timestamps are in the format
     *            <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *            <code>2022-05-04T12:33:13.922000-07:00</code> represents a
     *            transcription job that started processing at 12:33 PM UTC-7 on
     *            May 4, 2022.
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
     * If <code>TranscriptionJobStatus</code> is <code>FAILED</code>,
     * <code>FailureReason</code> contains information about why the
     * transcription job request failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field contains one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>.
     * </p>
     * <p>
     * The media format specified in <code>MediaFormat</code> isn't valid. Refer
     * to <b>MediaFormat</b> for a list of supported formats.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>
     * .
     * </p>
     * <p>
     * The media format specified in <code>MediaFormat</code> doesn't match the
     * format of the input file. Check the media format of your media file and
     * correct the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>.
     * </p>
     * <p>
     * The sample rate specified in <code>MediaSampleRateHertz</code> isn't
     * valid. The sample rate must be between 8,000 and 48,000 Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>
     * .
     * </p>
     * <p>
     * The sample rate specified in <code>MediaSampleRateHertz</code> doesn't
     * match the sample rate detected in your input media file. Check the sample
     * rate of your media file and correct the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>.
     * </p>
     * <p>
     * The size of your media file is larger than what Amazon Transcribe can
     * process. For more information, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     * >Guidelines and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>.
     * </p>
     * <p>
     * Your audio contains more channels than Amazon Transcribe is able to
     * process. For more information, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     * >Guidelines and quotas</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         If <code>TranscriptionJobStatus</code> is <code>FAILED</code>,
     *         <code>FailureReason</code> contains information about why the
     *         transcription job request failed.
     *         </p>
     *         <p>
     *         The <code>FailureReason</code> field contains one of the
     *         following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Unsupported media format</code>.
     *         </p>
     *         <p>
     *         The media format specified in <code>MediaFormat</code> isn't
     *         valid. Refer to <b>MediaFormat</b> for a list of supported
     *         formats.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>The media format provided does not match the detected media format</code>
     *         .
     *         </p>
     *         <p>
     *         The media format specified in <code>MediaFormat</code> doesn't
     *         match the format of the input file. Check the media format of
     *         your media file and correct the specified value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid sample rate for audio file</code>.
     *         </p>
     *         <p>
     *         The sample rate specified in <code>MediaSampleRateHertz</code>
     *         isn't valid. The sample rate must be between 8,000 and 48,000
     *         Hertz.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>The sample rate provided does not match the detected sample rate</code>
     *         .
     *         </p>
     *         <p>
     *         The sample rate specified in <code>MediaSampleRateHertz</code>
     *         doesn't match the sample rate detected in your input media file.
     *         Check the sample rate of your media file and correct the
     *         specified value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid file size: file size too large</code>.
     *         </p>
     *         <p>
     *         The size of your media file is larger than what Amazon Transcribe
     *         can process. For more information, refer to <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     *         >Guidelines and quotas</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid number of channels: number of channels too large</code>
     *         .
     *         </p>
     *         <p>
     *         Your audio contains more channels than Amazon Transcribe is able
     *         to process. For more information, refer to <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     *         >Guidelines and quotas</a>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If <code>TranscriptionJobStatus</code> is <code>FAILED</code>,
     * <code>FailureReason</code> contains information about why the
     * transcription job request failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field contains one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>.
     * </p>
     * <p>
     * The media format specified in <code>MediaFormat</code> isn't valid. Refer
     * to <b>MediaFormat</b> for a list of supported formats.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>
     * .
     * </p>
     * <p>
     * The media format specified in <code>MediaFormat</code> doesn't match the
     * format of the input file. Check the media format of your media file and
     * correct the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>.
     * </p>
     * <p>
     * The sample rate specified in <code>MediaSampleRateHertz</code> isn't
     * valid. The sample rate must be between 8,000 and 48,000 Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>
     * .
     * </p>
     * <p>
     * The sample rate specified in <code>MediaSampleRateHertz</code> doesn't
     * match the sample rate detected in your input media file. Check the sample
     * rate of your media file and correct the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>.
     * </p>
     * <p>
     * The size of your media file is larger than what Amazon Transcribe can
     * process. For more information, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     * >Guidelines and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>.
     * </p>
     * <p>
     * Your audio contains more channels than Amazon Transcribe is able to
     * process. For more information, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     * >Guidelines and quotas</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @param failureReason <p>
     *            If <code>TranscriptionJobStatus</code> is <code>FAILED</code>,
     *            <code>FailureReason</code> contains information about why the
     *            transcription job request failed.
     *            </p>
     *            <p>
     *            The <code>FailureReason</code> field contains one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Unsupported media format</code>.
     *            </p>
     *            <p>
     *            The media format specified in <code>MediaFormat</code> isn't
     *            valid. Refer to <b>MediaFormat</b> for a list of supported
     *            formats.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>The media format provided does not match the detected media format</code>
     *            .
     *            </p>
     *            <p>
     *            The media format specified in <code>MediaFormat</code> doesn't
     *            match the format of the input file. Check the media format of
     *            your media file and correct the specified value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid sample rate for audio file</code>.
     *            </p>
     *            <p>
     *            The sample rate specified in <code>MediaSampleRateHertz</code>
     *            isn't valid. The sample rate must be between 8,000 and 48,000
     *            Hertz.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>The sample rate provided does not match the detected sample rate</code>
     *            .
     *            </p>
     *            <p>
     *            The sample rate specified in <code>MediaSampleRateHertz</code>
     *            doesn't match the sample rate detected in your input media
     *            file. Check the sample rate of your media file and correct the
     *            specified value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid file size: file size too large</code>.
     *            </p>
     *            <p>
     *            The size of your media file is larger than what Amazon
     *            Transcribe can process. For more information, refer to <a
     *            href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     *            >Guidelines and quotas</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid number of channels: number of channels too large</code>
     *            .
     *            </p>
     *            <p>
     *            Your audio contains more channels than Amazon Transcribe is
     *            able to process. For more information, refer to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     *            >Guidelines and quotas</a>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If <code>TranscriptionJobStatus</code> is <code>FAILED</code>,
     * <code>FailureReason</code> contains information about why the
     * transcription job request failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field contains one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>.
     * </p>
     * <p>
     * The media format specified in <code>MediaFormat</code> isn't valid. Refer
     * to <b>MediaFormat</b> for a list of supported formats.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>
     * .
     * </p>
     * <p>
     * The media format specified in <code>MediaFormat</code> doesn't match the
     * format of the input file. Check the media format of your media file and
     * correct the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>.
     * </p>
     * <p>
     * The sample rate specified in <code>MediaSampleRateHertz</code> isn't
     * valid. The sample rate must be between 8,000 and 48,000 Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>
     * .
     * </p>
     * <p>
     * The sample rate specified in <code>MediaSampleRateHertz</code> doesn't
     * match the sample rate detected in your input media file. Check the sample
     * rate of your media file and correct the specified value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>.
     * </p>
     * <p>
     * The size of your media file is larger than what Amazon Transcribe can
     * process. For more information, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     * >Guidelines and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>.
     * </p>
     * <p>
     * Your audio contains more channels than Amazon Transcribe is able to
     * process. For more information, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     * >Guidelines and quotas</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            If <code>TranscriptionJobStatus</code> is <code>FAILED</code>,
     *            <code>FailureReason</code> contains information about why the
     *            transcription job request failed.
     *            </p>
     *            <p>
     *            The <code>FailureReason</code> field contains one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Unsupported media format</code>.
     *            </p>
     *            <p>
     *            The media format specified in <code>MediaFormat</code> isn't
     *            valid. Refer to <b>MediaFormat</b> for a list of supported
     *            formats.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>The media format provided does not match the detected media format</code>
     *            .
     *            </p>
     *            <p>
     *            The media format specified in <code>MediaFormat</code> doesn't
     *            match the format of the input file. Check the media format of
     *            your media file and correct the specified value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid sample rate for audio file</code>.
     *            </p>
     *            <p>
     *            The sample rate specified in <code>MediaSampleRateHertz</code>
     *            isn't valid. The sample rate must be between 8,000 and 48,000
     *            Hertz.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>The sample rate provided does not match the detected sample rate</code>
     *            .
     *            </p>
     *            <p>
     *            The sample rate specified in <code>MediaSampleRateHertz</code>
     *            doesn't match the sample rate detected in your input media
     *            file. Check the sample rate of your media file and correct the
     *            specified value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid file size: file size too large</code>.
     *            </p>
     *            <p>
     *            The size of your media file is larger than what Amazon
     *            Transcribe can process. For more information, refer to <a
     *            href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     *            >Guidelines and quotas</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid number of channels: number of channels too large</code>
     *            .
     *            </p>
     *            <p>
     *            Your audio contains more channels than Amazon Transcribe is
     *            able to process. For more information, refer to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits"
     *            >Guidelines and quotas</a>.
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
     * Specify additional optional settings in your request, including channel
     * identification, alternative transcriptions, speaker labeling; allows you
     * to apply custom vocabularies and vocabulary filters.
     * </p>
     * <p>
     * If you want to include a custom vocabulary or a custom vocabulary filter
     * (or both) with your request but <b>do not</b> want to use automatic
     * language identification, use <code>Settings</code> with the
     * <code>VocabularyName</code> or <code>VocabularyFilterName</code> (or
     * both) sub-parameter.
     * </p>
     * <p>
     * If you're using automatic language identification with your request and
     * want to include a custom language model, a custom vocabulary, or a custom
     * vocabulary filter, do not use the <code>Settings</code> parameter; use
     * instead the <code/> parameter with the <code>LanguageModelName</code>,
     * <code>VocabularyName</code> or <code>VocabularyFilterName</code>
     * sub-parameters.
     * </p>
     *
     * @return <p>
     *         Specify additional optional settings in your request, including
     *         channel identification, alternative transcriptions, speaker
     *         labeling; allows you to apply custom vocabularies and vocabulary
     *         filters.
     *         </p>
     *         <p>
     *         If you want to include a custom vocabulary or a custom vocabulary
     *         filter (or both) with your request but <b>do not</b> want to use
     *         automatic language identification, use <code>Settings</code> with
     *         the <code>VocabularyName</code> or
     *         <code>VocabularyFilterName</code> (or both) sub-parameter.
     *         </p>
     *         <p>
     *         If you're using automatic language identification with your
     *         request and want to include a custom language model, a custom
     *         vocabulary, or a custom vocabulary filter, do not use the
     *         <code>Settings</code> parameter; use instead the
     *         <code/> parameter with the <code>LanguageModelName</code>,
     *         <code>VocabularyName</code> or <code>VocabularyFilterName</code>
     *         sub-parameters.
     *         </p>
     */
    public Settings getSettings() {
        return settings;
    }

    /**
     * <p>
     * Specify additional optional settings in your request, including channel
     * identification, alternative transcriptions, speaker labeling; allows you
     * to apply custom vocabularies and vocabulary filters.
     * </p>
     * <p>
     * If you want to include a custom vocabulary or a custom vocabulary filter
     * (or both) with your request but <b>do not</b> want to use automatic
     * language identification, use <code>Settings</code> with the
     * <code>VocabularyName</code> or <code>VocabularyFilterName</code> (or
     * both) sub-parameter.
     * </p>
     * <p>
     * If you're using automatic language identification with your request and
     * want to include a custom language model, a custom vocabulary, or a custom
     * vocabulary filter, do not use the <code>Settings</code> parameter; use
     * instead the <code/> parameter with the <code>LanguageModelName</code>,
     * <code>VocabularyName</code> or <code>VocabularyFilterName</code>
     * sub-parameters.
     * </p>
     *
     * @param settings <p>
     *            Specify additional optional settings in your request,
     *            including channel identification, alternative transcriptions,
     *            speaker labeling; allows you to apply custom vocabularies and
     *            vocabulary filters.
     *            </p>
     *            <p>
     *            If you want to include a custom vocabulary or a custom
     *            vocabulary filter (or both) with your request but <b>do
     *            not</b> want to use automatic language identification, use
     *            <code>Settings</code> with the <code>VocabularyName</code> or
     *            <code>VocabularyFilterName</code> (or both) sub-parameter.
     *            </p>
     *            <p>
     *            If you're using automatic language identification with your
     *            request and want to include a custom language model, a custom
     *            vocabulary, or a custom vocabulary filter, do not use the
     *            <code>Settings</code> parameter; use instead the
     *            <code/> parameter with the <code>LanguageModelName</code>,
     *            <code>VocabularyName</code> or
     *            <code>VocabularyFilterName</code> sub-parameters.
     *            </p>
     */
    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Specify additional optional settings in your request, including channel
     * identification, alternative transcriptions, speaker labeling; allows you
     * to apply custom vocabularies and vocabulary filters.
     * </p>
     * <p>
     * If you want to include a custom vocabulary or a custom vocabulary filter
     * (or both) with your request but <b>do not</b> want to use automatic
     * language identification, use <code>Settings</code> with the
     * <code>VocabularyName</code> or <code>VocabularyFilterName</code> (or
     * both) sub-parameter.
     * </p>
     * <p>
     * If you're using automatic language identification with your request and
     * want to include a custom language model, a custom vocabulary, or a custom
     * vocabulary filter, do not use the <code>Settings</code> parameter; use
     * instead the <code/> parameter with the <code>LanguageModelName</code>,
     * <code>VocabularyName</code> or <code>VocabularyFilterName</code>
     * sub-parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            Specify additional optional settings in your request,
     *            including channel identification, alternative transcriptions,
     *            speaker labeling; allows you to apply custom vocabularies and
     *            vocabulary filters.
     *            </p>
     *            <p>
     *            If you want to include a custom vocabulary or a custom
     *            vocabulary filter (or both) with your request but <b>do
     *            not</b> want to use automatic language identification, use
     *            <code>Settings</code> with the <code>VocabularyName</code> or
     *            <code>VocabularyFilterName</code> (or both) sub-parameter.
     *            </p>
     *            <p>
     *            If you're using automatic language identification with your
     *            request and want to include a custom language model, a custom
     *            vocabulary, or a custom vocabulary filter, do not use the
     *            <code>Settings</code> parameter; use instead the
     *            <code/> parameter with the <code>LanguageModelName</code>,
     *            <code>VocabularyName</code> or
     *            <code>VocabularyFilterName</code> sub-parameters.
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
     * The custom language model you want to include with your transcription
     * job. If you include <code>ModelSettings</code> in your request, you must
     * include the <code>LanguageModelName</code> sub-parameter.
     * </p>
     *
     * @return <p>
     *         The custom language model you want to include with your
     *         transcription job. If you include <code>ModelSettings</code> in
     *         your request, you must include the <code>LanguageModelName</code>
     *         sub-parameter.
     *         </p>
     */
    public ModelSettings getModelSettings() {
        return modelSettings;
    }

    /**
     * <p>
     * The custom language model you want to include with your transcription
     * job. If you include <code>ModelSettings</code> in your request, you must
     * include the <code>LanguageModelName</code> sub-parameter.
     * </p>
     *
     * @param modelSettings <p>
     *            The custom language model you want to include with your
     *            transcription job. If you include <code>ModelSettings</code>
     *            in your request, you must include the
     *            <code>LanguageModelName</code> sub-parameter.
     *            </p>
     */
    public void setModelSettings(ModelSettings modelSettings) {
        this.modelSettings = modelSettings;
    }

    /**
     * <p>
     * The custom language model you want to include with your transcription
     * job. If you include <code>ModelSettings</code> in your request, you must
     * include the <code>LanguageModelName</code> sub-parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelSettings <p>
     *            The custom language model you want to include with your
     *            transcription job. If you include <code>ModelSettings</code>
     *            in your request, you must include the
     *            <code>LanguageModelName</code> sub-parameter.
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
     * Provides information about how your transcription job is being processed.
     * This parameter shows if your request is queued and what data access role
     * is being used.
     * </p>
     *
     * @return <p>
     *         Provides information about how your transcription job is being
     *         processed. This parameter shows if your request is queued and
     *         what data access role is being used.
     *         </p>
     */
    public JobExecutionSettings getJobExecutionSettings() {
        return jobExecutionSettings;
    }

    /**
     * <p>
     * Provides information about how your transcription job is being processed.
     * This parameter shows if your request is queued and what data access role
     * is being used.
     * </p>
     *
     * @param jobExecutionSettings <p>
     *            Provides information about how your transcription job is being
     *            processed. This parameter shows if your request is queued and
     *            what data access role is being used.
     *            </p>
     */
    public void setJobExecutionSettings(JobExecutionSettings jobExecutionSettings) {
        this.jobExecutionSettings = jobExecutionSettings;
    }

    /**
     * <p>
     * Provides information about how your transcription job is being processed.
     * This parameter shows if your request is queued and what data access role
     * is being used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobExecutionSettings <p>
     *            Provides information about how your transcription job is being
     *            processed. This parameter shows if your request is queued and
     *            what data access role is being used.
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
     * Redacts or flags specified personally identifiable information (PII) in
     * your transcript.
     * </p>
     *
     * @return <p>
     *         Redacts or flags specified personally identifiable information
     *         (PII) in your transcript.
     *         </p>
     */
    public ContentRedaction getContentRedaction() {
        return contentRedaction;
    }

    /**
     * <p>
     * Redacts or flags specified personally identifiable information (PII) in
     * your transcript.
     * </p>
     *
     * @param contentRedaction <p>
     *            Redacts or flags specified personally identifiable information
     *            (PII) in your transcript.
     *            </p>
     */
    public void setContentRedaction(ContentRedaction contentRedaction) {
        this.contentRedaction = contentRedaction;
    }

    /**
     * <p>
     * Redacts or flags specified personally identifiable information (PII) in
     * your transcript.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentRedaction <p>
     *            Redacts or flags specified personally identifiable information
     *            (PII) in your transcript.
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
     * Indicates whether automatic language identification was enabled (
     * <code>TRUE</code>) for the specified transcription job.
     * </p>
     *
     * @return <p>
     *         Indicates whether automatic language identification was enabled (
     *         <code>TRUE</code>) for the specified transcription job.
     *         </p>
     */
    public Boolean isIdentifyLanguage() {
        return identifyLanguage;
    }

    /**
     * <p>
     * Indicates whether automatic language identification was enabled (
     * <code>TRUE</code>) for the specified transcription job.
     * </p>
     *
     * @return <p>
     *         Indicates whether automatic language identification was enabled (
     *         <code>TRUE</code>) for the specified transcription job.
     *         </p>
     */
    public Boolean getIdentifyLanguage() {
        return identifyLanguage;
    }

    /**
     * <p>
     * Indicates whether automatic language identification was enabled (
     * <code>TRUE</code>) for the specified transcription job.
     * </p>
     *
     * @param identifyLanguage <p>
     *            Indicates whether automatic language identification was
     *            enabled (<code>TRUE</code>) for the specified transcription
     *            job.
     *            </p>
     */
    public void setIdentifyLanguage(Boolean identifyLanguage) {
        this.identifyLanguage = identifyLanguage;
    }

    /**
     * <p>
     * Indicates whether automatic language identification was enabled (
     * <code>TRUE</code>) for the specified transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identifyLanguage <p>
     *            Indicates whether automatic language identification was
     *            enabled (<code>TRUE</code>) for the specified transcription
     *            job.
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
     * Indicates whether automatic multi-language identification was enabled (
     * <code>TRUE</code>) for the specified transcription job.
     * </p>
     *
     * @return <p>
     *         Indicates whether automatic multi-language identification was
     *         enabled (<code>TRUE</code>) for the specified transcription job.
     *         </p>
     */
    public Boolean isIdentifyMultipleLanguages() {
        return identifyMultipleLanguages;
    }

    /**
     * <p>
     * Indicates whether automatic multi-language identification was enabled (
     * <code>TRUE</code>) for the specified transcription job.
     * </p>
     *
     * @return <p>
     *         Indicates whether automatic multi-language identification was
     *         enabled (<code>TRUE</code>) for the specified transcription job.
     *         </p>
     */
    public Boolean getIdentifyMultipleLanguages() {
        return identifyMultipleLanguages;
    }

    /**
     * <p>
     * Indicates whether automatic multi-language identification was enabled (
     * <code>TRUE</code>) for the specified transcription job.
     * </p>
     *
     * @param identifyMultipleLanguages <p>
     *            Indicates whether automatic multi-language identification was
     *            enabled (<code>TRUE</code>) for the specified transcription
     *            job.
     *            </p>
     */
    public void setIdentifyMultipleLanguages(Boolean identifyMultipleLanguages) {
        this.identifyMultipleLanguages = identifyMultipleLanguages;
    }

    /**
     * <p>
     * Indicates whether automatic multi-language identification was enabled (
     * <code>TRUE</code>) for the specified transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identifyMultipleLanguages <p>
     *            Indicates whether automatic multi-language identification was
     *            enabled (<code>TRUE</code>) for the specified transcription
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withIdentifyMultipleLanguages(Boolean identifyMultipleLanguages) {
        this.identifyMultipleLanguages = identifyMultipleLanguages;
        return this;
    }

    /**
     * <p>
     * You can specify two or more language codes that represent the languages
     * you think may be present in your media; including more than five is not
     * recommended. If you're unsure what languages are present, do not include
     * this parameter.
     * </p>
     * <p>
     * If you include <code>LanguageOptions</code> in your request, you must
     * also include <code>IdentifyLanguage</code>.
     * </p>
     * <p>
     * For more information, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a>.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your
     * media file must be encoded at a sample rate of 16,000 Hz or higher.
     * </p>
     *
     * @return <p>
     *         You can specify two or more language codes that represent the
     *         languages you think may be present in your media; including more
     *         than five is not recommended. If you're unsure what languages are
     *         present, do not include this parameter.
     *         </p>
     *         <p>
     *         If you include <code>LanguageOptions</code> in your request, you
     *         must also include <code>IdentifyLanguage</code>.
     *         </p>
     *         <p>
     *         For more information, refer to <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *         >Supported languages</a>.
     *         </p>
     *         <p>
     *         To transcribe speech in Modern Standard Arabic (
     *         <code>ar-SA</code>), your media file must be encoded at a sample
     *         rate of 16,000 Hz or higher.
     *         </p>
     */
    public java.util.List<String> getLanguageOptions() {
        return languageOptions;
    }

    /**
     * <p>
     * You can specify two or more language codes that represent the languages
     * you think may be present in your media; including more than five is not
     * recommended. If you're unsure what languages are present, do not include
     * this parameter.
     * </p>
     * <p>
     * If you include <code>LanguageOptions</code> in your request, you must
     * also include <code>IdentifyLanguage</code>.
     * </p>
     * <p>
     * For more information, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a>.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your
     * media file must be encoded at a sample rate of 16,000 Hz or higher.
     * </p>
     *
     * @param languageOptions <p>
     *            You can specify two or more language codes that represent the
     *            languages you think may be present in your media; including
     *            more than five is not recommended. If you're unsure what
     *            languages are present, do not include this parameter.
     *            </p>
     *            <p>
     *            If you include <code>LanguageOptions</code> in your request,
     *            you must also include <code>IdentifyLanguage</code>.
     *            </p>
     *            <p>
     *            For more information, refer to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a>.
     *            </p>
     *            <p>
     *            To transcribe speech in Modern Standard Arabic (
     *            <code>ar-SA</code>), your media file must be encoded at a
     *            sample rate of 16,000 Hz or higher.
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
     * You can specify two or more language codes that represent the languages
     * you think may be present in your media; including more than five is not
     * recommended. If you're unsure what languages are present, do not include
     * this parameter.
     * </p>
     * <p>
     * If you include <code>LanguageOptions</code> in your request, you must
     * also include <code>IdentifyLanguage</code>.
     * </p>
     * <p>
     * For more information, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a>.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your
     * media file must be encoded at a sample rate of 16,000 Hz or higher.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageOptions <p>
     *            You can specify two or more language codes that represent the
     *            languages you think may be present in your media; including
     *            more than five is not recommended. If you're unsure what
     *            languages are present, do not include this parameter.
     *            </p>
     *            <p>
     *            If you include <code>LanguageOptions</code> in your request,
     *            you must also include <code>IdentifyLanguage</code>.
     *            </p>
     *            <p>
     *            For more information, refer to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a>.
     *            </p>
     *            <p>
     *            To transcribe speech in Modern Standard Arabic (
     *            <code>ar-SA</code>), your media file must be encoded at a
     *            sample rate of 16,000 Hz or higher.
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
     * You can specify two or more language codes that represent the languages
     * you think may be present in your media; including more than five is not
     * recommended. If you're unsure what languages are present, do not include
     * this parameter.
     * </p>
     * <p>
     * If you include <code>LanguageOptions</code> in your request, you must
     * also include <code>IdentifyLanguage</code>.
     * </p>
     * <p>
     * For more information, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a>.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (<code>ar-SA</code>), your
     * media file must be encoded at a sample rate of 16,000 Hz or higher.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageOptions <p>
     *            You can specify two or more language codes that represent the
     *            languages you think may be present in your media; including
     *            more than five is not recommended. If you're unsure what
     *            languages are present, do not include this parameter.
     *            </p>
     *            <p>
     *            If you include <code>LanguageOptions</code> in your request,
     *            you must also include <code>IdentifyLanguage</code>.
     *            </p>
     *            <p>
     *            For more information, refer to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a>.
     *            </p>
     *            <p>
     *            To transcribe speech in Modern Standard Arabic (
     *            <code>ar-SA</code>), your media file must be encoded at a
     *            sample rate of 16,000 Hz or higher.
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
     * The confidence score associated with the language identified in your
     * media file.
     * </p>
     * <p>
     * Confidence scores are values between 0 and 1; a larger value indicates a
     * higher probability that the identified language correctly matches the
     * language spoken in your media.
     * </p>
     *
     * @return <p>
     *         The confidence score associated with the language identified in
     *         your media file.
     *         </p>
     *         <p>
     *         Confidence scores are values between 0 and 1; a larger value
     *         indicates a higher probability that the identified language
     *         correctly matches the language spoken in your media.
     *         </p>
     */
    public Float getIdentifiedLanguageScore() {
        return identifiedLanguageScore;
    }

    /**
     * <p>
     * The confidence score associated with the language identified in your
     * media file.
     * </p>
     * <p>
     * Confidence scores are values between 0 and 1; a larger value indicates a
     * higher probability that the identified language correctly matches the
     * language spoken in your media.
     * </p>
     *
     * @param identifiedLanguageScore <p>
     *            The confidence score associated with the language identified
     *            in your media file.
     *            </p>
     *            <p>
     *            Confidence scores are values between 0 and 1; a larger value
     *            indicates a higher probability that the identified language
     *            correctly matches the language spoken in your media.
     *            </p>
     */
    public void setIdentifiedLanguageScore(Float identifiedLanguageScore) {
        this.identifiedLanguageScore = identifiedLanguageScore;
    }

    /**
     * <p>
     * The confidence score associated with the language identified in your
     * media file.
     * </p>
     * <p>
     * Confidence scores are values between 0 and 1; a larger value indicates a
     * higher probability that the identified language correctly matches the
     * language spoken in your media.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identifiedLanguageScore <p>
     *            The confidence score associated with the language identified
     *            in your media file.
     *            </p>
     *            <p>
     *            Confidence scores are values between 0 and 1; a larger value
     *            indicates a higher probability that the identified language
     *            correctly matches the language spoken in your media.
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
     * The language codes used to create your transcription job. This parameter
     * is used with multi-language identification. For single-language
     * identification requests, refer to the singular version of this parameter,
     * <code>LanguageCode</code>.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes,
     * refer to the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     *
     * @return <p>
     *         The language codes used to create your transcription job. This
     *         parameter is used with multi-language identification. For
     *         single-language identification requests, refer to the singular
     *         version of this parameter, <code>LanguageCode</code>.
     *         </p>
     *         <p>
     *         For a list of supported languages and their associated language
     *         codes, refer to the <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *         >Supported languages</a> table.
     *         </p>
     */
    public java.util.List<LanguageCodeItem> getLanguageCodes() {
        return languageCodes;
    }

    /**
     * <p>
     * The language codes used to create your transcription job. This parameter
     * is used with multi-language identification. For single-language
     * identification requests, refer to the singular version of this parameter,
     * <code>LanguageCode</code>.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes,
     * refer to the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     *
     * @param languageCodes <p>
     *            The language codes used to create your transcription job. This
     *            parameter is used with multi-language identification. For
     *            single-language identification requests, refer to the singular
     *            version of this parameter, <code>LanguageCode</code>.
     *            </p>
     *            <p>
     *            For a list of supported languages and their associated
     *            language codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     */
    public void setLanguageCodes(java.util.Collection<LanguageCodeItem> languageCodes) {
        if (languageCodes == null) {
            this.languageCodes = null;
            return;
        }

        this.languageCodes = new java.util.ArrayList<LanguageCodeItem>(languageCodes);
    }

    /**
     * <p>
     * The language codes used to create your transcription job. This parameter
     * is used with multi-language identification. For single-language
     * identification requests, refer to the singular version of this parameter,
     * <code>LanguageCode</code>.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes,
     * refer to the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageCodes <p>
     *            The language codes used to create your transcription job. This
     *            parameter is used with multi-language identification. For
     *            single-language identification requests, refer to the singular
     *            version of this parameter, <code>LanguageCode</code>.
     *            </p>
     *            <p>
     *            For a list of supported languages and their associated
     *            language codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withLanguageCodes(LanguageCodeItem... languageCodes) {
        if (getLanguageCodes() == null) {
            this.languageCodes = new java.util.ArrayList<LanguageCodeItem>(languageCodes.length);
        }
        for (LanguageCodeItem value : languageCodes) {
            this.languageCodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The language codes used to create your transcription job. This parameter
     * is used with multi-language identification. For single-language
     * identification requests, refer to the singular version of this parameter,
     * <code>LanguageCode</code>.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes,
     * refer to the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageCodes <p>
     *            The language codes used to create your transcription job. This
     *            parameter is used with multi-language identification. For
     *            single-language identification requests, refer to the singular
     *            version of this parameter, <code>LanguageCode</code>.
     *            </p>
     *            <p>
     *            For a list of supported languages and their associated
     *            language codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJob withLanguageCodes(java.util.Collection<LanguageCodeItem> languageCodes) {
        setLanguageCodes(languageCodes);
        return this;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a
     * new transcription job at the time you start this new job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     *
     * @return <p>
     *         Adds one or more custom tags, each in the form of a key:value
     *         pair, to a new transcription job at the time you start this new
     *         job.
     *         </p>
     *         <p>
     *         To learn more about using tags with Amazon Transcribe, refer to
     *         <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     *         >Tagging resources</a>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a
     * new transcription job at the time you start this new job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     *
     * @param tags <p>
     *            Adds one or more custom tags, each in the form of a key:value
     *            pair, to a new transcription job at the time you start this
     *            new job.
     *            </p>
     *            <p>
     *            To learn more about using tags with Amazon Transcribe, refer
     *            to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     *            >Tagging resources</a>.
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
     * Adds one or more custom tags, each in the form of a key:value pair, to a
     * new transcription job at the time you start this new job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Adds one or more custom tags, each in the form of a key:value
     *            pair, to a new transcription job at the time you start this
     *            new job.
     *            </p>
     *            <p>
     *            To learn more about using tags with Amazon Transcribe, refer
     *            to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     *            >Tagging resources</a>.
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
     * Adds one or more custom tags, each in the form of a key:value pair, to a
     * new transcription job at the time you start this new job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Adds one or more custom tags, each in the form of a key:value
     *            pair, to a new transcription job at the time you start this
     *            new job.
     *            </p>
     *            <p>
     *            To learn more about using tags with Amazon Transcribe, refer
     *            to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     *            >Tagging resources</a>.
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
     * Generate subtitles for your media file with your transcription request.
     * </p>
     *
     * @return <p>
     *         Generate subtitles for your media file with your transcription
     *         request.
     *         </p>
     */
    public SubtitlesOutput getSubtitles() {
        return subtitles;
    }

    /**
     * <p>
     * Generate subtitles for your media file with your transcription request.
     * </p>
     *
     * @param subtitles <p>
     *            Generate subtitles for your media file with your transcription
     *            request.
     *            </p>
     */
    public void setSubtitles(SubtitlesOutput subtitles) {
        this.subtitles = subtitles;
    }

    /**
     * <p>
     * Generate subtitles for your media file with your transcription request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subtitles <p>
     *            Generate subtitles for your media file with your transcription
     *            request.
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
     * If using automatic language identification (<code>IdentifyLanguage</code>
     * ) in your request and you want to apply a custom language model, a custom
     * vocabulary, or a custom vocabulary filter, include
     * <code>LanguageIdSettings</code> with the relevant sub-parameters (
     * <code>VocabularyName</code>, <code>LanguageModelName</code>, and
     * <code>VocabularyFilterName</code>).
     * </p>
     * <p>
     * You can specify two or more language codes that represent the languages
     * you think may be present in your media; including more than five is not
     * recommended. Each language code you include can have an associated custom
     * language model, custom vocabulary, and custom vocabulary filter. The
     * languages you specify must match the languages of the specified custom
     * language models, custom vocabularies, and custom vocabulary filters.
     * </p>
     * <p>
     * To include language options using <code>IdentifyLanguage</code>
     * <b>without</b> including a custom language model, a custom vocabulary, or
     * a custom vocabulary filter, use <code>LanguageOptions</code> instead of
     * <code>LanguageIdSettings</code>. Including language options can improve
     * the accuracy of automatic language identification.
     * </p>
     * <p>
     * If you want to include a custom language model with your request but
     * <b>do not</b> want to use automatic language identification, use instead
     * the <code/> parameter with the <code>LanguageModelName</code>
     * sub-parameter.
     * </p>
     * <p>
     * If you want to include a custom vocabulary or a custom vocabulary filter
     * (or both) with your request but <b>do not</b> want to use automatic
     * language identification, use instead the
     * <code/> parameter with the <code>VocabularyName</code> or
     * <code>VocabularyFilterName</code> (or both) sub-parameter.
     * </p>
     *
     * @return <p>
     *         If using automatic language identification (
     *         <code>IdentifyLanguage</code>) in your request and you want to
     *         apply a custom language model, a custom vocabulary, or a custom
     *         vocabulary filter, include <code>LanguageIdSettings</code> with
     *         the relevant sub-parameters (<code>VocabularyName</code>,
     *         <code>LanguageModelName</code>, and
     *         <code>VocabularyFilterName</code>).
     *         </p>
     *         <p>
     *         You can specify two or more language codes that represent the
     *         languages you think may be present in your media; including more
     *         than five is not recommended. Each language code you include can
     *         have an associated custom language model, custom vocabulary, and
     *         custom vocabulary filter. The languages you specify must match
     *         the languages of the specified custom language models, custom
     *         vocabularies, and custom vocabulary filters.
     *         </p>
     *         <p>
     *         To include language options using <code>IdentifyLanguage</code>
     *         <b>without</b> including a custom language model, a custom
     *         vocabulary, or a custom vocabulary filter, use
     *         <code>LanguageOptions</code> instead of
     *         <code>LanguageIdSettings</code>. Including language options can
     *         improve the accuracy of automatic language identification.
     *         </p>
     *         <p>
     *         If you want to include a custom language model with your request
     *         but <b>do not</b> want to use automatic language identification,
     *         use instead the
     *         <code/> parameter with the <code>LanguageModelName</code>
     *         sub-parameter.
     *         </p>
     *         <p>
     *         If you want to include a custom vocabulary or a custom vocabulary
     *         filter (or both) with your request but <b>do not</b> want to use
     *         automatic language identification, use instead the
     *         <code/> parameter with the <code>VocabularyName</code> or
     *         <code>VocabularyFilterName</code> (or both) sub-parameter.
     *         </p>
     */
    public java.util.Map<String, LanguageIdSettings> getLanguageIdSettings() {
        return languageIdSettings;
    }

    /**
     * <p>
     * If using automatic language identification (<code>IdentifyLanguage</code>
     * ) in your request and you want to apply a custom language model, a custom
     * vocabulary, or a custom vocabulary filter, include
     * <code>LanguageIdSettings</code> with the relevant sub-parameters (
     * <code>VocabularyName</code>, <code>LanguageModelName</code>, and
     * <code>VocabularyFilterName</code>).
     * </p>
     * <p>
     * You can specify two or more language codes that represent the languages
     * you think may be present in your media; including more than five is not
     * recommended. Each language code you include can have an associated custom
     * language model, custom vocabulary, and custom vocabulary filter. The
     * languages you specify must match the languages of the specified custom
     * language models, custom vocabularies, and custom vocabulary filters.
     * </p>
     * <p>
     * To include language options using <code>IdentifyLanguage</code>
     * <b>without</b> including a custom language model, a custom vocabulary, or
     * a custom vocabulary filter, use <code>LanguageOptions</code> instead of
     * <code>LanguageIdSettings</code>. Including language options can improve
     * the accuracy of automatic language identification.
     * </p>
     * <p>
     * If you want to include a custom language model with your request but
     * <b>do not</b> want to use automatic language identification, use instead
     * the <code/> parameter with the <code>LanguageModelName</code>
     * sub-parameter.
     * </p>
     * <p>
     * If you want to include a custom vocabulary or a custom vocabulary filter
     * (or both) with your request but <b>do not</b> want to use automatic
     * language identification, use instead the
     * <code/> parameter with the <code>VocabularyName</code> or
     * <code>VocabularyFilterName</code> (or both) sub-parameter.
     * </p>
     *
     * @param languageIdSettings <p>
     *            If using automatic language identification (
     *            <code>IdentifyLanguage</code>) in your request and you want to
     *            apply a custom language model, a custom vocabulary, or a
     *            custom vocabulary filter, include
     *            <code>LanguageIdSettings</code> with the relevant
     *            sub-parameters (<code>VocabularyName</code>,
     *            <code>LanguageModelName</code>, and
     *            <code>VocabularyFilterName</code>).
     *            </p>
     *            <p>
     *            You can specify two or more language codes that represent the
     *            languages you think may be present in your media; including
     *            more than five is not recommended. Each language code you
     *            include can have an associated custom language model, custom
     *            vocabulary, and custom vocabulary filter. The languages you
     *            specify must match the languages of the specified custom
     *            language models, custom vocabularies, and custom vocabulary
     *            filters.
     *            </p>
     *            <p>
     *            To include language options using
     *            <code>IdentifyLanguage</code> <b>without</b> including a
     *            custom language model, a custom vocabulary, or a custom
     *            vocabulary filter, use <code>LanguageOptions</code> instead of
     *            <code>LanguageIdSettings</code>. Including language options
     *            can improve the accuracy of automatic language identification.
     *            </p>
     *            <p>
     *            If you want to include a custom language model with your
     *            request but <b>do not</b> want to use automatic language
     *            identification, use instead the
     *            <code/> parameter with the <code>LanguageModelName</code>
     *            sub-parameter.
     *            </p>
     *            <p>
     *            If you want to include a custom vocabulary or a custom
     *            vocabulary filter (or both) with your request but <b>do
     *            not</b> want to use automatic language identification, use
     *            instead the
     *            <code/> parameter with the <code>VocabularyName</code> or
     *            <code>VocabularyFilterName</code> (or both) sub-parameter.
     *            </p>
     */
    public void setLanguageIdSettings(java.util.Map<String, LanguageIdSettings> languageIdSettings) {
        this.languageIdSettings = languageIdSettings;
    }

    /**
     * <p>
     * If using automatic language identification (<code>IdentifyLanguage</code>
     * ) in your request and you want to apply a custom language model, a custom
     * vocabulary, or a custom vocabulary filter, include
     * <code>LanguageIdSettings</code> with the relevant sub-parameters (
     * <code>VocabularyName</code>, <code>LanguageModelName</code>, and
     * <code>VocabularyFilterName</code>).
     * </p>
     * <p>
     * You can specify two or more language codes that represent the languages
     * you think may be present in your media; including more than five is not
     * recommended. Each language code you include can have an associated custom
     * language model, custom vocabulary, and custom vocabulary filter. The
     * languages you specify must match the languages of the specified custom
     * language models, custom vocabularies, and custom vocabulary filters.
     * </p>
     * <p>
     * To include language options using <code>IdentifyLanguage</code>
     * <b>without</b> including a custom language model, a custom vocabulary, or
     * a custom vocabulary filter, use <code>LanguageOptions</code> instead of
     * <code>LanguageIdSettings</code>. Including language options can improve
     * the accuracy of automatic language identification.
     * </p>
     * <p>
     * If you want to include a custom language model with your request but
     * <b>do not</b> want to use automatic language identification, use instead
     * the <code/> parameter with the <code>LanguageModelName</code>
     * sub-parameter.
     * </p>
     * <p>
     * If you want to include a custom vocabulary or a custom vocabulary filter
     * (or both) with your request but <b>do not</b> want to use automatic
     * language identification, use instead the
     * <code/> parameter with the <code>VocabularyName</code> or
     * <code>VocabularyFilterName</code> (or both) sub-parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageIdSettings <p>
     *            If using automatic language identification (
     *            <code>IdentifyLanguage</code>) in your request and you want to
     *            apply a custom language model, a custom vocabulary, or a
     *            custom vocabulary filter, include
     *            <code>LanguageIdSettings</code> with the relevant
     *            sub-parameters (<code>VocabularyName</code>,
     *            <code>LanguageModelName</code>, and
     *            <code>VocabularyFilterName</code>).
     *            </p>
     *            <p>
     *            You can specify two or more language codes that represent the
     *            languages you think may be present in your media; including
     *            more than five is not recommended. Each language code you
     *            include can have an associated custom language model, custom
     *            vocabulary, and custom vocabulary filter. The languages you
     *            specify must match the languages of the specified custom
     *            language models, custom vocabularies, and custom vocabulary
     *            filters.
     *            </p>
     *            <p>
     *            To include language options using
     *            <code>IdentifyLanguage</code> <b>without</b> including a
     *            custom language model, a custom vocabulary, or a custom
     *            vocabulary filter, use <code>LanguageOptions</code> instead of
     *            <code>LanguageIdSettings</code>. Including language options
     *            can improve the accuracy of automatic language identification.
     *            </p>
     *            <p>
     *            If you want to include a custom language model with your
     *            request but <b>do not</b> want to use automatic language
     *            identification, use instead the
     *            <code/> parameter with the <code>LanguageModelName</code>
     *            sub-parameter.
     *            </p>
     *            <p>
     *            If you want to include a custom vocabulary or a custom
     *            vocabulary filter (or both) with your request but <b>do
     *            not</b> want to use automatic language identification, use
     *            instead the
     *            <code/> parameter with the <code>VocabularyName</code> or
     *            <code>VocabularyFilterName</code> (or both) sub-parameter.
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
     * If using automatic language identification (<code>IdentifyLanguage</code>
     * ) in your request and you want to apply a custom language model, a custom
     * vocabulary, or a custom vocabulary filter, include
     * <code>LanguageIdSettings</code> with the relevant sub-parameters (
     * <code>VocabularyName</code>, <code>LanguageModelName</code>, and
     * <code>VocabularyFilterName</code>).
     * </p>
     * <p>
     * You can specify two or more language codes that represent the languages
     * you think may be present in your media; including more than five is not
     * recommended. Each language code you include can have an associated custom
     * language model, custom vocabulary, and custom vocabulary filter. The
     * languages you specify must match the languages of the specified custom
     * language models, custom vocabularies, and custom vocabulary filters.
     * </p>
     * <p>
     * To include language options using <code>IdentifyLanguage</code>
     * <b>without</b> including a custom language model, a custom vocabulary, or
     * a custom vocabulary filter, use <code>LanguageOptions</code> instead of
     * <code>LanguageIdSettings</code>. Including language options can improve
     * the accuracy of automatic language identification.
     * </p>
     * <p>
     * If you want to include a custom language model with your request but
     * <b>do not</b> want to use automatic language identification, use instead
     * the <code/> parameter with the <code>LanguageModelName</code>
     * sub-parameter.
     * </p>
     * <p>
     * If you want to include a custom vocabulary or a custom vocabulary filter
     * (or both) with your request but <b>do not</b> want to use automatic
     * language identification, use instead the
     * <code/> parameter with the <code>VocabularyName</code> or
     * <code>VocabularyFilterName</code> (or both) sub-parameter.
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
        if (getIdentifyMultipleLanguages() != null)
            sb.append("IdentifyMultipleLanguages: " + getIdentifyMultipleLanguages() + ",");
        if (getLanguageOptions() != null)
            sb.append("LanguageOptions: " + getLanguageOptions() + ",");
        if (getIdentifiedLanguageScore() != null)
            sb.append("IdentifiedLanguageScore: " + getIdentifiedLanguageScore() + ",");
        if (getLanguageCodes() != null)
            sb.append("LanguageCodes: " + getLanguageCodes() + ",");
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
        hashCode = prime
                * hashCode
                + ((getIdentifyMultipleLanguages() == null) ? 0 : getIdentifyMultipleLanguages()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLanguageOptions() == null) ? 0 : getLanguageOptions().hashCode());
        hashCode = prime
                * hashCode
                + ((getIdentifiedLanguageScore() == null) ? 0 : getIdentifiedLanguageScore()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCodes() == null) ? 0 : getLanguageCodes().hashCode());
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
        if (other.getIdentifyMultipleLanguages() == null
                ^ this.getIdentifyMultipleLanguages() == null)
            return false;
        if (other.getIdentifyMultipleLanguages() != null
                && other.getIdentifyMultipleLanguages().equals(this.getIdentifyMultipleLanguages()) == false)
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
        if (other.getLanguageCodes() == null ^ this.getLanguageCodes() == null)
            return false;
        if (other.getLanguageCodes() != null
                && other.getLanguageCodes().equals(this.getLanguageCodes()) == false)
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
