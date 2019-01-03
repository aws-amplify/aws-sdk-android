/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.apache.http.Header;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * An implementation of {@link HttpClient} backed by Apache HttpClient.
 */
public class ApacheHttpClient implements HttpClient {

    private final org.apache.http.client.HttpClient httpClient;

    /**
     * Constructor.
     * @param config the client configuration.
     */
    public ApacheHttpClient(ClientConfiguration config) {
        HttpClientFactory httpClientFactory = new HttpClientFactory();
        httpClient = httpClientFactory.createHttpClient(config);
        // disable retry
        ((AbstractHttpClient) httpClient)
                .setHttpRequestRetryHandler(new DefaultHttpRequestRetryHandler(0, false));

        SchemeRegistry schemeRegistry = httpClient.getConnectionManager().getSchemeRegistry();
        Scheme https = schemeRegistry.getScheme("https");
        ((SSLSocketFactory) https.getSocketFactory())
                .setHostnameVerifier(SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    @Override
    public HttpResponse execute(HttpRequest request) throws IOException {
        HttpUriRequest httpRequest = createHttpRequest(request);
        org.apache.http.HttpResponse httpResponse = httpClient.execute(httpRequest);

        String statusText = httpResponse.getStatusLine().getReasonPhrase();
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        InputStream content = null;
        if (httpResponse.getEntity() != null) {
            content = httpResponse.getEntity().getContent();
        }

        HttpResponse.Builder builder = HttpResponse.builder()
                .statusCode(statusCode)
                .statusText(statusText)
                .content(content);
        for (Header header : httpResponse.getAllHeaders()) {
            builder.header(header.getName(), header.getValue());
        }

        return builder.build();
    }

    @Override
    public void shutdown() {
        httpClient.getConnectionManager().shutdown();
    }

    private HttpParams params = null;

    private HttpUriRequest createHttpRequest(HttpRequest request) {
        HttpUriRequest httpRequest;
        String method = request.getMethod();
        if ("POST".equals(method)) {
            HttpPost postRequest = new HttpPost(request.getUri());
            if (request.getContent() != null) {
                postRequest.setEntity(new InputStreamEntity(request.getContent(),
                        request.getContentLength()));
            }
            httpRequest = postRequest;
        } else if ("GET".equals(method)) {
            httpRequest = new HttpGet(request.getUri());
        } else if ("PUT".equals(method)) {
            HttpPut putRequest = new HttpPut(request.getUri());
            if (request.getContent() != null) {
                putRequest.setEntity(new InputStreamEntity(request.getContent(),
                        request.getContentLength()));
            }
            httpRequest = putRequest;
        } else if ("DELETE".equals(method)) {
            httpRequest = new HttpDelete(request.getUri());
        } else if ("HEAD".equals(method)) {
            httpRequest = new HttpHead(request.getUri());
        } else {
            throw new UnsupportedOperationException("Unsupported method: " + method);
        }

        if (request.getHeaders() != null && !request.getHeaders().isEmpty()) {
            for (Map.Entry<String, String> header : request.getHeaders().entrySet()) {
                String key = header.getKey();
                /*
                 * HttpClient4 fills in the Content-Length header and complains
                 * if it's already present, so we skip it here. We also skip the
                 * Host header to avoid sending it twice, which will interfere
                 * with some signing schemes.
                 */
                if (key.equals(HttpHeader.CONTENT_LENGTH) || key.equals(HttpHeader.HOST)) {
                    continue;
                }
                httpRequest.addHeader(header.getKey(), header.getValue());
            }
        }

        // disable redirect
        if (params == null) {
            params = new BasicHttpParams();
            params.setParameter(ClientPNames.HANDLE_REDIRECTS, false);
        }
        httpRequest.setParams(params);
        return httpRequest;
    }
}
