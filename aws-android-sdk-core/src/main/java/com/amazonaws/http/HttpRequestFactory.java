/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Responsible for converting AWS {@link Request}s to {@link HttpRequest}s.
 */
public class HttpRequestFactory {

    private static final String DEFAULT_ENCODING = "UTF-8";

    /**
     * Creates an {@link HttpClient} request object based on the specified AWS
     * request and populates any parameters, headers, etc. from the original
     * request.
     *
     * @param request The request to convert to an HttpClient request object.
     * @param clientConfiguration The client configuration.
     * @param context The execution context of the HTTP request to be executed
     * @return The converted HttpClient request object with any parameters,
     *         headers, etc. from the original request set.
     */
    public HttpRequest createHttpRequest(Request<?> request,
            ClientConfiguration clientConfiguration, ExecutionContext context) {
        final URI endpoint = request.getEndpoint();

        /*
         * HttpClient cannot handle url in pattern of "http://host//path", so we
         * have to escape the double-slash between endpoint and resource-path
         * into "/%2F"
         */
        String uri = HttpUtils.appendUri(endpoint.toString(), request.getResourcePath(), true);
        final String encodedParams = HttpUtils.encodeParameters(request);
        HttpMethodName method = request.getHttpMethod();

        /*
         * For all non-POST requests, and any POST requests that already have a
         * payload, we put the encoded params directly in the URI, otherwise,
         * we'll put them in the POST request's payload.
         */
        final boolean requestAlreadyHasPayload = request.getContent() != null;
        final boolean requestIsPost = method == HttpMethodName.POST;
        final boolean putParamsInUri = !requestIsPost || requestAlreadyHasPayload;
        if (encodedParams != null && putParamsInUri) {
            uri += "?" + encodedParams;
        }

        // Configure headers from request. Additional headers will be added
        // later if necessary.
        final Map<String, String> headers = new HashMap<String, String>();
        configureHeaders(headers, request, context, clientConfiguration);

        InputStream is = request.getContent();

        // Some HTTP client, e.g. HttpURLConnection, doesn't support PATCH.
        // Tunnel it through another method by setting the intended method in
        // the X-HTTP-Method-Override header.
        if (method == HttpMethodName.PATCH) {
            method = HttpMethodName.POST;
            headers.put("X-HTTP-Method-Override", HttpMethodName.PATCH.toString());
        }
        if (method == HttpMethodName.POST) {
            /*
             * If there isn't any payload content to include in this request,
             * then try to include the POST parameters in the query body,
             * otherwise, just use the query string. For all AWS Query services,
             * the best behavior is putting the params in the request body for
             * POST requests, but we can't do that for S3.
             */
            if (request.getContent() == null && encodedParams != null) {
                final byte[] contentBytes = encodedParams.getBytes(StringUtils.UTF8);
                is = new ByteArrayInputStream(contentBytes);
                headers.put("Content-Length", String.valueOf(contentBytes.length));
            }
        }

        // Enables gzip compression. Also signals the implementation of
        // HttpClient to disable transparent gzip.
        if (clientConfiguration.isEnableGzip()
                && headers.get("Accept-Encoding") == null) {
            headers.put("Accept-Encoding", "gzip");
        } else {
            headers.put("Accept-Encoding", "identity");
        }

        final HttpRequest httpRequest = new HttpRequest(method.toString(), URI.create(uri), headers,
                is);
        httpRequest.setStreaming(request.isStreaming());

        return httpRequest;
    }

    /** Configures the headers in the specified Apache HTTP request. */
    private void configureHeaders(Map<String, String> headers, Request<?> request,
            ExecutionContext context, ClientConfiguration clientConfiguration) {
        /*
         * Apache HttpClient omits the port number in the Host header (even if
         * we explicitly specify it) if it's the default port for the protocol
         * in use. To ensure that we use the same Host header in the request and
         * in the calculated string to sign (even if Apache HttpClient changed
         * and started honoring our explicit host with endpoint), we follow this
         * same behavior here and in the QueryString signer.
         */
        final URI endpoint = request.getEndpoint();
        String hostHeader = endpoint.getHost();
        if (HttpUtils.isUsingNonDefaultPort(endpoint)) {
            hostHeader += ":" + endpoint.getPort();
        }
        headers.put("Host", hostHeader);

        // Copy over any other headers already in our request
        for (final Entry<String, String> entry : request.getHeaders().entrySet()) {
            headers.put(entry.getKey(), entry.getValue());
        }

        /* Set content type and encoding */
        if (headers.get("Content-Type") == null || headers.get("Content-Type").isEmpty()) {
            headers.put("Content-Type",
                    "application/x-www-form-urlencoded; " +
                            "charset=" + StringUtils.lowerCase(DEFAULT_ENCODING));
        }

        // Override the user agent string specified in the client params if the
        // context requires it
        if (context != null && context.getContextUserAgent() != null) {
            headers.put("User-Agent",
                    createUserAgentString(clientConfiguration, context.getContextUserAgent()));
        }
    }

    /**
     * Appends the given user-agent string to the client's existing one and
     * returns it.
     */
    private String createUserAgentString(ClientConfiguration clientConfiguration,
            String contextUserAgent) {
        if (clientConfiguration.getUserAgent().contains(contextUserAgent)) {
            return clientConfiguration.getUserAgent();
        } else {
            return clientConfiguration.getUserAgent() + " " + contextUserAgent;
        }
    }

}
