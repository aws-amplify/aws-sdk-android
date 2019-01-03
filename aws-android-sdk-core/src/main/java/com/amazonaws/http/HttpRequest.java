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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.util.StringUtils;

import java.io.InputStream;
import java.net.URI;
import java.util.Collections;
import java.util.Map;

/**
 * A HTTP request class. Any {@link AmazonWebServiceRequest} will be translated
 * to this class before being sent out by {@link HttpClient}.
 */
public class HttpRequest {

    private final String method;
    private URI uri;
    private final Map<String, String> headers;
    private final InputStream content;
    private boolean isStreaming;

    /**
     * Constructs a HttpRequest with given method and uri. It uses no header and
     * has no content. It's handy for HEAD/GET/DELETE where content is absent.
     *
     * @param method HTTP method
     * @param uri uri of the request.
     */
    public HttpRequest(String method, URI uri) {
        this(method, uri, null, null);
    }

    /**
     * Constructs a HttpRequest with given method and uri.
     *
     * @param method HTTP method
     * @param uri uri of the request.
     * @param headers HTTP headers key-value map
     * @param content content of the request. Can be null if no content.
     */
    @SuppressWarnings("unchecked")
    public HttpRequest(String method, URI uri, Map<String, String> headers, InputStream content) {
        this.method = StringUtils.upperCase(method);
        this.uri = uri;
        this.headers = headers == null ? Collections.EMPTY_MAP
                : Collections.unmodifiableMap(headers);
        this.content = content;
    }

    /**
     * Gets the HTTP method, one of GET, POST, PUT, HEAD, DELETE.
     *
     * @return the HTTP method
     */
    public String getMethod() {
        return method;
    }

    /**
     * Gets the {@link URI} of this request.
     *
     * @return uri of this request
     */
    public URI getUri() {
        return uri;
    }

    /**
     * Updates the uri of this request. It's used to handle redirect.
     *
     * @param uri a new uri for this request
     */
    void setUri(URI uri) {
        this.uri = uri;
    }

    /**
     * Gets an unmodifiable headers map. Possible headers are: user-agent, date,
     * content-length, x-amz-.
     *
     * @return an unmodifiable headers map
     */
    public Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * Gets the input stream, null if no content.
     *
     * @return the input stream, null if no content.
     */
    public InputStream getContent() {
        return content;
    }

    /**
     * Gets the length of the content which is set in the header, 0 if no
     * content.
     *
     * @return the length of the content, 0 if no content
     */
    public long getContentLength() {
        if (headers == null) {
            return 0;
        }
        final String len = headers.get(HttpHeader.CONTENT_LENGTH);
        if (len == null || len.isEmpty()) {
            return 0;
        }
        return Long.valueOf(len);
    }

    public boolean isStreaming() {
        return isStreaming;
    }

    @SuppressWarnings("checkstyle:hiddenfield")
    public void setStreaming(boolean isStreaming) {
        this.isStreaming = isStreaming;
    }
}
