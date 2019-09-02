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

import java.net.URI;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.entity.ContentType;
import com.amazonaws.kinesisvideo.http.KinesisVideoApacheHttpClient;
import com.amazonaws.kinesisvideo.http.HttpMethodName;
import com.amazonaws.kinesisvideo.signing.KinesisVideoSigner;

public class StreamingReadClient {
    private static final String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private URI mUri;
    private KinesisVideoSigner mSigner;
    private String mInputInJson;
    private Integer mConnectionTimeoutInMillis;
    private Integer mReadTimeoutInMillis;

    public CloseableHttpResponse execute() {
        final KinesisVideoApacheHttpClient client = getHttpClient();
        return client.executeRequest();
    }

    private KinesisVideoApacheHttpClient getHttpClient() {
        KinesisVideoApacheHttpClient.Builder clientBuilder = KinesisVideoApacheHttpClient.builder().withUri(mUri).withContentType(ContentType.APPLICATION_JSON).withMethod(HttpMethodName.POST).withContentInJson(mInputInJson).withHeader(CONTENT_TYPE_HEADER_KEY, ContentType.APPLICATION_JSON.getMimeType());
        if (mConnectionTimeoutInMillis != null) {
            clientBuilder = clientBuilder.withConnectionTimeoutInMillis(mConnectionTimeoutInMillis.intValue());
        }
        if (mReadTimeoutInMillis != null) {
            clientBuilder = clientBuilder.withSocketTimeoutInMillis(mReadTimeoutInMillis.intValue());
        }
        final KinesisVideoApacheHttpClient client = clientBuilder.build();
        mSigner.sign(client);
        return client;
    }

    StreamingReadClient(final URI uri, final KinesisVideoSigner signer, final String inputInJson, final Integer connectionTimeoutInMillis, final Integer readTimeoutInMillis) {
        this.mUri = uri;
        this.mSigner = signer;
        this.mInputInJson = inputInJson;
        this.mConnectionTimeoutInMillis = connectionTimeoutInMillis;
        this.mReadTimeoutInMillis = readTimeoutInMillis;
    }


    public static class StreamingReadClientBuilder {
        private URI uri;
        private KinesisVideoSigner signer;
        private String inputInJson;
        private Integer connectionTimeoutInMillis;
        private Integer readTimeoutInMillis;

        StreamingReadClientBuilder() {
        }

        public StreamingReadClientBuilder uri(final URI uri) {
            this.uri = uri;
            return this;
        }

        public StreamingReadClientBuilder signer(final KinesisVideoSigner signer) {
            this.signer = signer;
            return this;
        }

        public StreamingReadClientBuilder inputInJson(final String inputInJson) {
            this.inputInJson = inputInJson;
            return this;
        }

        public StreamingReadClientBuilder connectionTimeoutInMillis(final Integer connectionTimeoutInMillis) {
            this.connectionTimeoutInMillis = connectionTimeoutInMillis;
            return this;
        }

        public StreamingReadClientBuilder readTimeoutInMillis(final Integer readTimeoutInMillis) {
            this.readTimeoutInMillis = readTimeoutInMillis;
            return this;
        }

        public StreamingReadClient build() {
            return new StreamingReadClient(uri, signer, inputInJson, connectionTimeoutInMillis, readTimeoutInMillis);
        }

        @Override
        public String toString() {
            return "StreamingReadClient.StreamingReadClientBuilder(uri=" + this.uri + ", signer=" + this.signer + ", inputInJson=" + this.inputInJson + ", connectionTimeoutInMillis=" + this.connectionTimeoutInMillis + ", readTimeoutInMillis=" + this.readTimeoutInMillis + ")";
        }
    }

    public static StreamingReadClientBuilder builder() {
        return new StreamingReadClientBuilder();
    }
}
