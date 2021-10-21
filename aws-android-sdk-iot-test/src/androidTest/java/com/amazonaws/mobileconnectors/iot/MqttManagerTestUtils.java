/**
 * Copyright 2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.iot;

import android.os.Build;
import android.util.Log;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.concurrent.CountDownLatch;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

class MqttManagerTestUtils {
    public static final String CUSTOM_ENDPOINT = "<some test endpoint>";
    public static final String MQTT_CLIENT_ID = "TEST-MQTT-CLIENT";

    /**
     *
     * @param selfSignedRootCertPfxPath
     * @param password
     * @return
     * @throws KeyStoreException
     * @throws CertificateException
     * @throws NoSuchAlgorithmException
     * @throws IOException
     * @throws KeyManagementException
     */
    public static SSLSocketFactory getSSLSocketFactory(String selfSignedRootCertPfxPath, String password)
        throws KeyStoreException, CertificateException, NoSuchAlgorithmException, IOException, KeyManagementException {

        FileInputStream fip = new FileInputStream(selfSignedRootCertPfxPath);
        SSLContext ctx = null;
        SSLSocketFactory sslSockFactory=null;
        KeyStore ks;
        ks = KeyStore.getInstance("PKCS12");
        ks.load(fip, password.toCharArray());

        TrustManagerFactory tmf = TrustManagerFactory.getInstance("X509");
        tmf.init(ks);
        TrustManager[] tm = tmf.getTrustManagers();
        ctx = SSLContext.getInstance("TLS");
        ctx.init(null, tm, null);

        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.KITKAT) {
            sslSockFactory = new TLSSocketFactory(tm);
        } else {
            sslSockFactory = ctx.getSocketFactory();
        }
        return sslSockFactory;


    }

    static final class LatchedAWSIotMqttClientStatusCallback implements AWSIotMqttClientStatusCallback {
        private final CountDownLatch latch;
        private static final String TAG = LatchedAWSIotMqttClientStatusCallback.class.getSimpleName();

        public LatchedAWSIotMqttClientStatusCallback(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
            Log.d(TAG, "Connection status received: " + status.name());
            if (throwable != null) {
                Log.e(TAG, "EXCEPTION: " + throwable.getMessage(), throwable );
            }
            if (AWSIotMqttClientStatus.Connected.equals(status)) {
                latch.countDown();
            }
        }
    }


    static final class TLSSocketFactory extends SSLSocketFactory {

        private final SSLSocketFactory internalSSLSocketFactory;

        public TLSSocketFactory(TrustManager[] trustManagers) throws KeyManagementException, NoSuchAlgorithmException {
            SSLContext context = SSLContext.getInstance("TLS");
            context.init(null, trustManagers, null);
            internalSSLSocketFactory = context.getSocketFactory();
        }

        @Override
        public String[] getDefaultCipherSuites() {
            return internalSSLSocketFactory.getDefaultCipherSuites();
        }

        @Override
        public String[] getSupportedCipherSuites() {
            return internalSSLSocketFactory.getSupportedCipherSuites();
        }

        @Override
        public Socket createSocket() throws IOException {
            return enableTLSOnSocket(internalSSLSocketFactory.createSocket());
        }

        @Override
        public Socket createSocket(Socket s, String host, int port, boolean autoClose) throws IOException {
            return enableTLSOnSocket(internalSSLSocketFactory.createSocket(s, host, port, autoClose));
        }

        @Override
        public Socket createSocket(String host, int port) throws IOException, UnknownHostException {
            return enableTLSOnSocket(internalSSLSocketFactory.createSocket(host, port));
        }

        @Override
        public Socket createSocket(String host, int port, InetAddress localHost, int localPort) throws IOException, UnknownHostException {
            return enableTLSOnSocket(internalSSLSocketFactory.createSocket(host, port, localHost, localPort));
        }

        @Override
        public Socket createSocket(InetAddress host, int port) throws IOException {
            return enableTLSOnSocket(internalSSLSocketFactory.createSocket(host, port));
        }

        @Override
        public Socket createSocket(InetAddress address, int port, InetAddress localAddress, int localPort) throws IOException {
            return enableTLSOnSocket(internalSSLSocketFactory.createSocket(address, port, localAddress, localPort));
        }

        private Socket enableTLSOnSocket(Socket socket) {
            if(socket != null && (socket instanceof SSLSocket)) {
                ((SSLSocket)socket).setEnabledProtocols(new String[] {"TLSv1.2", "TLSv1.1"});
            }
            return socket;
        }
    }
}
