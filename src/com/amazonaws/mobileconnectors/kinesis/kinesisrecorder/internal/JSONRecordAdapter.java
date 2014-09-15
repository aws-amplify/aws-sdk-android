/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.internal;

import java.nio.ByteBuffer;

import org.json.JSONException;
import org.json.JSONObject;

import android.util.Base64;

import com.amazonaws.AmazonClientException;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.internal.logging.Logger;
import com.amazonaws.services.kinesis.model.PutRecordRequest;

public class JSONRecordAdapter {
    private static Logger logger = Logger.getLogger(JSONRecordAdapter.class);

    private static final String DATA_FIELD_KEY = "Data";
    private static final String STREAM_NAME_FIELD = "StreamName";
    private static final String PARTITION_KEY_FIELD = "PartitionKey";
    private static final String EXPLICIT_HASH_FIELD = "ExplicitHash";
    private static final String SEQUENCE_NUMBER_FIELD = "SequenceNumber";

    /**
     * @param source the PutRecordRequest to that will be stored
     * @return JSONObject the json representation of the request
     */
    public JSONObject translateFromRecord(PutRecordRequest source) {
        if (null == source) {
            logger.i("The Record provided was null");
            return null;
        }
        if (source.getData() == null || source.getPartitionKey() == null || source.getPartitionKey().isEmpty()
                || source.getStreamName() == null || source.getStreamName().isEmpty()) {
            throw new AmazonClientException("RecordRequests must specify a partition key, stream name, and data");
        }
        if (!source.getData().hasArray()) {
            throw new AmazonClientException("ByteBuffer must be based on array for proper storage");
        }
        JSONObject recordJson = new JSONObject();
        try {
            recordJson.put(DATA_FIELD_KEY, Base64.encodeToString(source.getData().array(), Base64.DEFAULT));
            recordJson.put(STREAM_NAME_FIELD, source.getStreamName());
            recordJson.put(PARTITION_KEY_FIELD, source.getPartitionKey());
            recordJson.putOpt(EXPLICIT_HASH_FIELD, source.getExplicitHashKey());
            recordJson.putOpt(SEQUENCE_NUMBER_FIELD, source.getSequenceNumberForOrdering());
        } catch (JSONException e) {
            throw new AmazonClientException("Unable to convert KinesisRecord to JSON "+e.getMessage());
        }

        return recordJson;
    }

    /**
     * @param source The JSONObject that was created and stored via translateFromRecord
     * @return The corresponding
     */
    public PutRecordRequest translateToRecord(JSONObject source) {
        
        PutRecordRequest putRequest = new PutRecordRequest();
        try{
        putRequest.withData(ByteBuffer.wrap(Base64.decode(source.getString(DATA_FIELD_KEY), Base64.DEFAULT)));
        putRequest.withPartitionKey(source.getString(PARTITION_KEY_FIELD));
        putRequest.withStreamName(source.getString(STREAM_NAME_FIELD));
        if(source.has(EXPLICIT_HASH_FIELD)){
            putRequest.withExplicitHashKey(source.getString(EXPLICIT_HASH_FIELD));
        }
        if(source.has(SEQUENCE_NUMBER_FIELD)){
            putRequest.withSequenceNumberForOrdering(source.getString(SEQUENCE_NUMBER_FIELD));
        }
        
        return putRequest;
        
        }catch(JSONException e){
            logger.e("Error creating stored request from representation on disk, ignoring request", e);
            return null;
        }
        
    }
}
