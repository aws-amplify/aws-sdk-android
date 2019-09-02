/**
 * COPYRIGHT:
 * <p>
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.kinesisvideo.http;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.entity.ContentType;

public abstract class HttpClientBase implements HttpClient {
    
    private static final String HOST_HEADER = "Host";
    private static final int DEFAULT_CONNECTION_TIMEOUT_IN_MILLIS = 10000; //magic number
    private static final int DEFAULT_SOCKET_TIMEOUT_IN_MILLIS = 10000; //magic number

    protected final BuilderBase<? extends BuilderBase> mBuilder;
    
    public HttpClientBase(final BuilderBase<? extends BuilderBase> builder) {
        this.mBuilder = builder;
    }
    
    /**
     * This method is intended for testing use only.
     *
     * @param key header key
     * @param value header value
     */
    public void addHeaderUnsafe(final String key, final String value) {
        mBuilder.withHeader(key, value);
    }

    @Override
    public HttpMethodName getMethod() {
        return mBuilder.mMethod;
    }

    @Override
    public URI getUri() {
        return mBuilder.mUri;
    }

    @Override
    public Map<String, String> getHeaders() {
        return mBuilder.mHeaders;
    }

    @Override
    public InputStream getContent() {
        return new ByteArrayInputStream(mBuilder.mContentInJson.getBytes(StandardCharsets.US_ASCII));
    }

    @Override
    public void close() throws IOException {
        this.closeClient();
    }

    public abstract void closeClient() throws IOException;
    
    public abstract static class BuilderBase<T> {
        protected final Map<String, String> mHeaders;
        protected URI mUri;
        protected HttpMethodName mMethod;
        protected int mConnectionTimeoutInMillis;
        protected int mSocketTimeoutInMillis;
        protected ContentType mContentType;
        protected String mContentInJson;
        
        public abstract T builderType();

        public BuilderBase() {
            mHeaders = new HashMap<String, String>();
            mConnectionTimeoutInMillis = DEFAULT_CONNECTION_TIMEOUT_IN_MILLIS;
            mSocketTimeoutInMillis = DEFAULT_SOCKET_TIMEOUT_IN_MILLIS;
        }

        public T withUri(final URI uri) {
            mUri = uri;
            mHeaders.put(HOST_HEADER, uri.getHost());
            return builderType();
        }

        public T withMethod(final HttpMethodName method) {
            mMethod = method;
            return builderType();
        }

        public T withHeader(final String key, final String value) {
            mHeaders.put(key, value);
            return builderType();
        }

        public T withConnectionTimeoutInMillis(final int connectionTimeoutInMillis) {
            mConnectionTimeoutInMillis = connectionTimeoutInMillis;
            return builderType();
        }

        public T withSocketTimeoutInMillis(final int socketTimeoutInMillis) {
            mSocketTimeoutInMillis = socketTimeoutInMillis;
            return builderType();
        }

        public T withContentType(final ContentType contentType) {
            mContentType = contentType;
            return builderType();
        }

        public T withContentInJson(final String contentInJson) {
            mContentInJson = contentInJson;
            return builderType();
        }
    } 
}
