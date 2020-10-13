/**
 * Copyright 2017-2018 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.kinesisvideo.http;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import javax.net.ssl.SSLContext;
import javax.net.ssl.X509ExtendedTrustManager;

import static com.amazonaws.kinesisvideo.common.preconditions.Preconditions.checkNotNull;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;

/**
 * Http Client which uses Apache HttpClient internally to make
 * the http request and get the response.
 */
public final class KinesisVideoApacheHttpClient implements HttpClient {
    private static final String HOST_HEADER = "Host";
    private static final int DEFAULT_CONNECTION_TIMEOUT_IN_MILLIS = 10000; //magic number
    private static final int DEFAULT_SOCKET_TIMEOUT_IN_MILLIS = 10000; //magic number

    private final Builder mBuilder;
    private final CloseableHttpClient mHttpClient;

    private KinesisVideoApacheHttpClient(final Builder builder) {
        this.mBuilder = builder;
        this.mHttpClient = buildHttpClient();
    }

    public static Builder builder() {
        return new Builder();
    }

    public CloseableHttpResponse executeRequest() {

        final HttpPost request = new HttpPost(mBuilder.mUri);
        for (Map.Entry<String, String> entry : mBuilder.mHeaders.entrySet()) {
            request.addHeader(entry.getKey(), entry.getValue());
        }
        try {
            final HttpEntity entity = new StringEntity(mBuilder.mContentInJson, mBuilder.mContentType.getCharset().toString());
            request.setEntity(entity);
            return this.mHttpClient.execute(request);
        } catch (final IOException e) {
            throw new RuntimeException("Exception while doing a POST on the URI " + mBuilder.mUri, e);
        }
    }

    private CloseableHttpClient buildHttpClient() {
        try {
            final SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
            sslContext.init(null, new X509ExtendedTrustManager[] {
                    new HostnameVerifyingX509ExtendedTrustManager(true)}, new SecureRandom());

            final SSLConnectionSocketFactory sslSocketFactory = new SSLConnectionSocketFactory(sslContext);

            return HttpClients.custom()
                    .setSSLSocketFactory(sslSocketFactory)
                    .setDefaultRequestConfig(RequestConfig.custom()
                            .setConnectTimeout(mBuilder.mConnectionTimeoutInMillis)
                            .build())
                    .setDefaultSocketConfig(SocketConfig.custom()
                            .setSoTimeout(mBuilder.mSocketTimeoutInMillis)
                            .build())
                    .build();
        } catch (final KeyManagementException e) {
            throw new RuntimeException("Exception while building Apache http client", e);
        } catch (final NoSuchAlgorithmException e) {
            throw new RuntimeException("Exception while building Apache http client", e);
        }
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
        this.mHttpClient.close();
    }

    public static final class Builder {
        private final Map<String, String> mHeaders;
        private URI mUri;
        private HttpMethodName mMethod;
        private int mConnectionTimeoutInMillis;
        private int mSocketTimeoutInMillis;
        private ContentType mContentType;
        private String mContentInJson;

        private Builder() {
            mHeaders = new HashMap<String, String>();
            mConnectionTimeoutInMillis = DEFAULT_CONNECTION_TIMEOUT_IN_MILLIS;
            mSocketTimeoutInMillis = DEFAULT_SOCKET_TIMEOUT_IN_MILLIS;
        }

        public Builder withUri(final URI uri) {
            mUri = uri;
            mHeaders.put(HOST_HEADER, uri.getHost());
            return this;
        }

        public Builder withMethod(final HttpMethodName method) {
            mMethod = method;
            return this;
        }

        public Builder withHeader(final String key, final String value) {
            mHeaders.put(key, value);
            return this;
        }

        public Builder withConnectionTimeoutInMillis(final int connectionTimeoutInMillis) {
            mConnectionTimeoutInMillis = connectionTimeoutInMillis;
            return this;
        }

        public Builder withSocketTimeoutInMillis(final int socketTimeoutInMillis) {
            mSocketTimeoutInMillis = socketTimeoutInMillis;
            return this;
        }

        public Builder withContentType(final ContentType contentType) {
            mContentType = contentType;
            return this;
        }

        public Builder withContentInJson(final String contentInJson) {
            mContentInJson = contentInJson;
            return this;
        }

        public KinesisVideoApacheHttpClient build() {
            checkNotNull(mUri);
            return new KinesisVideoApacheHttpClient(this);
        }
    }
}
