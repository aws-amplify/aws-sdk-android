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
import org.conscrypt.Conscrypt;
import org.conscrypt.OpenSSLProvider;

/**
 * AWSIoTSslUtility Utility class for creating an SSL Socket Factory from
 * certs/keys in keystore.
 */
final class AWSIotSslUtility {

    /**
     * Utility class.
     */
    private AWSIotSslUtility() {
    }

    /**
     * Creates a socket factory given a keystore.
     *
     * @param keyStore keystore containing a certificate and private key for
     *            used in creating a secured socket.
     * @return a socket factory for use in creating a secured socket.
     * @throws NoSuchAlgorithmException when TLS 1.2 is not available.
     * @throws UnrecoverableKeyException when the private key cannot be
     *             recovered. Ususally a bad keystore password.
     * @throws KeyStoreException when keystore cannot be created.
     * @throws KeyManagementException when SSL context cannot be created by key
     *             manager.
     */
    protected static final String[] ALPN_EXTENSION = {"x-amzn-mqtt-ca"};
    private static final String TLS_V_1_2 = "TLSv1.2";

    public static SSLSocketFactory getSocketFactoryWithKeyStore(KeyStore keyStore)
            throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException,
            KeyManagementException {

        Security.addProvider(new OpenSSLProvider());
        SSLContext context;

        try {
            // Attempt to use Conscrypt
            context = SSLContext.getInstance(TLS_V_1_2, "Conscrypt");
        } catch (NoSuchProviderException e) {
            // Fallback to system SSLContext
            context = SSLContext.getInstance(TLS_V_1_2);
        }

        KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory
                .getDefaultAlgorithm());
        kmf.init(keyStore, AWSIotKeystoreHelper.AWS_IOT_INTERNAL_KEYSTORE_PASSWORD.toCharArray());

        KeyManager[] km = kmf.getKeyManagers();

        context.init(km, null, new SecureRandom());

        return new AWSIotTLSSocketFactory(context.getSocketFactory());
    }
}
