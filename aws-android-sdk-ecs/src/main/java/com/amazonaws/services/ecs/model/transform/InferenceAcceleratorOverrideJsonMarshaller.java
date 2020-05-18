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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InferenceAcceleratorOverride
 */
class InferenceAcceleratorOverrideJsonMarshaller {

    public void marshall(InferenceAcceleratorOverride inferenceAcceleratorOverride,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (inferenceAcceleratorOverride.getDeviceName() != null) {
            String deviceName = inferenceAcceleratorOverride.getDeviceName();
            jsonWriter.name("deviceName");
            jsonWriter.value(deviceName);
        }
        if (inferenceAcceleratorOverride.getDeviceType() != null) {
            String deviceType = inferenceAcceleratorOverride.getDeviceType();
            jsonWriter.name("deviceType");
            jsonWriter.value(deviceType);
        }
        jsonWriter.endObject();
    }

    private static InferenceAcceleratorOverrideJsonMarshaller instance;

    public static InferenceAcceleratorOverrideJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InferenceAcceleratorOverrideJsonMarshaller();
        return instance;
    }
}
