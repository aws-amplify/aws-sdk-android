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

package com.amazonaws.util;

import com.amazonaws.Protocol;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Utility class to help build a {@link URI} instance from scratch
 * or from an existing URI. This is useful for replacing components
 * inside an existing URI, which is immutable.
 */
public class URIBuilder {
    private static final String DEFAULT_SCHEME = Protocol.HTTPS.toString();
    private static final int DEFAULT_PORT = -1;

    private String scheme;
    private String userInfo;
    private String host;
    private int port;
    private String path;
    private String query;
    private String fragment;

    private URIBuilder() {
        this.scheme = DEFAULT_SCHEME;
        this.port = DEFAULT_PORT;
    }

    private URIBuilder(URI uri) {
        this.scheme = uri.getScheme();
        this.userInfo = uri.getUserInfo();
        this.host = uri.getHost();
        this.port = uri.getPort();
        this.path = uri.getPath();
        this.query = uri.getQuery();
        this.fragment = uri.getFragment();
    }

    /**
     * Returns a builder to construct URI from scratch.
     *
     * @return Empty builder to construct URI from scratch.
     */
    public static URIBuilder builder() {
        return new URIBuilder();
    }

    /**
     * Returns a builder that is configured with the components
     * from the given URI.
     *
     * @param uri URI to modify
     * @return Builder with
     */
    public static URIBuilder builder(URI uri) {
        return new URIBuilder(uri);
    }

    /**
     * Sets the URI scheme and return this builder instance
     * for chaining.
     *
     * @param scheme URI scheme
     * @return This builder instance
     */
    public URIBuilder scheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Sets the URI user info and return this builder instance
     * for chaining.
     *
     * @param userInfo URI user info
     * @return This builder instance
     */
    public URIBuilder userInfo(String userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    /**
     * Sets the URI host and return this builder instance
     * for chaining.
     *
     * @param host URI host
     * @return This builder instance
     */
    public URIBuilder host(String host) {
        this.host = host;
        return this;
    }

    /**
     * Sets the URI port and return this builder instance
     * for chaining.
     *
     * @param port URI port
     * @return This builder instance
     */
    public URIBuilder port(int port) {
        this.port = port;
        return this;
    }

    /**
     * Sets the URI path and return this builder instance
     * for chaining.
     *
     * @param path URI path
     * @return This builder instance
     */
    public URIBuilder path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Sets the URI query and return this builder instance
     * for chaining.
     *
     * @param query URI query
     * @return This builder instance
     */
    public URIBuilder query(String query) {
        this.query = query;
        return this;
    }

    /**
     * Sets the URI fragment and return this builder instance
     * for chaining.
     *
     * @param fragment URI fragment
     * @return This builder instance
     */
    public URIBuilder fragment(String fragment) {
        this.fragment = fragment;
        return this;
    }

    /**
     * Constructs a new URI instance from the components of this
     * builder instance.
     *
     * @return New URI instance with specified components.
     * @throws URISyntaxException If the URI string constructed from
     *          the given components violates RFC 2396
     */
    public URI build() throws URISyntaxException {
        return new URI(scheme, userInfo, host, port, path, query, fragment);
    }
}
