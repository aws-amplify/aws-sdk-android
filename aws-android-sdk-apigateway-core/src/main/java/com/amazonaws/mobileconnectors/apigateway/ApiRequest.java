/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.apigateway;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.StringUtils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

/**
 * Represents a request being sent to Amazon Api Gateway, including the
 * parameters being sent as part of the request, the endpoint to which the
 * request should be sent, etc.
 */
public class ApiRequest {

    private final Request<ApiResponse> request;

    /**
     * Constructor.
     *
     * @param serviceName The name of the service to which this request is being
     *            sent.
     */
    public ApiRequest(String serviceName) {
        request = new DefaultRequest<ApiResponse>(serviceName);
    }

    /**
     * Constructor.
     */
    public ApiRequest() {
        request = new DefaultRequest<ApiResponse>("");
    }

    /**
     * Sets all headers, clearing any existing ones.
     *
     * @param headers A map of all http headers
     * @return the updated request object.
     */
    public ApiRequest withHeaders(Map<String, String> headers) {
        request.setHeaders(headers);
        return this;
    }

    /**
     * Sets the header in the request.
     *
     * @param header the http header name.
     * @param value the http header value.
     * @return the updated request object.
     */
    public ApiRequest addHeader(String header, String value) {
        request.addHeader(header, value);
        return this;
    }

    /**
     * Returns a map of all the headers included in this request.
     *
     * @return A map of all the headers included in this request.
     */
    public Map<String, String> getHeaders() {
        return request.getHeaders();
    }

    /**
     * Sets the path to the resource being requested.
     *
     * @param path The path to the resource being requested.
     * @return the updated request object.
     */
    public ApiRequest withPath(String path) {
        request.setResourcePath(path);
        return this;
    }

    /**
     * Returns the path to the resource being requested.
     *
     * @return The path to the resource being requested.
     */
    public String getPath() {
        return request.getResourcePath();
    }

    /**
     * Sets all parameters, clearing any existing values.
     *
     * @param parameters the http request parameters.
     * @return the updated request object.
     */
    public ApiRequest withParameters(Map<String, String> parameters) {
        request.setParameters(parameters);
        return this;
    }

    /**
     * Returns a map of all parameters in this request.
     *
     * @return A map of all parameters in this request.
     */
    public Map<String, String> getParameters() {
        return request.getParameters();
    }

    /**
     * Set parameters with name and value.
     *
     * @param name the parameter name.
     * @param value the parameter value.
     * @return the updated request object.
     */
    public ApiRequest withParameter(String name, String value) {
        request.addParameter(name, value);
        return this;
    }

    /**
     * Sets the HTTP method (GET, POST, etc) to use when sending this request.
     *
     * @param httpMethod The HTTP method to use when sending this request.
     * @return the updated request object.
     */
    public ApiRequest withHttpMethod(HttpMethodName httpMethod) {
        request.setHttpMethod(httpMethod);
        return this;
    }

    /**
     * @return the {@link HttpMethodName}
     */
    public HttpMethodName getHttpMethod() {
        return request.getHttpMethod();
    }

    /**
     * Sets the optional stream containing the payload data to include for this
     * request. Not all requests will contain payload data.
     *
     * @param body The optional stream containing the payload data to include
     *            for this request.
     * @return the updated request object.
     */
    public ApiRequest withBody(InputStream body) {
        request.setContent(body);
        return this;
    }

    /**
     * Sets the optional stream containing the payload data from the byte array
     * to include for this request. Not all requests will contain payload data.
     *
     * @param body The request body represented as a array of bytes.
     * @return the updated request object.
     */
    public ApiRequest withBody(byte[] body) {
        request.setContent(new ByteArrayInputStream(body));
        return this;
    }

    /**
     * Sets the optional stream containing the payload data from a string
     * content to include for this request. Not all requests will contain
     * payload data.
     *
     * @param body the request body represented as a string.
     * @return the updated request object.
     */
    public ApiRequest withBody(String body) {
        final byte[] contentBytes = body.getBytes(StringUtils.UTF8);
        request.setContent(new ByteArrayInputStream(contentBytes));
        return this;
    }

    Request<ApiResponse> getRequest() {
        return request;
    }
}
