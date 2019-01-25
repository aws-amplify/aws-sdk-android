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
 * JSON marshaller for POJO PutRecordsRequestEntry
 */
class PutRecordsRequestEntryJsonMarshaller {

    public void marshall(PutRecordsRequestEntry putRecordsRequestEntry, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (putRecordsRequestEntry.getData() != null) {
            java.nio.ByteBuffer data = putRecordsRequestEntry.getData();
            jsonWriter.name("Data");
            jsonWriter.value(data);
        }
        if (putRecordsRequestEntry.getExplicitHashKey() != null) {
            String explicitHashKey = putRecordsRequestEntry.getExplicitHashKey();
            jsonWriter.name("ExplicitHashKey");
            jsonWriter.value(explicitHashKey);
        }
        if (putRecordsRequestEntry.getPartitionKey() != null) {
            String partitionKey = putRecordsRequestEntry.getPartitionKey();
            jsonWriter.name("PartitionKey");
            jsonWriter.value(partitionKey);
        }
        jsonWriter.endObject();
    }

    private static PutRecordsRequestEntryJsonMarshaller instance;

    public static PutRecordsRequestEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PutRecordsRequestEntryJsonMarshaller();
        return instance;
    }
}
