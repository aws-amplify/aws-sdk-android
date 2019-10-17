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

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;
import java.security.UnrecoverableKeyException;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.OpenSSLProvider;

/**
 * AWSIoTSslUtility Utility class for creating an SSL Socket Factory from
 * certs/keys in keystore.
 */
final class AWSIotSslUtility {

    protected static final String[] ALPN_EXTENSION = {"x-amzn-mqtt-ca"};
    private static final String TLS_V_1_2 = "TLSv1.2";

    /**
     * Utility class.
     */
    private AWSIotSslUtility() {
    }

    /**
     * Creates a socket factory given a keystore and a portNumber.
     *
     * @param keyStore keystore containing a certificate and private key for
     *            used in creating a secured socket.
     * @param portNumber Port number used for connecting to Iot
     * @return a socket factory for use in creating a secured socket.
     * @throws NoSuchAlgorithmException when TLS 1.2 is not available.
     * @throws UnrecoverableKeyException when the private key cannot be
     *             recovered. Ususally a bad keystore password.
     * @throws KeyStoreException when keystore cannot be created.
     * @throws KeyManagementException when SSL context cannot be created by key
     *             manager.
     */
    public static SSLSocketFactory getSocketFactoryWithKeyStore(KeyStore keyStore, int portNumber)
            throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException,
            KeyManagementException, NoSuchProviderException {
        SSLContext context;

        if (portNumber == 443) {
            // Use Conscrypt as security provider
            Security.addProvider(new OpenSSLProvider());
            context = SSLContext.getInstance(TLS_V_1_2, "Conscrypt");
        } else {
            context = SSLContext.getInstance(TLS_V_1_2);
        }

        KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory
                .getDefaultAlgorithm());
        kmf.init(keyStore, AWSIotKeystoreHelper.AWS_IOT_INTERNAL_KEYSTORE_PASSWORD.toCharArray());

        KeyManager[] km = kmf.getKeyManagers();

        context.init(km, null, new SecureRandom());

        return new AWSIotTLSSocketFactory(context.getSocketFactory());
    }

    /**
     * Creates a socket factory given a keystore, a portNumber and a proxy identified by its
     * host and port.
     *
     * @param keyStore keystore containing a certificate and private key for
     *            used in creating a secured socket.
     * @param portNumber Port number used for connecting to Iot
     * @param proxyHost proxy host
     * @param proxyPort proxy port
     * @return a socket factory for use in creating a secured socket.
     * @throws NoSuchAlgorithmException when TLS 1.2 is not available.
     * @throws UnrecoverableKeyException when the private key cannot be
     *             recovered. Usually a bad keystore password.
     * @throws KeyStoreException when keystore cannot be created.
     * @throws KeyManagementException when SSL context cannot be created by key
     *             manager.
     */
    public static SSLSocketFactory getSocketFactoryWithKeyStoreAndProxy(KeyStore keyStore,
                                                                        int portNumber, String proxyHost,
                                                                        int proxyPort)
            throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException,
            KeyManagementException, NoSuchProviderException {
        return new AWSIotProxiedSocketFactory(getSocketFactoryWithKeyStore(keyStore, portNumber), proxyHost, proxyPort);
    }
}
