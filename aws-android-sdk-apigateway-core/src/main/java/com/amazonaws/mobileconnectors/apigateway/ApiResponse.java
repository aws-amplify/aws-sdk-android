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

import com.amazonaws.http.HttpResponse;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * Represents an HTTP response returned by Amazon Api Gateway when using the
 * generic execute method.
 */
public class ApiResponse {

    private final HttpResponse response;

    ApiResponse(HttpResponse response) {
        this.response = response;
    }

    /**
     * Returns the HTTP headers returned with this response.
     *
     * @return The set of HTTP headers returned with this HTTP response.
     */
    public Map<String, String> getHeaders() {
        return response.getHeaders();
    }

    /**
     * Returns the input stream containing the response content.
     *
     * @return The input stream containing the response content.
     * @throws IOException if an I/O error has occurred
     */
    public InputStream getContent() throws IOException {
        return response.getContent();
    }

    /**
     * Get the raw content without considering Content-Encoding. This is useful
     * if you want full control of the content.
     *
     * @return the raw content input stream.
     * @throws IOException if an I/O error has occurred
     */
    public InputStream getRawContent() throws IOException {
        return response.getRawContent();
    }

    /**
     * Returns the HTTP status text associated with this response.
     *
     * @return The HTTP status text associated with this response.
     */
    public String getStatusText() {
        return response.getStatusText();
    }

    /**
     * Returns the HTTP status code (ex: 200, 404, etc) associated with this
     * response.
     *
     * @return The HTTP status code associated with this response.
     */
    public int getStatusCode() {
        return response.getStatusCode();
    }

}
