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

/**
 * <p>
 * Upon success, returns an empty response. Otherwise, throws an exception.
 * </p>
 */
public class InvokeResult implements Serializable {
    /**
     * <p>
     * The HTTP status code will be in the 200 range for successful request. For
     * the <code>RequestResponse</code> invocation type this status code will be
     * 200. For the <code>Event</code> invocation type this status code will be
     * 202. For the <code>DryRun</code> invocation type the status code will be
     * 204.
     * </p>
     */
    private Integer statusCode;

    /**
     * <p>
     * Indicates whether an error occurred while executing the Lambda function.
     * If an error occurred this field will have one of two values;
     * <code>Handled</code> or <code>Unhandled</code>. <code>Handled</code>
     * errors are errors that are reported by the function while the
     * <code>Unhandled</code> errors are those detected and reported by AWS
     * Lambda. Unhandled errors include out of memory errors and function
     * timeouts. For information about how to report an <code>Handled</code>
     * error, see <a href=
     * "http://docs.aws.amazon.com/lambda/latest/dg/programming-model.html"
     * >Programming Model</a>.
     * </p>
     */
    private String functionError;

    /**
     * <p>
     * It is the base64-encoded logs for the Lambda function invocation. This is
     * present only if the invocation type is <code>RequestResponse</code> and
     * the logs were requested.
     * </p>
     */
    private String logResult;

    /**
     * <p>
     * It is the JSON representation of the object returned by the Lambda
     * function. This is present only if the invocation type is
     * <code>RequestResponse</code>.
     * </p>
     * <p>
     * In the event of a function error this field contains a message describing
     * the error. For the <code>Handled</code> errors the Lambda function will
     * report this message. For <code>Unhandled</code> errors AWS Lambda reports
     * the message.
     * </p>
     */
    private java.nio.ByteBuffer payload;

    /**
     * <p>
     * The function version that has been executed. This value is returned only
     * if the invocation type is <code>RequestResponse</code>. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html"
     * >Traffic Shifting Using Aliases</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     */
    private String executedVersion;

    /**
     * <p>
     * The HTTP status code will be in the 200 range for successful request. For
     * the <code>RequestResponse</code> invocation type this status code will be
     * 200. For the <code>Event</code> invocation type this status code will be
     * 202. For the <code>DryRun</code> invocation type the status code will be
     * 204.
     * </p>
     *
     * @return <p>
     *         The HTTP status code will be in the 200 range for successful
     *         request. For the <code>RequestResponse</code> invocation type
     *         this status code will be 200. For the <code>Event</code>
     *         invocation type this status code will be 202. For the
     *         <code>DryRun</code> invocation type the status code will be 204.
     *         </p>
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * <p>
     * The HTTP status code will be in the 200 range for successful request. For
     * the <code>RequestResponse</code> invocation type this status code will be
     * 200. For the <code>Event</code> invocation type this status code will be
     * 202. For the <code>DryRun</code> invocation type the status code will be
     * 204.
     * </p>
     *
     * @param statusCode <p>
     *            The HTTP status code will be in the 200 range for successful
     *            request. For the <code>RequestResponse</code> invocation type
     *            this status code will be 200. For the <code>Event</code>
     *            invocation type this status code will be 202. For the
     *            <code>DryRun</code> invocation type the status code will be
     *            204.
     *            </p>
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTTP status code will be in the 200 range for successful request. For
     * the <code>RequestResponse</code> invocation type this status code will be
     * 200. For the <code>Event</code> invocation type this status code will be
     * 202. For the <code>DryRun</code> invocation type the status code will be
     * 204.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusCode <p>
     *            The HTTP status code will be in the 200 range for successful
     *            request. For the <code>RequestResponse</code> invocation type
     *            this status code will be 200. For the <code>Event</code>
     *            invocation type this status code will be 202. For the
     *            <code>DryRun</code> invocation type the status code will be
     *            204.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeResult withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * <p>
     * Indicates whether an error occurred while executing the Lambda function.
     * If an error occurred this field will have one of two values;
     * <code>Handled</code> or <code>Unhandled</code>. <code>Handled</code>
     * errors are errors that are reported by the function while the
     * <code>Unhandled</code> errors are those detected and reported by AWS
     * Lambda. Unhandled errors include out of memory errors and function
     * timeouts. For information about how to report an <code>Handled</code>
     * error, see <a href=
     * "http://docs.aws.amazon.com/lambda/latest/dg/programming-model.html"
     * >Programming Model</a>.
     * </p>
     *
     * @return <p>
     *         Indicates whether an error occurred while executing the Lambda
     *         function. If an error occurred this field will have one of two
     *         values; <code>Handled</code> or <code>Unhandled</code>.
     *         <code>Handled</code> errors are errors that are reported by the
     *         function while the <code>Unhandled</code> errors are those
     *         detected and reported by AWS Lambda. Unhandled errors include out
     *         of memory errors and function timeouts. For information about how
     *         to report an <code>Handled</code> error, see <a href=
     *         "http://docs.aws.amazon.com/lambda/latest/dg/programming-model.html"
     *         >Programming Model</a>.
     *         </p>
     */
    public String getFunctionError() {
        return functionError;
    }

    /**
     * <p>
     * Indicates whether an error occurred while executing the Lambda function.
     * If an error occurred this field will have one of two values;
     * <code>Handled</code> or <code>Unhandled</code>. <code>Handled</code>
     * errors are errors that are reported by the function while the
     * <code>Unhandled</code> errors are those detected and reported by AWS
     * Lambda. Unhandled errors include out of memory errors and function
     * timeouts. For information about how to report an <code>Handled</code>
     * error, see <a href=
     * "http://docs.aws.amazon.com/lambda/latest/dg/programming-model.html"
     * >Programming Model</a>.
     * </p>
     *
     * @param functionError <p>
     *            Indicates whether an error occurred while executing the Lambda
     *            function. If an error occurred this field will have one of two
     *            values; <code>Handled</code> or <code>Unhandled</code>.
     *            <code>Handled</code> errors are errors that are reported by
     *            the function while the <code>Unhandled</code> errors are those
     *            detected and reported by AWS Lambda. Unhandled errors include
     *            out of memory errors and function timeouts. For information
     *            about how to report an <code>Handled</code> error, see <a
     *            href=
     *            "http://docs.aws.amazon.com/lambda/latest/dg/programming-model.html"
     *            >Programming Model</a>.
     *            </p>
     */
    public void setFunctionError(String functionError) {
        this.functionError = functionError;
    }

    /**
     * <p>
     * Indicates whether an error occurred while executing the Lambda function.
     * If an error occurred this field will have one of two values;
     * <code>Handled</code> or <code>Unhandled</code>. <code>Handled</code>
     * errors are errors that are reported by the function while the
     * <code>Unhandled</code> errors are those detected and reported by AWS
     * Lambda. Unhandled errors include out of memory errors and function
     * timeouts. For information about how to report an <code>Handled</code>
     * error, see <a href=
     * "http://docs.aws.amazon.com/lambda/latest/dg/programming-model.html"
     * >Programming Model</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param functionError <p>
     *            Indicates whether an error occurred while executing the Lambda
     *            function. If an error occurred this field will have one of two
     *            values; <code>Handled</code> or <code>Unhandled</code>.
     *            <code>Handled</code> errors are errors that are reported by
     *            the function while the <code>Unhandled</code> errors are those
     *            detected and reported by AWS Lambda. Unhandled errors include
     *            out of memory errors and function timeouts. For information
     *            about how to report an <code>Handled</code> error, see <a
     *            href=
     *            "http://docs.aws.amazon.com/lambda/latest/dg/programming-model.html"
     *            >Programming Model</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeResult withFunctionError(String functionError) {
        this.functionError = functionError;
        return this;
    }

    /**
     * <p>
     * It is the base64-encoded logs for the Lambda function invocation. This is
     * present only if the invocation type is <code>RequestResponse</code> and
     * the logs were requested.
     * </p>
     *
     * @return <p>
     *         It is the base64-encoded logs for the Lambda function invocation.
     *         This is present only if the invocation type is
     *         <code>RequestResponse</code> and the logs were requested.
     *         </p>
     */
    public String getLogResult() {
        return logResult;
    }

    /**
     * <p>
     * It is the base64-encoded logs for the Lambda function invocation. This is
     * present only if the invocation type is <code>RequestResponse</code> and
     * the logs were requested.
     * </p>
     *
     * @param logResult <p>
     *            It is the base64-encoded logs for the Lambda function
     *            invocation. This is present only if the invocation type is
     *            <code>RequestResponse</code> and the logs were requested.
     *            </p>
     */
    public void setLogResult(String logResult) {
        this.logResult = logResult;
    }

    /**
     * <p>
     * It is the base64-encoded logs for the Lambda function invocation. This is
     * present only if the invocation type is <code>RequestResponse</code> and
     * the logs were requested.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logResult <p>
     *            It is the base64-encoded logs for the Lambda function
     *            invocation. This is present only if the invocation type is
     *            <code>RequestResponse</code> and the logs were requested.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeResult withLogResult(String logResult) {
        this.logResult = logResult;
        return this;
    }

    /**
     * <p>
     * It is the JSON representation of the object returned by the Lambda
     * function. This is present only if the invocation type is
     * <code>RequestResponse</code>.
     * </p>
     * <p>
     * In the event of a function error this field contains a message describing
     * the error. For the <code>Handled</code> errors the Lambda function will
     * report this message. For <code>Unhandled</code> errors AWS Lambda reports
     * the message.
     * </p>
     *
     * @return <p>
     *         It is the JSON representation of the object returned by the
     *         Lambda function. This is present only if the invocation type is
     *         <code>RequestResponse</code>.
     *         </p>
     *         <p>
     *         In the event of a function error this field contains a message
     *         describing the error. For the <code>Handled</code> errors the
     *         Lambda function will report this message. For
     *         <code>Unhandled</code> errors AWS Lambda reports the message.
     *         </p>
     */
    public java.nio.ByteBuffer getPayload() {
        return payload;
    }

    /**
     * <p>
     * It is the JSON representation of the object returned by the Lambda
     * function. This is present only if the invocation type is
     * <code>RequestResponse</code>.
     * </p>
     * <p>
     * In the event of a function error this field contains a message describing
     * the error. For the <code>Handled</code> errors the Lambda function will
     * report this message. For <code>Unhandled</code> errors AWS Lambda reports
     * the message.
     * </p>
     *
     * @param payload <p>
     *            It is the JSON representation of the object returned by the
     *            Lambda function. This is present only if the invocation type
     *            is <code>RequestResponse</code>.
     *            </p>
     *            <p>
     *            In the event of a function error this field contains a message
     *            describing the error. For the <code>Handled</code> errors the
     *            Lambda function will report this message. For
     *            <code>Unhandled</code> errors AWS Lambda reports the message.
     *            </p>
     */
    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * It is the JSON representation of the object returned by the Lambda
     * function. This is present only if the invocation type is
     * <code>RequestResponse</code>.
     * </p>
     * <p>
     * In the event of a function error this field contains a message describing
     * the error. For the <code>Handled</code> errors the Lambda function will
     * report this message. For <code>Unhandled</code> errors AWS Lambda reports
     * the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payload <p>
     *            It is the JSON representation of the object returned by the
     *            Lambda function. This is present only if the invocation type
     *            is <code>RequestResponse</code>.
     *            </p>
     *            <p>
     *            In the event of a function error this field contains a message
     *            describing the error. For the <code>Handled</code> errors the
     *            Lambda function will report this message. For
     *            <code>Unhandled</code> errors AWS Lambda reports the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeResult withPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
        return this;
    }

    /**
     * <p>
     * The function version that has been executed. This value is returned only
     * if the invocation type is <code>RequestResponse</code>. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html"
     * >Traffic Shifting Using Aliases</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     *
     * @return <p>
     *         The function version that has been executed. This value is
     *         returned only if the invocation type is
     *         <code>RequestResponse</code>. For more information, see <a href=
     *         "http://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html"
     *         >Traffic Shifting Using Aliases</a>.
     *         </p>
     */
    public String getExecutedVersion() {
        return executedVersion;
    }

    /**
     * <p>
     * The function version that has been executed. This value is returned only
     * if the invocation type is <code>RequestResponse</code>. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html"
     * >Traffic Shifting Using Aliases</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     *
     * @param executedVersion <p>
     *            The function version that has been executed. This value is
     *            returned only if the invocation type is
     *            <code>RequestResponse</code>. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html"
     *            >Traffic Shifting Using Aliases</a>.
     *            </p>
     */
    public void setExecutedVersion(String executedVersion) {
        this.executedVersion = executedVersion;
    }

    /**
     * <p>
     * The function version that has been executed. This value is returned only
     * if the invocation type is <code>RequestResponse</code>. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html"
     * >Traffic Shifting Using Aliases</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     *
     * @param executedVersion <p>
     *            The function version that has been executed. This value is
     *            returned only if the invocation type is
     *            <code>RequestResponse</code>. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html"
     *            >Traffic Shifting Using Aliases</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InvokeResult withExecutedVersion(String executedVersion) {
        this.executedVersion = executedVersion;
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
        if (getStatusCode() != null)
            sb.append("StatusCode: " + getStatusCode() + ",");
        if (getFunctionError() != null)
            sb.append("FunctionError: " + getFunctionError() + ",");
        if (getLogResult() != null)
            sb.append("LogResult: " + getLogResult() + ",");
        if (getPayload() != null)
            sb.append("Payload: " + getPayload() + ",");
        if (getExecutedVersion() != null)
            sb.append("ExecutedVersion: " + getExecutedVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode
                + ((getFunctionError() == null) ? 0 : getFunctionError().hashCode());
        hashCode = prime * hashCode + ((getLogResult() == null) ? 0 : getLogResult().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        hashCode = prime * hashCode
                + ((getExecutedVersion() == null) ? 0 : getExecutedVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokeResult == false)
            return false;
        InvokeResult other = (InvokeResult) obj;

        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null
                && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getFunctionError() == null ^ this.getFunctionError() == null)
            return false;
        if (other.getFunctionError() != null
                && other.getFunctionError().equals(this.getFunctionError()) == false)
            return false;
        if (other.getLogResult() == null ^ this.getLogResult() == null)
            return false;
        if (other.getLogResult() != null
                && other.getLogResult().equals(this.getLogResult()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        if (other.getExecutedVersion() == null ^ this.getExecutedVersion() == null)
            return false;
        if (other.getExecutedVersion() != null
                && other.getExecutedVersion().equals(this.getExecutedVersion()) == false)
            return false;
        return true;
    }
}
