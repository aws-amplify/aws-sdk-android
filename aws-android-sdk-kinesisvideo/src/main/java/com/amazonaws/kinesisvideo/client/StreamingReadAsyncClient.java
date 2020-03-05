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

package com.amazonaws.kinesisvideo.client;

import java.io.IOException;
import java.net.URI;
import org.apache.http.HttpResponse;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.entity.ContentType;
import org.apache.http.nio.protocol.HttpAsyncResponseConsumer;
import com.amazonaws.kinesisvideo.http.HttpMethodName;
import com.amazonaws.kinesisvideo.http.KinesisVideoApacheHttpAsyncClient;
import com.amazonaws.kinesisvideo.signing.KinesisVideoSigner;

/**
 * Async Client which wraps around Apache Http Async client which takes care
 * of massaging the request to be made using the apache client
 */
public final class StreamingReadAsyncClient {
    private static final String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private URI uri;
    private KinesisVideoSigner signer;
    private String inputInJson;
    private Integer connectionTimeoutInMillis;
    private Integer readTimeoutInMillis;
    private HttpAsyncResponseConsumer<HttpResponse> httpAsyncResponseConsumer;
    private FutureCallback<HttpResponse> futureCallback;
    private KinesisVideoApacheHttpAsyncClient asyncClient;

    private StreamingReadAsyncClient(final URI uri, final KinesisVideoSigner signer, final String inputInJson, final Integer connectionTimeoutInMillis, final Integer readTimeoutInMillis, final HttpAsyncResponseConsumer<HttpResponse> httpAsyncResponseConsumer, final FutureCallback<HttpResponse> futureCallback) {
        this.uri = uri;
        this.signer = signer;
        this.inputInJson = inputInJson;
        this.connectionTimeoutInMillis = connectionTimeoutInMillis;
        this.readTimeoutInMillis = readTimeoutInMillis;
        this.httpAsyncResponseConsumer = httpAsyncResponseConsumer;
        this.futureCallback = futureCallback;
        this.asyncClient = getHttpClient();
    }

    public void execute() {
        asyncClient.executeRequest();
    }

    public void close() throws IOException {
        asyncClient.close();
    }

    private KinesisVideoApacheHttpAsyncClient getHttpClient() {
        KinesisVideoApacheHttpAsyncClient.Builder clientBuilder = KinesisVideoApacheHttpAsyncClient.builder().withUri(uri).withContentType(ContentType.APPLICATION_JSON).withMethod(HttpMethodName.POST).withContentInJson(inputInJson).withHeader(CONTENT_TYPE_HEADER_KEY, ContentType.APPLICATION_JSON.getMimeType()).withFutureCallback(futureCallback).withHttpAsyncResponseConsumer(httpAsyncResponseConsumer);
        if (connectionTimeoutInMillis != null) {
            clientBuilder = clientBuilder.withConnectionTimeoutInMillis(connectionTimeoutInMillis.intValue());
        }
        if (readTimeoutInMillis != null) {
            clientBuilder = clientBuilder.withSocketTimeoutInMillis(readTimeoutInMillis.intValue());
        }
        final KinesisVideoApacheHttpAsyncClient client = clientBuilder.build();
        signer.sign(client);
        return client;
    }


    public static class StreamingReadAsyncClientBuilder {
        private URI uri;
        private KinesisVideoSigner signer;
        private String inputInJson;
        private Integer connectionTimeoutInMillis;
        private Integer readTimeoutInMillis;
        private HttpAsyncResponseConsumer<HttpResponse> httpAsyncResponseConsumer;
        private FutureCallback<HttpResponse> futureCallback;

        StreamingReadAsyncClientBuilder() {
        }

        public StreamingReadAsyncClientBuilder uri(final URI uri) {
            this.uri = uri;
            return this;
        }

        public StreamingReadAsyncClientBuilder signer(final KinesisVideoSigner signer) {
            this.signer = signer;
            return this;
        }

        public StreamingReadAsyncClientBuilder inputInJson(final String inputInJson) {
            this.inputInJson = inputInJson;
            return this;
        }

        public StreamingReadAsyncClientBuilder connectionTimeoutInMillis(final Integer connectionTimeoutInMillis) {
            this.connectionTimeoutInMillis = connectionTimeoutInMillis;
            return this;
        }

        public StreamingReadAsyncClientBuilder readTimeoutInMillis(final Integer readTimeoutInMillis) {
            this.readTimeoutInMillis = readTimeoutInMillis;
            return this;
        }

        public StreamingReadAsyncClientBuilder httpAsyncResponseConsumer(final HttpAsyncResponseConsumer<HttpResponse> httpAsyncResponseConsumer) {
            this.httpAsyncResponseConsumer = httpAsyncResponseConsumer;
            return this;
        }

        public StreamingReadAsyncClientBuilder futureCallback(final FutureCallback<HttpResponse> futureCallback) {
            this.futureCallback = futureCallback;
            return this;
        }

        public StreamingReadAsyncClient build() {
            return new StreamingReadAsyncClient(uri, signer, inputInJson, connectionTimeoutInMillis, readTimeoutInMillis, httpAsyncResponseConsumer, futureCallback);
        }

        @Override
        public String toString() {
            return "StreamingReadAsyncClient.StreamingReadAsyncClientBuilder(uri=" + this.uri + ", signer=" + this.signer + ", inputInJson=" + this.inputInJson + ", connectionTimeoutInMillis=" + this.connectionTimeoutInMillis + ", readTimeoutInMillis=" + this.readTimeoutInMillis + ", httpAsyncResponseConsumer=" + this.httpAsyncResponseConsumer + ", futureCallback=" + this.futureCallback + ")";
        }
    }

    public static StreamingReadAsyncClientBuilder builder() {
        return new StreamingReadAsyncClientBuilder();
    }
}
