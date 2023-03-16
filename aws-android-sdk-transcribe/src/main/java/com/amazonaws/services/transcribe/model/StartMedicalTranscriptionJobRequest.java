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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Transcribes the audio from a medical dictation or conversation and applies
 * any additional Request Parameters you choose to include in your request.
 * </p>
 * <p>
 * In addition to many standard transcription features, Amazon Transcribe
 * Medical provides you with a robust medical vocabulary and, optionally,
 * content identification, which adds flags to personal health information
 * (PHI). To learn more about these features, refer to <a href=
 * "https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works-med.html">How
 * Amazon Transcribe Medical works</a>.
 * </p>
 * <p>
 * To make a <code>StartMedicalTranscriptionJob</code> request, you must first
 * upload your media file into an Amazon S3 bucket; you can then specify the S3
 * location of the file using the <code>Media</code> parameter.
 * </p>
 * <p>
 * You must include the following parameters in your
 * <code>StartMedicalTranscriptionJob</code> request:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>region</code>: The Amazon Web Services Region where you are making your
 * request. For a list of Amazon Web Services Regions supported with Amazon
 * Transcribe, refer to <a
 * href="https://docs.aws.amazon.com/general/latest/gr/transcribe.html">Amazon
 * Transcribe endpoints and quotas</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>MedicalTranscriptionJobName</code>: A custom name you create for your
 * transcription job that is unique within your Amazon Web Services account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Media</code> (<code>MediaFileUri</code>): The Amazon S3 location of
 * your media file.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>LanguageCode</code>: This must be <code>en-US</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>OutputBucketName</code>: The Amazon S3 bucket where you want your
 * transcript stored. If you want your output stored in a sub-folder of this
 * bucket, you must also include <code>OutputKey</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Specialty</code>: This must be <code>PRIMARYCARE</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Type</code>: Choose whether your audio is a conversation or a
 * dictation.
 * </p>
 * </li>
 * </ul>
 */
public class StartMedicalTranscriptionJobRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A unique name, chosen by you, for your medical transcription job. The
     * name that you specify is also used as the default name of your
     * transcription output file. If you want to specify a different name for
     * your transcription output, use the <code>OutputKey</code> parameter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique
     * within an Amazon Web Services account. If you try to create a new job
     * with the same name as an existing job, you get a
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
     * The language code that represents the language spoken in the input media
     * file. US English (<code>en-US</code>) is the only valid value for medical
     * transcription jobs. Any other value you enter for language code results
     * in a <code>BadRequestException</code> error.
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
     * If you don't specify the media sample rate, Amazon Transcribe Medical
     * determines it for you. If you specify the sample rate, it must match the
     * rate detected by Amazon Transcribe Medical; if there's a mismatch between
     * the value that you specify and the value detected, your job fails.
     * Therefore, in most cases, it's advised to omit
     * <code>MediaSampleRateHertz</code> and let Amazon Transcribe Medical
     * determine the sample rate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>16000 - 48000<br/>
     */
    private Integer mediaSampleRateHertz;

    /**
     * <p>
     * Specify the format of your input media file.
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
     * <p>
     * For information on supported media formats, refer to the <a href=
     * "https://docs.aws.amazon.com/APIReference/API_StartTranscriptionJob.html#transcribe-StartTranscriptionJob-request-MediaFormat"
     * >MediaFormat</a> parameter or the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
     * >Media formats</a> section in the Amazon S3 Developer Guide.
     * </p>
     */
    private Media media;

    /**
     * <p>
     * The name of the Amazon S3 bucket where you want your medical
     * transcription output stored. Do not include the <code>S3://</code> prefix
     * of the specified bucket.
     * </p>
     * <p>
     * If you want your output to go to a sub-folder of this bucket, specify it
     * using the <code>OutputKey</code> parameter; <code>OutputBucketName</code>
     * only accepts the name of a bucket.
     * </p>
     * <p>
     * For example, if you want your output stored in
     * <code>S3://DOC-EXAMPLE-BUCKET</code>, set <code>OutputBucketName</code>
     * to <code>DOC-EXAMPLE-BUCKET</code>. However, if you want your output
     * stored in <code>S3://DOC-EXAMPLE-BUCKET/test-files/</code>, set
     * <code>OutputBucketName</code> to <code>DOC-EXAMPLE-BUCKET</code> and
     * <code>OutputKey</code> to <code>test-files/</code>.
     * </p>
     * <p>
     * Note that Amazon Transcribe must have permission to use the specified
     * location. You can change Amazon S3 permissions using the <a
     * href="https://console.aws.amazon.com/s3">Amazon Web Services Management
     * Console</a>. See also <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]<br/>
     */
    private String outputBucketName;

    /**
     * <p>
     * Use in combination with <code>OutputBucketName</code> to specify the
     * output location of your transcript and, optionally, a unique name for
     * your output file. The default name for your transcription output is the
     * same as the name you specified for your medical transcription job (
     * <code>MedicalTranscriptionJobName</code>).
     * </p>
     * <p>
     * Here are some examples of how you can use <code>OutputKey</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code>
     * and 'my-transcript.json' as the <code>OutputKey</code>, your
     * transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/my-transcript.json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'my-first-transcription' as the
     * <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as the
     * <code>OutputBucketName</code>, and 'my-transcript' as the
     * <code>OutputKey</code>, your transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code>
     * and 'test-files/my-transcript.json' as the <code>OutputKey</code>, your
     * transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript.json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'my-first-transcription' as the
     * <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as the
     * <code>OutputBucketName</code>, and 'test-files/my-transcript' as the
     * <code>OutputKey</code>, your transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify the name of an Amazon S3 bucket sub-folder that doesn't
     * exist, one is created for you.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.!*'()/]{1,1024}$<br/>
     */
    private String outputKey;

    /**
     * <p>
     * The KMS key you want to use to encrypt your medical transcription output.
     * </p>
     * <p>
     * If using a key located in the <b>current</b> Amazon Web Services account,
     * you can specify your KMS key in one of four ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the KMS key ID itself. For example,
     * <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an alias for the KMS key ID. For example,
     * <code>alias/ExampleAlias</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the Amazon Resource Name (ARN) for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example,
     * <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If using a key located in a <b>different</b> Amazon Web Services account
     * than the current Amazon Web Services account, you can specify your KMS
     * key in one of two ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the ARN for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example,
     * <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you don't specify an encryption key, your output is encrypted with the
     * default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an
     * output location using the <code>OutputLocation</code> parameter.
     * </p>
     * <p>
     * Note that the role making the request must have permission to use the
     * specified KMS key.
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
     * context pairs, that provide an added layer of security for your data. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/key-management.html#kms-context"
     * >KMS encryption context</a> and <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/symmetric-asymmetric.html"
     * >Asymmetric keys in KMS</a>.
     * </p>
     */
    private java.util.Map<String, String> kMSEncryptionContext;

    /**
     * <p>
     * Specify additional optional settings in your request, including channel
     * identification, alternative transcriptions, and speaker partitioning. You
     * can use that to apply custom vocabularies to your transcription job.
     * </p>
     */
    private MedicalTranscriptionSetting settings;

    /**
     * <p>
     * Labels all personal health information (PHI) identified in your
     * transcript. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html"
     * >Identifying personal health information (PHI) in a transcription</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     */
    private String contentIdentificationType;

    /**
     * <p>
     * Specify the predominant medical specialty represented in your media. For
     * batch transcriptions, <code>PRIMARYCARE</code> is the only valid value.
     * If you require additional specialties, refer to .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     */
    private String specialty;

    /**
     * <p>
     * Specify whether your input media contains only one person (
     * <code>DICTATION</code>) or contains a conversation between two people (
     * <code>CONVERSATION</code>).
     * </p>
     * <p>
     * For example, <code>DICTATION</code> could be used for a medical
     * professional wanting to transcribe voice memos; <code>CONVERSATION</code>
     * could be used for transcribing the doctor-patient dialogue during the
     * patient's office visit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     */
    private String type;

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a
     * new medical transcription job at the time you start this new job.
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
     * A unique name, chosen by you, for your medical transcription job. The
     * name that you specify is also used as the default name of your
     * transcription output file. If you want to specify a different name for
     * your transcription output, use the <code>OutputKey</code> parameter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique
     * within an Amazon Web Services account. If you try to create a new job
     * with the same name as an existing job, you get a
     * <code>ConflictException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         A unique name, chosen by you, for your medical transcription job.
     *         The name that you specify is also used as the default name of
     *         your transcription output file. If you want to specify a
     *         different name for your transcription output, use the
     *         <code>OutputKey</code> parameter.
     *         </p>
     *         <p>
     *         This name is case sensitive, cannot contain spaces, and must be
     *         unique within an Amazon Web Services account. If you try to
     *         create a new job with the same name as an existing job, you get a
     *         <code>ConflictException</code> error.
     *         </p>
     */
    public String getMedicalTranscriptionJobName() {
        return medicalTranscriptionJobName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your medical transcription job. The
     * name that you specify is also used as the default name of your
     * transcription output file. If you want to specify a different name for
     * your transcription output, use the <code>OutputKey</code> parameter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique
     * within an Amazon Web Services account. If you try to create a new job
     * with the same name as an existing job, you get a
     * <code>ConflictException</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param medicalTranscriptionJobName <p>
     *            A unique name, chosen by you, for your medical transcription
     *            job. The name that you specify is also used as the default
     *            name of your transcription output file. If you want to specify
     *            a different name for your transcription output, use the
     *            <code>OutputKey</code> parameter.
     *            </p>
     *            <p>
     *            This name is case sensitive, cannot contain spaces, and must
     *            be unique within an Amazon Web Services account. If you try to
     *            create a new job with the same name as an existing job, you
     *            get a <code>ConflictException</code> error.
     *            </p>
     */
    public void setMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        this.medicalTranscriptionJobName = medicalTranscriptionJobName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your medical transcription job. The
     * name that you specify is also used as the default name of your
     * transcription output file. If you want to specify a different name for
     * your transcription output, use the <code>OutputKey</code> parameter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique
     * within an Amazon Web Services account. If you try to create a new job
     * with the same name as an existing job, you get a
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
     *            A unique name, chosen by you, for your medical transcription
     *            job. The name that you specify is also used as the default
     *            name of your transcription output file. If you want to specify
     *            a different name for your transcription output, use the
     *            <code>OutputKey</code> parameter.
     *            </p>
     *            <p>
     *            This name is case sensitive, cannot contain spaces, and must
     *            be unique within an Amazon Web Services account. If you try to
     *            create a new job with the same name as an existing job, you
     *            get a <code>ConflictException</code> error.
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
     * The language code that represents the language spoken in the input media
     * file. US English (<code>en-US</code>) is the only valid value for medical
     * transcription jobs. Any other value you enter for language code results
     * in a <code>BadRequestException</code> error.
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
     *         The language code that represents the language spoken in the
     *         input media file. US English (<code>en-US</code>) is the only
     *         valid value for medical transcription jobs. Any other value you
     *         enter for language code results in a
     *         <code>BadRequestException</code> error.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code that represents the language spoken in the input media
     * file. US English (<code>en-US</code>) is the only valid value for medical
     * transcription jobs. Any other value you enter for language code results
     * in a <code>BadRequestException</code> error.
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
     *            The language code that represents the language spoken in the
     *            input media file. US English (<code>en-US</code>) is the only
     *            valid value for medical transcription jobs. Any other value
     *            you enter for language code results in a
     *            <code>BadRequestException</code> error.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code that represents the language spoken in the input media
     * file. US English (<code>en-US</code>) is the only valid value for medical
     * transcription jobs. Any other value you enter for language code results
     * in a <code>BadRequestException</code> error.
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
     *            The language code that represents the language spoken in the
     *            input media file. US English (<code>en-US</code>) is the only
     *            valid value for medical transcription jobs. Any other value
     *            you enter for language code results in a
     *            <code>BadRequestException</code> error.
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
     * The language code that represents the language spoken in the input media
     * file. US English (<code>en-US</code>) is the only valid value for medical
     * transcription jobs. Any other value you enter for language code results
     * in a <code>BadRequestException</code> error.
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
     *            The language code that represents the language spoken in the
     *            input media file. US English (<code>en-US</code>) is the only
     *            valid value for medical transcription jobs. Any other value
     *            you enter for language code results in a
     *            <code>BadRequestException</code> error.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code that represents the language spoken in the input media
     * file. US English (<code>en-US</code>) is the only valid value for medical
     * transcription jobs. Any other value you enter for language code results
     * in a <code>BadRequestException</code> error.
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
     *            The language code that represents the language spoken in the
     *            input media file. US English (<code>en-US</code>) is the only
     *            valid value for medical transcription jobs. Any other value
     *            you enter for language code results in a
     *            <code>BadRequestException</code> error.
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
     * The sample rate, in hertz, of the audio track in your input media file.
     * </p>
     * <p>
     * If you don't specify the media sample rate, Amazon Transcribe Medical
     * determines it for you. If you specify the sample rate, it must match the
     * rate detected by Amazon Transcribe Medical; if there's a mismatch between
     * the value that you specify and the value detected, your job fails.
     * Therefore, in most cases, it's advised to omit
     * <code>MediaSampleRateHertz</code> and let Amazon Transcribe Medical
     * determine the sample rate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>16000 - 48000<br/>
     *
     * @return <p>
     *         The sample rate, in hertz, of the audio track in your input media
     *         file.
     *         </p>
     *         <p>
     *         If you don't specify the media sample rate, Amazon Transcribe
     *         Medical determines it for you. If you specify the sample rate, it
     *         must match the rate detected by Amazon Transcribe Medical; if
     *         there's a mismatch between the value that you specify and the
     *         value detected, your job fails. Therefore, in most cases, it's
     *         advised to omit <code>MediaSampleRateHertz</code> and let Amazon
     *         Transcribe Medical determine the sample rate.
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
     * If you don't specify the media sample rate, Amazon Transcribe Medical
     * determines it for you. If you specify the sample rate, it must match the
     * rate detected by Amazon Transcribe Medical; if there's a mismatch between
     * the value that you specify and the value detected, your job fails.
     * Therefore, in most cases, it's advised to omit
     * <code>MediaSampleRateHertz</code> and let Amazon Transcribe Medical
     * determine the sample rate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>16000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate, in hertz, of the audio track in your input
     *            media file.
     *            </p>
     *            <p>
     *            If you don't specify the media sample rate, Amazon Transcribe
     *            Medical determines it for you. If you specify the sample rate,
     *            it must match the rate detected by Amazon Transcribe Medical;
     *            if there's a mismatch between the value that you specify and
     *            the value detected, your job fails. Therefore, in most cases,
     *            it's advised to omit <code>MediaSampleRateHertz</code> and let
     *            Amazon Transcribe Medical determine the sample rate.
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
     * If you don't specify the media sample rate, Amazon Transcribe Medical
     * determines it for you. If you specify the sample rate, it must match the
     * rate detected by Amazon Transcribe Medical; if there's a mismatch between
     * the value that you specify and the value detected, your job fails.
     * Therefore, in most cases, it's advised to omit
     * <code>MediaSampleRateHertz</code> and let Amazon Transcribe Medical
     * determine the sample rate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>16000 - 48000<br/>
     *
     * @param mediaSampleRateHertz <p>
     *            The sample rate, in hertz, of the audio track in your input
     *            media file.
     *            </p>
     *            <p>
     *            If you don't specify the media sample rate, Amazon Transcribe
     *            Medical determines it for you. If you specify the sample rate,
     *            it must match the rate detected by Amazon Transcribe Medical;
     *            if there's a mismatch between the value that you specify and
     *            the value detected, your job fails. Therefore, in most cases,
     *            it's advised to omit <code>MediaSampleRateHertz</code> and let
     *            Amazon Transcribe Medical determine the sample rate.
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
     * Specify the format of your input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @return <p>
     *         Specify the format of your input media file.
     *         </p>
     * @see MediaFormat
     */
    public String getMediaFormat() {
        return mediaFormat;
    }

    /**
     * <p>
     * Specify the format of your input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @param mediaFormat <p>
     *            Specify the format of your input media file.
     *            </p>
     * @see MediaFormat
     */
    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    /**
     * <p>
     * Specify the format of your input media file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @param mediaFormat <p>
     *            Specify the format of your input media file.
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
     * Specify the format of your input media file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @param mediaFormat <p>
     *            Specify the format of your input media file.
     *            </p>
     * @see MediaFormat
     */
    public void setMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat.toString();
    }

    /**
     * <p>
     * Specify the format of your input media file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>mp3, mp4, wav, flac, ogg, amr, webm
     *
     * @param mediaFormat <p>
     *            Specify the format of your input media file.
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
     * Describes the Amazon S3 location of the media file you want to use in
     * your request.
     * </p>
     * <p>
     * For information on supported media formats, refer to the <a href=
     * "https://docs.aws.amazon.com/APIReference/API_StartTranscriptionJob.html#transcribe-StartTranscriptionJob-request-MediaFormat"
     * >MediaFormat</a> parameter or the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
     * >Media formats</a> section in the Amazon S3 Developer Guide.
     * </p>
     *
     * @return <p>
     *         Describes the Amazon S3 location of the media file you want to
     *         use in your request.
     *         </p>
     *         <p>
     *         For information on supported media formats, refer to the <a href=
     *         "https://docs.aws.amazon.com/APIReference/API_StartTranscriptionJob.html#transcribe-StartTranscriptionJob-request-MediaFormat"
     *         >MediaFormat</a> parameter or the <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
     *         >Media formats</a> section in the Amazon S3 Developer Guide.
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
     * <p>
     * For information on supported media formats, refer to the <a href=
     * "https://docs.aws.amazon.com/APIReference/API_StartTranscriptionJob.html#transcribe-StartTranscriptionJob-request-MediaFormat"
     * >MediaFormat</a> parameter or the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
     * >Media formats</a> section in the Amazon S3 Developer Guide.
     * </p>
     *
     * @param media <p>
     *            Describes the Amazon S3 location of the media file you want to
     *            use in your request.
     *            </p>
     *            <p>
     *            For information on supported media formats, refer to the <a
     *            href=
     *            "https://docs.aws.amazon.com/APIReference/API_StartTranscriptionJob.html#transcribe-StartTranscriptionJob-request-MediaFormat"
     *            >MediaFormat</a> parameter or the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
     *            >Media formats</a> section in the Amazon S3 Developer Guide.
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
     * For information on supported media formats, refer to the <a href=
     * "https://docs.aws.amazon.com/APIReference/API_StartTranscriptionJob.html#transcribe-StartTranscriptionJob-request-MediaFormat"
     * >MediaFormat</a> parameter or the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
     * >Media formats</a> section in the Amazon S3 Developer Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param media <p>
     *            Describes the Amazon S3 location of the media file you want to
     *            use in your request.
     *            </p>
     *            <p>
     *            For information on supported media formats, refer to the <a
     *            href=
     *            "https://docs.aws.amazon.com/APIReference/API_StartTranscriptionJob.html#transcribe-StartTranscriptionJob-request-MediaFormat"
     *            >MediaFormat</a> parameter or the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
     *            >Media formats</a> section in the Amazon S3 Developer Guide.
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
     * The name of the Amazon S3 bucket where you want your medical
     * transcription output stored. Do not include the <code>S3://</code> prefix
     * of the specified bucket.
     * </p>
     * <p>
     * If you want your output to go to a sub-folder of this bucket, specify it
     * using the <code>OutputKey</code> parameter; <code>OutputBucketName</code>
     * only accepts the name of a bucket.
     * </p>
     * <p>
     * For example, if you want your output stored in
     * <code>S3://DOC-EXAMPLE-BUCKET</code>, set <code>OutputBucketName</code>
     * to <code>DOC-EXAMPLE-BUCKET</code>. However, if you want your output
     * stored in <code>S3://DOC-EXAMPLE-BUCKET/test-files/</code>, set
     * <code>OutputBucketName</code> to <code>DOC-EXAMPLE-BUCKET</code> and
     * <code>OutputKey</code> to <code>test-files/</code>.
     * </p>
     * <p>
     * Note that Amazon Transcribe must have permission to use the specified
     * location. You can change Amazon S3 permissions using the <a
     * href="https://console.aws.amazon.com/s3">Amazon Web Services Management
     * Console</a>. See also <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]<br/>
     *
     * @return <p>
     *         The name of the Amazon S3 bucket where you want your medical
     *         transcription output stored. Do not include the
     *         <code>S3://</code> prefix of the specified bucket.
     *         </p>
     *         <p>
     *         If you want your output to go to a sub-folder of this bucket,
     *         specify it using the <code>OutputKey</code> parameter;
     *         <code>OutputBucketName</code> only accepts the name of a bucket.
     *         </p>
     *         <p>
     *         For example, if you want your output stored in
     *         <code>S3://DOC-EXAMPLE-BUCKET</code>, set
     *         <code>OutputBucketName</code> to <code>DOC-EXAMPLE-BUCKET</code>.
     *         However, if you want your output stored in
     *         <code>S3://DOC-EXAMPLE-BUCKET/test-files/</code>, set
     *         <code>OutputBucketName</code> to <code>DOC-EXAMPLE-BUCKET</code>
     *         and <code>OutputKey</code> to <code>test-files/</code>.
     *         </p>
     *         <p>
     *         Note that Amazon Transcribe must have permission to use the
     *         specified location. You can change Amazon S3 permissions using
     *         the <a href="https://console.aws.amazon.com/s3">Amazon Web
     *         Services Management Console</a>. See also <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *         >Permissions Required for IAM User Roles</a>.
     *         </p>
     */
    public String getOutputBucketName() {
        return outputBucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where you want your medical
     * transcription output stored. Do not include the <code>S3://</code> prefix
     * of the specified bucket.
     * </p>
     * <p>
     * If you want your output to go to a sub-folder of this bucket, specify it
     * using the <code>OutputKey</code> parameter; <code>OutputBucketName</code>
     * only accepts the name of a bucket.
     * </p>
     * <p>
     * For example, if you want your output stored in
     * <code>S3://DOC-EXAMPLE-BUCKET</code>, set <code>OutputBucketName</code>
     * to <code>DOC-EXAMPLE-BUCKET</code>. However, if you want your output
     * stored in <code>S3://DOC-EXAMPLE-BUCKET/test-files/</code>, set
     * <code>OutputBucketName</code> to <code>DOC-EXAMPLE-BUCKET</code> and
     * <code>OutputKey</code> to <code>test-files/</code>.
     * </p>
     * <p>
     * Note that Amazon Transcribe must have permission to use the specified
     * location. You can change Amazon S3 permissions using the <a
     * href="https://console.aws.amazon.com/s3">Amazon Web Services Management
     * Console</a>. See also <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9]<br/>
     *
     * @param outputBucketName <p>
     *            The name of the Amazon S3 bucket where you want your medical
     *            transcription output stored. Do not include the
     *            <code>S3://</code> prefix of the specified bucket.
     *            </p>
     *            <p>
     *            If you want your output to go to a sub-folder of this bucket,
     *            specify it using the <code>OutputKey</code> parameter;
     *            <code>OutputBucketName</code> only accepts the name of a
     *            bucket.
     *            </p>
     *            <p>
     *            For example, if you want your output stored in
     *            <code>S3://DOC-EXAMPLE-BUCKET</code>, set
     *            <code>OutputBucketName</code> to
     *            <code>DOC-EXAMPLE-BUCKET</code>. However, if you want your
     *            output stored in
     *            <code>S3://DOC-EXAMPLE-BUCKET/test-files/</code>, set
     *            <code>OutputBucketName</code> to
     *            <code>DOC-EXAMPLE-BUCKET</code> and <code>OutputKey</code> to
     *            <code>test-files/</code>.
     *            </p>
     *            <p>
     *            Note that Amazon Transcribe must have permission to use the
     *            specified location. You can change Amazon S3 permissions using
     *            the <a href="https://console.aws.amazon.com/s3">Amazon Web
     *            Services Management Console</a>. See also <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *            >Permissions Required for IAM User Roles</a>.
     *            </p>
     */
    public void setOutputBucketName(String outputBucketName) {
        this.outputBucketName = outputBucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where you want your medical
     * transcription output stored. Do not include the <code>S3://</code> prefix
     * of the specified bucket.
     * </p>
     * <p>
     * If you want your output to go to a sub-folder of this bucket, specify it
     * using the <code>OutputKey</code> parameter; <code>OutputBucketName</code>
     * only accepts the name of a bucket.
     * </p>
     * <p>
     * For example, if you want your output stored in
     * <code>S3://DOC-EXAMPLE-BUCKET</code>, set <code>OutputBucketName</code>
     * to <code>DOC-EXAMPLE-BUCKET</code>. However, if you want your output
     * stored in <code>S3://DOC-EXAMPLE-BUCKET/test-files/</code>, set
     * <code>OutputBucketName</code> to <code>DOC-EXAMPLE-BUCKET</code> and
     * <code>OutputKey</code> to <code>test-files/</code>.
     * </p>
     * <p>
     * Note that Amazon Transcribe must have permission to use the specified
     * location. You can change Amazon S3 permissions using the <a
     * href="https://console.aws.amazon.com/s3">Amazon Web Services Management
     * Console</a>. See also <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     * >Permissions Required for IAM User Roles</a>.
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
     *            The name of the Amazon S3 bucket where you want your medical
     *            transcription output stored. Do not include the
     *            <code>S3://</code> prefix of the specified bucket.
     *            </p>
     *            <p>
     *            If you want your output to go to a sub-folder of this bucket,
     *            specify it using the <code>OutputKey</code> parameter;
     *            <code>OutputBucketName</code> only accepts the name of a
     *            bucket.
     *            </p>
     *            <p>
     *            For example, if you want your output stored in
     *            <code>S3://DOC-EXAMPLE-BUCKET</code>, set
     *            <code>OutputBucketName</code> to
     *            <code>DOC-EXAMPLE-BUCKET</code>. However, if you want your
     *            output stored in
     *            <code>S3://DOC-EXAMPLE-BUCKET/test-files/</code>, set
     *            <code>OutputBucketName</code> to
     *            <code>DOC-EXAMPLE-BUCKET</code> and <code>OutputKey</code> to
     *            <code>test-files/</code>.
     *            </p>
     *            <p>
     *            Note that Amazon Transcribe must have permission to use the
     *            specified location. You can change Amazon S3 permissions using
     *            the <a href="https://console.aws.amazon.com/s3">Amazon Web
     *            Services Management Console</a>. See also <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *            >Permissions Required for IAM User Roles</a>.
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
     * Use in combination with <code>OutputBucketName</code> to specify the
     * output location of your transcript and, optionally, a unique name for
     * your output file. The default name for your transcription output is the
     * same as the name you specified for your medical transcription job (
     * <code>MedicalTranscriptionJobName</code>).
     * </p>
     * <p>
     * Here are some examples of how you can use <code>OutputKey</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code>
     * and 'my-transcript.json' as the <code>OutputKey</code>, your
     * transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/my-transcript.json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'my-first-transcription' as the
     * <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as the
     * <code>OutputBucketName</code>, and 'my-transcript' as the
     * <code>OutputKey</code>, your transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code>
     * and 'test-files/my-transcript.json' as the <code>OutputKey</code>, your
     * transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript.json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'my-first-transcription' as the
     * <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as the
     * <code>OutputBucketName</code>, and 'test-files/my-transcript' as the
     * <code>OutputKey</code>, your transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify the name of an Amazon S3 bucket sub-folder that doesn't
     * exist, one is created for you.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.!*'()/]{1,1024}$<br/>
     *
     * @return <p>
     *         Use in combination with <code>OutputBucketName</code> to specify
     *         the output location of your transcript and, optionally, a unique
     *         name for your output file. The default name for your
     *         transcription output is the same as the name you specified for
     *         your medical transcription job (
     *         <code>MedicalTranscriptionJobName</code>).
     *         </p>
     *         <p>
     *         Here are some examples of how you can use <code>OutputKey</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify 'DOC-EXAMPLE-BUCKET' as the
     *         <code>OutputBucketName</code> and 'my-transcript.json' as the
     *         <code>OutputKey</code>, your transcription output path is
     *         <code>s3://DOC-EXAMPLE-BUCKET/my-transcript.json</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify 'my-first-transcription' as the
     *         <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as
     *         the <code>OutputBucketName</code>, and 'my-transcript' as the
     *         <code>OutputKey</code>, your transcription output path is
     *         <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify 'DOC-EXAMPLE-BUCKET' as the
     *         <code>OutputBucketName</code> and 'test-files/my-transcript.json'
     *         as the <code>OutputKey</code>, your transcription output path is
     *         <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript.json</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify 'my-first-transcription' as the
     *         <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as
     *         the <code>OutputBucketName</code>, and 'test-files/my-transcript'
     *         as the <code>OutputKey</code>, your transcription output path is
     *         <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>
     *         .
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify the name of an Amazon S3 bucket sub-folder that
     *         doesn't exist, one is created for you.
     *         </p>
     */
    public String getOutputKey() {
        return outputKey;
    }

    /**
     * <p>
     * Use in combination with <code>OutputBucketName</code> to specify the
     * output location of your transcript and, optionally, a unique name for
     * your output file. The default name for your transcription output is the
     * same as the name you specified for your medical transcription job (
     * <code>MedicalTranscriptionJobName</code>).
     * </p>
     * <p>
     * Here are some examples of how you can use <code>OutputKey</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code>
     * and 'my-transcript.json' as the <code>OutputKey</code>, your
     * transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/my-transcript.json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'my-first-transcription' as the
     * <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as the
     * <code>OutputBucketName</code>, and 'my-transcript' as the
     * <code>OutputKey</code>, your transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code>
     * and 'test-files/my-transcript.json' as the <code>OutputKey</code>, your
     * transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript.json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'my-first-transcription' as the
     * <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as the
     * <code>OutputBucketName</code>, and 'test-files/my-transcript' as the
     * <code>OutputKey</code>, your transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify the name of an Amazon S3 bucket sub-folder that doesn't
     * exist, one is created for you.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.!*'()/]{1,1024}$<br/>
     *
     * @param outputKey <p>
     *            Use in combination with <code>OutputBucketName</code> to
     *            specify the output location of your transcript and,
     *            optionally, a unique name for your output file. The default
     *            name for your transcription output is the same as the name you
     *            specified for your medical transcription job (
     *            <code>MedicalTranscriptionJobName</code>).
     *            </p>
     *            <p>
     *            Here are some examples of how you can use
     *            <code>OutputKey</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you specify 'DOC-EXAMPLE-BUCKET' as the
     *            <code>OutputBucketName</code> and 'my-transcript.json' as the
     *            <code>OutputKey</code>, your transcription output path is
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-transcript.json</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify 'my-first-transcription' as the
     *            <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET'
     *            as the <code>OutputBucketName</code>, and 'my-transcript' as
     *            the <code>OutputKey</code>, your transcription output path is
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify 'DOC-EXAMPLE-BUCKET' as the
     *            <code>OutputBucketName</code> and
     *            'test-files/my-transcript.json' as the <code>OutputKey</code>,
     *            your transcription output path is
     *            <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript.json</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify 'my-first-transcription' as the
     *            <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET'
     *            as the <code>OutputBucketName</code>, and
     *            'test-files/my-transcript' as the <code>OutputKey</code>, your
     *            transcription output path is
     *            <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you specify the name of an Amazon S3 bucket sub-folder that
     *            doesn't exist, one is created for you.
     *            </p>
     */
    public void setOutputKey(String outputKey) {
        this.outputKey = outputKey;
    }

    /**
     * <p>
     * Use in combination with <code>OutputBucketName</code> to specify the
     * output location of your transcript and, optionally, a unique name for
     * your output file. The default name for your transcription output is the
     * same as the name you specified for your medical transcription job (
     * <code>MedicalTranscriptionJobName</code>).
     * </p>
     * <p>
     * Here are some examples of how you can use <code>OutputKey</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code>
     * and 'my-transcript.json' as the <code>OutputKey</code>, your
     * transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/my-transcript.json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'my-first-transcription' as the
     * <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as the
     * <code>OutputBucketName</code>, and 'my-transcript' as the
     * <code>OutputKey</code>, your transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'DOC-EXAMPLE-BUCKET' as the <code>OutputBucketName</code>
     * and 'test-files/my-transcript.json' as the <code>OutputKey</code>, your
     * transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript.json</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify 'my-first-transcription' as the
     * <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET' as the
     * <code>OutputBucketName</code>, and 'test-files/my-transcript' as the
     * <code>OutputKey</code>, your transcription output path is
     * <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify the name of an Amazon S3 bucket sub-folder that doesn't
     * exist, one is created for you.
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
     *            Use in combination with <code>OutputBucketName</code> to
     *            specify the output location of your transcript and,
     *            optionally, a unique name for your output file. The default
     *            name for your transcription output is the same as the name you
     *            specified for your medical transcription job (
     *            <code>MedicalTranscriptionJobName</code>).
     *            </p>
     *            <p>
     *            Here are some examples of how you can use
     *            <code>OutputKey</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you specify 'DOC-EXAMPLE-BUCKET' as the
     *            <code>OutputBucketName</code> and 'my-transcript.json' as the
     *            <code>OutputKey</code>, your transcription output path is
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-transcript.json</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify 'my-first-transcription' as the
     *            <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET'
     *            as the <code>OutputBucketName</code>, and 'my-transcript' as
     *            the <code>OutputKey</code>, your transcription output path is
     *            <code>s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify 'DOC-EXAMPLE-BUCKET' as the
     *            <code>OutputBucketName</code> and
     *            'test-files/my-transcript.json' as the <code>OutputKey</code>,
     *            your transcription output path is
     *            <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript.json</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify 'my-first-transcription' as the
     *            <code>MedicalTranscriptionJobName</code>, 'DOC-EXAMPLE-BUCKET'
     *            as the <code>OutputBucketName</code>, and
     *            'test-files/my-transcript' as the <code>OutputKey</code>, your
     *            transcription output path is
     *            <code>s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you specify the name of an Amazon S3 bucket sub-folder that
     *            doesn't exist, one is created for you.
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
     * The KMS key you want to use to encrypt your medical transcription output.
     * </p>
     * <p>
     * If using a key located in the <b>current</b> Amazon Web Services account,
     * you can specify your KMS key in one of four ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the KMS key ID itself. For example,
     * <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an alias for the KMS key ID. For example,
     * <code>alias/ExampleAlias</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the Amazon Resource Name (ARN) for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example,
     * <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If using a key located in a <b>different</b> Amazon Web Services account
     * than the current Amazon Web Services account, you can specify your KMS
     * key in one of two ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the ARN for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example,
     * <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you don't specify an encryption key, your output is encrypted with the
     * default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an
     * output location using the <code>OutputLocation</code> parameter.
     * </p>
     * <p>
     * Note that the role making the request must have permission to use the
     * specified KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @return <p>
     *         The KMS key you want to use to encrypt your medical transcription
     *         output.
     *         </p>
     *         <p>
     *         If using a key located in the <b>current</b> Amazon Web Services
     *         account, you can specify your KMS key in one of four ways:
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         Use the KMS key ID itself. For example,
     *         <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use an alias for the KMS key ID. For example,
     *         <code>alias/ExampleAlias</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use the Amazon Resource Name (ARN) for the KMS key ID. For
     *         example,
     *         <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use the ARN for the KMS key alias. For example,
     *         <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     *         </p>
     *         </li>
     *         </ol>
     *         <p>
     *         If using a key located in a <b>different</b> Amazon Web Services
     *         account than the current Amazon Web Services account, you can
     *         specify your KMS key in one of two ways:
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         Use the ARN for the KMS key ID. For example,
     *         <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use the ARN for the KMS key alias. For example,
     *         <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     *         </p>
     *         </li>
     *         </ol>
     *         <p>
     *         If you don't specify an encryption key, your output is encrypted
     *         with the default Amazon S3 key (SSE-S3).
     *         </p>
     *         <p>
     *         If you specify a KMS key to encrypt your output, you must also
     *         specify an output location using the <code>OutputLocation</code>
     *         parameter.
     *         </p>
     *         <p>
     *         Note that the role making the request must have permission to use
     *         the specified KMS key.
     *         </p>
     */
    public String getOutputEncryptionKMSKeyId() {
        return outputEncryptionKMSKeyId;
    }

    /**
     * <p>
     * The KMS key you want to use to encrypt your medical transcription output.
     * </p>
     * <p>
     * If using a key located in the <b>current</b> Amazon Web Services account,
     * you can specify your KMS key in one of four ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the KMS key ID itself. For example,
     * <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an alias for the KMS key ID. For example,
     * <code>alias/ExampleAlias</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the Amazon Resource Name (ARN) for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example,
     * <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If using a key located in a <b>different</b> Amazon Web Services account
     * than the current Amazon Web Services account, you can specify your KMS
     * key in one of two ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the ARN for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example,
     * <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you don't specify an encryption key, your output is encrypted with the
     * default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an
     * output location using the <code>OutputLocation</code> parameter.
     * </p>
     * <p>
     * Note that the role making the request must have permission to use the
     * specified KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param outputEncryptionKMSKeyId <p>
     *            The KMS key you want to use to encrypt your medical
     *            transcription output.
     *            </p>
     *            <p>
     *            If using a key located in the <b>current</b> Amazon Web
     *            Services account, you can specify your KMS key in one of four
     *            ways:
     *            </p>
     *            <ol>
     *            <li>
     *            <p>
     *            Use the KMS key ID itself. For example,
     *            <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Use an alias for the KMS key ID. For example,
     *            <code>alias/ExampleAlias</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Use the Amazon Resource Name (ARN) for the KMS key ID. For
     *            example,
     *            <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Use the ARN for the KMS key alias. For example,
     *            <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     *            </p>
     *            </li>
     *            </ol>
     *            <p>
     *            If using a key located in a <b>different</b> Amazon Web
     *            Services account than the current Amazon Web Services account,
     *            you can specify your KMS key in one of two ways:
     *            </p>
     *            <ol>
     *            <li>
     *            <p>
     *            Use the ARN for the KMS key ID. For example,
     *            <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Use the ARN for the KMS key alias. For example,
     *            <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     *            </p>
     *            </li>
     *            </ol>
     *            <p>
     *            If you don't specify an encryption key, your output is
     *            encrypted with the default Amazon S3 key (SSE-S3).
     *            </p>
     *            <p>
     *            If you specify a KMS key to encrypt your output, you must also
     *            specify an output location using the
     *            <code>OutputLocation</code> parameter.
     *            </p>
     *            <p>
     *            Note that the role making the request must have permission to
     *            use the specified KMS key.
     *            </p>
     */
    public void setOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
        this.outputEncryptionKMSKeyId = outputEncryptionKMSKeyId;
    }

    /**
     * <p>
     * The KMS key you want to use to encrypt your medical transcription output.
     * </p>
     * <p>
     * If using a key located in the <b>current</b> Amazon Web Services account,
     * you can specify your KMS key in one of four ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the KMS key ID itself. For example,
     * <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an alias for the KMS key ID. For example,
     * <code>alias/ExampleAlias</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the Amazon Resource Name (ARN) for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example,
     * <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If using a key located in a <b>different</b> Amazon Web Services account
     * than the current Amazon Web Services account, you can specify your KMS
     * key in one of two ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the ARN for the KMS key ID. For example,
     * <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the ARN for the KMS key alias. For example,
     * <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you don't specify an encryption key, your output is encrypted with the
     * default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an
     * output location using the <code>OutputLocation</code> parameter.
     * </p>
     * <p>
     * Note that the role making the request must have permission to use the
     * specified KMS key.
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
     *            The KMS key you want to use to encrypt your medical
     *            transcription output.
     *            </p>
     *            <p>
     *            If using a key located in the <b>current</b> Amazon Web
     *            Services account, you can specify your KMS key in one of four
     *            ways:
     *            </p>
     *            <ol>
     *            <li>
     *            <p>
     *            Use the KMS key ID itself. For example,
     *            <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Use an alias for the KMS key ID. For example,
     *            <code>alias/ExampleAlias</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Use the Amazon Resource Name (ARN) for the KMS key ID. For
     *            example,
     *            <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Use the ARN for the KMS key alias. For example,
     *            <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     *            </p>
     *            </li>
     *            </ol>
     *            <p>
     *            If using a key located in a <b>different</b> Amazon Web
     *            Services account than the current Amazon Web Services account,
     *            you can specify your KMS key in one of two ways:
     *            </p>
     *            <ol>
     *            <li>
     *            <p>
     *            Use the ARN for the KMS key ID. For example,
     *            <code>arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Use the ARN for the KMS key alias. For example,
     *            <code>arn:aws:kms:region:account-ID:alias/ExampleAlias</code>.
     *            </p>
     *            </li>
     *            </ol>
     *            <p>
     *            If you don't specify an encryption key, your output is
     *            encrypted with the default Amazon S3 key (SSE-S3).
     *            </p>
     *            <p>
     *            If you specify a KMS key to encrypt your output, you must also
     *            specify an output location using the
     *            <code>OutputLocation</code> parameter.
     *            </p>
     *            <p>
     *            Note that the role making the request must have permission to
     *            use the specified KMS key.
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
     * context pairs, that provide an added layer of security for your data. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/key-management.html#kms-context"
     * >KMS encryption context</a> and <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/symmetric-asymmetric.html"
     * >Asymmetric keys in KMS</a>.
     * </p>
     *
     * @return <p>
     *         A map of plain text, non-secret key:value pairs, known as
     *         encryption context pairs, that provide an added layer of security
     *         for your data. For more information, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/key-management.html#kms-context"
     *         >KMS encryption context</a> and <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/symmetric-asymmetric.html"
     *         >Asymmetric keys in KMS</a>.
     *         </p>
     */
    public java.util.Map<String, String> getKMSEncryptionContext() {
        return kMSEncryptionContext;
    }

    /**
     * <p>
     * A map of plain text, non-secret key:value pairs, known as encryption
     * context pairs, that provide an added layer of security for your data. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/key-management.html#kms-context"
     * >KMS encryption context</a> and <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/symmetric-asymmetric.html"
     * >Asymmetric keys in KMS</a>.
     * </p>
     *
     * @param kMSEncryptionContext <p>
     *            A map of plain text, non-secret key:value pairs, known as
     *            encryption context pairs, that provide an added layer of
     *            security for your data. For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/key-management.html#kms-context"
     *            >KMS encryption context</a> and <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/symmetric-asymmetric.html"
     *            >Asymmetric keys in KMS</a>.
     *            </p>
     */
    public void setKMSEncryptionContext(java.util.Map<String, String> kMSEncryptionContext) {
        this.kMSEncryptionContext = kMSEncryptionContext;
    }

    /**
     * <p>
     * A map of plain text, non-secret key:value pairs, known as encryption
     * context pairs, that provide an added layer of security for your data. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/key-management.html#kms-context"
     * >KMS encryption context</a> and <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/symmetric-asymmetric.html"
     * >Asymmetric keys in KMS</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kMSEncryptionContext <p>
     *            A map of plain text, non-secret key:value pairs, known as
     *            encryption context pairs, that provide an added layer of
     *            security for your data. For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/key-management.html#kms-context"
     *            >KMS encryption context</a> and <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/symmetric-asymmetric.html"
     *            >Asymmetric keys in KMS</a>.
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
     * context pairs, that provide an added layer of security for your data. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/key-management.html#kms-context"
     * >KMS encryption context</a> and <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/symmetric-asymmetric.html"
     * >Asymmetric keys in KMS</a>.
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
     * Specify additional optional settings in your request, including channel
     * identification, alternative transcriptions, and speaker partitioning. You
     * can use that to apply custom vocabularies to your transcription job.
     * </p>
     *
     * @return <p>
     *         Specify additional optional settings in your request, including
     *         channel identification, alternative transcriptions, and speaker
     *         partitioning. You can use that to apply custom vocabularies to
     *         your transcription job.
     *         </p>
     */
    public MedicalTranscriptionSetting getSettings() {
        return settings;
    }

    /**
     * <p>
     * Specify additional optional settings in your request, including channel
     * identification, alternative transcriptions, and speaker partitioning. You
     * can use that to apply custom vocabularies to your transcription job.
     * </p>
     *
     * @param settings <p>
     *            Specify additional optional settings in your request,
     *            including channel identification, alternative transcriptions,
     *            and speaker partitioning. You can use that to apply custom
     *            vocabularies to your transcription job.
     *            </p>
     */
    public void setSettings(MedicalTranscriptionSetting settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Specify additional optional settings in your request, including channel
     * identification, alternative transcriptions, and speaker partitioning. You
     * can use that to apply custom vocabularies to your transcription job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            Specify additional optional settings in your request,
     *            including channel identification, alternative transcriptions,
     *            and speaker partitioning. You can use that to apply custom
     *            vocabularies to your transcription job.
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
     * Labels all personal health information (PHI) identified in your
     * transcript. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html"
     * >Identifying personal health information (PHI) in a transcription</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @return <p>
     *         Labels all personal health information (PHI) identified in your
     *         transcript. For more information, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html"
     *         >Identifying personal health information (PHI) in a
     *         transcription</a>.
     *         </p>
     * @see MedicalContentIdentificationType
     */
    public String getContentIdentificationType() {
        return contentIdentificationType;
    }

    /**
     * <p>
     * Labels all personal health information (PHI) identified in your
     * transcript. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html"
     * >Identifying personal health information (PHI) in a transcription</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @param contentIdentificationType <p>
     *            Labels all personal health information (PHI) identified in
     *            your transcript. For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html"
     *            >Identifying personal health information (PHI) in a
     *            transcription</a>.
     *            </p>
     * @see MedicalContentIdentificationType
     */
    public void setContentIdentificationType(String contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType;
    }

    /**
     * <p>
     * Labels all personal health information (PHI) identified in your
     * transcript. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html"
     * >Identifying personal health information (PHI) in a transcription</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @param contentIdentificationType <p>
     *            Labels all personal health information (PHI) identified in
     *            your transcript. For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html"
     *            >Identifying personal health information (PHI) in a
     *            transcription</a>.
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
     * Labels all personal health information (PHI) identified in your
     * transcript. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html"
     * >Identifying personal health information (PHI) in a transcription</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @param contentIdentificationType <p>
     *            Labels all personal health information (PHI) identified in
     *            your transcript. For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html"
     *            >Identifying personal health information (PHI) in a
     *            transcription</a>.
     *            </p>
     * @see MedicalContentIdentificationType
     */
    public void setContentIdentificationType(
            MedicalContentIdentificationType contentIdentificationType) {
        this.contentIdentificationType = contentIdentificationType.toString();
    }

    /**
     * <p>
     * Labels all personal health information (PHI) identified in your
     * transcript. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html"
     * >Identifying personal health information (PHI) in a transcription</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PHI
     *
     * @param contentIdentificationType <p>
     *            Labels all personal health information (PHI) identified in
     *            your transcript. For more information, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/phi-id.html"
     *            >Identifying personal health information (PHI) in a
     *            transcription</a>.
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
     * Specify the predominant medical specialty represented in your media. For
     * batch transcriptions, <code>PRIMARYCARE</code> is the only valid value.
     * If you require additional specialties, refer to .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     *
     * @return <p>
     *         Specify the predominant medical specialty represented in your
     *         media. For batch transcriptions, <code>PRIMARYCARE</code> is the
     *         only valid value. If you require additional specialties, refer to
     *         .
     *         </p>
     * @see Specialty
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * <p>
     * Specify the predominant medical specialty represented in your media. For
     * batch transcriptions, <code>PRIMARYCARE</code> is the only valid value.
     * If you require additional specialties, refer to .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     *
     * @param specialty <p>
     *            Specify the predominant medical specialty represented in your
     *            media. For batch transcriptions, <code>PRIMARYCARE</code> is
     *            the only valid value. If you require additional specialties,
     *            refer to .
     *            </p>
     * @see Specialty
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * <p>
     * Specify the predominant medical specialty represented in your media. For
     * batch transcriptions, <code>PRIMARYCARE</code> is the only valid value.
     * If you require additional specialties, refer to .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     *
     * @param specialty <p>
     *            Specify the predominant medical specialty represented in your
     *            media. For batch transcriptions, <code>PRIMARYCARE</code> is
     *            the only valid value. If you require additional specialties,
     *            refer to .
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
     * Specify the predominant medical specialty represented in your media. For
     * batch transcriptions, <code>PRIMARYCARE</code> is the only valid value.
     * If you require additional specialties, refer to .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     *
     * @param specialty <p>
     *            Specify the predominant medical specialty represented in your
     *            media. For batch transcriptions, <code>PRIMARYCARE</code> is
     *            the only valid value. If you require additional specialties,
     *            refer to .
     *            </p>
     * @see Specialty
     */
    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty.toString();
    }

    /**
     * <p>
     * Specify the predominant medical specialty represented in your media. For
     * batch transcriptions, <code>PRIMARYCARE</code> is the only valid value.
     * If you require additional specialties, refer to .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARYCARE
     *
     * @param specialty <p>
     *            Specify the predominant medical specialty represented in your
     *            media. For batch transcriptions, <code>PRIMARYCARE</code> is
     *            the only valid value. If you require additional specialties,
     *            refer to .
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
     * Specify whether your input media contains only one person (
     * <code>DICTATION</code>) or contains a conversation between two people (
     * <code>CONVERSATION</code>).
     * </p>
     * <p>
     * For example, <code>DICTATION</code> could be used for a medical
     * professional wanting to transcribe voice memos; <code>CONVERSATION</code>
     * could be used for transcribing the doctor-patient dialogue during the
     * patient's office visit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @return <p>
     *         Specify whether your input media contains only one person (
     *         <code>DICTATION</code>) or contains a conversation between two
     *         people (<code>CONVERSATION</code>).
     *         </p>
     *         <p>
     *         For example, <code>DICTATION</code> could be used for a medical
     *         professional wanting to transcribe voice memos;
     *         <code>CONVERSATION</code> could be used for transcribing the
     *         doctor-patient dialogue during the patient's office visit.
     *         </p>
     * @see Type
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Specify whether your input media contains only one person (
     * <code>DICTATION</code>) or contains a conversation between two people (
     * <code>CONVERSATION</code>).
     * </p>
     * <p>
     * For example, <code>DICTATION</code> could be used for a medical
     * professional wanting to transcribe voice memos; <code>CONVERSATION</code>
     * could be used for transcribing the doctor-patient dialogue during the
     * patient's office visit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            Specify whether your input media contains only one person (
     *            <code>DICTATION</code>) or contains a conversation between two
     *            people (<code>CONVERSATION</code>).
     *            </p>
     *            <p>
     *            For example, <code>DICTATION</code> could be used for a
     *            medical professional wanting to transcribe voice memos;
     *            <code>CONVERSATION</code> could be used for transcribing the
     *            doctor-patient dialogue during the patient's office visit.
     *            </p>
     * @see Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specify whether your input media contains only one person (
     * <code>DICTATION</code>) or contains a conversation between two people (
     * <code>CONVERSATION</code>).
     * </p>
     * <p>
     * For example, <code>DICTATION</code> could be used for a medical
     * professional wanting to transcribe voice memos; <code>CONVERSATION</code>
     * could be used for transcribing the doctor-patient dialogue during the
     * patient's office visit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            Specify whether your input media contains only one person (
     *            <code>DICTATION</code>) or contains a conversation between two
     *            people (<code>CONVERSATION</code>).
     *            </p>
     *            <p>
     *            For example, <code>DICTATION</code> could be used for a
     *            medical professional wanting to transcribe voice memos;
     *            <code>CONVERSATION</code> could be used for transcribing the
     *            doctor-patient dialogue during the patient's office visit.
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
     * Specify whether your input media contains only one person (
     * <code>DICTATION</code>) or contains a conversation between two people (
     * <code>CONVERSATION</code>).
     * </p>
     * <p>
     * For example, <code>DICTATION</code> could be used for a medical
     * professional wanting to transcribe voice memos; <code>CONVERSATION</code>
     * could be used for transcribing the doctor-patient dialogue during the
     * patient's office visit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            Specify whether your input media contains only one person (
     *            <code>DICTATION</code>) or contains a conversation between two
     *            people (<code>CONVERSATION</code>).
     *            </p>
     *            <p>
     *            For example, <code>DICTATION</code> could be used for a
     *            medical professional wanting to transcribe voice memos;
     *            <code>CONVERSATION</code> could be used for transcribing the
     *            doctor-patient dialogue during the patient's office visit.
     *            </p>
     * @see Type
     */
    public void setType(Type type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Specify whether your input media contains only one person (
     * <code>DICTATION</code>) or contains a conversation between two people (
     * <code>CONVERSATION</code>).
     * </p>
     * <p>
     * For example, <code>DICTATION</code> could be used for a medical
     * professional wanting to transcribe voice memos; <code>CONVERSATION</code>
     * could be used for transcribing the doctor-patient dialogue during the
     * patient's office visit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERSATION, DICTATION
     *
     * @param type <p>
     *            Specify whether your input media contains only one person (
     *            <code>DICTATION</code>) or contains a conversation between two
     *            people (<code>CONVERSATION</code>).
     *            </p>
     *            <p>
     *            For example, <code>DICTATION</code> could be used for a
     *            medical professional wanting to transcribe voice memos;
     *            <code>CONVERSATION</code> could be used for transcribing the
     *            doctor-patient dialogue during the patient's office visit.
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
     * Adds one or more custom tags, each in the form of a key:value pair, to a
     * new medical transcription job at the time you start this new job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     *
     * @return <p>
     *         Adds one or more custom tags, each in the form of a key:value
     *         pair, to a new medical transcription job at the time you start
     *         this new job.
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
     * new medical transcription job at the time you start this new job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     *
     * @param tags <p>
     *            Adds one or more custom tags, each in the form of a key:value
     *            pair, to a new medical transcription job at the time you start
     *            this new job.
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
     * new medical transcription job at the time you start this new job.
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
     *            pair, to a new medical transcription job at the time you start
     *            this new job.
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
     * Adds one or more custom tags, each in the form of a key:value pair, to a
     * new medical transcription job at the time you start this new job.
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
     *            pair, to a new medical transcription job at the time you start
     *            this new job.
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
