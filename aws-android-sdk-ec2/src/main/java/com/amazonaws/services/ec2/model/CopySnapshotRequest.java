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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Copies a point-in-time snapshot of an EBS volume and stores it in Amazon S3.
 * You can copy the snapshot within the same Region or from one Region to
 * another. You can use the snapshot to create EBS volumes or Amazon Machine
 * Images (AMIs).
 * </p>
 * <p>
 * Copies of encrypted EBS snapshots remain encrypted. Copies of unencrypted
 * snapshots remain unencrypted, unless you enable encryption for the snapshot
 * copy operation. By default, encrypted snapshot copies use the default AWS Key
 * Management Service (AWS KMS) customer master key (CMK); however, you can
 * specify a different CMK.
 * </p>
 * <p>
 * To copy an encrypted snapshot that has been shared from another account, you
 * must have permissions for the CMK used to encrypt the snapshot.
 * </p>
 * <p>
 * Snapshots created by copying another snapshot have an arbitrary volume ID
 * that should not be used for any purpose.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-copy-snapshot.html"
 * >Copying an Amazon EBS Snapshot</a> in the <i>Amazon Elastic Compute Cloud
 * User Guide</i>.
 * </p>
 */
public class CopySnapshotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A description for the EBS snapshot.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The destination Region to use in the <code>PresignedUrl</code> parameter
     * of a snapshot copy operation. This parameter is only valid for specifying
     * the destination Region in a <code>PresignedUrl</code> parameter, where it
     * is required.
     * </p>
     * <p>
     * The snapshot copy is sent to the regional endpoint that you sent the HTTP
     * request to (for example, <code>ec2.us-east-1.amazonaws.com</code>). With
     * the AWS CLI, this is specified using the <code>--region</code> parameter
     * or the default Region in your AWS configuration file.
     * </p>
     */
    private String destinationRegion;

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is
     * not enabled, enable encryption using this parameter. Otherwise, omit this
     * parameter. Encrypted snapshots are encrypted, even if you omit this
     * parameter and encryption by default is not enabled. You cannot set this
     * parameter to false. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer
     * master key (CMK) to use for Amazon EBS encryption. If this parameter is
     * not specified, your AWS managed CMK for EBS is used. If
     * <code>KmsKeyId</code> is specified, the encrypted state must be
     * <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key
     * /<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias
     * /<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an
     * ID, alias, or ARN that is not valid, the action can appear to complete,
     * but eventually fails.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * When you copy an encrypted source snapshot using the Amazon EC2 Query
     * API, you must supply a pre-signed URL. This parameter is optional for
     * unencrypted snapshots. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html"
     * >Query Requests</a>.
     * </p>
     * <p>
     * The <code>PresignedUrl</code> should use the snapshot source endpoint,
     * the <code>CopySnapshot</code> action, and include the
     * <code>SourceRegion</code>, <code>SourceSnapshotId</code>, and
     * <code>DestinationRegion</code> parameters. The <code>PresignedUrl</code>
     * must be signed using AWS Signature Version 4. Because EBS snapshots are
     * stored in Amazon S3, the signing algorithm for this parameter uses the
     * same logic that is described in <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     * >Authenticating Requests by Using Query Parameters (AWS Signature Version
     * 4)</a> in the <i>Amazon Simple Storage Service API Reference</i>. An
     * invalid or improperly signed <code>PresignedUrl</code> will cause the
     * copy operation to fail asynchronously, and the snapshot will move to an
     * <code>error</code> state.
     * </p>
     */
    private String presignedUrl;

    /**
     * <p>
     * The ID of the Region that contains the snapshot to be copied.
     * </p>
     */
    private String sourceRegion;

    /**
     * <p>
     * The ID of the EBS snapshot to copy.
     * </p>
     */
    private String sourceSnapshotId;

    /**
     * <p>
     * The tags to apply to the new snapshot.
     * </p>
     */
    private java.util.List<TagSpecification> tagSpecifications;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * A description for the EBS snapshot.
     * </p>
     *
     * @return <p>
     *         A description for the EBS snapshot.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the EBS snapshot.
     * </p>
     *
     * @param description <p>
     *            A description for the EBS snapshot.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the EBS snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for the EBS snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The destination Region to use in the <code>PresignedUrl</code> parameter
     * of a snapshot copy operation. This parameter is only valid for specifying
     * the destination Region in a <code>PresignedUrl</code> parameter, where it
     * is required.
     * </p>
     * <p>
     * The snapshot copy is sent to the regional endpoint that you sent the HTTP
     * request to (for example, <code>ec2.us-east-1.amazonaws.com</code>). With
     * the AWS CLI, this is specified using the <code>--region</code> parameter
     * or the default Region in your AWS configuration file.
     * </p>
     *
     * @return <p>
     *         The destination Region to use in the <code>PresignedUrl</code>
     *         parameter of a snapshot copy operation. This parameter is only
     *         valid for specifying the destination Region in a
     *         <code>PresignedUrl</code> parameter, where it is required.
     *         </p>
     *         <p>
     *         The snapshot copy is sent to the regional endpoint that you sent
     *         the HTTP request to (for example,
     *         <code>ec2.us-east-1.amazonaws.com</code>). With the AWS CLI, this
     *         is specified using the <code>--region</code> parameter or the
     *         default Region in your AWS configuration file.
     *         </p>
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    /**
     * <p>
     * The destination Region to use in the <code>PresignedUrl</code> parameter
     * of a snapshot copy operation. This parameter is only valid for specifying
     * the destination Region in a <code>PresignedUrl</code> parameter, where it
     * is required.
     * </p>
     * <p>
     * The snapshot copy is sent to the regional endpoint that you sent the HTTP
     * request to (for example, <code>ec2.us-east-1.amazonaws.com</code>). With
     * the AWS CLI, this is specified using the <code>--region</code> parameter
     * or the default Region in your AWS configuration file.
     * </p>
     *
     * @param destinationRegion <p>
     *            The destination Region to use in the <code>PresignedUrl</code>
     *            parameter of a snapshot copy operation. This parameter is only
     *            valid for specifying the destination Region in a
     *            <code>PresignedUrl</code> parameter, where it is required.
     *            </p>
     *            <p>
     *            The snapshot copy is sent to the regional endpoint that you
     *            sent the HTTP request to (for example,
     *            <code>ec2.us-east-1.amazonaws.com</code>). With the AWS CLI,
     *            this is specified using the <code>--region</code> parameter or
     *            the default Region in your AWS configuration file.
     *            </p>
     */
    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    /**
     * <p>
     * The destination Region to use in the <code>PresignedUrl</code> parameter
     * of a snapshot copy operation. This parameter is only valid for specifying
     * the destination Region in a <code>PresignedUrl</code> parameter, where it
     * is required.
     * </p>
     * <p>
     * The snapshot copy is sent to the regional endpoint that you sent the HTTP
     * request to (for example, <code>ec2.us-east-1.amazonaws.com</code>). With
     * the AWS CLI, this is specified using the <code>--region</code> parameter
     * or the default Region in your AWS configuration file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationRegion <p>
     *            The destination Region to use in the <code>PresignedUrl</code>
     *            parameter of a snapshot copy operation. This parameter is only
     *            valid for specifying the destination Region in a
     *            <code>PresignedUrl</code> parameter, where it is required.
     *            </p>
     *            <p>
     *            The snapshot copy is sent to the regional endpoint that you
     *            sent the HTTP request to (for example,
     *            <code>ec2.us-east-1.amazonaws.com</code>). With the AWS CLI,
     *            this is specified using the <code>--region</code> parameter or
     *            the default Region in your AWS configuration file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is
     * not enabled, enable encryption using this parameter. Otherwise, omit this
     * parameter. Encrypted snapshots are encrypted, even if you omit this
     * parameter and encryption by default is not enabled. You cannot set this
     * parameter to false. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         To encrypt a copy of an unencrypted snapshot if encryption by
     *         default is not enabled, enable encryption using this parameter.
     *         Otherwise, omit this parameter. Encrypted snapshots are
     *         encrypted, even if you omit this parameter and encryption by
     *         default is not enabled. You cannot set this parameter to false.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     *         >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is
     * not enabled, enable encryption using this parameter. Otherwise, omit this
     * parameter. Encrypted snapshots are encrypted, even if you omit this
     * parameter and encryption by default is not enabled. You cannot set this
     * parameter to false. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         To encrypt a copy of an unencrypted snapshot if encryption by
     *         default is not enabled, enable encryption using this parameter.
     *         Otherwise, omit this parameter. Encrypted snapshots are
     *         encrypted, even if you omit this parameter and encryption by
     *         default is not enabled. You cannot set this parameter to false.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     *         >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is
     * not enabled, enable encryption using this parameter. Otherwise, omit this
     * parameter. Encrypted snapshots are encrypted, even if you omit this
     * parameter and encryption by default is not enabled. You cannot set this
     * parameter to false. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @param encrypted <p>
     *            To encrypt a copy of an unencrypted snapshot if encryption by
     *            default is not enabled, enable encryption using this
     *            parameter. Otherwise, omit this parameter. Encrypted snapshots
     *            are encrypted, even if you omit this parameter and encryption
     *            by default is not enabled. You cannot set this parameter to
     *            false. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     *            >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot if encryption by default is
     * not enabled, enable encryption using this parameter. Otherwise, omit this
     * parameter. Encrypted snapshots are encrypted, even if you omit this
     * parameter and encryption by default is not enabled. You cannot set this
     * parameter to false. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            To encrypt a copy of an unencrypted snapshot if encryption by
     *            default is not enabled, enable encryption using this
     *            parameter. Otherwise, omit this parameter. Encrypted snapshots
     *            are encrypted, even if you omit this parameter and encryption
     *            by default is not enabled. You cannot set this parameter to
     *            false. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     *            >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer
     * master key (CMK) to use for Amazon EBS encryption. If this parameter is
     * not specified, your AWS managed CMK for EBS is used. If
     * <code>KmsKeyId</code> is specified, the encrypted state must be
     * <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key
     * /<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias
     * /<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an
     * ID, alias, or ARN that is not valid, the action can appear to complete,
     * but eventually fails.
     * </p>
     *
     * @return <p>
     *         The identifier of the AWS Key Management Service (AWS KMS)
     *         customer master key (CMK) to use for Amazon EBS encryption. If
     *         this parameter is not specified, your AWS managed CMK for EBS is
     *         used. If <code>KmsKeyId</code> is specified, the encrypted state
     *         must be <code>true</code>.
     *         </p>
     *         <p>
     *         You can specify the CMK using any of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key alias. For example, alias/ExampleAlias.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *         </i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *         </i>:alias/<i>ExampleAlias</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         AWS authenticates the CMK asynchronously. Therefore, if you
     *         specify an ID, alias, or ARN that is not valid, the action can
     *         appear to complete, but eventually fails.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer
     * master key (CMK) to use for Amazon EBS encryption. If this parameter is
     * not specified, your AWS managed CMK for EBS is used. If
     * <code>KmsKeyId</code> is specified, the encrypted state must be
     * <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key
     * /<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias
     * /<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an
     * ID, alias, or ARN that is not valid, the action can appear to complete,
     * but eventually fails.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The identifier of the AWS Key Management Service (AWS KMS)
     *            customer master key (CMK) to use for Amazon EBS encryption. If
     *            this parameter is not specified, your AWS managed CMK for EBS
     *            is used. If <code>KmsKeyId</code> is specified, the encrypted
     *            state must be <code>true</code>.
     *            </p>
     *            <p>
     *            You can specify the CMK using any of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key alias. For example, alias/ExampleAlias.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN. For example,
     *            arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *            </i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias ARN. For example,
     *            arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *            </i>:alias/<i>ExampleAlias</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            AWS authenticates the CMK asynchronously. Therefore, if you
     *            specify an ID, alias, or ARN that is not valid, the action can
     *            appear to complete, but eventually fails.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS Key Management Service (AWS KMS) customer
     * master key (CMK) to use for Amazon EBS encryption. If this parameter is
     * not specified, your AWS managed CMK for EBS is used. If
     * <code>KmsKeyId</code> is specified, the encrypted state must be
     * <code>true</code>.
     * </p>
     * <p>
     * You can specify the CMK using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. For example, alias/ExampleAlias.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key
     * /<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias
     * /<i>ExampleAlias</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS authenticates the CMK asynchronously. Therefore, if you specify an
     * ID, alias, or ARN that is not valid, the action can appear to complete,
     * but eventually fails.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The identifier of the AWS Key Management Service (AWS KMS)
     *            customer master key (CMK) to use for Amazon EBS encryption. If
     *            this parameter is not specified, your AWS managed CMK for EBS
     *            is used. If <code>KmsKeyId</code> is specified, the encrypted
     *            state must be <code>true</code>.
     *            </p>
     *            <p>
     *            You can specify the CMK using any of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key alias. For example, alias/ExampleAlias.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN. For example,
     *            arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *            </i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias ARN. For example,
     *            arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *            </i>:alias/<i>ExampleAlias</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            AWS authenticates the CMK asynchronously. Therefore, if you
     *            specify an ID, alias, or ARN that is not valid, the action can
     *            appear to complete, but eventually fails.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * When you copy an encrypted source snapshot using the Amazon EC2 Query
     * API, you must supply a pre-signed URL. This parameter is optional for
     * unencrypted snapshots. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html"
     * >Query Requests</a>.
     * </p>
     * <p>
     * The <code>PresignedUrl</code> should use the snapshot source endpoint,
     * the <code>CopySnapshot</code> action, and include the
     * <code>SourceRegion</code>, <code>SourceSnapshotId</code>, and
     * <code>DestinationRegion</code> parameters. The <code>PresignedUrl</code>
     * must be signed using AWS Signature Version 4. Because EBS snapshots are
     * stored in Amazon S3, the signing algorithm for this parameter uses the
     * same logic that is described in <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     * >Authenticating Requests by Using Query Parameters (AWS Signature Version
     * 4)</a> in the <i>Amazon Simple Storage Service API Reference</i>. An
     * invalid or improperly signed <code>PresignedUrl</code> will cause the
     * copy operation to fail asynchronously, and the snapshot will move to an
     * <code>error</code> state.
     * </p>
     *
     * @return <p>
     *         When you copy an encrypted source snapshot using the Amazon EC2
     *         Query API, you must supply a pre-signed URL. This parameter is
     *         optional for unencrypted snapshots. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html"
     *         >Query Requests</a>.
     *         </p>
     *         <p>
     *         The <code>PresignedUrl</code> should use the snapshot source
     *         endpoint, the <code>CopySnapshot</code> action, and include the
     *         <code>SourceRegion</code>, <code>SourceSnapshotId</code>, and
     *         <code>DestinationRegion</code> parameters. The
     *         <code>PresignedUrl</code> must be signed using AWS Signature
     *         Version 4. Because EBS snapshots are stored in Amazon S3, the
     *         signing algorithm for this parameter uses the same logic that is
     *         described in <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     *         >Authenticating Requests by Using Query Parameters (AWS Signature
     *         Version 4)</a> in the <i>Amazon Simple Storage Service API
     *         Reference</i>. An invalid or improperly signed
     *         <code>PresignedUrl</code> will cause the copy operation to fail
     *         asynchronously, and the snapshot will move to an
     *         <code>error</code> state.
     *         </p>
     */
    public String getPresignedUrl() {
        return presignedUrl;
    }

    /**
     * <p>
     * When you copy an encrypted source snapshot using the Amazon EC2 Query
     * API, you must supply a pre-signed URL. This parameter is optional for
     * unencrypted snapshots. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html"
     * >Query Requests</a>.
     * </p>
     * <p>
     * The <code>PresignedUrl</code> should use the snapshot source endpoint,
     * the <code>CopySnapshot</code> action, and include the
     * <code>SourceRegion</code>, <code>SourceSnapshotId</code>, and
     * <code>DestinationRegion</code> parameters. The <code>PresignedUrl</code>
     * must be signed using AWS Signature Version 4. Because EBS snapshots are
     * stored in Amazon S3, the signing algorithm for this parameter uses the
     * same logic that is described in <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     * >Authenticating Requests by Using Query Parameters (AWS Signature Version
     * 4)</a> in the <i>Amazon Simple Storage Service API Reference</i>. An
     * invalid or improperly signed <code>PresignedUrl</code> will cause the
     * copy operation to fail asynchronously, and the snapshot will move to an
     * <code>error</code> state.
     * </p>
     *
     * @param presignedUrl <p>
     *            When you copy an encrypted source snapshot using the Amazon
     *            EC2 Query API, you must supply a pre-signed URL. This
     *            parameter is optional for unencrypted snapshots. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html"
     *            >Query Requests</a>.
     *            </p>
     *            <p>
     *            The <code>PresignedUrl</code> should use the snapshot source
     *            endpoint, the <code>CopySnapshot</code> action, and include
     *            the <code>SourceRegion</code>, <code>SourceSnapshotId</code>,
     *            and <code>DestinationRegion</code> parameters. The
     *            <code>PresignedUrl</code> must be signed using AWS Signature
     *            Version 4. Because EBS snapshots are stored in Amazon S3, the
     *            signing algorithm for this parameter uses the same logic that
     *            is described in <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     *            >Authenticating Requests by Using Query Parameters (AWS
     *            Signature Version 4)</a> in the <i>Amazon Simple Storage
     *            Service API Reference</i>. An invalid or improperly signed
     *            <code>PresignedUrl</code> will cause the copy operation to
     *            fail asynchronously, and the snapshot will move to an
     *            <code>error</code> state.
     *            </p>
     */
    public void setPresignedUrl(String presignedUrl) {
        this.presignedUrl = presignedUrl;
    }

    /**
     * <p>
     * When you copy an encrypted source snapshot using the Amazon EC2 Query
     * API, you must supply a pre-signed URL. This parameter is optional for
     * unencrypted snapshots. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html"
     * >Query Requests</a>.
     * </p>
     * <p>
     * The <code>PresignedUrl</code> should use the snapshot source endpoint,
     * the <code>CopySnapshot</code> action, and include the
     * <code>SourceRegion</code>, <code>SourceSnapshotId</code>, and
     * <code>DestinationRegion</code> parameters. The <code>PresignedUrl</code>
     * must be signed using AWS Signature Version 4. Because EBS snapshots are
     * stored in Amazon S3, the signing algorithm for this parameter uses the
     * same logic that is described in <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     * >Authenticating Requests by Using Query Parameters (AWS Signature Version
     * 4)</a> in the <i>Amazon Simple Storage Service API Reference</i>. An
     * invalid or improperly signed <code>PresignedUrl</code> will cause the
     * copy operation to fail asynchronously, and the snapshot will move to an
     * <code>error</code> state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param presignedUrl <p>
     *            When you copy an encrypted source snapshot using the Amazon
     *            EC2 Query API, you must supply a pre-signed URL. This
     *            parameter is optional for unencrypted snapshots. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html"
     *            >Query Requests</a>.
     *            </p>
     *            <p>
     *            The <code>PresignedUrl</code> should use the snapshot source
     *            endpoint, the <code>CopySnapshot</code> action, and include
     *            the <code>SourceRegion</code>, <code>SourceSnapshotId</code>,
     *            and <code>DestinationRegion</code> parameters. The
     *            <code>PresignedUrl</code> must be signed using AWS Signature
     *            Version 4. Because EBS snapshots are stored in Amazon S3, the
     *            signing algorithm for this parameter uses the same logic that
     *            is described in <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     *            >Authenticating Requests by Using Query Parameters (AWS
     *            Signature Version 4)</a> in the <i>Amazon Simple Storage
     *            Service API Reference</i>. An invalid or improperly signed
     *            <code>PresignedUrl</code> will cause the copy operation to
     *            fail asynchronously, and the snapshot will move to an
     *            <code>error</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withPresignedUrl(String presignedUrl) {
        this.presignedUrl = presignedUrl;
        return this;
    }

    /**
     * <p>
     * The ID of the Region that contains the snapshot to be copied.
     * </p>
     *
     * @return <p>
     *         The ID of the Region that contains the snapshot to be copied.
     *         </p>
     */
    public String getSourceRegion() {
        return sourceRegion;
    }

    /**
     * <p>
     * The ID of the Region that contains the snapshot to be copied.
     * </p>
     *
     * @param sourceRegion <p>
     *            The ID of the Region that contains the snapshot to be copied.
     *            </p>
     */
    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The ID of the Region that contains the snapshot to be copied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceRegion <p>
     *            The ID of the Region that contains the snapshot to be copied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /**
     * <p>
     * The ID of the EBS snapshot to copy.
     * </p>
     *
     * @return <p>
     *         The ID of the EBS snapshot to copy.
     *         </p>
     */
    public String getSourceSnapshotId() {
        return sourceSnapshotId;
    }

    /**
     * <p>
     * The ID of the EBS snapshot to copy.
     * </p>
     *
     * @param sourceSnapshotId <p>
     *            The ID of the EBS snapshot to copy.
     *            </p>
     */
    public void setSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
    }

    /**
     * <p>
     * The ID of the EBS snapshot to copy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceSnapshotId <p>
     *            The ID of the EBS snapshot to copy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
        return this;
    }

    /**
     * <p>
     * The tags to apply to the new snapshot.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the new snapshot.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the new snapshot.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the new snapshot.
     *            </p>
     */
    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new java.util.ArrayList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the new snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the new snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (getTagSpecifications() == null) {
            this.tagSpecifications = new java.util.ArrayList<TagSpecification>(
                    tagSpecifications.length);
        }
        for (TagSpecification value : tagSpecifications) {
            this.tagSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the new snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the new snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withTagSpecifications(
            java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDestinationRegion() != null)
            sb.append("DestinationRegion: " + getDestinationRegion() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getPresignedUrl() != null)
            sb.append("PresignedUrl: " + getPresignedUrl() + ",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: " + getSourceRegion() + ",");
        if (getSourceSnapshotId() != null)
            sb.append("SourceSnapshotId: " + getSourceSnapshotId() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationRegion() == null) ? 0 : getDestinationRegion().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getPresignedUrl() == null) ? 0 : getPresignedUrl().hashCode());
        hashCode = prime * hashCode
                + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode
                + ((getSourceSnapshotId() == null) ? 0 : getSourceSnapshotId().hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopySnapshotRequest == false)
            return false;
        CopySnapshotRequest other = (CopySnapshotRequest) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDestinationRegion() == null ^ this.getDestinationRegion() == null)
            return false;
        if (other.getDestinationRegion() != null
                && other.getDestinationRegion().equals(this.getDestinationRegion()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null
                && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPresignedUrl() == null ^ this.getPresignedUrl() == null)
            return false;
        if (other.getPresignedUrl() != null
                && other.getPresignedUrl().equals(this.getPresignedUrl()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null
                && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        if (other.getSourceSnapshotId() == null ^ this.getSourceSnapshotId() == null)
            return false;
        if (other.getSourceSnapshotId() != null
                && other.getSourceSnapshotId().equals(this.getSourceSnapshotId()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
