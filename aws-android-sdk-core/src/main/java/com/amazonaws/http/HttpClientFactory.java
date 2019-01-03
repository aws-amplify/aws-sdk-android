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
import com.amazonaws.http.impl.client.HttpRequestNoRetryHandler;
import com.amazonaws.http.impl.client.SdkHttpClient;

import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/** Responsible for creating and configuring instances of Apache HttpClient4. */
class HttpClientFactory {

    private static final int HTTP_PORT = 80;
    private static final int HTTPS_PORT = 443;

    /**
     * Creates a new HttpClient object using the specified AWS
     * ClientConfiguration to configure the client.
     *
     * @param config Client configuration options (ex: proxy settings,
     *            connection limits, etc).
     * @return The new, configured HttpClient.
     */
    public HttpClient createHttpClient(ClientConfiguration config) {
        /* Set HTTP client parameters */
        final HttpParams httpClientParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(httpClientParams, config.getConnectionTimeout());
        HttpConnectionParams.setSoTimeout(httpClientParams, config.getSocketTimeout());
        HttpConnectionParams.setStaleCheckingEnabled(httpClientParams, true);
        HttpConnectionParams.setTcpNoDelay(httpClientParams, true);

        final int socketSendBufferSizeHint = config.getSocketBufferSizeHints()[0];
        final int socketReceiveBufferSizeHint = config.getSocketBufferSizeHints()[1];
        if (socketSendBufferSizeHint > 0 || socketReceiveBufferSizeHint > 0) {
            HttpConnectionParams.setSocketBufferSize(httpClientParams,
                    Math.max(socketSendBufferSizeHint, socketReceiveBufferSizeHint));
        }

        final ThreadSafeClientConnManager connectionManager = ConnectionManagerFactory
                .createThreadSafeClientConnManager(config, httpClientParams);
        final SdkHttpClient httpClient = new SdkHttpClient(connectionManager, httpClientParams);
        httpClient.setHttpRequestRetryHandler(HttpRequestNoRetryHandler.Singleton);
        httpClient.setRedirectHandler(new LocationHeaderNotRequiredRedirectHandler());

        if (config.getLocalAddress() != null) {
            ConnRouteParams.setLocalAddress(httpClientParams, config.getLocalAddress());
        }

        final Scheme http = new Scheme("http", PlainSocketFactory.getSocketFactory(), HTTP_PORT);
        final SSLSocketFactory sslSocketFactory = SSLSocketFactory.getSocketFactory();
        sslSocketFactory.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        final Scheme https = new Scheme("https", sslSocketFactory, HTTPS_PORT);
        final SchemeRegistry sr = connectionManager.getSchemeRegistry();
        sr.register(http);
        sr.register(https);

        /*
         * If SSL cert checking for endpoints has been explicitly disabled,
         * register a new scheme for HTTPS that won't cause self-signed certs to
         * error out.
         */
        /*
         * Commented as per https://support.google.com/faqs/answer/6346016. Uncomment for testing.
         */
        /*
        if (System.getProperty(DISABLE_CERT_CHECKING_SYSTEM_PROPERTY) != null) {
            SSLSocketFactory sf = getTrustAllSSLSocketFactory();
            sf.setHostnameVerifier(SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
            Scheme sch = new Scheme("https", sf, 443);
            httpClient.getConnectionManager().getSchemeRegistry().register(sch);
        }
        */
        /* Set proxy if configured */
        final String proxyHost = config.getProxyHost();
        final int proxyPort = config.getProxyPort();
        if (proxyHost != null && proxyPort > 0) {
            AmazonHttpClient.log.info("Configuring Proxy. Proxy Host: " + proxyHost + " "
                    + "Proxy Port: " + proxyPort);
            final HttpHost proxyHttpHost = new HttpHost(proxyHost, proxyPort);
            httpClient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxyHttpHost);

            final String proxyUsername = config.getProxyUsername();
            final String proxyPassword = config.getProxyPassword();
            final String proxyDomain = config.getProxyDomain();
            final String proxyWorkstation = config.getProxyWorkstation();

            if (proxyUsername != null && proxyPassword != null) {
                httpClient.getCredentialsProvider().setCredentials(
                        new AuthScope(proxyHost, proxyPort),
                        new NTCredentials(proxyUsername, proxyPassword, proxyWorkstation,
                                proxyDomain));
            }

            // TODO: support preemptive proxy auth?
        }

        return httpClient;
    }

    /**
     * Customization of the default redirect strategy provided by HttpClient to
     * be a little less strict about the Location header to account for S3 not
     * sending the Location header with 301 responses.
     */
    private static final class LocationHeaderNotRequiredRedirectHandler
            extends DefaultRedirectHandler {

        @Override
        public boolean isRedirectRequested(HttpResponse response, HttpContext context) {
            final int statusCode = response.getStatusLine().getStatusCode();
            final Header locationHeader = response.getFirstHeader("location");

            // Instead of throwing a ProtocolException in this case, just
            // return false to indicate that this is not redirected
            if (locationHeader == null &&
                    statusCode == HttpStatus.SC_MOVED_PERMANENTLY) {
                return false;
            }

            return super.isRedirectRequested(response, context);
        }
    }


    /**
     * Gets an SSLSocketFactory that bypasses SSL certificate checks.
     *
     * @return SSLSocketFactory
     */
    /*
    private static SSLSocketFactory getTrustAllSSLSocketFactory() {
        try {
            KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
            trustStore.load(null, null);
            SSLSocketFactory sf = new TrustAllSSLSocketFactory(trustStore);
            return sf;
        } catch (Exception e) {
            throw new AmazonClientException("Failed to create trust all socket factory", e);
        }
    }
    */
    /**
     * An SSLSocketFactory that bypasses SSL certificate checks. This class is
     * only intended to be used for testing purposes.
     */
    /*
    private static class TrustAllSSLSocketFactory extends SSLSocketFactory {
        private final SSLContext sslContext;

        public TrustAllSSLSocketFactory(KeyStore keystore) throws NoSuchAlgorithmException,
                KeyManagementException, KeyStoreException, UnrecoverableKeyException {
            super(keystore);
            sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, new TrustManager[] {
                    new TrustingX509TrustManager()
            }, null);
        }

        @Override
        public Socket createSocket(Socket socket, String host, int port, boolean autoClose)
                throws IOException, UnknownHostException {
            return sslContext.getSocketFactory().createSocket(socket, host, port, autoClose);
        }

        @Override
        public Socket createSocket() throws IOException {
            return sslContext.getSocketFactory().createSocket();
        }
    }
    */
    /**
     * Simple implementation of X509TrustManager that trusts all certificates.
     * This class is only intended to be used for testing purposes.
     */
    /*
    private static class TrustingX509TrustManager implements X509TrustManager {
        private static final X509Certificate[] X509_CERTIFICATES = new X509Certificate[0];

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return X509_CERTIFICATES;
        }

        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType)
                throws CertificateException {
            // No-op, to trust all certs
        }

        @Override
        public void checkClientTrusted(X509Certificate[] chain, String authType)
                throws CertificateException {
            // No-op, to trust all certs
        }
    };
    */
}
