/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Starts an asynchronous analytics job that not only transcribes the audio
 * recording of a caller and agent, but also returns additional insights. These
 * insights include how quickly or loudly the caller or agent was speaking. To
 * retrieve additional insights with your analytics jobs, create categories. A
 * category is a way to classify analytics jobs based on attributes, such as a
 * customer's sentiment or a particular phrase being used during the call. For
 * more information, see the operation.
 * </p>
 */
public class StartCallAnalyticsJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the call analytics job. You can't use the string "." or ".."
     * by themselves as the job name. The name must also be unique within an AWS
     * account. If you try to create a call analytics job with the same name as
     * a previous call analytics job, you get a <code>ConflictException</code>
     * error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String callAnalyticsJobName;

    /**
     * <p>
     * Describes the input media file in a transcription request.
     * </p>
     */
    private Media media;

    /**
     * <p>
     * The Amazon S3 location where the output of the call analytics job is
     * stored. You can provide the following location types to store the output
     * of call analytics job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1
     * </p>
     * <p>
     * If you specify a bucket, Amazon Transcribe saves the output of the
     * analytics job as a JSON file at the root level of the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1/folder/
     * </p>
     * <p>
     * f you specify a path, Amazon Transcribe saves the output of the analytics
     * job as s3://DOC-EXAMPLE-BUCKET1/folder/your-transcription-job-name.json
     * </p>
     * <p>
     * If you specify a folder, you must provide a trailing slash.
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1/folder/filename.json
     * </p>
     * <p>
     * If you provide a path that has the filename specified, Amazon Transcribe
     * saves the output of the analytics job as
     * s3://DOC-EXAMPLEBUCKET1/folder/filename.json
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify an AWS Key Management Service key to encrypt the output
     * of our analytics job using the <code>OutputEncryptionKMSKeyId</code>
     * parameter. If you don't specify a KMS key, Amazon Transcribe uses the
     * default Amazon S3 key for server-side encryption of the analytics job
     * output that is placed in your S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     */
    private String outputLocation;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service key used
     * to encrypt the output of the call analytics job. The user calling the
     * operation must have permission to use the specified KMS key.
     * </p>
     * <p>
     * You use either of the following to identify an AWS KMS key in the current
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
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef1234567890ab"
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
     * If you don't specify an encryption key, the output of the call analytics
     * job is encrypted with the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an
     * output location in the <code>OutputLocation</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     */
    private String outputEncryptionKMSKeyId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that has access to the S3 bucket
     * that contains your input files. Amazon Transcribe assumes this role to
     * read queued audio files. If you have specified an output S3 bucket for
     * your transcription results, this role should have access to the output
     * bucket as well.
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
     * A <code>Settings</code> object that provides optional settings for a call
     * analytics job.
     * </p>
     */
    private CallAnalyticsJobSettings settings;

    /**
     * <p>
     * When you start a call analytics job, you must pass an array that maps the
     * agent and the customer to specific audio channels. The values you can
     * assign to a channel are 0 and 1. The agent and the customer must each
     * have their own channel. You can't assign more than one channel to an
     * agent or customer.
     * </p>
     */
    private java.util.List<ChannelDefinition> channelDefinitions;

    /**
     * <p>
     * The name of the call analytics job. You can't use the string "." or ".."
     * by themselves as the job name. The name must also be unique within an AWS
     * account. If you try to create a call analytics job with the same name as
     * a previous call analytics job, you get a <code>ConflictException</code>
     * error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the call analytics job. You can't use the string "."
     *         or ".." by themselves as the job name. The name must also be
     *         unique within an AWS account. If you try to create a call
     *         analytics job with the same name as a previous call analytics
     *         job, you get a <code>ConflictException</code> error.
     *         </p>
     */
    public String getCallAnalyticsJobName() {
        return callAnalyticsJobName;
    }

    /**
     * <p>
     * The name of the call analytics job. You can't use the string "." or ".."
     * by themselves as the job name. The name must also be unique within an AWS
     * account. If you try to create a call analytics job with the same name as
     * a previous call analytics job, you get a <code>ConflictException</code>
     * error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param callAnalyticsJobName <p>
     *            The name of the call analytics job. You can't use the string
     *            "." or ".." by themselves as the job name. The name must also
     *            be unique within an AWS account. If you try to create a call
     *            analytics job with the same name as a previous call analytics
     *            job, you get a <code>ConflictException</code> error.
     *            </p>
     */
    public void setCallAnalyticsJobName(String callAnalyticsJobName) {
        this.callAnalyticsJobName = callAnalyticsJobName;
    }

    /**
     * <p>
     * The name of the call analytics job. You can't use the string "." or ".."
     * by themselves as the job name. The name must also be unique within an AWS
     * account. If you try to create a call analytics job with the same name as
     * a previous call analytics job, you get a <code>ConflictException</code>
     * error.
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
     *            The name of the call analytics job. You can't use the string
     *            "." or ".." by themselves as the job name. The name must also
     *            be unique within an AWS account. If you try to create a call
     *            analytics job with the same name as a previous call analytics
     *            job, you get a <code>ConflictException</code> error.
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
    public StartCallAnalyticsJobRequest withMedia(Media media) {
        this.media = media;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location where the output of the call analytics job is
     * stored. You can provide the following location types to store the output
     * of call analytics job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1
     * </p>
     * <p>
     * If you specify a bucket, Amazon Transcribe saves the output of the
     * analytics job as a JSON file at the root level of the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1/folder/
     * </p>
     * <p>
     * f you specify a path, Amazon Transcribe saves the output of the analytics
     * job as s3://DOC-EXAMPLE-BUCKET1/folder/your-transcription-job-name.json
     * </p>
     * <p>
     * If you specify a folder, you must provide a trailing slash.
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1/folder/filename.json
     * </p>
     * <p>
     * If you provide a path that has the filename specified, Amazon Transcribe
     * saves the output of the analytics job as
     * s3://DOC-EXAMPLEBUCKET1/folder/filename.json
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify an AWS Key Management Service key to encrypt the output
     * of our analytics job using the <code>OutputEncryptionKMSKeyId</code>
     * parameter. If you don't specify a KMS key, Amazon Transcribe uses the
     * default Amazon S3 key for server-side encryption of the analytics job
     * output that is placed in your S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @return <p>
     *         The Amazon S3 location where the output of the call analytics job
     *         is stored. You can provide the following location types to store
     *         the output of call analytics job:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         s3://DOC-EXAMPLE-BUCKET1
     *         </p>
     *         <p>
     *         If you specify a bucket, Amazon Transcribe saves the output of
     *         the analytics job as a JSON file at the root level of the bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         s3://DOC-EXAMPLE-BUCKET1/folder/
     *         </p>
     *         <p>
     *         f you specify a path, Amazon Transcribe saves the output of the
     *         analytics job as
     *         s3://DOC-EXAMPLE-BUCKET1/folder/your-transcription-job-name.json
     *         </p>
     *         <p>
     *         If you specify a folder, you must provide a trailing slash.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         s3://DOC-EXAMPLE-BUCKET1/folder/filename.json
     *         </p>
     *         <p>
     *         If you provide a path that has the filename specified, Amazon
     *         Transcribe saves the output of the analytics job as
     *         s3://DOC-EXAMPLEBUCKET1/folder/filename.json
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can specify an AWS Key Management Service key to encrypt the
     *         output of our analytics job using the
     *         <code>OutputEncryptionKMSKeyId</code> parameter. If you don't
     *         specify a KMS key, Amazon Transcribe uses the default Amazon S3
     *         key for server-side encryption of the analytics job output that
     *         is placed in your S3 bucket.
     *         </p>
     */
    public String getOutputLocation() {
        return outputLocation;
    }

    /**
     * <p>
     * The Amazon S3 location where the output of the call analytics job is
     * stored. You can provide the following location types to store the output
     * of call analytics job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1
     * </p>
     * <p>
     * If you specify a bucket, Amazon Transcribe saves the output of the
     * analytics job as a JSON file at the root level of the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1/folder/
     * </p>
     * <p>
     * f you specify a path, Amazon Transcribe saves the output of the analytics
     * job as s3://DOC-EXAMPLE-BUCKET1/folder/your-transcription-job-name.json
     * </p>
     * <p>
     * If you specify a folder, you must provide a trailing slash.
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1/folder/filename.json
     * </p>
     * <p>
     * If you provide a path that has the filename specified, Amazon Transcribe
     * saves the output of the analytics job as
     * s3://DOC-EXAMPLEBUCKET1/folder/filename.json
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify an AWS Key Management Service key to encrypt the output
     * of our analytics job using the <code>OutputEncryptionKMSKeyId</code>
     * parameter. If you don't specify a KMS key, Amazon Transcribe uses the
     * default Amazon S3 key for server-side encryption of the analytics job
     * output that is placed in your S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>(s3://|http(s*)://).+<br/>
     *
     * @param outputLocation <p>
     *            The Amazon S3 location where the output of the call analytics
     *            job is stored. You can provide the following location types to
     *            store the output of call analytics job:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            s3://DOC-EXAMPLE-BUCKET1
     *            </p>
     *            <p>
     *            If you specify a bucket, Amazon Transcribe saves the output of
     *            the analytics job as a JSON file at the root level of the
     *            bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            s3://DOC-EXAMPLE-BUCKET1/folder/
     *            </p>
     *            <p>
     *            f you specify a path, Amazon Transcribe saves the output of
     *            the analytics job as
     *            s3://DOC-EXAMPLE-BUCKET1/folder/your-transcription
     *            -job-name.json
     *            </p>
     *            <p>
     *            If you specify a folder, you must provide a trailing slash.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            s3://DOC-EXAMPLE-BUCKET1/folder/filename.json
     *            </p>
     *            <p>
     *            If you provide a path that has the filename specified, Amazon
     *            Transcribe saves the output of the analytics job as
     *            s3://DOC-EXAMPLEBUCKET1/folder/filename.json
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can specify an AWS Key Management Service key to encrypt
     *            the output of our analytics job using the
     *            <code>OutputEncryptionKMSKeyId</code> parameter. If you don't
     *            specify a KMS key, Amazon Transcribe uses the default Amazon
     *            S3 key for server-side encryption of the analytics job output
     *            that is placed in your S3 bucket.
     *            </p>
     */
    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * The Amazon S3 location where the output of the call analytics job is
     * stored. You can provide the following location types to store the output
     * of call analytics job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1
     * </p>
     * <p>
     * If you specify a bucket, Amazon Transcribe saves the output of the
     * analytics job as a JSON file at the root level of the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1/folder/
     * </p>
     * <p>
     * f you specify a path, Amazon Transcribe saves the output of the analytics
     * job as s3://DOC-EXAMPLE-BUCKET1/folder/your-transcription-job-name.json
     * </p>
     * <p>
     * If you specify a folder, you must provide a trailing slash.
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1/folder/filename.json
     * </p>
     * <p>
     * If you provide a path that has the filename specified, Amazon Transcribe
     * saves the output of the analytics job as
     * s3://DOC-EXAMPLEBUCKET1/folder/filename.json
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify an AWS Key Management Service key to encrypt the output
     * of our analytics job using the <code>OutputEncryptionKMSKeyId</code>
     * parameter. If you don't specify a KMS key, Amazon Transcribe uses the
     * default Amazon S3 key for server-side encryption of the analytics job
     * output that is placed in your S3 bucket.
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
     *            The Amazon S3 location where the output of the call analytics
     *            job is stored. You can provide the following location types to
     *            store the output of call analytics job:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            s3://DOC-EXAMPLE-BUCKET1
     *            </p>
     *            <p>
     *            If you specify a bucket, Amazon Transcribe saves the output of
     *            the analytics job as a JSON file at the root level of the
     *            bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            s3://DOC-EXAMPLE-BUCKET1/folder/
     *            </p>
     *            <p>
     *            f you specify a path, Amazon Transcribe saves the output of
     *            the analytics job as
     *            s3://DOC-EXAMPLE-BUCKET1/folder/your-transcription
     *            -job-name.json
     *            </p>
     *            <p>
     *            If you specify a folder, you must provide a trailing slash.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            s3://DOC-EXAMPLE-BUCKET1/folder/filename.json
     *            </p>
     *            <p>
     *            If you provide a path that has the filename specified, Amazon
     *            Transcribe saves the output of the analytics job as
     *            s3://DOC-EXAMPLEBUCKET1/folder/filename.json
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can specify an AWS Key Management Service key to encrypt
     *            the output of our analytics job using the
     *            <code>OutputEncryptionKMSKeyId</code> parameter. If you don't
     *            specify a KMS key, Amazon Transcribe uses the default Amazon
     *            S3 key for server-side encryption of the analytics job output
     *            that is placed in your S3 bucket.
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
     * The Amazon Resource Name (ARN) of the AWS Key Management Service key used
     * to encrypt the output of the call analytics job. The user calling the
     * operation must have permission to use the specified KMS key.
     * </p>
     * <p>
     * You use either of the following to identify an AWS KMS key in the current
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
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef1234567890ab"
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
     * If you don't specify an encryption key, the output of the call analytics
     * job is encrypted with the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an
     * output location in the <code>OutputLocation</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Key Management Service
     *         key used to encrypt the output of the call analytics job. The
     *         user calling the operation must have permission to use the
     *         specified KMS key.
     *         </p>
     *         <p>
     *         You use either of the following to identify an AWS KMS key in the
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
     *         "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef1234567890ab"
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
     *         If you don't specify an encryption key, the output of the call
     *         analytics job is encrypted with the default Amazon S3 key
     *         (SSE-S3).
     *         </p>
     *         <p>
     *         If you specify a KMS key to encrypt your output, you must also
     *         specify an output location in the <code>OutputLocation</code>
     *         parameter.
     *         </p>
     */
    public String getOutputEncryptionKMSKeyId() {
        return outputEncryptionKMSKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service key used
     * to encrypt the output of the call analytics job. The user calling the
     * operation must have permission to use the specified KMS key.
     * </p>
     * <p>
     * You use either of the following to identify an AWS KMS key in the current
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
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef1234567890ab"
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
     * If you don't specify an encryption key, the output of the call analytics
     * job is encrypted with the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an
     * output location in the <code>OutputLocation</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param outputEncryptionKMSKeyId <p>
     *            The Amazon Resource Name (ARN) of the AWS Key Management
     *            Service key used to encrypt the output of the call analytics
     *            job. The user calling the operation must have permission to
     *            use the specified KMS key.
     *            </p>
     *            <p>
     *            You use either of the following to identify an AWS KMS key in
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
     *            Amazon Resource Name (ARN) of a KMS key in the current account
     *            or another account:
     *            "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef1234567890ab"
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
     *            If you don't specify an encryption key, the output of the call
     *            analytics job is encrypted with the default Amazon S3 key
     *            (SSE-S3).
     *            </p>
     *            <p>
     *            If you specify a KMS key to encrypt your output, you must also
     *            specify an output location in the <code>OutputLocation</code>
     *            parameter.
     *            </p>
     */
    public void setOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
        this.outputEncryptionKMSKeyId = outputEncryptionKMSKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service key used
     * to encrypt the output of the call analytics job. The user calling the
     * operation must have permission to use the specified KMS key.
     * </p>
     * <p>
     * You use either of the following to identify an AWS KMS key in the current
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
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef1234567890ab"
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
     * If you don't specify an encryption key, the output of the call analytics
     * job is encrypted with the default Amazon S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an
     * output location in the <code>OutputLocation</code> parameter.
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
     *            Service key used to encrypt the output of the call analytics
     *            job. The user calling the operation must have permission to
     *            use the specified KMS key.
     *            </p>
     *            <p>
     *            You use either of the following to identify an AWS KMS key in
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
     *            Amazon Resource Name (ARN) of a KMS key in the current account
     *            or another account:
     *            "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef1234567890ab"
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
     *            If you don't specify an encryption key, the output of the call
     *            analytics job is encrypted with the default Amazon S3 key
     *            (SSE-S3).
     *            </p>
     *            <p>
     *            If you specify a KMS key to encrypt your output, you must also
     *            specify an output location in the <code>OutputLocation</code>
     *            parameter.
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
     * The Amazon Resource Name (ARN) of a role that has access to the S3 bucket
     * that contains your input files. Amazon Transcribe assumes this role to
     * read queued audio files. If you have specified an output S3 bucket for
     * your transcription results, this role should have access to the output
     * bucket as well.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of a role that has access to the
     *         S3 bucket that contains your input files. Amazon Transcribe
     *         assumes this role to read queued audio files. If you have
     *         specified an output S3 bucket for your transcription results,
     *         this role should have access to the output bucket as well.
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that has access to the S3 bucket
     * that contains your input files. Amazon Transcribe assumes this role to
     * read queued audio files. If you have specified an output S3 bucket for
     * your transcription results, this role should have access to the output
     * bucket as well.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:(aws|aws-cn|aws-us-gov|aws-iso-{0,1}[a-z]{0,1}):iam::
     * [0-9]{0,63}:role/[A-Za-z0-9:_/+=,@.-]{0,1024}$<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of a role that has access to
     *            the S3 bucket that contains your input files. Amazon
     *            Transcribe assumes this role to read queued audio files. If
     *            you have specified an output S3 bucket for your transcription
     *            results, this role should have access to the output bucket as
     *            well.
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that has access to the S3 bucket
     * that contains your input files. Amazon Transcribe assumes this role to
     * read queued audio files. If you have specified an output S3 bucket for
     * your transcription results, this role should have access to the output
     * bucket as well.
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
     *            The Amazon Resource Name (ARN) of a role that has access to
     *            the S3 bucket that contains your input files. Amazon
     *            Transcribe assumes this role to read queued audio files. If
     *            you have specified an output S3 bucket for your transcription
     *            results, this role should have access to the output bucket as
     *            well.
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
     * A <code>Settings</code> object that provides optional settings for a call
     * analytics job.
     * </p>
     *
     * @return <p>
     *         A <code>Settings</code> object that provides optional settings
     *         for a call analytics job.
     *         </p>
     */
    public CallAnalyticsJobSettings getSettings() {
        return settings;
    }

    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a call
     * analytics job.
     * </p>
     *
     * @param settings <p>
     *            A <code>Settings</code> object that provides optional settings
     *            for a call analytics job.
     *            </p>
     */
    public void setSettings(CallAnalyticsJobSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a call
     * analytics job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            A <code>Settings</code> object that provides optional settings
     *            for a call analytics job.
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
     * When you start a call analytics job, you must pass an array that maps the
     * agent and the customer to specific audio channels. The values you can
     * assign to a channel are 0 and 1. The agent and the customer must each
     * have their own channel. You can't assign more than one channel to an
     * agent or customer.
     * </p>
     *
     * @return <p>
     *         When you start a call analytics job, you must pass an array that
     *         maps the agent and the customer to specific audio channels. The
     *         values you can assign to a channel are 0 and 1. The agent and the
     *         customer must each have their own channel. You can't assign more
     *         than one channel to an agent or customer.
     *         </p>
     */
    public java.util.List<ChannelDefinition> getChannelDefinitions() {
        return channelDefinitions;
    }

    /**
     * <p>
     * When you start a call analytics job, you must pass an array that maps the
     * agent and the customer to specific audio channels. The values you can
     * assign to a channel are 0 and 1. The agent and the customer must each
     * have their own channel. You can't assign more than one channel to an
     * agent or customer.
     * </p>
     *
     * @param channelDefinitions <p>
     *            When you start a call analytics job, you must pass an array
     *            that maps the agent and the customer to specific audio
     *            channels. The values you can assign to a channel are 0 and 1.
     *            The agent and the customer must each have their own channel.
     *            You can't assign more than one channel to an agent or
     *            customer.
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
     * When you start a call analytics job, you must pass an array that maps the
     * agent and the customer to specific audio channels. The values you can
     * assign to a channel are 0 and 1. The agent and the customer must each
     * have their own channel. You can't assign more than one channel to an
     * agent or customer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelDefinitions <p>
     *            When you start a call analytics job, you must pass an array
     *            that maps the agent and the customer to specific audio
     *            channels. The values you can assign to a channel are 0 and 1.
     *            The agent and the customer must each have their own channel.
     *            You can't assign more than one channel to an agent or
     *            customer.
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
     * When you start a call analytics job, you must pass an array that maps the
     * agent and the customer to specific audio channels. The values you can
     * assign to a channel are 0 and 1. The agent and the customer must each
     * have their own channel. You can't assign more than one channel to an
     * agent or customer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelDefinitions <p>
     *            When you start a call analytics job, you must pass an array
     *            that maps the agent and the customer to specific audio
     *            channels. The values you can assign to a channel are 0 and 1.
     *            The agent and the customer must each have their own channel.
     *            You can't assign more than one channel to an agent or
     *            customer.
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
