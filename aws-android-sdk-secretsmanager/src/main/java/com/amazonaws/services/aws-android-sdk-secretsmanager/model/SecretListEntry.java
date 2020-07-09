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


/**
 * <p>A structure that contains the details about a secret. It does not include the encrypted <code>SecretString</code> and <code>SecretBinary</code> values. To get those values, use the <a>GetSecretValue</a> operation.</p>
 */
public class SecretListEntry implements Serializable {
    /**
     * <p>The Amazon Resource Name (ARN) of the secret.</p> <p>For more information about ARNs in Secrets Manager, see <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#iam-resources">Policy Resources</a> in the <i>AWS Secrets Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String aRN;

    /**
     * <p>The friendly name of the secret. You can use forward slashes in the name to represent a path hierarchy. For example, <code>/prod/databases/dbserver1</code> could represent the secret for a server named <code>dbserver1</code> in the folder <code>databases</code> in the folder <code>prod</code>. </p>
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
     * <p>The ARN or alias of the AWS KMS customer master key (CMK) used to encrypt the <code>SecretString</code> and <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default KMS CMK, the key named <code>awssecretsmanager</code>, for this account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String kmsKeyId;

    /**
     * <p>Indicates whether automatic, scheduled rotation is enabled for this secret.</p>
     */
    private Boolean rotationEnabled;

    /**
     * <p>The ARN of an AWS Lambda function invoked by Secrets Manager to rotate and expire the secret either automatically per the schedule or manually by a call to <a>RotateSecret</a>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String rotationLambdaARN;

    /**
     * <p>A structure that defines the rotation configuration for the secret.</p>
     */
    private RotationRulesType rotationRules;

    /**
     * <p>The last date and time that the rotation process for this secret was invoked.</p>
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
     * <p>The date and time the deletion of the secret occurred. Not present on active secrets. The secret can be recovered until the number of days in the recovery window has passed, as specified in the <code>RecoveryWindowInDays</code> parameter of the <a>DeleteSecret</a> operation.</p>
     */
    private java.util.Date deletedDate;

    /**
     * <p>The list of user-defined tags associated with the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.</p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>A list of all of the currently assigned <code>SecretVersionStage</code> staging labels and the <code>SecretVersionId</code> attached to each one. Staging labels are used to keep track of the different versions during the rotation process.</p> <note> <p>A version that does not have any <code>SecretVersionStage</code> is considered deprecated and subject to deletion. Such versions are not included in this list.</p> </note>
     */
    private java.util.Map<String, java.util.List<String>> secretVersionsToStages;

    /**
     * <p>Returns the name of the service that created the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String owningService;

    /**
     * <p>The date and time when a secret was created.</p>
     */
    private java.util.Date createdDate;

    /**
     * <p>The Amazon Resource Name (ARN) of the secret.</p> <p>For more information about ARNs in Secrets Manager, see <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#iam-resources">Policy Resources</a> in the <i>AWS Secrets Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>The Amazon Resource Name (ARN) of the secret.</p> <p>For more information about ARNs in Secrets Manager, see <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#iam-resources">Policy Resources</a> in the <i>AWS Secrets Manager User Guide</i>.</p>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the secret.</p> <p>For more information about ARNs in Secrets Manager, see <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#iam-resources">Policy Resources</a> in the <i>AWS Secrets Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aRN <p>The Amazon Resource Name (ARN) of the secret.</p> <p>For more information about ARNs in Secrets Manager, see <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#iam-resources">Policy Resources</a> in the <i>AWS Secrets Manager User Guide</i>.</p>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the secret.</p> <p>For more information about ARNs in Secrets Manager, see <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#iam-resources">Policy Resources</a> in the <i>AWS Secrets Manager User Guide</i>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aRN <p>The Amazon Resource Name (ARN) of the secret.</p> <p>For more information about ARNs in Secrets Manager, see <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/reference_iam-permissions.html#iam-resources">Policy Resources</a> in the <i>AWS Secrets Manager User Guide</i>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretListEntry withARN(String aRN) {
        this.aRN = aRN;
        return this;
    }

    /**
     * <p>The friendly name of the secret. You can use forward slashes in the name to represent a path hierarchy. For example, <code>/prod/databases/dbserver1</code> could represent the secret for a server named <code>dbserver1</code> in the folder <code>databases</code> in the folder <code>prod</code>. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>The friendly name of the secret. You can use forward slashes in the name to represent a path hierarchy. For example, <code>/prod/databases/dbserver1</code> could represent the secret for a server named <code>dbserver1</code> in the folder <code>databases</code> in the folder <code>prod</code>. </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The friendly name of the secret. You can use forward slashes in the name to represent a path hierarchy. For example, <code>/prod/databases/dbserver1</code> could represent the secret for a server named <code>dbserver1</code> in the folder <code>databases</code> in the folder <code>prod</code>. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>The friendly name of the secret. You can use forward slashes in the name to represent a path hierarchy. For example, <code>/prod/databases/dbserver1</code> could represent the secret for a server named <code>dbserver1</code> in the folder <code>databases</code> in the folder <code>prod</code>. </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The friendly name of the secret. You can use forward slashes in the name to represent a path hierarchy. For example, <code>/prod/databases/dbserver1</code> could represent the secret for a server named <code>dbserver1</code> in the folder <code>databases</code> in the folder <code>prod</code>. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>The friendly name of the secret. You can use forward slashes in the name to represent a path hierarchy. For example, <code>/prod/databases/dbserver1</code> could represent the secret for a server named <code>dbserver1</code> in the folder <code>databases</code> in the folder <code>prod</code>. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretListEntry withName(String name) {
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
    public SecretListEntry withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>The ARN or alias of the AWS KMS customer master key (CMK) used to encrypt the <code>SecretString</code> and <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default KMS CMK, the key named <code>awssecretsmanager</code>, for this account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return <p>The ARN or alias of the AWS KMS customer master key (CMK) used to encrypt the <code>SecretString</code> and <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default KMS CMK, the key named <code>awssecretsmanager</code>, for this account.</p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>The ARN or alias of the AWS KMS customer master key (CMK) used to encrypt the <code>SecretString</code> and <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default KMS CMK, the key named <code>awssecretsmanager</code>, for this account.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param kmsKeyId <p>The ARN or alias of the AWS KMS customer master key (CMK) used to encrypt the <code>SecretString</code> and <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default KMS CMK, the key named <code>awssecretsmanager</code>, for this account.</p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>The ARN or alias of the AWS KMS customer master key (CMK) used to encrypt the <code>SecretString</code> and <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default KMS CMK, the key named <code>awssecretsmanager</code>, for this account.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param kmsKeyId <p>The ARN or alias of the AWS KMS customer master key (CMK) used to encrypt the <code>SecretString</code> and <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default KMS CMK, the key named <code>awssecretsmanager</code>, for this account.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretListEntry withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>Indicates whether automatic, scheduled rotation is enabled for this secret.</p>
     *
     * @return <p>Indicates whether automatic, scheduled rotation is enabled for this secret.</p>
     */
    public Boolean isRotationEnabled() {
        return rotationEnabled;
    }

    /**
     * <p>Indicates whether automatic, scheduled rotation is enabled for this secret.</p>
     *
     * @return <p>Indicates whether automatic, scheduled rotation is enabled for this secret.</p>
     */
    public Boolean getRotationEnabled() {
        return rotationEnabled;
    }

    /**
     * <p>Indicates whether automatic, scheduled rotation is enabled for this secret.</p>
     *
     * @param rotationEnabled <p>Indicates whether automatic, scheduled rotation is enabled for this secret.</p>
     */
    public void setRotationEnabled(Boolean rotationEnabled) {
        this.rotationEnabled = rotationEnabled;
    }

    /**
     * <p>Indicates whether automatic, scheduled rotation is enabled for this secret.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rotationEnabled <p>Indicates whether automatic, scheduled rotation is enabled for this secret.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretListEntry withRotationEnabled(Boolean rotationEnabled) {
        this.rotationEnabled = rotationEnabled;
        return this;
    }

    /**
     * <p>The ARN of an AWS Lambda function invoked by Secrets Manager to rotate and expire the secret either automatically per the schedule or manually by a call to <a>RotateSecret</a>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return <p>The ARN of an AWS Lambda function invoked by Secrets Manager to rotate and expire the secret either automatically per the schedule or manually by a call to <a>RotateSecret</a>.</p>
     */
    public String getRotationLambdaARN() {
        return rotationLambdaARN;
    }

    /**
     * <p>The ARN of an AWS Lambda function invoked by Secrets Manager to rotate and expire the secret either automatically per the schedule or manually by a call to <a>RotateSecret</a>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param rotationLambdaARN <p>The ARN of an AWS Lambda function invoked by Secrets Manager to rotate and expire the secret either automatically per the schedule or manually by a call to <a>RotateSecret</a>.</p>
     */
    public void setRotationLambdaARN(String rotationLambdaARN) {
        this.rotationLambdaARN = rotationLambdaARN;
    }

    /**
     * <p>The ARN of an AWS Lambda function invoked by Secrets Manager to rotate and expire the secret either automatically per the schedule or manually by a call to <a>RotateSecret</a>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param rotationLambdaARN <p>The ARN of an AWS Lambda function invoked by Secrets Manager to rotate and expire the secret either automatically per the schedule or manually by a call to <a>RotateSecret</a>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretListEntry withRotationLambdaARN(String rotationLambdaARN) {
        this.rotationLambdaARN = rotationLambdaARN;
        return this;
    }

    /**
     * <p>A structure that defines the rotation configuration for the secret.</p>
     *
     * @return <p>A structure that defines the rotation configuration for the secret.</p>
     */
    public RotationRulesType getRotationRules() {
        return rotationRules;
    }

    /**
     * <p>A structure that defines the rotation configuration for the secret.</p>
     *
     * @param rotationRules <p>A structure that defines the rotation configuration for the secret.</p>
     */
    public void setRotationRules(RotationRulesType rotationRules) {
        this.rotationRules = rotationRules;
    }

    /**
     * <p>A structure that defines the rotation configuration for the secret.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rotationRules <p>A structure that defines the rotation configuration for the secret.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretListEntry withRotationRules(RotationRulesType rotationRules) {
        this.rotationRules = rotationRules;
        return this;
    }

    /**
     * <p>The last date and time that the rotation process for this secret was invoked.</p>
     *
     * @return <p>The last date and time that the rotation process for this secret was invoked.</p>
     */
    public java.util.Date getLastRotatedDate() {
        return lastRotatedDate;
    }

    /**
     * <p>The last date and time that the rotation process for this secret was invoked.</p>
     *
     * @param lastRotatedDate <p>The last date and time that the rotation process for this secret was invoked.</p>
     */
    public void setLastRotatedDate(java.util.Date lastRotatedDate) {
        this.lastRotatedDate = lastRotatedDate;
    }

    /**
     * <p>The last date and time that the rotation process for this secret was invoked.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastRotatedDate <p>The last date and time that the rotation process for this secret was invoked.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretListEntry withLastRotatedDate(java.util.Date lastRotatedDate) {
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
    public SecretListEntry withLastChangedDate(java.util.Date lastChangedDate) {
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
    public SecretListEntry withLastAccessedDate(java.util.Date lastAccessedDate) {
        this.lastAccessedDate = lastAccessedDate;
        return this;
    }

    /**
     * <p>The date and time the deletion of the secret occurred. Not present on active secrets. The secret can be recovered until the number of days in the recovery window has passed, as specified in the <code>RecoveryWindowInDays</code> parameter of the <a>DeleteSecret</a> operation.</p>
     *
     * @return <p>The date and time the deletion of the secret occurred. Not present on active secrets. The secret can be recovered until the number of days in the recovery window has passed, as specified in the <code>RecoveryWindowInDays</code> parameter of the <a>DeleteSecret</a> operation.</p>
     */
    public java.util.Date getDeletedDate() {
        return deletedDate;
    }

    /**
     * <p>The date and time the deletion of the secret occurred. Not present on active secrets. The secret can be recovered until the number of days in the recovery window has passed, as specified in the <code>RecoveryWindowInDays</code> parameter of the <a>DeleteSecret</a> operation.</p>
     *
     * @param deletedDate <p>The date and time the deletion of the secret occurred. Not present on active secrets. The secret can be recovered until the number of days in the recovery window has passed, as specified in the <code>RecoveryWindowInDays</code> parameter of the <a>DeleteSecret</a> operation.</p>
     */
    public void setDeletedDate(java.util.Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    /**
     * <p>The date and time the deletion of the secret occurred. Not present on active secrets. The secret can be recovered until the number of days in the recovery window has passed, as specified in the <code>RecoveryWindowInDays</code> parameter of the <a>DeleteSecret</a> operation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deletedDate <p>The date and time the deletion of the secret occurred. Not present on active secrets. The secret can be recovered until the number of days in the recovery window has passed, as specified in the <code>RecoveryWindowInDays</code> parameter of the <a>DeleteSecret</a> operation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretListEntry withDeletedDate(java.util.Date deletedDate) {
        this.deletedDate = deletedDate;
        return this;
    }

    /**
     * <p>The list of user-defined tags associated with the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.</p>
     *
     * @return <p>The list of user-defined tags associated with the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.</p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>The list of user-defined tags associated with the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.</p>
     *
     * @param tags <p>The list of user-defined tags associated with the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.</p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>The list of user-defined tags associated with the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>The list of user-defined tags associated with the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretListEntry withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>The list of user-defined tags associated with the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>The list of user-defined tags associated with the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretListEntry withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>A list of all of the currently assigned <code>SecretVersionStage</code> staging labels and the <code>SecretVersionId</code> attached to each one. Staging labels are used to keep track of the different versions during the rotation process.</p> <note> <p>A version that does not have any <code>SecretVersionStage</code> is considered deprecated and subject to deletion. Such versions are not included in this list.</p> </note>
     *
     * @return <p>A list of all of the currently assigned <code>SecretVersionStage</code> staging labels and the <code>SecretVersionId</code> attached to each one. Staging labels are used to keep track of the different versions during the rotation process.</p> <note> <p>A version that does not have any <code>SecretVersionStage</code> is considered deprecated and subject to deletion. Such versions are not included in this list.</p> </note>
     */
    public java.util.Map<String, java.util.List<String>> getSecretVersionsToStages() {
        return secretVersionsToStages;
    }

    /**
     * <p>A list of all of the currently assigned <code>SecretVersionStage</code> staging labels and the <code>SecretVersionId</code> attached to each one. Staging labels are used to keep track of the different versions during the rotation process.</p> <note> <p>A version that does not have any <code>SecretVersionStage</code> is considered deprecated and subject to deletion. Such versions are not included in this list.</p> </note>
     *
     * @param secretVersionsToStages <p>A list of all of the currently assigned <code>SecretVersionStage</code> staging labels and the <code>SecretVersionId</code> attached to each one. Staging labels are used to keep track of the different versions during the rotation process.</p> <note> <p>A version that does not have any <code>SecretVersionStage</code> is considered deprecated and subject to deletion. Such versions are not included in this list.</p> </note>
     */
    public void setSecretVersionsToStages(java.util.Map<String, java.util.List<String>> secretVersionsToStages) {
        this.secretVersionsToStages = secretVersionsToStages;
    }

    /**
     * <p>A list of all of the currently assigned <code>SecretVersionStage</code> staging labels and the <code>SecretVersionId</code> attached to each one. Staging labels are used to keep track of the different versions during the rotation process.</p> <note> <p>A version that does not have any <code>SecretVersionStage</code> is considered deprecated and subject to deletion. Such versions are not included in this list.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param secretVersionsToStages <p>A list of all of the currently assigned <code>SecretVersionStage</code> staging labels and the <code>SecretVersionId</code> attached to each one. Staging labels are used to keep track of the different versions during the rotation process.</p> <note> <p>A version that does not have any <code>SecretVersionStage</code> is considered deprecated and subject to deletion. Such versions are not included in this list.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretListEntry withSecretVersionsToStages(java.util.Map<String, java.util.List<String>> secretVersionsToStages) {
        this.secretVersionsToStages = secretVersionsToStages;
        return this;
    }

    /**
     * <p>A list of all of the currently assigned <code>SecretVersionStage</code> staging labels and the <code>SecretVersionId</code> attached to each one. Staging labels are used to keep track of the different versions during the rotation process.</p> <note> <p>A version that does not have any <code>SecretVersionStage</code> is considered deprecated and subject to deletion. Such versions are not included in this list.</p> </note>
     * <p>
     * The method adds a new key-value pair into SecretVersionsToStages parameter, and returns a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into SecretVersionsToStages.
     * @param value The corresponding value of the entry to be added into SecretVersionsToStages.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretListEntry addSecretVersionsToStagesEntry(String key, java.util.List<String> value) {
        if (null == this.secretVersionsToStages) {
            this.secretVersionsToStages = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.secretVersionsToStages.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.secretVersionsToStages.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SecretVersionsToStages.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public SecretListEntry clearSecretVersionsToStagesEntries() {
        this.secretVersionsToStages = null;
        return this;
    }

    /**
     * <p>Returns the name of the service that created the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>Returns the name of the service that created the secret.</p>
     */
    public String getOwningService() {
        return owningService;
    }

    /**
     * <p>Returns the name of the service that created the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param owningService <p>Returns the name of the service that created the secret.</p>
     */
    public void setOwningService(String owningService) {
        this.owningService = owningService;
    }

    /**
     * <p>Returns the name of the service that created the secret.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param owningService <p>Returns the name of the service that created the secret.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretListEntry withOwningService(String owningService) {
        this.owningService = owningService;
        return this;
    }

    /**
     * <p>The date and time when a secret was created.</p>
     *
     * @return <p>The date and time when a secret was created.</p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>The date and time when a secret was created.</p>
     *
     * @param createdDate <p>The date and time when a secret was created.</p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>The date and time when a secret was created.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdDate <p>The date and time when a secret was created.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SecretListEntry withCreatedDate(java.util.Date createdDate) {
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
        if (getSecretVersionsToStages() != null) sb.append("SecretVersionsToStages: " + getSecretVersionsToStages() + ",");
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
        hashCode = prime * hashCode + ((getSecretVersionsToStages() == null) ? 0 : getSecretVersionsToStages().hashCode());
        hashCode = prime * hashCode + ((getOwningService() == null) ? 0 : getOwningService().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SecretListEntry == false) return false;
        SecretListEntry other = (SecretListEntry)obj;

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
        if (other.getSecretVersionsToStages() == null ^ this.getSecretVersionsToStages() == null) return false;
        if (other.getSecretVersionsToStages() != null && other.getSecretVersionsToStages().equals(this.getSecretVersionsToStages()) == false) return false;
        if (other.getOwningService() == null ^ this.getOwningService() == null) return false;
        if (other.getOwningService() != null && other.getOwningService().equals(this.getOwningService()) == false) return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null) return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false) return false;
        return true;
    }
}
