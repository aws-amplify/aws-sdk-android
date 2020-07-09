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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model;

import java.io.Serializable;


public class DescribeSecretResult implements Serializable {
    /**
     * <p>The ARN of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String aRN;

    /**
     * <p>The user-provided friendly name of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * <p>The user-provided description of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     */
    private String description;

    /**
     * <p>The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the <code>SecretString</code> or <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default AWS KMS CMK (the one named <code>awssecretsmanager</code>) for this account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String kmsKeyId;

    /**
     * <p>Specifies whether automatic rotation is enabled for this secret.</p> <p>To enable rotation, use <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value greater than 0. To disable rotation, use <a>CancelRotateSecret</a>.</p>
     */
    private Boolean rotationEnabled;

    /**
     * <p>The ARN of a Lambda function that's invoked by Secrets Manager to rotate the secret either automatically per the schedule or manually by a call to <code>RotateSecret</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String rotationLambdaARN;

    /**
     * <p>A structure that contains the rotation configuration for this secret.</p>
     */
    private RotationRulesType rotationRules;

    /**
     * <p>The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is null if the secret has never rotated.</p>
     */
    private java.util.Date lastRotatedDate;

    /**
     * <p>The last date and time that this secret was modified in any way.</p>
     */
    private java.util.Date lastChangedDate;

    /**
     * <p>The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows only the date, not the time.</p>
     */
    private java.util.Date lastAccessedDate;

    /**
     * <p>This value exists if the secret is scheduled for deletion. Some time after the specified date and time, Secrets Manager deletes the secret and all of its versions.</p> <p>If a secret is scheduled for deletion, then its details, including the encrypted secret information, is not accessible. To cancel a scheduled deletion and restore access, use <a>RestoreSecret</a>.</p>
     */
    private java.util.Date deletedDate;

    /**
     * <p>The list of user-defined tags that are associated with the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.</p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>A list of all of the currently assigned <code>VersionStage</code> staging labels and the <code>VersionId</code> that each is attached to. Staging labels are used to keep track of the different versions during the rotation process.</p> <note> <p>A version that does not have any staging labels attached is considered deprecated and subject to deletion. Such versions are not included in this list.</p> </note>
     */
    private java.util.Map<String, java.util.List<String>> versionIdsToStages;

    /**
     * <p>Returns the name of the service that created this secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String owningService;

    /**
     * <p>The date that the secret was created.</p>
     */
    private java.util.Date createdDate;

    /**
     * <p>The ARN of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>The ARN of the secret.</p>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>The ARN of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aRN <p>The ARN of the secret.</p>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>The ARN of the secret.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aRN <p>The ARN of the secret.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSecretResult withARN(String aRN) {
        this.aRN = aRN;
        return this;
    }

    /**
     * <p>The user-provided friendly name of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>The user-provided friendly name of the secret.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The user-provided friendly name of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>The user-provided friendly name of the secret.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The user-provided friendly name of the secret.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>The user-provided friendly name of the secret.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSecretResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The user-provided description of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @return <p>The user-provided description of the secret.</p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>The user-provided description of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param description <p>The user-provided description of the secret.</p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>The user-provided description of the secret.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param description <p>The user-provided description of the secret.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSecretResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the <code>SecretString</code> or <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default AWS KMS CMK (the one named <code>awssecretsmanager</code>) for this account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return <p>The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the <code>SecretString</code> or <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default AWS KMS CMK (the one named <code>awssecretsmanager</code>) for this account.</p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the <code>SecretString</code> or <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default AWS KMS CMK (the one named <code>awssecretsmanager</code>) for this account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param kmsKeyId <p>The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the <code>SecretString</code> or <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default AWS KMS CMK (the one named <code>awssecretsmanager</code>) for this account.</p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the <code>SecretString</code> or <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default AWS KMS CMK (the one named <code>awssecretsmanager</code>) for this account.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param kmsKeyId <p>The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the <code>SecretString</code> or <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default AWS KMS CMK (the one named <code>awssecretsmanager</code>) for this account.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSecretResult withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>Specifies whether automatic rotation is enabled for this secret.</p> <p>To enable rotation, use <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value greater than 0. To disable rotation, use <a>CancelRotateSecret</a>.</p>
     *
     * @return <p>Specifies whether automatic rotation is enabled for this secret.</p> <p>To enable rotation, use <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value greater than 0. To disable rotation, use <a>CancelRotateSecret</a>.</p>
     */
    public Boolean isRotationEnabled() {
        return rotationEnabled;
    }

    /**
     * <p>Specifies whether automatic rotation is enabled for this secret.</p> <p>To enable rotation, use <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value greater than 0. To disable rotation, use <a>CancelRotateSecret</a>.</p>
     *
     * @return <p>Specifies whether automatic rotation is enabled for this secret.</p> <p>To enable rotation, use <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value greater than 0. To disable rotation, use <a>CancelRotateSecret</a>.</p>
     */
    public Boolean getRotationEnabled() {
        return rotationEnabled;
    }

    /**
     * <p>Specifies whether automatic rotation is enabled for this secret.</p> <p>To enable rotation, use <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value greater than 0. To disable rotation, use <a>CancelRotateSecret</a>.</p>
     *
     * @param rotationEnabled <p>Specifies whether automatic rotation is enabled for this secret.</p> <p>To enable rotation, use <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value greater than 0. To disable rotation, use <a>CancelRotateSecret</a>.</p>
     */
    public void setRotationEnabled(Boolean rotationEnabled) {
        this.rotationEnabled = rotationEnabled;
    }

    /**
     * <p>Specifies whether automatic rotation is enabled for this secret.</p> <p>To enable rotation, use <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value greater than 0. To disable rotation, use <a>CancelRotateSecret</a>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rotationEnabled <p>Specifies whether automatic rotation is enabled for this secret.</p> <p>To enable rotation, use <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value greater than 0. To disable rotation, use <a>CancelRotateSecret</a>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSecretResult withRotationEnabled(Boolean rotationEnabled) {
        this.rotationEnabled = rotationEnabled;
        return this;
    }

    /**
     * <p>The ARN of a Lambda function that's invoked by Secrets Manager to rotate the secret either automatically per the schedule or manually by a call to <code>RotateSecret</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return <p>The ARN of a Lambda function that's invoked by Secrets Manager to rotate the secret either automatically per the schedule or manually by a call to <code>RotateSecret</code>.</p>
     */
    public String getRotationLambdaARN() {
        return rotationLambdaARN;
    }

    /**
     * <p>The ARN of a Lambda function that's invoked by Secrets Manager to rotate the secret either automatically per the schedule or manually by a call to <code>RotateSecret</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param rotationLambdaARN <p>The ARN of a Lambda function that's invoked by Secrets Manager to rotate the secret either automatically per the schedule or manually by a call to <code>RotateSecret</code>.</p>
     */
    public void setRotationLambdaARN(String rotationLambdaARN) {
        this.rotationLambdaARN = rotationLambdaARN;
    }

    /**
     * <p>The ARN of a Lambda function that's invoked by Secrets Manager to rotate the secret either automatically per the schedule or manually by a call to <code>RotateSecret</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param rotationLambdaARN <p>The ARN of a Lambda function that's invoked by Secrets Manager to rotate the secret either automatically per the schedule or manually by a call to <code>RotateSecret</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSecretResult withRotationLambdaARN(String rotationLambdaARN) {
        this.rotationLambdaARN = rotationLambdaARN;
        return this;
    }

    /**
     * <p>A structure that contains the rotation configuration for this secret.</p>
     *
     * @return <p>A structure that contains the rotation configuration for this secret.</p>
     */
    public RotationRulesType getRotationRules() {
        return rotationRules;
    }

    /**
     * <p>A structure that contains the rotation configuration for this secret.</p>
     *
     * @param rotationRules <p>A structure that contains the rotation configuration for this secret.</p>
     */
    public void setRotationRules(RotationRulesType rotationRules) {
        this.rotationRules = rotationRules;
    }

    /**
     * <p>A structure that contains the rotation configuration for this secret.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rotationRules <p>A structure that contains the rotation configuration for this secret.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSecretResult withRotationRules(RotationRulesType rotationRules) {
        this.rotationRules = rotationRules;
        return this;
    }

    /**
     * <p>The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is null if the secret has never rotated.</p>
     *
     * @return <p>The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is null if the secret has never rotated.</p>
     */
    public java.util.Date getLastRotatedDate() {
        return lastRotatedDate;
    }

    /**
     * <p>The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is null if the secret has never rotated.</p>
     *
     * @param lastRotatedDate <p>The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is null if the secret has never rotated.</p>
     */
    public void setLastRotatedDate(java.util.Date lastRotatedDate) {
        this.lastRotatedDate = lastRotatedDate;
    }

    /**
     * <p>The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is null if the secret has never rotated.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastRotatedDate <p>The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is null if the secret has never rotated.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSecretResult withLastRotatedDate(java.util.Date lastRotatedDate) {
        this.lastRotatedDate = lastRotatedDate;
        return this;
    }

    /**
     * <p>The last date and time that this secret was modified in any way.</p>
     *
     * @return <p>The last date and time that this secret was modified in any way.</p>
     */
    public java.util.Date getLastChangedDate() {
        return lastChangedDate;
    }

    /**
     * <p>The last date and time that this secret was modified in any way.</p>
     *
     * @param lastChangedDate <p>The last date and time that this secret was modified in any way.</p>
     */
    public void setLastChangedDate(java.util.Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }

    /**
     * <p>The last date and time that this secret was modified in any way.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastChangedDate <p>The last date and time that this secret was modified in any way.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSecretResult withLastChangedDate(java.util.Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
        return this;
    }

    /**
     * <p>The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows only the date, not the time.</p>
     *
     * @return <p>The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows only the date, not the time.</p>
     */
    public java.util.Date getLastAccessedDate() {
        return lastAccessedDate;
    }

    /**
     * <p>The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows only the date, not the time.</p>
     *
     * @param lastAccessedDate <p>The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows only the date, not the time.</p>
     */
    public void setLastAccessedDate(java.util.Date lastAccessedDate) {
        this.lastAccessedDate = lastAccessedDate;
    }

    /**
     * <p>The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows only the date, not the time.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastAccessedDate <p>The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows only the date, not the time.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSecretResult withLastAccessedDate(java.util.Date lastAccessedDate) {
        this.lastAccessedDate = lastAccessedDate;
        return this;
    }

    /**
     * <p>This value exists if the secret is scheduled for deletion. Some time after the specified date and time, Secrets Manager deletes the secret and all of its versions.</p> <p>If a secret is scheduled for deletion, then its details, including the encrypted secret information, is not accessible. To cancel a scheduled deletion and restore access, use <a>RestoreSecret</a>.</p>
     *
     * @return <p>This value exists if the secret is scheduled for deletion. Some time after the specified date and time, Secrets Manager deletes the secret and all of its versions.</p> <p>If a secret is scheduled for deletion, then its details, including the encrypted secret information, is not accessible. To cancel a scheduled deletion and restore access, use <a>RestoreSecret</a>.</p>
     */
    public java.util.Date getDeletedDate() {
        return deletedDate;
    }

    /**
     * <p>This value exists if the secret is scheduled for deletion. Some time after the specified date and time, Secrets Manager deletes the secret and all of its versions.</p> <p>If a secret is scheduled for deletion, then its details, including the encrypted secret information, is not accessible. To cancel a scheduled deletion and restore access, use <a>RestoreSecret</a>.</p>
     *
     * @param deletedDate <p>This value exists if the secret is scheduled for deletion. Some time after the specified date and time, Secrets Manager deletes the secret and all of its versions.</p> <p>If a secret is scheduled for deletion, then its details, including the encrypted secret information, is not accessible. To cancel a scheduled deletion and restore access, use <a>RestoreSecret</a>.</p>
     */
    public void setDeletedDate(java.util.Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    /**
     * <p>This value exists if the secret is scheduled for deletion. Some time after the specified date and time, Secrets Manager deletes the secret and all of its versions.</p> <p>If a secret is scheduled for deletion, then its details, including the encrypted secret information, is not accessible. To cancel a scheduled deletion and restore access, use <a>RestoreSecret</a>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deletedDate <p>This value exists if the secret is scheduled for deletion. Some time after the specified date and time, Secrets Manager deletes the secret and all of its versions.</p> <p>If a secret is scheduled for deletion, then its details, including the encrypted secret information, is not accessible. To cancel a scheduled deletion and restore access, use <a>RestoreSecret</a>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSecretResult withDeletedDate(java.util.Date deletedDate) {
        this.deletedDate = deletedDate;
        return this;
    }

    /**
     * <p>The list of user-defined tags that are associated with the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.</p>
     *
     * @return <p>The list of user-defined tags that are associated with the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.</p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>The list of user-defined tags that are associated with the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.</p>
     *
     * @param tags <p>The list of user-defined tags that are associated with the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.</p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>The list of user-defined tags that are associated with the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>The list of user-defined tags that are associated with the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSecretResult withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>The list of user-defined tags that are associated with the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>The list of user-defined tags that are associated with the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSecretResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>A list of all of the currently assigned <code>VersionStage</code> staging labels and the <code>VersionId</code> that each is attached to. Staging labels are used to keep track of the different versions during the rotation process.</p> <note> <p>A version that does not have any staging labels attached is considered deprecated and subject to deletion. Such versions are not included in this list.</p> </note>
     *
     * @return <p>A list of all of the currently assigned <code>VersionStage</code> staging labels and the <code>VersionId</code> that each is attached to. Staging labels are used to keep track of the different versions during the rotation process.</p> <note> <p>A version that does not have any staging labels attached is considered deprecated and subject to deletion. Such versions are not included in this list.</p> </note>
     */
    public java.util.Map<String, java.util.List<String>> getVersionIdsToStages() {
        return versionIdsToStages;
    }

    /**
     * <p>A list of all of the currently assigned <code>VersionStage</code> staging labels and the <code>VersionId</code> that each is attached to. Staging labels are used to keep track of the different versions during the rotation process.</p> <note> <p>A version that does not have any staging labels attached is considered deprecated and subject to deletion. Such versions are not included in this list.</p> </note>
     *
     * @param versionIdsToStages <p>A list of all of the currently assigned <code>VersionStage</code> staging labels and the <code>VersionId</code> that each is attached to. Staging labels are used to keep track of the different versions during the rotation process.</p> <note> <p>A version that does not have any staging labels attached is considered deprecated and subject to deletion. Such versions are not included in this list.</p> </note>
     */
    public void setVersionIdsToStages(java.util.Map<String, java.util.List<String>> versionIdsToStages) {
        this.versionIdsToStages = versionIdsToStages;
    }

    /**
     * <p>A list of all of the currently assigned <code>VersionStage</code> staging labels and the <code>VersionId</code> that each is attached to. Staging labels are used to keep track of the different versions during the rotation process.</p> <note> <p>A version that does not have any staging labels attached is considered deprecated and subject to deletion. Such versions are not included in this list.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versionIdsToStages <p>A list of all of the currently assigned <code>VersionStage</code> staging labels and the <code>VersionId</code> that each is attached to. Staging labels are used to keep track of the different versions during the rotation process.</p> <note> <p>A version that does not have any staging labels attached is considered deprecated and subject to deletion. Such versions are not included in this list.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSecretResult withVersionIdsToStages(java.util.Map<String, java.util.List<String>> versionIdsToStages) {
        this.versionIdsToStages = versionIdsToStages;
        return this;
    }

    /**
     * <p>A list of all of the currently assigned <code>VersionStage</code> staging labels and the <code>VersionId</code> that each is attached to. Staging labels are used to keep track of the different versions during the rotation process.</p> <note> <p>A version that does not have any staging labels attached is considered deprecated and subject to deletion. Such versions are not included in this list.</p> </note>
     * <p>
     * The method adds a new key-value pair into VersionIdsToStages parameter, and returns a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into VersionIdsToStages.
     * @param value The corresponding value of the entry to be added into VersionIdsToStages.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSecretResult addVersionIdsToStagesEntry(String key, java.util.List<String> value) {
        if (null == this.versionIdsToStages) {
            this.versionIdsToStages = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.versionIdsToStages.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.versionIdsToStages.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into VersionIdsToStages.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public DescribeSecretResult clearVersionIdsToStagesEntries() {
        this.versionIdsToStages = null;
        return this;
    }

    /**
     * <p>Returns the name of the service that created this secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>Returns the name of the service that created this secret.</p>
     */
    public String getOwningService() {
        return owningService;
    }

    /**
     * <p>Returns the name of the service that created this secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param owningService <p>Returns the name of the service that created this secret.</p>
     */
    public void setOwningService(String owningService) {
        this.owningService = owningService;
    }

    /**
     * <p>Returns the name of the service that created this secret.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param owningService <p>Returns the name of the service that created this secret.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSecretResult withOwningService(String owningService) {
        this.owningService = owningService;
        return this;
    }

    /**
     * <p>The date that the secret was created.</p>
     *
     * @return <p>The date that the secret was created.</p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>The date that the secret was created.</p>
     *
     * @param createdDate <p>The date that the secret was created.</p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>The date that the secret was created.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdDate <p>The date that the secret was created.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeSecretResult withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
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
        if (getARN() != null) sb.append("ARN: " + getARN() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getKmsKeyId() != null) sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getRotationEnabled() != null) sb.append("RotationEnabled: " + getRotationEnabled() + ",");
        if (getRotationLambdaARN() != null) sb.append("RotationLambdaARN: " + getRotationLambdaARN() + ",");
        if (getRotationRules() != null) sb.append("RotationRules: " + getRotationRules() + ",");
        if (getLastRotatedDate() != null) sb.append("LastRotatedDate: " + getLastRotatedDate() + ",");
        if (getLastChangedDate() != null) sb.append("LastChangedDate: " + getLastChangedDate() + ",");
        if (getLastAccessedDate() != null) sb.append("LastAccessedDate: " + getLastAccessedDate() + ",");
        if (getDeletedDate() != null) sb.append("DeletedDate: " + getDeletedDate() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getVersionIdsToStages() != null) sb.append("VersionIdsToStages: " + getVersionIdsToStages() + ",");
        if (getOwningService() != null) sb.append("OwningService: " + getOwningService() + ",");
        if (getCreatedDate() != null) sb.append("CreatedDate: " + getCreatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getRotationEnabled() == null) ? 0 : getRotationEnabled().hashCode());
        hashCode = prime * hashCode + ((getRotationLambdaARN() == null) ? 0 : getRotationLambdaARN().hashCode());
        hashCode = prime * hashCode + ((getRotationRules() == null) ? 0 : getRotationRules().hashCode());
        hashCode = prime * hashCode + ((getLastRotatedDate() == null) ? 0 : getLastRotatedDate().hashCode());
        hashCode = prime * hashCode + ((getLastChangedDate() == null) ? 0 : getLastChangedDate().hashCode());
        hashCode = prime * hashCode + ((getLastAccessedDate() == null) ? 0 : getLastAccessedDate().hashCode());
        hashCode = prime * hashCode + ((getDeletedDate() == null) ? 0 : getDeletedDate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVersionIdsToStages() == null) ? 0 : getVersionIdsToStages().hashCode());
        hashCode = prime * hashCode + ((getOwningService() == null) ? 0 : getOwningService().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSecretResult == false) return false;
        DescribeSecretResult other = (DescribeSecretResult)obj;

        if (other.getARN() == null ^ this.getARN() == null) return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false) return false;
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null) return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false) return false;
        if (other.getRotationEnabled() == null ^ this.getRotationEnabled() == null) return false;
        if (other.getRotationEnabled() != null && other.getRotationEnabled().equals(this.getRotationEnabled()) == false) return false;
        if (other.getRotationLambdaARN() == null ^ this.getRotationLambdaARN() == null) return false;
        if (other.getRotationLambdaARN() != null && other.getRotationLambdaARN().equals(this.getRotationLambdaARN()) == false) return false;
        if (other.getRotationRules() == null ^ this.getRotationRules() == null) return false;
        if (other.getRotationRules() != null && other.getRotationRules().equals(this.getRotationRules()) == false) return false;
        if (other.getLastRotatedDate() == null ^ this.getLastRotatedDate() == null) return false;
        if (other.getLastRotatedDate() != null && other.getLastRotatedDate().equals(this.getLastRotatedDate()) == false) return false;
        if (other.getLastChangedDate() == null ^ this.getLastChangedDate() == null) return false;
        if (other.getLastChangedDate() != null && other.getLastChangedDate().equals(this.getLastChangedDate()) == false) return false;
        if (other.getLastAccessedDate() == null ^ this.getLastAccessedDate() == null) return false;
        if (other.getLastAccessedDate() != null && other.getLastAccessedDate().equals(this.getLastAccessedDate()) == false) return false;
        if (other.getDeletedDate() == null ^ this.getDeletedDate() == null) return false;
        if (other.getDeletedDate() != null && other.getDeletedDate().equals(this.getDeletedDate()) == false) return false;
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false;
        if (other.getVersionIdsToStages() == null ^ this.getVersionIdsToStages() == null) return false;
        if (other.getVersionIdsToStages() != null && other.getVersionIdsToStages().equals(this.getVersionIdsToStages()) == false) return false;
        if (other.getOwningService() == null ^ this.getOwningService() == null) return false;
        if (other.getOwningService() != null && other.getOwningService().equals(this.getOwningService()) == false) return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null) return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false) return false;
        return true;
    }
}
