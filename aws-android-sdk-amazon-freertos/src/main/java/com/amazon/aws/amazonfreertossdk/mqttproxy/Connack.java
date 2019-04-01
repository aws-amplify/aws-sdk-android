package com.amazon.aws.amazonfreertossdk.mqttproxy;

import android.util.Log;

import java.io.ByteArrayOutputStream;

import co.nstant.in.cbor.CborBuilder;
import co.nstant.in.cbor.CborEncoder;
import co.nstant.in.cbor.CborException;

/**
 * This class represents the MQTT CONNACK message.
 */
public class Connack {
    private static final String TAG = "MqttConnack";

    private static final String TYPE_KEY = "w";
    private static final String STATUS_KEY = "s";
    /**
     * MQTT message type.
     */
    public int type;
    /**
     * The MQTT connection status defined in {@code MqttConnectionState} enum.
     */
    public int status;

    public byte[] encode() {
        byte[] connackBytes = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            new CborEncoder(baos).encode(new CborBuilder()
                .addMap()
                .put(TYPE_KEY, type)
                .put(STATUS_KEY, status)
                .end()
                .build());
            connackBytes = baos.toByteArray();
        } catch (CborException e) {
            Log.e(TAG, "Failed to encode.", e);
        }
        return connackBytes;
    }
}
