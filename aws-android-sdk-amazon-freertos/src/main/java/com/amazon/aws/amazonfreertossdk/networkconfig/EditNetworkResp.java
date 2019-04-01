package com.amazon.aws.amazonfreertossdk.networkconfig;

import android.util.Log;

import java.io.ByteArrayInputStream;
import java.util.List;

import co.nstant.in.cbor.CborDecoder;
import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.model.DataItem;
import co.nstant.in.cbor.model.Map;
import co.nstant.in.cbor.model.UnicodeString;
import co.nstant.in.cbor.model.UnsignedInteger;

/**
 * Edit network response
 */
public class EditNetworkResp {
    /**
     * Status of the operation. 0 for success.
     */
    int status;
    public String toString() {
        return String.format("EditNetworkResponse ->\n status: %d", status);
    }

    private static final String TAG = "EditNetworkResponse";
    private static final String STATUS_KEY = "s";

    public boolean decode(byte[] cborEncodedBytes) {
        ByteArrayInputStream bais = new ByteArrayInputStream(cborEncodedBytes);
        try {
            List<DataItem> dataItems = new CborDecoder(bais).decode();
            // process data item
            Map map = (Map) dataItems.get(0);
            DataItem dataItem = map.get(new UnicodeString(STATUS_KEY));
            status = ((UnsignedInteger) dataItem).getValue().intValue();
            return true;
        } catch (CborException e) {
            Log.e(TAG,"Failed to decode.", e);
            return false;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }
}
