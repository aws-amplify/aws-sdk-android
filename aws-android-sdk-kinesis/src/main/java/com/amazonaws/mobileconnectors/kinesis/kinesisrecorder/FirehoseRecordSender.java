/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehose;
import com.amazonaws.services.kinesisfirehose.model.PutRecordBatchRequest;
import com.amazonaws.services.kinesisfirehose.model.PutRecordBatchResult;
import com.amazonaws.services.kinesisfirehose.model.Record;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A wrapper class of {@link AmazonKinesisFirehose} that sends a batch of
 * records to an Amazon Kinesis Firehose stream.
 */
class FirehoseRecordSender implements RecordSender {

    private AmazonKinesisFirehose client;
    private String userAgent;

    /**
     * Constructs a {@link FirehoseRecordSender}.
     * 
     * @param client an {@link AmazonKinesisFirehose} client
     * @param userAgent user agent string to be set in each request
     */
    public FirehoseRecordSender(AmazonKinesisFirehose client, String userAgent) {
        this.client = client;
        this.userAgent = userAgent;
    }

    @Override
    public List<byte[]> sendBatch(String streamName, List<byte[]> data)
            throws AmazonClientException {
        if (data == null || data.isEmpty()) {
            return Collections.emptyList();
        }

        PutRecordBatchRequest request = new PutRecordBatchRequest();
        request.setDeliveryStreamName(streamName);
        List<Record> records = new ArrayList<Record>(data.size());
        for (byte[] d : data) {
            Record r = new Record();
            r.setData(ByteBuffer.wrap(d));
            records.add(r);
        }
        request.setRecords(records);
        request.getRequestClientOptions().appendUserAgent(userAgent);

        PutRecordBatchResult result = client.putRecordBatch(request);

        int size = result.getRequestResponses().size();
        List<byte[]> failures = new ArrayList<byte[]>(result.getFailedPutCount());
        for (int i = 0; i < size; i++) {
            // Error code is either ServiceUnavailable or InternalFailure
            if (result.getRequestResponses().get(i).getErrorCode() != null) {
                failures.add(data.get(i));
            }
        }
        return failures;
    }

    @Override
    public boolean isRecoverable(AmazonClientException ace) {
        if (ace instanceof AmazonServiceException) {
            String errorCode = ((AmazonServiceException) ace).getErrorCode();
            return "InternalFailure".equals(errorCode)
                    || "ServiceUnavailable".equals(errorCode)
                    || "Throttling".equals(errorCode)
                    // Amazon Kinesis Firehose specific exceptions
                    || "ServiceUnavailableException".equals(errorCode);
        } else {
            return ace.getCause() != null && ace.getCause() instanceof IOException;
        }
    }
}
