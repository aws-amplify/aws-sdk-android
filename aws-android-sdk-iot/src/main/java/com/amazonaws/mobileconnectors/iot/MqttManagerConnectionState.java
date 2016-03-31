package com.amazonaws.mobileconnectors.iot;

/**
 * Possible connection states for MQTT connection of MqttManager.
 */
enum MqttManagerConnectionState {
    /**
     * Client is attempting to connect.
     */
    Connecting,
    /**
     * Client successfully connected.
     */
    Connected,
    /**
     * Not connected.
     */
    Disconnected,
    /**
     * Automatically reconnecting after connection loss.
     */
    Reconnecting
}
