package com.amazon.aws.amazonfreertossdk.networkconfig;

import android.util.Log;

import java.io.ByteArrayOutputStream;

import co.nstant.in.cbor.CborBuilder;
import co.nstant.in.cbor.CborEncoder;
import co.nstant.in.cbor.CborException;

/**
 * Save network request.
 */
public class SaveNetworkReq {
    /**
     * SSID of the network to be saved.
     */
    public String ssid;
    /**
     * BSSID of the network to be saved.
     */
    public byte[] bssid;
    /**
     * Password of the network to be saved.
     */
    public String psk;
    /**
     * Network security type.
     */
    public int security;
    /**
     * Current index of the network to be saved.
     */
    public int index;

    private static final String TAG = "SaveNetworkRequest";
    private static final String INDEX_KEY = "g";
    private static final String SSID_KEY = "r";
    private static final String BSSID_KEY = "b";
    private static final String PSK_KEY = "m";
    private static final String SECURITY_KEY = "q";

    public byte[] encode() {
        byte[] SaveNetworkRequestBytes = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            new CborEncoder(baos).encode(new CborBuilder()
                    .addMap()
                    .put(INDEX_KEY, index)
                    .put(SSID_KEY, ssid)
                    .put(BSSID_KEY, bssid)
                    .put(PSK_KEY, psk)
                    .put(SECURITY_KEY, security)
                    .end()
                    .build());
            SaveNetworkRequestBytes = baos.toByteArray();
        } catch (CborException e) {
            Log.e(TAG, "Failed to encode.", e);
        }
        return SaveNetworkRequestBytes;
    }
}
