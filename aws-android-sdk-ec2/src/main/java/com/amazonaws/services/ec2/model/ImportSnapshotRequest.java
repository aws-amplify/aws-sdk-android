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
 * Imports a disk into an EBS snapshot.
 * </p>
 */
public class ImportSnapshotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The client-specific data.
     * </p>
     */
    private ClientData clientData;

    /**
     * <p>
     * Token to enable idempotency for VM import requests.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The description string for the import snapshot task.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Information about the disk container.
     * </p>
     */
    private SnapshotDiskContainer diskContainer;

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
     * Specifies whether the destination snapshot of the imported image should
     * be encrypted. The default CMK for EBS is used unless you specify a
     * non-default AWS Key Management Service (AWS KMS) CMK using
     * <code>KmsKeyId</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * An identifier for the symmetric AWS Key Management Service (AWS KMS)
     * customer master key (CMK) to use when creating the encrypted snapshot.
     * This parameter is only required if you want to use a non-default CMK; if
     * this parameter is not specified, the default CMK for EBS is used. If a
     * <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must
     * also be set.
     * </p>
     * <p>
     * The CMK identifier may be provided in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace,
     * followed by the Region of the CMK, the AWS account ID of the CMK owner,
     * the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn
     * :aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code>
     * namespace, followed by the Region of the CMK, the AWS account ID of the
     * CMK owner, the <code>key</code> namespace, and then the CMK ID. For
     * example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-
     * a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code>
     * namespace, followed by the Region of the CMK, the AWS account ID of the
     * CMK owner, the <code>alias</code> namespace, and then the CMK alias. For
     * example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias
     * </i>.
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
     * The name of the role to use when not using the default role, 'vmimport'.
     * </p>
     */
    private String roleName;

    /**
     * <p>
     * The tags to apply to the snapshot being imported.
     * </p>
     */
    private java.util.List<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The client-specific data.
     * </p>
     *
     * @return <p>
     *         The client-specific data.
     *         </p>
     */
    public ClientData getClientData() {
        return clientData;
    }

    /**
     * <p>
     * The client-specific data.
     * </p>
     *
     * @param clientData <p>
     *            The client-specific data.
     *            </p>
     */
    public void setClientData(ClientData clientData) {
        this.clientData = clientData;
    }

    /**
     * <p>
     * The client-specific data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientData <p>
     *            The client-specific data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportSnapshotRequest withClientData(ClientData clientData) {
        this.clientData = clientData;
        return this;
    }

    /**
     * <p>
     * Token to enable idempotency for VM import requests.
     * </p>
     *
     * @return <p>
     *         Token to enable idempotency for VM import requests.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Token to enable idempotency for VM import requests.
     * </p>
     *
     * @param clientToken <p>
     *            Token to enable idempotency for VM import requests.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Token to enable idempotency for VM import requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Token to enable idempotency for VM import requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportSnapshotRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The description string for the import snapshot task.
     * </p>
     *
     * @return <p>
     *         The description string for the import snapshot task.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description string for the import snapshot task.
     * </p>
     *
     * @param description <p>
     *            The description string for the import snapshot task.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description string for the import snapshot task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description string for the import snapshot task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportSnapshotRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Information about the disk container.
     * </p>
     *
     * @return <p>
     *         Information about the disk container.
     *         </p>
     */
    public SnapshotDiskContainer getDiskContainer() {
        return diskContainer;
    }

    /**
     * <p>
     * Information about the disk container.
     * </p>
     *
     * @param diskContainer <p>
     *            Information about the disk container.
     *            </p>
     */
    public void setDiskContainer(SnapshotDiskContainer diskContainer) {
        this.diskContainer = diskContainer;
    }

    /**
     * <p>
     * Information about the disk container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskContainer <p>
     *            Information about the disk container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportSnapshotRequest withDiskContainer(SnapshotDiskContainer diskContainer) {
        this.diskContainer = diskContainer;
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
    public ImportSnapshotRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Specifies whether the destination snapshot of the imported image should
     * be encrypted. The default CMK for EBS is used unless you specify a
     * non-default AWS Key Management Service (AWS KMS) CMK using
     * <code>KmsKeyId</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether the destination snapshot of the imported image
     *         should be encrypted. The default CMK for EBS is used unless you
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
     * Specifies whether the destination snapshot of the imported image should
     * be encrypted. The default CMK for EBS is used unless you specify a
     * non-default AWS Key Management Service (AWS KMS) CMK using
     * <code>KmsKeyId</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether the destination snapshot of the imported image
     *         should be encrypted. The default CMK for EBS is used unless you
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
     * Specifies whether the destination snapshot of the imported image should
     * be encrypted. The default CMK for EBS is used unless you specify a
     * non-default AWS Key Management Service (AWS KMS) CMK using
     * <code>KmsKeyId</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @param encrypted <p>
     *            Specifies whether the destination snapshot of the imported
     *            image should be encrypted. The default CMK for EBS is used
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
     * Specifies whether the destination snapshot of the imported image should
     * be encrypted. The default CMK for EBS is used unless you specify a
     * non-default AWS Key Management Service (AWS KMS) CMK using
     * <code>KmsKeyId</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            Specifies whether the destination snapshot of the imported
     *            image should be encrypted. The default CMK for EBS is used
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
    public ImportSnapshotRequest withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * An identifier for the symmetric AWS Key Management Service (AWS KMS)
     * customer master key (CMK) to use when creating the encrypted snapshot.
     * This parameter is only required if you want to use a non-default CMK; if
     * this parameter is not specified, the default CMK for EBS is used. If a
     * <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must
     * also be set.
     * </p>
     * <p>
     * The CMK identifier may be provided in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace,
     * followed by the Region of the CMK, the AWS account ID of the CMK owner,
     * the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn
     * :aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code>
     * namespace, followed by the Region of the CMK, the AWS account ID of the
     * CMK owner, the <code>key</code> namespace, and then the CMK ID. For
     * example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-
     * a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code>
     * namespace, followed by the Region of the CMK, the AWS account ID of the
     * CMK owner, the <code>alias</code> namespace, and then the CMK alias. For
     * example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias
     * </i>.
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
     *         snapshot. This parameter is only required if you want to use a
     *         non-default CMK; if this parameter is not specified, the default
     *         CMK for EBS is used. If a <code>KmsKeyId</code> is specified, the
     *         <code>Encrypted</code> flag must also be set.
     *         </p>
     *         <p>
     *         The CMK identifier may be provided in any of the following
     *         formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key alias. The alias ARN contains the <code>arn:aws:kms</code>
     *         namespace, followed by the Region of the CMK, the AWS account ID
     *         of the CMK owner, the <code>alias</code> namespace, and then the
     *         CMK alias. For example,
     *         arn:aws:kms:<i>us-east-1</i>:<i>012345678910
     *         </i>:alias/<i>ExampleAlias</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN using key ID. The ID ARN contains the
     *         <code>arn:aws:kms</code> namespace, followed by the Region of the
     *         CMK, the AWS account ID of the CMK owner, the <code>key</code>
     *         namespace, and then the CMK ID. For example,
     *         arn:aws:kms:<i>us-east
     *         -1</i>:<i>012345678910</i>:key/<i>abcd1234-a123
     *         -456a-a12b-a123b4cd56ef</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN using key alias. The alias ARN contains the
     *         <code>arn:aws:kms</code> namespace, followed by the Region of the
     *         CMK, the AWS account ID of the CMK owner, the <code>alias</code>
     *         namespace, and then the CMK alias. For example,
     *         arn:aws:kms:<i>us-
     *         east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
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
     * customer master key (CMK) to use when creating the encrypted snapshot.
     * This parameter is only required if you want to use a non-default CMK; if
     * this parameter is not specified, the default CMK for EBS is used. If a
     * <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must
     * also be set.
     * </p>
     * <p>
     * The CMK identifier may be provided in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace,
     * followed by the Region of the CMK, the AWS account ID of the CMK owner,
     * the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn
     * :aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code>
     * namespace, followed by the Region of the CMK, the AWS account ID of the
     * CMK owner, the <code>key</code> namespace, and then the CMK ID. For
     * example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-
     * a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code>
     * namespace, followed by the Region of the CMK, the AWS account ID of the
     * CMK owner, the <code>alias</code> namespace, and then the CMK alias. For
     * example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias
     * </i>.
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
     *            encrypted snapshot. This parameter is only required if you
     *            want to use a non-default CMK; if this parameter is not
     *            specified, the default CMK for EBS is used. If a
     *            <code>KmsKeyId</code> is specified, the <code>Encrypted</code>
     *            flag must also be set.
     *            </p>
     *            <p>
     *            The CMK identifier may be provided in any of the following
     *            formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key alias. The alias ARN contains the <code>arn:aws:kms</code>
     *            namespace, followed by the Region of the CMK, the AWS account
     *            ID of the CMK owner, the <code>alias</code> namespace, and
     *            then the CMK alias. For example,
     *            arn:aws:kms:<i>us-east-1</i>:<
     *            i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARN using key ID. The ID ARN contains the
     *            <code>arn:aws:kms</code> namespace, followed by the Region of
     *            the CMK, the AWS account ID of the CMK owner, the
     *            <code>key</code> namespace, and then the CMK ID. For example,
     *            arn
     *            :aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234
     *            -a123-456a-a12b-a123b4cd56ef</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARN using key alias. The alias ARN contains the
     *            <code>arn:aws:kms</code> namespace, followed by the Region of
     *            the CMK, the AWS account ID of the CMK owner, the
     *            <code>alias</code> namespace, and then the CMK alias. For
     *            example,
     *            arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias
     *            /<i>ExampleAlias</i>.
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
     * customer master key (CMK) to use when creating the encrypted snapshot.
     * This parameter is only required if you want to use a non-default CMK; if
     * this parameter is not specified, the default CMK for EBS is used. If a
     * <code>KmsKeyId</code> is specified, the <code>Encrypted</code> flag must
     * also be set.
     * </p>
     * <p>
     * The CMK identifier may be provided in any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias. The alias ARN contains the <code>arn:aws:kms</code> namespace,
     * followed by the Region of the CMK, the AWS account ID of the CMK owner,
     * the <code>alias</code> namespace, and then the CMK alias. For example,
     * arn
     * :aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key ID. The ID ARN contains the <code>arn:aws:kms</code>
     * namespace, followed by the Region of the CMK, the AWS account ID of the
     * CMK owner, the <code>key</code> namespace, and then the CMK ID. For
     * example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234-
     * a123-456a-a12b-a123b4cd56ef</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN using key alias. The alias ARN contains the <code>arn:aws:kms</code>
     * namespace, followed by the Region of the CMK, the AWS account ID of the
     * CMK owner, the <code>alias</code> namespace, and then the CMK alias. For
     * example,
     * arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias/<i>ExampleAlias
     * </i>.
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
     *            encrypted snapshot. This parameter is only required if you
     *            want to use a non-default CMK; if this parameter is not
     *            specified, the default CMK for EBS is used. If a
     *            <code>KmsKeyId</code> is specified, the <code>Encrypted</code>
     *            flag must also be set.
     *            </p>
     *            <p>
     *            The CMK identifier may be provided in any of the following
     *            formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key alias. The alias ARN contains the <code>arn:aws:kms</code>
     *            namespace, followed by the Region of the CMK, the AWS account
     *            ID of the CMK owner, the <code>alias</code> namespace, and
     *            then the CMK alias. For example,
     *            arn:aws:kms:<i>us-east-1</i>:<
     *            i>012345678910</i>:alias/<i>ExampleAlias</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARN using key ID. The ID ARN contains the
     *            <code>arn:aws:kms</code> namespace, followed by the Region of
     *            the CMK, the AWS account ID of the CMK owner, the
     *            <code>key</code> namespace, and then the CMK ID. For example,
     *            arn
     *            :aws:kms:<i>us-east-1</i>:<i>012345678910</i>:key/<i>abcd1234
     *            -a123-456a-a12b-a123b4cd56ef</i>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARN using key alias. The alias ARN contains the
     *            <code>arn:aws:kms</code> namespace, followed by the Region of
     *            the CMK, the AWS account ID of the CMK owner, the
     *            <code>alias</code> namespace, and then the CMK alias. For
     *            example,
     *            arn:aws:kms:<i>us-east-1</i>:<i>012345678910</i>:alias
     *            /<i>ExampleAlias</i>.
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
    public ImportSnapshotRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The name of the role to use when not using the default role, 'vmimport'.
     * </p>
     *
     * @return <p>
     *         The name of the role to use when not using the default role,
     *         'vmimport'.
     *         </p>
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * <p>
     * The name of the role to use when not using the default role, 'vmimport'.
     * </p>
     *
     * @param roleName <p>
     *            The name of the role to use when not using the default role,
     *            'vmimport'.
     *            </p>
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role to use when not using the default role, 'vmimport'.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleName <p>
     *            The name of the role to use when not using the default role,
     *            'vmimport'.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportSnapshotRequest withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * <p>
     * The tags to apply to the snapshot being imported.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the snapshot being imported.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the snapshot being imported.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the snapshot being imported.
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
     * The tags to apply to the snapshot being imported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the snapshot being imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportSnapshotRequest withTagSpecifications(TagSpecification... tagSpecifications) {
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
     * The tags to apply to the snapshot being imported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the snapshot being imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportSnapshotRequest withTagSpecifications(
            java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
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
        if (getClientData() != null)
            sb.append("ClientData: " + getClientData() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDiskContainer() != null)
            sb.append("DiskContainer: " + getDiskContainer() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientData() == null) ? 0 : getClientData().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDiskContainer() == null) ? 0 : getDiskContainer().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportSnapshotRequest == false)
            return false;
        ImportSnapshotRequest other = (ImportSnapshotRequest) obj;

        if (other.getClientData() == null ^ this.getClientData() == null)
            return false;
        if (other.getClientData() != null
                && other.getClientData().equals(this.getClientData()) == false)
            return false;
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
        if (other.getDiskContainer() == null ^ this.getDiskContainer() == null)
            return false;
        if (other.getDiskContainer() != null
                && other.getDiskContainer().equals(this.getDiskContainer()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
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
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }
}
