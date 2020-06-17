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
 * Initiates the copy of an AMI from the specified source Region to the current
 * Region. You specify the destination Region by using its endpoint when making
 * the request.
 * </p>
 * <p>
 * Copies of encrypted backing snapshots for the AMI are encrypted. Copies of
 * unencrypted backing snapshots remain unencrypted, unless you set
 * <code>Encrypted</code> during the copy operation. You cannot create an
 * unencrypted copy of an encrypted backing snapshot.
 * </p>
 * <p>
 * For more information about the prerequisites and limits when copying an AMI,
 * see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/CopyingAMIs.html"
 * >Copying an AMI</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
 * </p>
 */
public class CopyImageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * A description for the new AMI in the destination Region.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Specifies whether the destination snapshots of the copied image should be
     * encrypted. You can encrypt a copy of an unencrypted snapshot, but you
     * cannot create an unencrypted copy of an encrypted snapshot. The default
     * CMK for EBS is used unless you specify a non-default AWS Key Management
     * Service (AWS KMS) CMK using <code>KmsKeyId</code>. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * An identifier for the symmetric AWS Key Management Service (AWS KMS)
     * customer master key (CMK) to use when creating the encrypted volume. This
     * parameter is only required if you want to use a non-default CMK; if this
     * parameter is not specified, the default CMK for EBS is used. If a
     * <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must
     * also be set.
     * </p>
     * <p>
     * To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name,
     * or alias ARN. When using an alias name, prefix it with "alias/". For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS parses <code>KmsKeyId</code> asynchronously, meaning that the action
     * you call may appear to complete even though you provided an invalid
     * identifier. This action will eventually report failure.
     * </p>
     * <p>
     * The specified CMK must exist in the Region that the snapshot is being
     * copied to.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The name of the new AMI in the destination Region.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ID of the AMI to copy.
     * </p>
     */
    private String sourceImageId;

    /**
     * <p>
     * The name of the Region that contains the AMI to copy.
     * </p>
     */
    private String sourceRegion;

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
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier you provide to ensure
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     *         >How to Ensure Idempotency</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier you provide to ensure
     *            idempotency of the request. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a> in the <i>Amazon Elastic
     *            Compute Cloud User Guide</i>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier you provide to ensure
     *            idempotency of the request. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a> in the <i>Amazon Elastic
     *            Compute Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyImageRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * A description for the new AMI in the destination Region.
     * </p>
     *
     * @return <p>
     *         A description for the new AMI in the destination Region.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the new AMI in the destination Region.
     * </p>
     *
     * @param description <p>
     *            A description for the new AMI in the destination Region.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the new AMI in the destination Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for the new AMI in the destination Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyImageRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Specifies whether the destination snapshots of the copied image should be
     * encrypted. You can encrypt a copy of an unencrypted snapshot, but you
     * cannot create an unencrypted copy of an encrypted snapshot. The default
     * CMK for EBS is used unless you specify a non-default AWS Key Management
     * Service (AWS KMS) CMK using <code>KmsKeyId</code>. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether the destination snapshots of the copied image
     *         should be encrypted. You can encrypt a copy of an unencrypted
     *         snapshot, but you cannot create an unencrypted copy of an
     *         encrypted snapshot. The default CMK for EBS is used unless you
     *         specify a non-default AWS Key Management Service (AWS KMS) CMK
     *         using <code>KmsKeyId</code>. For more information, see <a href=
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
     * Specifies whether the destination snapshots of the copied image should be
     * encrypted. You can encrypt a copy of an unencrypted snapshot, but you
     * cannot create an unencrypted copy of an encrypted snapshot. The default
     * CMK for EBS is used unless you specify a non-default AWS Key Management
     * Service (AWS KMS) CMK using <code>KmsKeyId</code>. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether the destination snapshots of the copied image
     *         should be encrypted. You can encrypt a copy of an unencrypted
     *         snapshot, but you cannot create an unencrypted copy of an
     *         encrypted snapshot. The default CMK for EBS is used unless you
     *         specify a non-default AWS Key Management Service (AWS KMS) CMK
     *         using <code>KmsKeyId</code>. For more information, see <a href=
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
     * Specifies whether the destination snapshots of the copied image should be
     * encrypted. You can encrypt a copy of an unencrypted snapshot, but you
     * cannot create an unencrypted copy of an encrypted snapshot. The default
     * CMK for EBS is used unless you specify a non-default AWS Key Management
     * Service (AWS KMS) CMK using <code>KmsKeyId</code>. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @param encrypted <p>
     *            Specifies whether the destination snapshots of the copied
     *            image should be encrypted. You can encrypt a copy of an
     *            unencrypted snapshot, but you cannot create an unencrypted
     *            copy of an encrypted snapshot. The default CMK for EBS is used
     *            unless you specify a non-default AWS Key Management Service
     *            (AWS KMS) CMK using <code>KmsKeyId</code>. For more
     *            information, see <a href=
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
     * Specifies whether the destination snapshots of the copied image should be
     * encrypted. You can encrypt a copy of an unencrypted snapshot, but you
     * cannot create an unencrypted copy of an encrypted snapshot. The default
     * CMK for EBS is used unless you specify a non-default AWS Key Management
     * Service (AWS KMS) CMK using <code>KmsKeyId</code>. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            Specifies whether the destination snapshots of the copied
     *            image should be encrypted. You can encrypt a copy of an
     *            unencrypted snapshot, but you cannot create an unencrypted
     *            copy of an encrypted snapshot. The default CMK for EBS is used
     *            unless you specify a non-default AWS Key Management Service
     *            (AWS KMS) CMK using <code>KmsKeyId</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     *            >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyImageRequest withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * An identifier for the symmetric AWS Key Management Service (AWS KMS)
     * customer master key (CMK) to use when creating the encrypted volume. This
     * parameter is only required if you want to use a non-default CMK; if this
     * parameter is not specified, the default CMK for EBS is used. If a
     * <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must
     * also be set.
     * </p>
     * <p>
     * To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name,
     * or alias ARN. When using an alias name, prefix it with "alias/". For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS parses <code>KmsKeyId</code> asynchronously, meaning that the action
     * you call may appear to complete even though you provided an invalid
     * identifier. This action will eventually report failure.
     * </p>
     * <p>
     * The specified CMK must exist in the Region that the snapshot is being
     * copied to.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     *
     * @return <p>
     *         An identifier for the symmetric AWS Key Management Service (AWS
     *         KMS) customer master key (CMK) to use when creating the encrypted
     *         volume. This parameter is only required if you want to use a
     *         non-default CMK; if this parameter is not specified, the default
     *         CMK for EBS is used. If a <code>KmsKeyId</code> is specified, the
     *         <code>Encrypted</code> flag must also be set.
     *         </p>
     *         <p>
     *         To specify a CMK, use its key ID, Amazon Resource Name (ARN),
     *         alias name, or alias ARN. When using an alias name, prefix it
     *         with "alias/". For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN:
     *         <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias name: <code>alias/ExampleAlias</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN:
     *         <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         AWS parses <code>KmsKeyId</code> asynchronously, meaning that the
     *         action you call may appear to complete even though you provided
     *         an invalid identifier. This action will eventually report
     *         failure.
     *         </p>
     *         <p>
     *         The specified CMK must exist in the Region that the snapshot is
     *         being copied to.
     *         </p>
     *         <p>
     *         Amazon EBS does not support asymmetric CMKs.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * An identifier for the symmetric AWS Key Management Service (AWS KMS)
     * customer master key (CMK) to use when creating the encrypted volume. This
     * parameter is only required if you want to use a non-default CMK; if this
     * parameter is not specified, the default CMK for EBS is used. If a
     * <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must
     * also be set.
     * </p>
     * <p>
     * To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name,
     * or alias ARN. When using an alias name, prefix it with "alias/". For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS parses <code>KmsKeyId</code> asynchronously, meaning that the action
     * you call may appear to complete even though you provided an invalid
     * identifier. This action will eventually report failure.
     * </p>
     * <p>
     * The specified CMK must exist in the Region that the snapshot is being
     * copied to.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     *
     * @param kmsKeyId <p>
     *            An identifier for the symmetric AWS Key Management Service
     *            (AWS KMS) customer master key (CMK) to use when creating the
     *            encrypted volume. This parameter is only required if you want
     *            to use a non-default CMK; if this parameter is not specified,
     *            the default CMK for EBS is used. If a <code>KmsKeyId</code> is
     *            specified, the <code>Encrypted</code> flag must also be set.
     *            </p>
     *            <p>
     *            To specify a CMK, use its key ID, Amazon Resource Name (ARN),
     *            alias name, or alias ARN. When using an alias name, prefix it
     *            with "alias/". For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias name: <code>alias/ExampleAlias</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            AWS parses <code>KmsKeyId</code> asynchronously, meaning that
     *            the action you call may appear to complete even though you
     *            provided an invalid identifier. This action will eventually
     *            report failure.
     *            </p>
     *            <p>
     *            The specified CMK must exist in the Region that the snapshot
     *            is being copied to.
     *            </p>
     *            <p>
     *            Amazon EBS does not support asymmetric CMKs.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * An identifier for the symmetric AWS Key Management Service (AWS KMS)
     * customer master key (CMK) to use when creating the encrypted volume. This
     * parameter is only required if you want to use a non-default CMK; if this
     * parameter is not specified, the default CMK for EBS is used. If a
     * <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must
     * also be set.
     * </p>
     * <p>
     * To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name,
     * or alias ARN. When using an alias name, prefix it with "alias/". For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS parses <code>KmsKeyId</code> asynchronously, meaning that the action
     * you call may appear to complete even though you provided an invalid
     * identifier. This action will eventually report failure.
     * </p>
     * <p>
     * The specified CMK must exist in the Region that the snapshot is being
     * copied to.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            An identifier for the symmetric AWS Key Management Service
     *            (AWS KMS) customer master key (CMK) to use when creating the
     *            encrypted volume. This parameter is only required if you want
     *            to use a non-default CMK; if this parameter is not specified,
     *            the default CMK for EBS is used. If a <code>KmsKeyId</code> is
     *            specified, the <code>Encrypted</code> flag must also be set.
     *            </p>
     *            <p>
     *            To specify a CMK, use its key ID, Amazon Resource Name (ARN),
     *            alias name, or alias ARN. When using an alias name, prefix it
     *            with "alias/". For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias name: <code>alias/ExampleAlias</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            AWS parses <code>KmsKeyId</code> asynchronously, meaning that
     *            the action you call may appear to complete even though you
     *            provided an invalid identifier. This action will eventually
     *            report failure.
     *            </p>
     *            <p>
     *            The specified CMK must exist in the Region that the snapshot
     *            is being copied to.
     *            </p>
     *            <p>
     *            Amazon EBS does not support asymmetric CMKs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyImageRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The name of the new AMI in the destination Region.
     * </p>
     *
     * @return <p>
     *         The name of the new AMI in the destination Region.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the new AMI in the destination Region.
     * </p>
     *
     * @param name <p>
     *            The name of the new AMI in the destination Region.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new AMI in the destination Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the new AMI in the destination Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyImageRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ID of the AMI to copy.
     * </p>
     *
     * @return <p>
     *         The ID of the AMI to copy.
     *         </p>
     */
    public String getSourceImageId() {
        return sourceImageId;
    }

    /**
     * <p>
     * The ID of the AMI to copy.
     * </p>
     *
     * @param sourceImageId <p>
     *            The ID of the AMI to copy.
     *            </p>
     */
    public void setSourceImageId(String sourceImageId) {
        this.sourceImageId = sourceImageId;
    }

    /**
     * <p>
     * The ID of the AMI to copy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceImageId <p>
     *            The ID of the AMI to copy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyImageRequest withSourceImageId(String sourceImageId) {
        this.sourceImageId = sourceImageId;
        return this;
    }

    /**
     * <p>
     * The name of the Region that contains the AMI to copy.
     * </p>
     *
     * @return <p>
     *         The name of the Region that contains the AMI to copy.
     *         </p>
     */
    public String getSourceRegion() {
        return sourceRegion;
    }

    /**
     * <p>
     * The name of the Region that contains the AMI to copy.
     * </p>
     *
     * @param sourceRegion <p>
     *            The name of the Region that contains the AMI to copy.
     *            </p>
     */
    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The name of the Region that contains the AMI to copy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceRegion <p>
     *            The name of the Region that contains the AMI to copy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyImageRequest withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
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
    public CopyImageRequest withDryRun(Boolean dryRun) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getSourceImageId() != null)
            sb.append("SourceImageId: " + getSourceImageId() + ",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: " + getSourceRegion() + ",");
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
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getSourceImageId() == null) ? 0 : getSourceImageId().hashCode());
        hashCode = prime * hashCode
                + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyImageRequest == false)
            return false;
        CopyImageRequest other = (CopyImageRequest) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSourceImageId() == null ^ this.getSourceImageId() == null)
            return false;
        if (other.getSourceImageId() != null
                && other.getSourceImageId().equals(this.getSourceImageId()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null
                && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
