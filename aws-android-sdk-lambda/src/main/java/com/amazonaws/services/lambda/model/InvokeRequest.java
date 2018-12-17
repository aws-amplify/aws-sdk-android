/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lambda.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Invokes a Lambda function. For an example, see <a href=
 * "http://docs.aws.amazon.com/lambda/latest/dg/with-dynamodb-create-function.html#with-dbb-invoke-manually"
 * >Create the Lambda Function and Test It Manually</a>.
 * </p>
 * <p>
 * Specify just a function name to invoke the latest version of the function. To
 * invoke a published version, use the <code>Qualifier</code> parameter to
 * specify a <a
 * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html"
 * >version or alias</a>.
 * </p>
 * <p>
 * If you use the <code>RequestResponse</code> (synchronous) invocation option,
 * the function will be invoked only once. If you use the <code>Event</code>
 * (asynchronous) invocation option, the function will be invoked at least once
 * in response to an event and the function must be idempotent to handle this.
 * </p>
 * <p>
 * For functions with a long timeout, your client may be disconnected during
 * synchronous invocation while it waits for a response. Configure your HTTP
 * client, SDK, firewall, proxy, or operating system to allow for long
 * connections with timeout or keep-alive settings.
 * </p>
 * <p>
 * This operation requires permission for the <code>lambda:InvokeFunction</code>
 * action.
 * </p>
 * <p>
 * The <code>TooManyRequestsException</code> noted below will return the
 * following: <code>ConcurrentInvocationLimitExceeded</code> will be returned if
 * you have no functions with reserved concurrency and have exceeded your
 * account concurrent limit or if a function without reserved concurrency
 * exceeds the account's unreserved concurrency limit.
 * <code>ReservedFunctionConcurrentInvocationLimitExceeded</code> will be
 * returned when a function with reserved concurrency exceeds its configured
 * concurrency limit.
 * </p>
 */
public class InvokeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> -
     * <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only
     * the function name, it is limited to 64 characters in length.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:(aws[a-zA-Z-]*)?:lambda:)?([a-z]{2}(-gov)?-[a-z]+-\d{
     * 1}:)?(\d{12}
     * :)?(function:)?([a-zA-Z0-9-_\.]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String functionName;

    /**
     * <p>
     * Choose from the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestResponse</code> (default) - Invoke the function
     * synchronously. Keep the connection open until the function returns a
     * response or times out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that
     * fail multiple times to the function's dead-letter queue (if configured).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DryRun</code> - Validate parameter values and verify that the user
     * or role has permission to invoke the function.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse, DryRun
     */
    private String invocationType;

    /**
     * <p>
     * You can set this optional parameter to <code>Tail</code> in the request
     * only if you specify the <code>InvocationType</code> parameter with value
     * <code>RequestResponse</code>. In this case, AWS Lambda returns the
     * base64-encoded last 4 KB of log data produced by your Lambda function in
     * the <code>x-amz-log-result</code> header.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     */
    private String logType;

    /**
     * <p>
     * Using the <code>ClientContext</code> you can pass client-specific
     * information to the Lambda function you are invoking. You can then process
     * the client information in your Lambda function as you choose through the
     * context variable. For an example of a <code>ClientContext</code> JSON,
     * see <a href=
     * "http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html"
     * >PutEvents</a> in the <i>Amazon Mobile Analytics API Reference and User
     * Guide</i>.
     * </p>
     * <p>
     * The ClientContext JSON must be base64-encoded and has a maximum size of
     * 3583 bytes.
     * </p>
     * <note>
     * <p>
     * <code>ClientContext</code> information is returned only if you use the
     * synchronous (<code>RequestResponse</code>) invocation type.
     * </p>
     * </note>
     */
    private String clientContext;

    /**
     * <p>
     * JSON that you want to provide to your Lambda function as input.
     * </p>
     */
    private java.nio.ByteBuffer payload;

    /**
     * <p>
     * Specify a version or alias to invoke a published version of the function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     */
    private String qualifier;

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> -
     * <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only
     * the function name, it is limited to 64 characters in length.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:(aws[a-zA-Z-]*)?:lambda:)?([a-z]{2}(-gov)?-[a-z]+-\d{
     * 1}:)?(\d{12}
     * :)?(function:)?([a-zA-Z0-9-_\.]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return <p>
     *         The name of the Lambda function.
     *         </p>
     *         <p class="title">
     *         <b>Name formats</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Function name</b> - <code>MyFunction</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Function ARN</b> -
     *         <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Partial ARN</b> -
     *         <code>123456789012:function:MyFunction</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The length constraint applies only to the full ARN. If you
     *         specify only the function name, it is limited to 64 characters in
     *         length.
     *         </p>
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> -
     * <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only
     * the function name, it is limited to 64 characters in length.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:(aws[a-zA-Z-]*)?:lambda:)?([a-z]{2}(-gov)?-[a-z]+-\d{
     * 1}:)?(\d{12}
     * :)?(function:)?([a-zA-Z0-9-_\.]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName <p>
     *            The name of the Lambda function.
     *            </p>
     *            <p class="title">
     *            <b>Name formats</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Function name</b> - <code>MyFunction</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Function ARN</b> -
     *            <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Partial ARN</b> -
     *            <code>123456789012:function:MyFunction</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The length constraint applies only to the full ARN. If you
     *            specify only the function name, it is limited to 64 characters
     *            in length.
     *            </p>
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> -
     * <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only
     * the function name, it is limited to 64 characters in length.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:(aws[a-zA-Z-]*)?:lambda:)?([a-z]{2}(-gov)?-[a-z]+-\d{
     * 1}:)?(\d{12}
     * :)?(function:)?([a-zA-Z0-9-_\.]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName <p>
     *            The name of the Lambda function.
     *            </p>
     *            <p class="title">
     *            <b>Name formats</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Function name</b> - <code>MyFunction</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Function ARN</b> -
     *            <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Partial ARN</b> -
     *            <code>123456789012:function:MyFunction</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The length constraint applies only to the full ARN. If you
     *            specify only the function name, it is limited to 64 characters
     *            in length.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * <p>
     * Choose from the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestResponse</code> (default) - Invoke the function
     * synchronously. Keep the connection open until the function returns a
     * response or times out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that
     * fail multiple times to the function's dead-letter queue (if configured).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DryRun</code> - Validate parameter values and verify that the user
     * or role has permission to invoke the function.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse, DryRun
     *
     * @return <p>
     *         Choose from the following options.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RequestResponse</code> (default) - Invoke the function
     *         synchronously. Keep the connection open until the function
     *         returns a response or times out.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Event</code> - Invoke the function asynchronously. Send
     *         events that fail multiple times to the function's dead-letter
     *         queue (if configured).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DryRun</code> - Validate parameter values and verify that
     *         the user or role has permission to invoke the function.
     *         </p>
     *         </li>
     *         </ul>
     * @see InvocationType
     */
    public String getInvocationType() {
        return invocationType;
    }

    /**
     * <p>
     * Choose from the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestResponse</code> (default) - Invoke the function
     * synchronously. Keep the connection open until the function returns a
     * response or times out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that
     * fail multiple times to the function's dead-letter queue (if configured).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DryRun</code> - Validate parameter values and verify that the user
     * or role has permission to invoke the function.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse, DryRun
     *
     * @param invocationType <p>
     *            Choose from the following options.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RequestResponse</code> (default) - Invoke the function
     *            synchronously. Keep the connection open until the function
     *            returns a response or times out.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Event</code> - Invoke the function asynchronously. Send
     *            events that fail multiple times to the function's dead-letter
     *            queue (if configured).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DryRun</code> - Validate parameter values and verify
     *            that the user or role has permission to invoke the function.
     *            </p>
     *            </li>
     *            </ul>
     * @see InvocationType
     */
    public void setInvocationType(String invocationType) {
        this.invocationType = invocationType;
    }

    /**
     * <p>
     * Choose from the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestResponse</code> (default) - Invoke the function
     * synchronously. Keep the connection open until the function returns a
     * response or times out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that
     * fail multiple times to the function's dead-letter queue (if configured).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DryRun</code> - Validate parameter values and verify that the user
     * or role has permission to invoke the function.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse, DryRun
     *
     * @param invocationType <p>
     *            Choose from the following options.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RequestResponse</code> (default) - Invoke the function
     *            synchronously. Keep the connection open until the function
     *            returns a response or times out.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Event</code> - Invoke the function asynchronously. Send
     *            events that fail multiple times to the function's dead-letter
     *            queue (if configured).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DryRun</code> - Validate parameter values and verify
     *            that the user or role has permission to invoke the function.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InvocationType
     */
    public InvokeRequest withInvocationType(String invocationType) {
        this.invocationType = invocationType;
        return this;
    }

    /**
     * <p>
     * Choose from the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestResponse</code> (default) - Invoke the function
     * synchronously. Keep the connection open until the function returns a
     * response or times out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that
     * fail multiple times to the function's dead-letter queue (if configured).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DryRun</code> - Validate parameter values and verify that the user
     * or role has permission to invoke the function.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse, DryRun
     *
     * @param invocationType <p>
     *            Choose from the following options.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RequestResponse</code> (default) - Invoke the function
     *            synchronously. Keep the connection open until the function
     *            returns a response or times out.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Event</code> - Invoke the function asynchronously. Send
     *            events that fail multiple times to the function's dead-letter
     *            queue (if configured).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DryRun</code> - Validate parameter values and verify
     *            that the user or role has permission to invoke the function.
     *            </p>
     *            </li>
     *            </ul>
     * @see InvocationType
     */
    public void setInvocationType(InvocationType invocationType) {
        this.invocationType = invocationType.toString();
    }

    /**
     * <p>
     * Choose from the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestResponse</code> (default) - Invoke the function
     * synchronously. Keep the connection open until the function returns a
     * response or times out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that
     * fail multiple times to the function's dead-letter queue (if configured).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DryRun</code> - Validate parameter values and verify that the user
     * or role has permission to invoke the function.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Event, RequestResponse, DryRun
     *
     * @param invocationType <p>
     *            Choose from the following options.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RequestResponse</code> (default) - Invoke the function
     *            synchronously. Keep the connection open until the function
     *            returns a response or times out.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Event</code> - Invoke the function asynchronously. Send
     *            events that fail multiple times to the function's dead-letter
     *            queue (if configured).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DryRun</code> - Validate parameter values and verify
     *            that the user or role has permission to invoke the function.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InvocationType
     */
    public InvokeRequest withInvocationType(InvocationType invocationType) {
        this.invocationType = invocationType.toString();
        return this;
    }

    /**
     * <p>
     * You can set this optional parameter to <code>Tail</code> in the request
     * only if you specify the <code>InvocationType</code> parameter with value
     * <code>RequestResponse</code>. In this case, AWS Lambda returns the
     * base64-encoded last 4 KB of log data produced by your Lambda function in
     * the <code>x-amz-log-result</code> header.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @return <p>
     *         You can set this optional parameter to <code>Tail</code> in the
     *         request only if you specify the <code>InvocationType</code>
     *         parameter with value <code>RequestResponse</code>. In this case,
     *         AWS Lambda returns the base64-encoded last 4 KB of log data
     *         produced by your Lambda function in the
     *         <code>x-amz-log-result</code> header.
     *         </p>
     * @see LogType
     */
    public String getLogType() {
        return logType;
    }

    /**
     * <p>
     * You can set this optional parameter to <code>Tail</code> in the request
     * only if you specify the <code>InvocationType</code> parameter with value
     * <code>RequestResponse</code>. In this case, AWS Lambda returns the
     * base64-encoded last 4 KB of log data produced by your Lambda function in
     * the <code>x-amz-log-result</code> header.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @param logType <p>
     *            You can set this optional parameter to <code>Tail</code> in
     *            the request only if you specify the
     *            <code>InvocationType</code> parameter with value
     *            <code>RequestResponse</code>. In this case, AWS Lambda returns
     *            the base64-encoded last 4 KB of log data produced by your
     *            Lambda function in the <code>x-amz-log-result</code> header.
     *            </p>
     * @see LogType
     */
    public void setLogType(String logType) {
        this.logType = logType;
    }

    /**
     * <p>
     * You can set this optional parameter to <code>Tail</code> in the request
     * only if you specify the <code>InvocationType</code> parameter with value
     * <code>RequestResponse</code>. In this case, AWS Lambda returns the
     * base64-encoded last 4 KB of log data produced by your Lambda function in
     * the <code>x-amz-log-result</code> header.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @param logType <p>
     *            You can set this optional parameter to <code>Tail</code> in
     *            the request only if you specify the
     *            <code>InvocationType</code> parameter with value
     *            <code>RequestResponse</code>. In this case, AWS Lambda returns
     *            the base64-encoded last 4 KB of log data produced by your
     *            Lambda function in the <code>x-amz-log-result</code> header.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogType
     */
    public InvokeRequest withLogType(String logType) {
        this.logType = logType;
        return this;
    }

    /**
     * <p>
     * You can set this optional parameter to <code>Tail</code> in the request
     * only if you specify the <code>InvocationType</code> parameter with value
     * <code>RequestResponse</code>. In this case, AWS Lambda returns the
     * base64-encoded last 4 KB of log data produced by your Lambda function in
     * the <code>x-amz-log-result</code> header.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @param logType <p>
     *            You can set this optional parameter to <code>Tail</code> in
     *            the request only if you specify the
     *            <code>InvocationType</code> parameter with value
     *            <code>RequestResponse</code>. In this case, AWS Lambda returns
     *            the base64-encoded last 4 KB of log data produced by your
     *            Lambda function in the <code>x-amz-log-result</code> header.
     *            </p>
     * @see LogType
     */
    public void setLogType(LogType logType) {
        this.logType = logType.toString();
    }

    /**
     * <p>
     * You can set this optional parameter to <code>Tail</code> in the request
     * only if you specify the <code>InvocationType</code> parameter with value
     * <code>RequestResponse</code>. In this case, AWS Lambda returns the
     * base64-encoded last 4 KB of log data produced by your Lambda function in
     * the <code>x-amz-log-result</code> header.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @param logType <p>
     *            You can set this optional parameter to <code>Tail</code> in
     *            the request only if you specify the
     *            <code>InvocationType</code> parameter with value
     *            <code>RequestResponse</code>. In this case, AWS Lambda returns
     *            the base64-encoded last 4 KB of log data produced by your
     *            Lambda function in the <code>x-amz-log-result</code> header.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogType
     */
    public InvokeRequest withLogType(LogType logType) {
        this.logType = logType.toString();
        return this;
    }

    /**
     * <p>
     * Using the <code>ClientContext</code> you can pass client-specific
     * information to the Lambda function you are invoking. You can then process
     * the client information in your Lambda function as you choose through the
     * context variable. For an example of a <code>ClientContext</code> JSON,
     * see <a href=
     * "http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html"
     * >PutEvents</a> in the <i>Amazon Mobile Analytics API Reference and User
     * Guide</i>.
     * </p>
     * <p>
     * The ClientContext JSON must be base64-encoded and has a maximum size of
     * 3583 bytes.
     * </p>
     * <note>
     * <p>
     * <code>ClientContext</code> information is returned only if you use the
     * synchronous (<code>RequestResponse</code>) invocation type.
     * </p>
     * </note>
     *
     * @return <p>
     *         Using the <code>ClientContext</code> you can pass client-specific
     *         information to the Lambda function you are invoking. You can then
     *         process the client information in your Lambda function as you
     *         choose through the context variable. For an example of a
     *         <code>ClientContext</code> JSON, see <a href=
     *         "http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html"
     *         >PutEvents</a> in the <i>Amazon Mobile Analytics API Reference
     *         and User Guide</i>.
     *         </p>
     *         <p>
     *         The ClientContext JSON must be base64-encoded and has a maximum
     *         size of 3583 bytes.
     *         </p>
     *         <note>
     *         <p>
     *         <code>ClientContext</code> information is returned only if you
     *         use the synchronous (<code>RequestResponse</code>) invocation
     *         type.
     *         </p>
     *         </note>
     */
    public String getClientContext() {
        return clientContext;
    }

    /**
     * <p>
     * Using the <code>ClientContext</code> you can pass client-specific
     * information to the Lambda function you are invoking. You can then process
     * the client information in your Lambda function as you choose through the
     * context variable. For an example of a <code>ClientContext</code> JSON,
     * see <a href=
     * "http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html"
     * >PutEvents</a> in the <i>Amazon Mobile Analytics API Reference and User
     * Guide</i>.
     * </p>
     * <p>
     * The ClientContext JSON must be base64-encoded and has a maximum size of
     * 3583 bytes.
     * </p>
     * <note>
     * <p>
     * <code>ClientContext</code> information is returned only if you use the
     * synchronous (<code>RequestResponse</code>) invocation type.
     * </p>
     * </note>
     *
     * @param clientContext <p>
     *            Using the <code>ClientContext</code> you can pass
     *            client-specific information to the Lambda function you are
     *            invoking. You can then process the client information in your
     *            Lambda function as you choose through the context variable.
     *            For an example of a <code>ClientContext</code> JSON, see <a
     *            href=
     *            "http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html"
     *            >PutEvents</a> in the <i>Amazon Mobile Analytics API Reference
     *            and User Guide</i>.
     *            </p>
     *            <p>
     *            The ClientContext JSON must be base64-encoded and has a
     *            maximum size of 3583 bytes.
     *            </p>
     *            <note>
     *            <p>
     *            <code>ClientContext</code> information is returned only if you
     *            use the synchronous (<code>RequestResponse</code>) invocation
     *            type.
     *            </p>
     *            </note>
     */
    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
    }

    /**
     * <p>
     * Using the <code>ClientContext</code> you can pass client-specific
     * information to the Lambda function you are invoking. You can then process
     * the client information in your Lambda function as you choose through the
     * context variable. For an example of a <code>ClientContext</code> JSON,
     * see <a href=
     * "http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html"
     * >PutEvents</a> in the <i>Amazon Mobile Analytics API Reference and User
     * Guide</i>.
     * </p>
     * <p>
     * The ClientContext JSON must be base64-encoded and has a maximum size of
     * 3583 bytes.
     * </p>
     * <note>
     * <p>
     * <code>ClientContext</code> information is returned only if you use the
     * synchronous (<code>RequestResponse</code>) invocation type.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientContext <p>
     *            Using the <code>ClientContext</code> you can pass
     *            client-specific information to the Lambda function you are
     *            invoking. You can then process the client information in your
     *            Lambda function as you choose through the context variable.
     *            For an example of a <code>ClientContext</code> JSON, see <a
     *            href=
     *            "http://docs.aws.amazon.com/mobileanalytics/latest/ug/PutEvents.html"
     *            >PutEvents</a> in the <i>Amazon Mobile Analytics API Reference
     *            and User Guide</i>.
     *            </p>
     *            <p>
     *            The ClientContext JSON must be base64-encoded and has a
     *            maximum size of 3583 bytes.
     *            </p>
     *            <note>
     *            <p>
     *            <code>ClientContext</code> information is returned only if you
     *            use the synchronous (<code>RequestResponse</code>) invocation
     *            type.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeRequest withClientContext(String clientContext) {
        this.clientContext = clientContext;
        return this;
    }

    /**
     * <p>
     * JSON that you want to provide to your Lambda function as input.
     * </p>
     *
     * @return <p>
     *         JSON that you want to provide to your Lambda function as input.
     *         </p>
     */
    public java.nio.ByteBuffer getPayload() {
        return payload;
    }

    /**
     * <p>
     * JSON that you want to provide to your Lambda function as input.
     * </p>
     *
     * @param payload <p>
     *            JSON that you want to provide to your Lambda function as
     *            input.
     *            </p>
     */
    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * JSON that you want to provide to your Lambda function as input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payload <p>
     *            JSON that you want to provide to your Lambda function as
     *            input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeRequest withPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
        return this;
    }

    /**
     * <p>
     * Specify a version or alias to invoke a published version of the function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     *
     * @return <p>
     *         Specify a version or alias to invoke a published version of the
     *         function.
     *         </p>
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * <p>
     * Specify a version or alias to invoke a published version of the function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     *
     * @param qualifier <p>
     *            Specify a version or alias to invoke a published version of
     *            the function.
     *            </p>
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * <p>
     * Specify a version or alias to invoke a published version of the function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(|[a-zA-Z0-9$_-]+)<br/>
     *
     * @param qualifier <p>
     *            Specify a version or alias to invoke a published version of
     *            the function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeRequest withQualifier(String qualifier) {
        this.qualifier = qualifier;
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
        if (getFunctionName() != null)
            sb.append("FunctionName: " + getFunctionName() + ",");
        if (getInvocationType() != null)
            sb.append("InvocationType: " + getInvocationType() + ",");
        if (getLogType() != null)
            sb.append("LogType: " + getLogType() + ",");
        if (getClientContext() != null)
            sb.append("ClientContext: " + getClientContext() + ",");
        if (getPayload() != null)
            sb.append("Payload: " + getPayload() + ",");
        if (getQualifier() != null)
            sb.append("Qualifier: " + getQualifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode
                + ((getInvocationType() == null) ? 0 : getInvocationType().hashCode());
        hashCode = prime * hashCode + ((getLogType() == null) ? 0 : getLogType().hashCode());
        hashCode = prime * hashCode
                + ((getClientContext() == null) ? 0 : getClientContext().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        hashCode = prime * hashCode + ((getQualifier() == null) ? 0 : getQualifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokeRequest == false)
            return false;
        InvokeRequest other = (InvokeRequest) obj;

        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null
                && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getInvocationType() == null ^ this.getInvocationType() == null)
            return false;
        if (other.getInvocationType() != null
                && other.getInvocationType().equals(this.getInvocationType()) == false)
            return false;
        if (other.getLogType() == null ^ this.getLogType() == null)
            return false;
        if (other.getLogType() != null && other.getLogType().equals(this.getLogType()) == false)
            return false;
        if (other.getClientContext() == null ^ this.getClientContext() == null)
            return false;
        if (other.getClientContext() != null
                && other.getClientContext().equals(this.getClientContext()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        if (other.getQualifier() == null ^ this.getQualifier() == null)
            return false;
        if (other.getQualifier() != null
                && other.getQualifier().equals(this.getQualifier()) == false)
            return false;
        return true;
    }
}
