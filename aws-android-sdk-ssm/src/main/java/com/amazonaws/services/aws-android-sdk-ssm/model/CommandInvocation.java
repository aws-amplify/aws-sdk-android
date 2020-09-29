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
 * <p>An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A command invocation applies to one instance. For example, if a user runs SendCommand against three instances, then a command invocation is created for each requested instance ID. A command invocation returns status and detail information about a command you ran. </p>
 */
public class CommandInvocation implements Serializable {
    /**
     * <p>The command against which this invocation was requested.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     */
    private String commandId;

    /**
     * <p>The instance ID in which this invocation was requested.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     */
    private String instanceId;

    /**
     * <p>The name of the invocation target. For EC2 instances this is the value for the aws:Name tag. For on-premises instances, this is the name of the instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String instanceName;

    /**
     * <p>User-specified information about the command, such as a brief description of what the command should do.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     */
    private String comment;

    /**
     * <p>The document name that was requested for execution.</p>
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
     * <p>The time and date the request was sent to this instance.</p>
     */
    private java.util.Date requestedDateTime;

    /**
     * <p>Whether or not the invocation succeeded, failed, or is pending.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Delayed, Success, Cancelled, TimedOut, Failed, Cancelling
     */
    private String status;

    /**
     * <p>A detailed status of the command execution for each invocation (each instance targeted by the command). StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding command statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:</p> <ul> <li> <p>Pending: The command has not been sent to the instance.</p> </li> <li> <p>In Progress: The command has been sent to the instance but has not reached a terminal state.</p> </li> <li> <p>Success: The execution of the command or plugin was successfully completed. This is a terminal state.</p> </li> <li> <p>Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.</p> </li> <li> <p>Execution Timed Out: Command execution started on the instance, but the execution was not complete before the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.</p> </li> <li> <p>Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.</p> </li> <li> <p>Canceled: The command was terminated before it was completed. This is a terminal state.</p> </li> <li> <p>Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.</p> </li> <li> <p>Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private String statusDetails;

    /**
     * <p> Gets the trace output sent by the agent. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2500<br/>
     */
    private String traceOutput;

    /**
     * <p>The URL to the plugin's StdOut file in Amazon S3, if the S3 bucket was defined for the parent command. For an invocation, StandardOutputUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.</p>
     */
    private String standardOutputUrl;

    /**
     * <p>The URL to the plugin's StdErr file in Amazon S3, if the S3 bucket was defined for the parent command. For an invocation, StandardErrorUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.</p>
     */
    private String standardErrorUrl;

    /**
     * The new value for the commandPlugins property for this object.
     */
    private java.util.List<CommandPlugin> commandPlugins;

    /**
     * <p>The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes on a per instance basis.</p>
     */
    private String serviceRole;

    /**
     * <p>Configurations for sending notifications about command status changes on a per instance basis.</p>
     */
    private NotificationConfig notificationConfig;

    /**
     * <p>CloudWatch Logs information where you want Systems Manager to send the command output.</p>
     */
    private CloudWatchOutputConfig cloudWatchOutputConfig;

    /**
     * <p>The command against which this invocation was requested.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @return <p>The command against which this invocation was requested.</p>
     */
    public String getCommandId() {
        return commandId;
    }

    /**
     * <p>The command against which this invocation was requested.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param commandId <p>The command against which this invocation was requested.</p>
     */
    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * <p>The command against which this invocation was requested.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param commandId <p>The command against which this invocation was requested.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CommandInvocation withCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * <p>The instance ID in which this invocation was requested.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @return <p>The instance ID in which this invocation was requested.</p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>The instance ID in which this invocation was requested.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>The instance ID in which this invocation was requested.</p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>The instance ID in which this invocation was requested.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>The instance ID in which this invocation was requested.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CommandInvocation withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>The name of the invocation target. For EC2 instances this is the value for the aws:Name tag. For on-premises instances, this is the name of the instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>The name of the invocation target. For EC2 instances this is the value for the aws:Name tag. For on-premises instances, this is the name of the instance.</p>
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * <p>The name of the invocation target. For EC2 instances this is the value for the aws:Name tag. For on-premises instances, this is the name of the instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param instanceName <p>The name of the invocation target. For EC2 instances this is the value for the aws:Name tag. For on-premises instances, this is the name of the instance.</p>
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>The name of the invocation target. For EC2 instances this is the value for the aws:Name tag. For on-premises instances, this is the name of the instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param instanceName <p>The name of the invocation target. For EC2 instances this is the value for the aws:Name tag. For on-premises instances, this is the name of the instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CommandInvocation withInstanceName(String instanceName) {
        this.instanceName = instanceName;
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
    public CommandInvocation withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * <p>The document name that was requested for execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>The document name that was requested for execution.</p>
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * <p>The document name that was requested for execution.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param documentName <p>The document name that was requested for execution.</p>
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>The document name that was requested for execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param documentName <p>The document name that was requested for execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CommandInvocation withDocumentName(String documentName) {
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
    public CommandInvocation withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * <p>The time and date the request was sent to this instance.</p>
     *
     * @return <p>The time and date the request was sent to this instance.</p>
     */
    public java.util.Date getRequestedDateTime() {
        return requestedDateTime;
    }

    /**
     * <p>The time and date the request was sent to this instance.</p>
     *
     * @param requestedDateTime <p>The time and date the request was sent to this instance.</p>
     */
    public void setRequestedDateTime(java.util.Date requestedDateTime) {
        this.requestedDateTime = requestedDateTime;
    }

    /**
     * <p>The time and date the request was sent to this instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requestedDateTime <p>The time and date the request was sent to this instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CommandInvocation withRequestedDateTime(java.util.Date requestedDateTime) {
        this.requestedDateTime = requestedDateTime;
        return this;
    }

    /**
     * <p>Whether or not the invocation succeeded, failed, or is pending.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Delayed, Success, Cancelled, TimedOut, Failed, Cancelling
     *
     * @return <p>Whether or not the invocation succeeded, failed, or is pending.</p>
     *
     * @see CommandInvocationStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>Whether or not the invocation succeeded, failed, or is pending.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Delayed, Success, Cancelled, TimedOut, Failed, Cancelling
     *
     * @param status <p>Whether or not the invocation succeeded, failed, or is pending.</p>
     *
     * @see CommandInvocationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>Whether or not the invocation succeeded, failed, or is pending.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Delayed, Success, Cancelled, TimedOut, Failed, Cancelling
     *
     * @param status <p>Whether or not the invocation succeeded, failed, or is pending.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see CommandInvocationStatus
     */
    public CommandInvocation withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>Whether or not the invocation succeeded, failed, or is pending.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Delayed, Success, Cancelled, TimedOut, Failed, Cancelling
     *
     * @param status <p>Whether or not the invocation succeeded, failed, or is pending.</p>
     *
     * @see CommandInvocationStatus
     */
    public void setStatus(CommandInvocationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>Whether or not the invocation succeeded, failed, or is pending.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Delayed, Success, Cancelled, TimedOut, Failed, Cancelling
     *
     * @param status <p>Whether or not the invocation succeeded, failed, or is pending.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see CommandInvocationStatus
     */
    public CommandInvocation withStatus(CommandInvocationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>A detailed status of the command execution for each invocation (each instance targeted by the command). StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding command statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:</p> <ul> <li> <p>Pending: The command has not been sent to the instance.</p> </li> <li> <p>In Progress: The command has been sent to the instance but has not reached a terminal state.</p> </li> <li> <p>Success: The execution of the command or plugin was successfully completed. This is a terminal state.</p> </li> <li> <p>Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.</p> </li> <li> <p>Execution Timed Out: Command execution started on the instance, but the execution was not complete before the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.</p> </li> <li> <p>Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.</p> </li> <li> <p>Canceled: The command was terminated before it was completed. This is a terminal state.</p> </li> <li> <p>Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.</p> </li> <li> <p>Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>A detailed status of the command execution for each invocation (each instance targeted by the command). StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding command statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:</p> <ul> <li> <p>Pending: The command has not been sent to the instance.</p> </li> <li> <p>In Progress: The command has been sent to the instance but has not reached a terminal state.</p> </li> <li> <p>Success: The execution of the command or plugin was successfully completed. This is a terminal state.</p> </li> <li> <p>Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.</p> </li> <li> <p>Execution Timed Out: Command execution started on the instance, but the execution was not complete before the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.</p> </li> <li> <p>Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.</p> </li> <li> <p>Canceled: The command was terminated before it was completed. This is a terminal state.</p> </li> <li> <p>Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.</p> </li> <li> <p>Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.</p> </li> </ul>
     */
    public String getStatusDetails() {
        return statusDetails;
    }

    /**
     * <p>A detailed status of the command execution for each invocation (each instance targeted by the command). StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding command statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:</p> <ul> <li> <p>Pending: The command has not been sent to the instance.</p> </li> <li> <p>In Progress: The command has been sent to the instance but has not reached a terminal state.</p> </li> <li> <p>Success: The execution of the command or plugin was successfully completed. This is a terminal state.</p> </li> <li> <p>Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.</p> </li> <li> <p>Execution Timed Out: Command execution started on the instance, but the execution was not complete before the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.</p> </li> <li> <p>Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.</p> </li> <li> <p>Canceled: The command was terminated before it was completed. This is a terminal state.</p> </li> <li> <p>Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.</p> </li> <li> <p>Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.</p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param statusDetails <p>A detailed status of the command execution for each invocation (each instance targeted by the command). StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding command statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:</p> <ul> <li> <p>Pending: The command has not been sent to the instance.</p> </li> <li> <p>In Progress: The command has been sent to the instance but has not reached a terminal state.</p> </li> <li> <p>Success: The execution of the command or plugin was successfully completed. This is a terminal state.</p> </li> <li> <p>Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.</p> </li> <li> <p>Execution Timed Out: Command execution started on the instance, but the execution was not complete before the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.</p> </li> <li> <p>Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.</p> </li> <li> <p>Canceled: The command was terminated before it was completed. This is a terminal state.</p> </li> <li> <p>Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.</p> </li> <li> <p>Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.</p> </li> </ul>
     */
    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>A detailed status of the command execution for each invocation (each instance targeted by the command). StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding command statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:</p> <ul> <li> <p>Pending: The command has not been sent to the instance.</p> </li> <li> <p>In Progress: The command has been sent to the instance but has not reached a terminal state.</p> </li> <li> <p>Success: The execution of the command or plugin was successfully completed. This is a terminal state.</p> </li> <li> <p>Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.</p> </li> <li> <p>Execution Timed Out: Command execution started on the instance, but the execution was not complete before the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.</p> </li> <li> <p>Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.</p> </li> <li> <p>Canceled: The command was terminated before it was completed. This is a terminal state.</p> </li> <li> <p>Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.</p> </li> <li> <p>Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.</p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param statusDetails <p>A detailed status of the command execution for each invocation (each instance targeted by the command). StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html">Understanding command statuses</a> in the <i>AWS Systems Manager User Guide</i>. StatusDetails can be one of the following values:</p> <ul> <li> <p>Pending: The command has not been sent to the instance.</p> </li> <li> <p>In Progress: The command has been sent to the instance but has not reached a terminal state.</p> </li> <li> <p>Success: The execution of the command or plugin was successfully completed. This is a terminal state.</p> </li> <li> <p>Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.</p> </li> <li> <p>Execution Timed Out: Command execution started on the instance, but the execution was not complete before the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.</p> </li> <li> <p>Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.</p> </li> <li> <p>Canceled: The command was terminated before it was completed. This is a terminal state.</p> </li> <li> <p>Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.</p> </li> <li> <p>Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.</p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CommandInvocation withStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * <p> Gets the trace output sent by the agent. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2500<br/>
     *
     * @return <p> Gets the trace output sent by the agent. </p>
     */
    public String getTraceOutput() {
        return traceOutput;
    }

    /**
     * <p> Gets the trace output sent by the agent. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2500<br/>
     *
     * @param traceOutput <p> Gets the trace output sent by the agent. </p>
     */
    public void setTraceOutput(String traceOutput) {
        this.traceOutput = traceOutput;
    }

    /**
     * <p> Gets the trace output sent by the agent. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2500<br/>
     *
     * @param traceOutput <p> Gets the trace output sent by the agent. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CommandInvocation withTraceOutput(String traceOutput) {
        this.traceOutput = traceOutput;
        return this;
    }

    /**
     * <p>The URL to the plugin's StdOut file in Amazon S3, if the S3 bucket was defined for the parent command. For an invocation, StandardOutputUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.</p>
     *
     * @return <p>The URL to the plugin's StdOut file in Amazon S3, if the S3 bucket was defined for the parent command. For an invocation, StandardOutputUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.</p>
     */
    public String getStandardOutputUrl() {
        return standardOutputUrl;
    }

    /**
     * <p>The URL to the plugin's StdOut file in Amazon S3, if the S3 bucket was defined for the parent command. For an invocation, StandardOutputUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.</p>
     *
     * @param standardOutputUrl <p>The URL to the plugin's StdOut file in Amazon S3, if the S3 bucket was defined for the parent command. For an invocation, StandardOutputUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.</p>
     */
    public void setStandardOutputUrl(String standardOutputUrl) {
        this.standardOutputUrl = standardOutputUrl;
    }

    /**
     * <p>The URL to the plugin's StdOut file in Amazon S3, if the S3 bucket was defined for the parent command. For an invocation, StandardOutputUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param standardOutputUrl <p>The URL to the plugin's StdOut file in Amazon S3, if the S3 bucket was defined for the parent command. For an invocation, StandardOutputUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CommandInvocation withStandardOutputUrl(String standardOutputUrl) {
        this.standardOutputUrl = standardOutputUrl;
        return this;
    }

    /**
     * <p>The URL to the plugin's StdErr file in Amazon S3, if the S3 bucket was defined for the parent command. For an invocation, StandardErrorUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.</p>
     *
     * @return <p>The URL to the plugin's StdErr file in Amazon S3, if the S3 bucket was defined for the parent command. For an invocation, StandardErrorUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.</p>
     */
    public String getStandardErrorUrl() {
        return standardErrorUrl;
    }

    /**
     * <p>The URL to the plugin's StdErr file in Amazon S3, if the S3 bucket was defined for the parent command. For an invocation, StandardErrorUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.</p>
     *
     * @param standardErrorUrl <p>The URL to the plugin's StdErr file in Amazon S3, if the S3 bucket was defined for the parent command. For an invocation, StandardErrorUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.</p>
     */
    public void setStandardErrorUrl(String standardErrorUrl) {
        this.standardErrorUrl = standardErrorUrl;
    }

    /**
     * <p>The URL to the plugin's StdErr file in Amazon S3, if the S3 bucket was defined for the parent command. For an invocation, StandardErrorUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param standardErrorUrl <p>The URL to the plugin's StdErr file in Amazon S3, if the S3 bucket was defined for the parent command. For an invocation, StandardErrorUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CommandInvocation withStandardErrorUrl(String standardErrorUrl) {
        this.standardErrorUrl = standardErrorUrl;
        return this;
    }

    /**
     * Returns the value of the commandPlugins property for this object.
     *
     * @return The value of the commandPlugins property for this object.
     */
    public java.util.List<CommandPlugin> getCommandPlugins() {
        return commandPlugins;
    }

    /**
     * Sets the value of commandPlugins
     *
     * @param commandPlugins The new value for the commandPlugins property for this object.
     */
    public void setCommandPlugins(java.util.Collection<CommandPlugin> commandPlugins) {
        if (commandPlugins == null) {
            this.commandPlugins = null;
            return;
        }

        this.commandPlugins = new java.util.ArrayList<CommandPlugin>(commandPlugins);
    }

    /**
     * Sets the value of the commandPlugins property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param commandPlugins The new value for the commandPlugins property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CommandInvocation withCommandPlugins(CommandPlugin... commandPlugins) {
        if (getCommandPlugins() == null) {
            this.commandPlugins = new java.util.ArrayList<CommandPlugin>(commandPlugins.length);
        }
        for (CommandPlugin value : commandPlugins) {
            this.commandPlugins.add(value);
        }
        return this;
    }

    /**
     * Sets the value of the commandPlugins property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param commandPlugins The new value for the commandPlugins property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CommandInvocation withCommandPlugins(java.util.Collection<CommandPlugin> commandPlugins) {
        setCommandPlugins(commandPlugins);
        return this;
    }

    /**
     * <p>The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes on a per instance basis.</p>
     *
     * @return <p>The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes on a per instance basis.</p>
     */
    public String getServiceRole() {
        return serviceRole;
    }

    /**
     * <p>The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes on a per instance basis.</p>
     *
     * @param serviceRole <p>The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes on a per instance basis.</p>
     */
    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes on a per instance basis.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceRole <p>The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes on a per instance basis.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CommandInvocation withServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * <p>Configurations for sending notifications about command status changes on a per instance basis.</p>
     *
     * @return <p>Configurations for sending notifications about command status changes on a per instance basis.</p>
     */
    public NotificationConfig getNotificationConfig() {
        return notificationConfig;
    }

    /**
     * <p>Configurations for sending notifications about command status changes on a per instance basis.</p>
     *
     * @param notificationConfig <p>Configurations for sending notifications about command status changes on a per instance basis.</p>
     */
    public void setNotificationConfig(NotificationConfig notificationConfig) {
        this.notificationConfig = notificationConfig;
    }

    /**
     * <p>Configurations for sending notifications about command status changes on a per instance basis.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationConfig <p>Configurations for sending notifications about command status changes on a per instance basis.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CommandInvocation withNotificationConfig(NotificationConfig notificationConfig) {
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
    public CommandInvocation withCloudWatchOutputConfig(CloudWatchOutputConfig cloudWatchOutputConfig) {
        this.cloudWatchOutputConfig = cloudWatchOutputConfig;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getInstanceName() != null) sb.append("InstanceName: " + getInstanceName() + ",");
        if (getComment() != null) sb.append("Comment: " + getComment() + ",");
        if (getDocumentName() != null) sb.append("DocumentName: " + getDocumentName() + ",");
        if (getDocumentVersion() != null) sb.append("DocumentVersion: " + getDocumentVersion() + ",");
        if (getRequestedDateTime() != null) sb.append("RequestedDateTime: " + getRequestedDateTime() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getStatusDetails() != null) sb.append("StatusDetails: " + getStatusDetails() + ",");
        if (getTraceOutput() != null) sb.append("TraceOutput: " + getTraceOutput() + ",");
        if (getStandardOutputUrl() != null) sb.append("StandardOutputUrl: " + getStandardOutputUrl() + ",");
        if (getStandardErrorUrl() != null) sb.append("StandardErrorUrl: " + getStandardErrorUrl() + ",");
        if (getCommandPlugins() != null) sb.append("CommandPlugins: " + getCommandPlugins() + ",");
        if (getServiceRole() != null) sb.append("ServiceRole: " + getServiceRole() + ",");
        if (getNotificationConfig() != null) sb.append("NotificationConfig: " + getNotificationConfig() + ",");
        if (getCloudWatchOutputConfig() != null) sb.append("CloudWatchOutputConfig: " + getCloudWatchOutputConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommandId() == null) ? 0 : getCommandId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getRequestedDateTime() == null) ? 0 : getRequestedDateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getTraceOutput() == null) ? 0 : getTraceOutput().hashCode());
        hashCode = prime * hashCode + ((getStandardOutputUrl() == null) ? 0 : getStandardOutputUrl().hashCode());
        hashCode = prime * hashCode + ((getStandardErrorUrl() == null) ? 0 : getStandardErrorUrl().hashCode());
        hashCode = prime * hashCode + ((getCommandPlugins() == null) ? 0 : getCommandPlugins().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getNotificationConfig() == null) ? 0 : getNotificationConfig().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchOutputConfig() == null) ? 0 : getCloudWatchOutputConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CommandInvocation == false) return false;
        CommandInvocation other = (CommandInvocation)obj;

        if (other.getCommandId() == null ^ this.getCommandId() == null) return false;
        if (other.getCommandId() != null && other.getCommandId().equals(this.getCommandId()) == false) return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null) return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false) return false;
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null) return false;
        if (other.getDocumentName() != null && other.getDocumentName().equals(this.getDocumentName()) == false) return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null) return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false) return false;
        if (other.getRequestedDateTime() == null ^ this.getRequestedDateTime() == null) return false;
        if (other.getRequestedDateTime() != null && other.getRequestedDateTime().equals(this.getRequestedDateTime()) == false) return false;
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null) return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false) return false;
        if (other.getTraceOutput() == null ^ this.getTraceOutput() == null) return false;
        if (other.getTraceOutput() != null && other.getTraceOutput().equals(this.getTraceOutput()) == false) return false;
        if (other.getStandardOutputUrl() == null ^ this.getStandardOutputUrl() == null) return false;
        if (other.getStandardOutputUrl() != null && other.getStandardOutputUrl().equals(this.getStandardOutputUrl()) == false) return false;
        if (other.getStandardErrorUrl() == null ^ this.getStandardErrorUrl() == null) return false;
        if (other.getStandardErrorUrl() != null && other.getStandardErrorUrl().equals(this.getStandardErrorUrl()) == false) return false;
        if (other.getCommandPlugins() == null ^ this.getCommandPlugins() == null) return false;
        if (other.getCommandPlugins() != null && other.getCommandPlugins().equals(this.getCommandPlugins()) == false) return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null) return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false) return false;
        if (other.getNotificationConfig() == null ^ this.getNotificationConfig() == null) return false;
        if (other.getNotificationConfig() != null && other.getNotificationConfig().equals(this.getNotificationConfig()) == false) return false;
        if (other.getCloudWatchOutputConfig() == null ^ this.getCloudWatchOutputConfig() == null) return false;
        if (other.getCloudWatchOutputConfig() != null && other.getCloudWatchOutputConfig().equals(this.getCloudWatchOutputConfig()) == false) return false;
        return true;
    }
}
