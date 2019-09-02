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

import static com.amazonaws.kinesisvideo.common.preconditions.Preconditions.checkNotNull;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.apache.http.nio.client.methods.HttpAsyncMethods;
import org.apache.http.nio.conn.ssl.SSLIOSessionStrategy;
import org.apache.http.nio.protocol.HttpAsyncRequestProducer;
import org.apache.http.nio.protocol.HttpAsyncResponseConsumer;
import org.apache.http.ssl.SSLContextBuilder;

/**
 * Http Async Client which uses Apache HttpAsyncClient internally to make
 * the http request and invoke callbacks when there is data ready to consume.
 */
public final class KinesisVideoApacheHttpAsyncClient extends HttpClientBase {
    
    private final CloseableHttpAsyncClient mHttpClient;

    private KinesisVideoApacheHttpAsyncClient(final BuilderBase<Builder> builder) {
        super(builder);
        this.mHttpClient = buildHttpAsyncClient();
        this.mHttpClient.start();
    }

    public static Builder builder() {
        return new Builder();
    }

    public void executeRequest() {
        final HttpPost request = new HttpPost(mBuilder.mUri);
        for (Map.Entry<String, String> entry : mBuilder.mHeaders.entrySet()) {
            request.addHeader(entry.getKey(), entry.getValue());
        }
        final HttpEntity entity = new StringEntity(mBuilder.mContentInJson, mBuilder.mContentType);
        request.setEntity(entity);
        final HttpAsyncRequestProducer requestProducer = HttpAsyncMethods.create(request);
        this.mHttpClient.execute(requestProducer, ((Builder) mBuilder).mHttpAsyncResponseConsumer,
                ((Builder) mBuilder).mFutureCallback);
    }

    private CloseableHttpAsyncClient buildHttpAsyncClient() {
        final SSLContextBuilder builder = new SSLContextBuilder();
        try {
            builder.loadTrustMaterial(new TrustAllStrategy());
            final SSLIOSessionStrategy sslSessionStrategy = new SSLIOSessionStrategy(builder.build(),
                    new String[] {"TLSv1.2"},
                    null,
                    new NoopHostnameVerifier());
            return HttpAsyncClientBuilder.create()
                    .setSSLStrategy(sslSessionStrategy)
                    .setDefaultRequestConfig(RequestConfig.custom()
                            .setConnectTimeout(mBuilder.mConnectionTimeoutInMillis)
                            .setSocketTimeout(mBuilder.mSocketTimeoutInMillis)
                            .build())
                    .build();
        } catch (final KeyManagementException e) {
            throw new RuntimeException("Exception while building Apache http client", e);
        } catch (final NoSuchAlgorithmException e) {
            throw new RuntimeException("Exception while building Apache http client", e);
        } catch (final KeyStoreException e) {
            throw new RuntimeException("Exception while building Apache http client", e);
        }
    }
    
    public static final class Builder extends BuilderBase<Builder> {
        
        private HttpAsyncResponseConsumer<HttpResponse> mHttpAsyncResponseConsumer;
        private FutureCallback<HttpResponse> mFutureCallback;
        
        public Builder withHttpAsyncResponseConsumer(final HttpAsyncResponseConsumer<HttpResponse> 
                          httpAsyncResponseConsumer) {
            mHttpAsyncResponseConsumer = httpAsyncResponseConsumer;
            return this;
        }
        
        public Builder withFutureCallback(final FutureCallback<HttpResponse> futureCallback) {
            mFutureCallback = futureCallback;
            return this;
        }

        public KinesisVideoApacheHttpAsyncClient build() {
            checkNotNull(mUri);
            return new KinesisVideoApacheHttpAsyncClient(this);
        }

        @Override
        public Builder builderType() {
            return this;
        }
    }

    @Override
    public void closeClient() throws IOException {
        this.mHttpClient.close();
    }
}
