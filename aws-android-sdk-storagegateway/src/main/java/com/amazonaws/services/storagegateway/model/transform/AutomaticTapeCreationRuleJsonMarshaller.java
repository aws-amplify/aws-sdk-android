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

package com.amazonaws.services.storagegateway.model.transform;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AutomaticTapeCreationRule
 */
class AutomaticTapeCreationRuleJsonMarshaller {

    public void marshall(AutomaticTapeCreationRule automaticTapeCreationRule,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (automaticTapeCreationRule.getTapeBarcodePrefix() != null) {
            String tapeBarcodePrefix = automaticTapeCreationRule.getTapeBarcodePrefix();
            jsonWriter.name("TapeBarcodePrefix");
            jsonWriter.value(tapeBarcodePrefix);
        }
        if (automaticTapeCreationRule.getPoolId() != null) {
            String poolId = automaticTapeCreationRule.getPoolId();
            jsonWriter.name("PoolId");
            jsonWriter.value(poolId);
        }
        if (automaticTapeCreationRule.getTapeSizeInBytes() != null) {
            Long tapeSizeInBytes = automaticTapeCreationRule.getTapeSizeInBytes();
            jsonWriter.name("TapeSizeInBytes");
            jsonWriter.value(tapeSizeInBytes);
        }
        if (automaticTapeCreationRule.getMinimumNumTapes() != null) {
            Integer minimumNumTapes = automaticTapeCreationRule.getMinimumNumTapes();
            jsonWriter.name("MinimumNumTapes");
            jsonWriter.value(minimumNumTapes);
        }
        jsonWriter.endObject();
    }

    private static AutomaticTapeCreationRuleJsonMarshaller instance;

    public static AutomaticTapeCreationRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutomaticTapeCreationRuleJsonMarshaller();
        return instance;
    }
}
