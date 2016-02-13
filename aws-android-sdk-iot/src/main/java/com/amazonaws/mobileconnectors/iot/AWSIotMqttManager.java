/**
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.amazonaws.AmazonClientException;
import com.amazonaws.regions.Region;

import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.SocketFactory;

/**
 * The broker for applications allows receive and publish messages AWS IoT
 * MqttClient Amazon Internet of Things AWSIotMqttManager implements a broker
 * for applications and internet-connected things to publish and receive
 * messages.
 */
public class AWSIotMqttManager {

    /** API level 16. 16 = Build.VERSION_CODES.JELLY_BEAN. */
    private static final Integer ANDROID_API_LEVEL_16 = 16;
    /** Conversion seconds to milliseconds. */
    private static final Integer MILLIS_IN_ONE_SECOND = 1000;
    /** Constant for milliseconds between queue publishes. */
    private static final Long MILLIS_BETWEEN_QUEUE_PUBLISHES = 100L;
    /** Constant for log prefix. */
    private static final String LOG_TAG = AWSIotMqttManager.class.getCanonicalName();

    /** Default value for time between reconnect attempts. */
    public static final Integer DEFAULT_RECONNECT_TIMEOUT_SECONDS = 10;
    /** Default value for reconnect enabled. */
    public static final Boolean DEFAULT_AUTO_RECONNECT_ENABLED = true;
    /** Default value for number of auto reconnect attempts before giving up. */
    public static final Integer DEFAULT_AUTO_RECONNECT_ATTEMPTS = 6;
    /** Default value for MQTT keep alive. */
    public static final Integer DEFAULT_KEEP_ALIVE_SECONDS = 10;
    /** Default value for offline publish queue enabled. */
    public static final Boolean DEFAULT_OFFLINE_PUBLISH_QUEUE_ENABLED = true;
    /** Default value for offline publish queue bound. */
    public static final Integer DEFAULT_OFFLINE_PUBLISH_QUEUE_BOUND = 100;

    /** The underlying Paho Java MQTT client. */
    private MqttAsyncClient mqttClient;
    /** Customer specific prefix for data endpoint. */
    private String accountEndpointPrefix;
    /**
     * Connection callback for the user. This client receives the connection
     * lost callback and then calls this one on behalf of the user.
     */
    private AWSIotMqttClientStatusCallback userStatusCallback;
    /**
     * MQTT subscriptions. Used when resubscribing after a reconnect. Also used
     * to proved per-topic message arrived callbacks.
     */
    private Map<String, AWSIotMqttTopic> topicListeners;
    /**
     * Queue for messages attempted to publish while MQTT client was offline.
     * Republished upon reconnect.
     */
    private List<AWSIotMqttQueueMessage> mqttMessageQueue;
    /** KeepAlive interval specified by the user. */
    private int userKeepAlive;
    /** Are we automatically reconnecting upon (non-user) disconnect? */
    private boolean autoReconnect;
    /** Timeout between automatic reconnect attempts. In seconds. */
    private int reconnectTimeout;
    /** Maximum number of automatic reconnect attempts done before giving up. */
    private int maxAutoReconnectAttepts;
    /** Reconnects attempted so far. */
    private int autoReconnectsAttempted;
    /** Is offline publish queueing enabled? */
    private boolean offlinePublishQueueEnabled;
    /** Offline publish queue bound. */
    private Integer offlinePublishQueueBound;
    /** Was this disconnect requested by the user? */
    private boolean userDisconnect;
    /** Do we need to resubscribe upon reconnecting? */
    private boolean needResubscribe;
    /**
     * Holds client socket factory. Set upon initial connect then reused on
     * reconnect.
     */
    private SocketFactory clientSocketFactory;

    /**
     * Return the customer specific endpoint prefix.
     * 
     * @return customer specific endpoint prefix.
     */
    public String getAccountEndpointPrefix() {
        return accountEndpointPrefix;
    }

    /**
     * Is auto-reconnect enabled?
     * 
     * @return true if enabled, false if disabled.
     */
    public boolean isAutoReconnect() {
        return autoReconnect;
    }

    /**
     * Enable / disable the auto-reconnect feature.
     * 
     * @param enabled true if enabled, false if disabled.
     */
    public void setAutoReconnect(boolean enabled) {
        autoReconnect = enabled;
    }

    /**
     * Return the timeout value between reconnect attempts.
     * 
     * @return the auto reconnect timeout value in seconds.
     */
    public int getReconnectTimeout() {
        return reconnectTimeout;
    }

    /**
     * Sets the timeout value for reconnect attempts.
     * 
     * @param timeout timeout value in seconds.
     */
    public void setReconnectTimeout(int timeout) {
        this.reconnectTimeout = timeout;
    }

    /**
     * Get the current setting of maxium reconnects attempted automatically
     * before quitting.
     * 
     * @return number of reconnects to automatically attempt. Retry forever =
     *         -1.
     */
    public int getMaxAutoReconnectAttepts() {
        return maxAutoReconnectAttepts;
    }

    /**
     * Set the maxium reconnects attempted automatically before quitting.
     * 
     * @param attempts number of reconnects attempted automatically. Retry
     *            forever = -1.
     */
    public void setMaxAutoReconnectAttepts(int attempts) {
        if (attempts <= 0 && attempts != -1) {
            throw new IllegalArgumentException("Max reconnection attempts must be postive or -1");
        }
        maxAutoReconnectAttepts = attempts;
    }

    /**
     * Is the publish queue while offline feature enabled?
     * 
     * @return boolean if offline queueing is enabled.
     */
    public boolean isOfflinePublishQueueEnabled() {
        return offlinePublishQueueEnabled;
    }

    /**
     * Enable or disable offline publish queueing.
     * 
     * @param enabled boolean queueing feature is enabled.
     */
    public void setOfflinePublishQueueEnabled(boolean enabled) {
        offlinePublishQueueEnabled = enabled;
    }

    /**
     * Get the current value of the offline message queue bound.
     * 
     * @return max number of messages stored in the message queue.
     */
    public Integer getOfflinePublishQueueBound() {
        return offlinePublishQueueBound;
    }

    /**
     * Set the bound for the number of messages queued while offline. Note: When
     * full queue will act as FIFO and shed oldest messages.
     * 
     * @param bound max number of messages to queue while offline. Negative or 0
     *            values ignored.
     */
    public void setOfflinePublishQueueBound(Integer bound) {
        if (bound <= 0) {
            throw new IllegalArgumentException("Offline queue bound must be > 0");
        }
        offlinePublishQueueBound = bound;
    }

    /**
     * Get the MQTT keep alive time.
     * 
     * @return The MQTT keep alive time set by the user (in seconds).
     */
    public int getKeepAlive() {
        return userKeepAlive;
    }

    /**
     * Sets the MQTT keep alive time used by the underlying MQTT client to
     * determine connection status.
     * 
     * @param keepAlive the MQTT keep alive time set by the user (in seconds). A
     *            value of 0 disables keep alive.
     */
    public void setKeepAlive(int keepAlive) {
        if (keepAlive < 0) {
            throw new IllegalArgumentException("Keep alive must be >= 0");
        }
        userKeepAlive = keepAlive;
    }

    /**
     * Sets the MQTT client. Used for unit tests.
     * 
     * @param client - desired MQTT client.
     */
    void setMqttClient(MqttAsyncClient client) {
        mqttClient = client;
    }

    /**
     * Gets offline message queue. Used for unit tests.
     * 
     * @return offline message queue.
     */
    List<AWSIotMqttQueueMessage> getMqttMessageQueue() {
        return mqttMessageQueue;
    }

    /**
     * Constructs a new AWSIotMqttManager.
     *
     * @param mqttClientId MQTT client ID to use with this client.
     * @param region The AWS region to use when creating endpoint.
     * @param accountEndpointPrefix Customer specific endpont prefix XXXXXXX in
     *            XXXXXX.iot.[region].amazonaws.com.
     */
    public AWSIotMqttManager(String mqttClientId, Region region, String accountEndpointPrefix) {

        if (mqttClientId == null || mqttClientId.isEmpty()) {
            throw new IllegalArgumentException("mqttClientId is null or empty");
        }

        if (region == null) {
            throw new IllegalArgumentException("region is null");
        }

        if (accountEndpointPrefix == null) {
            throw new IllegalArgumentException("accountEndpointPrefix is null");
        }

        this.accountEndpointPrefix = accountEndpointPrefix;

        // Set client defaults
        autoReconnect = DEFAULT_AUTO_RECONNECT_ENABLED;
        reconnectTimeout = DEFAULT_RECONNECT_TIMEOUT_SECONDS;
        maxAutoReconnectAttepts = DEFAULT_AUTO_RECONNECT_ATTEMPTS;
        userKeepAlive = DEFAULT_KEEP_ALIVE_SECONDS;
        offlinePublishQueueEnabled = DEFAULT_OFFLINE_PUBLISH_QUEUE_ENABLED;
        offlinePublishQueueBound = DEFAULT_OFFLINE_PUBLISH_QUEUE_BOUND;

        String mqttBrokerURL = String.format("ssl://%s.iot.%s.%s:8883", accountEndpointPrefix,
                region.getName(), region.getDomain());

        try {
            mqttClient = new MqttAsyncClient(mqttBrokerURL, mqttClientId, new MemoryPersistence());
        } catch (MqttException e) {
            throw new AmazonClientException("Error creating MQTT Client.", e);
        }

        topicListeners = new HashMap<String, AWSIotMqttTopic>();
        mqttMessageQueue = new ArrayList<AWSIotMqttQueueMessage>();
    }

    /**
     * Initializes the MQTT session and connects to the specified MQTT server
     * using certificate and private key in keystore. Keystore should be created
     * using IotKeystoreHelper to setup the certificate and key aliases as
     * expected by the underlying socket helper library.
     *
     * @param keyStore A keystore containing an keystore with a certificate and
     *            private key. Use IotKeystoreHelper to get keystore.
     * @param statusCallback When new MQTT session status is received the
     *            function of callback will be called with new connection
     *            status.
     */
    public void connect(KeyStore keyStore, final AWSIotMqttClientStatusCallback statusCallback) {

        if (Build.VERSION.SDK_INT < ANDROID_API_LEVEL_16) {
            throw new UnsupportedOperationException(
                    "API Level 16+ required for TLS 1.2 Mutual Auth");
        }

        if (keyStore == null) {
            throw new IllegalArgumentException("keyStore is null");
        }

        try {
            SocketFactory socketFactory = AWSIotSslUtility.getSocketFactoryWithKeyStore(keyStore);
            connect(socketFactory, statusCallback);
        } catch (NoSuchAlgorithmException e) {
            throw new AWSIotCertificateException("A certificate error occurred.", e);
        } catch (KeyManagementException e) {
            throw new AWSIotCertificateException("A certificate error occurred.", e);
        } catch (KeyStoreException e) {
            throw new AWSIotCertificateException("A certificate error occurred.", e);
        } catch (UnrecoverableKeyException e) {
            throw new AWSIotCertificateException("A certificate error occurred.", e);
        }
    }

    /**
     * Connect to the MQTT service.
     *
     * @param socketFactory socket factory to used when creating a TLS socket
     *            for secure MQTT.
     * @param statusCallback callback for status updates on connection.
     */
    private void connect(SocketFactory socketFactory,
            final AWSIotMqttClientStatusCallback statusCallback) {

        if (mqttClient == null) {
            throw new IllegalStateException("MQTT Client is null");
        }

        if (mqttClient.isConnected()) {
            if (statusCallback != null) {
                statusCallback.onStatusChanged(
                        AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected, null);
                return;
            }
        }

        this.userStatusCallback = statusCallback;

        MqttConnectOptions options = new MqttConnectOptions();

        clientSocketFactory = socketFactory;
        options.setSocketFactory(clientSocketFactory);

        // AWS IoT does not currently support persistent sessions
        options.setCleanSession(true);
        needResubscribe = true; // when cleanSession is added, this should
                                // mirror cleanSession
        options.setKeepAliveInterval(userKeepAlive);

        topicListeners.clear();
        mqttMessageQueue.clear();

        setupCallbackForMqttClient();

        try {
            if (userStatusCallback != null) {
                userStatusCallback.onStatusChanged(
                        AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting, null);
            }
            mqttClient.connect(options, null, new IMqttActionListener() {
                @Override
                public void onSuccess(IMqttToken asyncActionToken) {
                    autoReconnectsAttempted = 0;
                    if (needResubscribe) {
                        resubscribeToTopics();
                    }
                    if (mqttMessageQueue.size() > 0) {
                        publishMessagesFromQueue();
                    }
                    if (userStatusCallback != null) {
                        userStatusCallback.onStatusChanged(
                                AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected,
                                null);
                    }
                }

                @Override
                public void onFailure(IMqttToken asyncActionToken, Throwable e) {
                    if (userStatusCallback != null) {
                        userStatusCallback
                                .onStatusChanged(
                                        AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.ConnectionLost,
                                        e);
                    }
                }
            });
        } catch (MqttException e) {
            if (userStatusCallback != null) {
                switch (e.getReasonCode()) {
                    case MqttException.REASON_CODE_CLIENT_CONNECTED:
                        userStatusCallback.onStatusChanged(
                                AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected,
                                null);
                        break;
                    case MqttException.REASON_CODE_CONNECT_IN_PROGRESS:
                        userStatusCallback.onStatusChanged(
                                AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connecting,
                                null);
                        break;
                    default:
                        userStatusCallback
                                .onStatusChanged(
                                        AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.ConnectionLost,
                                        e);
                        break;
                }
            } else {
                throw new AmazonClientException("Error connecting.", e);
            }
        }
    }

    /**
     * Disconnect from a mqtt client (close current MQTT session).
     *
     * @return true if disconnect finished with success.
     */
    public boolean disconnect() {
        userDisconnect = true;
        reset();
        return true;
    }

    /**
     * Disconnect the MQTT client. Issues a disconnect request if the client is
     * connected.
     */
    void reset() {
        if (null != mqttClient) {
            if (mqttClient.isConnected()) {
                try {
                    mqttClient.disconnect(0);
                } catch (MqttException e) {
                    throw new AmazonClientException("Client error when disconnecting.", e);
                }
            }
        }
    }

    /**
     * Reconnect to MQTT broker. Attempts to reconnect. If unsuccessful
     * continues to try at reconnect timeout interval.
     */
    void reconnectToSession() {

        if (null != mqttClient) {

            MqttConnectOptions options = new MqttConnectOptions();
            options.setSocketFactory(clientSocketFactory);

            options.setCleanSession(true);
            needResubscribe = true; // when cleanSession is added, this should
                                    // mirror cleanSession
            options.setKeepAliveInterval(userKeepAlive);

            setupCallbackForMqttClient();
            try {
                ++autoReconnectsAttempted;
                mqttClient.connect(options, null, new IMqttActionListener() {
                    @Override
                    public void onSuccess(IMqttToken asyncActionToken) {
                        autoReconnectsAttempted = 0;
                        if (needResubscribe) {
                            resubscribeToTopics();
                        }
                        if (mqttMessageQueue.size() > 0) {
                            publishMessagesFromQueue();
                        }
                        if (userStatusCallback != null) {
                            userStatusCallback
                                    .onStatusChanged(
                                            AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Connected,
                                            null);
                        }
                    }

                    @Override
                    public void onFailure(IMqttToken asyncActionToken, Throwable e) {
                        if (maxAutoReconnectAttepts == -1
                                || autoReconnectsAttempted < maxAutoReconnectAttepts) {
                            if (userStatusCallback != null) {
                                userStatusCallback
                                        .onStatusChanged(
                                                AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Reconnecting,
                                                null);
                            }
                            (new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    if (mqttClient != null && !mqttClient.isConnected()) {
                                        reconnectToSession();
                                    }
                                }
                            }, MILLIS_IN_ONE_SECOND * reconnectTimeout);
                        } else {
                            if (userStatusCallback != null) {
                                userStatusCallback
                                        .onStatusChanged(
                                                AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.ConnectionLost,
                                                e);
                            }
                        }
                    }
                });
            } catch (MqttException e) {
                if (userStatusCallback != null) {
                    userStatusCallback
                            .onStatusChanged(
                                    AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.ConnectionLost,
                                    e);
                }
                if (autoReconnect) {
                    if (userStatusCallback != null) {
                        userStatusCallback.onStatusChanged(
                                AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Reconnecting,
                                e);
                    }
                    (new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if (mqttClient != null && !mqttClient.isConnected()) {
                                reconnectToSession();
                            }
                        }
                    }, MILLIS_IN_ONE_SECOND * reconnectTimeout);
                }
            }
        }
    }

    /**
     * Subscribes to an MQTT topic.
     *
     * @param topic The topic to which to subscribe.
     * @param qos Quality of Service Level of the subscription.
     * @param callback Callback to be called when new message is received on
     *            this topic for this subscription.
     */
    public void subscribeToTopic(String topic, AWSIotMqttQos qos,
            AWSIotMqttNewMessageCallback callback) {

        if (topic == null || topic.isEmpty()) {
            throw new IllegalArgumentException("topic is null or empty");
        }

        if (qos == null) {
            throw new IllegalArgumentException("QoS cannot be null.");
        }

        if (null != mqttClient) {
            try {
                mqttClient.subscribe(topic, qos.asInt());
            } catch (MqttException e) {
                throw new AmazonClientException("Client error when subscribing.", e);
            }
            AWSIotMqttTopic topicModel = new AWSIotMqttTopic(topic, qos, callback);
            topicListeners.put(topic, topicModel);
        }
    }

    /**
     * Unsubscribe from an MQTT topic.
     *
     * @param topic topic from which to unsubscribe.
     */
    public void unsubscribeTopic(String topic) {

        if (topic == null || topic.isEmpty()) {
            throw new IllegalArgumentException("topic is null or empty");
        }

        if (mqttClient != null) {
            try {
                mqttClient.unsubscribe(topic);
            } catch (MqttException e) {
                throw new AmazonClientException("Client error while unsubscribing.", e);
            }
            topicListeners.remove(topic);
        }
    }

    /**
     * Resubscribe to previously subscribed topics on reconnecting.
     */
    void resubscribeToTopics() {
        needResubscribe = false;

        for (AWSIotMqttTopic topic : topicListeners.values()) {
            if (mqttClient != null) {
                try {
                    mqttClient.subscribe(topic.getTopic(), topic.getQos().asInt());
                } catch (MqttException e) {
                    Log.e(LOG_TAG, "Error while resubscribing to previously subscribed toipcs.", e);
                }
            }
        }
    }

    /**
     * Send a message to an MQTT topic.
     *
     * @param str The message payload to be sent (as a String).
     * @param topic The topic on which to publish.
     * @param qos The quality of service requested for this message.
     */
    public void publishString(String str, String topic, AWSIotMqttQos qos) {

        if (str == null) {
            throw new IllegalArgumentException("publish string is null");
        }

        if (topic == null || topic.isEmpty()) {
            throw new IllegalArgumentException("topic is null or empty");
        }

        if (qos == null) {
            throw new IllegalArgumentException("QoS cannot be null");
        }

        publishData(str.getBytes(), topic, qos);
    }

    /**
     * Publish data to an MQTT topic.
     *
     * @param data The message payload to be sent as a byte array.
     * @param topic The topic on which to publish.
     * @param qos The quality of service requested for this message.
     */
    public void publishData(byte[] data, String topic, AWSIotMqttQos qos) {

        if (topic == null || topic.isEmpty()) {
            throw new IllegalArgumentException("topic is null or empty");
        }

        if (data == null) {
            throw new IllegalArgumentException("data is null");
        }

        if (qos == null) {
            throw new IllegalArgumentException("QoS cannot be null");
        }

        if (isReadyToPublish()) {
            try {
                mqttClient.publish(topic, data, qos.asInt(), false);
            } catch (MqttException e) {
                throw new AmazonClientException("Client error while publishing.", e);
            }
        } else {
            if (offlinePublishQueueEnabled) {
                putMessageInQueue(data, topic, qos);
            }
        }
    }

    /**
     * Add a message to the publishing queue. A publish call adds to the queue
     * if the client is unable to publish (offline).
     * 
     * @param data byte array of message payload.
     * @param topic message topic.
     * @param qos The quality of service requested for this message.
     */
    void putMessageInQueue(byte[] data, String topic, AWSIotMqttQos qos) {
        AWSIotMqttQueueMessage message = new AWSIotMqttQueueMessage(topic, data, qos);
        message.setTopic(topic);
        message.setMessage(data);

        if (mqttMessageQueue.size() >= offlinePublishQueueBound) {
            mqttMessageQueue.remove(0);
        }

        mqttMessageQueue.add(message);
    }

    /**
     * Publish messages from the message queue. Called to handle publishing
     * messages accumulated in the message queue when the client was unable to
     * publish.
     */
    void publishMessagesFromQueue() {
        if (mqttMessageQueue != null && mqttMessageQueue.size() > 0) {
            final AWSIotMqttQueueMessage message = mqttMessageQueue.get(0);
            if (message != null && isReadyToPublish()) {
                try {
                    mqttClient.publish(message.getTopic(), message.getMessage(), message.getQos()
                            .asInt(), false);
                    mqttMessageQueue.remove(0);
                } catch (MqttException e) {
                    Log.e(LOG_TAG, "Error while publishing from offline message queue.", e);
                }
            }

            (new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {
                @Override
                public void run() {
                    if (mqttMessageQueue.size() > 0) {
                        if (isReadyToPublish()) {
                            publishMessagesFromQueue();
                        }
                    }
                }
            }, MILLIS_BETWEEN_QUEUE_PUBLISHES);
        }
    }

    /**
     * Setup the MQTT client calbacks. The Paho MQTT client exposes callbacks
     * for connection status, publish status and incoming messages. The Android
     * MQTT client uses the single incoming message callback to map to per-topic
     * callbacks.
     */
    void setupCallbackForMqttClient() {
        mqttClient.setCallback(new MqttCallback() {
            @Override
            public void connectionLost(Throwable cause) {
                if (!userDisconnect && autoReconnect) {
                    if (userStatusCallback != null) {
                        userStatusCallback.onStatusChanged(
                                AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.Reconnecting,
                                null);
                    }
                    reconnectToSession();
                } else {
                    if (userStatusCallback != null) {
                        userStatusCallback
                                .onStatusChanged(
                                        AWSIotMqttClientStatusCallback.AWSIotMqttClientStatus.ConnectionLost,
                                        cause);
                    }
                }
            }

            @Override
            public void messageArrived(String topic, MqttMessage mqttMessage) throws Exception {
                byte[] data = mqttMessage.getPayload();

                for (String topicKey : topicListeners.keySet()) {
                    if (isTopicMatch(topicKey, topic)) {
                        AWSIotMqttTopic topicModel = topicListeners.get(topicKey);
                        if (topicModel != null) {
                            if (topicModel.getCallback() != null) {
                                topicModel.getCallback().onMessageArrived(topic, data);
                            }
                        }
                    }
                }
            }

            @Override
            public void deliveryComplete(IMqttDeliveryToken token) {

            }
        });
    }

    /**
     * Is the MQTT client ready to publish messages? (Created and connected).
     * 
     * @return true equals ready to publish, false equals offline.
     */
    boolean isReadyToPublish() {
        return mqttClient != null && mqttClient.isConnected();
    }

    /**
     * Does the topic match the topic filter?
     * 
     * @param topicFilter MQTT topic filter (subscriptions, including
     *            wildcards).
     * @param topic - the aboslute topic (no wildcards) on which a message was
     *            published.
     * @return true if the topic matches the filter, false otherwise.
     */
    static boolean isTopicMatch(String topicFilter, String topic) {
        String[] topicFilterTokens = topicFilter.split("/");
        String[] topicTokens = topic.split("/");

        if (topicFilterTokens.length > topicTokens.length) {
            return false;
        }

        for (int i = 0; i < topicFilterTokens.length; i++) {
            String topicFilterToken = topicFilterTokens[i];
            String topicToken = topicTokens[i];

            // we're equal up to this point, the # matches all that is left
            if (topicFilterToken.equals("#")) {
                return true;
            }

            // if the filter has a +, go to the next token
            // if the filter token matches the topic token, go to the next token
            // if neither are true then we've discovered a mismatch
            if (!topicFilterToken.equals("+") && !topicFilterToken.equals(topicToken)) {
                return false;
            }
        }

        // if we're here the strings matched token-for-token (including any
        // '+'s)
        // and we have reached the end of the topic filter
        // we have a match unless there are more tokens left in the topic
        // if we have filter 1/2/3 then:
        // 1/2/3 matches
        // 1/2/3/4 does not match
        //
        // if we have filter 1/2/+ then:
        // 1/2/3 matches
        // 1/2/3/4 does not match
        //
        // we already know the filter can't be longer than the topic (from
        // above)
        return (topicFilterTokens.length == topicTokens.length);
    }
}
