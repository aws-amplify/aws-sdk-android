/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Invokes a Lambda function. You can invoke a function synchronously (and wait
 * for the response), or asynchronously. To invoke a function asynchronously,
 * set <code>InvocationType</code> to <code>Event</code>.
 * </p>
 * <p>
 * For <a
 * href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-sync.html"
 * >synchronous invocation</a>, details about the function response, including
 * errors, are included in the response body and headers. For either invocation
 * type, you can find more information in the <a href=
 * "https://docs.aws.amazon.com/lambda/latest/dg/monitoring-functions.html"
 * >execution log</a> and <a
 * href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-x-ray.html"
 * >trace</a>.
 * </p>
 * <p>
 * When an error occurs, your function may be invoked multiple times. Retry
 * behavior varies by error type, client, event source, and invocation type. For
 * example, if you invoke a function asynchronously and it returns an error,
 * Lambda executes the function up to two more times. For more information, see
 * <a
 * href="https://docs.aws.amazon.com/lambda/latest/dg/retries-on-errors.html">
 * Retry Behavior</a>.
 * </p>
 * <p>
 * For <a
 * href="https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html"
 * >asynchronous invocation</a>, Lambda adds events to a queue before sending
 * them to your function. If your function does not have enough capacity to keep
 * up with the queue, events may be lost. Occasionally, your function may
 * receive the same event multiple times, even if no error occurs. To retain
 * events that were not processed, configure your function with a <a href=
 * "https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq"
 * >dead-letter queue</a>.
 * </p>
 * <p>
 * The status code in the API response doesn't reflect function errors. Error
 * codes are reserved for errors that prevent your function from executing, such
 * as permissions errors, <a
 * href="https://docs.aws.amazon.com/lambda/latest/dg/limits.html">limit
 * errors</a>, or issues with your function's code and configuration. For
 * example, Lambda returns <code>TooManyRequestsException</code> if executing
 * the function would cause you to exceed a concurrency limit at either the
 * account level (<code>ConcurrentInvocationLimitExceeded</code>) or function
 * level (<code>ReservedFunctionConcurrentInvocationLimitExceeded</code>).
 * </p>
 * <p>
 * For functions with a long timeout, your client might be disconnected during
 * synchronous invocation while it waits for a response. Configure your HTTP
 * client, SDK, firewall, proxy, or operating system to allow for long
 * connections with timeout or keep-alive settings.
 * </p>
 * <p>
 * This operation requires permission for the <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/list_awslambda.html"
 * >lambda:InvokeFunction</a> action.
 * </p>
 */
public class InvokeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only),
     * <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> -
     * <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The
     * length constraint applies only to the full ARN. If you specify only the
     * function name, it is limited to 64 characters in length.
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
     * response or times out. The API response includes the function response
     * and additional data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that
     * fail multiple times to the function's dead-letter queue (if it's
     * configured). The API response only includes a status code.
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
     * Set to <code>Tail</code> to include the execution log in the response.
     * Applies to synchronously invoked functions only.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     */
    private String logType;

    /**
     * <p>
     * Up to 3583 bytes of base64-encoded data about the invoking client to pass
     * to the function in the context object.
     * </p>
     */
    private String clientContext;

    /**
     * <p>
     * The JSON that you want to provide to your Lambda function as input.
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
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only),
     * <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> -
     * <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The
     * length constraint applies only to the full ARN. If you specify only the
     * function name, it is limited to 64 characters in length.
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
     *         The name of the Lambda function, version, or alias.
     *         </p>
     *         <p class="title">
     *         <b>Name formats</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Function name</b> - <code>my-function</code> (name-only),
     *         <code>my-function:v1</code> (with alias).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Function ARN</b> -
     *         <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Partial ARN</b> -
     *         <code>123456789012:function:my-function</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can append a version number or alias to any of the formats.
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
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only),
     * <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> -
     * <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The
     * length constraint applies only to the full ARN. If you specify only the
     * function name, it is limited to 64 characters in length.
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
     *            The name of the Lambda function, version, or alias.
     *            </p>
     *            <p class="title">
     *            <b>Name formats</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Function name</b> - <code>my-function</code> (name-only),
     *            <code>my-function:v1</code> (with alias).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Function ARN</b> -
     *            <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Partial ARN</b> -
     *            <code>123456789012:function:my-function</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can append a version number or alias to any of the
     *            formats. The length constraint applies only to the full ARN.
     *            If you specify only the function name, it is limited to 64
     *            characters in length.
     *            </p>
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only),
     * <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> -
     * <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The
     * length constraint applies only to the full ARN. If you specify only the
     * function name, it is limited to 64 characters in length.
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
     *            The name of the Lambda function, version, or alias.
     *            </p>
     *            <p class="title">
     *            <b>Name formats</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>Function name</b> - <code>my-function</code> (name-only),
     *            <code>my-function:v1</code> (with alias).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Function ARN</b> -
     *            <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>
     *            .
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Partial ARN</b> -
     *            <code>123456789012:function:my-function</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can append a version number or alias to any of the
     *            formats. The length constraint applies only to the full ARN.
     *            If you specify only the function name, it is limited to 64
     *            characters in length.
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
     * response or times out. The API response includes the function response
     * and additional data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that
     * fail multiple times to the function's dead-letter queue (if it's
     * configured). The API response only includes a status code.
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
     *         returns a response or times out. The API response includes the
     *         function response and additional data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Event</code> - Invoke the function asynchronously. Send
     *         events that fail multiple times to the function's dead-letter
     *         queue (if it's configured). The API response only includes a
     *         status code.
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
     * response or times out. The API response includes the function response
     * and additional data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that
     * fail multiple times to the function's dead-letter queue (if it's
     * configured). The API response only includes a status code.
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
     *            returns a response or times out. The API response includes the
     *            function response and additional data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Event</code> - Invoke the function asynchronously. Send
     *            events that fail multiple times to the function's dead-letter
     *            queue (if it's configured). The API response only includes a
     *            status code.
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
     * response or times out. The API response includes the function response
     * and additional data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that
     * fail multiple times to the function's dead-letter queue (if it's
     * configured). The API response only includes a status code.
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
     *            returns a response or times out. The API response includes the
     *            function response and additional data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Event</code> - Invoke the function asynchronously. Send
     *            events that fail multiple times to the function's dead-letter
     *            queue (if it's configured). The API response only includes a
     *            status code.
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
     * response or times out. The API response includes the function response
     * and additional data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that
     * fail multiple times to the function's dead-letter queue (if it's
     * configured). The API response only includes a status code.
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
     *            returns a response or times out. The API response includes the
     *            function response and additional data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Event</code> - Invoke the function asynchronously. Send
     *            events that fail multiple times to the function's dead-letter
     *            queue (if it's configured). The API response only includes a
     *            status code.
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
     * response or times out. The API response includes the function response
     * and additional data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Event</code> - Invoke the function asynchronously. Send events that
     * fail multiple times to the function's dead-letter queue (if it's
     * configured). The API response only includes a status code.
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
     *            returns a response or times out. The API response includes the
     *            function response and additional data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Event</code> - Invoke the function asynchronously. Send
     *            events that fail multiple times to the function's dead-letter
     *            queue (if it's configured). The API response only includes a
     *            status code.
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
     * Set to <code>Tail</code> to include the execution log in the response.
     * Applies to synchronously invoked functions only.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @return <p>
     *         Set to <code>Tail</code> to include the execution log in the
     *         response. Applies to synchronously invoked functions only.
     *         </p>
     * @see LogType
     */
    public String getLogType() {
        return logType;
    }

    /**
     * <p>
     * Set to <code>Tail</code> to include the execution log in the response.
     * Applies to synchronously invoked functions only.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @param logType <p>
     *            Set to <code>Tail</code> to include the execution log in the
     *            response. Applies to synchronously invoked functions only.
     *            </p>
     * @see LogType
     */
    public void setLogType(String logType) {
        this.logType = logType;
    }

    /**
     * <p>
     * Set to <code>Tail</code> to include the execution log in the response.
     * Applies to synchronously invoked functions only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @param logType <p>
     *            Set to <code>Tail</code> to include the execution log in the
     *            response. Applies to synchronously invoked functions only.
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
     * Set to <code>Tail</code> to include the execution log in the response.
     * Applies to synchronously invoked functions only.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @param logType <p>
     *            Set to <code>Tail</code> to include the execution log in the
     *            response. Applies to synchronously invoked functions only.
     *            </p>
     * @see LogType
     */
    public void setLogType(LogType logType) {
        this.logType = logType.toString();
    }

    /**
     * <p>
     * Set to <code>Tail</code> to include the execution log in the response.
     * Applies to synchronously invoked functions only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Tail
     *
     * @param logType <p>
     *            Set to <code>Tail</code> to include the execution log in the
     *            response. Applies to synchronously invoked functions only.
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
     * Up to 3583 bytes of base64-encoded data about the invoking client to pass
     * to the function in the context object.
     * </p>
     *
     * @return <p>
     *         Up to 3583 bytes of base64-encoded data about the invoking client
     *         to pass to the function in the context object.
     *         </p>
     */
    public String getClientContext() {
        return clientContext;
    }

    /**
     * <p>
     * Up to 3583 bytes of base64-encoded data about the invoking client to pass
     * to the function in the context object.
     * </p>
     *
     * @param clientContext <p>
     *            Up to 3583 bytes of base64-encoded data about the invoking
     *            client to pass to the function in the context object.
     *            </p>
     */
    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
    }

    /**
     * <p>
     * Up to 3583 bytes of base64-encoded data about the invoking client to pass
     * to the function in the context object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientContext <p>
     *            Up to 3583 bytes of base64-encoded data about the invoking
     *            client to pass to the function in the context object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeRequest withClientContext(String clientContext) {
        this.clientContext = clientContext;
        return this;
    }

    /**
     * <p>
     * The JSON that you want to provide to your Lambda function as input.
     * </p>
     *
     * @return <p>
     *         The JSON that you want to provide to your Lambda function as
     *         input.
     *         </p>
     */
    public java.nio.ByteBuffer getPayload() {
        return payload;
    }

    /**
     * <p>
     * The JSON that you want to provide to your Lambda function as input.
     * </p>
     *
     * @param payload <p>
     *            The JSON that you want to provide to your Lambda function as
     *            input.
     *            </p>
     */
    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The JSON that you want to provide to your Lambda function as input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payload <p>
     *            The JSON that you want to provide to your Lambda function as
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
