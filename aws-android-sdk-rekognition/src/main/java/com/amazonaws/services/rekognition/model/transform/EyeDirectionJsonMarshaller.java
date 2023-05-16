/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EyeDirection
 */
class EyeDirectionJsonMarshaller {

    public void marshall(EyeDirection eyeDirection, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (eyeDirection.getYaw() != null) {
            Float yaw = eyeDirection.getYaw();
            jsonWriter.name("Yaw");
            jsonWriter.value(yaw);
        }
        if (eyeDirection.getPitch() != null) {
            Float pitch = eyeDirection.getPitch();
            jsonWriter.name("Pitch");
            jsonWriter.value(pitch);
        }
        if (eyeDirection.getConfidence() != null) {
            Float confidence = eyeDirection.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        jsonWriter.endObject();
    }

    private static EyeDirectionJsonMarshaller instance;

    public static EyeDirectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EyeDirectionJsonMarshaller();
        return instance;
    }
}
