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
 * Transcribes the audio from a customer service call and applies any additional
 * Request Parameters you choose to include in your request.
 * </p>
 * <p>
 * In addition to many standard transcription features, Call Analytics provides
 * you with call characteristics, call summarization, speaker sentiment, and
 * optional redaction of your text transcript and your audio file. You can also
 * apply custom categories to flag specified conditions. To learn more about
 * these features and insights, refer to <a
 * href="https://docs.aws.amazon.com/transcribe/latest/dg/call-analytics.html"
 * >Analyzing call center audio with Call Analytics</a>.
 * </p>
 * <p>
 * If you want to apply categories to your Call Analytics job, you must create
 * them before submitting your job request. Categories cannot be retroactively
 * applied to a job. To create a new category, use the operation. To learn more
 * about Call Analytics categories, see <a href=
 * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-batch.html"
 * >Creating categories for post-call transcriptions</a> and <a href=
 * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-stream.html"
 * >Creating categories for real-time transcriptions</a>.
 * </p>
 * <p>
 * To make a <code>StartCallAnalyticsJob</code> request, you must first upload
 * your media file into an Amazon S3 bucket; you can then specify the Amazon S3
 * location of the file using the <code>Media</code> parameter.
 * </p>
 * <p>
 * Note that job queuing is enabled by default for Call Analytics jobs.
 * </p>
 * <p>
 * You must include the following parameters in your
 * <code>StartCallAnalyticsJob</code> request:
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
 * <code>CallAnalyticsJobName</code>: A custom name that you create for your
 * transcription job that's unique within your Amazon Web Services account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DataAccessRoleArn</code>: The Amazon Resource Name (ARN) of an IAM role
 * that has permissions to access the Amazon S3 bucket that contains your input
 * files.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Media</code> (<code>MediaFileUri</code> or
 * <code>RedactedMediaFileUri</code>): The Amazon S3 location of your media
 * file.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * With Call Analytics, you can redact the audio contained in your media file by
 * including <code>RedactedMediaFileUri</code>, instead of
 * <code>MediaFileUri</code>, to specify the location of your input audio. If
 * you choose to redact your audio, you can find your redacted media at the
 * location specified in the <code>RedactedMediaFileUri</code> field of your
 * response.
 * </p>
 * </note>
 */
public class StartCallAnalyticsJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique name, chosen by you, for your Call Analytics job.
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
    private String callAnalyticsJobName;

    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in
     * your Call Analytics request.
     * </p>
     */
    private Media media;

    /**
     * <p>
     * The Amazon S3 location where you want your Call Analytics transcription
     * output stored. You can use any of the following formats to specify the
     * output location:
     * </p>
     * <ol>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET/my-output-folder/
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET/my-output-folder/my-call-analytics-job.json
     * </p>
     * </li>
     * </ol>
     * <p>
     * Unless you specify a file name (option 3), the name of your output file
     * has a default value that matches the name you specified for your
     * transcription job using the <code>CallAnalyticsJobName</code> parameter.
     * </p>
     * <p>
     * You can specify a KMS key to encrypt your output using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a
     * KMS key, Amazon Transcribe uses the default Amazon S3 key for server-side
     * encryption.
     * </p>
     * <p>
     * If you don't specify <code>OutputLocation</code>, your transcript is
     * placed in a service-managed Amazon S3 bucket and you are provided with a
     * URI to access your transcript.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     */
    private String outputLocation;

    /**
     * <p>
     * The KMS key you want to use to encrypt your Call Analytics output.
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
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files. If the role
     * that you specify doesn’t have the appropriate permissions to access the
     * specified Amazon S3 location, your request fails.
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
     * Specify additional optional settings in your request, including content
     * redaction; allows you to apply custom language models, vocabulary
     * filters, and custom vocabularies to your Call Analytics job.
     * </p>
     */
    private CallAnalyticsJobSettings settings;

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For
     * example, if your agent is the first participant to speak, you would set
     * <code>ChannelId</code> to <code>0</code> (to indicate the first channel)
     * and <code>ParticipantRole</code> to <code>AGENT</code> (to indicate that
     * it's the agent speaking).
     * </p>
     */
    private java.util.List<ChannelDefinition> channelDefinitions;

    /**
     * <p>
     * A unique name, chosen by you, for your Call Analytics job.
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
     *         A unique name, chosen by you, for your Call Analytics job.
     *         </p>
     *         <p>
     *         This name is case sensitive, cannot contain spaces, and must be
     *         unique within an Amazon Web Services account. If you try to
     *         create a new job with the same name as an existing job, you get a
     *         <code>ConflictException</code> error.
     *         </p>
     */
    public String getCallAnalyticsJobName() {
        return callAnalyticsJobName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your Call Analytics job.
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
     * @param callAnalyticsJobName <p>
     *            A unique name, chosen by you, for your Call Analytics job.
     *            </p>
     *            <p>
     *            This name is case sensitive, cannot contain spaces, and must
     *            be unique within an Amazon Web Services account. If you try to
     *            create a new job with the same name as an existing job, you
     *            get a <code>ConflictException</code> error.
     *            </p>
     */
    public void setCallAnalyticsJobName(String callAnalyticsJobName) {
        this.callAnalyticsJobName = callAnalyticsJobName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your Call Analytics job.
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
     * @param callAnalyticsJobName <p>
     *            A unique name, chosen by you, for your Call Analytics job.
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
    public StartCallAnalyticsJobRequest withCallAnalyticsJobName(String callAnalyticsJobName) {
        this.callAnalyticsJobName = callAnalyticsJobName;
        return this;
    }

    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in
     * your Call Analytics request.
     * </p>
     *
     * @return <p>
     *         Describes the Amazon S3 location of the media file you want to
     *         use in your Call Analytics request.
     *         </p>
     */
    public Media getMedia() {
        return media;
    }

    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in
     * your Call Analytics request.
     * </p>
     *
     * @param media <p>
     *            Describes the Amazon S3 location of the media file you want to
     *            use in your Call Analytics request.
     *            </p>
     */
    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * <p>
     * Describes the Amazon S3 location of the media file you want to use in
     * your Call Analytics request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param media <p>
     *            Describes the Amazon S3 location of the media file you want to
     *            use in your Call Analytics request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartCallAnalyticsJobRequest withMedia(Media media) {
        this.media = media;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location where you want your Call Analytics transcription
     * output stored. You can use any of the following formats to specify the
     * output location:
     * </p>
     * <ol>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET/my-output-folder/
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET/my-output-folder/my-call-analytics-job.json
     * </p>
     * </li>
     * </ol>
     * <p>
     * Unless you specify a file name (option 3), the name of your output file
     * has a default value that matches the name you specified for your
     * transcription job using the <code>CallAnalyticsJobName</code> parameter.
     * </p>
     * <p>
     * You can specify a KMS key to encrypt your output using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a
     * KMS key, Amazon Transcribe uses the default Amazon S3 key for server-side
     * encryption.
     * </p>
     * <p>
     * If you don't specify <code>OutputLocation</code>, your transcript is
     * placed in a service-managed Amazon S3 bucket and you are provided with a
     * URI to access your transcript.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @return <p>
     *         The Amazon S3 location where you want your Call Analytics
     *         transcription output stored. You can use any of the following
     *         formats to specify the output location:
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         s3://DOC-EXAMPLE-BUCKET
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         s3://DOC-EXAMPLE-BUCKET/my-output-folder/
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         s3://DOC-EXAMPLE-BUCKET/my-output-folder/my-call-analytics-job.
     *         json
     *         </p>
     *         </li>
     *         </ol>
     *         <p>
     *         Unless you specify a file name (option 3), the name of your
     *         output file has a default value that matches the name you
     *         specified for your transcription job using the
     *         <code>CallAnalyticsJobName</code> parameter.
     *         </p>
     *         <p>
     *         You can specify a KMS key to encrypt your output using the
     *         <code>OutputEncryptionKMSKeyId</code> parameter. If you don't
     *         specify a KMS key, Amazon Transcribe uses the default Amazon S3
     *         key for server-side encryption.
     *         </p>
     *         <p>
     *         If you don't specify <code>OutputLocation</code>, your transcript
     *         is placed in a service-managed Amazon S3 bucket and you are
     *         provided with a URI to access your transcript.
     *         </p>
     */
    public String getOutputLocation() {
        return outputLocation;
    }

    /**
     * <p>
     * The Amazon S3 location where you want your Call Analytics transcription
     * output stored. You can use any of the following formats to specify the
     * output location:
     * </p>
     * <ol>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET/my-output-folder/
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET/my-output-folder/my-call-analytics-job.json
     * </p>
     * </li>
     * </ol>
     * <p>
     * Unless you specify a file name (option 3), the name of your output file
     * has a default value that matches the name you specified for your
     * transcription job using the <code>CallAnalyticsJobName</code> parameter.
     * </p>
     * <p>
     * You can specify a KMS key to encrypt your output using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a
     * KMS key, Amazon Transcribe uses the default Amazon S3 key for server-side
     * encryption.
     * </p>
     * <p>
     * If you don't specify <code>OutputLocation</code>, your transcript is
     * placed in a service-managed Amazon S3 bucket and you are provided with a
     * URI to access your transcript.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param outputLocation <p>
     *            The Amazon S3 location where you want your Call Analytics
     *            transcription output stored. You can use any of the following
     *            formats to specify the output location:
     *            </p>
     *            <ol>
     *            <li>
     *            <p>
     *            s3://DOC-EXAMPLE-BUCKET
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            s3://DOC-EXAMPLE-BUCKET/my-output-folder/
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            s3://DOC-EXAMPLE-BUCKET/my-output-folder/my-call-analytics-job
     *            .json
     *            </p>
     *            </li>
     *            </ol>
     *            <p>
     *            Unless you specify a file name (option 3), the name of your
     *            output file has a default value that matches the name you
     *            specified for your transcription job using the
     *            <code>CallAnalyticsJobName</code> parameter.
     *            </p>
     *            <p>
     *            You can specify a KMS key to encrypt your output using the
     *            <code>OutputEncryptionKMSKeyId</code> parameter. If you don't
     *            specify a KMS key, Amazon Transcribe uses the default Amazon
     *            S3 key for server-side encryption.
     *            </p>
     *            <p>
     *            If you don't specify <code>OutputLocation</code>, your
     *            transcript is placed in a service-managed Amazon S3 bucket and
     *            you are provided with a URI to access your transcript.
     *            </p>
     */
    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * The Amazon S3 location where you want your Call Analytics transcription
     * output stored. You can use any of the following formats to specify the
     * output location:
     * </p>
     * <ol>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET/my-output-folder/
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET/my-output-folder/my-call-analytics-job.json
     * </p>
     * </li>
     * </ol>
     * <p>
     * Unless you specify a file name (option 3), the name of your output file
     * has a default value that matches the name you specified for your
     * transcription job using the <code>CallAnalyticsJobName</code> parameter.
     * </p>
     * <p>
     * You can specify a KMS key to encrypt your output using the
     * <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a
     * KMS key, Amazon Transcribe uses the default Amazon S3 key for server-side
     * encryption.
     * </p>
     * <p>
     * If you don't specify <code>OutputLocation</code>, your transcript is
     * placed in a service-managed Amazon S3 bucket and you are provided with a
     * URI to access your transcript.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param outputLocation <p>
     *            The Amazon S3 location where you want your Call Analytics
     *            transcription output stored. You can use any of the following
     *            formats to specify the output location:
     *            </p>
     *            <ol>
     *            <li>
     *            <p>
     *            s3://DOC-EXAMPLE-BUCKET
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            s3://DOC-EXAMPLE-BUCKET/my-output-folder/
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            s3://DOC-EXAMPLE-BUCKET/my-output-folder/my-call-analytics-job
     *            .json
     *            </p>
     *            </li>
     *            </ol>
     *            <p>
     *            Unless you specify a file name (option 3), the name of your
     *            output file has a default value that matches the name you
     *            specified for your transcription job using the
     *            <code>CallAnalyticsJobName</code> parameter.
     *            </p>
     *            <p>
     *            You can specify a KMS key to encrypt your output using the
     *            <code>OutputEncryptionKMSKeyId</code> parameter. If you don't
     *            specify a KMS key, Amazon Transcribe uses the default Amazon
     *            S3 key for server-side encryption.
     *            </p>
     *            <p>
     *            If you don't specify <code>OutputLocation</code>, your
     *            transcript is placed in a service-managed Amazon S3 bucket and
     *            you are provided with a URI to access your transcript.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartCallAnalyticsJobRequest withOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
        return this;
    }

    /**
     * <p>
     * The KMS key you want to use to encrypt your Call Analytics output.
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
     *         The KMS key you want to use to encrypt your Call Analytics
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
     * The KMS key you want to use to encrypt your Call Analytics output.
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
     *            The KMS key you want to use to encrypt your Call Analytics
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
     * The KMS key you want to use to encrypt your Call Analytics output.
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
     *            The KMS key you want to use to encrypt your Call Analytics
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
    public StartCallAnalyticsJobRequest withOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
        this.outputEncryptionKMSKeyId = outputEncryptionKMSKeyId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to
     * access the Amazon S3 bucket that contains your input files. If the role
     * that you specify doesn’t have the appropriate permissions to access the
     * specified Amazon S3 location, your request fails.
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
     *         input files. If the role that you specify doesn’t have the
     *         appropriate permissions to access the specified Amazon S3
     *         location, your request fails.
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
     * access the Amazon S3 bucket that contains your input files. If the role
     * that you specify doesn’t have the appropriate permissions to access the
     * specified Amazon S3 location, your request fails.
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
     *            input files. If the role that you specify doesn’t have the
     *            appropriate permissions to access the specified Amazon S3
     *            location, your request fails.
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
     * access the Amazon S3 bucket that contains your input files. If the role
     * that you specify doesn’t have the appropriate permissions to access the
     * specified Amazon S3 location, your request fails.
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
     *            input files. If the role that you specify doesn’t have the
     *            appropriate permissions to access the specified Amazon S3
     *            location, your request fails.
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
    public StartCallAnalyticsJobRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * Specify additional optional settings in your request, including content
     * redaction; allows you to apply custom language models, vocabulary
     * filters, and custom vocabularies to your Call Analytics job.
     * </p>
     *
     * @return <p>
     *         Specify additional optional settings in your request, including
     *         content redaction; allows you to apply custom language models,
     *         vocabulary filters, and custom vocabularies to your Call
     *         Analytics job.
     *         </p>
     */
    public CallAnalyticsJobSettings getSettings() {
        return settings;
    }

    /**
     * <p>
     * Specify additional optional settings in your request, including content
     * redaction; allows you to apply custom language models, vocabulary
     * filters, and custom vocabularies to your Call Analytics job.
     * </p>
     *
     * @param settings <p>
     *            Specify additional optional settings in your request,
     *            including content redaction; allows you to apply custom
     *            language models, vocabulary filters, and custom vocabularies
     *            to your Call Analytics job.
     *            </p>
     */
    public void setSettings(CallAnalyticsJobSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Specify additional optional settings in your request, including content
     * redaction; allows you to apply custom language models, vocabulary
     * filters, and custom vocabularies to your Call Analytics job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            Specify additional optional settings in your request,
     *            including content redaction; allows you to apply custom
     *            language models, vocabulary filters, and custom vocabularies
     *            to your Call Analytics job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartCallAnalyticsJobRequest withSettings(CallAnalyticsJobSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For
     * example, if your agent is the first participant to speak, you would set
     * <code>ChannelId</code> to <code>0</code> (to indicate the first channel)
     * and <code>ParticipantRole</code> to <code>AGENT</code> (to indicate that
     * it's the agent speaking).
     * </p>
     *
     * @return <p>
     *         Makes it possible to specify which speaker is on which channel.
     *         For example, if your agent is the first participant to speak, you
     *         would set <code>ChannelId</code> to <code>0</code> (to indicate
     *         the first channel) and <code>ParticipantRole</code> to
     *         <code>AGENT</code> (to indicate that it's the agent speaking).
     *         </p>
     */
    public java.util.List<ChannelDefinition> getChannelDefinitions() {
        return channelDefinitions;
    }

    /**
     * <p>
     * Makes it possible to specify which speaker is on which channel. For
     * example, if your agent is the first participant to speak, you would set
     * <code>ChannelId</code> to <code>0</code> (to indicate the first channel)
     * and <code>ParticipantRole</code> to <code>AGENT</code> (to indicate that
     * it's the agent speaking).
     * </p>
     *
     * @param channelDefinitions <p>
     *            Makes it possible to specify which speaker is on which
     *            channel. For example, if your agent is the first participant
     *            to speak, you would set <code>ChannelId</code> to
     *            <code>0</code> (to indicate the first channel) and
     *            <code>ParticipantRole</code> to <code>AGENT</code> (to
     *            indicate that it's the agent speaking).
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
     * Makes it possible to specify which speaker is on which channel. For
     * example, if your agent is the first participant to speak, you would set
     * <code>ChannelId</code> to <code>0</code> (to indicate the first channel)
     * and <code>ParticipantRole</code> to <code>AGENT</code> (to indicate that
     * it's the agent speaking).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelDefinitions <p>
     *            Makes it possible to specify which speaker is on which
     *            channel. For example, if your agent is the first participant
     *            to speak, you would set <code>ChannelId</code> to
     *            <code>0</code> (to indicate the first channel) and
     *            <code>ParticipantRole</code> to <code>AGENT</code> (to
     *            indicate that it's the agent speaking).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartCallAnalyticsJobRequest withChannelDefinitions(
            ChannelDefinition... channelDefinitions) {
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
     * Makes it possible to specify which speaker is on which channel. For
     * example, if your agent is the first participant to speak, you would set
     * <code>ChannelId</code> to <code>0</code> (to indicate the first channel)
     * and <code>ParticipantRole</code> to <code>AGENT</code> (to indicate that
     * it's the agent speaking).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelDefinitions <p>
     *            Makes it possible to specify which speaker is on which
     *            channel. For example, if your agent is the first participant
     *            to speak, you would set <code>ChannelId</code> to
     *            <code>0</code> (to indicate the first channel) and
     *            <code>ParticipantRole</code> to <code>AGENT</code> (to
     *            indicate that it's the agent speaking).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartCallAnalyticsJobRequest withChannelDefinitions(
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
        if (getMedia() != null)
            sb.append("Media: " + getMedia() + ",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: " + getOutputLocation() + ",");
        if (getOutputEncryptionKMSKeyId() != null)
            sb.append("OutputEncryptionKMSKeyId: " + getOutputEncryptionKMSKeyId() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn() + ",");
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
        hashCode = prime * hashCode + ((getMedia() == null) ? 0 : getMedia().hashCode());
        hashCode = prime * hashCode
                + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime
                * hashCode
                + ((getOutputEncryptionKMSKeyId() == null) ? 0 : getOutputEncryptionKMSKeyId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
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

        if (obj instanceof StartCallAnalyticsJobRequest == false)
            return false;
        StartCallAnalyticsJobRequest other = (StartCallAnalyticsJobRequest) obj;

        if (other.getCallAnalyticsJobName() == null ^ this.getCallAnalyticsJobName() == null)
            return false;
        if (other.getCallAnalyticsJobName() != null
                && other.getCallAnalyticsJobName().equals(this.getCallAnalyticsJobName()) == false)
            return false;
        if (other.getMedia() == null ^ this.getMedia() == null)
            return false;
        if (other.getMedia() != null && other.getMedia().equals(this.getMedia()) == false)
            return false;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null
                && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getOutputEncryptionKMSKeyId() == null
                ^ this.getOutputEncryptionKMSKeyId() == null)
            return false;
        if (other.getOutputEncryptionKMSKeyId() != null
                && other.getOutputEncryptionKMSKeyId().equals(this.getOutputEncryptionKMSKeyId()) == false)
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
        return true;
    }
}
