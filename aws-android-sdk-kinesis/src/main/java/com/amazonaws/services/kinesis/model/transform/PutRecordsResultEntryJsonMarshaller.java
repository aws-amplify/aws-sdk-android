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

package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PutRecordsResultEntry
 */
class PutRecordsResultEntryJsonMarshaller {

    public void marshall(PutRecordsResultEntry putRecordsResultEntry, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (putRecordsResultEntry.getSequenceNumber() != null) {
            String sequenceNumber = putRecordsResultEntry.getSequenceNumber();
            jsonWriter.name("SequenceNumber");
            jsonWriter.value(sequenceNumber);
        }
        if (putRecordsResultEntry.getShardId() != null) {
            String shardId = putRecordsResultEntry.getShardId();
            jsonWriter.name("ShardId");
            jsonWriter.value(shardId);
        }
        if (putRecordsResultEntry.getErrorCode() != null) {
            String errorCode = putRecordsResultEntry.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (putRecordsResultEntry.getErrorMessage() != null) {
            String errorMessage = putRecordsResultEntry.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static PutRecordsResultEntryJsonMarshaller instance;

    public static PutRecordsResultEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PutRecordsResultEntryJsonMarshaller();
        return instance;
    }
}
