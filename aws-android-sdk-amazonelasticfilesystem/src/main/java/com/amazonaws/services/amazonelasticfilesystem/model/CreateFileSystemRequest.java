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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new, empty file system. The operation requires a creation token in
 * the request that Amazon EFS uses to ensure idempotent creation (calling the
 * operation with same creation token has no effect). If a file system does not
 * currently exist that is owned by the caller's AWS account with the specified
 * creation token, this operation does the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Creates a new, empty file system. The file system will have an Amazon EFS
 * assigned ID, and an initial lifecycle state <code>creating</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Returns with the description of the created file system.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Otherwise, this operation returns a <code>FileSystemAlreadyExists</code>
 * error with the ID of the existing file system.
 * </p>
 * <note>
 * <p>
 * For basic use cases, you can use a randomly generated UUID for the creation
 * token.
 * </p>
 * </note>
 * <p>
 * The idempotent operation allows you to retry a <code>CreateFileSystem</code>
 * call without risk of creating an extra file system. This can happen when an
 * initial call fails in a way that leaves it uncertain whether or not a file
 * system was actually created. An example might be that a transport level
 * timeout occurred or your connection was reset. As long as you use the same
 * creation token, if the initial call had succeeded in creating a file system,
 * the client can learn of its existence from the
 * <code>FileSystemAlreadyExists</code> error.
 * </p>
 * <note>
 * <p>
 * The <code>CreateFileSystem</code> call returns while the file system's
 * lifecycle state is still <code>creating</code>. You can check the file system
 * creation status by calling the <a>DescribeFileSystems</a> operation, which
 * among other things returns the file system state.
 * </p>
 * </note>
 * <p>
 * This operation also takes an optional <code>PerformanceMode</code> parameter
 * that you choose for your file system. We recommend
 * <code>generalPurpose</code> performance mode for most file systems. File
 * systems using the <code>maxIO</code> performance mode can scale to higher
 * levels of aggregate throughput and operations per second with a tradeoff of
 * slightly higher latencies for most file operations. The performance mode
 * can't be changed after the file system has been created. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/efs/latest/ug/performance.html#performancemodes.html"
 * >Amazon EFS: Performance Modes</a>.
 * </p>
 * <p>
 * After the file system is fully created, Amazon EFS sets its lifecycle state
 * to <code>available</code>, at which point you can create one or more mount
 * targets for the file system in your VPC. For more information, see
 * <a>CreateMountTarget</a>. You mount your Amazon EFS file system on an EC2
 * instances in your VPC by using the mount target. For more information, see <a
 * href="https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html">Amazon
 * EFS: How it Works</a>.
 * </p>
 * <p>
 * This operation requires permissions for the
 * <code>elasticfilesystem:CreateFileSystem</code> action.
 * </p>
 */
public class CreateFileSystemRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A string of up to 64 ASCII characters. Amazon EFS uses this to ensure
     * idempotent creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String creationToken;

    /**
     * <p>
     * The performance mode of the file system. We recommend
     * <code>generalPurpose</code> performance mode for most file systems. File
     * systems using the <code>maxIO</code> performance mode can scale to higher
     * levels of aggregate throughput and operations per second with a tradeoff
     * of slightly higher latencies for most file operations. The performance
     * mode can't be changed after the file system has been created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>generalPurpose, maxIO
     */
    private String performanceMode;

    /**
     * <p>
     * A Boolean value that, if true, creates an encrypted file system. When
     * creating an encrypted file system, you have the option of specifying
     * <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key
     * Management Service (AWS KMS) customer master key (CMK). If you don't
     * specify a CMK, then the default CMK for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>, is used to protect the encrypted
     * file system.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * The ID of the AWS KMS CMK to be used to protect the encrypted file
     * system. This parameter is only required if you want to use a nondefault
     * CMK. If this parameter is not specified, the default CMK for Amazon EFS
     * is used. This ID can be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID - A unique identifier of the key, for example
     * <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN - An Amazon Resource Name (ARN) for the key, for example
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias - A previously created display name for a key, for example
     * <code>alias/projectKey1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias ARN - An ARN for a key alias, for example
     * <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>KmsKeyId</code> is specified, the
     * <a>CreateFileSystemRequest$Encrypted</a> parameter must be set to true.
     * </p>
     * <important>
     * <p>
     * EFS accepts only symmetric CMKs. You cannot use asymmetric CMKs with EFS
     * file systems.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The throughput mode for the file system to be created. There are two
     * throughput modes to choose from for your file system:
     * <code>bursting</code> and <code>provisioned</code>. If you set
     * <code>ThroughputMode</code> to <code>provisioned</code>, you must also
     * set a value for <code>ProvisionedThroughPutInMibps</code>. You can
     * decrease your file system's throughput in Provisioned Throughput mode or
     * change between the throughput modes as long as it’s been more than 24
     * hours since the last decrease or throughput mode change. For more, see <a
     * href=
     * "https://docs.aws.amazon.com/efs/latest/ug/performance.html#provisioned-throughput"
     * >Specifying Throughput with Provisioned Mode</a> in the <i>Amazon EFS
     * User Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bursting, provisioned
     */
    private String throughputMode;

    /**
     * <p>
     * The throughput, measured in MiB/s, that you want to provision for a file
     * system that you're creating. Valid values are 1-1024. Required if
     * <code>ThroughputMode</code> is set to <code>provisioned</code>. The upper
     * limit for throughput is 1024 MiB/s. You can get this limit increased by
     * contacting AWS Support. For more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits"
     * >Amazon EFS Limits That You Can Increase</a> in the <i>Amazon EFS User
     * Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Double provisionedThroughputInMibps;

    /**
     * <p>
     * A value that specifies to create one or more tags associated with the
     * file system. Each tag is a user-defined key-value pair. Name your file
     * system on creation by including a
     * <code>"Key":"Name","Value":"{value}"</code> key-value pair.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A string of up to 64 ASCII characters. Amazon EFS uses this to ensure
     * idempotent creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         A string of up to 64 ASCII characters. Amazon EFS uses this to
     *         ensure idempotent creation.
     *         </p>
     */
    public String getCreationToken() {
        return creationToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters. Amazon EFS uses this to ensure
     * idempotent creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param creationToken <p>
     *            A string of up to 64 ASCII characters. Amazon EFS uses this to
     *            ensure idempotent creation.
     *            </p>
     */
    public void setCreationToken(String creationToken) {
        this.creationToken = creationToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters. Amazon EFS uses this to ensure
     * idempotent creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param creationToken <p>
     *            A string of up to 64 ASCII characters. Amazon EFS uses this to
     *            ensure idempotent creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemRequest withCreationToken(String creationToken) {
        this.creationToken = creationToken;
        return this;
    }

    /**
     * <p>
     * The performance mode of the file system. We recommend
     * <code>generalPurpose</code> performance mode for most file systems. File
     * systems using the <code>maxIO</code> performance mode can scale to higher
     * levels of aggregate throughput and operations per second with a tradeoff
     * of slightly higher latencies for most file operations. The performance
     * mode can't be changed after the file system has been created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>generalPurpose, maxIO
     *
     * @return <p>
     *         The performance mode of the file system. We recommend
     *         <code>generalPurpose</code> performance mode for most file
     *         systems. File systems using the <code>maxIO</code> performance
     *         mode can scale to higher levels of aggregate throughput and
     *         operations per second with a tradeoff of slightly higher
     *         latencies for most file operations. The performance mode can't be
     *         changed after the file system has been created.
     *         </p>
     * @see PerformanceMode
     */
    public String getPerformanceMode() {
        return performanceMode;
    }

    /**
     * <p>
     * The performance mode of the file system. We recommend
     * <code>generalPurpose</code> performance mode for most file systems. File
     * systems using the <code>maxIO</code> performance mode can scale to higher
     * levels of aggregate throughput and operations per second with a tradeoff
     * of slightly higher latencies for most file operations. The performance
     * mode can't be changed after the file system has been created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>generalPurpose, maxIO
     *
     * @param performanceMode <p>
     *            The performance mode of the file system. We recommend
     *            <code>generalPurpose</code> performance mode for most file
     *            systems. File systems using the <code>maxIO</code> performance
     *            mode can scale to higher levels of aggregate throughput and
     *            operations per second with a tradeoff of slightly higher
     *            latencies for most file operations. The performance mode can't
     *            be changed after the file system has been created.
     *            </p>
     * @see PerformanceMode
     */
    public void setPerformanceMode(String performanceMode) {
        this.performanceMode = performanceMode;
    }

    /**
     * <p>
     * The performance mode of the file system. We recommend
     * <code>generalPurpose</code> performance mode for most file systems. File
     * systems using the <code>maxIO</code> performance mode can scale to higher
     * levels of aggregate throughput and operations per second with a tradeoff
     * of slightly higher latencies for most file operations. The performance
     * mode can't be changed after the file system has been created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>generalPurpose, maxIO
     *
     * @param performanceMode <p>
     *            The performance mode of the file system. We recommend
     *            <code>generalPurpose</code> performance mode for most file
     *            systems. File systems using the <code>maxIO</code> performance
     *            mode can scale to higher levels of aggregate throughput and
     *            operations per second with a tradeoff of slightly higher
     *            latencies for most file operations. The performance mode can't
     *            be changed after the file system has been created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PerformanceMode
     */
    public CreateFileSystemRequest withPerformanceMode(String performanceMode) {
        this.performanceMode = performanceMode;
        return this;
    }

    /**
     * <p>
     * The performance mode of the file system. We recommend
     * <code>generalPurpose</code> performance mode for most file systems. File
     * systems using the <code>maxIO</code> performance mode can scale to higher
     * levels of aggregate throughput and operations per second with a tradeoff
     * of slightly higher latencies for most file operations. The performance
     * mode can't be changed after the file system has been created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>generalPurpose, maxIO
     *
     * @param performanceMode <p>
     *            The performance mode of the file system. We recommend
     *            <code>generalPurpose</code> performance mode for most file
     *            systems. File systems using the <code>maxIO</code> performance
     *            mode can scale to higher levels of aggregate throughput and
     *            operations per second with a tradeoff of slightly higher
     *            latencies for most file operations. The performance mode can't
     *            be changed after the file system has been created.
     *            </p>
     * @see PerformanceMode
     */
    public void setPerformanceMode(PerformanceMode performanceMode) {
        this.performanceMode = performanceMode.toString();
    }

    /**
     * <p>
     * The performance mode of the file system. We recommend
     * <code>generalPurpose</code> performance mode for most file systems. File
     * systems using the <code>maxIO</code> performance mode can scale to higher
     * levels of aggregate throughput and operations per second with a tradeoff
     * of slightly higher latencies for most file operations. The performance
     * mode can't be changed after the file system has been created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>generalPurpose, maxIO
     *
     * @param performanceMode <p>
     *            The performance mode of the file system. We recommend
     *            <code>generalPurpose</code> performance mode for most file
     *            systems. File systems using the <code>maxIO</code> performance
     *            mode can scale to higher levels of aggregate throughput and
     *            operations per second with a tradeoff of slightly higher
     *            latencies for most file operations. The performance mode can't
     *            be changed after the file system has been created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PerformanceMode
     */
    public CreateFileSystemRequest withPerformanceMode(PerformanceMode performanceMode) {
        this.performanceMode = performanceMode.toString();
        return this;
    }

    /**
     * <p>
     * A Boolean value that, if true, creates an encrypted file system. When
     * creating an encrypted file system, you have the option of specifying
     * <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key
     * Management Service (AWS KMS) customer master key (CMK). If you don't
     * specify a CMK, then the default CMK for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>, is used to protect the encrypted
     * file system.
     * </p>
     *
     * @return <p>
     *         A Boolean value that, if true, creates an encrypted file system.
     *         When creating an encrypted file system, you have the option of
     *         specifying <a>CreateFileSystemRequest$KmsKeyId</a> for an
     *         existing AWS Key Management Service (AWS KMS) customer master key
     *         (CMK). If you don't specify a CMK, then the default CMK for
     *         Amazon EFS, <code>/aws/elasticfilesystem</code>, is used to
     *         protect the encrypted file system.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * A Boolean value that, if true, creates an encrypted file system. When
     * creating an encrypted file system, you have the option of specifying
     * <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key
     * Management Service (AWS KMS) customer master key (CMK). If you don't
     * specify a CMK, then the default CMK for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>, is used to protect the encrypted
     * file system.
     * </p>
     *
     * @return <p>
     *         A Boolean value that, if true, creates an encrypted file system.
     *         When creating an encrypted file system, you have the option of
     *         specifying <a>CreateFileSystemRequest$KmsKeyId</a> for an
     *         existing AWS Key Management Service (AWS KMS) customer master key
     *         (CMK). If you don't specify a CMK, then the default CMK for
     *         Amazon EFS, <code>/aws/elasticfilesystem</code>, is used to
     *         protect the encrypted file system.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * A Boolean value that, if true, creates an encrypted file system. When
     * creating an encrypted file system, you have the option of specifying
     * <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key
     * Management Service (AWS KMS) customer master key (CMK). If you don't
     * specify a CMK, then the default CMK for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>, is used to protect the encrypted
     * file system.
     * </p>
     *
     * @param encrypted <p>
     *            A Boolean value that, if true, creates an encrypted file
     *            system. When creating an encrypted file system, you have the
     *            option of specifying <a>CreateFileSystemRequest$KmsKeyId</a>
     *            for an existing AWS Key Management Service (AWS KMS) customer
     *            master key (CMK). If you don't specify a CMK, then the default
     *            CMK for Amazon EFS, <code>/aws/elasticfilesystem</code>, is
     *            used to protect the encrypted file system.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * A Boolean value that, if true, creates an encrypted file system. When
     * creating an encrypted file system, you have the option of specifying
     * <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key
     * Management Service (AWS KMS) customer master key (CMK). If you don't
     * specify a CMK, then the default CMK for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>, is used to protect the encrypted
     * file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            A Boolean value that, if true, creates an encrypted file
     *            system. When creating an encrypted file system, you have the
     *            option of specifying <a>CreateFileSystemRequest$KmsKeyId</a>
     *            for an existing AWS Key Management Service (AWS KMS) customer
     *            master key (CMK). If you don't specify a CMK, then the default
     *            CMK for Amazon EFS, <code>/aws/elasticfilesystem</code>, is
     *            used to protect the encrypted file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemRequest withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS KMS CMK to be used to protect the encrypted file
     * system. This parameter is only required if you want to use a nondefault
     * CMK. If this parameter is not specified, the default CMK for Amazon EFS
     * is used. This ID can be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID - A unique identifier of the key, for example
     * <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN - An Amazon Resource Name (ARN) for the key, for example
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias - A previously created display name for a key, for example
     * <code>alias/projectKey1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias ARN - An ARN for a key alias, for example
     * <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>KmsKeyId</code> is specified, the
     * <a>CreateFileSystemRequest$Encrypted</a> parameter must be set to true.
     * </p>
     * <important>
     * <p>
     * EFS accepts only symmetric CMKs. You cannot use asymmetric CMKs with EFS
     * file systems.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The ID of the AWS KMS CMK to be used to protect the encrypted
     *         file system. This parameter is only required if you want to use a
     *         nondefault CMK. If this parameter is not specified, the default
     *         CMK for Amazon EFS is used. This ID can be in one of the
     *         following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID - A unique identifier of the key, for example
     *         <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN - An Amazon Resource Name (ARN) for the key, for example
     *         <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key alias - A previously created display name for a key, for
     *         example <code>alias/projectKey1</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key alias ARN - An ARN for a key alias, for example
     *         <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>
     *         .
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>KmsKeyId</code> is specified, the
     *         <a>CreateFileSystemRequest$Encrypted</a> parameter must be set to
     *         true.
     *         </p>
     *         <important>
     *         <p>
     *         EFS accepts only symmetric CMKs. You cannot use asymmetric CMKs
     *         with EFS file systems.
     *         </p>
     *         </important>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS CMK to be used to protect the encrypted file
     * system. This parameter is only required if you want to use a nondefault
     * CMK. If this parameter is not specified, the default CMK for Amazon EFS
     * is used. This ID can be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID - A unique identifier of the key, for example
     * <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN - An Amazon Resource Name (ARN) for the key, for example
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias - A previously created display name for a key, for example
     * <code>alias/projectKey1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias ARN - An ARN for a key alias, for example
     * <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>KmsKeyId</code> is specified, the
     * <a>CreateFileSystemRequest$Encrypted</a> parameter must be set to true.
     * </p>
     * <important>
     * <p>
     * EFS accepts only symmetric CMKs. You cannot use asymmetric CMKs with EFS
     * file systems.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param kmsKeyId <p>
     *            The ID of the AWS KMS CMK to be used to protect the encrypted
     *            file system. This parameter is only required if you want to
     *            use a nondefault CMK. If this parameter is not specified, the
     *            default CMK for Amazon EFS is used. This ID can be in one of
     *            the following formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID - A unique identifier of the key, for example
     *            <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARN - An Amazon Resource Name (ARN) for the key, for example
     *            <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key alias - A previously created display name for a key, for
     *            example <code>alias/projectKey1</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key alias ARN - An ARN for a key alias, for example
     *            <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <code>KmsKeyId</code> is specified, the
     *            <a>CreateFileSystemRequest$Encrypted</a> parameter must be set
     *            to true.
     *            </p>
     *            <important>
     *            <p>
     *            EFS accepts only symmetric CMKs. You cannot use asymmetric
     *            CMKs with EFS file systems.
     *            </p>
     *            </important>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS CMK to be used to protect the encrypted file
     * system. This parameter is only required if you want to use a nondefault
     * CMK. If this parameter is not specified, the default CMK for Amazon EFS
     * is used. This ID can be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID - A unique identifier of the key, for example
     * <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN - An Amazon Resource Name (ARN) for the key, for example
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias - A previously created display name for a key, for example
     * <code>alias/projectKey1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias ARN - An ARN for a key alias, for example
     * <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>KmsKeyId</code> is specified, the
     * <a>CreateFileSystemRequest$Encrypted</a> parameter must be set to true.
     * </p>
     * <important>
     * <p>
     * EFS accepts only symmetric CMKs. You cannot use asymmetric CMKs with EFS
     * file systems.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param kmsKeyId <p>
     *            The ID of the AWS KMS CMK to be used to protect the encrypted
     *            file system. This parameter is only required if you want to
     *            use a nondefault CMK. If this parameter is not specified, the
     *            default CMK for Amazon EFS is used. This ID can be in one of
     *            the following formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID - A unique identifier of the key, for example
     *            <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ARN - An Amazon Resource Name (ARN) for the key, for example
     *            <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key alias - A previously created display name for a key, for
     *            example <code>alias/projectKey1</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key alias ARN - An ARN for a key alias, for example
     *            <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <code>KmsKeyId</code> is specified, the
     *            <a>CreateFileSystemRequest$Encrypted</a> parameter must be set
     *            to true.
     *            </p>
     *            <important>
     *            <p>
     *            EFS accepts only symmetric CMKs. You cannot use asymmetric
     *            CMKs with EFS file systems.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The throughput mode for the file system to be created. There are two
     * throughput modes to choose from for your file system:
     * <code>bursting</code> and <code>provisioned</code>. If you set
     * <code>ThroughputMode</code> to <code>provisioned</code>, you must also
     * set a value for <code>ProvisionedThroughPutInMibps</code>. You can
     * decrease your file system's throughput in Provisioned Throughput mode or
     * change between the throughput modes as long as it’s been more than 24
     * hours since the last decrease or throughput mode change. For more, see <a
     * href=
     * "https://docs.aws.amazon.com/efs/latest/ug/performance.html#provisioned-throughput"
     * >Specifying Throughput with Provisioned Mode</a> in the <i>Amazon EFS
     * User Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bursting, provisioned
     *
     * @return <p>
     *         The throughput mode for the file system to be created. There are
     *         two throughput modes to choose from for your file system:
     *         <code>bursting</code> and <code>provisioned</code>. If you set
     *         <code>ThroughputMode</code> to <code>provisioned</code>, you must
     *         also set a value for <code>ProvisionedThroughPutInMibps</code>.
     *         You can decrease your file system's throughput in Provisioned
     *         Throughput mode or change between the throughput modes as long as
     *         it’s been more than 24 hours since the last decrease or
     *         throughput mode change. For more, see <a href=
     *         "https://docs.aws.amazon.com/efs/latest/ug/performance.html#provisioned-throughput"
     *         >Specifying Throughput with Provisioned Mode</a> in the <i>Amazon
     *         EFS User Guide.</i>
     *         </p>
     * @see ThroughputMode
     */
    public String getThroughputMode() {
        return throughputMode;
    }

    /**
     * <p>
     * The throughput mode for the file system to be created. There are two
     * throughput modes to choose from for your file system:
     * <code>bursting</code> and <code>provisioned</code>. If you set
     * <code>ThroughputMode</code> to <code>provisioned</code>, you must also
     * set a value for <code>ProvisionedThroughPutInMibps</code>. You can
     * decrease your file system's throughput in Provisioned Throughput mode or
     * change between the throughput modes as long as it’s been more than 24
     * hours since the last decrease or throughput mode change. For more, see <a
     * href=
     * "https://docs.aws.amazon.com/efs/latest/ug/performance.html#provisioned-throughput"
     * >Specifying Throughput with Provisioned Mode</a> in the <i>Amazon EFS
     * User Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bursting, provisioned
     *
     * @param throughputMode <p>
     *            The throughput mode for the file system to be created. There
     *            are two throughput modes to choose from for your file system:
     *            <code>bursting</code> and <code>provisioned</code>. If you set
     *            <code>ThroughputMode</code> to <code>provisioned</code>, you
     *            must also set a value for
     *            <code>ProvisionedThroughPutInMibps</code>. You can decrease
     *            your file system's throughput in Provisioned Throughput mode
     *            or change between the throughput modes as long as it’s been
     *            more than 24 hours since the last decrease or throughput mode
     *            change. For more, see <a href=
     *            "https://docs.aws.amazon.com/efs/latest/ug/performance.html#provisioned-throughput"
     *            >Specifying Throughput with Provisioned Mode</a> in the
     *            <i>Amazon EFS User Guide.</i>
     *            </p>
     * @see ThroughputMode
     */
    public void setThroughputMode(String throughputMode) {
        this.throughputMode = throughputMode;
    }

    /**
     * <p>
     * The throughput mode for the file system to be created. There are two
     * throughput modes to choose from for your file system:
     * <code>bursting</code> and <code>provisioned</code>. If you set
     * <code>ThroughputMode</code> to <code>provisioned</code>, you must also
     * set a value for <code>ProvisionedThroughPutInMibps</code>. You can
     * decrease your file system's throughput in Provisioned Throughput mode or
     * change between the throughput modes as long as it’s been more than 24
     * hours since the last decrease or throughput mode change. For more, see <a
     * href=
     * "https://docs.aws.amazon.com/efs/latest/ug/performance.html#provisioned-throughput"
     * >Specifying Throughput with Provisioned Mode</a> in the <i>Amazon EFS
     * User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bursting, provisioned
     *
     * @param throughputMode <p>
     *            The throughput mode for the file system to be created. There
     *            are two throughput modes to choose from for your file system:
     *            <code>bursting</code> and <code>provisioned</code>. If you set
     *            <code>ThroughputMode</code> to <code>provisioned</code>, you
     *            must also set a value for
     *            <code>ProvisionedThroughPutInMibps</code>. You can decrease
     *            your file system's throughput in Provisioned Throughput mode
     *            or change between the throughput modes as long as it’s been
     *            more than 24 hours since the last decrease or throughput mode
     *            change. For more, see <a href=
     *            "https://docs.aws.amazon.com/efs/latest/ug/performance.html#provisioned-throughput"
     *            >Specifying Throughput with Provisioned Mode</a> in the
     *            <i>Amazon EFS User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThroughputMode
     */
    public CreateFileSystemRequest withThroughputMode(String throughputMode) {
        this.throughputMode = throughputMode;
        return this;
    }

    /**
     * <p>
     * The throughput mode for the file system to be created. There are two
     * throughput modes to choose from for your file system:
     * <code>bursting</code> and <code>provisioned</code>. If you set
     * <code>ThroughputMode</code> to <code>provisioned</code>, you must also
     * set a value for <code>ProvisionedThroughPutInMibps</code>. You can
     * decrease your file system's throughput in Provisioned Throughput mode or
     * change between the throughput modes as long as it’s been more than 24
     * hours since the last decrease or throughput mode change. For more, see <a
     * href=
     * "https://docs.aws.amazon.com/efs/latest/ug/performance.html#provisioned-throughput"
     * >Specifying Throughput with Provisioned Mode</a> in the <i>Amazon EFS
     * User Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bursting, provisioned
     *
     * @param throughputMode <p>
     *            The throughput mode for the file system to be created. There
     *            are two throughput modes to choose from for your file system:
     *            <code>bursting</code> and <code>provisioned</code>. If you set
     *            <code>ThroughputMode</code> to <code>provisioned</code>, you
     *            must also set a value for
     *            <code>ProvisionedThroughPutInMibps</code>. You can decrease
     *            your file system's throughput in Provisioned Throughput mode
     *            or change between the throughput modes as long as it’s been
     *            more than 24 hours since the last decrease or throughput mode
     *            change. For more, see <a href=
     *            "https://docs.aws.amazon.com/efs/latest/ug/performance.html#provisioned-throughput"
     *            >Specifying Throughput with Provisioned Mode</a> in the
     *            <i>Amazon EFS User Guide.</i>
     *            </p>
     * @see ThroughputMode
     */
    public void setThroughputMode(ThroughputMode throughputMode) {
        this.throughputMode = throughputMode.toString();
    }

    /**
     * <p>
     * The throughput mode for the file system to be created. There are two
     * throughput modes to choose from for your file system:
     * <code>bursting</code> and <code>provisioned</code>. If you set
     * <code>ThroughputMode</code> to <code>provisioned</code>, you must also
     * set a value for <code>ProvisionedThroughPutInMibps</code>. You can
     * decrease your file system's throughput in Provisioned Throughput mode or
     * change between the throughput modes as long as it’s been more than 24
     * hours since the last decrease or throughput mode change. For more, see <a
     * href=
     * "https://docs.aws.amazon.com/efs/latest/ug/performance.html#provisioned-throughput"
     * >Specifying Throughput with Provisioned Mode</a> in the <i>Amazon EFS
     * User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>bursting, provisioned
     *
     * @param throughputMode <p>
     *            The throughput mode for the file system to be created. There
     *            are two throughput modes to choose from for your file system:
     *            <code>bursting</code> and <code>provisioned</code>. If you set
     *            <code>ThroughputMode</code> to <code>provisioned</code>, you
     *            must also set a value for
     *            <code>ProvisionedThroughPutInMibps</code>. You can decrease
     *            your file system's throughput in Provisioned Throughput mode
     *            or change between the throughput modes as long as it’s been
     *            more than 24 hours since the last decrease or throughput mode
     *            change. For more, see <a href=
     *            "https://docs.aws.amazon.com/efs/latest/ug/performance.html#provisioned-throughput"
     *            >Specifying Throughput with Provisioned Mode</a> in the
     *            <i>Amazon EFS User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ThroughputMode
     */
    public CreateFileSystemRequest withThroughputMode(ThroughputMode throughputMode) {
        this.throughputMode = throughputMode.toString();
        return this;
    }

    /**
     * <p>
     * The throughput, measured in MiB/s, that you want to provision for a file
     * system that you're creating. Valid values are 1-1024. Required if
     * <code>ThroughputMode</code> is set to <code>provisioned</code>. The upper
     * limit for throughput is 1024 MiB/s. You can get this limit increased by
     * contacting AWS Support. For more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits"
     * >Amazon EFS Limits That You Can Increase</a> in the <i>Amazon EFS User
     * Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The throughput, measured in MiB/s, that you want to provision for
     *         a file system that you're creating. Valid values are 1-1024.
     *         Required if <code>ThroughputMode</code> is set to
     *         <code>provisioned</code>. The upper limit for throughput is 1024
     *         MiB/s. You can get this limit increased by contacting AWS
     *         Support. For more information, see <a href=
     *         "https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits"
     *         >Amazon EFS Limits That You Can Increase</a> in the <i>Amazon EFS
     *         User Guide.</i>
     *         </p>
     */
    public Double getProvisionedThroughputInMibps() {
        return provisionedThroughputInMibps;
    }

    /**
     * <p>
     * The throughput, measured in MiB/s, that you want to provision for a file
     * system that you're creating. Valid values are 1-1024. Required if
     * <code>ThroughputMode</code> is set to <code>provisioned</code>. The upper
     * limit for throughput is 1024 MiB/s. You can get this limit increased by
     * contacting AWS Support. For more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits"
     * >Amazon EFS Limits That You Can Increase</a> in the <i>Amazon EFS User
     * Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param provisionedThroughputInMibps <p>
     *            The throughput, measured in MiB/s, that you want to provision
     *            for a file system that you're creating. Valid values are
     *            1-1024. Required if <code>ThroughputMode</code> is set to
     *            <code>provisioned</code>. The upper limit for throughput is
     *            1024 MiB/s. You can get this limit increased by contacting AWS
     *            Support. For more information, see <a href=
     *            "https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits"
     *            >Amazon EFS Limits That You Can Increase</a> in the <i>Amazon
     *            EFS User Guide.</i>
     *            </p>
     */
    public void setProvisionedThroughputInMibps(Double provisionedThroughputInMibps) {
        this.provisionedThroughputInMibps = provisionedThroughputInMibps;
    }

    /**
     * <p>
     * The throughput, measured in MiB/s, that you want to provision for a file
     * system that you're creating. Valid values are 1-1024. Required if
     * <code>ThroughputMode</code> is set to <code>provisioned</code>. The upper
     * limit for throughput is 1024 MiB/s. You can get this limit increased by
     * contacting AWS Support. For more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits"
     * >Amazon EFS Limits That You Can Increase</a> in the <i>Amazon EFS User
     * Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param provisionedThroughputInMibps <p>
     *            The throughput, measured in MiB/s, that you want to provision
     *            for a file system that you're creating. Valid values are
     *            1-1024. Required if <code>ThroughputMode</code> is set to
     *            <code>provisioned</code>. The upper limit for throughput is
     *            1024 MiB/s. You can get this limit increased by contacting AWS
     *            Support. For more information, see <a href=
     *            "https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits"
     *            >Amazon EFS Limits That You Can Increase</a> in the <i>Amazon
     *            EFS User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemRequest withProvisionedThroughputInMibps(
            Double provisionedThroughputInMibps) {
        this.provisionedThroughputInMibps = provisionedThroughputInMibps;
        return this;
    }

    /**
     * <p>
     * A value that specifies to create one or more tags associated with the
     * file system. Each tag is a user-defined key-value pair. Name your file
     * system on creation by including a
     * <code>"Key":"Name","Value":"{value}"</code> key-value pair.
     * </p>
     *
     * @return <p>
     *         A value that specifies to create one or more tags associated with
     *         the file system. Each tag is a user-defined key-value pair. Name
     *         your file system on creation by including a
     *         <code>"Key":"Name","Value":"{value}"</code> key-value pair.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A value that specifies to create one or more tags associated with the
     * file system. Each tag is a user-defined key-value pair. Name your file
     * system on creation by including a
     * <code>"Key":"Name","Value":"{value}"</code> key-value pair.
     * </p>
     *
     * @param tags <p>
     *            A value that specifies to create one or more tags associated
     *            with the file system. Each tag is a user-defined key-value
     *            pair. Name your file system on creation by including a
     *            <code>"Key":"Name","Value":"{value}"</code> key-value pair.
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
     * A value that specifies to create one or more tags associated with the
     * file system. Each tag is a user-defined key-value pair. Name your file
     * system on creation by including a
     * <code>"Key":"Name","Value":"{value}"</code> key-value pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A value that specifies to create one or more tags associated
     *            with the file system. Each tag is a user-defined key-value
     *            pair. Name your file system on creation by including a
     *            <code>"Key":"Name","Value":"{value}"</code> key-value pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemRequest withTags(Tag... tags) {
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
     * A value that specifies to create one or more tags associated with the
     * file system. Each tag is a user-defined key-value pair. Name your file
     * system on creation by including a
     * <code>"Key":"Name","Value":"{value}"</code> key-value pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A value that specifies to create one or more tags associated
     *            with the file system. Each tag is a user-defined key-value
     *            pair. Name your file system on creation by including a
     *            <code>"Key":"Name","Value":"{value}"</code> key-value pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFileSystemRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getCreationToken() != null)
            sb.append("CreationToken: " + getCreationToken() + ",");
        if (getPerformanceMode() != null)
            sb.append("PerformanceMode: " + getPerformanceMode() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getThroughputMode() != null)
            sb.append("ThroughputMode: " + getThroughputMode() + ",");
        if (getProvisionedThroughputInMibps() != null)
            sb.append("ProvisionedThroughputInMibps: " + getProvisionedThroughputInMibps() + ",");
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
                + ((getCreationToken() == null) ? 0 : getCreationToken().hashCode());
        hashCode = prime * hashCode
                + ((getPerformanceMode() == null) ? 0 : getPerformanceMode().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getThroughputMode() == null) ? 0 : getThroughputMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedThroughputInMibps() == null) ? 0
                        : getProvisionedThroughputInMibps().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFileSystemRequest == false)
            return false;
        CreateFileSystemRequest other = (CreateFileSystemRequest) obj;

        if (other.getCreationToken() == null ^ this.getCreationToken() == null)
            return false;
        if (other.getCreationToken() != null
                && other.getCreationToken().equals(this.getCreationToken()) == false)
            return false;
        if (other.getPerformanceMode() == null ^ this.getPerformanceMode() == null)
            return false;
        if (other.getPerformanceMode() != null
                && other.getPerformanceMode().equals(this.getPerformanceMode()) == false)
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
        if (other.getThroughputMode() == null ^ this.getThroughputMode() == null)
            return false;
        if (other.getThroughputMode() != null
                && other.getThroughputMode().equals(this.getThroughputMode()) == false)
            return false;
        if (other.getProvisionedThroughputInMibps() == null
                ^ this.getProvisionedThroughputInMibps() == null)
            return false;
        if (other.getProvisionedThroughputInMibps() != null
                && other.getProvisionedThroughputInMibps().equals(
                        this.getProvisionedThroughputInMibps()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
