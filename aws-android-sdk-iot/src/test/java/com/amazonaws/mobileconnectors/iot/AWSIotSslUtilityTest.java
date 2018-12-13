
package com.amazonaws.mobileconnectors.iot;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.security.KeyPair;
import java.security.KeyStore;

import javax.net.ssl.SSLSocketFactory;

public class AWSIotSslUtilityTest {

    private final static String TestCert = "-----BEGIN CERTIFICATE-----\n" +
            "MIIDlTCCAn2gAwIBAgIVAKuR4L6GajQRv1DzXlUFigMoiwzsMA0GCSqGSIb3DQEB\n" +
            "CwUAME0xSzBJBgNVBAsMQkFtYXpvbiBXZWIgU2VydmljZXMgTz1BbWF6b24uY29t\n" +
            "IEluYy4gTD1TZWF0dGxlIFNUPVdhc2hpbmd0b24gQz1VUzAeFw0xNTA5MTUwMDEz\n" +
            "MjhaFw00OTEyMzEyMzU5NTlaMFkxCzAJBgNVBAYTAlVTMQswCQYDVQQIEwJXQTEQ\n" +
            "MA4GA1UEBxMHU2VhdHRsZTEPMA0GA1UEChMGQW1hem9uMQwwCgYDVQQLEwNBV1Mx\n" +
            "DDAKBgNVBAMTA1NESzCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBALrx\n" +
            "n1ZGjBDdasdmuJh8F/KxhMSB/u7f8olGaoPtkvFHkzCf3sXqoHVxzYITzWH8UlmM\n" +
            "hNJ0CaRfcT/Dmi0PDxPrPQLR1/MjV9WpHTLfI2kA+PI+d4LnnlYQYnQc9wgZIX2c\n" +
            "+D0mA12By8BRduwM3rDAULmwjjfFX/MLLkDDng+mEIMjXOZnWjMJ3dorSzajVP2C\n" +
            "bWt1JMRGoSjY2fQVBc2JzU+7y9s9fxMO5329Hne1E8bNVZd+rHJKlJhvIWJCAoya\n" +
            "NnF4whXMp+UHGPJdhHQCnSPbX5r2c2UdDL/1bftNlX6grCmivuIv6qw+dtA4V7pc\n" +
            "lsMSEt9zFrVJ6VkZXbUCAwEAAaNgMF4wHwYDVR0jBBgwFoAULXQSP9o80neirjAW\n" +
            "SlF+yZWjLh0wHQYDVR0OBBYEFCDoMMxiSPyy4D6a5qhg+6FXZtMtMAwGA1UdEwEB\n" +
            "/wQCMAAwDgYDVR0PAQH/BAQDAgeAMA0GCSqGSIb3DQEBCwUAA4IBAQAtlG5ytjMN\n" +
            "c95dlafQVhPoAKEJ0JkDYl3ZmbNYHXgTQfG08a8zFQLLECODiiO/5HyNaAI3Pzc3\n" +
            "M580RijF/D23XUHLCvVxaeZgQnJbs+xmHPIeFxCiGfBXBTET3IZApXW2V92dcZf3\n" +
            "Pccbfemdl7t7KycuBNszbTsCZygg5sq1NTCF0ZkSGuJfmbjO9YBY2bV8H66pNdCq\n" +
            "72nhlD7w3fTcfpo8rmz7CzNTVg9bGILUnr7WiaC3nCxsM1EiPH/JRGSKrbA2/96B\n" +
            "7OWv9idOJbp/fKdub3lqzWwPtMwLWAyM/sevEqQbWOvH3sfPafYYp3iwAQmFdCJG\n" +
            "0zaDUnQHDFV8\n" +
            "-----END CERTIFICATE-----";

    private static final String CERT_ID = "unittest";
    private static final String KEYSTORE_PATH = "./";
    private static final String KEYSTORE_NAME = "unit_test_keystore";
    private static final String KEYSTORE_PASSWORD = AWSIotKeystoreHelper.AWS_IOT_INTERNAL_KEYSTORE_PASSWORD;

    @Before
    public void setUp() throws Exception {
        // generate keys
        KeyPair testKP = AWSIotKeystoreHelper.generatePrivateAndPublicKeys();

        // save in keystore
        AWSIotKeystoreHelper.saveCertificateAndPrivateKey(CERT_ID, TestCert, testKP.getPrivate(),
                KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
    }

    @After
    public void tearDown() throws Exception {
        File keystoreFile = new File(KEYSTORE_PATH, KEYSTORE_NAME);
        if (keystoreFile.exists()) {
            keystoreFile.delete();
        }
    }

    @Test
    public void testGetSocketFactory() throws Exception {
        File keystoreFile = new File(KEYSTORE_PATH, KEYSTORE_NAME);
        FileInputStream fis = new FileInputStream(keystoreFile);
        KeyStore testKeystore = KeyStore.getInstance(KeyStore.getDefaultType());
        testKeystore.load(fis,
                AWSIotKeystoreHelper.AWS_IOT_INTERNAL_KEYSTORE_PASSWORD.toCharArray());
        SSLSocketFactory factory = AWSIotSslUtility.getSocketFactoryWithKeyStore(testKeystore);
        assertTrue(factory instanceof AWSIotTLSSocketFactory);
    }
}
