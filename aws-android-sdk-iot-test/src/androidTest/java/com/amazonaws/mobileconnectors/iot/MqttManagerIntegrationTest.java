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
import android.support.test.InstrumentationRegistry;
import android.util.Log;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.iot.AWSIotClient;
import com.amazonaws.services.iot.model.AttachPolicyRequest;
import com.amazonaws.services.iot.model.CertificateStatus;
import com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest;
import com.amazonaws.services.iot.model.CreateKeysAndCertificateResult;
import com.amazonaws.services.iot.model.CreatePolicyRequest;
import com.amazonaws.services.iot.model.DeleteCertificateRequest;
import com.amazonaws.services.iot.model.DeletePolicyRequest;
import com.amazonaws.services.iot.model.DescribeEndpointRequest;
import com.amazonaws.services.iot.model.DescribeEndpointResult;
import com.amazonaws.services.iot.model.DetachPolicyRequest;
import com.amazonaws.services.iot.model.ResourceAlreadyExistsException;
import com.amazonaws.services.iot.model.UpdateCertificateRequest;
import com.amazonaws.testutils.AWSTestBase;

import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class MqttManagerIntegrationTest extends AWSTestBase {
    private static final String TAG = MqttManagerIntegrationTest.class.getSimpleName();

    private static final int ONE_TWENTY_KB = 120_000;
    private static final String KEYSTORE_NAME = "integration_test.bks";
    private static final String KEYSTORE_PASSWORD = "test password";
    private static final String IOT_POLICY_NAME = "android-integration-test";
    private static final String CUSTOM_DOMAIN = "www.amplify-android-test.com";

    private static String keyStorePath = "./";
    private static AWSCredentialsProvider credentialsProvider;
    private static String endpointPrefix;
    private static String betaEndpoint;
    private static String endpoint;
    private static AWSIotClient iotClient;
    private static CreateKeysAndCertificateResult certResult;

    @BeforeClass
    public static void beforeSuite() throws Exception {
        Context appContext = InstrumentationRegistry.getTargetContext();
        keyStorePath = appContext.getFilesDir().toString() + "/";
        System.out.println(keyStorePath);
        credentialsProvider = new CognitoCachingCredentialsProvider(
            appContext,
            getPackageConfigure("iot").getString(ConfigKey.IDENTITY_POOL_ID.toString()),
            Regions.US_EAST_1
        );

        iotClient = new AWSIotClient(credentialsProvider);

        DescribeEndpointRequest request = new DescribeEndpointRequest();
        DescribeEndpointResult result = iotClient.describeEndpoint(request);
        endpoint = result.getEndpointAddress();
        endpointPrefix = endpoint.split("\\.")[0];

        request.setEndpointType("iot:Data-Beta");
        result = iotClient.describeEndpoint(request);
        betaEndpoint = result.getEndpointAddress();
    }

    @Before
    public void beforeEach() {
        createAndAttachPolicy();
    }

    @After
    public void afterEach() {
        deletePolicyAndCertificate();
        File keystoreFile = new File(keyStorePath, KEYSTORE_NAME);
        if (keystoreFile.exists()) {
            //noinspection ResultOfMethodCallIgnored
            keystoreFile.delete();
        }
    }

    @Test
    public void mqttConnect_USEast1_ATS_Endpoint() throws Exception {
        DescribeEndpointRequest request = new DescribeEndpointRequest();
        request.setEndpointType("iot:Data-ATS");
        DescribeEndpointResult result = iotClient.describeEndpoint(request);
        endpointPrefix = result.getEndpointAddress().split("\\.")[0];
        System.out.println("Endpoint prefix: " + endpointPrefix);
        
        String endpoint = endpointPrefix + ".iot." + Region.getRegion(Regions.US_EAST_1).getName() + ".amazonaws.com";
        System.out.println("Endpoint: " + endpoint);
        
        AWSIotMqttManager mqttManager = new AWSIotMqttManager("int-test-w-certs", endpoint);
        mqttConnect(mqttManager);
    }

    @Test
    public void mqttConnect_USEast1_Endpoint() throws Exception {
        DescribeEndpointRequest request = new DescribeEndpointRequest();
        request.setEndpointType("iot:Data");
        DescribeEndpointResult result = iotClient.describeEndpoint(request);
        endpointPrefix = result.getEndpointAddress().split("\\.")[0];
        System.out.println("Endpoint prefix: " + endpointPrefix);
        
        String endpoint = endpointPrefix + ".iot." + Region.getRegion(Regions.US_EAST_1).getName() + ".amazonaws.com";
        System.out.println("Endpoint: " + endpoint);
        
        AWSIotMqttManager mqttManager = new AWSIotMqttManager("int-test-w-certs", endpoint);
        mqttConnect(mqttManager);
    }

    @Test
    public void mqttConnect_USEast1_EndpointPrefix_Region() throws Exception {
        DescribeEndpointRequest request = new DescribeEndpointRequest();
        request.setEndpointType("iot:Data");
        DescribeEndpointResult result = iotClient.describeEndpoint(request);
        endpointPrefix = result.getEndpointAddress().split("\\.")[0];
        System.out.println("Endpoint prefix: " + endpointPrefix);
        mqttConnect(new AWSIotMqttManager(
            "int-test-w-certs",
            Region.getRegion(Regions.US_EAST_1),
            endpointPrefix
        ));
    }

    @Test
    public void mqttConnectMalformedEndpoints() {
        DescribeEndpointRequest request = new DescribeEndpointRequest();
        request.setEndpointType("iot:Data");
        DescribeEndpointResult result = iotClient.describeEndpoint(request);
        endpointPrefix = result.getEndpointAddress().split("\\.")[0];
        System.out.println("Endpoint prefix: " + endpointPrefix);

        DescribeEndpointRequest atsRequest = new DescribeEndpointRequest();
        atsRequest.setEndpointType("iot:Data-ATS");
        DescribeEndpointResult atsResult = iotClient.describeEndpoint(atsRequest);
        String atsEndpointPrefix = atsResult.getEndpointAddress().split("\\.")[0];
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
        final List<AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus> statuses = new ArrayList<>();
        final List<String> messages = new ArrayList<>();
        final List<AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus> cbStatuses = new ArrayList<>();

        // save certificate and private key in a keystore
        AWSIotKeystoreHelper.saveCertificateAndPrivateKey(
            certResult.getCertificateId(),
            certResult.getCertificatePem(),
            certResult.getKeyPair().getPrivateKey(),
            keyStorePath,
            KEYSTORE_NAME,
            KEYSTORE_PASSWORD
        );

        // retrieve the keystore
        KeyStore keyStore = AWSIotKeystoreHelper.getIotKeystore(
            certResult.getCertificateId(),
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
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected, statuses.get(1));

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

    @Test
    public void testMqttCertificateConnectionWithCustomDomain() throws Exception {
        testMqttCertificateConnection(false, CUSTOM_DOMAIN);
    }

    @Test
    public void testMqttCertificateConnectionAlpnWithCustomDomain() throws Exception {
        testMqttCertificateConnection(true, CUSTOM_DOMAIN);
    }

    public void testMqttCertificateConnection(final boolean alpnFlag, final String customEndpoint) throws Exception {
        final List<AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus> statuses = new ArrayList<>();
        final List<String> messages = new ArrayList<>();

        AWSIotMqttManager mqttManager;
        if (customEndpoint != null) {
            mqttManager = AWSIotMqttManager.from(
                Region.getRegion(Regions.US_EAST_1),
                AWSIotMqttManager.ClientId.fromString("int-test-w-certs"),
                AWSIotMqttManager.Endpoint.fromString(customEndpoint)
            );
        } else {
            mqttManager = new AWSIotMqttManager(
                "int-test-w-certs",
                Region.getRegion(Regions.US_EAST_1),
                endpointPrefix
            );
        }
        // save certificate and private key in a keystore
        AWSIotKeystoreHelper.saveCertificateAndPrivateKey(
            certResult.getCertificateId(),
            certResult.getCertificatePem(),
            certResult.getKeyPair().getPrivateKey(),
            keyStorePath,
            KEYSTORE_NAME,
            KEYSTORE_PASSWORD
        );

        // retrieve the keystore
        KeyStore keyStore = AWSIotKeystoreHelper.getIotKeystore(
            certResult.getCertificateId(),
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
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected, statuses.get(1));

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
        final List<AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus> statuses = new ArrayList<>();

        AWSIotMqttManager mqttManager = new AWSIotMqttManager(
            "int-test-c-reconnect",
            Region.getRegion(Regions.US_EAST_1),
            endpointPrefix
        );
        mqttManager.setAutoReconnect(true);

        // save certificate and private key in a keystore
        AWSIotKeystoreHelper.saveCertificateAndPrivateKey(
            certResult.getCertificateId(),
            certResult.getCertificatePem(),
            certResult.getKeyPair().getPrivateKey(),
            keyStorePath,
            KEYSTORE_NAME,
            KEYSTORE_PASSWORD
        );

        // retrieve the keystore
        KeyStore keyStore = AWSIotKeystoreHelper.getIotKeystore(
            certResult.getCertificateId(),
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
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected, statuses.get(1));
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.ConnectionLost, statuses.get(2));
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting, statuses.get(3));
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected, statuses.get(4));
    }

    @Test
    public void mqttCertificateWithALPNReconnect() throws Exception {
        mqttCertReconnect(true);
    }

    @Test
    public void mqttCertificateQos1WithCallbacks() throws Exception {
        final List<AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus> statuses = new ArrayList<>();
        final List<String> messages = new ArrayList<>();
        final List<AWSIotMqttMessageDeliveryCallback.MessageDeliveryStatus> cbStatuses = new ArrayList<>();

        String endpoint = endpointPrefix + ".iot." + Region.getRegion(Regions.US_EAST_1).getName() + ".amazonaws.com";
        AWSIotMqttManager mqttManager = new AWSIotMqttManager("int-test-w-certs", endpoint);

        // save certificate and private key in a keystore
        AWSIotKeystoreHelper.saveCertificateAndPrivateKey(
            certResult.getCertificateId(),
            certResult.getCertificatePem(),
            certResult.getKeyPair().getPrivateKey(),
            keyStorePath,
            KEYSTORE_NAME,
            KEYSTORE_PASSWORD
        );

        // retrieve the keystore
        KeyStore keyStore = AWSIotKeystoreHelper.getIotKeystore(certResult.getCertificateId(), keyStorePath, KEYSTORE_NAME, KEYSTORE_PASSWORD);
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
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected, statuses.get(1));

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
        final List<AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus> statuses = new ArrayList<>();
        final List<String> messages = new ArrayList<>();

        AWSIotMqttManager mqttManager = new AWSIotMqttManager(
            "int-test-c-reconnect",
            Region.getRegion(Regions.US_EAST_1),
            endpointPrefix
        );
        mqttManager.setAutoReconnect(true);

        // save certificate and private key in a keystore
        AWSIotKeystoreHelper.saveCertificateAndPrivateKey(
            certResult.getCertificateId(),
            certResult.getCertificatePem(),
            certResult.getKeyPair().getPrivateKey(),
            keyStorePath,
            KEYSTORE_NAME,
            KEYSTORE_PASSWORD
        );

        // retrieve the keystore
        KeyStore keyStore = AWSIotKeystoreHelper.getIotKeystore(
            certResult.getCertificateId(),
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

        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected, statuses.get(1));

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
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Reconnecting, statuses.get(2));

        // disconnect
        mqttManager.disconnect();
    }

    @Test
    public void mqttCertificateLargeMessage() throws Exception {
        final List<AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus> statuses = new ArrayList<>();
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
            endpointPrefix
        );

        mqttManager.setAutoReconnect(false);

        // save certificate and private key in a keystore
        AWSIotKeystoreHelper.saveCertificateAndPrivateKey(
            certResult.getCertificateId(),
            certResult.getCertificatePem(),
            certResult.getKeyPair().getPrivateKey(),
            keyStorePath,
            KEYSTORE_NAME,
            KEYSTORE_PASSWORD
        );

        // retrieve the keystore
        KeyStore keyStore = AWSIotKeystoreHelper.getIotKeystore(certResult.getCertificateId(), keyStorePath, KEYSTORE_NAME, KEYSTORE_PASSWORD);
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
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected, statuses.get(1));

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
        testWebsocketConnection(AWSIotMqttManager.AuthenticationMode.IAM, endpoint);
    }

    @Test
    public void testWebSocketConnectionWithCustomAuth() throws Exception {
        testWebsocketConnection(AWSIotMqttManager.AuthenticationMode.CUSTOM_AUTH, endpoint);
    }

    @Test
    public void testWebSocketWithConnectionUsernamePassword() throws Exception {
        testWebsocketConnection(AWSIotMqttManager.AuthenticationMode.USERNAME_PASSWORD, betaEndpoint);
    }

    @Test
    public void testWebSocketWithConnectionIamAuthAndCustomDomain() throws Exception {
        testWebsocketConnection(AWSIotMqttManager.AuthenticationMode.IAM, CUSTOM_DOMAIN);
    }

    @Test
    public void testWebSocketConnectionWithCustomAuthAndCustomDomain() throws Exception {
        testWebsocketConnection(AWSIotMqttManager.AuthenticationMode.CUSTOM_AUTH, CUSTOM_DOMAIN);
    }

    @Test
    public void testWebSocketConnectionWithUsernamePasswordAndCustomDomain() throws Exception {
        testWebsocketConnection(AWSIotMqttManager.AuthenticationMode.USERNAME_PASSWORD, CUSTOM_DOMAIN);
    }

    private void testWebsocketConnection(
            final AWSIotMqttManager.AuthenticationMode authMode,
            final String endpoint)
            throws InterruptedException, JSONException {
        final List<AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus> statuses = new ArrayList<>();
        final List<String> messages = new ArrayList<>();

        AWSIotMqttManager mqttManager = AWSIotMqttManager.from(
            Region.getRegion(Regions.US_EAST_1),
            AWSIotMqttManager.ClientId.fromString("int-test-w-ws"),
            AWSIotMqttManager.Endpoint.fromString(endpoint)
        );
        mqttManager.setAutoReconnect(false);

        switch (authMode) {
            case IAM:
                connectWithIam(mqttManager, statuses);
                break;
            case CUSTOM_AUTH:
                connectWithCustomAuth(mqttManager, statuses);
                break;
            case USERNAME_PASSWORD:
                connectWithUsernamePassword(mqttManager, statuses);
                break;
        }

        Thread.sleep(3_000);

        // ensure connection events emitted
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected, statuses.get(1));

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
            final List<AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus> statuses) {
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
            final List<AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus> statuses)
            throws JSONException {
        ConnectionParams connectionParams = ConnectionParams.fromPackageConfig(getPackageConfigure("iot"));
        // connect using WebSockets and custom authentication token
        mqttManager.connect(
            connectionParams.getTokenKeyName(),
            connectionParams.getToken(),
            connectionParams.getTokenSignature(),
            connectionParams.getCustomAuthorizerName(),
            new AWSIotMqttClientStatusCallback() {
                @Override
                public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
                    statuses.add(status);
                }
            }
        );
    }

    private void connectWithUsernamePassword(
            final AWSIotMqttManager mqttManager,
            final List<AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus> statuses) {
        // connect using username and password
        mqttManager.connect("user", "pass", new AWSIotMqttClientStatusCallback() {
            @Override
            public void onStatusChanged(AWSIotMqttClientStatus status, Throwable throwable) {
                statuses.add(status);
            }
        });
    }

    @Test
    public void testWebsocketReconnectionWithIam() throws Exception {
        testWebsocketReconnection(AWSIotMqttManager.AuthenticationMode.IAM, endpoint);
    }

    @Test
    public void testWebsocketReconnectionWithCustomAuth() throws Exception {
        testWebsocketReconnection(AWSIotMqttManager.AuthenticationMode.CUSTOM_AUTH, endpoint);
    }

    @Test
    public void testWebsocketReconnectionWithUsernameAndPassword() throws Exception {
        testWebsocketReconnection(AWSIotMqttManager.AuthenticationMode.USERNAME_PASSWORD, betaEndpoint);
    }

    private void testWebsocketReconnection(
            final AWSIotMqttManager.AuthenticationMode authMode,
            final String endpoint)
            throws InterruptedException, JSONException {
        final List<AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus> statuses = new ArrayList<>();
        final List<String> messages = new ArrayList<>();

        AWSIotMqttManager mqttManager = AWSIotMqttManager.from(
            Region.getRegion(Regions.US_EAST_1),
            AWSIotMqttManager.ClientId.fromString("int-test-w-ws"),
            AWSIotMqttManager.Endpoint.fromString(endpoint)
        );
        mqttManager.setAutoReconnect(true);

        switch (authMode) {
            case IAM:
                connectWithIam(mqttManager, statuses);
                break;
            case CUSTOM_AUTH:
                connectWithCustomAuth(mqttManager, statuses);
                break;
            case USERNAME_PASSWORD:
                connectWithUsernamePassword(mqttManager, statuses);
                break;
        }

        Thread.sleep(3_000);

        // ensure connection events emitted
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected, statuses.get(1));

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
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Reconnecting, statuses.get(2));

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
        final ArrayList<AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus> statuses = new ArrayList<>();
        final ArrayList<String> messages = new ArrayList<>();

        String largeMessageString = "largeMessageBytes";
        final String topic = "sdk/test/integration/ws/reconnect";

        AWSIotMqttManager mqttManager = new AWSIotMqttManager(
            "client-id-1",
            Region.getRegion(Regions.US_EAST_1), 
            endpointPrefix
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
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected, statuses.get(1));

        AWSIotMqttManager mqttManager2 = new AWSIotMqttManager(
            "client-id-2",
            Region.getRegion(Regions.US_EAST_1), 
            endpointPrefix
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
            endpointPrefix
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
        final List<AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus> statuses = new ArrayList<>();
        final List<String> messages = new ArrayList<>();

        String largeMessageString = "largeMessageBytes";
        final String topic = "sdk/test/integration/ws/reconnect";

        AWSIotMqttManager mqttManager = new AWSIotMqttManager(
            "persistent-client-id-1",
            Region.getRegion(Regions.US_EAST_1),
            endpointPrefix
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
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting, statuses.get(0));
        assertEquals(AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected, statuses.get(1));

        AWSIotMqttManager mqttManager2 = new AWSIotMqttManager(
            "persistent-client-id-2",
            Region.getRegion(Regions.US_EAST_1),
            endpointPrefix
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

    /**
     * Create an IoT policy allowing all actions in IoT
     * Then attaching the created policy to the certificate.
     *
     * Warning: This policy is used repeatedly throughout the test
     */
    private void createAndAttachPolicy() {
        // create a new certificate and private key
        CreateKeysAndCertificateRequest certRequest = new CreateKeysAndCertificateRequest();
        certRequest.setSetAsActive(true);
        certResult = iotClient.createKeysAndCertificate(certRequest);

        // create an IoT policy allowing all actions in IoT
        String policyDocument;
        CreatePolicyRequest createPolicyRequest;

        try {
            // create an IoT policy allowing all actions in IoT
            policyDocument = "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Action\":\"iot:*\",\"Resource\":\"*\",\"Effect\":\"Allow\"}]}";
            createPolicyRequest = new CreatePolicyRequest();
            createPolicyRequest.setPolicyName(IOT_POLICY_NAME);
            createPolicyRequest.setPolicyDocument(policyDocument);
            iotClient.createPolicy(createPolicyRequest);
        }  catch (Exception exception) {
            assertEquals(exception.getClass(), ResourceAlreadyExistsException.class);
        }

        AttachPolicyRequest attachPolicyRequest = new AttachPolicyRequest();
        attachPolicyRequest.setPolicyName(IOT_POLICY_NAME);
        attachPolicyRequest.setTarget(certResult.getCertificateArn());
        iotClient.attachPolicy(attachPolicyRequest);
    }

    /**
     * Detach the policy from the certificate.
     * Delete the policy.
     * Update certificate status as inactive.
     * Delete the certificate.
     */
    private void deletePolicyAndCertificate() {
        Log.d(TAG, "Detaching the policy from the certificate.");
        DetachPolicyRequest detachPolicyRequest = new DetachPolicyRequest();
        detachPolicyRequest.setPolicyName(IOT_POLICY_NAME);
        if (certResult != null) {
            detachPolicyRequest.setTarget(certResult.getCertificateArn());
        }
        iotClient.detachPolicy(detachPolicyRequest);

        // delete policy
        Log.d(TAG, "Deleting the policy.");
        try {
            DeletePolicyRequest deletePolicyRequest = new DeletePolicyRequest();
            deletePolicyRequest.setPolicyName(IOT_POLICY_NAME);
            iotClient.deletePolicy(deletePolicyRequest);
        } catch (AmazonClientException amazonClientException) {
            // TODO Ignore failures in tearDown, but this needs to be fixed.
            amazonClientException.printStackTrace();
        }

        // set cert inactive
        Log.d(TAG, "Make the certificate inactive.");
        UpdateCertificateRequest updateCertificateRequest = new UpdateCertificateRequest();
        updateCertificateRequest.setCertificateId(certResult.getCertificateId());
        updateCertificateRequest.setNewStatus(CertificateStatus.INACTIVE);
        iotClient.updateCertificate(updateCertificateRequest);

        // delete cert
        Log.d(TAG, "Delete the certificate.");
        DeleteCertificateRequest deleteCertificateRequest = new DeleteCertificateRequest();
        deleteCertificateRequest.setCertificateId(certResult.getCertificateId());
        iotClient.deleteCertificate(deleteCertificateRequest);
    }
}
