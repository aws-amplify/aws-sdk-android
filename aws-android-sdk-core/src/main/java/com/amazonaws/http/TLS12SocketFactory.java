/*
 * Copyright 2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/**
 * Although this has public access, it is intended for internal use and should not be used directly by host
 * applications. The behavior of this may change without warning.
 */
public class TLS12SocketFactory extends SSLSocketFactory {

    private static final Object contextLock = new Object();
    private static final String[] SUPPORTED_PROTOCOLS =
            new String[] { "TLSv1", "TLSv1.1", "TLSv1.2" };
    private static SSLContext sslContext = null;
    private final SSLSocketFactory delegate;
    private LoggingHandshakeCompletedListener handshakeCompletedListener;

    @Nullable
    public static TLS12SocketFactory createTLS12SocketFactory() {
        return createTLS12SocketFactory(null);
    }

    @Nullable
    public static TLS12SocketFactory createTLS12SocketFactory(
            @Nullable SSLContext sslContext
    ) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            try {
                return new TLS12SocketFactory(sslContext);
            } catch (Exception e) {
                //
            }
        }
        return null;
    }

    public static void fixTLSPre21(@NonNull HttpsURLConnection connection) {
        fixTLSPre21(connection, createTLS12SocketFactory());
    }

    public static void fixTLSPre21(
            @NonNull HttpsURLConnection connection,
            @Nullable TLS12SocketFactory tls12SocketFactory
    ) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP &&
                tls12SocketFactory != null) {
            try {
                connection.setSSLSocketFactory(tls12SocketFactory);
            } catch (Exception e) {
                // Failed to enabled TLS1.2 on < Android 21 device
            }
        }
    }

    private TLS12SocketFactory(@Nullable SSLContext customSSLContext)
            throws KeyManagementException, NoSuchAlgorithmException {

        if (customSSLContext != null) {
            delegate = customSSLContext.getSocketFactory();
        } else {
            // Cache SSLContext due to weight and hold static
            synchronized (contextLock) {
                if (sslContext == null) {
                    sslContext = SSLContext.getInstance("TLS");
                    sslContext.init(null, null, null);
                }
            }
            delegate = sslContext.getSocketFactory();
        }
        this.handshakeCompletedListener = new LoggingHandshakeCompletedListener();
    }

    @Override
    public String[] getDefaultCipherSuites() {
        return delegate.getDefaultCipherSuites();
    }

    @Override
    public String[] getSupportedCipherSuites() {
        return delegate.getSupportedCipherSuites();
    }

    @Override
    public Socket createSocket() throws IOException {
        SSLSocket socket = (SSLSocket) delegate.createSocket();
        socket.addHandshakeCompletedListener(handshakeCompletedListener);
        return updateTLSProtocols(socket);
    }

    @Override
    public Socket createSocket(Socket s, String host, int port, boolean autoClose) throws IOException {
        SSLSocket socket = (SSLSocket) delegate.createSocket(s, host, port, autoClose);
        socket.addHandshakeCompletedListener(handshakeCompletedListener);
        return updateTLSProtocols(socket);
    }

    @Override
    public Socket createSocket(String host, int port) throws IOException, UnknownHostException {
        SSLSocket socket = (SSLSocket) delegate.createSocket(host, port);
        socket.addHandshakeCompletedListener(handshakeCompletedListener);
        return updateTLSProtocols(socket);
    }

    @Override
    public Socket createSocket(String host, int port, InetAddress localHost, int localPort) throws IOException, UnknownHostException {
        SSLSocket socket = (SSLSocket) delegate.createSocket(host, port, localHost, localPort);
        socket.addHandshakeCompletedListener(handshakeCompletedListener);
        return updateTLSProtocols(socket);
    }

    @Override
    public Socket createSocket(InetAddress host, int port) throws IOException {
        SSLSocket socket = (SSLSocket) delegate.createSocket(host, port);
        socket.addHandshakeCompletedListener(handshakeCompletedListener);
        return updateTLSProtocols(socket);
    }

    @Override
    public Socket createSocket(InetAddress address, int port, InetAddress localAddress, int localPort) throws IOException {
        SSLSocket socket = (SSLSocket) delegate.createSocket(address, port, localAddress, localPort);
        socket.addHandshakeCompletedListener(handshakeCompletedListener);
        return updateTLSProtocols(socket);
    }

    private Socket updateTLSProtocols(Socket socket) {
        if(socket instanceof SSLSocket) {
            try {
                ((SSLSocket) socket).setEnabledProtocols(SUPPORTED_PROTOCOLS);
            } catch (Exception e) {
                // TLS 1.2 may not be supported on device
            }
        }
        return socket;
    }
}
