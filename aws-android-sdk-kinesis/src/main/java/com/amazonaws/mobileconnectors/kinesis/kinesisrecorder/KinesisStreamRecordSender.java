/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.kinesis.AmazonKinesis;
import com.amazonaws.services.kinesis.model.PutRecordsRequest;
import com.amazonaws.services.kinesis.model.PutRecordsRequestEntry;
import com.amazonaws.services.kinesis.model.PutRecordsResult;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/**
 * A implementation of {@link RecordSender} for Amazon Kinesis.
 */
class KinesisStreamRecordSender implements RecordSender {

    private AmazonKinesis client;
    private String userAgent;

    /**
     * Constructs a {@link KinesisStreamRecordSender}.
     * 
     * @param client an {@link AmazonKinesis} client
     * @param userAgent user agent string to be set in each request
     */
    public KinesisStreamRecordSender(AmazonKinesis client, String userAgent) {
        this.client = client;
        this.userAgent = userAgent;
    }

    @Override
    public List<byte[]> sendBatch(String streamName, List<byte[]> data)
            throws AmazonClientException {
        if (data == null || data.isEmpty()) {
            return Collections.emptyList();
        }

        PutRecordsRequest request = new PutRecordsRequest();
        request.setStreamName(streamName);
        List<PutRecordsRequestEntry> records = new ArrayList<PutRecordsRequestEntry>(data.size());
        String partitionKey = UUID.randomUUID().toString();
        for (byte[] d : data) {
            PutRecordsRequestEntry r = new PutRecordsRequestEntry();
            r.setData(ByteBuffer.wrap(d));
            r.setPartitionKey(partitionKey);
            records.add(r);
        }
        request.setRecords(records);
        request.getRequestClientOptions().appendUserAgent(userAgent);

        PutRecordsResult result = client.putRecords(request);

        int size = result.getRecords().size();
        List<byte[]> failures = new ArrayList<byte[]>(result.getFailedRecordCount());
        for (int i = 0; i < size; i++) {
            if (result.getRecords().get(i).getErrorCode() != null) {
                // always retry failed record
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
                    // Amazon Kinesis service error
                    || "ProvisionedThroughputExceededException".equals(errorCode);
        } else {
            return ace.getCause() != null && ace.getCause() instanceof IOException;
        }
    }
}
