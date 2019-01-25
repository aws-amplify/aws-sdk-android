/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import android.util.Base64;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.kinesis.model.PutRecordRequest;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;

import java.nio.ByteBuffer;

@Deprecated
class JSONRecordAdapter {
    private static final Log LOGGER = LogFactory.getLog(JSONRecordAdapter.class);

    static final String DATA_FIELD_KEY = "Data";
    static final String STREAM_NAME_FIELD = "StreamName";
    static final String PARTITION_KEY_FIELD = "PartitionKey";
    static final String EXPLICIT_HASH_FIELD = "ExplicitHash";
    static final String SEQUENCE_NUMBER_FIELD = "SequenceNumber";

    /**
     * returns data from json object which was made via translateFromRecord.
     *
     * @param jsonObject the json.
     * @throws JSONException
     */
    public static ByteBuffer getData(JSONObject jsonObject)
            throws JSONException {
        return ByteBuffer.wrap(
                Base64.decode(
                        jsonObject.getString(DATA_FIELD_KEY),
                        Base64.DEFAULT));
    }

    /**
     * returns partition key from json object which was made via
     * translateFromRecord.
     *
     * @param jsonObject the json.
     * @throws JSONException
     */
    public static String getPartitionKey(JSONObject jsonObject)
            throws JSONException {
        return jsonObject.getString(PARTITION_KEY_FIELD);
    }

    /**
     * returns stream name from json object which was made via
     * translateFromRecord.
     *
     * @param jsonObject the json.
     * @throws JSONException
     */
    public static String getStreamName(JSONObject jsonObject)
            throws JSONException {
        return jsonObject.getString(STREAM_NAME_FIELD);
    }

    /**
     * @param source the PutRecordRequest to that will be stored
     * @return JSONObject the json representation of the request
     */
    public JSONObject translateFromRecord(PutRecordRequest source) {
        if (null == source) {
            LOGGER.warn("The Record provided was null");
            return null;
        }
        if (source.getData() == null || source.getPartitionKey() == null
                || source.getPartitionKey().isEmpty()
                || source.getStreamName() == null || source.getStreamName().isEmpty()) {
            throw new AmazonClientException(
                    "RecordRequests must specify a partition key, stream name, and data");
        }
        if (!source.getData().hasArray()) {
            throw new AmazonClientException("ByteBuffer must be based on array for proper storage");
        }
        final JSONObject recordJson = new JSONObject();
        try {
            recordJson.put(DATA_FIELD_KEY,
                    Base64.encodeToString(source.getData().array(), Base64.DEFAULT));
            recordJson.put(STREAM_NAME_FIELD, source.getStreamName());
            recordJson.put(PARTITION_KEY_FIELD, source.getPartitionKey());
            recordJson.putOpt(EXPLICIT_HASH_FIELD, source.getExplicitHashKey());
            recordJson.putOpt(SEQUENCE_NUMBER_FIELD, source.getSequenceNumberForOrdering());
        } catch (final JSONException e) {
            throw new AmazonClientException("Unable to convert KinesisRecord to JSON "
                    + e.getMessage());
        }

        return recordJson;
    }
}
