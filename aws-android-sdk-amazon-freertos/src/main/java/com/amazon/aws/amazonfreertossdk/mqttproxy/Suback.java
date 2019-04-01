package com.amazon.aws.amazonfreertossdk.mqttproxy;

import android.util.Log;

import java.io.ByteArrayOutputStream;

import co.nstant.in.cbor.CborBuilder;
import co.nstant.in.cbor.CborEncoder;
import co.nstant.in.cbor.CborException;

/**
 * This class represents the MQTT SUBACK message.
 */
public class Suback {
    private static final String TAG = "MqttSuback";
    private static final String TYPE_KEY = "w";
    private static final String MSGID_KEY = "i";
    private static final String STATUS_KEY = "s";
    /**
     * MQTT message type.
     */
    public int type;
    /**
     * MQTT message ID.
     */
    public int msgID;
    /**
     * MQTT SUBACK status. This is set to the QOS number in the corresponding MQTT SUBSCRIBE
     * message, to which this SUBACK is acknowledging.
     */
    public int status;

    public byte[] encode() {
        byte[] subackBytes = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            new CborEncoder(baos).encode(new CborBuilder()
                .addMap()
                .put(TYPE_KEY, type)
                .put(MSGID_KEY, msgID)
                .put(STATUS_KEY, status)
                .end()
                .build());
            subackBytes = baos.toByteArray();
        } catch (CborException e) {
            Log.e(TAG, "Failed to encode.", e);
        }
        return subackBytes;
    }
}
