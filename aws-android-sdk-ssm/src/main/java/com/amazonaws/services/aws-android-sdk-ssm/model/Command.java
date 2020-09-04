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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>Describes a command request.</p>
 */
public class Command implements Serializable {
    /**
     * <p>A unique identifier for this command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     */
    private String commandId;

    /**
     * <p>The name of the document requested for execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String documentName;

    /**
     * <p>The SSM document version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String documentVersion;

    /**
     * <p>User-specified information about the command, such as a brief description of what the command should do.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     */
    private String comment;

    /**
     * <p>If this time is reached and the command has not already started running, it will not run. Calculated based on the ExpiresAfter user input provided as part of the SendCommand API.</p>
     */
    private java.util.Date expiresAfter;

    /**
     * <p>The parameter values to be inserted in the document when running the command.</p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;

    /**
     * <p>The instance IDs against which this command was requested.</p>
     */
    private java.util.List<String> instanceIds;

    /**
     * <p>An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is required if you don't provide one or more instance IDs in the call.</p>
     */
    private java.util.List<Target> targets;

    /**
     * <p>The date and time the command was requested.</p>
     */
    private java.util.Date requestedDateTime;

    /**
     * <p>The status of the command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Success, Cancelled, Failed, TimedOut, Cancelling
     */
    private String status;

    /**
     * <p>A detailed status of the command execution. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding command statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:</p> <ul> <li> <p>Pending: The command has not been sent to any instances.</p> </li> <li> <p>In Progress: The command has been sent to at least one instance but has not reached a final state on all instances.</p> </li> <li> <p>Success: The command successfully ran on all invocations. This is a terminal state.</p> </li> <li> <p>Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed Out. This is a terminal state.</p> </li> <li> <p>Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed Out. This is a terminal state.</p> </li> <li> <p>Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal state.</p> </li> <li> <p>Incomplete: The command was attempted on all instances and one or more invocations does not have a value of Success but not enough invocations failed for the status to be Failed. This is a terminal state.</p> </li> <li> <p>Canceled: The command was terminated before it was completed. This is a terminal state.</p> </li> <li> <p>Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending invocations. The system has canceled the command before running it on any instance. This is a terminal state.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private String statusDetails;

    /**
     * <p>(Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Region of the S3 bucket.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     */
    private String outputS3Region;

    /**
     * <p>The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     */
    private String outputS3BucketName;

    /**
     * <p>The S3 directory path inside the bucket where the responses to the command executions should be stored. This was requested when issuing the command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String outputS3KeyPrefix;

    /**
     * <p>The maximum number of instances that are allowed to run the command at the same time. You can specify a number of instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For more information about how to use MaxConcurrency, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running commands using Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     */
    private String maxConcurrency;

    /**
     * <p>The maximum number of errors allowed before the system stops sending the command to additional targets. You can specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value is 0. For more information about how to use MaxErrors, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running commands using Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     */
    private String maxErrors;

    /**
     * <p>The number of targets for the command.</p>
     */
    private Integer targetCount;

    /**
     * <p>The number of targets for which the command invocation reached a terminal state. Terminal states include the following: Success, Failed, Execution Timed Out, Delivery Timed Out, Canceled, Terminated, or Undeliverable.</p>
     */
    private Integer completedCount;

    /**
     * <p>The number of targets for which the status is Failed or Execution Timed Out.</p>
     */
    private Integer errorCount;

    /**
     * <p>The number of targets for which the status is Delivery Timed Out.</p>
     */
    private Integer deliveryTimedOutCount;

    /**
     * <p>The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes. </p>
     */
    private String serviceRole;

    /**
     * <p>Configurations for sending notifications about command status changes. </p>
     */
    private NotificationConfig notificationConfig;

    /**
     * <p>CloudWatch Logs information where you want Systems Manager to send the command output.</p>
     */
    private CloudWatchOutputConfig cloudWatchOutputConfig;

    /**
     * <p>The <code>TimeoutSeconds</code> value specified for a command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 2592000<br/>
     */
    private Integer timeoutSeconds;

    /**
     * <p>A unique identifier for this command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @return <p>A unique identifier for this command.</p>
     */
    public String getCommandId() {
        return commandId;
    }

    /**
     * <p>A unique identifier for this command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param commandId <p>A unique identifier for this command.</p>
     */
    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * <p>A unique identifier for this command.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param commandId <p>A unique identifier for this command.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * <p>The name of the document requested for execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>The name of the document requested for execution.</p>
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * <p>The name of the document requested for execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param documentName <p>The name of the document requested for execution.</p>
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>The name of the document requested for execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param documentName <p>The name of the document requested for execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }

    /**
     * <p>The SSM document version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @return <p>The SSM document version.</p>
     */
    public String getDocumentVersion() {
        return documentVersion;
    }

    /**
     * <p>The SSM document version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>The SSM document version.</p>
     */
    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>The SSM document version.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>The SSM document version.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * <p>User-specified information about the command, such as a brief description of what the command should do.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @return <p>User-specified information about the command, such as a brief description of what the command should do.</p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>User-specified information about the command, such as a brief description of what the command should do.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param comment <p>User-specified information about the command, such as a brief description of what the command should do.</p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>User-specified information about the command, such as a brief description of what the command should do.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param comment <p>User-specified information about the command, such as a brief description of what the command should do.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * <p>If this time is reached and the command has not already started running, it will not run. Calculated based on the ExpiresAfter user input provided as part of the SendCommand API.</p>
     *
     * @return <p>If this time is reached and the command has not already started running, it will not run. Calculated based on the ExpiresAfter user input provided as part of the SendCommand API.</p>
     */
    public java.util.Date getExpiresAfter() {
        return expiresAfter;
    }

    /**
     * <p>If this time is reached and the command has not already started running, it will not run. Calculated based on the ExpiresAfter user input provided as part of the SendCommand API.</p>
     *
     * @param expiresAfter <p>If this time is reached and the command has not already started running, it will not run. Calculated based on the ExpiresAfter user input provided as part of the SendCommand API.</p>
     */
    public void setExpiresAfter(java.util.Date expiresAfter) {
        this.expiresAfter = expiresAfter;
    }

    /**
     * <p>If this time is reached and the command has not already started running, it will not run. Calculated based on the ExpiresAfter user input provided as part of the SendCommand API.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expiresAfter <p>If this time is reached and the command has not already started running, it will not run. Calculated based on the ExpiresAfter user input provided as part of the SendCommand API.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withExpiresAfter(java.util.Date expiresAfter) {
        this.expiresAfter = expiresAfter;
        return this;
    }

    /**
     * <p>The parameter values to be inserted in the document when running the command.</p>
     *
     * @return <p>The parameter values to be inserted in the document when running the command.</p>
     */
    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>The parameter values to be inserted in the document when running the command.</p>
     *
     * @param parameters <p>The parameter values to be inserted in the document when running the command.</p>
     */
    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>The parameter values to be inserted in the document when running the command.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters <p>The parameter values to be inserted in the document when running the command.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>The parameter values to be inserted in the document when running the command.</p>
     * <p>
     * The method adds a new key-value pair into Parameters parameter, and returns a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Parameters.
     * @param value The corresponding value of the entry to be added into Parameters.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command addParametersEntry(String key, java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public Command clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>The instance IDs against which this command was requested.</p>
     *
     * @return <p>The instance IDs against which this command was requested.</p>
     */
    public java.util.List<String> getInstanceIds() {
        return instanceIds;
    }

    /**
     * <p>The instance IDs against which this command was requested.</p>
     *
     * @param instanceIds <p>The instance IDs against which this command was requested.</p>
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new java.util.ArrayList<String>(instanceIds);
    }

    /**
     * <p>The instance IDs against which this command was requested.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds <p>The instance IDs against which this command was requested.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withInstanceIds(String... instanceIds) {
        if (getInstanceIds() == null) {
            this.instanceIds = new java.util.ArrayList<String>(instanceIds.length);
        }
        for (String value : instanceIds) {
            this.instanceIds.add(value);
        }
        return this;
    }

    /**
     * <p>The instance IDs against which this command was requested.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds <p>The instance IDs against which this command was requested.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is required if you don't provide one or more instance IDs in the call.</p>
     *
     * @return <p>An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is required if you don't provide one or more instance IDs in the call.</p>
     */
    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is required if you don't provide one or more instance IDs in the call.</p>
     *
     * @param targets <p>An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is required if you don't provide one or more instance IDs in the call.</p>
     */
    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<Target>(targets);
    }

    /**
     * <p>An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is required if you don't provide one or more instance IDs in the call.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targets <p>An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is required if you don't provide one or more instance IDs in the call.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withTargets(Target... targets) {
        if (getTargets() == null) {
            this.targets = new java.util.ArrayList<Target>(targets.length);
        }
        for (Target value : targets) {
            this.targets.add(value);
        }
        return this;
    }

    /**
     * <p>An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is required if you don't provide one or more instance IDs in the call.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targets <p>An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is required if you don't provide one or more instance IDs in the call.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>The date and time the command was requested.</p>
     *
     * @return <p>The date and time the command was requested.</p>
     */
    public java.util.Date getRequestedDateTime() {
        return requestedDateTime;
    }

    /**
     * <p>The date and time the command was requested.</p>
     *
     * @param requestedDateTime <p>The date and time the command was requested.</p>
     */
    public void setRequestedDateTime(java.util.Date requestedDateTime) {
        this.requestedDateTime = requestedDateTime;
    }

    /**
     * <p>The date and time the command was requested.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requestedDateTime <p>The date and time the command was requested.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withRequestedDateTime(java.util.Date requestedDateTime) {
        this.requestedDateTime = requestedDateTime;
        return this;
    }

    /**
     * <p>The status of the command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Success, Cancelled, Failed, TimedOut, Cancelling
     *
     * @return <p>The status of the command.</p>
     *
     * @see CommandStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The status of the command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Success, Cancelled, Failed, TimedOut, Cancelling
     *
     * @param status <p>The status of the command.</p>
     *
     * @see CommandStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The status of the command.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Success, Cancelled, Failed, TimedOut, Cancelling
     *
     * @param status <p>The status of the command.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see CommandStatus
     */
    public Command withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>The status of the command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Success, Cancelled, Failed, TimedOut, Cancelling
     *
     * @param status <p>The status of the command.</p>
     *
     * @see CommandStatus
     */
    public void setStatus(CommandStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>The status of the command.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Success, Cancelled, Failed, TimedOut, Cancelling
     *
     * @param status <p>The status of the command.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see CommandStatus
     */
    public Command withStatus(CommandStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>A detailed status of the command execution. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding command statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:</p> <ul> <li> <p>Pending: The command has not been sent to any instances.</p> </li> <li> <p>In Progress: The command has been sent to at least one instance but has not reached a final state on all instances.</p> </li> <li> <p>Success: The command successfully ran on all invocations. This is a terminal state.</p> </li> <li> <p>Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed Out. This is a terminal state.</p> </li> <li> <p>Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed Out. This is a terminal state.</p> </li> <li> <p>Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal state.</p> </li> <li> <p>Incomplete: The command was attempted on all instances and one or more invocations does not have a value of Success but not enough invocations failed for the status to be Failed. This is a terminal state.</p> </li> <li> <p>Canceled: The command was terminated before it was completed. This is a terminal state.</p> </li> <li> <p>Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending invocations. The system has canceled the command before running it on any instance. This is a terminal state.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>A detailed status of the command execution. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding command statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:</p> <ul> <li> <p>Pending: The command has not been sent to any instances.</p> </li> <li> <p>In Progress: The command has been sent to at least one instance but has not reached a final state on all instances.</p> </li> <li> <p>Success: The command successfully ran on all invocations. This is a terminal state.</p> </li> <li> <p>Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed Out. This is a terminal state.</p> </li> <li> <p>Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed Out. This is a terminal state.</p> </li> <li> <p>Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal state.</p> </li> <li> <p>Incomplete: The command was attempted on all instances and one or more invocations does not have a value of Success but not enough invocations failed for the status to be Failed. This is a terminal state.</p> </li> <li> <p>Canceled: The command was terminated before it was completed. This is a terminal state.</p> </li> <li> <p>Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending invocations. The system has canceled the command before running it on any instance. This is a terminal state.</p> </li> </ul>
     */
    public String getStatusDetails() {
        return statusDetails;
    }

    /**
     * <p>A detailed status of the command execution. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding command statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:</p> <ul> <li> <p>Pending: The command has not been sent to any instances.</p> </li> <li> <p>In Progress: The command has been sent to at least one instance but has not reached a final state on all instances.</p> </li> <li> <p>Success: The command successfully ran on all invocations. This is a terminal state.</p> </li> <li> <p>Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed Out. This is a terminal state.</p> </li> <li> <p>Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed Out. This is a terminal state.</p> </li> <li> <p>Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal state.</p> </li> <li> <p>Incomplete: The command was attempted on all instances and one or more invocations does not have a value of Success but not enough invocations failed for the status to be Failed. This is a terminal state.</p> </li> <li> <p>Canceled: The command was terminated before it was completed. This is a terminal state.</p> </li> <li> <p>Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending invocations. The system has canceled the command before running it on any instance. This is a terminal state.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param statusDetails <p>A detailed status of the command execution. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding command statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:</p> <ul> <li> <p>Pending: The command has not been sent to any instances.</p> </li> <li> <p>In Progress: The command has been sent to at least one instance but has not reached a final state on all instances.</p> </li> <li> <p>Success: The command successfully ran on all invocations. This is a terminal state.</p> </li> <li> <p>Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed Out. This is a terminal state.</p> </li> <li> <p>Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed Out. This is a terminal state.</p> </li> <li> <p>Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal state.</p> </li> <li> <p>Incomplete: The command was attempted on all instances and one or more invocations does not have a value of Success but not enough invocations failed for the status to be Failed. This is a terminal state.</p> </li> <li> <p>Canceled: The command was terminated before it was completed. This is a terminal state.</p> </li> <li> <p>Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending invocations. The system has canceled the command before running it on any instance. This is a terminal state.</p> </li> </ul>
     */
    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>A detailed status of the command execution. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding command statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:</p> <ul> <li> <p>Pending: The command has not been sent to any instances.</p> </li> <li> <p>In Progress: The command has been sent to at least one instance but has not reached a final state on all instances.</p> </li> <li> <p>Success: The command successfully ran on all invocations. This is a terminal state.</p> </li> <li> <p>Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed Out. This is a terminal state.</p> </li> <li> <p>Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed Out. This is a terminal state.</p> </li> <li> <p>Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal state.</p> </li> <li> <p>Incomplete: The command was attempted on all instances and one or more invocations does not have a value of Success but not enough invocations failed for the status to be Failed. This is a terminal state.</p> </li> <li> <p>Canceled: The command was terminated before it was completed. This is a terminal state.</p> </li> <li> <p>Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending invocations. The system has canceled the command before running it on any instance. This is a terminal state.</p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param statusDetails <p>A detailed status of the command execution. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding command statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:</p> <ul> <li> <p>Pending: The command has not been sent to any instances.</p> </li> <li> <p>In Progress: The command has been sent to at least one instance but has not reached a final state on all instances.</p> </li> <li> <p>Success: The command successfully ran on all invocations. This is a terminal state.</p> </li> <li> <p>Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed Out. This is a terminal state.</p> </li> <li> <p>Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed Out. This is a terminal state.</p> </li> <li> <p>Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal state.</p> </li> <li> <p>Incomplete: The command was attempted on all instances and one or more invocations does not have a value of Success but not enough invocations failed for the status to be Failed. This is a terminal state.</p> </li> <li> <p>Canceled: The command was terminated before it was completed. This is a terminal state.</p> </li> <li> <p>Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending invocations. The system has canceled the command before running it on any instance. This is a terminal state.</p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * <p>(Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Region of the S3 bucket.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     *
     * @return <p>(Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Region of the S3 bucket.</p>
     */
    public String getOutputS3Region() {
        return outputS3Region;
    }

    /**
     * <p>(Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Region of the S3 bucket.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     *
     * @param outputS3Region <p>(Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Region of the S3 bucket.</p>
     */
    public void setOutputS3Region(String outputS3Region) {
        this.outputS3Region = outputS3Region;
    }

    /**
     * <p>(Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Region of the S3 bucket.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     *
     * @param outputS3Region <p>(Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Region of the S3 bucket.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withOutputS3Region(String outputS3Region) {
        this.outputS3Region = outputS3Region;
        return this;
    }

    /**
     * <p>The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @return <p>The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the command.</p>
     */
    public String getOutputS3BucketName() {
        return outputS3BucketName;
    }

    /**
     * <p>The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @param outputS3BucketName <p>The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the command.</p>
     */
    public void setOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    /**
     * <p>The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the command.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @param outputS3BucketName <p>The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the command.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
        return this;
    }

    /**
     * <p>The S3 directory path inside the bucket where the responses to the command executions should be stored. This was requested when issuing the command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>The S3 directory path inside the bucket where the responses to the command executions should be stored. This was requested when issuing the command.</p>
     */
    public String getOutputS3KeyPrefix() {
        return outputS3KeyPrefix;
    }

    /**
     * <p>The S3 directory path inside the bucket where the responses to the command executions should be stored. This was requested when issuing the command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param outputS3KeyPrefix <p>The S3 directory path inside the bucket where the responses to the command executions should be stored. This was requested when issuing the command.</p>
     */
    public void setOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    /**
     * <p>The S3 directory path inside the bucket where the responses to the command executions should be stored. This was requested when issuing the command.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param outputS3KeyPrefix <p>The S3 directory path inside the bucket where the responses to the command executions should be stored. This was requested when issuing the command.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
        return this;
    }

    /**
     * <p>The maximum number of instances that are allowed to run the command at the same time. You can specify a number of instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For more information about how to use MaxConcurrency, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running commands using Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @return <p>The maximum number of instances that are allowed to run the command at the same time. You can specify a number of instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For more information about how to use MaxConcurrency, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running commands using Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     */
    public String getMaxConcurrency() {
        return maxConcurrency;
    }

    /**
     * <p>The maximum number of instances that are allowed to run the command at the same time. You can specify a number of instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For more information about how to use MaxConcurrency, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running commands using Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @param maxConcurrency <p>The maximum number of instances that are allowed to run the command at the same time. You can specify a number of instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For more information about how to use MaxConcurrency, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running commands using Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     */
    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>The maximum number of instances that are allowed to run the command at the same time. You can specify a number of instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For more information about how to use MaxConcurrency, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running commands using Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @param maxConcurrency <p>The maximum number of instances that are allowed to run the command at the same time. You can specify a number of instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For more information about how to use MaxConcurrency, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running commands using Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * <p>The maximum number of errors allowed before the system stops sending the command to additional targets. You can specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value is 0. For more information about how to use MaxErrors, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running commands using Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @return <p>The maximum number of errors allowed before the system stops sending the command to additional targets. You can specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value is 0. For more information about how to use MaxErrors, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running commands using Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     */
    public String getMaxErrors() {
        return maxErrors;
    }

    /**
     * <p>The maximum number of errors allowed before the system stops sending the command to additional targets. You can specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value is 0. For more information about how to use MaxErrors, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running commands using Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @param maxErrors <p>The maximum number of errors allowed before the system stops sending the command to additional targets. You can specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value is 0. For more information about how to use MaxErrors, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running commands using Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     */
    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>The maximum number of errors allowed before the system stops sending the command to additional targets. You can specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value is 0. For more information about how to use MaxErrors, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running commands using Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @param maxErrors <p>The maximum number of errors allowed before the system stops sending the command to additional targets. You can specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value is 0. For more information about how to use MaxErrors, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/run-command.html">Running commands using Systems Manager Run Command</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
        return this;
    }

    /**
     * <p>The number of targets for the command.</p>
     *
     * @return <p>The number of targets for the command.</p>
     */
    public Integer getTargetCount() {
        return targetCount;
    }

    /**
     * <p>The number of targets for the command.</p>
     *
     * @param targetCount <p>The number of targets for the command.</p>
     */
    public void setTargetCount(Integer targetCount) {
        this.targetCount = targetCount;
    }

    /**
     * <p>The number of targets for the command.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetCount <p>The number of targets for the command.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withTargetCount(Integer targetCount) {
        this.targetCount = targetCount;
        return this;
    }

    /**
     * <p>The number of targets for which the command invocation reached a terminal state. Terminal states include the following: Success, Failed, Execution Timed Out, Delivery Timed Out, Canceled, Terminated, or Undeliverable.</p>
     *
     * @return <p>The number of targets for which the command invocation reached a terminal state. Terminal states include the following: Success, Failed, Execution Timed Out, Delivery Timed Out, Canceled, Terminated, or Undeliverable.</p>
     */
    public Integer getCompletedCount() {
        return completedCount;
    }

    /**
     * <p>The number of targets for which the command invocation reached a terminal state. Terminal states include the following: Success, Failed, Execution Timed Out, Delivery Timed Out, Canceled, Terminated, or Undeliverable.</p>
     *
     * @param completedCount <p>The number of targets for which the command invocation reached a terminal state. Terminal states include the following: Success, Failed, Execution Timed Out, Delivery Timed Out, Canceled, Terminated, or Undeliverable.</p>
     */
    public void setCompletedCount(Integer completedCount) {
        this.completedCount = completedCount;
    }

    /**
     * <p>The number of targets for which the command invocation reached a terminal state. Terminal states include the following: Success, Failed, Execution Timed Out, Delivery Timed Out, Canceled, Terminated, or Undeliverable.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param completedCount <p>The number of targets for which the command invocation reached a terminal state. Terminal states include the following: Success, Failed, Execution Timed Out, Delivery Timed Out, Canceled, Terminated, or Undeliverable.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withCompletedCount(Integer completedCount) {
        this.completedCount = completedCount;
        return this;
    }

    /**
     * <p>The number of targets for which the status is Failed or Execution Timed Out.</p>
     *
     * @return <p>The number of targets for which the status is Failed or Execution Timed Out.</p>
     */
    public Integer getErrorCount() {
        return errorCount;
    }

    /**
     * <p>The number of targets for which the status is Failed or Execution Timed Out.</p>
     *
     * @param errorCount <p>The number of targets for which the status is Failed or Execution Timed Out.</p>
     */
    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    /**
     * <p>The number of targets for which the status is Failed or Execution Timed Out.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errorCount <p>The number of targets for which the status is Failed or Execution Timed Out.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    /**
     * <p>The number of targets for which the status is Delivery Timed Out.</p>
     *
     * @return <p>The number of targets for which the status is Delivery Timed Out.</p>
     */
    public Integer getDeliveryTimedOutCount() {
        return deliveryTimedOutCount;
    }

    /**
     * <p>The number of targets for which the status is Delivery Timed Out.</p>
     *
     * @param deliveryTimedOutCount <p>The number of targets for which the status is Delivery Timed Out.</p>
     */
    public void setDeliveryTimedOutCount(Integer deliveryTimedOutCount) {
        this.deliveryTimedOutCount = deliveryTimedOutCount;
    }

    /**
     * <p>The number of targets for which the status is Delivery Timed Out.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deliveryTimedOutCount <p>The number of targets for which the status is Delivery Timed Out.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withDeliveryTimedOutCount(Integer deliveryTimedOutCount) {
        this.deliveryTimedOutCount = deliveryTimedOutCount;
        return this;
    }

    /**
     * <p>The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes. </p>
     *
     * @return <p>The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes. </p>
     */
    public String getServiceRole() {
        return serviceRole;
    }

    /**
     * <p>The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes. </p>
     *
     * @param serviceRole <p>The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes. </p>
     */
    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceRole <p>The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * <p>Configurations for sending notifications about command status changes. </p>
     *
     * @return <p>Configurations for sending notifications about command status changes. </p>
     */
    public NotificationConfig getNotificationConfig() {
        return notificationConfig;
    }

    /**
     * <p>Configurations for sending notifications about command status changes. </p>
     *
     * @param notificationConfig <p>Configurations for sending notifications about command status changes. </p>
     */
    public void setNotificationConfig(NotificationConfig notificationConfig) {
        this.notificationConfig = notificationConfig;
    }

    /**
     * <p>Configurations for sending notifications about command status changes. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationConfig <p>Configurations for sending notifications about command status changes. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withNotificationConfig(NotificationConfig notificationConfig) {
        this.notificationConfig = notificationConfig;
        return this;
    }

    /**
     * <p>CloudWatch Logs information where you want Systems Manager to send the command output.</p>
     *
     * @return <p>CloudWatch Logs information where you want Systems Manager to send the command output.</p>
     */
    public CloudWatchOutputConfig getCloudWatchOutputConfig() {
        return cloudWatchOutputConfig;
    }

    /**
     * <p>CloudWatch Logs information where you want Systems Manager to send the command output.</p>
     *
     * @param cloudWatchOutputConfig <p>CloudWatch Logs information where you want Systems Manager to send the command output.</p>
     */
    public void setCloudWatchOutputConfig(CloudWatchOutputConfig cloudWatchOutputConfig) {
        this.cloudWatchOutputConfig = cloudWatchOutputConfig;
    }

    /**
     * <p>CloudWatch Logs information where you want Systems Manager to send the command output.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cloudWatchOutputConfig <p>CloudWatch Logs information where you want Systems Manager to send the command output.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withCloudWatchOutputConfig(CloudWatchOutputConfig cloudWatchOutputConfig) {
        this.cloudWatchOutputConfig = cloudWatchOutputConfig;
        return this;
    }

    /**
     * <p>The <code>TimeoutSeconds</code> value specified for a command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 2592000<br/>
     *
     * @return <p>The <code>TimeoutSeconds</code> value specified for a command.</p>
     */
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * <p>The <code>TimeoutSeconds</code> value specified for a command.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 2592000<br/>
     *
     * @param timeoutSeconds <p>The <code>TimeoutSeconds</code> value specified for a command.</p>
     */
    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * <p>The <code>TimeoutSeconds</code> value specified for a command.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 2592000<br/>
     *
     * @param timeoutSeconds <p>The <code>TimeoutSeconds</code> value specified for a command.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Command withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
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
        if (getCommandId() != null) sb.append("CommandId: " + getCommandId() + ",");
        if (getDocumentName() != null) sb.append("DocumentName: " + getDocumentName() + ",");
        if (getDocumentVersion() != null) sb.append("DocumentVersion: " + getDocumentVersion() + ",");
        if (getComment() != null) sb.append("Comment: " + getComment() + ",");
        if (getExpiresAfter() != null) sb.append("ExpiresAfter: " + getExpiresAfter() + ",");
        if (getParameters() != null) sb.append("Parameters: " + getParameters() + ",");
        if (getInstanceIds() != null) sb.append("InstanceIds: " + getInstanceIds() + ",");
        if (getTargets() != null) sb.append("Targets: " + getTargets() + ",");
        if (getRequestedDateTime() != null) sb.append("RequestedDateTime: " + getRequestedDateTime() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getStatusDetails() != null) sb.append("StatusDetails: " + getStatusDetails() + ",");
        if (getOutputS3Region() != null) sb.append("OutputS3Region: " + getOutputS3Region() + ",");
        if (getOutputS3BucketName() != null) sb.append("OutputS3BucketName: " + getOutputS3BucketName() + ",");
        if (getOutputS3KeyPrefix() != null) sb.append("OutputS3KeyPrefix: " + getOutputS3KeyPrefix() + ",");
        if (getMaxConcurrency() != null) sb.append("MaxConcurrency: " + getMaxConcurrency() + ",");
        if (getMaxErrors() != null) sb.append("MaxErrors: " + getMaxErrors() + ",");
        if (getTargetCount() != null) sb.append("TargetCount: " + getTargetCount() + ",");
        if (getCompletedCount() != null) sb.append("CompletedCount: " + getCompletedCount() + ",");
        if (getErrorCount() != null) sb.append("ErrorCount: " + getErrorCount() + ",");
        if (getDeliveryTimedOutCount() != null) sb.append("DeliveryTimedOutCount: " + getDeliveryTimedOutCount() + ",");
        if (getServiceRole() != null) sb.append("ServiceRole: " + getServiceRole() + ",");
        if (getNotificationConfig() != null) sb.append("NotificationConfig: " + getNotificationConfig() + ",");
        if (getCloudWatchOutputConfig() != null) sb.append("CloudWatchOutputConfig: " + getCloudWatchOutputConfig() + ",");
        if (getTimeoutSeconds() != null) sb.append("TimeoutSeconds: " + getTimeoutSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommandId() == null) ? 0 : getCommandId().hashCode());
        hashCode = prime * hashCode + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getExpiresAfter() == null) ? 0 : getExpiresAfter().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getRequestedDateTime() == null) ? 0 : getRequestedDateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getOutputS3Region() == null) ? 0 : getOutputS3Region().hashCode());
        hashCode = prime * hashCode + ((getOutputS3BucketName() == null) ? 0 : getOutputS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getOutputS3KeyPrefix() == null) ? 0 : getOutputS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getTargetCount() == null) ? 0 : getTargetCount().hashCode());
        hashCode = prime * hashCode + ((getCompletedCount() == null) ? 0 : getCompletedCount().hashCode());
        hashCode = prime * hashCode + ((getErrorCount() == null) ? 0 : getErrorCount().hashCode());
        hashCode = prime * hashCode + ((getDeliveryTimedOutCount() == null) ? 0 : getDeliveryTimedOutCount().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getNotificationConfig() == null) ? 0 : getNotificationConfig().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchOutputConfig() == null) ? 0 : getCloudWatchOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getTimeoutSeconds() == null) ? 0 : getTimeoutSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Command == false) return false;
        Command other = (Command)obj;

        if (other.getCommandId() == null ^ this.getCommandId() == null) return false;
        if (other.getCommandId() != null && other.getCommandId().equals(this.getCommandId()) == false) return false;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null) return false;
        if (other.getDocumentName() != null && other.getDocumentName().equals(this.getDocumentName()) == false) return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null) return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false) return false;
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false;
        if (other.getExpiresAfter() == null ^ this.getExpiresAfter() == null) return false;
        if (other.getExpiresAfter() != null && other.getExpiresAfter().equals(this.getExpiresAfter()) == false) return false;
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null) return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false) return false;
        if (other.getTargets() == null ^ this.getTargets() == null) return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false) return false;
        if (other.getRequestedDateTime() == null ^ this.getRequestedDateTime() == null) return false;
        if (other.getRequestedDateTime() != null && other.getRequestedDateTime().equals(this.getRequestedDateTime()) == false) return false;
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null) return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false) return false;
        if (other.getOutputS3Region() == null ^ this.getOutputS3Region() == null) return false;
        if (other.getOutputS3Region() != null && other.getOutputS3Region().equals(this.getOutputS3Region()) == false) return false;
        if (other.getOutputS3BucketName() == null ^ this.getOutputS3BucketName() == null) return false;
        if (other.getOutputS3BucketName() != null && other.getOutputS3BucketName().equals(this.getOutputS3BucketName()) == false) return false;
        if (other.getOutputS3KeyPrefix() == null ^ this.getOutputS3KeyPrefix() == null) return false;
        if (other.getOutputS3KeyPrefix() != null && other.getOutputS3KeyPrefix().equals(this.getOutputS3KeyPrefix()) == false) return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null) return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false) return false;
        if (other.getMaxErrors() == null ^ this.getMaxErrors() == null) return false;
        if (other.getMaxErrors() != null && other.getMaxErrors().equals(this.getMaxErrors()) == false) return false;
        if (other.getTargetCount() == null ^ this.getTargetCount() == null) return false;
        if (other.getTargetCount() != null && other.getTargetCount().equals(this.getTargetCount()) == false) return false;
        if (other.getCompletedCount() == null ^ this.getCompletedCount() == null) return false;
        if (other.getCompletedCount() != null && other.getCompletedCount().equals(this.getCompletedCount()) == false) return false;
        if (other.getErrorCount() == null ^ this.getErrorCount() == null) return false;
        if (other.getErrorCount() != null && other.getErrorCount().equals(this.getErrorCount()) == false) return false;
        if (other.getDeliveryTimedOutCount() == null ^ this.getDeliveryTimedOutCount() == null) return false;
        if (other.getDeliveryTimedOutCount() != null && other.getDeliveryTimedOutCount().equals(this.getDeliveryTimedOutCount()) == false) return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null) return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false) return false;
        if (other.getNotificationConfig() == null ^ this.getNotificationConfig() == null) return false;
        if (other.getNotificationConfig() != null && other.getNotificationConfig().equals(this.getNotificationConfig()) == false) return false;
        if (other.getCloudWatchOutputConfig() == null ^ this.getCloudWatchOutputConfig() == null) return false;
        if (other.getCloudWatchOutputConfig() != null && other.getCloudWatchOutputConfig().equals(this.getCloudWatchOutputConfig()) == false) return false;
        if (other.getTimeoutSeconds() == null ^ this.getTimeoutSeconds() == null) return false;
        if (other.getTimeoutSeconds() != null && other.getTimeoutSeconds().equals(this.getTimeoutSeconds()) == false) return false;
        return true;
    }
}
