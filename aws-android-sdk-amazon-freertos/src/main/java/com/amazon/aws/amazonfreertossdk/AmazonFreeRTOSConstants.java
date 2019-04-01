package com.amazon.aws.amazonfreertossdk;

import java.util.HashMap;
import java.util.Map;

/**
 * This class defines some constants used in the SDK.
 */
public class AmazonFreeRTOSConstants {
    public static final String AMAZONFREERTOS_SDK_VERSION = "0.9.3";

    /**
     * Network security types.
     */
    public static final int NETWORK_SECURITY_TYPE_OPEN = 0;
    public static final int NETWORK_SECURITY_TYPE_WEP = 1;
    public static final int NETWORK_SECURITY_TYPE_WPA = 2;
    public static final int NETWORK_SECURITY_TYPE_WPA2 = 3;
    public static final int NETWORK_SECURITY_TYPE_NOT_SUPPORTED = 4;

    /**
     * MQTT proxy state.
     */
    public static final int MQTT_PROXY_CONTROL_OFF = 0;
    public static final int MQTT_PROXY_CONTROL_ON = 1;

    /**
     * MQTT message type.
     */
    public static final int MQTT_MSG_CONNECT = 1;
    public static final int MQTT_MSG_CONNACK = 2;
    public static final int MQTT_MSG_PUBLISH = 3;
    public static final int MQTT_MSG_PUBACK = 4;
    public static final int MQTT_MSG_PUBREC = 5;
    public static final int MQTT_MSG_PUBREL = 6;
    public static final int MQTT_MSG_PUBCOMP = 7;
    public static final int MQTT_MSG_SUBSCRIBE = 8;
    public static final int MQTT_MSG_SUBACK = 9;
    public static final int MQTT_MSG_UNSUBSCRIBE = 10;
    public static final int MQTT_MSG_UNSUBACK = 11;
    public static final int MQTT_MSG_PINGREQ = 12;
    public static final int MQTT_MSG_PINGRESP = 13;
    public static final int MQTT_MSG_DISCONNECT = 14;

    /**
     * Bluetooth connection state. This is matching with BluetoothProfile in the Android SDK.
     */
    public enum BleConnectionState {
        BLE_DISCONNECTED, // = 0
        BLE_CONNECTING,   // = 1
        BLE_CONNECTED,    // = 2
        BLE_DISCONNECTING // = 3
    }

    /**
     * The MQTT connection state.
     * Do not change the order of this enum. This is a contract between device library and our sdk.
     */
    public enum MqttConnectionState {
        MQTT_Unknown,
        MQTT_Connecting,
        MQTT_Connected,
        MQTT_Disconnected,
        MQTT_ConnectionRefused,
        MQTT_ConnectionError,
        MQTT_ProtocolError
    }

    /**
     * This defines how much time the SDK scans for nearby BLE devices.
     */
    public static final long SCAN_PERIOD = 20000; //ms

    /**
     * After sending BLE commands to device, the SDK will wait for this amount of time, after which
     * it will time out and continue to process the next BLE command.
     */
    public static final int BLE_COMMAND_TIMEOUT = 3000; //ms

    public static final String UUID_AmazonFreeRTOS = "8a7f1168-48af-4efb-83b5-e679f932ff00";
    public static final String UUID_NETWORK_SERVICE = "3113a187-4b9f-4f9a-aa83-c614e11bff00";
    public static final String UUID_LIST_NETWORK_CHARACTERISTIC = "3113a187-4b9f-4f9a-aa83-c614e11bff01";
    public static final String UUID_SAVE_NETWORK_CHARACTERISTIC = "3113a187-4b9f-4f9a-aa83-c614e11bff02";
    public static final String UUID_EDIT_NETWORK_CHARACTERISTIC = "3113a187-4b9f-4f9a-aa83-c614e11bff03";
    public static final String UUID_DELETE_NETWORK_CHARACTERISTIC = "3113a187-4b9f-4f9a-aa83-c614e11bff04";

    public static final String UUID_MQTT_PROXY_SERVICE = "a9d7166a-d72e-40a9-a002-48044cc3ff00";
    public static final String UUID_MQTT_PROXY_CONTROL_CHARACTERISTIC = "a9d7166a-d72e-40a9-a002-48044cc3ff01";
    public static final String UUID_MQTT_PROXY_TX_CHARACTERISTIC = "a9d7166a-d72e-40a9-a002-48044cc3ff02";
    public static final String UUID_MQTT_PROXY_RX_CHARACTERISTIC = "a9d7166a-d72e-40a9-a002-48044cc3ff03";
    public static final String UUID_MQTT_PROXY_TXLARGE_CHARACTERISTIC = "a9d7166a-d72e-40a9-a002-48044cc3ff04";
    public static final String UUID_MQTT_PROXY_RXLARGE_CHARACTERISTIC = "a9d7166a-d72e-40a9-a002-48044cc3ff05";

    public static final String UUID_DEVICE_INFORMATION_SERVICE = "8a7f1168-48af-4efb-83b5-e679f932ff00";
    public static final String UUID_DEVICE_VERSION_CHARACTERISTIC = "8a7f1168-48af-4efb-83b5-e679f932ff01";
    public static final String UUID_IOT_ENDPOINT_CHARACTERISTIC = "8a7f1168-48af-4efb-83b5-e679f932ff02";
    public static final String UUID_DEVICE_MTU_CHARACTERISTIC = "8a7f1168-48af-4efb-83b5-e679f932ff03";

    public static final Map<String, String> uuidToName = new HashMap<String, String>() {
        {
            put(UUID_LIST_NETWORK_CHARACTERISTIC, "LIST_NETWORK");
            put(UUID_EDIT_NETWORK_CHARACTERISTIC, "EDIT_NETWORK");
            put(UUID_SAVE_NETWORK_CHARACTERISTIC, "SAVE_NETWORK");
            put(UUID_DELETE_NETWORK_CHARACTERISTIC, "DELETE_NETWORK");
            put(UUID_MQTT_PROXY_CONTROL_CHARACTERISTIC, "MQTT_CONTROL");
            put(UUID_MQTT_PROXY_TX_CHARACTERISTIC, "MQTT_TX");
            put(UUID_MQTT_PROXY_TXLARGE_CHARACTERISTIC, "MQTT_TXLARGE");
            put(UUID_MQTT_PROXY_RX_CHARACTERISTIC, "MQTT_RX");
            put(UUID_MQTT_PROXY_RXLARGE_CHARACTERISTIC, "MQTT_RXLARGE");
            put(UUID_DEVICE_VERSION_CHARACTERISTIC, "DEVICE_VERSION");
            put(UUID_IOT_ENDPOINT_CHARACTERISTIC, "IOT_ENDPOINT");
            put(UUID_DEVICE_MTU_CHARACTERISTIC, "DEVICE_MTU");
        }
    };

}
