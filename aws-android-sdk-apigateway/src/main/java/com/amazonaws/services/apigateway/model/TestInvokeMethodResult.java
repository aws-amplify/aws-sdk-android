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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the response of the test invoke request in the HTTP method.
 * </p>
 * <div class="seeAlso"> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-test-method.html#how-to-test-method-console"
 * >Test API using the API Gateway console</a> </div>
 */
public class TestInvokeMethodResult implements Serializable {
    /**
     * <p>
     * The HTTP status code.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The body of the HTTP response.
     * </p>
     */
    private String body;

    /**
     * <p>
     * The headers of the HTTP response.
     * </p>
     */
    private java.util.Map<String, String> headers;

    /**
     * <p>
     * The headers of the HTTP response as a map from string to list of values.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> multiValueHeaders;

    /**
     * <p>
     * The API Gateway execution log for the test invoke request.
     * </p>
     */
    private String log;

    /**
     * <p>
     * The execution latency of the test invoke request.
     * </p>
     */
    private Long latency;

    /**
     * <p>
     * The HTTP status code.
     * </p>
     *
     * @return <p>
     *         The HTTP status code.
     *         </p>
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * <p>
     * The HTTP status code.
     * </p>
     *
     * @param status <p>
     *            The HTTP status code.
     *            </p>
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The HTTP status code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodResult withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The body of the HTTP response.
     * </p>
     *
     * @return <p>
     *         The body of the HTTP response.
     *         </p>
     */
    public String getBody() {
        return body;
    }

    /**
     * <p>
     * The body of the HTTP response.
     * </p>
     *
     * @param body <p>
     *            The body of the HTTP response.
     *            </p>
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The body of the HTTP response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            The body of the HTTP response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodResult withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * The headers of the HTTP response.
     * </p>
     *
     * @return <p>
     *         The headers of the HTTP response.
     *         </p>
     */
    public java.util.Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * The headers of the HTTP response.
     * </p>
     *
     * @param headers <p>
     *            The headers of the HTTP response.
     *            </p>
     */
    public void setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * <p>
     * The headers of the HTTP response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param headers <p>
     *            The headers of the HTTP response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodResult withHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * <p>
     * The headers of the HTTP response.
     * </p>
     * <p>
     * The method adds a new key-value pair into headers parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into headers.
     * @param value The corresponding value of the entry to be added into
     *            headers.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodResult addheadersEntry(String key, String value) {
        if (null == this.headers) {
            this.headers = new java.util.HashMap<String, String>();
        }
        if (this.headers.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.headers.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into headers.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public TestInvokeMethodResult clearheadersEntries() {
        this.headers = null;
        return this;
    }

    /**
     * <p>
     * The headers of the HTTP response as a map from string to list of values.
     * </p>
     *
     * @return <p>
     *         The headers of the HTTP response as a map from string to list of
     *         values.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getMultiValueHeaders() {
        return multiValueHeaders;
    }

    /**
     * <p>
     * The headers of the HTTP response as a map from string to list of values.
     * </p>
     *
     * @param multiValueHeaders <p>
     *            The headers of the HTTP response as a map from string to list
     *            of values.
     *            </p>
     */
    public void setMultiValueHeaders(java.util.Map<String, java.util.List<String>> multiValueHeaders) {
        this.multiValueHeaders = multiValueHeaders;
    }

    /**
     * <p>
     * The headers of the HTTP response as a map from string to list of values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiValueHeaders <p>
     *            The headers of the HTTP response as a map from string to list
     *            of values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodResult withMultiValueHeaders(
            java.util.Map<String, java.util.List<String>> multiValueHeaders) {
        this.multiValueHeaders = multiValueHeaders;
        return this;
    }

    /**
     * <p>
     * The headers of the HTTP response as a map from string to list of values.
     * </p>
     * <p>
     * The method adds a new key-value pair into multiValueHeaders parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into multiValueHeaders.
     * @param value The corresponding value of the entry to be added into
     *            multiValueHeaders.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodResult addmultiValueHeadersEntry(String key, java.util.List<String> value) {
        if (null == this.multiValueHeaders) {
            this.multiValueHeaders = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.multiValueHeaders.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.multiValueHeaders.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into multiValueHeaders.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public TestInvokeMethodResult clearmultiValueHeadersEntries() {
        this.multiValueHeaders = null;
        return this;
    }

    /**
     * <p>
     * The API Gateway execution log for the test invoke request.
     * </p>
     *
     * @return <p>
     *         The API Gateway execution log for the test invoke request.
     *         </p>
     */
    public String getLog() {
        return log;
    }

    /**
     * <p>
     * The API Gateway execution log for the test invoke request.
     * </p>
     *
     * @param log <p>
     *            The API Gateway execution log for the test invoke request.
     *            </p>
     */
    public void setLog(String log) {
        this.log = log;
    }

    /**
     * <p>
     * The API Gateway execution log for the test invoke request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param log <p>
     *            The API Gateway execution log for the test invoke request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodResult withLog(String log) {
        this.log = log;
        return this;
    }

    /**
     * <p>
     * The execution latency of the test invoke request.
     * </p>
     *
     * @return <p>
     *         The execution latency of the test invoke request.
     *         </p>
     */
    public Long getLatency() {
        return latency;
    }

    /**
     * <p>
     * The execution latency of the test invoke request.
     * </p>
     *
     * @param latency <p>
     *            The execution latency of the test invoke request.
     *            </p>
     */
    public void setLatency(Long latency) {
        this.latency = latency;
    }

    /**
     * <p>
     * The execution latency of the test invoke request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latency <p>
     *            The execution latency of the test invoke request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodResult withLatency(Long latency) {
        this.latency = latency;
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
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getBody() != null)
            sb.append("body: " + getBody() + ",");
        if (getHeaders() != null)
            sb.append("headers: " + getHeaders() + ",");
        if (getMultiValueHeaders() != null)
            sb.append("multiValueHeaders: " + getMultiValueHeaders() + ",");
        if (getLog() != null)
            sb.append("log: " + getLog() + ",");
        if (getLatency() != null)
            sb.append("latency: " + getLatency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime * hashCode
                + ((getMultiValueHeaders() == null) ? 0 : getMultiValueHeaders().hashCode());
        hashCode = prime * hashCode + ((getLog() == null) ? 0 : getLog().hashCode());
        hashCode = prime * hashCode + ((getLatency() == null) ? 0 : getLatency().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestInvokeMethodResult == false)
            return false;
        TestInvokeMethodResult other = (TestInvokeMethodResult) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getMultiValueHeaders() == null ^ this.getMultiValueHeaders() == null)
            return false;
        if (other.getMultiValueHeaders() != null
                && other.getMultiValueHeaders().equals(this.getMultiValueHeaders()) == false)
            return false;
        if (other.getLog() == null ^ this.getLog() == null)
            return false;
        if (other.getLog() != null && other.getLog().equals(this.getLog()) == false)
            return false;
        if (other.getLatency() == null ^ this.getLatency() == null)
            return false;
        if (other.getLatency() != null && other.getLatency().equals(this.getLatency()) == false)
            return false;
        return true;
    }
}
