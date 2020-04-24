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

package com.amazonaws.services.amazonelasticinference.model.transform;

import com.amazonaws.services.amazonelasticinference.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AcceleratorType
 */
class AcceleratorTypeJsonMarshaller {

    public void marshall(AcceleratorType acceleratorType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (acceleratorType.getAcceleratorTypeName() != null) {
            String acceleratorTypeName = acceleratorType.getAcceleratorTypeName();
            jsonWriter.name("acceleratorTypeName");
            jsonWriter.value(acceleratorTypeName);
        }
        if (acceleratorType.getMemoryInfo() != null) {
            MemoryInfo memoryInfo = acceleratorType.getMemoryInfo();
            jsonWriter.name("memoryInfo");
            MemoryInfoJsonMarshaller.getInstance().marshall(memoryInfo, jsonWriter);
        }
        if (acceleratorType.getThroughputInfo() != null) {
            java.util.List<KeyValuePair> throughputInfo = acceleratorType.getThroughputInfo();
            jsonWriter.name("throughputInfo");
            jsonWriter.beginArray();
            for (KeyValuePair throughputInfoItem : throughputInfo) {
                if (throughputInfoItem != null) {
                    KeyValuePairJsonMarshaller.getInstance().marshall(throughputInfoItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AcceleratorTypeJsonMarshaller instance;

    public static AcceleratorTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AcceleratorTypeJsonMarshaller();
        return instance;
    }
}
