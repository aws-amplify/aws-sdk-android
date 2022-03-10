/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class InvokeResult implements Serializable {
    /**
     * <p>
     * The HTTP status code is in the 200 range for a successful request. For
     * the <code>RequestResponse</code> invocation type, this status code is
     * 200. For the <code>Event</code> invocation type, this status code is 202.
     * For the <code>DryRun</code> invocation type, the status code is 204.
     * </p>
     */
    private Integer statusCode;

    /**
     * <p>
     * If present, indicates that an error occurred during function execution.
     * Details about the error are included in the response payload.
     * </p>
     */
    private String functionError;

    /**
     * <p>
     * The last 4 KB of the execution log, which is base64 encoded.
     * </p>
     */
    private String logResult;

    /**
     * <p>
     * The response from the function, or an error object.
     * </p>
     */
    private java.nio.ByteBuffer payload;

    /**
     * <p>
     * The version of the function that executed. When you invoke a function
     * with an alias, this indicates which version the alias resolved to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     */
    private String executedVersion;

    /**
     * <p>
     * The HTTP status code is in the 200 range for a successful request. For
     * the <code>RequestResponse</code> invocation type, this status code is
     * 200. For the <code>Event</code> invocation type, this status code is 202.
     * For the <code>DryRun</code> invocation type, the status code is 204.
     * </p>
     *
     * @return <p>
     *         The HTTP status code is in the 200 range for a successful
     *         request. For the <code>RequestResponse</code> invocation type,
     *         this status code is 200. For the <code>Event</code> invocation
     *         type, this status code is 202. For the <code>DryRun</code>
     *         invocation type, the status code is 204.
     *         </p>
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * <p>
     * The HTTP status code is in the 200 range for a successful request. For
     * the <code>RequestResponse</code> invocation type, this status code is
     * 200. For the <code>Event</code> invocation type, this status code is 202.
     * For the <code>DryRun</code> invocation type, the status code is 204.
     * </p>
     *
     * @param statusCode <p>
     *            The HTTP status code is in the 200 range for a successful
     *            request. For the <code>RequestResponse</code> invocation type,
     *            this status code is 200. For the <code>Event</code> invocation
     *            type, this status code is 202. For the <code>DryRun</code>
     *            invocation type, the status code is 204.
     *            </p>
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTTP status code is in the 200 range for a successful request. For
     * the <code>RequestResponse</code> invocation type, this status code is
     * 200. For the <code>Event</code> invocation type, this status code is 202.
     * For the <code>DryRun</code> invocation type, the status code is 204.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusCode <p>
     *            The HTTP status code is in the 200 range for a successful
     *            request. For the <code>RequestResponse</code> invocation type,
     *            this status code is 200. For the <code>Event</code> invocation
     *            type, this status code is 202. For the <code>DryRun</code>
     *            invocation type, the status code is 204.
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
     * If present, indicates that an error occurred during function execution.
     * Details about the error are included in the response payload.
     * </p>
     *
     * @return <p>
     *         If present, indicates that an error occurred during function
     *         execution. Details about the error are included in the response
     *         payload.
     *         </p>
     */
    public String getFunctionError() {
        return functionError;
    }

    /**
     * <p>
     * If present, indicates that an error occurred during function execution.
     * Details about the error are included in the response payload.
     * </p>
     *
     * @param functionError <p>
     *            If present, indicates that an error occurred during function
     *            execution. Details about the error are included in the
     *            response payload.
     *            </p>
     */
    public void setFunctionError(String functionError) {
        this.functionError = functionError;
    }

    /**
     * <p>
     * If present, indicates that an error occurred during function execution.
     * Details about the error are included in the response payload.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param functionError <p>
     *            If present, indicates that an error occurred during function
     *            execution. Details about the error are included in the
     *            response payload.
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
     * The last 4 KB of the execution log, which is base64 encoded.
     * </p>
     *
     * @return <p>
     *         The last 4 KB of the execution log, which is base64 encoded.
     *         </p>
     */
    public String getLogResult() {
        return logResult;
    }

    /**
     * <p>
     * The last 4 KB of the execution log, which is base64 encoded.
     * </p>
     *
     * @param logResult <p>
     *            The last 4 KB of the execution log, which is base64 encoded.
     *            </p>
     */
    public void setLogResult(String logResult) {
        this.logResult = logResult;
    }

    /**
     * <p>
     * The last 4 KB of the execution log, which is base64 encoded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logResult <p>
     *            The last 4 KB of the execution log, which is base64 encoded.
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
     * The response from the function, or an error object.
     * </p>
     *
     * @return <p>
     *         The response from the function, or an error object.
     *         </p>
     */
    public java.nio.ByteBuffer getPayload() {
        return payload;
    }

    /**
     * <p>
     * The response from the function, or an error object.
     * </p>
     *
     * @param payload <p>
     *            The response from the function, or an error object.
     *            </p>
     */
    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The response from the function, or an error object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payload <p>
     *            The response from the function, or an error object.
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
     * The version of the function that executed. When you invoke a function
     * with an alias, this indicates which version the alias resolved to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     *
     * @return <p>
     *         The version of the function that executed. When you invoke a
     *         function with an alias, this indicates which version the alias
     *         resolved to.
     *         </p>
     */
    public String getExecutedVersion() {
        return executedVersion;
    }

    /**
     * <p>
     * The version of the function that executed. When you invoke a function
     * with an alias, this indicates which version the alias resolved to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     *
     * @param executedVersion <p>
     *            The version of the function that executed. When you invoke a
     *            function with an alias, this indicates which version the alias
     *            resolved to.
     *            </p>
     */
    public void setExecutedVersion(String executedVersion) {
        this.executedVersion = executedVersion;
    }

    /**
     * <p>
     * The version of the function that executed. When you invoke a function
     * with an alias, this indicates which version the alias resolved to.
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
     *            The version of the function that executed. When you invoke a
     *            function with an alias, this indicates which version the alias
     *            resolved to.
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
