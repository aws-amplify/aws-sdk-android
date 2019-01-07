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

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/**
 * An implementation of {@link HttpClient} by {@link HttpURLConnection}. This is
 * the recommended HTTP client in Android. Compared to {@link ApacheHttpClient},
 * it has one limitation. When handling 'Expected 100-continue' header, it only
 * accepts either 100 continue or 417 reject, and throws
 * {@link ProtocolException} on other status code. Such limitation will cause
 * some issue when talking to S3 service. See <a
 * href="http://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPUT.html">S3's
 * Put Object API</a> for the requirement of handling 100-continue.
 */
public class UrlHttpClient implements HttpClient {

    private static final String TAG = "amazonaws";
    private static final Log log = LogFactory.getLog(UrlHttpClient.class);
    private static final int DEFAULT_BUFFER_SIZE = 1024;
    private static final int BUFFER_SIZE_MULTIPLIER = 8;
    private final ClientConfiguration config;

    /**
     * Constructor.
     * @param config the client config.
     */
    public UrlHttpClient(ClientConfiguration config) {
        this.config = config;
    }

    @Override
    public HttpResponse execute(final HttpRequest request) throws IOException {
        final URL url = request.getUri().toURL();
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        final CurlBuilder curlBuilder = config.isCurlLogging()
                ? new CurlBuilder(request.getUri().toURL()) : null;

        configureConnection(request, connection);
        applyHeadersAndMethod(request, connection, curlBuilder);
        writeContentToConnection(request, connection, curlBuilder);

        if (curlBuilder != null) {
            if (curlBuilder.isValid()) {
                printToLog(curlBuilder.build());
            } else {
                printToLog("Failed to create curl, content too long");
            }
        }

        return createHttpResponse(request, connection);
    }

    @SuppressWarnings("checkstyle:emptyblock")
    HttpResponse createHttpResponse(final HttpRequest request, final HttpURLConnection connection)
            throws IOException {
        // connection.setDoOutput(true);
        final String statusText = connection.getResponseMessage();
        final int statusCode = connection.getResponseCode();
        InputStream content = connection.getErrorStream();
        if (content == null) {
            // HEAD method doesn't have a body
            if (!"HEAD".equals(request.getMethod())) {
                try {
                    content = connection.getInputStream();
                } catch (final IOException ioe) {
                    // getInputStream() can throw an exception when there is no
                    // input stream.
                }
            }
        }

        final HttpResponse.Builder builder = HttpResponse.builder()
                .statusCode(statusCode)
                .statusText(statusText)
                .content(content);
        for (final Map.Entry<String, List<String>> header : connection.getHeaderFields().entrySet()) {
            // skip null field that stores connection status
            if (header.getKey() == null) {
                continue;
            }
            // No AWS service return a list of header values, so it's safe to
            // take the first one.
            builder.header(header.getKey(), header.getValue().get(0));
        }

        return builder.build();
    }

    /**
     * This is no op.
     */
    @Override
    public void shutdown() {
        // No op
    }

    /**
     * Needed to pass UrlHttpClientTest.
     *
     * @see #writeContentToConnection(HttpRequest, HttpURLConnection,
     *      CurlBuilder)
     */
    void writeContentToConnection(HttpRequest request, HttpURLConnection connection)
            throws IOException {
        writeContentToConnection(request, connection, null /* curlBuilder */);
    }

    /**
     * Writes the content (if any) of the request to the passed connection
     *
     * @param request
     * @param connection
     * @param curlBuilder
     * @throws IOException
     */
    void writeContentToConnection(final HttpRequest request, final HttpURLConnection connection,
            final CurlBuilder curlBuilder) throws IOException {
        // Note: if DoOutput is set to true and method is GET, HttpUrlConnection
        // will silently change the method to POST.
        if (request.getContent() != null && request.getContentLength() >= 0) {
            connection.setDoOutput(true);
            // This is for backward compatibility, because
            // setFixedLengthStreamingMode(long) is available in API level 19.
            if (!request.isStreaming()) {
                connection.setFixedLengthStreamingMode((int) request.getContentLength());
            }
            final OutputStream os = connection.getOutputStream();
            ByteBuffer curlBuffer = null;
            if (curlBuilder != null) {
                if (request.getContentLength() < Integer.MAX_VALUE) {
                    curlBuffer = ByteBuffer.allocate((int) request.getContentLength());
                } else {
                    curlBuilder.setContentOverflow(true);
                }
            }
            write(request.getContent(), os, curlBuilder, curlBuffer);
            if (curlBuilder != null && curlBuffer != null && curlBuffer.position() != 0) {
                // has content
                curlBuilder.setContent(new String(curlBuffer.array(), "UTF-8"));
            }
            os.flush();
            os.close();
        }
    }

    /**
     * Needed to pass UrlHttpClientTest.
     *
     * @see #applyHeadersAndMethod(HttpRequest, HttpURLConnection, CurlBuilder)
     */
    HttpURLConnection applyHeadersAndMethod(final HttpRequest request,
            final HttpURLConnection connection) throws ProtocolException {
        return applyHeadersAndMethod(request, connection, null /* curlBuilder */);
    }

    @SuppressWarnings("checkstyle:emptyblock")
    HttpURLConnection applyHeadersAndMethod(final HttpRequest request,
            final HttpURLConnection connection, final CurlBuilder curlBuilder)
            throws ProtocolException {
        // add headers
        if (request.getHeaders() != null && !request.getHeaders().isEmpty()) {
            if (curlBuilder != null) {
                curlBuilder.setHeaders(request.getHeaders());
            }
            for (final Map.Entry<String, String> header : request.getHeaders().entrySet()) {
                final String key = header.getKey();
                // Skip reserved headers for HttpURLConnection
                if (key.equals(HttpHeader.CONTENT_LENGTH) || key.equals(HttpHeader.HOST)) {
                    continue;
                }
                /*
                 * Amazon S3 suggests set 100-continue header prior to sending
                 * the request body in order to improve efficiency. S3 may
                 * return '100 Continue' or 417 (Expectation failed). It may
                 * also respond with 307 to redirect the request to the correct
                 * regional location, in which case HttpURLConection will throw
                 * ProtocolException because it only expects either a 100 or a
                 * 417 response. As a result, this feature is explicitly
                 * disabled. To prevent sending the request body twice due to
                 * redirect, please choose the correct endpoint.
                 */
                if (key.equals(HttpHeader.EXPECT)) {
                    // continue;
                }
                connection.setRequestProperty(key, header.getValue());
            }
        }

        final String method = request.getMethod();
        connection.setRequestMethod(method);
        if (curlBuilder != null) {
            curlBuilder.setMethod(method);
        }
        return connection;
    }

    protected void printToLog(String message) {
        log.debug(message);
    }

    protected HttpURLConnection getUrlConnection(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    private void write(InputStream is, OutputStream os, CurlBuilder curlBuilder,
            ByteBuffer curlBuffer) throws IOException {
        final byte[] buf = new byte[DEFAULT_BUFFER_SIZE * BUFFER_SIZE_MULTIPLIER];
        int len;
        while ((len = is.read(buf)) != -1) {
            try {
                if (curlBuffer != null) {
                    curlBuffer.put(buf, 0 /* offset */, len);
                }
            } catch (final BufferOverflowException e) {
                curlBuilder.setContentOverflow(true);
            }
            os.write(buf, 0, len);
        }
    }

    void configureConnection(HttpRequest request, HttpURLConnection connection) {
        // configure the connection
        connection.setConnectTimeout(config.getConnectionTimeout());
        connection.setReadTimeout(config.getSocketTimeout());
        // disable redirect and cache
        connection.setInstanceFollowRedirects(false);
        connection.setUseCaches(false);
        // is streaming
        if (request.isStreaming()) {
            connection.setChunkedStreamingMode(0);
        }

        // configure https connection
        if (connection instanceof HttpsURLConnection) {
            final HttpsURLConnection https = (HttpsURLConnection) connection;

            // disable cert check
            /*
             * Commented as per https://support.google.com/faqs/answer/6346016. Uncomment for testing.
            if (System.getProperty(DISABLE_CERT_CHECKING_SYSTEM_PROPERTY) != null) {
                disableCertificateValidation(https);
            }
            */

            if (config.getTrustManager() != null) {
                enableCustomTrustManager(https);
            }
        }
    }

    private SSLContext sc = null;

    private void enableCustomTrustManager(HttpsURLConnection connection) {
        if (sc == null) {
            final TrustManager[] customTrustManagers = new TrustManager[] {
                    config.getTrustManager()
            };
            try {
                sc = SSLContext.getInstance("TLS");
                sc.init(null, customTrustManagers, null);
            } catch (final GeneralSecurityException e) {
                throw new RuntimeException(e);
            }
        }

        connection.setSSLSocketFactory(sc.getSocketFactory());
    }

    /*
    private void disableCertificateValidation(HttpsURLConnection connection) {
        if (sc == null) {
            TrustManager[] trustAllCerts = new TrustManager[] {
                    new TrustAllManager()
            };
            try {
                // Install the all-trusting trust manager
                sc = SSLContext.getInstance("TLS");
                sc.init(null, trustAllCerts, null);
            } catch (GeneralSecurityException e) {
                throw new RuntimeException(e);
            }
        }

        connection.setSSLSocketFactory(sc.getSocketFactory());
        connection.setHostnameVerifier(new AllowAllHostnameVerifier());
    }
    */
    /**
     * An allow all hostname verifier, only used internally for testing purpose.
     */
    /*
    static class AllowAllHostnameVerifier implements HostnameVerifier {
        @Override
        public boolean verify(String hostname, SSLSession session) {
            // Always return true to bypass host name verification
            return true;
        }
    }
    */
    /**
     * A trust all policy manager, only used internally for testing purpose.
     */
    /*
    static class TrustAllManager implements X509TrustManager {
        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        @Override
        public void checkClientTrusted(X509Certificate[] certs, String authType) {
            // No-op, to trust all certs
        }

        @Override
        public void checkServerTrusted(X509Certificate[] certs, String authType) {
            // No-op, to trust all certs
        }
    }
    */

    /**
     * Helper class to build a curl message.
     */
    protected final class CurlBuilder {

        /** The {@link URL} of the operation. */
        private final URL url;
        /** The method to execute on the given url. */
        private String method = null;
        /**
         * A map of headers and their values to be sent with the curl request.
         */
        private final HashMap<String, String> headers = new HashMap<String, String>();
        /** The content to send with the curl request. */
        private String content = null;
        /** Whether or not the content cannot be written to the curl command. */
        private boolean contentOverflow = false;

        /**
         * Builds a new curl command for the given {@link URL}.
         *
         * @param url The {@link URL} for the operation, must not be
         *            {@code null}.
         */
        public CurlBuilder(URL url) {
            if (url == null) {
                throw new IllegalArgumentException("Must have a valid url");
            }
            this.url = url;
        }

        /**
         * Set the method to call for the given curl command. This method will
         * override the previous value.
         *
         * @param method The method to use for the request.
         * @return This object for chaining.
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public CurlBuilder setMethod(String method) {
            this.method = method;
            return this;
        }

        /**
         * Set the headers used for the given curl command. This method will
         * override the previous values.
         *
         * @param headers The headers to use for the request.
         * @return This object for chaining.
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public CurlBuilder setHeaders(Map<String, String> headers) {
            this.headers.clear();
            this.headers.putAll(headers);
            return this;
        }

        /**
         * Set the content used for the given curl command. This method will
         * override the previous value.
         *
         * @param content The content to use for the request.
         * @return This object for chaining.
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public CurlBuilder setContent(String content) {
            this.content = content;
            return this;
        }

        /**
         * Sets whether or not the content is too large for the curl command.
         * Content of length greater than {@link Integer#MAX_VALUE} are
         * considered too long. If set, the curl should not be logged as it will
         * be invalid.
         *
         * @param contentOverflow Whether or not the content is too long to
         *            print.
         * @return This object for chaining.
         */
        @SuppressWarnings("checkstyle:hiddenfield")
        public CurlBuilder setContentOverflow(boolean contentOverflow) {
            this.contentOverflow = contentOverflow;
            return this;
        }

        /**
         * @return Whether or not this object is valid for printing.
         */
        public boolean isValid() {
            return !contentOverflow;
        }

        /**
         * Creates a curl command that can be replayed from command line.
         *
         * @return The curl command.
         * @throws IllegalStateException If {@link #isValid()} returns false.
         */
        public String build() {
            if (!isValid()) {
                throw new IllegalStateException("Invalid state, cannot create curl command");
            }
            final StringBuilder stringBuilder = new StringBuilder("curl");
            if (method != null) {
                stringBuilder.append(" -X ")
                        .append(method);
            }
            for (final Map.Entry<String, String> entry : headers.entrySet()) {
                stringBuilder.append(" -H \"")
                        .append(entry.getKey())
                        .append(":")
                        .append(entry.getValue())
                        .append("\"");
            }
            if (content != null) {
                stringBuilder.append(" -d '")
                        .append(content)
                        .append("'");
            }
            return stringBuilder.append(" ")
                    .append(url.toString())
                    .toString();
        }
    }
}
