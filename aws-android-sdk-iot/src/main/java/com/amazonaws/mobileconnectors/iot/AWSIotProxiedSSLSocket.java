/**
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.iot;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;

import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/**
 * This class extends SSLSocket to route all requests via the specified proxy server
 */
class AWSIotProxiedSSLSocket extends SSLSocket {

    /**
     * SSLSocket factory to produce socket with Keystore information for authentication baked into it.
     */
    private final SSLSocketFactory socketFactory;
    private final Socket proxySocket;
    /**
     * Socket with built-in keystore and proxy information used for connecting to AWS IoT
     */
    private SSLSocket socket;


    public AWSIotProxiedSSLSocket(SSLSocketFactory socketFactory, Socket socket) {
        this.socketFactory = socketFactory;
        this.proxySocket = socket;
    }
    @Override
    public void connect(SocketAddress socketAddress) throws IOException {
        connect(socketAddress, 0);
    }

    @Override
    public void connect(SocketAddress socketAddress, int timeout) throws IOException {
        proxySocket.connect(socketAddress, timeout);
        this.socket = (SSLSocket) socketFactory.createSocket(proxySocket,
                ((InetSocketAddress) socketAddress).getHostName(), ((InetSocketAddress) socketAddress).getPort(), true);
    }

    @Override
    public String[] getSupportedCipherSuites() {
        return this.socket.getSupportedCipherSuites();
    }

    @Override
    public String[] getEnabledCipherSuites() {
        return this.socket.getEnabledCipherSuites();
    }

    @Override
    public void setEnabledCipherSuites(String[] strings) {
        this.socket.setEnabledCipherSuites(strings);
    }

    @Override
    public String[] getSupportedProtocols() {
        return this.socket.getSupportedProtocols();
    }

    @Override
    public String[] getEnabledProtocols() {
        return this.socket.getEnabledProtocols();
    }

    @Override
    public void setEnabledProtocols(String[] strings) {
        this.socket.setEnabledProtocols(strings);
    }

    @Override
    public SSLSession getSession() {
        return this.socket.getSession();
    }

    @Override
    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.socket.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override
    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.socket.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override
    public void startHandshake() throws IOException {
        this.socket.startHandshake();
    }

    @Override
    public void setUseClientMode(boolean b) {
        this.socket.setUseClientMode(b);
    }

    @Override
    public boolean getUseClientMode() {
        return this.socket.getUseClientMode();
    }

    @Override
    public void setNeedClientAuth(boolean b) {
        this.socket.setNeedClientAuth(b);
    }

    @Override
    public boolean getNeedClientAuth() {
        return this.socket.getNeedClientAuth();
    }

    @Override
    public void setWantClientAuth(boolean b) {
        this.socket.setWantClientAuth(b);
    }

    @Override
    public boolean getWantClientAuth() {
        return this.socket.getWantClientAuth();
    }

    @Override
    public void setEnableSessionCreation(boolean b) {
        this.socket.setEnableSessionCreation(b);
    }

    @Override
    public boolean getEnableSessionCreation() {
        return this.socket.getEnableSessionCreation();
    }

    @Override
    public SSLParameters getSSLParameters() {
        return this.socket.getSSLParameters();
    }

    @Override
    public void setSSLParameters(SSLParameters sslParameters) {
        this.socket.setSSLParameters(sslParameters);
    }

    @Override
    public InetAddress getInetAddress() {
        return this.socket.getInetAddress();
    }

    @Override
    public InetAddress getLocalAddress() {
        return this.socket.getLocalAddress();
    }

    @Override
    public int getPort() {
        return this.socket.getPort();
    }

    @Override
    public int getLocalPort() {
        return this.socket.getLocalPort();
    }

    @Override
    public SocketAddress getRemoteSocketAddress() {
        return this.socket.getRemoteSocketAddress();
    }

    @Override
    public SocketAddress getLocalSocketAddress() {
        return this.socket.getLocalSocketAddress();
    }

    @Override
    public SocketChannel getChannel() {
        return this.socket.getChannel();
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return this.socket.getInputStream();
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        return this.socket.getOutputStream();
    }

    @Override
    public void setTcpNoDelay(boolean b) throws SocketException {
        this.socket.setTcpNoDelay(b);
    }

    @Override
    public boolean getTcpNoDelay() throws SocketException {
        return this.socket.getTcpNoDelay();
    }

    @Override
    public void setSoLinger(boolean b, int i) throws SocketException {
        this.socket.setSoLinger(b, i);
    }

    @Override
    public int getSoLinger() throws SocketException {
        return this.socket.getSoLinger();
    }

    @Override
    public void sendUrgentData(int i) throws IOException {
        this.socket.sendUrgentData(i);
    }

    @Override
    public void setOOBInline(boolean b) throws SocketException {
        this.socket.setOOBInline(b);
    }

    @Override
    public boolean getOOBInline() throws SocketException {
        return this.socket.getOOBInline();
    }

    @Override
    public synchronized int getSoTimeout() throws SocketException {
        return this.socket.getSoTimeout();
    }

    @Override
    public synchronized void setSendBufferSize(int i) throws SocketException {
        this.socket.setSendBufferSize(i);
    }

    @Override
    public synchronized int getSendBufferSize() throws SocketException {
        return this.socket.getSendBufferSize();
    }

    @Override
    public synchronized void setReceiveBufferSize(int i) throws SocketException {
        this.socket.setReceiveBufferSize(i);
    }

    @Override
    public synchronized int getReceiveBufferSize() throws SocketException {
        return this.socket.getReceiveBufferSize();
    }

    @Override
    public void setKeepAlive(boolean b) throws SocketException {
        this.socket.setKeepAlive(b);
    }

    @Override
    public boolean getKeepAlive() throws SocketException {
        return this.socket.getKeepAlive();
    }

    @Override
    public void setTrafficClass(int i) throws SocketException {
        this.socket.setTrafficClass(i);
    }

    @Override
    public int getTrafficClass() throws SocketException {
        return this.socket.getTrafficClass();
    }

    @Override
    public void setReuseAddress(boolean b) throws SocketException {
        this.socket.setReuseAddress(b);
    }

    @Override
    public boolean getReuseAddress() throws SocketException {
        return this.socket.getReuseAddress();
    }

    @Override
    public synchronized void close() throws IOException {
        this.socket.close();
    }

    @Override
    public void shutdownInput() throws IOException {
        this.socket.shutdownInput();
    }

    @Override
    public void shutdownOutput() throws IOException {
        this.socket.shutdownOutput();
    }

    @Override
    public String toString() {
        return this.socket.toString();
    }

    @Override
    public boolean isConnected() {
        return this.socket.isConnected();
    }

    @Override
    public boolean isBound() {
        return this.socket.isBound();
    }

    @Override
    public boolean isClosed() {
        return this.socket.isClosed();
    }

    @Override
    public boolean isInputShutdown() {
        return this.socket.isInputShutdown();
    }

    @Override
    public boolean isOutputShutdown() {
        return this.socket.isOutputShutdown();
    }

    @Override
    public void setPerformancePreferences(int i, int i1, int i2) {
        this.socket.setPerformancePreferences(i, i1, i2);
    }
}
