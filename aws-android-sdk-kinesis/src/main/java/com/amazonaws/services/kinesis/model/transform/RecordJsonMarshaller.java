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
 * JSON marshaller for POJO Record
 */
class RecordJsonMarshaller {

    public void marshall(Record record, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (record.getSequenceNumber() != null) {
            String sequenceNumber = record.getSequenceNumber();
            jsonWriter.name("SequenceNumber");
            jsonWriter.value(sequenceNumber);
        }
        if (record.getApproximateArrivalTimestamp() != null) {
            java.util.Date approximateArrivalTimestamp = record.getApproximateArrivalTimestamp();
            jsonWriter.name("ApproximateArrivalTimestamp");
            jsonWriter.value(approximateArrivalTimestamp);
        }
        if (record.getData() != null) {
            java.nio.ByteBuffer data = record.getData();
            jsonWriter.name("Data");
            jsonWriter.value(data);
        }
        if (record.getPartitionKey() != null) {
            String partitionKey = record.getPartitionKey();
            jsonWriter.name("PartitionKey");
            jsonWriter.value(partitionKey);
        }
        if (record.getEncryptionType() != null) {
            String encryptionType = record.getEncryptionType();
            jsonWriter.name("EncryptionType");
            jsonWriter.value(encryptionType);
        }
        jsonWriter.endObject();
    }

    private static RecordJsonMarshaller instance;

    public static RecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecordJsonMarshaller();
        return instance;
    }
}
