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

package com.amazonaws.services.awsiotevents.model.transform;

import com.amazonaws.services.awsiotevents.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DetectorDebugOption
 */
class DetectorDebugOptionJsonMarshaller {

    public void marshall(DetectorDebugOption detectorDebugOption, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (detectorDebugOption.getDetectorModelName() != null) {
            String detectorModelName = detectorDebugOption.getDetectorModelName();
            jsonWriter.name("detectorModelName");
            jsonWriter.value(detectorModelName);
        }
        if (detectorDebugOption.getKeyValue() != null) {
            String keyValue = detectorDebugOption.getKeyValue();
            jsonWriter.name("keyValue");
            jsonWriter.value(keyValue);
        }
        jsonWriter.endObject();
    }

    private static DetectorDebugOptionJsonMarshaller instance;

    public static DetectorDebugOptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DetectorDebugOptionJsonMarshaller();
        return instance;
    }
}
