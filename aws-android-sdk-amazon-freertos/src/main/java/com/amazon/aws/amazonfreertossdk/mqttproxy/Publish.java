package com.amazon.aws.amazonfreertossdk.mqttproxy;

import android.util.Log;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

import co.nstant.in.cbor.CborBuilder;
import co.nstant.in.cbor.CborDecoder;
import co.nstant.in.cbor.CborEncoder;
import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.model.ByteString;
import co.nstant.in.cbor.model.DataItem;
import co.nstant.in.cbor.model.Map;
import co.nstant.in.cbor.model.Number;
import co.nstant.in.cbor.model.UnicodeString;
import co.nstant.in.cbor.model.UnsignedInteger;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * This class represents the MQTT PUBLISH message.
 */
@AllArgsConstructor
@NoArgsConstructor
public class Publish {
    private static final String TAG = "MqttPublish";
    private static final String TYPE_KEY = "w";
    private static final String TOPIC_KEY = "u";
    private static final String MSGID_KEY = "i";
    private static final String QOS_KEY = "n";
    private static final String PAYLOAD_KEY = "k";
    /**
     * MQTT message type.
     */
    private int type;
    /**
     * MQTT PUBLISH message topic.
     */
    private String topic;
    /**
     * MQTT message ID.
     */
    private int msgID;
    /**
     * MQTT PUBLISH message QOS.
     */
    private int qoS;
    /**
     * The data in the MQTT PUBLISH message.
     */
    private byte[] payloadBytes;

    public String toString() {
        return String.format(" Publish message -> \n topic:%s\n msgID:%d\n qos:%d\n payload:%s",
                topic, msgID, qoS, new String(payloadBytes));
    }

    public String getTopic() {
        return topic;
    }

    public byte[] getPayload() {
        return payloadBytes;
    }

    public int getMsgID() {
        return msgID;
    }

    public int getQos() {
        return qoS;
    }

    public byte[] encode() {
        byte[] publishBytes = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            new CborEncoder(baos).encode(new CborBuilder()
                .addMap()
                .put(TYPE_KEY, type)
                .put(TOPIC_KEY, topic)
                .put(MSGID_KEY, msgID)
                .put(QOS_KEY, qoS)
                .put(PAYLOAD_KEY, payloadBytes)
                .end()
                .build());
            publishBytes = baos.toByteArray();
        } catch (CborException e) {
            Log.e(TAG, "Failed to encode.", e);
        }
        return publishBytes;
    }

    public boolean decode(byte[] cborEncodedBytes) {
        ByteArrayInputStream bais = new ByteArrayInputStream(cborEncodedBytes);
        try {
            List<DataItem> dataItems = new CborDecoder(bais).decode();
            // process data item
            Map map = (Map) dataItems.get(0);
            DataItem dataItem = map.get(new UnicodeString(TYPE_KEY));
            type = ((UnsignedInteger) dataItem).getValue().intValue();
            dataItem = map.get(new UnicodeString(TOPIC_KEY));
            topic = ((UnicodeString) dataItem).getString();
            dataItem = map.get(new UnicodeString(QOS_KEY));
            qoS = ((Number) dataItem).getValue().intValue();
            if (qoS != 0) {
                dataItem = map.get(new UnicodeString(MSGID_KEY));
                msgID = ((Number) dataItem).getValue().intValue();
            }
            dataItem = map.get(new UnicodeString(PAYLOAD_KEY));
            payloadBytes = ((ByteString) dataItem).getBytes();
            return true;
        } catch (CborException e) {
            Log.e(TAG,"Failed to decode.", e);
            return false;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }
}
