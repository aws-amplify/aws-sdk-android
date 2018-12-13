package com.amazonaws.mobileconnectors.iot;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttToken;
import org.eclipse.paho.client.mqttv3.internal.Token;

public class MockDeliveryToken extends MqttToken implements IMqttDeliveryToken {

    public MockDeliveryToken() {
        super();
        internalTok = new Token("unittest");
    }

    public MqttMessage getMessage() throws MqttException {
        return internalTok.getMessage();
    }

    protected void setMessage(MqttMessage msg) {
        internalTok.setMessage(msg);
    }
}
