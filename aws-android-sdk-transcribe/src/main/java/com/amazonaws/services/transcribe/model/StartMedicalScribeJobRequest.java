/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Transcribes patient-clinician conversations and generates clinical notes.
 * </p>
 * <p>
 * Amazon Web Services HealthScribe automatically provides rich conversation
 * transcripts, identifies speaker roles, classifies dialogues, extracts medical
 * terms, and generates preliminary clinical notes. To learn more about these
 * features, refer to <a
 * href="https://docs.aws.amazon.com/transcribe/latest/dg/health-scribe.html"
 * >Amazon Web Services HealthScribe</a>.
 * </p>
 * <p>
 * To make a <code>StartMedicalScribeJob</code> request, you must first upload
 * your media file into an Amazon S3 bucket; you can then specify the Amazon S3
 * location of the file using the <code>Media</code> parameter.
 * </p>
 * <p>
 * You must include the following parameters in your
 * <code>StartMedicalTranscriptionJob</code> request:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>DataAccessRoleArn</code>: The ARN of an IAM role with the these minimum
 * permissions: read permission on input file Amazon S3 bucket specified in
 * <code>Media</code>, write permission on the Amazon S3 bucket specified in
 * <code>OutputBucketName</code>, and full permissions on the KMS key specified
 * in <code>OutputEncryptionKMSKeyId</code> (if set). The role should also allow
 * <code>transcribe.amazonaws.com</code> to assume it.
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
 * <code>MedicalScribeJobName</code>: A custom name you create for your
 * MedicalScribe job that is unique within your Amazon Web Services account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>OutputBucketName</code>: The Amazon S3 bucket where you want your
 * output files stored.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Settings</code>: A <code>MedicalScribeSettings</code> obect that must
 * set exactly one of <code>ShowSpeakerLabels</code> or
 * <code>ChannelIdentification</code> to true. If <code>ShowSpeakerLabels</code>
 * is true, <code>MaxSpeakerLabels</code> must also be set.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ChannelDefinitions</code>: A
 * <code>MedicalScribeChannelDefinitions</code> array should be set if and only
 * if the <code>ChannelIdentification</code> value of <code>Settings</code> is
 * set to true.
 * </p>
 * </li>
 * </ul>
 */
public class StartMedicalScribeJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique name, chosen by you, for your Medical Scribe job.
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
    private String medicalScribeJobName;

    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in
     * your request.
     * </p>
     * <p>
     * For information on supported media formats, refer to the
     * <code>MediaFormat</code> parameter or the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
     * >Media formats</a> section in the Amazon S3 Developer Guide.
     * </p>
     */
    private Media media;

    /**
     * <p>
     * The name of the Amazon S3 bucket where you want your Medical Scribe
     * output stored. Do not include the <code>S3://</code> prefix of the
     * specified bucket.
     * </p>
     * <p>
     * Note that the role specified in the <code>DataAccessRoleArn</code>
     * request parameter must have permission to use the specified location. You
     * can change Amazon S3 permissions using the <a
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
     * The KMS key you want to use to encrypt your Medical Scribe output.
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
     * If you do not specify an encryption key, your output is encrypted with
     * the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * Note that the role specified in the <code>DataAccessRoleArn</code>
     * request parameter must have permission to use the specified KMS key.
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
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files, write to the
     * output bucket, and use your KMS key if supplied. If the role that you
     * specify doesn’t have the appropriate permissions your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format
     * <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
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
     * Makes it possible to control how your Medical Scribe job is processed
     * using a <code>MedicalScribeSettings</code> object. Specify
     * <code>ChannelIdentification</code> if <code>ChannelDefinitions</code> are
     * set. Enabled <code>ShowSpeakerLabels</code> if
     * <code>ChannelIdentification</code> and <code>ChannelDefinitions</code>
     * are not set. One and only one of <code>ChannelIdentification</code> and
     * <code>ShowSpeakerLabels</code> must be set. If
     * <code>ShowSpeakerLabels</code> is set, <code>MaxSpeakerLabels</code> must
     * also be set. Use <code>Settings</code> to specify a vocabulary or
     * vocabulary filter or both using <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>. <code>VocabularyFilterMethod</code>
     * must be specified if <code>VocabularyFilterName</code> is set.
     * </p>
     */
    private MedicalScribeSettings settings;

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For
     * example, if the clinician is the first participant to speak, you would
     * set <code>ChannelId</code> of the first <code>ChannelDefinition</code> in
     * the list to <code>0</code> (to indicate the first channel) and
     * <code>ParticipantRole</code> to <code>CLINICIAN</code> (to indicate that
     * it's the clinician speaking). Then you would set the
     * <code>ChannelId</code> of the second <code>ChannelDefinition</code> in
     * the list to <code>1</code> (to indicate the second channel) and
     * <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate that
     * it's the patient speaking).
     * </p>
     */
    private java.util.List<MedicalScribeChannelDefinition> channelDefinitions;

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to
     * the Medica Scribe job.
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
     * A unique name, chosen by you, for your Medical Scribe job.
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
     *         A unique name, chosen by you, for your Medical Scribe job.
     *         </p>
     *         <p>
     *         This name is case sensitive, cannot contain spaces, and must be
     *         unique within an Amazon Web Services account. If you try to
     *         create a new job with the same name as an existing job, you get a
     *         <code>ConflictException</code> error.
     *         </p>
     */
    public String getMedicalScribeJobName() {
        return medicalScribeJobName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your Medical Scribe job.
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
     * @param medicalScribeJobName <p>
     *            A unique name, chosen by you, for your Medical Scribe job.
     *            </p>
     *            <p>
     *            This name is case sensitive, cannot contain spaces, and must
     *            be unique within an Amazon Web Services account. If you try to
     *            create a new job with the same name as an existing job, you
     *            get a <code>ConflictException</code> error.
     *            </p>
     */
    public void setMedicalScribeJobName(String medicalScribeJobName) {
        this.medicalScribeJobName = medicalScribeJobName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your Medical Scribe job.
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
     * @param medicalScribeJobName <p>
     *            A unique name, chosen by you, for your Medical Scribe job.
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
    public StartMedicalScribeJobRequest withMedicalScribeJobName(String medicalScribeJobName) {
        this.medicalScribeJobName = medicalScribeJobName;
        return this;
    }

    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in
     * your request.
     * </p>
     * <p>
     * For information on supported media formats, refer to the
     * <code>MediaFormat</code> parameter or the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
     * >Media formats</a> section in the Amazon S3 Developer Guide.
     * </p>
     *
     * @return <p>
     *         Describes the Amazon S3 location of the media file you want to
     *         use in your request.
     *         </p>
     *         <p>
     *         For information on supported media formats, refer to the
     *         <code>MediaFormat</code> parameter or the <a href=
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
     * For information on supported media formats, refer to the
     * <code>MediaFormat</code> parameter or the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
     * >Media formats</a> section in the Amazon S3 Developer Guide.
     * </p>
     *
     * @param media <p>
     *            Describes the Amazon S3 location of the media file you want to
     *            use in your request.
     *            </p>
     *            <p>
     *            For information on supported media formats, refer to the
     *            <code>MediaFormat</code> parameter or the <a href=
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
     * For information on supported media formats, refer to the
     * <code>MediaFormat</code> parameter or the <a href=
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
     *            For information on supported media formats, refer to the
     *            <code>MediaFormat</code> parameter or the <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio"
     *            >Media formats</a> section in the Amazon S3 Developer Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMedicalScribeJobRequest withMedia(Media media) {
        this.media = media;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where you want your Medical Scribe
     * output stored. Do not include the <code>S3://</code> prefix of the
     * specified bucket.
     * </p>
     * <p>
     * Note that the role specified in the <code>DataAccessRoleArn</code>
     * request parameter must have permission to use the specified location. You
     * can change Amazon S3 permissions using the <a
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
     *         The name of the Amazon S3 bucket where you want your Medical
     *         Scribe output stored. Do not include the <code>S3://</code>
     *         prefix of the specified bucket.
     *         </p>
     *         <p>
     *         Note that the role specified in the
     *         <code>DataAccessRoleArn</code> request parameter must have
     *         permission to use the specified location. You can change Amazon
     *         S3 permissions using the <a
     *         href="https://console.aws.amazon.com/s3">Amazon Web Services
     *         Management Console</a>. See also <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *         >Permissions Required for IAM User Roles</a>.
     *         </p>
     */
    public String getOutputBucketName() {
        return outputBucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where you want your Medical Scribe
     * output stored. Do not include the <code>S3://</code> prefix of the
     * specified bucket.
     * </p>
     * <p>
     * Note that the role specified in the <code>DataAccessRoleArn</code>
     * request parameter must have permission to use the specified location. You
     * can change Amazon S3 permissions using the <a
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
     *            The name of the Amazon S3 bucket where you want your Medical
     *            Scribe output stored. Do not include the <code>S3://</code>
     *            prefix of the specified bucket.
     *            </p>
     *            <p>
     *            Note that the role specified in the
     *            <code>DataAccessRoleArn</code> request parameter must have
     *            permission to use the specified location. You can change
     *            Amazon S3 permissions using the <a
     *            href="https://console.aws.amazon.com/s3">Amazon Web Services
     *            Management Console</a>. See also <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *            >Permissions Required for IAM User Roles</a>.
     *            </p>
     */
    public void setOutputBucketName(String outputBucketName) {
        this.outputBucketName = outputBucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where you want your Medical Scribe
     * output stored. Do not include the <code>S3://</code> prefix of the
     * specified bucket.
     * </p>
     * <p>
     * Note that the role specified in the <code>DataAccessRoleArn</code>
     * request parameter must have permission to use the specified location. You
     * can change Amazon S3 permissions using the <a
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
     *            The name of the Amazon S3 bucket where you want your Medical
     *            Scribe output stored. Do not include the <code>S3://</code>
     *            prefix of the specified bucket.
     *            </p>
     *            <p>
     *            Note that the role specified in the
     *            <code>DataAccessRoleArn</code> request parameter must have
     *            permission to use the specified location. You can change
     *            Amazon S3 permissions using the <a
     *            href="https://console.aws.amazon.com/s3">Amazon Web Services
     *            Management Console</a>. See also <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/security_iam_id-based-policy-examples.html#auth-role-iam-user"
     *            >Permissions Required for IAM User Roles</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMedicalScribeJobRequest withOutputBucketName(String outputBucketName) {
        this.outputBucketName = outputBucketName;
        return this;
    }

    /**
     * <p>
     * The KMS key you want to use to encrypt your Medical Scribe output.
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
     * If you do not specify an encryption key, your output is encrypted with
     * the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * Note that the role specified in the <code>DataAccessRoleArn</code>
     * request parameter must have permission to use the specified KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @return <p>
     *         The KMS key you want to use to encrypt your Medical Scribe
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
     *         If you do not specify an encryption key, your output is encrypted
     *         with the default Amazon S3 key (SSE-S3).
     *         </p>
     *         <p>
     *         Note that the role specified in the
     *         <code>DataAccessRoleArn</code> request parameter must have
     *         permission to use the specified KMS key.
     *         </p>
     */
    public String getOutputEncryptionKMSKeyId() {
        return outputEncryptionKMSKeyId;
    }

    /**
     * <p>
     * The KMS key you want to use to encrypt your Medical Scribe output.
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
     * If you do not specify an encryption key, your output is encrypted with
     * the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * Note that the role specified in the <code>DataAccessRoleArn</code>
     * request parameter must have permission to use the specified KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param outputEncryptionKMSKeyId <p>
     *            The KMS key you want to use to encrypt your Medical Scribe
     *            output.
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
     *            If you do not specify an encryption key, your output is
     *            encrypted with the default Amazon S3 key (SSE-S3).
     *            </p>
     *            <p>
     *            Note that the role specified in the
     *            <code>DataAccessRoleArn</code> request parameter must have
     *            permission to use the specified KMS key.
     *            </p>
     */
    public void setOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
        this.outputEncryptionKMSKeyId = outputEncryptionKMSKeyId;
    }

    /**
     * <p>
     * The KMS key you want to use to encrypt your Medical Scribe output.
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
     * If you do not specify an encryption key, your output is encrypted with
     * the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * Note that the role specified in the <code>DataAccessRoleArn</code>
     * request parameter must have permission to use the specified KMS key.
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
     *            The KMS key you want to use to encrypt your Medical Scribe
     *            output.
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
     *            If you do not specify an encryption key, your output is
     *            encrypted with the default Amazon S3 key (SSE-S3).
     *            </p>
     *            <p>
     *            Note that the role specified in the
     *            <code>DataAccessRoleArn</code> request parameter must have
     *            permission to use the specified KMS key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMedicalScribeJobRequest withOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
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
    public StartMedicalScribeJobRequest withKMSEncryptionContext(
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
    public StartMedicalScribeJobRequest addKMSEncryptionContextEntry(String key, String value) {
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
    public StartMedicalScribeJobRequest clearKMSEncryptionContextEntries() {
        this.kMSEncryptionContext = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files, write to the
     * output bucket, and use your KMS key if supplied. If the role that you
     * specify doesn’t have the appropriate permissions your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format
     * <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an IAM role that has
     *         permissions to access the Amazon S3 bucket that contains your
     *         input files, write to the output bucket, and use your KMS key if
     *         supplied. If the role that you specify doesn’t have the
     *         appropriate permissions your request fails.
     *         </p>
     *         <p>
     *         IAM role ARNs have the format
     *         <code>arn:partition:iam::account:role/role-name-with-path</code>.
     *         For example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     *         >IAM ARNs</a>.
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files, write to the
     * output bucket, and use your KMS key if supplied. If the role that you
     * specify doesn’t have the appropriate permissions your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format
     * <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of an IAM role that has
     *            permissions to access the Amazon S3 bucket that contains your
     *            input files, write to the output bucket, and use your KMS key
     *            if supplied. If the role that you specify doesn’t have the
     *            appropriate permissions your request fails.
     *            </p>
     *            <p>
     *            IAM role ARNs have the format
     *            <code>arn:partition:iam::account:role/role-name-with-path</code>
     *            . For example:
     *            <code>arn:aws:iam::111122223333:role/Admin</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     *            >IAM ARNs</a>.
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files, write to the
     * output bucket, and use your KMS key if supplied. If the role that you
     * specify doesn’t have the appropriate permissions your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format
     * <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     * example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     * >IAM ARNs</a>.
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
     *            The Amazon Resource Name (ARN) of an IAM role that has
     *            permissions to access the Amazon S3 bucket that contains your
     *            input files, write to the output bucket, and use your KMS key
     *            if supplied. If the role that you specify doesn’t have the
     *            appropriate permissions your request fails.
     *            </p>
     *            <p>
     *            IAM role ARNs have the format
     *            <code>arn:partition:iam::account:role/role-name-with-path</code>
     *            . For example:
     *            <code>arn:aws:iam::111122223333:role/Admin</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns"
     *            >IAM ARNs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMedicalScribeJobRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * Makes it possible to control how your Medical Scribe job is processed
     * using a <code>MedicalScribeSettings</code> object. Specify
     * <code>ChannelIdentification</code> if <code>ChannelDefinitions</code> are
     * set. Enabled <code>ShowSpeakerLabels</code> if
     * <code>ChannelIdentification</code> and <code>ChannelDefinitions</code>
     * are not set. One and only one of <code>ChannelIdentification</code> and
     * <code>ShowSpeakerLabels</code> must be set. If
     * <code>ShowSpeakerLabels</code> is set, <code>MaxSpeakerLabels</code> must
     * also be set. Use <code>Settings</code> to specify a vocabulary or
     * vocabulary filter or both using <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>. <code>VocabularyFilterMethod</code>
     * must be specified if <code>VocabularyFilterName</code> is set.
     * </p>
     *
     * @return <p>
     *         Makes it possible to control how your Medical Scribe job is
     *         processed using a <code>MedicalScribeSettings</code> object.
     *         Specify <code>ChannelIdentification</code> if
     *         <code>ChannelDefinitions</code> are set. Enabled
     *         <code>ShowSpeakerLabels</code> if
     *         <code>ChannelIdentification</code> and
     *         <code>ChannelDefinitions</code> are not set. One and only one of
     *         <code>ChannelIdentification</code> and
     *         <code>ShowSpeakerLabels</code> must be set. If
     *         <code>ShowSpeakerLabels</code> is set,
     *         <code>MaxSpeakerLabels</code> must also be set. Use
     *         <code>Settings</code> to specify a vocabulary or vocabulary
     *         filter or both using <code>VocabularyName</code>,
     *         <code>VocabularyFilterName</code>.
     *         <code>VocabularyFilterMethod</code> must be specified if
     *         <code>VocabularyFilterName</code> is set.
     *         </p>
     */
    public MedicalScribeSettings getSettings() {
        return settings;
    }

    /**
     * <p>
     * Makes it possible to control how your Medical Scribe job is processed
     * using a <code>MedicalScribeSettings</code> object. Specify
     * <code>ChannelIdentification</code> if <code>ChannelDefinitions</code> are
     * set. Enabled <code>ShowSpeakerLabels</code> if
     * <code>ChannelIdentification</code> and <code>ChannelDefinitions</code>
     * are not set. One and only one of <code>ChannelIdentification</code> and
     * <code>ShowSpeakerLabels</code> must be set. If
     * <code>ShowSpeakerLabels</code> is set, <code>MaxSpeakerLabels</code> must
     * also be set. Use <code>Settings</code> to specify a vocabulary or
     * vocabulary filter or both using <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>. <code>VocabularyFilterMethod</code>
     * must be specified if <code>VocabularyFilterName</code> is set.
     * </p>
     *
     * @param settings <p>
     *            Makes it possible to control how your Medical Scribe job is
     *            processed using a <code>MedicalScribeSettings</code> object.
     *            Specify <code>ChannelIdentification</code> if
     *            <code>ChannelDefinitions</code> are set. Enabled
     *            <code>ShowSpeakerLabels</code> if
     *            <code>ChannelIdentification</code> and
     *            <code>ChannelDefinitions</code> are not set. One and only one
     *            of <code>ChannelIdentification</code> and
     *            <code>ShowSpeakerLabels</code> must be set. If
     *            <code>ShowSpeakerLabels</code> is set,
     *            <code>MaxSpeakerLabels</code> must also be set. Use
     *            <code>Settings</code> to specify a vocabulary or vocabulary
     *            filter or both using <code>VocabularyName</code>,
     *            <code>VocabularyFilterName</code>.
     *            <code>VocabularyFilterMethod</code> must be specified if
     *            <code>VocabularyFilterName</code> is set.
     *            </p>
     */
    public void setSettings(MedicalScribeSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Makes it possible to control how your Medical Scribe job is processed
     * using a <code>MedicalScribeSettings</code> object. Specify
     * <code>ChannelIdentification</code> if <code>ChannelDefinitions</code> are
     * set. Enabled <code>ShowSpeakerLabels</code> if
     * <code>ChannelIdentification</code> and <code>ChannelDefinitions</code>
     * are not set. One and only one of <code>ChannelIdentification</code> and
     * <code>ShowSpeakerLabels</code> must be set. If
     * <code>ShowSpeakerLabels</code> is set, <code>MaxSpeakerLabels</code> must
     * also be set. Use <code>Settings</code> to specify a vocabulary or
     * vocabulary filter or both using <code>VocabularyName</code>,
     * <code>VocabularyFilterName</code>. <code>VocabularyFilterMethod</code>
     * must be specified if <code>VocabularyFilterName</code> is set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            Makes it possible to control how your Medical Scribe job is
     *            processed using a <code>MedicalScribeSettings</code> object.
     *            Specify <code>ChannelIdentification</code> if
     *            <code>ChannelDefinitions</code> are set. Enabled
     *            <code>ShowSpeakerLabels</code> if
     *            <code>ChannelIdentification</code> and
     *            <code>ChannelDefinitions</code> are not set. One and only one
     *            of <code>ChannelIdentification</code> and
     *            <code>ShowSpeakerLabels</code> must be set. If
     *            <code>ShowSpeakerLabels</code> is set,
     *            <code>MaxSpeakerLabels</code> must also be set. Use
     *            <code>Settings</code> to specify a vocabulary or vocabulary
     *            filter or both using <code>VocabularyName</code>,
     *            <code>VocabularyFilterName</code>.
     *            <code>VocabularyFilterMethod</code> must be specified if
     *            <code>VocabularyFilterName</code> is set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMedicalScribeJobRequest withSettings(MedicalScribeSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For
     * example, if the clinician is the first participant to speak, you would
     * set <code>ChannelId</code> of the first <code>ChannelDefinition</code> in
     * the list to <code>0</code> (to indicate the first channel) and
     * <code>ParticipantRole</code> to <code>CLINICIAN</code> (to indicate that
     * it's the clinician speaking). Then you would set the
     * <code>ChannelId</code> of the second <code>ChannelDefinition</code> in
     * the list to <code>1</code> (to indicate the second channel) and
     * <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate that
     * it's the patient speaking).
     * </p>
     *
     * @return <p>
     *         Makes it possible to specify which speaker is on which channel.
     *         For example, if the clinician is the first participant to speak,
     *         you would set <code>ChannelId</code> of the first
     *         <code>ChannelDefinition</code> in the list to <code>0</code> (to
     *         indicate the first channel) and <code>ParticipantRole</code> to
     *         <code>CLINICIAN</code> (to indicate that it's the clinician
     *         speaking). Then you would set the <code>ChannelId</code> of the
     *         second <code>ChannelDefinition</code> in the list to
     *         <code>1</code> (to indicate the second channel) and
     *         <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate
     *         that it's the patient speaking).
     *         </p>
     */
    public java.util.List<MedicalScribeChannelDefinition> getChannelDefinitions() {
        return channelDefinitions;
    }

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For
     * example, if the clinician is the first participant to speak, you would
     * set <code>ChannelId</code> of the first <code>ChannelDefinition</code> in
     * the list to <code>0</code> (to indicate the first channel) and
     * <code>ParticipantRole</code> to <code>CLINICIAN</code> (to indicate that
     * it's the clinician speaking). Then you would set the
     * <code>ChannelId</code> of the second <code>ChannelDefinition</code> in
     * the list to <code>1</code> (to indicate the second channel) and
     * <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate that
     * it's the patient speaking).
     * </p>
     *
     * @param channelDefinitions <p>
     *            Makes it possible to specify which speaker is on which
     *            channel. For example, if the clinician is the first
     *            participant to speak, you would set <code>ChannelId</code> of
     *            the first <code>ChannelDefinition</code> in the list to
     *            <code>0</code> (to indicate the first channel) and
     *            <code>ParticipantRole</code> to <code>CLINICIAN</code> (to
     *            indicate that it's the clinician speaking). Then you would set
     *            the <code>ChannelId</code> of the second
     *            <code>ChannelDefinition</code> in the list to <code>1</code>
     *            (to indicate the second channel) and
     *            <code>ParticipantRole</code> to <code>PATIENT</code> (to
     *            indicate that it's the patient speaking).
     *            </p>
     */
    public void setChannelDefinitions(
            java.util.Collection<MedicalScribeChannelDefinition> channelDefinitions) {
        if (channelDefinitions == null) {
            this.channelDefinitions = null;
            return;
        }

        this.channelDefinitions = new java.util.ArrayList<MedicalScribeChannelDefinition>(
                channelDefinitions);
    }

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For
     * example, if the clinician is the first participant to speak, you would
     * set <code>ChannelId</code> of the first <code>ChannelDefinition</code> in
     * the list to <code>0</code> (to indicate the first channel) and
     * <code>ParticipantRole</code> to <code>CLINICIAN</code> (to indicate that
     * it's the clinician speaking). Then you would set the
     * <code>ChannelId</code> of the second <code>ChannelDefinition</code> in
     * the list to <code>1</code> (to indicate the second channel) and
     * <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate that
     * it's the patient speaking).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelDefinitions <p>
     *            Makes it possible to specify which speaker is on which
     *            channel. For example, if the clinician is the first
     *            participant to speak, you would set <code>ChannelId</code> of
     *            the first <code>ChannelDefinition</code> in the list to
     *            <code>0</code> (to indicate the first channel) and
     *            <code>ParticipantRole</code> to <code>CLINICIAN</code> (to
     *            indicate that it's the clinician speaking). Then you would set
     *            the <code>ChannelId</code> of the second
     *            <code>ChannelDefinition</code> in the list to <code>1</code>
     *            (to indicate the second channel) and
     *            <code>ParticipantRole</code> to <code>PATIENT</code> (to
     *            indicate that it's the patient speaking).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMedicalScribeJobRequest withChannelDefinitions(
            MedicalScribeChannelDefinition... channelDefinitions) {
        if (getChannelDefinitions() == null) {
            this.channelDefinitions = new java.util.ArrayList<MedicalScribeChannelDefinition>(
                    channelDefinitions.length);
        }
        for (MedicalScribeChannelDefinition value : channelDefinitions) {
            this.channelDefinitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For
     * example, if the clinician is the first participant to speak, you would
     * set <code>ChannelId</code> of the first <code>ChannelDefinition</code> in
     * the list to <code>0</code> (to indicate the first channel) and
     * <code>ParticipantRole</code> to <code>CLINICIAN</code> (to indicate that
     * it's the clinician speaking). Then you would set the
     * <code>ChannelId</code> of the second <code>ChannelDefinition</code> in
     * the list to <code>1</code> (to indicate the second channel) and
     * <code>ParticipantRole</code> to <code>PATIENT</code> (to indicate that
     * it's the patient speaking).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelDefinitions <p>
     *            Makes it possible to specify which speaker is on which
     *            channel. For example, if the clinician is the first
     *            participant to speak, you would set <code>ChannelId</code> of
     *            the first <code>ChannelDefinition</code> in the list to
     *            <code>0</code> (to indicate the first channel) and
     *            <code>ParticipantRole</code> to <code>CLINICIAN</code> (to
     *            indicate that it's the clinician speaking). Then you would set
     *            the <code>ChannelId</code> of the second
     *            <code>ChannelDefinition</code> in the list to <code>1</code>
     *            (to indicate the second channel) and
     *            <code>ParticipantRole</code> to <code>PATIENT</code> (to
     *            indicate that it's the patient speaking).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartMedicalScribeJobRequest withChannelDefinitions(
            java.util.Collection<MedicalScribeChannelDefinition> channelDefinitions) {
        setChannelDefinitions(channelDefinitions);
        return this;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to
     * the Medica Scribe job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     *
     * @return <p>
     *         Adds one or more custom tags, each in the form of a key:value
     *         pair, to the Medica Scribe job.
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
     * Adds one or more custom tags, each in the form of a key:value pair, to
     * the Medica Scribe job.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
     * </p>
     *
     * @param tags <p>
     *            Adds one or more custom tags, each in the form of a key:value
     *            pair, to the Medica Scribe job.
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
     * Adds one or more custom tags, each in the form of a key:value pair, to
     * the Medica Scribe job.
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
     *            pair, to the Medica Scribe job.
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
    public StartMedicalScribeJobRequest withTags(Tag... tags) {
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
     * Adds one or more custom tags, each in the form of a key:value pair, to
     * the Medica Scribe job.
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
     *            pair, to the Medica Scribe job.
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
    public StartMedicalScribeJobRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getMedicalScribeJobName() != null)
            sb.append("MedicalScribeJobName: " + getMedicalScribeJobName() + ",");
        if (getMedia() != null)
            sb.append("Media: " + getMedia() + ",");
        if (getOutputBucketName() != null)
            sb.append("OutputBucketName: " + getOutputBucketName() + ",");
        if (getOutputEncryptionKMSKeyId() != null)
            sb.append("OutputEncryptionKMSKeyId: " + getOutputEncryptionKMSKeyId() + ",");
        if (getKMSEncryptionContext() != null)
            sb.append("KMSEncryptionContext: " + getKMSEncryptionContext() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings() + ",");
        if (getChannelDefinitions() != null)
            sb.append("ChannelDefinitions: " + getChannelDefinitions() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMedicalScribeJobName() == null) ? 0 : getMedicalScribeJobName().hashCode());
        hashCode = prime * hashCode + ((getMedia() == null) ? 0 : getMedia().hashCode());
        hashCode = prime * hashCode
                + ((getOutputBucketName() == null) ? 0 : getOutputBucketName().hashCode());
        hashCode = prime
                * hashCode
                + ((getOutputEncryptionKMSKeyId() == null) ? 0 : getOutputEncryptionKMSKeyId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getKMSEncryptionContext() == null) ? 0 : getKMSEncryptionContext().hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode
                + ((getChannelDefinitions() == null) ? 0 : getChannelDefinitions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMedicalScribeJobRequest == false)
            return false;
        StartMedicalScribeJobRequest other = (StartMedicalScribeJobRequest) obj;

        if (other.getMedicalScribeJobName() == null ^ this.getMedicalScribeJobName() == null)
            return false;
        if (other.getMedicalScribeJobName() != null
                && other.getMedicalScribeJobName().equals(this.getMedicalScribeJobName()) == false)
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
        if (other.getKMSEncryptionContext() == null ^ this.getKMSEncryptionContext() == null)
            return false;
        if (other.getKMSEncryptionContext() != null
                && other.getKMSEncryptionContext().equals(this.getKMSEncryptionContext()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null
                && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
