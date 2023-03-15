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
 * Provides detailed information about a Call Analytics job.
 * </p>
 * <p>
 * To view the job's status, refer to <code>CallAnalyticsJobStatus</code>. If
 * the status is <code>COMPLETED</code>, the job is finished. You can find your
 * completed transcript at the URI specified in <code>TranscriptFileUri</code>.
 * If the status is <code>FAILED</code>, <code>FailureReason</code> provides
 * details on why your transcription job failed.
 * </p>
 * <p>
 * If you enabled personally identifiable information (PII) redaction, the
 * redacted transcript appears at the location specified in
 * <code>RedactedTranscriptFileUri</code>.
 * </p>
 * <p>
 * If you chose to redact the audio in your media file, you can find your
 * redacted media file at the location specified in the
 * <code>RedactedMediaFileUri</code> field of your response.
 * </p>
 */
public class CallAnalyticsJob implements Serializable {
    /**
     * <p>
     * The name of the Call Analytics job. Job names are case sensitive and must
     * be unique within an Amazon Web Services account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String callAnalyticsJobName;

    /**
     * <p>
     * Provides the status of the specified Call Analytics job.
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
    private String callAnalyticsJobStatus;

    /**
     * <p>
     * The language code used to create your Call Analytics job. For a list of
     * supported languages and their associated language codes, refer to the <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * If you don't know the language spoken in your media file, you can omit
     * this field and let Amazon Transcribe automatically identify the language
     * of your media. To improve the accuracy of language identification, you
     * can include several language codes and Amazon Transcribe chooses the
     * closest match for your transcription.
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
     * The sample rate, in hertz, of the audio track in your input media file.
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
     * Provides the Amazon S3 location of the media file you used in your Call
     * Analytics request.
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
     * The date and time the specified Call Analytics job began processing.
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
     * The date and time the specified Call Analytics job request was made.
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
     * The date and time the specified Call Analytics job finished processing.
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
     * If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>,
     * <code>FailureReason</code> contains information about why the Call
     * Analytics job request failed.
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
     * valid. The sample rate must be between 8,000 and 48,000 hertz.
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
     * The Amazon Resource Name (ARN) you included in your request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     */
    private String dataAccessRoleArn;

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
     * Provides information on any additional settings that were included in
     * your request. Additional settings include content redaction and language
     * identification settings.
     * </p>
     */
    private CallAnalyticsJobSettings settings;

    /**
     * <p>
     * Indicates which speaker is on which channel.
     * </p>
     */
    private java.util.List<ChannelDefinition> channelDefinitions;

    /**
     * <p>
     * The name of the Call Analytics job. Job names are case sensitive and must
     * be unique within an Amazon Web Services account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the Call Analytics job. Job names are case sensitive
     *         and must be unique within an Amazon Web Services account.
     *         </p>
     */
    public String getCallAnalyticsJobName() {
        return callAnalyticsJobName;
    }

    /**
     * <p>
     * The name of the Call Analytics job. Job names are case sensitive and must
     * be unique within an Amazon Web Services account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param callAnalyticsJobName <p>
     *            The name of the Call Analytics job. Job names are case
     *            sensitive and must be unique within an Amazon Web Services
     *            account.
     *            </p>
     */
    public void setCallAnalyticsJobName(String callAnalyticsJobName) {
        this.callAnalyticsJobName = callAnalyticsJobName;
    }

    /**
     * <p>
     * The name of the Call Analytics job. Job names are case sensitive and must
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
     * @param callAnalyticsJobName <p>
     *            The name of the Call Analytics job. Job names are case
     *            sensitive and must be unique within an Amazon Web Services
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CallAnalyticsJob withCallAnalyticsJobName(String callAnalyticsJobName) {
        this.callAnalyticsJobName = callAnalyticsJobName;
        return this;
    }

    /**
     * <p>
     * Provides the status of the specified Call Analytics job.
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
     *         Provides the status of the specified Call Analytics job.
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
     * @see CallAnalyticsJobStatus
     */
    public String getCallAnalyticsJobStatus() {
        return callAnalyticsJobStatus;
    }

    /**
     * <p>
     * Provides the status of the specified Call Analytics job.
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
     * @param callAnalyticsJobStatus <p>
     *            Provides the status of the specified Call Analytics job.
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
     * @see CallAnalyticsJobStatus
     */
    public void setCallAnalyticsJobStatus(String callAnalyticsJobStatus) {
        this.callAnalyticsJobStatus = callAnalyticsJobStatus;
    }

    /**
     * <p>
     * Provides the status of the specified Call Analytics job.
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
     * @param callAnalyticsJobStatus <p>
     *            Provides the status of the specified Call Analytics job.
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
     * @see CallAnalyticsJobStatus
     */
    public CallAnalyticsJob withCallAnalyticsJobStatus(String callAnalyticsJobStatus) {
        this.callAnalyticsJobStatus = callAnalyticsJobStatus;
        return this;
    }

    /**
     * <p>
     * Provides the status of the specified Call Analytics job.
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
     * @param callAnalyticsJobStatus <p>
     *            Provides the status of the specified Call Analytics job.
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
     * @see CallAnalyticsJobStatus
     */
    public void setCallAnalyticsJobStatus(CallAnalyticsJobStatus callAnalyticsJobStatus) {
        this.callAnalyticsJobStatus = callAnalyticsJobStatus.toString();
    }

    /**
     * <p>
     * Provides the status of the specified Call Analytics job.
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
     * @param callAnalyticsJobStatus <p>
     *            Provides the status of the specified Call Analytics job.
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
     * @see CallAnalyticsJobStatus
     */
    public CallAnalyticsJob withCallAnalyticsJobStatus(CallAnalyticsJobStatus callAnalyticsJobStatus) {
        this.callAnalyticsJobStatus = callAnalyticsJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The language code used to create your Call Analytics job. For a list of
     * supported languages and their associated language codes, refer to the <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * If you don't know the language spoken in your media file, you can omit
     * this field and let Amazon Transcribe automatically identify the language
     * of your media. To improve the accuracy of language identification, you
     * can include several language codes and Amazon Transcribe chooses the
     * closest match for your transcription.
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
     *         The language code used to create your Call Analytics job. For a
     *         list of supported languages and their associated language codes,
     *         refer to the <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *         >Supported languages</a> table.
     *         </p>
     *         <p>
     *         If you don't know the language spoken in your media file, you can
     *         omit this field and let Amazon Transcribe automatically identify
     *         the language of your media. To improve the accuracy of language
     *         identification, you can include several language codes and Amazon
     *         Transcribe chooses the closest match for your transcription.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code used to create your Call Analytics job. For a list of
     * supported languages and their associated language codes, refer to the <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * If you don't know the language spoken in your media file, you can omit
     * this field and let Amazon Transcribe automatically identify the language
     * of your media. To improve the accuracy of language identification, you
     * can include several language codes and Amazon Transcribe chooses the
     * closest match for your transcription.
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
     *            The language code used to create your Call Analytics job. For
     *            a list of supported languages and their associated language
     *            codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     *            <p>
     *            If you don't know the language spoken in your media file, you
     *            can omit this field and let Amazon Transcribe automatically
     *            identify the language of your media. To improve the accuracy
     *            of language identification, you can include several language
     *            codes and Amazon Transcribe chooses the closest match for your
     *            transcription.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code used to create your Call Analytics job. For a list of
     * supported languages and their associated language codes, refer to the <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * If you don't know the language spoken in your media file, you can omit
     * this field and let Amazon Transcribe automatically identify the language
     * of your media. To improve the accuracy of language identification, you
     * can include several language codes and Amazon Transcribe chooses the
     * closest match for your transcription.
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
     *            The language code used to create your Call Analytics job. For
     *            a list of supported languages and their associated language
     *            codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     *            <p>
     *            If you don't know the language spoken in your media file, you
     *            can omit this field and let Amazon Transcribe automatically
     *            identify the language of your media. To improve the accuracy
     *            of language identification, you can include several language
     *            codes and Amazon Transcribe chooses the closest match for your
     *            transcription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public CallAnalyticsJob withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code used to create your Call Analytics job. For a list of
     * supported languages and their associated language codes, refer to the <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * If you don't know the language spoken in your media file, you can omit
     * this field and let Amazon Transcribe automatically identify the language
     * of your media. To improve the accuracy of language identification, you
     * can include several language codes and Amazon Transcribe chooses the
     * closest match for your transcription.
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
     *            The language code used to create your Call Analytics job. For
     *            a list of supported languages and their associated language
     *            codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     *            <p>
     *            If you don't know the language spoken in your media file, you
     *            can omit this field and let Amazon Transcribe automatically
     *            identify the language of your media. To improve the accuracy
     *            of language identification, you can include several language
     *            codes and Amazon Transcribe chooses the closest match for your
     *            transcription.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code used to create your Call Analytics job. For a list of
     * supported languages and their associated language codes, refer to the <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table.
     * </p>
     * <p>
     * If you don't know the language spoken in your media file, you can omit
     * this field and let Amazon Transcribe automatically identify the language
     * of your media. To improve the accuracy of language identification, you
     * can include several language codes and Amazon Transcribe chooses the
     * closest match for your transcription.
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
     *            The language code used to create your Call Analytics job. For
     *            a list of supported languages and their associated language
     *            codes, refer to the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> table.
     *            </p>
     *            <p>
     *            If you don't know the language spoken in your media file, you
     *            can omit this field and let Amazon Transcribe automatically
     *            identify the language of your media. To improve the accuracy
     *            of language identification, you can include several language
     *            codes and Amazon Transcribe chooses the closest match for your
     *            transcription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public CallAnalyticsJob withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The sample rate, in hertz, of the audio track in your input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @return <p>
     *         The sample rate, in hertz, of the audio track in your input media
     *         file.
     *         </p>
     */
    public Integer getMediaSampleRateHertz() {
        return mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in hertz, of the audio track in your input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate, in hertz, of the audio track in your input
     *            media file.
     *            </p>
     */
    public void setMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in hertz, of the audio track in your input media file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate, in hertz, of the audio track in your input
     *            media file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CallAnalyticsJob withMediaSampleRateHertz(Integer mediaSampleRateHertz) {
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
    public CallAnalyticsJob withMediaFormat(String mediaFormat) {
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
    public CallAnalyticsJob withMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat.toString();
        return this;
    }

    /**
     * <p>
     * Provides the Amazon S3 location of the media file you used in your Call
     * Analytics request.
     * </p>
     *
     * @return <p>
     *         Provides the Amazon S3 location of the media file you used in
     *         your Call Analytics request.
     *         </p>
     */
    public Media getMedia() {
        return media;
    }

    /**
     * <p>
     * Provides the Amazon S3 location of the media file you used in your Call
     * Analytics request.
     * </p>
     *
     * @param media <p>
     *            Provides the Amazon S3 location of the media file you used in
     *            your Call Analytics request.
     *            </p>
     */
    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * <p>
     * Provides the Amazon S3 location of the media file you used in your Call
     * Analytics request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param media <p>
     *            Provides the Amazon S3 location of the media file you used in
     *            your Call Analytics request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CallAnalyticsJob withMedia(Media media) {
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
    public CallAnalyticsJob withTranscript(Transcript transcript) {
        this.transcript = transcript;
        return this;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics job began processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @return <p>
     *         The date and time the specified Call Analytics job began
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
     * The date and time the specified Call Analytics job began processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.789000-07:00</code> represents a transcription
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @param startTime <p>
     *            The date and time the specified Call Analytics job began
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
     * The date and time the specified Call Analytics job began processing.
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
     *            The date and time the specified Call Analytics job began
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
    public CallAnalyticsJob withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics job request was made.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @return <p>
     *         The date and time the specified Call Analytics job request was
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
     * The date and time the specified Call Analytics job request was made.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents a transcription
     * job that started processing at 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @param creationTime <p>
     *            The date and time the specified Call Analytics job request was
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
     * The date and time the specified Call Analytics job request was made.
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
     *            The date and time the specified Call Analytics job request was
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
    public CallAnalyticsJob withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The date and time the specified Call Analytics job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription
     * job that started processing at 12:33 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @return <p>
     *         The date and time the specified Call Analytics job finished
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
     * The date and time the specified Call Analytics job finished processing.
     * </p>
     * <p>
     * Timestamps are in the format
     * <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:33:13.922000-07:00</code> represents a transcription
     * job that started processing at 12:33 PM UTC-7 on May 4, 2022.
     * </p>
     *
     * @param completionTime <p>
     *            The date and time the specified Call Analytics job finished
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
     * The date and time the specified Call Analytics job finished processing.
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
     *            The date and time the specified Call Analytics job finished
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
    public CallAnalyticsJob withCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
        return this;
    }

    /**
     * <p>
     * If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>,
     * <code>FailureReason</code> contains information about why the Call
     * Analytics job request failed.
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
     * valid. The sample rate must be between 8,000 and 48,000 hertz.
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
     *         If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>,
     *         <code>FailureReason</code> contains information about why the
     *         Call Analytics job request failed.
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
     *         hertz.
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
     * If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>,
     * <code>FailureReason</code> contains information about why the Call
     * Analytics job request failed.
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
     * valid. The sample rate must be between 8,000 and 48,000 hertz.
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
     *            If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>,
     *            <code>FailureReason</code> contains information about why the
     *            Call Analytics job request failed.
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
     *            hertz.
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
     * If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>,
     * <code>FailureReason</code> contains information about why the Call
     * Analytics job request failed.
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
     * valid. The sample rate must be between 8,000 and 48,000 hertz.
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
     *            If <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>,
     *            <code>FailureReason</code> contains information about why the
     *            Call Analytics job request failed.
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
     *            hertz.
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
    public CallAnalyticsJob withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) you included in your request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) you included in your request.
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) you included in your request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) you included in your request.
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) you included in your request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) you included in your request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CallAnalyticsJob withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
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
    public CallAnalyticsJob withIdentifiedLanguageScore(Float identifiedLanguageScore) {
        this.identifiedLanguageScore = identifiedLanguageScore;
        return this;
    }

    /**
     * <p>
     * Provides information on any additional settings that were included in
     * your request. Additional settings include content redaction and language
     * identification settings.
     * </p>
     *
     * @return <p>
     *         Provides information on any additional settings that were
     *         included in your request. Additional settings include content
     *         redaction and language identification settings.
     *         </p>
     */
    public CallAnalyticsJobSettings getSettings() {
        return settings;
    }

    /**
     * <p>
     * Provides information on any additional settings that were included in
     * your request. Additional settings include content redaction and language
     * identification settings.
     * </p>
     *
     * @param settings <p>
     *            Provides information on any additional settings that were
     *            included in your request. Additional settings include content
     *            redaction and language identification settings.
     *            </p>
     */
    public void setSettings(CallAnalyticsJobSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Provides information on any additional settings that were included in
     * your request. Additional settings include content redaction and language
     * identification settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            Provides information on any additional settings that were
     *            included in your request. Additional settings include content
     *            redaction and language identification settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CallAnalyticsJob withSettings(CallAnalyticsJobSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * <p>
     * Indicates which speaker is on which channel.
     * </p>
     *
     * @return <p>
     *         Indicates which speaker is on which channel.
     *         </p>
     */
    public java.util.List<ChannelDefinition> getChannelDefinitions() {
        return channelDefinitions;
    }

    /**
     * <p>
     * Indicates which speaker is on which channel.
     * </p>
     *
     * @param channelDefinitions <p>
     *            Indicates which speaker is on which channel.
     *            </p>
     */
    public void setChannelDefinitions(java.util.Collection<ChannelDefinition> channelDefinitions) {
        if (channelDefinitions == null) {
            this.channelDefinitions = null;
            return;
        }

        this.channelDefinitions = new java.util.ArrayList<ChannelDefinition>(channelDefinitions);
    }

    /**
     * <p>
     * Indicates which speaker is on which channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelDefinitions <p>
     *            Indicates which speaker is on which channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CallAnalyticsJob withChannelDefinitions(ChannelDefinition... channelDefinitions) {
        if (getChannelDefinitions() == null) {
            this.channelDefinitions = new java.util.ArrayList<ChannelDefinition>(
                    channelDefinitions.length);
        }
        for (ChannelDefinition value : channelDefinitions) {
            this.channelDefinitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Indicates which speaker is on which channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelDefinitions <p>
     *            Indicates which speaker is on which channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CallAnalyticsJob withChannelDefinitions(
            java.util.Collection<ChannelDefinition> channelDefinitions) {
        setChannelDefinitions(channelDefinitions);
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
        if (getCallAnalyticsJobName() != null)
            sb.append("CallAnalyticsJobName: " + getCallAnalyticsJobName() + ",");
        if (getCallAnalyticsJobStatus() != null)
            sb.append("CallAnalyticsJobStatus: " + getCallAnalyticsJobStatus() + ",");
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
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn() + ",");
        if (getIdentifiedLanguageScore() != null)
            sb.append("IdentifiedLanguageScore: " + getIdentifiedLanguageScore() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings() + ",");
        if (getChannelDefinitions() != null)
            sb.append("ChannelDefinitions: " + getChannelDefinitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCallAnalyticsJobName() == null) ? 0 : getCallAnalyticsJobName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCallAnalyticsJobStatus() == null) ? 0 : getCallAnalyticsJobStatus()
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
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getIdentifiedLanguageScore() == null) ? 0 : getIdentifiedLanguageScore()
                        .hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode
                + ((getChannelDefinitions() == null) ? 0 : getChannelDefinitions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CallAnalyticsJob == false)
            return false;
        CallAnalyticsJob other = (CallAnalyticsJob) obj;

        if (other.getCallAnalyticsJobName() == null ^ this.getCallAnalyticsJobName() == null)
            return false;
        if (other.getCallAnalyticsJobName() != null
                && other.getCallAnalyticsJobName().equals(this.getCallAnalyticsJobName()) == false)
            return false;
        if (other.getCallAnalyticsJobStatus() == null ^ this.getCallAnalyticsJobStatus() == null)
            return false;
        if (other.getCallAnalyticsJobStatus() != null
                && other.getCallAnalyticsJobStatus().equals(this.getCallAnalyticsJobStatus()) == false)
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
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null
                && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getIdentifiedLanguageScore() == null ^ this.getIdentifiedLanguageScore() == null)
            return false;
        if (other.getIdentifiedLanguageScore() != null
                && other.getIdentifiedLanguageScore().equals(this.getIdentifiedLanguageScore()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getChannelDefinitions() == null ^ this.getChannelDefinitions() == null)
            return false;
        if (other.getChannelDefinitions() != null
                && other.getChannelDefinitions().equals(this.getChannelDefinitions()) == false)
            return false;
        return true;
    }
}
