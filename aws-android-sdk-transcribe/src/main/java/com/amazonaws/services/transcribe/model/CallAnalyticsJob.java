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
 * Describes an asynchronous analytics job that was created with the
 * <code>StartAnalyticsJob</code> operation.
 * </p>
 */
public class CallAnalyticsJob implements Serializable {
    /**
     * <p>
     * The name of the call analytics job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String callAnalyticsJobName;

    /**
     * <p>
     * The status of the analytics job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     */
    private String callAnalyticsJobStatus;

    /**
     * <p>
     * If you know the language spoken between the customer and the agent,
     * specify a language code for this field.
     * </p>
     * <p>
     * If you don't know the language, you can leave this field blank, and
     * Amazon Transcribe will use machine learning to automatically identify the
     * language. To improve the accuracy of language identification, you can
     * provide an array containing the possible language codes for the language
     * spoken in your audio. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> for additional information.
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
     * The sample rate, in Hertz, of the audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     */
    private Integer mediaSampleRateHertz;

    /**
     * <p>
     * The format of the input audio file. Note: for call analytics jobs, only
     * the following media formats are supported: MP3, MP4, WAV, FLAC, OGG, and
     * WebM.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     */
    private String mediaFormat;

    /**
     * <p>
     * Describes the input media file in a transcription request.
     * </p>
     */
    private Media media;

    /**
     * <p>
     * Identifies the location of a transcription.
     * </p>
     */
    private Transcript transcript;

    /**
     * <p>
     * A timestamp that shows when the analytics job started processing.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * A timestamp that shows when the analytics job was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * A timestamp that shows when the analytics job was completed.
     * </p>
     */
    private java.util.Date completionTime;

    /**
     * <p>
     * If the <code>AnalyticsJobStatus</code> is <code>FAILED</code>, this field
     * contains information about why the job failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field can contain one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>: The media format specified in the
     * <code>MediaFormat</code> field of the request isn't valid. See the
     * description of the <code>MediaFormat</code> field for a list of valid
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>
     * : The media format of the audio file doesn't match the format specified
     * in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>: The sample rate
     * specified in the <code>MediaSampleRateHertz</code> of the request isn't
     * valid. The sample rate must be between 8,000 and 48,000 Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>
     * : The sample rate in the audio file doesn't match the sample rate
     * specified in the <code>MediaSampleRateHertz</code> field in the request.
     * Check the sample rate of your media file and make sure that the two
     * values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>: The size of your
     * audio file is larger than what Amazon Transcribe Medical can process. For
     * more information, see <i>Guidelines and Quotas</i> in the Amazon
     * Transcribe Medical Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>:
     * Your audio contains more channels than Amazon Transcribe Medical is
     * configured to process. To request additional channels, see Amazon
     * Transcribe Medical Endpoints and Quotas in the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/Welcome.html">Amazon
     * Web Services General Reference</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String failureReason;

    /**
     * <p>
     * The Amazon Resource Number (ARN) that you use to access the analytics
     * job. ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     * .
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
     * A value between zero and one that Amazon Transcribe assigned to the
     * language that it identified in the source audio. This value appears only
     * when you don't provide a single language code. Larger values indicate
     * that Amazon Transcribe has higher confidence in the language that it
     * identified.
     * </p>
     */
    private Float identifiedLanguageScore;

    /**
     * <p>
     * Provides information about the settings used to run a transcription job.
     * </p>
     */
    private CallAnalyticsJobSettings settings;

    /**
     * <p>
     * Shows numeric values to indicate the channel assigned to the agent's
     * audio and the channel assigned to the customer's audio.
     * </p>
     */
    private java.util.List<ChannelDefinition> channelDefinitions;

    /**
     * <p>
     * The name of the call analytics job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the call analytics job.
     *         </p>
     */
    public String getCallAnalyticsJobName() {
        return callAnalyticsJobName;
    }

    /**
     * <p>
     * The name of the call analytics job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param callAnalyticsJobName <p>
     *            The name of the call analytics job.
     *            </p>
     */
    public void setCallAnalyticsJobName(String callAnalyticsJobName) {
        this.callAnalyticsJobName = callAnalyticsJobName;
    }

    /**
     * <p>
     * The name of the call analytics job.
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
     *            The name of the call analytics job.
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
     * The status of the analytics job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @return <p>
     *         The status of the analytics job.
     *         </p>
     * @see CallAnalyticsJobStatus
     */
    public String getCallAnalyticsJobStatus() {
        return callAnalyticsJobStatus;
    }

    /**
     * <p>
     * The status of the analytics job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param callAnalyticsJobStatus <p>
     *            The status of the analytics job.
     *            </p>
     * @see CallAnalyticsJobStatus
     */
    public void setCallAnalyticsJobStatus(String callAnalyticsJobStatus) {
        this.callAnalyticsJobStatus = callAnalyticsJobStatus;
    }

    /**
     * <p>
     * The status of the analytics job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param callAnalyticsJobStatus <p>
     *            The status of the analytics job.
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
     * The status of the analytics job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param callAnalyticsJobStatus <p>
     *            The status of the analytics job.
     *            </p>
     * @see CallAnalyticsJobStatus
     */
    public void setCallAnalyticsJobStatus(CallAnalyticsJobStatus callAnalyticsJobStatus) {
        this.callAnalyticsJobStatus = callAnalyticsJobStatus.toString();
    }

    /**
     * <p>
     * The status of the analytics job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param callAnalyticsJobStatus <p>
     *            The status of the analytics job.
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
     * If you know the language spoken between the customer and the agent,
     * specify a language code for this field.
     * </p>
     * <p>
     * If you don't know the language, you can leave this field blank, and
     * Amazon Transcribe will use machine learning to automatically identify the
     * language. To improve the accuracy of language identification, you can
     * provide an array containing the possible language codes for the language
     * spoken in your audio. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> for additional information.
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
     *         If you know the language spoken between the customer and the
     *         agent, specify a language code for this field.
     *         </p>
     *         <p>
     *         If you don't know the language, you can leave this field blank,
     *         and Amazon Transcribe will use machine learning to automatically
     *         identify the language. To improve the accuracy of language
     *         identification, you can provide an array containing the possible
     *         language codes for the language spoken in your audio. Refer to <a
     *         href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *         >Supported languages</a> for additional information.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * If you know the language spoken between the customer and the agent,
     * specify a language code for this field.
     * </p>
     * <p>
     * If you don't know the language, you can leave this field blank, and
     * Amazon Transcribe will use machine learning to automatically identify the
     * language. To improve the accuracy of language identification, you can
     * provide an array containing the possible language codes for the language
     * spoken in your audio. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> for additional information.
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
     *            If you know the language spoken between the customer and the
     *            agent, specify a language code for this field.
     *            </p>
     *            <p>
     *            If you don't know the language, you can leave this field
     *            blank, and Amazon Transcribe will use machine learning to
     *            automatically identify the language. To improve the accuracy
     *            of language identification, you can provide an array
     *            containing the possible language codes for the language spoken
     *            in your audio. Refer to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> for additional information.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * If you know the language spoken between the customer and the agent,
     * specify a language code for this field.
     * </p>
     * <p>
     * If you don't know the language, you can leave this field blank, and
     * Amazon Transcribe will use machine learning to automatically identify the
     * language. To improve the accuracy of language identification, you can
     * provide an array containing the possible language codes for the language
     * spoken in your audio. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> for additional information.
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
     *            If you know the language spoken between the customer and the
     *            agent, specify a language code for this field.
     *            </p>
     *            <p>
     *            If you don't know the language, you can leave this field
     *            blank, and Amazon Transcribe will use machine learning to
     *            automatically identify the language. To improve the accuracy
     *            of language identification, you can provide an array
     *            containing the possible language codes for the language spoken
     *            in your audio. Refer to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> for additional information.
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
     * If you know the language spoken between the customer and the agent,
     * specify a language code for this field.
     * </p>
     * <p>
     * If you don't know the language, you can leave this field blank, and
     * Amazon Transcribe will use machine learning to automatically identify the
     * language. To improve the accuracy of language identification, you can
     * provide an array containing the possible language codes for the language
     * spoken in your audio. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> for additional information.
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
     *            If you know the language spoken between the customer and the
     *            agent, specify a language code for this field.
     *            </p>
     *            <p>
     *            If you don't know the language, you can leave this field
     *            blank, and Amazon Transcribe will use machine learning to
     *            automatically identify the language. To improve the accuracy
     *            of language identification, you can provide an array
     *            containing the possible language codes for the language spoken
     *            in your audio. Refer to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> for additional information.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * If you know the language spoken between the customer and the agent,
     * specify a language code for this field.
     * </p>
     * <p>
     * If you don't know the language, you can leave this field blank, and
     * Amazon Transcribe will use machine learning to automatically identify the
     * language. To improve the accuracy of language identification, you can
     * provide an array containing the possible language codes for the language
     * spoken in your audio. Refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> for additional information.
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
     *            If you know the language spoken between the customer and the
     *            agent, specify a language code for this field.
     *            </p>
     *            <p>
     *            If you don't know the language, you can leave this field
     *            blank, and Amazon Transcribe will use machine learning to
     *            automatically identify the language. To improve the accuracy
     *            of language identification, you can provide an array
     *            containing the possible language codes for the language spoken
     *            in your audio. Refer to <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     *            >Supported languages</a> for additional information.
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
     * The sample rate, in Hertz, of the audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @return <p>
     *         The sample rate, in Hertz, of the audio.
     *         </p>
     */
    public Integer getMediaSampleRateHertz() {
        return mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate, in Hertz, of the audio.
     *            </p>
     */
    public void setMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate, in Hertz, of the audio.
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
     * The format of the input audio file. Note: for call analytics jobs, only
     * the following media formats are supported: MP3, MP4, WAV, FLAC, OGG, and
     * WebM.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @return <p>
     *         The format of the input audio file. Note: for call analytics
     *         jobs, only the following media formats are supported: MP3, MP4,
     *         WAV, FLAC, OGG, and WebM.
     *         </p>
     * @see MediaFormat
     */
    public String getMediaFormat() {
        return mediaFormat;
    }

    /**
     * <p>
     * The format of the input audio file. Note: for call analytics jobs, only
     * the following media formats are supported: MP3, MP4, WAV, FLAC, OGG, and
     * WebM.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @param mediaFormat <p>
     *            The format of the input audio file. Note: for call analytics
     *            jobs, only the following media formats are supported: MP3,
     *            MP4, WAV, FLAC, OGG, and WebM.
     *            </p>
     * @see MediaFormat
     */
    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    /**
     * <p>
     * The format of the input audio file. Note: for call analytics jobs, only
     * the following media formats are supported: MP3, MP4, WAV, FLAC, OGG, and
     * WebM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @param mediaFormat <p>
     *            The format of the input audio file. Note: for call analytics
     *            jobs, only the following media formats are supported: MP3,
     *            MP4, WAV, FLAC, OGG, and WebM.
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
     * The format of the input audio file. Note: for call analytics jobs, only
     * the following media formats are supported: MP3, MP4, WAV, FLAC, OGG, and
     * WebM.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @param mediaFormat <p>
     *            The format of the input audio file. Note: for call analytics
     *            jobs, only the following media formats are supported: MP3,
     *            MP4, WAV, FLAC, OGG, and WebM.
     *            </p>
     * @see MediaFormat
     */
    public void setMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat.toString();
    }

    /**
     * <p>
     * The format of the input audio file. Note: for call analytics jobs, only
     * the following media formats are supported: MP3, MP4, WAV, FLAC, OGG, and
     * WebM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @param mediaFormat <p>
     *            The format of the input audio file. Note: for call analytics
     *            jobs, only the following media formats are supported: MP3,
     *            MP4, WAV, FLAC, OGG, and WebM.
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
     * Describes the input media file in a transcription request.
     * </p>
     *
     * @return <p>
     *         Describes the input media file in a transcription request.
     *         </p>
     */
    public Media getMedia() {
        return media;
    }

    /**
     * <p>
     * Describes the input media file in a transcription request.
     * </p>
     *
     * @param media <p>
     *            Describes the input media file in a transcription request.
     *            </p>
     */
    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * <p>
     * Describes the input media file in a transcription request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param media <p>
     *            Describes the input media file in a transcription request.
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
     * Identifies the location of a transcription.
     * </p>
     *
     * @return <p>
     *         Identifies the location of a transcription.
     *         </p>
     */
    public Transcript getTranscript() {
        return transcript;
    }

    /**
     * <p>
     * Identifies the location of a transcription.
     * </p>
     *
     * @param transcript <p>
     *            Identifies the location of a transcription.
     *            </p>
     */
    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    /**
     * <p>
     * Identifies the location of a transcription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcript <p>
     *            Identifies the location of a transcription.
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
     * A timestamp that shows when the analytics job started processing.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the analytics job started processing.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the analytics job started processing.
     * </p>
     *
     * @param startTime <p>
     *            A timestamp that shows when the analytics job started
     *            processing.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the analytics job started processing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            A timestamp that shows when the analytics job started
     *            processing.
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
     * A timestamp that shows when the analytics job was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the analytics job was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the analytics job was created.
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp that shows when the analytics job was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the analytics job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp that shows when the analytics job was created.
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
     * A timestamp that shows when the analytics job was completed.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the analytics job was completed.
     *         </p>
     */
    public java.util.Date getCompletionTime() {
        return completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the analytics job was completed.
     * </p>
     *
     * @param completionTime <p>
     *            A timestamp that shows when the analytics job was completed.
     *            </p>
     */
    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the analytics job was completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completionTime <p>
     *            A timestamp that shows when the analytics job was completed.
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
     * If the <code>AnalyticsJobStatus</code> is <code>FAILED</code>, this field
     * contains information about why the job failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field can contain one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>: The media format specified in the
     * <code>MediaFormat</code> field of the request isn't valid. See the
     * description of the <code>MediaFormat</code> field for a list of valid
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>
     * : The media format of the audio file doesn't match the format specified
     * in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>: The sample rate
     * specified in the <code>MediaSampleRateHertz</code> of the request isn't
     * valid. The sample rate must be between 8,000 and 48,000 Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>
     * : The sample rate in the audio file doesn't match the sample rate
     * specified in the <code>MediaSampleRateHertz</code> field in the request.
     * Check the sample rate of your media file and make sure that the two
     * values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>: The size of your
     * audio file is larger than what Amazon Transcribe Medical can process. For
     * more information, see <i>Guidelines and Quotas</i> in the Amazon
     * Transcribe Medical Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>:
     * Your audio contains more channels than Amazon Transcribe Medical is
     * configured to process. To request additional channels, see Amazon
     * Transcribe Medical Endpoints and Quotas in the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/Welcome.html">Amazon
     * Web Services General Reference</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         If the <code>AnalyticsJobStatus</code> is <code>FAILED</code>,
     *         this field contains information about why the job failed.
     *         </p>
     *         <p>
     *         The <code>FailureReason</code> field can contain one of the
     *         following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Unsupported media format</code>: The media format specified
     *         in the <code>MediaFormat</code> field of the request isn't valid.
     *         See the description of the <code>MediaFormat</code> field for a
     *         list of valid values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>The media format provided does not match the detected media format</code>
     *         : The media format of the audio file doesn't match the format
     *         specified in the <code>MediaFormat</code> field in the request.
     *         Check the media format of your media file and make sure the two
     *         values match.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid sample rate for audio file</code>: The sample rate
     *         specified in the <code>MediaSampleRateHertz</code> of the request
     *         isn't valid. The sample rate must be between 8,000 and 48,000
     *         Hertz.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>The sample rate provided does not match the detected sample rate</code>
     *         : The sample rate in the audio file doesn't match the sample rate
     *         specified in the <code>MediaSampleRateHertz</code> field in the
     *         request. Check the sample rate of your media file and make sure
     *         that the two values match.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid file size: file size too large</code>: The size of
     *         your audio file is larger than what Amazon Transcribe Medical can
     *         process. For more information, see <i>Guidelines and Quotas</i>
     *         in the Amazon Transcribe Medical Guide.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid number of channels: number of channels too large</code>
     *         : Your audio contains more channels than Amazon Transcribe
     *         Medical is configured to process. To request additional channels,
     *         see Amazon Transcribe Medical Endpoints and Quotas in the <a
     *         href=
     *         "https://docs.aws.amazon.com/general/latest/gr/Welcome.html">
     *         Amazon Web Services General Reference</a>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If the <code>AnalyticsJobStatus</code> is <code>FAILED</code>, this field
     * contains information about why the job failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field can contain one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>: The media format specified in the
     * <code>MediaFormat</code> field of the request isn't valid. See the
     * description of the <code>MediaFormat</code> field for a list of valid
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>
     * : The media format of the audio file doesn't match the format specified
     * in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>: The sample rate
     * specified in the <code>MediaSampleRateHertz</code> of the request isn't
     * valid. The sample rate must be between 8,000 and 48,000 Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>
     * : The sample rate in the audio file doesn't match the sample rate
     * specified in the <code>MediaSampleRateHertz</code> field in the request.
     * Check the sample rate of your media file and make sure that the two
     * values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>: The size of your
     * audio file is larger than what Amazon Transcribe Medical can process. For
     * more information, see <i>Guidelines and Quotas</i> in the Amazon
     * Transcribe Medical Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>:
     * Your audio contains more channels than Amazon Transcribe Medical is
     * configured to process. To request additional channels, see Amazon
     * Transcribe Medical Endpoints and Quotas in the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/Welcome.html">Amazon
     * Web Services General Reference</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @param failureReason <p>
     *            If the <code>AnalyticsJobStatus</code> is <code>FAILED</code>,
     *            this field contains information about why the job failed.
     *            </p>
     *            <p>
     *            The <code>FailureReason</code> field can contain one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Unsupported media format</code>: The media format
     *            specified in the <code>MediaFormat</code> field of the request
     *            isn't valid. See the description of the
     *            <code>MediaFormat</code> field for a list of valid values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>The media format provided does not match the detected media format</code>
     *            : The media format of the audio file doesn't match the format
     *            specified in the <code>MediaFormat</code> field in the
     *            request. Check the media format of your media file and make
     *            sure the two values match.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid sample rate for audio file</code>: The sample
     *            rate specified in the <code>MediaSampleRateHertz</code> of the
     *            request isn't valid. The sample rate must be between 8,000 and
     *            48,000 Hertz.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>The sample rate provided does not match the detected sample rate</code>
     *            : The sample rate in the audio file doesn't match the sample
     *            rate specified in the <code>MediaSampleRateHertz</code> field
     *            in the request. Check the sample rate of your media file and
     *            make sure that the two values match.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid file size: file size too large</code>: The size
     *            of your audio file is larger than what Amazon Transcribe
     *            Medical can process. For more information, see <i>Guidelines
     *            and Quotas</i> in the Amazon Transcribe Medical Guide.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid number of channels: number of channels too large</code>
     *            : Your audio contains more channels than Amazon Transcribe
     *            Medical is configured to process. To request additional
     *            channels, see Amazon Transcribe Medical Endpoints and Quotas
     *            in the <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/Welcome.html"
     *            >Amazon Web Services General Reference</a>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the <code>AnalyticsJobStatus</code> is <code>FAILED</code>, this field
     * contains information about why the job failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field can contain one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>: The media format specified in the
     * <code>MediaFormat</code> field of the request isn't valid. See the
     * description of the <code>MediaFormat</code> field for a list of valid
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>
     * : The media format of the audio file doesn't match the format specified
     * in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>: The sample rate
     * specified in the <code>MediaSampleRateHertz</code> of the request isn't
     * valid. The sample rate must be between 8,000 and 48,000 Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>
     * : The sample rate in the audio file doesn't match the sample rate
     * specified in the <code>MediaSampleRateHertz</code> field in the request.
     * Check the sample rate of your media file and make sure that the two
     * values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>: The size of your
     * audio file is larger than what Amazon Transcribe Medical can process. For
     * more information, see <i>Guidelines and Quotas</i> in the Amazon
     * Transcribe Medical Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>:
     * Your audio contains more channels than Amazon Transcribe Medical is
     * configured to process. To request additional channels, see Amazon
     * Transcribe Medical Endpoints and Quotas in the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/Welcome.html">Amazon
     * Web Services General Reference</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            If the <code>AnalyticsJobStatus</code> is <code>FAILED</code>,
     *            this field contains information about why the job failed.
     *            </p>
     *            <p>
     *            The <code>FailureReason</code> field can contain one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Unsupported media format</code>: The media format
     *            specified in the <code>MediaFormat</code> field of the request
     *            isn't valid. See the description of the
     *            <code>MediaFormat</code> field for a list of valid values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>The media format provided does not match the detected media format</code>
     *            : The media format of the audio file doesn't match the format
     *            specified in the <code>MediaFormat</code> field in the
     *            request. Check the media format of your media file and make
     *            sure the two values match.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid sample rate for audio file</code>: The sample
     *            rate specified in the <code>MediaSampleRateHertz</code> of the
     *            request isn't valid. The sample rate must be between 8,000 and
     *            48,000 Hertz.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>The sample rate provided does not match the detected sample rate</code>
     *            : The sample rate in the audio file doesn't match the sample
     *            rate specified in the <code>MediaSampleRateHertz</code> field
     *            in the request. Check the sample rate of your media file and
     *            make sure that the two values match.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid file size: file size too large</code>: The size
     *            of your audio file is larger than what Amazon Transcribe
     *            Medical can process. For more information, see <i>Guidelines
     *            and Quotas</i> in the Amazon Transcribe Medical Guide.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Invalid number of channels: number of channels too large</code>
     *            : Your audio contains more channels than Amazon Transcribe
     *            Medical is configured to process. To request additional
     *            channels, see Amazon Transcribe Medical Endpoints and Quotas
     *            in the <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/Welcome.html"
     *            >Amazon Web Services General Reference</a>.
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
     * The Amazon Resource Number (ARN) that you use to access the analytics
     * job. ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) that you use to access the
     *         analytics job. ARNs have the format
     *         <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     *         .
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) that you use to access the analytics
     * job. ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Number (ARN) that you use to access the
     *            analytics job. ARNs have the format
     *            <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     *            .
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) that you use to access the analytics
     * job. ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     * .
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
     *            The Amazon Resource Number (ARN) that you use to access the
     *            analytics job. ARNs have the format
     *            <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     *            .
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
     * A value between zero and one that Amazon Transcribe assigned to the
     * language that it identified in the source audio. This value appears only
     * when you don't provide a single language code. Larger values indicate
     * that Amazon Transcribe has higher confidence in the language that it
     * identified.
     * </p>
     *
     * @return <p>
     *         A value between zero and one that Amazon Transcribe assigned to
     *         the language that it identified in the source audio. This value
     *         appears only when you don't provide a single language code.
     *         Larger values indicate that Amazon Transcribe has higher
     *         confidence in the language that it identified.
     *         </p>
     */
    public Float getIdentifiedLanguageScore() {
        return identifiedLanguageScore;
    }

    /**
     * <p>
     * A value between zero and one that Amazon Transcribe assigned to the
     * language that it identified in the source audio. This value appears only
     * when you don't provide a single language code. Larger values indicate
     * that Amazon Transcribe has higher confidence in the language that it
     * identified.
     * </p>
     *
     * @param identifiedLanguageScore <p>
     *            A value between zero and one that Amazon Transcribe assigned
     *            to the language that it identified in the source audio. This
     *            value appears only when you don't provide a single language
     *            code. Larger values indicate that Amazon Transcribe has higher
     *            confidence in the language that it identified.
     *            </p>
     */
    public void setIdentifiedLanguageScore(Float identifiedLanguageScore) {
        this.identifiedLanguageScore = identifiedLanguageScore;
    }

    /**
     * <p>
     * A value between zero and one that Amazon Transcribe assigned to the
     * language that it identified in the source audio. This value appears only
     * when you don't provide a single language code. Larger values indicate
     * that Amazon Transcribe has higher confidence in the language that it
     * identified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identifiedLanguageScore <p>
     *            A value between zero and one that Amazon Transcribe assigned
     *            to the language that it identified in the source audio. This
     *            value appears only when you don't provide a single language
     *            code. Larger values indicate that Amazon Transcribe has higher
     *            confidence in the language that it identified.
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
     * Provides information about the settings used to run a transcription job.
     * </p>
     *
     * @return <p>
     *         Provides information about the settings used to run a
     *         transcription job.
     *         </p>
     */
    public CallAnalyticsJobSettings getSettings() {
        return settings;
    }

    /**
     * <p>
     * Provides information about the settings used to run a transcription job.
     * </p>
     *
     * @param settings <p>
     *            Provides information about the settings used to run a
     *            transcription job.
     *            </p>
     */
    public void setSettings(CallAnalyticsJobSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Provides information about the settings used to run a transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            Provides information about the settings used to run a
     *            transcription job.
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
     * Shows numeric values to indicate the channel assigned to the agent's
     * audio and the channel assigned to the customer's audio.
     * </p>
     *
     * @return <p>
     *         Shows numeric values to indicate the channel assigned to the
     *         agent's audio and the channel assigned to the customer's audio.
     *         </p>
     */
    public java.util.List<ChannelDefinition> getChannelDefinitions() {
        return channelDefinitions;
    }

    /**
     * <p>
     * Shows numeric values to indicate the channel assigned to the agent's
     * audio and the channel assigned to the customer's audio.
     * </p>
     *
     * @param channelDefinitions <p>
     *            Shows numeric values to indicate the channel assigned to the
     *            agent's audio and the channel assigned to the customer's
     *            audio.
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
     * Shows numeric values to indicate the channel assigned to the agent's
     * audio and the channel assigned to the customer's audio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelDefinitions <p>
     *            Shows numeric values to indicate the channel assigned to the
     *            agent's audio and the channel assigned to the customer's
     *            audio.
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
     * Shows numeric values to indicate the channel assigned to the agent's
     * audio and the channel assigned to the customer's audio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelDefinitions <p>
     *            Shows numeric values to indicate the channel assigned to the
     *            agent's audio and the channel assigned to the customer's
     *            audio.
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
