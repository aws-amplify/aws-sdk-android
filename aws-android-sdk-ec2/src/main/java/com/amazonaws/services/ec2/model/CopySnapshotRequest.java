/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CopySnapshotRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#copySnapshot(CopySnapshotRequest) CopySnapshot operation}.
 * <p>
 * Copies a point-in-time snapshot of an EBS volume and stores it in
 * Amazon S3. You can copy the snapshot within the same region or from
 * one region to another. You can use the snapshot to create EBS volumes
 * or Amazon Machine Images (AMIs). The snapshot is copied to the
 * regional endpoint that you send the HTTP request to.
 * </p>
 * <p>
 * Copies of encrypted EBS snapshots remain encrypted. Copies of
 * unencrypted snapshots remain unencrypted, unless the
 * <code>Encrypted</code> flag is specified during the snapshot copy
 * operation. By default, encrypted snapshot copies use the default AWS
 * Key Management Service (AWS KMS) customer master key (CMK); however,
 * you can specify a non-default CMK with the <code>KmsKeyId</code>
 * parameter.
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-copy-snapshot.html"> Copying an Amazon EBS Snapshot </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#copySnapshot(CopySnapshotRequest)
 */
public class CopySnapshotRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CopySnapshotRequest> {

    /**
     * The ID of the region that contains the snapshot to be copied.
     */
    private String sourceRegion;

    /**
     * The ID of the EBS snapshot to copy.
     */
    private String sourceSnapshotId;

    /**
     * A description for the EBS snapshot.
     */
    private String description;

    /**
     * The destination region to use in the <code>PresignedUrl</code>
     * parameter of a snapshot copy operation. This parameter is only valid
     * for specifying the destination region in a <code>PresignedUrl</code>
     * parameter, where it is required. <note> <p><code>CopySnapshot</code>
     * sends the snapshot copy to the regional endpoint that you send the
     * HTTP request to, such as <code>ec2.us-east-1.amazonaws.com</code> (in
     * the AWS CLI, this is specified with the <code>--region</code>
     * parameter or the default region in your AWS configuration file).
     * </note>
     */
    private String destinationRegion;

    /**
     * The pre-signed URL that facilitates copying an encrypted snapshot.
     * This parameter is only required when copying an encrypted snapshot
     * with the Amazon EC2 Query API; it is available as an optional
     * parameter in all other cases. The <code>PresignedUrl</code> should use
     * the snapshot source endpoint, the <code>CopySnapshot</code> action,
     * and include the <code>SourceRegion</code>,
     * <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     * parameters. The <code>PresignedUrl</code> must be signed using AWS
     * Signature Version 4. Because EBS snapshots are stored in Amazon S3,
     * the signing algorithm for this parameter uses the same logic that is
     * described in <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     * Requests by Using Query Parameters (AWS Signature Version 4)</a> in
     * the <i>Amazon Simple Storage Service API Reference</i>. An invalid or
     * improperly signed <code>PresignedUrl</code> will cause the copy
     * operation to fail asynchronously, and the snapshot will move to an
     * <code>error</code> state.
     */
    private String presignedUrl;

    /**
     * Specifies whether the destination snapshot should be encrypted. There
     * is no way to create an unencrypted snapshot copy from an encrypted
     * snapshot; however, you can encrypt a copy of an unencrypted snapshot
     * with this flag. The default CMK for EBS is used unless a non-default
     * AWS Key Management Service (AWS KMS) CMK is specified with
     * <code>KmsKeyId</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     */
    private Boolean encrypted;

    /**
     * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use
     * when creating the snapshot copy. This parameter is only required if
     * you want to use a non-default CMK; if this parameter is not specified,
     * the default CMK for EBS is used. The ARN contains the
     * <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     * the AWS account ID of the CMK owner, the <code>key</code> namespace,
     * and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * The specified CMK must exist in the region that the snapshot is being
     * copied to. If a <code>KmsKeyId</code> is specified, the
     * <code>Encrypted</code> flag must also be set.
     */
    private String kmsKeyId;

    /**
     * The ID of the region that contains the snapshot to be copied.
     *
     * @return The ID of the region that contains the snapshot to be copied.
     */
    public String getSourceRegion() {
        return sourceRegion;
    }
    
    /**
     * The ID of the region that contains the snapshot to be copied.
     *
     * @param sourceRegion The ID of the region that contains the snapshot to be copied.
     */
    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }
    
    /**
     * The ID of the region that contains the snapshot to be copied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceRegion The ID of the region that contains the snapshot to be copied.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopySnapshotRequest withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /**
     * The ID of the EBS snapshot to copy.
     *
     * @return The ID of the EBS snapshot to copy.
     */
    public String getSourceSnapshotId() {
        return sourceSnapshotId;
    }
    
    /**
     * The ID of the EBS snapshot to copy.
     *
     * @param sourceSnapshotId The ID of the EBS snapshot to copy.
     */
    public void setSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
    }
    
    /**
     * The ID of the EBS snapshot to copy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSnapshotId The ID of the EBS snapshot to copy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopySnapshotRequest withSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
        return this;
    }

    /**
     * A description for the EBS snapshot.
     *
     * @return A description for the EBS snapshot.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description for the EBS snapshot.
     *
     * @param description A description for the EBS snapshot.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description for the EBS snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description for the EBS snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopySnapshotRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The destination region to use in the <code>PresignedUrl</code>
     * parameter of a snapshot copy operation. This parameter is only valid
     * for specifying the destination region in a <code>PresignedUrl</code>
     * parameter, where it is required. <note> <p><code>CopySnapshot</code>
     * sends the snapshot copy to the regional endpoint that you send the
     * HTTP request to, such as <code>ec2.us-east-1.amazonaws.com</code> (in
     * the AWS CLI, this is specified with the <code>--region</code>
     * parameter or the default region in your AWS configuration file).
     * </note>
     *
     * @return The destination region to use in the <code>PresignedUrl</code>
     *         parameter of a snapshot copy operation. This parameter is only valid
     *         for specifying the destination region in a <code>PresignedUrl</code>
     *         parameter, where it is required. <note> <p><code>CopySnapshot</code>
     *         sends the snapshot copy to the regional endpoint that you send the
     *         HTTP request to, such as <code>ec2.us-east-1.amazonaws.com</code> (in
     *         the AWS CLI, this is specified with the <code>--region</code>
     *         parameter or the default region in your AWS configuration file).
     *         </note>
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }
    
    /**
     * The destination region to use in the <code>PresignedUrl</code>
     * parameter of a snapshot copy operation. This parameter is only valid
     * for specifying the destination region in a <code>PresignedUrl</code>
     * parameter, where it is required. <note> <p><code>CopySnapshot</code>
     * sends the snapshot copy to the regional endpoint that you send the
     * HTTP request to, such as <code>ec2.us-east-1.amazonaws.com</code> (in
     * the AWS CLI, this is specified with the <code>--region</code>
     * parameter or the default region in your AWS configuration file).
     * </note>
     *
     * @param destinationRegion The destination region to use in the <code>PresignedUrl</code>
     *         parameter of a snapshot copy operation. This parameter is only valid
     *         for specifying the destination region in a <code>PresignedUrl</code>
     *         parameter, where it is required. <note> <p><code>CopySnapshot</code>
     *         sends the snapshot copy to the regional endpoint that you send the
     *         HTTP request to, such as <code>ec2.us-east-1.amazonaws.com</code> (in
     *         the AWS CLI, this is specified with the <code>--region</code>
     *         parameter or the default region in your AWS configuration file).
     *         </note>
     */
    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }
    
    /**
     * The destination region to use in the <code>PresignedUrl</code>
     * parameter of a snapshot copy operation. This parameter is only valid
     * for specifying the destination region in a <code>PresignedUrl</code>
     * parameter, where it is required. <note> <p><code>CopySnapshot</code>
     * sends the snapshot copy to the regional endpoint that you send the
     * HTTP request to, such as <code>ec2.us-east-1.amazonaws.com</code> (in
     * the AWS CLI, this is specified with the <code>--region</code>
     * parameter or the default region in your AWS configuration file).
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinationRegion The destination region to use in the <code>PresignedUrl</code>
     *         parameter of a snapshot copy operation. This parameter is only valid
     *         for specifying the destination region in a <code>PresignedUrl</code>
     *         parameter, where it is required. <note> <p><code>CopySnapshot</code>
     *         sends the snapshot copy to the regional endpoint that you send the
     *         HTTP request to, such as <code>ec2.us-east-1.amazonaws.com</code> (in
     *         the AWS CLI, this is specified with the <code>--region</code>
     *         parameter or the default region in your AWS configuration file).
     *         </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopySnapshotRequest withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * The pre-signed URL that facilitates copying an encrypted snapshot.
     * This parameter is only required when copying an encrypted snapshot
     * with the Amazon EC2 Query API; it is available as an optional
     * parameter in all other cases. The <code>PresignedUrl</code> should use
     * the snapshot source endpoint, the <code>CopySnapshot</code> action,
     * and include the <code>SourceRegion</code>,
     * <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     * parameters. The <code>PresignedUrl</code> must be signed using AWS
     * Signature Version 4. Because EBS snapshots are stored in Amazon S3,
     * the signing algorithm for this parameter uses the same logic that is
     * described in <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     * Requests by Using Query Parameters (AWS Signature Version 4)</a> in
     * the <i>Amazon Simple Storage Service API Reference</i>. An invalid or
     * improperly signed <code>PresignedUrl</code> will cause the copy
     * operation to fail asynchronously, and the snapshot will move to an
     * <code>error</code> state.
     *
     * @return The pre-signed URL that facilitates copying an encrypted snapshot.
     *         This parameter is only required when copying an encrypted snapshot
     *         with the Amazon EC2 Query API; it is available as an optional
     *         parameter in all other cases. The <code>PresignedUrl</code> should use
     *         the snapshot source endpoint, the <code>CopySnapshot</code> action,
     *         and include the <code>SourceRegion</code>,
     *         <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     *         parameters. The <code>PresignedUrl</code> must be signed using AWS
     *         Signature Version 4. Because EBS snapshots are stored in Amazon S3,
     *         the signing algorithm for this parameter uses the same logic that is
     *         described in <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     *         Requests by Using Query Parameters (AWS Signature Version 4)</a> in
     *         the <i>Amazon Simple Storage Service API Reference</i>. An invalid or
     *         improperly signed <code>PresignedUrl</code> will cause the copy
     *         operation to fail asynchronously, and the snapshot will move to an
     *         <code>error</code> state.
     */
    public String getPresignedUrl() {
        return presignedUrl;
    }
    
    /**
     * The pre-signed URL that facilitates copying an encrypted snapshot.
     * This parameter is only required when copying an encrypted snapshot
     * with the Amazon EC2 Query API; it is available as an optional
     * parameter in all other cases. The <code>PresignedUrl</code> should use
     * the snapshot source endpoint, the <code>CopySnapshot</code> action,
     * and include the <code>SourceRegion</code>,
     * <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     * parameters. The <code>PresignedUrl</code> must be signed using AWS
     * Signature Version 4. Because EBS snapshots are stored in Amazon S3,
     * the signing algorithm for this parameter uses the same logic that is
     * described in <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     * Requests by Using Query Parameters (AWS Signature Version 4)</a> in
     * the <i>Amazon Simple Storage Service API Reference</i>. An invalid or
     * improperly signed <code>PresignedUrl</code> will cause the copy
     * operation to fail asynchronously, and the snapshot will move to an
     * <code>error</code> state.
     *
     * @param presignedUrl The pre-signed URL that facilitates copying an encrypted snapshot.
     *         This parameter is only required when copying an encrypted snapshot
     *         with the Amazon EC2 Query API; it is available as an optional
     *         parameter in all other cases. The <code>PresignedUrl</code> should use
     *         the snapshot source endpoint, the <code>CopySnapshot</code> action,
     *         and include the <code>SourceRegion</code>,
     *         <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     *         parameters. The <code>PresignedUrl</code> must be signed using AWS
     *         Signature Version 4. Because EBS snapshots are stored in Amazon S3,
     *         the signing algorithm for this parameter uses the same logic that is
     *         described in <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     *         Requests by Using Query Parameters (AWS Signature Version 4)</a> in
     *         the <i>Amazon Simple Storage Service API Reference</i>. An invalid or
     *         improperly signed <code>PresignedUrl</code> will cause the copy
     *         operation to fail asynchronously, and the snapshot will move to an
     *         <code>error</code> state.
     */
    public void setPresignedUrl(String presignedUrl) {
        this.presignedUrl = presignedUrl;
    }
    
    /**
     * The pre-signed URL that facilitates copying an encrypted snapshot.
     * This parameter is only required when copying an encrypted snapshot
     * with the Amazon EC2 Query API; it is available as an optional
     * parameter in all other cases. The <code>PresignedUrl</code> should use
     * the snapshot source endpoint, the <code>CopySnapshot</code> action,
     * and include the <code>SourceRegion</code>,
     * <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     * parameters. The <code>PresignedUrl</code> must be signed using AWS
     * Signature Version 4. Because EBS snapshots are stored in Amazon S3,
     * the signing algorithm for this parameter uses the same logic that is
     * described in <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     * Requests by Using Query Parameters (AWS Signature Version 4)</a> in
     * the <i>Amazon Simple Storage Service API Reference</i>. An invalid or
     * improperly signed <code>PresignedUrl</code> will cause the copy
     * operation to fail asynchronously, and the snapshot will move to an
     * <code>error</code> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param presignedUrl The pre-signed URL that facilitates copying an encrypted snapshot.
     *         This parameter is only required when copying an encrypted snapshot
     *         with the Amazon EC2 Query API; it is available as an optional
     *         parameter in all other cases. The <code>PresignedUrl</code> should use
     *         the snapshot source endpoint, the <code>CopySnapshot</code> action,
     *         and include the <code>SourceRegion</code>,
     *         <code>SourceSnapshotId</code>, and <code>DestinationRegion</code>
     *         parameters. The <code>PresignedUrl</code> must be signed using AWS
     *         Signature Version 4. Because EBS snapshots are stored in Amazon S3,
     *         the signing algorithm for this parameter uses the same logic that is
     *         described in <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     *         Requests by Using Query Parameters (AWS Signature Version 4)</a> in
     *         the <i>Amazon Simple Storage Service API Reference</i>. An invalid or
     *         improperly signed <code>PresignedUrl</code> will cause the copy
     *         operation to fail asynchronously, and the snapshot will move to an
     *         <code>error</code> state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopySnapshotRequest withPresignedUrl(String presignedUrl) {
        this.presignedUrl = presignedUrl;
        return this;
    }

    /**
     * Specifies whether the destination snapshot should be encrypted. There
     * is no way to create an unencrypted snapshot copy from an encrypted
     * snapshot; however, you can encrypt a copy of an unencrypted snapshot
     * with this flag. The default CMK for EBS is used unless a non-default
     * AWS Key Management Service (AWS KMS) CMK is specified with
     * <code>KmsKeyId</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @return Specifies whether the destination snapshot should be encrypted. There
     *         is no way to create an unencrypted snapshot copy from an encrypted
     *         snapshot; however, you can encrypt a copy of an unencrypted snapshot
     *         with this flag. The default CMK for EBS is used unless a non-default
     *         AWS Key Management Service (AWS KMS) CMK is specified with
     *         <code>KmsKeyId</code>. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     *         EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public Boolean isEncrypted() {
        return encrypted;
    }
    
    /**
     * Specifies whether the destination snapshot should be encrypted. There
     * is no way to create an unencrypted snapshot copy from an encrypted
     * snapshot; however, you can encrypt a copy of an unencrypted snapshot
     * with this flag. The default CMK for EBS is used unless a non-default
     * AWS Key Management Service (AWS KMS) CMK is specified with
     * <code>KmsKeyId</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @param encrypted Specifies whether the destination snapshot should be encrypted. There
     *         is no way to create an unencrypted snapshot copy from an encrypted
     *         snapshot; however, you can encrypt a copy of an unencrypted snapshot
     *         with this flag. The default CMK for EBS is used unless a non-default
     *         AWS Key Management Service (AWS KMS) CMK is specified with
     *         <code>KmsKeyId</code>. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     *         EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }
    
    /**
     * Specifies whether the destination snapshot should be encrypted. There
     * is no way to create an unencrypted snapshot copy from an encrypted
     * snapshot; however, you can encrypt a copy of an unencrypted snapshot
     * with this flag. The default CMK for EBS is used unless a non-default
     * AWS Key Management Service (AWS KMS) CMK is specified with
     * <code>KmsKeyId</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param encrypted Specifies whether the destination snapshot should be encrypted. There
     *         is no way to create an unencrypted snapshot copy from an encrypted
     *         snapshot; however, you can encrypt a copy of an unencrypted snapshot
     *         with this flag. The default CMK for EBS is used unless a non-default
     *         AWS Key Management Service (AWS KMS) CMK is specified with
     *         <code>KmsKeyId</code>. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     *         EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopySnapshotRequest withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * Specifies whether the destination snapshot should be encrypted. There
     * is no way to create an unencrypted snapshot copy from an encrypted
     * snapshot; however, you can encrypt a copy of an unencrypted snapshot
     * with this flag. The default CMK for EBS is used unless a non-default
     * AWS Key Management Service (AWS KMS) CMK is specified with
     * <code>KmsKeyId</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     * EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     *
     * @return Specifies whether the destination snapshot should be encrypted. There
     *         is no way to create an unencrypted snapshot copy from an encrypted
     *         snapshot; however, you can encrypt a copy of an unencrypted snapshot
     *         with this flag. The default CMK for EBS is used unless a non-default
     *         AWS Key Management Service (AWS KMS) CMK is specified with
     *         <code>KmsKeyId</code>. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon
     *         EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use
     * when creating the snapshot copy. This parameter is only required if
     * you want to use a non-default CMK; if this parameter is not specified,
     * the default CMK for EBS is used. The ARN contains the
     * <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     * the AWS account ID of the CMK owner, the <code>key</code> namespace,
     * and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * The specified CMK must exist in the region that the snapshot is being
     * copied to. If a <code>KmsKeyId</code> is specified, the
     * <code>Encrypted</code> flag must also be set.
     *
     * @return The full ARN of the AWS Key Management Service (AWS KMS) CMK to use
     *         when creating the snapshot copy. This parameter is only required if
     *         you want to use a non-default CMK; if this parameter is not specified,
     *         the default CMK for EBS is used. The ARN contains the
     *         <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     *         the AWS account ID of the CMK owner, the <code>key</code> namespace,
     *         and then the CMK ID. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *         The specified CMK must exist in the region that the snapshot is being
     *         copied to. If a <code>KmsKeyId</code> is specified, the
     *         <code>Encrypted</code> flag must also be set.
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }
    
    /**
     * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use
     * when creating the snapshot copy. This parameter is only required if
     * you want to use a non-default CMK; if this parameter is not specified,
     * the default CMK for EBS is used. The ARN contains the
     * <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     * the AWS account ID of the CMK owner, the <code>key</code> namespace,
     * and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * The specified CMK must exist in the region that the snapshot is being
     * copied to. If a <code>KmsKeyId</code> is specified, the
     * <code>Encrypted</code> flag must also be set.
     *
     * @param kmsKeyId The full ARN of the AWS Key Management Service (AWS KMS) CMK to use
     *         when creating the snapshot copy. This parameter is only required if
     *         you want to use a non-default CMK; if this parameter is not specified,
     *         the default CMK for EBS is used. The ARN contains the
     *         <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     *         the AWS account ID of the CMK owner, the <code>key</code> namespace,
     *         and then the CMK ID. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *         The specified CMK must exist in the region that the snapshot is being
     *         copied to. If a <code>KmsKeyId</code> is specified, the
     *         <code>Encrypted</code> flag must also be set.
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }
    
    /**
     * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use
     * when creating the snapshot copy. This parameter is only required if
     * you want to use a non-default CMK; if this parameter is not specified,
     * the default CMK for EBS is used. The ARN contains the
     * <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     * the AWS account ID of the CMK owner, the <code>key</code> namespace,
     * and then the CMK ID. For example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     * The specified CMK must exist in the region that the snapshot is being
     * copied to. If a <code>KmsKeyId</code> is specified, the
     * <code>Encrypted</code> flag must also be set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kmsKeyId The full ARN of the AWS Key Management Service (AWS KMS) CMK to use
     *         when creating the snapshot copy. This parameter is only required if
     *         you want to use a non-default CMK; if this parameter is not specified,
     *         the default CMK for EBS is used. The ARN contains the
     *         <code>arn:aws:kms</code> namespace, followed by the region of the CMK,
     *         the AWS account ID of the CMK owner, the <code>key</code> namespace,
     *         and then the CMK ID. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-a123-456a-a12b-a123b4cd56ef</i>.
     *         The specified CMK must exist in the region that the snapshot is being
     *         copied to. If a <code>KmsKeyId</code> is specified, the
     *         <code>Encrypted</code> flag must also be set.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopySnapshotRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CopySnapshotRequest> getDryRunRequest() {
        Request<CopySnapshotRequest> request = new CopySnapshotRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSourceRegion() != null) sb.append("SourceRegion: " + getSourceRegion() + ",");
        if (getSourceSnapshotId() != null) sb.append("SourceSnapshotId: " + getSourceSnapshotId() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getDestinationRegion() != null) sb.append("DestinationRegion: " + getDestinationRegion() + ",");
        if (getPresignedUrl() != null) sb.append("PresignedUrl: " + getPresignedUrl() + ",");
        if (isEncrypted() != null) sb.append("Encrypted: " + isEncrypted() + ",");
        if (getKmsKeyId() != null) sb.append("KmsKeyId: " + getKmsKeyId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode()); 
        hashCode = prime * hashCode + ((getSourceSnapshotId() == null) ? 0 : getSourceSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getDestinationRegion() == null) ? 0 : getDestinationRegion().hashCode()); 
        hashCode = prime * hashCode + ((getPresignedUrl() == null) ? 0 : getPresignedUrl().hashCode()); 
        hashCode = prime * hashCode + ((isEncrypted() == null) ? 0 : isEncrypted().hashCode()); 
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CopySnapshotRequest == false) return false;
        CopySnapshotRequest other = (CopySnapshotRequest)obj;
        
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null) return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false) return false; 
        if (other.getSourceSnapshotId() == null ^ this.getSourceSnapshotId() == null) return false;
        if (other.getSourceSnapshotId() != null && other.getSourceSnapshotId().equals(this.getSourceSnapshotId()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getDestinationRegion() == null ^ this.getDestinationRegion() == null) return false;
        if (other.getDestinationRegion() != null && other.getDestinationRegion().equals(this.getDestinationRegion()) == false) return false; 
        if (other.getPresignedUrl() == null ^ this.getPresignedUrl() == null) return false;
        if (other.getPresignedUrl() != null && other.getPresignedUrl().equals(this.getPresignedUrl()) == false) return false; 
        if (other.isEncrypted() == null ^ this.isEncrypted() == null) return false;
        if (other.isEncrypted() != null && other.isEncrypted().equals(this.isEncrypted()) == false) return false; 
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null) return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false) return false; 
        return true;
    }
    
}
    