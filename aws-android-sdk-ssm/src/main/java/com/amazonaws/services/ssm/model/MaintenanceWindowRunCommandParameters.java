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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * The parameters for a RUN_COMMAND task type.
 * </p>
 * <p>
 * For information about specifying and updating task parameters, see
 * <a>RegisterTaskWithMaintenanceWindow</a> and
 * <a>UpdateMaintenanceWindowTask</a>.
 * </p>
 * <note>
 * <p>
 * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to
 * contain logs, instead use the <code>OutputS3BucketName</code> and
 * <code>OutputS3KeyPrefix</code> options in the
 * <code>TaskInvocationParameters</code> structure. For information about how
 * Systems Manager handles these options for the supported maintenance window
 * task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
 * </p>
 * <p>
 * <code>TaskParameters</code> has been deprecated. To specify parameters to
 * pass to a task when it runs, instead use the <code>Parameters</code> option
 * in the <code>TaskInvocationParameters</code> structure. For information about
 * how Systems Manager handles these options for the supported maintenance
 * window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
 * </p>
 * <p>
 * For Run Command tasks, Systems Manager uses specified values for
 * <code>TaskParameters</code> and <code>LoggingInfo</code> only if no values
 * are specified for <code>TaskInvocationParameters</code>.
 * </p>
 * </note>
 */
public class MaintenanceWindowRunCommandParameters implements Serializable {
    /**
     * <p>
     * Information about the commands to run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     */
    private String comment;

    /**
     * <p>
     * Configuration options for sending command output to CloudWatch Logs.
     * </p>
     */
    private CloudWatchOutputConfig cloudWatchOutputConfig;

    /**
     * <p>
     * The SHA-256 or SHA-1 hash created by the system when the document was
     * created. SHA-1 hashes have been deprecated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String documentHash;

    /**
     * <p>
     * SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256, Sha1
     */
    private String documentHashType;

    /**
     * <p>
     * The SSM document version to use in the request. You can specify $DEFAULT,
     * $LATEST, or a specific version number. If you run commands by using the
     * AWS CLI, then you must escape the first two options by using a backslash.
     * If you specify a version number, then you don't need to use the
     * backslash. For example:
     * </p>
     * <p>
     * --document-version "\$DEFAULT"
     * </p>
     * <p>
     * --document-version "\$LATEST"
     * </p>
     * <p>
     * --document-version "3"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String documentVersion;

    /**
     * <p>
     * Configurations for sending notifications about command status changes on
     * a per-instance basis.
     * </p>
     */
    private NotificationConfig notificationConfig;

    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     */
    private String outputS3BucketName;

    /**
     * <p>
     * The Amazon S3 bucket subfolder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String outputS3KeyPrefix;

    /**
     * <p>
     * The parameters for the RUN_COMMAND task execution.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;

    /**
     * <p>
     * The ARN of the IAM service role to use to publish Amazon Simple
     * Notification Service (Amazon SNS) notifications for maintenance window
     * Run Command tasks.
     * </p>
     */
    private String serviceRoleArn;

    /**
     * <p>
     * If this time is reached and the command has not already started running,
     * it doesn't run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 2592000<br/>
     */
    private Integer timeoutSeconds;

    /**
     * <p>
     * Information about the commands to run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @return <p>
     *         Information about the commands to run.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * Information about the commands to run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param comment <p>
     *            Information about the commands to run.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * Information about the commands to run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param comment <p>
     *            Information about the commands to run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowRunCommandParameters withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * <p>
     * Configuration options for sending command output to CloudWatch Logs.
     * </p>
     *
     * @return <p>
     *         Configuration options for sending command output to CloudWatch
     *         Logs.
     *         </p>
     */
    public CloudWatchOutputConfig getCloudWatchOutputConfig() {
        return cloudWatchOutputConfig;
    }

    /**
     * <p>
     * Configuration options for sending command output to CloudWatch Logs.
     * </p>
     *
     * @param cloudWatchOutputConfig <p>
     *            Configuration options for sending command output to CloudWatch
     *            Logs.
     *            </p>
     */
    public void setCloudWatchOutputConfig(CloudWatchOutputConfig cloudWatchOutputConfig) {
        this.cloudWatchOutputConfig = cloudWatchOutputConfig;
    }

    /**
     * <p>
     * Configuration options for sending command output to CloudWatch Logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudWatchOutputConfig <p>
     *            Configuration options for sending command output to CloudWatch
     *            Logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowRunCommandParameters withCloudWatchOutputConfig(
            CloudWatchOutputConfig cloudWatchOutputConfig) {
        this.cloudWatchOutputConfig = cloudWatchOutputConfig;
        return this;
    }

    /**
     * <p>
     * The SHA-256 or SHA-1 hash created by the system when the document was
     * created. SHA-1 hashes have been deprecated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The SHA-256 or SHA-1 hash created by the system when the document
     *         was created. SHA-1 hashes have been deprecated.
     *         </p>
     */
    public String getDocumentHash() {
        return documentHash;
    }

    /**
     * <p>
     * The SHA-256 or SHA-1 hash created by the system when the document was
     * created. SHA-1 hashes have been deprecated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param documentHash <p>
     *            The SHA-256 or SHA-1 hash created by the system when the
     *            document was created. SHA-1 hashes have been deprecated.
     *            </p>
     */
    public void setDocumentHash(String documentHash) {
        this.documentHash = documentHash;
    }

    /**
     * <p>
     * The SHA-256 or SHA-1 hash created by the system when the document was
     * created. SHA-1 hashes have been deprecated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param documentHash <p>
     *            The SHA-256 or SHA-1 hash created by the system when the
     *            document was created. SHA-1 hashes have been deprecated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowRunCommandParameters withDocumentHash(String documentHash) {
        this.documentHash = documentHash;
        return this;
    }

    /**
     * <p>
     * SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256, Sha1
     *
     * @return <p>
     *         SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     *         </p>
     * @see DocumentHashType
     */
    public String getDocumentHashType() {
        return documentHashType;
    }

    /**
     * <p>
     * SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256, Sha1
     *
     * @param documentHashType <p>
     *            SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     *            </p>
     * @see DocumentHashType
     */
    public void setDocumentHashType(String documentHashType) {
        this.documentHashType = documentHashType;
    }

    /**
     * <p>
     * SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256, Sha1
     *
     * @param documentHashType <p>
     *            SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentHashType
     */
    public MaintenanceWindowRunCommandParameters withDocumentHashType(String documentHashType) {
        this.documentHashType = documentHashType;
        return this;
    }

    /**
     * <p>
     * SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256, Sha1
     *
     * @param documentHashType <p>
     *            SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     *            </p>
     * @see DocumentHashType
     */
    public void setDocumentHashType(DocumentHashType documentHashType) {
        this.documentHashType = documentHashType.toString();
    }

    /**
     * <p>
     * SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256, Sha1
     *
     * @param documentHashType <p>
     *            SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentHashType
     */
    public MaintenanceWindowRunCommandParameters withDocumentHashType(
            DocumentHashType documentHashType) {
        this.documentHashType = documentHashType.toString();
        return this;
    }

    /**
     * <p>
     * The SSM document version to use in the request. You can specify $DEFAULT,
     * $LATEST, or a specific version number. If you run commands by using the
     * AWS CLI, then you must escape the first two options by using a backslash.
     * If you specify a version number, then you don't need to use the
     * backslash. For example:
     * </p>
     * <p>
     * --document-version "\$DEFAULT"
     * </p>
     * <p>
     * --document-version "\$LATEST"
     * </p>
     * <p>
     * --document-version "3"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @return <p>
     *         The SSM document version to use in the request. You can specify
     *         $DEFAULT, $LATEST, or a specific version number. If you run
     *         commands by using the AWS CLI, then you must escape the first two
     *         options by using a backslash. If you specify a version number,
     *         then you don't need to use the backslash. For example:
     *         </p>
     *         <p>
     *         --document-version "\$DEFAULT"
     *         </p>
     *         <p>
     *         --document-version "\$LATEST"
     *         </p>
     *         <p>
     *         --document-version "3"
     *         </p>
     */
    public String getDocumentVersion() {
        return documentVersion;
    }

    /**
     * <p>
     * The SSM document version to use in the request. You can specify $DEFAULT,
     * $LATEST, or a specific version number. If you run commands by using the
     * AWS CLI, then you must escape the first two options by using a backslash.
     * If you specify a version number, then you don't need to use the
     * backslash. For example:
     * </p>
     * <p>
     * --document-version "\$DEFAULT"
     * </p>
     * <p>
     * --document-version "\$LATEST"
     * </p>
     * <p>
     * --document-version "3"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The SSM document version to use in the request. You can
     *            specify $DEFAULT, $LATEST, or a specific version number. If
     *            you run commands by using the AWS CLI, then you must escape
     *            the first two options by using a backslash. If you specify a
     *            version number, then you don't need to use the backslash. For
     *            example:
     *            </p>
     *            <p>
     *            --document-version "\$DEFAULT"
     *            </p>
     *            <p>
     *            --document-version "\$LATEST"
     *            </p>
     *            <p>
     *            --document-version "3"
     *            </p>
     */
    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The SSM document version to use in the request. You can specify $DEFAULT,
     * $LATEST, or a specific version number. If you run commands by using the
     * AWS CLI, then you must escape the first two options by using a backslash.
     * If you specify a version number, then you don't need to use the
     * backslash. For example:
     * </p>
     * <p>
     * --document-version "\$DEFAULT"
     * </p>
     * <p>
     * --document-version "\$LATEST"
     * </p>
     * <p>
     * --document-version "3"
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The SSM document version to use in the request. You can
     *            specify $DEFAULT, $LATEST, or a specific version number. If
     *            you run commands by using the AWS CLI, then you must escape
     *            the first two options by using a backslash. If you specify a
     *            version number, then you don't need to use the backslash. For
     *            example:
     *            </p>
     *            <p>
     *            --document-version "\$DEFAULT"
     *            </p>
     *            <p>
     *            --document-version "\$LATEST"
     *            </p>
     *            <p>
     *            --document-version "3"
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowRunCommandParameters withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * <p>
     * Configurations for sending notifications about command status changes on
     * a per-instance basis.
     * </p>
     *
     * @return <p>
     *         Configurations for sending notifications about command status
     *         changes on a per-instance basis.
     *         </p>
     */
    public NotificationConfig getNotificationConfig() {
        return notificationConfig;
    }

    /**
     * <p>
     * Configurations for sending notifications about command status changes on
     * a per-instance basis.
     * </p>
     *
     * @param notificationConfig <p>
     *            Configurations for sending notifications about command status
     *            changes on a per-instance basis.
     *            </p>
     */
    public void setNotificationConfig(NotificationConfig notificationConfig) {
        this.notificationConfig = notificationConfig;
    }

    /**
     * <p>
     * Configurations for sending notifications about command status changes on
     * a per-instance basis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationConfig <p>
     *            Configurations for sending notifications about command status
     *            changes on a per-instance basis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowRunCommandParameters withNotificationConfig(
            NotificationConfig notificationConfig) {
        this.notificationConfig = notificationConfig;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @return <p>
     *         The name of the Amazon S3 bucket.
     *         </p>
     */
    public String getOutputS3BucketName() {
        return outputS3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @param outputS3BucketName <p>
     *            The name of the Amazon S3 bucket.
     *            </p>
     */
    public void setOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @param outputS3BucketName <p>
     *            The name of the Amazon S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowRunCommandParameters withOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket subfolder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         The Amazon S3 bucket subfolder.
     *         </p>
     */
    public String getOutputS3KeyPrefix() {
        return outputS3KeyPrefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket subfolder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param outputS3KeyPrefix <p>
     *            The Amazon S3 bucket subfolder.
     *            </p>
     */
    public void setOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket subfolder.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param outputS3KeyPrefix <p>
     *            The Amazon S3 bucket subfolder.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowRunCommandParameters withOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
        return this;
    }

    /**
     * <p>
     * The parameters for the RUN_COMMAND task execution.
     * </p>
     *
     * @return <p>
     *         The parameters for the RUN_COMMAND task execution.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters for the RUN_COMMAND task execution.
     * </p>
     *
     * @param parameters <p>
     *            The parameters for the RUN_COMMAND task execution.
     *            </p>
     */
    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters for the RUN_COMMAND task execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            The parameters for the RUN_COMMAND task execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowRunCommandParameters withParameters(
            java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * The parameters for the RUN_COMMAND task execution.
     * </p>
     * <p>
     * The method adds a new key-value pair into Parameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Parameters.
     * @param value The corresponding value of the entry to be added into
     *            Parameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowRunCommandParameters addParametersEntry(String key,
            java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public MaintenanceWindowRunCommandParameters clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM service role to use to publish Amazon Simple
     * Notification Service (Amazon SNS) notifications for maintenance window
     * Run Command tasks.
     * </p>
     *
     * @return <p>
     *         The ARN of the IAM service role to use to publish Amazon Simple
     *         Notification Service (Amazon SNS) notifications for maintenance
     *         window Run Command tasks.
     *         </p>
     */
    public String getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM service role to use to publish Amazon Simple
     * Notification Service (Amazon SNS) notifications for maintenance window
     * Run Command tasks.
     * </p>
     *
     * @param serviceRoleArn <p>
     *            The ARN of the IAM service role to use to publish Amazon
     *            Simple Notification Service (Amazon SNS) notifications for
     *            maintenance window Run Command tasks.
     *            </p>
     */
    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM service role to use to publish Amazon Simple
     * Notification Service (Amazon SNS) notifications for maintenance window
     * Run Command tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceRoleArn <p>
     *            The ARN of the IAM service role to use to publish Amazon
     *            Simple Notification Service (Amazon SNS) notifications for
     *            maintenance window Run Command tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowRunCommandParameters withServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started running,
     * it doesn't run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 2592000<br/>
     *
     * @return <p>
     *         If this time is reached and the command has not already started
     *         running, it doesn't run.
     *         </p>
     */
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started running,
     * it doesn't run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 2592000<br/>
     *
     * @param timeoutSeconds <p>
     *            If this time is reached and the command has not already
     *            started running, it doesn't run.
     *            </p>
     */
    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started running,
     * it doesn't run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 2592000<br/>
     *
     * @param timeoutSeconds <p>
     *            If this time is reached and the command has not already
     *            started running, it doesn't run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowRunCommandParameters withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
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
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getCloudWatchOutputConfig() != null)
            sb.append("CloudWatchOutputConfig: " + getCloudWatchOutputConfig() + ",");
        if (getDocumentHash() != null)
            sb.append("DocumentHash: " + getDocumentHash() + ",");
        if (getDocumentHashType() != null)
            sb.append("DocumentHashType: " + getDocumentHashType() + ",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: " + getDocumentVersion() + ",");
        if (getNotificationConfig() != null)
            sb.append("NotificationConfig: " + getNotificationConfig() + ",");
        if (getOutputS3BucketName() != null)
            sb.append("OutputS3BucketName: " + getOutputS3BucketName() + ",");
        if (getOutputS3KeyPrefix() != null)
            sb.append("OutputS3KeyPrefix: " + getOutputS3KeyPrefix() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: " + getServiceRoleArn() + ",");
        if (getTimeoutSeconds() != null)
            sb.append("TimeoutSeconds: " + getTimeoutSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime
                * hashCode
                + ((getCloudWatchOutputConfig() == null) ? 0 : getCloudWatchOutputConfig()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDocumentHash() == null) ? 0 : getDocumentHash().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentHashType() == null) ? 0 : getDocumentHashType().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationConfig() == null) ? 0 : getNotificationConfig().hashCode());
        hashCode = prime * hashCode
                + ((getOutputS3BucketName() == null) ? 0 : getOutputS3BucketName().hashCode());
        hashCode = prime * hashCode
                + ((getOutputS3KeyPrefix() == null) ? 0 : getOutputS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getTimeoutSeconds() == null) ? 0 : getTimeoutSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindowRunCommandParameters == false)
            return false;
        MaintenanceWindowRunCommandParameters other = (MaintenanceWindowRunCommandParameters) obj;

        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getCloudWatchOutputConfig() == null ^ this.getCloudWatchOutputConfig() == null)
            return false;
        if (other.getCloudWatchOutputConfig() != null
                && other.getCloudWatchOutputConfig().equals(this.getCloudWatchOutputConfig()) == false)
            return false;
        if (other.getDocumentHash() == null ^ this.getDocumentHash() == null)
            return false;
        if (other.getDocumentHash() != null
                && other.getDocumentHash().equals(this.getDocumentHash()) == false)
            return false;
        if (other.getDocumentHashType() == null ^ this.getDocumentHashType() == null)
            return false;
        if (other.getDocumentHashType() != null
                && other.getDocumentHashType().equals(this.getDocumentHashType()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null
                && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getNotificationConfig() == null ^ this.getNotificationConfig() == null)
            return false;
        if (other.getNotificationConfig() != null
                && other.getNotificationConfig().equals(this.getNotificationConfig()) == false)
            return false;
        if (other.getOutputS3BucketName() == null ^ this.getOutputS3BucketName() == null)
            return false;
        if (other.getOutputS3BucketName() != null
                && other.getOutputS3BucketName().equals(this.getOutputS3BucketName()) == false)
            return false;
        if (other.getOutputS3KeyPrefix() == null ^ this.getOutputS3KeyPrefix() == null)
            return false;
        if (other.getOutputS3KeyPrefix() != null
                && other.getOutputS3KeyPrefix().equals(this.getOutputS3KeyPrefix()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null
                && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getTimeoutSeconds() == null ^ this.getTimeoutSeconds() == null)
            return false;
        if (other.getTimeoutSeconds() != null
                && other.getTimeoutSeconds().equals(this.getTimeoutSeconds()) == false)
            return false;
        return true;
    }
}
