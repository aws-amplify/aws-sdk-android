package com.amazon.aws.amazonfreertossdk.networkconfig;

import android.text.method.HideReturnsTransformationMethod;
import android.util.Log;

import java.io.ByteArrayInputStream;
import java.util.List;

import co.nstant.in.cbor.CborDecoder;
import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.model.Array;
import co.nstant.in.cbor.model.ByteString;
import co.nstant.in.cbor.model.DataItem;
import co.nstant.in.cbor.model.Map;
import co.nstant.in.cbor.model.NegativeInteger;
import co.nstant.in.cbor.model.Number;
import co.nstant.in.cbor.model.SimpleValue;
import co.nstant.in.cbor.model.SimpleValueType;
import co.nstant.in.cbor.model.UnicodeString;
import co.nstant.in.cbor.model.UnsignedInteger;
import lombok.Getter;

/**
 * List network response
 */
@Getter
public class ListNetworkResp {
    private static final String TAG = "ListNetworkResponse";
    private static final String STATUS_KEY = "s";
    private static final String SSID_KEY = "r";
    private static final String BSSID_KEY = "b";
    private static final String SECURITY_KEY = "q";
    private static final String HIDDEN_KEY = "f";
    private static final String RSSI_KEY = "p";
    private static final String CONNECTED_KEY = "e";
    private static final String INDEX_KEY = "g";
    /**
     * Status of the operation. 0 for success.
     */
    private int status;
    /**
     * SSID of the scanned network.
     */
    private String ssid;
    /**
     * BSSID of the scanned network.
     */
    private byte[] bssid;
    /**
     * Network security type.
     */
    private int security;
    /**
     * Whether the network is hidden.
     */
    private Boolean hidden;
    /**
     * RSSI value of the scanned network.
     */
    private int rssi;
    /**
     * Whether BLE device is connected to this network.
     */
    private Boolean connected;
    /**
     * The index of this network. Index is used to indicate the connection preference of each saved
     * network. For non-saved networks, the index is negative.
     */
    private int index;

    public String toString() {
        return String.format("List network response -> Status: %d ssid: %s bssid: %s security: %d hidden: %s" +
                        " rssi: %d connected: %s index: %d", status, ssid, new String(bssid), security,
                hidden ? "true":"false", rssi, connected ? "true":"false", index);
    }

    public boolean decode(byte[] cborEncodedBytes) {
        ByteArrayInputStream bais = new ByteArrayInputStream(cborEncodedBytes);
        try {
            List<DataItem> dataItems = new CborDecoder(bais).decode();
            // process data item
            Map map = (Map) dataItems.get(0);
            DataItem dataItem = map.get(new UnicodeString(STATUS_KEY));
            status = ((UnsignedInteger) dataItem).getValue().intValue();
            dataItem = map.get(new UnicodeString(SSID_KEY));
            ssid = ((UnicodeString) dataItem).getString();
            dataItem = map.get(new UnicodeString(BSSID_KEY));
            bssid = ((ByteString) dataItem).getBytes();
            dataItem = map.get(new UnicodeString(SECURITY_KEY));
            security = ((UnsignedInteger) dataItem).getValue().intValue();
            dataItem = map.get(new UnicodeString(HIDDEN_KEY));
            hidden = (((SimpleValue) dataItem).getSimpleValueType() == SimpleValueType.TRUE) ? true : false;
            dataItem = map.get(new UnicodeString(RSSI_KEY));
            rssi = ((NegativeInteger) dataItem).getValue().intValue();
            dataItem = map.get(new UnicodeString(CONNECTED_KEY));
            connected = (((SimpleValue) dataItem).getSimpleValueType() == SimpleValueType.TRUE) ? true : false;
            dataItem = map.get(new UnicodeString(INDEX_KEY));
            index = ((Number) dataItem).getValue().intValue();
            return true;
        } catch (CborException e) {
            Log.e(TAG,"Failed to decode.", e);
            return false;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }
}
