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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InferenceAcceleratorInfo
 */
class InferenceAcceleratorInfoJsonMarshaller {

    public void marshall(InferenceAcceleratorInfo inferenceAcceleratorInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (inferenceAcceleratorInfo.getAccelerators() != null) {
            java.util.List<InferenceDeviceInfo> accelerators = inferenceAcceleratorInfo
                    .getAccelerators();
            jsonWriter.name("Accelerators");
            jsonWriter.beginArray();
            for (InferenceDeviceInfo acceleratorsItem : accelerators) {
                if (acceleratorsItem != null) {
                    InferenceDeviceInfoJsonMarshaller.getInstance().marshall(acceleratorsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static InferenceAcceleratorInfoJsonMarshaller instance;

    public static InferenceAcceleratorInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InferenceAcceleratorInfoJsonMarshaller();
        return instance;
    }
}
