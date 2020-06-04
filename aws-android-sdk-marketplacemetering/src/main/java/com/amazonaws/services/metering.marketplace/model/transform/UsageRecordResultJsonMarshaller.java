/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.metering.marketplace.model.transform;

import com.amazonaws.services.metering.marketplace.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UsageRecordResult
 */
class UsageRecordResultJsonMarshaller {

    public void marshall(UsageRecordResult usageRecordResult, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (usageRecordResult.getUsageRecord() != null) {
            UsageRecord usageRecord = usageRecordResult.getUsageRecord();
            jsonWriter.name("UsageRecord");
            UsageRecordJsonMarshaller.getInstance().marshall(usageRecord, jsonWriter);
        }
        if (usageRecordResult.getMeteringRecordId() != null) {
            String meteringRecordId = usageRecordResult.getMeteringRecordId();
            jsonWriter.name("MeteringRecordId");
            jsonWriter.value(meteringRecordId);
        }
        if (usageRecordResult.getStatus() != null) {
            String status = usageRecordResult.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static UsageRecordResultJsonMarshaller instance;

    public static UsageRecordResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UsageRecordResultJsonMarshaller();
        return instance;
    }
}
