/*
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

import android.content.Context;
import androidx.test.core.app.ApplicationProvider;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.mobileconnectors.iot.AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus;
import com.amazonaws.mobileconnectors.iot.AWSIotMqttManager.AuthenticationMode;
import com.amazonaws.mobileconnectors.iot.AWSIotMqttManager.ClientId;
import com.amazonaws.mobileconnectors.iot.AWSIotMqttManager.Endpoint;
import com.amazonaws.mobileconnectors.iot.IotClient.KeysAndCertificateInfo;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.testutils.AWSTestBase;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * This blog explains howto setup and use custom authorizers:
 * https://aws.amazon.com/blogs/security/how-to-use-your-own-identity-and-access-management-systems-to-control-access-to-aws-iot-resources/
 */
public final class MqttManagerIntegrationTest extends AWSTestBase {
    private static final int ONE_TWENTY_KB = 120_000;
    private static final String KEYSTORE_NAME = "integration_test.bks";
    private static final String KEYSTORE_PASSWORD = "test password";
    private static final String IOT_POLICY_NAME = "android-integration-test";

    private static String keyStorePath = "./";
    private static AWSCredentialsProvider credentialsProvider;
    private static IotClient iotClient;
    private static KeysAndCertificateInfo keysAndCertificateInfo;
    private static CustomAuthorization customAuthorization;

    @BeforeClass
    public static void beforeSuite() throws JSONException {
        Context appContext = ApplicationProvider.getApplicationContext();
        keyStorePath = appContext.getFilesDir().toString() + "/";
        System.out.println(keyStorePath);
        credentialsProvider = new CognitoCachingCredentialsProvider(
            appContext,
            getPackageConfigure("iot").getString(ConfigKey.IDENTITY_POOL_ID.toString()),
            Regions.US_EAST_1
        );
        iotClient = new IotClient(credentialsProvider);

        iotClient.cleanupPolicy(IOT_POLICY_NAME);
        keysAndCertificateInfo = iotClient.createAndAttachPolicy(IOT_POLICY_NAME, new JSONObject()
            .put("Version", "2012-10-17")
            .put("Statement", new JSONArray(Collections.singletonList(new JSONObject()
                .put("Action", "iot:*")
                .put("Resource", "*")
                .put("Effect", "Allow")
            )))
            .toString()
        );
        customAuthorization =
            CustomAuthorization.from(getPackageConfigure("iot"), keysAndCertificateInfo);
        iotClient.cleanupAuthorizer(customAuthorization.getCustomAuthorizerName());
        iotClient.createAuthorizer(
            customAuthorization.getCustomAuthorizerName(),
            customAuthorization.getCustomAuthorizerLamdbaArn(),
            customAuthorization.getTokenKeyName(),
            keysAndCertificateInfo.getPublicKey()
        );
    }

    @After
    public void cleanup() {
        File keystoreFile = new File(keyStorePath, KEYSTORE_NAME);
        if (keystoreFile.exists()) {
            //noinspection ResultOfMethodCallIgnored
            keystoreFile.delete();
        }
    }
    
    @AfterClass
    public static void afterClass() {
        iotClient.cleanupAuthorizer(customAuthorization.getCustomAuthorizerName());
        iotClient.cleanupPolicy(IOT_POLICY_NAME);
    }

    @Test
    public void mqttConnect_USEast1_ATS_Endpoint() throws Exception {
        String prefix = iotClient.getEndpointPrefix("iot:Data-ATS");
        String region = Regions.US_EAST_1.getName();
        String endpoint = String.format("%s.iot.%s.amazonaws.com", prefix, region);
        System.out.println("Endpoint: " + endpoint);
        
        AWSIotMqttManager mqttManager = new AWSIotMqttManager("int-test-w-certs", endpoint);
        mqttConnect(mqttManager);
    }

    @Test
    public void mqttConnect_USEast1_Endpoint() throws Exception {
        String prefix = iotClient.getEndpointPrefix("iot:Data");
        String region = Regions.US_EAST_1.getName();
        String endpoint = String.format("%s.iot.%s.amazonaws.com", prefix, region);
        System.out.println("Endpoint: " + endpoint);
        
        AWSIotMqttManager mqttManager = new AWSIotMqttManager("int-test-w-certs", endpoint);
        mqttConnect(mqttManager);
    }

    @Test
    public void mqttConnect_USEast1_EndpointPrefix_Region() throws Exception {
        String endpointPrefix = iotClient.getEndpointPrefix("iot:Data");
        System.out.println("Endpoint prefix: " + endpointPrefix);
        mqttConnect(new AWSIotMqttManager(
            "int-test-w-certs",
            Region.getRegion(Regions.US_EAST_1),
            endpointPrefix
        ));
    }

    @Test
    public void mqttConnectMalformedEndpoints() {
        String endpointPrefix = iotClient.getEndpointPrefix("iot:Data");
        System.out.println("Endpoint prefix: " + endpointPrefix);

        String atsEndpointPrefix = iotClient.getEndpointPrefix("iot:Data-ATS");
        String atsEndpointPrefixWithDot = atsEndpointPrefix.replaceAll("-", ".");
        System.out.println("ATS Endpoint prefix: " + atsEndpointPrefix);

        final String[] malformedEndpoints = {
            endpointPrefix + "." + Region.getRegion(Regions.CN_NORTH_1).getName() + ".amazonaws.com.cn",
            endpointPrefix + ".iot." + Region.getRegion(Regions.CN_NORTH_1).getName() + ".amazonaws.com",
            endpointPrefix + ".iot." + Region.getRegion(Regions.US_EAST_1).getName() + ".amazonaws.com.cn",
            endpointPrefix + "." + Region.getRegion(Regions.US_EAST_1).getName() + ".amazonaws.com.cn",
            atsEndpointPrefix + "." + Region.getRegion(Regions.CN_NORTH_1).getName() + ".amazonaws.com.cn",
            atsEndpointPrefix + ".iot." + Region.getRegion(Regions.CN_NORTH_1).getName() + ".amazonaws.com",
            atsEndpointPrefix + ".iot." + Region.getRegion(Regions.US_EAST_1).getName() + ".amazonaws.com.cn",
            atsEndpointPrefix + "." + Region.getRegion(Regions.US_EAST_1).getName() + ".amazonaws.com.cn",
            atsEndpointPrefixWithDot + "." + Region.getRegion(Regions.CN_NORTH_1).getName() + ".amazonaws.com.cn",
            atsEndpointPrefixWithDot + ".iot." + Region.getRegion(Regions.CN_NORTH_1).getName() + ".amazonaws.com",
            atsEndpointPrefixWithDot + ".iot." + Region.getRegion(Regions.US_EAST_1).getName() + ".amazonaws.com.cn",
            atsEndpointPrefixWithDot + "." + Region.getRegion(Regions.US_EAST_1).getName() + ".amazonaws.com.cn"
        };
        
        for (final String endpoint : malformedEndpoints) {
            try {
                System.out.println("Trying to connect to endpoint: " + endpoint);
                AWSIotMqttManager mqttManager = new AWSIotMqttManager("int-test-w-certs", endpoint);
                mqttConnect(mqttManager);
            } catch (Exception exception) {
                System.out.println("Received Exception for endpoint: " + 
                    endpoint + "; exception: " + exception.getMessage());
                continue;
            }
            fail("Exception not thrown for a malformed endpoint while connecting.");
        }
    }

    private void mqttConnect(final AWSIotMqttManager mqttManager) throws Exception {
        final List<AWSIotMqttClientStatus> statuses = new ArrayList<>();
        final List<String> messages = new ArrayList<>();
        final List<AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus> cbStatuses = new ArrayList<>();

        // save certificate and private key in a keystore
        AWSIotKeystoreHelper.saveCertificateAndPrivateKey(
            keysAndCertificateInfo.getCertificateId(),
            keysAndCertificateInfo.getCertificatePem(),
            keysAndCertificateInfo.getPrivateKey(),
            keyStorePath,
            KEYSTORE_NAME,
            KEYSTORE_PASSWORD
        );

        // retrieve the keystore
        KeyStore keyStore = AWSIotKeystoreHelper.getIotKeystore(
            keysAndCertificateInfo.getCertificateId(),
            keyStorePath,
            KEYSTORE_NAME,
            KEYSTORE_PASSWORD
        );

        // connect to AWS IoT using keystore
        mqttManager.connect(keyStore, new AWSIotMqttClientStatusCallback() {
            @Override
            public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
                statuses.add(status);
            }
        });

        // wait for connection
        Thread.sleep(3_000);

        // subscribe to MQTT topic, new messages are captured in list
        mqttManager.subscribeToTopic("sdk/test/integration/cert", AWSIotMqttQos.QOS1, new AWSIotMqttNewMessageCallback() {
            @Override
            public void onMessageArrived(String topic, byte[] data) {
                messages.add(new String(data));
            }
        });

        // ensure subscribe propagates
        Thread.sleep(2_000);

        final Map<String, Integer> tokenTable = new HashMap<>();

        // publish 20 messages
        for (int index = 0; index < 20; ++index) {
            tokenTable.put("integration-test-" + index, 0);
            mqttManager.publishString(
                "integration-test-" + index,
                "sdk/test/integration/cert",
                AWSIotMqttQos.QOS1,
                new AWSIotMqttMessageDeliveryCallback() {
                    @Override
                    public void statusChanged(MessageDeliveryStatus status, Object userData) {
                        cbStatuses.add(status);
                        if (userData instanceof String) {
                            tokenTable.put((String)userData, 1);
                        }
                    }
                },
                "integration-test-" + index
            );
            Thread.sleep(250);
        }

        Thread.sleep(1_000);

        // disconnect
        mqttManager.disconnect();

        // verify connection events emitted
        assertEquals(AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatus.Connected, statuses.get(1));

        // verify messages arrived on subscribed topic
        assertEquals(20, messages.size());
        int[] msgnum = new int[20];
        for (String message : messages) {
            assertTrue(message.contains("integration-test-"));
            ++msgnum[Integer.parseInt(message.split("-")[2])];
        }
        for (int messageValue : msgnum) {
            assertEquals(1, messageValue);
        }

        // verify callbacks
        for (AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus status : cbStatuses) {
            assertEquals(AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Success, status);
        }

        // verify all tokens were received
        for (int wasReceived : tokenTable.values()) {
            assertEquals(1, wasReceived);
        }
    }

    @Test
    public void testMqttCertificateConnection() throws Exception {
        testMqttCertificateConnection(false, null);
    }

    @Test
    public void testMqttCertificateConnectionWithAlpn() throws Exception {
        testMqttCertificateConnection(true, null);
    }

    public void testMqttCertificateConnection(final boolean alpnFlag, final String customEndpoint) throws Exception {
        final List<AWSIotMqttClientStatus> statuses = new ArrayList<>();
        final List<String> messages = new ArrayList<>();

        AWSIotMqttManager mqttManager;
        if (customEndpoint != null) {
            mqttManager = AWSIotMqttManager.from(
                Region.getRegion(Regions.US_EAST_1),
                ClientId.fromString("int-test-w-certs"),
                Endpoint.fromString(customEndpoint)
            );
        } else {
            mqttManager = new AWSIotMqttManager(
                "int-test-w-certs",
                Region.getRegion(Regions.US_EAST_1),
                iotClient.getEndpointPrefix()
            );
        }
        // save certificate and private key in a keystore
        AWSIotKeystoreHelper.saveCertificateAndPrivateKey(
            keysAndCertificateInfo.getCertificateId(),
            keysAndCertificateInfo.getCertificatePem(),
            keysAndCertificateInfo.getPrivateKey(),
            keyStorePath,
            KEYSTORE_NAME,
            KEYSTORE_PASSWORD
        );

        // retrieve the keystore
        KeyStore keyStore = AWSIotKeystoreHelper.getIotKeystore(
            keysAndCertificateInfo.getCertificateId(),
            keyStorePath,
            KEYSTORE_NAME,
            KEYSTORE_PASSWORD
        );
        // connect to AWS IoT using keystore
        if (alpnFlag) {
            mqttManager.connectUsingALPN(keyStore, new AWSIotMqttClientStatusCallback() {
                @Override
                public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
                    statuses.add(status);
                }
            });
        } else {
            mqttManager.connect(keyStore, new AWSIotMqttClientStatusCallback() {
                @Override
                public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
                    statuses.add(status);
                }
            });
        }

        // wait for connection
        Thread.sleep(3_000);

        // subscribe to MQTT topic, new messages are captured in list
        mqttManager.subscribeToTopic("sdk/test/integration/cert", AWSIotMqttQos.QOS0, new AWSIotMqttNewMessageCallback() {
            @Override
            public void onMessageArrived(String topic, byte[] data) {
                messages.add(new String(data));
            }
        });

        // ensure subscribe propagates
        Thread.sleep(2_000);

        // publish 20 messages
        for (int i = 0; i < 20; i++) {
            mqttManager.publishString("integration test " + i, "sdk/test/integration/cert", AWSIotMqttQos.QOS0);
            Thread.sleep(250);
        }

        Thread.sleep(1_000);

        // disconnect
        mqttManager.disconnect();

        // verify connection events emitted
        assertEquals(AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatus.Connected, statuses.get(1));

        // verify messages arrived on subscribed topic
        assertEquals(20, messages.size());
        int[] msgnum = new int[20];
        for (String message : messages) {
            assertTrue(message.contains("integration test "));
            ++msgnum[Integer.parseInt(message.split(" ")[2])];
        }
        for (int messageValue : msgnum) {
            assertEquals(1, messageValue);
        }
    }

    @Test
    public void mqttCertConnectDisconnectConnectWithALPN() throws Exception {
        final List<AWSIotMqttClientStatus> statuses = new ArrayList<>();

        AWSIotMqttManager mqttManager = new AWSIotMqttManager(
            "int-test-c-reconnect",
            Region.getRegion(Regions.US_EAST_1),
            iotClient.getEndpointPrefix()
        );
        mqttManager.setAutoReconnect(true);

        // save certificate and private key in a keystore
        AWSIotKeystoreHelper.saveCertificateAndPrivateKey(
            keysAndCertificateInfo.getCertificateId(),
            keysAndCertificateInfo.getCertificatePem(),
            keysAndCertificateInfo.getPrivateKey(),
            keyStorePath,
            KEYSTORE_NAME,
            KEYSTORE_PASSWORD
        );

        // retrieve the keystore
        KeyStore keyStore = AWSIotKeystoreHelper.getIotKeystore(
            keysAndCertificateInfo.getCertificateId(),
            keyStorePath,
            KEYSTORE_NAME,
            KEYSTORE_PASSWORD
        );
        AWSIotMqttClientStatusCallback callback = new AWSIotMqttClientStatusCallback() {
            @Override
            public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
                statuses.add(status);
            }
        };

        // Connect
        mqttManager.connectUsingALPN(keyStore, callback);

        // Wait for the operation
        Thread.sleep(3_000);

        // Disconnect
        mqttManager.disconnect();

        // Wait for the operation
        Thread.sleep(3_000);

        // Connect
        mqttManager.connectUsingALPN(keyStore, callback);

        // Wait for the operation
        Thread.sleep(3_000);

        // verify connection events emitted
        assertEquals(AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatus.Connected, statuses.get(1));
        assertEquals(AWSIotMqttClientStatus.ConnectionLost, statuses.get(2));
        assertEquals(AWSIotMqttClientStatus.Connecting, statuses.get(3));
        assertEquals(AWSIotMqttClientStatus.Connected, statuses.get(4));
    }

    @Test
    public void mqttCertificateWithALPNReconnect() throws Exception {
        mqttCertReconnect(true);
    }

    @Test
    public void mqttCertificateQos1WithCallbacks() throws Exception {
        final List<AWSIotMqttClientStatus> statuses = new ArrayList<>();
        final List<String> messages = new ArrayList<>();
        final List<AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus> cbStatuses = new ArrayList<>();

        String prefix = iotClient.getEndpointPrefix();
        String region = Regions.US_EAST_1.getName();
        String endpoint = String.format("%s.iot.%s.amazonaws.com", prefix, region);

        AWSIotMqttManager mqttManager = new AWSIotMqttManager("int-test-w-certs", endpoint);

        // save certificate and private key in a keystore
        AWSIotKeystoreHelper.saveCertificateAndPrivateKey(
            keysAndCertificateInfo.getCertificateId(),
            keysAndCertificateInfo.getCertificatePem(),
            keysAndCertificateInfo.getPrivateKey(),
            keyStorePath,
            KEYSTORE_NAME,
            KEYSTORE_PASSWORD
        );

        // retrieve the keystore
        KeyStore keyStore = AWSIotKeystoreHelper.getIotKeystore(keysAndCertificateInfo.getCertificateId(), keyStorePath, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        // connect to AWS IoT using keystore
        mqttManager.connect(keyStore, new AWSIotMqttClientStatusCallback() {
            @Override
            public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
                statuses.add(status);
            }
        });

        // wait for connection
        Thread.sleep(3_000);

        // subscribe to MQTT topic, new messages are captured in list
        mqttManager.subscribeToTopic("sdk/test/integration/cert", AWSIotMqttQos.QOS1, new AWSIotMqttNewMessageCallback() {
            @Override
            public void onMessageArrived(String topic, byte[] data) {
                messages.add(new String(data));
            }
        });

        // ensure subscribe propagates
        Thread.sleep(2_000);

        final Map<String, Integer> tokenTable = new HashMap<>();

        // publish 20 messages
        for (int index = 0; index < 20; ++index) {
            tokenTable.put("integration-test-" + index, 0);
            mqttManager.publishString(
                "integration-test-" + index,
                "sdk/test/integration/cert",
                AWSIotMqttQos.QOS1,
                new AWSIotMqttMessageDeliveryCallback() {
                    @Override
                    public void statusChanged(MessageDeliveryStatus status, Object userData) {
                        cbStatuses.add(status);
                        if (userData instanceof String) {
                            tokenTable.put((String)userData, 1);
                        }
                    }
                },
                "integration-test-" + index
            );
            Thread.sleep(250);
        }

        Thread.sleep(1_000);

        // disconnect
        mqttManager.disconnect();

        // verify connection events emitted
        assertEquals(AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatus.Connected, statuses.get(1));

        // verify messages arrived on subscribed topic
        assertEquals(20, messages.size());
        int[] msgnum = new int[20];
        for (String m : messages) {
            assertTrue(m.contains("integration-test-"));
            ++msgnum[Integer.parseInt(m.split("-")[2])];
        }
        for (int messageValue : msgnum) {
            assertEquals(1, messageValue);
        }

        // verify callbacks
        for (AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus status : cbStatuses) {
            assertEquals(AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus.Success, status);
        }

        // verify all tokens were received
        for (int messageWasReceived : tokenTable.values()) {
            assertEquals(1, messageWasReceived);
        }
    }

    @Test
    public void mqttCertificateReconnect() throws Exception {
        mqttCertReconnect(false);
    }

    public void mqttCertReconnect(final boolean alpnFlag) throws Exception {
        final List<AWSIotMqttClientStatus> statuses = new ArrayList<>();
        final List<String> messages = new ArrayList<>();

        AWSIotMqttManager mqttManager = new AWSIotMqttManager(
            "int-test-c-reconnect",
            Region.getRegion(Regions.US_EAST_1),
            iotClient.getEndpointPrefix()
        );
        mqttManager.setAutoReconnect(true);

        // save certificate and private key in a keystore
        AWSIotKeystoreHelper.saveCertificateAndPrivateKey(
            keysAndCertificateInfo.getCertificateId(),
            keysAndCertificateInfo.getCertificatePem(),
            keysAndCertificateInfo.getPrivateKey(),
            keyStorePath,
            KEYSTORE_NAME,
            KEYSTORE_PASSWORD
        );

        // retrieve the keystore
        KeyStore keyStore = AWSIotKeystoreHelper.getIotKeystore(
            keysAndCertificateInfo.getCertificateId(),
            keyStorePath,
            KEYSTORE_NAME,
            KEYSTORE_PASSWORD
        );
        AWSIotMqttClientStatusCallback callback = new AWSIotMqttClientStatusCallback() {
            @Override
            public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
                statuses.add(status);
            }
        };
        // connect to AWS IoT using keystore
        if (alpnFlag) {
            mqttManager.connectUsingALPN(keyStore, callback);
        } else {
            mqttManager.connect(keyStore, callback);
        }

        // wait for connection
        Thread.sleep(3_000);

        assertEquals(AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatus.Connected, statuses.get(1));

        // subscribe to MQTT topic, new messages are captured in list
        mqttManager.subscribeToTopic(
            "sdk/test/integration/cert/reconnect",
            AWSIotMqttQos.QOS0,
            new AWSIotMqttNewMessageCallback() {
                @Override
                public void onMessageArrived(String topic, byte[] data) {
                    messages.add(new String(data));
                }
            }
        );

        // ensure subscribe propagates
        Thread.sleep(2_000);

        // publish a message
        mqttManager.publishString("message 0", "sdk/test/integration/cert/reconnect", AWSIotMqttQos.QOS0);
        Thread.sleep(1_000);
        // verify messages arrived on subscribed topic
        assertEquals("message 0", messages.get(0));

        // publish on $aws will cause a disconnect
        mqttManager.publishString("please kill me", "$aws", AWSIotMqttQos.QOS0);

        Thread.sleep(1_000);
        assertEquals(AWSIotMqttClientStatus.Reconnecting, statuses.get(2));

        // disconnect
        mqttManager.disconnect();
    }

    @Test
    public void mqttCertificateLargeMessage() throws Exception {
        final List<AWSIotMqttClientStatus> statuses = new ArrayList<>();
        final List<String> messages = new ArrayList<>();

        // create large message
        byte[] largeMessageBytes = new byte[ONE_TWENTY_KB];
        for(int index = 0; index < ONE_TWENTY_KB; ++index) {
            largeMessageBytes[index] = getAlphaChar();
        }
        String largeMessageString = new String(largeMessageBytes);

        AWSIotMqttManager mqttManager =new AWSIotMqttManager(
            "int-test-cert-lm",
            Region.getRegion(Regions.US_EAST_1),
            iotClient.getEndpointPrefix()
        );

        mqttManager.setAutoReconnect(false);

        // save certificate and private key in a keystore
        AWSIotKeystoreHelper.saveCertificateAndPrivateKey(
            keysAndCertificateInfo.getCertificateId(),
            keysAndCertificateInfo.getCertificatePem(),
            keysAndCertificateInfo.getPrivateKey(),
            keyStorePath,
            KEYSTORE_NAME,
            KEYSTORE_PASSWORD
        );

        // retrieve the keystore
        KeyStore keyStore = AWSIotKeystoreHelper.getIotKeystore(keysAndCertificateInfo.getCertificateId(), keyStorePath, KEYSTORE_NAME, KEYSTORE_PASSWORD);
        // connect to AWS IoT using keystore
        mqttManager.connect(keyStore, new AWSIotMqttClientStatusCallback() {
            @Override
            public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
                statuses.add(status);
            }
        });

        Thread.sleep(3_000);

        // subscribe to MQTT topic
        mqttManager.subscribeToTopic("sdk/test/integration/cert/large", AWSIotMqttQos.QOS0, new AWSIotMqttNewMessageCallback() {
            @Override
            public void onMessageArrived(String topic, byte[] data) {
                messages.add(new String(data));
            }
        });
        // ensure subscription propagates
        Thread.sleep(2_000);
        // publish large message
        mqttManager.publishString(largeMessageString, "sdk/test/integration/cert/large", AWSIotMqttQos.QOS0);

        Thread.sleep(2_000);

        // disconnect
        mqttManager.disconnect();

        // ensure connection events emitted
        assertEquals(AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatus.Connected, statuses.get(1));

        // verify messages arrived on topic
        assertEquals(1, messages.size());
        assertEquals(largeMessageString, messages.get(0));
        assertEquals(ONE_TWENTY_KB, messages.get(0).length());
    }

    /**
     * Test Subscribe status callback
     */
    private static class TestSubscriptionStatusCallback implements AWSIotMqttSubscriptionStatusCallback {
        String subscriptionStatus = null;

        @Override
        public void onSuccess() {
            subscriptionStatus = "Subscription successful";
        }

        @Override
        public void onFailure(Throwable exception) {
            subscriptionStatus = "Subscription failed";
        }
    }

    @Test
    public void testWebSocketConnectionWithIamAuth() throws Exception {
        testWebsocketConnection(AuthenticationMode.IAM, iotClient.getEndpointAddress());
    }

    @Test
    public void testWebSocketConnectionWithCustomAuth() throws Exception {
        testWebsocketConnection(AuthenticationMode.CUSTOM_AUTH, iotClient.getEndpointAddress());
    }

    private void testWebsocketConnection(
            final AuthenticationMode authMode,
            final String endpoint)
            throws InterruptedException {
        final List<AWSIotMqttClientStatus> statuses = new ArrayList<>();
        final List<String> messages = new ArrayList<>();

        AWSIotMqttManager mqttManager = AWSIotMqttManager.from(
            Region.getRegion(Regions.US_EAST_1),
            ClientId.fromString("int-test-w-ws"),
            Endpoint.fromString(endpoint)
        );
        mqttManager.setAutoReconnect(false);

        switch (authMode) {
            case IAM:
                connectWithIam(mqttManager, statuses);
                break;
            case CUSTOM_AUTH:
                connectWithCustomAuth(mqttManager, statuses);
                break;
        }

        Thread.sleep(3_000);

        // ensure connection events emitted
        assertEquals(AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatus.Connected, statuses.get(1));

        TestSubscriptionStatusCallback sscb = new TestSubscriptionStatusCallback();

        // subscribe to MQTT topic
        mqttManager.subscribeToTopic("sdk/test/integration/ws", AWSIotMqttQos.QOS0, sscb, new AWSIotMqttNewMessageCallback() {
            @Override
            public void onMessageArrived(String topic, byte[] data) {
                messages.add(new String(data));
            }
        });
        // ensure subscription propagates
        Thread.sleep(2_000);
        assertEquals("Subscription successful", sscb.subscriptionStatus);
        // publish 20 messages
        for (int index = 0; index < 20; ++index) {
            mqttManager.publishString("integration test " + index, "sdk/test/integration/ws", AWSIotMqttQos.QOS0);
            Thread.sleep(250);
        }

        Thread.sleep(1_000);
        // disconnect
        mqttManager.disconnect();
        // verify messages arrived on topic
        assertEquals(20, messages.size());
        int[] msgnum = new int[20];
        for (String m : messages) {
            assertTrue(m.contains("integration test "));
            ++msgnum[Integer.parseInt(m.split(" ")[2])];
        }
        for (int i : msgnum) {
            assertEquals(1, i);
        }
    }

    private void connectWithIam(
            final AWSIotMqttManager mqttManager,
            final List<AWSIotMqttClientStatus> statuses) {
        // connect using WebSockets and IAM credentials
        mqttManager.connect(credentialsProvider, new AWSIotMqttClientStatusCallback() {
            @Override
            public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
                statuses.add(status);
            }
        });
    }

    private void connectWithCustomAuth(
            final AWSIotMqttManager mqttManager,
            final List<AWSIotMqttClientStatus> statuses) {
        // Connect using WebSockets and custom authentication token
        mqttManager.connect(
            customAuthorization.getTokenKeyName(),
            customAuthorization.getTokenValue(),
            customAuthorization.getTokenSignature(),
            customAuthorization.getCustomAuthorizerName(),
            new AWSIotMqttClientStatusCallback() {
                @Override
                public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
                    statuses.add(status);
                }
            }
        );
    }

    @Test
    public void testWebsocketReconnectionWithIam() throws Exception {
        testWebsocketReconnection(AuthenticationMode.IAM, iotClient.getEndpointAddress());
    }

    @Test
    public void testWebsocketReconnectionWithCustomAuth() throws Exception {
        testWebsocketReconnection(AuthenticationMode.CUSTOM_AUTH, iotClient.getEndpointAddress());
    }

    private void testWebsocketReconnection(
            final AuthenticationMode authMode,
            final String endpoint)
            throws InterruptedException {
        final List<AWSIotMqttClientStatus> statuses = new ArrayList<>();
        final List<String> messages = new ArrayList<>();

        AWSIotMqttManager mqttManager = AWSIotMqttManager.from(
            Region.getRegion(Regions.US_EAST_1),
            ClientId.fromString("int-test-w-ws"),
            Endpoint.fromString(endpoint)
        );
        mqttManager.setAutoReconnect(true);

        switch (authMode) {
            case IAM:
                connectWithIam(mqttManager, statuses);
                break;
            case CUSTOM_AUTH:
                connectWithCustomAuth(mqttManager, statuses);
                break;
        }

        Thread.sleep(3_000);

        // ensure connection events emitted
        assertEquals(AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatus.Connected, statuses.get(1));

        // subscribe to MQTT topic
        mqttManager.subscribeToTopic("sdk/test/integration/ws/reconnect", AWSIotMqttQos.QOS0, new AWSIotMqttNewMessageCallback() {
            @Override
            public void onMessageArrived(String topic, byte[] data) {
                messages.add(new String(data));
            }
        });
        // ensure subscription propagates
        Thread.sleep(2_000);

        // publish a message
        mqttManager.publishString("message 0", "sdk/test/integration/ws/reconnect", AWSIotMqttQos.QOS0);

        Thread.sleep(1_000);
        // verify messages arrived on subscribed topic
        assertEquals(1, messages.size());
        assertEquals("message 0", messages.get(0));

        // publish on $aws will cause a disconnect
        mqttManager.publishString("please kill me", "$aws", AWSIotMqttQos.QOS0);

        Thread.sleep(1_000);
        // verify connection events emitted
        assertEquals(AWSIotMqttClientStatus.Reconnecting, statuses.get(2));

        // disconnect
        mqttManager.disconnect();
    }

    /**
     * Client-1 connects and subscribes to a topic and disconnects.
     * Client-2 connects and publishes to the same topic.
     * Now, Client-1 comes back, connects and subscribes to the topic and
     * checks if it does not receive the message that Client-2 published.
     */
    @Test
    public void mqttCleanSession() throws Exception {
        final ArrayList<AWSIotMqttClientStatus> statuses = new ArrayList<>();
        final ArrayList<String> messages = new ArrayList<>();

        String largeMessageString = "largeMessageBytes";
        final String topic = "sdk/test/integration/ws/reconnect";

        AWSIotMqttManager mqttManager = new AWSIotMqttManager(
            "client-id-1",
            Region.getRegion(Regions.US_EAST_1), 
            iotClient.getEndpointPrefix()
        );

        mqttManager.setCleanSession(true);
        mqttManager.setAutoReconnect(true);

        // connect to AWS IoT using keystore
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        mqttManager.connect(credentialsProvider, new AWSIotMqttClientStatusCallback() {
            @Override
            public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
                statuses.add(status);
                if (status == AWSIotMqttClientStatus.Connecting) {
                    System.out.println("Client client-id-1 connecton status: " + status);
                } else if (status == AWSIotMqttClientStatus.Connected) {
                    System.out.println("Client client-id-1 connecton status: " + status);
                    countDownLatch.countDown();
                }
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        // subscribe to MQTT topic
        System.out.println("Subscribing to topic: " + topic);
        mqttManager.subscribeToTopic(topic, AWSIotMqttQos.QOS0, new AWSIotMqttNewMessageCallback() {
            @Override
            public void onMessageArrived(String topic, byte[] data) {
                messages.add(new String(data));
            }
        });
        Thread.sleep(2_000);

        // disconnect
        mqttManager.disconnect();
        Thread.sleep(3_000);

        // ensure connection events emitted
        assertEquals(AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatus.Connected, statuses.get(1));

        AWSIotMqttManager mqttManager2 = new AWSIotMqttManager(
            "client-id-2",
            Region.getRegion(Regions.US_EAST_1), 
            iotClient.getEndpointPrefix()
        );
        mqttManager2.setCleanSession(true);
        mqttManager.setAutoReconnect(true);

        // connect to AWS IoT using keystore
        final CountDownLatch countDownLatch2 = new CountDownLatch(1);
        mqttManager2.connect(credentialsProvider, new AWSIotMqttClientStatusCallback() {
            @Override
            public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
                statuses.add(status);
                if (status == AWSIotMqttClientStatus.Connecting) {
                    System.out.println("Client client-id-2 connecton status: " + status);
                } else if (status == AWSIotMqttClientStatus.Connected) {
                    System.out.println("Client client-id-2 connecton status: " + status);
                    countDownLatch2.countDown();
                }
            }
        });

        try {
            countDownLatch2.await();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        // publish large message
        mqttManager2.publishString(largeMessageString, topic, AWSIotMqttQos.QOS0);

        Thread.sleep(3_000);

        mqttManager = new AWSIotMqttManager(
            "client-id-1",
            Region.getRegion(Regions.US_EAST_1), 
            iotClient.getEndpointPrefix()
        );

        mqttManager.setCleanSession(true);
        mqttManager.setAutoReconnect(true);

        // connect to AWS IoT using keystore
        final CountDownLatch countDownLatch3 = new CountDownLatch(1);
        mqttManager.connect(credentialsProvider, new AWSIotMqttClientStatusCallback() {
            @Override
            public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
                statuses.add(status);
                if (status == AWSIotMqttClientStatus.Connecting) {
                    System.out.println("Client client-id-1 connecton status: " + status);
                } else if (status == AWSIotMqttClientStatus.Connected) {
                    System.out.println("Client client-id-1 connecton status: " + status);
                    countDownLatch3.countDown();
                }
            }
        });
        try {
            countDownLatch3.await();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        // subscribe to MQTT topic
        mqttManager.subscribeToTopic(topic, AWSIotMqttQos.QOS0, new AWSIotMqttNewMessageCallback() {
            @Override
            public void onMessageArrived(String topic, byte[] data) {
                messages.add(new String(data));
            }
        });
        
        Thread.sleep(10_000);

        // verify messages arrived on topic
        assertTrue(messages.isEmpty());
    }

    /**
     * Client-1 connects and subscribes to a topic and disconnects.
     * Client-2 connects and publishes to the same topic.
     * Now, Client-1 comes back, connects and subscribes to the topic and
     * checks if it can receive the message that Client-2 published.
     *
     */
    @Test
    public void mqttPersistentSession() throws Exception {
        final List<AWSIotMqttClientStatus> statuses = new ArrayList<>();
        final List<String> messages = new ArrayList<>();

        String largeMessageString = "largeMessageBytes";
        final String topic = "sdk/test/integration/ws/reconnect";

        AWSIotMqttManager mqttManager = new AWSIotMqttManager(
            "persistent-client-id-1",
            Region.getRegion(Regions.US_EAST_1),
            iotClient.getEndpointPrefix()
        );

        mqttManager.setCleanSession(false);
        mqttManager.setAutoReconnect(true);

        // connect to AWS IoT using credentials provider
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        mqttManager.connect(credentialsProvider, new AWSIotMqttClientStatusCallback() {
            @Override
            public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
                statuses.add(status);
                if (status == AWSIotMqttClientStatus.Connecting) {
                    System.out.println("Client persistent-client-id-1 connecton status: " + status);
                } else if (status == AWSIotMqttClientStatus.Connected) {
                    System.out.println("Client persistent-client-id-1 connecton status: " + status);
                    countDownLatch.countDown();
                }
            }
        });

        try {
            countDownLatch.await();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        // subscribe to MQTT topic
        mqttManager.subscribeToTopic(topic, AWSIotMqttQos.QOS1, new AWSIotMqttNewMessageCallback() {
            @Override
            public void onMessageArrived(String topic, byte[] data) {
                System.out.println("Client persistent-client-id-1 received a message on topic:" + topic);
                messages.add(new String(data));
            }
        });

        // ensure subscription propagates
        Thread.sleep(2_000);

        // disconnect
        mqttManager.disconnect();
        Thread.sleep(3_000);

        // ensure connection events emitted
        assertEquals(AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatus.Connected, statuses.get(1));

        AWSIotMqttManager mqttManager2 = new AWSIotMqttManager(
            "persistent-client-id-2",
            Region.getRegion(Regions.US_EAST_1),
            iotClient.getEndpointPrefix()
        );

        // connect to AWS IoT using keystore
        final CountDownLatch countDownLatch2 = new CountDownLatch(1);
        mqttManager2.connect(credentialsProvider, new AWSIotMqttClientStatusCallback() {
            @Override
            public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
                statuses.add(status);
                if (status == AWSIotMqttClientStatus.Connecting) {
                    System.out.println("Client persistent-client-id-2 connecton status: " + status);
                } else if (status == AWSIotMqttClientStatus.Connected) {
                    System.out.println("Client persistent-client-id-2 connecton status: " + status);
                    countDownLatch2.countDown();
                }
            }
        });
        try {
            countDownLatch2.await();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        // publish large message
        mqttManager2.publishString(
            largeMessageString,
            topic,
            AWSIotMqttQos.QOS1,
            new AWSIotMqttMessageDeliveryCallback() {
                @Override
                public void statusChanged(MessageDeliveryStatus status, Object userData) {
                    System.out.println("Client persistent-client-id-2 published a message. Status :" + status);
                }
            },
            null
        );

        Thread.sleep(3_000);

        // disconenct client 2
        mqttManager2.disconnect();
        Thread.sleep(3_000);

        // connect to AWS IoT using credentials provider
        final CountDownLatch countDownLatch3 = new CountDownLatch(1);
        mqttManager.connect(credentialsProvider, new AWSIotMqttClientStatusCallback() {
            @Override
            public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
                statuses.add(status);
                if (status == AWSIotMqttClientStatus.Connecting) {
                    System.out.println("Client persistent-client-id-1 connecton status: " + status);
                } else if (status == AWSIotMqttClientStatus.Connected) {
                    System.out.println("Client persistent-client-id-1 connecton status: " + status);
                    countDownLatch3.countDown();
                }
            }
        });
        try {
            countDownLatch3.await();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        // subscribe to MQTT topic
        mqttManager.subscribeToTopic(topic, AWSIotMqttQos.QOS1, new AWSIotMqttNewMessageCallback() {
            @Override
            public void onMessageArrived(String topic, byte[] data) {
                System.out.println("Client persistent-client-id-1 received a message on topic:" + topic);
                messages.add(new String(data));
            }
        });

        // ensure subscription propagates
        Thread.sleep(10_000);

        // verify messages arrived on topic
        assertEquals(1, messages.size());
    }

    private static byte getAlphaChar() {
        return (byte) (0x41 + new SecureRandom().nextInt(57));
    }
}
