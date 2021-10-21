/**
 * Copyright 2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.iot;

import static com.amazonaws.mobileconnectors.iot.MqttManagerTestUtils.CUSTOM_ENDPOINT;
import static com.amazonaws.mobileconnectors.iot.MqttManagerTestUtils.MQTT_CLIENT_ID;
import static org.junit.Assert.assertEquals;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;

import com.amazonaws.services.iot.model.CreateKeysAndCertificateResult;

import org.junit.Test;

import java.security.KeyStore;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class MqttManagerQoS2Test {
    private static final String KEYSTORE_NAME = "integration_test.bks";
    private static final String KEYSTORE_PASSWORD = "test password";

    @Test
    public void mqttConnect_test_qos2_customEndpoint() throws Exception {
        Context appContext = ApplicationProvider.getApplicationContext();
        String keyStorePath = appContext.getFilesDir().toString() + "/";
        System.out.println(keyStorePath);
        final CountDownLatch connectionLatch = new CountDownLatch(1);
        final CountDownLatch publishMessageLatch = new CountDownLatch(1);
        final CountDownLatch receiveMessageLatch = new CountDownLatch(1);
        final AWSIotMqttManager mqttManager = new AWSIotMqttManager(MQTT_CLIENT_ID + "-QOS2",
                                                                    CUSTOM_ENDPOINT);
        // Initialize this with the value returned by a call to CreateKeyAndCertificate API or CLI call
        // Once it's live in prod, we can remove this since the test in MqttManagerIntegrationTest will pass.
        CreateKeysAndCertificateResult createKeysAndCertificateResult = null;

        if (!AWSIotKeystoreHelper.isKeystorePresent(keyStorePath, KEYSTORE_NAME)) {
            IotClient.KeysAndCertificateInfo keysAndCertificateInfo = new IotClient.KeysAndCertificateInfo(createKeysAndCertificateResult);

            AWSIotKeystoreHelper.saveCertificateAndPrivateKey(
                keysAndCertificateInfo.getCertificateId(),
                keysAndCertificateInfo.getCertificatePem(),
                keysAndCertificateInfo.getPrivateKey(),
                keyStorePath,
                KEYSTORE_NAME,
                KEYSTORE_PASSWORD
            );

        }
        final KeyStore keyStore = AWSIotKeystoreHelper.getIotKeystore(
            createKeysAndCertificateResult.getCertificateId(),
            keyStorePath,
            KEYSTORE_NAME,
            KEYSTORE_PASSWORD
        );



        new Thread(new Runnable() {
            @Override
            public void run() {
                mqttManager.connect(keyStore, new MqttManagerTestUtils.LatchedAWSIotMqttClientStatusCallback(connectionLatch));
            }
        }).start();

        connectionLatch.await(20, TimeUnit.SECONDS);
        assertEquals(0, connectionLatch.getCount());

        String messageBody = "Testing QOS2";
        mqttManager.publishString(messageBody, "/mytopic", AWSIotMqttQos.QOS2, new AWSIotMqttMessageDeliveryCallback() {
            @Override
            public void statusChanged(MessageDeliveryStatus status, Object userData) {
                publishMessageLatch.countDown();
            }
        }, null, true);

        publishMessageLatch.await(10, TimeUnit.SECONDS);
        assertEquals(0, publishMessageLatch.getCount());

        final AtomicReference<byte[]> result = new AtomicReference<>();
        mqttManager.subscribeToTopic("/mytopic", AWSIotMqttQos.QOS2, new AWSIotMqttNewMessageCallback() {
            @Override
            public void onMessageArrived(String topic, byte[] data) {
                result.set(data);
                receiveMessageLatch.countDown();
            }
        });

        receiveMessageLatch.await(10, TimeUnit.SECONDS);

        assertEquals(messageBody, new String(result.get()));

        mqttManager.disconnect();
    }
}
