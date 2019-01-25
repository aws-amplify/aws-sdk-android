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

package com.amazonaws.http;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/**
 * Represents an HTTP response returned by an AWS service in response to a
 * service request.
 */
@SuppressWarnings("checkstyle:finalclass")
public class HttpResponse {

    private final String statusText;
    private final int statusCode;
    // Raw content input stream without decoding
    private final InputStream rawContent;
    private final Map<String, String> headers;
    private InputStream content;

    private HttpResponse(String statusText, int statusCode, Map<String, String> headers,
            InputStream rawContent) {
        this.statusText = statusText;
        this.statusCode = statusCode;
        this.headers = headers;
        this.rawContent = rawContent;
    }

    /**
     * Returns the HTTP headers returned with this response.
     *
     * @return The set of HTTP headers returned with this HTTP response.
     */
    public Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * Returns the input stream containing the response content.
     *
     * @return The input stream containing the response content.
     * @throws IOException if an I/O error has occurred
     */
    public InputStream getContent() throws IOException {
        if (content == null) {
            // Avoid decoding the content multiple times
            synchronized (this) {
                if (rawContent != null && "gzip".equals(headers.get("Content-Encoding"))) {
                    content = new GZIPInputStream(rawContent);
                } else {
                    content = rawContent;
                }
            }
        }
        return content;
    }

    /**
     * Get the raw content without considering Content-Encoding. This is useful
     * if you want full control of the content.
     *
     * @return the raw content input stream.
     * @throws IOException if an I/O error has occurred
     */
    public InputStream getRawContent() throws IOException {
        return rawContent;
    }

    /**
     * Returns the HTTP status text associated with this response.
     *
     * @return The HTTP status text associated with this response.
     */
    public String getStatusText() {
        return statusText;
    }

    /**
     * Returns the HTTP status code (ex: 200, 404, etc) associated with this
     * response.
     *
     * @return The HTTP status code associated with this response.
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Creates a builder for {@link HttpResponse}.
     *
     * @return a builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * A builder class for {@link HttpResponse} to create an immutable instance.
     */
    public static class Builder {
        private String statusText;
        private int statusCode;
        private InputStream content;
        private final Map<String, String> headers = new HashMap<String, String>();

        /**
         * Sets the status text.
         *
         * @param statusText status text
         * @return builder itself
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public Builder statusText(String statusText) {
            this.statusText = statusText;
            return this;
        }

        /**
         * Sets the status code, such as 200, 204, 400, 500, etc
         *
         * @param statusCode status code
         * @return builder itself
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public Builder statusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Sets the content input stream. Default is null, aka no content.
         *
         * @param content input stream
         * @return builder itself
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public Builder content(InputStream content) {
            this.content = content;
            return this;
        }

        /**
         * Adds a key-value header to the request.
         *
         * @param key header key
         * @param value header value
         * @return builder itself
         */
        public Builder header(String key, String value) {
            headers.put(key, value);
            return this;
        }

        /**
         * Builds an instance of {@link HttpResponse}
         *
         * @return a new instance of {@link HttpResponse}
         */
        public HttpResponse build() {
            return new HttpResponse(statusText, statusCode,
                    Collections.unmodifiableMap(headers), content);
        }
    }
}
