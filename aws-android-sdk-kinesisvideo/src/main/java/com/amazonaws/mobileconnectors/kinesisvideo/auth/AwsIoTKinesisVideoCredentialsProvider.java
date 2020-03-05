package com.amazonaws.mobileconnectors.kinesisvideo.auth;

import android.support.annotation.NonNull;

import com.amazonaws.kinesisvideo.auth.AbstractKinesisVideoCredentialsProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

import com.amazonaws.kinesisvideo.auth.KinesisVideoCredentials;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AwsIoTKinesisVideoCredentialsProvider extends AbstractKinesisVideoCredentialsProvider {

    private static final String TLS = "TLS";

    private String awsIotAuthUrl;
    private String keyStoreLocation;
    private String keyStorePassword;
    private SSLSocketFactory sslSocketFactory;
    private Gson gson;
    private final Log log;
    private String iotDeviceName;

    public AwsIoTKinesisVideoCredentialsProvider(@NonNull final String iotDeiveName,
                                                 @NonNull final String awsIotAuthUrl,
                                                 @NonNull final String keyStoreLocation,
                                                 @NonNull final String keyStorePassword,
                                                 @NonNull Log log) throws UnrecoverableKeyException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException {
        this.iotDeviceName = iotDeiveName;
        this.awsIotAuthUrl = Preconditions.checkNotNull(awsIotAuthUrl);
        this.keyStorePassword = Preconditions.checkNotNull(keyStorePassword);
        this.keyStoreLocation = Preconditions.checkNotNull(keyStoreLocation);
        this.log = Preconditions.checkNotNull(log);
        this.sslSocketFactory = getFactory( this.keyStoreLocation, this.keyStorePassword );
        this.gson = new GsonBuilder().registerTypeAdapter(AwsIoTSessionCredentials.class, new AwsIoTSessionCredentialsDeserializer()).create();
    }

    @Override
    protected KinesisVideoCredentials updateCredentials() throws KinesisVideoException {
        AwsIoTSessionCredentials awsCredentials;

        try {
            awsCredentials = this.refresh();
            return new KinesisVideoCredentials(awsCredentials.getAccessKeyId(),
                    awsCredentials.getSecretAccessKey(),
                    awsCredentials.getSessionToken(),
                    awsCredentials.getExpiration());
        } catch (Exception e) {
            throw new KinesisVideoException(e);
        }
    }

    public String getAwsIotAuthUrl() {
        return awsIotAuthUrl;
    }

    public void setAwsIotAuthUrl(String awsIotAuthUrl) {
        this.awsIotAuthUrl = awsIotAuthUrl;
    }

    public String getKeyStoreLocation() {
        return keyStoreLocation;
    }

    public void setKeyStoreLocation(String keyStoreLocation) {
        this.keyStoreLocation = keyStoreLocation;
    }

    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    public void setKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
    }

    private AwsIoTSessionCredentials refresh(){
        try {
            log.debug("Retrieving IoT Session Credentials from: " + this.awsIotAuthUrl);

            URL url = new URL(this.awsIotAuthUrl);
            HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
            urlConnection.setSSLSocketFactory(this.sslSocketFactory);
            urlConnection.setRequestProperty("x-amzn-iot-thingname", iotDeviceName);
            BufferedReader bufferedInputReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            AwsIoTSessionCredentials awsIoTcredentials = serializeAuthorizationResponse(bufferedInputReader);
            if( awsIoTcredentials != null && awsIoTcredentials.getAccessKeyId() != null
                    && awsIoTcredentials.getSecretAccessKey() != null
                    && awsIoTcredentials.getSessionToken() != null
                    && awsIoTcredentials.getExpiration() != null) {
                log.debug("Successfully retrieved IoT Session Credentials: " + awsIoTcredentials);

                return awsIoTcredentials;
            } else {
                log.error("AWS IoT Credentials Response Information is null " + awsIoTcredentials);
                return null;
            }

        } catch (IOException e) {
            log.exception(e, " Error retrieving IoT credentials");
            return null;
        }

    }

    private AwsIoTSessionCredentials serializeAuthorizationResponse(BufferedReader bufferedInputReader) throws IOException {
        String credentialsResponseLine;
        credentialsResponseLine = bufferedInputReader.readLine();
        return gson.fromJson(credentialsResponseLine, AwsIoTSessionCredentials.class);
    }

    private SSLSocketFactory getFactory( String keyManagerLocation, String keyPassword ) throws NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException, UnrecoverableKeyException, KeyManagementException  {
        File keyManagerfile = new File(keyManagerLocation);
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());

        InputStream keyInput = new FileInputStream(keyManagerfile);
        keyStore.load(keyInput, keyPassword.toCharArray());
        keyInput.close();

        keyManagerFactory.init(keyStore, keyPassword.toCharArray());
        SSLContext context = SSLContext.getInstance(TLS);
        context.init(keyManagerFactory.getKeyManagers(), null, new SecureRandom());

        return context.getSocketFactory();
    }

}
