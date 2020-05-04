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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Simulate the execution of a <a>Method</a> in your <a>RestApi</a> with
 * headers, parameters, and an incoming request body.
 * </p>
 */
public class TestInvokeMethodRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * [Required] Specifies a test invoke method request's resource ID.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * [Required] Specifies a test invoke method request's HTTP method.
     * </p>
     */
    private String httpMethod;

    /**
     * <p>
     * The URI path, including query string, of the simulated invocation
     * request. Use this to specify path parameters and query string parameters.
     * </p>
     */
    private String pathWithQueryString;

    /**
     * <p>
     * The simulated request body of an incoming invocation request.
     * </p>
     */
    private String body;

    /**
     * <p>
     * A key-value map of headers to simulate an incoming invocation request.
     * </p>
     */
    private java.util.Map<String, String> headers;

    /**
     * <p>
     * The headers as a map from string to list of values to simulate an
     * incoming invocation request.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> multiValueHeaders;

    /**
     * <p>
     * A <a>ClientCertificate</a> identifier to use in the test invocation. API
     * Gateway will use the certificate when making the HTTPS request to the
     * defined back-end endpoint.
     * </p>
     */
    private String clientCertificateId;

    /**
     * <p>
     * A key-value map of stage variables to simulate an invocation on a
     * deployed <a>Stage</a>.
     * </p>
     */
    private java.util.Map<String, String> stageVariables;

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     *
     * @return <p>
     *         [Required] The string identifier of the associated
     *         <a>RestApi</a>.
     *         </p>
     */
    public String getRestApiId() {
        return restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     *
     * @param restApiId <p>
     *            [Required] The string identifier of the associated
     *            <a>RestApi</a>.
     *            </p>
     */
    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restApiId <p>
     *            [Required] The string identifier of the associated
     *            <a>RestApi</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodRequest withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * <p>
     * [Required] Specifies a test invoke method request's resource ID.
     * </p>
     *
     * @return <p>
     *         [Required] Specifies a test invoke method request's resource ID.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * [Required] Specifies a test invoke method request's resource ID.
     * </p>
     *
     * @param resourceId <p>
     *            [Required] Specifies a test invoke method request's resource
     *            ID.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * [Required] Specifies a test invoke method request's resource ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceId <p>
     *            [Required] Specifies a test invoke method request's resource
     *            ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * [Required] Specifies a test invoke method request's HTTP method.
     * </p>
     *
     * @return <p>
     *         [Required] Specifies a test invoke method request's HTTP method.
     *         </p>
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * <p>
     * [Required] Specifies a test invoke method request's HTTP method.
     * </p>
     *
     * @param httpMethod <p>
     *            [Required] Specifies a test invoke method request's HTTP
     *            method.
     *            </p>
     */
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * [Required] Specifies a test invoke method request's HTTP method.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param httpMethod <p>
     *            [Required] Specifies a test invoke method request's HTTP
     *            method.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodRequest withHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /**
     * <p>
     * The URI path, including query string, of the simulated invocation
     * request. Use this to specify path parameters and query string parameters.
     * </p>
     *
     * @return <p>
     *         The URI path, including query string, of the simulated invocation
     *         request. Use this to specify path parameters and query string
     *         parameters.
     *         </p>
     */
    public String getPathWithQueryString() {
        return pathWithQueryString;
    }

    /**
     * <p>
     * The URI path, including query string, of the simulated invocation
     * request. Use this to specify path parameters and query string parameters.
     * </p>
     *
     * @param pathWithQueryString <p>
     *            The URI path, including query string, of the simulated
     *            invocation request. Use this to specify path parameters and
     *            query string parameters.
     *            </p>
     */
    public void setPathWithQueryString(String pathWithQueryString) {
        this.pathWithQueryString = pathWithQueryString;
    }

    /**
     * <p>
     * The URI path, including query string, of the simulated invocation
     * request. Use this to specify path parameters and query string parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pathWithQueryString <p>
     *            The URI path, including query string, of the simulated
     *            invocation request. Use this to specify path parameters and
     *            query string parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodRequest withPathWithQueryString(String pathWithQueryString) {
        this.pathWithQueryString = pathWithQueryString;
        return this;
    }

    /**
     * <p>
     * The simulated request body of an incoming invocation request.
     * </p>
     *
     * @return <p>
     *         The simulated request body of an incoming invocation request.
     *         </p>
     */
    public String getBody() {
        return body;
    }

    /**
     * <p>
     * The simulated request body of an incoming invocation request.
     * </p>
     *
     * @param body <p>
     *            The simulated request body of an incoming invocation request.
     *            </p>
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The simulated request body of an incoming invocation request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            The simulated request body of an incoming invocation request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodRequest withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * A key-value map of headers to simulate an incoming invocation request.
     * </p>
     *
     * @return <p>
     *         A key-value map of headers to simulate an incoming invocation
     *         request.
     *         </p>
     */
    public java.util.Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * A key-value map of headers to simulate an incoming invocation request.
     * </p>
     *
     * @param headers <p>
     *            A key-value map of headers to simulate an incoming invocation
     *            request.
     *            </p>
     */
    public void setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * <p>
     * A key-value map of headers to simulate an incoming invocation request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param headers <p>
     *            A key-value map of headers to simulate an incoming invocation
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodRequest withHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * <p>
     * A key-value map of headers to simulate an incoming invocation request.
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
    public TestInvokeMethodRequest addheadersEntry(String key, String value) {
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
    public TestInvokeMethodRequest clearheadersEntries() {
        this.headers = null;
        return this;
    }

    /**
     * <p>
     * The headers as a map from string to list of values to simulate an
     * incoming invocation request.
     * </p>
     *
     * @return <p>
     *         The headers as a map from string to list of values to simulate an
     *         incoming invocation request.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getMultiValueHeaders() {
        return multiValueHeaders;
    }

    /**
     * <p>
     * The headers as a map from string to list of values to simulate an
     * incoming invocation request.
     * </p>
     *
     * @param multiValueHeaders <p>
     *            The headers as a map from string to list of values to simulate
     *            an incoming invocation request.
     *            </p>
     */
    public void setMultiValueHeaders(java.util.Map<String, java.util.List<String>> multiValueHeaders) {
        this.multiValueHeaders = multiValueHeaders;
    }

    /**
     * <p>
     * The headers as a map from string to list of values to simulate an
     * incoming invocation request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiValueHeaders <p>
     *            The headers as a map from string to list of values to simulate
     *            an incoming invocation request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodRequest withMultiValueHeaders(
            java.util.Map<String, java.util.List<String>> multiValueHeaders) {
        this.multiValueHeaders = multiValueHeaders;
        return this;
    }

    /**
     * <p>
     * The headers as a map from string to list of values to simulate an
     * incoming invocation request.
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
    public TestInvokeMethodRequest addmultiValueHeadersEntry(String key,
            java.util.List<String> value) {
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
    public TestInvokeMethodRequest clearmultiValueHeadersEntries() {
        this.multiValueHeaders = null;
        return this;
    }

    /**
     * <p>
     * A <a>ClientCertificate</a> identifier to use in the test invocation. API
     * Gateway will use the certificate when making the HTTPS request to the
     * defined back-end endpoint.
     * </p>
     *
     * @return <p>
     *         A <a>ClientCertificate</a> identifier to use in the test
     *         invocation. API Gateway will use the certificate when making the
     *         HTTPS request to the defined back-end endpoint.
     *         </p>
     */
    public String getClientCertificateId() {
        return clientCertificateId;
    }

    /**
     * <p>
     * A <a>ClientCertificate</a> identifier to use in the test invocation. API
     * Gateway will use the certificate when making the HTTPS request to the
     * defined back-end endpoint.
     * </p>
     *
     * @param clientCertificateId <p>
     *            A <a>ClientCertificate</a> identifier to use in the test
     *            invocation. API Gateway will use the certificate when making
     *            the HTTPS request to the defined back-end endpoint.
     *            </p>
     */
    public void setClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    /**
     * <p>
     * A <a>ClientCertificate</a> identifier to use in the test invocation. API
     * Gateway will use the certificate when making the HTTPS request to the
     * defined back-end endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientCertificateId <p>
     *            A <a>ClientCertificate</a> identifier to use in the test
     *            invocation. API Gateway will use the certificate when making
     *            the HTTPS request to the defined back-end endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodRequest withClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
        return this;
    }

    /**
     * <p>
     * A key-value map of stage variables to simulate an invocation on a
     * deployed <a>Stage</a>.
     * </p>
     *
     * @return <p>
     *         A key-value map of stage variables to simulate an invocation on a
     *         deployed <a>Stage</a>.
     *         </p>
     */
    public java.util.Map<String, String> getStageVariables() {
        return stageVariables;
    }

    /**
     * <p>
     * A key-value map of stage variables to simulate an invocation on a
     * deployed <a>Stage</a>.
     * </p>
     *
     * @param stageVariables <p>
     *            A key-value map of stage variables to simulate an invocation
     *            on a deployed <a>Stage</a>.
     *            </p>
     */
    public void setStageVariables(java.util.Map<String, String> stageVariables) {
        this.stageVariables = stageVariables;
    }

    /**
     * <p>
     * A key-value map of stage variables to simulate an invocation on a
     * deployed <a>Stage</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stageVariables <p>
     *            A key-value map of stage variables to simulate an invocation
     *            on a deployed <a>Stage</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodRequest withStageVariables(java.util.Map<String, String> stageVariables) {
        this.stageVariables = stageVariables;
        return this;
    }

    /**
     * <p>
     * A key-value map of stage variables to simulate an invocation on a
     * deployed <a>Stage</a>.
     * </p>
     * <p>
     * The method adds a new key-value pair into stageVariables parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into stageVariables.
     * @param value The corresponding value of the entry to be added into
     *            stageVariables.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodRequest addstageVariablesEntry(String key, String value) {
        if (null == this.stageVariables) {
            this.stageVariables = new java.util.HashMap<String, String>();
        }
        if (this.stageVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.stageVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into stageVariables.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public TestInvokeMethodRequest clearstageVariablesEntries() {
        this.stageVariables = null;
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
        if (getRestApiId() != null)
            sb.append("restApiId: " + getRestApiId() + ",");
        if (getResourceId() != null)
            sb.append("resourceId: " + getResourceId() + ",");
        if (getHttpMethod() != null)
            sb.append("httpMethod: " + getHttpMethod() + ",");
        if (getPathWithQueryString() != null)
            sb.append("pathWithQueryString: " + getPathWithQueryString() + ",");
        if (getBody() != null)
            sb.append("body: " + getBody() + ",");
        if (getHeaders() != null)
            sb.append("headers: " + getHeaders() + ",");
        if (getMultiValueHeaders() != null)
            sb.append("multiValueHeaders: " + getMultiValueHeaders() + ",");
        if (getClientCertificateId() != null)
            sb.append("clientCertificateId: " + getClientCertificateId() + ",");
        if (getStageVariables() != null)
            sb.append("stageVariables: " + getStageVariables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode
                + ((getPathWithQueryString() == null) ? 0 : getPathWithQueryString().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime * hashCode
                + ((getMultiValueHeaders() == null) ? 0 : getMultiValueHeaders().hashCode());
        hashCode = prime * hashCode
                + ((getClientCertificateId() == null) ? 0 : getClientCertificateId().hashCode());
        hashCode = prime * hashCode
                + ((getStageVariables() == null) ? 0 : getStageVariables().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestInvokeMethodRequest == false)
            return false;
        TestInvokeMethodRequest other = (TestInvokeMethodRequest) obj;

        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null)
            return false;
        if (other.getHttpMethod() != null
                && other.getHttpMethod().equals(this.getHttpMethod()) == false)
            return false;
        if (other.getPathWithQueryString() == null ^ this.getPathWithQueryString() == null)
            return false;
        if (other.getPathWithQueryString() != null
                && other.getPathWithQueryString().equals(this.getPathWithQueryString()) == false)
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
        if (other.getClientCertificateId() == null ^ this.getClientCertificateId() == null)
            return false;
        if (other.getClientCertificateId() != null
                && other.getClientCertificateId().equals(this.getClientCertificateId()) == false)
            return false;
        if (other.getStageVariables() == null ^ this.getStageVariables() == null)
            return false;
        if (other.getStageVariables() != null
                && other.getStageVariables().equals(this.getStageVariables()) == false)
            return false;
        return true;
    }
}
