
package com.amazonaws.mobileconnectors.iot;

import org.eclipse.paho.client.mqttv3.*;

import java.util.HashMap;

public class MockMqttClient extends MqttAsyncClient {
    public int connectCalls = 0;
    public int publishCalls = 0;
    public int subscribeCalls = 0;
    public int unsubscribeCalls = 0;
    public int disconnectCalls = 0;
    public MqttConnectOptions mostRecentOptions;
    public String mostRecentPublishTopic;
    public byte[] mostRecentPublishPayload;
    public int mostRecentPublishQoS;
    public boolean mostRecentPublishRetained;
    public Object mostRecentPublishUserContext;
    public IMqttActionListener mostRecentPublishCallback;
    public boolean isConnected;
    public MqttCallback mockCallback;
    public IMqttActionListener mockConnectionStatusCallback;
    public boolean throwsExceptionOnConnect;
    public MqttException connectException;
    public boolean throwsExceptionOnPublish;
    public boolean throwsExceptionOnSubscribe;
    public boolean throwsExceptionOnUnsubscribe;
    public boolean throwsExceptionOnDisconnect;

    public HashMap<String, Integer> mockSubscriptions;

    IMqttToken testToken = new MqttToken("unit-test");
    IMqttDeliveryToken testDeliveryToken = new MqttDeliveryToken();

    MockMqttClient() throws MqttException {
        super("local://mockendpoint.example.com", "mock-id");
        mockSubscriptions = new HashMap<String, Integer>();
        isConnected = false;
        throwsExceptionOnConnect = false;
        connectException = null;
        throwsExceptionOnPublish = false;
        throwsExceptionOnSubscribe = false;
        throwsExceptionOnUnsubscribe = false;
        throwsExceptionOnDisconnect = false;
    }

    public IMqttToken connect(MqttConnectOptions options, Object userContext,
            IMqttActionListener callback) throws MqttException, MqttSecurityException {
        if (throwsExceptionOnConnect && connectException != null) {
            throw connectException;
        }
        ++connectCalls;
        mostRecentOptions = options;
        mockConnectionStatusCallback = callback;
        return testToken;
    }

    public IMqttToken disconnect(long quiesceTimeout) throws MqttException {
        if (throwsExceptionOnDisconnect) {
            throw new MqttException(MqttException.REASON_CODE_CLIENT_EXCEPTION);
        }
        ++disconnectCalls;
        return testToken;
    }

    public IMqttDeliveryToken publish(String topic, byte[] payload, int qos, boolean retained)
            throws MqttException {
        if (throwsExceptionOnPublish) {
            throw new MqttException(MqttException.REASON_CODE_CLIENT_EXCEPTION);
        }
        ++publishCalls;
        mostRecentPublishTopic = topic;
        mostRecentPublishPayload = payload;
        mostRecentPublishQoS = qos;
        mostRecentPublishRetained = retained;
        return testDeliveryToken;
    }

    public IMqttDeliveryToken publish(String topic, byte[] payload, int qos, boolean retained,
            Object userContext, IMqttActionListener callback)
            throws MqttException {
        if (throwsExceptionOnPublish) {
            throw new MqttException(MqttException.REASON_CODE_CLIENT_EXCEPTION);
        }
        ++publishCalls;
        mostRecentPublishTopic = topic;
        mostRecentPublishPayload = payload;
        mostRecentPublishQoS = qos;
        mostRecentPublishRetained = retained;
        mostRecentPublishUserContext = userContext;
        mostRecentPublishCallback = callback;
        return testDeliveryToken;
    }

    public IMqttToken subscribe(String topicFilter, int qos) throws MqttException {
        if (throwsExceptionOnSubscribe) {
            throw new MqttException(MqttException.REASON_CODE_CLIENT_EXCEPTION);
        }
        ++subscribeCalls;
        mockSubscriptions.put(topicFilter, qos);
        return testToken;
    }

    public IMqttToken unsubscribe(String topicFilter) throws MqttException {
        if (throwsExceptionOnUnsubscribe) {
            throw new MqttException(MqttException.REASON_CODE_CLIENT_EXCEPTION);
        }
        ++unsubscribeCalls;
        mockSubscriptions.remove(topicFilter);
        return testToken;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setCallback(MqttCallback callback) {
        mockCallback = callback;
    }

    public void mockConnectSuccess() {
        mockConnectionStatusCallback.onSuccess(testToken);
        isConnected = true;
    }

    public void mockConnectFail() {
        mockConnectionStatusCallback.onFailure(testToken, new Exception("fail"));
        isConnected = false;
    }

    public void mockDisconnect() {
        isConnected = false;
        mockCallback.connectionLost(new Exception("disconnect"));
    }
}
