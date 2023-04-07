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
    public static final String TLSv1_2 = "TLSv1.2";
    private static final String[] SUPPORTED_PROTOCOLS = new String[] { TLSv1_2 };
    private static SSLContext sslContext = null;
    private final SSLSocketFactory delegate;

    @Nullable
    public static TLS12SocketFactory createTLS12SocketFactory() {
        return createTLS12SocketFactory(null);
    }

    @Nullable
    public static TLS12SocketFactory createTLS12SocketFactory(
            @Nullable SSLContext sslContext
    ) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP_MR1) {
            try {
                return new TLS12SocketFactory(sslContext);
            } catch (Exception e) {
                //
            }
        }
        return null;
    }

    public static void fixTLSPre22(@NonNull HttpsURLConnection connection) {
        fixTLSPre22(connection, createTLS12SocketFactory());
    }

    public static void fixTLSPre22(
            @NonNull HttpsURLConnection connection,
            @Nullable TLS12SocketFactory tls12SocketFactory
    ) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP_MR1 &&
                tls12SocketFactory != null) {
            try {
                connection.setSSLSocketFactory(tls12SocketFactory);
            } catch (Exception e) {
                // Failed to enabled TLS1.2 on <= Android 22 device
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
                    sslContext = SSLContext.getInstance(TLSv1_2);
                    sslContext.init(null, null, null);
                }
            }
            delegate = sslContext.getSocketFactory();
        }
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
        return updateTLSProtocols(delegate.createSocket());
    }

    @Override
    public Socket createSocket(Socket s, String host, int port, boolean autoClose) throws IOException {
        return updateTLSProtocols(delegate.createSocket(s, host, port, autoClose));
    }

    @Override
    public Socket createSocket(String host, int port) throws IOException, UnknownHostException {
        return updateTLSProtocols(delegate.createSocket(host, port));
    }

    @Override
    public Socket createSocket(String host, int port, InetAddress localHost, int localPort) throws IOException, UnknownHostException {
        return updateTLSProtocols(delegate.createSocket(host, port, localHost, localPort));
    }

    @Override
    public Socket createSocket(InetAddress host, int port) throws IOException {
        return updateTLSProtocols(delegate.createSocket(host, port));
    }

    @Override
    public Socket createSocket(InetAddress address, int port, InetAddress localAddress, int localPort) throws IOException {
        return updateTLSProtocols(delegate.createSocket(address, port, localAddress, localPort));
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
