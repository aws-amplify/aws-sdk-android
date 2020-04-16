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
 * Describes plugin details.
 * </p>
 */
public class CommandPlugin implements Serializable {
    /**
     * <p>
     * The name of the plugin. Must be one of the following: aws:updateAgent,
     * aws:domainjoin, aws:applications, aws:runPowerShellScript, aws:psmodule,
     * aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - <br/>
     */
    private String name;

    /**
     * <p>
     * The status of this plugin. You can run a document with multiple plugins.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Success, TimedOut, Cancelled,
     * Failed
     */
    private String status;

    /**
     * <p>
     * A detailed status of the plugin execution. StatusDetails includes more
     * information than Status because it includes states resulting from error
     * and concurrency control parameters. StatusDetails can show different
     * results than Status. For more information about these statuses, see <a
     * href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html"
     * >Understanding Command Statuses</a> in the <i>AWS Systems Manager User
     * Guide</i>. StatusDetails can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The command has not been sent to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: The command has been sent to the instance but has not
     * reached a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Success: The execution of the command or plugin was successfully
     * completed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delivery Timed Out: The command was not delivered to the instance before
     * the delivery timeout expired. Delivery timeouts do not count against the
     * parent command's MaxErrors limit, but they do contribute to whether the
     * parent command status is Success or Incomplete. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Execution Timed Out: Command execution started on the instance, but the
     * execution was not complete before the execution timeout expired.
     * Execution timeouts count against the MaxErrors limit of the parent
     * command. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The command was not successful on the instance. For a plugin,
     * this indicates that the result code was not zero. For a command
     * invocation, this indicates that the result code for one or more plugins
     * was not zero. Invocation failures count against the MaxErrors limit of
     * the parent command. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Canceled: The command was terminated before it was completed. This is a
     * terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Undeliverable: The command can't be delivered to the instance. The
     * instance might not exist, or it might not be responding. Undeliverable
     * invocations don't count against the parent command's MaxErrors limit, and
     * they don't contribute to whether the parent command status is Success or
     * Incomplete. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Terminated: The parent command exceeded its MaxErrors limit and
     * subsequent command invocations were canceled by the system. This is a
     * terminal state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private String statusDetails;

    /**
     * <p>
     * A numeric response code generated after running the plugin.
     * </p>
     */
    private Integer responseCode;

    /**
     * <p>
     * The time the plugin started running.
     * </p>
     */
    private java.util.Date responseStartDateTime;

    /**
     * <p>
     * The time the plugin stopped running. Could stop prematurely if, for
     * example, a cancel command was sent.
     * </p>
     */
    private java.util.Date responseFinishDateTime;

    /**
     * <p>
     * Output of the plugin execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2500<br/>
     */
    private String output;

    /**
     * <p>
     * The URL for the complete text written by the plugin to stdout in Amazon
     * S3. If the Amazon S3 bucket for the command was not specified, then this
     * string is empty.
     * </p>
     */
    private String standardOutputUrl;

    /**
     * <p>
     * The URL for the complete text written by the plugin to stderr. If
     * execution is not yet complete, then this string is empty.
     * </p>
     */
    private String standardErrorUrl;

    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores
     * it. Instead, Systems Manager automatically determines the Amazon S3
     * bucket region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     */
    private String outputS3Region;

    /**
     * <p>
     * The S3 bucket where the responses to the command executions should be
     * stored. This was requested when issuing the command. For example, in the
     * following response:
     * </p>
     * <p>
     * test_folder/ab19cb99-a030-46dd-9dfc-
     * 8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     * </p>
     * <p>
     * test_folder is the name of the Amazon S3 bucket;
     * </p>
     * <p>
     * ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     * </p>
     * <p>
     * i-1234567876543 is the instance ID;
     * </p>
     * <p>
     * awsrunShellScript is the name of the plugin.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     */
    private String outputS3BucketName;

    /**
     * <p>
     * The S3 directory path inside the bucket where the responses to the
     * command executions should be stored. This was requested when issuing the
     * command. For example, in the following response:
     * </p>
     * <p>
     * test_folder/ab19cb99-a030-46dd-9dfc-
     * 8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     * </p>
     * <p>
     * test_folder is the name of the Amazon S3 bucket;
     * </p>
     * <p>
     * ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     * </p>
     * <p>
     * i-1234567876543 is the instance ID;
     * </p>
     * <p>
     * awsrunShellScript is the name of the plugin.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String outputS3KeyPrefix;

    /**
     * <p>
     * The name of the plugin. Must be one of the following: aws:updateAgent,
     * aws:domainjoin, aws:applications, aws:runPowerShellScript, aws:psmodule,
     * aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - <br/>
     *
     * @return <p>
     *         The name of the plugin. Must be one of the following:
     *         aws:updateAgent, aws:domainjoin, aws:applications,
     *         aws:runPowerShellScript, aws:psmodule, aws:cloudWatch,
     *         aws:runShellScript, or aws:updateSSMAgent.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the plugin. Must be one of the following: aws:updateAgent,
     * aws:domainjoin, aws:applications, aws:runPowerShellScript, aws:psmodule,
     * aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - <br/>
     *
     * @param name <p>
     *            The name of the plugin. Must be one of the following:
     *            aws:updateAgent, aws:domainjoin, aws:applications,
     *            aws:runPowerShellScript, aws:psmodule, aws:cloudWatch,
     *            aws:runShellScript, or aws:updateSSMAgent.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the plugin. Must be one of the following: aws:updateAgent,
     * aws:domainjoin, aws:applications, aws:runPowerShellScript, aws:psmodule,
     * aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - <br/>
     *
     * @param name <p>
     *            The name of the plugin. Must be one of the following:
     *            aws:updateAgent, aws:domainjoin, aws:applications,
     *            aws:runPowerShellScript, aws:psmodule, aws:cloudWatch,
     *            aws:runShellScript, or aws:updateSSMAgent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommandPlugin withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The status of this plugin. You can run a document with multiple plugins.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Success, TimedOut, Cancelled,
     * Failed
     *
     * @return <p>
     *         The status of this plugin. You can run a document with multiple
     *         plugins.
     *         </p>
     * @see CommandPluginStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of this plugin. You can run a document with multiple plugins.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Success, TimedOut, Cancelled,
     * Failed
     *
     * @param status <p>
     *            The status of this plugin. You can run a document with
     *            multiple plugins.
     *            </p>
     * @see CommandPluginStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this plugin. You can run a document with multiple plugins.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Success, TimedOut, Cancelled,
     * Failed
     *
     * @param status <p>
     *            The status of this plugin. You can run a document with
     *            multiple plugins.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CommandPluginStatus
     */
    public CommandPlugin withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of this plugin. You can run a document with multiple plugins.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Success, TimedOut, Cancelled,
     * Failed
     *
     * @param status <p>
     *            The status of this plugin. You can run a document with
     *            multiple plugins.
     *            </p>
     * @see CommandPluginStatus
     */
    public void setStatus(CommandPluginStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of this plugin. You can run a document with multiple plugins.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Success, TimedOut, Cancelled,
     * Failed
     *
     * @param status <p>
     *            The status of this plugin. You can run a document with
     *            multiple plugins.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CommandPluginStatus
     */
    public CommandPlugin withStatus(CommandPluginStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A detailed status of the plugin execution. StatusDetails includes more
     * information than Status because it includes states resulting from error
     * and concurrency control parameters. StatusDetails can show different
     * results than Status. For more information about these statuses, see <a
     * href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html"
     * >Understanding Command Statuses</a> in the <i>AWS Systems Manager User
     * Guide</i>. StatusDetails can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The command has not been sent to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: The command has been sent to the instance but has not
     * reached a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Success: The execution of the command or plugin was successfully
     * completed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delivery Timed Out: The command was not delivered to the instance before
     * the delivery timeout expired. Delivery timeouts do not count against the
     * parent command's MaxErrors limit, but they do contribute to whether the
     * parent command status is Success or Incomplete. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Execution Timed Out: Command execution started on the instance, but the
     * execution was not complete before the execution timeout expired.
     * Execution timeouts count against the MaxErrors limit of the parent
     * command. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The command was not successful on the instance. For a plugin,
     * this indicates that the result code was not zero. For a command
     * invocation, this indicates that the result code for one or more plugins
     * was not zero. Invocation failures count against the MaxErrors limit of
     * the parent command. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Canceled: The command was terminated before it was completed. This is a
     * terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Undeliverable: The command can't be delivered to the instance. The
     * instance might not exist, or it might not be responding. Undeliverable
     * invocations don't count against the parent command's MaxErrors limit, and
     * they don't contribute to whether the parent command status is Success or
     * Incomplete. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Terminated: The parent command exceeded its MaxErrors limit and
     * subsequent command invocations were canceled by the system. This is a
     * terminal state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         A detailed status of the plugin execution. StatusDetails includes
     *         more information than Status because it includes states resulting
     *         from error and concurrency control parameters. StatusDetails can
     *         show different results than Status. For more information about
     *         these statuses, see <a href=
     *         "http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html"
     *         >Understanding Command Statuses</a> in the <i>AWS Systems Manager
     *         User Guide</i>. StatusDetails can be one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Pending: The command has not been sent to the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In Progress: The command has been sent to the instance but has
     *         not reached a terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Success: The execution of the command or plugin was successfully
     *         completed. This is a terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Delivery Timed Out: The command was not delivered to the instance
     *         before the delivery timeout expired. Delivery timeouts do not
     *         count against the parent command's MaxErrors limit, but they do
     *         contribute to whether the parent command status is Success or
     *         Incomplete. This is a terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Execution Timed Out: Command execution started on the instance,
     *         but the execution was not complete before the execution timeout
     *         expired. Execution timeouts count against the MaxErrors limit of
     *         the parent command. This is a terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed: The command was not successful on the instance. For a
     *         plugin, this indicates that the result code was not zero. For a
     *         command invocation, this indicates that the result code for one
     *         or more plugins was not zero. Invocation failures count against
     *         the MaxErrors limit of the parent command. This is a terminal
     *         state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Canceled: The command was terminated before it was completed.
     *         This is a terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Undeliverable: The command can't be delivered to the instance.
     *         The instance might not exist, or it might not be responding.
     *         Undeliverable invocations don't count against the parent
     *         command's MaxErrors limit, and they don't contribute to whether
     *         the parent command status is Success or Incomplete. This is a
     *         terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Terminated: The parent command exceeded its MaxErrors limit and
     *         subsequent command invocations were canceled by the system. This
     *         is a terminal state.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatusDetails() {
        return statusDetails;
    }

    /**
     * <p>
     * A detailed status of the plugin execution. StatusDetails includes more
     * information than Status because it includes states resulting from error
     * and concurrency control parameters. StatusDetails can show different
     * results than Status. For more information about these statuses, see <a
     * href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html"
     * >Understanding Command Statuses</a> in the <i>AWS Systems Manager User
     * Guide</i>. StatusDetails can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The command has not been sent to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: The command has been sent to the instance but has not
     * reached a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Success: The execution of the command or plugin was successfully
     * completed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delivery Timed Out: The command was not delivered to the instance before
     * the delivery timeout expired. Delivery timeouts do not count against the
     * parent command's MaxErrors limit, but they do contribute to whether the
     * parent command status is Success or Incomplete. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Execution Timed Out: Command execution started on the instance, but the
     * execution was not complete before the execution timeout expired.
     * Execution timeouts count against the MaxErrors limit of the parent
     * command. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The command was not successful on the instance. For a plugin,
     * this indicates that the result code was not zero. For a command
     * invocation, this indicates that the result code for one or more plugins
     * was not zero. Invocation failures count against the MaxErrors limit of
     * the parent command. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Canceled: The command was terminated before it was completed. This is a
     * terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Undeliverable: The command can't be delivered to the instance. The
     * instance might not exist, or it might not be responding. Undeliverable
     * invocations don't count against the parent command's MaxErrors limit, and
     * they don't contribute to whether the parent command status is Success or
     * Incomplete. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Terminated: The parent command exceeded its MaxErrors limit and
     * subsequent command invocations were canceled by the system. This is a
     * terminal state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param statusDetails <p>
     *            A detailed status of the plugin execution. StatusDetails
     *            includes more information than Status because it includes
     *            states resulting from error and concurrency control
     *            parameters. StatusDetails can show different results than
     *            Status. For more information about these statuses, see <a
     *            href=
     *            "http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html"
     *            >Understanding Command Statuses</a> in the <i>AWS Systems
     *            Manager User Guide</i>. StatusDetails can be one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending: The command has not been sent to the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In Progress: The command has been sent to the instance but has
     *            not reached a terminal state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Success: The execution of the command or plugin was
     *            successfully completed. This is a terminal state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Delivery Timed Out: The command was not delivered to the
     *            instance before the delivery timeout expired. Delivery
     *            timeouts do not count against the parent command's MaxErrors
     *            limit, but they do contribute to whether the parent command
     *            status is Success or Incomplete. This is a terminal state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Execution Timed Out: Command execution started on the
     *            instance, but the execution was not complete before the
     *            execution timeout expired. Execution timeouts count against
     *            the MaxErrors limit of the parent command. This is a terminal
     *            state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Failed: The command was not successful on the instance. For a
     *            plugin, this indicates that the result code was not zero. For
     *            a command invocation, this indicates that the result code for
     *            one or more plugins was not zero. Invocation failures count
     *            against the MaxErrors limit of the parent command. This is a
     *            terminal state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Canceled: The command was terminated before it was completed.
     *            This is a terminal state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Undeliverable: The command can't be delivered to the instance.
     *            The instance might not exist, or it might not be responding.
     *            Undeliverable invocations don't count against the parent
     *            command's MaxErrors limit, and they don't contribute to
     *            whether the parent command status is Success or Incomplete.
     *            This is a terminal state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Terminated: The parent command exceeded its MaxErrors limit
     *            and subsequent command invocations were canceled by the
     *            system. This is a terminal state.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * A detailed status of the plugin execution. StatusDetails includes more
     * information than Status because it includes states resulting from error
     * and concurrency control parameters. StatusDetails can show different
     * results than Status. For more information about these statuses, see <a
     * href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html"
     * >Understanding Command Statuses</a> in the <i>AWS Systems Manager User
     * Guide</i>. StatusDetails can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending: The command has not been sent to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Progress: The command has been sent to the instance but has not
     * reached a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Success: The execution of the command or plugin was successfully
     * completed. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delivery Timed Out: The command was not delivered to the instance before
     * the delivery timeout expired. Delivery timeouts do not count against the
     * parent command's MaxErrors limit, but they do contribute to whether the
     * parent command status is Success or Incomplete. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Execution Timed Out: Command execution started on the instance, but the
     * execution was not complete before the execution timeout expired.
     * Execution timeouts count against the MaxErrors limit of the parent
     * command. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The command was not successful on the instance. For a plugin,
     * this indicates that the result code was not zero. For a command
     * invocation, this indicates that the result code for one or more plugins
     * was not zero. Invocation failures count against the MaxErrors limit of
     * the parent command. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Canceled: The command was terminated before it was completed. This is a
     * terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Undeliverable: The command can't be delivered to the instance. The
     * instance might not exist, or it might not be responding. Undeliverable
     * invocations don't count against the parent command's MaxErrors limit, and
     * they don't contribute to whether the parent command status is Success or
     * Incomplete. This is a terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Terminated: The parent command exceeded its MaxErrors limit and
     * subsequent command invocations were canceled by the system. This is a
     * terminal state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param statusDetails <p>
     *            A detailed status of the plugin execution. StatusDetails
     *            includes more information than Status because it includes
     *            states resulting from error and concurrency control
     *            parameters. StatusDetails can show different results than
     *            Status. For more information about these statuses, see <a
     *            href=
     *            "http://docs.aws.amazon.com/systems-manager/latest/userguide/monitor-commands.html"
     *            >Understanding Command Statuses</a> in the <i>AWS Systems
     *            Manager User Guide</i>. StatusDetails can be one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Pending: The command has not been sent to the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In Progress: The command has been sent to the instance but has
     *            not reached a terminal state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Success: The execution of the command or plugin was
     *            successfully completed. This is a terminal state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Delivery Timed Out: The command was not delivered to the
     *            instance before the delivery timeout expired. Delivery
     *            timeouts do not count against the parent command's MaxErrors
     *            limit, but they do contribute to whether the parent command
     *            status is Success or Incomplete. This is a terminal state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Execution Timed Out: Command execution started on the
     *            instance, but the execution was not complete before the
     *            execution timeout expired. Execution timeouts count against
     *            the MaxErrors limit of the parent command. This is a terminal
     *            state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Failed: The command was not successful on the instance. For a
     *            plugin, this indicates that the result code was not zero. For
     *            a command invocation, this indicates that the result code for
     *            one or more plugins was not zero. Invocation failures count
     *            against the MaxErrors limit of the parent command. This is a
     *            terminal state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Canceled: The command was terminated before it was completed.
     *            This is a terminal state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Undeliverable: The command can't be delivered to the instance.
     *            The instance might not exist, or it might not be responding.
     *            Undeliverable invocations don't count against the parent
     *            command's MaxErrors limit, and they don't contribute to
     *            whether the parent command status is Success or Incomplete.
     *            This is a terminal state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Terminated: The parent command exceeded its MaxErrors limit
     *            and subsequent command invocations were canceled by the
     *            system. This is a terminal state.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommandPlugin withStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * <p>
     * A numeric response code generated after running the plugin.
     * </p>
     *
     * @return <p>
     *         A numeric response code generated after running the plugin.
     *         </p>
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * <p>
     * A numeric response code generated after running the plugin.
     * </p>
     *
     * @param responseCode <p>
     *            A numeric response code generated after running the plugin.
     *            </p>
     */
    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * <p>
     * A numeric response code generated after running the plugin.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseCode <p>
     *            A numeric response code generated after running the plugin.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommandPlugin withResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * <p>
     * The time the plugin started running.
     * </p>
     *
     * @return <p>
     *         The time the plugin started running.
     *         </p>
     */
    public java.util.Date getResponseStartDateTime() {
        return responseStartDateTime;
    }

    /**
     * <p>
     * The time the plugin started running.
     * </p>
     *
     * @param responseStartDateTime <p>
     *            The time the plugin started running.
     *            </p>
     */
    public void setResponseStartDateTime(java.util.Date responseStartDateTime) {
        this.responseStartDateTime = responseStartDateTime;
    }

    /**
     * <p>
     * The time the plugin started running.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseStartDateTime <p>
     *            The time the plugin started running.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommandPlugin withResponseStartDateTime(java.util.Date responseStartDateTime) {
        this.responseStartDateTime = responseStartDateTime;
        return this;
    }

    /**
     * <p>
     * The time the plugin stopped running. Could stop prematurely if, for
     * example, a cancel command was sent.
     * </p>
     *
     * @return <p>
     *         The time the plugin stopped running. Could stop prematurely if,
     *         for example, a cancel command was sent.
     *         </p>
     */
    public java.util.Date getResponseFinishDateTime() {
        return responseFinishDateTime;
    }

    /**
     * <p>
     * The time the plugin stopped running. Could stop prematurely if, for
     * example, a cancel command was sent.
     * </p>
     *
     * @param responseFinishDateTime <p>
     *            The time the plugin stopped running. Could stop prematurely
     *            if, for example, a cancel command was sent.
     *            </p>
     */
    public void setResponseFinishDateTime(java.util.Date responseFinishDateTime) {
        this.responseFinishDateTime = responseFinishDateTime;
    }

    /**
     * <p>
     * The time the plugin stopped running. Could stop prematurely if, for
     * example, a cancel command was sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseFinishDateTime <p>
     *            The time the plugin stopped running. Could stop prematurely
     *            if, for example, a cancel command was sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommandPlugin withResponseFinishDateTime(java.util.Date responseFinishDateTime) {
        this.responseFinishDateTime = responseFinishDateTime;
        return this;
    }

    /**
     * <p>
     * Output of the plugin execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2500<br/>
     *
     * @return <p>
     *         Output of the plugin execution.
     *         </p>
     */
    public String getOutput() {
        return output;
    }

    /**
     * <p>
     * Output of the plugin execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2500<br/>
     *
     * @param output <p>
     *            Output of the plugin execution.
     *            </p>
     */
    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * <p>
     * Output of the plugin execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2500<br/>
     *
     * @param output <p>
     *            Output of the plugin execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommandPlugin withOutput(String output) {
        this.output = output;
        return this;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stdout in Amazon
     * S3. If the Amazon S3 bucket for the command was not specified, then this
     * string is empty.
     * </p>
     *
     * @return <p>
     *         The URL for the complete text written by the plugin to stdout in
     *         Amazon S3. If the Amazon S3 bucket for the command was not
     *         specified, then this string is empty.
     *         </p>
     */
    public String getStandardOutputUrl() {
        return standardOutputUrl;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stdout in Amazon
     * S3. If the Amazon S3 bucket for the command was not specified, then this
     * string is empty.
     * </p>
     *
     * @param standardOutputUrl <p>
     *            The URL for the complete text written by the plugin to stdout
     *            in Amazon S3. If the Amazon S3 bucket for the command was not
     *            specified, then this string is empty.
     *            </p>
     */
    public void setStandardOutputUrl(String standardOutputUrl) {
        this.standardOutputUrl = standardOutputUrl;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stdout in Amazon
     * S3. If the Amazon S3 bucket for the command was not specified, then this
     * string is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param standardOutputUrl <p>
     *            The URL for the complete text written by the plugin to stdout
     *            in Amazon S3. If the Amazon S3 bucket for the command was not
     *            specified, then this string is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommandPlugin withStandardOutputUrl(String standardOutputUrl) {
        this.standardOutputUrl = standardOutputUrl;
        return this;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stderr. If
     * execution is not yet complete, then this string is empty.
     * </p>
     *
     * @return <p>
     *         The URL for the complete text written by the plugin to stderr. If
     *         execution is not yet complete, then this string is empty.
     *         </p>
     */
    public String getStandardErrorUrl() {
        return standardErrorUrl;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stderr. If
     * execution is not yet complete, then this string is empty.
     * </p>
     *
     * @param standardErrorUrl <p>
     *            The URL for the complete text written by the plugin to stderr.
     *            If execution is not yet complete, then this string is empty.
     *            </p>
     */
    public void setStandardErrorUrl(String standardErrorUrl) {
        this.standardErrorUrl = standardErrorUrl;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stderr. If
     * execution is not yet complete, then this string is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param standardErrorUrl <p>
     *            The URL for the complete text written by the plugin to stderr.
     *            If execution is not yet complete, then this string is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommandPlugin withStandardErrorUrl(String standardErrorUrl) {
        this.standardErrorUrl = standardErrorUrl;
        return this;
    }

    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores
     * it. Instead, Systems Manager automatically determines the Amazon S3
     * bucket region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     *
     * @return <p>
     *         (Deprecated) You can no longer specify this parameter. The system
     *         ignores it. Instead, Systems Manager automatically determines the
     *         Amazon S3 bucket region.
     *         </p>
     */
    public String getOutputS3Region() {
        return outputS3Region;
    }

    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores
     * it. Instead, Systems Manager automatically determines the Amazon S3
     * bucket region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     *
     * @param outputS3Region <p>
     *            (Deprecated) You can no longer specify this parameter. The
     *            system ignores it. Instead, Systems Manager automatically
     *            determines the Amazon S3 bucket region.
     *            </p>
     */
    public void setOutputS3Region(String outputS3Region) {
        this.outputS3Region = outputS3Region;
    }

    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores
     * it. Instead, Systems Manager automatically determines the Amazon S3
     * bucket region.
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
     *            determines the Amazon S3 bucket region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommandPlugin withOutputS3Region(String outputS3Region) {
        this.outputS3Region = outputS3Region;
        return this;
    }

    /**
     * <p>
     * The S3 bucket where the responses to the command executions should be
     * stored. This was requested when issuing the command. For example, in the
     * following response:
     * </p>
     * <p>
     * test_folder/ab19cb99-a030-46dd-9dfc-
     * 8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     * </p>
     * <p>
     * test_folder is the name of the Amazon S3 bucket;
     * </p>
     * <p>
     * ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     * </p>
     * <p>
     * i-1234567876543 is the instance ID;
     * </p>
     * <p>
     * awsrunShellScript is the name of the plugin.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @return <p>
     *         The S3 bucket where the responses to the command executions
     *         should be stored. This was requested when issuing the command.
     *         For example, in the following response:
     *         </p>
     *         <p>
     *         test_folder/ab19cb99-a030-46dd-9dfc-
     *         8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     *         </p>
     *         <p>
     *         test_folder is the name of the Amazon S3 bucket;
     *         </p>
     *         <p>
     *         ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3
     *         prefix;
     *         </p>
     *         <p>
     *         i-1234567876543 is the instance ID;
     *         </p>
     *         <p>
     *         awsrunShellScript is the name of the plugin.
     *         </p>
     */
    public String getOutputS3BucketName() {
        return outputS3BucketName;
    }

    /**
     * <p>
     * The S3 bucket where the responses to the command executions should be
     * stored. This was requested when issuing the command. For example, in the
     * following response:
     * </p>
     * <p>
     * test_folder/ab19cb99-a030-46dd-9dfc-
     * 8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     * </p>
     * <p>
     * test_folder is the name of the Amazon S3 bucket;
     * </p>
     * <p>
     * ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     * </p>
     * <p>
     * i-1234567876543 is the instance ID;
     * </p>
     * <p>
     * awsrunShellScript is the name of the plugin.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @param outputS3BucketName <p>
     *            The S3 bucket where the responses to the command executions
     *            should be stored. This was requested when issuing the command.
     *            For example, in the following response:
     *            </p>
     *            <p>
     *            test_folder/ab19cb99-a030-46dd-9dfc-
     *            8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     *            </p>
     *            <p>
     *            test_folder is the name of the Amazon S3 bucket;
     *            </p>
     *            <p>
     *            ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3
     *            prefix;
     *            </p>
     *            <p>
     *            i-1234567876543 is the instance ID;
     *            </p>
     *            <p>
     *            awsrunShellScript is the name of the plugin.
     *            </p>
     */
    public void setOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    /**
     * <p>
     * The S3 bucket where the responses to the command executions should be
     * stored. This was requested when issuing the command. For example, in the
     * following response:
     * </p>
     * <p>
     * test_folder/ab19cb99-a030-46dd-9dfc-
     * 8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     * </p>
     * <p>
     * test_folder is the name of the Amazon S3 bucket;
     * </p>
     * <p>
     * ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     * </p>
     * <p>
     * i-1234567876543 is the instance ID;
     * </p>
     * <p>
     * awsrunShellScript is the name of the plugin.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @param outputS3BucketName <p>
     *            The S3 bucket where the responses to the command executions
     *            should be stored. This was requested when issuing the command.
     *            For example, in the following response:
     *            </p>
     *            <p>
     *            test_folder/ab19cb99-a030-46dd-9dfc-
     *            8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     *            </p>
     *            <p>
     *            test_folder is the name of the Amazon S3 bucket;
     *            </p>
     *            <p>
     *            ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3
     *            prefix;
     *            </p>
     *            <p>
     *            i-1234567876543 is the instance ID;
     *            </p>
     *            <p>
     *            awsrunShellScript is the name of the plugin.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommandPlugin withOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
        return this;
    }

    /**
     * <p>
     * The S3 directory path inside the bucket where the responses to the
     * command executions should be stored. This was requested when issuing the
     * command. For example, in the following response:
     * </p>
     * <p>
     * test_folder/ab19cb99-a030-46dd-9dfc-
     * 8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     * </p>
     * <p>
     * test_folder is the name of the Amazon S3 bucket;
     * </p>
     * <p>
     * ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     * </p>
     * <p>
     * i-1234567876543 is the instance ID;
     * </p>
     * <p>
     * awsrunShellScript is the name of the plugin.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         The S3 directory path inside the bucket where the responses to
     *         the command executions should be stored. This was requested when
     *         issuing the command. For example, in the following response:
     *         </p>
     *         <p>
     *         test_folder/ab19cb99-a030-46dd-9dfc-
     *         8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     *         </p>
     *         <p>
     *         test_folder is the name of the Amazon S3 bucket;
     *         </p>
     *         <p>
     *         ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3
     *         prefix;
     *         </p>
     *         <p>
     *         i-1234567876543 is the instance ID;
     *         </p>
     *         <p>
     *         awsrunShellScript is the name of the plugin.
     *         </p>
     */
    public String getOutputS3KeyPrefix() {
        return outputS3KeyPrefix;
    }

    /**
     * <p>
     * The S3 directory path inside the bucket where the responses to the
     * command executions should be stored. This was requested when issuing the
     * command. For example, in the following response:
     * </p>
     * <p>
     * test_folder/ab19cb99-a030-46dd-9dfc-
     * 8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     * </p>
     * <p>
     * test_folder is the name of the Amazon S3 bucket;
     * </p>
     * <p>
     * ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     * </p>
     * <p>
     * i-1234567876543 is the instance ID;
     * </p>
     * <p>
     * awsrunShellScript is the name of the plugin.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param outputS3KeyPrefix <p>
     *            The S3 directory path inside the bucket where the responses to
     *            the command executions should be stored. This was requested
     *            when issuing the command. For example, in the following
     *            response:
     *            </p>
     *            <p>
     *            test_folder/ab19cb99-a030-46dd-9dfc-
     *            8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     *            </p>
     *            <p>
     *            test_folder is the name of the Amazon S3 bucket;
     *            </p>
     *            <p>
     *            ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3
     *            prefix;
     *            </p>
     *            <p>
     *            i-1234567876543 is the instance ID;
     *            </p>
     *            <p>
     *            awsrunShellScript is the name of the plugin.
     *            </p>
     */
    public void setOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    /**
     * <p>
     * The S3 directory path inside the bucket where the responses to the
     * command executions should be stored. This was requested when issuing the
     * command. For example, in the following response:
     * </p>
     * <p>
     * test_folder/ab19cb99-a030-46dd-9dfc-
     * 8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     * </p>
     * <p>
     * test_folder is the name of the Amazon S3 bucket;
     * </p>
     * <p>
     * ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix;
     * </p>
     * <p>
     * i-1234567876543 is the instance ID;
     * </p>
     * <p>
     * awsrunShellScript is the name of the plugin.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param outputS3KeyPrefix <p>
     *            The S3 directory path inside the bucket where the responses to
     *            the command executions should be stored. This was requested
     *            when issuing the command. For example, in the following
     *            response:
     *            </p>
     *            <p>
     *            test_folder/ab19cb99-a030-46dd-9dfc-
     *            8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript
     *            </p>
     *            <p>
     *            test_folder is the name of the Amazon S3 bucket;
     *            </p>
     *            <p>
     *            ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3
     *            prefix;
     *            </p>
     *            <p>
     *            i-1234567876543 is the instance ID;
     *            </p>
     *            <p>
     *            awsrunShellScript is the name of the plugin.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommandPlugin withOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: " + getStatusDetails() + ",");
        if (getResponseCode() != null)
            sb.append("ResponseCode: " + getResponseCode() + ",");
        if (getResponseStartDateTime() != null)
            sb.append("ResponseStartDateTime: " + getResponseStartDateTime() + ",");
        if (getResponseFinishDateTime() != null)
            sb.append("ResponseFinishDateTime: " + getResponseFinishDateTime() + ",");
        if (getOutput() != null)
            sb.append("Output: " + getOutput() + ",");
        if (getStandardOutputUrl() != null)
            sb.append("StandardOutputUrl: " + getStandardOutputUrl() + ",");
        if (getStandardErrorUrl() != null)
            sb.append("StandardErrorUrl: " + getStandardErrorUrl() + ",");
        if (getOutputS3Region() != null)
            sb.append("OutputS3Region: " + getOutputS3Region() + ",");
        if (getOutputS3BucketName() != null)
            sb.append("OutputS3BucketName: " + getOutputS3BucketName() + ",");
        if (getOutputS3KeyPrefix() != null)
            sb.append("OutputS3KeyPrefix: " + getOutputS3KeyPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode
                + ((getResponseCode() == null) ? 0 : getResponseCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getResponseStartDateTime() == null) ? 0 : getResponseStartDateTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getResponseFinishDateTime() == null) ? 0 : getResponseFinishDateTime()
                        .hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode
                + ((getStandardOutputUrl() == null) ? 0 : getStandardOutputUrl().hashCode());
        hashCode = prime * hashCode
                + ((getStandardErrorUrl() == null) ? 0 : getStandardErrorUrl().hashCode());
        hashCode = prime * hashCode
                + ((getOutputS3Region() == null) ? 0 : getOutputS3Region().hashCode());
        hashCode = prime * hashCode
                + ((getOutputS3BucketName() == null) ? 0 : getOutputS3BucketName().hashCode());
        hashCode = prime * hashCode
                + ((getOutputS3KeyPrefix() == null) ? 0 : getOutputS3KeyPrefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommandPlugin == false)
            return false;
        CommandPlugin other = (CommandPlugin) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null
                && other.getStatusDetails().equals(this.getStatusDetails()) == false)
            return false;
        if (other.getResponseCode() == null ^ this.getResponseCode() == null)
            return false;
        if (other.getResponseCode() != null
                && other.getResponseCode().equals(this.getResponseCode()) == false)
            return false;
        if (other.getResponseStartDateTime() == null ^ this.getResponseStartDateTime() == null)
            return false;
        if (other.getResponseStartDateTime() != null
                && other.getResponseStartDateTime().equals(this.getResponseStartDateTime()) == false)
            return false;
        if (other.getResponseFinishDateTime() == null ^ this.getResponseFinishDateTime() == null)
            return false;
        if (other.getResponseFinishDateTime() != null
                && other.getResponseFinishDateTime().equals(this.getResponseFinishDateTime()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getStandardOutputUrl() == null ^ this.getStandardOutputUrl() == null)
            return false;
        if (other.getStandardOutputUrl() != null
                && other.getStandardOutputUrl().equals(this.getStandardOutputUrl()) == false)
            return false;
        if (other.getStandardErrorUrl() == null ^ this.getStandardErrorUrl() == null)
            return false;
        if (other.getStandardErrorUrl() != null
                && other.getStandardErrorUrl().equals(this.getStandardErrorUrl()) == false)
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
        return true;
    }
}
