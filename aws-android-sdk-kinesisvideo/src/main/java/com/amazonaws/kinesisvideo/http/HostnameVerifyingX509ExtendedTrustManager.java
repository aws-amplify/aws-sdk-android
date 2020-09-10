package com.amazonaws.kinesisvideo.http;

import com.amazonaws.kinesisvideo.common.logging.Log;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/*
     Adapted from (Apache 2.0 License):

     https://github.com/apache/zookeeper/blob/master/zookeeper-server/src/main/java/org/apache/zookeeper/common/
     ZKTrustManager.java

     A custom TrustManager that supports hostname verification via org.apache.http.conn.ssl.DefaultHostnameVerifier.
     *
     * We attempt to perform verification using just the IP address first and if that fails will attempt to perform a
     * reverse DNS lookup and verify using the hostname.
*/

public class HostnameVerifyingX509ExtendedTrustManager extends X509ExtendedTrustManager {

    private static final HostnameVerifier DEFAULT_HOSTNAME_VERIFIER = HostnameVerifier.INSTANCE;
    private Log log = new Log(Log.SYSTEM_OUT);
    private final boolean clientSideHostnameVerificationEnabled;

    private final X509ExtendedTrustManager x509ExtendedTrustManager;

    public HostnameVerifyingX509ExtendedTrustManager(final boolean clientSideHostnameVerificationEnabled) {
        this.x509ExtendedTrustManager = getX509ExtendedTrustManager();
        this.clientSideHostnameVerificationEnabled = clientSideHostnameVerificationEnabled;
    }

    private X509ExtendedTrustManager getX509ExtendedTrustManager() {
        TrustManagerFactory factory;
        try {
            factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            factory.init((KeyStore) null);
        } catch (NoSuchAlgorithmException nsae) {
            throw new RuntimeException("Unable to initialize default TrustManagerFactory", nsae);
        } catch (KeyStoreException nse) {
            throw new RuntimeException("Unable to initialize default TrustManagerFactory", nse);
        }

        for (TrustManager tm: factory.getTrustManagers()) {
            if (tm instanceof X509ExtendedTrustManager) {
                return (X509ExtendedTrustManager) tm;
            }
        }

        throw new RuntimeException("No default X509TrustManager found");
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return x509ExtendedTrustManager.getAcceptedIssuers();
    }

    @Override
    public void checkClientTrusted(
            final X509Certificate[] chain,
            final String authType,
            final Socket socket) throws CertificateException {
        x509ExtendedTrustManager.checkClientTrusted(chain, authType, socket);
        if (clientSideHostnameVerificationEnabled) {
            performHostVerification(socket.getInetAddress(), chain[0]);
        }
    }

    @Override
    public void checkServerTrusted(
            final X509Certificate[] chain,
            final String authType,
            final Socket socket) throws CertificateException {
        x509ExtendedTrustManager.checkServerTrusted(chain, authType, socket);
        performHostVerification(socket.getInetAddress(), chain[0]);
    }

    @Override
    public void checkClientTrusted(
            final X509Certificate[] chain,
            final String authType,
            final SSLEngine engine) throws CertificateException {
        x509ExtendedTrustManager.checkClientTrusted(chain, authType, engine);
        if (clientSideHostnameVerificationEnabled) {
            try {
                performHostVerification(InetAddress.getByName(engine.getPeerHost()), chain[0]);
            } catch (UnknownHostException e) {
                throw new CertificateException("Failed to verify host", e);
            }
        }
    }

    @Override
    public void checkServerTrusted(
            final X509Certificate[] chain,
            final String authType,
            final SSLEngine engine) throws CertificateException {
        x509ExtendedTrustManager.checkServerTrusted(chain, authType, engine);
        try {
            performHostVerification(InetAddress.getByName(engine.getPeerHost()), chain[0]);
        } catch (UnknownHostException e) {
            throw new CertificateException("Failed to verify host", e);
        }
    }

    @Override
    public void checkClientTrusted(final X509Certificate[] chain, final String authType) throws CertificateException {
        x509ExtendedTrustManager.checkClientTrusted(chain, authType);
    }

    @Override
    public void checkServerTrusted(final X509Certificate[] chain, final String authType) throws CertificateException {
        x509ExtendedTrustManager.checkServerTrusted(chain, authType);
    }

    /**
     * Compares peer's hostname with the one stored in the provided client certificate. Performs verification
     * with the help of provided HostnameVerifier.
     *
     * @param inetAddress Peer's inet address.
     * @param certificate Peer's certificate
     * @throws CertificateException Thrown if the provided certificate doesn't match the peer hostname.
     */
    public void performHostVerification(
            final InetAddress inetAddress,
            final X509Certificate certificate
    ) throws CertificateException {
        performHostVerification(inetAddress.getHostAddress(), inetAddress.getHostName(), certificate);
    }

    /**
     * Compares peer's hostname with the one stored in the provided client certificate. Performs verification
     * with the help of provided HostnameVerifier.
     *
     * @param hostAddress Peer's host address.
     * @param hostName Peer's host name.
     * @param certificate Peer's certificate
     * @throws CertificateException Thrown if the provided certificate doesn't match the peer hostname.
     */
    public void performHostVerification(
            final String hostAddress,
            final String hostName,
            final X509Certificate certificate
    ) throws CertificateException {
        if (DEFAULT_HOSTNAME_VERIFIER.verify(hostAddress, certificate)) {
            return;
        }

        log.debug(
                "Failed to verify host address: {} attempting to verify host name with reverse dns lookup",
                hostAddress);

        if (DEFAULT_HOSTNAME_VERIFIER.verify(hostName, certificate)) {
            return;
        }

        log.error("Failed to verify host address: %s", hostAddress);
        log.error("Failed to verify hostname: %s", hostName);
        throw new CertificateException("Failed to verify both host address and host name");
    }
}
