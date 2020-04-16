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

public class GetCommandInvocationResult implements Serializable {
    /**
     * <p>
     * The parent command ID of the invocation plugin.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     */
    private String commandId;

    /**
     * <p>
     * The ID of the managed instance targeted by the command. A managed
     * instance can be an Amazon EC2 instance or an instance in your hybrid
     * environment that is configured for Systems Manager.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The comment text for the command.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     */
    private String comment;

    /**
     * <p>
     * The name of the document that was run. For example, AWS-RunShellScript.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String documentName;

    /**
     * <p>
     * The SSM document version used in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String documentVersion;

    /**
     * <p>
     * The name of the plugin for which you want detailed results. For example,
     * aws:RunShellScript is a plugin.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - <br/>
     */
    private String pluginName;

    /**
     * <p>
     * The error level response code for the plugin script. If the response code
     * is -1, then the command has not started running on the instance, or it
     * was not received by the instance.
     * </p>
     */
    private Integer responseCode;

    /**
     * <p>
     * The date and time the plugin started running. Date and time are written
     * in ISO 8601 format. For example, June 7, 2017 is represented as
     * 2017-06-7. The following sample AWS CLI command uses the
     * <code>InvokedBefore</code> filter.
     * </p>
     * <p>
     * <code>aws ssm list-commands --filters key=InvokedBefore,value=2017-06-07T00:00:00Z</code>
     * </p>
     * <p>
     * If the plugin has not started to run, the string is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^([\-]?\d{4}(?!\d{2}\b))((-?)((0[1-9]|1[0-2])(\3([12]\d|0[
     * 1-9]|3[01]))
     * ?|W([0-4]\d|5[0-2])(-?[1-7])?|(00[1-9]|0[1-9]\d|[12]\d{2}|3([0
     * -5]\d|6[1-6]
     * )))([T\s]((([01]\d|2[0-3])((:?)[0-5]\d)?|24\:?00)([\.,]\d(?!:)
     * )?)?(\17[0-5]\d([\.,]\d)?)?([zZ]|([\-])([01]\d|2[0-3]):?([0-5]\d)?)?)?)?$
     * <br/>
     */
    private String executionStartDateTime;

    /**
     * <p>
     * Duration since ExecutionStartDateTime.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^([\-]?\d{4}(?!\d{2}\b))((-?)((0[1-9]|1[0-2])(\3([12]\d|0[
     * 1-9]|3[01]))
     * ?|W([0-4]\d|5[0-2])(-?[1-7])?|(00[1-9]|0[1-9]\d|[12]\d{2}|3([0
     * -5]\d|6[1-6]
     * )))([T\s]((([01]\d|2[0-3])((:?)[0-5]\d)?|24\:?00)([\.,]\d(?!:)
     * )?)?(\17[0-5]\d([\.,]\d)?)?([zZ]|([\-])([01]\d|2[0-3]):?([0-5]\d)?)?)?)?$
     * <br/>
     */
    private String executionElapsedTime;

    /**
     * <p>
     * The date and time the plugin was finished running. Date and time are
     * written in ISO 8601 format. For example, June 7, 2017 is represented as
     * 2017-06-7. The following sample AWS CLI command uses the
     * <code>InvokedAfter</code> filter.
     * </p>
     * <p>
     * <code>aws ssm list-commands --filters key=InvokedAfter,value=2017-06-07T00:00:00Z</code>
     * </p>
     * <p>
     * If the plugin has not started to run, the string is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^([\-]?\d{4}(?!\d{2}\b))((-?)((0[1-9]|1[0-2])(\3([12]\d|0[
     * 1-9]|3[01]))
     * ?|W([0-4]\d|5[0-2])(-?[1-7])?|(00[1-9]|0[1-9]\d|[12]\d{2}|3([0
     * -5]\d|6[1-6]
     * )))([T\s]((([01]\d|2[0-3])((:?)[0-5]\d)?|24\:?00)([\.,]\d(?!:)
     * )?)?(\17[0-5]\d([\.,]\d)?)?([zZ]|([\-])([01]\d|2[0-3]):?([0-5]\d)?)?)?)?$
     * <br/>
     */
    private String executionEndDateTime;

    /**
     * <p>
     * The status of this invocation plugin. This status can be different than
     * StatusDetails.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Delayed, Success, Cancelled,
     * TimedOut, Failed, Cancelling
     */
    private String status;

    /**
     * <p>
     * A detailed status of the command execution for an invocation.
     * StatusDetails includes more information than Status because it includes
     * states resulting from error and concurrency control parameters.
     * StatusDetails can show different results than Status. For more
     * information about these statuses, see <a href=
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
     * Delayed: The system attempted to send the command to the target, but the
     * target was not available. The instance might not be available because of
     * network issues, the instance was stopped, etc. The system will try to
     * deliver the command again.
     * </p>
     * </li>
     * <li>
     * <p>
     * Success: The command or plugin was run successfully. This is a terminal
     * state.
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
     * Execution Timed Out: The command started to run on the instance, but the
     * execution was not complete before the timeout expired. Execution timeouts
     * count against the MaxErrors limit of the parent command. This is a
     * terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The command wasn't run successfully on the instance. For a
     * plugin, this indicates that the result code was not zero. For a command
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
     * instance might not exist or might not be responding. Undeliverable
     * invocations don't count against the parent command's MaxErrors limit and
     * don't contribute to whether the parent command status is Success or
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
     * The first 24,000 characters written by the plugin to stdout. If the
     * command has not finished running, if ExecutionStatus is neither Succeeded
     * nor Failed, then this string is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 24000<br/>
     */
    private String standardOutputContent;

    /**
     * <p>
     * The URL for the complete text written by the plugin to stdout in Amazon
     * S3. If an Amazon S3 bucket was not specified, then this string is empty.
     * </p>
     */
    private String standardOutputUrl;

    /**
     * <p>
     * The first 8,000 characters written by the plugin to stderr. If the
     * command has not finished running, then this string is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8000<br/>
     */
    private String standardErrorContent;

    /**
     * <p>
     * The URL for the complete text written by the plugin to stderr. If the
     * command has not finished running, then this string is empty.
     * </p>
     */
    private String standardErrorUrl;

    /**
     * <p>
     * CloudWatch Logs information where Systems Manager sent the command
     * output.
     * </p>
     */
    private CloudWatchOutputConfig cloudWatchOutputConfig;

    /**
     * <p>
     * The parent command ID of the invocation plugin.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @return <p>
     *         The parent command ID of the invocation plugin.
     *         </p>
     */
    public String getCommandId() {
        return commandId;
    }

    /**
     * <p>
     * The parent command ID of the invocation plugin.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param commandId <p>
     *            The parent command ID of the invocation plugin.
     *            </p>
     */
    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * <p>
     * The parent command ID of the invocation plugin.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param commandId <p>
     *            The parent command ID of the invocation plugin.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommandInvocationResult withCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * <p>
     * The ID of the managed instance targeted by the command. A managed
     * instance can be an Amazon EC2 instance or an instance in your hybrid
     * environment that is configured for Systems Manager.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @return <p>
     *         The ID of the managed instance targeted by the command. A managed
     *         instance can be an Amazon EC2 instance or an instance in your
     *         hybrid environment that is configured for Systems Manager.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the managed instance targeted by the command. A managed
     * instance can be an Amazon EC2 instance or an instance in your hybrid
     * environment that is configured for Systems Manager.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>
     *            The ID of the managed instance targeted by the command. A
     *            managed instance can be an Amazon EC2 instance or an instance
     *            in your hybrid environment that is configured for Systems
     *            Manager.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the managed instance targeted by the command. A managed
     * instance can be an Amazon EC2 instance or an instance in your hybrid
     * environment that is configured for Systems Manager.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>
     *            The ID of the managed instance targeted by the command. A
     *            managed instance can be an Amazon EC2 instance or an instance
     *            in your hybrid environment that is configured for Systems
     *            Manager.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommandInvocationResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The comment text for the command.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @return <p>
     *         The comment text for the command.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * The comment text for the command.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param comment <p>
     *            The comment text for the command.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The comment text for the command.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param comment <p>
     *            The comment text for the command.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommandInvocationResult withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * <p>
     * The name of the document that was run. For example, AWS-RunShellScript.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         The name of the document that was run. For example,
     *         AWS-RunShellScript.
     *         </p>
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * <p>
     * The name of the document that was run. For example, AWS-RunShellScript.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param documentName <p>
     *            The name of the document that was run. For example,
     *            AWS-RunShellScript.
     *            </p>
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The name of the document that was run. For example, AWS-RunShellScript.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param documentName <p>
     *            The name of the document that was run. For example,
     *            AWS-RunShellScript.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommandInvocationResult withDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }

    /**
     * <p>
     * The SSM document version used in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @return <p>
     *         The SSM document version used in the request.
     *         </p>
     */
    public String getDocumentVersion() {
        return documentVersion;
    }

    /**
     * <p>
     * The SSM document version used in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The SSM document version used in the request.
     *            </p>
     */
    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The SSM document version used in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The SSM document version used in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommandInvocationResult withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * <p>
     * The name of the plugin for which you want detailed results. For example,
     * aws:RunShellScript is a plugin.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - <br/>
     *
     * @return <p>
     *         The name of the plugin for which you want detailed results. For
     *         example, aws:RunShellScript is a plugin.
     *         </p>
     */
    public String getPluginName() {
        return pluginName;
    }

    /**
     * <p>
     * The name of the plugin for which you want detailed results. For example,
     * aws:RunShellScript is a plugin.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - <br/>
     *
     * @param pluginName <p>
     *            The name of the plugin for which you want detailed results.
     *            For example, aws:RunShellScript is a plugin.
     *            </p>
     */
    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    /**
     * <p>
     * The name of the plugin for which you want detailed results. For example,
     * aws:RunShellScript is a plugin.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - <br/>
     *
     * @param pluginName <p>
     *            The name of the plugin for which you want detailed results.
     *            For example, aws:RunShellScript is a plugin.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommandInvocationResult withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * <p>
     * The error level response code for the plugin script. If the response code
     * is -1, then the command has not started running on the instance, or it
     * was not received by the instance.
     * </p>
     *
     * @return <p>
     *         The error level response code for the plugin script. If the
     *         response code is -1, then the command has not started running on
     *         the instance, or it was not received by the instance.
     *         </p>
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * <p>
     * The error level response code for the plugin script. If the response code
     * is -1, then the command has not started running on the instance, or it
     * was not received by the instance.
     * </p>
     *
     * @param responseCode <p>
     *            The error level response code for the plugin script. If the
     *            response code is -1, then the command has not started running
     *            on the instance, or it was not received by the instance.
     *            </p>
     */
    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * <p>
     * The error level response code for the plugin script. If the response code
     * is -1, then the command has not started running on the instance, or it
     * was not received by the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseCode <p>
     *            The error level response code for the plugin script. If the
     *            response code is -1, then the command has not started running
     *            on the instance, or it was not received by the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommandInvocationResult withResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * <p>
     * The date and time the plugin started running. Date and time are written
     * in ISO 8601 format. For example, June 7, 2017 is represented as
     * 2017-06-7. The following sample AWS CLI command uses the
     * <code>InvokedBefore</code> filter.
     * </p>
     * <p>
     * <code>aws ssm list-commands --filters key=InvokedBefore,value=2017-06-07T00:00:00Z</code>
     * </p>
     * <p>
     * If the plugin has not started to run, the string is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^([\-]?\d{4}(?!\d{2}\b))((-?)((0[1-9]|1[0-2])(\3([12]\d|0[
     * 1-9]|3[01]))
     * ?|W([0-4]\d|5[0-2])(-?[1-7])?|(00[1-9]|0[1-9]\d|[12]\d{2}|3([0
     * -5]\d|6[1-6]
     * )))([T\s]((([01]\d|2[0-3])((:?)[0-5]\d)?|24\:?00)([\.,]\d(?!:)
     * )?)?(\17[0-5]\d([\.,]\d)?)?([zZ]|([\-])([01]\d|2[0-3]):?([0-5]\d)?)?)?)?$
     * <br/>
     *
     * @return <p>
     *         The date and time the plugin started running. Date and time are
     *         written in ISO 8601 format. For example, June 7, 2017 is
     *         represented as 2017-06-7. The following sample AWS CLI command
     *         uses the <code>InvokedBefore</code> filter.
     *         </p>
     *         <p>
     *         <code>aws ssm list-commands --filters key=InvokedBefore,value=2017-06-07T00:00:00Z</code>
     *         </p>
     *         <p>
     *         If the plugin has not started to run, the string is empty.
     *         </p>
     */
    public String getExecutionStartDateTime() {
        return executionStartDateTime;
    }

    /**
     * <p>
     * The date and time the plugin started running. Date and time are written
     * in ISO 8601 format. For example, June 7, 2017 is represented as
     * 2017-06-7. The following sample AWS CLI command uses the
     * <code>InvokedBefore</code> filter.
     * </p>
     * <p>
     * <code>aws ssm list-commands --filters key=InvokedBefore,value=2017-06-07T00:00:00Z</code>
     * </p>
     * <p>
     * If the plugin has not started to run, the string is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^([\-]?\d{4}(?!\d{2}\b))((-?)((0[1-9]|1[0-2])(\3([12]\d|0[
     * 1-9]|3[01]))
     * ?|W([0-4]\d|5[0-2])(-?[1-7])?|(00[1-9]|0[1-9]\d|[12]\d{2}|3([0
     * -5]\d|6[1-6]
     * )))([T\s]((([01]\d|2[0-3])((:?)[0-5]\d)?|24\:?00)([\.,]\d(?!:)
     * )?)?(\17[0-5]\d([\.,]\d)?)?([zZ]|([\-])([01]\d|2[0-3]):?([0-5]\d)?)?)?)?$
     * <br/>
     *
     * @param executionStartDateTime <p>
     *            The date and time the plugin started running. Date and time
     *            are written in ISO 8601 format. For example, June 7, 2017 is
     *            represented as 2017-06-7. The following sample AWS CLI command
     *            uses the <code>InvokedBefore</code> filter.
     *            </p>
     *            <p>
     *            <code>aws ssm list-commands --filters key=InvokedBefore,value=2017-06-07T00:00:00Z</code>
     *            </p>
     *            <p>
     *            If the plugin has not started to run, the string is empty.
     *            </p>
     */
    public void setExecutionStartDateTime(String executionStartDateTime) {
        this.executionStartDateTime = executionStartDateTime;
    }

    /**
     * <p>
     * The date and time the plugin started running. Date and time are written
     * in ISO 8601 format. For example, June 7, 2017 is represented as
     * 2017-06-7. The following sample AWS CLI command uses the
     * <code>InvokedBefore</code> filter.
     * </p>
     * <p>
     * <code>aws ssm list-commands --filters key=InvokedBefore,value=2017-06-07T00:00:00Z</code>
     * </p>
     * <p>
     * If the plugin has not started to run, the string is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^([\-]?\d{4}(?!\d{2}\b))((-?)((0[1-9]|1[0-2])(\3([12]\d|0[
     * 1-9]|3[01]))
     * ?|W([0-4]\d|5[0-2])(-?[1-7])?|(00[1-9]|0[1-9]\d|[12]\d{2}|3([0
     * -5]\d|6[1-6]
     * )))([T\s]((([01]\d|2[0-3])((:?)[0-5]\d)?|24\:?00)([\.,]\d(?!:)
     * )?)?(\17[0-5]\d([\.,]\d)?)?([zZ]|([\-])([01]\d|2[0-3]):?([0-5]\d)?)?)?)?$
     * <br/>
     *
     * @param executionStartDateTime <p>
     *            The date and time the plugin started running. Date and time
     *            are written in ISO 8601 format. For example, June 7, 2017 is
     *            represented as 2017-06-7. The following sample AWS CLI command
     *            uses the <code>InvokedBefore</code> filter.
     *            </p>
     *            <p>
     *            <code>aws ssm list-commands --filters key=InvokedBefore,value=2017-06-07T00:00:00Z</code>
     *            </p>
     *            <p>
     *            If the plugin has not started to run, the string is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommandInvocationResult withExecutionStartDateTime(String executionStartDateTime) {
        this.executionStartDateTime = executionStartDateTime;
        return this;
    }

    /**
     * <p>
     * Duration since ExecutionStartDateTime.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^([\-]?\d{4}(?!\d{2}\b))((-?)((0[1-9]|1[0-2])(\3([12]\d|0[
     * 1-9]|3[01]))
     * ?|W([0-4]\d|5[0-2])(-?[1-7])?|(00[1-9]|0[1-9]\d|[12]\d{2}|3([0
     * -5]\d|6[1-6]
     * )))([T\s]((([01]\d|2[0-3])((:?)[0-5]\d)?|24\:?00)([\.,]\d(?!:)
     * )?)?(\17[0-5]\d([\.,]\d)?)?([zZ]|([\-])([01]\d|2[0-3]):?([0-5]\d)?)?)?)?$
     * <br/>
     *
     * @return <p>
     *         Duration since ExecutionStartDateTime.
     *         </p>
     */
    public String getExecutionElapsedTime() {
        return executionElapsedTime;
    }

    /**
     * <p>
     * Duration since ExecutionStartDateTime.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^([\-]?\d{4}(?!\d{2}\b))((-?)((0[1-9]|1[0-2])(\3([12]\d|0[
     * 1-9]|3[01]))
     * ?|W([0-4]\d|5[0-2])(-?[1-7])?|(00[1-9]|0[1-9]\d|[12]\d{2}|3([0
     * -5]\d|6[1-6]
     * )))([T\s]((([01]\d|2[0-3])((:?)[0-5]\d)?|24\:?00)([\.,]\d(?!:)
     * )?)?(\17[0-5]\d([\.,]\d)?)?([zZ]|([\-])([01]\d|2[0-3]):?([0-5]\d)?)?)?)?$
     * <br/>
     *
     * @param executionElapsedTime <p>
     *            Duration since ExecutionStartDateTime.
     *            </p>
     */
    public void setExecutionElapsedTime(String executionElapsedTime) {
        this.executionElapsedTime = executionElapsedTime;
    }

    /**
     * <p>
     * Duration since ExecutionStartDateTime.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^([\-]?\d{4}(?!\d{2}\b))((-?)((0[1-9]|1[0-2])(\3([12]\d|0[
     * 1-9]|3[01]))
     * ?|W([0-4]\d|5[0-2])(-?[1-7])?|(00[1-9]|0[1-9]\d|[12]\d{2}|3([0
     * -5]\d|6[1-6]
     * )))([T\s]((([01]\d|2[0-3])((:?)[0-5]\d)?|24\:?00)([\.,]\d(?!:)
     * )?)?(\17[0-5]\d([\.,]\d)?)?([zZ]|([\-])([01]\d|2[0-3]):?([0-5]\d)?)?)?)?$
     * <br/>
     *
     * @param executionElapsedTime <p>
     *            Duration since ExecutionStartDateTime.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommandInvocationResult withExecutionElapsedTime(String executionElapsedTime) {
        this.executionElapsedTime = executionElapsedTime;
        return this;
    }

    /**
     * <p>
     * The date and time the plugin was finished running. Date and time are
     * written in ISO 8601 format. For example, June 7, 2017 is represented as
     * 2017-06-7. The following sample AWS CLI command uses the
     * <code>InvokedAfter</code> filter.
     * </p>
     * <p>
     * <code>aws ssm list-commands --filters key=InvokedAfter,value=2017-06-07T00:00:00Z</code>
     * </p>
     * <p>
     * If the plugin has not started to run, the string is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^([\-]?\d{4}(?!\d{2}\b))((-?)((0[1-9]|1[0-2])(\3([12]\d|0[
     * 1-9]|3[01]))
     * ?|W([0-4]\d|5[0-2])(-?[1-7])?|(00[1-9]|0[1-9]\d|[12]\d{2}|3([0
     * -5]\d|6[1-6]
     * )))([T\s]((([01]\d|2[0-3])((:?)[0-5]\d)?|24\:?00)([\.,]\d(?!:)
     * )?)?(\17[0-5]\d([\.,]\d)?)?([zZ]|([\-])([01]\d|2[0-3]):?([0-5]\d)?)?)?)?$
     * <br/>
     *
     * @return <p>
     *         The date and time the plugin was finished running. Date and time
     *         are written in ISO 8601 format. For example, June 7, 2017 is
     *         represented as 2017-06-7. The following sample AWS CLI command
     *         uses the <code>InvokedAfter</code> filter.
     *         </p>
     *         <p>
     *         <code>aws ssm list-commands --filters key=InvokedAfter,value=2017-06-07T00:00:00Z</code>
     *         </p>
     *         <p>
     *         If the plugin has not started to run, the string is empty.
     *         </p>
     */
    public String getExecutionEndDateTime() {
        return executionEndDateTime;
    }

    /**
     * <p>
     * The date and time the plugin was finished running. Date and time are
     * written in ISO 8601 format. For example, June 7, 2017 is represented as
     * 2017-06-7. The following sample AWS CLI command uses the
     * <code>InvokedAfter</code> filter.
     * </p>
     * <p>
     * <code>aws ssm list-commands --filters key=InvokedAfter,value=2017-06-07T00:00:00Z</code>
     * </p>
     * <p>
     * If the plugin has not started to run, the string is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^([\-]?\d{4}(?!\d{2}\b))((-?)((0[1-9]|1[0-2])(\3([12]\d|0[
     * 1-9]|3[01]))
     * ?|W([0-4]\d|5[0-2])(-?[1-7])?|(00[1-9]|0[1-9]\d|[12]\d{2}|3([0
     * -5]\d|6[1-6]
     * )))([T\s]((([01]\d|2[0-3])((:?)[0-5]\d)?|24\:?00)([\.,]\d(?!:)
     * )?)?(\17[0-5]\d([\.,]\d)?)?([zZ]|([\-])([01]\d|2[0-3]):?([0-5]\d)?)?)?)?$
     * <br/>
     *
     * @param executionEndDateTime <p>
     *            The date and time the plugin was finished running. Date and
     *            time are written in ISO 8601 format. For example, June 7, 2017
     *            is represented as 2017-06-7. The following sample AWS CLI
     *            command uses the <code>InvokedAfter</code> filter.
     *            </p>
     *            <p>
     *            <code>aws ssm list-commands --filters key=InvokedAfter,value=2017-06-07T00:00:00Z</code>
     *            </p>
     *            <p>
     *            If the plugin has not started to run, the string is empty.
     *            </p>
     */
    public void setExecutionEndDateTime(String executionEndDateTime) {
        this.executionEndDateTime = executionEndDateTime;
    }

    /**
     * <p>
     * The date and time the plugin was finished running. Date and time are
     * written in ISO 8601 format. For example, June 7, 2017 is represented as
     * 2017-06-7. The following sample AWS CLI command uses the
     * <code>InvokedAfter</code> filter.
     * </p>
     * <p>
     * <code>aws ssm list-commands --filters key=InvokedAfter,value=2017-06-07T00:00:00Z</code>
     * </p>
     * <p>
     * If the plugin has not started to run, the string is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^([\-]?\d{4}(?!\d{2}\b))((-?)((0[1-9]|1[0-2])(\3([12]\d|0[
     * 1-9]|3[01]))
     * ?|W([0-4]\d|5[0-2])(-?[1-7])?|(00[1-9]|0[1-9]\d|[12]\d{2}|3([0
     * -5]\d|6[1-6]
     * )))([T\s]((([01]\d|2[0-3])((:?)[0-5]\d)?|24\:?00)([\.,]\d(?!:)
     * )?)?(\17[0-5]\d([\.,]\d)?)?([zZ]|([\-])([01]\d|2[0-3]):?([0-5]\d)?)?)?)?$
     * <br/>
     *
     * @param executionEndDateTime <p>
     *            The date and time the plugin was finished running. Date and
     *            time are written in ISO 8601 format. For example, June 7, 2017
     *            is represented as 2017-06-7. The following sample AWS CLI
     *            command uses the <code>InvokedAfter</code> filter.
     *            </p>
     *            <p>
     *            <code>aws ssm list-commands --filters key=InvokedAfter,value=2017-06-07T00:00:00Z</code>
     *            </p>
     *            <p>
     *            If the plugin has not started to run, the string is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommandInvocationResult withExecutionEndDateTime(String executionEndDateTime) {
        this.executionEndDateTime = executionEndDateTime;
        return this;
    }

    /**
     * <p>
     * The status of this invocation plugin. This status can be different than
     * StatusDetails.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Delayed, Success, Cancelled,
     * TimedOut, Failed, Cancelling
     *
     * @return <p>
     *         The status of this invocation plugin. This status can be
     *         different than StatusDetails.
     *         </p>
     * @see CommandInvocationStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of this invocation plugin. This status can be different than
     * StatusDetails.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Delayed, Success, Cancelled,
     * TimedOut, Failed, Cancelling
     *
     * @param status <p>
     *            The status of this invocation plugin. This status can be
     *            different than StatusDetails.
     *            </p>
     * @see CommandInvocationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this invocation plugin. This status can be different than
     * StatusDetails.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Delayed, Success, Cancelled,
     * TimedOut, Failed, Cancelling
     *
     * @param status <p>
     *            The status of this invocation plugin. This status can be
     *            different than StatusDetails.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CommandInvocationStatus
     */
    public GetCommandInvocationResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of this invocation plugin. This status can be different than
     * StatusDetails.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Delayed, Success, Cancelled,
     * TimedOut, Failed, Cancelling
     *
     * @param status <p>
     *            The status of this invocation plugin. This status can be
     *            different than StatusDetails.
     *            </p>
     * @see CommandInvocationStatus
     */
    public void setStatus(CommandInvocationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of this invocation plugin. This status can be different than
     * StatusDetails.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Delayed, Success, Cancelled,
     * TimedOut, Failed, Cancelling
     *
     * @param status <p>
     *            The status of this invocation plugin. This status can be
     *            different than StatusDetails.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CommandInvocationStatus
     */
    public GetCommandInvocationResult withStatus(CommandInvocationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A detailed status of the command execution for an invocation.
     * StatusDetails includes more information than Status because it includes
     * states resulting from error and concurrency control parameters.
     * StatusDetails can show different results than Status. For more
     * information about these statuses, see <a href=
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
     * Delayed: The system attempted to send the command to the target, but the
     * target was not available. The instance might not be available because of
     * network issues, the instance was stopped, etc. The system will try to
     * deliver the command again.
     * </p>
     * </li>
     * <li>
     * <p>
     * Success: The command or plugin was run successfully. This is a terminal
     * state.
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
     * Execution Timed Out: The command started to run on the instance, but the
     * execution was not complete before the timeout expired. Execution timeouts
     * count against the MaxErrors limit of the parent command. This is a
     * terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The command wasn't run successfully on the instance. For a
     * plugin, this indicates that the result code was not zero. For a command
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
     * instance might not exist or might not be responding. Undeliverable
     * invocations don't count against the parent command's MaxErrors limit and
     * don't contribute to whether the parent command status is Success or
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
     *         A detailed status of the command execution for an invocation.
     *         StatusDetails includes more information than Status because it
     *         includes states resulting from error and concurrency control
     *         parameters. StatusDetails can show different results than Status.
     *         For more information about these statuses, see <a href=
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
     *         Delayed: The system attempted to send the command to the target,
     *         but the target was not available. The instance might not be
     *         available because of network issues, the instance was stopped,
     *         etc. The system will try to deliver the command again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Success: The command or plugin was run successfully. This is a
     *         terminal state.
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
     *         Execution Timed Out: The command started to run on the instance,
     *         but the execution was not complete before the timeout expired.
     *         Execution timeouts count against the MaxErrors limit of the
     *         parent command. This is a terminal state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed: The command wasn't run successfully on the instance. For
     *         a plugin, this indicates that the result code was not zero. For a
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
     *         The instance might not exist or might not be responding.
     *         Undeliverable invocations don't count against the parent
     *         command's MaxErrors limit and don't contribute to whether the
     *         parent command status is Success or Incomplete. This is a
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
     * A detailed status of the command execution for an invocation.
     * StatusDetails includes more information than Status because it includes
     * states resulting from error and concurrency control parameters.
     * StatusDetails can show different results than Status. For more
     * information about these statuses, see <a href=
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
     * Delayed: The system attempted to send the command to the target, but the
     * target was not available. The instance might not be available because of
     * network issues, the instance was stopped, etc. The system will try to
     * deliver the command again.
     * </p>
     * </li>
     * <li>
     * <p>
     * Success: The command or plugin was run successfully. This is a terminal
     * state.
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
     * Execution Timed Out: The command started to run on the instance, but the
     * execution was not complete before the timeout expired. Execution timeouts
     * count against the MaxErrors limit of the parent command. This is a
     * terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The command wasn't run successfully on the instance. For a
     * plugin, this indicates that the result code was not zero. For a command
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
     * instance might not exist or might not be responding. Undeliverable
     * invocations don't count against the parent command's MaxErrors limit and
     * don't contribute to whether the parent command status is Success or
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
     *            A detailed status of the command execution for an invocation.
     *            StatusDetails includes more information than Status because it
     *            includes states resulting from error and concurrency control
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
     *            Delayed: The system attempted to send the command to the
     *            target, but the target was not available. The instance might
     *            not be available because of network issues, the instance was
     *            stopped, etc. The system will try to deliver the command
     *            again.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Success: The command or plugin was run successfully. This is a
     *            terminal state.
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
     *            Execution Timed Out: The command started to run on the
     *            instance, but the execution was not complete before the
     *            timeout expired. Execution timeouts count against the
     *            MaxErrors limit of the parent command. This is a terminal
     *            state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Failed: The command wasn't run successfully on the instance.
     *            For a plugin, this indicates that the result code was not
     *            zero. For a command invocation, this indicates that the result
     *            code for one or more plugins was not zero. Invocation failures
     *            count against the MaxErrors limit of the parent command. This
     *            is a terminal state.
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
     *            The instance might not exist or might not be responding.
     *            Undeliverable invocations don't count against the parent
     *            command's MaxErrors limit and don't contribute to whether the
     *            parent command status is Success or Incomplete. This is a
     *            terminal state.
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
     * A detailed status of the command execution for an invocation.
     * StatusDetails includes more information than Status because it includes
     * states resulting from error and concurrency control parameters.
     * StatusDetails can show different results than Status. For more
     * information about these statuses, see <a href=
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
     * Delayed: The system attempted to send the command to the target, but the
     * target was not available. The instance might not be available because of
     * network issues, the instance was stopped, etc. The system will try to
     * deliver the command again.
     * </p>
     * </li>
     * <li>
     * <p>
     * Success: The command or plugin was run successfully. This is a terminal
     * state.
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
     * Execution Timed Out: The command started to run on the instance, but the
     * execution was not complete before the timeout expired. Execution timeouts
     * count against the MaxErrors limit of the parent command. This is a
     * terminal state.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The command wasn't run successfully on the instance. For a
     * plugin, this indicates that the result code was not zero. For a command
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
     * instance might not exist or might not be responding. Undeliverable
     * invocations don't count against the parent command's MaxErrors limit and
     * don't contribute to whether the parent command status is Success or
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
     *            A detailed status of the command execution for an invocation.
     *            StatusDetails includes more information than Status because it
     *            includes states resulting from error and concurrency control
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
     *            Delayed: The system attempted to send the command to the
     *            target, but the target was not available. The instance might
     *            not be available because of network issues, the instance was
     *            stopped, etc. The system will try to deliver the command
     *            again.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Success: The command or plugin was run successfully. This is a
     *            terminal state.
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
     *            Execution Timed Out: The command started to run on the
     *            instance, but the execution was not complete before the
     *            timeout expired. Execution timeouts count against the
     *            MaxErrors limit of the parent command. This is a terminal
     *            state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Failed: The command wasn't run successfully on the instance.
     *            For a plugin, this indicates that the result code was not
     *            zero. For a command invocation, this indicates that the result
     *            code for one or more plugins was not zero. Invocation failures
     *            count against the MaxErrors limit of the parent command. This
     *            is a terminal state.
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
     *            The instance might not exist or might not be responding.
     *            Undeliverable invocations don't count against the parent
     *            command's MaxErrors limit and don't contribute to whether the
     *            parent command status is Success or Incomplete. This is a
     *            terminal state.
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
    public GetCommandInvocationResult withStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * <p>
     * The first 24,000 characters written by the plugin to stdout. If the
     * command has not finished running, if ExecutionStatus is neither Succeeded
     * nor Failed, then this string is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 24000<br/>
     *
     * @return <p>
     *         The first 24,000 characters written by the plugin to stdout. If
     *         the command has not finished running, if ExecutionStatus is
     *         neither Succeeded nor Failed, then this string is empty.
     *         </p>
     */
    public String getStandardOutputContent() {
        return standardOutputContent;
    }

    /**
     * <p>
     * The first 24,000 characters written by the plugin to stdout. If the
     * command has not finished running, if ExecutionStatus is neither Succeeded
     * nor Failed, then this string is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 24000<br/>
     *
     * @param standardOutputContent <p>
     *            The first 24,000 characters written by the plugin to stdout.
     *            If the command has not finished running, if ExecutionStatus is
     *            neither Succeeded nor Failed, then this string is empty.
     *            </p>
     */
    public void setStandardOutputContent(String standardOutputContent) {
        this.standardOutputContent = standardOutputContent;
    }

    /**
     * <p>
     * The first 24,000 characters written by the plugin to stdout. If the
     * command has not finished running, if ExecutionStatus is neither Succeeded
     * nor Failed, then this string is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 24000<br/>
     *
     * @param standardOutputContent <p>
     *            The first 24,000 characters written by the plugin to stdout.
     *            If the command has not finished running, if ExecutionStatus is
     *            neither Succeeded nor Failed, then this string is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommandInvocationResult withStandardOutputContent(String standardOutputContent) {
        this.standardOutputContent = standardOutputContent;
        return this;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stdout in Amazon
     * S3. If an Amazon S3 bucket was not specified, then this string is empty.
     * </p>
     *
     * @return <p>
     *         The URL for the complete text written by the plugin to stdout in
     *         Amazon S3. If an Amazon S3 bucket was not specified, then this
     *         string is empty.
     *         </p>
     */
    public String getStandardOutputUrl() {
        return standardOutputUrl;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stdout in Amazon
     * S3. If an Amazon S3 bucket was not specified, then this string is empty.
     * </p>
     *
     * @param standardOutputUrl <p>
     *            The URL for the complete text written by the plugin to stdout
     *            in Amazon S3. If an Amazon S3 bucket was not specified, then
     *            this string is empty.
     *            </p>
     */
    public void setStandardOutputUrl(String standardOutputUrl) {
        this.standardOutputUrl = standardOutputUrl;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stdout in Amazon
     * S3. If an Amazon S3 bucket was not specified, then this string is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param standardOutputUrl <p>
     *            The URL for the complete text written by the plugin to stdout
     *            in Amazon S3. If an Amazon S3 bucket was not specified, then
     *            this string is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommandInvocationResult withStandardOutputUrl(String standardOutputUrl) {
        this.standardOutputUrl = standardOutputUrl;
        return this;
    }

    /**
     * <p>
     * The first 8,000 characters written by the plugin to stderr. If the
     * command has not finished running, then this string is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8000<br/>
     *
     * @return <p>
     *         The first 8,000 characters written by the plugin to stderr. If
     *         the command has not finished running, then this string is empty.
     *         </p>
     */
    public String getStandardErrorContent() {
        return standardErrorContent;
    }

    /**
     * <p>
     * The first 8,000 characters written by the plugin to stderr. If the
     * command has not finished running, then this string is empty.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8000<br/>
     *
     * @param standardErrorContent <p>
     *            The first 8,000 characters written by the plugin to stderr. If
     *            the command has not finished running, then this string is
     *            empty.
     *            </p>
     */
    public void setStandardErrorContent(String standardErrorContent) {
        this.standardErrorContent = standardErrorContent;
    }

    /**
     * <p>
     * The first 8,000 characters written by the plugin to stderr. If the
     * command has not finished running, then this string is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8000<br/>
     *
     * @param standardErrorContent <p>
     *            The first 8,000 characters written by the plugin to stderr. If
     *            the command has not finished running, then this string is
     *            empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommandInvocationResult withStandardErrorContent(String standardErrorContent) {
        this.standardErrorContent = standardErrorContent;
        return this;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stderr. If the
     * command has not finished running, then this string is empty.
     * </p>
     *
     * @return <p>
     *         The URL for the complete text written by the plugin to stderr. If
     *         the command has not finished running, then this string is empty.
     *         </p>
     */
    public String getStandardErrorUrl() {
        return standardErrorUrl;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stderr. If the
     * command has not finished running, then this string is empty.
     * </p>
     *
     * @param standardErrorUrl <p>
     *            The URL for the complete text written by the plugin to stderr.
     *            If the command has not finished running, then this string is
     *            empty.
     *            </p>
     */
    public void setStandardErrorUrl(String standardErrorUrl) {
        this.standardErrorUrl = standardErrorUrl;
    }

    /**
     * <p>
     * The URL for the complete text written by the plugin to stderr. If the
     * command has not finished running, then this string is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param standardErrorUrl <p>
     *            The URL for the complete text written by the plugin to stderr.
     *            If the command has not finished running, then this string is
     *            empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommandInvocationResult withStandardErrorUrl(String standardErrorUrl) {
        this.standardErrorUrl = standardErrorUrl;
        return this;
    }

    /**
     * <p>
     * CloudWatch Logs information where Systems Manager sent the command
     * output.
     * </p>
     *
     * @return <p>
     *         CloudWatch Logs information where Systems Manager sent the
     *         command output.
     *         </p>
     */
    public CloudWatchOutputConfig getCloudWatchOutputConfig() {
        return cloudWatchOutputConfig;
    }

    /**
     * <p>
     * CloudWatch Logs information where Systems Manager sent the command
     * output.
     * </p>
     *
     * @param cloudWatchOutputConfig <p>
     *            CloudWatch Logs information where Systems Manager sent the
     *            command output.
     *            </p>
     */
    public void setCloudWatchOutputConfig(CloudWatchOutputConfig cloudWatchOutputConfig) {
        this.cloudWatchOutputConfig = cloudWatchOutputConfig;
    }

    /**
     * <p>
     * CloudWatch Logs information where Systems Manager sent the command
     * output.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudWatchOutputConfig <p>
     *            CloudWatch Logs information where Systems Manager sent the
     *            command output.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommandInvocationResult withCloudWatchOutputConfig(
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
        if (getCommandId() != null)
            sb.append("CommandId: " + getCommandId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getDocumentName() != null)
            sb.append("DocumentName: " + getDocumentName() + ",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: " + getDocumentVersion() + ",");
        if (getPluginName() != null)
            sb.append("PluginName: " + getPluginName() + ",");
        if (getResponseCode() != null)
            sb.append("ResponseCode: " + getResponseCode() + ",");
        if (getExecutionStartDateTime() != null)
            sb.append("ExecutionStartDateTime: " + getExecutionStartDateTime() + ",");
        if (getExecutionElapsedTime() != null)
            sb.append("ExecutionElapsedTime: " + getExecutionElapsedTime() + ",");
        if (getExecutionEndDateTime() != null)
            sb.append("ExecutionEndDateTime: " + getExecutionEndDateTime() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: " + getStatusDetails() + ",");
        if (getStandardOutputContent() != null)
            sb.append("StandardOutputContent: " + getStandardOutputContent() + ",");
        if (getStandardOutputUrl() != null)
            sb.append("StandardOutputUrl: " + getStandardOutputUrl() + ",");
        if (getStandardErrorContent() != null)
            sb.append("StandardErrorContent: " + getStandardErrorContent() + ",");
        if (getStandardErrorUrl() != null)
            sb.append("StandardErrorUrl: " + getStandardErrorUrl() + ",");
        if (getCloudWatchOutputConfig() != null)
            sb.append("CloudWatchOutputConfig: " + getCloudWatchOutputConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommandId() == null) ? 0 : getCommandId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getPluginName() == null) ? 0 : getPluginName().hashCode());
        hashCode = prime * hashCode
                + ((getResponseCode() == null) ? 0 : getResponseCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getExecutionStartDateTime() == null) ? 0 : getExecutionStartDateTime()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getExecutionElapsedTime() == null) ? 0 : getExecutionElapsedTime().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionEndDateTime() == null) ? 0 : getExecutionEndDateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime
                * hashCode
                + ((getStandardOutputContent() == null) ? 0 : getStandardOutputContent().hashCode());
        hashCode = prime * hashCode
                + ((getStandardOutputUrl() == null) ? 0 : getStandardOutputUrl().hashCode());
        hashCode = prime * hashCode
                + ((getStandardErrorContent() == null) ? 0 : getStandardErrorContent().hashCode());
        hashCode = prime * hashCode
                + ((getStandardErrorUrl() == null) ? 0 : getStandardErrorUrl().hashCode());
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

        if (obj instanceof GetCommandInvocationResult == false)
            return false;
        GetCommandInvocationResult other = (GetCommandInvocationResult) obj;

        if (other.getCommandId() == null ^ this.getCommandId() == null)
            return false;
        if (other.getCommandId() != null
                && other.getCommandId().equals(this.getCommandId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
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
        if (other.getPluginName() == null ^ this.getPluginName() == null)
            return false;
        if (other.getPluginName() != null
                && other.getPluginName().equals(this.getPluginName()) == false)
            return false;
        if (other.getResponseCode() == null ^ this.getResponseCode() == null)
            return false;
        if (other.getResponseCode() != null
                && other.getResponseCode().equals(this.getResponseCode()) == false)
            return false;
        if (other.getExecutionStartDateTime() == null ^ this.getExecutionStartDateTime() == null)
            return false;
        if (other.getExecutionStartDateTime() != null
                && other.getExecutionStartDateTime().equals(this.getExecutionStartDateTime()) == false)
            return false;
        if (other.getExecutionElapsedTime() == null ^ this.getExecutionElapsedTime() == null)
            return false;
        if (other.getExecutionElapsedTime() != null
                && other.getExecutionElapsedTime().equals(this.getExecutionElapsedTime()) == false)
            return false;
        if (other.getExecutionEndDateTime() == null ^ this.getExecutionEndDateTime() == null)
            return false;
        if (other.getExecutionEndDateTime() != null
                && other.getExecutionEndDateTime().equals(this.getExecutionEndDateTime()) == false)
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
        if (other.getStandardOutputContent() == null ^ this.getStandardOutputContent() == null)
            return false;
        if (other.getStandardOutputContent() != null
                && other.getStandardOutputContent().equals(this.getStandardOutputContent()) == false)
            return false;
        if (other.getStandardOutputUrl() == null ^ this.getStandardOutputUrl() == null)
            return false;
        if (other.getStandardOutputUrl() != null
                && other.getStandardOutputUrl().equals(this.getStandardOutputUrl()) == false)
            return false;
        if (other.getStandardErrorContent() == null ^ this.getStandardErrorContent() == null)
            return false;
        if (other.getStandardErrorContent() != null
                && other.getStandardErrorContent().equals(this.getStandardErrorContent()) == false)
            return false;
        if (other.getStandardErrorUrl() == null ^ this.getStandardErrorUrl() == null)
            return false;
        if (other.getStandardErrorUrl() != null
                && other.getStandardErrorUrl().equals(this.getStandardErrorUrl()) == false)
            return false;
        if (other.getCloudWatchOutputConfig() == null ^ this.getCloudWatchOutputConfig() == null)
            return false;
        if (other.getCloudWatchOutputConfig() != null
                && other.getCloudWatchOutputConfig().equals(this.getCloudWatchOutputConfig()) == false)
            return false;
        return true;
    }
}
