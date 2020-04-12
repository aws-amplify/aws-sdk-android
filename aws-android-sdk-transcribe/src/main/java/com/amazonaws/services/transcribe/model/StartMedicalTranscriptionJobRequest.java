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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Start a batch job to transcribe medical speech to text.
 * </p>
 */
public class StartMedicalTranscriptionJobRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the medical transcription job. You can't use the strings "."
     * or ".." by themselves as the job name. The name must also be unique
     * within an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String medicalTranscriptionJobName;

    /**
     * <p>
     * The language code for the language spoken in the input media file. US
     * English (en-US) is the valid value for medical transcription jobs. Any
     * other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR, it-IT, ko-KR, es-ES, en-IN, hi-IN, ar-SA, ru-RU, zh-CN, nl-NL,
     * id-ID, ta-IN, fa-IR, en-IE, en-AB, en-WL, pt-PT, te-IN, tr-TR, de-CH,
     * he-IL, ms-MY, ja-JP, ar-AE
     */
    private String languageCode;

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * <p>
     * If you do not specify the media sample rate, Amazon Transcribe Medical
     * determines the sample rate. If you specify the sample rate, it must match
     * the rate detected by Amazon Transcribe Medical. In most cases, you should
     * leave the <code>MediaSampleRateHertz</code> field blank and let Amazon
     * Transcribe Medical determine the sample rate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>8000 - 48000<br/>
     */
    private Integer mediaSampleRateHertz;

    /**
     * <p>
     * The audio format of the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac
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
     * The Amazon S3 location where the transcription is stored.
     * </p>
     * <p>
     * You must set <code>OutputBucketName</code> for Amazon Transcribe Medical
     * to store the transcription results. Your transcript appears in the S3
     * location you specify. When you call the
     * <a>GetMedicalTranscriptionJob</a>, the operation returns this location in
     * the <code>TranscriptFileUri</code> field. The S3 bucket must have
     * permissions that allow Amazon Transcribe Medical to put files in the
     * bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * You can specify an AWS Key Management Service (KMS) key to encrypt the
     * output of your transcription using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a
     * KMS key, Amazon Transcribe Medical uses the default Amazon S3 key for
     * server-side encryption of transcripts that are placed in your S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]<br/>
     */
    private String outputBucketName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS)
     * key used to encrypt the output of the transcription job. The user calling
     * the <a>StartMedicalTranscriptionJob</a> operation must have permission to
     * use the specified KMS key.
     * </p>
     * <p>
     * You use either of the following to identify a KMS key in the current
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
     * Amazon Resource Name (ARN) of a KMS key in the current account or another
     * account:
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias:
     * "arn:aws:kms:region:account ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the medical
     * transcription job is encrypted with the default Amazon S3 key (SSE-S3).
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
     * Optional settings for the medical transcription job.
     * </p>
     */
    private MedicalTranscriptionSetting settings;

    /**
     * <p>
     * The medical specialty of any clinician speaking in the input media.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     */
    private String specialty;

    /**
     * <p>
     * The speech of clinician in the input audio. <code>CONVERSATION</code>
     * refers to conversations clinicians have with patients.
     * <code>DICTATION</code> refers to medical professionals dictating their
     * notes about a patient encounter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     */
    private String type;

    /**
     * <p>
     * The name of the medical transcription job. You can't use the strings "."
     * or ".." by themselves as the job name. The name must also be unique
     * within an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the medical transcription job. You can't use the
     *         strings "." or ".." by themselves as the job name. The name must
     *         also be unique within an AWS account.
     *         </p>
     */
    public String getMedicalTranscriptionJobName() {
        return medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name of the medical transcription job. You can't use the strings "."
     * or ".." by themselves as the job name. The name must also be unique
     * within an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param medicalTranscriptionJobName <p>
     *            The name of the medical transcription job. You can't use the
     *            strings "." or ".." by themselves as the job name. The name
     *            must also be unique within an AWS account.
     *            </p>
     */
    public void setMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        this.medicalTranscriptionJobName = medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name of the medical transcription job. You can't use the strings "."
     * or ".." by themselves as the job name. The name must also be unique
     * within an AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param medicalTranscriptionJobName <p>
     *            The name of the medical transcription job. You can't use the
     *            strings "." or ".." by themselves as the job name. The name
     *            must also be unique within an AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMedicalTranscriptionJobRequest withMedicalTranscriptionJobName(
            String medicalTranscriptionJobName) {
        this.medicalTranscriptionJobName = medicalTranscriptionJobName;
        return this;
    }

    /**
     * <p>
     * The language code for the language spoken in the input media file. US
     * English (en-US) is the valid value for medical transcription jobs. Any
     * other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR, it-IT, ko-KR, es-ES, en-IN, hi-IN, ar-SA, ru-RU, zh-CN, nl-NL,
     * id-ID, ta-IN, fa-IR, en-IE, en-AB, en-WL, pt-PT, te-IN, tr-TR, de-CH,
     * he-IL, ms-MY, ja-JP, ar-AE
     *
     * @return <p>
     *         The language code for the language spoken in the input media
     *         file. US English (en-US) is the valid value for medical
     *         transcription jobs. Any other value you enter for language code
     *         results in a <code>BadRequestException</code> error.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code for the language spoken in the input media file. US
     * English (en-US) is the valid value for medical transcription jobs. Any
     * other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR, it-IT, ko-KR, es-ES, en-IN, hi-IN, ar-SA, ru-RU, zh-CN, nl-NL,
     * id-ID, ta-IN, fa-IR, en-IE, en-AB, en-WL, pt-PT, te-IN, tr-TR, de-CH,
     * he-IL, ms-MY, ja-JP, ar-AE
     *
     * @param languageCode <p>
     *            The language code for the language spoken in the input media
     *            file. US English (en-US) is the valid value for medical
     *            transcription jobs. Any other value you enter for language
     *            code results in a <code>BadRequestException</code> error.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code for the language spoken in the input media file. US
     * English (en-US) is the valid value for medical transcription jobs. Any
     * other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR, it-IT, ko-KR, es-ES, en-IN, hi-IN, ar-SA, ru-RU, zh-CN, nl-NL,
     * id-ID, ta-IN, fa-IR, en-IE, en-AB, en-WL, pt-PT, te-IN, tr-TR, de-CH,
     * he-IL, ms-MY, ja-JP, ar-AE
     *
     * @param languageCode <p>
     *            The language code for the language spoken in the input media
     *            file. US English (en-US) is the valid value for medical
     *            transcription jobs. Any other value you enter for language
     *            code results in a <code>BadRequestException</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public StartMedicalTranscriptionJobRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code for the language spoken in the input media file. US
     * English (en-US) is the valid value for medical transcription jobs. Any
     * other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR, it-IT, ko-KR, es-ES, en-IN, hi-IN, ar-SA, ru-RU, zh-CN, nl-NL,
     * id-ID, ta-IN, fa-IR, en-IE, en-AB, en-WL, pt-PT, te-IN, tr-TR, de-CH,
     * he-IL, ms-MY, ja-JP, ar-AE
     *
     * @param languageCode <p>
     *            The language code for the language spoken in the input media
     *            file. US English (en-US) is the valid value for medical
     *            transcription jobs. Any other value you enter for language
     *            code results in a <code>BadRequestException</code> error.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code for the language spoken in the input media file. US
     * English (en-US) is the valid value for medical transcription jobs. Any
     * other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, es-US, en-AU, fr-CA, en-GB, de-DE, pt-BR,
     * fr-FR, it-IT, ko-KR, es-ES, en-IN, hi-IN, ar-SA, ru-RU, zh-CN, nl-NL,
     * id-ID, ta-IN, fa-IR, en-IE, en-AB, en-WL, pt-PT, te-IN, tr-TR, de-CH,
     * he-IL, ms-MY, ja-JP, ar-AE
     *
     * @param languageCode <p>
     *            The language code for the language spoken in the input media
     *            file. US English (en-US) is the valid value for medical
     *            transcription jobs. Any other value you enter for language
     *            code results in a <code>BadRequestException</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public StartMedicalTranscriptionJobRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * <p>
     * If you do not specify the media sample rate, Amazon Transcribe Medical
     * determines the sample rate. If you specify the sample rate, it must match
     * the rate detected by Amazon Transcribe Medical. In most cases, you should
     * leave the <code>MediaSampleRateHertz</code> field blank and let Amazon
     * Transcribe Medical determine the sample rate.
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
     *         Medical determines the sample rate. If you specify the sample
     *         rate, it must match the rate detected by Amazon Transcribe
     *         Medical. In most cases, you should leave the
     *         <code>MediaSampleRateHertz</code> field blank and let Amazon
     *         Transcribe Medical determine the sample rate.
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
     * If you do not specify the media sample rate, Amazon Transcribe Medical
     * determines the sample rate. If you specify the sample rate, it must match
     * the rate detected by Amazon Transcribe Medical. In most cases, you should
     * leave the <code>MediaSampleRateHertz</code> field blank and let Amazon
     * Transcribe Medical determine the sample rate.
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
     *            Medical determines the sample rate. If you specify the sample
     *            rate, it must match the rate detected by Amazon Transcribe
     *            Medical. In most cases, you should leave the
     *            <code>MediaSampleRateHertz</code> field blank and let Amazon
     *            Transcribe Medical determine the sample rate.
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
     * If you do not specify the media sample rate, Amazon Transcribe Medical
     * determines the sample rate. If you specify the sample rate, it must match
     * the rate detected by Amazon Transcribe Medical. In most cases, you should
     * leave the <code>MediaSampleRateHertz</code> field blank and let Amazon
     * Transcribe Medical determine the sample rate.
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
     *            Medical determines the sample rate. If you specify the sample
     *            rate, it must match the rate detected by Amazon Transcribe
     *            Medical. In most cases, you should leave the
     *            <code>MediaSampleRateHertz</code> field blank and let Amazon
     *            Transcribe Medical determine the sample rate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMedicalTranscriptionJobRequest withMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
        return this;
    }

    /**
     * <p>
     * The audio format of the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac
     *
     * @return <p>
     *         The audio format of the input media file.
     *         </p>
     * @see MediaFormat
     */
    public String getMediaFormat() {
        return mediaFormat;
    }

    /**
     * <p>
     * The audio format of the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac
     *
     * @param mediaFormat <p>
     *            The audio format of the input media file.
     *            </p>
     * @see MediaFormat
     */
    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    /**
     * <p>
     * The audio format of the input media file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac
     *
     * @param mediaFormat <p>
     *            The audio format of the input media file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MediaFormat
     */
    public StartMedicalTranscriptionJobRequest withMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
        return this;
    }

    /**
     * <p>
     * The audio format of the input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac
     *
     * @param mediaFormat <p>
     *            The audio format of the input media file.
     *            </p>
     * @see MediaFormat
     */
    public void setMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat.toString();
    }

    /**
     * <p>
     * The audio format of the input media file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac
     *
     * @param mediaFormat <p>
     *            The audio format of the input media file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MediaFormat
     */
    public StartMedicalTranscriptionJobRequest withMediaFormat(MediaFormat mediaFormat) {
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
    public StartMedicalTranscriptionJobRequest withMedia(Media media) {
        this.media = media;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location where the transcription is stored.
     * </p>
     * <p>
     * You must set <code>OutputBucketName</code> for Amazon Transcribe Medical
     * to store the transcription results. Your transcript appears in the S3
     * location you specify. When you call the
     * <a>GetMedicalTranscriptionJob</a>, the operation returns this location in
     * the <code>TranscriptFileUri</code> field. The S3 bucket must have
     * permissions that allow Amazon Transcribe Medical to put files in the
     * bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * You can specify an AWS Key Management Service (KMS) key to encrypt the
     * output of your transcription using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a
     * KMS key, Amazon Transcribe Medical uses the default Amazon S3 key for
     * server-side encryption of transcripts that are placed in your S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]<br/>
     *
     * @return <p>
     *         The Amazon S3 location where the transcription is stored.
     *         </p>
     *         <p>
     *         You must set <code>OutputBucketName</code> for Amazon Transcribe
     *         Medical to store the transcription results. Your transcript
     *         appears in the S3 location you specify. When you call the
     *         <a>GetMedicalTranscriptionJob</a>, the operation returns this
     *         location in the <code>TranscriptFileUri</code> field. The S3
     *         bucket must have permissions that allow Amazon Transcribe Medical
     *         to put files in the bucket. For more information, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *         >Permissions Required for IAM User Roles</a>.
     *         </p>
     *         <p>
     *         You can specify an AWS Key Management Service (KMS) key to
     *         encrypt the output of your transcription using the
     *         <code>OutputEncryptionKMSKeyId</code> parameter. If you don't
     *         specify a KMS key, Amazon Transcribe Medical uses the default
     *         Amazon S3 key for server-side encryption of transcripts that are
     *         placed in your S3 bucket.
     *         </p>
     */
    public String getOutputBucketName() {
        return outputBucketName;
    }

    /**
     * <p>
     * The Amazon S3 location where the transcription is stored.
     * </p>
     * <p>
     * You must set <code>OutputBucketName</code> for Amazon Transcribe Medical
     * to store the transcription results. Your transcript appears in the S3
     * location you specify. When you call the
     * <a>GetMedicalTranscriptionJob</a>, the operation returns this location in
     * the <code>TranscriptFileUri</code> field. The S3 bucket must have
     * permissions that allow Amazon Transcribe Medical to put files in the
     * bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * You can specify an AWS Key Management Service (KMS) key to encrypt the
     * output of your transcription using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a
     * KMS key, Amazon Transcribe Medical uses the default Amazon S3 key for
     * server-side encryption of transcripts that are placed in your S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]<br/>
     *
     * @param outputBucketName <p>
     *            The Amazon S3 location where the transcription is stored.
     *            </p>
     *            <p>
     *            You must set <code>OutputBucketName</code> for Amazon
     *            Transcribe Medical to store the transcription results. Your
     *            transcript appears in the S3 location you specify. When you
     *            call the <a>GetMedicalTranscriptionJob</a>, the operation
     *            returns this location in the <code>TranscriptFileUri</code>
     *            field. The S3 bucket must have permissions that allow Amazon
     *            Transcribe Medical to put files in the bucket. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *            >Permissions Required for IAM User Roles</a>.
     *            </p>
     *            <p>
     *            You can specify an AWS Key Management Service (KMS) key to
     *            encrypt the output of your transcription using the
     *            <code>OutputEncryptionKMSKeyId</code> parameter. If you don't
     *            specify a KMS key, Amazon Transcribe Medical uses the default
     *            Amazon S3 key for server-side encryption of transcripts that
     *            are placed in your S3 bucket.
     *            </p>
     */
    public void setOutputBucketName(String outputBucketName) {
        this.outputBucketName = outputBucketName;
    }

    /**
     * <p>
     * The Amazon S3 location where the transcription is stored.
     * </p>
     * <p>
     * You must set <code>OutputBucketName</code> for Amazon Transcribe Medical
     * to store the transcription results. Your transcript appears in the S3
     * location you specify. When you call the
     * <a>GetMedicalTranscriptionJob</a>, the operation returns this location in
     * the <code>TranscriptFileUri</code> field. The S3 bucket must have
     * permissions that allow Amazon Transcribe Medical to put files in the
     * bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * You can specify an AWS Key Management Service (KMS) key to encrypt the
     * output of your transcription using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a
     * KMS key, Amazon Transcribe Medical uses the default Amazon S3 key for
     * server-side encryption of transcripts that are placed in your S3 bucket.
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
     *            The Amazon S3 location where the transcription is stored.
     *            </p>
     *            <p>
     *            You must set <code>OutputBucketName</code> for Amazon
     *            Transcribe Medical to store the transcription results. Your
     *            transcript appears in the S3 location you specify. When you
     *            call the <a>GetMedicalTranscriptionJob</a>, the operation
     *            returns this location in the <code>TranscriptFileUri</code>
     *            field. The S3 bucket must have permissions that allow Amazon
     *            Transcribe Medical to put files in the bucket. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *            >Permissions Required for IAM User Roles</a>.
     *            </p>
     *            <p>
     *            You can specify an AWS Key Management Service (KMS) key to
     *            encrypt the output of your transcription using the
     *            <code>OutputEncryptionKMSKeyId</code> parameter. If you don't
     *            specify a KMS key, Amazon Transcribe Medical uses the default
     *            Amazon S3 key for server-side encryption of transcripts that
     *            are placed in your S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMedicalTranscriptionJobRequest withOutputBucketName(String outputBucketName) {
        this.outputBucketName = outputBucketName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS)
     * key used to encrypt the output of the transcription job. The user calling
     * the <a>StartMedicalTranscriptionJob</a> operation must have permission to
     * use the specified KMS key.
     * </p>
     * <p>
     * You use either of the following to identify a KMS key in the current
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
     * Amazon Resource Name (ARN) of a KMS key in the current account or another
     * account:
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias:
     * "arn:aws:kms:region:account ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the medical
     * transcription job is encrypted with the default Amazon S3 key (SSE-S3).
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
     *         The Amazon Resource Name (ARN) of the AWS Key Management Service
     *         (KMS) key used to encrypt the output of the transcription job.
     *         The user calling the <a>StartMedicalTranscriptionJob</a>
     *         operation must have permission to use the specified KMS key.
     *         </p>
     *         <p>
     *         You use either of the following to identify a KMS key in the
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
     *         Amazon Resource Name (ARN) of a KMS key in the current account or
     *         another account:
     *         "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN of a KMS Key Alias:
     *         "arn:aws:kms:region:account ID:alias/ExampleAlias"
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify an encryption key, the output of the medical
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
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS)
     * key used to encrypt the output of the transcription job. The user calling
     * the <a>StartMedicalTranscriptionJob</a> operation must have permission to
     * use the specified KMS key.
     * </p>
     * <p>
     * You use either of the following to identify a KMS key in the current
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
     * Amazon Resource Name (ARN) of a KMS key in the current account or another
     * account:
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias:
     * "arn:aws:kms:region:account ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the medical
     * transcription job is encrypted with the default Amazon S3 key (SSE-S3).
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
     *            The Amazon Resource Name (ARN) of the AWS Key Management
     *            Service (KMS) key used to encrypt the output of the
     *            transcription job. The user calling the
     *            <a>StartMedicalTranscriptionJob</a> operation must have
     *            permission to use the specified KMS key.
     *            </p>
     *            <p>
     *            You use either of the following to identify a KMS key in the
     *            current account:
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
     *            Amazon Resource Name (ARN) of a KMS key in the current account
     *            or another account:
     *            "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARN of a KMS Key Alias:
     *            "arn:aws:kms:region:account ID:alias/ExampleAlias"
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify an encryption key, the output of the
     *            medical transcription job is encrypted with the default Amazon
     *            S3 key (SSE-S3).
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
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS)
     * key used to encrypt the output of the transcription job. The user calling
     * the <a>StartMedicalTranscriptionJob</a> operation must have permission to
     * use the specified KMS key.
     * </p>
     * <p>
     * You use either of the following to identify a KMS key in the current
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
     * Amazon Resource Name (ARN) of a KMS key in the current account or another
     * account:
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias:
     * "arn:aws:kms:region:account ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the medical
     * transcription job is encrypted with the default Amazon S3 key (SSE-S3).
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
     *            The Amazon Resource Name (ARN) of the AWS Key Management
     *            Service (KMS) key used to encrypt the output of the
     *            transcription job. The user calling the
     *            <a>StartMedicalTranscriptionJob</a> operation must have
     *            permission to use the specified KMS key.
     *            </p>
     *            <p>
     *            You use either of the following to identify a KMS key in the
     *            current account:
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
     *            Amazon Resource Name (ARN) of a KMS key in the current account
     *            or another account:
     *            "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARN of a KMS Key Alias:
     *            "arn:aws:kms:region:account ID:alias/ExampleAlias"
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify an encryption key, the output of the
     *            medical transcription job is encrypted with the default Amazon
     *            S3 key (SSE-S3).
     *            </p>
     *            <p>
     *            If you specify a KMS key to encrypt your output, you must also
     *            specify an output location in the
     *            <code>OutputBucketName</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMedicalTranscriptionJobRequest withOutputEncryptionKMSKeyId(
            String outputEncryptionKMSKeyId) {
        this.outputEncryptionKMSKeyId = outputEncryptionKMSKeyId;
        return this;
    }

    /**
     * <p>
     * Optional settings for the medical transcription job.
     * </p>
     *
     * @return <p>
     *         Optional settings for the medical transcription job.
     *         </p>
     */
    public MedicalTranscriptionSetting getSettings() {
        return settings;
    }

    /**
     * <p>
     * Optional settings for the medical transcription job.
     * </p>
     *
     * @param settings <p>
     *            Optional settings for the medical transcription job.
     *            </p>
     */
    public void setSettings(MedicalTranscriptionSetting settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Optional settings for the medical transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            Optional settings for the medical transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMedicalTranscriptionJobRequest withSettings(MedicalTranscriptionSetting settings) {
        this.settings = settings;
        return this;
    }

    /**
     * <p>
     * The medical specialty of any clinician speaking in the input media.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     *
     * @return <p>
     *         The medical specialty of any clinician speaking in the input
     *         media.
     *         </p>
     * @see Specialty
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * <p>
     * The medical specialty of any clinician speaking in the input media.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     *
     * @param specialty <p>
     *            The medical specialty of any clinician speaking in the input
     *            media.
     *            </p>
     * @see Specialty
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * <p>
     * The medical specialty of any clinician speaking in the input media.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     *
     * @param specialty <p>
     *            The medical specialty of any clinician speaking in the input
     *            media.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Specialty
     */
    public StartMedicalTranscriptionJobRequest withSpecialty(String specialty) {
        this.specialty = specialty;
        return this;
    }

    /**
     * <p>
     * The medical specialty of any clinician speaking in the input media.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     *
     * @param specialty <p>
     *            The medical specialty of any clinician speaking in the input
     *            media.
     *            </p>
     * @see Specialty
     */
    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty.toString();
    }

    /**
     * <p>
     * The medical specialty of any clinician speaking in the input media.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     *
     * @param specialty <p>
     *            The medical specialty of any clinician speaking in the input
     *            media.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Specialty
     */
    public StartMedicalTranscriptionJobRequest withSpecialty(Specialty specialty) {
        this.specialty = specialty.toString();
        return this;
    }

    /**
     * <p>
     * The speech of clinician in the input audio. <code>CONVERSATION</code>
     * refers to conversations clinicians have with patients.
     * <code>DICTATION</code> refers to medical professionals dictating their
     * notes about a patient encounter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @return <p>
     *         The speech of clinician in the input audio.
     *         <code>CONVERSATION</code> refers to conversations clinicians have
     *         with patients. <code>DICTATION</code> refers to medical
     *         professionals dictating their notes about a patient encounter.
     *         </p>
     * @see Type
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The speech of clinician in the input audio. <code>CONVERSATION</code>
     * refers to conversations clinicians have with patients.
     * <code>DICTATION</code> refers to medical professionals dictating their
     * notes about a patient encounter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            The speech of clinician in the input audio.
     *            <code>CONVERSATION</code> refers to conversations clinicians
     *            have with patients. <code>DICTATION</code> refers to medical
     *            professionals dictating their notes about a patient encounter.
     *            </p>
     * @see Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The speech of clinician in the input audio. <code>CONVERSATION</code>
     * refers to conversations clinicians have with patients.
     * <code>DICTATION</code> refers to medical professionals dictating their
     * notes about a patient encounter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            The speech of clinician in the input audio.
     *            <code>CONVERSATION</code> refers to conversations clinicians
     *            have with patients. <code>DICTATION</code> refers to medical
     *            professionals dictating their notes about a patient encounter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public StartMedicalTranscriptionJobRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The speech of clinician in the input audio. <code>CONVERSATION</code>
     * refers to conversations clinicians have with patients.
     * <code>DICTATION</code> refers to medical professionals dictating their
     * notes about a patient encounter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            The speech of clinician in the input audio.
     *            <code>CONVERSATION</code> refers to conversations clinicians
     *            have with patients. <code>DICTATION</code> refers to medical
     *            professionals dictating their notes about a patient encounter.
     *            </p>
     * @see Type
     */
    public void setType(Type type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The speech of clinician in the input audio. <code>CONVERSATION</code>
     * refers to conversations clinicians have with patients.
     * <code>DICTATION</code> refers to medical professionals dictating their
     * notes about a patient encounter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            The speech of clinician in the input audio.
     *            <code>CONVERSATION</code> refers to conversations clinicians
     *            have with patients. <code>DICTATION</code> refers to medical
     *            professionals dictating their notes about a patient encounter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public StartMedicalTranscriptionJobRequest withType(Type type) {
        this.type = type.toString();
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
        if (getMedicalTranscriptionJobName() != null)
            sb.append("MedicalTranscriptionJobName: " + getMedicalTranscriptionJobName() + ",");
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
        if (getOutputEncryptionKMSKeyId() != null)
            sb.append("OutputEncryptionKMSKeyId: " + getOutputEncryptionKMSKeyId() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings() + ",");
        if (getSpecialty() != null)
            sb.append("Specialty: " + getSpecialty() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMedicalTranscriptionJobName() == null) ? 0
                        : getMedicalTranscriptionJobName().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getMediaSampleRateHertz() == null) ? 0 : getMediaSampleRateHertz().hashCode());
        hashCode = prime * hashCode
                + ((getMediaFormat() == null) ? 0 : getMediaFormat().hashCode());
        hashCode = prime * hashCode + ((getMedia() == null) ? 0 : getMedia().hashCode());
        hashCode = prime * hashCode
                + ((getOutputBucketName() == null) ? 0 : getOutputBucketName().hashCode());
        hashCode = prime
                * hashCode
                + ((getOutputEncryptionKMSKeyId() == null) ? 0 : getOutputEncryptionKMSKeyId()
                        .hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getSpecialty() == null) ? 0 : getSpecialty().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMedicalTranscriptionJobRequest == false)
            return false;
        StartMedicalTranscriptionJobRequest other = (StartMedicalTranscriptionJobRequest) obj;

        if (other.getMedicalTranscriptionJobName() == null
                ^ this.getMedicalTranscriptionJobName() == null)
            return false;
        if (other.getMedicalTranscriptionJobName() != null
                && other.getMedicalTranscriptionJobName().equals(
                        this.getMedicalTranscriptionJobName()) == false)
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
        if (other.getOutputEncryptionKMSKeyId() == null
                ^ this.getOutputEncryptionKMSKeyId() == null)
            return false;
        if (other.getOutputEncryptionKMSKeyId() != null
                && other.getOutputEncryptionKMSKeyId().equals(this.getOutputEncryptionKMSKeyId()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getSpecialty() == null ^ this.getSpecialty() == null)
            return false;
        if (other.getSpecialty() != null
                && other.getSpecialty().equals(this.getSpecialty()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
