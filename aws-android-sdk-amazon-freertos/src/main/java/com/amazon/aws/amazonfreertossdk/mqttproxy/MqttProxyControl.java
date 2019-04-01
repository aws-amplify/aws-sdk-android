package com.amazon.aws.amazonfreertossdk.mqttproxy;

import android.util.Log;

import java.io.ByteArrayOutputStream;

import co.nstant.in.cbor.CborBuilder;
import co.nstant.in.cbor.CborEncoder;
import co.nstant.in.cbor.CborException;

/**
 * This class represents the MQTT proxy state. SDK sends this object to device to switch on/off
 * MQTT proxy.
 */
public class MqttProxyControl {
    private static final String TAG = "MqttProxyControl";
    private static final String PROXYSTATE_KEY = "l";
    /**
     * The state of MQTT proxy.
     */
    public int proxyState;

    public byte[] encode() {
        byte[] mqttProxyControlBytes = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            new CborEncoder(baos).encode(new CborBuilder()
                    .addMap()
                    .put(PROXYSTATE_KEY, proxyState)
                    .end()
                    .build());
            mqttProxyControlBytes = baos.toByteArray();
        } catch (CborException e) {
            Log.e(TAG, "Failed to encode.", e);
        }
        return mqttProxyControlBytes;
    }
}
