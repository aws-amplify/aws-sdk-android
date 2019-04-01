package com.amazon.aws.amazonfreertossdk.mqttproxy;

import android.util.Log;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import co.nstant.in.cbor.CborBuilder;
import co.nstant.in.cbor.CborDecoder;
import co.nstant.in.cbor.CborEncoder;
import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.builder.ArrayBuilder;
import co.nstant.in.cbor.builder.MapBuilder;
import co.nstant.in.cbor.model.Array;
import co.nstant.in.cbor.model.DataItem;
import co.nstant.in.cbor.model.Map;
import co.nstant.in.cbor.model.Number;
import co.nstant.in.cbor.model.UnicodeString;
import co.nstant.in.cbor.model.UnsignedInteger;

/**
 * This class represents the MQTT UNSUBSCRIBE message.
 */
public class Unsubscribe {
    private static final String TAG = "MqttUnsubscribe";
    private static final String TYPE_KEY = "w";
    private static final String TOPICS_KEY = "v";
    private static final String MSGID_KEY = "i";
    /**
     * MQTT message type.
     */
    public int type;
    /**
     * Arrary of topics to unsubscribe.
     */
    public List<String> topics = new ArrayList<>();
    /**
     * MQTT message ID.
     */
    public int msgID;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UnSubscribe message: ");
        stringBuilder.append("\n    type: " + type);
        stringBuilder.append("\n    msgId: " + msgID);
        for (int i = 0; i < topics.size(); i++) {
            stringBuilder.append("\n    topic: " + topics.get(i));
        }
        return stringBuilder.toString();
    }

    public byte[] encode() {
        byte[] unsubscribeBytes = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            ArrayBuilder<MapBuilder<CborBuilder>> topicsArray = new CborBuilder()
                    .addMap()
                    .put(TYPE_KEY, type)
                    .putArray(TOPICS_KEY);

            for (String topic : topics) {
                topicsArray = topicsArray.add(topic);
            }

            List<DataItem> cbordata = topicsArray.end().end().build();
            new CborEncoder(baos).encode(cbordata);
            unsubscribeBytes = baos.toByteArray();
        } catch (CborException e) {
            Log.e(TAG, "Failed to encode.", e);
        }
        return unsubscribeBytes;
    }

    public boolean decode(byte[] cborEncodedBytes) {
        ByteArrayInputStream bais = new ByteArrayInputStream(cborEncodedBytes);
        try {
            List<DataItem> dataItems = new CborDecoder(bais).decode();
            // process data item
            Map map = (Map) dataItems.get(0);
            DataItem dataItem = map.get(new UnicodeString(TYPE_KEY));
            type = ((UnsignedInteger) dataItem).getValue().intValue();
            dataItem = map.get(new UnicodeString(MSGID_KEY));
            msgID = ((Number) dataItem).getValue().intValue();

            dataItem = map.get(new UnicodeString(TOPICS_KEY));
            List<DataItem> topicDataItems = ((Array) dataItem).getDataItems();
            for (DataItem topicDataItem : topicDataItems) {
                topics.add(((UnicodeString) topicDataItem).getString());
            }
            return true;
        } catch (CborException e) {
            Log.e(TAG,"Failed to decode.", e);
            return false;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }
}
