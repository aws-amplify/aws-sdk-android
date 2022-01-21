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
 * Starts a batch job to transcribe medical speech to text.
 * </p>
 */
public class StartMedicalTranscriptionJobRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the medical transcription job. You can't use the strings "
     * <code>.</code>" or "<code>..</code>" by themselves as the job name. The
     * name must also be unique within an Amazon Web Services account. If you
     * try to create a medical transcription job with the same name as a
     * previous medical transcription job, you get a
     * <code>ConflictException</code> error.
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
     * You can specify an Amazon Web Services Key Management Service (KMS) key
     * to encrypt the output of your transcription using the
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
     * You can specify a location in an Amazon S3 bucket to store the output of
     * your medical transcription job.
     * </p>
     * <p>
     * If you don't specify an output key, Amazon Transcribe Medical stores the
     * output of your transcription job in the Amazon S3 bucket you specified.
     * By default, the object key is "your-transcription-job-name.json".
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
     * The user calling the <a>StartMedicalTranscriptionJob</a> operation must
     * have permission to use the specified KMS key.
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
     * "arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
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
     * A map of plain text, non-secret key:value pairs, known as encryption
     * context pairs, that provide an added layer of security for your data.
     * </p>
     */
    private java.util.Map<String, String> kMSEncryptionContext;

    /**
     * <p>
     * Optional settings for the medical transcription job.
     * </p>
     */
    private MedicalTranscriptionSetting settings;

    /**
     * <p>
     * You can configure Amazon Transcribe Medical to label content in the
     * transcription output. If you specify <code>PHI</code>, Amazon Transcribe
     * Medical labels the personal health information (PHI) that it identifies
     * in the transcription output.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     */
    private String contentIdentificationType;

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
     * The type of speech in the input audio. <code>CONVERSATION</code> refers
     * to conversations between two or more speakers, e.g., a conversations
     * between doctors and patients. <code>DICTATION</code> refers to
     * single-speaker dictated speech, such as clinical notes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     */
    private String type;

    /**
     * <p>
     * Add tags to an Amazon Transcribe medical transcription job.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the medical transcription job. You can't use the strings "
     * <code>.</code>" or "<code>..</code>" by themselves as the job name. The
     * name must also be unique within an Amazon Web Services account. If you
     * try to create a medical transcription job with the same name as a
     * previous medical transcription job, you get a
     * <code>ConflictException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the medical transcription job. You can't use the
     *         strings "<code>.</code>" or "<code>..</code>" by themselves as
     *         the job name. The name must also be unique within an Amazon Web
     *         Services account. If you try to create a medical transcription
     *         job with the same name as a previous medical transcription job,
     *         you get a <code>ConflictException</code> error.
     *         </p>
     */
    public String getMedicalTranscriptionJobName() {
        return medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name of the medical transcription job. You can't use the strings "
     * <code>.</code>" or "<code>..</code>" by themselves as the job name. The
     * name must also be unique within an Amazon Web Services account. If you
     * try to create a medical transcription job with the same name as a
     * previous medical transcription job, you get a
     * <code>ConflictException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param medicalTranscriptionJobName <p>
     *            The name of the medical transcription job. You can't use the
     *            strings "<code>.</code>" or "<code>..</code>" by themselves as
     *            the job name. The name must also be unique within an Amazon
     *            Web Services account. If you try to create a medical
     *            transcription job with the same name as a previous medical
     *            transcription job, you get a <code>ConflictException</code>
     *            error.
     *            </p>
     */
    public void setMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        this.medicalTranscriptionJobName = medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name of the medical transcription job. You can't use the strings "
     * <code>.</code>" or "<code>..</code>" by themselves as the job name. The
     * name must also be unique within an Amazon Web Services account. If you
     * try to create a medical transcription job with the same name as a
     * previous medical transcription job, you get a
     * <code>ConflictException</code> error.
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
     *            strings "<code>.</code>" or "<code>..</code>" by themselves as
     *            the job name. The name must also be unique within an Amazon
     *            Web Services account. If you try to create a medical
     *            transcription job with the same name as a previous medical
     *            transcription job, you get a <code>ConflictException</code>
     *            error.
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
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW,
     * th-TH, en-ZA, en-NZ
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
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW,
     * th-TH, en-ZA, en-NZ
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
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW,
     * th-TH, en-ZA, en-NZ
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
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW,
     * th-TH, en-ZA, en-NZ
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
     * <b>Allowed Values: </b>af-ZA, ar-AE, ar-SA, cy-GB, da-DK, de-CH, de-DE,
     * en-AB, en-AU, en-GB, en-IE, en-IN, en-US, en-WL, es-ES, es-US, fa-IR,
     * fr-CA, fr-FR, ga-IE, gd-GB, he-IL, hi-IN, id-ID, it-IT, ja-JP, ko-KR,
     * ms-MY, nl-NL, pt-BR, pt-PT, ru-RU, ta-IN, te-IN, tr-TR, zh-CN, zh-TW,
     * th-TH, en-ZA, en-NZ
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
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
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
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
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
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
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
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
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
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
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
     * You can specify an Amazon Web Services Key Management Service (KMS) key
     * to encrypt the output of your transcription using the
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
     *         You can specify an Amazon Web Services Key Management Service
     *         (KMS) key to encrypt the output of your transcription using the
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
     * You can specify an Amazon Web Services Key Management Service (KMS) key
     * to encrypt the output of your transcription using the
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
     *            You can specify an Amazon Web Services Key Management Service
     *            (KMS) key to encrypt the output of your transcription using
     *            the <code>OutputEncryptionKMSKeyId</code> parameter. If you
     *            don't specify a KMS key, Amazon Transcribe Medical uses the
     *            default Amazon S3 key for server-side encryption of
     *            transcripts that are placed in your S3 bucket.
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
     * You can specify an Amazon Web Services Key Management Service (KMS) key
     * to encrypt the output of your transcription using the
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
     *            You can specify an Amazon Web Services Key Management Service
     *            (KMS) key to encrypt the output of your transcription using
     *            the <code>OutputEncryptionKMSKeyId</code> parameter. If you
     *            don't specify a KMS key, Amazon Transcribe Medical uses the
     *            default Amazon S3 key for server-side encryption of
     *            transcripts that are placed in your S3 bucket.
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
     * You can specify a location in an Amazon S3 bucket to store the output of
     * your medical transcription job.
     * </p>
     * <p>
     * If you don't specify an output key, Amazon Transcribe Medical stores the
     * output of your transcription job in the Amazon S3 bucket you specified.
     * By default, the object key is "your-transcription-job-name.json".
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
     *         output of your medical transcription job.
     *         </p>
     *         <p>
     *         If you don't specify an output key, Amazon Transcribe Medical
     *         stores the output of your transcription job in the Amazon S3
     *         bucket you specified. By default, the object key is
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
     * your medical transcription job.
     * </p>
     * <p>
     * If you don't specify an output key, Amazon Transcribe Medical stores the
     * output of your transcription job in the Amazon S3 bucket you specified.
     * By default, the object key is "your-transcription-job-name.json".
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
     *            output of your medical transcription job.
     *            </p>
     *            <p>
     *            If you don't specify an output key, Amazon Transcribe Medical
     *            stores the output of your transcription job in the Amazon S3
     *            bucket you specified. By default, the object key is
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
     * your medical transcription job.
     * </p>
     * <p>
     * If you don't specify an output key, Amazon Transcribe Medical stores the
     * output of your transcription job in the Amazon S3 bucket you specified.
     * By default, the object key is "your-transcription-job-name.json".
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
     *            output of your medical transcription job.
     *            </p>
     *            <p>
     *            If you don't specify an output key, Amazon Transcribe Medical
     *            stores the output of your transcription job in the Amazon S3
     *            bucket you specified. By default, the object key is
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
    public StartMedicalTranscriptionJobRequest withOutputKey(String outputKey) {
        this.outputKey = outputKey;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Key Management
     * Service (KMS) key used to encrypt the output of the transcription job.
     * The user calling the <a>StartMedicalTranscriptionJob</a> operation must
     * have permission to use the specified KMS key.
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
     * "arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
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
     *         The Amazon Resource Name (ARN) of the Amazon Web Services Key
     *         Management Service (KMS) key used to encrypt the output of the
     *         transcription job. The user calling the
     *         <a>StartMedicalTranscriptionJob</a> operation must have
     *         permission to use the specified KMS key.
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
     *         "arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
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
     * The Amazon Resource Name (ARN) of the Amazon Web Services Key Management
     * Service (KMS) key used to encrypt the output of the transcription job.
     * The user calling the <a>StartMedicalTranscriptionJob</a> operation must
     * have permission to use the specified KMS key.
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
     * "arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
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
     *            The Amazon Resource Name (ARN) of the Amazon Web Services Key
     *            Management Service (KMS) key used to encrypt the output of the
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
     *            "arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
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
     * The Amazon Resource Name (ARN) of the Amazon Web Services Key Management
     * Service (KMS) key used to encrypt the output of the transcription job.
     * The user calling the <a>StartMedicalTranscriptionJob</a> operation must
     * have permission to use the specified KMS key.
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
     * "arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
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
     *            The Amazon Resource Name (ARN) of the Amazon Web Services Key
     *            Management Service (KMS) key used to encrypt the output of the
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
     *            "arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"
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
    public StartMedicalTranscriptionJobRequest withKMSEncryptionContext(
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
    public StartMedicalTranscriptionJobRequest addKMSEncryptionContextEntry(String key, String value) {
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
    public StartMedicalTranscriptionJobRequest clearKMSEncryptionContextEntries() {
        this.kMSEncryptionContext = null;
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
     * You can configure Amazon Transcribe Medical to label content in the
     * transcription output. If you specify <code>PHI</code>, Amazon Transcribe
     * Medical labels the personal health information (PHI) that it identifies
     * in the transcription output.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @return <p>
     *         You can configure Amazon Transcribe Medical to label content in
     *         the transcription output. If you specify <code>PHI</code>, Amazon
     *         Transcribe Medical labels the personal health information (PHI)
     *         that it identifies in the transcription output.
     *         </p>
     * @see MedicalContentIdentificationType
     */
    public String getContentIdentificationType() {
        return contentIdentificationType;
    }

    /**
     * <p>
     * You can configure Amazon Transcribe Medical to label content in the
     * transcription output. If you specify <code>PHI</code>, Amazon Transcribe
     * Medical labels the personal health information (PHI) that it identifies
     * in the transcription output.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @param contentIdentificationType <p>
     *            You can configure Amazon Transcribe Medical to label content
     *            in the transcription output. If you specify <code>PHI</code>,
     *            Amazon Transcribe Medical labels the personal health
     *            information (PHI) that it identifies in the transcription
     *            output.
     *            </p>
     * @see MedicalContentIdentificationType
     */
    public void setContentIdentificationType(String contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType;
    }

    /**
     * <p>
     * You can configure Amazon Transcribe Medical to label content in the
     * transcription output. If you specify <code>PHI</code>, Amazon Transcribe
     * Medical labels the personal health information (PHI) that it identifies
     * in the transcription output.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @param contentIdentificationType <p>
     *            You can configure Amazon Transcribe Medical to label content
     *            in the transcription output. If you specify <code>PHI</code>,
     *            Amazon Transcribe Medical labels the personal health
     *            information (PHI) that it identifies in the transcription
     *            output.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MedicalContentIdentificationType
     */
    public StartMedicalTranscriptionJobRequest withContentIdentificationType(
            String contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType;
        return this;
    }

    /**
     * <p>
     * You can configure Amazon Transcribe Medical to label content in the
     * transcription output. If you specify <code>PHI</code>, Amazon Transcribe
     * Medical labels the personal health information (PHI) that it identifies
     * in the transcription output.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @param contentIdentificationType <p>
     *            You can configure Amazon Transcribe Medical to label content
     *            in the transcription output. If you specify <code>PHI</code>,
     *            Amazon Transcribe Medical labels the personal health
     *            information (PHI) that it identifies in the transcription
     *            output.
     *            </p>
     * @see MedicalContentIdentificationType
     */
    public void setContentIdentificationType(
            MedicalContentIdentificationType contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType.toString();
    }

    /**
     * <p>
     * You can configure Amazon Transcribe Medical to label content in the
     * transcription output. If you specify <code>PHI</code>, Amazon Transcribe
     * Medical labels the personal health information (PHI) that it identifies
     * in the transcription output.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @param contentIdentificationType <p>
     *            You can configure Amazon Transcribe Medical to label content
     *            in the transcription output. If you specify <code>PHI</code>,
     *            Amazon Transcribe Medical labels the personal health
     *            information (PHI) that it identifies in the transcription
     *            output.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MedicalContentIdentificationType
     */
    public StartMedicalTranscriptionJobRequest withContentIdentificationType(
            MedicalContentIdentificationType contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType.toString();
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
     * The type of speech in the input audio. <code>CONVERSATION</code> refers
     * to conversations between two or more speakers, e.g., a conversations
     * between doctors and patients. <code>DICTATION</code> refers to
     * single-speaker dictated speech, such as clinical notes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @return <p>
     *         The type of speech in the input audio. <code>CONVERSATION</code>
     *         refers to conversations between two or more speakers, e.g., a
     *         conversations between doctors and patients.
     *         <code>DICTATION</code> refers to single-speaker dictated speech,
     *         such as clinical notes.
     *         </p>
     * @see Type
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of speech in the input audio. <code>CONVERSATION</code> refers
     * to conversations between two or more speakers, e.g., a conversations
     * between doctors and patients. <code>DICTATION</code> refers to
     * single-speaker dictated speech, such as clinical notes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            The type of speech in the input audio.
     *            <code>CONVERSATION</code> refers to conversations between two
     *            or more speakers, e.g., a conversations between doctors and
     *            patients. <code>DICTATION</code> refers to single-speaker
     *            dictated speech, such as clinical notes.
     *            </p>
     * @see Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of speech in the input audio. <code>CONVERSATION</code> refers
     * to conversations between two or more speakers, e.g., a conversations
     * between doctors and patients. <code>DICTATION</code> refers to
     * single-speaker dictated speech, such as clinical notes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            The type of speech in the input audio.
     *            <code>CONVERSATION</code> refers to conversations between two
     *            or more speakers, e.g., a conversations between doctors and
     *            patients. <code>DICTATION</code> refers to single-speaker
     *            dictated speech, such as clinical notes.
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
     * The type of speech in the input audio. <code>CONVERSATION</code> refers
     * to conversations between two or more speakers, e.g., a conversations
     * between doctors and patients. <code>DICTATION</code> refers to
     * single-speaker dictated speech, such as clinical notes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            The type of speech in the input audio.
     *            <code>CONVERSATION</code> refers to conversations between two
     *            or more speakers, e.g., a conversations between doctors and
     *            patients. <code>DICTATION</code> refers to single-speaker
     *            dictated speech, such as clinical notes.
     *            </p>
     * @see Type
     */
    public void setType(Type type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of speech in the input audio. <code>CONVERSATION</code> refers
     * to conversations between two or more speakers, e.g., a conversations
     * between doctors and patients. <code>DICTATION</code> refers to
     * single-speaker dictated speech, such as clinical notes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            The type of speech in the input audio.
     *            <code>CONVERSATION</code> refers to conversations between two
     *            or more speakers, e.g., a conversations between doctors and
     *            patients. <code>DICTATION</code> refers to single-speaker
     *            dictated speech, such as clinical notes.
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
     * <p>
     * Add tags to an Amazon Transcribe medical transcription job.
     * </p>
     *
     * @return <p>
     *         Add tags to an Amazon Transcribe medical transcription job.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Add tags to an Amazon Transcribe medical transcription job.
     * </p>
     *
     * @param tags <p>
     *            Add tags to an Amazon Transcribe medical transcription job.
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
     * Add tags to an Amazon Transcribe medical transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Add tags to an Amazon Transcribe medical transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMedicalTranscriptionJobRequest withTags(Tag... tags) {
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
     * Add tags to an Amazon Transcribe medical transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Add tags to an Amazon Transcribe medical transcription job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMedicalTranscriptionJobRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getOutputKey() != null)
            sb.append("OutputKey: " + getOutputKey() + ",");
        if (getOutputEncryptionKMSKeyId() != null)
            sb.append("OutputEncryptionKMSKeyId: " + getOutputEncryptionKMSKeyId() + ",");
        if (getKMSEncryptionContext() != null)
            sb.append("KMSEncryptionContext: " + getKMSEncryptionContext() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings() + ",");
        if (getContentIdentificationType() != null)
            sb.append("ContentIdentificationType: " + getContentIdentificationType() + ",");
        if (getSpecialty() != null)
            sb.append("Specialty: " + getSpecialty() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
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
        hashCode = prime * hashCode + ((getOutputKey() == null) ? 0 : getOutputKey().hashCode());
        hashCode = prime
                * hashCode
                + ((getOutputEncryptionKMSKeyId() == null) ? 0 : getOutputEncryptionKMSKeyId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getKMSEncryptionContext() == null) ? 0 : getKMSEncryptionContext().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getContentIdentificationType() == null) ? 0 : getContentIdentificationType()
                        .hashCode());
        hashCode = prime * hashCode + ((getSpecialty() == null) ? 0 : getSpecialty().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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
        if (other.getContentIdentificationType() == null
                ^ this.getContentIdentificationType() == null)
            return false;
        if (other.getContentIdentificationType() != null
                && other.getContentIdentificationType().equals(this.getContentIdentificationType()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
