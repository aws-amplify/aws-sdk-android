package com.amazonaws.mobileconnectors.iot;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.net.ssl.SSLSocketFactory;

public class AWSIotProxiedSocketFactory extends SSLSocketFactory {
    private final SSLSocketFactory socketFactory;
    private final Proxy proxy;

    public AWSIotProxiedSocketFactory(SSLSocketFactory delegate, String proxyHost, int proxyPort){
        this.socketFactory = delegate;
        this.proxy = buildProxy(proxyHost, proxyPort);
    }

    private Proxy buildProxy(String proxyHost, int proxyPort) {
        return new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(proxyHost, proxyPort));
    }

    @Override
    public String[] getDefaultCipherSuites() {
        return socketFactory.getDefaultCipherSuites();
    }

    @Override
    public String[] getSupportedCipherSuites() {
        return socketFactory.getSupportedCipherSuites();
    }

    @Override
    public Socket createSocket(){
        return new AWSIotProxiedSSLSocket(socketFactory, new Socket(proxy));
    }

    @Override
    public Socket createSocket(Socket socket, String s, int i, boolean b) throws IOException {
        return socketFactory.createSocket(socket, s, i, b);
    }

    @Override
    public Socket createSocket(String s, int i) throws IOException, UnknownHostException {
        return socketFactory.createSocket(s, i);
    }

    @Override
    public Socket createSocket(String s, int i, InetAddress inetAddress, int i1) throws IOException, UnknownHostException {
        return socketFactory.createSocket(s, i, inetAddress, i1);
    }

    @Override
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return socketFactory.createSocket(inetAddress, i);
    }

    @Override
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress1, int i1) throws IOException {
        return socketFactory.createSocket(inetAddress, i, inetAddress1, i1);
    }
}
