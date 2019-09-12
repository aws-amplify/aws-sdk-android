/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.iot;

import org.conscrypt.Conscrypt;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

import static com.amazonaws.mobileconnectors.iot.AWSIotSslUtility.ALPN_EXTENSION;

/**
 * AWS IoT TLS Socket Factory An extension to SSLSocketFactory to enable TLS
 * 1.2 on the socket. TLS 1.2 is required by the AWS IoT data plane (if TLS
 * Mutual Authentication). TLS 1.2 is not supported in Android API less than 16.
 * It is supported but not enabled by default for API 16-20 and is enabled for API 20+.
 *
 * @see <a
 *      href="https://developer.android.com/reference/javax/net/ssl/SSLSocket.htmlh">Android
 *      Support for TLS</a>
 */
class AWSIotTLSSocketFactory extends SSLSocketFactory {

    /**
     * SSL Socket Factory A SSL socket factory is created and passed into this
     * class which decorates it to enable TLS 1.2 when sockets are created.
     */
    private final SSLSocketFactory sslSocketFactory;

    /**
     * Create an AWSIotTLSSocketFactory.
     *
     * @param sslSocketFactory - the socket factory to have TLS 1.2 enabled.
     */
    public AWSIotTLSSocketFactory(SSLSocketFactory sslSocketFactory) {
        this.sslSocketFactory = sslSocketFactory;
    }

    @Override
    public String[] getDefaultCipherSuites() {
        return sslSocketFactory.getDefaultCipherSuites();
    }

    @Override
    public String[] getSupportedCipherSuites() {
        return sslSocketFactory.getSupportedCipherSuites();
    }

    @Override
    public Socket createSocket() throws IOException {
        return enableTLSOnSocket(sslSocketFactory.createSocket());
    }

    @Override
    public Socket createSocket(Socket s, String host, int port, boolean autoClose)
            throws IOException {
        return enableTLSOnSocket(sslSocketFactory.createSocket(s, host, port, autoClose));
    }

    @Override
    public Socket createSocket(String host, int port) throws IOException {
        return enableTLSOnSocket(sslSocketFactory.createSocket(host, port));
    }

    @Override
    public Socket createSocket(String host, int port, InetAddress localHost, int localPort)
            throws IOException {
        return enableTLSOnSocket(sslSocketFactory.createSocket(host, port, localHost, localPort));
    }

    @Override
    public Socket createSocket(InetAddress host, int port) throws IOException {
        return enableTLSOnSocket(sslSocketFactory.createSocket(host, port));
    }

    @Override
    public Socket createSocket(InetAddress address, int port, InetAddress localAddress,
            int localPort) throws IOException {
        return enableTLSOnSocket(sslSocketFactory.createSocket(address, port, localAddress,
                localPort));
    }

    /**
     * Enable TLS 1.2 on any socket created by the underlying SSL Socket
     * Factory.
     *
     * @param socket newly created socket which may not have TLS 1.2 enabled.
     * @return TLS 1.2 enabled socket.
     */
    private Socket enableTLSOnSocket(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket)) {
            ((SSLSocket) socket).setEnabledProtocols(new String[] {
                "TLSv1.2"
            });
            if (Conscrypt.isConscrypt((SSLSocket) socket)) {
                Conscrypt.setApplicationProtocols((SSLSocket) socket, ALPN_EXTENSION);
            }
        }
        return socket;
    }
}
