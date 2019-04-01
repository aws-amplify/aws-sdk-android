package com.amazon.aws.amazonfreertossdk.mqttproxy;

import android.util.Log;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

import co.nstant.in.cbor.CborBuilder;
import co.nstant.in.cbor.CborDecoder;
import co.nstant.in.cbor.CborEncoder;
import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.model.DataItem;
import co.nstant.in.cbor.model.Map;
import co.nstant.in.cbor.model.SimpleValue;
import co.nstant.in.cbor.model.SimpleValueType;
import co.nstant.in.cbor.model.UnicodeString;
import co.nstant.in.cbor.model.UnsignedInteger;

/**
 * This class represents the MQTT CONNECT message.
 */
public class Connect {
    private static final String TAG = "MqttConnect";
    private static final String TYPE_KEY = "w";
    private static final String CLIENTID_KEY = "d";
    private static final String BROKERENDPOINT_KEY = "a";
    private static final String CLEANSESSION_KEY = "c";
    /**
     * MQTT message type.
     */
    public int type;
    /**
     * MQTT client id.
     */
    public String clientID;
    /**
     * MQTT broker endpoint.
     */
    public String brokerEndpoint;
    /**
     * MQTT clean session.
     */
    public boolean cleanSession;
    public String toString() {
        return String.format(" Connect message -> \n clientID: %s\n endpoint: %s\n cleansession: %s",
                clientID, brokerEndpoint, (cleanSession? "true":"false") );
    }

    public byte[] encode() {
        byte[] connectBytes = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            new CborEncoder(baos).encode(new CborBuilder()
                .addMap()
                .put(TYPE_KEY, type)
                .put(CLIENTID_KEY, clientID)
                .put(BROKERENDPOINT_KEY, brokerEndpoint)
                .put(CLEANSESSION_KEY, cleanSession)
                .end()
                .build());
            connectBytes = baos.toByteArray();
        } catch (CborException e) {
            Log.e(TAG, "Failed to encode.", e);
        }
        return connectBytes;
    }

    public boolean decode(byte[] cborEncodedBytes) {
        ByteArrayInputStream bais = new ByteArrayInputStream(cborEncodedBytes);
        try {
            List<DataItem> dataItems = new CborDecoder(bais).decode();
            // process data item
            Map map = (Map) dataItems.get(0);
            DataItem dataItem = map.get(new UnicodeString(TYPE_KEY));
            type = ((UnsignedInteger) dataItem).getValue().intValue();
            dataItem = map.get(new UnicodeString(CLIENTID_KEY));
            clientID = ((UnicodeString) dataItem).getString();
            dataItem = map.get(new UnicodeString(BROKERENDPOINT_KEY));
            brokerEndpoint = ((UnicodeString) dataItem).getString();
            dataItem = map.get(new UnicodeString(CLEANSESSION_KEY));
            cleanSession = (((SimpleValue) dataItem).getSimpleValueType() == SimpleValueType.TRUE) ? true:false;
            return true;
        } catch (CborException e) {
            Log.e(TAG,"Failed to decode.", e);
            return false;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }
}
