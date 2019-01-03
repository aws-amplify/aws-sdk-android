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
package com.amazonaws.util;

import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.amazonaws.Request;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/**
 * RuntimeHttpUtils class.
 */
public class RuntimeHttpUtils {
    private static final String COMMA = ", ";
    private static final String SPACE = " ";

    /**
     * @param endpoint the endpoint.
     * @param config the client configuration.
     * @return an URI for the given endpoint. Prefixes the protocol if the
     * endpoint given does not have it.
     *
     * @throws IllegalArgumentException if the inputs are null.
     */
    public static URI toUri(String endpoint, ClientConfiguration config) {

        if (config == null) {
            throw new IllegalArgumentException("ClientConfiguration cannot be null");
        }
        return toUri(endpoint, config.getProtocol());
    }

    /**
     * @param endpoint the endpoint.
     * @param protocol the protocol.
     * @return an URI for the given endpoint. Prefixes the protocol if the
     * endpoint given does not have it.
     *
     * @throws IllegalArgumentException if the inputs are null.
     */
    public static URI toUri(String endpoint, Protocol protocol) {
        if (endpoint == null) {
            throw new IllegalArgumentException("endpoint cannot be null");
        }

        /*
         * If the endpoint doesn't explicitly specify a protocol to use, then
         * we'll defer to the default protocol specified in the client
         * configuration.
         */
        if (!endpoint.contains("://")) {
            endpoint = protocol.toString() + "://" + endpoint;
        }

        try {
            return new URI(endpoint);
        } catch (final URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * Converts the specified request object into a URL, containing all the
     * specified parameters, the specified request endpoint, etc.
     *
     * @param request The request to convert into a URL.
     * @param removeLeadingSlashInResourcePath Whether the leading slash in
     *            resource-path should be removed before appending to the
     *            endpoint.
     * @param urlEncode True if request resource path should be URL encoded
     * @return A new URL representing the specified request.
     */
    public static URL convertRequestToUrl(Request<?> request,
            boolean removeLeadingSlashInResourcePath,
            boolean urlEncode) {
        String resourcePath = urlEncode ? HttpUtils.urlEncode(request.getResourcePath(), true)
                : request.getResourcePath();

        // Removed the padding "/" that was already added into the request's
        // resource path.
        if (removeLeadingSlashInResourcePath
                && resourcePath.startsWith("/")) {
            resourcePath = resourcePath.substring(1);
        }

        // Some http client libraries (e.g. Apache HttpClient) cannot handle
        // consecutive "/"s between URL authority and path components.
        // So we escape "////..." into "/%2F%2F%2F...", in the same way as how
        // we treat consecutive "/"s in AmazonS3Client#presignRequest(...)

        String urlPath = "/" + resourcePath;
        urlPath = urlPath.replaceAll("(?<=/)/", "%2F");
        final StringBuilder url = new StringBuilder(request.getEndpoint().toString());
        url.append(urlPath);

        StringBuilder queryParams = new StringBuilder();
        final Map<String, String> requestParams = request.getParameters();
        for (final Map.Entry<String, String> entry : requestParams.entrySet()) {
            queryParams = queryParams.length() > 0 ? queryParams
                    .append("&") : queryParams.append("?");
            queryParams.append(HttpUtils.urlEncode(entry.getKey(), false))
                    .append("=")
                    .append(HttpUtils.urlEncode(entry.getValue(), false));
        }

        url.append(queryParams.toString());

        try {
            return new URL(url.toString());
        } catch (final MalformedURLException e) {
            throw new AmazonClientException(
                    "Unable to convert request to well formed URL: " + e.getMessage(), e);
        }
    }
}
