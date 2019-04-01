package com.amazon.aws.amazonfreertossdk.mqttproxy;

import android.util.Log;

import java.io.ByteArrayOutputStream;

import co.nstant.in.cbor.CborBuilder;
import co.nstant.in.cbor.CborEncoder;
import co.nstant.in.cbor.CborException;

/**
 * This class represents the MQTT UNSUBACK message.
 */
public class Unsuback {
    private static final String TAG = "MqttUnsubscribe";
    private static final String TYPE_KEY = "w";
    private static final String MSGID_KEY = "i";
    /**
     * MQTT message type.
     */
    public int type;
    /**
     * MQTT message ID.
     */
    public int msgID;

    public byte[] encode() {
        byte[] unsubackBytes = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            new CborEncoder(baos).encode(new CborBuilder()
                    .addMap()
                    .put(TYPE_KEY, type)
                    .put(MSGID_KEY, msgID)
                    .end()
                    .build());
            unsubackBytes = baos.toByteArray();
        } catch (CborException e) {
            Log.e(TAG, "Failed to encode.", e);
        }
        return unsubackBytes;
    }
}
