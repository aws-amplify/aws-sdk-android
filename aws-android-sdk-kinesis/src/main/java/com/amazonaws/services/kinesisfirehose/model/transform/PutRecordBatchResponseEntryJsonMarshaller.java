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

package com.amazonaws.services.kinesisfirehose.model.transform;

import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PutRecordBatchResponseEntry
 */
class PutRecordBatchResponseEntryJsonMarshaller {

    public void marshall(PutRecordBatchResponseEntry putRecordBatchResponseEntry,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (putRecordBatchResponseEntry.getRecordId() != null) {
            String recordId = putRecordBatchResponseEntry.getRecordId();
            jsonWriter.name("RecordId");
            jsonWriter.value(recordId);
        }
        if (putRecordBatchResponseEntry.getErrorCode() != null) {
            String errorCode = putRecordBatchResponseEntry.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        if (putRecordBatchResponseEntry.getErrorMessage() != null) {
            String errorMessage = putRecordBatchResponseEntry.getErrorMessage();
            jsonWriter.name("ErrorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static PutRecordBatchResponseEntryJsonMarshaller instance;

    public static PutRecordBatchResponseEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PutRecordBatchResponseEntryJsonMarshaller();
        return instance;
    }
}
