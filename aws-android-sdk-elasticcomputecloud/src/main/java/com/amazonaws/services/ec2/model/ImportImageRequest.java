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
 * Import single or multi-volume disk images or EBS snapshots into an Amazon
 * Machine Image (AMI). For more information, see <a href=
 * "https://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html"
 * >Importing a VM as an Image Using VM Import/Export</a> in the <i>VM
 * Import/Export User Guide</i>.
 * </p>
 */
public class ImportImageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>i386</code> | <code>x86_64</code> |
     * <code>arm64</code>
     * </p>
     */
    private String architecture;

    /**
     * <p>
     * The client-specific data.
     * </p>
     */
    private ClientData clientData;

    /**
     * <p>
     * The token to enable idempotency for VM import requests.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * A description string for the import image task.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Information about the disk containers.
     * </p>
     */
    private java.util.List<ImageDiskContainer> diskContainers;

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
     * Specifies whether the destination AMI of the imported image should be
     * encrypted. The default CMK for EBS is used unless you specify a
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
     * The target hypervisor platform.
     * </p>
     * <p>
     * Valid values: <code>xen</code>
     * </p>
     */
    private String hypervisor;

    /**
     * <p>
     * An identifier for the symmetric AWS Key Management Service (AWS KMS)
     * customer master key (CMK) to use when creating the encrypted AMI. This
     * parameter is only required if you want to use a non-default CMK; if this
     * parameter is not specified, the default CMK for EBS is used. If a
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
     * The specified CMK must exist in the Region that the AMI is being copied
     * to.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The license type to be used for the Amazon Machine Image (AMI) after
     * importing.
     * </p>
     * <p>
     * By default, we detect the source-system operating system (OS) and apply
     * the appropriate license. Specify <code>AWS</code> to replace the
     * source-system license with an AWS license, if appropriate. Specify
     * <code>BYOL</code> to retain the source-system license, if appropriate.
     * </p>
     * <p>
     * To use <code>BYOL</code>, you must have existing licenses with rights to
     * use these licenses in a third party cloud, such as AWS. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     * >Prerequisites</a> in the VM Import/Export User Guide.
     * </p>
     */
    private String licenseType;

    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>Windows</code> | <code>Linux</code>
     * </p>
     */
    private String platform;

    /**
     * <p>
     * The name of the role to use when not using the default role, 'vmimport'.
     * </p>
     */
    private String roleName;

    /**
     * <p>
     * The ARNs of the license configurations.
     * </p>
     */
    private java.util.List<ImportImageLicenseConfigurationRequest> licenseSpecifications;

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>i386</code> | <code>x86_64</code> |
     * <code>arm64</code>
     * </p>
     *
     * @return <p>
     *         The architecture of the virtual machine.
     *         </p>
     *         <p>
     *         Valid values: <code>i386</code> | <code>x86_64</code> |
     *         <code>arm64</code>
     *         </p>
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>i386</code> | <code>x86_64</code> |
     * <code>arm64</code>
     * </p>
     *
     * @param architecture <p>
     *            The architecture of the virtual machine.
     *            </p>
     *            <p>
     *            Valid values: <code>i386</code> | <code>x86_64</code> |
     *            <code>arm64</code>
     *            </p>
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>i386</code> | <code>x86_64</code> |
     * <code>arm64</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param architecture <p>
     *            The architecture of the virtual machine.
     *            </p>
     *            <p>
     *            Valid values: <code>i386</code> | <code>x86_64</code> |
     *            <code>arm64</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageRequest withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

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
    public ImportImageRequest withClientData(ClientData clientData) {
        this.clientData = clientData;
        return this;
    }

    /**
     * <p>
     * The token to enable idempotency for VM import requests.
     * </p>
     *
     * @return <p>
     *         The token to enable idempotency for VM import requests.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * The token to enable idempotency for VM import requests.
     * </p>
     *
     * @param clientToken <p>
     *            The token to enable idempotency for VM import requests.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The token to enable idempotency for VM import requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            The token to enable idempotency for VM import requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * A description string for the import image task.
     * </p>
     *
     * @return <p>
     *         A description string for the import image task.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description string for the import image task.
     * </p>
     *
     * @param description <p>
     *            A description string for the import image task.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description string for the import image task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description string for the import image task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Information about the disk containers.
     * </p>
     *
     * @return <p>
     *         Information about the disk containers.
     *         </p>
     */
    public java.util.List<ImageDiskContainer> getDiskContainers() {
        return diskContainers;
    }

    /**
     * <p>
     * Information about the disk containers.
     * </p>
     *
     * @param diskContainers <p>
     *            Information about the disk containers.
     *            </p>
     */
    public void setDiskContainers(java.util.Collection<ImageDiskContainer> diskContainers) {
        if (diskContainers == null) {
            this.diskContainers = null;
            return;
        }

        this.diskContainers = new java.util.ArrayList<ImageDiskContainer>(diskContainers);
    }

    /**
     * <p>
     * Information about the disk containers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskContainers <p>
     *            Information about the disk containers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageRequest withDiskContainers(ImageDiskContainer... diskContainers) {
        if (getDiskContainers() == null) {
            this.diskContainers = new java.util.ArrayList<ImageDiskContainer>(diskContainers.length);
        }
        for (ImageDiskContainer value : diskContainers) {
            this.diskContainers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the disk containers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskContainers <p>
     *            Information about the disk containers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageRequest withDiskContainers(
            java.util.Collection<ImageDiskContainer> diskContainers) {
        setDiskContainers(diskContainers);
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
    public ImportImageRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Specifies whether the destination AMI of the imported image should be
     * encrypted. The default CMK for EBS is used unless you specify a
     * non-default AWS Key Management Service (AWS KMS) CMK using
     * <code>KmsKeyId</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether the destination AMI of the imported image
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
     * Specifies whether the destination AMI of the imported image should be
     * encrypted. The default CMK for EBS is used unless you specify a
     * non-default AWS Key Management Service (AWS KMS) CMK using
     * <code>KmsKeyId</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether the destination AMI of the imported image
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
     * Specifies whether the destination AMI of the imported image should be
     * encrypted. The default CMK for EBS is used unless you specify a
     * non-default AWS Key Management Service (AWS KMS) CMK using
     * <code>KmsKeyId</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     *
     * @param encrypted <p>
     *            Specifies whether the destination AMI of the imported image
     *            should be encrypted. The default CMK for EBS is used unless
     *            you specify a non-default AWS Key Management Service (AWS KMS)
     *            CMK using <code>KmsKeyId</code>. For more information, see <a
     *            href=
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
     * Specifies whether the destination AMI of the imported image should be
     * encrypted. The default CMK for EBS is used unless you specify a
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
     *            Specifies whether the destination AMI of the imported image
     *            should be encrypted. The default CMK for EBS is used unless
     *            you specify a non-default AWS Key Management Service (AWS KMS)
     *            CMK using <code>KmsKeyId</code>. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
     *            >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageRequest withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * The target hypervisor platform.
     * </p>
     * <p>
     * Valid values: <code>xen</code>
     * </p>
     *
     * @return <p>
     *         The target hypervisor platform.
     *         </p>
     *         <p>
     *         Valid values: <code>xen</code>
     *         </p>
     */
    public String getHypervisor() {
        return hypervisor;
    }

    /**
     * <p>
     * The target hypervisor platform.
     * </p>
     * <p>
     * Valid values: <code>xen</code>
     * </p>
     *
     * @param hypervisor <p>
     *            The target hypervisor platform.
     *            </p>
     *            <p>
     *            Valid values: <code>xen</code>
     *            </p>
     */
    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }

    /**
     * <p>
     * The target hypervisor platform.
     * </p>
     * <p>
     * Valid values: <code>xen</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hypervisor <p>
     *            The target hypervisor platform.
     *            </p>
     *            <p>
     *            Valid values: <code>xen</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageRequest withHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
        return this;
    }

    /**
     * <p>
     * An identifier for the symmetric AWS Key Management Service (AWS KMS)
     * customer master key (CMK) to use when creating the encrypted AMI. This
     * parameter is only required if you want to use a non-default CMK; if this
     * parameter is not specified, the default CMK for EBS is used. If a
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
     * The specified CMK must exist in the Region that the AMI is being copied
     * to.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     *
     * @return <p>
     *         An identifier for the symmetric AWS Key Management Service (AWS
     *         KMS) customer master key (CMK) to use when creating the encrypted
     *         AMI. This parameter is only required if you want to use a
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
     *         The specified CMK must exist in the Region that the AMI is being
     *         copied to.
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
     * customer master key (CMK) to use when creating the encrypted AMI. This
     * parameter is only required if you want to use a non-default CMK; if this
     * parameter is not specified, the default CMK for EBS is used. If a
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
     * The specified CMK must exist in the Region that the AMI is being copied
     * to.
     * </p>
     * <p>
     * Amazon EBS does not support asymmetric CMKs.
     * </p>
     *
     * @param kmsKeyId <p>
     *            An identifier for the symmetric AWS Key Management Service
     *            (AWS KMS) customer master key (CMK) to use when creating the
     *            encrypted AMI. This parameter is only required if you want to
     *            use a non-default CMK; if this parameter is not specified, the
     *            default CMK for EBS is used. If a <code>KmsKeyId</code> is
     *            specified, the <code>Encrypted</code> flag must also be set.
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
     *            The specified CMK must exist in the Region that the AMI is
     *            being copied to.
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
     * customer master key (CMK) to use when creating the encrypted AMI. This
     * parameter is only required if you want to use a non-default CMK; if this
     * parameter is not specified, the default CMK for EBS is used. If a
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
     * The specified CMK must exist in the Region that the AMI is being copied
     * to.
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
     *            encrypted AMI. This parameter is only required if you want to
     *            use a non-default CMK; if this parameter is not specified, the
     *            default CMK for EBS is used. If a <code>KmsKeyId</code> is
     *            specified, the <code>Encrypted</code> flag must also be set.
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
     *            The specified CMK must exist in the Region that the AMI is
     *            being copied to.
     *            </p>
     *            <p>
     *            Amazon EBS does not support asymmetric CMKs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The license type to be used for the Amazon Machine Image (AMI) after
     * importing.
     * </p>
     * <p>
     * By default, we detect the source-system operating system (OS) and apply
     * the appropriate license. Specify <code>AWS</code> to replace the
     * source-system license with an AWS license, if appropriate. Specify
     * <code>BYOL</code> to retain the source-system license, if appropriate.
     * </p>
     * <p>
     * To use <code>BYOL</code>, you must have existing licenses with rights to
     * use these licenses in a third party cloud, such as AWS. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     * >Prerequisites</a> in the VM Import/Export User Guide.
     * </p>
     *
     * @return <p>
     *         The license type to be used for the Amazon Machine Image (AMI)
     *         after importing.
     *         </p>
     *         <p>
     *         By default, we detect the source-system operating system (OS) and
     *         apply the appropriate license. Specify <code>AWS</code> to
     *         replace the source-system license with an AWS license, if
     *         appropriate. Specify <code>BYOL</code> to retain the
     *         source-system license, if appropriate.
     *         </p>
     *         <p>
     *         To use <code>BYOL</code>, you must have existing licenses with
     *         rights to use these licenses in a third party cloud, such as AWS.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     *         >Prerequisites</a> in the VM Import/Export User Guide.
     *         </p>
     */
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * <p>
     * The license type to be used for the Amazon Machine Image (AMI) after
     * importing.
     * </p>
     * <p>
     * By default, we detect the source-system operating system (OS) and apply
     * the appropriate license. Specify <code>AWS</code> to replace the
     * source-system license with an AWS license, if appropriate. Specify
     * <code>BYOL</code> to retain the source-system license, if appropriate.
     * </p>
     * <p>
     * To use <code>BYOL</code>, you must have existing licenses with rights to
     * use these licenses in a third party cloud, such as AWS. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     * >Prerequisites</a> in the VM Import/Export User Guide.
     * </p>
     *
     * @param licenseType <p>
     *            The license type to be used for the Amazon Machine Image (AMI)
     *            after importing.
     *            </p>
     *            <p>
     *            By default, we detect the source-system operating system (OS)
     *            and apply the appropriate license. Specify <code>AWS</code> to
     *            replace the source-system license with an AWS license, if
     *            appropriate. Specify <code>BYOL</code> to retain the
     *            source-system license, if appropriate.
     *            </p>
     *            <p>
     *            To use <code>BYOL</code>, you must have existing licenses with
     *            rights to use these licenses in a third party cloud, such as
     *            AWS. For more information, see <a href=
     *            "https://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     *            >Prerequisites</a> in the VM Import/Export User Guide.
     *            </p>
     */
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The license type to be used for the Amazon Machine Image (AMI) after
     * importing.
     * </p>
     * <p>
     * By default, we detect the source-system operating system (OS) and apply
     * the appropriate license. Specify <code>AWS</code> to replace the
     * source-system license with an AWS license, if appropriate. Specify
     * <code>BYOL</code> to retain the source-system license, if appropriate.
     * </p>
     * <p>
     * To use <code>BYOL</code>, you must have existing licenses with rights to
     * use these licenses in a third party cloud, such as AWS. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     * >Prerequisites</a> in the VM Import/Export User Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseType <p>
     *            The license type to be used for the Amazon Machine Image (AMI)
     *            after importing.
     *            </p>
     *            <p>
     *            By default, we detect the source-system operating system (OS)
     *            and apply the appropriate license. Specify <code>AWS</code> to
     *            replace the source-system license with an AWS license, if
     *            appropriate. Specify <code>BYOL</code> to retain the
     *            source-system license, if appropriate.
     *            </p>
     *            <p>
     *            To use <code>BYOL</code>, you must have existing licenses with
     *            rights to use these licenses in a third party cloud, such as
     *            AWS. For more information, see <a href=
     *            "https://docs.aws.amazon.com/vm-import/latest/userguide/vmimport-image-import.html#prerequisites-image"
     *            >Prerequisites</a> in the VM Import/Export User Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageRequest withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>Windows</code> | <code>Linux</code>
     * </p>
     *
     * @return <p>
     *         The operating system of the virtual machine.
     *         </p>
     *         <p>
     *         Valid values: <code>Windows</code> | <code>Linux</code>
     *         </p>
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>Windows</code> | <code>Linux</code>
     * </p>
     *
     * @param platform <p>
     *            The operating system of the virtual machine.
     *            </p>
     *            <p>
     *            Valid values: <code>Windows</code> | <code>Linux</code>
     *            </p>
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The operating system of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>Windows</code> | <code>Linux</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platform <p>
     *            The operating system of the virtual machine.
     *            </p>
     *            <p>
     *            Valid values: <code>Windows</code> | <code>Linux</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageRequest withPlatform(String platform) {
        this.platform = platform;
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
    public ImportImageRequest withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * <p>
     * The ARNs of the license configurations.
     * </p>
     *
     * @return <p>
     *         The ARNs of the license configurations.
     *         </p>
     */
    public java.util.List<ImportImageLicenseConfigurationRequest> getLicenseSpecifications() {
        return licenseSpecifications;
    }

    /**
     * <p>
     * The ARNs of the license configurations.
     * </p>
     *
     * @param licenseSpecifications <p>
     *            The ARNs of the license configurations.
     *            </p>
     */
    public void setLicenseSpecifications(
            java.util.Collection<ImportImageLicenseConfigurationRequest> licenseSpecifications) {
        if (licenseSpecifications == null) {
            this.licenseSpecifications = null;
            return;
        }

        this.licenseSpecifications = new java.util.ArrayList<ImportImageLicenseConfigurationRequest>(
                licenseSpecifications);
    }

    /**
     * <p>
     * The ARNs of the license configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseSpecifications <p>
     *            The ARNs of the license configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageRequest withLicenseSpecifications(
            ImportImageLicenseConfigurationRequest... licenseSpecifications) {
        if (getLicenseSpecifications() == null) {
            this.licenseSpecifications = new java.util.ArrayList<ImportImageLicenseConfigurationRequest>(
                    licenseSpecifications.length);
        }
        for (ImportImageLicenseConfigurationRequest value : licenseSpecifications) {
            this.licenseSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of the license configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseSpecifications <p>
     *            The ARNs of the license configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportImageRequest withLicenseSpecifications(
            java.util.Collection<ImportImageLicenseConfigurationRequest> licenseSpecifications) {
        setLicenseSpecifications(licenseSpecifications);
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
        if (getArchitecture() != null)
            sb.append("Architecture: " + getArchitecture() + ",");
        if (getClientData() != null)
            sb.append("ClientData: " + getClientData() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDiskContainers() != null)
            sb.append("DiskContainers: " + getDiskContainers() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getHypervisor() != null)
            sb.append("Hypervisor: " + getHypervisor() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getLicenseType() != null)
            sb.append("LicenseType: " + getLicenseType() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform() + ",");
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName() + ",");
        if (getLicenseSpecifications() != null)
            sb.append("LicenseSpecifications: " + getLicenseSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getClientData() == null) ? 0 : getClientData().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDiskContainers() == null) ? 0 : getDiskContainers().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getHypervisor() == null) ? 0 : getHypervisor().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime
                * hashCode
                + ((getLicenseSpecifications() == null) ? 0 : getLicenseSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportImageRequest == false)
            return false;
        ImportImageRequest other = (ImportImageRequest) obj;

        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null
                && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
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
        if (other.getDiskContainers() == null ^ this.getDiskContainers() == null)
            return false;
        if (other.getDiskContainers() != null
                && other.getDiskContainers().equals(this.getDiskContainers()) == false)
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
        if (other.getHypervisor() == null ^ this.getHypervisor() == null)
            return false;
        if (other.getHypervisor() != null
                && other.getHypervisor().equals(this.getHypervisor()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null
                && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getLicenseSpecifications() == null ^ this.getLicenseSpecifications() == null)
            return false;
        if (other.getLicenseSpecifications() != null
                && other.getLicenseSpecifications().equals(this.getLicenseSpecifications()) == false)
            return false;
        return true;
    }
}
