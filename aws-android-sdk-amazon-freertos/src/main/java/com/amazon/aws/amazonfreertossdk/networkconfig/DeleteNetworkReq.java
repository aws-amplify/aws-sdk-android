package com.amazon.aws.amazonfreertossdk.networkconfig;

import android.util.Log;

import java.io.ByteArrayOutputStream;

import co.nstant.in.cbor.CborBuilder;
import co.nstant.in.cbor.CborEncoder;
import co.nstant.in.cbor.CborException;

/**
 * Delete network request.
 */
public class DeleteNetworkReq {
    /**
     * The index of the saved network to be deleted.
     */
    public int index;

    private static final String TAG = "DeleteNetworkRequest";
    private static final String INDEX_KEY = "g";

    public byte[] encode() {
        byte[] DeleteNetworkRequestBytes = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            new CborEncoder(baos).encode(new CborBuilder()
                    .addMap()
                    .put(INDEX_KEY, index)
                    .end()
                    .build());
            DeleteNetworkRequestBytes = baos.toByteArray();
        } catch (CborException e) {
            Log.e(TAG, "Failed to encode.", e);
        }
        return DeleteNetworkRequestBytes;
    }
}
