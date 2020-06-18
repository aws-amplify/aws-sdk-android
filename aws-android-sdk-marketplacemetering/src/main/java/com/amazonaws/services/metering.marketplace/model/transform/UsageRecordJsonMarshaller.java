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
 * JSON marshaller for POJO UsageRecord
 */
class UsageRecordJsonMarshaller {

    public void marshall(UsageRecord usageRecord, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (usageRecord.getTimestamp() != null) {
            java.util.Date timestamp = usageRecord.getTimestamp();
            jsonWriter.name("Timestamp");
            jsonWriter.value(timestamp);
        }
        if (usageRecord.getCustomerIdentifier() != null) {
            String customerIdentifier = usageRecord.getCustomerIdentifier();
            jsonWriter.name("CustomerIdentifier");
            jsonWriter.value(customerIdentifier);
        }
        if (usageRecord.getDimension() != null) {
            String dimension = usageRecord.getDimension();
            jsonWriter.name("Dimension");
            jsonWriter.value(dimension);
        }
        if (usageRecord.getQuantity() != null) {
            Integer quantity = usageRecord.getQuantity();
            jsonWriter.name("Quantity");
            jsonWriter.value(quantity);
        }
        jsonWriter.endObject();
    }

    private static UsageRecordJsonMarshaller instance;

    public static UsageRecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UsageRecordJsonMarshaller();
        return instance;
    }
}
