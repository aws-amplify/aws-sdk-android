package com.amazon.aws.amazonfreertossdk.networkconfig;

import android.util.Log;

import java.io.ByteArrayOutputStream;

import co.nstant.in.cbor.CborBuilder;
import co.nstant.in.cbor.CborEncoder;
import co.nstant.in.cbor.CborException;

/**
 * Edit network request
 */
public class EditNetworkReq {
    /**
     * The index of the saved network to be edited.
     */
    public int index;
    /**
     * The new index of the saved network. Must be one of the existing indices of saved networks.
     */
    public int newIndex;

    private static final String TAG = "EditNetworkRequest";
    private static final String INDEX_KEY = "g";
    private static final String NEWINDEX_KEY = "j";

    public byte[] encode() {
        byte[] EditNetworkRequestBytes = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            new CborEncoder(baos).encode(new CborBuilder()
                    .addMap()
                    .put(INDEX_KEY, index)
                    .put(NEWINDEX_KEY, newIndex)
                    .end()
                    .build());
            EditNetworkRequestBytes = baos.toByteArray();
        } catch (CborException e) {
            Log.e(TAG, "Failed to encode.", e);
        }
        return EditNetworkRequestBytes;
    }
}
