package com.amazon.aws.amazonfreertossdk.networkconfig;

import android.util.Log;

import java.io.ByteArrayOutputStream;

import co.nstant.in.cbor.CborBuilder;
import co.nstant.in.cbor.CborEncoder;
import co.nstant.in.cbor.CborException;

/**
 * List network request
 */
public class ListNetworkReq {
    /**
     * Maximum total number of networks to return.
     */
    public int maxNetworks;
    /**
     * Time in seconds for BLE device to scan available networks.
     */
    public int timeout;

    private static final String TAG = "ListNetworkRequest";
    private static final String MAXNETWORKS_KEY = "h";
    private static final String TIMEOUT_KEY = "t";

    public byte[] encode() {
        byte[] ListNetworkRequestBytes = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            new CborEncoder(baos).encode(new CborBuilder()
                    .addMap()
                    .put(MAXNETWORKS_KEY, maxNetworks)
                    .put(TIMEOUT_KEY, timeout)
                    .end()
                    .build());
            ListNetworkRequestBytes = baos.toByteArray();
        } catch (CborException e) {
            Log.e(TAG, "Failed to encode.", e);
        }
        return ListNetworkRequestBytes;
    }
}
