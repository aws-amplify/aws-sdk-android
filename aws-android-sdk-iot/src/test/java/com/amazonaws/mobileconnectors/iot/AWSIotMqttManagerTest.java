
package com.amazonaws.mobileconnectors.iot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.util.StringUtils;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.io.File;
import java.security.KeyPair;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE, emulateSdk = 16, reportSdk = 16)
public class AWSIotMqttManagerTest {

    // This certificate is an invalid (to AWS IoT) certificate for unit testing only.
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
    private static final String KEYSTORE_PASSWORD = "test";
    private static final String TEST_ENDPOINT = "ABCDEFG.iot.us-east-1.amazonaws.com";
    private static final String TEST_ENDPOINT_PREFIX = "ABCDEFG";

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
    public void testCreateClientWithPrefix() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);

        assertEquals(true, testClient.isAutoReconnect());
        assertEquals(4, testClient.getReconnectTimeout());
        assertEquals(4, testClient.getMinReconnectRetryTime());
        assertEquals(64, testClient.getMaxReconnectRetryTime());
        assertEquals(10, testClient.getMaxAutoReconnectAttempts());
        assertEquals(300, testClient.getKeepAlive());
        assertEquals(10, testClient.getConnectionStabilityTime());
        assertTrue(testClient.isOfflinePublishQueueEnabled());
        assertEquals(100L, (long)testClient.getOfflinePublishQueueBound());
        assertEquals(TEST_ENDPOINT_PREFIX, testClient.getAccountEndpointPrefix());
        assertEquals(MqttManagerConnectionState.Disconnected, testClient.getConnectionState());


        testClient.setAutoReconnect(false);
        testClient.setReconnectRetryLimits(64, 128);
        testClient.setMaxAutoReconnectAttepts(5);
        testClient.setKeepAlive(20);
        testClient.setConnectionStabilityTime(25);
        testClient.setOfflinePublishQueueEnabled(false);
        testClient.setOfflinePublishQueueBound(50);

        AWSIotMqttLastWillAndTestament lwt = new AWSIotMqttLastWillAndTestament("test/lwt", "bye",
                AWSIotMqttQos.QOS0);
        testClient.setMqttLastWillAndTestament(lwt);

        assertEquals(testClient.isAutoReconnect(), false);
        assertEquals(64, testClient.getReconnectTimeout());
        assertEquals(64, testClient.getMinReconnectRetryTime());
        assertEquals(128, testClient.getMaxReconnectRetryTime());
        assertEquals(5, testClient.getMaxAutoReconnectAttempts());
        assertEquals(20, testClient.getKeepAlive());
        assertEquals(25, testClient.getConnectionStabilityTime());
        assertFalse(testClient.isOfflinePublishQueueEnabled());
        assertEquals(50L, (long)testClient.getOfflinePublishQueueBound());

        assertEquals("test/lwt", testClient.getMqttLastWillAndTestament().getTopic());
        assertEquals("bye", testClient.getMqttLastWillAndTestament().getMessage());
        assertEquals(AWSIotMqttQos.QOS0, testClient.getMqttLastWillAndTestament().getQos());
    }

    @Test
    public void testCreateClientWithEndpoint() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                "ABCDEFG.iot.us-east-1.amazonaws.com");

        assertEquals(true, testClient.isAutoReconnect());
        assertEquals(4, testClient.getReconnectTimeout());
        assertEquals(4, testClient.getMinReconnectRetryTime());
        assertEquals(64, testClient.getMaxReconnectRetryTime());
        assertEquals(10, testClient.getMaxAutoReconnectAttempts());
        assertEquals(300, testClient.getKeepAlive());
        assertEquals(10, testClient.getConnectionStabilityTime());
        assertTrue(testClient.isOfflinePublishQueueEnabled());
        assertEquals(100L, (long)testClient.getOfflinePublishQueueBound());
        assertEquals(Region.getRegion(Regions.US_EAST_1), testClient.getRegion());
        assertEquals(MqttManagerConnectionState.Disconnected, testClient.getConnectionState());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateClientNullRegion() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client", null, TEST_ENDPOINT_PREFIX);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateClientNullClientId() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager(null,
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateClientEmptyClientId() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateClientNullEndpointPrefix() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalReconnectTimes() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), null);
        assertEquals(64, testClient.getMaxReconnectRetryTime());
        testClient.setReconnectRetryLimits(16, 15);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateClientWithEndpointNullClientId() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager(null, "ABCDEFG.iot.us-east-1.amazonaws.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateClientWithEndpointEmptyClientId() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("", "ABCDEFG.iot.us-east-1.amazonaws.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateClientWithEndpointBadEndpoint1() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client", "ABCDEFG.us-east-1.amazonaws.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateClientWithEndpointBadEndpointRegion() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client", "ABCDEFG.us-east-9.amazonaws.com");
    }

    public void testLegalReconnectTimeEqual() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), null);
        assertEquals(4, testClient.getMaxReconnectRetryTime());
        testClient.setReconnectRetryLimits(16, 16);
        assertEquals(16, testClient.getMinReconnectRetryTime());
        assertEquals(16, testClient.getMaxReconnectRetryTime());
    }

    @Test
    public void testConnect() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        assertEquals(1, mockClient.connectCalls);
        assertTrue(mockClient.mostRecentOptions.isCleanSession());
        assertEquals(300, mockClient.mostRecentOptions.getKeepAliveInterval());
        assertEquals(2, csb.statuses.size());
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting, csb.statuses.get(0));
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected, csb.statuses.get(1));
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
    }

    @Test
    public void testConnectWebSocket() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client", Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        testClient.connect(new TestAwsCredentialsProvider(), csb);
        Thread.sleep(500);  // connect is async, will return before callback is actually set in connect()
        mockClient.mockConnectSuccess();

        assertEquals(1, mockClient.connectCalls);
        assertTrue(mockClient.mostRecentOptions.isCleanSession());
        assertEquals(300, mockClient.mostRecentOptions.getKeepAliveInterval());
        assertEquals(2, csb.statuses.size());
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting, csb.statuses.get(0));
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected, csb.statuses.get(1));
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
    }

    @Test
    public void testConnectWithLwt() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        AWSIotMqttLastWillAndTestament lwt = new AWSIotMqttLastWillAndTestament("test/lwt", "bye",
                AWSIotMqttQos.QOS0);
        testClient.setMqttLastWillAndTestament(lwt);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        assertEquals(1, mockClient.connectCalls);
        assertTrue(mockClient.mostRecentOptions.isCleanSession());
        assertEquals(300, mockClient.mostRecentOptions.getKeepAliveInterval());
        assertEquals("test/lwt", mockClient.mostRecentOptions.getWillDestination());
        assertEquals("bye", new String(mockClient.mostRecentOptions.getWillMessage().getPayload()));
        assertEquals(AWSIotMqttQos.QOS0.asInt(),
                mockClient.mostRecentOptions.getWillMessage().getQos());
        assertFalse(mockClient.mostRecentOptions.getWillMessage().isRetained());
        assertEquals(2, csb.statuses.size());
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting, csb.statuses.get(0));
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected, csb.statuses.get(1));
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
    }

    @Test
    public void testConnectAlreadyConnected() throws Exception {

        MockMqttClient mockClient = new MockMqttClient();

        TestClientStatusCallback csb = new TestClientStatusCallback();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        assertEquals(1, mockClient.connectCalls);
        assertEquals(1, csb.statuses.size());
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting, csb.statuses.get(0));
        assertEquals(MqttManagerConnectionState.Connecting, testClient.getConnectionState());

        // should still be connecting
        testClient.connect(testKeystore, csb);
        assertEquals(1, mockClient.connectCalls);
        assertEquals(2, csb.statuses.size());
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting, csb.statuses.get(1));
        assertEquals(MqttManagerConnectionState.Connecting, testClient.getConnectionState());

        mockClient.mockConnectSuccess();

        // now will be connected
        testClient.connect(testKeystore, csb);
        assertEquals(1, mockClient.connectCalls);
        assertEquals(4, csb.statuses.size());
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected, csb.statuses.get(2));
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected, csb.statuses.get(3));
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
    }

    @Test
    public void testConnectDisconnectConnect() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setAutoReconnect(false);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        testClient.disconnect();
        assertEquals(MqttManagerConnectionState.Disconnected, testClient.getConnectionState());
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        assertEquals(2, mockClient.connectCalls);
    }

    @Test
    public void testConnectFailureReconnects() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setAutoReconnect(true);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectFail();

        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());
    }

    @Test
    public void testConnectFailureWithAutoreconnectDisabled() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setAutoReconnect(false);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectFail();

        assertEquals(MqttManagerConnectionState.Disconnected, testClient.getConnectionState());
    }

    @Test
    public void testConnectFailureConnectedException() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();
        mockClient.throwsExceptionOnConnect = true;
        mockClient.connectException = new MqttException(MqttException.REASON_CODE_CLIENT_CONNECTED);

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);

        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
    }

    @Test
    public void testConnectFailureConnectingException() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();
        mockClient.throwsExceptionOnConnect = true;
        mockClient.connectException = new MqttException(MqttException.REASON_CODE_CONNECT_IN_PROGRESS);

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);

        assertEquals(MqttManagerConnectionState.Connecting, testClient.getConnectionState());
    }

    @Test
    public void testConnectFailureOtherException() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();
        mockClient.throwsExceptionOnConnect = true;
        mockClient.connectException = new MqttException(MqttException.REASON_CODE_UNEXPECTED_ERROR);

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);

        assertEquals(MqttManagerConnectionState.Disconnected, testClient.getConnectionState());
    }

    @Test
    public void testAutoReconnectSuccess() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        testClient.setAutoReconnect(true);
        testClient.setKeepAlive(15);

        AWSIotMqttLastWillAndTestament lwt = new AWSIotMqttLastWillAndTestament("test/lwt", "bye",
                AWSIotMqttQos.QOS0);
        testClient.setMqttLastWillAndTestament(lwt);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        // make sure we wait for 4 seconds, still 1 after 3 seconds
        Robolectric.getUiThreadScheduler().advanceBy(3000);
        assertEquals(1, mockClient.connectCalls);

        // now past 4
        Robolectric.getUiThreadScheduler().advanceBy(4100);
        /*
        Comment out this temporarily before we upgrade to Robolectric v3
         */
        //assertEquals(2, mockClient.connectCalls);

        assertTrue(mockClient.mostRecentOptions.isCleanSession());
        assertEquals(15, mockClient.mostRecentOptions.getKeepAliveInterval());
        assertEquals("test/lwt", mockClient.mostRecentOptions.getWillDestination());
        assertEquals("bye", new String(mockClient.mostRecentOptions.getWillMessage().getPayload()));
        assertEquals(AWSIotMqttQos.QOS0.asInt(),
                mockClient.mostRecentOptions.getWillMessage().getQos());
        assertFalse(mockClient.mostRecentOptions.getWillMessage().isRetained());

        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
    }


    @Test
    public void testAutoReconnectSuccessWebSocket() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setAutoReconnect(true);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        testClient.connect(new TestAwsCredentialsProvider(), csb);
        Thread.sleep(500);  // connect is async, will return before callback is actually set in connect()
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        // make sure we wait for 4 seconds, still 1 after 3 seconds
        Robolectric.getUiThreadScheduler().advanceBy(3000);
        assertEquals(1, mockClient.connectCalls);

        // now past 4
        Robolectric.getUiThreadScheduler().advanceBy(4100);
        /*
        Comment out this temporarily before we upgrade to Robolectric v3
         */
        //assertEquals(2, mockClient.connectCalls);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
    }

    @Test
    public void testAutoReconnectDisabled() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setAutoReconnect(false);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Disconnected, testClient.getConnectionState());
        assertEquals(1, mockClient.connectCalls);
    }

    @Test
    public void testAutoReconnectThreeAttempts() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setAutoReconnect(true);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        testClient.setUnitTestMillisOverride(1000L);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        assertEquals(1, mockClient.connectCalls);
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        // make sure we wait for 4 seconds, still 1 after 3 seconds
        Robolectric.getUiThreadScheduler().advanceBy(3000);
        testClient.setUnitTestMillisOverride(4000L);
        assertEquals(1, mockClient.connectCalls);

        // now past 4
        Robolectric.getUiThreadScheduler().advanceBy(1100);
        testClient.setUnitTestMillisOverride(5100L);
        /*
        Comment out this temporarily before we upgrade to Robolectric v3
         */
        //assertEquals(2, mockClient.connectCalls);
        mockClient.mockConnectFail();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        // make sure we wait for 8 seconds, still 2 after 7 seconds
        Robolectric.getUiThreadScheduler().advanceBy(6900);
        testClient.setUnitTestMillisOverride(12000L);
        //assertEquals(2, mockClient.connectCalls);

        // now past 8
        Robolectric.getUiThreadScheduler().advanceBy(1100);
        testClient.setUnitTestMillisOverride(13100L);

        //assertEquals(3, mockClient.connectCalls);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
    }


    @Test
    public void testAutoReconnectTimesEqual() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setAutoReconnect(true);
        testClient.setReconnectRetryLimits(16, 16);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        testClient.setUnitTestMillisOverride(1000L);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        assertEquals(1, mockClient.connectCalls);
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        // make sure we wait for 16 seconds, still 1 after 15 seconds
        Robolectric.getUiThreadScheduler().advanceBy(15000);
        testClient.setUnitTestMillisOverride(16000L);
        assertEquals(1, mockClient.connectCalls);

        // now past 16
        Robolectric.getUiThreadScheduler().advanceBy(1100);
        testClient.setUnitTestMillisOverride(7100L);
        /*
        Comment out this temporarily before we upgrade to Robolectric v3
         */
        //assertEquals(2, mockClient.connectCalls);
        mockClient.mockConnectFail();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        // make sure we again wait for 16 seconds, still 2 after 15 seconds
        Robolectric.getUiThreadScheduler().advanceBy(15900);
        testClient.setUnitTestMillisOverride(32000L);
        //assertEquals(2, mockClient.connectCalls);

        // now past 16
        Robolectric.getUiThreadScheduler().advanceBy(1100);
        testClient.setUnitTestMillisOverride(33100L);

        //assertEquals(3, mockClient.connectCalls);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
    }


    @Test
    public void testUserDisconnectStopsAutoReconnect() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setAutoReconnect(true);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        testClient.setUnitTestMillisOverride(1000L);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        assertEquals(1, mockClient.connectCalls);
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        // make sure we wait for 4 seconds, still 1 after 3 seconds
        Robolectric.getUiThreadScheduler().advanceBy(3000);
        testClient.setUnitTestMillisOverride(4000L);
        assertEquals(1, mockClient.connectCalls);

        // now past 4
        Robolectric.getUiThreadScheduler().advanceBy(1100);
        testClient.setUnitTestMillisOverride(5100L);

        //assertEquals(2, mockClient.connectCalls);
        mockClient.mockConnectFail();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        // user disconnect
        testClient.disconnect();
        assertEquals(MqttManagerConnectionState.Disconnected, testClient.getConnectionState());

        // advance past reconnect time and ensure we don't attempt a reconnect
        Robolectric.getUiThreadScheduler().advanceBy(10000);
        //assertEquals(2, mockClient.connectCalls);
        assertEquals(MqttManagerConnectionState.Disconnected, testClient.getConnectionState());
    }
    /*
        Comment out these tests temporarily before we upgrade to Robolectric v3
        Without being able to advance background handler thread, below tests connection state change,
        which is already covered by previous tests. 
     */
    /*
    @Test
    public void testAutoReconnectMaxAttempts() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setAutoReconnect(true);
        testClient.setMaxAutoReconnectAttempts(10);
        testClient.setReconnectRetryLimits(4, 64);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        assertEquals(1, mockClient.connectCalls);
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        // "fudge" factor to wait a little bit past the exact timeout
        // add it in here to offset the subtract the first time through the loop
        final int OFFSET_MILLISECONDS = 10;
        Robolectric.getUiThreadScheduler().advanceBy(OFFSET_MILLISECONDS);

        for (int i = 1; i <= 10; ++i) {
            assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());
            // make sure we wait for the full wait, still i connect calls before timeout
            // timeout doubles up to max, then rails out at max
            int timeout = Math.min((int) Math.pow(2, i + 1), 64);
            Robolectric.getUiThreadScheduler()
                    .advanceBy((timeout - 1) * 1000 - OFFSET_MILLISECONDS);
            assertEquals(i, mockClient.connectCalls);

            // now advance past timeout
            Robolectric.getUiThreadScheduler().advanceBy(1000 + OFFSET_MILLISECONDS);

            assertEquals(i + 1, mockClient.connectCalls);
            mockClient.mockConnectFail();
        }
        assertEquals(MqttManagerConnectionState.Disconnected, testClient.getConnectionState());

        // wait one more timeout, should not see another reconnect attempt
        Robolectric.getUiThreadScheduler().advanceBy(65 * 1000);
        // 1 initial connect, 10 reconnects
        assertEquals(11, mockClient.connectCalls);

        assertEquals(csb.statuses.size(),
                13);  // connecting, connected, reconnecting * 10, connection lost
        assertEquals(csb.statuses.get(csb.statuses.size() - 1),
                AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.ConnectionLost);
    }
    */
    /*
    @Test
    public void testAutoReconnectConnectShorterThanConnectTimerDoesNotReset() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setAutoReconnect(true);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        testClient.setUnitTestMillisOverride(15000L);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        assertEquals(1, mockClient.connectCalls);
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        // make sure we wait for 4 seconds, still 1 after 3 seconds
        Robolectric.getUiThreadScheduler().advanceBy(3000);
        assertEquals(1, mockClient.connectCalls);

        // now past 4
        Robolectric.getUiThreadScheduler().advanceBy(1100);

        assertEquals(2, mockClient.connectCalls);
        mockClient.mockConnectFail();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        // make sure we wait for 8 seconds, still 2 after 7 seconds
        Robolectric.getUiThreadScheduler().advanceBy(6900);
        assertEquals(2, mockClient.connectCalls);

        // now past 8
        Robolectric.getUiThreadScheduler().advanceBy(1100);

        assertEquals(3, mockClient.connectCalls);
        testClient.setUnitTestMillisOverride(20000L);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());

        // mock connected for 9 seconds
        testClient.setUnitTestMillisOverride(29000L);
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        // have not reset reconnect logic so this one will be 16 seconds
        // make sure we wait for 16 seconds, still 3 after 15 seconds
        Robolectric.getUiThreadScheduler().advanceBy(15000);
        assertEquals(3, mockClient.connectCalls);

        // now past 16
        Robolectric.getUiThreadScheduler().advanceBy(1100);

        assertEquals(4, mockClient.connectCalls);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
    }
    */

/*
    @Test
    public void testAutoReconnectConnectLongerThanConnectTimerDoesReset() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setAutoReconnect(true);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        testClient.setUnitTestMillisOverride(15000L);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        assertEquals(1, mockClient.connectCalls);
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        // make sure we wait for 4 seconds, still 1 after 3 seconds
        Robolectric.getUiThreadScheduler().advanceBy(3000);
        assertEquals(1, mockClient.connectCalls);

        // now past 4
        Robolectric.getUiThreadScheduler().advanceBy(1100);

        assertEquals(2, mockClient.connectCalls);
        mockClient.mockConnectFail();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        // make sure we wait for 8 seconds, still 2 after 7 seconds
        Robolectric.getUiThreadScheduler().advanceBy(6900);
        assertEquals(2, mockClient.connectCalls);

        // now past 8
        Robolectric.getUiThreadScheduler().advanceBy(1100);

        assertEquals(3, mockClient.connectCalls);
        testClient.setUnitTestMillisOverride(20000L);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());

        // mock connected for 11 seconds
        testClient.setUnitTestMillisOverride(31000L);
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        // reconnect logic has been reset so this will connect after the minimum time (4 seconds)
        // make sure we wait for 4 seconds, still 3 after 3 seconds
        Robolectric.getUiThreadScheduler().advanceBy(3000);
        assertEquals(3, mockClient.connectCalls);

        // now past 4
        Robolectric.getUiThreadScheduler().advanceBy(1100);

        assertEquals(4, mockClient.connectCalls);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
    }
*/
    @Test(expected = IllegalArgumentException.class)
    public void testConnectNullKeyStore() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        testClient.connect((KeyStore) null, csb);
        assertEquals(0, mockClient.connectCalls);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnectWebSocketNullCredentialsProvider() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client", Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        testClient.connect((AWSCredentialsProvider)null, csb);
    }

    @Config(manifest = Config.NONE, reportSdk = 15)
    @Test(expected = UnsupportedOperationException.class)
    public void testConnectSdkNotSufficient() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(null);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);

        assertEquals(0, mockClient.connectCalls);
    }

    @Test
    public void testDisconnect() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());

        testClient.disconnect();
        assertEquals(MqttManagerConnectionState.Disconnected, testClient.getConnectionState());

        assertEquals(1, mockClient.connectCalls);
        assertEquals(1, mockClient.disconnectCalls);
    }

    @Test
    public void testDisconnectWhenNotConnected() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        mockClient.isConnected = false;
        testClient.disconnect();

        assertEquals(0, mockClient.disconnectCalls);
    }

    @Test(expected = AmazonClientException.class)
    public void testDisconnectException() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();
        mockClient.throwsExceptionOnDisconnect = true;

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());

        testClient.disconnect();
    }

    @Test
    public void testSubscribeToTopic() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, null);

        TestNewMessageCallback mcb = new TestNewMessageCallback();

        testClient.subscribeToTopic("unit/test/topic", AWSIotMqttQos.QOS0, mcb);

        assertEquals(1, mockClient.subscribeCalls);
        assertTrue(mockClient.mockSubscriptions.containsKey("unit/test/topic"));
        assertEquals((Integer) 0, mockClient.mockSubscriptions.get("unit/test/topic"));

        MqttMessage msg = new MqttMessage();
        msg.setPayload("test payload".getBytes(StringUtils.UTF8));
        mockClient.mockCallback.messageArrived("unit/test/topic", msg);

        assertEquals(1, mcb.receivedMessages.size());
        assertEquals("unit/test/topic" + "test payload", mcb.receivedMessages.get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubscribeToTopicNullTopic() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, null);

        TestNewMessageCallback mcb = new TestNewMessageCallback();

        testClient.subscribeToTopic(null, AWSIotMqttQos.QOS0, mcb);

        assertEquals(0, mockClient.subscribeCalls);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubscribeToTopicEmptyTopic() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, null);

        TestNewMessageCallback mcb = new TestNewMessageCallback();

        testClient.subscribeToTopic("", AWSIotMqttQos.QOS0, mcb);

        assertEquals(0, mockClient.subscribeCalls);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubscribeToTopicNullQos() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, null);

        TestNewMessageCallback mcb = new TestNewMessageCallback();

        testClient.subscribeToTopic("unit/test/topic", null, mcb);

        assertEquals(0, mockClient.subscribeCalls);
    }

    @Test(expected = AmazonClientException.class)
    public void testSubscribeToTopicException() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();
        mockClient.throwsExceptionOnSubscribe = true;

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, null);

        TestNewMessageCallback mcb = new TestNewMessageCallback();

        testClient.subscribeToTopic("unit/test/topic", AWSIotMqttQos.QOS0, mcb);
    }

    @Test
    public void testSubscribeToTopicNullMqttClient() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, null);

        TestNewMessageCallback mcb = new TestNewMessageCallback();

        testClient.setMqttClient(null);

        testClient.subscribeToTopic("unit/test/topic", AWSIotMqttQos.QOS0, mcb);

        assertEquals(0, mockClient.subscribeCalls);
    }

    @Test
    public void testUnSubscribeTopic() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, null);

        TestNewMessageCallback mcb = new TestNewMessageCallback();

        testClient.subscribeToTopic("unit/test/topic", AWSIotMqttQos.QOS0, mcb);

        assertEquals(1, mockClient.subscribeCalls);
        assertTrue(mockClient.mockSubscriptions.containsKey("unit/test/topic"));
        assertEquals((Integer) 0, mockClient.mockSubscriptions.get("unit/test/topic"));

        MqttMessage msg = new MqttMessage();
        msg.setPayload("test payload".getBytes(StringUtils.UTF8));
        mockClient.mockCallback.messageArrived("unit/test/topic", msg);
        assertEquals(1, mcb.receivedMessages.size()); // received first one
        assertEquals("unit/test/topic" + "test payload", mcb.receivedMessages.get(0));

        testClient.unsubscribeTopic("unit/test/topic");

        assertEquals(1, mockClient.unsubscribeCalls);
        assertFalse(mockClient.mockSubscriptions.containsKey("unit/test/topic"));

        msg.setPayload("test payload".getBytes(StringUtils.UTF8));
        mockClient.mockCallback.messageArrived("unit/test/topic", msg);
        assertEquals(1, mcb.receivedMessages.size()); // didn't receive this one
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnSubscribeToTopicNullTopic() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, null);

        TestNewMessageCallback mcb = new TestNewMessageCallback();

        testClient.subscribeToTopic("unit/test/topic", AWSIotMqttQos.QOS0, mcb);
        testClient.unsubscribeTopic(null);

        assertEquals(0, mockClient.unsubscribeCalls);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnSubscribeToTopicEmptyTopic() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, null);

        TestNewMessageCallback mcb = new TestNewMessageCallback();

        testClient.subscribeToTopic("unit/test/topic", AWSIotMqttQos.QOS0, mcb);
        testClient.unsubscribeTopic("");

        assertEquals(0, mockClient.unsubscribeCalls);
    }

    @Test
    public void testUnSubscribeToTopicNullMqttClient() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, null);

        TestNewMessageCallback mcb = new TestNewMessageCallback();

        testClient.subscribeToTopic("unit/test/topic", AWSIotMqttQos.QOS0, mcb);
        testClient.setMqttClient(null);
        testClient.unsubscribeTopic("unit/test/topic");

        assertEquals(0, mockClient.unsubscribeCalls);
    }

    @Test(expected = AmazonClientException.class)
    public void testUnSubscribeToTopicException() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();
        mockClient.throwsExceptionOnUnsubscribe = true;

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, null);

        TestNewMessageCallback mcb = new TestNewMessageCallback();

        testClient.subscribeToTopic("unit/test/topic", AWSIotMqttQos.QOS0, mcb);
        testClient.unsubscribeTopic("unit/test/topic");
    }

    @Test
    public void testMessageArrivedOne() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, null);

        TestNewMessageCallback mcb = new TestNewMessageCallback();

        testClient.subscribeToTopic("unit/test/topic", AWSIotMqttQos.QOS0, mcb);

        MqttMessage msg = new MqttMessage();
        msg.setPayload("test payload".getBytes(StringUtils.UTF8));
        mockClient.mockCallback.messageArrived("unit/test/topic", msg);

        assertEquals(1, mcb.receivedMessages.size());
        assertEquals("unit/test/topic" + "test payload", mcb.receivedMessages.get(0));
    }

    @Test
    public void testMessageArrivedTwo() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, null);

        TestNewMessageCallback mcb = new TestNewMessageCallback();

        testClient.subscribeToTopic("unit/test/topic", AWSIotMqttQos.QOS0, mcb);
        testClient.subscribeToTopic("unit/test/+", AWSIotMqttQos.QOS0, mcb);

        assertEquals(2, mockClient.subscribeCalls);
        assertEquals(2, mockClient.mockSubscriptions.size());

        MqttMessage msg = new MqttMessage();
        msg.setPayload("test payload".getBytes(StringUtils.UTF8));
        mockClient.mockCallback.messageArrived("unit/test/topic", msg);

        assertEquals(2, mcb.receivedMessages.size());
        assertEquals("unit/test/topic" + "test payload", mcb.receivedMessages.get(0));
        assertEquals("unit/test/topic" + "test payload", mcb.receivedMessages.get(1));
    }

    @Test
    public void testMessageArrivedThree() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, null);

        TestNewMessageCallback mcb = new TestNewMessageCallback();

        testClient.subscribeToTopic("unit/test/topic", AWSIotMqttQos.QOS0, mcb);
        testClient.subscribeToTopic("unit/test/+", AWSIotMqttQos.QOS0, mcb);
        testClient.subscribeToTopic("unit/#", AWSIotMqttQos.QOS0, mcb);

        assertEquals(3, mockClient.subscribeCalls);
        assertEquals(3, mockClient.mockSubscriptions.size());

        MqttMessage msg = new MqttMessage();
        msg.setPayload("test payload".getBytes(StringUtils.UTF8));
        mockClient.mockCallback.messageArrived("unit/test/topic", msg);

        assertEquals(3, mcb.receivedMessages.size());
        assertEquals("unit/test/topic" + "test payload", mcb.receivedMessages.get(0));
        assertEquals("unit/test/topic" + "test payload", mcb.receivedMessages.get(1));
        assertEquals("unit/test/topic" + "test payload", mcb.receivedMessages.get(2));
    }

    @Test
    public void testMessageArrivedTooDeep() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, null);

        TestNewMessageCallback mcb = new TestNewMessageCallback();

        testClient.subscribeToTopic("unit/test/topic", AWSIotMqttQos.QOS0, mcb);

        MqttMessage msg = new MqttMessage();
        msg.setPayload("test payload".getBytes(StringUtils.UTF8));
        mockClient.mockCallback.messageArrived("unit/test/topic/subtopic", msg);

        assertEquals(0, mcb.receivedMessages.size());
    }

    @Test
    public void testMessageArrivedTooShallow() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, null);

        TestNewMessageCallback mcb = new TestNewMessageCallback();

        testClient.subscribeToTopic("unit/test/topic", AWSIotMqttQos.QOS0, mcb);

        MqttMessage msg = new MqttMessage();
        msg.setPayload("test payload".getBytes(StringUtils.UTF8));
        mockClient.mockCallback.messageArrived("unit/test", msg);

        assertEquals(0, mcb.receivedMessages.size());
    }

    @Test
    public void testMessageArrivedDifferent() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, null);

        TestNewMessageCallback mcb = new TestNewMessageCallback();

        testClient.subscribeToTopic("unit/test/topic", AWSIotMqttQos.QOS0, mcb);

        MqttMessage msg = new MqttMessage();
        msg.setPayload("test payload".getBytes(StringUtils.UTF8));
        mockClient.mockCallback.messageArrived("unit/test/differenttopic", msg);

        assertEquals(0, mcb.receivedMessages.size());
    }

    @Test
    public void testPublishStringQos0() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        testClient.publishString("test1", "unit/test/topic", AWSIotMqttQos.QOS0);

        assertEquals(1, mockClient.connectCalls);
        assertEquals(1, mockClient.publishCalls);
        assertEquals(0, mockClient.mostRecentPublishQoS);
        assertEquals(false, mockClient.mostRecentPublishRetained);
        assertEquals("test1", new String(mockClient.mostRecentPublishPayload, StringUtils.UTF8));
    }

    @Test(expected = AmazonClientException.class)
    public void testPublishStringQos0Failure() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();
        mockClient.throwsExceptionOnPublish = true;

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        testClient.publishString("test1", "unit/test/topic", AWSIotMqttQos.QOS0);
    }

    @Test
    public void testPublishStringQos0WithCallback() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();
        TestMessageDeliveryCallback mdcb = new TestMessageDeliveryCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        testClient.publishString("test1", "unit/test/topic", AWSIotMqttQos.QOS0, mdcb, "TEST_TOKEN");

        assertEquals(1, mockClient.connectCalls);
        assertEquals(1, mockClient.publishCalls);
        assertEquals(0, mockClient.mostRecentPublishQoS);
        assertEquals(false, mockClient.mostRecentPublishRetained);
        assertEquals("test1", new String(mockClient.mostRecentPublishPayload, StringUtils.UTF8));

        assertEquals(0, mdcb.statuses.size());  // callback hasn't been called yet
        MockDeliveryToken testDeliveryToken = new MockDeliveryToken();
        testDeliveryToken.setUserContext(mockClient.mostRecentPublishUserContext);
        mockClient.mockCallback.deliveryComplete(testDeliveryToken);
        assertEquals(1, mdcb.statuses.size());  // now it has
        assertEquals(AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Success, mdcb.statuses.get(0));
        assertEquals(1, mdcb.userDatas.size());
        assertEquals("TEST_TOKEN", mdcb.userDatas.get(0));
    }

    @Test
    public void testPublishStringQos0WithCallbackFailure() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();
        mockClient.throwsExceptionOnPublish = true;

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();
        TestMessageDeliveryCallback mdcb = new TestMessageDeliveryCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        SimpleUnitTestObject suto = new SimpleUnitTestObject();
        testClient.publishString("test1", "unit/test/topic", AWSIotMqttQos.QOS0, mdcb, suto);

        assertEquals(1, mockClient.connectCalls);
        assertEquals(1, mdcb.statuses.size());
        assertEquals(AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Fail, mdcb.statuses.get(0));
        assertEquals(1, mdcb.userDatas.size());
        assertEquals(suto, mdcb.userDatas.get(0));
    }

    @Test
    public void testPublishStringQos1() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        testClient.publishString("test1", "unit/test/topic", AWSIotMqttQos.QOS1);

        assertEquals(1, mockClient.connectCalls);
        assertEquals(1, mockClient.publishCalls);
        assertEquals(1, mockClient.mostRecentPublishQoS);
        assertEquals(false, mockClient.mostRecentPublishRetained);
        assertEquals("test1", new String(mockClient.mostRecentPublishPayload, StringUtils.UTF8));
    }

    @Test
    public void testPublishStringQos1WithCallback() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();
        TestMessageDeliveryCallback mdcb = new TestMessageDeliveryCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        testClient.publishString("test1", "unit/test/topic", AWSIotMqttQos.QOS1, mdcb, "TEST_TOKEN");

        assertEquals(1, mockClient.connectCalls);
        assertEquals(1, mockClient.publishCalls);
        assertEquals(1, mockClient.mostRecentPublishQoS);
        assertEquals(false, mockClient.mostRecentPublishRetained);
        assertEquals("test1", new String(mockClient.mostRecentPublishPayload, StringUtils.UTF8));

        assertEquals(0, mdcb.statuses.size());  // callback hasn't been called yet
        MockDeliveryToken testDeliveryToken = new MockDeliveryToken();
        testDeliveryToken.setUserContext(mockClient.mostRecentPublishUserContext);
        mockClient.mockCallback.deliveryComplete(testDeliveryToken);
        assertEquals(1, mdcb.statuses.size());  // now it has
        assertEquals(AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Success, mdcb.statuses.get(0));
        assertEquals(1, mdcb.userDatas.size());
        assertEquals("TEST_TOKEN", mdcb.userDatas.get(0));
    }

    @Test
    public void testPublishStringQos1WithCallbackFailure() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();
        mockClient.throwsExceptionOnPublish = true;

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();
        TestMessageDeliveryCallback mdcb = new TestMessageDeliveryCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        SimpleUnitTestObject suto = new SimpleUnitTestObject();
        testClient.publishString("test1", "unit/test/topic", AWSIotMqttQos.QOS1, mdcb, suto);

        assertEquals(1, mockClient.connectCalls);
        assertEquals(1, mdcb.statuses.size());
        assertEquals(AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Fail, mdcb.statuses.get(0));
        assertEquals(1, mdcb.userDatas.size());
        assertEquals(suto, mdcb.userDatas.get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPublishStringNullString() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);

        testClient.publishString(null, "unit/test/topic", AWSIotMqttQos.QOS0);

        assertEquals(1, mockClient.connectCalls);
        assertEquals(0, mockClient.publishCalls);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPublishStringNullTopic() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);

        testClient.publishString("test1", null, AWSIotMqttQos.QOS0);

        assertEquals(1, mockClient.connectCalls);
        assertEquals(0, mockClient.publishCalls);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPublishStringEmptyTopic() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);

        testClient.publishString("test1", "", AWSIotMqttQos.QOS0);

        assertEquals(1, mockClient.connectCalls);
        assertEquals(0, mockClient.publishCalls);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPublishStringNullQos() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);

        testClient.publishString("test1", "unit/test/topic", null);

        assertEquals(1, mockClient.connectCalls);
        assertEquals(0, mockClient.publishCalls);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPublishStringWithCallbackNullString() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();
        TestMessageDeliveryCallback mdcb = new TestMessageDeliveryCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);

        testClient.publishString(null, "unit/test/topic", AWSIotMqttQos.QOS0, mdcb, "TEST_TOKEN");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPublishStringWithCallbackNullTopic() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();
        TestMessageDeliveryCallback mdcb = new TestMessageDeliveryCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);

        testClient.publishString("test1", null, AWSIotMqttQos.QOS0, mdcb, "TEST_TOKEN");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPublishStringWithCallbackEmptyTopic() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();
        TestMessageDeliveryCallback mdcb = new TestMessageDeliveryCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);

        testClient.publishString("test1", "", AWSIotMqttQos.QOS0, mdcb, "TEST_TOKEN");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPublishStringWithCallbackNullQos() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();
        TestMessageDeliveryCallback mdcb = new TestMessageDeliveryCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);

        testClient.publishString("test1", "unit/test/topic", null, mdcb, "TEST_TOKEN");
    }

    @Test
    public void testPublishDataQos0() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        testClient.publishData("test1".getBytes(StringUtils.UTF8), "unit/test/topic",
                AWSIotMqttQos.QOS0);

        assertEquals(1, mockClient.connectCalls);
        assertEquals(1, mockClient.publishCalls);
        assertEquals(0, mockClient.mostRecentPublishQoS);
        assertEquals(false, mockClient.mostRecentPublishRetained);
        assertEquals("test1", new String(mockClient.mostRecentPublishPayload, StringUtils.UTF8));
    }

    @Test
    public void testPublishDataQos1() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        testClient.publishData("test1".getBytes(StringUtils.UTF8), "unit/test/topic",
                AWSIotMqttQos.QOS1);

        assertEquals(1, mockClient.connectCalls);
        assertEquals(1, mockClient.publishCalls);
        assertEquals(1, mockClient.mostRecentPublishQoS);
        assertEquals(false, mockClient.mostRecentPublishRetained);
        assertEquals("test1", new String(mockClient.mostRecentPublishPayload, StringUtils.UTF8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPublishDataNullData() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        testClient.publishData(null, "unit/test/topic", AWSIotMqttQos.QOS0);

        assertEquals(1, mockClient.connectCalls);
        assertEquals(0, mockClient.publishCalls);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPublishDataNullTopic() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        testClient.publishData("test1".getBytes(StringUtils.UTF8), null, AWSIotMqttQos.QOS0);

        assertEquals(1, mockClient.connectCalls);
        assertEquals(0, mockClient.publishCalls);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPublishDataEmptyTopic() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        testClient.publishData("test1".getBytes(StringUtils.UTF8), "", AWSIotMqttQos.QOS0);

        assertEquals(1, mockClient.connectCalls);
        assertEquals(0, mockClient.publishCalls);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPublishDataNullQos() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        testClient.publishData("test1".getBytes(StringUtils.UTF8), "unit/test/topic", null);

        assertEquals(1, mockClient.connectCalls);
        assertEquals(0, mockClient.publishCalls);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPublishDataWithCallbackNullData() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();
        TestMessageDeliveryCallback mdcb = new TestMessageDeliveryCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);

        testClient.publishData(null, "unit/test/topic", AWSIotMqttQos.QOS0, mdcb, "TEST_TOKEN");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPublishDataWithCallbackNullTopic() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();
        TestMessageDeliveryCallback mdcb = new TestMessageDeliveryCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);

        testClient.publishData("test1".getBytes(StringUtils.UTF8), null, AWSIotMqttQos.QOS0, mdcb, "TEST_TOKEN");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPublishDataWithCallbackEmptyTopic() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();
        TestMessageDeliveryCallback mdcb = new TestMessageDeliveryCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);

        testClient.publishData("test1".getBytes(StringUtils.UTF8), "", AWSIotMqttQos.QOS0, mdcb, "TEST_TOKEN");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPublishDataWithCallbackNullQos() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();
        TestMessageDeliveryCallback mdcb = new TestMessageDeliveryCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);

        testClient.publishData("test1".getBytes(StringUtils.UTF8), "unit/test/topic", null, mdcb, "TEST_TOKEN");
    }

    @Test
    public void testLostConnectUserDisconnect() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        assertEquals(1, mockClient.connectCalls);
        assertTrue(mockClient.mostRecentOptions.isCleanSession());

        testClient.disconnect();

        mockClient.mockCallback.connectionLost(new Exception("test"));
        assertEquals(1, mockClient.connectCalls);
    }
/*
    @Test
    public void testLostConnectWithSubscriptions() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        assertEquals(1, mockClient.connectCalls);
        assertTrue(mockClient.mostRecentOptions.isCleanSession());

        TestNewMessageCallback mcb = new TestNewMessageCallback();

        testClient.subscribeToTopic("unit/test/1", AWSIotMqttQos.QOS0, mcb);
        testClient.subscribeToTopic("unit/test/2", AWSIotMqttQos.QOS0, mcb);

        assertEquals(2, mockClient.subscribeCalls);
        assertTrue(mockClient.mockSubscriptions.containsKey("unit/test/1"));
        assertTrue(mockClient.mockSubscriptions.containsKey("unit/test/2"));

        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        // cause reconnect attempt
        Robolectric.getUiThreadScheduler().advanceBy(4100);
        mockClient.mockConnectSuccess();

        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        assertEquals(2, mockClient.connectCalls);

        assertEquals(4, mockClient.subscribeCalls);
        assertEquals(2, mockClient.mockSubscriptions.size());
        assertTrue(mockClient.mockSubscriptions.containsKey("unit/test/1"));
        assertTrue(mockClient.mockSubscriptions.containsKey("unit/test/2"));
    }
*/
    @Test
    public void testOfflinePublishQueue() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        testClient.publishString("test payload 0", "test/topic", AWSIotMqttQos.QOS0);
        assertEquals(1, testClient.getMqttMessageQueue().size());
        assertEquals(0, mockClient.publishCalls);

        testClient.publishString("test payload 1", "test/topic", AWSIotMqttQos.QOS0);
        assertEquals(2, testClient.getMqttMessageQueue().size());
        assertEquals(0, mockClient.publishCalls);

        testClient.publishString("test payload 2", "test/topic", AWSIotMqttQos.QOS0);
        assertEquals(3, testClient.getMqttMessageQueue().size());
        assertEquals(0, mockClient.publishCalls);

        // cause reconnect attempt
        for (int i = 0; i < 3; i++) {
            Robolectric.getUiThreadScheduler().advanceBy(4100);
            mockClient.mockConnectSuccess();
        }

        // cause all scheduled publishes to occur
        Robolectric.getUiThreadScheduler().advanceBy(1000);
        assertEquals(0, testClient.getMqttMessageQueue().size());
        assertEquals(3, mockClient.publishCalls);
    }

    @Test
    public void testOfflinePublishQueuePublishWhenConnectedButQueueNotYetEmpty() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        testClient.publishString("test payload 0", "test/topic", AWSIotMqttQos.QOS0);
        assertEquals(1, testClient.getMqttMessageQueue().size());
        assertEquals(0, mockClient.publishCalls);

        testClient.publishString("test payload 1", "test/topic", AWSIotMqttQos.QOS0);
        assertEquals(2, testClient.getMqttMessageQueue().size());
        assertEquals(0, mockClient.publishCalls);

        testClient.publishString("test payload 2", "test/topic", AWSIotMqttQos.QOS0);
        assertEquals(3, testClient.getMqttMessageQueue().size());
        assertEquals(0, mockClient.publishCalls);

        // verify the payload
        checkOfflinePublishingQueue(testClient);

        // cause reconnect attempt
        Robolectric.getUiThreadScheduler().advanceBy(4100);
        mockClient.mockConnectSuccess();

        // first publish occurs immediately, still two messages in queue
        assertEquals(1, mockClient.publishCalls);
        assertEquals(2, testClient.getMqttMessageQueue().size());

        // publish with messages still in queue
        testClient.publishString("test payload 3", "test/topic", AWSIotMqttQos.QOS0);

        // still only 1 publish (#3 was queued because queue still has messages)
        assertEquals(1, mockClient.publishCalls);
        assertEquals(3, testClient.getMqttMessageQueue().size());

        // cause all scheduled publishes to occur
        Robolectric.getUiThreadScheduler().advanceBy(1500);
        for (int i = 0; i < 3; i++) {
            mockClient.mockConnectSuccess();
        }
        assertEquals(4, mockClient.publishCalls);
        assertEquals(0, testClient.getMqttMessageQueue().size());

    }

    @Test
    public void testOfflinePublishQueueWithCallbacks() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setDrainingInterval(250L);

        TestClientStatusCallback csb = new TestClientStatusCallback();
        // try a new callback for each message
        TestMessageDeliveryCallback mdcb1 = new TestMessageDeliveryCallback();
        TestMessageDeliveryCallback mdcb2 = new TestMessageDeliveryCallback();
        TestMessageDeliveryCallback mdcb3 = new TestMessageDeliveryCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        testClient.publishString("test payload 0", "test/topic", AWSIotMqttQos.QOS0, mdcb1, "TEST_TOKEN_1");
        assertEquals(1, testClient.getMqttMessageQueue().size());
        assertEquals(0, mockClient.publishCalls);

        testClient.publishString("test payload 1", "test/topic", AWSIotMqttQos.QOS0, mdcb2, "TEST_TOKEN_2");
        assertEquals(2, testClient.getMqttMessageQueue().size());
        assertEquals(0, mockClient.publishCalls);

        testClient.publishString("test payload 2", "test/topic", AWSIotMqttQos.QOS0, mdcb3, "TEST_TOKEN_3");
        assertEquals(3, testClient.getMqttMessageQueue().size());
        assertEquals(0, mockClient.publishCalls);

        // verify the payload
        checkOfflinePublishingQueue(testClient);

        // cause reconnect attempt
        Robolectric.getUiThreadScheduler().advanceBy(4100);
        mockClient.mockConnectSuccess();

        // first publish occurs immediately, no callbacks invoked
        assertEquals(1, mockClient.publishCalls);
        assertEquals(0, mdcb1.statuses.size());
        assertEquals(0, mdcb2.statuses.size());
        assertEquals(0, mdcb3.statuses.size());

        // cause callback 1
        MockDeliveryToken testDeliveryToken = new MockDeliveryToken();
        testDeliveryToken.setUserContext(mockClient.mostRecentPublishUserContext);
        testDeliveryToken.setMessage(new MqttMessage(mockClient.mostRecentPublishPayload));
        mockClient.mockCallback.deliveryComplete(testDeliveryToken);
        assertEquals(1, mdcb1.statuses.size());
        assertEquals(AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Success, mdcb1.statuses.get(0));
        assertEquals(1, mdcb1.userDatas.size());
        assertEquals("TEST_TOKEN_1", mdcb1.userDatas.get(0));

        // ---

        // cause next publish to occur
        Robolectric.getUiThreadScheduler().advanceBy(250);

        // 2 publishes, same callbacks
        assertTrue(mockClient.publishCalls >= 2);
        assertEquals(1, mdcb1.statuses.size());
        assertEquals(0, mdcb2.statuses.size());
        assertEquals(0, mdcb3.statuses.size());

        // cause callback 2
        testDeliveryToken = new MockDeliveryToken();
        testDeliveryToken.setUserContext(mockClient.mostRecentPublishUserContext);
        testDeliveryToken.setMessage(new MqttMessage(mockClient.mostRecentPublishPayload));
        mockClient.mockCallback.deliveryComplete(testDeliveryToken);
        assertEquals(1, mdcb2.statuses.size());
        assertEquals(AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Success, mdcb2.statuses.get(0));
        assertEquals(1, mdcb2.userDatas.size());
        assertEquals("TEST_TOKEN_2", mdcb2.userDatas.get(0));

        // ---

        // cause next publish to occur
        Robolectric.getUiThreadScheduler().advanceBy(250);
        mockClient.mockConnectSuccess();

        // 3 publishes, same callbacks
        assertTrue(mockClient.publishCalls >= 3);
        assertEquals(1, mdcb1.statuses.size());
        assertEquals(1, mdcb2.statuses.size());
        assertEquals(0, mdcb3.statuses.size());

        // cause callback 3
        testDeliveryToken = new MockDeliveryToken();
        testDeliveryToken.setUserContext(mockClient.mostRecentPublishUserContext);
        testDeliveryToken.setMessage(new MqttMessage(mockClient.mostRecentPublishPayload));
        mockClient.mockCallback.deliveryComplete(testDeliveryToken);
        assertEquals(1, mdcb3.statuses.size());
        assertEquals(AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Success, mdcb3.statuses.get(0));
        assertEquals(1, mdcb3.userDatas.size());
        assertEquals("TEST_TOKEN_3", mdcb3.userDatas.get(0));
    }

    @Test
    public void testOfflinePublishQueueLimitNewest() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setOfflinePublishQueueBound(10);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        testClient.publishString("test payload 0", "test/topic", AWSIotMqttQos.QOS0);

        assertEquals(1, testClient.getMqttMessageQueue().size());

        for (int i = 1; i <= 8; i++) {
            testClient.publishString("test payload " + i, "test/topic", AWSIotMqttQos.QOS0);
        }

        assertEquals(9, testClient.getMqttMessageQueue().size());
        
        testClient.publishString("test payload 9", "test/topic", AWSIotMqttQos.QOS0);
        assertEquals(10, testClient.getMqttMessageQueue().size());
        
        // queue is now full - publish one more message to ensure queue keeps newest messages
        testClient.publishString("test payload 10", "test/topic", AWSIotMqttQos.QOS0);
        assertEquals(11, testClient.getMqttMessageQueue().size());

        // verify the payload
        checkOfflinePublishingQueue(testClient);

        testClient.getMqttMessageQueue().poll().getMessage();
        assertEquals(10, testClient.getMqttMessageQueue().size());
    }

    @Test
    public void testOfflinePublishQueueLimitOldest() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setOfflinePublishQueueBound(10);
        testClient.setFullQueueToKeepOldestMessages();

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        testClient.publishString("test payload 0", "test/topic", AWSIotMqttQos.QOS0);

        assertEquals(1, testClient.getMqttMessageQueue().size());

        for (int i = 1; i <= 8; i++) {
            testClient.publishString("test payload " + i, "test/topic", AWSIotMqttQos.QOS0);
        }

        assertEquals(9, testClient.getMqttMessageQueue().size());
        
        testClient.publishString("test payload 9", "test/topic", AWSIotMqttQos.QOS0);
        assertEquals(10, testClient.getMqttMessageQueue().size());

        // queue is now full - publish one more message to ensure queue keeps oldest messages
        // add a callback to verify
        TestMessageDeliveryCallback mdcb = new TestMessageDeliveryCallback();
        SimpleUnitTestObject suto = new SimpleUnitTestObject();
        testClient.publishString("test payload 10", "test/topic", AWSIotMqttQos.QOS0, mdcb, suto);
        assertEquals(10, testClient.getMqttMessageQueue().size());

        // verify the payload
        checkOfflinePublishingQueue(testClient);

        assertEquals(1, mdcb.statuses.size());
        assertEquals(AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Fail, mdcb.statuses.get(0));
        assertEquals(1, mdcb.userDatas.size());
        assertEquals(suto, mdcb.userDatas.get(0));
    }

    @Test
    public void testOfflinePublishQueueLimitOldestWhileConnected() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setOfflinePublishQueueBound(10);
        testClient.setFullQueueToKeepOldestMessages();

        TestClientStatusCallback csb = new TestClientStatusCallback();
        TestMessageDeliveryCallback mdcb = new TestMessageDeliveryCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        testClient.publishString("test payload 0", "test/topic", AWSIotMqttQos.QOS1, mdcb, "TEST_TOKEN_0");

        assertEquals(1, testClient.getMqttMessageQueue().size());

        for (int i = 1; i <= 8; ++i) {
            testClient.publishString("test payload " + i, "test/topic", AWSIotMqttQos.QOS1, mdcb, "TEST_TOKEN_" + i);
        }

        assertEquals(9, testClient.getMqttMessageQueue().size());
        testClient.publishString("test payload 9", "test/topic", AWSIotMqttQos.QOS1, mdcb, "TEST_TOKEN_9");
        // queue is now full, no callbacks invoked
        assertEquals(10, testClient.getMqttMessageQueue().size());
        assertEquals(0, mdcb.statuses.size());

        // publish one more message to ensure queue keeps oldest messages
        testClient.publishString("test payload 10", "test/topic", AWSIotMqttQos.QOS1, mdcb, "TEST_TOKEN_10");
        // queue still full, still has messages 0-9
        assertEquals(10, testClient.getMqttMessageQueue().size());

        // verify the payload
        checkOfflinePublishingQueue(testClient);

        // the latest publish gave a Fail in its callback
        assertEquals(1, mdcb.statuses.size());
        assertEquals(AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Fail,
                mdcb.statuses.get(0));
        assertEquals(1, mdcb.userDatas.size());
        assertEquals("TEST_TOKEN_10", mdcb.userDatas.get(0));

        // nothing actually published yet, we're attempting to reconnect
        assertEquals(0, mockClient.publishCalls);
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        // now reconnect so we can test filling the queue while connected
        Robolectric.getUiThreadScheduler().advanceBy(4100);
        mockClient.mockConnectSuccess();

        // first publish occurs immediately upon reconnect
        assertEquals(1, mockClient.publishCalls);
        assertEquals("test payload 0", new String(mockClient.mostRecentPublishPayload));
        assertEquals("test/topic", mockClient.mostRecentPublishTopic);
        assertEquals(AWSIotMqttQos.QOS1.asInt(), mockClient.mostRecentPublishQoS);
        assertEquals(9, testClient.getMqttMessageQueue().size());
        // cause successful callback
        MockDeliveryToken testDeliveryToken = new MockDeliveryToken();
        testDeliveryToken.setUserContext(mockClient.mostRecentPublishUserContext);
        testDeliveryToken.setMessage(new MqttMessage(mockClient.mostRecentPublishPayload));
        mockClient.mockCallback.deliveryComplete(testDeliveryToken);
        // verify
        assertEquals(2, mdcb.statuses.size());
        assertEquals(AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Success,
                mdcb.statuses.get(1));
        assertEquals(2, mdcb.userDatas.size());
        assertEquals("TEST_TOKEN_0", mdcb.userDatas.get(1));  // first queued message

        // queue has 9 messages, publish one to fill it again
        testClient.publishString("test payload A", "test/topic", AWSIotMqttQos.QOS1, mdcb, "TEST_TOKEN_A");
        // queue full
        assertEquals(10, testClient.getMqttMessageQueue().size());
        // no callback
        assertEquals(2, mdcb.statuses.size());
        // one more
        testClient.publishString("test payload B", "test/topic", AWSIotMqttQos.QOS1, mdcb, "TEST_TOKEN_B");
        // queue still full
        assertEquals(10, testClient.getMqttMessageQueue().size());
        // latest callback is Fail
        assertEquals(3, mdcb.statuses.size());
        assertEquals(AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Fail,
                mdcb.statuses.get(2));
        assertEquals(3, mdcb.userDatas.size());
        assertEquals("TEST_TOKEN_B", mdcb.userDatas.get(2));

        // still only first message after reconnect published
        assertEquals(1, mockClient.publishCalls);

        // cause all scheduled publishes to occur
        Robolectric.getUiThreadScheduler().advanceBy(3000);
        for (int i = 1; i <= 10; i++) {
            mockClient.mockConnectSuccess();
        }
        assertEquals(11, mockClient.publishCalls);
        assertEquals(0, testClient.getMqttMessageQueue().size());
    }

    @Test
    public void testDefaultDrainingInterval() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        assertEquals(250L, (long) testClient.getDrainingInterval());

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        for (int i = 0; i < 10; i++) {
            testClient.publishString("test payload " + i, "test/topic", AWSIotMqttQos.QOS0);
        }

        assertEquals(10, testClient.getMqttMessageQueue().size());
        assertEquals(0, mockClient.publishCalls);
        checkOfflinePublishingQueue(testClient);

        // cause next reconnect attempt
        Robolectric.getUiThreadScheduler().advanceBy(4100);
        mockClient.mockConnectSuccess();

        // first publish occurs immediately upon reconnect
        assertEquals(1, mockClient.publishCalls);
        assertEquals("test payload 0", new String(mockClient.mostRecentPublishPayload));
        assertEquals("test/topic", mockClient.mostRecentPublishTopic);
        assertEquals(AWSIotMqttQos.QOS0.asInt(), mockClient.mostRecentPublishQoS);
        assertEquals(9, testClient.getMqttMessageQueue().size());

        // cause next reconnect attempt
        Robolectric.getUiThreadScheduler().advanceBy(4100);
        mockClient.mockConnectSuccess();

        assertEquals(10, mockClient.publishCalls);
    }

    @Test
    public void testLongerDrainingInterval() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setDrainingInterval(1000L);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        for (int i = 0; i < 10; i++) {
            testClient.publishString("test payload " + i, "test/topic", AWSIotMqttQos.QOS0);
        }

        assertEquals(10, testClient.getMqttMessageQueue().size());
        assertEquals(0, mockClient.publishCalls);

        checkOfflinePublishingQueue(testClient);

        // cause reconnect attempt
        Robolectric.getUiThreadScheduler().advanceBy(4100);
        mockClient.mockConnectSuccess();

        // first publish occurs immediately upon reconnect
        assertEquals(1, mockClient.publishCalls);
        assertEquals("test payload 0", new String(mockClient.mostRecentPublishPayload));
        assertEquals("test/topic", mockClient.mostRecentPublishTopic);
        assertEquals(AWSIotMqttQos.QOS0.asInt(), mockClient.mostRecentPublishQoS);
        assertEquals(9, testClient.getMqttMessageQueue().size());

        Robolectric.getUiThreadScheduler().advanceBy(8100);
        assertEquals(9, mockClient.publishCalls);
    }

    @Test
    public void testOfflinePublishQueueWithError() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setDrainingInterval(250L);

        TestClientStatusCallback csb = new TestClientStatusCallback();
        // publish 3 messages, 2 have callbacks
        TestMessageDeliveryCallback mdcb1 = new TestMessageDeliveryCallback();
        TestMessageDeliveryCallback mdcb3 = new TestMessageDeliveryCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        assertEquals(MqttManagerConnectionState.Connected, testClient.getConnectionState());
        mockClient.mockDisconnect();
        assertEquals(MqttManagerConnectionState.Reconnecting, testClient.getConnectionState());

        testClient.publishString("test payload 0", "test/topic", AWSIotMqttQos.QOS0, mdcb1, "TEST_TOKEN_0");
        assertEquals(1, testClient.getMqttMessageQueue().size());
        assertEquals(0, mockClient.publishCalls);

        testClient.publishString("test payload 1", "test/topic", AWSIotMqttQos.QOS0);
        assertEquals(2, testClient.getMqttMessageQueue().size());
        assertEquals(0, mockClient.publishCalls);

        testClient.publishString("test payload 2", "test/topic", AWSIotMqttQos.QOS0, mdcb3, "TEST_TOKEN_2");
        assertEquals(3, testClient.getMqttMessageQueue().size());
        assertEquals(0, mockClient.publishCalls);

        // verify the payload
        checkOfflinePublishingQueue(testClient);

        // cause reconnect attempt
        Robolectric.getUiThreadScheduler().advanceBy(4100);
        mockClient.mockConnectSuccess();

        // first publish occurs immediately, no callbacks invoked
        assertEquals(1, mockClient.publishCalls);
        assertEquals(2, testClient.getMqttMessageQueue().size());
        assertEquals(0, mdcb1.statuses.size());
        assertEquals(0, mdcb3.statuses.size());

        // cause callback 1 (success)
        MockDeliveryToken testDeliveryToken = new MockDeliveryToken();
        testDeliveryToken.setUserContext(mockClient.mostRecentPublishUserContext);
        testDeliveryToken.setMessage(new MqttMessage(mockClient.mostRecentPublishPayload));
        mockClient.mockCallback.deliveryComplete(testDeliveryToken);
        assertEquals(1, mdcb1.statuses.size());
        assertEquals(AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Success, mdcb1.statuses.get(0));

        // ---

        // cause next publish to occur
        Robolectric.getUiThreadScheduler().advanceBy(250);

        // 2 publishes, same callbacks
        assertTrue(mockClient.publishCalls >= 2);
        assertEquals(1, testClient.getMqttMessageQueue().size());
        assertEquals(1, mdcb1.statuses.size());
        assertEquals(0, mdcb3.statuses.size());

        // ack message 2 (no callback associated, so no user context passed back by client)
        testDeliveryToken = new MockDeliveryToken();
        testDeliveryToken.setUserContext(null);
        testDeliveryToken.setMessage(new MqttMessage(mockClient.mostRecentPublishPayload));
        mockClient.mockCallback.deliveryComplete(testDeliveryToken);

        // verify callbacks unchanged
        assertTrue(mockClient.publishCalls >= 2);
        assertEquals(1, mdcb1.statuses.size());
        assertEquals(0, mdcb3.statuses.size());
    }

    @Test(expected = AmazonClientException.class)
    public void testPublishDisconnected() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setOfflinePublishQueueBound(100);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        testClient.disconnect();

        testClient.publishString("test payload 0", "test/topic", AWSIotMqttQos.QOS0);

        // we don't queue when Disconnected (user disconnect or auto-reconnect exhausted)
        assertEquals(0, testClient.getMqttMessageQueue().size());
    }

    @Test(expected = AmazonClientException.class)
    public void testPublishConnecting() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setOfflinePublishQueueBound(100);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);

        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting,
                csb.statuses.get(0));

        // publish, though not yet connected
        testClient.publishString("test payload 0", "test/topic", AWSIotMqttQos.QOS0);

        // we don't queue when Disconnected (user disconnect or auto-reconnect exhausted)
        assertEquals(0, testClient.getMqttMessageQueue().size());
    }

    @Test
    public void testPublishWithCallbackDisconnected() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setOfflinePublishQueueBound(100);

        TestClientStatusCallback csb = new TestClientStatusCallback();
        TestMessageDeliveryCallback mdcb = new TestMessageDeliveryCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();
        testClient.disconnect();

        testClient.publishString("test payload 0", "test/topic", AWSIotMqttQos.QOS0, mdcb, "TEST_TOKEN");

        // we don't queue when Disconnected (user disconnect or auto-reconnect exhausted)
        assertEquals(0, testClient.getMqttMessageQueue().size());
        // callback not called
        assertEquals(1, mdcb.statuses.size());
        assertEquals(1, mdcb.userDatas.size());
    }

    @Test
    public void testPublishWithCallbackConnecting() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setOfflinePublishQueueBound(100);

        TestClientStatusCallback csb = new TestClientStatusCallback();
        TestMessageDeliveryCallback mdcb = new TestMessageDeliveryCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);

        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting,
                csb.statuses.get(0));

        // publish, though not yet connected
        testClient.publishString("test payload 0", "test/topic", AWSIotMqttQos.QOS0, mdcb, "TEST_TOKEN");

        // we don't queue when Disconnected (user disconnect or auto-reconnect exhausted)
        assertEquals(0, testClient.getMqttMessageQueue().size());
        // callback not called
        assertEquals(1, mdcb.statuses.size());
        assertEquals(1, mdcb.userDatas.size());
    }

    @Test
    public void testPublishWithCallbackReconnecting() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setOfflinePublishQueueEnabled(false);

        TestClientStatusCallback csb = new TestClientStatusCallback();
        TestMessageDeliveryCallback mdcb = new TestMessageDeliveryCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper
                .getIotKeystore(CERT_ID, KEYSTORE_PATH, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectFail();

        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Reconnecting,
                csb.statuses.get(1));

        // publish, though not yet connected
        final String userData = "TEST_TOKEN";
        testClient.publishString("test payload 0", "test/topic", AWSIotMqttQos.QOS0, mdcb, userData);

        // we don't queue when Disconnected (user disconnect or auto-reconnect exhausted)
        assertEquals(0, testClient.getMqttMessageQueue().size());
        // callback not called
        assertEquals(1, mdcb.statuses.size());
        assertEquals(AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Fail, mdcb.statuses.get(0));
        assertEquals(1, mdcb.userDatas.size());
        assertEquals(userData, mdcb.userDatas.get(0));
    }

    @Test
    public void testGetKeepAlive() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        assertEquals(300, testClient.getKeepAlive());
    }

    @Test
    public void testSetKeepAlive() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setKeepAlive(20);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        assertEquals(1, mockClient.connectCalls);
        assertTrue(mockClient.mostRecentOptions.isCleanSession());
        assertEquals(20, mockClient.mostRecentOptions.getKeepAliveInterval());
    }

    @Test
    public void testSetKeepAliveZero() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);
        testClient.setKeepAlive(0);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        assertEquals(1, mockClient.connectCalls);
        assertTrue(mockClient.mostRecentOptions.isCleanSession());
        assertEquals(0, mockClient.mostRecentOptions.getKeepAliveInterval());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKeepAliveIllegalValue() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setKeepAlive(-10);
    }

    @Test
    public void testGetMaxAutoReconnectAttempts() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        assertEquals(10, testClient.getMaxAutoReconnectAttempts());
    }

    @Test
    public void testSetMaxAutoReconnectAttempts() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMaxAutoReconnectAttepts(5);
        assertEquals(5, testClient.getMaxAutoReconnectAttempts());
    }

    @Test
    public void testSetMaxAutoReconnectAttemptsForever() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMaxAutoReconnectAttepts(-1);  // -1 = retry forever
        assertEquals(-1, testClient.getMaxAutoReconnectAttempts());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaxAutoReconnectAttemptsIllegalValue() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMaxAutoReconnectAttepts(-5);
        assertEquals(6, testClient.getMaxAutoReconnectAttempts());
    }

    @Test
    public void testGetIsOfflinePublishQueueEnabled() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        assertTrue(testClient.isOfflinePublishQueueEnabled());
    }

    @Test
    public void testSetIsOfflinePublishQueueEnabled() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setOfflinePublishQueueEnabled(false);
        assertFalse(testClient.isOfflinePublishQueueEnabled());
    }

    @Test
    public void testGetOfflinePublishQueueBound() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        assertEquals(100, (int) testClient.getOfflinePublishQueueBound());
    }

    @Test
    public void testSetOfflinePublishQueueBound() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setOfflinePublishQueueBound(50);
        assertEquals(50, (int) testClient.getOfflinePublishQueueBound());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOfflinePublishQueueBoundNegative() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setOfflinePublishQueueBound(-5);
        assertEquals(100, (int) testClient.getOfflinePublishQueueBound());
    }

    @Test
    public void testIsReadyToPublishTrue() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        assertTrue(testClient.isReadyToPublish());
    }

    @Test
    public void testIsReadyToPublishFalseNull() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(null);

        assertFalse(testClient.isReadyToPublish());
    }

    @Test
    public void testIsReadyToPublishFalseNotConnected() throws Exception {
        MockMqttClient mockClient = new MockMqttClient();

        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        testClient.setMqttClient(mockClient);

        TestClientStatusCallback csb = new TestClientStatusCallback();

        KeyStore testKeystore = AWSIotKeystoreHelper.getIotKeystore(CERT_ID, KEYSTORE_PATH,
                KEYSTORE_NAME, KEYSTORE_PASSWORD);
        testClient.connect(testKeystore, csb);
        mockClient.mockConnectSuccess();

        assertTrue(testClient.isReadyToPublish());

        mockClient.mockDisconnect();

        assertFalse(testClient.isReadyToPublish());
    }

    /**
     * Test Queue Mode Accessors
     */
    @Test
    public void testGetSetFullQueueMode() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);

        assertEquals(false, testClient.fullPublishQueueKeepsOldestMessages());
        testClient.setFullQueueToKeepOldestMessages();
        assertEquals(true, testClient.fullPublishQueueKeepsOldestMessages());
        testClient.setFullQueueToKeepNewestMessages();
        assertEquals(false, testClient.fullPublishQueueKeepsOldestMessages());
    }

    @Test
    public void testReconnectTimeout() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);

        assertEquals(4, testClient.getReconnectTimeout());
        testClient.setReconnectTimeout(10);
        assertEquals(10, testClient.getReconnectTimeout());

        testClient.setReconnectRetryLimits(20, 30);
        assertEquals(20, testClient.getMinReconnectRetryTime());
        assertEquals(30, testClient.getMaxReconnectRetryTime());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReconnectTimeoutException() throws Exception {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
                Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);

        testClient.setReconnectRetryLimits(10, 5);
    }

    @Test
    public void testEnableMetricsCollection() {
        AWSIotMqttManager testClient = new AWSIotMqttManager("test-client",
            Region.getRegion(Regions.US_EAST_1), TEST_ENDPOINT_PREFIX);
        assertTrue(testClient.isMetricsEnabled());
        testClient.setMetricsIsEnabled(false);
        assertFalse(testClient.isMetricsEnabled());
    }

    /**
     * Test Connection Status Callback
     */
    private class TestClientStatusCallback implements AWSIotMqttClientStatusCallback {
        ArrayList<AWSIotMqttClientStatus> statuses;

        TestClientStatusCallback() {
            statuses = new ArrayList<AWSIotMqttClientStatus>();
        }

        @Override
        public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
            statuses.add(status);
        }
    }

    /**
     * Test New Message Received Callback
     */
    private class TestNewMessageCallback implements AWSIotMqttNewMessageCallback {
        ArrayList<String> receivedMessages = new ArrayList<String>();

        @Override
        public void onMessageArrived(String topic, byte[] data) {
            receivedMessages.add(topic + new String(data, StringUtils.UTF8));
        }
    }

    /**
     * Test Publish Status Callback
     */
    private class TestMessageDeliveryCallback implements AWSIotMqttMessageDeliveryCallback {
        ArrayList<MessageDeliveryStatus> statuses;
        ArrayList<Object> userDatas;

        TestMessageDeliveryCallback() {
            statuses = new ArrayList<MessageDeliveryStatus>();
            userDatas = new ArrayList<Object>();
        }

        @Override
        public void statusChanged(MessageDeliveryStatus status,
                Object userData) {
            statuses.add(status);
            userDatas.add(userData);
        }
    }

    private class SimpleUnitTestObject {
        int i;
        int j;
        String s;
    }

    private class TestAwsCredentialsProvider implements AWSCredentialsProvider {
        @Override
        public AWSCredentials getCredentials() {
            return new BasicAWSCredentials("MY_TEST_ACCESS_KEY", "MY_TEST_SECRET_KEY");
        }

        @Override
        public void refresh() {

        }
    }

    /**
     * This method checks if the offline publishing queue has the right
     * payload data. The queue is cloned in order to be polled for verification.
     */
    private void checkOfflinePublishingQueue(AWSIotMqttManager testClient) {
        ConcurrentLinkedQueue<AWSIotMqttQueueMessage> queue = 
            new ConcurrentLinkedQueue<AWSIotMqttQueueMessage>(testClient.getMqttMessageQueue());
        int i = 0;
        while (!queue.isEmpty()) {
            AWSIotMqttQueueMessage message = queue.poll();
            System.out.println("Message = " + new String(message.getMessage()));
            assertEquals("test payload " + i,
                  new String(message.getMessage()));
            i++;
        }
    }
}
