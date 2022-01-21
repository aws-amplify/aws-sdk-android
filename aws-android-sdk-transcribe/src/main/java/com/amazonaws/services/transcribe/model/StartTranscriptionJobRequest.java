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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts an asynchronous job to transcribe speech to text.
 * </p>
 */
public class StartTranscriptionJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the job. You can't use the strings "<code>.</code>" or "
     * <code>..</code>" by themselves as the job name. The name must also be
     * unique within an Amazon Web Services account. If you try to create a
     * transcription job with the same name as a previous transcription job, you
     * get a <code>ConflictException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String transcriptionJobName;

    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (ar-SA), your audio or
     * video file must be encoded at a sample rate of 16,000 Hz or higher.
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
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * <p>
     * If you do not specify the media sample rate, Amazon Transcribe determines
     * the sample rate. If you specify the sample rate, it must match the sample
     * rate detected by Amazon Transcribe. In most cases, you should leave the
     * <code>MediaSampleRateHertz</code> field blank and let Amazon Transcribe
     * determine the sample rate.
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
     * An object that describes the input media for a transcription job.
     * </p>
     */
    private Media media;

    /**
     * <p>
     * The location where the transcription is stored.
     * </p>
     * <p>
     * If you set the <code>OutputBucketName</code>, Amazon Transcribe puts the
     * transcript in the specified S3 bucket. When you call the
     * <a>GetTranscriptionJob</a> operation, the operation returns this location
     * in the <code>TranscriptFileUri</code> field. If you enable content
     * redaction, the redacted transcript appears in
     * <code>RedactedTranscriptFileUri</code>. If you enable content redaction
     * and choose to output an unredacted transcript, that transcript's location
     * still appears in the <code>TranscriptFileUri</code>. The S3 bucket must
     * have permissions that allow Amazon Transcribe to put files in the bucket.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * You can specify an Amazon Web Services Key Management Service (KMS) key
     * to encrypt the output of your transcription using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a
     * KMS key, Amazon Transcribe uses the default Amazon S3 key for server-side
     * encryption of transcripts that are placed in your S3 bucket.
     * </p>
     * <p>
     * If you don't set the <code>OutputBucketName</code>, Amazon Transcribe
     * generates a pre-signed URL, a shareable URL that provides secure access
     * to your transcription, and returns it in the
     * <code>TranscriptFileUri</code> field. Use this URL to download the
     * transcription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]<br/>
     */
    private String outputBucketName;

    /**
     * <p>
     * You can specify a location in an Amazon S3 bucket to store the output of
     * your transcription job.
     * </p>
     * <p>
     * If you don't specify an output key, Amazon Transcribe stores the output
     * of your transcription job in the Amazon S3 bucket you specified. By
     * default, the object key is "your-transcription-job-name.json".
     * </p>
     * <p>
     * You can use output keys to specify the Amazon S3 prefix and file name of
     * the transcription output. For example, specifying the Amazon S3 prefix,
     * "folder1/folder2/", as an output key would lead to the output being
     * stored as "folder1/folder2/your-transcription-job-name.json". If you
     * specify "my-other-job-name.json" as the output key, the object key is
     * changed to "my-other-job-name.json". You can use an output key to change
     * both the prefix and the file name, for example
     * "folder/my-other-job-name.json".
     * </p>
     * <p>
     * If you specify an output key, you must also specify an S3 bucket in the
     * <code>OutputBucketName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.!*'()/]{1,1024}$<br/>
     */
    private String outputKey;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Key Management
     * Service (KMS) key used to encrypt the output of the transcription job.
     * The user calling the <code>StartTranscriptionJob</code> operation must
     * have permission to use the specified KMS key.
     * </p>
     * <p>
     * You can use either of the following to identify a KMS key in the current
     * account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: "alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use either of the following to identify a KMS key in the current
     * account or another account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias:
     * "arn:aws:kms:region:account-ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the transcription
     * job is encrypted with the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an
     * output location in the <code>OutputBucketName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     */
    private String outputEncryptionKMSKeyId;

    /**
     * <p>
     * A map of plain text, non-secret key:value pairs, known as encryption
     * context pairs, that provide an added layer of security for your data.
     * </p>
     */
    private java.util.Map<String, String> kMSEncryptionContext;

    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a
     * transcription job.
     * </p>
     */
    private Settings settings;

    /**
     * <p>
     * Choose the custom language model you use for your transcription job in
     * this parameter.
     * </p>
     */
    private ModelSettings modelSettings;

    /**
     * <p>
     * Provides information about how a transcription job is executed. Use this
     * field to indicate that the job can be queued for deferred execution if
     * the concurrency limit is reached and there are no slots available to
     * immediately run the job.
     * </p>
     */
    private JobExecutionSettings jobExecutionSettings;

    /**
     * <p>
     * An object that contains the request parameters for content redaction.
     * </p>
     */
    private ContentRedaction contentRedaction;

    /**
     * <p>
     * Set this field to <code>true</code> to enable automatic language
     * identification. Automatic language identification is disabled by default.
     * You receive a <code>BadRequestException</code> error if you enter a value
     * for a <code>LanguageCode</code>.
     * </p>
     */
    private Boolean identifyLanguage;

    /**
     * <p>
     * An object containing a list of languages that might be present in your
     * collection of audio files. Automatic language identification chooses a
     * language that best matches the source audio from that list.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (ar-SA), your audio or
     * video file must be encoded at a sample rate of 16,000 Hz or higher.
     * </p>
     */
    private java.util.List<String> languageOptions;

    /**
     * <p>
     * Add subtitles to your batch transcription job.
     * </p>
     */
    private Subtitles subtitles;

    /**
     * <p>
     * Add tags to an Amazon Transcribe transcription job.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The language identification settings associated with your transcription
     * job. These settings include <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>, and <code>LanguageModelName</code>.
     * </p>
     */
    private java.util.Map<String, LanguageIdSettings> languageIdSettings;

    /**
     * <p>
     * The name of the job. You can't use the strings "<code>.</code>" or "
     * <code>..</code>" by themselves as the job name. The name must also be
     * unique within an Amazon Web Services account. If you try to create a
     * transcription job with the same name as a previous transcription job, you
     * get a <code>ConflictException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the job. You can't use the strings "<code>.</code>
     *         " or "<code>..</code>" by themselves as the job name. The name
     *         must also be unique within an Amazon Web Services account. If you
     *         try to create a transcription job with the same name as a
     *         previous transcription job, you get a
     *         <code>ConflictException</code> error.
     *         </p>
     */
    public String getTranscriptionJobName() {
        return transcriptionJobName;
    }

    /**
     * <p>
     * The name of the job. You can't use the strings "<code>.</code>" or "
     * <code>..</code>" by themselves as the job name. The name must also be
     * unique within an Amazon Web Services account. If you try to create a
     * transcription job with the same name as a previous transcription job, you
     * get a <code>ConflictException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param transcriptionJobName <p>
     *            The name of the job. You can't use the strings "<code>.</code>
     *            " or "<code>..</code>" by themselves as the job name. The name
     *            must also be unique within an Amazon Web Services account. If
     *            you try to create a transcription job with the same name as a
     *            previous transcription job, you get a
     *            <code>ConflictException</code> error.
     *            </p>
     */
    public void setTranscriptionJobName(String transcriptionJobName) {
        this.transcriptionJobName = transcriptionJobName;
    }

    /**
     * <p>
     * The name of the job. You can't use the strings "<code>.</code>" or "
     * <code>..</code>" by themselves as the job name. The name must also be
     * unique within an Amazon Web Services account. If you try to create a
     * transcription job with the same name as a previous transcription job, you
     * get a <code>ConflictException</code> error.
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
     *            The name of the job. You can't use the strings "<code>.</code>
     *            " or "<code>..</code>" by themselves as the job name. The name
     *            must also be unique within an Amazon Web Services account. If
     *            you try to create a transcription job with the same name as a
     *            previous transcription job, you get a
     *            <code>ConflictException</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withTranscriptionJobName(String transcriptionJobName) {
        this.transcriptionJobName = transcriptionJobName;
        return this;
    }

    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (ar-SA), your audio or
     * video file must be encoded at a sample rate of 16,000 Hz or higher.
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
     *         The language code for the language used in the input media file.
     *         </p>
     *         <p>
     *         To transcribe speech in Modern Standard Arabic (ar-SA), your
     *         audio or video file must be encoded at a sample rate of 16,000 Hz
     *         or higher.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (ar-SA), your audio or
     * video file must be encoded at a sample rate of 16,000 Hz or higher.
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
     *            The language code for the language used in the input media
     *            file.
     *            </p>
     *            <p>
     *            To transcribe speech in Modern Standard Arabic (ar-SA), your
     *            audio or video file must be encoded at a sample rate of 16,000
     *            Hz or higher.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (ar-SA), your audio or
     * video file must be encoded at a sample rate of 16,000 Hz or higher.
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
     *            The language code for the language used in the input media
     *            file.
     *            </p>
     *            <p>
     *            To transcribe speech in Modern Standard Arabic (ar-SA), your
     *            audio or video file must be encoded at a sample rate of 16,000
     *            Hz or higher.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public StartTranscriptionJobRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (ar-SA), your audio or
     * video file must be encoded at a sample rate of 16,000 Hz or higher.
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
     *            The language code for the language used in the input media
     *            file.
     *            </p>
     *            <p>
     *            To transcribe speech in Modern Standard Arabic (ar-SA), your
     *            audio or video file must be encoded at a sample rate of 16,000
     *            Hz or higher.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code for the language used in the input media file.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (ar-SA), your audio or
     * video file must be encoded at a sample rate of 16,000 Hz or higher.
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
     *            The language code for the language used in the input media
     *            file.
     *            </p>
     *            <p>
     *            To transcribe speech in Modern Standard Arabic (ar-SA), your
     *            audio or video file must be encoded at a sample rate of 16,000
     *            Hz or higher.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public StartTranscriptionJobRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * <p>
     * If you do not specify the media sample rate, Amazon Transcribe determines
     * the sample rate. If you specify the sample rate, it must match the sample
     * rate detected by Amazon Transcribe. In most cases, you should leave the
     * <code>MediaSampleRateHertz</code> field blank and let Amazon Transcribe
     * determine the sample rate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @return <p>
     *         The sample rate, in Hertz, of the audio track in the input media
     *         file.
     *         </p>
     *         <p>
     *         If you do not specify the media sample rate, Amazon Transcribe
     *         determines the sample rate. If you specify the sample rate, it
     *         must match the sample rate detected by Amazon Transcribe. In most
     *         cases, you should leave the <code>MediaSampleRateHertz</code>
     *         field blank and let Amazon Transcribe determine the sample rate.
     *         </p>
     */
    public Integer getMediaSampleRateHertz() {
        return mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * <p>
     * If you do not specify the media sample rate, Amazon Transcribe determines
     * the sample rate. If you specify the sample rate, it must match the sample
     * rate detected by Amazon Transcribe. In most cases, you should leave the
     * <code>MediaSampleRateHertz</code> field blank and let Amazon Transcribe
     * determine the sample rate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate, in Hertz, of the audio track in the input
     *            media file.
     *            </p>
     *            <p>
     *            If you do not specify the media sample rate, Amazon Transcribe
     *            determines the sample rate. If you specify the sample rate, it
     *            must match the sample rate detected by Amazon Transcribe. In
     *            most cases, you should leave the
     *            <code>MediaSampleRateHertz</code> field blank and let Amazon
     *            Transcribe determine the sample rate.
     *            </p>
     */
    public void setMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * <p>
     * If you do not specify the media sample rate, Amazon Transcribe determines
     * the sample rate. If you specify the sample rate, it must match the sample
     * rate detected by Amazon Transcribe. In most cases, you should leave the
     * <code>MediaSampleRateHertz</code> field blank and let Amazon Transcribe
     * determine the sample rate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate, in Hertz, of the audio track in the input
     *            media file.
     *            </p>
     *            <p>
     *            If you do not specify the media sample rate, Amazon Transcribe
     *            determines the sample rate. If you specify the sample rate, it
     *            must match the sample rate detected by Amazon Transcribe. In
     *            most cases, you should leave the
     *            <code>MediaSampleRateHertz</code> field blank and let Amazon
     *            Transcribe determine the sample rate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withMediaSampleRateHertz(Integer mediaSampleRateHertz) {
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
    public StartTranscriptionJobRequest withMediaFormat(String mediaFormat) {
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
    public StartTranscriptionJobRequest withMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat.toString();
        return this;
    }

    /**
     * <p>
     * An object that describes the input media for a transcription job.
     * </p>
     *
     * @return <p>
     *         An object that describes the input media for a transcription job.
     *         </p>
     */
    public Media getMedia() {
        return media;
    }

    /**
     * <p>
     * An object that describes the input media for a transcription job.
     * </p>
     *
     * @param media <p>
     *            An object that describes the input media for a transcription
     *            job.
     *            </p>
     */
    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * <p>
     * An object that describes the input media for a transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param media <p>
     *            An object that describes the input media for a transcription
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withMedia(Media media) {
        this.media = media;
        return this;
    }

    /**
     * <p>
     * The location where the transcription is stored.
     * </p>
     * <p>
     * If you set the <code>OutputBucketName</code>, Amazon Transcribe puts the
     * transcript in the specified S3 bucket. When you call the
     * <a>GetTranscriptionJob</a> operation, the operation returns this location
     * in the <code>TranscriptFileUri</code> field. If you enable content
     * redaction, the redacted transcript appears in
     * <code>RedactedTranscriptFileUri</code>. If you enable content redaction
     * and choose to output an unredacted transcript, that transcript's location
     * still appears in the <code>TranscriptFileUri</code>. The S3 bucket must
     * have permissions that allow Amazon Transcribe to put files in the bucket.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * You can specify an Amazon Web Services Key Management Service (KMS) key
     * to encrypt the output of your transcription using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a
     * KMS key, Amazon Transcribe uses the default Amazon S3 key for server-side
     * encryption of transcripts that are placed in your S3 bucket.
     * </p>
     * <p>
     * If you don't set the <code>OutputBucketName</code>, Amazon Transcribe
     * generates a pre-signed URL, a shareable URL that provides secure access
     * to your transcription, and returns it in the
     * <code>TranscriptFileUri</code> field. Use this URL to download the
     * transcription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]<br/>
     *
     * @return <p>
     *         The location where the transcription is stored.
     *         </p>
     *         <p>
     *         If you set the <code>OutputBucketName</code>, Amazon Transcribe
     *         puts the transcript in the specified S3 bucket. When you call the
     *         <a>GetTranscriptionJob</a> operation, the operation returns this
     *         location in the <code>TranscriptFileUri</code> field. If you
     *         enable content redaction, the redacted transcript appears in
     *         <code>RedactedTranscriptFileUri</code>. If you enable content
     *         redaction and choose to output an unredacted transcript, that
     *         transcript's location still appears in the
     *         <code>TranscriptFileUri</code>. The S3 bucket must have
     *         permissions that allow Amazon Transcribe to put files in the
     *         bucket. For more information, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *         >Permissions Required for IAM User Roles</a>.
     *         </p>
     *         <p>
     *         You can specify an Amazon Web Services Key Management Service
     *         (KMS) key to encrypt the output of your transcription using the
     *         <code>OutputEncryptionKMSKeyId</code> parameter. If you don't
     *         specify a KMS key, Amazon Transcribe uses the default Amazon S3
     *         key for server-side encryption of transcripts that are placed in
     *         your S3 bucket.
     *         </p>
     *         <p>
     *         If you don't set the <code>OutputBucketName</code>, Amazon
     *         Transcribe generates a pre-signed URL, a shareable URL that
     *         provides secure access to your transcription, and returns it in
     *         the <code>TranscriptFileUri</code> field. Use this URL to
     *         download the transcription.
     *         </p>
     */
    public String getOutputBucketName() {
        return outputBucketName;
    }

    /**
     * <p>
     * The location where the transcription is stored.
     * </p>
     * <p>
     * If you set the <code>OutputBucketName</code>, Amazon Transcribe puts the
     * transcript in the specified S3 bucket. When you call the
     * <a>GetTranscriptionJob</a> operation, the operation returns this location
     * in the <code>TranscriptFileUri</code> field. If you enable content
     * redaction, the redacted transcript appears in
     * <code>RedactedTranscriptFileUri</code>. If you enable content redaction
     * and choose to output an unredacted transcript, that transcript's location
     * still appears in the <code>TranscriptFileUri</code>. The S3 bucket must
     * have permissions that allow Amazon Transcribe to put files in the bucket.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * You can specify an Amazon Web Services Key Management Service (KMS) key
     * to encrypt the output of your transcription using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a
     * KMS key, Amazon Transcribe uses the default Amazon S3 key for server-side
     * encryption of transcripts that are placed in your S3 bucket.
     * </p>
     * <p>
     * If you don't set the <code>OutputBucketName</code>, Amazon Transcribe
     * generates a pre-signed URL, a shareable URL that provides secure access
     * to your transcription, and returns it in the
     * <code>TranscriptFileUri</code> field. Use this URL to download the
     * transcription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]<br/>
     *
     * @param outputBucketName <p>
     *            The location where the transcription is stored.
     *            </p>
     *            <p>
     *            If you set the <code>OutputBucketName</code>, Amazon
     *            Transcribe puts the transcript in the specified S3 bucket.
     *            When you call the <a>GetTranscriptionJob</a> operation, the
     *            operation returns this location in the
     *            <code>TranscriptFileUri</code> field. If you enable content
     *            redaction, the redacted transcript appears in
     *            <code>RedactedTranscriptFileUri</code>. If you enable content
     *            redaction and choose to output an unredacted transcript, that
     *            transcript's location still appears in the
     *            <code>TranscriptFileUri</code>. The S3 bucket must have
     *            permissions that allow Amazon Transcribe to put files in the
     *            bucket. For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *            >Permissions Required for IAM User Roles</a>.
     *            </p>
     *            <p>
     *            You can specify an Amazon Web Services Key Management Service
     *            (KMS) key to encrypt the output of your transcription using
     *            the <code>OutputEncryptionKMSKeyId</code> parameter. If you
     *            don't specify a KMS key, Amazon Transcribe uses the default
     *            Amazon S3 key for server-side encryption of transcripts that
     *            are placed in your S3 bucket.
     *            </p>
     *            <p>
     *            If you don't set the <code>OutputBucketName</code>, Amazon
     *            Transcribe generates a pre-signed URL, a shareable URL that
     *            provides secure access to your transcription, and returns it
     *            in the <code>TranscriptFileUri</code> field. Use this URL to
     *            download the transcription.
     *            </p>
     */
    public void setOutputBucketName(String outputBucketName) {
        this.outputBucketName = outputBucketName;
    }

    /**
     * <p>
     * The location where the transcription is stored.
     * </p>
     * <p>
     * If you set the <code>OutputBucketName</code>, Amazon Transcribe puts the
     * transcript in the specified S3 bucket. When you call the
     * <a>GetTranscriptionJob</a> operation, the operation returns this location
     * in the <code>TranscriptFileUri</code> field. If you enable content
     * redaction, the redacted transcript appears in
     * <code>RedactedTranscriptFileUri</code>. If you enable content redaction
     * and choose to output an unredacted transcript, that transcript's location
     * still appears in the <code>TranscriptFileUri</code>. The S3 bucket must
     * have permissions that allow Amazon Transcribe to put files in the bucket.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * You can specify an Amazon Web Services Key Management Service (KMS) key
     * to encrypt the output of your transcription using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a
     * KMS key, Amazon Transcribe uses the default Amazon S3 key for server-side
     * encryption of transcripts that are placed in your S3 bucket.
     * </p>
     * <p>
     * If you don't set the <code>OutputBucketName</code>, Amazon Transcribe
     * generates a pre-signed URL, a shareable URL that provides secure access
     * to your transcription, and returns it in the
     * <code>TranscriptFileUri</code> field. Use this URL to download the
     * transcription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]<br/>
     *
     * @param outputBucketName <p>
     *            The location where the transcription is stored.
     *            </p>
     *            <p>
     *            If you set the <code>OutputBucketName</code>, Amazon
     *            Transcribe puts the transcript in the specified S3 bucket.
     *            When you call the <a>GetTranscriptionJob</a> operation, the
     *            operation returns this location in the
     *            <code>TranscriptFileUri</code> field. If you enable content
     *            redaction, the redacted transcript appears in
     *            <code>RedactedTranscriptFileUri</code>. If you enable content
     *            redaction and choose to output an unredacted transcript, that
     *            transcript's location still appears in the
     *            <code>TranscriptFileUri</code>. The S3 bucket must have
     *            permissions that allow Amazon Transcribe to put files in the
     *            bucket. For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *            >Permissions Required for IAM User Roles</a>.
     *            </p>
     *            <p>
     *            You can specify an Amazon Web Services Key Management Service
     *            (KMS) key to encrypt the output of your transcription using
     *            the <code>OutputEncryptionKMSKeyId</code> parameter. If you
     *            don't specify a KMS key, Amazon Transcribe uses the default
     *            Amazon S3 key for server-side encryption of transcripts that
     *            are placed in your S3 bucket.
     *            </p>
     *            <p>
     *            If you don't set the <code>OutputBucketName</code>, Amazon
     *            Transcribe generates a pre-signed URL, a shareable URL that
     *            provides secure access to your transcription, and returns it
     *            in the <code>TranscriptFileUri</code> field. Use this URL to
     *            download the transcription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withOutputBucketName(String outputBucketName) {
        this.outputBucketName = outputBucketName;
        return this;
    }

    /**
     * <p>
     * You can specify a location in an Amazon S3 bucket to store the output of
     * your transcription job.
     * </p>
     * <p>
     * If you don't specify an output key, Amazon Transcribe stores the output
     * of your transcription job in the Amazon S3 bucket you specified. By
     * default, the object key is "your-transcription-job-name.json".
     * </p>
     * <p>
     * You can use output keys to specify the Amazon S3 prefix and file name of
     * the transcription output. For example, specifying the Amazon S3 prefix,
     * "folder1/folder2/", as an output key would lead to the output being
     * stored as "folder1/folder2/your-transcription-job-name.json". If you
     * specify "my-other-job-name.json" as the output key, the object key is
     * changed to "my-other-job-name.json". You can use an output key to change
     * both the prefix and the file name, for example
     * "folder/my-other-job-name.json".
     * </p>
     * <p>
     * If you specify an output key, you must also specify an S3 bucket in the
     * <code>OutputBucketName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.!*'()/]{1,1024}$<br/>
     *
     * @return <p>
     *         You can specify a location in an Amazon S3 bucket to store the
     *         output of your transcription job.
     *         </p>
     *         <p>
     *         If you don't specify an output key, Amazon Transcribe stores the
     *         output of your transcription job in the Amazon S3 bucket you
     *         specified. By default, the object key is
     *         "your-transcription-job-name.json".
     *         </p>
     *         <p>
     *         You can use output keys to specify the Amazon S3 prefix and file
     *         name of the transcription output. For example, specifying the
     *         Amazon S3 prefix, "folder1/folder2/", as an output key would lead
     *         to the output being stored as
     *         "folder1/folder2/your-transcription-job-name.json". If you
     *         specify "my-other-job-name.json" as the output key, the object
     *         key is changed to "my-other-job-name.json". You can use an output
     *         key to change both the prefix and the file name, for example
     *         "folder/my-other-job-name.json".
     *         </p>
     *         <p>
     *         If you specify an output key, you must also specify an S3 bucket
     *         in the <code>OutputBucketName</code> parameter.
     *         </p>
     */
    public String getOutputKey() {
        return outputKey;
    }

    /**
     * <p>
     * You can specify a location in an Amazon S3 bucket to store the output of
     * your transcription job.
     * </p>
     * <p>
     * If you don't specify an output key, Amazon Transcribe stores the output
     * of your transcription job in the Amazon S3 bucket you specified. By
     * default, the object key is "your-transcription-job-name.json".
     * </p>
     * <p>
     * You can use output keys to specify the Amazon S3 prefix and file name of
     * the transcription output. For example, specifying the Amazon S3 prefix,
     * "folder1/folder2/", as an output key would lead to the output being
     * stored as "folder1/folder2/your-transcription-job-name.json". If you
     * specify "my-other-job-name.json" as the output key, the object key is
     * changed to "my-other-job-name.json". You can use an output key to change
     * both the prefix and the file name, for example
     * "folder/my-other-job-name.json".
     * </p>
     * <p>
     * If you specify an output key, you must also specify an S3 bucket in the
     * <code>OutputBucketName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.!*'()/]{1,1024}$<br/>
     *
     * @param outputKey <p>
     *            You can specify a location in an Amazon S3 bucket to store the
     *            output of your transcription job.
     *            </p>
     *            <p>
     *            If you don't specify an output key, Amazon Transcribe stores
     *            the output of your transcription job in the Amazon S3 bucket
     *            you specified. By default, the object key is
     *            "your-transcription-job-name.json".
     *            </p>
     *            <p>
     *            You can use output keys to specify the Amazon S3 prefix and
     *            file name of the transcription output. For example, specifying
     *            the Amazon S3 prefix, "folder1/folder2/", as an output key
     *            would lead to the output being stored as
     *            "folder1/folder2/your-transcription-job-name.json". If you
     *            specify "my-other-job-name.json" as the output key, the object
     *            key is changed to "my-other-job-name.json". You can use an
     *            output key to change both the prefix and the file name, for
     *            example "folder/my-other-job-name.json".
     *            </p>
     *            <p>
     *            If you specify an output key, you must also specify an S3
     *            bucket in the <code>OutputBucketName</code> parameter.
     *            </p>
     */
    public void setOutputKey(String outputKey) {
        this.outputKey = outputKey;
    }

    /**
     * <p>
     * You can specify a location in an Amazon S3 bucket to store the output of
     * your transcription job.
     * </p>
     * <p>
     * If you don't specify an output key, Amazon Transcribe stores the output
     * of your transcription job in the Amazon S3 bucket you specified. By
     * default, the object key is "your-transcription-job-name.json".
     * </p>
     * <p>
     * You can use output keys to specify the Amazon S3 prefix and file name of
     * the transcription output. For example, specifying the Amazon S3 prefix,
     * "folder1/folder2/", as an output key would lead to the output being
     * stored as "folder1/folder2/your-transcription-job-name.json". If you
     * specify "my-other-job-name.json" as the output key, the object key is
     * changed to "my-other-job-name.json". You can use an output key to change
     * both the prefix and the file name, for example
     * "folder/my-other-job-name.json".
     * </p>
     * <p>
     * If you specify an output key, you must also specify an S3 bucket in the
     * <code>OutputBucketName</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.!*'()/]{1,1024}$<br/>
     *
     * @param outputKey <p>
     *            You can specify a location in an Amazon S3 bucket to store the
     *            output of your transcription job.
     *            </p>
     *            <p>
     *            If you don't specify an output key, Amazon Transcribe stores
     *            the output of your transcription job in the Amazon S3 bucket
     *            you specified. By default, the object key is
     *            "your-transcription-job-name.json".
     *            </p>
     *            <p>
     *            You can use output keys to specify the Amazon S3 prefix and
     *            file name of the transcription output. For example, specifying
     *            the Amazon S3 prefix, "folder1/folder2/", as an output key
     *            would lead to the output being stored as
     *            "folder1/folder2/your-transcription-job-name.json". If you
     *            specify "my-other-job-name.json" as the output key, the object
     *            key is changed to "my-other-job-name.json". You can use an
     *            output key to change both the prefix and the file name, for
     *            example "folder/my-other-job-name.json".
     *            </p>
     *            <p>
     *            If you specify an output key, you must also specify an S3
     *            bucket in the <code>OutputBucketName</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withOutputKey(String outputKey) {
        this.outputKey = outputKey;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Key Management
     * Service (KMS) key used to encrypt the output of the transcription job.
     * The user calling the <code>StartTranscriptionJob</code> operation must
     * have permission to use the specified KMS key.
     * </p>
     * <p>
     * You can use either of the following to identify a KMS key in the current
     * account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: "alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use either of the following to identify a KMS key in the current
     * account or another account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias:
     * "arn:aws:kms:region:account-ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the transcription
     * job is encrypted with the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an
     * output location in the <code>OutputBucketName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon Web Services Key
     *         Management Service (KMS) key used to encrypt the output of the
     *         transcription job. The user calling the
     *         <code>StartTranscriptionJob</code> operation must have permission
     *         to use the specified KMS key.
     *         </p>
     *         <p>
     *         You can use either of the following to identify a KMS key in the
     *         current account:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         KMS Key Alias: "alias/ExampleAlias"
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can use either of the following to identify a KMS key in the
     *         current account or another account:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Amazon Resource Name (ARN) of a KMS Key:
     *         "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN of a KMS Key Alias:
     *         "arn:aws:kms:region:account-ID:alias/ExampleAlias"
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify an encryption key, the output of the
     *         transcription job is encrypted with the default Amazon S3 key
     *         (SSE-S3).
     *         </p>
     *         <p>
     *         If you specify a KMS key to encrypt your output, you must also
     *         specify an output location in the <code>OutputBucketName</code>
     *         parameter.
     *         </p>
     */
    public String getOutputEncryptionKMSKeyId() {
        return outputEncryptionKMSKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Key Management
     * Service (KMS) key used to encrypt the output of the transcription job.
     * The user calling the <code>StartTranscriptionJob</code> operation must
     * have permission to use the specified KMS key.
     * </p>
     * <p>
     * You can use either of the following to identify a KMS key in the current
     * account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: "alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use either of the following to identify a KMS key in the current
     * account or another account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias:
     * "arn:aws:kms:region:account-ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the transcription
     * job is encrypted with the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an
     * output location in the <code>OutputBucketName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param outputEncryptionKMSKeyId <p>
     *            The Amazon Resource Name (ARN) of the Amazon Web Services Key
     *            Management Service (KMS) key used to encrypt the output of the
     *            transcription job. The user calling the
     *            <code>StartTranscriptionJob</code> operation must have
     *            permission to use the specified KMS key.
     *            </p>
     *            <p>
     *            You can use either of the following to identify a KMS key in
     *            the current account:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            KMS Key Alias: "alias/ExampleAlias"
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can use either of the following to identify a KMS key in
     *            the current account or another account:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Amazon Resource Name (ARN) of a KMS Key:
     *            "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARN of a KMS Key Alias:
     *            "arn:aws:kms:region:account-ID:alias/ExampleAlias"
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify an encryption key, the output of the
     *            transcription job is encrypted with the default Amazon S3 key
     *            (SSE-S3).
     *            </p>
     *            <p>
     *            If you specify a KMS key to encrypt your output, you must also
     *            specify an output location in the
     *            <code>OutputBucketName</code> parameter.
     *            </p>
     */
    public void setOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
        this.outputEncryptionKMSKeyId = outputEncryptionKMSKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Key Management
     * Service (KMS) key used to encrypt the output of the transcription job.
     * The user calling the <code>StartTranscriptionJob</code> operation must
     * have permission to use the specified KMS key.
     * </p>
     * <p>
     * You can use either of the following to identify a KMS key in the current
     * account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: "alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use either of the following to identify a KMS key in the current
     * account or another account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias:
     * "arn:aws:kms:region:account-ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the transcription
     * job is encrypted with the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an
     * output location in the <code>OutputBucketName</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param outputEncryptionKMSKeyId <p>
     *            The Amazon Resource Name (ARN) of the Amazon Web Services Key
     *            Management Service (KMS) key used to encrypt the output of the
     *            transcription job. The user calling the
     *            <code>StartTranscriptionJob</code> operation must have
     *            permission to use the specified KMS key.
     *            </p>
     *            <p>
     *            You can use either of the following to identify a KMS key in
     *            the current account:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            KMS Key Alias: "alias/ExampleAlias"
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can use either of the following to identify a KMS key in
     *            the current account or another account:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Amazon Resource Name (ARN) of a KMS Key:
     *            "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARN of a KMS Key Alias:
     *            "arn:aws:kms:region:account-ID:alias/ExampleAlias"
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify an encryption key, the output of the
     *            transcription job is encrypted with the default Amazon S3 key
     *            (SSE-S3).
     *            </p>
     *            <p>
     *            If you specify a KMS key to encrypt your output, you must also
     *            specify an output location in the
     *            <code>OutputBucketName</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
        this.outputEncryptionKMSKeyId = outputEncryptionKMSKeyId;
        return this;
    }

    /**
     * <p>
     * A map of plain text, non-secret key:value pairs, known as encryption
     * context pairs, that provide an added layer of security for your data.
     * </p>
     *
     * @return <p>
     *         A map of plain text, non-secret key:value pairs, known as
     *         encryption context pairs, that provide an added layer of security
     *         for your data.
     *         </p>
     */
    public java.util.Map<String, String> getKMSEncryptionContext() {
        return kMSEncryptionContext;
    }

    /**
     * <p>
     * A map of plain text, non-secret key:value pairs, known as encryption
     * context pairs, that provide an added layer of security for your data.
     * </p>
     *
     * @param kMSEncryptionContext <p>
     *            A map of plain text, non-secret key:value pairs, known as
     *            encryption context pairs, that provide an added layer of
     *            security for your data.
     *            </p>
     */
    public void setKMSEncryptionContext(java.util.Map<String, String> kMSEncryptionContext) {
        this.kMSEncryptionContext = kMSEncryptionContext;
    }

    /**
     * <p>
     * A map of plain text, non-secret key:value pairs, known as encryption
     * context pairs, that provide an added layer of security for your data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kMSEncryptionContext <p>
     *            A map of plain text, non-secret key:value pairs, known as
     *            encryption context pairs, that provide an added layer of
     *            security for your data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withKMSEncryptionContext(
            java.util.Map<String, String> kMSEncryptionContext) {
        this.kMSEncryptionContext = kMSEncryptionContext;
        return this;
    }

    /**
     * <p>
     * A map of plain text, non-secret key:value pairs, known as encryption
     * context pairs, that provide an added layer of security for your data.
     * </p>
     * <p>
     * The method adds a new key-value pair into KMSEncryptionContext parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into KMSEncryptionContext.
     * @param value The corresponding value of the entry to be added into
     *            KMSEncryptionContext.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest addKMSEncryptionContextEntry(String key, String value) {
        if (null == this.kMSEncryptionContext) {
            this.kMSEncryptionContext = new java.util.HashMap<String, String>();
        }
        if (this.kMSEncryptionContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.kMSEncryptionContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into KMSEncryptionContext.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public StartTranscriptionJobRequest clearKMSEncryptionContextEntries() {
        this.kMSEncryptionContext = null;
        return this;
    }

    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a
     * transcription job.
     * </p>
     *
     * @return <p>
     *         A <code>Settings</code> object that provides optional settings
     *         for a transcription job.
     *         </p>
     */
    public Settings getSettings() {
        return settings;
    }

    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a
     * transcription job.
     * </p>
     *
     * @param settings <p>
     *            A <code>Settings</code> object that provides optional settings
     *            for a transcription job.
     *            </p>
     */
    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a
     * transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            A <code>Settings</code> object that provides optional settings
     *            for a transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withSettings(Settings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * <p>
     * Choose the custom language model you use for your transcription job in
     * this parameter.
     * </p>
     *
     * @return <p>
     *         Choose the custom language model you use for your transcription
     *         job in this parameter.
     *         </p>
     */
    public ModelSettings getModelSettings() {
        return modelSettings;
    }

    /**
     * <p>
     * Choose the custom language model you use for your transcription job in
     * this parameter.
     * </p>
     *
     * @param modelSettings <p>
     *            Choose the custom language model you use for your
     *            transcription job in this parameter.
     *            </p>
     */
    public void setModelSettings(ModelSettings modelSettings) {
        this.modelSettings = modelSettings;
    }

    /**
     * <p>
     * Choose the custom language model you use for your transcription job in
     * this parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelSettings <p>
     *            Choose the custom language model you use for your
     *            transcription job in this parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withModelSettings(ModelSettings modelSettings) {
        this.modelSettings = modelSettings;
        return this;
    }

    /**
     * <p>
     * Provides information about how a transcription job is executed. Use this
     * field to indicate that the job can be queued for deferred execution if
     * the concurrency limit is reached and there are no slots available to
     * immediately run the job.
     * </p>
     *
     * @return <p>
     *         Provides information about how a transcription job is executed.
     *         Use this field to indicate that the job can be queued for
     *         deferred execution if the concurrency limit is reached and there
     *         are no slots available to immediately run the job.
     *         </p>
     */
    public JobExecutionSettings getJobExecutionSettings() {
        return jobExecutionSettings;
    }

    /**
     * <p>
     * Provides information about how a transcription job is executed. Use this
     * field to indicate that the job can be queued for deferred execution if
     * the concurrency limit is reached and there are no slots available to
     * immediately run the job.
     * </p>
     *
     * @param jobExecutionSettings <p>
     *            Provides information about how a transcription job is
     *            executed. Use this field to indicate that the job can be
     *            queued for deferred execution if the concurrency limit is
     *            reached and there are no slots available to immediately run
     *            the job.
     *            </p>
     */
    public void setJobExecutionSettings(JobExecutionSettings jobExecutionSettings) {
        this.jobExecutionSettings = jobExecutionSettings;
    }

    /**
     * <p>
     * Provides information about how a transcription job is executed. Use this
     * field to indicate that the job can be queued for deferred execution if
     * the concurrency limit is reached and there are no slots available to
     * immediately run the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobExecutionSettings <p>
     *            Provides information about how a transcription job is
     *            executed. Use this field to indicate that the job can be
     *            queued for deferred execution if the concurrency limit is
     *            reached and there are no slots available to immediately run
     *            the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withJobExecutionSettings(
            JobExecutionSettings jobExecutionSettings) {
        this.jobExecutionSettings = jobExecutionSettings;
        return this;
    }

    /**
     * <p>
     * An object that contains the request parameters for content redaction.
     * </p>
     *
     * @return <p>
     *         An object that contains the request parameters for content
     *         redaction.
     *         </p>
     */
    public ContentRedaction getContentRedaction() {
        return contentRedaction;
    }

    /**
     * <p>
     * An object that contains the request parameters for content redaction.
     * </p>
     *
     * @param contentRedaction <p>
     *            An object that contains the request parameters for content
     *            redaction.
     *            </p>
     */
    public void setContentRedaction(ContentRedaction contentRedaction) {
        this.contentRedaction = contentRedaction;
    }

    /**
     * <p>
     * An object that contains the request parameters for content redaction.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentRedaction <p>
     *            An object that contains the request parameters for content
     *            redaction.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withContentRedaction(ContentRedaction contentRedaction) {
        this.contentRedaction = contentRedaction;
        return this;
    }

    /**
     * <p>
     * Set this field to <code>true</code> to enable automatic language
     * identification. Automatic language identification is disabled by default.
     * You receive a <code>BadRequestException</code> error if you enter a value
     * for a <code>LanguageCode</code>.
     * </p>
     *
     * @return <p>
     *         Set this field to <code>true</code> to enable automatic language
     *         identification. Automatic language identification is disabled by
     *         default. You receive a <code>BadRequestException</code> error if
     *         you enter a value for a <code>LanguageCode</code>.
     *         </p>
     */
    public Boolean isIdentifyLanguage() {
        return identifyLanguage;
    }

    /**
     * <p>
     * Set this field to <code>true</code> to enable automatic language
     * identification. Automatic language identification is disabled by default.
     * You receive a <code>BadRequestException</code> error if you enter a value
     * for a <code>LanguageCode</code>.
     * </p>
     *
     * @return <p>
     *         Set this field to <code>true</code> to enable automatic language
     *         identification. Automatic language identification is disabled by
     *         default. You receive a <code>BadRequestException</code> error if
     *         you enter a value for a <code>LanguageCode</code>.
     *         </p>
     */
    public Boolean getIdentifyLanguage() {
        return identifyLanguage;
    }

    /**
     * <p>
     * Set this field to <code>true</code> to enable automatic language
     * identification. Automatic language identification is disabled by default.
     * You receive a <code>BadRequestException</code> error if you enter a value
     * for a <code>LanguageCode</code>.
     * </p>
     *
     * @param identifyLanguage <p>
     *            Set this field to <code>true</code> to enable automatic
     *            language identification. Automatic language identification is
     *            disabled by default. You receive a
     *            <code>BadRequestException</code> error if you enter a value
     *            for a <code>LanguageCode</code>.
     *            </p>
     */
    public void setIdentifyLanguage(Boolean identifyLanguage) {
        this.identifyLanguage = identifyLanguage;
    }

    /**
     * <p>
     * Set this field to <code>true</code> to enable automatic language
     * identification. Automatic language identification is disabled by default.
     * You receive a <code>BadRequestException</code> error if you enter a value
     * for a <code>LanguageCode</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identifyLanguage <p>
     *            Set this field to <code>true</code> to enable automatic
     *            language identification. Automatic language identification is
     *            disabled by default. You receive a
     *            <code>BadRequestException</code> error if you enter a value
     *            for a <code>LanguageCode</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withIdentifyLanguage(Boolean identifyLanguage) {
        this.identifyLanguage = identifyLanguage;
        return this;
    }

    /**
     * <p>
     * An object containing a list of languages that might be present in your
     * collection of audio files. Automatic language identification chooses a
     * language that best matches the source audio from that list.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (ar-SA), your audio or
     * video file must be encoded at a sample rate of 16,000 Hz or higher.
     * </p>
     *
     * @return <p>
     *         An object containing a list of languages that might be present in
     *         your collection of audio files. Automatic language identification
     *         chooses a language that best matches the source audio from that
     *         list.
     *         </p>
     *         <p>
     *         To transcribe speech in Modern Standard Arabic (ar-SA), your
     *         audio or video file must be encoded at a sample rate of 16,000 Hz
     *         or higher.
     *         </p>
     */
    public java.util.List<String> getLanguageOptions() {
        return languageOptions;
    }

    /**
     * <p>
     * An object containing a list of languages that might be present in your
     * collection of audio files. Automatic language identification chooses a
     * language that best matches the source audio from that list.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (ar-SA), your audio or
     * video file must be encoded at a sample rate of 16,000 Hz or higher.
     * </p>
     *
     * @param languageOptions <p>
     *            An object containing a list of languages that might be present
     *            in your collection of audio files. Automatic language
     *            identification chooses a language that best matches the source
     *            audio from that list.
     *            </p>
     *            <p>
     *            To transcribe speech in Modern Standard Arabic (ar-SA), your
     *            audio or video file must be encoded at a sample rate of 16,000
     *            Hz or higher.
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
     * An object containing a list of languages that might be present in your
     * collection of audio files. Automatic language identification chooses a
     * language that best matches the source audio from that list.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (ar-SA), your audio or
     * video file must be encoded at a sample rate of 16,000 Hz or higher.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageOptions <p>
     *            An object containing a list of languages that might be present
     *            in your collection of audio files. Automatic language
     *            identification chooses a language that best matches the source
     *            audio from that list.
     *            </p>
     *            <p>
     *            To transcribe speech in Modern Standard Arabic (ar-SA), your
     *            audio or video file must be encoded at a sample rate of 16,000
     *            Hz or higher.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withLanguageOptions(String... languageOptions) {
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
     * An object containing a list of languages that might be present in your
     * collection of audio files. Automatic language identification chooses a
     * language that best matches the source audio from that list.
     * </p>
     * <p>
     * To transcribe speech in Modern Standard Arabic (ar-SA), your audio or
     * video file must be encoded at a sample rate of 16,000 Hz or higher.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageOptions <p>
     *            An object containing a list of languages that might be present
     *            in your collection of audio files. Automatic language
     *            identification chooses a language that best matches the source
     *            audio from that list.
     *            </p>
     *            <p>
     *            To transcribe speech in Modern Standard Arabic (ar-SA), your
     *            audio or video file must be encoded at a sample rate of 16,000
     *            Hz or higher.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withLanguageOptions(
            java.util.Collection<String> languageOptions) {
        setLanguageOptions(languageOptions);
        return this;
    }

    /**
     * <p>
     * Add subtitles to your batch transcription job.
     * </p>
     *
     * @return <p>
     *         Add subtitles to your batch transcription job.
     *         </p>
     */
    public Subtitles getSubtitles() {
        return subtitles;
    }

    /**
     * <p>
     * Add subtitles to your batch transcription job.
     * </p>
     *
     * @param subtitles <p>
     *            Add subtitles to your batch transcription job.
     *            </p>
     */
    public void setSubtitles(Subtitles subtitles) {
        this.subtitles = subtitles;
    }

    /**
     * <p>
     * Add subtitles to your batch transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subtitles <p>
     *            Add subtitles to your batch transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withSubtitles(Subtitles subtitles) {
        this.subtitles = subtitles;
        return this;
    }

    /**
     * <p>
     * Add tags to an Amazon Transcribe transcription job.
     * </p>
     *
     * @return <p>
     *         Add tags to an Amazon Transcribe transcription job.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Add tags to an Amazon Transcribe transcription job.
     * </p>
     *
     * @param tags <p>
     *            Add tags to an Amazon Transcribe transcription job.
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
     * Add tags to an Amazon Transcribe transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Add tags to an Amazon Transcribe transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withTags(Tag... tags) {
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
     * Add tags to an Amazon Transcribe transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Add tags to an Amazon Transcribe transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The language identification settings associated with your transcription
     * job. These settings include <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>, and <code>LanguageModelName</code>.
     * </p>
     *
     * @return <p>
     *         The language identification settings associated with your
     *         transcription job. These settings include
     *         <code>VocabularyName</code>, <code>VocabularyFilterName</code>,
     *         and <code>LanguageModelName</code>.
     *         </p>
     */
    public java.util.Map<String, LanguageIdSettings> getLanguageIdSettings() {
        return languageIdSettings;
    }

    /**
     * <p>
     * The language identification settings associated with your transcription
     * job. These settings include <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>, and <code>LanguageModelName</code>.
     * </p>
     *
     * @param languageIdSettings <p>
     *            The language identification settings associated with your
     *            transcription job. These settings include
     *            <code>VocabularyName</code>, <code>VocabularyFilterName</code>
     *            , and <code>LanguageModelName</code>.
     *            </p>
     */
    public void setLanguageIdSettings(java.util.Map<String, LanguageIdSettings> languageIdSettings) {
        this.languageIdSettings = languageIdSettings;
    }

    /**
     * <p>
     * The language identification settings associated with your transcription
     * job. These settings include <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>, and <code>LanguageModelName</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageIdSettings <p>
     *            The language identification settings associated with your
     *            transcription job. These settings include
     *            <code>VocabularyName</code>, <code>VocabularyFilterName</code>
     *            , and <code>LanguageModelName</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTranscriptionJobRequest withLanguageIdSettings(
            java.util.Map<String, LanguageIdSettings> languageIdSettings) {
        this.languageIdSettings = languageIdSettings;
        return this;
    }

    /**
     * <p>
     * The language identification settings associated with your transcription
     * job. These settings include <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>, and <code>LanguageModelName</code>.
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
    public StartTranscriptionJobRequest addLanguageIdSettingsEntry(String key,
            LanguageIdSettings value) {
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
    public StartTranscriptionJobRequest clearLanguageIdSettingsEntries() {
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getMediaSampleRateHertz() != null)
            sb.append("MediaSampleRateHertz: " + getMediaSampleRateHertz() + ",");
        if (getMediaFormat() != null)
            sb.append("MediaFormat: " + getMediaFormat() + ",");
        if (getMedia() != null)
            sb.append("Media: " + getMedia() + ",");
        if (getOutputBucketName() != null)
            sb.append("OutputBucketName: " + getOutputBucketName() + ",");
        if (getOutputKey() != null)
            sb.append("OutputKey: " + getOutputKey() + ",");
        if (getOutputEncryptionKMSKeyId() != null)
            sb.append("OutputEncryptionKMSKeyId: " + getOutputEncryptionKMSKeyId() + ",");
        if (getKMSEncryptionContext() != null)
            sb.append("KMSEncryptionContext: " + getKMSEncryptionContext() + ",");
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
        if (getSubtitles() != null)
            sb.append("Subtitles: " + getSubtitles() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
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
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getMediaSampleRateHertz() == null) ? 0 : getMediaSampleRateHertz().hashCode());
        hashCode = prime * hashCode
                + ((getMediaFormat() == null) ? 0 : getMediaFormat().hashCode());
        hashCode = prime * hashCode + ((getMedia() == null) ? 0 : getMedia().hashCode());
        hashCode = prime * hashCode
                + ((getOutputBucketName() == null) ? 0 : getOutputBucketName().hashCode());
        hashCode = prime * hashCode + ((getOutputKey() == null) ? 0 : getOutputKey().hashCode());
        hashCode = prime
                * hashCode
                + ((getOutputEncryptionKMSKeyId() == null) ? 0 : getOutputEncryptionKMSKeyId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getKMSEncryptionContext() == null) ? 0 : getKMSEncryptionContext().hashCode());
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
        hashCode = prime * hashCode + ((getSubtitles() == null) ? 0 : getSubtitles().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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

        if (obj instanceof StartTranscriptionJobRequest == false)
            return false;
        StartTranscriptionJobRequest other = (StartTranscriptionJobRequest) obj;

        if (other.getTranscriptionJobName() == null ^ this.getTranscriptionJobName() == null)
            return false;
        if (other.getTranscriptionJobName() != null
                && other.getTranscriptionJobName().equals(this.getTranscriptionJobName()) == false)
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
        if (other.getOutputBucketName() == null ^ this.getOutputBucketName() == null)
            return false;
        if (other.getOutputBucketName() != null
                && other.getOutputBucketName().equals(this.getOutputBucketName()) == false)
            return false;
        if (other.getOutputKey() == null ^ this.getOutputKey() == null)
            return false;
        if (other.getOutputKey() != null
                && other.getOutputKey().equals(this.getOutputKey()) == false)
            return false;
        if (other.getOutputEncryptionKMSKeyId() == null
                ^ this.getOutputEncryptionKMSKeyId() == null)
            return false;
        if (other.getOutputEncryptionKMSKeyId() != null
                && other.getOutputEncryptionKMSKeyId().equals(this.getOutputEncryptionKMSKeyId()) == false)
            return false;
        if (other.getKMSEncryptionContext() == null ^ this.getKMSEncryptionContext() == null)
            return false;
        if (other.getKMSEncryptionContext() != null
                && other.getKMSEncryptionContext().equals(this.getKMSEncryptionContext()) == false)
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
        if (other.getSubtitles() == null ^ this.getSubtitles() == null)
            return false;
        if (other.getSubtitles() != null
                && other.getSubtitles().equals(this.getSubtitles()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getLanguageIdSettings() == null ^ this.getLanguageIdSettings() == null)
            return false;
        if (other.getLanguageIdSettings() != null
                && other.getLanguageIdSettings().equals(this.getLanguageIdSettings()) == false)
            return false;
        return true;
    }
}
