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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

/**
 * <p>
 * Provides detailed information about a specific transcription job.
 * </p>
 */
public class TranscriptionJobSummary implements Serializable {
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
     * The date and time your transcription job began processing.
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
     * The language code used to create your transcription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE
     */
    private String languageCode;

    /**
     * <p>
     * Provides the status of your transcription job.
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
     * If <code>TranscriptionJobStatus</code> is <code>FAILED</code>,
     * <code>FailureReason</code> contains information about why the
     * transcription job failed. See also: <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html"
     * >Common Errors</a>.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * Indicates where the specified transcription output is stored.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon
     * S3 bucket you specified using the <code>OutputBucketName</code> parameter
     * in your request. If you also included <code>OutputKey</code> in your
     * request, your output is located in the path you specified in your
     * request.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code>, the location is a
     * service-managed Amazon S3 bucket. To access a transcript stored in a
     * service-managed bucket, use the URI shown in the
     * <code>TranscriptFileUri</code> or <code>RedactedTranscriptFileUri</code>
     * field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_BUCKET, SERVICE_BUCKET
     */
    private String outputLocationType;

    /**
     * <p>
     * The content redaction settings of the transcription job.
     * </p>
     */
    private ContentRedaction contentRedaction;

    /**
     * <p>
     * Provides the name of the custom language model that was included in the
     * specified transcription job.
     * </p>
     * <p>
     * Only use <code>ModelSettings</code> with the
     * <code>LanguageModelName</code> sub-parameter if you're <b>not</b> using
     * automatic language identification (
     * <code/>). If using <code>LanguageIdSettings</code> in your request, this
     * parameter contains a <code>LanguageModelName</code> sub-parameter.
     * </p>
     */
    private ModelSettings modelSettings;

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
     * identification, the singular version of this parameter,
     * <code>LanguageCode</code>, is present.
     * </p>
     */
    private java.util.List<LanguageCodeItem> languageCodes;

    /**
     * <p>
     * Indicates whether toxicity detection was enabled for the specified
     * transcription job.
     * </p>
     */
    private java.util.List<ToxicityDetectionSettings> toxicityDetection;

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
    public TranscriptionJobSummary withTranscriptionJobName(String transcriptionJobName) {
        this.transcriptionJobName = transcriptionJobName;
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
    public TranscriptionJobSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The date and time your transcription job began processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @return <p>
     *         The date and time your transcription job began processing.
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
     * The date and time your transcription job began processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @param startTime <p>
     *            The date and time your transcription job began processing.
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
     * The date and time your transcription job began processing.
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
     *            The date and time your transcription job began processing.
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
    public TranscriptionJobSummary withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
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
    public TranscriptionJobSummary withCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
        return this;
    }

    /**
     * <p>
     * The language code used to create your transcription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE
     *
     * @return <p>
     *         The language code used to create your transcription.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code used to create your transcription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE
     *
     * @param languageCode <p>
     *            The language code used to create your transcription.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code used to create your transcription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE
     *
     * @param languageCode <p>
     *            The language code used to create your transcription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public TranscriptionJobSummary withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code used to create your transcription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE
     *
     * @param languageCode <p>
     *            The language code used to create your transcription.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code used to create your transcription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, da-DK, de-CH, de-DE, en-AB,
     * en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR, fr-CA,
     * fr-FR, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR, ms-MY, nl-NL, pt-BR,
     * pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW, th-TH, en-ZA, en-NZ,
     * vi-VN, sv-SE
     *
     * @param languageCode <p>
     *            The language code used to create your transcription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public TranscriptionJobSummary withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Provides the status of your transcription job.
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
     *         Provides the status of your transcription job.
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
     * Provides the status of your transcription job.
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
     *            Provides the status of your transcription job.
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
     * Provides the status of your transcription job.
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
     *            Provides the status of your transcription job.
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
    public TranscriptionJobSummary withTranscriptionJobStatus(String transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus;
        return this;
    }

    /**
     * <p>
     * Provides the status of your transcription job.
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
     *            Provides the status of your transcription job.
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
     * Provides the status of your transcription job.
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
     *            Provides the status of your transcription job.
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
    public TranscriptionJobSummary withTranscriptionJobStatus(
            TranscriptionJobStatus transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If <code>TranscriptionJobStatus</code> is <code>FAILED</code>,
     * <code>FailureReason</code> contains information about why the
     * transcription job failed. See also: <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html"
     * >Common Errors</a>.
     * </p>
     *
     * @return <p>
     *         If <code>TranscriptionJobStatus</code> is <code>FAILED</code>,
     *         <code>FailureReason</code> contains information about why the
     *         transcription job failed. See also: <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html"
     *         >Common Errors</a>.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If <code>TranscriptionJobStatus</code> is <code>FAILED</code>,
     * <code>FailureReason</code> contains information about why the
     * transcription job failed. See also: <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html"
     * >Common Errors</a>.
     * </p>
     *
     * @param failureReason <p>
     *            If <code>TranscriptionJobStatus</code> is <code>FAILED</code>,
     *            <code>FailureReason</code> contains information about why the
     *            transcription job failed. See also: <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html"
     *            >Common Errors</a>.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If <code>TranscriptionJobStatus</code> is <code>FAILED</code>,
     * <code>FailureReason</code> contains information about why the
     * transcription job failed. See also: <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html"
     * >Common Errors</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            If <code>TranscriptionJobStatus</code> is <code>FAILED</code>,
     *            <code>FailureReason</code> contains information about why the
     *            transcription job failed. See also: <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html"
     *            >Common Errors</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJobSummary withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * Indicates where the specified transcription output is stored.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon
     * S3 bucket you specified using the <code>OutputBucketName</code> parameter
     * in your request. If you also included <code>OutputKey</code> in your
     * request, your output is located in the path you specified in your
     * request.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code>, the location is a
     * service-managed Amazon S3 bucket. To access a transcript stored in a
     * service-managed bucket, use the URI shown in the
     * <code>TranscriptFileUri</code> or <code>RedactedTranscriptFileUri</code>
     * field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_BUCKET, SERVICE_BUCKET
     *
     * @return <p>
     *         Indicates where the specified transcription output is stored.
     *         </p>
     *         <p>
     *         If the value is <code>CUSTOMER_BUCKET</code>, the location is the
     *         Amazon S3 bucket you specified using the
     *         <code>OutputBucketName</code> parameter in your request. If you
     *         also included <code>OutputKey</code> in your request, your output
     *         is located in the path you specified in your request.
     *         </p>
     *         <p>
     *         If the value is <code>SERVICE_BUCKET</code>, the location is a
     *         service-managed Amazon S3 bucket. To access a transcript stored
     *         in a service-managed bucket, use the URI shown in the
     *         <code>TranscriptFileUri</code> or
     *         <code>RedactedTranscriptFileUri</code> field.
     *         </p>
     * @see OutputLocationType
     */
    public String getOutputLocationType() {
        return outputLocationType;
    }

    /**
     * <p>
     * Indicates where the specified transcription output is stored.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon
     * S3 bucket you specified using the <code>OutputBucketName</code> parameter
     * in your request. If you also included <code>OutputKey</code> in your
     * request, your output is located in the path you specified in your
     * request.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code>, the location is a
     * service-managed Amazon S3 bucket. To access a transcript stored in a
     * service-managed bucket, use the URI shown in the
     * <code>TranscriptFileUri</code> or <code>RedactedTranscriptFileUri</code>
     * field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_BUCKET, SERVICE_BUCKET
     *
     * @param outputLocationType <p>
     *            Indicates where the specified transcription output is stored.
     *            </p>
     *            <p>
     *            If the value is <code>CUSTOMER_BUCKET</code>, the location is
     *            the Amazon S3 bucket you specified using the
     *            <code>OutputBucketName</code> parameter in your request. If
     *            you also included <code>OutputKey</code> in your request, your
     *            output is located in the path you specified in your request.
     *            </p>
     *            <p>
     *            If the value is <code>SERVICE_BUCKET</code>, the location is a
     *            service-managed Amazon S3 bucket. To access a transcript
     *            stored in a service-managed bucket, use the URI shown in the
     *            <code>TranscriptFileUri</code> or
     *            <code>RedactedTranscriptFileUri</code> field.
     *            </p>
     * @see OutputLocationType
     */
    public void setOutputLocationType(String outputLocationType) {
        this.outputLocationType = outputLocationType;
    }

    /**
     * <p>
     * Indicates where the specified transcription output is stored.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon
     * S3 bucket you specified using the <code>OutputBucketName</code> parameter
     * in your request. If you also included <code>OutputKey</code> in your
     * request, your output is located in the path you specified in your
     * request.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code>, the location is a
     * service-managed Amazon S3 bucket. To access a transcript stored in a
     * service-managed bucket, use the URI shown in the
     * <code>TranscriptFileUri</code> or <code>RedactedTranscriptFileUri</code>
     * field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_BUCKET, SERVICE_BUCKET
     *
     * @param outputLocationType <p>
     *            Indicates where the specified transcription output is stored.
     *            </p>
     *            <p>
     *            If the value is <code>CUSTOMER_BUCKET</code>, the location is
     *            the Amazon S3 bucket you specified using the
     *            <code>OutputBucketName</code> parameter in your request. If
     *            you also included <code>OutputKey</code> in your request, your
     *            output is located in the path you specified in your request.
     *            </p>
     *            <p>
     *            If the value is <code>SERVICE_BUCKET</code>, the location is a
     *            service-managed Amazon S3 bucket. To access a transcript
     *            stored in a service-managed bucket, use the URI shown in the
     *            <code>TranscriptFileUri</code> or
     *            <code>RedactedTranscriptFileUri</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OutputLocationType
     */
    public TranscriptionJobSummary withOutputLocationType(String outputLocationType) {
        this.outputLocationType = outputLocationType;
        return this;
    }

    /**
     * <p>
     * Indicates where the specified transcription output is stored.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon
     * S3 bucket you specified using the <code>OutputBucketName</code> parameter
     * in your request. If you also included <code>OutputKey</code> in your
     * request, your output is located in the path you specified in your
     * request.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code>, the location is a
     * service-managed Amazon S3 bucket. To access a transcript stored in a
     * service-managed bucket, use the URI shown in the
     * <code>TranscriptFileUri</code> or <code>RedactedTranscriptFileUri</code>
     * field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_BUCKET, SERVICE_BUCKET
     *
     * @param outputLocationType <p>
     *            Indicates where the specified transcription output is stored.
     *            </p>
     *            <p>
     *            If the value is <code>CUSTOMER_BUCKET</code>, the location is
     *            the Amazon S3 bucket you specified using the
     *            <code>OutputBucketName</code> parameter in your request. If
     *            you also included <code>OutputKey</code> in your request, your
     *            output is located in the path you specified in your request.
     *            </p>
     *            <p>
     *            If the value is <code>SERVICE_BUCKET</code>, the location is a
     *            service-managed Amazon S3 bucket. To access a transcript
     *            stored in a service-managed bucket, use the URI shown in the
     *            <code>TranscriptFileUri</code> or
     *            <code>RedactedTranscriptFileUri</code> field.
     *            </p>
     * @see OutputLocationType
     */
    public void setOutputLocationType(OutputLocationType outputLocationType) {
        this.outputLocationType = outputLocationType.toString();
    }

    /**
     * <p>
     * Indicates where the specified transcription output is stored.
     * </p>
     * <p>
     * If the value is <code>CUSTOMER_BUCKET</code>, the location is the Amazon
     * S3 bucket you specified using the <code>OutputBucketName</code> parameter
     * in your request. If you also included <code>OutputKey</code> in your
     * request, your output is located in the path you specified in your
     * request.
     * </p>
     * <p>
     * If the value is <code>SERVICE_BUCKET</code>, the location is a
     * service-managed Amazon S3 bucket. To access a transcript stored in a
     * service-managed bucket, use the URI shown in the
     * <code>TranscriptFileUri</code> or <code>RedactedTranscriptFileUri</code>
     * field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOMER_BUCKET, SERVICE_BUCKET
     *
     * @param outputLocationType <p>
     *            Indicates where the specified transcription output is stored.
     *            </p>
     *            <p>
     *            If the value is <code>CUSTOMER_BUCKET</code>, the location is
     *            the Amazon S3 bucket you specified using the
     *            <code>OutputBucketName</code> parameter in your request. If
     *            you also included <code>OutputKey</code> in your request, your
     *            output is located in the path you specified in your request.
     *            </p>
     *            <p>
     *            If the value is <code>SERVICE_BUCKET</code>, the location is a
     *            service-managed Amazon S3 bucket. To access a transcript
     *            stored in a service-managed bucket, use the URI shown in the
     *            <code>TranscriptFileUri</code> or
     *            <code>RedactedTranscriptFileUri</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OutputLocationType
     */
    public TranscriptionJobSummary withOutputLocationType(OutputLocationType outputLocationType) {
        this.outputLocationType = outputLocationType.toString();
        return this;
    }

    /**
     * <p>
     * The content redaction settings of the transcription job.
     * </p>
     *
     * @return <p>
     *         The content redaction settings of the transcription job.
     *         </p>
     */
    public ContentRedaction getContentRedaction() {
        return contentRedaction;
    }

    /**
     * <p>
     * The content redaction settings of the transcription job.
     * </p>
     *
     * @param contentRedaction <p>
     *            The content redaction settings of the transcription job.
     *            </p>
     */
    public void setContentRedaction(ContentRedaction contentRedaction) {
        this.contentRedaction = contentRedaction;
    }

    /**
     * <p>
     * The content redaction settings of the transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentRedaction <p>
     *            The content redaction settings of the transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJobSummary withContentRedaction(ContentRedaction contentRedaction) {
        this.contentRedaction = contentRedaction;
        return this;
    }

    /**
     * <p>
     * Provides the name of the custom language model that was included in the
     * specified transcription job.
     * </p>
     * <p>
     * Only use <code>ModelSettings</code> with the
     * <code>LanguageModelName</code> sub-parameter if you're <b>not</b> using
     * automatic language identification (
     * <code/>). If using <code>LanguageIdSettings</code> in your request, this
     * parameter contains a <code>LanguageModelName</code> sub-parameter.
     * </p>
     *
     * @return <p>
     *         Provides the name of the custom language model that was included
     *         in the specified transcription job.
     *         </p>
     *         <p>
     *         Only use <code>ModelSettings</code> with the
     *         <code>LanguageModelName</code> sub-parameter if you're <b>not</b>
     *         using automatic language identification (
     *         <code/>). If using <code>LanguageIdSettings</code> in your
     *         request, this parameter contains a <code>LanguageModelName</code>
     *         sub-parameter.
     *         </p>
     */
    public ModelSettings getModelSettings() {
        return modelSettings;
    }

    /**
     * <p>
     * Provides the name of the custom language model that was included in the
     * specified transcription job.
     * </p>
     * <p>
     * Only use <code>ModelSettings</code> with the
     * <code>LanguageModelName</code> sub-parameter if you're <b>not</b> using
     * automatic language identification (
     * <code/>). If using <code>LanguageIdSettings</code> in your request, this
     * parameter contains a <code>LanguageModelName</code> sub-parameter.
     * </p>
     *
     * @param modelSettings <p>
     *            Provides the name of the custom language model that was
     *            included in the specified transcription job.
     *            </p>
     *            <p>
     *            Only use <code>ModelSettings</code> with the
     *            <code>LanguageModelName</code> sub-parameter if you're
     *            <b>not</b> using automatic language identification (
     *            <code/>). If using <code>LanguageIdSettings</code> in your
     *            request, this parameter contains a
     *            <code>LanguageModelName</code> sub-parameter.
     *            </p>
     */
    public void setModelSettings(ModelSettings modelSettings) {
        this.modelSettings = modelSettings;
    }

    /**
     * <p>
     * Provides the name of the custom language model that was included in the
     * specified transcription job.
     * </p>
     * <p>
     * Only use <code>ModelSettings</code> with the
     * <code>LanguageModelName</code> sub-parameter if you're <b>not</b> using
     * automatic language identification (
     * <code/>). If using <code>LanguageIdSettings</code> in your request, this
     * parameter contains a <code>LanguageModelName</code> sub-parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelSettings <p>
     *            Provides the name of the custom language model that was
     *            included in the specified transcription job.
     *            </p>
     *            <p>
     *            Only use <code>ModelSettings</code> with the
     *            <code>LanguageModelName</code> sub-parameter if you're
     *            <b>not</b> using automatic language identification (
     *            <code/>). If using <code>LanguageIdSettings</code> in your
     *            request, this parameter contains a
     *            <code>LanguageModelName</code> sub-parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJobSummary withModelSettings(ModelSettings modelSettings) {
        this.modelSettings = modelSettings;
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
    public TranscriptionJobSummary withIdentifyLanguage(Boolean identifyLanguage) {
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
    public TranscriptionJobSummary withIdentifyMultipleLanguages(Boolean identifyMultipleLanguages) {
        this.identifyMultipleLanguages = identifyMultipleLanguages;
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
    public TranscriptionJobSummary withIdentifiedLanguageScore(Float identifiedLanguageScore) {
        this.identifiedLanguageScore = identifiedLanguageScore;
        return this;
    }

    /**
     * <p>
     * The language codes used to create your transcription job. This parameter
     * is used with multi-language identification. For single-language
     * identification, the singular version of this parameter,
     * <code>LanguageCode</code>, is present.
     * </p>
     *
     * @return <p>
     *         The language codes used to create your transcription job. This
     *         parameter is used with multi-language identification. For
     *         single-language identification, the singular version of this
     *         parameter, <code>LanguageCode</code>, is present.
     *         </p>
     */
    public java.util.List<LanguageCodeItem> getLanguageCodes() {
        return languageCodes;
    }

    /**
     * <p>
     * The language codes used to create your transcription job. This parameter
     * is used with multi-language identification. For single-language
     * identification, the singular version of this parameter,
     * <code>LanguageCode</code>, is present.
     * </p>
     *
     * @param languageCodes <p>
     *            The language codes used to create your transcription job. This
     *            parameter is used with multi-language identification. For
     *            single-language identification, the singular version of this
     *            parameter, <code>LanguageCode</code>, is present.
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
     * identification, the singular version of this parameter,
     * <code>LanguageCode</code>, is present.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageCodes <p>
     *            The language codes used to create your transcription job. This
     *            parameter is used with multi-language identification. For
     *            single-language identification, the singular version of this
     *            parameter, <code>LanguageCode</code>, is present.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJobSummary withLanguageCodes(LanguageCodeItem... languageCodes) {
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
     * identification, the singular version of this parameter,
     * <code>LanguageCode</code>, is present.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageCodes <p>
     *            The language codes used to create your transcription job. This
     *            parameter is used with multi-language identification. For
     *            single-language identification, the singular version of this
     *            parameter, <code>LanguageCode</code>, is present.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJobSummary withLanguageCodes(
            java.util.Collection<LanguageCodeItem> languageCodes) {
        setLanguageCodes(languageCodes);
        return this;
    }

    /**
     * <p>
     * Indicates whether toxicity detection was enabled for the specified
     * transcription job.
     * </p>
     *
     * @return <p>
     *         Indicates whether toxicity detection was enabled for the
     *         specified transcription job.
     *         </p>
     */
    public java.util.List<ToxicityDetectionSettings> getToxicityDetection() {
        return toxicityDetection;
    }

    /**
     * <p>
     * Indicates whether toxicity detection was enabled for the specified
     * transcription job.
     * </p>
     *
     * @param toxicityDetection <p>
     *            Indicates whether toxicity detection was enabled for the
     *            specified transcription job.
     *            </p>
     */
    public void setToxicityDetection(
            java.util.Collection<ToxicityDetectionSettings> toxicityDetection) {
        if (toxicityDetection == null) {
            this.toxicityDetection = null;
            return;
        }

        this.toxicityDetection = new java.util.ArrayList<ToxicityDetectionSettings>(
                toxicityDetection);
    }

    /**
     * <p>
     * Indicates whether toxicity detection was enabled for the specified
     * transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param toxicityDetection <p>
     *            Indicates whether toxicity detection was enabled for the
     *            specified transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJobSummary withToxicityDetection(
            ToxicityDetectionSettings... toxicityDetection) {
        if (getToxicityDetection() == null) {
            this.toxicityDetection = new java.util.ArrayList<ToxicityDetectionSettings>(
                    toxicityDetection.length);
        }
        for (ToxicityDetectionSettings value : toxicityDetection) {
            this.toxicityDetection.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether toxicity detection was enabled for the specified
     * transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param toxicityDetection <p>
     *            Indicates whether toxicity detection was enabled for the
     *            specified transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TranscriptionJobSummary withToxicityDetection(
            java.util.Collection<ToxicityDetectionSettings> toxicityDetection) {
        setToxicityDetection(toxicityDetection);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: " + getCompletionTime() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getTranscriptionJobStatus() != null)
            sb.append("TranscriptionJobStatus: " + getTranscriptionJobStatus() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getOutputLocationType() != null)
            sb.append("OutputLocationType: " + getOutputLocationType() + ",");
        if (getContentRedaction() != null)
            sb.append("ContentRedaction: " + getContentRedaction() + ",");
        if (getModelSettings() != null)
            sb.append("ModelSettings: " + getModelSettings() + ",");
        if (getIdentifyLanguage() != null)
            sb.append("IdentifyLanguage: " + getIdentifyLanguage() + ",");
        if (getIdentifyMultipleLanguages() != null)
            sb.append("IdentifyMultipleLanguages: " + getIdentifyMultipleLanguages() + ",");
        if (getIdentifiedLanguageScore() != null)
            sb.append("IdentifiedLanguageScore: " + getIdentifiedLanguageScore() + ",");
        if (getLanguageCodes() != null)
            sb.append("LanguageCodes: " + getLanguageCodes() + ",");
        if (getToxicityDetection() != null)
            sb.append("ToxicityDetection: " + getToxicityDetection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTranscriptionJobName() == null) ? 0 : getTranscriptionJobName().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getTranscriptionJobStatus() == null) ? 0 : getTranscriptionJobStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getOutputLocationType() == null) ? 0 : getOutputLocationType().hashCode());
        hashCode = prime * hashCode
                + ((getContentRedaction() == null) ? 0 : getContentRedaction().hashCode());
        hashCode = prime * hashCode
                + ((getModelSettings() == null) ? 0 : getModelSettings().hashCode());
        hashCode = prime * hashCode
                + ((getIdentifyLanguage() == null) ? 0 : getIdentifyLanguage().hashCode());
        hashCode = prime
                * hashCode
                + ((getIdentifyMultipleLanguages() == null) ? 0 : getIdentifyMultipleLanguages()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getIdentifiedLanguageScore() == null) ? 0 : getIdentifiedLanguageScore()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCodes() == null) ? 0 : getLanguageCodes().hashCode());
        hashCode = prime * hashCode
                + ((getToxicityDetection() == null) ? 0 : getToxicityDetection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranscriptionJobSummary == false)
            return false;
        TranscriptionJobSummary other = (TranscriptionJobSummary) obj;

        if (other.getTranscriptionJobName() == null ^ this.getTranscriptionJobName() == null)
            return false;
        if (other.getTranscriptionJobName() != null
                && other.getTranscriptionJobName().equals(this.getTranscriptionJobName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null
                && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getTranscriptionJobStatus() == null ^ this.getTranscriptionJobStatus() == null)
            return false;
        if (other.getTranscriptionJobStatus() != null
                && other.getTranscriptionJobStatus().equals(this.getTranscriptionJobStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getOutputLocationType() == null ^ this.getOutputLocationType() == null)
            return false;
        if (other.getOutputLocationType() != null
                && other.getOutputLocationType().equals(this.getOutputLocationType()) == false)
            return false;
        if (other.getContentRedaction() == null ^ this.getContentRedaction() == null)
            return false;
        if (other.getContentRedaction() != null
                && other.getContentRedaction().equals(this.getContentRedaction()) == false)
            return false;
        if (other.getModelSettings() == null ^ this.getModelSettings() == null)
            return false;
        if (other.getModelSettings() != null
                && other.getModelSettings().equals(this.getModelSettings()) == false)
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
        if (other.getToxicityDetection() == null ^ this.getToxicityDetection() == null)
            return false;
        if (other.getToxicityDetection() != null
                && other.getToxicityDetection().equals(this.getToxicityDetection()) == false)
            return false;
        return true;
    }
}
