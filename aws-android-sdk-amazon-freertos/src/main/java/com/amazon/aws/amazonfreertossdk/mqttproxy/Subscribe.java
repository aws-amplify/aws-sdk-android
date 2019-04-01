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
import co.nstant.in.cbor.model.UnicodeString;
import co.nstant.in.cbor.model.Number;
import co.nstant.in.cbor.model.UnsignedInteger;

/**
 * This class represents the MQTT SUBSCRIBE message.
 */
public class Subscribe {
    private static final String TAG = "MqttSubscribe";
    private static final String TYPE_KEY = "w";
    private static final String TOPICS_KEY = "v";
    private static final String MSGID_KEY = "i";
    private static final String QOSS_KEY = "o";
    /**
     * MQTT message type.
     */
    public int type;
    /**
     * Arrary of topics to subscribe to.
     */
    public List<String> topics = new ArrayList<>();
    /**
     * MQTT message ID.
     */
    public int msgID;
    /**
     * Arrary of QOS for each subscribe topic.
     */
    public List<Integer> qoSs = new ArrayList<>();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Subscribe message: ");
        stringBuilder.append("\n    type: " + type);
        stringBuilder.append("\n    msgId: " + msgID);
        for (int i = 0; i < topics.size(); i++) {
            stringBuilder.append("\n    topic: " + topics.get(i) + ", qos: " + qoSs.get(i));
        }
        return stringBuilder.toString();
    }

    public byte[] encode() {
        byte[] subscribeBytes = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            ArrayBuilder<MapBuilder<CborBuilder>> topicsArray = new CborBuilder()
                    .addMap()
                    .put(TYPE_KEY, type)
                    .putArray(TOPICS_KEY);

            for (String topic : topics) {
                topicsArray = topicsArray.add(topic);
            }

            MapBuilder<CborBuilder> map = topicsArray.end();
            ArrayBuilder<MapBuilder<CborBuilder>> qosArray = map.put(MSGID_KEY, msgID)
                    .putArray(QOSS_KEY);

            for (int qos : qoSs) {
                qosArray = qosArray.add(qos);
            }
            List<DataItem> cbordata = qosArray.end().end().build();
            new CborEncoder(baos).encode(cbordata);
            subscribeBytes = baos.toByteArray();
        } catch (CborException e) {
            Log.e(TAG, "Failed to encode.", e);
        }
        return subscribeBytes;
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
            dataItem = map.get(new UnicodeString(QOSS_KEY));
            List<DataItem> qosDataItems = ((Array) dataItem).getDataItems();
            for (DataItem qosDataItem : qosDataItems) {
                qoSs.add(((UnsignedInteger) qosDataItem).getValue().intValue());
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
