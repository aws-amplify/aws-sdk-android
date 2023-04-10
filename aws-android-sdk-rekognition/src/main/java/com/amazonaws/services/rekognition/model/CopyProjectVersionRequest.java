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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Copies a version of an Amazon Rekognition Custom Labels model from a source
 * project to a destination project. The source and destination projects can be
 * in different AWS accounts but must be in the same AWS Region. You can't copy
 * a model to another AWS service.
 * </p>
 * <p>
 * To copy a model version to a different AWS account, you need to create a
 * resource-based policy known as a <i>project policy</i>. You attach the
 * project policy to the source project by calling <a>PutProjectPolicy</a>. The
 * project policy gives permission to copy the model version from a trusting AWS
 * account to a trusted account.
 * </p>
 * <p>
 * For more information creating and attaching a project policy, see Attaching a
 * project policy (SDK) in the <i>Amazon Rekognition Custom Labels Developer
 * Guide</i>.
 * </p>
 * <p>
 * If you are copying a model version to a project in the same AWS account, you
 * don't need to create a project policy.
 * </p>
 * <note>
 * <p>
 * To copy a model, the destination project, source project, and source model
 * version must already exist.
 * </p>
 * </note>
 * <p>
 * Copying a model version takes a while to complete. To get the current status,
 * call <a>DescribeProjectVersions</a> and check the value of
 * <code>Status</code> in the <a>ProjectVersionDescription</a> object. The copy
 * operation has finished when the value of <code>Status</code> is
 * <code>COPYING_COMPLETED</code>.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:CopyProjectVersion</code> action.
 * </p>
 */
public class CopyProjectVersionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the source project in the trusting AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     */
    private String sourceProjectArn;

    /**
     * <p>
     * The ARN of the model version in the source project that you want to copy
     * to a destination project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     */
    private String sourceProjectVersionArn;

    /**
     * <p>
     * The ARN of the project in the trusted AWS account that you want to copy
     * the model version to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     */
    private String destinationProjectArn;

    /**
     * <p>
     * A name for the version of the model that's copied to the destination
     * project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String versionName;

    /**
     * <p>
     * The S3 bucket and folder location where the training output for the
     * source model version is placed.
     * </p>
     */
    private OutputConfig outputConfig;

    /**
     * <p>
     * The key-value tags to assign to the model version.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You
     * can supply the Amazon Resource Name (ARN) of your KMS key, the ID of your
     * KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training results and manifest files written to the output Amazon
     * S3 bucket (<code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions
     * on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied
     * into the service are encrypted using a key that AWS owns and manages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The ARN of the source project in the trusting AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @return <p>
     *         The ARN of the source project in the trusting AWS account.
     *         </p>
     */
    public String getSourceProjectArn() {
        return sourceProjectArn;
    }

    /**
     * <p>
     * The ARN of the source project in the trusting AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param sourceProjectArn <p>
     *            The ARN of the source project in the trusting AWS account.
     *            </p>
     */
    public void setSourceProjectArn(String sourceProjectArn) {
        this.sourceProjectArn = sourceProjectArn;
    }

    /**
     * <p>
     * The ARN of the source project in the trusting AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param sourceProjectArn <p>
     *            The ARN of the source project in the trusting AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyProjectVersionRequest withSourceProjectArn(String sourceProjectArn) {
        this.sourceProjectArn = sourceProjectArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the model version in the source project that you want to copy
     * to a destination project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @return <p>
     *         The ARN of the model version in the source project that you want
     *         to copy to a destination project.
     *         </p>
     */
    public String getSourceProjectVersionArn() {
        return sourceProjectVersionArn;
    }

    /**
     * <p>
     * The ARN of the model version in the source project that you want to copy
     * to a destination project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param sourceProjectVersionArn <p>
     *            The ARN of the model version in the source project that you
     *            want to copy to a destination project.
     *            </p>
     */
    public void setSourceProjectVersionArn(String sourceProjectVersionArn) {
        this.sourceProjectVersionArn = sourceProjectVersionArn;
    }

    /**
     * <p>
     * The ARN of the model version in the source project that you want to copy
     * to a destination project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param sourceProjectVersionArn <p>
     *            The ARN of the model version in the source project that you
     *            want to copy to a destination project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyProjectVersionRequest withSourceProjectVersionArn(String sourceProjectVersionArn) {
        this.sourceProjectVersionArn = sourceProjectVersionArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the project in the trusted AWS account that you want to copy
     * the model version to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @return <p>
     *         The ARN of the project in the trusted AWS account that you want
     *         to copy the model version to.
     *         </p>
     */
    public String getDestinationProjectArn() {
        return destinationProjectArn;
    }

    /**
     * <p>
     * The ARN of the project in the trusted AWS account that you want to copy
     * the model version to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param destinationProjectArn <p>
     *            The ARN of the project in the trusted AWS account that you
     *            want to copy the model version to.
     *            </p>
     */
    public void setDestinationProjectArn(String destinationProjectArn) {
        this.destinationProjectArn = destinationProjectArn;
    }

    /**
     * <p>
     * The ARN of the project in the trusted AWS account that you want to copy
     * the model version to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param destinationProjectArn <p>
     *            The ARN of the project in the trusted AWS account that you
     *            want to copy the model version to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyProjectVersionRequest withDestinationProjectArn(String destinationProjectArn) {
        this.destinationProjectArn = destinationProjectArn;
        return this;
    }

    /**
     * <p>
     * A name for the version of the model that's copied to the destination
     * project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @return <p>
     *         A name for the version of the model that's copied to the
     *         destination project.
     *         </p>
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * <p>
     * A name for the version of the model that's copied to the destination
     * project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param versionName <p>
     *            A name for the version of the model that's copied to the
     *            destination project.
     *            </p>
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * A name for the version of the model that's copied to the destination
     * project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param versionName <p>
     *            A name for the version of the model that's copied to the
     *            destination project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyProjectVersionRequest withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * <p>
     * The S3 bucket and folder location where the training output for the
     * source model version is placed.
     * </p>
     *
     * @return <p>
     *         The S3 bucket and folder location where the training output for
     *         the source model version is placed.
     *         </p>
     */
    public OutputConfig getOutputConfig() {
        return outputConfig;
    }

    /**
     * <p>
     * The S3 bucket and folder location where the training output for the
     * source model version is placed.
     * </p>
     *
     * @param outputConfig <p>
     *            The S3 bucket and folder location where the training output
     *            for the source model version is placed.
     *            </p>
     */
    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The S3 bucket and folder location where the training output for the
     * source model version is placed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputConfig <p>
     *            The S3 bucket and folder location where the training output
     *            for the source model version is placed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyProjectVersionRequest withOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }

    /**
     * <p>
     * The key-value tags to assign to the model version.
     * </p>
     *
     * @return <p>
     *         The key-value tags to assign to the model version.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value tags to assign to the model version.
     * </p>
     *
     * @param tags <p>
     *            The key-value tags to assign to the model version.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The key-value tags to assign to the model version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The key-value tags to assign to the model version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyProjectVersionRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The key-value tags to assign to the model version.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyProjectVersionRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CopyProjectVersionRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You
     * can supply the Amazon Resource Name (ARN) of your KMS key, the ID of your
     * KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training results and manifest files written to the output Amazon
     * S3 bucket (<code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions
     * on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied
     * into the service are encrypted using a key that AWS owns and manages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @return <p>
     *         The identifier for your AWS Key Management Service key (AWS KMS
     *         key). You can supply the Amazon Resource Name (ARN) of your KMS
     *         key, the ID of your KMS key, an alias for your KMS key, or an
     *         alias ARN. The key is used to encrypt training results and
     *         manifest files written to the output Amazon S3 bucket (
     *         <code>OutputConfig</code>).
     *         </p>
     *         <p>
     *         If you choose to use your own KMS key, you need the following
     *         permissions on the KMS key.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         kms:CreateGrant
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         kms:DescribeKey
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         kms:GenerateDataKey
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         kms:Decrypt
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify a value for <code>KmsKeyId</code>, images
     *         copied into the service are encrypted using a key that AWS owns
     *         and manages.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You
     * can supply the Amazon Resource Name (ARN) of your KMS key, the ID of your
     * KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training results and manifest files written to the output Amazon
     * S3 bucket (<code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions
     * on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied
     * into the service are encrypted using a key that AWS owns and manages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param kmsKeyId <p>
     *            The identifier for your AWS Key Management Service key (AWS
     *            KMS key). You can supply the Amazon Resource Name (ARN) of
     *            your KMS key, the ID of your KMS key, an alias for your KMS
     *            key, or an alias ARN. The key is used to encrypt training
     *            results and manifest files written to the output Amazon S3
     *            bucket (<code>OutputConfig</code>).
     *            </p>
     *            <p>
     *            If you choose to use your own KMS key, you need the following
     *            permissions on the KMS key.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            kms:CreateGrant
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            kms:DescribeKey
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            kms:GenerateDataKey
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            kms:Decrypt
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify a value for <code>KmsKeyId</code>, images
     *            copied into the service are encrypted using a key that AWS
     *            owns and manages.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You
     * can supply the Amazon Resource Name (ARN) of your KMS key, the ID of your
     * KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training results and manifest files written to the output Amazon
     * S3 bucket (<code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions
     * on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied
     * into the service are encrypted using a key that AWS owns and manages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param kmsKeyId <p>
     *            The identifier for your AWS Key Management Service key (AWS
     *            KMS key). You can supply the Amazon Resource Name (ARN) of
     *            your KMS key, the ID of your KMS key, an alias for your KMS
     *            key, or an alias ARN. The key is used to encrypt training
     *            results and manifest files written to the output Amazon S3
     *            bucket (<code>OutputConfig</code>).
     *            </p>
     *            <p>
     *            If you choose to use your own KMS key, you need the following
     *            permissions on the KMS key.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            kms:CreateGrant
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            kms:DescribeKey
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            kms:GenerateDataKey
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            kms:Decrypt
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify a value for <code>KmsKeyId</code>, images
     *            copied into the service are encrypted using a key that AWS
     *            owns and manages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyProjectVersionRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
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
        if (getSourceProjectArn() != null)
            sb.append("SourceProjectArn: " + getSourceProjectArn() + ",");
        if (getSourceProjectVersionArn() != null)
            sb.append("SourceProjectVersionArn: " + getSourceProjectVersionArn() + ",");
        if (getDestinationProjectArn() != null)
            sb.append("DestinationProjectArn: " + getDestinationProjectArn() + ",");
        if (getVersionName() != null)
            sb.append("VersionName: " + getVersionName() + ",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: " + getOutputConfig() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceProjectArn() == null) ? 0 : getSourceProjectArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceProjectVersionArn() == null) ? 0 : getSourceProjectVersionArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationProjectArn() == null) ? 0 : getDestinationProjectArn().hashCode());
        hashCode = prime * hashCode
                + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode
                + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyProjectVersionRequest == false)
            return false;
        CopyProjectVersionRequest other = (CopyProjectVersionRequest) obj;

        if (other.getSourceProjectArn() == null ^ this.getSourceProjectArn() == null)
            return false;
        if (other.getSourceProjectArn() != null
                && other.getSourceProjectArn().equals(this.getSourceProjectArn()) == false)
            return false;
        if (other.getSourceProjectVersionArn() == null ^ this.getSourceProjectVersionArn() == null)
            return false;
        if (other.getSourceProjectVersionArn() != null
                && other.getSourceProjectVersionArn().equals(this.getSourceProjectVersionArn()) == false)
            return false;
        if (other.getDestinationProjectArn() == null ^ this.getDestinationProjectArn() == null)
            return false;
        if (other.getDestinationProjectArn() != null
                && other.getDestinationProjectArn().equals(this.getDestinationProjectArn()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null
                && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null
                && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }
}
