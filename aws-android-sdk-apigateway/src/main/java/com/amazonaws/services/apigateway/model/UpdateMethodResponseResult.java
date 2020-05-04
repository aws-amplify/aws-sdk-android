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
 * Represents a method response of a given HTTP status code returned to the
 * client. The method response is passed from the back end through the
 * associated integration response that can be transformed using a mapping
 * template.
 * </p>
 * <div class="remarks">
 * <p/>
 * <h4>Example: A <b>MethodResponse</b> instance of an API</h4>
 * <h5>Request</h5>
 * <p>
 * The example request retrieves a <b>MethodResponse</b> of the 200 status code.
 * </p>
 * 
 * <pre>
 * <code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160603T222952Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160603/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code>
 * </pre>
 * 
 * <h5>Response</h5>
 * <p>
 * The successful response returns <code>200 OK</code> status and a payload as
 * follows:
 * </p>
 * 
 * <pre>
 * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-response-{rel}.html", "name": "methodresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200", "title": "200" }, "methodresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200" }, "methodresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200" } }, "responseModels": { "application/json": "Empty" }, "responseParameters": { "method.response.header.Content-Type": false }, "statusCode": "200" }</code>
 * </pre>
 * <p/>
 * </div> <div class="seeAlso"> <a>Method</a>, <a>IntegrationResponse</a>,
 * <a>Integration</a> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html"
 * >Creating an API</a> </div>
 */
public class UpdateMethodResponseResult implements Serializable {
    /**
     * <p>
     * The method response's status code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[1-5]\d\d<br/>
     */
    private String statusCode;

    /**
     * <p>
     * A key-value map specifying required or optional response parameters that
     * API Gateway can send back to the caller. A key defines a method response
     * header and the value specifies whether the associated method response
     * header is required or not. The expression of the key must match the
     * pattern <code>method.response.header.{name}</code>, where
     * <code>name</code> is a valid and unique header name. API Gateway passes
     * certain integration response data to the method response headers
     * specified here according to the mapping you prescribe in the API's
     * <a>IntegrationResponse</a>. The integration response data that can be
     * mapped include an integration response header expressed in
     * <code>integration.response.header.{name}</code>, a static value enclosed
     * within a pair of single quotes (e.g., <code>'application/json'</code>),
     * or a JSON expression from the back-end response payload in the form of
     * <code>integration.response.body.{JSON-expression}</code>, where
     * <code>JSON-expression</code> is a valid JSON expression without the
     * <code>$</code> prefix.)
     * </p>
     */
    private java.util.Map<String, Boolean> responseParameters;

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the response's
     * content-type. Response models are represented as a key/value map, with a
     * content-type as the key and a <a>Model</a> name as the value.
     * </p>
     */
    private java.util.Map<String, String> responseModels;

    /**
     * <p>
     * The method response's status code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[1-5]\d\d<br/>
     *
     * @return <p>
     *         The method response's status code.
     *         </p>
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * <p>
     * The method response's status code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[1-5]\d\d<br/>
     *
     * @param statusCode <p>
     *            The method response's status code.
     *            </p>
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The method response's status code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[1-5]\d\d<br/>
     *
     * @param statusCode <p>
     *            The method response's status code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMethodResponseResult withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * <p>
     * A key-value map specifying required or optional response parameters that
     * API Gateway can send back to the caller. A key defines a method response
     * header and the value specifies whether the associated method response
     * header is required or not. The expression of the key must match the
     * pattern <code>method.response.header.{name}</code>, where
     * <code>name</code> is a valid and unique header name. API Gateway passes
     * certain integration response data to the method response headers
     * specified here according to the mapping you prescribe in the API's
     * <a>IntegrationResponse</a>. The integration response data that can be
     * mapped include an integration response header expressed in
     * <code>integration.response.header.{name}</code>, a static value enclosed
     * within a pair of single quotes (e.g., <code>'application/json'</code>),
     * or a JSON expression from the back-end response payload in the form of
     * <code>integration.response.body.{JSON-expression}</code>, where
     * <code>JSON-expression</code> is a valid JSON expression without the
     * <code>$</code> prefix.)
     * </p>
     *
     * @return <p>
     *         A key-value map specifying required or optional response
     *         parameters that API Gateway can send back to the caller. A key
     *         defines a method response header and the value specifies whether
     *         the associated method response header is required or not. The
     *         expression of the key must match the pattern
     *         <code>method.response.header.{name}</code>, where
     *         <code>name</code> is a valid and unique header name. API Gateway
     *         passes certain integration response data to the method response
     *         headers specified here according to the mapping you prescribe in
     *         the API's <a>IntegrationResponse</a>. The integration response
     *         data that can be mapped include an integration response header
     *         expressed in <code>integration.response.header.{name}</code>, a
     *         static value enclosed within a pair of single quotes (e.g.,
     *         <code>'application/json'</code>), or a JSON expression from the
     *         back-end response payload in the form of
     *         <code>integration.response.body.{JSON-expression}</code>, where
     *         <code>JSON-expression</code> is a valid JSON expression without
     *         the <code>$</code> prefix.)
     *         </p>
     */
    public java.util.Map<String, Boolean> getResponseParameters() {
        return responseParameters;
    }

    /**
     * <p>
     * A key-value map specifying required or optional response parameters that
     * API Gateway can send back to the caller. A key defines a method response
     * header and the value specifies whether the associated method response
     * header is required or not. The expression of the key must match the
     * pattern <code>method.response.header.{name}</code>, where
     * <code>name</code> is a valid and unique header name. API Gateway passes
     * certain integration response data to the method response headers
     * specified here according to the mapping you prescribe in the API's
     * <a>IntegrationResponse</a>. The integration response data that can be
     * mapped include an integration response header expressed in
     * <code>integration.response.header.{name}</code>, a static value enclosed
     * within a pair of single quotes (e.g., <code>'application/json'</code>),
     * or a JSON expression from the back-end response payload in the form of
     * <code>integration.response.body.{JSON-expression}</code>, where
     * <code>JSON-expression</code> is a valid JSON expression without the
     * <code>$</code> prefix.)
     * </p>
     *
     * @param responseParameters <p>
     *            A key-value map specifying required or optional response
     *            parameters that API Gateway can send back to the caller. A key
     *            defines a method response header and the value specifies
     *            whether the associated method response header is required or
     *            not. The expression of the key must match the pattern
     *            <code>method.response.header.{name}</code>, where
     *            <code>name</code> is a valid and unique header name. API
     *            Gateway passes certain integration response data to the method
     *            response headers specified here according to the mapping you
     *            prescribe in the API's <a>IntegrationResponse</a>. The
     *            integration response data that can be mapped include an
     *            integration response header expressed in
     *            <code>integration.response.header.{name}</code>, a static
     *            value enclosed within a pair of single quotes (e.g.,
     *            <code>'application/json'</code>), or a JSON expression from
     *            the back-end response payload in the form of
     *            <code>integration.response.body.{JSON-expression}</code>,
     *            where <code>JSON-expression</code> is a valid JSON expression
     *            without the <code>$</code> prefix.)
     *            </p>
     */
    public void setResponseParameters(java.util.Map<String, Boolean> responseParameters) {
        this.responseParameters = responseParameters;
    }

    /**
     * <p>
     * A key-value map specifying required or optional response parameters that
     * API Gateway can send back to the caller. A key defines a method response
     * header and the value specifies whether the associated method response
     * header is required or not. The expression of the key must match the
     * pattern <code>method.response.header.{name}</code>, where
     * <code>name</code> is a valid and unique header name. API Gateway passes
     * certain integration response data to the method response headers
     * specified here according to the mapping you prescribe in the API's
     * <a>IntegrationResponse</a>. The integration response data that can be
     * mapped include an integration response header expressed in
     * <code>integration.response.header.{name}</code>, a static value enclosed
     * within a pair of single quotes (e.g., <code>'application/json'</code>),
     * or a JSON expression from the back-end response payload in the form of
     * <code>integration.response.body.{JSON-expression}</code>, where
     * <code>JSON-expression</code> is a valid JSON expression without the
     * <code>$</code> prefix.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseParameters <p>
     *            A key-value map specifying required or optional response
     *            parameters that API Gateway can send back to the caller. A key
     *            defines a method response header and the value specifies
     *            whether the associated method response header is required or
     *            not. The expression of the key must match the pattern
     *            <code>method.response.header.{name}</code>, where
     *            <code>name</code> is a valid and unique header name. API
     *            Gateway passes certain integration response data to the method
     *            response headers specified here according to the mapping you
     *            prescribe in the API's <a>IntegrationResponse</a>. The
     *            integration response data that can be mapped include an
     *            integration response header expressed in
     *            <code>integration.response.header.{name}</code>, a static
     *            value enclosed within a pair of single quotes (e.g.,
     *            <code>'application/json'</code>), or a JSON expression from
     *            the back-end response payload in the form of
     *            <code>integration.response.body.{JSON-expression}</code>,
     *            where <code>JSON-expression</code> is a valid JSON expression
     *            without the <code>$</code> prefix.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMethodResponseResult withResponseParameters(
            java.util.Map<String, Boolean> responseParameters) {
        this.responseParameters = responseParameters;
        return this;
    }

    /**
     * <p>
     * A key-value map specifying required or optional response parameters that
     * API Gateway can send back to the caller. A key defines a method response
     * header and the value specifies whether the associated method response
     * header is required or not. The expression of the key must match the
     * pattern <code>method.response.header.{name}</code>, where
     * <code>name</code> is a valid and unique header name. API Gateway passes
     * certain integration response data to the method response headers
     * specified here according to the mapping you prescribe in the API's
     * <a>IntegrationResponse</a>. The integration response data that can be
     * mapped include an integration response header expressed in
     * <code>integration.response.header.{name}</code>, a static value enclosed
     * within a pair of single quotes (e.g., <code>'application/json'</code>),
     * or a JSON expression from the back-end response payload in the form of
     * <code>integration.response.body.{JSON-expression}</code>, where
     * <code>JSON-expression</code> is a valid JSON expression without the
     * <code>$</code> prefix.)
     * </p>
     * <p>
     * The method adds a new key-value pair into responseParameters parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into responseParameters.
     * @param value The corresponding value of the entry to be added into
     *            responseParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMethodResponseResult addresponseParametersEntry(String key, Boolean value) {
        if (null == this.responseParameters) {
            this.responseParameters = new java.util.HashMap<String, Boolean>();
        }
        if (this.responseParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.responseParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into responseParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateMethodResponseResult clearresponseParametersEntries() {
        this.responseParameters = null;
        return this;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the response's
     * content-type. Response models are represented as a key/value map, with a
     * content-type as the key and a <a>Model</a> name as the value.
     * </p>
     *
     * @return <p>
     *         Specifies the <a>Model</a> resources used for the response's
     *         content-type. Response models are represented as a key/value map,
     *         with a content-type as the key and a <a>Model</a> name as the
     *         value.
     *         </p>
     */
    public java.util.Map<String, String> getResponseModels() {
        return responseModels;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the response's
     * content-type. Response models are represented as a key/value map, with a
     * content-type as the key and a <a>Model</a> name as the value.
     * </p>
     *
     * @param responseModels <p>
     *            Specifies the <a>Model</a> resources used for the response's
     *            content-type. Response models are represented as a key/value
     *            map, with a content-type as the key and a <a>Model</a> name as
     *            the value.
     *            </p>
     */
    public void setResponseModels(java.util.Map<String, String> responseModels) {
        this.responseModels = responseModels;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the response's
     * content-type. Response models are represented as a key/value map, with a
     * content-type as the key and a <a>Model</a> name as the value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseModels <p>
     *            Specifies the <a>Model</a> resources used for the response's
     *            content-type. Response models are represented as a key/value
     *            map, with a content-type as the key and a <a>Model</a> name as
     *            the value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMethodResponseResult withResponseModels(
            java.util.Map<String, String> responseModels) {
        this.responseModels = responseModels;
        return this;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the response's
     * content-type. Response models are represented as a key/value map, with a
     * content-type as the key and a <a>Model</a> name as the value.
     * </p>
     * <p>
     * The method adds a new key-value pair into responseModels parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into responseModels.
     * @param value The corresponding value of the entry to be added into
     *            responseModels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMethodResponseResult addresponseModelsEntry(String key, String value) {
        if (null == this.responseModels) {
            this.responseModels = new java.util.HashMap<String, String>();
        }
        if (this.responseModels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.responseModels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into responseModels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateMethodResponseResult clearresponseModelsEntries() {
        this.responseModels = null;
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
            sb.append("statusCode: " + getStatusCode() + ",");
        if (getResponseParameters() != null)
            sb.append("responseParameters: " + getResponseParameters() + ",");
        if (getResponseModels() != null)
            sb.append("responseModels: " + getResponseModels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode
                + ((getResponseParameters() == null) ? 0 : getResponseParameters().hashCode());
        hashCode = prime * hashCode
                + ((getResponseModels() == null) ? 0 : getResponseModels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMethodResponseResult == false)
            return false;
        UpdateMethodResponseResult other = (UpdateMethodResponseResult) obj;

        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null
                && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getResponseParameters() == null ^ this.getResponseParameters() == null)
            return false;
        if (other.getResponseParameters() != null
                && other.getResponseParameters().equals(this.getResponseParameters()) == false)
            return false;
        if (other.getResponseModels() == null ^ this.getResponseModels() == null)
            return false;
        if (other.getResponseModels() != null
                && other.getResponseModels().equals(this.getResponseModels()) == false)
            return false;
        return true;
    }
}
