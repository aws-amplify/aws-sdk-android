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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Runs commands on one or more managed instances.
 * </p>
 */
public class SendCommandRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The instance IDs where the command should run. You can specify a maximum
     * of 50 IDs. If you prefer not to list individual instance IDs, you can
     * instead send commands to a fleet of instances using the Targets
     * parameter, which accepts EC2 tags. For more information about how to use
     * targets, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html"
     * >Using targets and rate controls to send commands to a fleet</a> in the
     * <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private java.util.List<String> instanceIds;

    /**
     * <p>
     * (Optional) An array of search criteria that targets instances using a
     * Key,Value combination that you specify. Targets is required if you don't
     * provide one or more instance IDs in the call. For more information about
     * how to use targets, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html"
     * >Sending commands to a fleet</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     */
    private java.util.List<Target> targets;

    /**
     * <p>
     * Required. The name of the Systems Manager document to run. This can be a
     * public document or a custom document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     */
    private String documentName;

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
     * The Sha256 or Sha1 hash created by the system when the document was
     * created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String documentHash;

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256, Sha1
     */
    private String documentHashType;

    /**
     * <p>
     * If this time is reached and the command has not already started running,
     * it will not run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 2592000<br/>
     */
    private Integer timeoutSeconds;

    /**
     * <p>
     * User-specified information about the command, such as a brief description
     * of what the command should do.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     */
    private String comment;

    /**
     * <p>
     * The required and optional parameters specified in the document being run.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;

    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores
     * it. Instead, Systems Manager automatically determines the Region of the
     * S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     */
    private String outputS3Region;

    /**
     * <p>
     * The name of the S3 bucket where command execution responses should be
     * stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     */
    private String outputS3BucketName;

    /**
     * <p>
     * The directory structure within the S3 bucket where the responses should
     * be stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String outputS3KeyPrefix;

    /**
     * <p>
     * (Optional) The maximum number of instances that are allowed to run the
     * command at the same time. You can specify a number such as 10 or a
     * percentage such as 10%. The default value is 50. For more information
     * about how to use MaxConcurrency, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-velocity"
     * >Using concurrency controls</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     */
    private String maxConcurrency;

    /**
     * <p>
     * The maximum number of errors allowed without the command failing. When
     * the command fails one more time beyond the value of MaxErrors, the
     * systems stops sending the command to additional targets. You can specify
     * a number like 10 or a percentage like 10%. The default value is 0. For
     * more information about how to use MaxErrors, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-maxerrors"
     * >Using error controls</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     */
    private String maxErrors;

    /**
     * <p>
     * The ARN of the IAM service role to use to publish Amazon Simple
     * Notification Service (Amazon SNS) notifications for Run Command commands.
     * </p>
     */
    private String serviceRoleArn;

    /**
     * <p>
     * Configurations for sending notifications.
     * </p>
     */
    private NotificationConfig notificationConfig;

    /**
     * <p>
     * Enables Systems Manager to send Run Command output to Amazon CloudWatch
     * Logs.
     * </p>
     */
    private CloudWatchOutputConfig cloudWatchOutputConfig;

    /**
     * <p>
     * The instance IDs where the command should run. You can specify a maximum
     * of 50 IDs. If you prefer not to list individual instance IDs, you can
     * instead send commands to a fleet of instances using the Targets
     * parameter, which accepts EC2 tags. For more information about how to use
     * targets, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html"
     * >Using targets and rate controls to send commands to a fleet</a> in the
     * <i>AWS Systems Manager User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The instance IDs where the command should run. You can specify a
     *         maximum of 50 IDs. If you prefer not to list individual instance
     *         IDs, you can instead send commands to a fleet of instances using
     *         the Targets parameter, which accepts EC2 tags. For more
     *         information about how to use targets, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html"
     *         >Using targets and rate controls to send commands to a fleet</a>
     *         in the <i>AWS Systems Manager User Guide</i>.
     *         </p>
     */
    public java.util.List<String> getInstanceIds() {
        return instanceIds;
    }

    /**
     * <p>
     * The instance IDs where the command should run. You can specify a maximum
     * of 50 IDs. If you prefer not to list individual instance IDs, you can
     * instead send commands to a fleet of instances using the Targets
     * parameter, which accepts EC2 tags. For more information about how to use
     * targets, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html"
     * >Using targets and rate controls to send commands to a fleet</a> in the
     * <i>AWS Systems Manager User Guide</i>.
     * </p>
     *
     * @param instanceIds <p>
     *            The instance IDs where the command should run. You can specify
     *            a maximum of 50 IDs. If you prefer not to list individual
     *            instance IDs, you can instead send commands to a fleet of
     *            instances using the Targets parameter, which accepts EC2 tags.
     *            For more information about how to use targets, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html"
     *            >Using targets and rate controls to send commands to a
     *            fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new java.util.ArrayList<String>(instanceIds);
    }

    /**
     * <p>
     * The instance IDs where the command should run. You can specify a maximum
     * of 50 IDs. If you prefer not to list individual instance IDs, you can
     * instead send commands to a fleet of instances using the Targets
     * parameter, which accepts EC2 tags. For more information about how to use
     * targets, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html"
     * >Using targets and rate controls to send commands to a fleet</a> in the
     * <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceIds <p>
     *            The instance IDs where the command should run. You can specify
     *            a maximum of 50 IDs. If you prefer not to list individual
     *            instance IDs, you can instead send commands to a fleet of
     *            instances using the Targets parameter, which accepts EC2 tags.
     *            For more information about how to use targets, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html"
     *            >Using targets and rate controls to send commands to a
     *            fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withInstanceIds(String... instanceIds) {
        if (getInstanceIds() == null) {
            this.instanceIds = new java.util.ArrayList<String>(instanceIds.length);
        }
        for (String value : instanceIds) {
            this.instanceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The instance IDs where the command should run. You can specify a maximum
     * of 50 IDs. If you prefer not to list individual instance IDs, you can
     * instead send commands to a fleet of instances using the Targets
     * parameter, which accepts EC2 tags. For more information about how to use
     * targets, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html"
     * >Using targets and rate controls to send commands to a fleet</a> in the
     * <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceIds <p>
     *            The instance IDs where the command should run. You can specify
     *            a maximum of 50 IDs. If you prefer not to list individual
     *            instance IDs, you can instead send commands to a fleet of
     *            instances using the Targets parameter, which accepts EC2 tags.
     *            For more information about how to use targets, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html"
     *            >Using targets and rate controls to send commands to a
     *            fleet</a> in the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * (Optional) An array of search criteria that targets instances using a
     * Key,Value combination that you specify. Targets is required if you don't
     * provide one or more instance IDs in the call. For more information about
     * how to use targets, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html"
     * >Sending commands to a fleet</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         (Optional) An array of search criteria that targets instances
     *         using a Key,Value combination that you specify. Targets is
     *         required if you don't provide one or more instance IDs in the
     *         call. For more information about how to use targets, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html"
     *         >Sending commands to a fleet</a> in the <i>AWS Systems Manager
     *         User Guide</i>.
     *         </p>
     */
    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * (Optional) An array of search criteria that targets instances using a
     * Key,Value combination that you specify. Targets is required if you don't
     * provide one or more instance IDs in the call. For more information about
     * how to use targets, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html"
     * >Sending commands to a fleet</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     *
     * @param targets <p>
     *            (Optional) An array of search criteria that targets instances
     *            using a Key,Value combination that you specify. Targets is
     *            required if you don't provide one or more instance IDs in the
     *            call. For more information about how to use targets, see <a
     *            href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html"
     *            >Sending commands to a fleet</a> in the <i>AWS Systems Manager
     *            User Guide</i>.
     *            </p>
     */
    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<Target>(targets);
    }

    /**
     * <p>
     * (Optional) An array of search criteria that targets instances using a
     * Key,Value combination that you specify. Targets is required if you don't
     * provide one or more instance IDs in the call. For more information about
     * how to use targets, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html"
     * >Sending commands to a fleet</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            (Optional) An array of search criteria that targets instances
     *            using a Key,Value combination that you specify. Targets is
     *            required if you don't provide one or more instance IDs in the
     *            call. For more information about how to use targets, see <a
     *            href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html"
     *            >Sending commands to a fleet</a> in the <i>AWS Systems Manager
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withTargets(Target... targets) {
        if (getTargets() == null) {
            this.targets = new java.util.ArrayList<Target>(targets.length);
        }
        for (Target value : targets) {
            this.targets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Optional) An array of search criteria that targets instances using a
     * Key,Value combination that you specify. Targets is required if you don't
     * provide one or more instance IDs in the call. For more information about
     * how to use targets, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html"
     * >Sending commands to a fleet</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            (Optional) An array of search criteria that targets instances
     *            using a Key,Value combination that you specify. Targets is
     *            required if you don't provide one or more instance IDs in the
     *            call. For more information about how to use targets, see <a
     *            href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html"
     *            >Sending commands to a fleet</a> in the <i>AWS Systems Manager
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * Required. The name of the Systems Manager document to run. This can be a
     * public document or a custom document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @return <p>
     *         Required. The name of the Systems Manager document to run. This
     *         can be a public document or a custom document.
     *         </p>
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * <p>
     * Required. The name of the Systems Manager document to run. This can be a
     * public document or a custom document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param documentName <p>
     *            Required. The name of the Systems Manager document to run.
     *            This can be a public document or a custom document.
     *            </p>
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * Required. The name of the Systems Manager document to run. This can be a
     * public document or a custom document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param documentName <p>
     *            Required. The name of the Systems Manager document to run.
     *            This can be a public document or a custom document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withDocumentName(String documentName) {
        this.documentName = documentName;
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
    public SendCommandRequest withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was
     * created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The Sha256 or Sha1 hash created by the system when the document
     *         was created.
     *         </p>
     *         <note>
     *         <p>
     *         Sha1 hashes have been deprecated.
     *         </p>
     *         </note>
     */
    public String getDocumentHash() {
        return documentHash;
    }

    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was
     * created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param documentHash <p>
     *            The Sha256 or Sha1 hash created by the system when the
     *            document was created.
     *            </p>
     *            <note>
     *            <p>
     *            Sha1 hashes have been deprecated.
     *            </p>
     *            </note>
     */
    public void setDocumentHash(String documentHash) {
        this.documentHash = documentHash;
    }

    /**
     * <p>
     * The Sha256 or Sha1 hash created by the system when the document was
     * created.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param documentHash <p>
     *            The Sha256 or Sha1 hash created by the system when the
     *            document was created.
     *            </p>
     *            <note>
     *            <p>
     *            Sha1 hashes have been deprecated.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withDocumentHash(String documentHash) {
        this.documentHash = documentHash;
        return this;
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256, Sha1
     *
     * @return <p>
     *         Sha256 or Sha1.
     *         </p>
     *         <note>
     *         <p>
     *         Sha1 hashes have been deprecated.
     *         </p>
     *         </note>
     * @see DocumentHashType
     */
    public String getDocumentHashType() {
        return documentHashType;
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256, Sha1
     *
     * @param documentHashType <p>
     *            Sha256 or Sha1.
     *            </p>
     *            <note>
     *            <p>
     *            Sha1 hashes have been deprecated.
     *            </p>
     *            </note>
     * @see DocumentHashType
     */
    public void setDocumentHashType(String documentHashType) {
        this.documentHashType = documentHashType;
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256, Sha1
     *
     * @param documentHashType <p>
     *            Sha256 or Sha1.
     *            </p>
     *            <note>
     *            <p>
     *            Sha1 hashes have been deprecated.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentHashType
     */
    public SendCommandRequest withDocumentHashType(String documentHashType) {
        this.documentHashType = documentHashType;
        return this;
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256, Sha1
     *
     * @param documentHashType <p>
     *            Sha256 or Sha1.
     *            </p>
     *            <note>
     *            <p>
     *            Sha1 hashes have been deprecated.
     *            </p>
     *            </note>
     * @see DocumentHashType
     */
    public void setDocumentHashType(DocumentHashType documentHashType) {
        this.documentHashType = documentHashType.toString();
    }

    /**
     * <p>
     * Sha256 or Sha1.
     * </p>
     * <note>
     * <p>
     * Sha1 hashes have been deprecated.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Sha256, Sha1
     *
     * @param documentHashType <p>
     *            Sha256 or Sha1.
     *            </p>
     *            <note>
     *            <p>
     *            Sha1 hashes have been deprecated.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentHashType
     */
    public SendCommandRequest withDocumentHashType(DocumentHashType documentHashType) {
        this.documentHashType = documentHashType.toString();
        return this;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started running,
     * it will not run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 2592000<br/>
     *
     * @return <p>
     *         If this time is reached and the command has not already started
     *         running, it will not run.
     *         </p>
     */
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started running,
     * it will not run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 2592000<br/>
     *
     * @param timeoutSeconds <p>
     *            If this time is reached and the command has not already
     *            started running, it will not run.
     *            </p>
     */
    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started running,
     * it will not run.
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
     *            started running, it will not run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
     * <p>
     * User-specified information about the command, such as a brief description
     * of what the command should do.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @return <p>
     *         User-specified information about the command, such as a brief
     *         description of what the command should do.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * User-specified information about the command, such as a brief description
     * of what the command should do.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param comment <p>
     *            User-specified information about the command, such as a brief
     *            description of what the command should do.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * User-specified information about the command, such as a brief description
     * of what the command should do.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param comment <p>
     *            User-specified information about the command, such as a brief
     *            description of what the command should do.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * <p>
     * The required and optional parameters specified in the document being run.
     * </p>
     *
     * @return <p>
     *         The required and optional parameters specified in the document
     *         being run.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The required and optional parameters specified in the document being run.
     * </p>
     *
     * @param parameters <p>
     *            The required and optional parameters specified in the document
     *            being run.
     *            </p>
     */
    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The required and optional parameters specified in the document being run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            The required and optional parameters specified in the document
     *            being run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withParameters(
            java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * The required and optional parameters specified in the document being run.
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
    public SendCommandRequest addParametersEntry(String key, java.util.List<String> value) {
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
    public SendCommandRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores
     * it. Instead, Systems Manager automatically determines the Region of the
     * S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     *
     * @return <p>
     *         (Deprecated) You can no longer specify this parameter. The system
     *         ignores it. Instead, Systems Manager automatically determines the
     *         Region of the S3 bucket.
     *         </p>
     */
    public String getOutputS3Region() {
        return outputS3Region;
    }

    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores
     * it. Instead, Systems Manager automatically determines the Region of the
     * S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     *
     * @param outputS3Region <p>
     *            (Deprecated) You can no longer specify this parameter. The
     *            system ignores it. Instead, Systems Manager automatically
     *            determines the Region of the S3 bucket.
     *            </p>
     */
    public void setOutputS3Region(String outputS3Region) {
        this.outputS3Region = outputS3Region;
    }

    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores
     * it. Instead, Systems Manager automatically determines the Region of the
     * S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     *
     * @param outputS3Region <p>
     *            (Deprecated) You can no longer specify this parameter. The
     *            system ignores it. Instead, Systems Manager automatically
     *            determines the Region of the S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withOutputS3Region(String outputS3Region) {
        this.outputS3Region = outputS3Region;
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket where command execution responses should be
     * stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @return <p>
     *         The name of the S3 bucket where command execution responses
     *         should be stored.
     *         </p>
     */
    public String getOutputS3BucketName() {
        return outputS3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket where command execution responses should be
     * stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @param outputS3BucketName <p>
     *            The name of the S3 bucket where command execution responses
     *            should be stored.
     *            </p>
     */
    public void setOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket where command execution responses should be
     * stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @param outputS3BucketName <p>
     *            The name of the S3 bucket where command execution responses
     *            should be stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
        return this;
    }

    /**
     * <p>
     * The directory structure within the S3 bucket where the responses should
     * be stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         The directory structure within the S3 bucket where the responses
     *         should be stored.
     *         </p>
     */
    public String getOutputS3KeyPrefix() {
        return outputS3KeyPrefix;
    }

    /**
     * <p>
     * The directory structure within the S3 bucket where the responses should
     * be stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param outputS3KeyPrefix <p>
     *            The directory structure within the S3 bucket where the
     *            responses should be stored.
     *            </p>
     */
    public void setOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    /**
     * <p>
     * The directory structure within the S3 bucket where the responses should
     * be stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param outputS3KeyPrefix <p>
     *            The directory structure within the S3 bucket where the
     *            responses should be stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
        return this;
    }

    /**
     * <p>
     * (Optional) The maximum number of instances that are allowed to run the
     * command at the same time. You can specify a number such as 10 or a
     * percentage such as 10%. The default value is 50. For more information
     * about how to use MaxConcurrency, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-velocity"
     * >Using concurrency controls</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @return <p>
     *         (Optional) The maximum number of instances that are allowed to
     *         run the command at the same time. You can specify a number such
     *         as 10 or a percentage such as 10%. The default value is 50. For
     *         more information about how to use MaxConcurrency, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-velocity"
     *         >Using concurrency controls</a> in the <i>AWS Systems Manager
     *         User Guide</i>.
     *         </p>
     */
    public String getMaxConcurrency() {
        return maxConcurrency;
    }

    /**
     * <p>
     * (Optional) The maximum number of instances that are allowed to run the
     * command at the same time. You can specify a number such as 10 or a
     * percentage such as 10%. The default value is 50. For more information
     * about how to use MaxConcurrency, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-velocity"
     * >Using concurrency controls</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @param maxConcurrency <p>
     *            (Optional) The maximum number of instances that are allowed to
     *            run the command at the same time. You can specify a number
     *            such as 10 or a percentage such as 10%. The default value is
     *            50. For more information about how to use MaxConcurrency, see
     *            <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-velocity"
     *            >Using concurrency controls</a> in the <i>AWS Systems Manager
     *            User Guide</i>.
     *            </p>
     */
    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * (Optional) The maximum number of instances that are allowed to run the
     * command at the same time. You can specify a number such as 10 or a
     * percentage such as 10%. The default value is 50. For more information
     * about how to use MaxConcurrency, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-velocity"
     * >Using concurrency controls</a> in the <i>AWS Systems Manager User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @param maxConcurrency <p>
     *            (Optional) The maximum number of instances that are allowed to
     *            run the command at the same time. You can specify a number
     *            such as 10 or a percentage such as 10%. The default value is
     *            50. For more information about how to use MaxConcurrency, see
     *            <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-velocity"
     *            >Using concurrency controls</a> in the <i>AWS Systems Manager
     *            User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * <p>
     * The maximum number of errors allowed without the command failing. When
     * the command fails one more time beyond the value of MaxErrors, the
     * systems stops sending the command to additional targets. You can specify
     * a number like 10 or a percentage like 10%. The default value is 0. For
     * more information about how to use MaxErrors, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-maxerrors"
     * >Using error controls</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @return <p>
     *         The maximum number of errors allowed without the command failing.
     *         When the command fails one more time beyond the value of
     *         MaxErrors, the systems stops sending the command to additional
     *         targets. You can specify a number like 10 or a percentage like
     *         10%. The default value is 0. For more information about how to
     *         use MaxErrors, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-maxerrors"
     *         >Using error controls</a> in the <i>AWS Systems Manager User
     *         Guide</i>.
     *         </p>
     */
    public String getMaxErrors() {
        return maxErrors;
    }

    /**
     * <p>
     * The maximum number of errors allowed without the command failing. When
     * the command fails one more time beyond the value of MaxErrors, the
     * systems stops sending the command to additional targets. You can specify
     * a number like 10 or a percentage like 10%. The default value is 0. For
     * more information about how to use MaxErrors, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-maxerrors"
     * >Using error controls</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @param maxErrors <p>
     *            The maximum number of errors allowed without the command
     *            failing. When the command fails one more time beyond the value
     *            of MaxErrors, the systems stops sending the command to
     *            additional targets. You can specify a number like 10 or a
     *            percentage like 10%. The default value is 0. For more
     *            information about how to use MaxErrors, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-maxerrors"
     *            >Using error controls</a> in the <i>AWS Systems Manager User
     *            Guide</i>.
     *            </p>
     */
    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The maximum number of errors allowed without the command failing. When
     * the command fails one more time beyond the value of MaxErrors, the
     * systems stops sending the command to additional targets. You can specify
     * a number like 10 or a percentage like 10%. The default value is 0. For
     * more information about how to use MaxErrors, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-maxerrors"
     * >Using error controls</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @param maxErrors <p>
     *            The maximum number of errors allowed without the command
     *            failing. When the command fails one more time beyond the value
     *            of MaxErrors, the systems stops sending the command to
     *            additional targets. You can specify a number like 10 or a
     *            percentage like 10%. The default value is 0. For more
     *            information about how to use MaxErrors, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-maxerrors"
     *            >Using error controls</a> in the <i>AWS Systems Manager User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM service role to use to publish Amazon Simple
     * Notification Service (Amazon SNS) notifications for Run Command commands.
     * </p>
     *
     * @return <p>
     *         The ARN of the IAM service role to use to publish Amazon Simple
     *         Notification Service (Amazon SNS) notifications for Run Command
     *         commands.
     *         </p>
     */
    public String getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM service role to use to publish Amazon Simple
     * Notification Service (Amazon SNS) notifications for Run Command commands.
     * </p>
     *
     * @param serviceRoleArn <p>
     *            The ARN of the IAM service role to use to publish Amazon
     *            Simple Notification Service (Amazon SNS) notifications for Run
     *            Command commands.
     *            </p>
     */
    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM service role to use to publish Amazon Simple
     * Notification Service (Amazon SNS) notifications for Run Command commands.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceRoleArn <p>
     *            The ARN of the IAM service role to use to publish Amazon
     *            Simple Notification Service (Amazon SNS) notifications for Run
     *            Command commands.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * <p>
     * Configurations for sending notifications.
     * </p>
     *
     * @return <p>
     *         Configurations for sending notifications.
     *         </p>
     */
    public NotificationConfig getNotificationConfig() {
        return notificationConfig;
    }

    /**
     * <p>
     * Configurations for sending notifications.
     * </p>
     *
     * @param notificationConfig <p>
     *            Configurations for sending notifications.
     *            </p>
     */
    public void setNotificationConfig(NotificationConfig notificationConfig) {
        this.notificationConfig = notificationConfig;
    }

    /**
     * <p>
     * Configurations for sending notifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationConfig <p>
     *            Configurations for sending notifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withNotificationConfig(NotificationConfig notificationConfig) {
        this.notificationConfig = notificationConfig;
        return this;
    }

    /**
     * <p>
     * Enables Systems Manager to send Run Command output to Amazon CloudWatch
     * Logs.
     * </p>
     *
     * @return <p>
     *         Enables Systems Manager to send Run Command output to Amazon
     *         CloudWatch Logs.
     *         </p>
     */
    public CloudWatchOutputConfig getCloudWatchOutputConfig() {
        return cloudWatchOutputConfig;
    }

    /**
     * <p>
     * Enables Systems Manager to send Run Command output to Amazon CloudWatch
     * Logs.
     * </p>
     *
     * @param cloudWatchOutputConfig <p>
     *            Enables Systems Manager to send Run Command output to Amazon
     *            CloudWatch Logs.
     *            </p>
     */
    public void setCloudWatchOutputConfig(CloudWatchOutputConfig cloudWatchOutputConfig) {
        this.cloudWatchOutputConfig = cloudWatchOutputConfig;
    }

    /**
     * <p>
     * Enables Systems Manager to send Run Command output to Amazon CloudWatch
     * Logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudWatchOutputConfig <p>
     *            Enables Systems Manager to send Run Command output to Amazon
     *            CloudWatch Logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withCloudWatchOutputConfig(
            CloudWatchOutputConfig cloudWatchOutputConfig) {
        this.cloudWatchOutputConfig = cloudWatchOutputConfig;
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
        if (getInstanceIds() != null)
            sb.append("InstanceIds: " + getInstanceIds() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getDocumentName() != null)
            sb.append("DocumentName: " + getDocumentName() + ",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: " + getDocumentVersion() + ",");
        if (getDocumentHash() != null)
            sb.append("DocumentHash: " + getDocumentHash() + ",");
        if (getDocumentHashType() != null)
            sb.append("DocumentHashType: " + getDocumentHashType() + ",");
        if (getTimeoutSeconds() != null)
            sb.append("TimeoutSeconds: " + getTimeoutSeconds() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getOutputS3Region() != null)
            sb.append("OutputS3Region: " + getOutputS3Region() + ",");
        if (getOutputS3BucketName() != null)
            sb.append("OutputS3BucketName: " + getOutputS3BucketName() + ",");
        if (getOutputS3KeyPrefix() != null)
            sb.append("OutputS3KeyPrefix: " + getOutputS3KeyPrefix() + ",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: " + getMaxConcurrency() + ",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: " + getMaxErrors() + ",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: " + getServiceRoleArn() + ",");
        if (getNotificationConfig() != null)
            sb.append("NotificationConfig: " + getNotificationConfig() + ",");
        if (getCloudWatchOutputConfig() != null)
            sb.append("CloudWatchOutputConfig: " + getCloudWatchOutputConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentHash() == null) ? 0 : getDocumentHash().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentHashType() == null) ? 0 : getDocumentHashType().hashCode());
        hashCode = prime * hashCode
                + ((getTimeoutSeconds() == null) ? 0 : getTimeoutSeconds().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getOutputS3Region() == null) ? 0 : getOutputS3Region().hashCode());
        hashCode = prime * hashCode
                + ((getOutputS3BucketName() == null) ? 0 : getOutputS3BucketName().hashCode());
        hashCode = prime * hashCode
                + ((getOutputS3KeyPrefix() == null) ? 0 : getOutputS3KeyPrefix().hashCode());
        hashCode = prime * hashCode
                + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationConfig() == null) ? 0 : getNotificationConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getCloudWatchOutputConfig() == null) ? 0 : getCloudWatchOutputConfig()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendCommandRequest == false)
            return false;
        SendCommandRequest other = (SendCommandRequest) obj;

        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null
                && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null
                && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null
                && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
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
        if (other.getTimeoutSeconds() == null ^ this.getTimeoutSeconds() == null)
            return false;
        if (other.getTimeoutSeconds() != null
                && other.getTimeoutSeconds().equals(this.getTimeoutSeconds()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getOutputS3Region() == null ^ this.getOutputS3Region() == null)
            return false;
        if (other.getOutputS3Region() != null
                && other.getOutputS3Region().equals(this.getOutputS3Region()) == false)
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
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null
                && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getMaxErrors() == null ^ this.getMaxErrors() == null)
            return false;
        if (other.getMaxErrors() != null
                && other.getMaxErrors().equals(this.getMaxErrors()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null
                && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getNotificationConfig() == null ^ this.getNotificationConfig() == null)
            return false;
        if (other.getNotificationConfig() != null
                && other.getNotificationConfig().equals(this.getNotificationConfig()) == false)
            return false;
        if (other.getCloudWatchOutputConfig() == null ^ this.getCloudWatchOutputConfig() == null)
            return false;
        if (other.getCloudWatchOutputConfig() != null
                && other.getCloudWatchOutputConfig().equals(this.getCloudWatchOutputConfig()) == false)
            return false;
        return true;
    }
}
